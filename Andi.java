
public class Andi extends Instructions {
    public Andi(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("%s%s%sXX%s", asmParts[3], asmParts[2], asmParts[1], "0110");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
