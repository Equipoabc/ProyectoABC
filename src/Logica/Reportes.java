/**
 * author: Luis Granja
 */
package Logica;
 
//Librerias para exportar en PDF
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

//Librerias para exportar en Excel
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;



public class Reportes{
    
    //Nombre se usuario para crear carpetas
    static final String  usuario = System.getProperty("user.name");
    static final String rutaRaiz = "C:\\Users\\"+usuario+"\\Documents\\ABC Eventos";
    
    public static void crearCarpetas(){
        
        //Se crean carpetas en Mis Documentos
        File carpetaRaiz = new File(rutaRaiz);
        File reportes = new File(rutaRaiz+"\\Reportes");
        File certificados = new File(rutaRaiz+"\\Certificados");
        File escarapelas = new File(rutaRaiz+"\\Escarapelas");
        File recibos = new File(rutaRaiz+"\\Recibos");

        carpetaRaiz.mkdir();
        reportes.mkdir();
        certificados.mkdir();
        escarapelas.mkdir();
        recibos.mkdir();
    }
     /**
     * 
     * @param cabecera Son los datos epecificos del reporte, ejemplo: nombre, cedula, telefono
     * @param datos  Es un arreglo de arreglos con los datos especificos del reporte
     * @param nombre Nombre del archivo excel que e genera
     */
    public static void generarReporte(ArrayList<String> cabecera , ArrayList<ArrayList<String>> datos, String nombre){
    
        try {
            
            //Se crea el archivo
            String archivo = rutaRaiz+"\\Reportes\\"+nombre+".xls" ;
            HSSFWorkbook libro = new HSSFWorkbook();
            HSSFSheet hoja = libro.createSheet("Reporte Usuarios");  
            
            //Se crean fuentes para las cabeceras
            HSSFCellStyle estilo = libro.createCellStyle();
            HSSFFont fuente=libro.createFont();
            fuente.setBold(true);
            estilo.setFont(fuente);

            //Se crean las cabeceras
            HSSFRow rowhead = hoja.createRow((short)0);
            for (int i = 0; i < cabecera.size(); i++) {
                
                //Se inserta el valor en una celda de esa fila
                rowhead.createCell(i).setCellValue(cabecera.get(i));
                
                //Se le cambia el formato de texto a la celda
                rowhead.getCell(i).setCellStyle(estilo);
            }
	
            //Se insertan datos
            for(int i = 1; i<datos.size(); i++){
                
                HSSFRow row = hoja.createRow((short)i);
                
                for(int j = 0; j<datos.get(i).size(); j++){
                    row.createCell(j).setCellValue(datos.get(i).get(j));
                }
            }
            //Se cierra el archivo y se termina de crear
            try (FileOutputStream salida = new FileOutputStream(archivo)) {
                libro.write(salida);
            }
            System.out.println("Archivo generado");

        } catch ( IOException ex ) {
            System.out.println(ex);
        }
    
    }
    
    /**
     * 
     * @param nombre Nombre del participante
     * @param cedula Cedula del participante
     * @param nomEvento Nombre del evento
     * @param fecha Fecha del evento
     * @throws FileNotFoundException
     * @throws IOException
     * @throws DocumentException 
     */
    public static void imprimirCertificado(String nombre,String cedula, String nomEvento, String fecha) throws FileNotFoundException, IOException, DocumentException{
    
        //base.pdf es el archivo PDF que se usa como plantilla
        PdfReader reader = new PdfReader("src/plantillas/base.pdf");
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(rutaRaiz+"\\Certificados\\"+cedula+".pdf"));
        PdfContentByte over = stamper.getOverContent(1);
        
