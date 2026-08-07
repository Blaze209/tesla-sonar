package dg;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import cg.o;
import com.airbnb.lottie.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fg.j;
import hg.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements vf.e, wf.a.b, ag.f {
    private Paint A;
    float B;
    BlurMaskFilter C;
    uf.a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f60537a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f60538b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f60539c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f60540d = new uf.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f60541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f60542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f60543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f60544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f60545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f60546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f60547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f60548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f60549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Matrix f60551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final p f60552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final e f60553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private wf.h f60554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private wf.d f60555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f60556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f60557u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<b> f60558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<wf.a<?, ?>> f60559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wf.p f60560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f60561y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f60562z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f60564b;

        static {
            int[] iArr = new int[cg.i.a.values().length];
            f60564b = iArr;
            try {
                iArr[cg.i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60564b[cg.i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60564b[cg.i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60564b[cg.i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f60563a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60563a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60563a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60563a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60563a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60563a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60563a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(p pVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f60541e = new uf.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f60542f = new uf.a(1, mode2);
        uf.a aVar = new uf.a(1);
        this.f60543g = aVar;
        this.f60544h = new uf.a(PorterDuff.Mode.CLEAR);
        this.f60545i = new RectF();
        this.f60546j = new RectF();
        this.f60547k = new RectF();
        this.f60548l = new RectF();
        this.f60549m = new RectF();
        this.f60551o = new Matrix();
        this.f60559w = new ArrayList();
        this.f60561y = true;
        this.B = BitmapDescriptorFactory.HUE_RED;
        this.f60552p = pVar;
        this.f60553q = eVar;
        this.f60550n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        wf.p pVarB = eVar.x().b();
        this.f60560x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            wf.h hVar = new wf.h(eVar.h());
            this.f60554r = hVar;
            Iterator<wf.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (wf.a<Integer, Integer> aVar2 : this.f60554r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f60547k.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        if (B()) {
            int size = this.f60554r.b().size();
            for (int i11 = 0; i11 < size; i11++) {
                cg.i iVar = this.f60554r.b().get(i11);
                Path pathH = this.f60554r.a().get(i11).h();
                if (pathH != null) {
                    this.f60537a.set(pathH);
                    this.f60537a.transform(matrix);
                    int i12 = a.f60564b[iVar.a().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        return;
                    }
                    if ((i12 == 3 || i12 == 4) && iVar.d()) {
                        return;
                    }
                    this.f60537a.computeBounds(this.f60549m, false);
                    if (i11 == 0) {
                        this.f60547k.set(this.f60549m);
                    } else {
                        RectF rectF2 = this.f60547k;
                        rectF2.set(Math.min(rectF2.left, this.f60549m.left), Math.min(this.f60547k.top, this.f60549m.top), Math.max(this.f60547k.right, this.f60549m.right), Math.max(this.f60547k.bottom, this.f60549m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f60547k)) {
                return;
            }
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f60553q.i() != e.b.INVERT) {
            this.f60548l.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f60556t.b(this.f60548l, matrix, true);
            if (rectF.intersect(this.f60548l)) {
                return;
            }
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private void F() {
        this.f60552p.invalidateSelf();
    }

    private void G(float f11) {
        this.f60552p.N().n().a(this.f60553q.j(), f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z11) {
        if (z11 != this.f60561y) {
            this.f60561y = z11;
            F();
        }
    }

    private void O() {
        if (this.f60553q.f().isEmpty()) {
            N(true);
            return;
        }
        wf.d dVar = new wf.d(this.f60553q.f());
        this.f60555s = dVar;
        dVar.m();
        this.f60555s.a(new wf.a.b() { // from class: dg.a
            @Override // wf.a.b
            public final void e() {
                b bVar = this.f60536a;
                bVar.N(bVar.f60555s.r() == 1.0f);
            }
        });
        N(this.f60555s.h().floatValue() == 1.0f);
        j(this.f60555s);
    }

    private void k(Canvas canvas, Matrix matrix, wf.a<o, Path> aVar, wf.a<Integer, Integer> aVar2) {
        this.f60537a.set(aVar.h());
        this.f60537a.transform(matrix);
        this.f60540d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f60537a, this.f60540d);
    }

    private void l(Canvas canvas, Matrix matrix, wf.a<o, Path> aVar, wf.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f60545i, this.f60541e);
        this.f60537a.set(aVar.h());
        this.f60537a.transform(matrix);
        this.f60540d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f60537a, this.f60540d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, wf.a<o, Path> aVar, wf.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f60545i, this.f60540d);
        canvas.drawRect(this.f60545i, this.f60540d);
        this.f60537a.set(aVar.h());
        this.f60537a.transform(matrix);
        this.f60540d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f60537a, this.f60542f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, wf.a<o, Path> aVar, wf.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f60545i, this.f60541e);
        canvas.drawRect(this.f60545i, this.f60540d);
        this.f60542f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f60537a.set(aVar.h());
        this.f60537a.transform(matrix);
        canvas.drawPath(this.f60537a, this.f60542f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, wf.a<o, Path> aVar, wf.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f60545i, this.f60542f);
        canvas.drawRect(this.f60545i, this.f60540d);
        this.f60542f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f60537a.set(aVar.h());
        this.f60537a.transform(matrix);
        canvas.drawPath(this.f60537a, this.f60542f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (tf.e.h()) {
            tf.e.b("Layer#saveLayer");
        }
        l.o(canvas, this.f60545i, this.f60541e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (tf.e.h()) {
            tf.e.c("Layer#saveLayer");
        }
        for (int i11 = 0; i11 < this.f60554r.b().size(); i11++) {
            cg.i iVar = this.f60554r.b().get(i11);
            wf.a<o, Path> aVar = this.f60554r.a().get(i11);
            wf.a<Integer, Integer> aVar2 = this.f60554r.c().get(i11);
            int i12 = a.f60564b[iVar.a().ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    if (i11 == 0) {
                        this.f60540d.setColor(-16777216);
                        this.f60540d.setAlpha(255);
                        canvas.drawRect(this.f60545i, this.f60540d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (iVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    l(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f60540d.setAlpha(255);
                canvas.drawRect(this.f60545i, this.f60540d);
            }
        }
        if (tf.e.h()) {
            tf.e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (tf.e.h()) {
            tf.e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, wf.a<o, Path> aVar) {
        this.f60537a.set(aVar.h());
        this.f60537a.transform(matrix);
        canvas.drawPath(this.f60537a, this.f60542f);
    }

    private boolean r() {
        if (this.f60554r.a().isEmpty()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f60554r.b().size(); i11++) {
            if (this.f60554r.b().get(i11).a() != cg.i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f60558v != null) {
            return;
        }
        if (this.f60557u == null) {
            this.f60558v = Collections.EMPTY_LIST;
            return;
        }
        this.f60558v = new ArrayList();
        for (b bVar = this.f60557u; bVar != null; bVar = bVar.f60557u) {
            this.f60558v.add(bVar);
        }
    }

    private void t(Canvas canvas) {
        if (tf.e.h()) {
            tf.e.b("Layer#clearLayer");
        }
        RectF rectF = this.f60545i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f60544h);
        if (tf.e.h()) {
            tf.e.c("Layer#clearLayer");
        }
    }

    static b v(c cVar, e eVar, p pVar, tf.i iVar) {
        switch (a.f60563a[eVar.g().ordinal()]) {
            case 1:
                return new g(pVar, eVar, cVar, iVar);
            case 2:
                return new c(pVar, eVar, iVar.o(eVar.n()), iVar);
            case 3:
                return new h(pVar, eVar);
            case 4:
                return new d(pVar, eVar);
            case 5:
                return new f(pVar, eVar);
            case 6:
                return new i(pVar, eVar);
            default:
                hg.e.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    e A() {
        return this.f60553q;
    }

    boolean B() {
        wf.h hVar = this.f60554r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean C() {
        return this.f60556t != null;
    }

    public void H(wf.a<?, ?> aVar) {
        this.f60559w.remove(aVar);
    }

    void J(b bVar) {
        this.f60556t = bVar;
    }

    void K(boolean z11) {
        if (z11 && this.A == null) {
            this.A = new uf.a();
        }
        this.f60562z = z11;
    }

    void L(b bVar) {
        this.f60557u = bVar;
    }

    void M(float f11) {
        if (tf.e.h()) {
            tf.e.b("BaseLayer#setProgress");
            tf.e.b("BaseLayer#setProgress.transform");
        }
        this.f60560x.j(f11);
        if (tf.e.h()) {
            tf.e.c("BaseLayer#setProgress.transform");
        }
        if (this.f60554r != null) {
            if (tf.e.h()) {
                tf.e.b("BaseLayer#setProgress.mask");
            }
            for (int i11 = 0; i11 < this.f60554r.a().size(); i11++) {
                this.f60554r.a().get(i11).n(f11);
            }
            if (tf.e.h()) {
                tf.e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f60555s != null) {
            if (tf.e.h()) {
                tf.e.b("BaseLayer#setProgress.inout");
            }
            this.f60555s.n(f11);
            if (tf.e.h()) {
                tf.e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f60556t != null) {
            if (tf.e.h()) {
                tf.e.b("BaseLayer#setProgress.matte");
            }
            this.f60556t.M(f11);
            if (tf.e.h()) {
                tf.e.c("BaseLayer#setProgress.matte");
            }
        }
        if (tf.e.h()) {
            tf.e.b("BaseLayer#setProgress.animations." + this.f60559w.size());
        }
        for (int i12 = 0; i12 < this.f60559w.size(); i12++) {
            this.f60559w.get(i12).n(f11);
        }
        if (tf.e.h()) {
            tf.e.c("BaseLayer#setProgress.animations." + this.f60559w.size());
            tf.e.c("BaseLayer#setProgress");
        }
    }

    @Override // vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        this.f60545i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        s();
        this.f60551o.set(matrix);
        if (z11) {
            List<b> list = this.f60558v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f60551o.preConcat(this.f60558v.get(size).f60560x.f());
                }
            } else {
                b bVar = this.f60557u;
                if (bVar != null) {
                    this.f60551o.preConcat(bVar.f60560x.f());
                }
            }
        }
        this.f60551o.preConcat(this.f60560x.f());
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        b bVar = this.f60556t;
        if (bVar != null) {
            ag.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f60556t.getName(), i11)) {
                list.add(eVarA.i(this.f60556t));
            }
            if (eVar.g(this.f60556t.getName(), i11) && eVar.h(getName(), i11)) {
                this.f60556t.I(eVar, eVar.e(this.f60556t.getName(), i11) + i11, list, eVarA);
            }
        }
        if (eVar.g(getName(), i11)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i11)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i11)) {
                I(eVar, i11 + eVar.e(getName(), i11), list, eVar2);
            }
        }
    }

    @Override // wf.a.b
    public void e() {
        F();
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        this.f60560x.c(t11, cVar);
    }

    @Override // vf.c
    public String getName() {
        return this.f60553q.j();
    }

    @Override // vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        Paint paint;
        Integer numH;
        tf.e.b(this.f60550n);
        if (!this.f60561y || this.f60553q.y()) {
            tf.e.c(this.f60550n);
            return;
        }
        s();
        if (tf.e.h()) {
            tf.e.b("Layer#parentMatrix");
        }
        this.f60538b.reset();
        this.f60538b.set(matrix);
        for (int size = this.f60558v.size() - 1; size >= 0; size--) {
            this.f60538b.preConcat(this.f60558v.get(size).f60560x.f());
        }
        if (tf.e.h()) {
            tf.e.c("Layer#parentMatrix");
        }
        wf.a<?, Integer> aVarH = this.f60560x.h();
        int iIntValue = (int) ((((i11 / 255.0f) * ((aVarH == null || (numH = aVarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == cg.h.NORMAL) {
            this.f60538b.preConcat(this.f60560x.f());
            if (tf.e.h()) {
                tf.e.b("Layer#drawLayer");
            }
            u(canvas, this.f60538b, iIntValue, bVar);
            if (tf.e.h()) {
                tf.e.c("Layer#drawLayer");
            }
            G(tf.e.c(this.f60550n));
            return;
        }
        if (tf.e.h()) {
            tf.e.b("Layer#computeBounds");
        }
        b(this.f60545i, this.f60538b, false);
        E(this.f60545i, matrix);
        this.f60538b.preConcat(this.f60560x.f());
        D(this.f60545i, this.f60538b);
        this.f60546j.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f60539c);
        if (!this.f60539c.isIdentity()) {
            Matrix matrix2 = this.f60539c;
            matrix2.invert(matrix2);
            this.f60539c.mapRect(this.f60546j);
        }
        if (!this.f60545i.intersect(this.f60546j)) {
            this.f60545i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        if (tf.e.h()) {
            tf.e.c("Layer#computeBounds");
        }
        if (this.f60545i.width() >= 1.0f && this.f60545i.height() >= 1.0f) {
            if (tf.e.h()) {
                tf.e.b("Layer#saveLayer");
            }
            this.f60540d.setAlpha(255);
            k5.f.b(this.f60540d, w().toNativeBlendMode());
            l.n(canvas, this.f60545i, this.f60540d);
            if (tf.e.h()) {
                tf.e.c("Layer#saveLayer");
            }
            if (w() != cg.h.MULTIPLY) {
                t(canvas);
            } else {
                if (this.D == null) {
                    uf.a aVar = new uf.a();
                    this.D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f60545i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.D);
            }
            if (tf.e.h()) {
                tf.e.b("Layer#drawLayer");
            }
            u(canvas, this.f60538b, iIntValue, bVar);
            if (tf.e.h()) {
                tf.e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.f60538b);
            }
            if (C()) {
                if (tf.e.h()) {
                    tf.e.b("Layer#drawMatte");
                    tf.e.b("Layer#saveLayer");
                }
                l.o(canvas, this.f60545i, this.f60543g, 19);
                if (tf.e.h()) {
                    tf.e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f60556t.i(canvas, matrix, i11, null);
                if (tf.e.h()) {
                    tf.e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (tf.e.h()) {
                    tf.e.c("Layer#restoreLayer");
                    tf.e.c("Layer#drawMatte");
                }
            }
            if (tf.e.h()) {
                tf.e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (tf.e.h()) {
                tf.e.c("Layer#restoreLayer");
            }
        }
        if (this.f60562z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f60545i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f60545i, this.A);
        }
        G(tf.e.c(this.f60550n));
    }

    public void j(wf.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f60559w.add(aVar);
    }

    abstract void u(Canvas canvas, Matrix matrix, int i11, hg.b bVar);

    public cg.h w() {
        return this.f60553q.a();
    }

    public cg.a x() {
        return this.f60553q.b();
    }

    public BlurMaskFilter y(float f11) {
        if (this.B == f11) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f11 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f11;
        return blurMaskFilter;
    }

    public j z() {
        return this.f60553q.d();
    }

    @Override // vf.c
    public void f(List<vf.c> list, List<vf.c> list2) {
    }

    void I(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
    }
}
