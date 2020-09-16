import java.io.*;
import java.util.*;


public class FileManager 
{ /** All things Strings, Text, and Files */

    // =============== Class Variables =============== //


    // =============== Other Classes =============== //
    Scanner cin = new Scanner(System.in);
    

    // ==================== Functions ==================== //
    public static String ReadFromFile(String fileName) throws IOException
    { /** Function for reading text from a text file */
        String line = "";
        String text = "";
    
        System.out.println("Reading information from text file...");
        
        // Read the file using the Scanner class
        File file = new File(fileName);
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        while((line = fileReader.readLine()) != null) // Reads each individual line until null
        { 
            // Combines each line for the entire message
            text += line + " ";
        }

        fileReader.close();
        System.out.println("Successfully read message! ");
        return text;
    }


    public void WriteToFile(String fileName, String text) throws IOException
    { /** Function for writing to a text file */
        File file = new File(fileName);
        
        // If an existing file of fileName has not been created, it will be created
        if (!file.exists()) 
        {
            file.createNewFile();
        }
        
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Imported Text:" + "\n" + text);
        System.out.println("Successfully wrote to the file. ");
        bw.close();
        
    }


    public void Print(String text)
    { /** Function for printing text */
        System.out.println(text);
    }


}
