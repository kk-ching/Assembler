
public class Store extends Instructions {
    public Store(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("0%s%s00000%s", asmParts[1], asmParts[2], "0010");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
