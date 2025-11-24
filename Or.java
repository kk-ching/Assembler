public class Or extends Instructions {
    public Or(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("X%s%s%sXX%s", asmParts[3], asmParts[2], asmParts[1], "0011");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
