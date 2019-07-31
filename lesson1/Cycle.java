public class Cycle {
    public static void main(String[] args) {
    	for (i=0; i<=20; i++) {
    		System.out.println(i);
    	}

    	int a = 6;
    	while (a >= -6) {
    		System.out.println(a);
    		a-=2;
    	}
    	
    	int b = 10;
    	int c = 0;
    	do {
            if (b%2 != 0) {
                c = c + b;
            }
            b++;
        } while(b!=20);
        System.out.println(c);
    }
}