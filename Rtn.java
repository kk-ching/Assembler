
public class Rtn extends Instructions {
    public Rtn(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("0000XXXXXXXX%s", "1010");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
