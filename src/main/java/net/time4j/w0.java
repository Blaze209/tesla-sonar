package net.time4j;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 extends net.time4j.engine.f implements v, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f94831a = new w0();
    private static final long serialVersionUID = -4981215347844372171L;

    private w0() {
    }

    private Object readResolve() {
        return f94831a;
    }

    @Override // net.time4j.engine.f
    protected <T extends net.time4j.engine.q<T>> net.time4j.engine.k0<T> a(net.time4j.engine.w<T> wVar) {
        if (wVar.v(g0.f94487n)) {
            return a1.A();
        }
        return null;
    }

    @Override // net.time4j.engine.v
    public double getLength() {
        return f.YEARS.getLength();
    }

    @Override // net.time4j.x
    public char getSymbol() {
        return 'Y';
    }

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return true;
    }

    public String toString() {
        return "WEEK_BASED_YEARS";
    }
}
