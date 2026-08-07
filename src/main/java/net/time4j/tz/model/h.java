package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.c0;
import net.time4j.g0;
import net.time4j.x0;

/* JADX INFO: loaded from: classes9.dex */
final class h extends g {
    private static final long serialVersionUID = -946839310332554772L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte f94802f;

    h(c0 c0Var, x0 x0Var, int i11, i iVar, int i12) {
        super(c0Var, i11, iVar, i12);
        this.f94802f = (byte) x0Var.getValue();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f94802f == hVar.f94802f && super.l(hVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.model.d
    int g() {
        return 122;
    }

    public int hashCode() {
        return (this.f94802f * 17) + (k() * 37);
    }

    @Override // net.time4j.tz.model.g
    protected g0 j(int i11) {
        byte bK = k();
        int iD = net.time4j.base.b.d(i11, bK);
        int iC = net.time4j.base.b.c(i11, bK, iD) - this.f94802f;
        if (iC < 0) {
            iC += 7;
        }
        return g0.I0(i11, bK, iD - iC);
    }

    byte m() {
        return this.f94802f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LastDayOfWeekPattern:[month=");
        sb2.append((int) k());
        sb2.append(",day-of-week=");
        sb2.append(x0.valueOf(this.f94802f));
        sb2.append(",day-overflow=");
        sb2.append(c());
        sb2.append(",time-of-day=");
        sb2.append(f());
        sb2.append(",offset-indicator=");
        sb2.append(d());
        sb2.append(",dst-offset=");
        sb2.append(e());
        sb2.append(']');
        return sb2.toString();
    }
}
