package lr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f90682j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f90683k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f90684l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f90685m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f90686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f90687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f90688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f90689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f90690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double f90691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double f90692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    double f90693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    double f90694i;

    public d(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.f90686a = d15;
        this.f90687b = d16;
        this.f90688c = d17;
        this.f90689d = d11;
        this.f90690e = d12;
        this.f90691f = d13;
        this.f90692g = d14;
        this.f90693h = d18;
        this.f90694i = d19;
    }

    public static d a(ByteBuffer byteBuffer) {
        return b(mr0.d.d(byteBuffer), mr0.d.d(byteBuffer), mr0.d.c(byteBuffer), mr0.d.d(byteBuffer), mr0.d.d(byteBuffer), mr0.d.c(byteBuffer), mr0.d.d(byteBuffer), mr0.d.d(byteBuffer), mr0.d.c(byteBuffer));
    }

    public static d b(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        return new d(d11, d12, d14, d15, d13, d16, d19, d17, d18);
    }

    public void c(ByteBuffer byteBuffer) {
        mr0.e.b(byteBuffer, this.f90689d);
        mr0.e.b(byteBuffer, this.f90690e);
        mr0.e.a(byteBuffer, this.f90686a);
        mr0.e.b(byteBuffer, this.f90691f);
        mr0.e.b(byteBuffer, this.f90692g);
        mr0.e.a(byteBuffer, this.f90687b);
        mr0.e.b(byteBuffer, this.f90693h);
        mr0.e.b(byteBuffer, this.f90694i);
        mr0.e.a(byteBuffer, this.f90688c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Double.compare(dVar.f90689d, this.f90689d) == 0 && Double.compare(dVar.f90690e, this.f90690e) == 0 && Double.compare(dVar.f90691f, this.f90691f) == 0 && Double.compare(dVar.f90692g, this.f90692g) == 0 && Double.compare(dVar.f90693h, this.f90693h) == 0 && Double.compare(dVar.f90694i, this.f90694i) == 0 && Double.compare(dVar.f90686a, this.f90686a) == 0 && Double.compare(dVar.f90687b, this.f90687b) == 0 && Double.compare(dVar.f90688c, this.f90688c) == 0;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f90686a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f90687b);
        int i11 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f90688c);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f90689d);
        int i13 = (i12 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f90690e);
        int i14 = (i13 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f90691f);
        int i15 = (i14 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f90692g);
        int i16 = (i15 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f90693h);
        int i17 = (i16 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f90694i);
        return (i17 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public String toString() {
        if (equals(f90682j)) {
            return "Rotate 0°";
        }
        if (equals(f90683k)) {
            return "Rotate 90°";
        }
        if (equals(f90684l)) {
            return "Rotate 180°";
        }
        if (equals(f90685m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f90686a + ", v=" + this.f90687b + ", w=" + this.f90688c + ", a=" + this.f90689d + ", b=" + this.f90690e + ", c=" + this.f90691f + ", d=" + this.f90692g + ", tx=" + this.f90693h + ", ty=" + this.f90694i + CoreConstants.CURLY_RIGHT;
    }
}
