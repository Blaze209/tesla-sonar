package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fg.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tf.d0;
import tf.h0;
import tf.k0;
import tf.m0;
import tf.y;
import tf.z;

/* JADX INFO: loaded from: classes3.dex */
public class p extends Drawable implements Drawable.Callback, Animatable {
    private static final boolean V;
    private static final List<String> W;
    private static final Executor X;
    private final Matrix A;
    private Bitmap B;
    private Canvas C;
    private Rect D;
    private RectF E;
    private Paint F;
    private Rect G;
    private Rect H;
    private RectF I;
    private RectF J;
    private Matrix K;
    private float[] L;
    private Matrix M;
    private boolean N;
    private tf.a O;
    private final ValueAnimator.AnimatorUpdateListener P;
    private final Semaphore Q;
    private Handler R;
    private Runnable S;
    private final Runnable T;
    private float U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tf.i f19927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hg.h f19928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f19932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f19933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zf.b f19934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f19935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private zf.a f19936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Typeface> f19937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f19938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    tf.b f19939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    m0 f19940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q f19941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private dg.c f19944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private k0 f19951y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19952z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(tf.i iVar);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    static {
        V = Build.VERSION.SDK_INT <= 25;
        W = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        X = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new hg.f());
    }

    public p() {
        hg.h hVar = new hg.h();
        this.f19928b = hVar;
        this.f19929c = true;
        this.f19930d = false;
        this.f19931e = false;
        this.f19932f = b.NONE;
        this.f19933g = new ArrayList<>();
        this.f19941o = new q();
        this.f19942p = false;
        this.f19943q = true;
        this.f19945s = 255;
        this.f19950x = false;
        this.f19951y = k0.AUTOMATIC;
        this.f19952z = false;
        this.A = new Matrix();
        this.L = new float[9];
        this.N = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: tf.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.airbnb.lottie.p.h(this.f113399a, valueAnimator);
            }
        };
        this.P = animatorUpdateListener;
        this.Q = new Semaphore(1);
        this.T = new Runnable() { // from class: tf.x
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.p.l(this.f113400a);
            }
        };
        this.U = -3.4028235E38f;
        hVar.addUpdateListener(animatorUpdateListener);
    }

    private void A(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void C(Canvas canvas, Matrix matrix, dg.c cVar, int i11) {
        if (!this.f19952z) {
            cVar.i(canvas, matrix, i11, null);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        q0(canvas, cVar);
        canvas.restore();
    }

    private void D(Canvas canvas) {
        dg.c cVar = this.f19944r;
        tf.i iVar = this.f19927a;
        if (cVar == null || iVar == null) {
            return;
        }
        this.A.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / iVar.b().width();
            float fHeight = bounds.height() / iVar.b().height();
            this.A.preTranslate(bounds.left, bounds.top);
            this.A.preScale(fWidth, fHeight);
        }
        cVar.i(canvas, this.A, this.f19945s, null);
    }

    private void G(int i11, int i12) {
        Bitmap bitmap = this.B;
        if (bitmap == null || bitmap.getWidth() < i11 || this.B.getHeight() < i12) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            this.B = bitmapCreateBitmap;
            this.C.setBitmap(bitmapCreateBitmap);
            this.N = true;
            return;
        }
        if (this.B.getWidth() > i11 || this.B.getHeight() > i12) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.B, 0, 0, i11, i12);
            this.B = bitmapCreateBitmap2;
            this.C.setBitmap(bitmapCreateBitmap2);
            this.N = true;
        }
    }

    private void H() {
        if (this.C != null) {
            return;
        }
        this.C = new Canvas();
        this.J = new RectF();
        this.K = new Matrix();
        this.M = new Matrix();
        this.D = new Rect();
        this.E = new RectF();
        this.F = new uf.a();
        this.G = new Rect();
        this.H = new Rect();
        this.I = new RectF();
    }

    private Context O() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private zf.a P() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f19936j == null) {
            zf.a aVar = new zf.a(getCallback(), this.f19939m);
            this.f19936j = aVar;
            String str = this.f19938l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f19936j;
    }

    private zf.b R() {
        zf.b bVar = this.f19934h;
        if (bVar != null && !bVar.b(O())) {
            this.f19934h = null;
        }
        if (this.f19934h == null) {
            this.f19934h = new zf.b(getCallback(), this.f19935i, null, this.f19927a.j());
        }
        return this.f19934h;
    }

    private boolean d1() {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            return false;
        }
        float f11 = this.U;
        float fK = this.f19928b.k();
        this.U = fK;
        return Math.abs(fK - f11) * iVar.d() >= 50.0f;
    }

    private boolean g0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    public static /* synthetic */ void h(p pVar, ValueAnimator valueAnimator) {
        if (pVar.J()) {
            pVar.invalidateSelf();
            return;
        }
        dg.c cVar = pVar.f19944r;
        if (cVar != null) {
            cVar.M(pVar.f19928b.k());
        }
    }

    public static /* synthetic */ void l(final p pVar) {
        dg.c cVar = pVar.f19944r;
        if (cVar == null) {
            return;
        }
        try {
            pVar.Q.acquire();
            cVar.M(pVar.f19928b.k());
            if (V && pVar.N) {
                if (pVar.R == null) {
                    pVar.R = new Handler(Looper.getMainLooper());
                    pVar.S = new Runnable() { // from class: tf.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.airbnb.lottie.p.p(this.f113398a);
                        }
                    };
                }
                pVar.R.post(pVar.S);
            }
        } catch (InterruptedException unused) {
        } finally {
            pVar.Q.release();
        }
    }

    public static /* synthetic */ void p(p pVar) {
        Drawable.Callback callback = pVar.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(pVar);
        }
    }

    private void q0(Canvas canvas, dg.c cVar) {
        if (this.f19927a == null || cVar == null) {
            return;
        }
        H();
        canvas.getMatrix(this.K);
        canvas.getClipBounds(this.D);
        z(this.D, this.E);
        this.K.mapRect(this.E);
        A(this.E, this.D);
        if (this.f19943q) {
            this.J.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.b(this.J, null, false);
        }
        this.K.mapRect(this.J);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        u0(this.J, fWidth, fHeight);
        if (!g0()) {
            RectF rectF = this.J;
            Rect rect = this.D;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.J.width());
        int iCeil2 = (int) Math.ceil(this.J.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        G(iCeil, iCeil2);
        if (this.N) {
            this.K.getValues(this.L);
            float[] fArr = this.L;
            float f11 = fArr[0];
            float f12 = fArr[4];
            this.A.set(this.K);
            this.A.preScale(fWidth, fHeight);
            Matrix matrix = this.A;
            RectF rectF2 = this.J;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.A.postScale(1.0f / f11, 1.0f / f12);
            this.B.eraseColor(0);
            this.C.setMatrix(hg.l.f72758a);
            this.C.scale(f11, f12);
            cVar.i(this.C, this.A, this.f19945s, null);
            this.K.invert(this.M);
            this.M.mapRect(this.I, this.J);
            A(this.I, this.H);
        }
        this.G.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.B, this.G, this.H, this.F);
    }

    private void u0(RectF rectF, float f11, float f12) {
        rectF.set(rectF.left * f11, rectF.top * f12, rectF.right * f11, rectF.bottom * f12);
    }

    private void v() {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            return;
        }
        dg.c cVar = new dg.c(this, v.b(iVar), iVar.k(), iVar);
        this.f19944r = cVar;
        if (this.f19947u) {
            cVar.K(true);
        }
        this.f19944r.Q(this.f19943q);
    }

    private void y() {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            return;
        }
        this.f19952z = this.f19951y.useSoftwareRendering(Build.VERSION.SDK_INT, iVar.q(), iVar.m());
    }

    private void z(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean A0(tf.i iVar) {
        if (this.f19927a == iVar) {
            return false;
        }
        this.N = true;
        x();
        this.f19927a = iVar;
        v();
        this.f19928b.y(iVar);
        V0(this.f19928b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f19933g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(iVar);
            }
            it.remove();
        }
        this.f19933g.clear();
        iVar.w(this.f19946t);
        y();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void B(Canvas canvas, Matrix matrix) {
        dg.c cVar = this.f19944r;
        tf.i iVar = this.f19927a;
        if (cVar == null || iVar == null) {
            return;
        }
        boolean zJ = J();
        if (zJ) {
            try {
                this.Q.acquire();
                if (d1()) {
                    V0(this.f19928b.k());
                }
            } catch (InterruptedException unused) {
                if (!zJ) {
                    return;
                }
                this.Q.release();
                if (cVar.P() == this.f19928b.k()) {
                    return;
                }
            } catch (Throwable th2) {
                if (zJ) {
                    this.Q.release();
                    if (cVar.P() != this.f19928b.k()) {
                        X.execute(this.T);
                    }
                }
                throw th2;
            }
        }
        if (this.f19931e) {
            try {
                C(canvas, matrix, cVar, this.f19945s);
            } catch (Throwable th3) {
                hg.e.b("Lottie crashed in draw!", th3);
            }
        } else {
            C(canvas, matrix, cVar, this.f19945s);
        }
        this.N = false;
        if (zJ) {
            this.Q.release();
            if (cVar.P() == this.f19928b.k()) {
                return;
            }
            X.execute(this.T);
        }
    }

    public void B0(String str) {
        this.f19938l = str;
        zf.a aVarP = P();
        if (aVarP != null) {
            aVarP.c(str);
        }
    }

    public void C0(tf.b bVar) {
        this.f19939m = bVar;
        zf.a aVar = this.f19936j;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    public void D0(Map<String, Typeface> map) {
        if (map == this.f19937k) {
            return;
        }
        this.f19937k = map;
        invalidateSelf();
    }

    public void E(y yVar, boolean z11) {
        boolean zA = this.f19941o.a(yVar, z11);
        if (this.f19927a == null || !zA) {
            return;
        }
        v();
    }

    public void E0(final int i11) {
        if (this.f19927a == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19893a.E0(i11);
                }
            });
        } else {
            this.f19928b.z(i11);
        }
    }

    public void F() {
        this.f19933g.clear();
        this.f19928b.j();
        if (isVisible()) {
            return;
        }
        this.f19932f = b.NONE;
    }

    @Deprecated
    public void F0(boolean z11) {
        this.f19930d = z11;
    }

    public void G0(tf.c cVar) {
        zf.b bVar = this.f19934h;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public void H0(String str) {
        this.f19935i = str;
    }

    public tf.a I() {
        tf.a aVar = this.O;
        return aVar != null ? aVar : tf.e.d();
    }

    public void I0(boolean z11) {
        this.f19942p = z11;
    }

    public boolean J() {
        return I() == tf.a.ENABLED;
    }

    public void J0(final int i11) {
        if (this.f19927a == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19903a.J0(i11);
                }
            });
        } else {
            this.f19928b.A(i11 + 0.99f);
        }
    }

    public Bitmap K(String str) {
        zf.b bVarR = R();
        if (bVarR != null) {
            return bVarR.a(str);
        }
        return null;
    }

    public void K0(final String str) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar2) {
                    this.f19918a.K0(str);
                }
            });
            return;
        }
        ag.h hVarL = iVar.l(str);
        if (hVarL != null) {
            J0((int) (hVarL.f1030b + hVarL.f1031c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public boolean L() {
        return this.f19950x;
    }

    public void L0(final float f11) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar2) {
                    this.f19911a.L0(f11);
                }
            });
        } else {
            this.f19928b.A(hg.j.i(iVar.p(), this.f19927a.f(), f11));
        }
    }

    public boolean M() {
        return this.f19943q;
    }

    public void M0(final int i11, final int i12) {
        if (this.f19927a == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19900a.M0(i11, i12);
                }
            });
        } else {
            this.f19928b.B(i11, i12 + 0.99f);
        }
    }

    public tf.i N() {
        return this.f19927a;
    }

    public void N0(final String str) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.a
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar2) {
                    this.f19891a.N0(str);
                }
            });
            return;
        }
        ag.h hVarL = iVar.l(str);
        if (hVarL != null) {
            int i11 = (int) hVarL.f1030b;
            M0(i11, ((int) hVarL.f1031c) + i11);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void O0(final String str, final String str2, final boolean z11) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar2) {
                    this.f19914a.O0(str, str2, z11);
                }
            });
            return;
        }
        ag.h hVarL = iVar.l(str);
        if (hVarL == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i11 = (int) hVarL.f1030b;
        ag.h hVarL2 = this.f19927a.l(str2);
        if (hVarL2 != null) {
            M0(i11, (int) (hVarL2.f1030b + (z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED)));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
    }

    public void P0(final float f11, final float f12) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar2) {
                    this.f19895a.P0(f11, f12);
                }
            });
        } else {
            M0((int) hg.j.i(iVar.p(), this.f19927a.f(), f11), (int) hg.j.i(this.f19927a.p(), this.f19927a.f(), f12));
        }
    }

    public int Q() {
        return (int) this.f19928b.l();
    }

    public void Q0(final int i11) {
        if (this.f19927a == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19905a.Q0(i11);
                }
            });
        } else {
            this.f19928b.C(i11);
        }
    }

    public void R0(final String str) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar2) {
                    this.f19920a.R0(str);
                }
            });
            return;
        }
        ag.h hVarL = iVar.l(str);
        if (hVarL != null) {
            Q0((int) hVarL.f1030b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public String S() {
        return this.f19935i;
    }

    public void S0(final float f11) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar2) {
                    this.f19923a.S0(f11);
                }
            });
        } else {
            Q0((int) hg.j.i(iVar.p(), this.f19927a.f(), f11));
        }
    }

    public z T(String str) {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            return null;
        }
        return iVar.j().get(str);
    }

    public void T0(boolean z11) {
        if (this.f19947u == z11) {
            return;
        }
        this.f19947u = z11;
        dg.c cVar = this.f19944r;
        if (cVar != null) {
            cVar.K(z11);
        }
    }

    public boolean U() {
        return this.f19942p;
    }

    public void U0(boolean z11) {
        this.f19946t = z11;
        tf.i iVar = this.f19927a;
        if (iVar != null) {
            iVar.w(z11);
        }
    }

    public ag.h V() {
        Iterator<String> it = W.iterator();
        ag.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f19927a.l(it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public void V0(final float f11) {
        if (this.f19927a == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.o
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19925a.V0(f11);
                }
            });
            return;
        }
        if (tf.e.h()) {
            tf.e.b("Drawable#setProgress");
        }
        this.f19928b.z(this.f19927a.h(f11));
        if (tf.e.h()) {
            tf.e.c("Drawable#setProgress");
        }
    }

    public float W() {
        return this.f19928b.n();
    }

    public void W0(k0 k0Var) {
        this.f19951y = k0Var;
        y();
    }

    public float X() {
        return this.f19928b.o();
    }

    public void X0(int i11) {
        this.f19928b.setRepeatCount(i11);
    }

    public h0 Y() {
        tf.i iVar = this.f19927a;
        if (iVar != null) {
            return iVar.n();
        }
        return null;
    }

    public void Y0(int i11) {
        this.f19928b.setRepeatMode(i11);
    }

    public float Z() {
        return this.f19928b.k();
    }

    public void Z0(boolean z11) {
        this.f19931e = z11;
    }

    public k0 a0() {
        return this.f19952z ? k0.SOFTWARE : k0.HARDWARE;
    }

    public void a1(float f11) {
        this.f19928b.D(f11);
    }

    public int b0() {
        return this.f19928b.getRepeatCount();
    }

    public void b1(m0 m0Var) {
        this.f19940n = m0Var;
    }

    @SuppressLint({"WrongConstant"})
    public int c0() {
        return this.f19928b.getRepeatMode();
    }

    public void c1(boolean z11) {
        this.f19928b.E(z11);
    }

    public float d0() {
        return this.f19928b.p();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float fP;
        float fK;
        dg.c cVar = this.f19944r;
        if (cVar == null) {
            return;
        }
        boolean zJ = J();
        if (zJ) {
            try {
                this.Q.acquire();
            } catch (InterruptedException unused) {
                if (!zJ) {
                    return;
                } else {
                    if ((fP > fK ? 1 : (fP == fK ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (tf.e.h()) {
                    tf.e.c("Drawable#draw");
                }
                if (zJ) {
                    this.Q.release();
                    if (cVar.P() != this.f19928b.k()) {
                        X.execute(this.T);
                    }
                }
            }
        }
        if (tf.e.h()) {
            tf.e.b("Drawable#draw");
        }
        if (zJ && d1()) {
            V0(this.f19928b.k());
        }
        if (this.f19931e) {
            try {
                if (this.f19952z) {
                    q0(canvas, cVar);
                } else {
                    D(canvas);
                }
            } catch (Throwable th2) {
                hg.e.b("Lottie crashed in draw!", th2);
            }
        } else if (this.f19952z) {
            q0(canvas, cVar);
        } else {
            D(canvas);
        }
        this.N = false;
    }

    public m0 e0() {
        return this.f19940n;
    }

    public boolean e1() {
        return this.f19937k == null && this.f19940n == null && this.f19927a.c().l() > 0;
    }

    public Typeface f0(ag.c cVar) {
        Map<String, Typeface> map = this.f19937k;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return map.get(strB);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        zf.a aVarP = P();
        if (aVarP != null) {
            return aVarP.b(cVar);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19945s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        tf.i iVar = this.f19927a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0() {
        hg.h hVar = this.f19928b;
        if (hVar == null) {
            return false;
        }
        return hVar.isRunning();
    }

    boolean i0() {
        if (isVisible()) {
            return this.f19928b.isRunning();
        }
        b bVar = this.f19932f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.N) {
            return;
        }
        this.N = true;
        if ((!V || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return h0();
    }

    public boolean j0() {
        return this.f19948v;
    }

    public boolean k0() {
        return this.f19949w;
    }

    public boolean l0(y yVar) {
        return this.f19941o.b(yVar);
    }

    public void m0() {
        this.f19933g.clear();
        this.f19928b.r();
        if (isVisible()) {
            return;
        }
        this.f19932f = b.NONE;
    }

    public void n0() {
        if (this.f19944r == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19922a.n0();
                }
            });
            return;
        }
        y();
        if (u(O()) || b0() == 0) {
            if (isVisible()) {
                this.f19928b.s();
                this.f19932f = b.NONE;
            } else {
                this.f19932f = b.PLAY;
            }
        }
        if (u(O())) {
            return;
        }
        ag.h hVarV = V();
        if (hVarV != null) {
            E0((int) hVarV.f1030b);
        } else {
            E0((int) (d0() < BitmapDescriptorFactory.HUE_RED ? X() : W()));
        }
        this.f19928b.j();
        if (isVisible()) {
            return;
        }
        this.f19932f = b.NONE;
    }

    public void o0() {
        this.f19928b.removeAllListeners();
    }

    public void p0() {
        this.f19928b.removeAllUpdateListeners();
        this.f19928b.addUpdateListener(this.P);
    }

    public List<ag.e> r0(ag.e eVar) {
        if (this.f19944r == null) {
            hg.e.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f19944r.d(eVar, 0, arrayList, new ag.e(new String[0]));
        return arrayList;
    }

    public void s(Animator.AnimatorListener animatorListener) {
        this.f19928b.addListener(animatorListener);
    }

    public void s0() {
        if (this.f19944r == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19913a.s0();
                }
            });
            return;
        }
        y();
        if (u(O()) || b0() == 0) {
            if (isVisible()) {
                this.f19928b.w();
                this.f19932f = b.NONE;
            } else {
                this.f19932f = b.RESUME;
            }
        }
        if (u(O())) {
            return;
        }
        E0((int) (d0() < BitmapDescriptorFactory.HUE_RED ? X() : W()));
        this.f19928b.j();
        if (isVisible()) {
            return;
        }
        this.f19932f = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f19945s = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        hg.e.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z11, z12);
        if (z11) {
            b bVar = this.f19932f;
            if (bVar == b.PLAY) {
                n0();
                return visible;
            }
            if (bVar == b.RESUME) {
                s0();
                return visible;
            }
        } else {
            if (this.f19928b.isRunning()) {
                m0();
                this.f19932f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f19932f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        n0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        F();
    }

    public <T> void t(final ag.e eVar, final T t11, final ig.c<T> cVar) {
        dg.c cVar2 = this.f19944r;
        if (cVar2 == null) {
            this.f19933g.add(new a() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.p.a
                public final void a(tf.i iVar) {
                    this.f19907a.t(eVar, t11, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == ag.e.f1024c) {
            cVar2.g(t11, cVar);
        } else if (eVar.d() != null) {
            eVar.d().g(t11, cVar);
        } else {
            List<ag.e> listR0 = r0(eVar);
            for (int i11 = 0; i11 < listR0.size(); i11++) {
                listR0.get(i11).d().g(t11, cVar);
            }
            zIsEmpty = true ^ listR0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t11 == d0.E) {
                V0(Z());
            }
        }
    }

    public void t0() {
        this.f19928b.x();
    }

    public boolean u(Context context) {
        if (this.f19930d) {
            return true;
        }
        return this.f19929c && tf.e.f().a(context) == yf.a.STANDARD_MOTION;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v0(boolean z11) {
        this.f19948v = z11;
    }

    public void w() {
        this.f19933g.clear();
        this.f19928b.cancel();
        if (isVisible()) {
            return;
        }
        this.f19932f = b.NONE;
    }

    public void w0(boolean z11) {
        this.f19949w = z11;
    }

    public void x() {
        if (this.f19928b.isRunning()) {
            this.f19928b.cancel();
            if (!isVisible()) {
                this.f19932f = b.NONE;
            }
        }
        this.f19927a = null;
        this.f19944r = null;
        this.f19934h = null;
        this.U = -3.4028235E38f;
        this.f19928b.i();
        invalidateSelf();
    }

    public void x0(tf.a aVar) {
        this.O = aVar;
    }

    public void y0(boolean z11) {
        if (z11 != this.f19950x) {
            this.f19950x = z11;
            invalidateSelf();
        }
    }

    public void z0(boolean z11) {
        if (z11 != this.f19943q) {
            this.f19943q = z11;
            dg.c cVar = this.f19944r;
            if (cVar != null) {
                cVar.Q(z11);
            }
            invalidateSelf();
        }
    }
}
