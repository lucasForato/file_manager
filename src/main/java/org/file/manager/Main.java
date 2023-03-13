package org.file.manager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, choose an item [1]: ");
        System.out.println("[1] Create a file");
        Resolver resolver = new Resolver();

        Scanner scanner = new Scanner(System.in);
        String lineOne = scanner.nextLine();
        if (lineOne.equals("1")) {
            System.out.println("Type a file name: ");
            String lineTwo = scanner.nextLine();
            resolver.createFile(lineTwo);
        }
    }
}