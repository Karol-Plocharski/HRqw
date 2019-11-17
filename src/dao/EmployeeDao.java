package dao;

import java.util.List;
import java.util.Scanner;

public class EmployeeDao {
    public class employee {

        public List<EmployeeDao> setData() {
            String decision = "T";
            List<EmployeeDao> employees = new ArrayList<EmployeeDao>();
            Scanner input = new Scanner(System.in);
            while (decision.equals("T")) {

                System.out.println("Podaj imię");
                String name = input.nextLine();

                System.out.println("Podaj nazwisko");
                String surname = input.nextLine();

                System.out.println("Poziom zaawansowania");
                String occupation = input.nextLine();
                //dodajemy nowego studenta do listy na podstawie wpisanych danych
                employees.add(new EmployeeDao(name, surname, occupation));

                System.out.println("Czy chcesz podawać dalej T/N");
                decision = input.nextLine();
            }
            return employees;
        }

        public void displayData(List<StudentDto> students) {
            for (StudentDto student:students){
                //pobieramy index studenta dla listy students
                System.out.print("|"+(students.indexOf(student)+1)+"|");
                System.out.print("|"+student.getName()+"|");
                System.out.print("|"+student.getSurname()+"|");
                System.out.print("|"+student.getClassNo()+"|");
                System.out.println();
            }
        }
    }
}
