# Open Closed Principle (OCP)

**Software components should be closed for modification but open for extension.**
- *Closed for modification means that new features getting added to the software component should NOT have to modify existing code*
- *Open for extension means that a software component should be extendable to add a new feature or to add a new behaviour to it*

**Benefits of OCP**
- Ease of adding new features
- Leads to minimal cost of developing and testing software
- Often requires decoupling, which in turn automatically follows the Single Responsibility Principle.


In the given example, the PremiumDiscountPercent calculation logic is encapsulated in the InsurancePremiumDiscountCalculator class. The method calculatePremiumDiscountPercent takes a CustomerProfile object as input, which is an interface that has a method isLoyalCustomer(). This approach allows the method to calculate the premium discount percentage based on the customer's loyalty status without knowing the specific implementation of the CustomerProfile interface.

Furthermore, the CustomerProfile interface is implemented by two classes - HealthInsuranceCustomerProfile and VehicleInsuranceCustomerProfile. This design makes it easier to extend the system with additional customer types in the future without modifying the InsurancePremiumDiscountCalculator class.

Thus, OCP is being followed in this example because the system is open for extension (new customer types can be added) but closed for modification (the existing code does not need to be changed to add new customer types).


**Caution**
- It can lead to a huge number of classes that can complicate the overall design. Thus, applying OCP should be a subjective decision rather than an objective one.
