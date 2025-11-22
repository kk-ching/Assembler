
public class Ble extends Instructions {
    public Instructions addInstruction(String[] parts) {
        // Implementation for BLE instruction
        System.out.println("Processing BLE instruction with parts:");
        for (int i =0 ;i< parts.length; i++) {
            binaryCode = String.format("0%s%s%s00%s", parts[1], parts[2], parts[3], "0001");
        }
        return this;
    }

}
