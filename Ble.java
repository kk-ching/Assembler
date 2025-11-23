
public class Ble extends Instructions{
    public Ble(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }

    public void assemble() {
            formatCode = String.format("X%s%s%sXX%s", asmParts[1], asmParts[2], asmParts[3], "0001");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
