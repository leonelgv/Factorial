public class Factorial {
    public double factorial_iterativo(double n) {
        if (n<0){
            return 0;
        } else {
            double fact = 1;
            for (int i=1;i <= n; i++) {
                fact = i * fact;
            }
            return fact;
        }

    }

    public double factorial_recursividad (double n) {
        if (n<0){
            return 0;
        } else {
            // caso nase
            if (n == 0) {
                return 1;
            } else {
                // función recursivo
                return n * factorial_recursividad (n - 1);
            }
        }
    }
}
