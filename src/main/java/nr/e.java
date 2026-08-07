package nr;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.u0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.common.collect.x;
import com.plaid.internal.EnumC4419g;
import hr.b0;
import hr.c0;
import hr.k;
import hr.l;
import hr.m;
import hr.p;
import hr.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.spongycastle.math.ec.Tnaf;
import ts.d0;
import ts.p0;
import ts.u;
import ts.v;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class e implements k {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final p f95302c0 = new p() { // from class: nr.d
        @Override // hr.p
        public final k[] d() {
            return e.b();
        }
    };

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte[] f95303d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final byte[] f95304e0 = p0.l0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final byte[] f95305f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f95306g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final UUID f95307h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Map<String, Integer> f95308i0;
    private long A;
    private long B;
    private v C;
    private v D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nr.c f95309a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f95310a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f95311b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private m f95312b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f95313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f95314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f95315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f95316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f95317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f95318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f95319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f95320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d0 f95321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d0 f95322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f95323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f95324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ByteBuffer f95325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f95326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f95327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f95328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f95329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f95330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f95331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f95332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f95333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f95334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f95335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f95336z;

    private final class b implements nr.b {
        private b() {
        }

        @Override // nr.b
        public void a(int i11) throws ParserException {
            e.this.o(i11);
        }

        @Override // nr.b
        public void b(int i11, double d11) {
            e.this.r(i11, d11);
        }

        @Override // nr.b
        public void c(int i11, long j11) throws ParserException {
            e.this.x(i11, j11);
        }

        @Override // nr.b
        public void d(int i11, String str) throws ParserException {
            e.this.G(i11, str);
        }

        @Override // nr.b
        public void e(int i11, long j11, long j12) throws ParserException {
            e.this.F(i11, j11, j12);
        }

        @Override // nr.b
        public int f(int i11) {
            return e.this.u(i11);
        }

        @Override // nr.b
        public boolean g(int i11) {
            return e.this.z(i11);
        }

        @Override // nr.b
        public void h(int i11, int i12, l lVar) throws ParserException {
            e.this.l(i11, i12, lVar);
        }
    }

    protected static final class c {
        public byte[] N;
        public c0 T;
        public boolean U;
        public b0 X;
        public int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f95338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f95339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f95340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f95341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f95342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f95343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f95344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f95345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f95346i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b0.a f95347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f95348k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public h f95349l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f95350m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f95351n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f95352o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f95353p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f95354q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f95355r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f95356s = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f95357t = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f95358u = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f95359v = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f95360w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f95361x = false;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f95362y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f95363z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        private String W = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void f() {
            ts.a.e(this.X);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f95348k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(d0 d0Var) throws ParserException {
            try {
                d0Var.V(16);
                long jX = d0Var.x();
                if (jX == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jX == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jX != 826496599) {
                    u.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrE = d0Var.e();
                for (int iF = d0Var.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(d0 d0Var) throws ParserException {
            try {
                int iZ = d0Var.z();
                if (iZ == 1) {
                    return true;
                }
                if (iZ == 65534) {
                    d0Var.U(24);
                    if (d0Var.A() == e.f95307h0.getMostSignificantBits() && d0Var.A() == e.f95307h0.getLeastSignificantBits()) {
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
            if ("A_OPUS".equals(this.f95339b)) {
                return z11;
            }
            return this.f95343f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:206:0x0428  */
        /* JADX WARN: Code duplicated, block: B:211:0x0441  */
        /* JADX WARN: Code duplicated, block: B:212:0x0443  */
        /* JADX WARN: Code duplicated, block: B:215:0x0450  */
        /* JADX WARN: Code duplicated, block: B:216:0x0462  */
        /* JADX WARN: Code duplicated, block: B:218:0x0468  */
        /* JADX WARN: Code duplicated, block: B:220:0x046c  */
        /* JADX WARN: Code duplicated, block: B:222:0x0471  */
        /* JADX WARN: Code duplicated, block: B:225:0x0479  */
        /* JADX WARN: Code duplicated, block: B:227:0x047e  */
        /* JADX WARN: Code duplicated, block: B:230:0x0483  */
        /* JADX WARN: Code duplicated, block: B:233:0x0491  */
        /* JADX WARN: Code duplicated, block: B:236:0x0497  */
        /* JADX WARN: Code duplicated, block: B:239:0x04aa  */
        /* JADX WARN: Code duplicated, block: B:244:0x04ca  */
        /* JADX WARN: Code duplicated, block: B:250:0x04e3  */
        /* JADX WARN: Code duplicated, block: B:251:0x04e5  */
        /* JADX WARN: Code duplicated, block: B:253:0x04ef  */
        /* JADX WARN: Code duplicated, block: B:254:0x04f2  */
        /* JADX WARN: Code duplicated, block: B:256:0x04fc  */
        /* JADX WARN: Code duplicated, block: B:262:0x0514  */
        /* JADX WARN: Code duplicated, block: B:264:0x053b  */
        /* JADX WARN: Code duplicated, block: B:266:0x0541  */
        /* JADX WARN: Code duplicated, block: B:282:0x056c  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        public void i(m mVar, int i11) throws ParserException {
            byte b11;
            List<byte[]> listSingletonList;
            String str;
            int i12;
            int i13;
            List<byte[]> list;
            String str2;
            int iA0;
            String str3;
            int i14;
            u0.b bVar;
            int i15;
            int iIntValue;
            int i16;
            float f11;
            int i17;
            int i18;
            int i19;
            us.d dVarA;
            String str4 = this.f95339b;
            str4.getClass();
            switch (str4) {
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
                case "V_MPEGH/ISO/HEVC":
                    b11 = 26;
                    break;
                case "S_TEXT/WEBVTT":
                    b11 = 27;
                    break;
                case "S_TEXT/UTF8":
                    b11 = 28;
                    break;
                case "V_MPEG2":
                    b11 = 29;
                    break;
                case "A_EAC3":
                    b11 = 30;
                    break;
                case "A_FLAC":
                    b11 = 31;
                    break;
                case "A_OPUS":
                    b11 = 32;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            String str5 = "audio/raw";
            switch (b11) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f95348k;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = "video/mp4v-es";
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null && (dVarA = us.d.a(new d0(this.N))) != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21 = i14 | (z11 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    } else if (y.o(str3)) {
                        if (this.f95354q == 0) {
                            i18 = this.f95352o;
                            iIntValue = -1;
                            if (i18 == -1) {
                                i18 = this.f95350m;
                            }
                            this.f95352o = i18;
                            i19 = this.f95353p;
                            if (i19 == -1) {
                                i19 = this.f95351n;
                            }
                            this.f95353p = i19;
                        } else {
                            iIntValue = -1;
                        }
                        i16 = this.f95352o;
                        if (i16 != iIntValue || (i17 = this.f95353p) == iIntValue) {
                            f11 = -1.0f;
                        } else {
                            f11 = (this.f95351n * i16) / (this.f95350m * i17);
                        }
                        us.c cVar = this.f95361x ? new us.c(this.f95362y, this.A, this.f95363z, h()) : null;
                        if (this.f95338a != null && e.f95308i0.containsKey(this.f95338a)) {
                            iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                        }
                        if (this.f95355r == 0 && Float.compare(this.f95356s, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.f95357t, BitmapDescriptorFactory.HUE_RED) == 0) {
                            if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f95357t, -180.0f) != 0 || Float.compare(this.f95357t, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f95357t, -90.0f) == 0) {
                                iIntValue = EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                            }
                        }
                        bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                        i15 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw ParserException.a("Unexpected MIME type.", null);
                        }
                        i15 = 3;
                    }
                    if (this.f95338a != null && !e.f95308i0.containsKey(this.f95338a)) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i21).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB = mVar.b(this.f95340c, i15);
                    this.X = b0VarB;
                    b0VarB.b(u0VarG);
                    return;
                case 2:
                    if (l(new d0(g(this.f95339b)))) {
                        int iA1 = p0.a0(this.P);
                        if (iA1 == 0) {
                            u.i("MatroskaExtractor", "Unsupported PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i12 = iA1;
                            listSingletonList = null;
                            str = null;
                            i13 = -1;
                        }
                        if (this.N != null) {
                            str = dVarA.f116554c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z12 = this.V;
                        if (this.U) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        int i22 = i14 | (z12 ? 1 : 0);
                        bVar = new u0.b();
                        if (y.l(str3)) {
                            if (y.o(str3)) {
                                if (this.f95354q == 0) {
                                    i18 = this.f95352o;
                                    iIntValue = -1;
                                    if (i18 == -1) {
                                        i18 = this.f95350m;
                                    }
                                    this.f95352o = i18;
                                    i19 = this.f95353p;
                                    if (i19 == -1) {
                                        i19 = this.f95351n;
                                    }
                                    this.f95353p = i19;
                                } else {
                                    iIntValue = -1;
                                }
                                i16 = this.f95352o;
                                if (i16 != iIntValue) {
                                    f11 = -1.0f;
                                } else {
                                    f11 = -1.0f;
                                }
                                if (this.f95361x) {
                                }
                                if (this.f95338a != null) {
                                    iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                                }
                                if (this.f95355r == 0) {
                                    if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                                i15 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i15 = 3;
                            }
                            break;
                        } else {
                            bVar.J(this.O).h0(this.Q).a0(i12);
                            i15 = 1;
                        }
                        if (this.f95338a != null) {
                            bVar.W(this.f95338a);
                        }
                        u0 u0VarG2 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i22).V(listSingletonList).K(str).O(this.f95349l).G();
                        b0 b0VarB2 = mVar.b(this.f95340c, i15);
                        this.X = b0VarB2;
                        b0VarB2.b(u0VarG2);
                        return;
                    }
                    u.i("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z13 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i23 = i14 | (z13 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG3 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i23).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB3 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB3;
                    b0VarB3.b(u0VarG3);
                    return;
                case 3:
                    this.T = new c0();
                    str5 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z14 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i24 = i14 | (z14 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG4 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i24).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB4 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB4;
                    b0VarB4.b(u0VarG4);
                    return;
                case 4:
                    listSingletonList = m(g(this.f95339b));
                    str5 = "audio/vorbis";
                    i13 = 8192;
                    str = null;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z15 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i25 = i14 | (z15 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG5 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i25).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB5 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB5;
                    b0VarB5.b(u0VarG5);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i13 = 4096;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z16 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i26 = i14 | (z16 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG6 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i26).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB6 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB6;
                    b0VarB6.b(u0VarG6);
                    return;
                case 6:
                    str5 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i13 = 4096;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z17 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i27 = i14 | (z17 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG7 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i27).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB7 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB7;
                    b0VarB7.b(u0VarG7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairK = k(new d0(g(this.f95339b)));
                    str5 = (String) pairK.first;
                    listSingletonList = (List) pairK.second;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z18 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i28 = i14 | (z18 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG8 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i28).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB8 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB8;
                    b0VarB8.b(u0VarG8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f95339b), 0, bArr2, 0, 4);
                    listSingletonList = x.s(bArr2);
                    str = null;
                    str5 = "application/dvbsubs";
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z19 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i29 = i14 | (z19 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG9 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i29).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB9 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB9;
                    b0VarB9.b(u0VarG9);
                    return;
                case 10:
                    us.a aVarB = us.a.b(new d0(g(this.f95339b)));
                    list = aVarB.f116527a;
                    this.Y = aVarB.f116528b;
                    str2 = aVarB.f116535i;
                    str5 = "video/avc";
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z110 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i210 = i14 | (z110 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG10 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i210).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB10 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB10;
                    b0VarB10.b(u0VarG10);
                    return;
                case 11:
                    listSingletonList = x.s(g(this.f95339b));
                    str = null;
                    str5 = "application/vobsub";
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i211 = i14 | (z111 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG11 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i211).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB11 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB11;
                    b0VarB11.b(u0VarG11);
                    return;
                case 12:
                    str5 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z112 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i212 = i14 | (z112 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG12 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i212).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB12 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB12;
                    b0VarB12.b(u0VarG12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(g(this.f95339b));
                    dr.a.b bVarE = dr.a.e(this.f95348k);
                    this.Q = bVarE.f60845a;
                    this.O = bVarE.f60846b;
                    str = bVarE.f60847c;
                    str5 = "audio/mp4a-latm";
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z113 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i213 = i14 | (z113 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG13 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i213).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB13 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB13;
                    b0VarB13.b(u0VarG13);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z114 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i214 = i14 | (z114 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG14 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i214).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB14 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB14;
                    b0VarB14.b(u0VarG14);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z115 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i215 = i14 | (z115 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG15 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i215).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB15 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB15;
                    b0VarB15.b(u0VarG15);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z116 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i216 = i14 | (z116 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG16 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i216).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB16 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB16;
                    b0VarB16.b(u0VarG16);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z117 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i217 = i14 | (z117 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG17 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i217).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB17 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB17;
                    b0VarB17.b(u0VarG17);
                    return;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z118 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i218 = i14 | (z118 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG18 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i218).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB18 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB18;
                    b0VarB18.b(u0VarG18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str5 = "application/pgs";
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i219 = i14 | (z119 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG19 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i219).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB19 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB19;
                    b0VarB19.b(u0VarG19);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1110 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2110 = i14 | (z1110 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG110 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2110).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB110 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB110;
                    b0VarB110.b(u0VarG110);
                    return;
                case 22:
                    if (this.P == 32) {
                        listSingletonList = null;
                        str = null;
                        i13 = -1;
                        i12 = 4;
                    } else {
                        u.i("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i13 = -1;
                        i12 = -1;
                    }
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1111 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2111 = i14 | (z1111 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG111 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2111).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB111 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB111;
                    b0VarB111.b(u0VarG111);
                    return;
                case 23:
                    int i31 = this.P;
                    if (i31 == 8) {
                        listSingletonList = null;
                        str = null;
                        i12 = 3;
                    } else {
                        if (i31 != 16) {
                            u.i("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str5 = "audio/x-unknown";
                            i13 = -1;
                            i12 = -1;
                            if (this.N != null) {
                                str = dVarA.f116554c;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z1112 = this.V;
                            if (this.U) {
                                i14 = 2;
                            } else {
                                i14 = 0;
                            }
                            int i2112 = i14 | (z1112 ? 1 : 0);
                            bVar = new u0.b();
                            if (y.l(str3)) {
                                if (y.o(str3)) {
                                    if (this.f95354q == 0) {
                                        i18 = this.f95352o;
                                        iIntValue = -1;
                                        if (i18 == -1) {
                                            i18 = this.f95350m;
                                        }
                                        this.f95352o = i18;
                                        i19 = this.f95353p;
                                        if (i19 == -1) {
                                            i19 = this.f95351n;
                                        }
                                        this.f95353p = i19;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i16 = this.f95352o;
                                    if (i16 != iIntValue) {
                                        f11 = -1.0f;
                                    } else {
                                        f11 = -1.0f;
                                    }
                                    if (this.f95361x) {
                                    }
                                    if (this.f95338a != null) {
                                        iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                                    }
                                    if (this.f95355r == 0) {
                                        if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                                    i15 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i15 = 3;
                                }
                                break;
                            } else {
                                bVar.J(this.O).h0(this.Q).a0(i12);
                                i15 = 1;
                            }
                            if (this.f95338a != null) {
                                bVar.W(this.f95338a);
                            }
                            u0 u0VarG112 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2112).V(listSingletonList).K(str).O(this.f95349l).G();
                            b0 b0VarB112 = mVar.b(this.f95340c, i15);
                            this.X = b0VarB112;
                            b0VarB112.b(u0VarG112);
                            return;
                        }
                        iA0 = 268435456;
                        i12 = iA0;
                        listSingletonList = null;
                        str = null;
                    }
                    i13 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1113 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2113 = i14 | (z1113 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG113 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2113).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB113 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB113;
                    b0VarB113.b(u0VarG113);
                    return;
                case 24:
                    iA0 = p0.a0(this.P);
                    if (iA0 == 0) {
                        u.i("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i13 = -1;
                        i12 = -1;
                        if (this.N != null) {
                            str = dVarA.f116554c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z1114 = this.V;
                        if (this.U) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        int i2114 = i14 | (z1114 ? 1 : 0);
                        bVar = new u0.b();
                        if (y.l(str3)) {
                            if (y.o(str3)) {
                                if (this.f95354q == 0) {
                                    i18 = this.f95352o;
                                    iIntValue = -1;
                                    if (i18 == -1) {
                                        i18 = this.f95350m;
                                    }
                                    this.f95352o = i18;
                                    i19 = this.f95353p;
                                    if (i19 == -1) {
                                        i19 = this.f95351n;
                                    }
                                    this.f95353p = i19;
                                } else {
                                    iIntValue = -1;
                                }
                                i16 = this.f95352o;
                                if (i16 != iIntValue) {
                                    f11 = -1.0f;
                                } else {
                                    f11 = -1.0f;
                                }
                                if (this.f95361x) {
                                }
                                if (this.f95338a != null) {
                                    iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                                }
                                if (this.f95355r == 0) {
                                    if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                                i15 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i15 = 3;
                            }
                            break;
                        } else {
                            bVar.J(this.O).h0(this.Q).a0(i12);
                            i15 = 1;
                        }
                        if (this.f95338a != null) {
                            bVar.W(this.f95338a);
                        }
                        u0 u0VarG114 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2114).V(listSingletonList).K(str).O(this.f95349l).G();
                        b0 b0VarB114 = mVar.b(this.f95340c, i15);
                        this.X = b0VarB114;
                        b0VarB114.b(u0VarG114);
                        return;
                    }
                    i12 = iA0;
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1115 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2115 = i14 | (z1115 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG115 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2115).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB115 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB115;
                    b0VarB115.b(u0VarG115);
                    return;
                case 25:
                    listSingletonList = x.t(e.f95304e0, g(this.f95339b));
                    str = null;
                    str5 = "text/x-ssa";
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1116 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2116 = i14 | (z1116 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG116 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2116).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB116 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB116;
                    b0VarB116.b(u0VarG116);
                    return;
                case 26:
                    us.f fVarA = us.f.a(new d0(g(this.f95339b)));
                    list = fVarA.f116569a;
                    this.Y = fVarA.f116570b;
                    str2 = fVarA.f116577i;
                    str5 = "video/hevc";
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1117 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2117 = i14 | (z1117 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG117 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2117).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB117 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB117;
                    b0VarB117.b(u0VarG117);
                    return;
                case 27:
                    str5 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1118 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2118 = i14 | (z1118 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG118 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2118).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB118 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB118;
                    b0VarB118.b(u0VarG118);
                    return;
                case 28:
                    str5 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1119 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i2119 = i14 | (z1119 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG119 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i2119).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB119 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB119;
                    b0VarB119.b(u0VarG119);
                    return;
                case 29:
                    str5 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11110 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21110 = i14 | (z11110 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG1110 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i21110).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB1110 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB1110;
                    b0VarB1110.b(u0VarG1110);
                    return;
                case 30:
                    str5 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11111 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21111 = i14 | (z11111 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG1111 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i21111).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB1111 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB1111;
                    b0VarB1111.b(u0VarG1111);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(g(this.f95339b));
                    str5 = "audio/flac";
                    str = null;
                    i13 = -1;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11112 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21112 = i14 | (z11112 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG1112 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i21112).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB1112 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB1112;
                    b0VarB1112.b(u0VarG1112);
                    return;
                case 32:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(g(this.f95339b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.R).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str5 = "audio/opus";
                    i13 = 5760;
                    str = null;
                    i12 = -1;
                    if (this.N != null) {
                        str = dVarA.f116554c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11113 = this.V;
                    if (this.U) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i21113 = i14 | (z11113 ? 1 : 0);
                    bVar = new u0.b();
                    if (y.l(str3)) {
                        if (y.o(str3)) {
                            if (this.f95354q == 0) {
                                i18 = this.f95352o;
                                iIntValue = -1;
                                if (i18 == -1) {
                                    i18 = this.f95350m;
                                }
                                this.f95352o = i18;
                                i19 = this.f95353p;
                                if (i19 == -1) {
                                    i19 = this.f95351n;
                                }
                                this.f95353p = i19;
                            } else {
                                iIntValue = -1;
                            }
                            i16 = this.f95352o;
                            if (i16 != iIntValue) {
                                f11 = -1.0f;
                            } else {
                                f11 = -1.0f;
                            }
                            if (this.f95361x) {
                            }
                            if (this.f95338a != null) {
                                iIntValue = ((Integer) e.f95308i0.get(this.f95338a)).intValue();
                            }
                            if (this.f95355r == 0) {
                                if (Float.compare(this.f95358u, BitmapDescriptorFactory.HUE_RED) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f95357t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f95357t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.n0(this.f95350m).S(this.f95351n).c0(f11).f0(iIntValue).d0(this.f95359v).j0(this.f95360w).L(cVar);
                            i15 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i15 = 3;
                        }
                        break;
                    } else {
                        bVar.J(this.O).h0(this.Q).a0(i12);
                        i15 = 1;
                    }
                    if (this.f95338a != null) {
                        bVar.W(this.f95338a);
                    }
                    u0 u0VarG1113 = bVar.T(i11).g0(str3).Y(i13).X(this.W).i0(i21113).V(listSingletonList).K(str).O(this.f95349l).G();
                    b0 b0VarB1113 = mVar.b(this.f95340c, i15);
                    this.X = b0VarB1113;
                    b0VarB1113.b(u0VarG1113);
                    return;
                default:
                    throw ParserException.a("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({"output"})
        public void j() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.a(this.X, this.f95347j);
            }
        }

        public void n() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", Integer.valueOf(EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE));
        f95308i0 = Collections.unmodifiableMap(map);
    }

    public e() {
        this(0);
    }

    private boolean A(hr.y yVar, long j11) {
        if (this.f95335y) {
            this.A = j11;
            yVar.f73403a = this.f95336z;
            this.f95335y = false;
            return true;
        }
        if (this.f95332v) {
            long j12 = this.A;
            if (j12 != -1) {
                yVar.f73403a = j12;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    private void B(l lVar, int i11) {
        if (this.f95317g.g() >= i11) {
            return;
        }
        if (this.f95317g.b() < i11) {
            d0 d0Var = this.f95317g;
            d0Var.c(Math.max(d0Var.b() * 2, i11));
        }
        lVar.readFully(this.f95317g.e(), this.f95317g.g(), i11 - this.f95317g.g());
        this.f95317g.T(i11);
    }

    private void C() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f95310a0 = false;
        this.f95320j.Q(0);
    }

    private long D(long j11) throws ParserException {
        long j12 = this.f95328r;
        if (j12 != -9223372036854775807L) {
            return p0.M0(j11, j12, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void E(String str, long j11, byte[] bArr) {
        byte[] bArrS;
        int i11;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrS = s(j11, "%01d:%02d:%02d:%02d", 10000L);
                i11 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrS = s(j11, "%02d:%02d:%02d.%03d", 1000L);
                i11 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrS = s(j11, "%02d:%02d:%02d,%03d", 1000L);
                i11 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrS, 0, bArr, i11, bArrS.length);
    }

    @RequiresNonNull({"#2.output"})
    private int H(l lVar, c cVar, int i11, boolean z11) throws ParserException {
        int i12;
        if ("S_TEXT/UTF8".equals(cVar.f95339b)) {
            I(lVar, f95303d0, i11);
            return q();
        }
        if ("S_TEXT/ASS".equals(cVar.f95339b)) {
            I(lVar, f95305f0, i11);
            return q();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f95339b)) {
            I(lVar, f95306g0, i11);
            return q();
        }
        b0 b0Var = cVar.X;
        if (!this.V) {
            if (cVar.f95345h) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(this.f95317g.e(), 0, 1);
                    this.S++;
                    if ((this.f95317g.e()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = this.f95317g.e()[0];
                    this.W = true;
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z12 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f95310a0) {
                        lVar.readFully(this.f95322l.e(), 0, 8);
                        this.S += 8;
                        this.f95310a0 = true;
                        this.f95317g.e()[0] = (byte) ((z12 ? 128 : 0) | 8);
                        this.f95317g.U(0);
                        b0Var.f(this.f95317g, 1, 1);
                        this.T++;
                        this.f95322l.U(0);
                        b0Var.f(this.f95322l, 8, 1);
                        this.T += 8;
                    }
                    if (z12) {
                        if (!this.X) {
                            lVar.readFully(this.f95317g.e(), 0, 1);
                            this.S++;
                            this.f95317g.U(0);
                            this.Y = this.f95317g.H();
                            this.X = true;
                        }
                        int i13 = this.Y * 4;
                        this.f95317g.Q(i13);
                        lVar.readFully(this.f95317g.e(), 0, i13);
                        this.S += i13;
                        short s11 = (short) ((this.Y / 2) + 1);
                        int i14 = (s11 * 6) + 2;
                        ByteBuffer byteBuffer = this.f95325o;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f95325o = ByteBuffer.allocate(i14);
                        }
                        this.f95325o.position(0);
                        this.f95325o.putShort(s11);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i12 = this.Y;
                            if (i15 >= i12) {
                                break;
                            }
                            int iL = this.f95317g.L();
                            if (i15 % 2 == 0) {
                                this.f95325o.putShort((short) (iL - i16));
                            } else {
                                this.f95325o.putInt(iL - i16);
                            }
                            i15++;
                            i16 = iL;
                        }
                        int i17 = (i11 - this.S) - i16;
                        if (i12 % 2 == 1) {
                            this.f95325o.putInt(i17);
                        } else {
                            this.f95325o.putShort((short) i17);
                            this.f95325o.putInt(0);
                        }
                        this.f95323m.S(this.f95325o.array(), i14);
                        b0Var.f(this.f95323m, i14, 1);
                        this.T += i14;
                    }
                }
            } else {
                byte[] bArr = cVar.f95346i;
                if (bArr != null) {
                    this.f95320j.S(bArr, bArr.length);
                }
            }
            if (cVar.o(z11)) {
                this.O |= 268435456;
                this.f95324n.Q(0);
                int iG = (this.f95320j.g() + i11) - this.S;
                this.f95317g.Q(4);
                this.f95317g.e()[0] = (byte) ((iG >> 24) & 255);
                this.f95317g.e()[1] = (byte) ((iG >> 16) & 255);
                this.f95317g.e()[2] = (byte) ((iG >> 8) & 255);
                this.f95317g.e()[3] = (byte) (iG & 255);
                b0Var.f(this.f95317g, 4, 2);
                this.T += 4;
            }
            this.V = true;
        }
        int iG2 = i11 + this.f95320j.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f95339b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f95339b)) {
            if (cVar.T != null) {
                ts.a.g(this.f95320j.g() == 0);
                cVar.T.d(lVar);
            }
            while (true) {
                int i18 = this.S;
                if (i18 >= iG2) {
                    break;
                }
                int iJ = J(lVar, b0Var, iG2 - i18);
                this.S += iJ;
                this.T += iJ;
            }
        } else {
            byte[] bArrE = this.f95316f.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i19 = cVar.Y;
            int i21 = 4 - i19;
            while (this.S < iG2) {
                int i22 = this.U;
                if (i22 == 0) {
                    K(lVar, bArrE, i21, i19);
                    this.S += i19;
                    this.f95316f.U(0);
                    this.U = this.f95316f.L();
                    this.f95315e.U(0);
                    b0Var.d(this.f95315e, 4);
                    this.T += 4;
                } else {
                    int iJ2 = J(lVar, b0Var, i22);
                    this.S += iJ2;
                    this.T += iJ2;
                    this.U -= iJ2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f95339b)) {
            this.f95318h.U(0);
            b0Var.d(this.f95318h, 4);
            this.T += 4;
        }
        return q();
    }

    private void I(l lVar, byte[] bArr, int i11) {
        int length = bArr.length + i11;
        if (this.f95321k.b() < length) {
            this.f95321k.R(Arrays.copyOf(bArr, length + i11));
        } else {
            System.arraycopy(bArr, 0, this.f95321k.e(), 0, bArr.length);
        }
        lVar.readFully(this.f95321k.e(), bArr.length, i11);
        this.f95321k.U(0);
        this.f95321k.T(length);
    }

    private int J(l lVar, b0 b0Var, int i11) {
        int iA = this.f95320j.a();
        if (iA <= 0) {
            return b0Var.a(lVar, i11, false);
        }
        int iMin = Math.min(i11, iA);
        b0Var.d(this.f95320j, iMin);
        return iMin;
    }

    private void K(l lVar, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, this.f95320j.a());
        lVar.readFully(bArr, i11 + iMin, i12 - iMin);
        if (iMin > 0) {
            this.f95320j.l(bArr, i11, iMin);
        }
    }

    public static /* synthetic */ k[] b() {
        return new k[]{new e()};
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void g(int i11) throws ParserException {
        if (this.C == null || this.D == null) {
            throw ParserException.a("Element " + i11 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void j(int i11) throws ParserException {
        if (this.f95331u != null) {
            return;
        }
        throw ParserException.a("Element " + i11 + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void k() {
        ts.a.i(this.f95312b0);
    }

    private z m(v vVar, v vVar2) {
        int i11;
        if (this.f95327q == -1 || this.f95330t == -9223372036854775807L || vVar == null || vVar.c() == 0 || vVar2 == null || vVar2.c() != vVar.c()) {
            return new z.b(this.f95330t);
        }
        int iC = vVar.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i12 = 0;
        for (int i13 = 0; i13 < iC; i13++) {
            jArrCopyOf3[i13] = vVar.b(i13);
            jArrCopyOf[i13] = this.f95327q + vVar2.b(i13);
        }
        while (true) {
            i11 = iC - 1;
            if (i12 >= i11) {
                break;
            }
            int i14 = i12 + 1;
            iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
            jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
            i12 = i14;
        }
        iArrCopyOf[i11] = (int) ((this.f95327q + this.f95326p) - jArrCopyOf[i11]);
        long j11 = this.f95330t - jArrCopyOf3[i11];
        jArrCopyOf2[i11] = j11;
        if (j11 <= 0) {
            u.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j11);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i11);
        }
        return new hr.c(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @RequiresNonNull({"#1.output"})
    private void n(c cVar, long j11, int i11, int i12, int i13) {
        int iG;
        c0 c0Var = cVar.T;
        if (c0Var != null) {
            c0Var.c(cVar.X, j11, i11, i12, i13, cVar.f95347j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f95339b) || "S_TEXT/ASS".equals(cVar.f95339b) || "S_TEXT/WEBVTT".equals(cVar.f95339b)) {
                if (this.K > 1) {
                    u.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.I;
                    if (j12 == -9223372036854775807L) {
                        u.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        E(cVar.f95339b, j12, this.f95321k.e());
                        for (int iF = this.f95321k.f(); iF < this.f95321k.g(); iF++) {
                            if (this.f95321k.e()[iF] == 0) {
                                this.f95321k.T(iF);
                                break;
                            }
                        }
                        b0 b0Var = cVar.X;
                        d0 d0Var = this.f95321k;
                        b0Var.d(d0Var, d0Var.g());
                        iG = i12 + this.f95321k.g();
                    }
                }
                iG = i12;
            } else {
                iG = i12;
            }
            if ((i11 & 268435456) != 0) {
                if (this.K > 1) {
                    this.f95324n.Q(0);
                } else {
                    int iG2 = this.f95324n.g();
                    cVar.X.f(this.f95324n, iG2, 2);
                    iG += iG2;
                }
            }
            cVar.X.e(j11, i11, iG, i13, cVar.f95347j);
        }
        this.F = true;
    }

    private static int[] p(int[] iArr, int i11) {
        if (iArr == null) {
            return new int[i11];
        }
        return iArr.length >= i11 ? iArr : new int[Math.max(iArr.length * 2, i11)];
    }

    private int q() {
        int i11 = this.T;
        C();
        return i11;
    }

    private static byte[] s(long j11, String str, long j12) {
        ts.a.a(j11 != -9223372036854775807L);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - (((long) i11) * 3600000000L);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - (((long) i12) * 60000000);
        int i13 = (int) (j14 / 1000000);
        return p0.l0(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (((long) i13) * 1000000)) / j12))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean y(String str) {
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
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b11 = 26;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b11 = 27;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b11 = 28;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b11 = 29;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b11 = 30;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b11 = 31;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b11 = 32;
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
                return true;
            default:
                return false;
        }
    }

    protected void F(int i11, long j11, long j12) throws ParserException {
        k();
        if (i11 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i11 == 174) {
            this.f95331u = new c();
            return;
        }
        if (i11 == 187) {
            this.E = false;
            return;
        }
        if (i11 == 19899) {
            this.f95333w = -1;
            this.f95334x = -1L;
            return;
        }
        if (i11 == 20533) {
            t(i11).f95345h = true;
            return;
        }
        if (i11 == 21968) {
            t(i11).f95361x = true;
            return;
        }
        if (i11 == 408125543) {
            long j13 = this.f95327q;
            if (j13 != -1 && j13 != j11) {
                throw ParserException.a("Multiple Segment elements not supported", null);
            }
            this.f95327q = j11;
            this.f95326p = j12;
            return;
        }
        if (i11 == 475249515) {
            this.C = new v();
            this.D = new v();
        } else if (i11 == 524531317 && !this.f95332v) {
            if (this.f95314d && this.f95336z != -1) {
                this.f95335y = true;
            } else {
                this.f95312b0.p(new z.b(this.f95330t));
                this.f95332v = true;
            }
        }
    }

    protected void G(int i11, String str) throws ParserException {
        if (i11 == 134) {
            t(i11).f95339b = str;
            return;
        }
        if (i11 != 17026) {
            if (i11 == 21358) {
                t(i11).f95338a = str;
                return;
            } else {
                if (i11 != 2274716) {
                    return;
                }
                t(i11).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ParserException.a("DocType " + str + " not supported", null);
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f95309a.reset();
        this.f95311b.e();
        C();
        for (int i11 = 0; i11 < this.f95313c.size(); i11++) {
            this.f95313c.valueAt(i11).n();
        }
    }

    @Override // hr.k
    public final void e(m mVar) {
        this.f95312b0 = mVar;
    }

    @Override // hr.k
    public final boolean h(l lVar) {
        return new f().b(lVar);
    }

    @Override // hr.k
    public final int i(l lVar, hr.y yVar) {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f95309a.a(lVar);
            if (zA && A(yVar, lVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f95313c.size(); i11++) {
            c cVarValueAt = this.f95313c.valueAt(i11);
            cVarValueAt.f();
            cVarValueAt.j();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    protected void l(int i11, int i12, l lVar) throws ParserException {
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
        l lVar2 = lVar;
        int i23 = 0;
        int i24 = 1;
        if (i11 != 161 && i11 != 163) {
            if (i11 == 165) {
                if (this.G != 2) {
                    return;
                }
                w(this.f95313c.get(this.M), this.P, lVar2, i12);
                return;
            }
            if (i11 == 16877) {
                v(t(i11), lVar2, i12);
                return;
            }
            if (i11 == 16981) {
                j(i11);
                byte[] bArr = new byte[i12];
                this.f95331u.f95346i = bArr;
                lVar2.readFully(bArr, 0, i12);
                return;
            }
            if (i11 == 18402) {
                byte[] bArr2 = new byte[i12];
                lVar2.readFully(bArr2, 0, i12);
                t(i11).f95347j = new b0.a(1, bArr2, 0, 0);
                return;
            }
            if (i11 == 21419) {
                Arrays.fill(this.f95319i.e(), (byte) 0);
                lVar2.readFully(this.f95319i.e(), 4 - i12, i12);
                this.f95319i.U(0);
                this.f95333w = (int) this.f95319i.J();
                return;
            }
            if (i11 == 25506) {
                j(i11);
                byte[] bArr3 = new byte[i12];
                this.f95331u.f95348k = bArr3;
                lVar2.readFully(bArr3, 0, i12);
                return;
            }
            if (i11 != 30322) {
                throw ParserException.a("Unexpected id: " + i11, null);
            }
            j(i11);
            byte[] bArr4 = new byte[i12];
            this.f95331u.f95359v = bArr4;
            lVar2.readFully(bArr4, 0, i12);
            return;
        }
        int i25 = 8;
        if (this.G == 0) {
            this.M = (int) this.f95311b.d(lVar2, false, true, 8);
            this.N = this.f95311b.b();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.f95317g.Q(0);
        }
        c cVar = this.f95313c.get(this.M);
        if (cVar == null) {
            lVar2.k(i12 - this.N);
            this.G = 0;
            return;
        }
        cVar.f();
        if (this.G == 1) {
            B(lVar2, 3);
            int i26 = (this.f95317g.e()[2] & 6) >> 1;
            if (i26 == 0) {
                this.K = 1;
                int[] iArrP = p(this.L, 1);
                this.L = iArrP;
                iArrP[0] = (i12 - this.N) - 3;
            } else {
                B(lVar2, 4);
                int i27 = (this.f95317g.e()[3] & 255) + 1;
                this.K = i27;
                int[] iArrP2 = p(this.L, i27);
                this.L = iArrP2;
                if (i26 == 2) {
                    int i28 = (i12 - this.N) - 4;
                    int i29 = this.K;
                    Arrays.fill(iArrP2, 0, i29, i28 / i29);
                } else {
                    if (i26 == 1) {
                        int i31 = 0;
                        int i32 = 0;
                        int i33 = 4;
                        while (true) {
                            i18 = this.K;
                            if (i31 >= i18 - 1) {
                                break;
                            }
                            this.L[i31] = 0;
                            while (true) {
                                i19 = i33 + 1;
                                B(lVar2, i19);
                                int i34 = this.f95317g.e()[i33] & 255;
                                int[] iArr = this.L;
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
                        this.L[i18 - 1] = ((i12 - this.N) - i33) - i32;
                    } else {
                        if (i26 != 3) {
                            throw ParserException.a("Unexpected lacing value: " + i26, null);
                        }
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 4;
                        while (true) {
                            int i38 = this.K;
                            i13 = i24;
                            if (i35 >= i38 - 1) {
                                i14 = i23;
                                this.L[i38 - 1] = ((i12 - this.N) - i37) - i36;
                                break;
                            }
                            this.L[i35] = i23;
                            int i39 = i37 + 1;
                            B(lVar2, i39);
                            if (this.f95317g.e()[i37] == 0) {
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
                                if ((this.f95317g.e()[i37] & i42) != 0) {
                                    i39 += i41;
                                    B(lVar2, i39);
                                    int i43 = i37 + 1;
                                    j11 = this.f95317g.e()[i37] & 255 & (~i42);
                                    while (true) {
                                        int i44 = i43;
                                        if (i44 >= i39) {
                                            break;
                                        }
                                        i43 = i44 + 1;
                                        j11 = (j11 << i16) | ((long) (this.f95317g.e()[i44] & 255));
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
                                lVar2 = lVar;
                                i23 = i15;
                                i25 = i16;
                            }
                            i37 = i39;
                            if (j11 < -2147483648L || j11 > 2147483647L) {
                                throw ParserException.a("EBML lacing sample size out of range.", null);
                            }
                            int i45 = (int) j11;
                            int[] iArr2 = this.L;
                            if (i17 != 0) {
                                i45 += iArr2[i17 - 1];
                            }
                            iArr2[i17] = i45;
                            i36 += i45;
                            i35 = i17 + 1;
                            lVar2 = lVar;
                            i24 = i13;
                            i23 = i15;
                            i25 = i16;
                        }
                    }
                    this.H = this.B + D((this.f95317g.e()[i14] << 8) | (this.f95317g.e()[i13] & 255));
                    if (cVar.f95341d != 2 || (i11 == 163 && (this.f95317g.e()[2] & 128) == 128)) {
                        i22 = i13;
                    } else {
                        i22 = i14;
                    }
                    this.O = i22;
                    this.G = 2;
                    this.J = i14;
                }
            }
            i14 = 0;
            i13 = 1;
            this.H = this.B + D((this.f95317g.e()[i14] << 8) | (this.f95317g.e()[i13] & 255));
            if (cVar.f95341d != 2) {
                i22 = i13;
            } else {
                i22 = i13;
            }
            this.O = i22;
            this.G = 2;
            this.J = i14;
        } else {
            i13 = 1;
        }
        if (i11 == 163) {
            while (true) {
                int i46 = this.J;
                if (i46 >= this.K) {
                    this.G = 0;
                    return;
                }
                int iH = H(lVar, cVar, this.L[i46], false);
                c cVar2 = cVar;
                n(cVar2, this.H + ((long) ((this.J * cVar.f95342e) / 1000)), this.O, iH, 0);
                this.J++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i47 = this.J;
                if (i47 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                boolean z11 = i13;
                iArr3[i47] = H(lVar, cVar, iArr3[i47], z11);
                this.J += z11 ? 1 : 0;
            }
        }
    }

    protected void o(int i11) throws ParserException {
        k();
        if (i11 == 160) {
            if (this.G != 2) {
                return;
            }
            c cVar = this.f95313c.get(this.M);
            cVar.f();
            if (this.R > 0 && "A_OPUS".equals(cVar.f95339b)) {
                this.f95324n.R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.K; i13++) {
                i12 += this.L[i13];
            }
            int i14 = 0;
            while (i14 < this.K) {
                long j11 = this.H + ((long) ((cVar.f95342e * i14) / 1000));
                int i15 = this.O;
                if (i14 == 0 && !this.Q) {
                    i15 |= 1;
                }
                int i16 = this.L[i14];
                int i17 = i12 - i16;
                n(cVar, j11, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.G = 0;
            return;
        }
        if (i11 == 174) {
            c cVar2 = (c) ts.a.i(this.f95331u);
            String str = cVar2.f95339b;
            if (str == null) {
                throw ParserException.a("CodecId is missing in TrackEntry element", null);
            }
            if (y(str)) {
                cVar2.i(this.f95312b0, cVar2.f95340c);
                this.f95313c.put(cVar2.f95340c, cVar2);
            }
            this.f95331u = null;
            return;
        }
        if (i11 == 19899) {
            int i18 = this.f95333w;
            if (i18 != -1) {
                long j12 = this.f95334x;
                if (j12 != -1) {
                    if (i18 == 475249515) {
                        this.f95336z = j12;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i11 == 25152) {
            j(i11);
            c cVar3 = this.f95331u;
            if (cVar3.f95345h) {
                if (cVar3.f95347j == null) {
                    throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f95349l = new h(new h.b(br.d.f17902a, "video/webm", this.f95331u.f95347j.f73304b));
                return;
            }
            return;
        }
        if (i11 == 28032) {
            j(i11);
            c cVar4 = this.f95331u;
            if (cVar4.f95345h && cVar4.f95346i != null) {
                throw ParserException.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i11 == 357149030) {
            if (this.f95328r == -9223372036854775807L) {
                this.f95328r = 1000000L;
            }
            long j13 = this.f95329s;
            if (j13 != -9223372036854775807L) {
                this.f95330t = D(j13);
                return;
            }
            return;
        }
        if (i11 == 374648427) {
            if (this.f95313c.size() == 0) {
                throw ParserException.a("No valid tracks were found", null);
            }
            this.f95312b0.j();
        } else {
            if (i11 != 475249515) {
                return;
            }
            if (!this.f95332v) {
                this.f95312b0.p(m(this.C, this.D));
                this.f95332v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    protected void r(int i11, double d11) {
        if (i11 == 181) {
            t(i11).Q = (int) d11;
            return;
        }
        if (i11 == 17545) {
            this.f95329s = (long) d11;
            return;
        }
        switch (i11) {
            case 21969:
                t(i11).D = (float) d11;
                break;
            case 21970:
                t(i11).E = (float) d11;
                break;
            case 21971:
                t(i11).F = (float) d11;
                break;
            case 21972:
                t(i11).G = (float) d11;
                break;
            case 21973:
                t(i11).H = (float) d11;
                break;
            case 21974:
                t(i11).I = (float) d11;
                break;
            case 21975:
                t(i11).J = (float) d11;
                break;
            case 21976:
                t(i11).K = (float) d11;
                break;
            case 21977:
                t(i11).L = (float) d11;
                break;
            case 21978:
                t(i11).M = (float) d11;
                break;
            default:
                switch (i11) {
                    case 30323:
                        t(i11).f95356s = (float) d11;
                        break;
                    case 30324:
                        t(i11).f95357t = (float) d11;
                        break;
                    case 30325:
                        t(i11).f95358u = (float) d11;
                        break;
                }
                break;
        }
    }

    protected c t(int i11) throws ParserException {
        j(i11);
        return this.f95331u;
    }

    protected int u(int i11) {
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

    protected void v(c cVar, l lVar, int i11) {
        if (cVar.f95344g != 1685485123 && cVar.f95344g != 1685480259) {
            lVar.k(i11);
            return;
        }
        byte[] bArr = new byte[i11];
        cVar.N = bArr;
        lVar.readFully(bArr, 0, i11);
    }

    protected void w(c cVar, int i11, l lVar, int i12) {
        if (i11 != 4 || !"V_VP9".equals(cVar.f95339b)) {
            lVar.k(i12);
        } else {
            this.f95324n.Q(i12);
            lVar.readFully(this.f95324n.e(), 0, i12);
        }
    }

    protected void x(int i11, long j11) throws ParserException {
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
                t(i11).f95341d = (int) j11;
                return;
            case 136:
                t(i11).V = j11 == 1;
                return;
            case 155:
                this.I = D(j11);
                return;
            case 159:
                t(i11).O = (int) j11;
                return;
            case 176:
                t(i11).f95350m = (int) j11;
                return;
            case 179:
                g(i11);
                this.C.a(D(j11));
                return;
            case 186:
                t(i11).f95351n = (int) j11;
                return;
            case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                t(i11).f95340c = (int) j11;
                return;
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                this.B = D(j11);
                return;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                this.P = (int) j11;
                return;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                if (this.E) {
                    return;
                }
                g(i11);
                this.D.a(j11);
                this.E = true;
                return;
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                this.Q = true;
                return;
            case 16871:
                t(i11).f95344g = (int) j11;
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
                this.f95334x = j11 + this.f95327q;
                return;
            case 21432:
                int i12 = (int) j11;
                j(i11);
                if (i12 == 0) {
                    this.f95331u.f95360w = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f95331u.f95360w = 2;
                    return;
                } else if (i12 == 3) {
                    this.f95331u.f95360w = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.f95331u.f95360w = 3;
                    return;
                }
            case 21680:
                t(i11).f95352o = (int) j11;
                return;
            case 21682:
                t(i11).f95354q = (int) j11;
                return;
            case 21690:
                t(i11).f95353p = (int) j11;
                return;
            case 21930:
                t(i11).U = j11 == 1;
                return;
            case 21998:
                t(i11).f95343f = (int) j11;
                return;
            case 22186:
                t(i11).R = j11;
                return;
            case 22203:
                t(i11).S = j11;
                return;
            case 25188:
                t(i11).P = (int) j11;
                return;
            case 30114:
                this.R = j11;
                return;
            case 30321:
                j(i11);
                int i13 = (int) j11;
                if (i13 == 0) {
                    this.f95331u.f95355r = 0;
                    return;
                }
                if (i13 == 1) {
                    this.f95331u.f95355r = 1;
                    return;
                } else if (i13 == 2) {
                    this.f95331u.f95355r = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f95331u.f95355r = 3;
                    return;
                }
            case 2352003:
                t(i11).f95342e = (int) j11;
                return;
            case 2807729:
                this.f95328r = j11;
                return;
            default:
                switch (i11) {
                    case 21945:
                        j(i11);
                        int i14 = (int) j11;
                        if (i14 == 1) {
                            this.f95331u.A = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.f95331u.A = 1;
                            return;
                        }
                    case 21946:
                        j(i11);
                        int i15 = us.c.i((int) j11);
                        if (i15 != -1) {
                            this.f95331u.f95363z = i15;
                            return;
                        }
                        return;
                    case 21947:
                        j(i11);
                        this.f95331u.f95361x = true;
                        int iH = us.c.h((int) j11);
                        if (iH != -1) {
                            this.f95331u.f95362y = iH;
                            return;
                        }
                        return;
                    case 21948:
                        t(i11).B = (int) j11;
                        return;
                    case 21949:
                        t(i11).C = (int) j11;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean z(int i11) {
        return i11 == 357149030 || i11 == 524531317 || i11 == 475249515 || i11 == 374648427;
    }

    public e(int i11) {
        this(new nr.a(), i11);
    }

    e(nr.c cVar, int i11) {
        this.f95327q = -1L;
        this.f95328r = -9223372036854775807L;
        this.f95329s = -9223372036854775807L;
        this.f95330t = -9223372036854775807L;
        this.f95336z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f95309a = cVar;
        cVar.b(new b());
        this.f95314d = (i11 & 1) == 0;
        this.f95311b = new g();
        this.f95313c = new SparseArray<>();
        this.f95317g = new d0(4);
        this.f95318h = new d0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f95319i = new d0(4);
        this.f95315e = new d0(ts.z.f115086a);
        this.f95316f = new d0(4);
        this.f95320j = new d0();
        this.f95321k = new d0();
        this.f95322l = new d0(8);
        this.f95323m = new d0();
        this.f95324n = new d0();
        this.L = new int[1];
    }

    @Override // hr.k
    public final void release() {
    }
}
