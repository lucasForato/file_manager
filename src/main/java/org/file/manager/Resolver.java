package org.file.manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Resolver {
     public void createFile(String prefix) throws IOException {
        try {
            Path file = Files.createTempFile(prefix, "txt");
            System.out.println("FILE CREATED" + file);
        }
        catch(IOException err) {
            System.out.println("ERROR");
            throw err;
        }
    }
}
