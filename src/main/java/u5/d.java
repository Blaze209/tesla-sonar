package u5;

/* JADX INFO: loaded from: classes.dex */
public class d<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f115407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f115408b;

    public d(F f11, S s11) {
        this.f115407a = f11;
        this.f115408b = s11;
    }

    public static <A, B> d<A, B> a(A a11, B b11) {
        return new d<>(a11, b11);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f115407a, this.f115407a) && c.a(dVar.f115408b, this.f115408b);
    }

    public int hashCode() {
        F f11 = this.f115407a;
        int iHashCode = f11 == null ? 0 : f11.hashCode();
        S s11 = this.f115408b;
        return iHashCode ^ (s11 != null ? s11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f115407a + " " + this.f115408b + "}";
    }
}
