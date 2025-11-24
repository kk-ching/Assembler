public class Ori extends Instructions {
    public Ori(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%s%s%sXX%s", fitWidth(asmParts[3], 4), fitWidth(asmParts[2], 3), fitWidth(asmParts[1], 3), "0111");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
