public class Store extends Instructions {
    public Store(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode =
                String.format("0000%s%s00%s", fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), "1101");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
