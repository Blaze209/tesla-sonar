package wv;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f122371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f122372b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f122371a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f122372b = list;
    }

    @Override // wv.q
    public List<String> b() {
        return this.f122372b;
    }

    @Override // wv.q
    public String c() {
        return this.f122371a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f122371a.equals(qVar.c()) && this.f122372b.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f122371a.hashCode() ^ 1000003) * 1000003) ^ this.f122372b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f122371a + ", usedDates=" + this.f122372b + "}";
    }
}
