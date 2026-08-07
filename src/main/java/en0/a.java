package en0;

/* JADX INFO: loaded from: classes9.dex */
public class a<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F f63108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S f63109b;

    public a(F f11, S s11) {
        this.f63108a = f11;
        this.f63109b = s11;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return a(aVar.f63108a, this.f63108a) && a(aVar.f63109b, this.f63109b);
    }

    public int hashCode() {
        F f11 = this.f63108a;
        int iHashCode = f11 == null ? 0 : f11.hashCode();
        S s11 = this.f63109b;
        return iHashCode ^ (s11 != null ? s11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f63108a) + " " + String.valueOf(this.f63109b) + "}";
    }
}
