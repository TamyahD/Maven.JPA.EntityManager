package services;

public class Main {
    public static void main(String[] args) {
        TestSystem ts = new TestSystem();
//        ts.findAll("EmployeesNTitles");
        ts.findOne("Employee", "04do");
    }
}
