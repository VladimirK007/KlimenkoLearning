package HW6_OOP2;

public class iOSSmartphone extends Phone {

    private String chargerType;
    private String os;
    private String store;

    public iOSSmartphone() {
        this.chargerType = setChargerType();
        this.os = setOperationSystem();
        this.store = setApplicationStore();
    }

    String setChargerType() {
        chargerType = "Wireless charger";
        return chargerType;
    }

    public String getChargerType() {
        return chargerType;
    }

    String setOperationSystem() {
        os = "iOS 15.3.5";
        return os;
    }

    public String getOperationSystem() {
        return os;
    }

    String setApplicationStore() {
        store = "App Store by Apple";
        return store;

    }

    public String getApplicationStore() {
        return store;
    }

}