        //Crea los diferentes tamanos de la fuente
        Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 50);
        Font f2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 22);
        FontSelector selector = new FontSelector();
        FontSelector selector2 = new FontSelector();
        selector.addFont(f1);
        selector2.addFont(f2);
        
        //Se agrega el nombre del participante
        Phrase n = selector.process(nombre);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, n, 650, 310, 0);
        
        //Se agrega el nombre del evento
        Phrase e = selector2.process(nomEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, e, 755, 210, 0);
        
        //Se agrega la fecha del evento
        Phrase nFecha = selector2.process(fecha);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nFecha, 1100, 210, 0);
        
        //Se cierra el archivo base y se cierra el archivo nuevo
        stamper.close();
        reader.close();
        
    }
    
    /**
     * 
     * @param nombre Nombre del participante
     * @param cedula Cedula del participante
     * @param codEvento Codifo del evento
     * @param nomEvento Nombre del evento
     * @param precio Precio del evento
     * @param fecha Fecha del ecento
     * @param dinero Dinero que entrega el parcipante para pagar
     * @param cambio Dinero que se debe devolver al participante
     * @throws IOException
     * @throws DocumentException 
     */
    public void imprimirRecibo(String nombre, String cedula, String codEvento, String nomEvento, 
            String precio, String fecha, String dinero, String cambio) throws IOException, DocumentException{
    
        //baseRecibo.pdf es el archivo PDF que se usa como plantilla
        PdfReader reader = new PdfReader("src/plantillas/baseRecibo.pdf");
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(rutaRaiz+"\\Recibos\\"+cedula+".pdf"));
        PdfContentByte over = stamper.getOverContent(1);
        
        //Crea los diferentes tamanos de la fuente
        Font f2 = FontFactory.getFont(FontFactory.COURIER, 14);
        FontSelector selector2 = new FontSelector();
        selector2.addFont(f2);
        
        //Se agrega el titulo "Recibo de Pago"
        Phrase recibo = selector2.process("Recibo de pago #"+cedula+"-"+codEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, recibo, 200, 465, 0);
        
        //Se agrega un separador para los datos
        Phrase separador = selector2.process("-----------------------------");
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, separador, 200, 430, 0);
        
        //Se agregan las etiquetas del nombre y la cedula
        Phrase nNombre = selector2.process("Nombre :    "+nombre);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nNombre, 200, 400, 0);
        
        Phrase nCedula = selector2.process("Cedula :    "+cedula);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCedula, 200, 370, 0);
        
        //Se agrega linea separadora
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, separador, 200, 340, 0);
        
        //Se agrega la informacion relacionada con el evento
        Phrase nCodigo = selector2.process("Código :    "+ codEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCodigo, 200, 310, 0);
        
        Phrase nNombreEvento = selector2.process("Nombre Evento : "+nomEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nNombreEvento, 200, 280, 0);
        
        Phrase nPrecio = selector2.process("Total a pagar :    "+precio);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nPrecio, 200, 250, 0);
        
        //Se agrega linea separadora
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, separador, 200, 220, 0);
        
        //Se agrela la informacion correspondiente a el pago del evento
        Phrase nDinero = selector2.process("Dinero :    "+ dinero);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nDinero, 200, 190, 0);
        
        Phrase nCambio = selector2.process("Cambio : "+cambio);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCambio, 200, 160, 0);
        
        Phrase nFecha = selector2.process("Fecha :    "+fecha);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nFecha, 200, 130, 0);
        
        //Se cierra el archivo base y se cierra el archivo nuevo
        stamper.close();
        reader.close();  
    }
    
    /**
     * 
     * @param nombre Nombre del participante
     * @param cedula Cedula del participante
     * @param evento Nombre del evento
     * @throws IOException
     * @throws DocumentException 
     */
    public static void imprimirEscarapela(String nombre, String cedula, String evento) throws IOException, DocumentException{
        //baseEscarapela.pdf es el archivo PDF que se usa como plantilla
        PdfReader reader = new PdfReader("src/plantillas/baseEscarapela.pdf");
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(rutaRaiz+"\\Escarapelas\\"+cedula+".pdf"));
        PdfContentByte over = stamper.getOverContent(1);
        
        //Crea los diferentes tamanos de la fuente
        Font f1 = FontFactory.getFont(FontFactory.COURIER, 20);
        Font f2 = FontFactory.getFont(FontFactory.COURIER, 16);
        FontSelector selector = new FontSelector();
        FontSelector selector2 = new FontSelector();
        selector.addFont(f1);
        selector2.addFont(f2);
        
        //Se agrega el nombre del participante
        Phrase n = selector.process("Nombre:  "+nombre);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, n, 200, 200, 0);
        
        //Se agrega la cedula del participante
        Phrase nCedula = selector.process("Cedula:  "+cedula);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCedula, 200, 130, 0);
        
        //Se agrega el nombre del evento
        Phrase nEvento = selector.process("Evento:  "+evento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nEvento, 200, 60, 0);
        
        //Se cierra el archivo base y se cierra el archivo nuevo
        stamper.close();
        reader.close();
        
    }
    

   /* public static void main(String arg[]) throws FileNotFoundException, DocumentException, BadElementException, IOException{
       
        crearCarpetas();
        //Pruebas para el archivo excel
        ArrayList<String> cabecera = new ArrayList<>();
        cabecera.add("Nombre");
        cabecera.add("Apellidos");
        cabecera.add("Cedula");
        cabecera.add("Telefono");
        cabecera.add("Fecha nacimiento");
        cabecera.add("Correo");
        
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        data.add(cabecera);
        data.add(cabecera);
        
        generarReporte(cabecera,data,"test2");
        
        //Prueba para certificado
        imprimirCertificado( "Luis Granja","1144091237", "Semana de la Ingeniería II", "20-12-17");
        
        //Prueba para recibo
        imprimirRecibo("Luis Granja",  "1144091237", "11CU", "Capacitacion sistema", 
            "$100.000", "20-12-17", "$150.000", "$50.000");
        
        //Prueba para escarapela
        imprimirEscarapela("Luis Granja", "1144091237", "Innova");
        
        
        
        /*
        //--------------Parte para cerar PDF base---------------//
        //Creacion del documento
        Document d = new Document(PageSize.LETTER.rotate());
        PdfWriter writer = PdfWriter.getInstance(d, new FileOutputStream ("baseEscarapela.pdf"));
        writer.setStrictImageSequence(true);
        
        
         //Tamano de la pagina
        Rectangle size = new Rectangle(426,586);
        d.setPageSize(size);
        d.setMargins(0, 0, 0, 0);
        
        d.open();

        //Se agrega imagen
        Image img = Image.getInstance("escarapela.png");
        img.setAbsolutePosition(0, 0);
        d.add(img);
        d.close();
        
        
    }
*/
}