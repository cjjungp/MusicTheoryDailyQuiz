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

    public void write(String keySignature, String date) {
        this.writer.println(date + ", " + keySignature);
        this.writer.flush();
    }

    public void write2(String keySignature, String input, String answer, String date) {
        this.writer.println(date + ", " + keySignature + ", " + input + ", " + answer);
        this.writer.flush();
    }

}
