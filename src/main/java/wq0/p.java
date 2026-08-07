package wq0;

/* JADX INFO: loaded from: classes10.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f122333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f122334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f122335c = true;

    p(Object obj, n nVar) {
        this.f122333a = obj;
        this.f122334b = nVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f122333a == pVar.f122333a && this.f122334b.equals(pVar.f122334b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f122333a.hashCode() + this.f122334b.f122320f.hashCode();
    }
}
