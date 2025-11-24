public class Bne extends Instructions {
    public Bne(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("X%s%s%sXX%s", asmParts[1], asmParts[2], asmParts[3], "0010");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
