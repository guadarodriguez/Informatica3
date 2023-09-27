package Calculadora;

public class Resta {
    Double num1;
    Double num2;

    public Resta(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double restar() {
        Double resultado;
        resultado = num1 - num2;
        return resultado;

    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Resta [num1=" + num1 + ", num2=" + num2 + "]";
    }
}

