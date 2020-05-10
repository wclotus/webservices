package lab2problem1;

public class Number {
    private int number;

    public Number(int number)
    {
        this.number = number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return this.number;
    }

    public String toString()
    {
        return ""+this.number;
    }
}
