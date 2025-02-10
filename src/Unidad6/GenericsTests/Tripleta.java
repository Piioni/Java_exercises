package Unidad6.GenericsTests;

public class Tripleta<T, I, P> {
    private T t;
    private I i;
    private P p;

    public Tripleta(T t, I i, P p) {
        this.t = t;
        this.i = i;
        this.p = p;
    }

    public void imprimir() {
        System.out.println("-" + t + ", - " + i + ", -" + p);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }

}
