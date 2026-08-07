package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SizeF;
import android.widget.RelativeLayout;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Config;
import io.legere.pdfiumandroid.util.Size;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zp.j;

/* JADX INFO: loaded from: classes4.dex */
public class e extends RelativeLayout {
    private static final String S = "e";
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private PdfiumCore F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private PaintFlagsDrawFilter L;
    private int M;
    private boolean N;
    private boolean O;
    private List<Integer> P;
    private boolean Q;
    private b R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f39236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f39237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f39238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f39239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.github.barteksc.pdfviewer.b f39240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.github.barteksc.pdfviewer.a f39241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.github.barteksc.pdfviewer.d f39242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g f39243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f39245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f39246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f39247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f39249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.github.barteksc.pdfviewer.c f39250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private HandlerThread f39251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    h f39252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private f f39253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    zp.a f39254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Paint f39255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Paint f39256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private dq.b f39257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f39258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f39259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f39260y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f39261z;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final cq.a f39262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int[] f39263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f39264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private zp.b f39266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private zp.b f39267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private zp.d f39268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private zp.c f39269h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private zp.f f39270i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private zp.h f39271j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private j f39272k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private yp.b f39273l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f39274m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f39275n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f39276o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f39277p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f39278q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f39279r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f39280s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f39281t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f39282u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private dq.b f39283v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f39284w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f39285x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private boolean f39286y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f39287z;

        public b a(boolean z11) {
            this.f39282u = z11;
            return this;
        }

        public b b(int i11) {
            this.f39274m = i11;
            return this;
        }

        public b c(boolean z11) {
            this.f39278q = z11;
            return this;
        }

        public b d(boolean z11) {
            this.f39280s = z11;
            return this;
        }

        public b e(boolean z11) {
            this.f39265d = z11;
            return this;
        }

        public b f(boolean z11) {
            this.f39264c = z11;
            return this;
        }

        public b g(yp.b bVar) {
            this.f39273l = bVar;
            return this;
        }

        public void h() {
            if (!e.this.Q) {
                e.this.R = this;
                return;
            }
            e.this.e0();
            e.this.f39254s.p(this.f39268g);
            e.this.f39254s.o(this.f39269h);
            e.this.f39254s.m(this.f39266e);
            e.this.f39254s.n(this.f39267f);
            e.this.f39254s.r(this.f39270i);
            e.this.f39254s.t(this.f39271j);
            e.this.f39254s.u(null);
            e.this.f39254s.v(this.f39272k);
            e.this.f39254s.q(null);
            e.this.f39254s.s(null);
            e.this.f39254s.l(this.f39273l);
            e.this.setSwipeEnabled(this.f39264c);
            e.this.setNightMode(this.f39287z);
            e.this.w(this.f39265d);
            e.this.setDefaultPage(this.f39274m);
            e.this.setLandscapeOrientation(this.f39275n);
            e.this.setDualPageMode(this.f39276o);
            e.this.setSwipeVertical(!this.f39277p);
            e.this.u(this.f39278q);
            e.this.setScrollHandle(null);
            e.this.v(this.f39280s);
            e.this.setSpacing(this.f39281t);
            e.this.setAutoSpacing(this.f39282u);
            e.this.setPageFitPolicy(this.f39283v);
            e.this.setFitEachPage(this.f39284w);
            e.this.setPageSnap(this.f39286y);
            e.this.setPageFling(this.f39285x);
            int[] iArr = this.f39263b;
            if (iArr != null) {
                e.this.R(this.f39262a, this.f39279r, iArr);
            } else {
                e.this.Q(this.f39262a, this.f39279r);
            }
        }

        public b i(zp.b bVar) {
            this.f39266e = bVar;
            return this;
        }

        public b j(zp.c cVar) {
            this.f39269h = cVar;
            return this;
        }

        public b k(zp.d dVar) {
            this.f39268g = dVar;
            return this;
        }

        public b l(zp.f fVar) {
            this.f39270i = fVar;
            return this;
        }

        public b m(zp.h hVar) {
            this.f39271j = hVar;
            return this;
        }

