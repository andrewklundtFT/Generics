public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("43+3* = " + calculateExpression("43+3*"));
        System.out.println("27*5* = " + calculateExpression("27*5*"));
        System.out.println("58*8+ = " + calculateExpression("58*8+"));
        System.out.println("34*5* = " + calculateExpression("34*5*"));
    }

    public static int calculateExpression(String exp) {
        Stack<Integer> a = new Stack<Integer>();
        String characterToCheck;
        for (int i = 0; i < exp.length(); i++) {
            if (i != exp.length() - 1) {
                characterToCheck = exp.substring(i, i + 1);
            } else {
                characterToCheck = exp.substring(i);
            }
            try {
                    a.push(Integer.parseInt(characterToCheck));
            } catch (Exception NumberFormatException) {
                    a.push(performOperation(a.Pop(), a.Pop(), characterToCheck));
            }
        }
        return a.Peek();
    }

    public static int performOperation(int a, int b, String symbol) {
        if (symbol.equals("+")) {
            return a + b;
        } else {
            return a * b;
        }
    }
}
