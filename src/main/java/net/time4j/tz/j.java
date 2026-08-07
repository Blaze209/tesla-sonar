package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
final class j extends l implements m {
    private static final long serialVersionUID = 7807230388259573234L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final j f94757v = new j(p.f94822k);
    private final p offset;

    private j(p pVar) {
        if (pVar.i() == 0) {
            this.offset = pVar;
        } else {
            int iJ = pVar.j();
            this.offset = p.p(pVar.i() < 0 ? iJ - 1 : iJ);
        }
    }

    static j R(p pVar) {
        return (pVar.j() == 0 && pVar.i() == 0) ? f94757v : new j(pVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.offset.i() != 0) {
            throw new InvalidObjectException("Fractional offset is invalid.");
        }
    }

    @Override // net.time4j.tz.l
    public p A(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public o E() {
        return l.f94761d;
    }

    @Override // net.time4j.tz.l
    public boolean I(net.time4j.base.f fVar) {
        return false;
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return true;
    }

    @Override // net.time4j.tz.l
    public boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return false;
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return this;
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.f fVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        return false;
    }

    @Override // net.time4j.tz.m
    public q c(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public p d() {
        return this.offset;
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return Collections.singletonList(this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.offset.equals(((j) obj).offset);
        }
        return false;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(j.class.getName());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(this.offset);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public String w(d dVar, Locale locale) {
        return dVar.isAbbreviation() ? this.offset.toString() : this.offset.a();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this;
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.offset;
    }
}
