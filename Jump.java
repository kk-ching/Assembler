public class Jump extends Instructions {
    public Jump(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        String i = fitWidth(asmParts[1], 12);
        formatCode = String.format("%s%s",i, "1000");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
