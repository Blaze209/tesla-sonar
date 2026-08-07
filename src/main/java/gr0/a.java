package gr0;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@g(objectTypeIndication = 64, tags = {5})
public class a extends gr0.b {
    public static Map<Integer, Integer> Z = new HashMap();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static Map<Integer, String> f69373a0 = new HashMap();
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    byte[] X;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420a f69374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f69378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f69379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f69380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f69381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f69382l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f69384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f69385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f69386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f69387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f69388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f69389s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f69393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f69394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f69395y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f69396z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f69383m = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f69390t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f69391u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f69392v = -1;
    boolean Y = false;

    /* JADX INFO: renamed from: gr0.a$a, reason: collision with other inner class name */
    public class C1420a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f69397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f69398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f69399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f69400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f69401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f69402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f69403g;

        public C1420a(int i11, c cVar) {
            int iA;
            this.f69397a = cVar.b();
            this.f69398b = cVar.b();
            this.f69399c = cVar.b();
            this.f69400d = cVar.b();
            boolean zB = cVar.b();
            this.f69401e = zB;
            if (zB) {
                this.f69402f = cVar.b();
                this.f69403g = cVar.b();
                a(i11, cVar);
            }
            while (cVar.a(4) != 0) {
                int iA2 = cVar.a(4);
                if (iA2 == 15) {
                    iA = cVar.a(8);
                    iA2 += iA;
                } else {
                    iA = 0;
                }
                if (iA == 255) {
                    iA2 += cVar.a(16);
                }
                for (int i12 = 0; i12 < iA2; i12++) {
                    cVar.a(8);
                }
            }
        }

