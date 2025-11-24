public class Jump extends Instructions {
    public Jump(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%sXXXXXXXX%s", asmParts[1], "1000");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
