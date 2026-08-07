package c0;

/* JADX INFO: loaded from: classes.dex */
final class c extends q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f18276b;

    c(int i11, Throwable th2) {
        this.f18275a = i11;
        this.f18276b = th2;
    }

    @Override // c0.q.a
    public Throwable c() {
        return this.f18276b;
    }

    @Override // c0.q.a
    public int d() {
        return this.f18275a;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q.a) {
            q.a aVar = (q.a) obj;
            if (this.f18275a == aVar.d() && ((th2 = this.f18276b) != null ? th2.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (this.f18275a ^ 1000003) * 1000003;
        Throwable th2 = this.f18276b;
        return i11 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f18275a + ", cause=" + this.f18276b + "}";
    }
}
