package ag;

/* JADX INFO: loaded from: classes3.dex */
public class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f1032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f1033b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(T t11, T t12) {
        this.f1032a = t11;
        this.f1033b = t12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u5.d)) {
            return false;
        }
        u5.d dVar = (u5.d) obj;
        return a(dVar.f115407a, this.f1032a) && a(dVar.f115408b, this.f1033b);
    }

    public int hashCode() {
        T t11 = this.f1032a;
        int iHashCode = t11 == null ? 0 : t11.hashCode();
        T t12 = this.f1033b;
        return iHashCode ^ (t12 != null ? t12.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f1032a + " " + this.f1033b + "}";
    }
}
