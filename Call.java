public class Call extends Instructions {
    public Call(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        String i = fitWidth(asmParts[1], 12);
        formatCode = String.format("%s%s", i, "1001");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
