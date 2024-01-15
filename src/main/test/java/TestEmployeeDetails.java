import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;


@TestMethodOrder(OrderAnnotation.class)
public class TestEmployeeDetails {
    private EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    private EmployeeDetails employee = new EmployeeDetails();
    String name = "Jone";
    int monthSalary = 11000;

    @Disabled
    @Test
    @Order(1)
    public void testCalculateAppraisal(){
        employee.setAge(29);
        employee.setName(name);
        employee.setMonthlySalary(monthSalary);
        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(name,employee.getName());
        assertEquals(29,employee.getAge());
        assertEquals(11000,employee.getMonthlySalary());
        assertEquals(1000,appraisal);
        System.out.println(employee.getName());

    }
    @Test
    @Order(2)
    public void testCalculateYearSalary(){
        employee.setAge(28);
        System.out.println(employee.getName());

        employee.setName("Bob");
        employee.setMonthlySalary(400);
        double yearSalary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(4800,yearSalary);
    }
}
