package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.List;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* JADX INFO: loaded from: classes9.dex */
final class b extends l {
    private static final long serialVersionUID = 1749643877954103721L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f94788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient a f94789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient j f94790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient q f94791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f94792f = 0;

    b(int i11, List<q> list, List<d> list2, boolean z11, boolean z12) {
        this.f94788b = i11;
        a aVar = new a(list, z11, z12);
        this.f94789c = aVar;
        q qVarN = aVar.n();
        this.f94791e = qVarN;
        this.f94790d = new j(qVarN, list2, z11);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 127);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.f fVar) {
        if (fVar.l() < this.f94791e.e()) {
            return this.f94789c.a(fVar);
        }
        q qVarA = this.f94790d.a(fVar);
        return qVarA == null ? this.f94791e : qVarA;
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        return this.f94790d.b() || this.f94789c.b();
    }

    @Override // net.time4j.tz.m
    public q c(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.f94789c.m(aVar, gVar, this.f94790d);
    }

    @Override // net.time4j.tz.m
    public p d() {
        return this.f94789c.d();
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.f94789c.p(aVar, gVar, this.f94790d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f94789c.l(bVar.f94789c, this.f94788b, bVar.f94788b) && this.f94790d.n().equals(bVar.f94790d.n())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f94792f;
        if (i11 != 0) {
            return i11;
        }
        int iQ = this.f94789c.q(this.f94788b) + (this.f94790d.n().hashCode() * 37);
        this.f94792f = iQ;
        return iQ;
    }

    List<d> k() {
        return this.f94790d.n();
    }

    void l(ObjectOutput objectOutput) {
        this.f94789c.t(this.f94788b, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(b.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f94788b);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(",last-rules=");
        sb2.append(this.f94790d.n());
        sb2.append(']');
        return sb2.toString();
    }
}
