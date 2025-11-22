
public class Or extends Instructions {
    public Instructions addInstruction(String[] parts) {
        // Implementation for OR instruction
        System.out.println("Processing OR instruction with parts:");
        for (int i =0 ;i< parts.length; i++) {
            binaryCode = String.format("0%s%s%s00%s", parts[1], parts[2], parts[3], "0011");
        }
        return this;
    }

}
