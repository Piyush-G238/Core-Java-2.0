package com.piyush.java.variables;

public class VarDemo {
    public static void main(String[] args) {
//      using type inference to determine type of variable 'avg'
        var avg = 10.0;

//      var is used in place of variable name, it is not preferred to use var in identifiers.
        int var = 1;

        var k = -var;

        System.out.println("avg : "+avg);
        System.out.println("var : "+var);
        System.out.println("k : "+k);
    }
}
