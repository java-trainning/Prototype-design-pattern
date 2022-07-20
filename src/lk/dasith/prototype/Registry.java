package lk.dasith.prototype;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Map;

public class Registry {

   private Map<EmployeeType,Employee> employees =  new HashMap<EmployeeType,Employee>();


    public Registry() {
        this.initialize();
    }

    public Employee getEmployee(EmployeeType employeeType){
        Employee employee = null;

        try {
            employee =(Employee) employees.get(employeeType).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return employee;

    }

    private void initialize() {

        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        softwareEngineer.setReportTo("senior manager");
        softwareEngineer.setName("dhanuska");
        softwareEngineer.setSalary("30000");

        ProjectManager projectManager = new ProjectManager();
        projectManager.setTeam("zero");
        projectManager.setName("anura");
        projectManager.setSalary("1000000");

        employees.put(EmployeeType.softwareEngineer,softwareEngineer);
        employees.put(EmployeeType.ProjectManger,projectManager);
    }
}
