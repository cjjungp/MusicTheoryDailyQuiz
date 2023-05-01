package logger;

import java.io.*;

public class Logger {

    private File logger;
    private PrintWriter writer;

    public Logger(String pathName) {
        this.logger = new File(pathName);
        if (this.logger.exists()) {
            try {
                this.writer = new PrintWriter(new FileWriter(this.logger, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                this.writer = new PrintWriter(this.logger);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void write(String message) {
        //can change this to printf to make perfect formatting
        this.writer.printf(message);
        this.writer.flush();
    }


//    @Override
//    public void close() throws IOException {
//        this.writer.close();
//    }


}
