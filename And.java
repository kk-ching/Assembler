public class And extends Instructions {
    public And(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("X%s%s%sXX%s", fitWidth(asmParts[3], 3), fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), "0010");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
