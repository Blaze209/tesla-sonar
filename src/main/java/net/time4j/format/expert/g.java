package net.time4j.format.expert;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.p<?> f94315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94317c;

    public g(net.time4j.engine.p<?> pVar, int i11, int i12) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative start index: " + i11 + " (" + pVar.name() + ")");
        }
        if (i12 > i11) {
            this.f94315a = pVar;
            this.f94316b = i11;
            this.f94317c = i12;
            return;
        }
        throw new IllegalArgumentException("End index " + i12 + " must be greater than start index " + i11 + " (" + pVar.name() + ")");
    }

    public net.time4j.engine.p<?> a() {
        return this.f94315a;
    }

    public int b() {
        return this.f94317c;
    }

    public int c() {
        return this.f94316b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f94315a.equals(gVar.f94315a) && this.f94316b == gVar.f94316b && this.f94317c == gVar.f94317c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f94315a.hashCode() + ((this.f94316b | (this.f94317c << 16)) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(g.class.getName());
        sb2.append("[element=");
        sb2.append(this.f94315a.name());
        sb2.append(",start-index=");
        sb2.append(this.f94316b);
        sb2.append(",end-index=");
        sb2.append(this.f94317c);
        sb2.append(']');
        return sb2.toString();
    }
}
