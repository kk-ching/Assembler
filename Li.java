public class Li extends Instructions {
    public Li(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%sXXX%sXX%s", fitWidth(asmParts[2], 4), fitWidth(asmParts[1], 3), "1111");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
