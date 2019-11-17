package utils;

import dao.DepartmentDao;
import dao.EmployeeDao;
import dto.DepartmentDto;
import dto.EmployeeDto;

import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {

        Scanner input = new Scanner(System.in);
        System.out.println("|| *Human Resources Application* ||");

        boolean isValueOK = false;

        while (!isValueOK) {

            try {

                System.out.println("1. Create an employee");
                System.out.println("2. Search for an employee");
                String value = input.nextLine();

                if (Integer.parseInt(value) == 1) {
                    boolean isEmployeeOK = false;
                    while (!isEmployeeOK) {
                        //Ustawiamy Dane
                        // List<EmployeeDto> employee = new EmployeeDao().setData();
                        System.out.println("Do you want to add another employee? (y/n)");
                        String answer = input.nextLine();
                        if (answer.equals("n")) {
                            isEmployeeOK = true;
                        }
                    }
                } else if (Integer.parseInt(value) == 2) {
                    //List<DepartmentDto> department = new DepartmentDao().setData();
                    //new DepartmentDao().displayData(department);


                } else {
                    System.out.println("Enter a number between 1-2");
                }

            } catch (NumberFormatException e) {
                System.out.println("Do you think you are funny? Enter only a number between 1-2");
            }
            System.out.println("Do you want to terminate the application? (y/n)");
            input.nextLine();
        }
    }
}

