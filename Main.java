import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        FileOutput fout;
        Scanner userInput = new Scanner(System.in);

        String fileName;
        System.out.print("Enter the output file name: ");
        fileName = userInput.nextLine();
        fout = new FileOutput(fileName);
        System.out.print("Enter input file name:");
        String inputFileName = userInput.nextLine();
        if (!inputFileName.isEmpty()) {
            userInput = new Scanner(new File(inputFileName));
        }
        while (true) {
            System.out.println("Enter Operation Code (# for save file):");
            String operationCode = userInput.nextLine();

            if (operationCode.equals("#")) {
                break;
            }

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
                    continue;
            }
            instruction.printFormatCode();
            instruction.printBinaryCode();
            instruction.printHexCode();
            System.out.println();
            fout.addCode(instruction.gethexCode());
        }
        try{
            fout.outputToFile();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            System.out.println("The code has been succesfully saved to " + fileName);
        }
        userInput.close();
    }
}

