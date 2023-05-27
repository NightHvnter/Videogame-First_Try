
import java.nio.*;    
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class dataStorage {
    public static String dataReader(String path) 
        throws IOException
    {
        File 
                file = new File(path);
        FileReader 
                fr = new FileReader(file);
        BufferedReader 
                br = new BufferedReader(fr);
        String 
                str = "",
                output = "";
                
        while ( (str = br.readLine()) != null)
            output = str;
        br.close();
        fr.close();
        
        return output;
    }
    
    public static void dataWriter(String data)
        throws IOException
    {
        Path 
                path = Paths.get("");
        
        try {
            Files.writeString(  path, 
                                data,
                                StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("Error: Invalid Path\nError: " + e);
        }
    }
}
