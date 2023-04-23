import java.util.Random;

public class VehicleInsuranceCustomerProfile implements CustomerProfile {

    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
    
}
