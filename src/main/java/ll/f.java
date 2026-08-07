package ll;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Drawable[] f90108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f90109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f90110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f90111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f90112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f90113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f90114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int[] f90115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int[] f90116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f90117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean[] f90118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f90119t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private bm.m f90120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f90121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f90122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f90123x;

    public f(Drawable[] drawableArr, boolean z11, int i11) {
        super(drawableArr);
        this.f90123x = true;
        pk.k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f90108i = drawableArr;
        this.f90115p = new int[drawableArr.length];
        this.f90116q = new int[drawableArr.length];
        this.f90117r = 255;
        this.f90118s = new boolean[drawableArr.length];
        this.f90119t = 0;
        this.f90109j = z11;
        this.f90110k = z11 ? 255 : 0;
        this.f90111l = i11;
        u();
    }

    private void g(Canvas canvas, Drawable drawable, int i11) {
        if (drawable == null || i11 <= 0) {
            return;
        }
        this.f90119t++;
        if (this.f90123x) {
            drawable.mutate();
        }
        drawable.setAlpha(i11);
        this.f90119t--;
        drawable.draw(canvas);
    }

    private void r() {
        if (this.f90121v) {
            this.f90121v = false;
            bm.m mVar = this.f90120u;
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    private void s() {
        int i11;
        if (!this.f90121v && (i11 = this.f90111l) >= 0) {
            boolean[] zArr = this.f90118s;
            if (i11 < zArr.length && zArr[i11]) {
                this.f90121v = true;
                bm.m mVar = this.f90120u;
                if (mVar != null) {
                    mVar.b();
                }
            }
        }
    }

    private void t() {
        if (this.f90122w && this.f90112m == 2 && this.f90118s[this.f90111l]) {
            bm.m mVar = this.f90120u;
            if (mVar != null) {
                mVar.c();
            }
            this.f90122w = false;
        }
    }

    private void u() {
        this.f90112m = 2;
        Arrays.fill(this.f90115p, this.f90110k);
        this.f90115p[0] = 255;
        Arrays.fill(this.f90116q, this.f90110k);
        this.f90116q[0] = 255;
        Arrays.fill(this.f90118s, this.f90109j);
        this.f90118s[0] = true;
    }

    private boolean w(float f11) {
        boolean z11 = true;
        for (int i11 = 0; i11 < this.f90108i.length; i11++) {
            boolean z12 = this.f90118s[i11];
            int i12 = z12 ? 1 : -1;
            int[] iArr = this.f90116q;
            int i13 = (int) (this.f90115p[i11] + (i12 * 255 * f11));
            iArr[i11] = i13;
            if (i13 < 0) {
                iArr[i11] = 0;
            }
            if (iArr[i11] > 255) {
                iArr[i11] = 255;
            }
            if (z12 && iArr[i11] < 255) {
                z11 = false;
            }
            if (!z12 && iArr[i11] > 0) {
                z11 = false;
            }
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // ll.a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zW;
        Drawable[] drawableArr;
        int i11 = this.f90112m;
        int i12 = 0;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                pk.k.i(this.f90113n > 0);
                zW = w((p() - this.f90114o) / this.f90113n);
                this.f90112m = zW ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f90108i;
                if (i12 < drawableArr.length) {
                    break;
                }
                g(canvas, drawableArr[i12], (int) Math.ceil(((double) (this.f90116q[i12] * this.f90117r)) / 255.0d));
                i12++;
            }
            if (z11) {
                invalidateSelf();
            } else {
                r();
                t();
            }
        }
        System.arraycopy(this.f90116q, 0, this.f90115p, 0, this.f90108i.length);
        this.f90114o = p();
        zW = w(this.f90113n == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        s();
        this.f90112m = zW ? 2 : 1;
        z11 = zW;
        while (true) {
            drawableArr = this.f90108i;
            if (i12 < drawableArr.length) {
                break;
                break;
            } else {
                g(canvas, drawableArr[i12], (int) Math.ceil(((double) (this.f90116q[i12] * this.f90117r)) / 255.0d));
                i12++;
            }
        }
        if (z11) {
            invalidateSelf();
        } else {
            r();
            t();
        }
    }

    public void f() {
        this.f90119t++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f90117r;
    }

    public void h() {
        this.f90119t--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f90119t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f90112m = 0;
        Arrays.fill(this.f90118s, true);
        invalidateSelf();
    }

    public void l(int i11) {
        this.f90112m = 0;
        this.f90118s[i11] = true;
        invalidateSelf();
    }

    public void n(int i11) {
        this.f90112m = 0;
        this.f90118s[i11] = false;
        invalidateSelf();
    }

    public void o() {
        this.f90112m = 2;
        for (int i11 = 0; i11 < this.f90108i.length; i11++) {
            this.f90116q[i11] = this.f90118s[i11] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long p() {
        return SystemClock.uptimeMillis();
    }

    public int q() {
        return this.f90113n;
    }

    @Override // ll.a, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f90117r != i11) {
            this.f90117r = i11;
            invalidateSelf();
        }
    }

    public void v(int i11) {
        this.f90113n = i11;
        if (this.f90112m == 1) {
            this.f90112m = 0;
        }
    }
}
