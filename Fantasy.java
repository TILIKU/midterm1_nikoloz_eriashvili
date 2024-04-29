package midterm.nikoloz_eriashvili_1.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String Nikoloz_Eriashvili;

    public String toString() {
        String result = "";

        // TODO must be implemented
        result += "Chic1: " + getChic1() + "\n";
        result += "Khachapuri2: " + getKhachapuri2() + "\n";
        result += "Wire3: " + methodWire3("someArg") + "\n";
        result += "Ledger4: " + String.join(" ", methodLedger4("someArg")) + "\n";

        return result;
    }

    @Override
    public String getChic1() {
        return "Chic1";
    }

    @Override
    public String getKhachapuri2() {
        return "khachapuri";
    }

    @Override
    public String methodWire3(String argMouse5) {
        return "WIRE";
    }

    @Override
    public List<String> methodLedger4(String argFootball6) {
        return List.of("car", "dog", "very big tomato");
    }
}

