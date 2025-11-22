
public class And extends Instructions {

    public Instructions addInstruction(String[] parts) {
        // Implementation for AND instruction
        System.out.println("Processing AND instruction with parts:");
        for (int i =0 ;i< parts.length; i++) {
            binaryCode = String.format("0%s%s%s00%s", parts[3], parts[2], parts[1], "0010");
        }
        return this;
    }

}
