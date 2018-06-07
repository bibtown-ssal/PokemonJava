public class Pair<E,F> {
    E a;
    F b;

    public Pair(E a, F b){
        this.a = a;
        this.b = b;
    }

    public E getA() {
        return a;
    }

    public F getB() {
        return b;
    }

    @Override
    public String toString() {
        return "" + a + " : " + b;
    }
}
