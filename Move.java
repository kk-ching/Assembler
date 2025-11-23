
public class Move extends Instructions {
    public Move(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("0000%s%sXX%s", asmParts[2], asmParts[1], "1110");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
