public class Move extends Instructions {
    public Move(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("0000%s%sXX%s", fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), "1110");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
