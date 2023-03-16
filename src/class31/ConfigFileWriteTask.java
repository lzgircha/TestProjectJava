package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteTask {
    public static void main(String[] args) throws IOException {
        String path="Files/task.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("Mortgage","$235,000");
        properties.store(fileOutputStream, "The mortgage has to be paid of in 15 years");
    }
}
