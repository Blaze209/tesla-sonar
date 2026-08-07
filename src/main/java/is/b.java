package is;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ts.c0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f81814h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f81815i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f81816j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f81817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f81818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f81819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1715b f81820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f81821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f81822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f81823g;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f81825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f81826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f81827d;

        public a(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f81824a = i11;
            this.f81825b = iArr;
            this.f81826c = iArr2;
            this.f81827d = iArr3;
        }
    }

    /* JADX INFO: renamed from: is.b$b, reason: collision with other inner class name */
    private static final class C1715b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81833f;

        public C1715b(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f81828a = i11;
            this.f81829b = i12;
            this.f81830c = i13;
            this.f81831d = i14;
            this.f81832e = i15;
            this.f81833f = i16;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f81836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f81837d;

        public c(int i11, boolean z11, byte[] bArr, byte[] bArr2) {
            this.f81834a = i11;
            this.f81835b = z11;
            this.f81836c = bArr;
            this.f81837d = bArr2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f81841d;

        public d(int i11, int i12, int i13, SparseArray<e> sparseArray) {
            this.f81838a = i11;
            this.f81839b = i12;
            this.f81840c = i13;
            this.f81841d = sparseArray;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81843b;

        public e(int i11, int i12) {
            this.f81842a = i11;
            this.f81843b = i12;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f81851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f81852i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f81853j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f81854k;

        public f(int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, SparseArray<g> sparseArray) {
            this.f81844a = i11;
            this.f81845b = z11;
            this.f81846c = i12;
            this.f81847d = i13;
            this.f81848e = i14;
            this.f81849f = i15;
            this.f81850g = i16;
            this.f81851h = i17;
            this.f81852i = i18;
            this.f81853j = i19;
            this.f81854k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f81854k;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                this.f81854k.put(sparseArray.keyAt(i11), sparseArray.valueAt(i11));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81860f;

        public g(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f81855a = i11;
            this.f81856b = i12;
            this.f81857c = i13;
            this.f81858d = i14;
            this.f81859e = i15;
            this.f81860f = i16;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f81863c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f81864d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f81865e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f81866f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f81867g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C1715b f81868h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f81869i;

        public h(int i11, int i12) {
            this.f81861a = i11;
            this.f81862b = i12;
        }

        public void a() {
            this.f81863c.clear();
            this.f81864d.clear();
            this.f81865e.clear();
            this.f81866f.clear();
            this.f81867g.clear();
            this.f81868h = null;
            this.f81869i = null;
        }
    }

    public b(int i11, int i12) {
        Paint paint = new Paint();
        this.f81817a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f81818b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f81819c = new Canvas();
        this.f81820d = new C1715b(719, 575, 0, 719, 0, 575);
        this.f81821e = new a(0, c(), d(), e());
        this.f81822f = new h(i11, i12);
    }

    private static byte[] a(int i11, int i12, c0 c0Var) {
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) c0Var.h(i12);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i11 = 1; i11 < 16; i11++) {
            if (i11 < 8) {
                iArr[i11] = f(255, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i11] = f(255, (i11 & 1) != 0 ? 127 : 0, (i11 & 2) != 0 ? 127 : 0, (i11 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = f(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                if (i12 == 0) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 8) {
                    iArr[i11] = f(127, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 128) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i11, int i12, int i13, int i14) {
        return (i11 << 24) | (i12 << 16) | (i13 << 8) | i14;
    }

    private static int g(c0 c0Var, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        int i13;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c0Var.h(2);
            if (iH3 != 0) {
                z11 = z11;
                i13 = 1;
            } else {
                if (c0Var.g()) {
                    iH = c0Var.h(3) + 3;
                    iH2 = c0Var.h(2);
                } else {
                    if (c0Var.g()) {
                        i13 = 1;
                    } else {
                        int iH4 = c0Var.h(2);
                        if (iH4 == 0) {
                            z11 = true;
                        } else if (iH4 == 1) {
                            i13 = 2;
                        } else if (iH4 == 2) {
                            iH = c0Var.h(4) + 12;
                            iH2 = c0Var.h(2);
                        } else if (iH4 != 3) {
                            z11 = z11;
                        } else {
                            iH = c0Var.h(8) + 29;
                            iH2 = c0Var.h(2);
                        }
                        iH3 = 0;
                        i13 = 0;
                    }
                    iH3 = 0;
                }
                z11 = z11;
                i13 = iH;
                iH3 = iH2;
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i11, i12, i11 + i13, 1 + i12, paint);
            }
            i11 += i13;
            if (z11) {
                return i11;
            }
            z11 = z11;
        }
    }

    private static int h(c0 c0Var, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        int i13;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c0Var.h(4);
            if (iH3 != 0) {
                z11 = z11;
                i13 = 1;
            } else if (c0Var.g()) {
                if (c0Var.g()) {
                    int iH4 = c0Var.h(2);
                    if (iH4 == 0) {
                        i13 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i13 = 2;
                        z11 = z11;
                    } else if (iH4 == 2) {
                        iH = c0Var.h(4) + 9;
                        iH2 = c0Var.h(4);
                    } else if (iH4 != 3) {
                        z11 = z11;
                        iH3 = 0;
                        i13 = 0;
                    } else {
                        iH = c0Var.h(8) + 25;
                        iH2 = c0Var.h(4);
                    }
                } else {
                    iH = c0Var.h(2) + 4;
                    iH2 = c0Var.h(4);
                }
                z11 = z11;
                i13 = iH;
                iH3 = iH2;
            } else {
                int iH5 = c0Var.h(3);
                if (iH5 != 0) {
                    i13 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z11 = true;
                    iH3 = 0;
                    i13 = 0;
                }
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i11, i12, i11 + i13, 1 + i12, paint);
            }
            i11 += i13;
            if (z11) {
                return i11;
            }
            z11 = z11;
        }
    }

    private static int i(c0 c0Var, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z11;
        int iH;
        boolean z12 = false;
        while (true) {
            int iH2 = c0Var.h(8);
            if (iH2 != 0) {
                z11 = z12;
                iH = 1;
            } else if (c0Var.g()) {
                z11 = z12;
                iH = c0Var.h(7);
                iH2 = c0Var.h(8);
            } else {
                int iH3 = c0Var.h(7);
                if (iH3 != 0) {
                    z11 = z12;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z11 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i11, i12, i11 + iH, 1 + i12, paint);
            }
            i11 += iH;
            if (z11) {
                return i11;
            }
            z12 = z11;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        c0 c0Var = new c0(bArr);
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        int iG = i12;
        int i14 = i13;
        byte[] bArrA3 = null;
        while (c0Var.b() != 0) {
            int iH = c0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i11 != 3) {
                            if (i11 == 2) {
                                bArr3 = bArrA2 == null ? f81814h : bArrA2;
                            } else {
                                bArr2 = null;
                            }
                            iG = g(c0Var, iArr2, bArr2, iG, i14, paint2, canvas2);
                            c0Var.c();
                        } else {
                            bArr3 = bArrA3 == null ? f81815i : bArrA3;
                        }
                        bArr2 = bArr3;
                        iG = g(c0Var, iArr2, bArr2, iG, i14, paint2, canvas2);
                        c0Var.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iG = h(c0Var, iArr2, i11 == 3 ? bArrA == null ? f81816j : bArrA : null, iG, i14, paint2, canvas2);
                        c0Var.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iG = i(c0Var, iArr2, null, iG, i14, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA2 = a(4, 4, c0Var);
                                break;
                            case 33:
                                bArrA3 = a(4, 8, c0Var);
                                break;
                            case 34:
                                bArrA = a(16, 8, c0Var);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i14 += 2;
                iG = i12;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void k(c cVar, a aVar, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i11 == 3) {
            iArr = aVar.f81827d;
        } else {
            iArr = i11 == 2 ? aVar.f81826c : aVar.f81825b;
        }
        int[] iArr2 = iArr;
        j(cVar.f81836c, iArr2, i11, i12, i13, paint, canvas);
        j(cVar.f81837d, iArr2, i11, i12, i13 + 1, paint, canvas);
    }

    private static a l(c0 c0Var, int i11) {
        int[] iArr;
        int iH;
        int i12;
        int iH2;
        int iH3;
        int iH4;
        int i13 = 8;
        int iH5 = c0Var.h(8);
        c0Var.r(8);
        int i14 = 2;
        int i15 = i11 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i15 > 0) {
            int iH6 = c0Var.h(i13);
            int iH7 = c0Var.h(i13);
            if ((iH7 & 128) != 0) {
                iArr = iArrC;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((iH7 & 1) != 0) {
                iH3 = c0Var.h(i13);
                iH4 = c0Var.h(i13);
                iH = c0Var.h(i13);
                iH2 = c0Var.h(i13);
                i12 = i15 - 6;
            } else {
                int iH8 = c0Var.h(6) << i14;
                int iH9 = c0Var.h(4) << 4;
                iH = c0Var.h(4) << 4;
                i12 = i15 - 4;
                iH2 = c0Var.h(i14) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d11 = iH3;
            double d12 = iH4 + RangingPosition.RSSI_UNKNOWN;
            double d13 = iH + RangingPosition.RSSI_UNKNOWN;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), p0.q((int) (d11 + (1.402d * d12)), 0, 255), p0.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), p0.q((int) (d11 + (d13 * 1.772d)), 0, 255));
            i15 = i12;
            iH5 = iH5;
            i13 = 8;
            i14 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    private static C1715b m(c0 c0Var) {
        int i11;
        int i12;
        int i13;
        int iH;
        c0Var.r(4);
        boolean zG = c0Var.g();
        c0Var.r(3);
        int iH2 = c0Var.h(16);
        int iH3 = c0Var.h(16);
        if (zG) {
            int iH4 = c0Var.h(16);
            int iH5 = c0Var.h(16);
            int iH6 = c0Var.h(16);
            iH = c0Var.h(16);
            i13 = iH5;
            i12 = iH6;
            i11 = iH4;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = iH2;
            iH = iH3;
        }
        return new C1715b(iH2, iH3, i11, i13, i12, iH);
    }

    private static c n(c0 c0Var) {
        byte[] bArr;
        int iH = c0Var.h(16);
        c0Var.r(4);
        int iH2 = c0Var.h(2);
        boolean zG = c0Var.g();
        c0Var.r(1);
        byte[] bArr2 = p0.f115045f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = c0Var.h(16);
                int iH4 = c0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    c0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    c0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        c0Var.r(c0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d o(c0 c0Var, int i11) {
        int iH = c0Var.h(8);
        int iH2 = c0Var.h(4);
        int iH3 = c0Var.h(2);
        c0Var.r(2);
        int i12 = i11 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int iH4 = c0Var.h(8);
            c0Var.r(8);
            i12 -= 6;
            sparseArray.put(iH4, new e(c0Var.h(16), c0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f p(c0 c0Var, int i11) {
        int i12;
        int iH;
        int iH2;
        char c11;
        int iH3 = c0Var.h(8);
        int i13 = 4;
        c0Var.r(4);
        boolean zG = c0Var.g();
        c0Var.r(3);
        int i14 = 16;
        int iH4 = c0Var.h(16);
        int iH5 = c0Var.h(16);
        int iH6 = c0Var.h(3);
        int iH7 = c0Var.h(3);
        int i15 = 2;
        c0Var.r(2);
        int iH8 = c0Var.h(8);
        int iH9 = c0Var.h(8);
        int iH10 = c0Var.h(4);
        int iH11 = c0Var.h(2);
        c0Var.r(2);
        int i16 = i11 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i16 > 0) {
            int iH12 = c0Var.h(i14);
            int iH13 = c0Var.h(i15);
            int iH14 = c0Var.h(i15);
            int iH15 = c0Var.h(12);
            c0Var.r(i13);
            int iH16 = c0Var.h(12);
            int i17 = i16 - 6;
            if (iH13 != 1) {
                i12 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i16 = i17;
                    c11 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i14 = 16;
                i15 = i12;
                i13 = 4;
            } else {
                i12 = 2;
            }
            c11 = '\b';
            i16 -= 8;
            iH2 = c0Var.h(8);
            iH = c0Var.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i14 = 16;
            i15 = i12;
            i13 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void q(c0 c0Var, h hVar) {
        f fVar;
        int iH = c0Var.h(8);
        int iH2 = c0Var.h(16);
        int iH3 = c0Var.h(16);
        int iD = c0Var.d() + iH3;
        if (iH3 * 8 > c0Var.b()) {
            u.i("DvbParser", "Data field length exceeds limit");
            c0Var.r(c0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f81861a) {
                    d dVar = hVar.f81869i;
                    d dVarO = o(c0Var, iH3);
                    if (dVarO.f81840c != 0) {
                        hVar.f81869i = dVarO;
                        hVar.f81863c.clear();
                        hVar.f81864d.clear();
                        hVar.f81865e.clear();
                    } else if (dVar != null && dVar.f81839b != dVarO.f81839b) {
                        hVar.f81869i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f81869i;
                if (iH2 == hVar.f81861a && dVar2 != null) {
                    f fVarP = p(c0Var, iH3);
                    if (dVar2.f81840c == 0 && (fVar = hVar.f81863c.get(fVarP.f81844a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f81863c.put(fVarP.f81844a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f81861a) {
                    a aVarL = l(c0Var, iH3);
                    hVar.f81864d.put(aVarL.f81824a, aVarL);
                } else if (iH2 == hVar.f81862b) {
                    a aVarL2 = l(c0Var, iH3);
                    hVar.f81866f.put(aVarL2.f81824a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == hVar.f81861a) {
                    c cVarN = n(c0Var);
                    hVar.f81865e.put(cVarN.f81834a, cVarN);
                } else if (iH2 == hVar.f81862b) {
                    c cVarN2 = n(c0Var);
                    hVar.f81867g.put(cVarN2.f81834a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == hVar.f81861a) {
                    hVar.f81868h = m(c0Var);
                }
                break;
        }
        c0Var.s(iD - c0Var.d());
    }

    public List<gs.b> b(byte[] bArr, int i11) {
        int i12;
        c0 c0Var = new c0(bArr, i11);
        while (c0Var.b() >= 48 && c0Var.h(8) == 15) {
            q(c0Var, this.f81822f);
        }
        h hVar = this.f81822f;
        d dVar = hVar.f81869i;
        if (dVar == null) {
            return Collections.EMPTY_LIST;
        }
        C1715b c1715b = hVar.f81868h;
        if (c1715b == null) {
            c1715b = this.f81820d;
        }
        Bitmap bitmap = this.f81823g;
        if (bitmap == null || c1715b.f81828a + 1 != bitmap.getWidth() || c1715b.f81829b + 1 != this.f81823g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1715b.f81828a + 1, c1715b.f81829b + 1, Bitmap.Config.ARGB_8888);
            this.f81823g = bitmapCreateBitmap;
            this.f81819c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f81841d;
        int i13 = 0;
        while (i13 < sparseArray.size()) {
            this.f81819c.save();
            e eVarValueAt = sparseArray.valueAt(i13);
            f fVar = this.f81822f.f81863c.get(sparseArray.keyAt(i13));
            int i14 = eVarValueAt.f81842a + c1715b.f81830c;
            int i15 = eVarValueAt.f81843b + c1715b.f81832e;
            this.f81819c.clipRect(i14, i15, Math.min(fVar.f81846c + i14, c1715b.f81831d), Math.min(fVar.f81847d + i15, c1715b.f81833f));
            a aVar = this.f81822f.f81864d.get(fVar.f81850g);
            if (aVar == null && (aVar = this.f81822f.f81866f.get(fVar.f81850g)) == null) {
                aVar = this.f81821e;
            }
            a aVar2 = aVar;
            SparseArray<g> sparseArray2 = fVar.f81854k;
            int i16 = 0;
            while (i16 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i16);
                g gVarValueAt = sparseArray2.valueAt(i16);
                c cVar = this.f81822f.f81865e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f81822f.f81867g.get(iKeyAt);
                }
                if (cVar != null) {
                    k(cVar, aVar2, fVar.f81849f, gVarValueAt.f81857c + i14, gVarValueAt.f81858d + i15, cVar.f81835b ? null : this.f81817a, this.f81819c);
                }
                i16++;
                sparseArray = sparseArray;
            }
            SparseArray<e> sparseArray3 = sparseArray;
            if (fVar.f81845b) {
                int i17 = fVar.f81849f;
                if (i17 == 3) {
                    i12 = aVar2.f81827d[fVar.f81851h];
                } else {
                    i12 = i17 == 2 ? aVar2.f81826c[fVar.f81852i] : aVar2.f81825b[fVar.f81853j];
                }
                this.f81818b.setColor(i12);
                this.f81819c.drawRect(i14, i15, fVar.f81846c + i14, fVar.f81847d + i15, this.f81818b);
            }
            arrayList.add(new gs.b.C1421b().f(Bitmap.createBitmap(this.f81823g, i14, i15, fVar.f81846c, fVar.f81847d)).k(i14 / c1715b.f81828a).l(0).h(i15 / c1715b.f81829b, 0).i(0).n(fVar.f81846c / c1715b.f81828a).g(fVar.f81847d / c1715b.f81829b).a());
            this.f81819c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f81819c.restore();
            i13++;
            sparseArray = sparseArray3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f81822f.a();
    }
}
