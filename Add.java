public class Add extends Instructions {
    public Add(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("X%s%s%sXX%s", asmParts[3], asmParts[2], asmParts[1], "0000");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
