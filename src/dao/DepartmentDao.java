package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDao {
    public DepartmentDao (String shortname, String fullname) {
    }

    public List<DepartmentDao> setData() {
        String decision = "T";
        List<DepartmentDao> department = new ArrayList<DepartmentDao>();
        Scanner input = new Scanner(System.in);
        while (decision.equals("T")) {

            System.out.println("HR");
            System.out.println("IT");
            System.out.println("FN");
            String shortname = input.nextLine();
            System.out.println("Human Resourcec");
            System.out.println("Information Technology");
            System.out.println("Finance");
            String fullname = input.nextLine();

            department.add(new DepartmentDao(shortname, fullname));

            System.out.println("Podaj kolejnego pracownika");
            decision = input.nextLine();
        }
        return department ;

    }
}
}
