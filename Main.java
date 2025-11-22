import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String binaryCode = "";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Operation Code:");
        String operationCode = userInput.nextLine();
        String[] parts = operationCode.split(" ");
        Instructions instruction = null; 
        operationCode = parts[0];
        operationCode = operationCode.toUpperCase();
        switch (operationCode) {
            case "ADD":
            instruction = (new Add()).addInstruction(parts);
            break;
            case "BLE":
            instruction = (new Ble()).addInstruction(parts);
            break;
            case "AND":
            instruction = (new And()).addInstruction(parts);
            break;
            case "OR":
            instruction = (new Or()).addInstruction(parts);
            break;
            case "ADDI":
            instruction = (new Addi()).addInstruction(parts);
            break;
            case "BNE":
            //instruction = (new Bne()).addInstruction(parts);
            break;
            case "ANDI":
            //instruction = (new Andi()).addInstruction(parts);
            break;
            case "ORI":
            //instruction = (new Ori()).addInstruction(parts);
            break;
            case "JUMP":
            //instruction = (new Jump()).addInstruction(parts);
            binaryCode = "1000";
            break;
            case "CALL":
            //instruction = (new Call()).addInstruction(parts);
            break;
            case "RTN":
            //instruction = (new Rtn()).addInstruction(parts);
            break;
            case "HALT":
            // No instruction object for HALT, handle accordingly if needed
            instruction = (new Halt()).addInstruction(parts);
            break;
            case "LOAD":
            //instruction = (new Load()).addInstruction(parts);
            break;
            case "STORE":
            //instruction = (new Store()).addInstruction(parts);
            break;
            case "MOVE":
            //instruction = (new Move()).addInstruction(parts);
            break;
            case "LI":
            instruction = (new Li()).addInstruction(parts);
            break;
            default:
            System.out.println("Invalid Operation Code");
            break;
        }
        System.out.println("Binary Code: " + instruction.getBinaryCode());
        System.out.println("Hex Code: " + instruction.getHexCode().toUpperCase());
        

        userInput.close();
    }
}