        public void a(int i11, c cVar) {
            int i12;
            switch (i11) {
                case 1:
                case 2:
                    i12 = 1;
                    break;
                case 3:
                    i12 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i12 = 3;
                    break;
                case 7:
                    i12 = 4;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            for (int i13 = 0; i13 < i12; i13++) {
                a.this.new b(cVar);
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f69405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f69406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f69409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f69410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f69411g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f69412h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f69413i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f69414j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f69415k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f69416l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f69417m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f69418n;

        public b(c cVar) {
            this.f69405a = cVar.b();
            this.f69406b = cVar.a(4);
            this.f69407c = cVar.a(4);
            this.f69408d = cVar.a(3);
            this.f69409e = cVar.a(2);
            this.f69410f = cVar.b();
            this.f69411g = cVar.b();
            if (this.f69410f) {
                this.f69412h = cVar.a(2);
                this.f69413i = cVar.b();
                this.f69414j = cVar.a(2);
            }
            if (this.f69411g) {
                this.f69415k = cVar.a(2);
                this.f69416l = cVar.a(2);
                this.f69417m = cVar.b();
            }
            this.f69418n = cVar.b();
        }
    }

    static {
        Z.put(0, 96000);
        Z.put(1, 88200);
        Z.put(2, 64000);
        Z.put(3, 48000);
        Z.put(4, 44100);
        Z.put(5, 32000);
        Z.put(6, 24000);
        Z.put(7, 22050);
        Z.put(8, 16000);
        Z.put(9, 12000);
        Z.put(10, 11025);
        Z.put(11, Integer.valueOf(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED));
        f69373a0.put(1, "AAC main");
        f69373a0.put(2, "AAC LC");
        f69373a0.put(3, "AAC SSR");
        f69373a0.put(4, "AAC LTP");
        f69373a0.put(5, "SBR");
        f69373a0.put(6, "AAC Scalable");
        f69373a0.put(7, "TwinVQ");
        f69373a0.put(8, "CELP");
        f69373a0.put(9, "HVXC");
        f69373a0.put(10, "(reserved)");
        f69373a0.put(11, "(reserved)");
        f69373a0.put(12, "TTSI");
        f69373a0.put(13, "Main synthetic");
        f69373a0.put(14, "Wavetable synthesis");
        f69373a0.put(15, "General MIDI");
        f69373a0.put(16, "Algorithmic Synthesis and Audio FX");
        f69373a0.put(17, "ER AAC LC");
        f69373a0.put(18, "(reserved)");
        f69373a0.put(19, "ER AAC LTP");
        f69373a0.put(20, "ER AAC Scalable");
        f69373a0.put(21, "ER TwinVQ");
        f69373a0.put(22, "ER BSAC");
        f69373a0.put(23, "ER AAC LD");
        f69373a0.put(24, "ER CELP");
        f69373a0.put(25, "ER HVXC");
        f69373a0.put(26, "ER HILN");
        f69373a0.put(27, "ER Parametric");
        f69373a0.put(28, "SSC");
        f69373a0.put(29, "PS");
        f69373a0.put(30, "MPEG Surround");
        f69373a0.put(31, "(escape)");
        f69373a0.put(32, "Layer-1");
        f69373a0.put(33, "Layer-2");
        f69373a0.put(34, "Layer-3");
        f69373a0.put(35, "DST");
        f69373a0.put(36, "ALS");
        f69373a0.put(37, "SLS");
        f69373a0.put(38, "SLS non-core");
        f69373a0.put(39, "ER AAC ELD");
        f69373a0.put(40, "SMR Simple");
        f69373a0.put(41, "SMR Main");
    }

    public a() {
        this.f69420a = 5;
    }

    private int g() {
        int i11 = this.f69394x == 1 ? 16 : 2;
        int i12 = i11 + 1;
        if (this.f69379i == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        int i13 = this.f69375e;
        if (i13 == 6 || i13 == 20) {
            i12 = i11 + 4;
        }
        if (this.f69396z != 1) {
            return i12;
        }
        if (i13 == 22) {
            i12 += 16;
        }
        if (i13 == 17 || i13 == 19 || i13 == 20 || i13 == 23) {
            i12 += 3;
        }
        int i14 = i12 + 1;
        if (this.G != 1) {
            return i14;
        }
        throw new RuntimeException("Not implemented");
    }

    private static int h(c cVar) {
        int iA = cVar.a(5);
        return iA == 31 ? cVar.a(6) + 32 : iA;
    }

    private void i(int i11, int i12, int i13, c cVar) {
        this.L = cVar.a(1);
        this.M = cVar.a(2);
        int iA = cVar.a(1);
        this.N = iA;
        if (iA == 1) {
            this.O = cVar.a(1);
        }
    }

    private void j(int i11, int i12, int i13, c cVar) {
        this.f69393w = cVar.a(1);
        int iA = cVar.a(1);
        this.f69394x = iA;
        if (iA == 1) {
            this.f69395y = cVar.a(14);
        }
        this.f69396z = cVar.a(1);
        if (i12 == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (i13 == 6 || i13 == 20) {
            this.A = cVar.a(3);
        }
        if (this.f69396z == 1) {
            if (i13 == 22) {
                this.B = cVar.a(5);
                this.C = cVar.a(11);
            }
            if (i13 == 17 || i13 == 19 || i13 == 20 || i13 == 23) {
                this.D = cVar.b();
                this.E = cVar.b();
                this.F = cVar.b();
            }
            int iA2 = cVar.a(1);
            this.G = iA2;
            if (iA2 == 1) {
                throw new RuntimeException("not yet implemented");
            }
        }
        this.H = true;
    }

    private void k(int i11, int i12, int i13, c cVar) {
        this.P = cVar.a(1);
        this.Q = cVar.a(8);
        this.R = cVar.a(4);
        this.S = cVar.a(12);
        this.T = cVar.a(2);
    }

    private void l(int i11, int i12, int i13, c cVar) {
        int iA = cVar.a(1);
        this.U = iA;
        if (iA == 1) {
            this.V = cVar.a(2);
        }
    }

    private void m(int i11, int i12, int i13, c cVar) {
        int iA = cVar.a(2);
        this.J = iA;
        if (iA != 1) {
            i(i11, i12, i13, cVar);
        }
        if (this.J != 0) {
            k(i11, i12, i13, cVar);
        }
        this.K = cVar.a(1);
        this.W = true;
    }

    private void n(int i11, int i12, int i13, c cVar) {
        int iA = cVar.a(1);
        this.I = iA;
        if (iA == 1) {
            m(i11, i12, i13, cVar);
        } else {
            l(i11, i12, i13, cVar);
        }
    }

    private static void t(int i11, d dVar) {
        if (i11 < 32) {
            dVar.a(i11, 5);
        } else {
            dVar.a(31, 5);
            dVar.a(i11 - 32, 6);
        }
    }

    private void u(d dVar) {
        dVar.a(this.f69393w, 1);
        dVar.a(this.f69394x, 1);
        if (this.f69394x == 1) {
            dVar.a(this.f69395y, 14);
        }
        dVar.a(this.f69396z, 1);
        if (this.f69379i == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        int i11 = this.f69375e;
        if (i11 == 6 || i11 == 20) {
            dVar.a(this.A, 3);
        }
        if (this.f69396z == 1) {
            if (this.f69375e == 22) {
                dVar.a(this.B, 5);
                dVar.a(this.C, 11);
            }
            int i12 = this.f69375e;
            if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                dVar.b(this.D);
                dVar.b(this.E);
                dVar.b(this.F);
            }
            dVar.a(this.G, 1);
            if (this.G == 1) {
                throw new RuntimeException("not yet implemented");
            }
        }
    }

    @Override // gr0.b
    protected int a() {
        int i11 = this.f69376f > 30 ? 11 : 5;
        int i12 = i11 + 4;
        if (this.f69377g == 15) {
            i12 = i11 + 28;
        }
        int iG = i12 + 4;
        int i13 = this.f69375e;
        if (i13 == 5 || i13 == 29) {
            iG = i12 + 8;
            if (this.f69383m == 15) {
                iG = i12 + 32;
            }
        }
        if (i13 == 22) {
            iG += 4;
        }
        if (this.H) {
            iG += g();
        }
        int i14 = this.f69392v;
        if (i14 >= 0) {
            int i15 = iG + 11;
            if (i14 == 695) {
                int i16 = iG + 16;
                int i17 = this.f69380j;
                if (i17 > 30) {
                    i16 = iG + 22;
                }
                if (i17 == 5) {
                    iG = i16 + 1;
                    if (this.f69381k) {
                        iG = i16 + 5;
                        if (this.f69383m == 15) {
                            iG = i16 + 29;
                        }
                        int i18 = this.f69391u;
                        if (i18 >= 0) {
                            iG = i18 == 1352 ? iG + 12 : iG + 11;
                        }
                    }
                } else {
                    iG = i16;
                }
                if (i17 == 22) {
                    int i19 = iG + 1;
                    if (this.f69381k) {
                        i19 = iG + 5;
                        if (this.f69383m == 15) {
                            i19 = iG + 29;
                        }
                    }
                    iG = i19 + 4;
                }
            } else {
                iG = i15;
            }
        }
        return (int) Math.ceil(((double) iG) / 8.0d);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        int iA;
        this.Y = true;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f69421b);
        byteBuffer.position(byteBuffer.position() + this.f69421b);
        byte[] bArr = new byte[this.f69421b];
        this.X = bArr;
        byteBufferSlice.get(bArr);
        byteBufferSlice.rewind();
        c cVar = new c(byteBufferSlice);
        int iH = h(cVar);
        this.f69375e = iH;
        this.f69376f = iH;
        int iA2 = cVar.a(4);
        this.f69377g = iA2;
        if (iA2 == 15) {
            this.f69378h = cVar.a(24);
        }
        this.f69379i = cVar.a(4);
        int i11 = this.f69375e;
        if (i11 == 5 || i11 == 29) {
            this.f69380j = 5;
            this.f69381k = true;
            if (i11 == 29) {
                this.f69382l = true;
            }
            int iA3 = cVar.a(4);
            this.f69383m = iA3;
            if (iA3 == 15) {
                this.f69384n = cVar.a(24);
            }
            int iH2 = h(cVar);
            this.f69375e = iH2;
            if (iH2 == 22) {
                this.f69385o = cVar.a(4);
            }
        } else {
            this.f69380j = 0;
        }
        int i12 = this.f69375e;
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                j(this.f69377g, this.f69379i, i12, cVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                n(this.f69377g, this.f69379i, i12, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f69386p = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f69387q = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.f69374d = new C1420a(this.f69379i, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i13 = this.f69375e;
        if (i13 != 17 && i13 != 39) {
            switch (i13) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    iA = cVar.a(2);
                    this.f69388r = iA;
                    if (iA != 2) {
                        break;
                    }
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
        }
        iA = cVar.a(2);
        this.f69388r = iA;
        if (iA != 2 || iA == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (iA == 3) {
            int iA4 = cVar.a(1);
            this.f69389s = iA4;
            if (iA4 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f69380j == 5 || cVar.c() < 16) {
            return;
        }
        int iA5 = cVar.a(11);
        this.f69390t = iA5;
        this.f69392v = iA5;
        if (iA5 == 695) {
            int iH3 = h(cVar);
            this.f69380j = iH3;
            if (iH3 == 5) {
                boolean zB = cVar.b();
                this.f69381k = zB;
                if (zB) {
                    int iA6 = cVar.a(4);
                    this.f69383m = iA6;
                    if (iA6 == 15) {
                        this.f69384n = cVar.a(24);
                    }
                    if (cVar.c() >= 12) {
                        int iA7 = cVar.a(11);
                        this.f69390t = iA7;
                        this.f69391u = iA7;
                        if (iA7 == 1352) {
                            this.f69382l = cVar.b();
                        }
                    }
                }
            }
            if (this.f69380j == 22) {
                boolean zB2 = cVar.b();
                this.f69381k = zB2;
                if (zB2) {
                    int iA8 = cVar.a(4);
                    this.f69383m = iA8;
                    if (iA8 == 15) {
                        this.f69384n = cVar.a(24);
                    }
                }
                this.f69385o = cVar.a(4);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.E == aVar.E && this.D == aVar.D && this.F == aVar.F && this.f69375e == aVar.f69375e && this.f69379i == aVar.f69379i && this.f69395y == aVar.f69395y && this.f69394x == aVar.f69394x && this.f69389s == aVar.f69389s && this.f69388r == aVar.f69388r && this.N == aVar.N && this.f69380j == aVar.f69380j && this.f69385o == aVar.f69385o && this.f69396z == aVar.f69396z && this.G == aVar.G && this.f69384n == aVar.f69384n && this.f69383m == aVar.f69383m && this.f69387q == aVar.f69387q && this.f69393w == aVar.f69393w && this.H == aVar.H && this.T == aVar.T && this.U == aVar.U && this.V == aVar.V && this.S == aVar.S && this.Q == aVar.Q && this.P == aVar.P && this.R == aVar.R && this.M == aVar.M && this.L == aVar.L && this.I == aVar.I && this.A == aVar.A && this.C == aVar.C && this.B == aVar.B && this.K == aVar.K && this.J == aVar.J && this.W == aVar.W && this.f69382l == aVar.f69382l && this.f69386p == aVar.f69386p && this.f69378h == aVar.f69378h && this.f69377g == aVar.f69377g && this.f69381k == aVar.f69381k && this.f69390t == aVar.f69390t && this.O == aVar.O && Arrays.equals(this.X, aVar.X);
    }

    public int hashCode() {
        byte[] bArr = this.X;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f69375e) * 31) + this.f69377g) * 31) + this.f69378h) * 31) + this.f69379i) * 31) + this.f69380j) * 31) + (this.f69381k ? 1 : 0)) * 31) + (this.f69382l ? 1 : 0)) * 31) + this.f69383m) * 31) + this.f69384n) * 31) + this.f69385o) * 31) + this.f69386p) * 31) + this.f69387q) * 31) + this.f69388r) * 31) + this.f69389s) * 31) + this.f69390t) * 31) + this.f69393w) * 31) + this.f69394x) * 31) + this.f69395y) * 31) + this.f69396z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + this.G) * 31) + (this.H ? 1 : 0)) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + (this.W ? 1 : 0);
    }

    public ByteBuffer o() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b());
        mr0.e.i(byteBufferAllocate, this.f69420a);
        f(byteBufferAllocate, a());
        byteBufferAllocate.put(p());
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    protected ByteBuffer p() {
        int i11;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a()]);
        d dVar = new d(byteBufferWrap);
        t(this.f69376f, dVar);
        dVar.a(this.f69377g, 4);
        if (this.f69377g == 15) {
            dVar.a(this.f69378h, 24);
        }
        dVar.a(this.f69379i, 4);
        int i12 = this.f69375e;
        if (i12 == 5 || i12 == 29) {
            this.f69380j = 5;
            this.f69381k = true;
            if (i12 == 29) {
                this.f69382l = true;
            }
            dVar.a(this.f69383m, 4);
            if (this.f69383m == 15) {
                dVar.a(this.f69384n, 24);
            }
            t(this.f69375e, dVar);
            if (this.f69375e == 22) {
                dVar.a(this.f69385o, 4);
            }
        }
        switch (this.f69375e) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                u(dVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
            case 28:
                throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
            case 30:
                dVar.a(this.f69386p, 1);
                throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
            case 36:
                dVar.a(this.f69387q, 5);
                throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
            case 39:
                throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i13 = this.f69375e;
        if (i13 != 17 && i13 != 39) {
            switch (i13) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    dVar.a(this.f69388r, 2);
                    i11 = this.f69388r;
                    if (i11 != 2) {
                        break;
                    }
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
        }
        dVar.a(this.f69388r, 2);
        i11 = this.f69388r;
        if (i11 != 2 || i11 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (i11 == 3) {
            dVar.a(this.f69389s, 1);
            if (this.f69389s == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        int i14 = this.f69392v;
        if (i14 >= 0) {
            dVar.a(i14, 11);
            if (this.f69392v == 695) {
                t(this.f69380j, dVar);
                if (this.f69380j == 5) {
                    dVar.b(this.f69381k);
                    if (this.f69381k) {
                        dVar.a(this.f69383m, 4);
                        if (this.f69383m == 15) {
                            dVar.a(this.f69384n, 24);
                        }
                        int i15 = this.f69391u;
                        if (i15 >= 0) {
                            dVar.a(i15, 11);
                            if (this.f69390t == 1352) {
                                dVar.b(this.f69382l);
                            }
                        }
                    }
                }
                if (this.f69380j == 22) {
                    dVar.b(this.f69381k);
                    if (this.f69381k) {
                        dVar.a(this.f69383m, 4);
                        if (this.f69383m == 15) {
                            dVar.a(this.f69384n, 24);
                        }
                    }
                    dVar.a(this.f69385o, 4);
                }
            }
        }
        return (ByteBuffer) byteBufferWrap.rewind();
    }

    public void q(int i11) {
        this.f69379i = i11;
    }

    public void r(int i11) {
        this.f69376f = i11;
    }

    public void s(int i11) {
        this.f69377g = i11;
    }

    @Override // gr0.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(mr0.c.a(this.X));
        sb2.append(", audioObjectType=");
        sb2.append(this.f69375e);
        sb2.append(" (");
        sb2.append(f69373a0.get(Integer.valueOf(this.f69375e)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.f69377g);
        sb2.append(" (");
        sb2.append(Z.get(Integer.valueOf(this.f69377g)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.f69378h);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f69379i);
        if (this.f69380j > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f69380j);
            sb2.append(" (");
            sb2.append(f69373a0.get(Integer.valueOf(this.f69380j)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.f69381k);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f69382l);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f69383m);
            sb2.append(" (");
            sb2.append(Z.get(Integer.valueOf(this.f69383m)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.f69384n);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f69385o);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f69390t);
        if (this.H) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f69393w);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f69394x);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f69395y);
            sb2.append(", extensionFlag=");
            sb2.append(this.f69396z);
            sb2.append(", layerNr=");
            sb2.append(this.A);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.B);
            sb2.append(", layer_length=");
            sb2.append(this.C);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.D);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.E);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.F);
            sb2.append(", extensionFlag3=");
            sb2.append(this.G);
        }
        if (this.W) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.I);
            sb2.append(", paraMode=");
            sb2.append(this.J);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.K);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.L);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.M);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.N);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.O);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.P);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.Q);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.R);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.S);
            sb2.append(", hilnContMode=");
            sb2.append(this.T);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.U);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.V);
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}
