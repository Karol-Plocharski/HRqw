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
        System.out.println("HR App");
        boolean isValueOK = false;
        while (!isValueOK) {
            System.out.println("1. Stwórz pracownika");
            System.out.println("2. Wyszukaj pracownika");
            String value = input.nextLine();
            //zmiana stringa w inta
            if (Integer.parseInt(value) == 1) {
                //Ustawiamy Dane
                //List<EmployeeDto> employee = new EmployeeDao().setData();
                //Wyswietlamy dane
                //new EmployeeDao().displayData(employee);
                isValueOK = true;
            } else if (Integer.parseInt(value) == 2) {
                //List<DepartmentDto> department = new DepartmentDao().setData();
                //new DepartmentDao().displayData(department);
                isValueOK = true;
            } else {
                System.out.println("Podaj Liczbe z zakresu 1-2");
            }

        }
    }
}