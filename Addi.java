
public class Addi extends Instructions {
    public Instructions addInstruction(String[] parts) {
        // Implementation for ADDI instruction
        System.out.println("Processing ADDI instruction with parts:");
        for (int i =0 ;i< parts.length; i++) {
            binaryCode = String.format("%s%s%s00%s", parts[3], parts[2], parts[1], "0100");
        }
        return this;
    }

}
