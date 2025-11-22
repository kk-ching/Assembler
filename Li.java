
public class Li extends Instructions {
    public Instructions addInstruction(String[] parts) {
        // Implementation for LI instruction
        System.out.println("Processing LI instruction with parts:");
        for (int i =0 ;i< parts.length; i++) {
            binaryCode = String.format("%s000%s00%s", parts[2], parts[1], "1111");
        }
        return this;
    }

}
