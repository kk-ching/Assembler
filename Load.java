
public class Load extends Instructions {
    public Load(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("0000%s%sXX%s", asmParts[2], asmParts[1], "0001");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
