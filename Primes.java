public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N + 1];
        
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        
        int p = 2;
        while (p * p <= N) {
            
            if (isPrime[p]) {
                int i = p * p;
                while (i <= N) {
                    isPrime[i] = false; 
                    i = i + p;       
                }
            }
            p++; 
        }
        
        System.out.println("Prime numbers up to " + N + ":");
        
        int count = 0; 
        
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        int percentage = (int) (((double) count / N) * 100);
        
        System.out.println("There are " + count + " primes between 2 and " + N + " (" + percentage + "% are primes)");
    }
}