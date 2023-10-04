class Calculator {
    private double currentValue;

    public Calculator() {
        this.currentValue = 0;
    }

    public void performOperation(String operation, double value) {
        switch (operation) {
            case "+":
                add(value);
                break;
            case "-":


                subtract(value);
                break;
            case "*":
                multiply(value);
                break;
            case "/":
                divide(value);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }



    private void add(double value) {
        currentValue += value;
    }

    private void subtract(double value) {
        currentValue -= value;
    }

    private void multiply(double value) {
        currentValue *= value;
    }

    private void divide(double value) {
        if (value != 0) {
            currentValue /= value;
        } else {
            System.out.println("Error: Division by zero");
        }
    }

    public double getResult() {
        return currentValue;
    }
}