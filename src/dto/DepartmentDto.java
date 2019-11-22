package dto;

import java.util.Date;

public class DepartmentDto {

    private String HR;
    private String IT;
    private String FN;


    public DepartmentDto (String HR, String IT, String FN) {
        this.HR = "Human Resourcec";
        this.IT = "Information Technology";
        this.FN = "Finance";


    }

    public String getHR () {
        return HR;
    }

    public String getIT () {
        return IT;
    }

    public String getFN () {
        return FN;
    }

}