package dr;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f60900a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f60901b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f60902c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f60903d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f60904e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f60905f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f60906g = {ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f60908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f60910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f60911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f60912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f60913g;

        public boolean a(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (!t.l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
                return false;
            }
            this.f60907a = i12;
            this.f60908b = t.f60900a[3 - i13];
            int i16 = t.f60901b[i15];
            this.f60910d = i16;
            if (i12 == 2) {
                this.f60910d = i16 / 2;
            } else if (i12 == 0) {
                this.f60910d = i16 / 4;
            }
            int i17 = (i11 >>> 9) & 1;
            this.f60913g = t.k(i12, i13);
            if (i13 == 3) {
                int i18 = i12 == 3 ? t.f60902c[i14 - 1] : t.f60903d[i14 - 1];
                this.f60912f = i18;
                this.f60909c = (((i18 * 12) / this.f60910d) + i17) * 4;
            } else {
                if (i12 == 3) {
                    int i19 = i13 == 2 ? t.f60904e[i14 - 1] : t.f60905f[i14 - 1];
                    this.f60912f = i19;
                    this.f60909c = ((i19 * 144) / this.f60910d) + i17;
                } else {
                    int i21 = t.f60906g[i14 - 1];
                    this.f60912f = i21;
                    this.f60909c = (((i13 == 1 ? 72 : 144) * i21) / this.f60910d) + i17;
                }
            }
            this.f60911e = ((i11 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f60901b[i15];
        if (i12 == 2) {
            i17 /= 2;
        } else if (i12 == 0) {
            i17 /= 4;
        }
        int i18 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? f60902c[i14 - 1] : f60903d[i14 - 1]) * 12) / i17) + i18) * 4;
        }
        if (i12 == 3) {
            i16 = i13 == 2 ? f60904e[i14 - 1] : f60905f[i14 - 1];
        } else {
            i16 = f60906g[i14 - 1];
        }
        if (i12 == 3) {
            return ((i16 * 144) / i17) + i18;
        }
        return (((i13 == 1 ? 72 : 144) * i16) / i17) + i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i11, int i12) {
        if (i12 == 1) {
            return i11 == 3 ? 1152 : 576;
        }
        if (i12 == 2) {
            return 1152;
        }
        if (i12 == 3) {
            return KyberEngine.KyberPolyBytes;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i11) {
        return (i11 & (-2097152)) == -2097152;
    }

    public static int m(int i11) {
        int i12;
        int i13;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0) {
            return -1;
        }
        int i14 = (i11 >>> 12) & 15;
        int i15 = (i11 >>> 10) & 3;
        if (i14 == 0 || i14 == 15 || i15 == 3) {
            return -1;
        }
        return k(i12, i13);
    }
}
