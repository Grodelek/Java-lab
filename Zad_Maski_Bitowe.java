import java.io. *;

public class Main {
    public static void main(String[] args) {
#Na pozycjach n i m mają być ustawione 0
        System.out.println(ustawBity(28,2,3));
    }
    static int ustawBity(int num,int n,int m){
        int maska1=0;
        int maska2 = ~maska1;
        int maska3 = maska2<<1;
        int maska4 = ~maska3;
        int maska5 = maska4 << n;
        int maska5b = maska4 << m;
        int maska6 = ~maska5;
        int maska6b = ~maska5b;
        int wynik = maska6 & num;
        int wynikb = maska6b & num;
        int wynikab = wynik & wynikb;
        return wynikab;
    }
}
#Utwórz maski zaczynając od maski = 0, ustawiającą 0 na wybranych pozycjach. 
