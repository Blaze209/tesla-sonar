package net.time4j.calendar.astro;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import net.time4j.b0;
import net.time4j.engine.z;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 486345450973062467L;
    private final fp0.f scale;
    private final double value;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94003a;

        static {
            int[] iArr = new int[fp0.f.values().length];
            f94003a = iArr;
            try {
                iArr[fp0.f.UT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94003a[fp0.f.TT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94003a[fp0.f.POSIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private c(double d11, fp0.f fVar) {
        a(d11, fVar);
        this.value = d11;
        this.scale = fVar;
    }

    private static void a(double d11, fp0.f fVar) {
        if (Double.isNaN(d11) || Double.isInfinite(d11)) {
            throw new IllegalArgumentException("Value is not finite: " + d11);
        }
        int i11 = a.f94003a[fVar.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            throw new IllegalArgumentException("Unsupported time scale: " + fVar);
        }
        if (Double.compare(990575.0d, d11) > 0 || Double.compare(d11, 2817152.0d) > 0) {
            throw new IllegalArgumentException("Out of range: " + d11);
        }
    }

    static double e(b0 b0Var, fp0.f fVar) {
        return ((b0Var.i(fVar) + f(fVar)) + (((double) b0Var.m(fVar)) / 1.0E9d)) / 86400.0d;
    }

    private static long f(fp0.f fVar) {
        int i11 = a.f94003a[fVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 210929832000L;
        }
        if (i11 == 3) {
            return 210866760000L;
        }
        throw new UnsupportedOperationException(fVar.name());
    }

    public static c g(double d11) {
        return new c(d11, fp0.f.TT);
    }

    public static c h(b0 b0Var) {
        fp0.f fVar = fp0.f.TT;
        return new c(e(b0Var, fVar), fVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        try {
            objectInputStream.defaultReadObject();
            a(this.value, this.scale);
        } catch (ClassNotFoundException unused) {
            throw new StreamCorruptedException();
        } catch (IllegalArgumentException unused2) {
            throw new StreamCorruptedException();
        }
    }

    public double b() {
        return (this.value - 2451545.0d) / 36525.0d;
    }

    public double c() {
        return this.value - 2400000.5d;
    }

    public double d() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.value == cVar.value && this.scale == cVar.scale) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return net.time4j.calendar.astro.a.a(this.value) ^ this.scale.hashCode();
    }

    public b0 i() {
        fp0.f fVar;
        double dDeltaT = this.value * 86400.0d;
        fp0.f fVar2 = this.scale;
        if (!fp0.d.n().r() && fVar2 != (fVar = fp0.f.POSIX)) {
            if (fVar2 == fp0.f.TT) {
                g0 g0VarO0 = g0.O0((long) Math.floor(c()), z.MODIFIED_JULIAN_DATE);
                dDeltaT -= fp0.f.deltaT(g0VarO0.b(), g0VarO0.r());
            }
            dDeltaT += 6.3072E7d;
            fVar2 = fVar;
        }
        return b0.k0(net.time4j.base.c.m((long) dDeltaT, f(fVar2)), (int) ((dDeltaT - Math.floor(dDeltaT)) * 1.0E9d), fVar2);
    }

    public String toString() {
        return "JD(" + this.scale.name() + CoreConstants.RIGHT_PARENTHESIS_CHAR + this.value;
    }
}