        public b n(j jVar) {
            this.f39272k = jVar;
            return this;
        }

        public b o(dq.b bVar) {
            this.f39283v = bVar;
            return this;
        }

        public b p(boolean z11) {
            this.f39285x = z11;
            return this;
        }

        public b q(boolean z11) {
            this.f39286y = z11;
            return this;
        }

        public b r(int... iArr) {
            this.f39263b = iArr;
            return this;
        }

        public b s(String str) {
            this.f39279r = str;
            return this;
        }

        public b t(int i11) {
            this.f39281t = i11;
            return this;
        }

        public b u(boolean z11) {
            this.f39277p = z11;
            return this;
        }

        private b(cq.a aVar) {
            this.f39263b = null;
            this.f39264c = true;
            this.f39265d = true;
            this.f39273l = new yp.a(e.this);
            this.f39274m = 0;
            this.f39275n = false;
            this.f39276o = false;
            this.f39277p = false;
            this.f39278q = false;
            this.f39279r = null;
            this.f39280s = true;
            this.f39281t = 0;
            this.f39282u = false;
            this.f39283v = dq.b.WIDTH;
            this.f39284w = false;
            this.f39285x = false;
            this.f39286y = false;
            this.f39287z = false;
            this.f39262a = aVar;
        }
    }

    enum c {
        NONE,
        START,
        END
    }

    private enum d {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39236a = 1.0f;
        this.f39237b = 1.75f;
        this.f39238c = 3.0f;
        this.f39239d = c.NONE;
        this.f39245j = BitmapDescriptorFactory.HUE_RED;
        this.f39246k = BitmapDescriptorFactory.HUE_RED;
        this.f39247l = 1.0f;
        this.f39248m = true;
        this.f39249n = d.DEFAULT;
        this.f39254s = new zp.a();
        this.f39257v = dq.b.WIDTH;
        this.f39258w = false;
        this.f39259x = 0;
        this.f39260y = false;
        this.f39261z = false;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = false;
        this.E = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = true;
        this.L = new PaintFlagsDrawFilter(0, 3);
        this.M = 0;
        this.N = false;
        this.O = true;
        this.P = new ArrayList(10);
        this.Q = false;
        this.f39251p = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.f39240e = new com.github.barteksc.pdfviewer.b();
        com.github.barteksc.pdfviewer.a aVar = new com.github.barteksc.pdfviewer.a(this);
        this.f39241f = aVar;
        this.f39242g = new com.github.barteksc.pdfviewer.d(this, aVar);
        this.f39253r = new f(this);
        this.f39255t = new Paint();
        Paint paint = new Paint();
        this.f39256u = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.F = new PdfiumCore(context, new Config());
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(cq.a aVar, String str) {
        R(aVar, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(cq.a aVar, String str, int[] iArr) {
        if (!this.f39248m) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        this.f39248m = false;
        com.github.barteksc.pdfviewer.c cVar = new com.github.barteksc.pdfviewer.c(aVar, str, iArr, this, this.F);
        this.f39250o = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void s(Canvas canvas, aq.b bVar) {
        float fM;
        float fJ0;
        RectF rectFC = bVar.c();
        Bitmap bitmapD = bVar.d();
        if (bitmapD.isRecycled()) {
            return;
        }
        SizeF sizeFN = this.f39243h.n(bVar.b());
        if (this.A) {
            fJ0 = this.f39243h.m(bVar.b(), this.f39247l);
            fM = j0(this.f39243h.h() - sizeFN.getWidth()) / 2.0f;
        } else {
            fM = this.f39243h.m(bVar.b(), this.f39247l);
            fJ0 = j0(this.f39243h.f() - sizeFN.getHeight()) / 2.0f;
        }
        canvas.translate(fM, fJ0);
        Rect rect = new Rect(0, 0, bitmapD.getWidth(), bitmapD.getHeight());
        float fJ1 = j0(rectFC.left * sizeFN.getWidth());
        float fJ2 = j0(rectFC.top * sizeFN.getHeight());
        RectF rectF = new RectF((int) fJ1, (int) fJ2, (int) (fJ1 + j0(rectFC.width() * sizeFN.getWidth())), (int) (fJ2 + j0(rectFC.height() * sizeFN.getHeight())));
        float f11 = this.f39245j + fM;
        float f12 = this.f39246k + fJ0;
        if (rectF.left + f11 >= getWidth() || f11 + rectF.right <= BitmapDescriptorFactory.HUE_RED || rectF.top + f12 >= getHeight() || f12 + rectF.bottom <= BitmapDescriptorFactory.HUE_RED) {
            canvas.translate(-fM, -fJ0);
            return;
        }
        canvas.drawBitmap(bitmapD, rect, rectF, this.f39255t);
        if (dq.a.f60813a) {
            this.f39256u.setColor(bVar.b() % 2 == 0 ? -65536 : -16776961);
            canvas.drawRect(rectF, this.f39256u);
        }
        canvas.translate(-fM, -fJ0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z11) {
        this.N = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i11) {
        this.f39259x = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z11) {
        this.f39258w = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(dq.b bVar) {
        this.f39257v = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i11) {
        this.M = dq.f.a(getContext(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z11) {
        this.A = z11;
    }

    private void t(Canvas canvas, int i11, zp.b bVar) {
        float fM;
        if (bVar != null) {
            boolean z11 = this.A;
            float fM2 = BitmapDescriptorFactory.HUE_RED;
            if (z11) {
                fM = this.f39243h.m(i11, this.f39247l);
            } else {
                fM2 = this.f39243h.m(i11, this.f39247l);
                fM = 0.0f;
            }
            canvas.translate(fM2, fM);
            SizeF sizeFN = this.f39243h.n(i11);
            bVar.b(canvas, j0(sizeFN.getWidth()), j0(sizeFN.getHeight()), i11);
            canvas.translate(-fM2, -fM);
        }
    }

    public b A(Uri uri) {
        return new b(new cq.c(uri));
    }

    public SizeF B(int i11) {
        g gVar = this.f39243h;
        return gVar == null ? new SizeF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) : gVar.n(i11);
    }

    public boolean C() {
        return this.I;
    }

    public boolean D() {
        return this.N;
    }

    public boolean E() {
        return this.H;
    }

    boolean F() {
        return this.C;
    }

    public boolean G() {
        return this.f39258w;
    }

    public boolean H() {
        return this.f39260y;
    }

    public boolean I() {
        return this.f39261z;
    }

    public boolean J() {
        return this.O;
    }

    public boolean K() {
        return this.f39248m;
    }

    public boolean L() {
        return this.B;
    }

    public boolean M() {
        return this.A;
    }

    public boolean N() {
        return this.f39247l != this.f39236a;
    }

    public void O(int i11) {
        P(i11, false);
    }

    public void P(int i11, boolean z11) {
        g gVar = this.f39243h;
        if (gVar == null) {
            return;
        }
        int iA = gVar.a(i11);
        float f11 = iA == 0 ? BitmapDescriptorFactory.HUE_RED : -this.f39243h.m(iA, this.f39247l);
        if (this.A) {
            if (z11) {
                this.f39241f.j(this.f39246k, f11);
            } else {
                X(this.f39245j, f11);
            }
        } else if (z11) {
            this.f39241f.i(this.f39245j, f11);
        } else {
            X(f11, this.f39246k);
        }
        h0(iA);
    }

    void S(g gVar) {
        this.f39249n = d.LOADED;
        this.f39243h = gVar;
        if (this.f39251p == null) {
            this.f39251p = new HandlerThread("PDF renderer");
        }
        if (!this.f39251p.isAlive()) {
            this.f39251p.start();
        }
        h hVar = new h(this.f39251p.getLooper(), this);
        this.f39252q = hVar;
        hVar.e();
        this.f39242g.d();
        this.f39254s.b(gVar.p());
        P(this.f39259x, false);
    }

    void T(Throwable th2) {
        this.f39249n = d.ERROR;
        zp.c cVarK = this.f39254s.k();
        e0();
        invalidate();
        if (cVarK != null) {
            cVarK.onError(th2);
        } else {
            Log.e("PDFView", "load pdf error", th2);
        }
    }

    void U() {
        float f11;
        int width;
        if (this.f39243h.p() == 0) {
            return;
        }
        if (this.A) {
            f11 = this.f39246k;
            width = getHeight();
        } else {
            f11 = this.f39245j;
            width = getWidth();
        }
        int iJ = this.f39243h.j(-(f11 - (width / 2.0f)), this.f39247l);
        if (iJ < 0 || iJ > this.f39243h.p() - 1 || iJ == getCurrentPage()) {
            V();
        } else {
            h0(iJ);
        }
    }

    public void V() {
        h hVar;
        if (this.f39243h == null || (hVar = this.f39252q) == null) {
            return;
        }
        hVar.removeMessages(1);
        this.f39240e.i();
        this.f39253r.f();
        f0();
    }

    public void W(float f11, float f12) {
        X(this.f39245j + f11, this.f39246k + f12);
    }

    public void X(float f11, float f12) {
        Y(f11, f12, true);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    public void Y(float f11, float f12, boolean z11) {
        float height;
        float fE;
        float f13;
        float width;
        float fE2;
        float f14;
        if (this.A) {
            float fJ0 = j0(this.f39243h.h());
            if (fJ0 < getWidth()) {
                width = getWidth() / 2;
                fJ0 /= 2.0f;
            } else {
                if (f11 > BitmapDescriptorFactory.HUE_RED) {
                    f11 = 0.0f;
                } else if (f11 + fJ0 < getWidth()) {
                    width = getWidth();
                }
                fE2 = this.f39243h.e(this.f39247l);
                if (fE2 < getHeight()) {
                    f12 = (getHeight() - fE2) / 2.0f;
                } else if (f12 > BitmapDescriptorFactory.HUE_RED) {
                    f12 = 0.0f;
                } else if (f12 + fE2 < getHeight()) {
                    f12 = (-fE2) + getHeight();
                }
                f14 = this.f39246k;
                if (f12 < f14) {
                    this.f39239d = c.END;
                } else if (f12 > f14) {
                    this.f39239d = c.START;
                } else {
                    this.f39239d = c.NONE;
                }
            }
            f11 = width - fJ0;
            fE2 = this.f39243h.e(this.f39247l);
            if (fE2 < getHeight()) {
                f12 = (getHeight() - fE2) / 2.0f;
            } else if (f12 > BitmapDescriptorFactory.HUE_RED) {
                f12 = 0.0f;
            } else if (f12 + fE2 < getHeight()) {
                f12 = (-fE2) + getHeight();
            }
            f14 = this.f39246k;
            if (f12 < f14) {
                this.f39239d = c.END;
            } else if (f12 > f14) {
                this.f39239d = c.START;
            } else {
                this.f39239d = c.NONE;
            }
        } else {
            float fJ1 = j0(this.f39243h.f());
            if (fJ1 < getHeight()) {
                height = getHeight() / 2;
                fJ1 /= 2.0f;
            } else {
                if (f12 > BitmapDescriptorFactory.HUE_RED) {
                    f12 = 0.0f;
                } else if (f12 + fJ1 < getHeight()) {
                    height = getHeight();
                }
                fE = this.f39243h.e(this.f39247l);
                if (fE < getWidth()) {
                    f11 = (getWidth() - fE) / 2.0f;
                } else if (f11 > BitmapDescriptorFactory.HUE_RED) {
                    f11 = 0.0f;
                } else if (f11 + fE < getWidth()) {
                    f11 = (-fE) + getWidth();
                }
                f13 = this.f39245j;
                if (f11 < f13) {
                    this.f39239d = c.END;
                } else if (f11 > f13) {
                    this.f39239d = c.START;
                } else {
                    this.f39239d = c.NONE;
                }
            }
            f12 = height - fJ1;
            fE = this.f39243h.e(this.f39247l);
            if (fE < getWidth()) {
                f11 = (getWidth() - fE) / 2.0f;
            } else if (f11 > BitmapDescriptorFactory.HUE_RED) {
                f11 = 0.0f;
            } else if (f11 + fE < getWidth()) {
                f11 = (-fE) + getWidth();
            }
            f13 = this.f39245j;
            if (f11 < f13) {
                this.f39239d = c.END;
            } else if (f11 > f13) {
                this.f39239d = c.START;
            } else {
                this.f39239d = c.NONE;
            }
        }
        this.f39245j = f11;
        this.f39246k = f12;
        this.f39254s.f(getCurrentPage(), getPositionOffset());
        f0();
    }

    public void Z(aq.b bVar) {
        if (this.f39249n == d.LOADED) {
            this.f39249n = d.SHOWN;
            this.f39254s.g(this.f39243h.p());
        }
        if (bVar.e()) {
            this.f39240e.c(bVar);
        } else {
            this.f39240e.b(bVar);
        }
        f0();
    }

    void a0(PageRenderingException pageRenderingException) {
        if (this.f39254s.e(pageRenderingException.a(), pageRenderingException.getCause())) {
            return;
        }
        Log.e(S, "Cannot open page " + pageRenderingException.a(), pageRenderingException.getCause());
    }

    public boolean b0() {
        float f11 = -this.f39243h.m(this.f39244i, this.f39247l);
        float fK = f11 - this.f39243h.k(this.f39244i, this.f39247l);
        if (M()) {
            float f12 = this.f39246k;
            return f11 > f12 && fK < f12 - ((float) getHeight());
        }
        float f13 = this.f39245j;
        return f11 > f13 && fK < f13 - ((float) getWidth());
    }

    public void c0() {
        d0(true);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        g gVar = this.f39243h;
        if (gVar == null) {
            return true;
        }
        if (this.A) {
            if (i11 >= 0 || this.f39245j >= BitmapDescriptorFactory.HUE_RED) {
                return i11 > 0 && this.f39245j + j0(gVar.h()) > ((float) getWidth());
            }
            return true;
        }
        if (i11 >= 0 || this.f39245j >= BitmapDescriptorFactory.HUE_RED) {
            return i11 > 0 && this.f39245j + gVar.e(this.f39247l) > ((float) getWidth());
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        g gVar = this.f39243h;
        if (gVar == null) {
            return true;
        }
        if (this.A) {
            if (i11 >= 0 || this.f39246k >= BitmapDescriptorFactory.HUE_RED) {
                return i11 > 0 && this.f39246k + gVar.e(this.f39247l) > ((float) getHeight());
            }
            return true;
        }
        if (i11 >= 0 || this.f39246k >= BitmapDescriptorFactory.HUE_RED) {
            return i11 > 0 && this.f39246k + j0(gVar.f()) > ((float) getHeight());
        }
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        this.f39241f.d();
    }

    public void d0(boolean z11) {
        g gVar;
        int iX;
        dq.e eVarY;
        if (!this.E || (gVar = this.f39243h) == null || gVar.p() == 0 || (eVarY = y((iX = x(this.f39245j, this.f39246k)))) == dq.e.NONE) {
            return;
        }
        float fI0 = i0(iX, eVarY);
        if (this.A) {
            if (z11) {
                this.f39241f.j(this.f39246k, -fI0);
                return;
            } else {
                X(this.f39245j, -fI0);
                return;
            }
        }
        if (z11) {
            this.f39241f.i(this.f39245j, -fI0);
        } else {
            X(-fI0, this.f39246k);
        }
    }

    public void e0() {
        this.R = null;
        this.f39241f.l();
        this.f39242g.c();
        h hVar = this.f39252q;
        if (hVar != null) {
            hVar.f();
            this.f39252q.removeMessages(1);
        }
        com.github.barteksc.pdfviewer.c cVar = this.f39250o;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f39240e.j();
        g gVar = this.f39243h;
        if (gVar != null) {
            gVar.b();
            this.f39243h = null;
        }
        this.f39252q = null;
        this.G = false;
        this.f39246k = BitmapDescriptorFactory.HUE_RED;
        this.f39245j = BitmapDescriptorFactory.HUE_RED;
        this.f39247l = 1.0f;
        this.f39248m = true;
        this.f39254s = new zp.a();
        this.f39249n = d.DEFAULT;
    }

    void f0() {
        invalidate();
    }

    public void g0() {
        n0(this.f39236a);
    }

    public int getCurrentPage() {
        return this.f39244i;
    }

    public float getCurrentXOffset() {
        return this.f39245j;
    }

    public float getCurrentYOffset() {
        return this.f39246k;
    }

    public PdfDocument.Meta getDocumentMeta() {
        g gVar = this.f39243h;
        if (gVar == null) {
            return null;
        }
        return gVar.i();
    }

    public float getMaxZoom() {
        return this.f39238c;
    }

    public float getMidZoom() {
        return this.f39237b;
    }

    public float getMinZoom() {
        return this.f39236a;
    }

    public int getPageCount() {
        g gVar = this.f39243h;
        if (gVar == null) {
            return 0;
        }
        return gVar.p();
    }

    public dq.b getPageFitPolicy() {
        return this.f39257v;
    }

    public float getPositionOffset() {
        float f11;
        float fE;
        int width;
        if (this.A) {
            f11 = -this.f39246k;
            fE = this.f39243h.e(this.f39247l);
            width = getHeight();
        } else {
            f11 = -this.f39245j;
            fE = this.f39243h.e(this.f39247l);
            width = getWidth();
        }
        return dq.c.c(f11 / (fE - width), BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    bq.a getScrollHandle() {
        return null;
    }

    public int getSpacingPx() {
        return this.M;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        g gVar = this.f39243h;
        return gVar == null ? Collections.EMPTY_LIST : gVar.d();
    }

    public float getZoom() {
        return this.f39247l;
    }

    void h0(int i11) {
        if (this.f39248m) {
            return;
        }
        this.f39244i = this.f39243h.a(i11);
        V();
        this.f39254s.d(this.f39244i, this.f39243h.p());
    }

    float i0(int i11, dq.e eVar) {
        float f11;
        float fM = this.f39243h.m(i11, this.f39247l);
        float height = this.A ? getHeight() : getWidth();
        float fK = this.f39243h.k(i11, this.f39247l);
        if (eVar == dq.e.CENTER) {
            f11 = fM - (height / 2.0f);
            fK /= 2.0f;
        } else {
            if (eVar != dq.e.END) {
                return fM;
            }
            f11 = fM - height;
        }
        return f11 + fK;
    }

    public float j0(float f11) {
        return f11 * this.f39247l;
    }

    public void k0(float f11, PointF pointF) {
        l0(this.f39247l * f11, pointF);
    }

    public void l0(float f11, PointF pointF) {
        float f12 = f11 / this.f39247l;
        m0(f11);
        float f13 = this.f39245j * f12;
        float f14 = this.f39246k * f12;
        float f15 = pointF.x;
        float f16 = pointF.y;
        X(f13 + (f15 - (f15 * f12)), f14 + (f16 - (f12 * f16)));
    }

    public void m0(float f11) {
        this.f39247l = f11;
    }

    public void n0(float f11) {
        this.f39241f.k(getWidth() / 2, getHeight() / 2, this.f39247l, f11);
    }

    public void o0(float f11, float f12, float f13) {
        this.f39241f.k(f11, f12, this.f39247l, f13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        e0();
        HandlerThread handlerThread = this.f39251p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f39251p = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            return;
        }
        if (this.K) {
            canvas.setDrawFilter(this.L);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.D ? -16777216 : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.f39248m && this.f39249n == d.SHOWN) {
            float f11 = this.f39245j;
            float f12 = this.f39246k;
            canvas.translate(f11, f12);
            Iterator<aq.b> it = this.f39240e.g().iterator();
            while (it.hasNext()) {
                s(canvas, it.next());
            }
            for (aq.b bVar : this.f39240e.f()) {
                s(canvas, bVar);
                if (this.f39254s.j() != null && !this.P.contains(Integer.valueOf(bVar.b()))) {
                    this.P.add(Integer.valueOf(bVar.b()));
                }
            }
            Iterator<Integer> it2 = this.P.iterator();
            while (it2.hasNext()) {
                t(canvas, it2.next().intValue(), this.f39254s.j());
            }
            this.P.clear();
            t(canvas, this.f39244i, this.f39254s.i());
            canvas.translate(-f11, -f12);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        float fE;
        float f11;
        this.Q = true;
        b bVar = this.R;
        if (bVar != null) {
            bVar.h();
        }
        if (isInEditMode() || this.f39249n != d.SHOWN) {
            return;
        }
        float f12 = (-this.f39245j) + (i13 * 0.5f);
        float f13 = (-this.f39246k) + (i14 * 0.5f);
        if (this.A) {
            fE = f12 / this.f39243h.h();
            f11 = this.f39243h.e(this.f39247l);
        } else {
            fE = f12 / this.f39243h.e(this.f39247l);
            f11 = this.f39243h.f();
        }
        float f14 = f13 / f11;
        this.f39241f.l();
        this.f39243h.y(new Size(i11, i12));
        if (this.A) {
            this.f39245j = ((-fE) * this.f39243h.h()) + (i11 * 0.5f);
            this.f39246k = ((-f14) * this.f39243h.e(this.f39247l)) + (i12 * 0.5f);
        } else {
            this.f39245j = ((-fE) * this.f39243h.e(this.f39247l)) + (i11 * 0.5f);
            this.f39246k = ((-f14) * this.f39243h.f()) + (i12 * 0.5f);
        }
        X(this.f39245j, this.f39246k);
        U();
    }

    public boolean r() {
        return this.J;
    }

    public void setDualPageMode(boolean z11) {
        this.f39260y = z11;
    }

    public void setLandscapeOrientation(boolean z11) {
        this.f39261z = z11;
    }

    public void setMaxZoom(float f11) {
        this.f39238c = f11;
    }

    public void setMidZoom(float f11) {
        this.f39237b = f11;
    }

    public void setMinZoom(float f11) {
        this.f39236a = f11;
    }

    public void setNightMode(boolean z11) {
        this.D = z11;
        if (!z11) {
            this.f39255t.setColorFilter(null);
        } else {
            this.f39255t.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED})));
        }
    }

    public void setPageFling(boolean z11) {
        this.O = z11;
    }

    public void setPageSnap(boolean z11) {
        this.E = z11;
    }

    public void setPositionOffset(float f11, boolean z11) {
        if (this.A) {
            Y(this.f39245j, ((-this.f39243h.e(this.f39247l)) + getHeight()) * f11, z11);
        } else {
            Y(((-this.f39243h.e(this.f39247l)) + getWidth()) * f11, this.f39246k, z11);
        }
        U();
    }

    public void setSwipeEnabled(boolean z11) {
        this.B = z11;
    }

    public void u(boolean z11) {
        this.I = z11;
    }

    public void v(boolean z11) {
        this.K = z11;
    }

    void w(boolean z11) {
        this.C = z11;
    }

    int x(float f11, float f12) {
        boolean z11 = this.A;
        if (z11) {
            f11 = f12;
        }
        float height = z11 ? getHeight() : getWidth();
        if (f11 > -1.0f) {
            return 0;
        }
        if (f11 < (-this.f39243h.e(this.f39247l)) + height + 1.0f) {
            return this.f39243h.p() - 1;
        }
        return this.f39243h.j(-(f11 - (height / 2.0f)), this.f39247l);
    }

    dq.e y(int i11) {
        if (!this.E || i11 < 0) {
            return dq.e.NONE;
        }
        float f11 = this.A ? this.f39246k : this.f39245j;
        float f12 = -this.f39243h.m(i11, this.f39247l);
        int height = this.A ? getHeight() : getWidth();
        float fK = this.f39243h.k(i11, this.f39247l);
        float f13 = height;
        if (f13 >= fK) {
            return dq.e.CENTER;
        }
        if (f11 >= f12) {
            return dq.e.START;
        }
        return f12 - fK > f11 - f13 ? dq.e.END : dq.e.NONE;
    }

    public b z(InputStream inputStream) {
        return new b(new cq.b(inputStream));
    }

    public void setPositionOffset(float f11) {
        setPositionOffset(f11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(bq.a aVar) {
    }
}
