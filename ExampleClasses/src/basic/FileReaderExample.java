package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample extends SystemOutPrinter {

  public void readFileFromPath(String absolutPath) { // create Resources in Try
                                                     // => close automatically
                                                     // => no need of finally
    try (FileReader fr = new FileReader(absolutPath); BufferedReader br = new BufferedReader(fr);) {
      String currentLine;
      while ((currentLine = br.readLine()) != null) {
        printText(currentLine);
      }
    } catch (IOException e) {
      printText("Following error occured: " + e.getMessage());
    }
  }
}
