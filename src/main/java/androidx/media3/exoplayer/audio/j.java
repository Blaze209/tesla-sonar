package androidx.media3.exoplayer.audio;

import java.math.RoundingMode;
import s7.q0;
import w8.s;

/* JADX INFO: loaded from: classes.dex */
public class j implements DefaultAudioSink.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f9522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f9523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f9524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f9525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f9526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9528h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9529a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9530b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9531c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9532d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9533e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9534f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9535g = 4;

        public j h() {
            return new j(this);
        }
    }

    protected j(a aVar) {
        this.f9522b = aVar.f9529a;
        this.f9523c = aVar.f9530b;
        this.f9524d = aVar.f9531c;
        this.f9525e = aVar.f9532d;
        this.f9526f = aVar.f9533e;
        this.f9527g = aVar.f9534f;
        this.f9528h = aVar.f9535g;
    }

    protected static int b(int i11, int i12, int i13) {
        return ru.f.e(((((long) i11) * ((long) i12)) * ((long) i13)) / 1000000);
    }

    private static int d(int i11) {
        int iB = s.b(i11);
        s7.a.h(iB != -2147483647);
        return iB;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.e
    public int a(int i11, int i12, int i13, int i14, int i15, int i16, double d11) {
        return (((Math.max(i11, (int) (((double) c(i11, i12, i13, i14, i15, i16)) * d11)) + i14) - 1) / i14) * i14;
    }

    protected int c(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i13 == 0) {
            return g(i11, i15, i14);
        }
        if (i13 == 1) {
            return e(i12);
        }
        if (i13 == 2) {
            return f(i12, i16);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i11) {
        return ru.f.e((((long) this.f9526f) * ((long) d(i11))) / 1000000);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    protected int f(int i11, int i12) {
        int i13;
        int iD;
        int i14 = this.f9525e;
        if (i11 != 5) {
            if (i11 == 8) {
                i13 = this.f9528h;
            }
            if (i12 != -1) {
                iD = qu.d.b(i12, 8, RoundingMode.CEILING);
            } else {
                iD = d(i11);
            }
            return ru.f.e((((long) i14) * ((long) iD)) / 1000000);
        }
        i13 = this.f9527g;
        i14 *= i13;
        if (i12 != -1) {
            iD = qu.d.b(i12, 8, RoundingMode.CEILING);
        } else {
            iD = d(i11);
        }
        return ru.f.e((((long) i14) * ((long) iD)) / 1000000);
    }

    protected int g(int i11, int i12, int i13) {
        return q0.r(i11 * this.f9524d, b(this.f9522b, i12, i13), b(this.f9523c, i12, i13));
    }
}
