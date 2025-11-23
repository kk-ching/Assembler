
public class Li extends Instructions {
    public Li(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("%sXXX%sXX%s", asmParts[2], asmParts[1], "0110");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
