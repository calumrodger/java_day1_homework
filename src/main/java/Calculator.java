public class Calculator {

    private int numA;
    private int numB;

    public Calculator(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
//        this.result = result;
    }

    public int getNumA(){
        return this.numA;
    }

    public int getNumB(){
        return this.numB;
    }

    public int add(){
        return (this.numA += this.numB);
    }

    public int subtract(){
        return (this.numA -= this.numB);
    }

    public int multiply(){
        return (this.numA * this.numB);
    }

    public double divide(){
        double dNumA = this.numA;
        double dNumB = this.numB;
        return (dNumA / dNumB);
    }

}
