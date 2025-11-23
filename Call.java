
public class Call extends Instructions {
    public Call(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("%sXXXXXXXX%s", asmParts[1], "1001");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
