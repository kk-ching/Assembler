public abstract class Instructions {
    String binaryCode;
    String formatCode;
    String[] asmParts;

    public abstract void assemble();

    public Instructions(String[] cmdParts){
        asmParts = cmdParts;
    }

        public void resolveRegisterAddresses(){
        for (int i =0;i<asmParts.length;i++) {
            switch(asmParts[i]) {
            case "$r0":
                asmParts[i] = "000";
            case "$r1":
                asmParts[i] = "001";
            case "$r2":
                asmParts[i] = "010";
            case "$r3":
                asmParts[i] = "011";
            case "$r4":
                asmParts[i] = "100";
            case "$r5":
                asmParts[i] = "101";
            case "$r6":
                asmParts[i] = "110";
            case "$r7":
                asmParts[i] = "111";
            default:
                continue;
            }
        }
    }

    public String getBinaryCode() {
        if(binaryCode.length() != 16) {
            System.out.println("Error: Binary code length is not 16 bits.");
        } 
        return binaryCode;
    };

    public String getHexCode() {
        return Integer.toHexString(Integer.parseInt(binaryCode, 2));
    }
    
    public String getformatCode() {
        return formatCode;
    }
    public String formatCodeToBinaryCode(String formatCode) {
        String binaryCode = formatCode.replace('X','0');
        return binaryCode;
    }
}
