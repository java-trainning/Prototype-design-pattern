package lk.dasith.prototype;

public class Application {

    public static void main(String[] args) {

        Registry registry = new Registry();

        SoftwareEngineer softwareEngineer = (SoftwareEngineer) registry.getEmployee(EmployeeType.softwareEngineer);
        System.out.println(softwareEngineer);

        SoftwareEngineer softwareEngineer1 =(SoftwareEngineer) registry.getEmployee(EmployeeType.softwareEngineer);
        System.out.println(softwareEngineer1);
    }
}
