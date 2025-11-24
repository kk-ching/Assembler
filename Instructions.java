public abstract class Instructions {
    String binaryCode;
    String formatCode;
    String[] asmParts;

    public abstract void assemble();

    public Instructions(String[] cmdParts) {
        asmParts = cmdParts;
        resolveRegisterAddresses();
        assemble();
    }

    public void resolveRegisterAddresses() {
        for (int i = 0; i < asmParts.length; i++) {
            switch (asmParts[i]) {
                case "$r1":
                    asmParts[i] = "000";
                    break;
                case "$r2":
                    asmParts[i] = "001";
                    break;
                case "$r3":
                    asmParts[i] = "010";
                    break;
                case "$r4":
                    asmParts[i] = "011";
                    break;
                case "$r5":
                    asmParts[i] = "100";
                    break;
                case "$r6":
                    asmParts[i] = "101";
                    break;
                case "$r7":
                    asmParts[i] = "110";
                    break;
                case "$r8":
                    asmParts[i] = "111";
                    break;
                default:
                    break;
            }
        }
    }

    public String getBinaryCode() {
        if (binaryCode.length() != 16) {
            System.out.println("Error: Binary code length is not 16 bits.");
        }
        return binaryCode;
    }
    ;

    public String getHexCode() {
        return Integer.toHexString(Integer.parseInt(binaryCode, 2));
    }

    public String getformatCode() {
        return formatCode;
    }

    public String formatCodeToBinaryCode(String formatCode) {
        String binaryCode = formatCode.replace('X', '0');
        return binaryCode;
    }

    public String zfill(String cmdPart, int n) {
        return String.format("%1$" + n + "s", asmParts[2]).replace(' ', '0');
    }
}
