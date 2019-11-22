package dao;

import dto.DepartmentDto;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDao {

    public List<DepartmentDto> setData () throws ParseException {

        List<DepartmentDto> departments = new ArrayList<DepartmentDto>();
        Scanner input = new Scanner(System.in);
        System.out.println(" Department:  HR | IT | FN");

        String HR = input.nextLine();
        String IT = input.nextLine();
        String FN = input.nextLine();


        departments.add(new DepartmentDto(HR, IT, FN));

        {
            return departments;
        }
    }


    public void displayData (List<DepartmentDto> departments) {
      for (DepartmentDto department : departments) {

              System.out.print(department.getHR());
              System.out.print(department.getIT());
            System.out.print(department.getFN());

        }
    }
    }