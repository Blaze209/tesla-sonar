package o9;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.common.collect.x;
import com.plaid.internal.EnumC4419g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.spongycastle.math.ec.Tnaf;
import p7.g0;
import p7.h;
import p7.i;
import p7.n;
import s7.c0;
import s7.q0;
import s7.t;
import t9.q;
import w8.i0;
import w8.j0;
import w8.o0;
import w8.p;
import w8.p0;
import w8.r;
import w8.u;

/* JADX INFO: loaded from: classes3.dex */
public class e implements p {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @Deprecated
    public static final u f96896f0 = new u() { // from class: o9.d
        @Override // w8.u
        public final p[] d() {
            return e.b();
        }
    };

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f96897g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final byte[] f96898h0 = q0.E0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final byte[] f96899i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final byte[] f96900j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final UUID f96901k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Map<String, Integer> f96902l0;
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private s7.u F;
    private s7.u G;
    private boolean H;
    private boolean I;
    private int J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private long U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o9.c f96903a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f96904a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f96905b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f96906b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f96907c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private byte f96908c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f96909d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f96910d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f96911e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private r f96912e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q.a f96913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f96914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f96915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c0 f96916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c0 f96917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c0 f96918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c0 f96919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c0 f96920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c0 f96921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c0 f96922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c0 f96923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ByteBuffer f96924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f96925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f96926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f96927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f96928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f96929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f96930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f96931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f96932y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f96933z;

    private final class b implements o9.b {
        private b() {
        }

        @Override // o9.b
        public void a(int i11) throws ParserException {
            e.this.q(i11);
        }

        @Override // o9.b
        public void b(int i11, double d11) {
            e.this.t(i11, d11);
        }

        @Override // o9.b
        public void c(int i11, long j11) throws ParserException {
            e.this.z(i11, j11);
        }

        @Override // o9.b
        public void d(int i11, String str) throws ParserException {
            e.this.I(i11, str);
        }

        @Override // o9.b
        public void e(int i11, long j11, long j12) throws ParserException {
            e.this.H(i11, j11, j12);
        }

        @Override // o9.b
        public int f(int i11) {
            return e.this.w(i11);
        }

        @Override // o9.b
        public boolean g(int i11) {
            return e.this.B(i11);
        }

        @Override // o9.b
        public void h(int i11, int i12, w8.q qVar) throws ParserException {
            e.this.n(i11, i12, qVar);
        }
    }

