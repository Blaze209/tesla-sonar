package v9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.List;
import s7.b0;
import s7.c0;
import s7.n;
import s7.q0;
import s7.t;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f118422h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f118423i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f118424j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f118425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f118426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f118427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f118428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2539a f118429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f118430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f118431g;

    /* JADX INFO: renamed from: v9.a$a, reason: collision with other inner class name */
    private static final class C2539a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f118433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f118434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f118435d;

        public C2539a(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f118432a = i11;
            this.f118433b = iArr;
            this.f118434c = iArr2;
            this.f118435d = iArr3;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f118437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f118438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f118439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f118440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f118441f;

        public b(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f118436a = i11;
            this.f118437b = i12;
            this.f118438c = i13;
            this.f118439d = i14;
            this.f118440e = i15;
            this.f118441f = i16;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f118443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f118444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f118445d;

        public c(int i11, boolean z11, byte[] bArr, byte[] bArr2) {
            this.f118442a = i11;
            this.f118443b = z11;
            this.f118444c = bArr;
            this.f118445d = bArr2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f118447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f118448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f118449d;

        public d(int i11, int i12, int i13, SparseArray<e> sparseArray) {
            this.f118446a = i11;
            this.f118447b = i12;
            this.f118448c = i13;
            this.f118449d = sparseArray;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f118451b;

        public e(int i11, int i12) {
            this.f118450a = i11;
            this.f118451b = i12;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f118453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f118454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f118455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f118456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f118457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f118458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f118459h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f118460i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f118461j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f118462k;

        public f(int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, SparseArray<g> sparseArray) {
            this.f118452a = i11;
            this.f118453b = z11;
            this.f118454c = i12;
            this.f118455d = i13;
            this.f118456e = i14;
            this.f118457f = i15;
            this.f118458g = i16;
            this.f118459h = i17;
            this.f118460i = i18;
            this.f118461j = i19;
            this.f118462k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f118462k;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                this.f118462k.put(sparseArray.keyAt(i11), sparseArray.valueAt(i11));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f118464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f118465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f118466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f118467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f118468f;

        public g(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f118463a = i11;
            this.f118464b = i12;
            this.f118465c = i13;
            this.f118466d = i14;
            this.f118467e = i15;
            this.f118468f = i16;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f118469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f118470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f118471c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<C2539a> f118472d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f118473e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<C2539a> f118474f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f118475g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f118476h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f118477i;

        public h(int i11, int i12) {
            this.f118469a = i11;
            this.f118470b = i12;
        }

        public void a() {
            this.f118471c.clear();
            this.f118472d.clear();
            this.f118473e.clear();
            this.f118474f.clear();
            this.f118475g.clear();
            this.f118476h = null;
            this.f118477i = null;
        }
    }

    public a(List<byte[]> list) {
        c0 c0Var = new c0(list.get(0));
        int iU = c0Var.U();
        int iU2 = c0Var.U();
        Paint paint = new Paint();
        this.f118425a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f118426b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f118427c = new Canvas();
        this.f118428d = new b(719, 575, 0, 719, 0, 575);
        this.f118429e = new C2539a(0, e(), f(), g());
        this.f118430f = new h(iU, iU2);
    }

    private static byte[] d(int i11, int i12, b0 b0Var) {
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) b0Var.h(i12);
        }
        return bArr;
    }

    private static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i11 = 1; i11 < 16; i11++) {
            if (i11 < 8) {
                iArr[i11] = h(255, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i11] = h(255, (i11 & 1) != 0 ? 127 : 0, (i11 & 2) != 0 ? 127 : 0, (i11 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = h(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                if (i12 == 0) {
                    iArr[i11] = h(255, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 8) {
                    iArr[i11] = h(127, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 128) {
                    iArr[i11] = h(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = h(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int h(int i11, int i12, int i13, int i14) {
        return (i11 << 24) | (i12 << 16) | (i13 << 8) | i14;
    }

    private static int i(b0 b0Var, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        int i13;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = b0Var.h(2);
            if (iH3 != 0) {
                z11 = z11;
                i13 = 1;
            } else {
                if (b0Var.g()) {
                    iH = b0Var.h(3) + 3;
                    iH2 = b0Var.h(2);
                } else {
                    if (b0Var.g()) {
                        i13 = 1;
                    } else {
                        int iH4 = b0Var.h(2);
                        if (iH4 == 0) {
                            z11 = true;
                        } else if (iH4 == 1) {
                            i13 = 2;
                        } else if (iH4 == 2) {
                            iH = b0Var.h(4) + 12;
                            iH2 = b0Var.h(2);
                        } else if (iH4 != 3) {
                            z11 = z11;
                        } else {
                            iH = b0Var.h(8) + 29;
                            iH2 = b0Var.h(2);
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

    private static int j(b0 b0Var, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        int i13;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = b0Var.h(4);
            if (iH3 != 0) {
                z11 = z11;
                i13 = 1;
            } else if (b0Var.g()) {
                if (b0Var.g()) {
                    int iH4 = b0Var.h(2);
                    if (iH4 == 0) {
                        i13 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i13 = 2;
                        z11 = z11;
                    } else if (iH4 == 2) {
                        iH = b0Var.h(4) + 9;
                        iH2 = b0Var.h(4);
                    } else if (iH4 != 3) {
                        z11 = z11;
                        iH3 = 0;
                        i13 = 0;
                    } else {
                        iH = b0Var.h(8) + 25;
                        iH2 = b0Var.h(4);
                    }
                } else {
                    iH = b0Var.h(2) + 4;
                    iH2 = b0Var.h(4);
                }
                z11 = z11;
                i13 = iH;
                iH3 = iH2;
            } else {
                int iH5 = b0Var.h(3);
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

    private static int k(b0 b0Var, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z11;
        int iH;
        boolean z12 = false;
        while (true) {
            int iH2 = b0Var.h(8);
            if (iH2 != 0) {
                z11 = z12;
                iH = 1;
            } else if (b0Var.g()) {
                z11 = z12;
                iH = b0Var.h(7);
                iH2 = b0Var.h(8);
            } else {
                int iH3 = b0Var.h(7);
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

    private static void l(byte[] bArr, int[] iArr, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        b0 b0Var = new b0(bArr);
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        int i14 = i12;
        int i15 = i13;
        byte[] bArrD3 = null;
        while (b0Var.b() != 0) {
            int iH = b0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i11 != 3) {
                            if (i11 == 2) {
                                bArr3 = bArrD2 == null ? f118422h : bArrD2;
                            } else {
                                bArr2 = null;
                            }
                            i14 = i(b0Var, iArr2, bArr2, i14, i15, paint2, canvas2);
                            b0Var.c();
                        } else {
                            bArr3 = bArrD3 == null ? f118423i : bArrD3;
                        }
                        bArr2 = bArr3;
                        i14 = i(b0Var, iArr2, bArr2, i14, i15, paint2, canvas2);
                        b0Var.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        i14 = j(b0Var, iArr2, i11 == 3 ? bArrD == null ? f118424j : bArrD : null, i14, i15, paint2, canvas2);
                        b0Var.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i14 = k(b0Var, iArr2, null, i14, i15, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrD2 = d(4, 4, b0Var);
                                break;
                            case 33:
                                bArrD3 = d(4, 8, b0Var);
                                break;
                            case 34:
                                bArrD = d(16, 8, b0Var);
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
                i15 += 2;
                i14 = i12;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void m(c cVar, C2539a c2539a, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i11 == 3) {
            iArr = c2539a.f118435d;
        } else {
            iArr = i11 == 2 ? c2539a.f118434c : c2539a.f118433b;
        }
        int[] iArr2 = iArr;
        l(cVar.f118444c, iArr2, i11, i12, i13, paint, canvas);
        l(cVar.f118445d, iArr2, i11, i12, i13 + 1, paint, canvas);
    }

    private t9.d n(b0 b0Var) {
        int i11;
        while (b0Var.b() >= 48 && b0Var.h(8) == 15) {
            t(b0Var, this.f118430f);
        }
        h hVar = this.f118430f;
        d dVar = hVar.f118477i;
        if (dVar == null) {
            return new t9.d(x.r(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f118476h;
        if (bVar == null) {
            bVar = this.f118428d;
        }
        Bitmap bitmap = this.f118431g;
        if (bitmap == null || bVar.f118436a + 1 != bitmap.getWidth() || bVar.f118437b + 1 != this.f118431g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f118436a + 1, bVar.f118437b + 1, Bitmap.Config.ARGB_8888);
            this.f118431g = bitmapCreateBitmap;
            this.f118427c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f118449d;
        int i12 = 0;
        while (i12 < sparseArray.size()) {
            this.f118427c.save();
            e eVarValueAt = sparseArray.valueAt(i12);
            f fVar = this.f118430f.f118471c.get(sparseArray.keyAt(i12));
            int i13 = eVarValueAt.f118450a + bVar.f118438c;
            int i14 = eVarValueAt.f118451b + bVar.f118440e;
            this.f118427c.clipRect(i13, i14, Math.min(fVar.f118454c + i13, bVar.f118439d), Math.min(fVar.f118455d + i14, bVar.f118441f));
            C2539a c2539a = this.f118430f.f118472d.get(fVar.f118458g);
            if (c2539a == null && (c2539a = this.f118430f.f118474f.get(fVar.f118458g)) == null) {
                c2539a = this.f118429e;
            }
            C2539a c2539a2 = c2539a;
            SparseArray<g> sparseArray2 = fVar.f118462k;
            int i15 = 0;
            while (i15 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i15);
                g gVarValueAt = sparseArray2.valueAt(i15);
                c cVar = this.f118430f.f118473e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f118430f.f118475g.get(iKeyAt);
                }
                if (cVar != null) {
                    m(cVar, c2539a2, fVar.f118457f, gVarValueAt.f118465c + i13, gVarValueAt.f118466d + i14, cVar.f118443b ? null : this.f118425a, this.f118427c);
                }
                i15++;
                sparseArray = sparseArray;
            }
            SparseArray<e> sparseArray3 = sparseArray;
            if (fVar.f118453b) {
                int i16 = fVar.f118457f;
                if (i16 == 3) {
                    i11 = c2539a2.f118435d[fVar.f118459h];
                } else {
                    i11 = i16 == 2 ? c2539a2.f118434c[fVar.f118460i] : c2539a2.f118433b[fVar.f118461j];
                }
                this.f118426b.setColor(i11);
                this.f118427c.drawRect(i13, i14, fVar.f118454c + i13, fVar.f118455d + i14, this.f118426b);
            }
            arrayList.add(new r7.a.b().f(Bitmap.createBitmap(this.f118431g, i13, i14, fVar.f118454c, fVar.f118455d)).k(i13 / bVar.f118436a).l(0).h(i14 / bVar.f118437b, 0).i(0).n(fVar.f118454c / bVar.f118436a).g(fVar.f118455d / bVar.f118437b).a());
            this.f118427c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f118427c.restore();
            i12++;
            sparseArray = sparseArray3;
        }
        return new t9.d(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C2539a o(b0 b0Var, int i11) {
        int[] iArr;
        int iH;
        int i12;
        int iH2;
        int iH3;
        int iH4;
        int i13 = 8;
        int iH5 = b0Var.h(8);
        b0Var.r(8);
        int i14 = 2;
        int i15 = i11 - 2;
        int[] iArrE = e();
        int[] iArrF = f();
        int[] iArrG = g();
        while (i15 > 0) {
            int iH6 = b0Var.h(i13);
            int iH7 = b0Var.h(i13);
            if ((iH7 & 128) != 0) {
                iArr = iArrE;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrF : iArrG;
            }
            if ((iH7 & 1) != 0) {
                iH3 = b0Var.h(i13);
                iH4 = b0Var.h(i13);
                iH = b0Var.h(i13);
                iH2 = b0Var.h(i13);
                i12 = i15 - 6;
            } else {
                int iH8 = b0Var.h(6) << i14;
                int iH9 = b0Var.h(4) << 4;
                iH = b0Var.h(4) << 4;
                i12 = i15 - 4;
                iH2 = b0Var.h(i14) << 6;
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
            iArr[iH6] = h((byte) (255 - (iH2 & 255)), q0.r((int) (d11 + (1.402d * d12)), 0, 255), q0.r((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), q0.r((int) (d11 + (d13 * 1.772d)), 0, 255));
            i15 = i12;
            iH5 = iH5;
            i13 = 8;
            i14 = 2;
        }
        return new C2539a(iH5, iArrE, iArrF, iArrG);
    }

    private static b p(b0 b0Var) {
        int i11;
        int i12;
        int i13;
        int iH;
        b0Var.r(4);
        boolean zG = b0Var.g();
        b0Var.r(3);
        int iH2 = b0Var.h(16);
        int iH3 = b0Var.h(16);
        if (zG) {
            int iH4 = b0Var.h(16);
            int iH5 = b0Var.h(16);
            int iH6 = b0Var.h(16);
            iH = b0Var.h(16);
            i13 = iH5;
            i12 = iH6;
            i11 = iH4;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i11, i13, i12, iH);
    }

    private static c q(b0 b0Var) {
        byte[] bArr;
        int iH = b0Var.h(16);
        b0Var.r(4);
        int iH2 = b0Var.h(2);
        boolean zG = b0Var.g();
        b0Var.r(1);
        byte[] bArr2 = q0.f110459f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = b0Var.h(16);
                int iH4 = b0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    b0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    b0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        b0Var.r(b0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d r(b0 b0Var, int i11) {
        int iH = b0Var.h(8);
        int iH2 = b0Var.h(4);
        int iH3 = b0Var.h(2);
        b0Var.r(2);
        int i12 = i11 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int iH4 = b0Var.h(8);
            b0Var.r(8);
            i12 -= 6;
            sparseArray.put(iH4, new e(b0Var.h(16), b0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f s(b0 b0Var, int i11) {
        int i12;
        int iH;
        int iH2;
        char c11;
        int iH3 = b0Var.h(8);
        int i13 = 4;
        b0Var.r(4);
        boolean zG = b0Var.g();
        b0Var.r(3);
        int i14 = 16;
        int iH4 = b0Var.h(16);
        int iH5 = b0Var.h(16);
        int iH6 = b0Var.h(3);
        int iH7 = b0Var.h(3);
        int i15 = 2;
        b0Var.r(2);
        int iH8 = b0Var.h(8);
        int iH9 = b0Var.h(8);
        int iH10 = b0Var.h(4);
        int iH11 = b0Var.h(2);
        b0Var.r(2);
        int i16 = i11 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i16 > 0) {
            int iH12 = b0Var.h(i14);
            int iH13 = b0Var.h(i15);
            int iH14 = b0Var.h(i15);
            int iH15 = b0Var.h(12);
            b0Var.r(i13);
            int iH16 = b0Var.h(12);
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
            iH2 = b0Var.h(8);
            iH = b0Var.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i14 = 16;
            i15 = i12;
            i13 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void t(b0 b0Var, h hVar) {
        f fVar;
        int iH = b0Var.h(8);
        int iH2 = b0Var.h(16);
        int iH3 = b0Var.h(16);
        int iD = b0Var.d() + iH3;
        if (iH3 * 8 > b0Var.b()) {
            t.i("DvbParser", "Data field length exceeds limit");
            b0Var.r(b0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f118469a) {
                    d dVar = hVar.f118477i;
                    d dVarR = r(b0Var, iH3);
                    if (dVarR.f118448c != 0) {
                        hVar.f118477i = dVarR;
                        hVar.f118471c.clear();
                        hVar.f118472d.clear();
                        hVar.f118473e.clear();
                    } else if (dVar != null && dVar.f118447b != dVarR.f118447b) {
                        hVar.f118477i = dVarR;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f118477i;
                if (iH2 == hVar.f118469a && dVar2 != null) {
                    f fVarS = s(b0Var, iH3);
                    if (dVar2.f118448c == 0 && (fVar = hVar.f118471c.get(fVarS.f118452a)) != null) {
                        fVarS.a(fVar);
                    }
                    hVar.f118471c.put(fVarS.f118452a, fVarS);
                }
                break;
            case 18:
                if (iH2 == hVar.f118469a) {
                    C2539a c2539aO = o(b0Var, iH3);
                    hVar.f118472d.put(c2539aO.f118432a, c2539aO);
                } else if (iH2 == hVar.f118470b) {
                    C2539a c2539aO2 = o(b0Var, iH3);
                    hVar.f118474f.put(c2539aO2.f118432a, c2539aO2);
                }
                break;
            case 19:
                if (iH2 == hVar.f118469a) {
                    c cVarQ = q(b0Var);
                    hVar.f118473e.put(cVarQ.f118442a, cVarQ);
                } else if (iH2 == hVar.f118470b) {
                    c cVarQ2 = q(b0Var);
                    hVar.f118475g.put(cVarQ2.f118442a, cVarQ2);
                }
                break;
            case 20:
                if (iH2 == hVar.f118469a) {
                    hVar.f118476h = p(b0Var);
                }
                break;
        }
        b0Var.s(iD - b0Var.d());
    }

    @Override // t9.q
    public void a(byte[] bArr, int i11, int i12, q.b bVar, n<t9.d> nVar) {
        b0 b0Var = new b0(bArr, i12 + i11);
        b0Var.p(i11);
        nVar.accept(n(b0Var));
    }

    @Override // t9.q
    public int b() {
        return 2;
    }

    @Override // t9.q
    public void reset() {
        this.f118430f.a();
    }
}
