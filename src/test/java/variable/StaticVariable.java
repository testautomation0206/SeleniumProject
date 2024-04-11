package variable;

public class StaticVariable {
    //All cars must be having 4 tyres, right? So in my below code, I have declared a static variable as ‘tyre’ whose value remains same throughout the class.
    public static int tyres;
    public static  void main(String args[]){
        tyres =4;
        System.out.println("no of tyres"+tyres);

    }

}
