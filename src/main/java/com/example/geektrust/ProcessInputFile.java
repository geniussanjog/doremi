package com.example.geektrust;

import com.example.geektrust.constants.InputCommand;
import com.example.geektrust.constants.Response;
import com.example.geektrust.entities.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProcessInputFile {
    User user = new User();
    String startDate = null;

    public void readInputLines(String filename) {
        final String delimiter = "\\s+";
        try (FileInputStream fis = new FileInputStream(filename);
             Scanner sc = new Scanner(fis)) {
            while (sc.hasNextLine()) {
                String[] command = sc.nextLine().split(delimiter);
                processInputLine(command);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    private void processInputLine(String[] command){
        switch (command[0]) {
            case InputCommand.START_SUBSCRIPTION:
                startDate = ProcessInputCommands.handleStartSubscription(command[1]);
                break;
            case InputCommand.ADD_SUBSCRIPTION:
                ProcessInputCommands.handleAddSubscription(startDate, command[1], command[2], user);
                break;
            case InputCommand.ADD_TOPUP:
                ProcessInputCommands.handleAddTopup(startDate, command[1], command[2], user);
                break;
            case InputCommand.PRINT_RENEWAL_DETAILS:
                ProcessInputCommands.handlePrintRenewalDetails(user);
                break;
            default:
                System.out.println(Response.INVALID_INPUT);
                break;
        }
    }
}

