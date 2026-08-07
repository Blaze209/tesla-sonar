package e7;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.net.SyslogConstants;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.math.ec.Tnaf;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final SimpleDateFormat V;
    private static final SimpleDateFormat W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final e[] f62143a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final e[] f62144b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final e[] f62145c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final e[] f62146d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final e[] f62147e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final e f62148f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final e[] f62149g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final e[] f62150h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final e[] f62151i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final e[] f62152j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final e[][] f62153k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final e[] f62154l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashMap<Integer, e>[] f62155m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashMap<String, e>[] f62156n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Set<String> f62157o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f62158p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Charset f62159q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final byte[] f62160r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final byte[] f62161s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f62162t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f62163u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f62164v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final Pattern f62166w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f62171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f62172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f62175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<Integer> f62176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f62177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f62178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f62180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f62181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f62182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f62183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f62184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f62185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f62186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f62187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f62188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f62189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f62190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f62191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f62165w = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List<Integer> f62167x = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List<Integer> f62168y = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f62169z = {8, 8, 8};
    public static final int[] A = {4};
    public static final int[] B = {8};
    static final byte[] C = {-1, -40, -1};
    private static final byte[] D = {102, 116, 121, 112};
    private static final byte[] E = {109, 105, 102, 49};
    private static final byte[] F = {104, 101, 105, 99};
    private static final byte[] G = {97, 118, 105, 102};
    private static final byte[] H = {97, 118, 105, 115};
    private static final byte[] I = {79, 76, 89, 77, 80, 0};
    private static final byte[] J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] K = {-119, 80, 78, 71, 13, 10, 26, 10};
    static final byte[] L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    private static final byte[] M = {82, 73, 70, 70};
    private static final byte[] N = {87, 69, 66, 80};
    private static final byte[] O = {69, 88, 73, 70};
    private static final byte[] P = {-99, 1, 42};
    private static final byte[] Q = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] S = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] U = "ANMF".getBytes(Charset.defaultCharset());
    private static final String[] X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] Z = {65, 83, 67, 73, 73, 0, 0, 0};

    private static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DataOutputStream f62200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteOrder f62201b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f62200a = new DataOutputStream(outputStream);
            this.f62201b = byteOrder;
        }

        public void B(int i11) throws IOException {
            if (i11 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            p((short) i11);
        }

        public void c(ByteOrder byteOrder) {
            this.f62201b = byteOrder;
        }

        public void n(int i11) throws IOException {
            this.f62200a.write(i11);
        }

        public void o(int i11) throws IOException {
            ByteOrder byteOrder = this.f62201b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f62200a.write(i11 & 255);
                this.f62200a.write((i11 >>> 8) & 255);
                this.f62200a.write((i11 >>> 16) & 255);
                this.f62200a.write((i11 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f62200a.write((i11 >>> 24) & 255);
                this.f62200a.write((i11 >>> 16) & 255);
                this.f62200a.write((i11 >>> 8) & 255);
                this.f62200a.write(i11 & 255);
            }
        }

        public void p(short s11) throws IOException {
            ByteOrder byteOrder = this.f62201b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f62200a.write(s11 & 255);
                this.f62200a.write((s11 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f62200a.write((s11 >>> 8) & 255);
                this.f62200a.write(s11 & 255);
            }
        }

        public void t(long j11) throws IOException {
            if (j11 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            o((int) j11);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f62200a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            this.f62200a.write(bArr, i11, i12);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f62204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f62205d;

        d(int i11, int i12, byte[] bArr) {
            this(i11, i12, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f62159q0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d11 : dArr) {
                byteBufferWrap.putDouble(d11);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i11 : iArr) {
                byteBufferWrap.putInt(i11);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f62210a);
                byteBufferWrap.putInt((int) fVar.f62211b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f62159q0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j11, ByteOrder byteOrder) {
            return g(new long[]{j11}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j11 : jArr) {
                byteBufferWrap.putInt((int) j11);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f62210a);
                byteBufferWrap.putInt((int) fVar.f62211b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i11, ByteOrder byteOrder) {
            return k(new int[]{i11}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.Y[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i11 : iArr) {
                byteBufferWrap.putShort((short) i11);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i11 < jArr.length) {
                    sb2.append(jArr[i11]);
                    i11++;
                    if (i11 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i11 < iArr.length) {
                    sb2.append(iArr[i11]);
                    i11++;
                    if (i11 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i11 < dArr.length) {
                    sb2.append(dArr[i11]);
                    i11++;
                    if (i11 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i11 < fVarArr.length) {
                sb2.append(fVarArr[i11].f62210a);
                sb2.append('/');
                sb2.append(fVarArr[i11].f62211b);
                i11++;
                if (i11 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:18:0x0031 */
        Object o(ByteOrder byteOrder) throws Throwable {
            Throwable th2;
            IOException iOException;
            b bVar;
            InputStream inputStream;
            byte b11;
            byte b12;
            Object str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f62205d);
                    try {
                        bVar.t(byteOrder);
                        int length = 0;
                        switch (this.f62202a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f62205d;
                                if (bArr.length == 1 && (b11 = bArr[0]) >= 0 && b11 <= 1) {
                                    str = new String(new char[]{(char) (b11 + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, a.f62159q0);
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e11) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                        return str2;
                                    }
                                }
                                break;
                            case 2:
                            case 7:
                                if (this.f62203b >= a.Z.length) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= a.Z.length) {
                                            length = a.Z.length;
                                        } else if (this.f62205d[i11] == a.Z[i11]) {
                                            i11++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (length < this.f62203b && (b12 = this.f62205d[length]) != 0) {
                                    if (b12 >= 32) {
                                        sb2.append((char) b12);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                str = sb2.toString();
                                break;
                            case 3:
                                int[] iArr = new int[this.f62203b];
                                while (true) {
                                    str = iArr;
                                    if (length < this.f62203b) {
                                        iArr[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                }
                                break;
                            case 4:
                                long[] jArr = new long[this.f62203b];
                                while (true) {
                                    str = jArr;
                                    if (length < this.f62203b) {
                                        jArr[length] = bVar.p();
                                        length++;
                                    }
                                }
                                break;
                            case 5:
                                f[] fVarArr = new f[this.f62203b];
                                while (true) {
                                    str = fVarArr;
                                    if (length < this.f62203b) {
                                        fVarArr[length] = new f(bVar.p(), bVar.p(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 8:
                                int[] iArr2 = new int[this.f62203b];
                                while (true) {
                                    str = iArr2;
                                    if (length < this.f62203b) {
                                        iArr2[length] = bVar.readShort();
                                        length++;
                                    }
                                }
                                break;
                            case 9:
                                int[] iArr3 = new int[this.f62203b];
                                while (true) {
                                    str = iArr3;
                                    if (length < this.f62203b) {
                                        iArr3[length] = bVar.readInt();
                                        length++;
                                    }
                                }
                                break;
                            case 10:
                                f[] fVarArr2 = new f[this.f62203b];
                                while (true) {
                                    str = fVarArr2;
                                    if (length < this.f62203b) {
                                        fVarArr2[length] = new f(bVar.readInt(), bVar.readInt(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 11:
                                double[] dArr = new double[this.f62203b];
                                while (true) {
                                    str = dArr;
                                    if (length < this.f62203b) {
                                        dArr[length] = bVar.readFloat();
                                        length++;
                                    }
                                }
                                break;
                            case 12:
                                double[] dArr2 = new double[this.f62203b];
                                while (true) {
                                    str = dArr2;
                                    if (length < this.f62203b) {
                                        dArr2[length] = bVar.readDouble();
                                        length++;
                                    }
                                }
                                break;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e13) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            return str;
                        }
                    } catch (IOException e14) {
                        iOException = e14;
                        Log.w("ExifInterface", "IOException occurred during reading a value", iOException);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th2;
                    }
                    try {
                        inputStream2.close();
                        throw th2;
                    } catch (IOException e16) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                        throw th2;
                    }
                }
            } catch (IOException e17) {
                iOException = e17;
                bVar = null;
            } catch (Throwable th4) {
                th2 = th4;
                if (inputStream2 != null) {
                    throw th2;
                }
                inputStream2.close();
                throw th2;
            }
        }

        public int p() {
            return a.Y[this.f62202a] * this.f62203b;
        }

        public String toString() {
            return "(" + a.X[this.f62202a] + ", data length:" + this.f62205d.length + ")";
        }

        d(int i11, int i12, long j11, byte[] bArr) {
            this.f62202a = i11;
            this.f62203b = i12;
            this.f62204c = j11;
            this.f62205d = bArr;
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62211b;

        /* synthetic */ f(long j11, long j12, C1277a c1277a) {
            this(j11, j12);
        }

        public static f b(double d11) {
            long j11;
            long j12;
            long j13 = 1;
            if (d11 >= 9.223372036854776E18d || d11 <= -9.223372036854776E18d) {
                return new f(d11 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d11);
            long j14 = 0;
            long j15 = 1;
            double d12 = dAbs;
            long j16 = 0;
            while (true) {
                double d13 = d12 % 1.0d;
                long j17 = (long) (d12 - d13);
                j11 = j16 + (j17 * j13);
                j12 = (j17 * j14) + j15;
                d12 = 1.0d / d13;
                long j18 = j13;
                if (Math.abs(dAbs - (j11 / j12)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j15 = j14;
                j13 = j11;
                j16 = j18;
                j14 = j12;
            }
            if (d11 < 0.0d) {
                j11 = -j11;
            }
            return new f(j11, j12);
        }

        public double a() {
            return this.f62210a / this.f62211b;
        }

        public String toString() {
            return this.f62210a + "/" + this.f62211b;
        }

        private f(long j11, long j12) {
            if (j12 == 0) {
                this.f62210a = 0L;
                this.f62211b = 1L;
            } else {
                this.f62210a = j11;
                this.f62211b = j12;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new e("BitsPerSample", EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new e("Compression", EnumC4419g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new e("PhotometricInterpretation", EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new e("ImageDescription", EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 2), new e("Make", EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new e("Model", EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new e("StripOffsets", EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new e("Orientation", EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new e("SamplesPerPixel", EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new e("RowsPerStrip", EnumC4419g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new e("StripByteCounts", EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new e("XResolution", EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new e("YResolution", EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new e("PlanarConfiguration", EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new e("ResolutionUnit", EnumC4419g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new e("TransferFunction", EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 3), new e("Software", EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new e("DateTime", EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new e("Artist", EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new e("WhitePoint", EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new e("PrimaryChromaticities", EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f62143a0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f62144b0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f62145c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f62146d0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new e("BitsPerSample", EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new e("Compression", EnumC4419g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new e("PhotometricInterpretation", EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new e("ImageDescription", EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 2), new e("Make", EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new e("Model", EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new e("StripOffsets", EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new e("ThumbnailOrientation", EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new e("SamplesPerPixel", EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new e("RowsPerStrip", EnumC4419g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new e("StripByteCounts", EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new e("XResolution", EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new e("YResolution", EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new e("PlanarConfiguration", EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new e("ResolutionUnit", EnumC4419g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new e("TransferFunction", EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 3), new e("Software", EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new e("DateTime", EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new e("Artist", EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new e("WhitePoint", EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new e("PrimaryChromaticities", EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f62147e0 = eVarArr5;
        f62148f0 = new e("StripOffsets", EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f62149g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 4), new e("PreviewImageLength", EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE, 4)};
        f62150h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f62151i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f62152j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f62153k0 = eVarArr10;
        f62154l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f62155m0 = new HashMap[eVarArr10.length];
        f62156n0 = new HashMap[eVarArr10.length];
        f62157o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f62158p0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f62159q0 = charsetForName;
        f62160r0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f62161s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        V = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            e[][] eVarArr11 = f62153k0;
            if (i11 >= eVarArr11.length) {
                HashMap<Integer, Integer> map = f62158p0;
                e[] eVarArr12 = f62154l0;
                map.put(Integer.valueOf(eVarArr12[0].f62206a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f62206a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f62206a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f62206a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f62206a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f62206a), 8);
                f62162t0 = Pattern.compile(".*[1-9].*");
                f62163u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f62164v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f62166w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f62155m0[i11] = new HashMap<>();
            f62156n0[i11] = new HashMap<>();
            for (e eVar : eVarArr11[i11]) {
                f62155m0[i11].put(Integer.valueOf(eVar.f62206a), eVar);
                f62156n0[i11].put(eVar.f62207b, eVar);
            }
            i11++;
        }
    }

    public a(File file) throws Throwable {
        e[][] eVarArr = f62153k0;
        this.f62175f = new HashMap[eVarArr.length];
        this.f62176g = new HashSet(eVarArr.length);
        this.f62177h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        G(file.getAbsolutePath());
    }

    private void B(b bVar) throws Throwable {
        if (f62165w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.t(ByteOrder.LITTLE_ENDIAN);
        bVar.B(M.length);
        int i11 = bVar.readInt() + 8;
        byte[] bArr = N;
        bVar.B(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i12 = bVar.readInt();
                int i13 = length + 8;
                if (Arrays.equals(O, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i12];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f62160r0;
                    if (e7.b.f(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i12);
                    }
                    this.f62185p = i13;
                    X(bArrCopyOfRange, 0);
                    k0(new b(bArrCopyOfRange));
                    return;
                }
                if (i12 % 2 == 1) {
                    i12++;
                }
                length = i13 + i12;
                if (length == i11) {
                    return;
                }
                if (length > i11) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.B(i12);
            } catch (EOFException e11) {
                throw new IOException("Encountered corrupt WebP file.", e11);
            }
        }
    }

    private static int C(int i11) {
        if (i11 != 4) {
            return (i11 == 9 || i11 == 15 || i11 == 12 || i11 == 13) ? 2 : 1;
        }
        return 3;
    }

    private static Pair<Integer, Integer> D(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairD = D(strArrSplit[0]);
            if (((Integer) pairD.first).intValue() == 2) {
                return pairD;
            }
            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                Pair<Integer, Integer> pairD2 = D(strArrSplit[i11]);
                int iIntValue = (((Integer) pairD2.first).equals(pairD.first) || ((Integer) pairD2.second).equals(pairD.first)) ? ((Integer) pairD.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairD.second).intValue() == -1 || !(((Integer) pairD2.first).equals(pairD.second) || ((Integer) pairD2.second).equals(pairD.second))) ? -1 : ((Integer) pairD.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairD = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairD = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairD;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j11 = Long.parseLong(str);
                    if (j11 < 0 || j11 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return j11 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j12 = (long) Double.parseDouble(strArrSplit2[0]);
                long j13 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j12 >= 0 && j13 >= 0) {
                    if (j12 <= 2147483647L && j13 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void E(b bVar, HashMap<String, d> map) throws Throwable {
        d dVar = map.get("JPEGInterchangeFormat");
        d dVar2 = map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f62177h);
        int iM2 = dVar2.m(this.f62177h);
        if (this.f62173d == 7) {
            iM += this.f62186q;
        }
        if (iM > 0 && iM2 > 0) {
            this.f62178i = true;
            if (this.f62170a == null && this.f62172c == null && this.f62171b == null) {
                byte[] bArr = new byte[iM2];
                bVar.B(iM);
                bVar.readFully(bArr);
                this.f62183n = bArr;
            }
            this.f62181l = iM;
            this.f62182m = iM2;
        }
        if (f62165w) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iM2);
        }
    }

    private void F(b bVar, HashMap<String, d> map) throws IOException {
        int i11;
        d dVar = map.get("StripOffsets");
        d dVar2 = map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrC = e7.b.c(dVar.o(this.f62177h));
        long[] jArrC2 = e7.b.c(dVar2.o(this.f62177h));
        if (jArrC == null || jArrC.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j11 = 0;
        for (long j12 : jArrC2) {
            j11 += j12;
        }
        int i12 = (int) j11;
        byte[] bArr = new byte[i12];
        int i13 = 1;
        this.f62180k = true;
        this.f62179j = true;
        this.f62178i = true;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < jArrC.length) {
            int i17 = (int) jArrC[i14];
            int i18 = (int) jArrC2[i14];
            if (i14 < jArrC.length - i13) {
                i11 = i14;
                if (i17 + i18 != jArrC[i11 + 1]) {
                    this.f62180k = false;
                }
            } else {
                i11 = i14;
            }
            int i19 = i17 - i15;
            if (i19 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.B(i19);
                int i21 = i15 + i19;
                byte[] bArr2 = new byte[i18];
                try {
                    bVar.readFully(bArr2);
                    i15 = i21 + i18;
                    System.arraycopy(bArr2, 0, bArr, i16, i18);
                    i16 += i18;
                    i14 = i11 + 1;
                    i13 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i18 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i19 + " bytes.");
                return;
            }
        }
        this.f62183n = bArr;
        if (this.f62180k) {
            this.f62181l = (int) jArrC[0];
            this.f62182m = i12;
        }
    }

    private void G(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f62172c = null;
        this.f62170a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (O(fileInputStream2.getFD())) {
                    this.f62171b = fileInputStream2.getFD();
                } else {
                    this.f62171b = null;
                }
                T(fileInputStream2);
                e7.b.b(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                e7.b.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private int I(byte[] bArr) throws Throwable {
        long j11;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, D)) {
                        bVar2.close();
                        return 0;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j11 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return 0;
                        }
                    } else {
                        j11 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j12 = length - j11;
                    if (j12 < 8) {
                        bVar2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    for (long j13 = 0; j13 < j12 / 4; j13++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j13 != 1) {
                                if (Arrays.equals(bArr3, E)) {
                                    z11 = true;
                                } else if (Arrays.equals(bArr3, F)) {
                                    z12 = true;
                                } else if (Arrays.equals(bArr3, G) || Arrays.equals(bArr3, H)) {
                                    z13 = true;
                                }
                                if (!z11) {
                                    continue;
                                } else {
                                    if (z12) {
                                        bVar2.close();
                                        return 12;
                                    }
                                    if (z13) {
                                        bVar2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return 0;
                        }
                    }
                    bVar2.close();
                } catch (Exception e11) {
                    e = e11;
                    bVar = bVar2;
                    if (f62165w) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean J(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = C;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean K(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderW = W(bVar2);
                this.f62177h = byteOrderW;
                bVar2.t(byteOrderW);
                short s11 = bVar2.readShort();
                boolean z11 = s11 == 20306 || s11 == 21330;
                bVar2.close();
                return z11;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean L(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    private boolean M(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i11 = 0; i11 < bytes.length; i11++) {
            if (bArr[i11] != bytes[i11]) {
                return false;
            }
        }
        return true;
    }

    private boolean N(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderW = W(bVar2);
                this.f62177h = byteOrderW;
                bVar2.t(byteOrderW);
                boolean z11 = bVar2.readShort() == 85;
                bVar2.close();
                return z11;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean O(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f62165w) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean P(HashMap<String, d> map) {
        d dVar;
        int iM;
        d dVar2 = map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f62177h);
            int[] iArr2 = f62169z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f62173d == 3 && (dVar = map.get("PhotometricInterpretation")) != null && (((iM = dVar.m(this.f62177h)) == 1 && Arrays.equals(iArr, B)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f62165w) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean Q(int i11) {
        return i11 == 4 || i11 == 13 || i11 == 14;
    }

    private boolean R(HashMap<String, d> map) {
        d dVar = map.get("ImageLength");
        d dVar2 = map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f62177h) <= 512 && dVar2.m(this.f62177h) <= 512;
    }

    private boolean S(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = M;
            if (i11 >= bArr2.length) {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = N;
                    if (i12 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[M.length + i12 + 4] != bArr3[i12]) {
                        return false;
                    }
                    i12++;
                }
            } else {
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:12:0x001c, B:14:0x0020, B:15:0x002e, B:17:0x0036, B:19:0x003f, B:38:0x0071, B:25:0x0050, B:32:0x005e, B:35:0x0066, B:36:0x006a, B:37:0x006e, B:39:0x007b, B:41:0x0085, B:44:0x008d, B:47:0x0095, B:50:0x009d, B:55:0x00ab, B:57:0x00af), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private void T(InputStream inputStream) {
        boolean z11;
        for (int i11 = 0; i11 < f62153k0.length; i11++) {
            try {
                try {
                    this.f62175f[i11] = new HashMap<>();
                } catch (Throwable th2) {
                    e();
                    if (f62165w) {
                        V();
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                e = e11;
                z11 = f62165w;
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z11) {
                    V();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e12) {
                e = e12;
                z11 = f62165w;
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z11) {
                    V();
                    return;
                }
                return;
            }
        }
        if (!this.f62174e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f62173d = r(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (l0(this.f62173d)) {
            g gVar = new g(inputStream);
            if (!this.f62174e) {
                int i12 = this.f62173d;
                if (i12 == 12 || i12 == 15) {
                    o(gVar, i12);
                } else if (i12 == 7) {
                    s(gVar);
                } else if (i12 == 10) {
                    x(gVar);
                } else {
                    v(gVar);
                }
            } else if (!y(gVar)) {
                e();
                if (f62165w) {
                    V();
                    return;
                }
                return;
            }
            gVar.C(this.f62185p);
            k0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i13 = this.f62173d;
            if (i13 == 4) {
                p(bVar, 0, 0);
            } else if (i13 == 13) {
                t(bVar);
            } else if (i13 == 9) {
                u(bVar);
            } else if (i13 == 14) {
                B(bVar);
            }
        }
        e();
        if (f62165w) {
            V();
        }
    }

    private void U(b bVar) throws IOException {
        ByteOrder byteOrderW = W(bVar);
        this.f62177h = byteOrderW;
        bVar.t(byteOrderW);
        int unsignedShort = bVar.readUnsignedShort();
        int i11 = this.f62173d;
        if (i11 != 7 && i11 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i12 = bVar.readInt();
        if (i12 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i12);
        }
        int i13 = i12 - 8;
        if (i13 > 0) {
            bVar.B(i13);
        }
    }

    private void V() {
        for (int i11 = 0; i11 < this.f62175f.length; i11++) {
            Log.d("ExifInterface", "The size of tag group[" + i11 + "]: " + this.f62175f[i11].size());
            for (Map.Entry<String, d> entry : this.f62175f[i11].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f62177h) + "'");
            }
        }
    }

    private ByteOrder W(b bVar) throws IOException {
        short s11 = bVar.readShort();
        if (s11 == 18761) {
            if (f62165w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s11 == 19789) {
            if (f62165w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s11));
    }

    private void X(byte[] bArr, int i11) throws IOException {
        g gVar = new g(bArr);
        U(gVar);
        Y(gVar, i11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0287  */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0307  */
    /* JADX WARN: Code duplicated, block: B:121:0x0333  */
    /* JADX WARN: Code duplicated, block: B:148:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:82:0x020f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0214  */
    /* JADX WARN: Code duplicated, block: B:84:0x0219  */
    /* JADX WARN: Code duplicated, block: B:86:0x0220  */
    /* JADX WARN: Code duplicated, block: B:89:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0287, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x029e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0144, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01d5, please report this as an issue */
    private void Y(g gVar, int i11) throws IOException {
        int i12;
        e eVar;
        long j11;
        boolean z11;
        boolean z12;
        e eVar2;
        Integer num;
        e eVar3;
        long j12;
        int unsignedShort;
        long jP;
        String str;
        int i13;
        this.f62176g.add(Integer.valueOf(gVar.n()));
        short s11 = gVar.readShort();
        if (f62165w) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s11));
        }
        if (s11 <= 0) {
            return;
        }
        short s12 = 0;
        while (s12 < s11) {
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i14 = gVar.readInt();
            long jN = ((long) gVar.n()) + 4;
            e eVar4 = f62155m0[i11].get(Integer.valueOf(unsignedShort2));
            boolean z13 = f62165w;
            if (z13) {
                i12 = 4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i11), Integer.valueOf(unsignedShort2), eVar4 != null ? eVar4.f62207b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i14)));
            } else {
                i12 = 4;
            }
            if (eVar4 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = Y;
                    if (unsignedShort3 < iArr.length) {
                        if (eVar4.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = eVar4.f62208c;
                            }
                            eVar = eVar4;
                            j11 = ((long) i14) * ((long) iArr[unsignedShort3]);
                            if (j11 < 0 || j11 > 2147483647L) {
                                if (z13) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i14);
                                }
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                        } else if (z13) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + X[unsignedShort3] + ") is unexpected for tag: " + eVar4.f62207b);
                        }
                    }
                    if (z11) {
                        if (j11 > 4) {
                            i13 = gVar.readInt();
                            if (z13) {
                                Log.d("ExifInterface", "seek to data offset: " + i13);
                            }
                            if (this.f62173d == 7) {
                                z12 = z13;
                                eVar2 = eVar;
                                if ("MakerNote".equals(eVar2.f62207b)) {
                                    this.f62186q = i13;
                                } else if (i11 != 6 && "ThumbnailImage".equals(eVar2.f62207b)) {
                                    this.f62187r = i13;
                                    this.f62188s = i14;
                                    d dVarJ = d.j(6, this.f62177h);
                                    d dVarF = d.f(this.f62187r, this.f62177h);
                                    d dVarF2 = d.f(this.f62188s, this.f62177h);
                                    this.f62175f[i12].put("Compression", dVarJ);
                                    this.f62175f[i12].put("JPEGInterchangeFormat", dVarF);
                                    this.f62175f[i12].put("JPEGInterchangeFormatLength", dVarF2);
                                }
                            } else {
                                z12 = z13;
                                eVar2 = eVar;
                            }
                            gVar.C(i13);
                        } else {
                            z12 = z13;
                            jN = jN;
                            eVar2 = eVar;
                        }
                        num = f62158p0.get(Integer.valueOf(unsignedShort2));
                        if (z12) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j11);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i12) {
                                    jP = gVar.p();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    jP = -1;
                                }
                                if (z12) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar2.f62207b));
                                }
                                if (jP > 0 || (gVar.c() != -1 && jP >= gVar.c())) {
                                    if (z12) {
                                        str = "Skip jump into the IFD since its offset is invalid: " + jP;
                                        if (gVar.c() != -1) {
                                            str = str + " (total length: " + gVar.c() + ")";
                                        }
                                        Log.d("ExifInterface", str);
                                    }
                                } else if (!this.f62176g.contains(Integer.valueOf((int) jP))) {
                                    gVar.C(jP);
                                    Y(gVar, num.intValue());
                                } else if (z12) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jP + ")");
                                }
                                gVar.C(jN);
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            jP = unsignedShort;
                            if (z12) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar2.f62207b));
                            }
                            if (jP > 0) {
                                if (z12) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jP;
                                    if (gVar.c() != -1) {
                                        str = str + " (total length: " + gVar.c() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jP;
                                if (gVar.c() != -1) {
                                    str = str + " (total length: " + gVar.c() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            gVar.C(jN);
                        } else {
                            int iN = gVar.n() + this.f62185p;
                            byte[] bArr = new byte[(int) j11];
                            gVar.readFully(bArr);
                            long j13 = iN;
                            eVar3 = eVar2;
                            j12 = jN;
                            d dVar = new d(unsignedShort3, i14, j13, bArr);
                            this.f62175f[i11].put(eVar3.f62207b, dVar);
                            if ("DNGVersion".equals(eVar3.f62207b)) {
                                this.f62173d = 3;
                            }
                            if (((!"Make".equals(eVar3.f62207b) || "Model".equals(eVar3.f62207b)) && dVar.n(this.f62177h).contains("PENTAX")) || ("Compression".equals(eVar3.f62207b) && dVar.m(this.f62177h) == 65535)) {
                                this.f62173d = 8;
                            }
                            if (gVar.n() != j12) {
                                gVar.C(j12);
                            }
                        }
                    } else {
                        gVar.C(jN);
                    }
                    s12 = (short) (s12 + 1);
                    s11 = s11;
                }
                eVar = eVar4;
                if (z13) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j11 = 0;
                z11 = false;
                if (z11) {
                    gVar.C(jN);
                } else {
                    if (j11 > 4) {
                        i13 = gVar.readInt();
                        if (z13) {
                            Log.d("ExifInterface", "seek to data offset: " + i13);
                        }
                        if (this.f62173d == 7) {
                            z12 = z13;
                            eVar2 = eVar;
                            if ("MakerNote".equals(eVar2.f62207b)) {
                                this.f62186q = i13;
                            } else if (i11 != 6) {
                            }
                        } else {
                            z12 = z13;
                            eVar2 = eVar;
                        }
                        gVar.C(i13);
                    } else {
                        z12 = z13;
                        jN = jN;
                        eVar2 = eVar;
                    }
                    num = f62158p0.get(Integer.valueOf(unsignedShort2));
                    if (z12) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j11);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i12) {
                                jP = gVar.p();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z12) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar2.f62207b));
                            }
                            if (jP > 0) {
                                if (z12) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jP;
                                    if (gVar.c() != -1) {
                                        str = str + " (total length: " + gVar.c() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jP;
                                if (gVar.c() != -1) {
                                    str = str + " (total length: " + gVar.c() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            gVar.C(jN);
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        jP = unsignedShort;
                        if (z12) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar2.f62207b));
                        }
                        if (jP > 0) {
                            if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jP;
                                if (gVar.c() != -1) {
                                    str = str + " (total length: " + gVar.c() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z12) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jP;
                            if (gVar.c() != -1) {
                                str = str + " (total length: " + gVar.c() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        gVar.C(jN);
                    } else {
                        int iN2 = gVar.n() + this.f62185p;
                        byte[] bArr2 = new byte[(int) j11];
                        gVar.readFully(bArr2);
                        long j14 = iN2;
                        eVar3 = eVar2;
                        j12 = jN;
                        d dVar2 = new d(unsignedShort3, i14, j14, bArr2);
                        this.f62175f[i11].put(eVar3.f62207b, dVar2);
                        if ("DNGVersion".equals(eVar3.f62207b)) {
                            this.f62173d = 3;
                        }
                        if (!"Make".equals(eVar3.f62207b)) {
                        }
                        this.f62173d = 8;
                        if (gVar.n() != j12) {
                            gVar.C(j12);
                        }
                    }
                }
                s12 = (short) (s12 + 1);
                s11 = s11;
            } else if (z13) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            eVar = eVar4;
            j11 = 0;
            z11 = false;
            if (z11) {
                gVar.C(jN);
            } else {
                if (j11 > 4) {
                    i13 = gVar.readInt();
                    if (z13) {
                        Log.d("ExifInterface", "seek to data offset: " + i13);
                    }
                    if (this.f62173d == 7) {
                        z12 = z13;
                        eVar2 = eVar;
                        if ("MakerNote".equals(eVar2.f62207b)) {
                            this.f62186q = i13;
                        } else if (i11 != 6) {
                        }
                    } else {
                        z12 = z13;
                        eVar2 = eVar;
                    }
                    gVar.C(i13);
                } else {
                    z12 = z13;
                    jN = jN;
                    eVar2 = eVar;
                }
                num = f62158p0.get(Integer.valueOf(unsignedShort2));
                if (z12) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j11);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i12) {
                            jP = gVar.p();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z12) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar2.f62207b));
                        }
                        if (jP > 0) {
                            if (z12) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jP;
                                if (gVar.c() != -1) {
                                    str = str + " (total length: " + gVar.c() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z12) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jP;
                            if (gVar.c() != -1) {
                                str = str + " (total length: " + gVar.c() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        gVar.C(jN);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    jP = unsignedShort;
                    if (z12) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jP), eVar2.f62207b));
                    }
                    if (jP > 0) {
                        if (z12) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jP;
                            if (gVar.c() != -1) {
                                str = str + " (total length: " + gVar.c() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                    } else if (z12) {
                        str = "Skip jump into the IFD since its offset is invalid: " + jP;
                        if (gVar.c() != -1) {
                            str = str + " (total length: " + gVar.c() + ")";
                        }
                        Log.d("ExifInterface", str);
                    }
                    gVar.C(jN);
                } else {
                    int iN3 = gVar.n() + this.f62185p;
                    byte[] bArr3 = new byte[(int) j11];
                    gVar.readFully(bArr3);
                    long j15 = iN3;
                    eVar3 = eVar2;
                    j12 = jN;
                    d dVar3 = new d(unsignedShort3, i14, j15, bArr3);
                    this.f62175f[i11].put(eVar3.f62207b, dVar3);
                    if ("DNGVersion".equals(eVar3.f62207b)) {
                        this.f62173d = 3;
                    }
                    if (!"Make".equals(eVar3.f62207b)) {
                    }
                    this.f62173d = 8;
                    if (gVar.n() != j12) {
                        gVar.C(j12);
                    }
                }
            }
            s12 = (short) (s12 + 1);
            s11 = s11;
        }
        int i15 = gVar.readInt();
        boolean z14 = f62165w;
        if (z14) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i15)));
        }
        long j16 = i15;
        if (j16 <= 0) {
            if (z14) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i15);
                return;
            }
            return;
        }
        if (this.f62176g.contains(Integer.valueOf(i15))) {
            if (z14) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i15);
                return;
            }
            return;
        }
        gVar.C(j16);
        if (this.f62175f[4].isEmpty()) {
            Y(gVar, 4);
        } else if (this.f62175f[5].isEmpty()) {
            Y(gVar, 5);
        }
    }

    private void Z(String str) {
        for (int i11 = 0; i11 < f62153k0.length; i11++) {
            this.f62175f[i11].remove(str);
        }
    }

    private void a0(int i11, String str, String str2) {
        if (this.f62175f[i11].isEmpty() || this.f62175f[i11].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f62175f[i11];
        map.put(str2, map.get(str));
        this.f62175f[i11].remove(str);
    }

    private void b0(g gVar, int i11) throws Throwable {
        d dVar = this.f62175f[i11].get("ImageLength");
        d dVar2 = this.f62175f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f62175f[i11].get("JPEGInterchangeFormat");
            d dVar4 = this.f62175f[i11].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f62177h);
            int iM2 = dVar3.m(this.f62177h);
            gVar.C(iM);
            byte[] bArr = new byte[iM2];
            gVar.readFully(bArr);
            p(new b(bArr), iM, i11);
        }
    }

    private void d0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr;
        if (f62165w) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.n(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.n(-40);
        cVar.n(-1);
        cVar.n(-31);
        this.f62185p = q0(cVar);
        if (this.f62190u != null) {
            cVar.write(-1);
            cVar.n(-31);
            byte[] bArr2 = f62161s0;
            cVar.B(bArr2.length + 2 + this.f62190u.f62205d.length);
            cVar.write(bArr2);
            cVar.write(this.f62190u.f62205d);
            this.f62191v = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b11 = bVar.readByte();
            if (b11 == -39 || b11 == -38) {
                cVar.n(-1);
                cVar.n(b11);
                e7.b.d(bVar, cVar);
                return;
            }
            if (b11 != -31) {
                cVar.n(-1);
                cVar.n(b11);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.B(unsignedShort);
                int i11 = unsignedShort - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i11 > 0) {
                    int i12 = bVar.read(bArr3, 0, Math.min(i11, 4096));
                    if (i12 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i12);
                    i11 -= i12;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = f62161s0;
                if (length >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f62160r0;
                    bArr = length >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (e7.b.f(bArr, f62160r0) || e7.b.f(bArr, bArr4)) {
                        bVar.B(length - bArr.length);
                    }
                }
                cVar.n(-1);
                cVar.n(b11);
                cVar.B(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i13 = bVar.read(bArr3, 0, Math.min(length, 4096));
                    if (i13 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i13);
                    length -= i13;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void e() {
        String strK = k("DateTimeOriginal");
        if (strK != null && k("DateTime") == null) {
            this.f62175f[0].put("DateTime", d.e(strK));
        }
        if (k("ImageWidth") == null) {
            this.f62175f[0].put("ImageWidth", d.f(0L, this.f62177h));
        }
        if (k("ImageLength") == null) {
            this.f62175f[0].put("ImageLength", d.f(0L, this.f62177h));
        }
        if (k("Orientation") == null) {
            this.f62175f[0].put("Orientation", d.f(0L, this.f62177h));
        }
        if (k("LightSource") == null) {
            this.f62175f[1].put("LightSource", d.f(0L, this.f62177h));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0044 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0044
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void e0(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.e0(java.io.InputStream, java.io.OutputStream):void");
    }

    private String f(double d11) {
        long j11 = (long) d11;
        double d12 = d11 - j11;
        long j12 = (long) (d12 * 60.0d);
        return j11 + "/1," + j12 + "/1," + Math.round((d12 - (j12 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0213 A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, all -> 0x007e, blocks: (B:7:0x004f, B:9:0x005b, B:11:0x006f, B:12:0x0071, B:80:0x01f7, B:82:0x0213, B:83:0x021c, B:19:0x0086, B:21:0x0095, B:23:0x009d, B:25:0x00a1, B:28:0x00b1, B:30:0x00bc, B:31:0x00c1, B:32:0x00c3, B:36:0x00d1, B:37:0x00d6, B:38:0x00da, B:39:0x00e6, B:41:0x00ee, B:45:0x00fc, B:47:0x0104, B:50:0x010b, B:52:0x011a, B:54:0x012a, B:69:0x0186, B:71:0x0192, B:72:0x0199, B:74:0x01d3, B:79:0x01f0, B:76:0x01e1, B:78:0x01e9, B:55:0x013e, B:56:0x0145, B:57:0x0146, B:59:0x0150, B:61:0x0156, B:65:0x016f, B:66:0x0177, B:67:0x017e), top: B:97:0x004f }] */
    private void f0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iQ0;
        boolean z11;
        if (f62165w) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = M;
        e7.b.e(bVar, cVar, bArr.length);
        int i16 = bVar.readInt();
        byte[] bArr2 = N;
        bVar.B(bArr2.length);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i17 = this.f62185p;
                    if (i17 == 0) {
                        byte[] bArr3 = new byte[4];
                        bVar.readFully(bArr3);
                        byte[] bArr4 = Q;
                        boolean z12 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i18 = bVar.readInt();
                            byte[] bArr5 = new byte[i18 % 2 == 1 ? i18 + 1 : i18];
                            bVar.readFully(bArr5);
                            byte b11 = (byte) (bArr5[0] | 8);
                            bArr5[0] = b11;
                            boolean z13 = ((b11 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.o(i18);
                            cVar2.write(bArr5);
                            if (z13) {
                                h(bVar, cVar2, T, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    try {
                                        bVar.readFully(bArr6);
                                        z11 = !Arrays.equals(bArr6, U);
                                    } catch (EOFException unused) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        break;
                                    } else {
                                        i(bVar, cVar2, bArr6);
                                    }
                                }
                                iQ0 = q0(cVar2);
                            } else {
                                h(bVar, cVar2, S, R);
                                iQ0 = q0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = S;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, R)) {
                                int i19 = bVar.readInt();
                                int i21 = i19 % 2 == 1 ? i19 + 1 : i19;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.readFully(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    bVar.readFully(bArr9);
                                    if (!Arrays.equals(P, bArr9)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i14 = bVar.readInt();
                                    i11 = -1;
                                    i13 = (i14 >> 16) & 16383;
                                    i12 = i21 - 10;
                                    i15 = i14 & 16383;
                                    z12 = false;
                                } else {
                                    i11 = -1;
                                    if (!Arrays.equals(bArr3, R)) {
                                        i12 = i21;
                                        i13 = 0;
                                        i14 = 0;
                                        z12 = false;
                                        i15 = 0;
                                    } else {
                                        if (bVar.readByte() != 47) {
                                            throw new IOException("Error checking VP8L signature");
                                        }
                                        i14 = bVar.readInt();
                                        int i22 = (i14 & 16383) + 1;
                                        int i23 = ((i14 & 268419072) >>> 14) + 1;
                                        if ((i14 & 268435456) == 0) {
                                            z12 = false;
                                        }
                                        i12 = i21 - 5;
                                        i15 = i22;
                                        i13 = i23;
                                    }
                                }
                                cVar2.write(bArr4);
                                cVar2.o(10);
                                byte[] bArr10 = new byte[10];
                                if (z12) {
                                    bArr10[0] = (byte) (bArr10[0] | Tnaf.POW_2_WIDTH);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i24 = i15 - 1;
                                int i25 = i13 - 1;
                                bArr10[4] = (byte) i24;
                                bArr10[5] = (byte) (i24 >> 8);
                                bArr10[6] = (byte) (i24 >> 16);
                                bArr10[7] = (byte) i25;
                                bArr10[8] = (byte) (i25 >> 8);
                                bArr10[9] = (byte) (i25 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.o(i19);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(P);
                                    cVar2.o(i14);
                                } else if (Arrays.equals(bArr3, R)) {
                                    cVar2.write(47);
                                    cVar2.o(i14);
                                }
                                e7.b.e(bVar, cVar2, i12);
                                iQ0 = q0(cVar2);
                            } else {
                                iQ0 = -1;
                                i11 = -1;
                            }
                        }
                        e7.b.e(bVar, cVar2, (i16 + 8) - bVar.n());
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr11 = N;
                        cVar.o(size + bArr11.length);
                        cVar.write(bArr11);
                        if (iQ0 != i11) {
                            this.f62185p = cVar.f62200a.size() + iQ0;
                        }
                        byteArrayOutputStream2.writeTo(cVar);
                        e7.b.d(bVar, cVar);
                        e7.b.b(byteArrayOutputStream2);
                    }
                    e7.b.e(bVar, cVar2, (i17 - ((bArr.length + 4) + bArr2.length)) - 8);
                    bVar.B(4);
                    int i26 = bVar.readInt();
                    if (i26 % 2 != 0) {
                        i26++;
                    }
                    bVar.B(i26);
                    iQ0 = q0(cVar2);
                    i11 = -1;
                    e7.b.e(bVar, cVar2, (i16 + 8) - bVar.n());
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr12 = N;
                    cVar.o(size2 + bArr12.length);
                    cVar.write(bArr12);
                    if (iQ0 != i11) {
                        this.f62185p = cVar.f62200a.size() + iQ0;
                    }
                    byteArrayOutputStream2.writeTo(cVar);
                    e7.b.d(bVar, cVar);
                    e7.b.b(byteArrayOutputStream2);
                } catch (Exception e11) {
                    e = e11;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    e7.b.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private static double g(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d12 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d13 = d11 + (d12 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals(Gender.NONE) && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d13;
            }
            return -d13;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void i(b bVar, c cVar, byte[] bArr) throws IOException {
        int i11 = bVar.readInt();
        cVar.write(bArr);
        cVar.o(i11);
        if (i11 % 2 == 1) {
            i11++;
        }
        e7.b.e(bVar, cVar, i11);
    }

    private void k0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f62175f[4];
        d dVar = map.get("Compression");
        if (dVar == null) {
            this.f62184o = 6;
            E(bVar, map);
            return;
        }
        int iM = dVar.m(this.f62177h);
        this.f62184o = iM;
        if (iM != 1) {
            if (iM == 6) {
                E(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (P(map)) {
            F(bVar, map);
        }
    }

    private static boolean l0(int i11) {
        return (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) ? false : true;
    }

    private void m0(int i11, int i12) throws Throwable {
        if (this.f62175f[i11].isEmpty() || this.f62175f[i12].isEmpty()) {
            if (f62165w) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f62175f[i11].get("ImageLength");
        d dVar2 = this.f62175f[i11].get("ImageWidth");
        d dVar3 = this.f62175f[i12].get("ImageLength");
        d dVar4 = this.f62175f[i12].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f62165w) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f62165w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM = dVar.m(this.f62177h);
        int iM2 = dVar2.m(this.f62177h);
        int iM3 = dVar3.m(this.f62177h);
        int iM4 = dVar4.m(this.f62177h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f62175f;
        HashMap<String, d> map = mapArr[i11];
        mapArr[i11] = mapArr[i12];
        mapArr[i12] = map;
    }

    private d n(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f62165w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && C(this.f62173d) == 2 && (dVar2 = this.f62190u) != null) {
            return dVar2;
        }
        for (int i11 = 0; i11 < f62153k0.length; i11++) {
            d dVar3 = this.f62175f[i11].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f62190u) == null) {
            return null;
        }
        return dVar;
    }

    private static void n0(CRC32 crc32, int i11) {
        crc32.update(i11 >>> 24);
        crc32.update(i11 >>> 16);
        crc32.update(i11 >>> 8);
        crc32.update(i11);
    }

    private void o(g gVar, int i11) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i11 == 15 && i13 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                e7.b.a.a(mediaMetadataRetriever, new C1277a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f62175f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.f62177h));
                }
                if (strExtractMetadata3 != null) {
                    this.f62175f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata3), this.f62177h));
                }
                if (strExtractMetadata2 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata2);
                    if (i14 == 90) {
                        i12 = 6;
                    } else if (i14 != 180) {
                        i12 = i14 != 270 ? 1 : 8;
                    } else {
                        i12 = 3;
                    }
                    this.f62175f[0].put("Orientation", d.j(i12, this.f62177h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i15 = Integer.parseInt(strExtractMetadata4);
                    int i16 = Integer.parseInt(strExtractMetadata5);
                    if (i16 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.C(i15);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i17 = i15 + 6;
                    int i18 = i16 - 6;
                    if (!Arrays.equals(bArr, f62160r0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i18];
                    gVar.readFully(bArr2);
                    this.f62185p = i17;
                    X(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i19 = Integer.parseInt(strExtractMetadata8);
                    int i21 = Integer.parseInt(strExtractMetadata9);
                    long j11 = i19;
                    gVar.C(j11);
                    byte[] bArr3 = new byte[i21];
                    gVar.readFully(bArr3);
                    this.f62190u = new d(1, i21, j11, bArr3);
                    this.f62191v = true;
                }
                if (f62165w) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                try {
                    mediaMetadataRetriever.release();
                    throw th2;
                } catch (IOException unused2) {
                    throw th2;
                }
            }
        } catch (RuntimeException e11) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e11);
        }
    }

    private void o0(g gVar, int i11) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = this.f62175f[i11].get("DefaultCropSize");
        d dVar2 = this.f62175f[i11].get("SensorTopBorder");
        d dVar3 = this.f62175f[i11].get("SensorLeftBorder");
        d dVar4 = this.f62175f[i11].get("SensorBottomBorder");
        d dVar5 = this.f62175f[i11].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                b0(gVar, i11);
                return;
            }
            int iM = dVar2.m(this.f62177h);
            int iM2 = dVar4.m(this.f62177h);
            int iM3 = dVar5.m(this.f62177h);
            int iM4 = dVar3.m(this.f62177h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.f62177h);
            d dVarJ4 = d.j(iM3 - iM4, this.f62177h);
            this.f62175f[i11].put("ImageLength", dVarJ3);
            this.f62175f[i11].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f62202a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f62177h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarJ = d.h(fVarArr[0], this.f62177h);
            dVarJ2 = d.h(fVarArr[1], this.f62177h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f62177h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarJ = d.j(iArr[0], this.f62177h);
            dVarJ2 = d.j(iArr[1], this.f62177h);
        }
        this.f62175f[i11].put("ImageWidth", dVarJ);
        this.f62175f[i11].put("ImageLength", dVarJ2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159 A[LOOP:0: B:10:0x0037->B:55:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ad. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void p(e7.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.p(e7.a$b, int, int):void");
    }

    private void p0() throws Throwable {
        m0(0, 5);
        m0(0, 4);
        m0(5, 4);
        d dVar = this.f62175f[1].get("PixelXDimension");
        d dVar2 = this.f62175f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f62175f[0].put("ImageWidth", dVar);
            this.f62175f[0].put("ImageLength", dVar2);
        }
        if (this.f62175f[4].isEmpty() && R(this.f62175f[5])) {
            HashMap<String, d>[] mapArr = this.f62175f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!R(this.f62175f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        a0(0, "ThumbnailOrientation", "Orientation");
        a0(0, "ThumbnailImageLength", "ImageLength");
        a0(0, "ThumbnailImageWidth", "ImageWidth");
        a0(5, "ThumbnailOrientation", "Orientation");
        a0(5, "ThumbnailImageLength", "ImageLength");
        a0(5, "ThumbnailImageWidth", "ImageWidth");
        a0(4, "Orientation", "ThumbnailOrientation");
        a0(4, "ImageLength", "ThumbnailImageLength");
        a0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int q0(c cVar) throws IOException {
        long j11;
        e[][] eVarArr = f62153k0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f62154l0) {
            Z(eVar.f62207b);
        }
        if (this.f62178i) {
            if (this.f62179j) {
                Z("StripOffsets");
                Z("StripByteCounts");
            } else {
                Z("JPEGInterchangeFormat");
                Z("JPEGInterchangeFormatLength");
            }
        }
        for (int i11 = 0; i11 < f62153k0.length; i11++) {
            Iterator<Map.Entry<String, d>> it = this.f62175f[i11].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        long j12 = 0;
        if (!this.f62175f[1].isEmpty()) {
            this.f62175f[0].put(f62154l0[1].f62207b, d.f(0L, this.f62177h));
        }
        if (!this.f62175f[2].isEmpty()) {
            this.f62175f[0].put(f62154l0[2].f62207b, d.f(0L, this.f62177h));
        }
        if (!this.f62175f[3].isEmpty()) {
            this.f62175f[1].put(f62154l0[3].f62207b, d.f(0L, this.f62177h));
        }
        if (this.f62178i) {
            if (this.f62179j) {
                this.f62175f[4].put("StripOffsets", d.j(0, this.f62177h));
                this.f62175f[4].put("StripByteCounts", d.j(this.f62182m, this.f62177h));
            } else {
                this.f62175f[4].put("JPEGInterchangeFormat", d.f(0L, this.f62177h));
                this.f62175f[4].put("JPEGInterchangeFormatLength", d.f(this.f62182m, this.f62177h));
            }
        }
        for (int i12 = 0; i12 < f62153k0.length; i12++) {
            Iterator<Map.Entry<String, d>> it2 = this.f62175f[i12].entrySet().iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                int iP = it2.next().getValue().p();
                if (iP > 4) {
                    i13 += iP;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int size = 8;
        for (int i14 = 0; i14 < f62153k0.length; i14++) {
            if (!this.f62175f[i14].isEmpty()) {
                iArr[i14] = size;
                size += (this.f62175f[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.f62178i) {
            if (this.f62179j) {
                this.f62175f[4].put("StripOffsets", d.j(size, this.f62177h));
            } else {
                this.f62175f[4].put("JPEGInterchangeFormat", d.f(size, this.f62177h));
            }
            this.f62181l = size;
            size += this.f62182m;
        }
        if (this.f62173d == 4) {
            size += 8;
        }
        if (f62165w) {
            for (int i15 = 0; i15 < f62153k0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f62175f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(size)));
            }
        }
        if (!this.f62175f[1].isEmpty()) {
            this.f62175f[0].put(f62154l0[1].f62207b, d.f(iArr[1], this.f62177h));
        }
        if (!this.f62175f[r13].isEmpty()) {
            this.f62175f[0].put(f62154l0[r13].f62207b, d.f(iArr[2], this.f62177h));
        }
        if (!this.f62175f[r14].isEmpty()) {
            this.f62175f[1].put(f62154l0[r14].f62207b, d.f(iArr[3], this.f62177h));
        }
        int i16 = this.f62173d;
        if (i16 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.B(size);
            cVar.write(f62160r0);
        } else if (i16 == 13) {
            cVar.o(size);
            cVar.o(1700284774);
        } else if (i16 == 14) {
            cVar.write(O);
            cVar.o(size);
        }
        int size2 = cVar.f62200a.size();
        cVar.p(this.f62177h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.c(this.f62177h);
        cVar.B(42);
        cVar.t(8L);
        int i17 = 0;
        while (i17 < f62153k0.length) {
            if (this.f62175f[i17].isEmpty()) {
                j11 = j12;
            } else {
                cVar.B(this.f62175f[i17].size());
                int size3 = iArr[i17] + 2 + (this.f62175f[i17].size() * 12) + 4;
                for (Map.Entry<String, d> entry : this.f62175f[i17].entrySet()) {
                    int i18 = f62156n0[i17].get(entry.getKey()).f62206a;
                    d value = entry.getValue();
                    int iP2 = value.p();
                    cVar.B(i18);
                    cVar.B(value.f62202a);
                    cVar.o(value.f62203b);
                    if (iP2 > 4) {
                        cVar.t(size3);
                        size3 += iP2;
                    } else {
                        cVar.write(value.f62205d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.n(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f62175f[4].isEmpty()) {
                    j11 = 0;
                    cVar.t(0L);
                } else {
                    cVar.t(iArr[4]);
                    j11 = 0;
                }
                Iterator<Map.Entry<String, d>> it3 = this.f62175f[i17].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = it3.next().getValue().f62205d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i17++;
            j12 = j11;
        }
        if (this.f62178i) {
            cVar.write(A());
        }
        if (this.f62173d == 14 && size % 2 == 1) {
            cVar.n(0);
        }
        cVar.c(ByteOrder.BIG_ENDIAN);
        return size2;
    }

    private int r(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (J(bArr)) {
            return 4;
        }
        if (M(bArr)) {
            return 9;
        }
        int I2 = I(bArr);
        if (I2 != 0) {
            return I2;
        }
        if (K(bArr)) {
            return 7;
        }
        if (N(bArr)) {
            return 10;
        }
        if (L(bArr)) {
            return 13;
        }
        return S(bArr) ? 14 : 0;
    }

    private void r0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f62185p = cVar.f62200a.size() + q0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.o((int) crc32.getValue());
    }

    private void s(g gVar) throws Throwable {
        int i11;
        int i12;
        v(gVar);
        d dVar = this.f62175f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f62205d);
            gVar2.t(this.f62177h);
            byte[] bArr = I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.C(0L);
            byte[] bArr3 = J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.C(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.C(12L);
            }
            Y(gVar2, 6);
            d dVar2 = this.f62175f[7].get("PreviewImageStart");
            d dVar3 = this.f62175f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f62175f[5].put("JPEGInterchangeFormat", dVar2);
                this.f62175f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f62175f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f62177h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i13 = iArr[2];
                int i14 = iArr[0];
                if (i13 <= i14 || (i11 = iArr[3]) <= (i12 = iArr[1])) {
                    return;
                }
                int i15 = (i13 - i14) + 1;
                int i16 = (i11 - i12) + 1;
                if (i15 < i16) {
                    int i17 = i15 + i16;
                    i16 = i17 - i16;
                    i15 = i17 - i16;
                }
                d dVarJ = d.j(i15, this.f62177h);
                d dVarJ2 = d.j(i16, this.f62177h);
                this.f62175f[0].put("ImageWidth", dVarJ);
                this.f62175f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    private void s0(c cVar) throws IOException {
        cVar.o(this.f62190u.f62205d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.o(1767135348);
        n0(crc32, 1767135348);
        byte[] bArr = L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f62190u.f62205d);
        crc32.update(this.f62190u.f62205d);
        cVar.o((int) crc32.getValue());
        this.f62191v = true;
    }

    private void t(b bVar) throws Throwable {
        if (f62165w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.t(ByteOrder.BIG_ENDIAN);
        int iN = bVar.n();
        bVar.B(K.length);
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            if (z11 && z12) {
                break;
            }
            try {
                int i11 = bVar.readInt();
                int i12 = bVar.readInt();
                int iN2 = bVar.n() + i11 + 4;
                if (bVar.n() - iN == 16 && i12 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i12 == 1229278788) {
                    break;
                }
                if (i12 == 1700284774 && !z11) {
                    this.f62185p = bVar.n() - iN;
                    byte[] bArr = new byte[i11];
                    bVar.readFully(bArr);
                    int i13 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    n0(crc32, i12);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i13) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i13 + ", calculated CRC value: " + crc32.getValue());
                    }
                    X(bArr, 0);
                    p0();
                    k0(new b(bArr));
                    z11 = true;
                } else if (i12 == 1767135348 && !z12) {
                    byte[] bArr2 = L;
                    if (i11 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iN3 = bVar.n() - iN;
                            int i14 = i11 - length;
                            byte[] bArr4 = new byte[i14];
                            bVar.readFully(bArr4);
                            this.f62190u = new d(1, i14, iN3, bArr4);
                            z12 = true;
                        }
                    }
                }
                bVar.B(iN2 - bVar.n());
            } catch (EOFException e11) {
                throw new IOException("Encountered corrupt PNG file.", e11);
            }
        }
        this.f62191v = z12;
    }

    private void u(b bVar) throws Throwable {
        boolean z11 = f62165w;
        if (z11) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.B(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        bVar.B(i11 - bVar.n());
        bVar.readFully(bArr4);
        p(new b(bArr4), i11, 5);
        bVar.B(i13 - bVar.n());
        bVar.t(ByteOrder.BIG_ENDIAN);
        int i14 = bVar.readInt();
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i14);
        }
        for (int i15 = 0; i15 < i14; i15++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f62148f0.f62206a) {
                short s11 = bVar.readShort();
                short s12 = bVar.readShort();
                d dVarJ = d.j(s11, this.f62177h);
                d dVarJ2 = d.j(s12, this.f62177h);
                this.f62175f[0].put("ImageLength", dVarJ);
                this.f62175f[0].put("ImageWidth", dVarJ2);
                if (f62165w) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s11) + ", width: " + ((int) s12));
                    return;
                }
                return;
            }
            bVar.B(unsignedShort2);
        }
    }

    private void v(g gVar) throws Throwable {
        d dVar;
        U(gVar);
        Y(gVar, 0);
        o0(gVar, 0);
        o0(gVar, 5);
        o0(gVar, 4);
        p0();
        if (this.f62173d != 8 || (dVar = this.f62175f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f62205d);
        gVar2.t(this.f62177h);
        gVar2.B(6);
        Y(gVar2, 9);
        d dVar2 = this.f62175f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f62175f[1].put("ColorSpace", dVar2);
        }
    }

    private void x(g gVar) throws Throwable {
        if (f62165w) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        v(gVar);
        d dVar = this.f62175f[0].get("JpgFromRaw");
        if (dVar != null) {
            p(new b(dVar.f62205d), (int) dVar.f62204c, 5);
        }
        d dVar2 = this.f62175f[0].get("ISO");
        d dVar3 = this.f62175f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f62175f[1].put("PhotographicSensitivity", dVar2);
    }

    private boolean y(g gVar) throws IOException {
        byte[] bArr = f62160r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrO = gVar.o();
        this.f62185p = bArr.length;
        X(bArrO, 0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    public byte[] A() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Exception e11;
        InputStream inputStream = null;
        if (!this.f62178i) {
            return null;
        }
        byte[] bArr = this.f62183n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.f62172c;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                        e7.b.b(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception e12) {
                    e11 = e12;
                    fileDescriptor = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e11);
                    e7.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        e7.b.a(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                    inputStream = fileInputStream;
                    e7.b.b(inputStream);
                    if (fileDescriptor != null) {
                        e7.b.a(fileDescriptor);
                    }
                    throw th;
                }
            } else if (this.f62170a != null) {
                fileInputStream = new FileInputStream(this.f62170a);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorDup = Os.dup(this.f62171b);
                try {
                    Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = new FileInputStream(fileDescriptorDup);
                } catch (Exception e13) {
                    e11 = e13;
                    fileDescriptor = fileDescriptorDup;
                    fileInputStream = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e11);
                    e7.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        e7.b.a(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = fileDescriptorDup;
                    e7.b.b(inputStream);
                    if (fileDescriptor != null) {
                        e7.b.a(fileDescriptor);
                    }
                    throw th;
                }
            }
            try {
                try {
                    b bVar = new b(fileInputStream);
                    bVar.B(this.f62181l + this.f62185p);
                    byte[] bArr2 = new byte[this.f62182m];
                    bVar.readFully(bArr2);
                    this.f62183n = bArr2;
                    e7.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        e7.b.a(fileDescriptor);
                    }
                    return bArr2;
                } catch (Exception e14) {
                    e11 = e14;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e11);
                    e7.b.b(fileInputStream);
                    if (fileDescriptor != null) {
                        e7.b.a(fileDescriptor);
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = fileInputStream;
                e7.b.b(inputStream);
                if (fileDescriptor != null) {
                    e7.b.a(fileDescriptor);
                }
                throw th;
            }
        } catch (Exception e15) {
            fileInputStream = null;
            e11 = e15;
            fileDescriptor = null;
        } catch (Throwable th5) {
            th = th5;
            fileDescriptor = null;
        }
    }

    public boolean H() {
        int iM = m("Orientation", 1);
        return iM == 2 || iM == 7 || iM == 4 || iM == 5;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x00ff), top: B:125:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0152  */
    public void c0() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e11;
        FileOutputStream fileOutputStream4;
        if (!Q(this.f62173d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f62171b == null && this.f62170a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f62178i && this.f62179j && !this.f62180k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f62189t = true;
        this.f62183n = z();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f62170a != null) {
                fileInputStream = new FileInputStream(this.f62170a);
            } else {
                Os.lseek(this.f62171b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f62171b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    e7.b.d(fileInputStream, fileOutputStream);
                    e7.b.b(fileInputStream);
                    e7.b.b(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f62170a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f62170a);
                                    } else {
                                        Os.lseek(this.f62171b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f62171b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i11 = this.f62173d;
                                                if (i11 == 4) {
                                                    d0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 13) {
                                                    e0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 14) {
                                                    f0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                e7.b.b(bufferedInputStream);
                                                e7.b.b(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f62183n = null;
                                            } catch (Exception e12) {
                                                exc = e12;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f62170a != null) {
                                                            fileOutputStream4 = new FileOutputStream(this.f62170a);
                                                        } else {
                                                            Os.lseek(this.f62171b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream4 = new FileOutputStream(this.f62171b);
                                                        }
                                                        fileOutputStream3 = fileOutputStream4;
                                                        e7.b.d(fileInputStream2, fileOutputStream3);
                                                        e7.b.b(fileInputStream2);
                                                        e7.b.b(fileOutputStream3);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e13) {
                                                        e11 = e13;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e11);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = fileInputStream2;
                                                            e7.b.b(inputStream);
                                                            e7.b.b(fileOutputStream3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = fileInputStream2;
                                                        e7.b.b(inputStream);
                                                        e7.b.b(fileOutputStream3);
                                                        throw th;
                                                    }
                                                } catch (Exception e14) {
                                                    fileInputStream2 = inputStream;
                                                    e11 = e14;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    e7.b.b(inputStream);
                                                    e7.b.b(fileOutputStream3);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e15) {
                                            inputStream = fileInputStream3;
                                            exc = e15;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = bufferedInputStream;
                                            e7.b.b(inputStream);
                                            e7.b.b(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e16) {
                                        inputStream = fileInputStream3;
                                        exc = e16;
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                    fileOutputStream2 = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream3 = fileOutputStream2;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.f62170a != null) {
                                        fileOutputStream4 = new FileOutputStream(this.f62170a);
                                    } else {
                                        Os.lseek(this.f62171b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(this.f62171b);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    e7.b.d(fileInputStream2, fileOutputStream3);
                                    e7.b.b(fileInputStream2);
                                    e7.b.b(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                e7.b.b(inputStream);
                                e7.b.b(0);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e19) {
                    e = e19;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        e7.b.b(inputStream);
                        e7.b.b(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    e7.b.b(inputStream);
                    e7.b.b(fileOutputStream);
                    throw th;
                }
            } catch (Exception e21) {
                e = e21;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e22) {
            e = e22;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    public void g0(double d11) {
        String str = d11 >= 0.0d ? WebrtcBuildVersion.maint_version : "1";
        h0("GPSAltitude", f.b(Math.abs(d11)).toString());
        h0("GPSAltitudeRef", str);
    }

    public void h0(String str, String str2) {
        e eVar;
        int i11;
        String str3;
        int i12;
        int i13;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (f62165w) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i14 = 2;
        String str5 = "/";
        int i15 = 1;
        if (strReplaceAll != null) {
            if (f62157o0.contains(str4) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = f.b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f62163u0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean zFind = f62164v0.matcher(strReplaceAll).find();
                boolean zFind2 = f62166w0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        }
        int i16 = 0;
        if ("Xmp".equals(str4)) {
            boolean z11 = this.f62175f[0].containsKey("Xmp") || this.f62175f[5].containsKey("Xmp");
            int iC = C(this.f62173d);
            if ((iC == 2 && (this.f62190u != null || !z11)) || (iC == 3 && !z11)) {
                this.f62190u = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i17 = 0;
        while (i17 < f62153k0.length) {
            if ((i17 != 4 || this.f62178i) && (eVar = f62156n0[i17].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairD = D(strReplaceAll);
                    if (eVar.f62208c == ((Integer) pairD.first).intValue() || eVar.f62208c == ((Integer) pairD.second).intValue()) {
                        i11 = eVar.f62208c;
                    } else {
                        int i18 = eVar.f62209d;
                        if (i18 == -1 || !(i18 == ((Integer) pairD.first).intValue() || eVar.f62209d == ((Integer) pairD.second).intValue())) {
                            int i19 = eVar.f62208c;
                            if (i19 == i15 || i19 == 7 || i19 == i14) {
                                i11 = i19;
                            } else if (f62165w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = X;
                                sb2.append(strArr[eVar.f62208c]);
                                sb2.append(eVar.f62209d == -1 ? "" : ", " + strArr[eVar.f62209d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairD.first).intValue()]);
                                sb2.append(((Integer) pairD.second).intValue() != -1 ? ", " + strArr[((Integer) pairD.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i11 = eVar.f62209d;
                        }
                    }
                    switch (i11) {
                        case 1:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            this.f62175f[i17].put(str4, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            this.f62175f[i17].put(str4, d.e(strReplaceAll));
                            break;
                        case 3:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i21 = i13; i21 < strArrSplit.length; i21++) {
                                iArr[i21] = Integer.parseInt(strArrSplit[i21]);
                            }
                            this.f62175f[i17].put(str4, d.k(iArr, this.f62177h));
                            break;
                        case 4:
                            str3 = str5;
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i22 = i13; i22 < strArrSplit2.length; i22++) {
                                jArr[i22] = Long.parseLong(strArrSplit2[i22]);
                            }
                            this.f62175f[i17].put(str4, d.g(jArr, this.f62177h));
                            break;
                        case 5:
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            int i23 = i13;
                            while (i23 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i23].split(str5, -1);
                                fVarArr[i23] = new f((long) Double.parseDouble(strArrSplit4[i13]), (long) Double.parseDouble(strArrSplit4[i12]), null);
                                i23++;
                                str5 = str5;
                            }
                            str3 = str5;
                            this.f62175f[i17].put(str4, d.i(fVarArr, this.f62177h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f62165w) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i11);
                            }
                            break;
                        case 9:
                            i12 = i15;
                            i13 = i16;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i24 = i13; i24 < strArrSplit5.length; i24++) {
                                iArr2[i24] = Integer.parseInt(strArrSplit5[i24]);
                            }
                            this.f62175f[i17].put(str4, d.c(iArr2, this.f62177h));
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i25 = i16;
                            while (i25 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i25].split(str5, -1);
                                int i26 = i15;
                                int i27 = i25;
                                fVarArr2[i27] = new f((long) Double.parseDouble(strArrSplit7[i16]), (long) Double.parseDouble(strArrSplit7[i26]), null);
                                i25 = i27 + 1;
                                i15 = i26;
                                strArrSplit6 = strArrSplit6;
                                i16 = i16;
                            }
                            i12 = i15;
                            i13 = i16;
                            this.f62175f[i17].put(str4, d.d(fVarArr2, this.f62177h));
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i28 = i16; i28 < strArrSplit8.length; i28++) {
                                dArr[i28] = Double.parseDouble(strArrSplit8[i28]);
                            }
                            this.f62175f[i17].put(str4, d.b(dArr, this.f62177h));
                            break;
                    }
                } else {
                    this.f62175f[i17].remove(str4);
                }
                str3 = str5;
                i12 = i15;
                i13 = i16;
            } else {
                str3 = str5;
                i12 = i15;
                i13 = i16;
            }
            i17++;
            i15 = i12;
            i16 = i13;
            str5 = str3;
            i14 = 2;
        }
    }

    public void i0(Location location) {
        if (location == null) {
            return;
        }
        h0("GPSProcessingMethod", location.getProvider());
        j0(location.getLatitude(), location.getLongitude());
        g0(location.getAltitude());
        h0("GPSSpeedRef", "K");
        h0("GPSSpeed", f.b((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = V.format(new Date(location.getTime())).split("\\s+", -1);
        h0("GPSDateStamp", strArrSplit[0]);
        h0("GPSTimeStamp", strArrSplit[1]);
    }

    public double j(double d11) {
        double dL = l("GPSAltitude", -1.0d);
        int iM = m("GPSAltitudeRef", -1);
        if (dL < 0.0d || iM < 0) {
            return d11;
        }
        return dL * ((double) (iM != 1 ? 1 : -1));
    }

    public void j0(double d11, double d12) {
        if (d11 < -90.0d || d11 > 90.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Latitude value " + d11 + " is not valid.");
        }
        if (d12 < -180.0d || d12 > 180.0d || Double.isNaN(d12)) {
            throw new IllegalArgumentException("Longitude value " + d12 + " is not valid.");
        }
        h0("GPSLatitudeRef", d11 >= 0.0d ? Gender.NONE : "S");
        h0("GPSLatitude", f(Math.abs(d11)));
        h0("GPSLongitudeRef", d12 >= 0.0d ? "E" : "W");
        h0("GPSLongitude", f(Math.abs(d12)));
    }

    public String k(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f62157o0.contains(str)) {
                return dVarN.n(this.f62177h);
            }
            try {
                return Double.toString(dVarN.l(this.f62177h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i11 = dVarN.f62202a;
        if (i11 != 5 && i11 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarN.f62202a);
            return null;
        }
        f[] fVarArr = (f[]) dVarN.o(this.f62177h);
        if (fVarArr == null || fVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (fVar.f62210a / fVar.f62211b));
        f fVar2 = fVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (fVar2.f62210a / fVar2.f62211b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f62210a / fVar3.f62211b)));
    }

    public double l(String str, double d11) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.l(this.f62177h);
            } catch (NumberFormatException unused) {
            }
        }
        return d11;
    }

    public int m(String str, int i11) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarN = n(str);
        if (dVarN != null) {
            try {
                return dVarN.m(this.f62177h);
            } catch (NumberFormatException unused) {
            }
        }
        return i11;
    }

    public double[] q() {
        String strK = k("GPSLatitude");
        String strK2 = k("GPSLatitudeRef");
        String strK3 = k("GPSLongitude");
        String strK4 = k("GPSLongitudeRef");
        if (strK == null || strK2 == null || strK3 == null || strK4 == null) {
            return null;
        }
        try {
            return new double[]{g(strK, strK2), g(strK3, strK4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strK, strK2, strK3, strK4));
            return null;
        }
    }

    public int w() {
        switch (m("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] z() {
        int i11 = this.f62184o;
        if (i11 == 6 || i11 == 7) {
            return A();
        }
        return null;
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f62195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f62196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f62197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f62198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f62199e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f62199e = bArr.length;
        }

        public void B(int i11) throws IOException {
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i11 - i12;
                int iSkip = (int) this.f62195a.skip(i13);
                if (iSkip <= 0) {
                    if (this.f62198d == null) {
                        this.f62198d = new byte[PKIFailureInfo.certRevoked];
                    }
                    iSkip = this.f62195a.read(this.f62198d, 0, Math.min(PKIFailureInfo.certRevoked, i13));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i11 + " bytes.");
                    }
                }
                i12 += iSkip;
            }
            this.f62196b += i12;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f62195a.available();
        }

        public int c() {
            return this.f62199e;
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int n() {
            return this.f62196b;
        }

        public byte[] o() throws IOException {
            byte[] bArrCopyOf = new byte[1024];
            int i11 = 0;
            while (true) {
                if (i11 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i12 = this.f62195a.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
                if (i12 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i11);
                }
                i11 += i12;
                this.f62196b += i12;
            }
        }

        public long p() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f62196b++;
            return this.f62195a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f62196b++;
            return this.f62195a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f62196b++;
            int i11 = this.f62195a.read();
            if (i11 >= 0) {
                return (byte) i11;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f62196b += 2;
            return this.f62195a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i11, int i12) throws IOException {
            this.f62196b += i12;
            this.f62195a.readFully(bArr, i11, i12);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f62196b += 4;
            int i11 = this.f62195a.read();
            int i12 = this.f62195a.read();
            int i13 = this.f62195a.read();
            int i14 = this.f62195a.read();
            if ((i11 | i12 | i13 | i14) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f62197c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i14 << 24) + (i13 << 16) + (i12 << 8) + i11;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
            }
            throw new IOException("Invalid byte order: " + this.f62197c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f62196b += 8;
            int i11 = this.f62195a.read();
            int i12 = this.f62195a.read();
            int i13 = this.f62195a.read();
            int i14 = this.f62195a.read();
            int i15 = this.f62195a.read();
            int i16 = this.f62195a.read();
            int i17 = this.f62195a.read();
            int i18 = this.f62195a.read();
            if ((i11 | i12 | i13 | i14 | i15 | i16 | i17 | i18) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f62197c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i18) << 56) + (((long) i17) << 48) + (((long) i16) << 40) + (((long) i15) << 32) + (((long) i14) << 24) + (((long) i13) << 16) + (((long) i12) << 8) + ((long) i11);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i11) << 56) + (((long) i12) << 48) + (((long) i13) << 40) + (((long) i14) << 32) + (((long) i15) << 24) + (((long) i16) << 16) + (((long) i17) << 8) + ((long) i18);
            }
            throw new IOException("Invalid byte order: " + this.f62197c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f62196b += 2;
            int i11 = this.f62195a.read();
            int i12 = this.f62195a.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f62197c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i12 << 8) + i11);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i11 << 8) + i12);
            }
            throw new IOException("Invalid byte order: " + this.f62197c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f62196b += 2;
            return this.f62195a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f62196b++;
            return this.f62195a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f62196b += 2;
            int i11 = this.f62195a.read();
            int i12 = this.f62195a.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f62197c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i12 << 8) + i11;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i11 << 8) + i12;
            }
            throw new IOException("Invalid byte order: " + this.f62197c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i11) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void t(ByteOrder byteOrder) {
            this.f62197c = byteOrder;
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.f62195a.read(bArr, i11, i12);
            this.f62196b += i13;
            return i13;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f62196b += bArr.length;
            this.f62195a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f62195a = dataInputStream;
            dataInputStream.mark(0);
            this.f62196b = 0;
            this.f62197c = byteOrder;
            this.f62199e = inputStream instanceof b ? ((b) inputStream).c() : -1;
        }
    }

    private static class g extends b {
        g(byte[] bArr) {
            super(bArr);
            this.f62195a.mark(Integer.MAX_VALUE);
        }

        public void C(long j11) throws IOException {
            int i11 = this.f62196b;
            if (i11 > j11) {
                this.f62196b = 0;
                this.f62195a.reset();
            } else {
                j11 -= (long) i11;
            }
            B((int) j11);
        }

        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f62195a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62209d;

        e(String str, int i11, int i12) {
            this.f62207b = str;
            this.f62206a = i11;
            this.f62208c = i12;
            this.f62209d = -1;
        }

        boolean a(int i11) {
            int i12;
            int i13 = this.f62208c;
            if (i13 == 7 || i11 == 7 || i13 == i11 || (i12 = this.f62209d) == i11) {
                return true;
            }
            if ((i13 == 4 || i12 == 4) && i11 == 3) {
                return true;
            }
            if ((i13 == 9 || i12 == 9) && i11 == 8) {
                return true;
            }
            return (i13 == 12 || i12 == 12) && i11 == 11;
        }

        e(String str, int i11, int i12, int i13) {
            this.f62207b = str;
            this.f62206a = i11;
            this.f62208c = i12;
            this.f62209d = i13;
        }
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = f62153k0;
        this.f62175f = new HashMap[eVarArr.length];
        this.f62176g = new HashSet(eVarArr.length);
        this.f62177h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            G(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public a(InputStream inputStream, int i11) {
        e[][] eVarArr = f62153k0;
        this.f62175f = new HashMap[eVarArr.length];
        this.f62176g = new HashSet(eVarArr.length);
        this.f62177h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f62170a = null;
            boolean z11 = i11 == 1;
            this.f62174e = z11;
            if (z11) {
                this.f62172c = null;
                this.f62171b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f62172c = (AssetManager.AssetInputStream) inputStream;
                this.f62171b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (O(fileInputStream.getFD())) {
                    this.f62172c = null;
                    this.f62171b = fileInputStream.getFD();
                } else {
                    this.f62172c = null;
                    this.f62171b = null;
                }
            } else {
                this.f62172c = null;
                this.f62171b = null;
            }
            T(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* JADX INFO: renamed from: e7.a$a, reason: collision with other inner class name */
    class C1277a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f62192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f62193b;

        C1277a(g gVar) {
            this.f62193b = gVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j11, byte[] bArr, int i11, int i12) {
            if (i12 == 0) {
                return 0;
            }
            if (j11 < 0) {
                return -1;
            }
            try {
                long j12 = this.f62192a;
                if (j12 != j11) {
                    if (j12 >= 0 && j11 >= j12 + ((long) this.f62193b.available())) {
                        return -1;
                    }
                    this.f62193b.C(j11);
                    this.f62192a = j11;
                }
                if (i12 > this.f62193b.available()) {
                    i12 = this.f62193b.available();
                }
                int i13 = this.f62193b.read(bArr, i11, i12);
                if (i13 >= 0) {
                    this.f62192a += (long) i13;
                    return i13;
                }
            } catch (IOException unused) {
            }
            this.f62192a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
