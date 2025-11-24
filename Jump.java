public class Jump extends Instructions {
    public Jump(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%sXXXXXXXX%s", fitWidth(asmParts[1], 4), "1000");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
