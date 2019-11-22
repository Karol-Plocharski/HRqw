package utils;

import dao.DepartmentDao;
import dao.EmployeeDao;
import dto.DepartmentDto;
import dto.EmployeeDto;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() throws ParseException {
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
                List<EmployeeDto> employee = new EmployeeDao().setData();
                List<DepartmentDto> departments = new DepartmentDao().setData();
                //Wyswietlamy dane
                new EmployeeDao().displayData(employee);
                new DepartmentDao().displayData(departments);
                isValueOK = true;
            } else {
                System.out.println();
                System.out.println("Podaj Liczbe z zakresu 1-2");
            }
        }
        }
    }
