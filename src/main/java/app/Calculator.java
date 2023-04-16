package app;

public class Calculator {

//    public int addTwoNums (int a, int b){
//        return a+b;
//    }

    public int calculate (int numA, int numB, String type){
        int result;
        if (type== "+"){
            result= numA+numB;
        }

        if (type == "-") {
            if (numA >= numB) {
                result = numA - numB;
            }
            else {
                result=numB-numA;
            }
        }

        if (type=="*"){
            result=numA*numB;
        }

        if (type == "/"){
            if (numA >= numB) {
                result = numA/numB;
            }
            else {
                result=numB/numA;
            }
        }

        else {
            System.out.println("Default");
            result=numA+numB;
        }

        System.out.println(type+ "  "+ result);
        return result;
    }

}
