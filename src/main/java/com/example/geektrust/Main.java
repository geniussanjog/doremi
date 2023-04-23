package com.example.geektrust;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        final int REQUIRED_ARGUMENTS = 1;

        if (args.length != REQUIRED_ARGUMENTS) {
            System.out.println("Filename expected as argument.Please provide filename also!");
            return;
        }
        String fileNameWithPath = args[0];
        File inputFile = new File(args[0]);
        if (!inputFile.exists()) {
            System.out.println("Entered file does not exist.Please check path and/or name of file.");
            return;
        }
        new ProcessInputFile().readInputLines(fileNameWithPath);
    }
}
