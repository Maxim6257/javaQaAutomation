package HomeWork7;

public class BuhalterCalculator extends FinancialCalculator {
    double memory;

    public double getMemory() {
        return memory;
    }
    public void setMemory(double memory) {
        this.memory = memory;
    }

//    public double memoryAddition (double memory, double sumResult) {
//        double memoryResult = addition(memory, sumResult);
//        return memoryResult;
//    }
//
//    public double memorySubtraction (double memory, double subtrResult) {
//        double memoryResult = subtraction(memory, subtrResult);
//        return memoryResult;
//    }

    public double memoryAdd (double num) {
        double memoryResult = addition(getMemory(), num);
        setMemory(memoryResult);
        return memoryResult;
    }
    public double memorySubtr (double num) {
        double memoryResult = subtraction(getMemory(), num);
        setMemory(memoryResult);
        return memoryResult;
    }
    public static void main(String[] args) {
        BuhalterCalculator buhCalc = new BuhalterCalculator();
        buhCalc.memory = 5;
        double addMem = buhCalc.memoryAdd(5);
        double addMem2 = buhCalc.memorySubtr(3);
        System.out.println(addMem + " + " + addMem2);
    }
}
