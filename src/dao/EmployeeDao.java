package dao;

import dto.EmployeeDto;

//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeDao {


    public List<EmployeeDto> setData () throws ParseException {

        List<EmployeeDto> employee = new ArrayList<EmployeeDto>();
        Scanner input = new Scanner(System.in);


        System.out.println("Name");
        String name = input.nextLine();

        System.out.println("Surname");
        String surname = input.nextLine();

        System.out.println("Occupation");
        String occupation = input.nextLine();

        System.out.println("Date of arrive " + " dd/MM/yyyy");

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(input.nextLine());


        //dodajemy nowego studenta do listy na podstawie wpisanych danych
        employee.add(new EmployeeDto(name, surname, occupation, date));

        {
            return employee;
        }

    }


    public void displayData (List<EmployeeDto> employees) {

        for (EmployeeDto employee : employees) {
            System.out.print(employee.getName() + " ");
            System.out.print(employee.getSurname() + " ");
            System.out.print(employee.getOccupation() + " ");
            System.out.print(new SimpleDateFormat("dd/MM/yyyy  ").format(employee.getDate()));


        }
    }
}