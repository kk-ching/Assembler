public abstract class Instructions {
    String binaryCode;
    String formatCode;
    String[] asmParts;

    public abstract void assemble();

    public Instructions(String[] cmdParts) {
        asmParts = new String[cmdParts.length];
        parse(cmdParts);
        assemble();
    }

    public void parse(String[] cmdParts) {
        for (int i = 1; i < cmdParts.length; i++) {
            String p = cmdParts[i];
            if (p.length() > 2 && p.substring(0, 2).equals("$r")) {
                asmParts[i] = Integer.toBinaryString((p.charAt(2) - '0') - 1);
            } else {
                asmParts[i] = Integer.toBinaryString(Integer.parseInt(p));
            }
        }
    }

    public void printBinaryCode() {
        if (binaryCode.length() != 16) {
            System.out.println("Error: Binary code length is not 16 bits.");
        }
        printFormatedBinary("Binary Code", binaryCode);
    }

    public void printHexCode() {
        System.out.println(
                "Hex Code:\t" + fitWidth(Integer.toHexString(Integer.parseInt(binaryCode, 2)).toUpperCase(), 4));
    }

    public void printFormatedBinary(String tag, String binaryString) {
        System.out.print(tag + ":\t");
        for (int i = 0; i < binaryString.length(); i += 4) {
            System.out.print(binaryString.substring(i, i + 4) + ' ');
        }
        System.out.print('\n');
    }

    public void printFormatCode() {
        printFormatedBinary("Format Code", formatCode);
    }

    public String formatCodeToBinaryCode(String formatCode) {
        String binaryCode = formatCode.replace('X', '0');
        return binaryCode;
    }

    public String fitWidth(String str, int n) {
        str = String.format("%1$" + n + "s", str).replace(' ', '0');
        return str.substring(str.length() - n, str.length());
    }
}
