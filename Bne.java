public class Bne extends Instructions {
    public Bne(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("0%s%s%sXX%s", fitWidth(asmParts[1], 3), fitWidth(asmParts[2], 3), fitWidth(asmParts[3], 3), "0101");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
