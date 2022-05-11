package controller;


import java.util.Scanner;

import management.ExpensesManagement;
import model.User;


public class ExpensesController {

	public static void runExpenses(Scanner reader, User userValidated) {
		
		String command;

		while (true) {

			MenuController.expensesMenu("eng");
			command = reader.next();

			if (command.equals("quit")) {
				break;

			} else if (command.equals("add")) {
				ExpensesManagement.createExpense(reader, userValidated);

			} else if (command.equals("delete")) {
				ExpensesManagement.deleteExpense(reader, userValidated);

			} else if (command.equals("update")) {
				ExpensesManagement.updateExpense(reader, userValidated);

			} else if (command.equals("list")) {
				ExpensesManagement.listExpense(reader, userValidated);

			} else {
				System.out.println(
						"\nPlease, you have to write \"add\", \"delete\" or "
						+ "\"upadate\" or \"list\" or \"quit\". Try another time ...\n");
				
			}

		}

	}

}
