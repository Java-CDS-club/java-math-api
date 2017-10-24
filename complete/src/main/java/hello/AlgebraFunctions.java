package hello;

import java.util.ArrayList;

public class AlgebraFunctions {
    String baseString;
    public AlgebraFunctions(){
        String baseString =  new String("This is a constructor");
    }
    public ArrayList<Pair> getFunctionSigs(){
        ArrayList<Pair> functions = new ArrayList<Pair>();
        functions.add(new Pair("nth_root","public double nth_root(int n, double x, double p) {\n" +
                "        if(x < 0)\n" +
                "        {\n" +
                "            System.err.println(\"Negative!\");\n" +
                "            return -1;\n" +
                "        }\n" +
                "        if(x == 0)\n" +
                "            return 0;\n" +
                "        double x1 = x;\n" +
                "        double x2 = x / n;\n" +
                "        while (Math.abs(x1 - x2) > p)\n" +
                "        {\n" +
                "            x1 = x2;\n" +
                "            x2 = ((n - 1.0) * x2 + x / Math.pow(x2, n - 1.0)) / n;\n" +
                "        }\n" +
                "        return x2;\n" +
                "    }"));
        return functions;
    }
    public ArrayList<Pair> getParameterSigs(){
        ArrayList<Pair> parameters = new ArrayList<Pair>();
        ArrayList<String> p = new ArrayList<String>();
        p.add("n");
        p.add("x");
        p.add("p");
        parameters.add(new Pair ("nth_root",p));
        return parameters;
    }
    public double nth_root(int n, double x, double p) {
        if(x < 0)
        {
            System.err.println("Negative!");
            return -1;
        }
        if(x == 0)
            return 0;
        double x1 = x;
        double x2 = x / n;
        while (Math.abs(x1 - x2) > p)
        {
            x1 = x2;
            x2 = ((n - 1.0) * x2 + x / Math.pow(x2, n - 1.0)) / n;
        }
        return x2;
    }
    public  int sum_of_first_n(int a, int d, int n) {
        return ((n) * ((2 * a) + (n - 1) * d)) / 2;
    }
}