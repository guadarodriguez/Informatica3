package Calculadora;

public class Division {
    Double num1;
    Double num2;


    public Division(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public Double dividir() {
        Double resultado;
        resultado = num1 / num2;
        return resultado;

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((num1 == null) ? 0 : num1.hashCode());
        result = prime * result + ((num2 == null) ? 0 : num2.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Division other = (Division) obj;
        if (num1 == null) {
            if (other.num1 != null)
                return false;
        } else if (!num1.equals(other.num1))
            return false;
        if (num2 == null) {
            if (other.num2 != null)
                return false;
        } else if (!num2.equals(other.num2))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Division [num1=" + num1 + ", num2=" + num2 + "]";
    }


    public Double getNum1() {
        return num1;
    }


    public Double getNum2() {
        return num2;
    }


    public void setNum1(Double num1) {
        this.num1 = num1;
    }


    public void setNum2(Double num2) {
        this.num2 = num2;
    }
}
