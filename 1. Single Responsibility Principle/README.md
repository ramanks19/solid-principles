# Single Responsibility Principle (SRP)

**Every software component should have one and only one responsibility / reason to change**
Component can be a class, a method or a module.

**Concepts related to SRP:**
1. **Cohesion** - It is the degree to which the various parts of a software component are related. *Higher Cohesion helps attain better adherence to the Single Responsibility Principle.* 
2. **Coupling** - It is defined as the level of inter dependency between the various software components. *Loose Coupling helps attain better adherence to the Single Responsibility Principle.* 

**Reasons to Change:**
Following Single Responsibility Principle can lead to considerable software maintenance costs.

In the example provided, we have following three classes:
- Employee.java - It contains attributes of Employee.
- EmployeeRepository.java - It contains information about the details of Employee table.
- TaxCalculator.java - It contains the information as to how tax will be calculated for an employee.

Thus , as we can see that each of the class is performing one single responsibility.