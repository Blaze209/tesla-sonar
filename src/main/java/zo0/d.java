package zo0;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes9.dex */
public class d extends InputStream {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Logger f128460i = Logger.getLogger("net.sf.scuba");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g[] f128461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f128462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f128463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f128464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f128465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f128466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f128467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h f128468h;

    public d(int i11, h hVar) {
        this.f128468h = hVar;
        synchronized (hVar) {
            try {
                g[] gVarArrC = hVar.c();
                if (gVarArrC == null || gVarArrC.length < 1) {
                    throw new CardServiceException("No valid file selected, path = " + Arrays.toString(gVarArrC));
                }
                g[] gVarArr = new g[gVarArrC.length];
                this.f128461a = gVarArr;
                System.arraycopy(gVarArrC, 0, gVarArr, 0, gVarArrC.length);
                this.f128467g = gVarArrC[gVarArrC.length - 1].b();
                this.f128462b = new byte[i11];
                this.f128463c = 0;
                this.f128464d = 0;
                this.f128465e = 0;
                this.f128466f = -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int c(g[] gVarArr, int i11, int i12) {
        synchronized (this.f128468h) {
            try {
                if (i12 > this.f128462b.length) {
                    throw new IllegalArgumentException("length too big");
                }
                if (!Arrays.equals(this.f128468h.c(), gVarArr)) {
                    for (g gVar : gVarArr) {
                        this.f128468h.b(gVar.a());
                    }
                }
                byte[] bArrA = this.f128468h.a(i11, i12);
                if (bArrA == null) {
                    return 0;
                }
                System.arraycopy(bArrA, 0, this.f128462b, 0, bArrA.length);
                return bArrA.length;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.f128463c - this.f128465e;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        synchronized (this.f128468h) {
            this.f128466f = this.f128464d + this.f128465e;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        synchronized (this.f128468h) {
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[Catch: all -> 0x0026, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0018, B:14:0x002a, B:17:0x0034, B:19:0x0036, B:21:0x003a, B:22:0x0042, B:24:0x004a, B:29:0x0055, B:31:0x005c, B:32:0x0063, B:33:0x0064, B:34:0x006b, B:35:0x006c, B:36:0x0078, B:38:0x007a, B:39:0x0081), top: B:42:0x0003, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0018, B:14:0x002a, B:17:0x0034, B:19:0x0036, B:21:0x003a, B:22:0x0042, B:24:0x004a, B:29:0x0055, B:31:0x005c, B:32:0x0063, B:33:0x0064, B:34:0x006b, B:35:0x006c, B:36:0x0078, B:38:0x007a, B:39:0x0081), top: B:42:0x0003, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, Exception -> 0x0051, CardServiceException -> 0x0053, LOOP:1: B:23:0x0048->B:24:0x004a, LOOP_END, TryCatch #4 {CardServiceException -> 0x0053, Exception -> 0x0051, blocks: (B:22:0x0042, B:24:0x004a, B:29:0x0055), top: B:44:0x0042, outer: #1 }] */
    @Override // java.io.InputStream
    public int read() {
        int i11;
        int i12;
        int i13;
        int iMin;
        int i14;
        int iC;
        synchronized (this.f128468h) {
            try {
                if (Arrays.equals(this.f128461a, this.f128468h.c())) {
                    int i15 = this.f128464d;
                    i11 = this.f128465e;
                    i12 = i15 + i11;
                    i13 = this.f128467g;
                    if (i12 >= i13) {
                        return -1;
                    }
                    if (i11 >= this.f128463c) {
                        iMin = Math.min(this.f128462b.length, i13 - i12);
                        i14 = this.f128464d + this.f128463c;
                        iC = 0;
                        while (iC == 0) {
                            iC = c(this.f128461a, i14, iMin);
                        }
                        this.f128464d = i14;
                        this.f128465e = 0;
                        this.f128463c = iC;
                    }
                    byte[] bArr = this.f128462b;
                    int i16 = this.f128465e;
                    int i17 = bArr[i16] & 255;
                    this.f128465e = i16 + 1;
                    return i17;
                }
                for (g gVar : this.f128461a) {
                    this.f128468h.b(gVar.a());
                }
                int i18 = this.f128464d;
                i11 = this.f128465e;
                i12 = i18 + i11;
                i13 = this.f128467g;
                if (i12 >= i13) {
                    return -1;
                }
                if (i11 >= this.f128463c) {
                    iMin = Math.min(this.f128462b.length, i13 - i12);
                    try {
                        i14 = this.f128464d + this.f128463c;
                        iC = 0;
                        while (iC == 0) {
                            iC = c(this.f128461a, i14, iMin);
                        }
                        this.f128464d = i14;
                        this.f128465e = 0;
                        this.f128463c = iC;
                    } catch (CardServiceException e11) {
                        throw new IOException("Unexpected exception", e11);
                    } catch (Exception e12) {
                        throw new IOException("Unexpected exception", e12);
                    }
                }
                byte[] bArr2 = this.f128462b;
                int i19 = this.f128465e;
                int i110 = bArr2[i19] & 255;
                this.f128465e = i19 + 1;
                return i110;
            } catch (CardServiceException e13) {
                throw new IOException("Unexpected exception", e13);
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this.f128468h) {
            try {
                int i11 = this.f128466f;
                if (i11 < 0) {
                    throw new IOException("Mark not set");
                }
                this.f128464d = i11;
                this.f128465e = 0;
                this.f128463c = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        synchronized (this.f128468h) {
            try {
                int i11 = this.f128463c;
                int i12 = this.f128465e;
                if (j11 < i11 - i12) {
                    this.f128465e = (int) (((long) i12) + j11);
                } else {
                    this.f128464d = (int) (((long) (this.f128464d + i12)) + j11);
                    this.f128465e = 0;
                    this.f128463c = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }
}
