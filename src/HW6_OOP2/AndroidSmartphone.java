package HW6_OOP2;

public class AndroidSmartphone extends Phone {

    private String chargerType;
    private String os;
    private String store;

    public AndroidSmartphone() {
        this.chargerType = setChargerType();
        this.os = setOperationSystem();
        this.store = setApplicationStore();
    }

    String setChargerType() {
        chargerType = "Wired Charger";
        return chargerType;
    }
    public String getChargerType() {
        return chargerType;
    }

    String setOperationSystem() {
        os = "Android 12";
        return os;
    }

    public String getOperationSystem() {
        return os;
    }

    String setApplicationStore() {
        store = "Google Play";
        return store;
    }

    public String getApplicationStore() {
        return store;
    }

}