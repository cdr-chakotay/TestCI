public class main {
    double number;
    public main(double num) {
        number = num;
    }

    public double changeNum(double num){
        number = num;
        return num;
    }

    public String printNum() {
        System.out.println(number);
        return number+"";
    }
    public static void main(String[] args) {
        main m1 = new main(5.0);
        m1.printNum()
        System.out.println("Main method has completed its run");
    }

    public double getNumber(){
        return number;
    }
}
