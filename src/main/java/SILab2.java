
public class SILab2 {

    static boolean checkPrime(int n){                                            //A
        if (n < 0) {                                                             //B
            throw new RuntimeException("Number should not be negative");         //C
        }
        int m = n / 2;                                                           //D
        if (n == 0 || n == 1) {                                                  //E
            return false;                                                        //F
        } else {
            for (int i = 2; i <= m; i++) {                                       //G(i=2), H(i<=m)
                if (n % i == 0) {                                                //I
                    return true;                                                 //T
                }                                                                //J (i++) -> H
            }
            return false;                                                        //F
        }
    }
}
