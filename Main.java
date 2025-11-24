import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Enter Operation Code:");
            String operationCode = userInput.nextLine();
            String[] parts = operationCode.split(" ");

            Instructions instruction = null;

            operationCode = parts[0];
            operationCode = operationCode.toUpperCase();

            switch (operationCode) {
                case "ADD": // 0000
                    instruction = new Add(parts);
                    break;
                case "BLE": // 0001
                    instruction = new Ble(parts);
                    break;
                case "AND": // 0010
                    instruction = new And(parts);
                    break;
                case "OR": // 0011
                    instruction = new Or(parts);
                    break;
                case "ADDI": // 0100
                    instruction = new Addi(parts);
                    break;
                case "BNE": // 0101
                    instruction = new Bne(parts);
                    break;
                case "ANDI": // 0110
                    instruction = new Andi(parts);
                    break;
                case "ORI": // 0111
                    instruction = new Ori(parts);
                    break;
                case "JUMP": // 1000
                    instruction = new Jump(parts);
                    break;
                case "CALL": // 1001
                    instruction = new Call(parts);
                    break;
                case "RTN": // 1010
                    instruction = new Rtn(parts);
                    break;
                case "HALT": // 1011
                    instruction = new Halt(parts);
                    break;
                case "LOAD": // 1100
                    instruction = new Load(parts);
                    break;
                case "STORE": // 1101
                    instruction = new Store(parts);
                    break;
                case "MOVE": // 1110
                    instruction = new Move(parts);
                    break;
                case "LI": // 1111
                    instruction = new Li(parts);
                    break;
                default:
                    System.out.println("Invalid Operation Code");
                    break;
            }
            instruction.printFormatCode();
            instruction.printBinaryCode();
            instruction.printHexCode();
            System.out.println();
        } while (userInput.hasNextLine());

        userInput.close();
    }
}

