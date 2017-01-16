import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arpit on 1/1/17.
 */
public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers(){
        list = new ArrayList<Integer>(SIZE);
        for(int i = 0; i < SIZE; i++){
            list.add(new Integer(i));
        }
    }

    public void writeList(){

        PrintWriter out = null;
        try{

            System.out.println("Enter the try Block! ");
            // The get(int) method throws IOException (Checked or Compile time Exception), which must be caught.
             out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++){
                //The get(int) method throws IndexOutOfBound Exception (Unchecked or Run time Exception), which must be caught
                out.println("Value at: " + i + " = " + list.get(i));
            }
            out.close();

        }
        // Catch or final block expected ...
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBound Exception " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("IOException " + e.getMessage());
        }
        /*catch (IOException|IndexOutOfBoundsException ex ){
            logger.log(ex);
            throw ex;

        }*/

        finally{
            if(out != null){
                System.out.println("Closing PrintWriter ");
                out.close();
            } else {
                System.out.println("PrintWriter not Open");
            }
        }

    }
    static String readFirstLineFromFiles(String path) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }

    // Use finally block

    static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try{
            return br.readLine();
        } finally {
            if (br != null) br.close();
        }
    }

    public static void writeToFileZipFileContents(String zipFileName,String outputFileName)throws java.io.IOException{
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
        java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

        //Open zip file and create output file with try-with-resources statement

        try(java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
        java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath,charset)){
            // Enumerate each entry
            for(java.util.Enumeration entries = zf.entries();entries.hasMoreElements();){
                // Get the entry name and write it to the output file
                String newLine = System.getProperty("line.separator");
                String zipEntryName = ((java.util.zip.ZipEntry)entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName,0,zipEntryName.length());
            }
        }
    }

}
