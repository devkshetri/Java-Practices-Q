public class Main {
    public static void main(String[] args) {


        ElectronicDevice[] officeDevices = { new Printer(), new Scanner() };

        System.out.println("Turning on all office ");


        for (ElectronicDevice device : officeDevices) {

            device.powerOn();

        }
    }
}