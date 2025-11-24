public class Addi extends Instructions {
    public Addi(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%s%s%sXX%s", fitWidth(asmParts[3], 4), fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), "0100");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
