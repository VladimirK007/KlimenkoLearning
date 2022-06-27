package HW6_OOP2.Smartphone;

public class SmartphoneTester {
    public static void main(String[] args) {

        iOSSmartphone apple12Mini = new iOSSmartphone("iOS 15.5.5", "Wireless", "App Store");
        System.out.println("Apple 12 Mini OS: " + apple12Mini.getOperationSystem());
        System.out.println("Apple 12 Charger Type: " + apple12Mini.getChargerType());
        System.out.println("Apple 12 Mini Store: " + apple12Mini.getApplicationStore());
        System.out.println(apple12Mini.dial());

        System.out.println("");

        AndroidSmartphone pixel6 = new AndroidSmartphone("Android 12", "Wired", "Google Play");
        System.out.println("Google Pixel 6 OS: " + pixel6.getOperationSystem());
        System.out.println("Google Pixel 6 Charger Type: " + pixel6.getChargerType());
        System.out.println("Google Pixel 6 Mini Store: " + pixel6.getApplicationStore());
        System.out.println(pixel6.dial());
    }
}
