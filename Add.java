public class Add extends Instructions {
    public Instructions addInstruction(String[] parts) {
        // Implementation for ADD instruction
        System.out.println("Processing ADD instruction with parts:");
        for (int i =0 ;i< parts.length; i++) {
            binaryCode = String.format("0%s%s%s00%s", parts[3], parts[2], parts[1], "0000");
        }
        return this;
    }
}
