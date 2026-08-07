package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.time4j.engine.z;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f94592d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f94593e = h.g(j.AD, 1, 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f94594f = h.g(j.BC, 38, 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g0 f94595g = g0.G0(2000, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f94596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f94597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f94598c;

    private g() {
        this.f94596a = null;
        this.f94597b = (g0) g0.q0().H();
        this.f94598c = (g0) g0.q0().G();
    }

    public static g a(g0 g0Var, g0 g0Var2) {
        return new g(j.AB_URBE_CONDITA, g0Var, g0Var2);
    }

    public static g b(g0 g0Var, g0 g0Var2) {
        return new g(j.BYZANTINE, g0Var, g0Var2);
    }

    public static g c(g0 g0Var) {
        return b((g0) g0.q0().H(), g0Var);
    }

    public static g e(g0 g0Var, g0 g0Var2) {
        return new g(j.HISPANIC, g0Var, g0Var2);
    }

    public static g f(g0 g0Var) {
        return e((g0) g0.q0().H(), g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static g g(DataInput dataInput) throws IOException {
        if (dataInput.readByte() != 127) {
            return f94592d;
        }
        j jVarValueOf = j.valueOf(dataInput.readUTF());
        long j11 = dataInput.readLong();
        long j12 = dataInput.readLong();
        g0 g0Var = f94595g;
        z zVar = z.MODIFIED_JULIAN_DATE;
        return new g(jVarValueOf, (g0) g0Var.A(zVar, j11), (g0) g0Var.A(zVar, j12));
    }

    j d(h hVar, g0 g0Var) {
        if (this.f94596a == null || g0Var.N(this.f94597b) || g0Var.M(this.f94598c)) {
            return hVar.compareTo(f94593e) < 0 ? j.BC : j.AD;
        }
        return (this.f94596a != j.HISPANIC || hVar.compareTo(f94594f) >= 0) ? this.f94596a : j.BC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            g gVar2 = f94592d;
            if (this == gVar2) {
                return gVar == gVar2;
            }
            if (this.f94596a == gVar.f94596a && this.f94597b.equals(gVar.f94597b) && this.f94598c.equals(gVar.f94598c)) {
                return true;
            }
        }
        return false;
    }

    void h(DataOutput dataOutput) {
        if (this == f94592d) {
            dataOutput.writeByte(0);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeUTF(this.f94596a.name());
        g0 g0Var = this.f94597b;
        z zVar = z.MODIFIED_JULIAN_DATE;
        dataOutput.writeLong(((Long) g0Var.s(zVar)).longValue());
        dataOutput.writeLong(((Long) this.f94598c.s(zVar)).longValue());
    }

    public int hashCode() {
        return (this.f94596a.hashCode() * 17) + (this.f94597b.hashCode() * 31) + (this.f94598c.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this == f94592d) {
            sb2.append("default");
        } else {
            sb2.append("era->");
            sb2.append(this.f94596a);
            sb2.append(",start->");
            sb2.append(this.f94597b);
            sb2.append(",end->");
            sb2.append(this.f94598c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    private g(j jVar, g0 g0Var, g0 g0Var2) {
        if (jVar.compareTo(j.AD) > 0) {
            if (!g0Var2.N(g0Var)) {
                this.f94596a = jVar;
                this.f94597b = g0Var;
                this.f94598c = g0Var2;
                return;
            } else {
                throw new IllegalArgumentException("End before start: " + g0Var + "/" + g0Var2);
            }
        }
        throw new UnsupportedOperationException(jVar.name());
    }
}
