package stepDefinitions.dbSteps;

import utilities.DBUtils;

import java.util.List;

public class US18_Deneme {
    public static void main(String[] args) {
        DBUtils.getConnection();
        String query= "select * from public.physician where id=164031";
        DBUtils.executeQuery(query);

    }
}
