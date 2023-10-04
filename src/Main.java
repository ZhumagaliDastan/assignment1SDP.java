public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Output output = new Output(); // Updated variable name to 'output'
        UserInput userInput = new UserInput();

        while (true) {
            String operation = userInput.getOperation();

            if (operation.equals("q")) {
                break;
            }

            double value = userInput.getValue();
            calculator.performOperation(operation, value);

            double result = calculator.getResult();
            output.showResult(result); // Updated usage to 'output'
        }

        userInput.close();
    }
}
