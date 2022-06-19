package HW6_OOP2;

public abstract class Phone {

    public String dial() {
       String status = "The number is dialing...";
       return status;
    }

    abstract String setChargerType();

    abstract String setOperationSystem();

    abstract String setApplicationStore();

}

