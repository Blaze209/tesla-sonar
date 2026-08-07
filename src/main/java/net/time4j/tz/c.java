package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class c extends l {
    private static final long serialVersionUID = 1738909257417361021L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final transient k f94749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final transient m f94750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final transient o f94751x;

    c(k kVar, m mVar) {
        this(kVar, mVar, l.f94761d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 14);
    }

    @Override // net.time4j.tz.l
    public p A(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        List<p> listE = this.f94750w.e(aVar, gVar);
        return listE.size() == 1 ? listE.get(0) : p.p(this.f94750w.c(aVar, gVar).i());
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        q qVarA = this.f94750w.a(fVar);
        return qVarA == null ? this.f94750w.d() : p.p(qVarA.i());
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.f94751x;
    }

    @Override // net.time4j.tz.l
    public boolean I(net.time4j.base.f fVar) {
        net.time4j.base.f fVarB;
        q qVarA;
        q qVarA2 = this.f94750w.a(fVar);
        if (qVarA2 == null) {
            return false;
        }
        int iD = qVarA2.d();
        if (iD > 0) {
            return true;
        }
        if (iD < 0 || !this.f94750w.b() || (qVarA = this.f94750w.a((fVarB = i.b(qVarA2.e(), 0)))) == null) {
            return false;
        }
        if (qVarA.h() == qVarA2.h()) {
            return qVarA.d() < 0;
        }
        return I(fVarB);
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.f94750w.isEmpty();
    }

    @Override // net.time4j.tz.l
    public boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        q qVarC = this.f94750w.c(aVar, gVar);
        return qVarC != null && qVarC.j();
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return this.f94751x == oVar ? this : new c(this.f94749v, this.f94750w, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f94749v.a().equals(cVar.f94749v.a()) && this.f94750w.equals(cVar.f94750w) && this.f94751x.equals(cVar.f94751x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f94749v.a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(c.class.getName());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(this.f94749v.a());
        sb2.append(",history={");
        sb2.append(this.f94750w);
        sb2.append("},strategy=");
        sb2.append(this.f94751x);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this.f94750w;
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.f94749v;
    }

    c(k kVar, m mVar, o oVar) {
        if (kVar == null) {
            throw new NullPointerException("Missing timezone id.");
        }
        if ((kVar instanceof p) && !mVar.isEmpty()) {
            throw new IllegalArgumentException("Fixed zonal offset can't be combined with offset transitions: " + kVar.a());
        }
        if (mVar == null) {
            throw new NullPointerException("Missing timezone history.");
        }
        if (oVar == null) {
            throw new NullPointerException("Missing transition strategy.");
        }
        this.f94749v = kVar;
        this.f94750w = mVar;
        this.f94751x = oVar;
    }
}
