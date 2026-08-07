package bj;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f17462u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f17463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f17464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0349a f17465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f17466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f17467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f17468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f17469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f17470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f17471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f17472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f17474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f17475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f17481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private Bitmap.Config f17482t;

    public e(@NonNull a.InterfaceC0349a interfaceC0349a, c cVar, ByteBuffer byteBuffer, int i11) {
        this(interfaceC0349a);
        p(cVar, byteBuffer, i11);
    }

    private int h(int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = i11; i19 < this.f17478p + i11; i19++) {
            byte[] bArr = this.f17471i;
            if (i19 >= bArr.length || i19 >= i12) {
                break;
            }
            int i21 = this.f17463a[bArr[i19] & 255];
            if (i21 != 0) {
                i14 += (i21 >> 24) & 255;
                i15 += (i21 >> 16) & 255;
                i16 += (i21 >> 8) & 255;
                i17 += i21 & 255;
                i18++;
            }
        }
        int i22 = i11 + i13;
        for (int i23 = i22; i23 < this.f17478p + i22; i23++) {
            byte[] bArr2 = this.f17471i;
            if (i23 >= bArr2.length || i23 >= i12) {
                break;
            }
            int i24 = this.f17463a[bArr2[i23] & 255];
            if (i24 != 0) {
                i14 += (i24 >> 24) & 255;
                i15 += (i24 >> 16) & 255;
                i16 += (i24 >> 8) & 255;
                i17 += i24 & 255;
                i18++;
            }
        }
        if (i18 == 0) {
            return 0;
        }
        return ((i14 / i18) << 24) | ((i15 / i18) << 16) | ((i16 / i18) << 8) | (i17 / i18);
    }

    private void i(b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f17472j;
        int i15 = bVar.f17437d;
        int i16 = this.f17478p;
        int i17 = i15 / i16;
        int i18 = bVar.f17435b / i16;
        int i19 = bVar.f17436c / i16;
        int i21 = bVar.f17434a / i16;
        boolean z11 = this.f17473k == 0;
        int i22 = this.f17480r;
        int i23 = this.f17479q;
        byte[] bArr = this.f17471i;
        int[] iArr2 = this.f17463a;
        Boolean bool = this.f17481s;
        int i24 = 8;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1;
        while (i26 < i17) {
            int[] iArr3 = iArr;
            if (bVar.f17438e) {
                if (i25 >= i17) {
                    int i28 = i27 + 1;
                    i11 = i17;
                    if (i28 == 2) {
                        i27 = i28;
                        i25 = 4;
                    } else if (i28 == 3) {
                        i27 = i28;
                        i24 = 4;
                        i25 = 2;
                    } else if (i28 != 4) {
                        i27 = i28;
                    } else {
                        i27 = i28;
                        i25 = 1;
                        i24 = 2;
                    }
                } else {
                    i11 = i17;
                }
                i12 = i25 + i24;
            } else {
                i11 = i17;
                i12 = i25;
                i25 = i26;
            }
            int i29 = i25 + i18;
            boolean z12 = i16 == 1;
            if (i29 < i23) {
                int i31 = i29 * i22;
                int i32 = i31 + i21;
                int i33 = i32 + i19;
                int i34 = i31 + i22;
                if (i34 < i33) {
                    i33 = i34;
                }
                i13 = i12;
                int i35 = i26 * i16 * bVar.f17436c;
                if (z12) {
                    int i36 = i32;
                    while (i36 < i33) {
                        int i37 = i36;
                        int i38 = iArr2[bArr[i35] & 255];
                        if (i38 != 0) {
                            iArr3[i37] = i38;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i16;
                        i36 = i37 + 1;
                    }
                } else {
                    int i39 = ((i33 - i32) * i16) + i35;
                    i14 = i16;
                    int i41 = i32;
                    while (i41 < i33) {
                        int i42 = i33;
                        int iH = h(i35, i39, bVar.f17436c);
                        if (iH != 0) {
                            iArr3[i41] = iH;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i14;
                        i41++;
                        i33 = i42;
                    }
                }
                i26++;
                i16 = i14;
                iArr = iArr3;
                i17 = i11;
                i25 = i13;
            } else {
                i13 = i12;
            }
            i14 = i16;
            i26++;
            i16 = i14;
            iArr = iArr3;
            i17 = i11;
            i25 = i13;
        }
        if (this.f17481s == null) {
            this.f17481s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void j(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f17472j;
        int i11 = bVar2.f17437d;
        int i12 = bVar2.f17435b;
        int i13 = bVar2.f17436c;
        int i14 = bVar2.f17434a;
        boolean z11 = this.f17473k == 0;
        int i15 = this.f17480r;
        byte[] bArr = this.f17471i;
        int[] iArr2 = this.f17463a;
        int i16 = 0;
        byte b11 = -1;
        while (i16 < i11) {
            int i17 = (i16 + i12) * i15;
            int i18 = i17 + i14;
            int i19 = i18 + i13;
            int i21 = i17 + i15;
            if (i21 < i19) {
                i19 = i21;
            }
            int i22 = bVar2.f17436c * i16;
            int i23 = i18;
            while (i23 < i19) {
                byte b12 = bArr[i22];
                int[] iArr3 = iArr;
                int i24 = b12 & 255;
                if (i24 != b11) {
                    int i25 = iArr2[i24];
                    if (i25 != 0) {
                        iArr3[i23] = i25;
                    } else {
                        b11 = b12;
                    }
                }
                i22++;
                i23++;
                iArr = iArr3;
            }
            i16++;
            bVar2 = bVar;
        }
        Boolean bool = this.f17481s;
        this.f17481s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f17481s == null && z11 && b11 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void k(b bVar) {
        int i11;
        int i12;
        short s11;
        e eVar = this;
        if (bVar != null) {
            eVar.f17466d.position(bVar.f17443j);
        }
        if (bVar == null) {
            c cVar = eVar.f17474l;
            i11 = cVar.f17450f;
            i12 = cVar.f17451g;
        } else {
            i11 = bVar.f17436c;
            i12 = bVar.f17437d;
        }
        int i13 = i11 * i12;
        byte[] bArr = eVar.f17471i;
        if (bArr == null || bArr.length < i13) {
            eVar.f17471i = eVar.f17465c.a(i13);
        }
        byte[] bArr2 = eVar.f17471i;
        if (eVar.f17468f == null) {
            eVar.f17468f = new short[4096];
        }
        short[] sArr = eVar.f17468f;
        if (eVar.f17469g == null) {
            eVar.f17469g = new byte[4096];
        }
        byte[] bArr3 = eVar.f17469g;
        if (eVar.f17470h == null) {
            eVar.f17470h = new byte[4097];
        }
        byte[] bArr4 = eVar.f17470h;
        int iO = eVar.o();
        int i14 = 1 << iO;
        int i15 = i14 + 1;
        int i16 = i14 + 2;
        int i17 = iO + 1;
        int i18 = (1 << i17) - 1;
        byte b11 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = eVar.f17467e;
        int i21 = i17;
        int i22 = i16;
        int i23 = i18;
        int i24 = 0;
        int iN = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = -1;
        while (i24 < i13) {
            if (iN == 0) {
                iN = eVar.n();
                if (iN <= 0) {
                    eVar.f17477o = 3;
                    break;
                }
                i25 = b11;
            }
            i27 += (bArr5[i25] & 255) << i26;
            i25++;
            iN--;
            int i33 = i26 + 8;
            i22 = i22;
            int i34 = i32;
            int i35 = i21;
            short[] sArr2 = sArr;
            int i36 = i31;
            while (true) {
                bArr3 = bArr3;
                if (i33 < i35) {
                    i31 = i36;
                    break;
                }
                int i37 = i27 & i23;
                i27 >>= i35;
                i33 -= i35;
                if (i37 == i14) {
                    i35 = i17;
                    i22 = i16;
                    i23 = i18;
                    i34 = -1;
                } else {
                    if (i37 == i15) {
                        i31 = i36;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i34 == -1) {
                        bArr2[i28] = bArr3[i37];
                        i28++;
                        i24++;
                        i34 = i37;
                        i36 = i34;
                        bArr4 = bArr6;
                    } else {
                        if (i37 >= i22) {
                            bArr6[i29] = (byte) i36;
                            i29++;
                            s11 = i34;
                        } else {
                            s11 = i37;
                        }
                        while (s11 >= i14) {
                            bArr6[i29] = bArr3[s11];
                            i29++;
                            s11 = sArr2[s11];
                        }
                        int i38 = bArr3[s11] & 255;
                        byte b12 = (byte) i38;
                        bArr2[i28] = b12;
                        while (true) {
                            i28++;
                            i24++;
                            if (i29 <= 0) {
                                break;
                            }
                            i29--;
                            bArr2[i28] = bArr6[i29];
                        }
                        if (i22 < 4096) {
                            sArr2[i22] = (short) i34;
                            bArr3[i22] = b12;
                            i22++;
                            if ((i22 & i23) == 0 && i22 < 4096) {
                                i35++;
                                i23 += i22;
                            }
                        }
                        i34 = i37;
                        bArr4 = bArr6;
                        i36 = i38;
                    }
                }
            }
            i26 = i33;
            sArr = sArr2;
            bArr3 = bArr3;
            b11 = 0;
            i32 = i34;
            i21 = i35;
            eVar = this;
        }
        Arrays.fill(bArr2, i28, i13, b11);
    }

    private Bitmap m() {
        Boolean bool = this.f17481s;
        Bitmap bitmapB = this.f17465c.b(this.f17480r, this.f17479q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f17482t);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    private int n() {
        int iO = o();
        if (iO <= 0) {
            return iO;
        }
        ByteBuffer byteBuffer = this.f17466d;
        byteBuffer.get(this.f17467e, 0, Math.min(iO, byteBuffer.remaining()));
        return iO;
    }

    private int o() {
        return this.f17466d.get() & 255;
    }

    private Bitmap q(b bVar, b bVar2) {
        int i11;
        int i12;
        Bitmap bitmap;
        int[] iArr = this.f17472j;
        int i13 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f17475m;
            if (bitmap2 != null) {
                this.f17465c.c(bitmap2);
            }
            this.f17475m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f17440g == 3 && this.f17475m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i12 = bVar2.f17440g) > 0) {
            if (i12 == 2) {
                if (!bVar.f17439f) {
                    c cVar = this.f17474l;
                    int i14 = cVar.f17456l;
                    if (bVar.f17444k == null || cVar.f17454j != bVar.f17441h) {
                        i13 = i14;
                    }
                }
                int i15 = bVar2.f17437d;
                int i16 = this.f17478p;
                int i17 = i15 / i16;
                int i18 = bVar2.f17435b / i16;
                int i19 = bVar2.f17436c / i16;
                int i21 = bVar2.f17434a / i16;
                int i22 = this.f17480r;
                int i23 = (i18 * i22) + i21;
                int i24 = (i17 * i22) + i23;
                while (i23 < i24) {
                    int i25 = i23 + i19;
                    for (int i26 = i23; i26 < i25; i26++) {
                        iArr[i26] = i13;
                    }
                    i23 += this.f17480r;
                }
            } else if (i12 == 3 && (bitmap = this.f17475m) != null) {
                int i27 = this.f17480r;
                bitmap.getPixels(iArr, 0, i27, 0, 0, i27, this.f17479q);
            }
        }
        k(bVar);
        if (bVar.f17438e || this.f17478p != 1) {
            i(bVar);
        } else {
            j(bVar);
        }
        if (this.f17476n && ((i11 = bVar.f17440g) == 0 || i11 == 1)) {
            if (this.f17475m == null) {
                this.f17475m = m();
            }
            Bitmap bitmap3 = this.f17475m;
            int i28 = this.f17480r;
            bitmap3.setPixels(iArr, 0, i28, 0, 0, i28, this.f17479q);
        }
        Bitmap bitmapM = m();
        int i29 = this.f17480r;
        bitmapM.setPixels(iArr, 0, i29, 0, 0, i29, this.f17479q);
        return bitmapM;
    }

    @Override // bj.a
    public int a() {
        return this.f17474l.f17447c;
    }

    @Override // bj.a
    public int b() {
        return this.f17466d.limit() + this.f17471i.length + (this.f17472j.length * 4);
    }

    @Override // bj.a
    public void c(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f17482t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // bj.a
    public void clear() {
        this.f17474l = null;
        byte[] bArr = this.f17471i;
        if (bArr != null) {
            this.f17465c.e(bArr);
        }
        int[] iArr = this.f17472j;
        if (iArr != null) {
            this.f17465c.f(iArr);
        }
        Bitmap bitmap = this.f17475m;
        if (bitmap != null) {
            this.f17465c.c(bitmap);
        }
        this.f17475m = null;
        this.f17466d = null;
        this.f17481s = null;
        byte[] bArr2 = this.f17467e;
        if (bArr2 != null) {
            this.f17465c.e(bArr2);
        }
    }

    @Override // bj.a
    public void d() {
        this.f17473k = -1;
    }

    @Override // bj.a
    public int e() {
        return this.f17473k;
    }

    @Override // bj.a
    public void f() {
        this.f17473k = (this.f17473k + 1) % this.f17474l.f17447c;
    }

    @Override // bj.a
    public int g() {
        int i11;
        if (this.f17474l.f17447c <= 0 || (i11 = this.f17473k) < 0) {
            return 0;
        }
        return l(i11);
    }

    @Override // bj.a
    @NonNull
    public ByteBuffer getData() {
        return this.f17466d;
    }

    @Override // bj.a
    public synchronized Bitmap getNextFrame() {
        try {
            if (this.f17474l.f17447c <= 0 || this.f17473k < 0) {
                String str = f17462u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f17474l.f17447c + ", framePointer=" + this.f17473k);
                }
                this.f17477o = 1;
            }
            int i11 = this.f17477o;
            if (i11 != 1 && i11 != 2) {
                this.f17477o = 0;
                if (this.f17467e == null) {
                    this.f17467e = this.f17465c.a(255);
                }
                b bVar = this.f17474l.f17449e.get(this.f17473k);
                int i12 = this.f17473k - 1;
                b bVar2 = i12 >= 0 ? this.f17474l.f17449e.get(i12) : null;
                int[] iArr = bVar.f17444k;
                if (iArr == null) {
                    iArr = this.f17474l.f17445a;
                }
                this.f17463a = iArr;
                if (iArr == null) {
                    String str2 = f17462u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f17473k);
                    }
                    this.f17477o = 1;
                    return null;
                }
                if (bVar.f17439f) {
                    System.arraycopy(iArr, 0, this.f17464b, 0, iArr.length);
                    int[] iArr2 = this.f17464b;
                    this.f17463a = iArr2;
                    iArr2[bVar.f17441h] = 0;
                    if (bVar.f17440g == 2 && this.f17473k == 0) {
                        this.f17481s = Boolean.TRUE;
                    }
                }
                return q(bVar, bVar2);
            }
            String str3 = f17462u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f17477o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int l(int i11) {
        if (i11 < 0) {
            return -1;
        }
        c cVar = this.f17474l;
        if (i11 < cVar.f17447c) {
            return cVar.f17449e.get(i11).f17442i;
        }
        return -1;
    }

    public synchronized void p(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i11) {
        try {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i11);
            }
            int iHighestOneBit = Integer.highestOneBit(i11);
            this.f17477o = 0;
            this.f17474l = cVar;
            this.f17473k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f17466d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f17466d.order(ByteOrder.LITTLE_ENDIAN);
            this.f17476n = false;
            Iterator<b> it = cVar.f17449e.iterator();
            while (it.hasNext()) {
                if (it.next().f17440g == 3) {
                    this.f17476n = true;
                    break;
                }
            }
            this.f17478p = iHighestOneBit;
            int i12 = cVar.f17450f;
            this.f17480r = i12 / iHighestOneBit;
            int i13 = cVar.f17451g;
            this.f17479q = i13 / iHighestOneBit;
            this.f17471i = this.f17465c.a(i12 * i13);
            this.f17472j = this.f17465c.d(this.f17480r * this.f17479q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e(@NonNull a.InterfaceC0349a interfaceC0349a) {
        this.f17464b = new int[256];
        this.f17482t = Bitmap.Config.ARGB_8888;
        this.f17465c = interfaceC0349a;
        this.f17474l = new c();
    }
}
