package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes9.dex */
final class a extends l {
    private static final long serialVersionUID = -2894726563499525332L;
    private final l fallback;
    private final k tzid;

    a(k kVar, l lVar) {
        if (kVar == null || lVar == null) {
            throw null;
        }
        this.tzid = kVar;
        this.fallback = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 12);
    }

    @Override // net.time4j.tz.l
    public p A(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.fallback.A(aVar, gVar);
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        return this.fallback.B(fVar);
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.fallback.E();
    }

    @Override // net.time4j.tz.l
    public boolean I(net.time4j.base.f fVar) {
        return this.fallback.I(fVar);
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.fallback.J();
    }

    @Override // net.time4j.tz.l
    public boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.fallback.K(aVar, gVar);
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return new a(this.tzid, this.fallback.Q(oVar));
    }

    l R() {
        return this.fallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.tzid.a().equals(aVar.tzid.a()) && this.fallback.equals(aVar.fallback)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.tzid.a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(a.class.getName());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(this.tzid.a());
        sb2.append(",fallback=");
        sb2.append(this.fallback);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this.fallback.y();
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.tzid;
    }
}
