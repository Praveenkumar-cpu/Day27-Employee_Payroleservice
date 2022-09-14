package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class EmployPayrollTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployPayrollData employee1= new EmployPayrollData(1, "praveen",10000.0);
        EmployPayrollData employee2= new EmployPayrollData(2, "Ganu",20000.0);
        EmployPayrollData employee3= new EmployPayrollData(3, "vijay",30000.0);

        List<EmployPayrollData> employPayrollDataList = new ArrayList<>();
        employPayrollDataList.add(employee1);
        employPayrollDataList.add(employee2);
        employPayrollDataList.add(employee3);

        EmployPayrollService employPayrollService = new EmployPayrollService(employPayrollDataList);
        employPayrollService.writeEmployPayrollData(EmployPayrollService.IOServices.FILE_IO);
        employPayrollService.readEmployPayrollData(EmployPayrollService.IOServices.FILE_IO);
        long count = employPayrollService.countEntries(EmployPayrollService.IOServices.FILE_IO);
        Assertions.assertEquals(3,count);
    }
}
