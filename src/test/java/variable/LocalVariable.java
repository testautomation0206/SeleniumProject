package variable;

public class LocalVariable {
   // public static void main(String[] args){
        public void display(int m) {
            //below is local variable which scope is inside method.
            int model = m;
            System.out.println("model of the car is" + model);
        }

            public static void main(String[] args){

                LocalVariable l = new LocalVariable();
                l.display(120);
            }


        }


