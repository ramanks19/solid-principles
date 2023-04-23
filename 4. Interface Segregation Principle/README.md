# Interface Segregation Principle (ISP)

**No clients should be forced to depend on methods it does not use**

**Techniques to Identift Violations of ISP-**
- **Fat Interfaces** - An interface that has too many methods.
- **Interfaces with Low Cohesion** - An interface that contains methods that are unrelated or do not have a clear and specific purpose.
- **Empty Method Implementations** - If a client implements an interface but leaves some methods empty because they do not use them, it may be a sign of ISP violation.

**Benefits-**
- Can improve the maintainability and flexibility of the codebase.
- Makes it easier to understand and use.


The above code represents an example of Interface Segregation Principle (ISP). It consists of three interfaces IFax, IPrint and IScan and three classes XeroxWorkCenter, CannonPrinter and HPPrinterNScanner.

The interfaces IFax, IPrint and IScan define specific functionalities related to fax, print and scan respectively. The class XeroxWorkCenter as it can performs print, scam and fax so it implements all the three interfaces. As the class CannonPrinter can only perform printing function, it implements the IPrint interface only whereas HPPrinterNScanner implements the necessary methods of IPrint and IScan interface as it can perform both printing and scanning function. Thus, all the three classes adheres to the Interface Segregation Principle, as they do not implement any unnecessary methods.