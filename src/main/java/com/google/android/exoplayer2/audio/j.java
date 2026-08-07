package com.google.android.exoplayer2.audio;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.math.RoundingMode;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class j implements DefaultAudioSink.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f39594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f39595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f39596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f39597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f39598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39599g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f39600a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39601b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f39602c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f39603d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39604e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f39605f = 2;

        public j g() {
            return new j(this);
        }
    }

    protected j(a aVar) {
        this.f39594b = aVar.f39600a;
        this.f39595c = aVar.f39601b;
        this.f39596d = aVar.f39602c;
        this.f39597e = aVar.f39603d;
        this.f39598f = aVar.f39604e;
        this.f39599g = aVar.f39605f;
    }

    protected static int b(int i11, int i12, int i13) {
        return ru.f.e(((((long) i11) * ((long) i12)) * ((long) i13)) / 1000000);
    }

    protected static int d(int i11) {
        switch (i11) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.e
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
        return ru.f.e((((long) this.f39598f) * ((long) d(i11))) / 1000000);
    }

    protected int f(int i11, int i12) {
        int i13 = this.f39597e;
        if (i11 == 5) {
            i13 *= this.f39599g;
        }
        return ru.f.e((((long) i13) * ((long) (i12 != -1 ? qu.d.b(i12, 8, RoundingMode.CEILING) : d(i11)))) / 1000000);
    }

    protected int g(int i11, int i12, int i13) {
        return p0.q(i11 * this.f39596d, b(this.f39594b, i12, i13), b(this.f39595c, i12, i13));
    }
}
