public class Add extends Instructions {
    public Add(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("X%s%s%sXX%s", fitWidth(asmParts[3], 3), fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), "0000");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
