public class Halt extends Instructions {
    public Halt(String[] parts) {
        super(parts);
    }

    @Override
    public void assemble() {
        formatCode = String.format("000000000000%s", "1011");
        binaryCode = formatCodeToBinaryCode(formatCode);
    }
}
