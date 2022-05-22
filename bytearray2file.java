// Outputs a byte array buffer to a file

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public void outputToFile(byte[] output, String fileName) throws IOException
{
    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(fileName));
    stream.write(output);
    stream.flush();
    stream.close();
}