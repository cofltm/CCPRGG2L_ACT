//1. write a java program will also create a file (dara.txt) and add all the data in the text.
//the program will also create a file (sum.txt) and write the sum in the file created.

import java.io.*;

public class Num1 {
  public static void main(String[] args) throws IOException {
    
    //data.txt
    BufferedReader reader = new BufferedReader(new FileReader("data.txt"));    
    int result = 0;

    String line = reader.readLine();
    while (line != null) {  
      String[] values = line.split(",");
      
      for (String value : values) {
        result += Integer.parseInt(value);
      }      
      line = reader.readLine();
    }

    reader.close();

    //sum.txt
    BufferedWriter writer = new BufferedWriter(new FileWriter("sum.txt"));

    writer.write(String.valueOf(result));    
    writer.close();
  }
}
