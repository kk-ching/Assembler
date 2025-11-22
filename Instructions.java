public abstract class Instructions {
    String binaryCode;
    String opCode;
    public abstract Instructions addInstruction(String[] parts);
    public String getBinaryCode() {
        return binaryCode;
    };
    public String getHexCode() {
        return Integer.toHexString(Integer.parseInt(binaryCode, 2));
    }
}
