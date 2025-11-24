public class Addi extends Instructions {
    public Addi(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%s%s%sXX%s", asmParts[3], asmParts[2], asmParts[1], "0100");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
