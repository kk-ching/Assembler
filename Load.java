public class Load extends Instructions {
    public Load(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("0000%s%sXX%s", fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), "1100");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
