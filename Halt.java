
public class Halt extends Instructions {
    public Halt(String[] parts) {
        super(parts);
        resolveRegisterAddresses();
        assemble();
    }
    public void assemble() {
            formatCode = String.format("000000000000%s", "1111");
            binaryCode = formatCodeToBinaryCode(formatCode);
    }

}