    protected static final class c {
        public byte[] P;
        public p0 V;
        public boolean W;
        public o0 Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f96935a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f96936a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f96937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f96938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f96939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f96940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f96941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f96942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f96943h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f96944i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f96945j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public o0.a f96946k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f96947l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public n f96948m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f96949n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f96950o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f96951p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f96952q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f96953r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f96954s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f96955t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f96956u = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f96957v = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f96958w = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f96959x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f96960y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f96961z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = 200;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
        public long T = 0;
        public long U = 0;
        public boolean X = true;
        private String Y = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void f() {
            s7.a.f(this.Z);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f96947l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f || this.O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.N + 0.5f));
            byteBufferOrder.putShort((short) (this.O + 0.5f));
            byteBufferOrder.putShort((short) this.D);
            byteBufferOrder.putShort((short) this.E);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(c0 c0Var) throws ParserException {
            try {
                c0Var.c0(16);
                long jC = c0Var.C();
                if (jC == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jC == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jC != 826496599) {
                    t.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrF = c0Var.f();
                for (int iG = c0Var.g() + 20; iG < bArrF.length - 4; iG++) {
                    if (bArrF[iG] == 0 && bArrF[iG + 1] == 0 && bArrF[iG + 2] == 1 && bArrF[iG + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrF, iG, bArrF.length)));
                    }
                }
                throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(c0 c0Var) throws ParserException {
            try {
                int iE = c0Var.E();
                if (iE == 1) {
                    return true;
                }
                if (iE == 65534) {
                    c0Var.b0(24);
                    if (c0Var.F() == e.f96901k0.getMostSignificantBits() && c0Var.F() == e.f96901k0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws ParserException {
            int i11;
            int i12;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i13 = 0;
                int i14 = 1;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i13 += 255;
                    i14++;
                }
                int i15 = i14 + 1;
                int i16 = i13 + (i11 & 255);
                int i17 = 0;
                while (true) {
                    i12 = bArr[i15];
                    if ((i12 & 255) != 255) {
                        break;
                    }
                    i17 += 255;
                    i15++;
                }
                int i18 = i15 + 1;
                int i19 = i17 + (i12 & 255);
                if (bArr[i18] != 1) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i16];
                System.arraycopy(bArr, i18, bArr2, 0, i16);
                int i21 = i18 + i16;
                if (bArr[i21] != 3) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i22 = i21 + i19;
                if (bArr[i22] != 5) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i22];
                System.arraycopy(bArr, i22, bArr3, 0, bArr.length - i22);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z11) {
            if ("A_OPUS".equals(this.f96938c)) {
                return z11;
            }
            return this.f96942g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:225:0x0458  */
        /* JADX WARN: Code duplicated, block: B:230:0x0471  */
        /* JADX WARN: Code duplicated, block: B:231:0x0473  */
        /* JADX WARN: Code duplicated, block: B:234:0x0480  */
        /* JADX WARN: Code duplicated, block: B:235:0x0492  */
        /* JADX WARN: Code duplicated, block: B:237:0x0498  */
        /* JADX WARN: Code duplicated, block: B:239:0x049c  */
        /* JADX WARN: Code duplicated, block: B:241:0x04a1  */
        /* JADX WARN: Code duplicated, block: B:244:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:246:0x04ae  */
        /* JADX WARN: Code duplicated, block: B:249:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:252:0x04c1  */
        /* JADX WARN: Code duplicated, block: B:255:0x04c7  */
        /* JADX WARN: Code duplicated, block: B:258:0x04fa  */
        /* JADX WARN: Code duplicated, block: B:263:0x051a  */
        /* JADX WARN: Code duplicated, block: B:269:0x0533  */
        /* JADX WARN: Code duplicated, block: B:270:0x0535  */
        /* JADX WARN: Code duplicated, block: B:272:0x053f  */
        /* JADX WARN: Code duplicated, block: B:273:0x0542  */
        /* JADX WARN: Code duplicated, block: B:275:0x054c  */
        /* JADX WARN: Code duplicated, block: B:281:0x0564  */
        /* JADX WARN: Code duplicated, block: B:283:0x058b  */
        /* JADX WARN: Code duplicated, block: B:285:0x0591  */
        /* JADX WARN: Code duplicated, block: B:301:0x05bc  */
        /* JADX WARN: Code duplicated, block: B:306:0x05d7  */
        /* JADX WARN: Code duplicated, block: B:307:0x05da  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        public void i(r rVar, int i11) throws ParserException {
            byte b11;
            List<byte[]> listSingletonList;
            String str;
            int i12;
            int i13;
            List<byte[]> list;
            String str2;
            String str3;
            int i14;
            p7.u.b bVar;
            int i15;
            int iIntValue;
            int i16;
            float f11;
            int i17;
            int i18;
            int i19;
            String str4;
            t7.a aVarA;
            String str5 = this.f96938c;
            str5.getClass();
            switch (str5) {
                case "V_MPEG4/ISO/AP":
                    b11 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b11 = 1;
                    break;
                case "A_MS/ACM":
                    b11 = 2;
                    break;
                case "A_TRUEHD":
                    b11 = 3;
                    break;
                case "A_VORBIS":
                    b11 = 4;
                    break;
                case "A_MPEG/L2":
                    b11 = 5;
                    break;
                case "A_MPEG/L3":
                    b11 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b11 = 7;
                    break;
                case "S_DVBSUB":
                    b11 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b11 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b11 = 10;
                    break;
                case "S_VOBSUB":
                    b11 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b11 = 12;
                    break;
                case "A_AAC":
                    b11 = 13;
                    break;
                case "A_AC3":
                    b11 = 14;
                    break;
                case "A_DTS":
                    b11 = 15;
                    break;
                case "V_AV1":
                    b11 = 16;
                    break;
                case "V_VP8":
                    b11 = 17;
                    break;
                case "V_VP9":
                    b11 = 18;
                    break;
                case "S_HDMV/PGS":
                    b11 = 19;
                    break;
                case "V_THEORA":
                    b11 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b11 = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b11 = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b11 = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b11 = 24;
                    break;
                case "S_TEXT/ASS":
                    b11 = 25;
                    break;
                case "S_TEXT/SSA":
                    b11 = 26;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b11 = 27;
                    break;
                case "S_TEXT/WEBVTT":
                    b11 = 28;
                    break;
                case "S_TEXT/UTF8":
                    b11 = 29;
                    break;
                case "V_MPEG2":
                    b11 = 30;
                    break;
                case "A_EAC3":
                    b11 = 31;
                    break;
                case "A_FLAC":
                    b11 = 32;
                    break;
                case "A_OPUS":
                    b11 = 33;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            String str6 = "audio/raw";
            switch (b11) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f96947l;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str6 = "video/mp4v-es";
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null && (aVarA = t7.a.a(new c0(this.P))) != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21 = i14 | (z11 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    } else if (g0.t(str3)) {
                        if (this.f96954s == 0) {
                            i18 = this.f96952q;
                            iIntValue = -1;
                            if (i18 == -1) {
                                i18 = this.f96949n;
                            }
                            this.f96952q = i18;
                            i19 = this.f96953r;
                            if (i19 == -1) {
                                i19 = this.f96950o;
                            }
                            this.f96953r = i19;
                        } else {
                            iIntValue = -1;
                        }
                        i16 = this.f96952q;
                        if (i16 != iIntValue || (i17 = this.f96953r) == iIntValue) {
                            f11 = -1.0f;
                        } else {
                            f11 = (this.f96950o * i16) / (this.f96949n * i17);
                        }
                        i iVarA = this.f96961z ? new i.b().d(this.A).c(this.C).e(this.B).f(h()).g(this.f96951p).b(this.f96951p).a() : null;
                        if (this.f96937b != null && e.f96902l0.containsKey(this.f96937b)) {
                            iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                        }
                        if (this.f96955t == 0 && Float.compare(this.f96956u, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.f96957v, BitmapDescriptorFactory.HUE_RED) == 0) {
                            if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f96958w, -180.0f) != 0 || Float.compare(this.f96958w, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f96958w, -90.0f) == 0) {
                                iIntValue = EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                            }
                        }
                        bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                        i15 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw ParserException.a("Unexpected MIME type.", null);
                        }
                        i15 = 3;
                    }
                    if (this.f96937b != null && !e.f96902l0.containsKey(this.f96937b)) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI0 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP = bVarI0.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i21).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB;
                    o0VarB.g(uVarP);
                    return;
                case 2:
                    if (l(new c0(g(this.f96938c)))) {
                        int iQ0 = q0.q0(this.R);
                        if (iQ0 == 0) {
                            t.i("MatroskaExtractor", "Unsupported PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i12 = iQ0;
                            listSingletonList = null;
                            str = null;
                            i13 = -1;
                        }
                        if (this.P != null) {
                            str = aVarA.f112694c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z12 = this.X;
                        if (this.W) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        int i22 = i14 | (z12 ? 1 : 0);
                        bVar = new p7.u.b();
                        if (g0.o(str3)) {
                            if (g0.t(str3)) {
                                if (this.f96954s == 0) {
                                    i18 = this.f96952q;
                                    iIntValue = -1;
                                    if (i18 == -1) {
                                        i18 = this.f96949n;
                                    }
                                    this.f96952q = i18;
                                    i19 = this.f96953r;
                                    if (i19 == -1) {
                                        i19 = this.f96950o;
                                    }
                                    this.f96953r = i19;
                                } else {
                                    iIntValue = -1;
                                }
                                i16 = this.f96952q;
                                if (i16 != iIntValue) {
                                    f11 = -1.0f;
                                } else {
                                    f11 = -1.0f;
                                }
                                if (this.f96961z) {
                                }
                                if (this.f96937b != null) {
                                    iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                                }
                                if (this.f96955t == 0) {
                                    if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                                i15 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i15 = 3;
                            }
                            break;
                        } else {
                            bVar.T(this.Q).z0(this.S).s0(i12);
                            i15 = 1;
                        }
                        if (this.f96937b != null) {
                            bVar.l0(this.f96937b);
                        }
                        p7.u.b bVarI1 = bVar.i0(i11);
                        if (this.f96935a) {
                            str4 = "video/webm";
                        } else {
                            str4 = "video/x-matroska";
                        }
                        p7.u uVarP2 = bVarI1.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i22).k0(listSingletonList).U(str).c0(this.f96948m).P();
                        o0 o0VarB2 = rVar.b(this.f96939d, i15);
                        this.Z = o0VarB2;
                        o0VarB2.g(uVarP2);
                        return;
                    }
                    t.i("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str6 = "audio/x-unknown";
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z13 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i23 = i14 | (z13 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI2 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP3 = bVarI2.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i23).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB3 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB3;
                    o0VarB3.g(uVarP3);
                    return;
                case 3:
                    this.V = new p0();
                    str6 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z14 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i24 = i14 | (z14 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI3 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP4 = bVarI3.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i24).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB4 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB4;
                    o0VarB4.g(uVarP4);
                    return;
                case 4:
                    listSingletonList = m(g(this.f96938c));
                    str6 = "audio/vorbis";
                    i13 = 8192;
                    str = null;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z15 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i25 = i14 | (z15 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI4 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP5 = bVarI4.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i25).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB5 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB5;
                    o0VarB5.g(uVarP5);
                    return;
                case 5:
                    str6 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i13 = 4096;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z16 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i26 = i14 | (z16 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI5 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP6 = bVarI5.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i26).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB6 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB6;
                    o0VarB6.g(uVarP6);
                    return;
                case 6:
                    str6 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i13 = 4096;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z17 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i27 = i14 | (z17 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI6 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP7 = bVarI6.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i27).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB7 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB7;
                    o0VarB7.g(uVarP7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairK = k(new c0(g(this.f96938c)));
                    str6 = (String) pairK.first;
                    listSingletonList = (List) pairK.second;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z18 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i28 = i14 | (z18 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI7 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP8 = bVarI7.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i28).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB8 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB8;
                    o0VarB8.g(uVarP8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f96938c), 0, bArr2, 0, 4);
                    listSingletonList = x.s(bArr2);
                    str = null;
                    str6 = "application/dvbsubs";
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z19 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i29 = i14 | (z19 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI8 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP9 = bVarI8.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i29).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB9 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB9;
                    o0VarB9.g(uVarP9);
                    return;
                case 10:
                    w8.d dVarB = w8.d.b(new c0(g(this.f96938c)));
                    list = dVarB.f121256a;
                    this.f96936a0 = dVarB.f121257b;
                    str2 = dVarB.f121267l;
                    str6 = "video/avc";
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z110 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i210 = i14 | (z110 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI9 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP10 = bVarI9.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i210).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB10 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB10;
                    o0VarB10.g(uVarP10);
                    return;
                case 11:
                    listSingletonList = x.s(g(this.f96938c));
                    str = null;
                    str6 = "application/vobsub";
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z111 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211 = i14 | (z111 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI10 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP11 = bVarI10.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i211).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB11 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB11;
                    o0VarB11.g(uVarP11);
                    return;
                case 12:
                    str6 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z112 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i212 = i14 | (z112 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI11 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP12 = bVarI11.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i212).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB12 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB12;
                    o0VarB12.g(uVarP12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(g(this.f96938c));
                    w8.a.b bVarF = w8.a.f(this.f96947l);
                    this.S = bVarF.f121206a;
                    this.Q = bVarF.f121207b;
                    str = bVarF.f121208c;
                    str6 = "audio/mp4a-latm";
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z113 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i213 = i14 | (z113 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI12 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP13 = bVarI12.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i213).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB13 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB13;
                    o0VarB13.g(uVarP13);
                    return;
                case 14:
                    str6 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z114 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i214 = i14 | (z114 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI13 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP14 = bVarI13.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i214).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB14 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB14;
                    o0VarB14.g(uVarP14);
                    return;
                case 15:
                case 21:
                    str6 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z115 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i215 = i14 | (z115 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI14 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP15 = bVarI14.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i215).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB15 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB15;
                    o0VarB15.g(uVarP15);
                    return;
                case 16:
                    byte[] bArr3 = this.f96947l;
                    listSingletonList = bArr3 == null ? null : x.s(bArr3);
                    str6 = "video/av01";
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z116 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i216 = i14 | (z116 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI15 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP16 = bVarI15.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i216).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB16 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB16;
                    o0VarB16.g(uVarP16);
                    return;
                case 17:
                    str6 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z117 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i217 = i14 | (z117 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI16 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP17 = bVarI16.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i217).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB17 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB17;
                    o0VarB17.g(uVarP17);
                    return;
                case 18:
                    byte[] bArr4 = this.f96947l;
                    listSingletonList = bArr4 == null ? null : x.s(bArr4);
                    str6 = "video/x-vnd.on2.vp9";
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z118 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i218 = i14 | (z118 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI17 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP18 = bVarI17.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i218).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB18 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB18;
                    o0VarB18.g(uVarP18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str6 = "application/pgs";
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z119 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i219 = i14 | (z119 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI18 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP19 = bVarI18.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i219).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB19 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB19;
                    o0VarB19.g(uVarP19);
                    return;
                case 20:
                    str6 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1110 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2110 = i14 | (z1110 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI19 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP110 = bVarI19.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2110).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB110 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB110;
                    o0VarB110.g(uVarP110);
                    return;
                case 22:
                    if (this.R == 32) {
                        listSingletonList = null;
                        str = null;
                        i13 = -1;
                        i12 = 4;
                    } else {
                        t.i("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str6 = "audio/x-unknown";
                        i13 = -1;
                        i12 = -1;
                    }
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1111 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111 = i14 | (z1111 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI110 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP111 = bVarI110.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2111).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB111 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB111;
                    o0VarB111.g(uVarP111);
                    return;
                case 23:
                    int i31 = this.R;
                    if (i31 == 8) {
                        listSingletonList = null;
                        str = null;
                        i12 = 3;
                    } else {
                        if (i31 == 16) {
                            i12 = 268435456;
                        } else if (i31 == 24) {
                            i12 = 1342177280;
                        } else {
                            if (i31 != 32) {
                                t.i("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                                listSingletonList = null;
                                str = null;
                                str6 = "audio/x-unknown";
                                i13 = -1;
                                i12 = -1;
                                if (this.P != null) {
                                    str = aVarA.f112694c;
                                    str6 = "video/dolby-vision";
                                }
                                str3 = str6;
                                boolean z1112 = this.X;
                                if (this.W) {
                                    i14 = 2;
                                } else {
                                    i14 = 0;
                                }
                                int i2112 = i14 | (z1112 ? 1 : 0);
                                bVar = new p7.u.b();
                                if (g0.o(str3)) {
                                    if (g0.t(str3)) {
                                        if (this.f96954s == 0) {
                                            i18 = this.f96952q;
                                            iIntValue = -1;
                                            if (i18 == -1) {
                                                i18 = this.f96949n;
                                            }
                                            this.f96952q = i18;
                                            i19 = this.f96953r;
                                            if (i19 == -1) {
                                                i19 = this.f96950o;
                                            }
                                            this.f96953r = i19;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        i16 = this.f96952q;
                                        if (i16 != iIntValue) {
                                            f11 = -1.0f;
                                        } else {
                                            f11 = -1.0f;
                                        }
                                        if (this.f96961z) {
                                        }
                                        if (this.f96937b != null) {
                                            iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                                        }
                                        if (this.f96955t == 0) {
                                            if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                                        i15 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i15 = 3;
                                    }
                                    break;
                                } else {
                                    bVar.T(this.Q).z0(this.S).s0(i12);
                                    i15 = 1;
                                }
                                if (this.f96937b != null) {
                                    bVar.l0(this.f96937b);
                                }
                                p7.u.b bVarI111 = bVar.i0(i11);
                                if (this.f96935a) {
                                    str4 = "video/webm";
                                } else {
                                    str4 = "video/x-matroska";
                                }
                                p7.u uVarP112 = bVarI111.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2112).k0(listSingletonList).U(str).c0(this.f96948m).P();
                                o0 o0VarB112 = rVar.b(this.f96939d, i15);
                                this.Z = o0VarB112;
                                o0VarB112.g(uVarP112);
                                return;
                            }
                            i12 = 1610612736;
                        }
                        listSingletonList = null;
                        str = null;
                    }
                    i13 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1113 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2113 = i14 | (z1113 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI112 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP113 = bVarI112.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2113).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB113 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB113;
                    o0VarB113.g(uVarP113);
                    return;
                case 24:
                    int iQ1 = q0.q0(this.R);
                    if (iQ1 != 0) {
                        i12 = iQ1;
                        listSingletonList = null;
                        str = null;
                        i13 = -1;
                        if (this.P != null) {
                            str = aVarA.f112694c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z1114 = this.X;
                        if (this.W) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        int i2114 = i14 | (z1114 ? 1 : 0);
                        bVar = new p7.u.b();
                        if (g0.o(str3)) {
                            if (g0.t(str3)) {
                                if (this.f96954s == 0) {
                                    i18 = this.f96952q;
                                    iIntValue = -1;
                                    if (i18 == -1) {
                                        i18 = this.f96949n;
                                    }
                                    this.f96952q = i18;
                                    i19 = this.f96953r;
                                    if (i19 == -1) {
                                        i19 = this.f96950o;
                                    }
                                    this.f96953r = i19;
                                } else {
                                    iIntValue = -1;
                                }
                                i16 = this.f96952q;
                                if (i16 != iIntValue) {
                                    f11 = -1.0f;
                                } else {
                                    f11 = -1.0f;
                                }
                                if (this.f96961z) {
                                }
                                if (this.f96937b != null) {
                                    iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                                }
                                if (this.f96955t == 0) {
                                    if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                                i15 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i15 = 3;
                            }
                            break;
                        } else {
                            bVar.T(this.Q).z0(this.S).s0(i12);
                            i15 = 1;
                        }
                        if (this.f96937b != null) {
                            bVar.l0(this.f96937b);
                        }
                        p7.u.b bVarI113 = bVar.i0(i11);
                        if (this.f96935a) {
                            str4 = "video/webm";
                        } else {
                            str4 = "video/x-matroska";
                        }
                        p7.u uVarP114 = bVarI113.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2114).k0(listSingletonList).U(str).c0(this.f96948m).P();
                        o0 o0VarB114 = rVar.b(this.f96939d, i15);
                        this.Z = o0VarB114;
                        o0VarB114.g(uVarP114);
                        return;
                    }
                    t.i("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str6 = "audio/x-unknown";
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1115 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2115 = i14 | (z1115 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI114 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP115 = bVarI114.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2115).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB115 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB115;
                    o0VarB115.g(uVarP115);
                    return;
                case 25:
                case 26:
                    listSingletonList = x.t(e.f96898h0, g(this.f96938c));
                    str6 = "text/x-ssa";
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1116 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2116 = i14 | (z1116 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI115 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP116 = bVarI115.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2116).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB116 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB116;
                    o0VarB116.g(uVarP116);
                    return;
                case 27:
                    w8.c0 c0VarA = w8.c0.a(new c0(g(this.f96938c)));
                    list = c0VarA.f121239a;
                    this.f96936a0 = c0VarA.f121240b;
                    str2 = c0VarA.f121254p;
                    str6 = "video/hevc";
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1117 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2117 = i14 | (z1117 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI116 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP117 = bVarI116.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2117).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB117 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB117;
                    o0VarB117.g(uVarP117);
                    return;
                case 28:
                    str6 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1118 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2118 = i14 | (z1118 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI117 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP118 = bVarI117.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2118).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB118 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB118;
                    o0VarB118.g(uVarP118);
                    return;
                case 29:
                    str6 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1119 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2119 = i14 | (z1119 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI118 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP119 = bVarI118.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i2119).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB119 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB119;
                    o0VarB119.g(uVarP119);
                    return;
                case 30:
                    str6 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11110 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21110 = i14 | (z11110 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI119 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP1110 = bVarI119.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i21110).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB1110 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB1110;
                    o0VarB1110.g(uVarP1110);
                    return;
                case 31:
                    str6 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11111 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21111 = i14 | (z11111 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI1110 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP1111 = bVarI1110.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i21111).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB1111 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB1111;
                    o0VarB1111.g(uVarP1111);
                    return;
                case 32:
                    listSingletonList = Collections.singletonList(g(this.f96938c));
                    str6 = "audio/flac";
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11112 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21112 = i14 | (z11112 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI1111 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP1112 = bVarI1111.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i21112).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB1112 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB1112;
                    o0VarB1112.g(uVarP1112);
                    return;
                case 33:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(g(this.f96938c));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.T).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.U).array());
                    str6 = "audio/opus";
                    i13 = 5760;
                    str = null;
                    i12 = -1;
                    if (this.P != null) {
                        str = aVarA.f112694c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11113 = this.X;
                    if (this.W) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21113 = i14 | (z11113 ? 1 : 0);
                    bVar = new p7.u.b();
                    if (g0.o(str3)) {
                        if (g0.t(str3)) {
                            if (this.f96954s == 0) {
                                i18 = this.f96952q;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f96949n;
                                }
                                this.f96952q = i18;
                                i19 = this.f96953r;
                                if (i19 == -1) {
                                    i19 = this.f96950o;
                                }
                                this.f96953r = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f96952q;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f96961z) {
                            }
                            if (this.f96937b != null) {
                                iIntValue = ((Integer) e.f96902l0.get(this.f96937b)).intValue();
                            }
                            if (this.f96955t == 0) {
                                if (Float.compare(this.f96958w, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f96958w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f96958w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f96949n).h0(this.f96950o).u0(f11).x0(iIntValue).v0(this.f96959x).B0(this.f96960y).V(iVarA);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.Q).z0(this.S).s0(i12);
                        i15 = 1;
                    }
                    if (this.f96937b != null) {
                        bVar.l0(this.f96937b);
                    }
                    p7.u.b bVarI1112 = bVar.i0(i11);
                    if (this.f96935a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    p7.u uVarP1113 = bVarI1112.W(str4).y0(str3).o0(i13).n0(this.Y).A0(i21113).k0(listSingletonList).U(str).c0(this.f96948m).P();
                    o0 o0VarB1113 = rVar.b(this.f96939d, i15);
                    this.Z = o0VarB1113;
                    o0VarB1113.g(uVarP1113);
                    return;
                default:
                    throw ParserException.a("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({"output"})
        public void j() {
            p0 p0Var = this.V;
            if (p0Var != null) {
                p0Var.a(this.Z, this.f96946k);
            }
        }

        public void n() {
            p0 p0Var = this.V;
            if (p0Var != null) {
                p0Var.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", Integer.valueOf(EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE));
        f96902l0 = Collections.unmodifiableMap(map);
    }

    public e(q.a aVar, int i11) {
        this(new o9.a(), i11, aVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean A(String str) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b11 = 0;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b11 = 1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b11 = 2;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b11 = 3;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b11 = 4;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b11 = 5;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b11 = 6;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b11 = 7;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b11 = 8;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b11 = 9;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b11 = 10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b11 = 11;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b11 = 12;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b11 = 13;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b11 = 14;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b11 = 15;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b11 = 17;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b11 = 18;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b11 = 19;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b11 = 20;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b11 = 21;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b11 = 22;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b11 = 23;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b11 = 24;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b11 = 25;
                }
                break;
            case 738614379:
                if (str.equals("S_TEXT/SSA")) {
                    b11 = 26;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b11 = 27;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b11 = 28;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b11 = 29;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b11 = 30;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b11 = 31;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b11 = 32;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b11 = 33;
                }
                break;
        }
        switch (b11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                return true;
            default:
                return false;
        }
    }

    private boolean C(i0 i0Var, long j11) {
        if (this.B) {
            this.D = j11;
            i0Var.f121323a = this.C;
            this.B = false;
            return true;
        }
        if (this.f96932y) {
            long j12 = this.D;
            if (j12 != -1) {
                i0Var.f121323a = j12;
                this.D = -1L;
                return true;
            }
        }
        return false;
    }

    private void D(w8.q qVar, int i11) {
        if (this.f96916i.j() >= i11) {
            return;
        }
        if (this.f96916i.b() < i11) {
            c0 c0Var = this.f96916i;
            c0Var.d(Math.max(c0Var.b() * 2, i11));
        }
        qVar.readFully(this.f96916i.f(), this.f96916i.j(), i11 - this.f96916i.j());
        this.f96916i.a0(i11);
    }

    private void E() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f96904a0 = false;
        this.f96906b0 = 0;
        this.f96908c0 = (byte) 0;
        this.f96910d0 = false;
        this.f96919l.X(0);
    }

    private long F(long j11) throws ParserException {
        long j12 = this.f96927t;
        if (j12 != -9223372036854775807L) {
            return q0.s1(j11, j12, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void G(String str, long j11, byte[] bArr) {
        byte[] bArrU;
        int i11;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                bArrU = u(j11, "%01d:%02d:%02d:%02d", 10000L);
                i11 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrU = u(j11, "%02d:%02d:%02d.%03d", 1000L);
                i11 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrU = u(j11, "%02d:%02d:%02d,%03d", 1000L);
                i11 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrU, 0, bArr, i11, bArrU.length);
    }

    @RequiresNonNull({"#2.output"})
    private int J(w8.q qVar, c cVar, int i11, boolean z11) throws ParserException {
        int i12;
        if ("S_TEXT/UTF8".equals(cVar.f96938c)) {
            K(qVar, f96897g0, i11);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f96938c) || "S_TEXT/SSA".equals(cVar.f96938c)) {
            K(qVar, f96899i0, i11);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f96938c)) {
            K(qVar, f96900j0, i11);
            return s();
        }
        o0 o0Var = cVar.Z;
        if (!this.Y) {
            if (cVar.f96944i) {
                this.R &= -1073741825;
                if (!this.Z) {
                    qVar.readFully(this.f96916i.f(), 0, 1);
                    this.V++;
                    if ((this.f96916i.f()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f96908c0 = this.f96916i.f()[0];
                    this.Z = true;
                }
                byte b11 = this.f96908c0;
                if ((b11 & 1) == 1) {
                    boolean z12 = (b11 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f96910d0) {
                        qVar.readFully(this.f96921n.f(), 0, 8);
                        this.V += 8;
                        this.f96910d0 = true;
                        this.f96916i.f()[0] = (byte) ((z12 ? 128 : 0) | 8);
                        this.f96916i.b0(0);
                        o0Var.a(this.f96916i, 1, 1);
                        this.W++;
                        this.f96921n.b0(0);
                        o0Var.a(this.f96921n, 8, 1);
                        this.W += 8;
                    }
                    if (z12) {
                        if (!this.f96904a0) {
                            qVar.readFully(this.f96916i.f(), 0, 1);
                            this.V++;
                            this.f96916i.b0(0);
                            this.f96906b0 = this.f96916i.M();
                            this.f96904a0 = true;
                        }
                        int i13 = this.f96906b0 * 4;
                        this.f96916i.X(i13);
                        qVar.readFully(this.f96916i.f(), 0, i13);
                        this.V += i13;
                        short s11 = (short) ((this.f96906b0 / 2) + 1);
                        int i14 = (s11 * 6) + 2;
                        ByteBuffer byteBuffer = this.f96924q;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f96924q = ByteBuffer.allocate(i14);
                        }
                        this.f96924q.position(0);
                        this.f96924q.putShort(s11);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i12 = this.f96906b0;
                            if (i15 >= i12) {
                                break;
                            }
                            int iQ = this.f96916i.Q();
                            if (i15 % 2 == 0) {
                                this.f96924q.putShort((short) (iQ - i16));
                            } else {
                                this.f96924q.putInt(iQ - i16);
                            }
                            i15++;
                            i16 = iQ;
                        }
                        int i17 = (i11 - this.V) - i16;
                        if (i12 % 2 == 1) {
                            this.f96924q.putInt(i17);
                        } else {
                            this.f96924q.putShort((short) i17);
                            this.f96924q.putInt(0);
                        }
                        this.f96922o.Z(this.f96924q.array(), i14);
                        o0Var.a(this.f96922o, i14, 1);
                        this.W += i14;
                    }
                }
            } else {
                byte[] bArr = cVar.f96945j;
                if (bArr != null) {
                    this.f96919l.Z(bArr, bArr.length);
                }
            }
            if (cVar.o(z11)) {
                this.R |= 268435456;
                this.f96923p.X(0);
                int iJ = (this.f96919l.j() + i11) - this.V;
                this.f96916i.X(4);
                this.f96916i.f()[0] = (byte) ((iJ >> 24) & 255);
                this.f96916i.f()[1] = (byte) ((iJ >> 16) & 255);
                this.f96916i.f()[2] = (byte) ((iJ >> 8) & 255);
                this.f96916i.f()[3] = (byte) (iJ & 255);
                o0Var.a(this.f96916i, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int iJ2 = i11 + this.f96919l.j();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f96938c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f96938c)) {
            if (cVar.V != null) {
                s7.a.h(this.f96919l.j() == 0);
                cVar.V.d(qVar);
            }
            while (true) {
                int i18 = this.V;
                if (i18 >= iJ2) {
                    break;
                }
                int iL = L(qVar, o0Var, iJ2 - i18);
                this.V += iL;
                this.W += iL;
            }
        } else {
            byte[] bArrF = this.f96915h.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i19 = cVar.f96936a0;
            int i21 = 4 - i19;
            while (this.V < iJ2) {
                int i22 = this.X;
                if (i22 == 0) {
                    M(qVar, bArrF, i21, i19);
                    this.V += i19;
                    this.f96915h.b0(0);
                    this.X = this.f96915h.Q();
                    this.f96914g.b0(0);
                    o0Var.f(this.f96914g, 4);
                    this.W += 4;
                } else {
                    int iL2 = L(qVar, o0Var, i22);
                    this.V += iL2;
                    this.W += iL2;
                    this.X -= iL2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f96938c)) {
            this.f96917j.b0(0);
            o0Var.f(this.f96917j, 4);
            this.W += 4;
        }
        return s();
    }

    private void K(w8.q qVar, byte[] bArr, int i11) {
        int length = bArr.length + i11;
        if (this.f96920m.b() < length) {
            this.f96920m.Y(Arrays.copyOf(bArr, length + i11));
        } else {
            System.arraycopy(bArr, 0, this.f96920m.f(), 0, bArr.length);
        }
        qVar.readFully(this.f96920m.f(), bArr.length, i11);
        this.f96920m.b0(0);
        this.f96920m.a0(length);
    }

    private int L(w8.q qVar, o0 o0Var, int i11) {
        int iA = this.f96919l.a();
        if (iA <= 0) {
            return o0Var.e(qVar, i11, false);
        }
        int iMin = Math.min(i11, iA);
        o0Var.f(this.f96919l, iMin);
        return iMin;
    }

    private void M(w8.q qVar, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, this.f96919l.a());
        qVar.readFully(bArr, i11 + iMin, i12 - iMin);
        if (iMin > 0) {
            this.f96919l.q(bArr, i11, iMin);
        }
    }

    public static /* synthetic */ p[] b() {
        return new p[]{new e(q.a.f112982a, 2)};
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void g(int i11) throws ParserException {
        if (this.F == null || this.G == null) {
            throw ParserException.a("Element " + i11 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void k(int i11) throws ParserException {
        if (this.f96931x != null) {
            return;
        }
        throw ParserException.a("Element " + i11 + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void m() {
        s7.a.j(this.f96912e0);
    }

    private j0 o(s7.u uVar, s7.u uVar2) {
        int i11;
        if (this.f96926s == -1 || this.f96929v == -9223372036854775807L || uVar == null || uVar.d() == 0 || uVar2 == null || uVar2.d() != uVar.d()) {
            return new j0.b(this.f96929v);
        }
        int iD = uVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            jArrCopyOf3[i13] = uVar.c(i13);
            jArrCopyOf[i13] = this.f96926s + uVar2.c(i13);
        }
        while (true) {
            i11 = iD - 1;
            if (i12 >= i11) {
                break;
            }
            int i14 = i12 + 1;
            iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
            jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
            i12 = i14;
        }
        int i15 = i11;
        while (i15 > 0 && jArrCopyOf3[i15] > this.f96929v) {
            i15--;
        }
        iArrCopyOf[i15] = (int) ((this.f96926s + this.f96925r) - jArrCopyOf[i15]);
        jArrCopyOf2[i15] = this.f96929v - jArrCopyOf3[i15];
        if (i15 < i11) {
            t.i("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i16 = i15 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
        }
        return new w8.g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @RequiresNonNull({"#1.output"})
    private void p(c cVar, long j11, int i11, int i12, int i13) {
        int iJ;
        p0 p0Var = cVar.V;
        if (p0Var != null) {
            p0Var.c(cVar.Z, j11, i11, i12, i13, cVar.f96946k);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f96938c) || "S_TEXT/ASS".equals(cVar.f96938c) || "S_TEXT/SSA".equals(cVar.f96938c) || "S_TEXT/WEBVTT".equals(cVar.f96938c)) {
                if (this.N > 1) {
                    t.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.L;
                    if (j12 == -9223372036854775807L) {
                        t.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        G(cVar.f96938c, j12, this.f96920m.f());
                        for (int iG = this.f96920m.g(); iG < this.f96920m.j(); iG++) {
                            if (this.f96920m.f()[iG] == 0) {
                                this.f96920m.a0(iG);
                                break;
                            }
                        }
                        o0 o0Var = cVar.Z;
                        c0 c0Var = this.f96920m;
                        o0Var.f(c0Var, c0Var.j());
                        iJ = i12 + this.f96920m.j();
                    }
                }
                iJ = i12;
            } else {
                iJ = i12;
            }
            if ((i11 & 268435456) != 0) {
                if (this.N > 1) {
                    this.f96923p.X(0);
                } else {
                    int iJ2 = this.f96923p.j();
                    cVar.Z.a(this.f96923p, iJ2, 2);
                    iJ += iJ2;
                }
            }
            cVar.Z.b(j11, i11, iJ, i13, cVar.f96946k);
        }
        this.I = true;
    }

    private static int[] r(int[] iArr, int i11) {
        if (iArr == null) {
            return new int[i11];
        }
        return iArr.length >= i11 ? iArr : new int[Math.max(iArr.length * 2, i11)];
    }

    private int s() {
        int i11 = this.W;
        E();
        return i11;
    }

    private static byte[] u(long j11, String str, long j12) {
        s7.a.a(j11 != -9223372036854775807L);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - (((long) i11) * 3600000000L);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - (((long) i12) * 60000000);
        int i13 = (int) (j14 / 1000000);
        return q0.E0(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (((long) i13) * 1000000)) / j12))));
    }

    protected boolean B(int i11) {
        return i11 == 357149030 || i11 == 524531317 || i11 == 475249515 || i11 == 374648427;
    }

    protected void H(int i11, long j11, long j12) throws ParserException {
        m();
        if (i11 == 160) {
            this.T = false;
            this.U = 0L;
            return;
        }
        if (i11 == 174) {
            c cVar = new c();
            this.f96931x = cVar;
            cVar.f96935a = this.f96930w;
            return;
        }
        if (i11 == 187) {
            this.H = false;
            return;
        }
        if (i11 == 19899) {
            this.f96933z = -1;
            this.A = -1L;
            return;
        }
        if (i11 == 20533) {
            v(i11).f96944i = true;
            return;
        }
        if (i11 == 21968) {
            v(i11).f96961z = true;
            return;
        }
        if (i11 == 408125543) {
            long j13 = this.f96926s;
            if (j13 != -1 && j13 != j11) {
                throw ParserException.a("Multiple Segment elements not supported", null);
            }
            this.f96926s = j11;
            this.f96925r = j12;
            return;
        }
        if (i11 == 475249515) {
            this.F = new s7.u();
            this.G = new s7.u();
        } else if (i11 == 524531317 && !this.f96932y) {
            if (this.f96909d && this.C != -1) {
                this.B = true;
            } else {
                this.f96912e0.t(new j0.b(this.f96929v));
                this.f96932y = true;
            }
        }
    }

    protected void I(int i11, String str) throws ParserException {
        if (i11 == 134) {
            v(i11).f96938c = str;
            return;
        }
        if (i11 != 17026) {
            if (i11 == 21358) {
                v(i11).f96937b = str;
                return;
            } else {
                if (i11 != 2274716) {
                    return;
                }
                v(i11).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f96930w = Objects.equals(str, "webm");
            return;
        }
        throw ParserException.a("DocType " + str + " not supported", null);
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.E = -9223372036854775807L;
        this.J = 0;
        this.f96903a.reset();
        this.f96905b.e();
        E();
        for (int i11 = 0; i11 < this.f96907c.size(); i11++) {
            this.f96907c.valueAt(i11).n();
        }
    }

    @Override // w8.p
    public final void e(r rVar) {
        if (this.f96911e) {
            rVar = new t9.r(rVar, this.f96913f);
        }
        this.f96912e0 = rVar;
    }

    @Override // w8.p
    public final int h(w8.q qVar, i0 i0Var) {
        this.I = false;
        boolean zA = true;
        while (zA && !this.I) {
            zA = this.f96903a.a(qVar);
            if (zA && C(i0Var, qVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f96907c.size(); i11++) {
            c cVarValueAt = this.f96907c.valueAt(i11);
            cVarValueAt.f();
            cVarValueAt.j();
        }
        return -1;
    }

    @Override // w8.p
    public final boolean l(w8.q qVar) {
        return new f().b(qVar);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    protected void n(int i11, int i12, w8.q qVar) throws ParserException {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j11;
        int i18;
        int i19;
        int i21;
        int i22;
        w8.q qVar2 = qVar;
        int i23 = 0;
        int i24 = 1;
        if (i11 != 161 && i11 != 163) {
            if (i11 == 165) {
                if (this.J != 2) {
                    return;
                }
                y(this.f96907c.get(this.P), this.S, qVar2, i12);
                return;
            }
            if (i11 == 16877) {
                x(v(i11), qVar2, i12);
                return;
            }
            if (i11 == 16981) {
                k(i11);
                byte[] bArr = new byte[i12];
                this.f96931x.f96945j = bArr;
                qVar2.readFully(bArr, 0, i12);
                return;
            }
            if (i11 == 18402) {
                byte[] bArr2 = new byte[i12];
                qVar2.readFully(bArr2, 0, i12);
                v(i11).f96946k = new o0.a(1, bArr2, 0, 0);
                return;
            }
            if (i11 == 21419) {
                Arrays.fill(this.f96918k.f(), (byte) 0);
                qVar2.readFully(this.f96918k.f(), 4 - i12, i12);
                this.f96918k.b0(0);
                this.f96933z = (int) this.f96918k.O();
                return;
            }
            if (i11 == 25506) {
                k(i11);
                byte[] bArr3 = new byte[i12];
                this.f96931x.f96947l = bArr3;
                qVar2.readFully(bArr3, 0, i12);
                return;
            }
            if (i11 != 30322) {
                throw ParserException.a("Unexpected id: " + i11, null);
            }
            k(i11);
            byte[] bArr4 = new byte[i12];
            this.f96931x.f96959x = bArr4;
            qVar2.readFully(bArr4, 0, i12);
            return;
        }
        int i25 = 8;
        if (this.J == 0) {
            this.P = (int) this.f96905b.d(qVar2, false, true, 8);
            this.Q = this.f96905b.b();
            this.L = -9223372036854775807L;
            this.J = 1;
            this.f96916i.X(0);
        }
        c cVar = this.f96907c.get(this.P);
        if (cVar == null) {
            qVar2.k(i12 - this.Q);
            this.J = 0;
            return;
        }
        cVar.f();
        if (this.J == 1) {
            D(qVar2, 3);
            int i26 = (this.f96916i.f()[2] & 6) >> 1;
            if (i26 == 0) {
                this.N = 1;
                int[] iArrR = r(this.O, 1);
                this.O = iArrR;
                iArrR[0] = (i12 - this.Q) - 3;
            } else {
                D(qVar2, 4);
                int i27 = (this.f96916i.f()[3] & 255) + 1;
                this.N = i27;
                int[] iArrR2 = r(this.O, i27);
                this.O = iArrR2;
                if (i26 == 2) {
                    int i28 = (i12 - this.Q) - 4;
                    int i29 = this.N;
                    Arrays.fill(iArrR2, 0, i29, i28 / i29);
                } else {
                    if (i26 == 1) {
                        int i31 = 0;
                        int i32 = 0;
                        int i33 = 4;
                        while (true) {
                            i18 = this.N;
                            if (i31 >= i18 - 1) {
                                break;
                            }
                            this.O[i31] = 0;
                            while (true) {
                                i19 = i33 + 1;
                                D(qVar2, i19);
                                int i34 = this.f96916i.f()[i33] & 255;
                                int[] iArr = this.O;
                                i21 = iArr[i31] + i34;
                                iArr[i31] = i21;
                                if (i34 != 255) {
                                    break;
                                } else {
                                    i33 = i19;
                                }
                            }
                            i32 += i21;
                            i31++;
                            i33 = i19;
                        }
                        this.O[i18 - 1] = ((i12 - this.Q) - i33) - i32;
                    } else {
                        if (i26 != 3) {
                            throw ParserException.a("Unexpected lacing value: " + i26, null);
                        }
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 4;
                        while (true) {
                            int i38 = this.N;
                            i13 = i24;
                            if (i35 >= i38 - 1) {
                                i14 = i23;
                                this.O[i38 - 1] = ((i12 - this.Q) - i37) - i36;
                                break;
                            }
                            this.O[i35] = i23;
                            int i39 = i37 + 1;
                            D(qVar2, i39);
                            if (this.f96916i.f()[i37] == 0) {
                                throw ParserException.a("No valid varint length mask found", null);
                            }
                            int i41 = i23;
                            while (true) {
                                if (i41 >= i25) {
                                    i15 = i23;
                                    i16 = i25;
                                    i17 = i35;
                                    j11 = 0;
                                    break;
                                }
                                i16 = i25;
                                int i42 = i13 << (7 - i41);
                                i15 = i23;
                                if ((this.f96916i.f()[i37] & i42) != 0) {
                                    i39 += i41;
                                    D(qVar2, i39);
                                    int i43 = i37 + 1;
                                    j11 = this.f96916i.f()[i37] & 255 & (~i42);
                                    while (true) {
                                        int i44 = i43;
                                        if (i44 >= i39) {
                                            break;
                                        }
                                        i43 = i44 + 1;
                                        j11 = (j11 << i16) | ((long) (this.f96916i.f()[i44] & 255));
                                        i35 = i35;
                                    }
                                    i17 = i35;
                                    if (i17 <= 0) {
                                        break;
                                    }
                                    j11 -= (1 << ((i41 * 7) + 6)) - 1;
                                    break;
                                }
                                i41++;
                                qVar2 = qVar;
                                i23 = i15;
                                i25 = i16;
                            }
                            i37 = i39;
                            if (j11 < -2147483648L || j11 > 2147483647L) {
                                throw ParserException.a("EBML lacing sample size out of range.", null);
                            }
                            int i45 = (int) j11;
                            int[] iArr2 = this.O;
                            if (i17 != 0) {
                                i45 += iArr2[i17 - 1];
                            }
                            iArr2[i17] = i45;
                            i36 += i45;
                            i35 = i17 + 1;
                            qVar2 = qVar;
                            i24 = i13;
                            i23 = i15;
                            i25 = i16;
                        }
                    }
                    this.K = this.E + F((this.f96916i.f()[i14] << 8) | (this.f96916i.f()[i13] & 255));
                    if (cVar.f96940e != 2 || (i11 == 163 && (this.f96916i.f()[2] & 128) == 128)) {
                        i22 = i13;
                    } else {
                        i22 = i14;
                    }
                    this.R = i22;
                    this.J = 2;
                    this.M = i14;
                }
            }
            i14 = 0;
            i13 = 1;
            this.K = this.E + F((this.f96916i.f()[i14] << 8) | (this.f96916i.f()[i13] & 255));
            if (cVar.f96940e != 2) {
                i22 = i13;
            } else {
                i22 = i13;
            }
            this.R = i22;
            this.J = 2;
            this.M = i14;
        } else {
            i13 = 1;
        }
        if (i11 == 163) {
            while (true) {
                int i46 = this.M;
                if (i46 >= this.N) {
                    this.J = 0;
                    return;
                }
                int iJ = J(qVar, cVar, this.O[i46], false);
                c cVar2 = cVar;
                p(cVar2, this.K + ((long) ((this.M * cVar.f96941f) / 1000)), this.R, iJ, 0);
                this.M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i47 = this.M;
                if (i47 >= this.N) {
                    return;
                }
                int[] iArr3 = this.O;
                boolean z11 = i13;
                iArr3[i47] = J(qVar, cVar, iArr3[i47], z11);
                this.M += z11 ? 1 : 0;
            }
        }
    }

    protected void q(int i11) throws ParserException {
        m();
        if (i11 == 160) {
            if (this.J != 2) {
                return;
            }
            c cVar = this.f96907c.get(this.P);
            cVar.f();
            if (this.U > 0 && "A_OPUS".equals(cVar.f96938c)) {
                this.f96923p.Y(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.U).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.N; i13++) {
                i12 += this.O[i13];
            }
            int i14 = 0;
            while (i14 < this.N) {
                long j11 = this.K + ((long) ((cVar.f96941f * i14) / 1000));
                int i15 = this.R;
                if (i14 == 0 && !this.T) {
                    i15 |= 1;
                }
                int i16 = this.O[i14];
                int i17 = i12 - i16;
                p(cVar, j11, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.J = 0;
            return;
        }
        if (i11 == 174) {
            c cVar2 = (c) s7.a.j(this.f96931x);
            String str = cVar2.f96938c;
            if (str == null) {
                throw ParserException.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.f96912e0, cVar2.f96939d);
                this.f96907c.put(cVar2.f96939d, cVar2);
            }
            this.f96931x = null;
            return;
        }
        if (i11 == 19899) {
            int i18 = this.f96933z;
            if (i18 != -1) {
                long j12 = this.A;
                if (j12 != -1) {
                    if (i18 == 475249515) {
                        this.C = j12;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i11 == 25152) {
            k(i11);
            c cVar3 = this.f96931x;
            if (cVar3.f96944i) {
                if (cVar3.f96946k == null) {
                    throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f96948m = new n(new n.b(h.f101348a, "video/webm", this.f96931x.f96946k.f121387b));
                return;
            }
            return;
        }
        if (i11 == 28032) {
            k(i11);
            c cVar4 = this.f96931x;
            if (cVar4.f96944i && cVar4.f96945j != null) {
                throw ParserException.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i11 == 357149030) {
            if (this.f96927t == -9223372036854775807L) {
                this.f96927t = 1000000L;
            }
            long j13 = this.f96928u;
            if (j13 != -9223372036854775807L) {
                this.f96929v = F(j13);
                return;
            }
            return;
        }
        if (i11 == 374648427) {
            if (this.f96907c.size() == 0) {
                throw ParserException.a("No valid tracks were found", null);
            }
            this.f96912e0.j();
        } else {
            if (i11 != 475249515) {
                return;
            }
            if (!this.f96932y) {
                this.f96912e0.t(o(this.F, this.G));
                this.f96932y = true;
            }
            this.F = null;
            this.G = null;
        }
    }

    protected void t(int i11, double d11) {
        if (i11 == 181) {
            v(i11).S = (int) d11;
            return;
        }
        if (i11 == 17545) {
            this.f96928u = (long) d11;
            return;
        }
        switch (i11) {
            case 21969:
                v(i11).F = (float) d11;
                break;
            case 21970:
                v(i11).G = (float) d11;
                break;
            case 21971:
                v(i11).H = (float) d11;
                break;
            case 21972:
                v(i11).I = (float) d11;
                break;
            case 21973:
                v(i11).J = (float) d11;
                break;
            case 21974:
                v(i11).K = (float) d11;
                break;
            case 21975:
                v(i11).L = (float) d11;
                break;
            case 21976:
                v(i11).M = (float) d11;
                break;
            case 21977:
                v(i11).N = (float) d11;
                break;
            case 21978:
                v(i11).O = (float) d11;
                break;
            default:
                switch (i11) {
                    case 30323:
                        v(i11).f96956u = (float) d11;
                        break;
                    case 30324:
                        v(i11).f96957v = (float) d11;
                        break;
                    case 30325:
                        v(i11).f96958w = (float) d11;
                        break;
                }
                break;
        }
    }

    protected c v(int i11) throws ParserException {
        k(i11);
        return this.f96931x;
    }

    protected int w(int i11) {
        switch (i11) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void x(c cVar, w8.q qVar, int i11) {
        if (cVar.f96943h != 1685485123 && cVar.f96943h != 1685480259) {
            qVar.k(i11);
            return;
        }
        byte[] bArr = new byte[i11];
        cVar.P = bArr;
        qVar.readFully(bArr, 0, i11);
    }

    protected void y(c cVar, int i11, w8.q qVar, int i12) {
        if (i11 != 4 || !"V_VP9".equals(cVar.f96938c)) {
            qVar.k(i12);
        } else {
            this.f96923p.X(i12);
            qVar.readFully(this.f96923p.f(), 0, i12);
        }
    }

    protected void z(int i11, long j11) throws ParserException {
        if (i11 == 20529) {
            if (j11 == 0) {
                return;
            }
            throw ParserException.a("ContentEncodingOrder " + j11 + " not supported", null);
        }
        if (i11 == 20530) {
            if (j11 == 1) {
                return;
            }
            throw ParserException.a("ContentEncodingScope " + j11 + " not supported", null);
        }
        switch (i11) {
            case 131:
                v(i11).f96940e = (int) j11;
                return;
            case 136:
                v(i11).X = j11 == 1;
                return;
            case 155:
                this.L = F(j11);
                return;
            case 159:
                v(i11).Q = (int) j11;
                return;
            case 176:
                v(i11).f96949n = (int) j11;
                return;
            case 179:
                g(i11);
                this.F.a(F(j11));
                return;
            case 186:
                v(i11).f96950o = (int) j11;
                return;
            case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                v(i11).f96939d = (int) j11;
                return;
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                this.E = F(j11);
                return;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                this.S = (int) j11;
                return;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                if (this.H) {
                    return;
                }
                g(i11);
                this.G.a(j11);
                this.H = true;
                return;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                this.T = true;
                return;
            case 16871:
                v(i11).f96943h = (int) j11;
                return;
            case 16980:
                if (j11 == 3) {
                    return;
                }
                throw ParserException.a("ContentCompAlgo " + j11 + " not supported", null);
            case 17029:
                if (j11 < 1 || j11 > 2) {
                    throw ParserException.a("DocTypeReadVersion " + j11 + " not supported", null);
                }
                return;
            case 17143:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.a("EBMLReadVersion " + j11 + " not supported", null);
            case 18401:
                if (j11 == 5) {
                    return;
                }
                throw ParserException.a("ContentEncAlgo " + j11 + " not supported", null);
            case 18408:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.a("AESSettingsCipherMode " + j11 + " not supported", null);
            case 21420:
                this.A = j11 + this.f96926s;
                return;
            case 21432:
                int i12 = (int) j11;
                k(i11);
                if (i12 == 0) {
                    this.f96931x.f96960y = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f96931x.f96960y = 2;
                    return;
                } else if (i12 == 3) {
                    this.f96931x.f96960y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.f96931x.f96960y = 3;
                    return;
                }
            case 21680:
                v(i11).f96952q = (int) j11;
                return;
            case 21682:
                v(i11).f96954s = (int) j11;
                return;
            case 21690:
                v(i11).f96953r = (int) j11;
                return;
            case 21930:
                v(i11).W = j11 == 1;
                return;
            case 21938:
                k(i11);
                c cVar = this.f96931x;
                cVar.f96961z = true;
                cVar.f96951p = (int) j11;
                return;
            case 21998:
                v(i11).f96942g = (int) j11;
                return;
            case 22186:
                v(i11).T = j11;
                return;
            case 22203:
                v(i11).U = j11;
                return;
            case 25188:
                v(i11).R = (int) j11;
                return;
            case 30114:
                this.U = j11;
                return;
            case 30321:
                k(i11);
                int i13 = (int) j11;
                if (i13 == 0) {
                    this.f96931x.f96955t = 0;
                    return;
                }
                if (i13 == 1) {
                    this.f96931x.f96955t = 1;
                    return;
                } else if (i13 == 2) {
                    this.f96931x.f96955t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f96931x.f96955t = 3;
                    return;
                }
            case 2352003:
                v(i11).f96941f = (int) j11;
                return;
            case 2807729:
                this.f96927t = j11;
                return;
            default:
                switch (i11) {
                    case 21945:
                        k(i11);
                        int i14 = (int) j11;
                        if (i14 == 1) {
                            this.f96931x.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.f96931x.C = 1;
                            return;
                        }
                    case 21946:
                        k(i11);
                        int iL = i.l((int) j11);
                        if (iL != -1) {
                            this.f96931x.B = iL;
                            return;
                        }
                        return;
                    case 21947:
                        k(i11);
                        this.f96931x.f96961z = true;
                        int iK = i.k((int) j11);
                        if (iK != -1) {
                            this.f96931x.A = iK;
                            return;
                        }
                        return;
                    case 21948:
                        v(i11).D = (int) j11;
                        return;
                    case 21949:
                        v(i11).E = (int) j11;
                        return;
                    default:
                        return;
                }
        }
    }

    e(o9.c cVar, int i11, q.a aVar) {
        this.f96926s = -1L;
        this.f96927t = -9223372036854775807L;
        this.f96928u = -9223372036854775807L;
        this.f96929v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f96903a = cVar;
        cVar.b(new b());
        this.f96913f = aVar;
        this.f96909d = (i11 & 1) == 0;
        this.f96911e = (i11 & 2) == 0;
        this.f96905b = new g();
        this.f96907c = new SparseArray<>();
        this.f96916i = new c0(4);
        this.f96917j = new c0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f96918k = new c0(4);
        this.f96914g = new c0(t7.h.f112710a);
        this.f96915h = new c0(4);
        this.f96919l = new c0();
        this.f96920m = new c0();
        this.f96921n = new c0(8);
        this.f96922o = new c0();
        this.f96923p = new c0();
        this.O = new int[1];
    }

    @Override // w8.p
    public final void release() {
    }
}
