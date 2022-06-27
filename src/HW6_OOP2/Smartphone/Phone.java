package HW6_OOP2.Smartphone;

public abstract class Phone {

    public String dial() {
       String status = "The number is dialing...";
       return status;
    }

    abstract void setChargerType(String chargertype);

    abstract void setOperationSystem(String os);

    abstract void setApplicationStore(String store);

}

