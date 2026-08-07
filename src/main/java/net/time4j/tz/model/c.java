package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.c0;
import net.time4j.g0;
import net.time4j.x0;

/* JADX INFO: loaded from: classes9.dex */
final class c extends g {
    private static final long serialVersionUID = -7354650946442523175L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte f94793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient byte f94794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient boolean f94795h;

    c(c0 c0Var, int i11, x0 x0Var, int i12, i iVar, int i13, boolean z11) {
        super(c0Var, i12, iVar, i13);
        net.time4j.base.b.a(2000, c0Var.getValue(), i11);
        this.f94793f = (byte) i11;
        this.f94794g = (byte) x0Var.getValue();
        this.f94795h = z11;
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
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f94793f == cVar.f94793f && this.f94794g == cVar.f94794g && this.f94795h == cVar.f94795h && super.l(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.model.d
    int g() {
        return 121;
    }

    public int hashCode() {
        return this.f94793f + ((this.f94794g + (k() * 37)) * 17) + (this.f94795h ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.tz.model.g
    protected g0 j(int i11) {
        int i12;
        byte bK = k();
        int iC = net.time4j.base.b.c(i11, bK, this.f94793f);
        g0 g0VarI0 = g0.I0(i11, bK, this.f94793f);
        byte b11 = this.f94794g;
        if (iC == b11) {
            return g0VarI0;
        }
        int i13 = iC - b11;
        if (this.f94795h) {
            i13 = -i13;
            i12 = 1;
        } else {
            i12 = -1;
        }
        if (i13 < 0) {
            i13 += 7;
        }
        return (g0) g0VarI0.H(i13 * i12, net.time4j.f.DAYS);
    }

    int m() {
        return this.f94793f;
    }

    byte n() {
        return this.f94794g;
    }

    boolean o() {
        return this.f94795h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayOfWeekInMonthPattern:[month=");
        sb2.append((int) k());
        sb2.append(",dayOfMonth=");
        sb2.append((int) this.f94793f);
        sb2.append(",dayOfWeek=");
        sb2.append(x0.valueOf(this.f94794g));
        sb2.append(",day-overflow=");
        sb2.append(c());
        sb2.append(",time-of-day=");
        sb2.append(f());
        sb2.append(",offset-indicator=");
        sb2.append(d());
        sb2.append(",dst-offset=");
        sb2.append(e());
        sb2.append(",after=");
        sb2.append(this.f94795h);
        sb2.append(']');
        return sb2.toString();
    }
}
