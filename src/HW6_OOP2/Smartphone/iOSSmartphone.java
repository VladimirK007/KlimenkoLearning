package HW6_OOP2.Smartphone;

public class iOSSmartphone extends Phone {

    private String os;
    private String chargerType;
    private String store;

    public iOSSmartphone(String os, String chargerType, String store) {
        setChargerType(chargerType);
        setOperationSystem(os);
        setApplicationStore(store);
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setOperationSystem(String os) { this.os = os; }

    public String getOperationSystem() {
        return os;
    }

    public void setApplicationStore(String store) {
        this.store = store;
    }

    public String getApplicationStore() {
        return store;
    }

}