public class Li extends Instructions {
    public Li(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%sXXX%sXX%s", zfill(asmParts[2], 4), asmParts[1], "0110");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
