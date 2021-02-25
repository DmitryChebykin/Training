
import java.io.*;

class KeyboardReading {
    String submitString() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String result = null;

        try {
            result = bufferedReader.readLine();
        } catch (IOException ex) {
            ex.getMessage();
        }

        return result;
    }


}
