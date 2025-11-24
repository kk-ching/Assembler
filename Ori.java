public class Ori extends Instructions {
    public Ori(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("%s%s%sXX%s", asmParts[3], asmParts[2], asmParts[1], "0111");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
