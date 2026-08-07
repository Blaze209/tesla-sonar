package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.MutableRect;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020%H\u0016ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016ø\u0001\u0001¢\u0006\u0004\b*\u0010'J!\u0010,\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\u0012J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u0012J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u0012J\"\u00103\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\"H\u0016ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00108J9\u00109\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0014H\u0016ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010>\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0014H\u0016ø\u0001\u0001¢\u0006\u0004\b>\u0010=R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010AR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010BR,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010CR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010DR\u001c\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b,\u0010ER\u0016\u0010G\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010FR\u001a\u0010I\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b7\u0010HR\u001e\u0010J\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b*\u0010HR$\u0010N\u001a\u00020\"2\u0006\u0010K\u001a\u00020\"8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b#\u0010F\"\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010PR\u0016\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010SR\u0014\u0010\u001d\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010VR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010XR\u001c\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b9\u0010ER\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010cR\u0016\u0010e\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010FR \u0010j\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u000b0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"Landroidx/compose/ui/platform/j1;", "Lb4/i1;", "", "Ln3/c;", "graphicsLayer", "Lk3/g3;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Lk3/j1;", "Ljn0/h0;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Ln3/c;Lk3/g3;Landroidx/compose/ui/platform/AndroidComposeView;Lwn0/p;Lwn0/a;)V", "q", "()V", "s", "Lk3/n3;", DateTokenConverter.CONVERTER_KEY, "()[F", "c", "r", "canvas", "b", "(Lk3/j1;)V", "Landroidx/compose/ui/graphics/d;", "scope", "k", "(Landroidx/compose/ui/graphics/d;)V", "Lj3/g;", "position", "", "j", "(J)Z", "Lw4/n;", "m", "(J)V", "Lw4/r;", "size", IntegerTokenConverter.CONVERTER_KEY, "parentLayer", "f", "(Lk3/j1;Ln3/c;)V", "n", "invalidate", "destroy", "point", "inverse", "g", "(JZ)J", "Lj3/e;", "rect", "h", "(Lj3/e;Z)V", "o", "(Lwn0/p;Lwn0/a;)V", "matrix", "e", "([F)V", "l", "a", "Ln3/c;", "Lk3/g3;", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lwn0/p;", "Lwn0/a;", "J", "Z", "isDestroyed", "[F", "matrixCache", "inverseMatrixCache", "value", "p", "(Z)V", "isDirty", "Lw4/d;", "Lw4/d;", "density", "Lw4/t;", "Lw4/t;", "layoutDirection", "Lm3/a;", "Lm3/a;", "", "I", "mutatedFields", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lk3/p3;", "Lk3/p3;", "outline", "Lk3/t3;", "Lk3/t3;", "tmpPath", "Lk3/r3;", "Lk3/r3;", "softwareLayerPaint", "drawnWithEnabledZ", "Lkotlin/Function1;", "Lm3/f;", "t", "Lwn0/l;", "recordLambda", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j1 implements b4.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private n3.c graphicsLayer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k3.g3 context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private wn0.a<jn0.h0> invalidateParentLayer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private k3.p3 outline;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private k3.t3 tmpPath;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private k3.r3 softwareLayerPaint;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithEnabledZ;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size = w4.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] matrixCache = k3.n3.c(null, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private w4.d density = w4.f.b(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private w4.t layoutDirection = w4.t.Ltr;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final m3.a scope = new m3.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<m3.f, jn0.h0> recordLambda = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<m3.f, jn0.h0> {
        a() {
            super(1);
        }

        public final void a(m3.f fVar) {
            j1 j1Var = j1.this;
            k3.j1 j1VarA = fVar.getDrawContext().a();
            wn0.p pVar = j1Var.drawBlock;
            if (pVar != null) {
                pVar.invoke(j1VarA, fVar.getDrawContext().getGraphicsLayer());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(m3.f fVar) {
            a(fVar);
            return jn0.h0.f84049a;
        }
    }

    public j1(n3.c cVar, k3.g3 g3Var, AndroidComposeView androidComposeView, wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar, wn0.a<jn0.h0> aVar) {
        this.graphicsLayer = cVar;
        this.context = g3Var;
        this.ownerView = androidComposeView;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
    }

    private final void b(k3.j1 canvas) {
        if (this.graphicsLayer.getClip()) {
            k3.p3 p3VarN = this.graphicsLayer.n();
            if (p3VarN instanceof k3.p3.b) {
                k3.j1.w(canvas, ((k3.p3.b) p3VarN).b(), 0, 2, null);
                return;
            }
            if (!(p3VarN instanceof k3.p3.c)) {
                if (p3VarN instanceof k3.p3.a) {
                    k3.j1.g(canvas, ((k3.p3.a) p3VarN).getPath(), 0, 2, null);
                    return;
                }
                return;
            }
            k3.t3 t3VarA = this.tmpPath;
            if (t3VarA == null) {
                t3VarA = k3.w0.a();
                this.tmpPath = t3VarA;
            }
            t3VarA.reset();
            k3.t3.d(t3VarA, ((k3.p3.c) p3VarN).getRoundRect(), null, 2, null);
            k3.j1.g(canvas, t3VarA, 0, 2, null);
        }
    }

    private final float[] c() {
        float[] fArrD = d();
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = k3.n3.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (s1.a(fArrD, fArrC)) {
            return fArrC;
        }
        return null;
    }

    private final float[] d() {
        r();
        return this.matrixCache;
    }

    private final void p(boolean z11) {
        if (z11 != this.isDirty) {
            this.isDirty = z11;
            this.ownerView.w0(this, z11);
        }
    }

    private final void q() {
        if (Build.VERSION.SDK_INT >= 26) {
            t3.f5968a.a(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void r() {
        n3.c cVar = this.graphicsLayer;
        long jB = j3.h.d(cVar.getPivotOffset()) ? j3.n.b(w4.s.d(this.size)) : cVar.getPivotOffset();
        k3.n3.j(this.matrixCache);
        float[] fArr = this.matrixCache;
        float[] fArrC = k3.n3.c(null, 1, null);
        k3.n3.s(fArrC, -j3.g.m(jB), -j3.g.n(jB), BitmapDescriptorFactory.HUE_RED, 4, null);
        k3.n3.p(fArr, fArrC);
        float[] fArr2 = this.matrixCache;
        float[] fArrC2 = k3.n3.c(null, 1, null);
        k3.n3.s(fArrC2, cVar.x(), cVar.y(), BitmapDescriptorFactory.HUE_RED, 4, null);
        k3.n3.k(fArrC2, cVar.p());
        k3.n3.l(fArrC2, cVar.q());
        k3.n3.m(fArrC2, cVar.r());
        k3.n3.o(fArrC2, cVar.s(), cVar.t(), BitmapDescriptorFactory.HUE_RED, 4, null);
        k3.n3.p(fArr2, fArrC2);
        float[] fArr3 = this.matrixCache;
        float[] fArrC3 = k3.n3.c(null, 1, null);
        k3.n3.s(fArrC3, j3.g.m(jB), j3.g.n(jB), BitmapDescriptorFactory.HUE_RED, 4, null);
        k3.n3.p(fArr3, fArrC3);
    }

    private final void s() {
        wn0.a<jn0.h0> aVar;
        k3.p3 p3Var = this.outline;
        if (p3Var == null) {
            return;
        }
        n3.e.b(this.graphicsLayer, p3Var);
        if (!(p3Var instanceof k3.p3.a) || Build.VERSION.SDK_INT >= 33 || (aVar = this.invalidateParentLayer) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // b4.i1
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        p(false);
        k3.g3 g3Var = this.context;
        if (g3Var != null) {
            g3Var.b(this.graphicsLayer);
            this.ownerView.F0(this);
        }
    }

    @Override // b4.i1
    public void e(float[] matrix) {
        k3.n3.p(matrix, d());
    }

    @Override // b4.i1
    public void f(k3.j1 canvas, n3.c parentLayer) {
        Canvas canvasD = k3.f0.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            n();
            this.drawnWithEnabledZ = this.graphicsLayer.u() > BitmapDescriptorFactory.HUE_RED;
            m3.d drawContext = this.scope.getDrawContext();
            drawContext.h(canvas);
            drawContext.e(parentLayer);
            n3.e.a(this.scope, this.graphicsLayer);
            return;
        }
        float fH = w4.n.h(this.graphicsLayer.getTopLeft());
        float fI = w4.n.i(this.graphicsLayer.getTopLeft());
        float fG = fH + w4.r.g(this.size);
        float f11 = fI + w4.r.f(this.size);
        if (this.graphicsLayer.i() < 1.0f) {
            k3.r3 r3VarA = this.softwareLayerPaint;
            if (r3VarA == null) {
                r3VarA = k3.q0.a();
                this.softwareLayerPaint = r3VarA;
            }
            r3VarA.a(this.graphicsLayer.i());
            canvasD.saveLayer(fH, fI, fG, f11, r3VarA.getInternalPaint());
        } else {
            canvas.u();
        }
        canvas.c(fH, fI);
        canvas.v(d());
        if (this.graphicsLayer.getClip()) {
            b(canvas);
        }
        wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(canvas, null);
        }
        canvas.o();
    }

    @Override // b4.i1
    public long g(long point, boolean inverse) {
        if (!inverse) {
            return k3.n3.g(d(), point);
        }
        float[] fArrC = c();
        return fArrC != null ? k3.n3.g(fArrC, point) : j3.g.INSTANCE.a();
    }

    @Override // b4.i1
    public void h(MutableRect rect, boolean inverse) {
        if (!inverse) {
            k3.n3.i(d(), rect);
            return;
        }
        float[] fArrC = c();
        if (fArrC == null) {
            rect.g(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            k3.n3.i(fArrC, rect);
        }
    }

    @Override // b4.i1
    public void i(long size) {
        if (w4.r.e(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }

    @Override // b4.i1
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        p(true);
    }

    @Override // b4.i1
    public boolean j(long position) {
        float fM = j3.g.m(position);
        float fN = j3.g.n(position);
        if (this.graphicsLayer.getClip()) {
            return q2.c(this.graphicsLayer.n(), fM, fN, null, null, 24, null);
        }
        return true;
    }

    @Override // b4.i1
    public void k(androidx.compose.ui.graphics.d scope) {
        boolean z11;
        int iB;
        wn0.a<jn0.h0> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i11 = mutatedFields & 4096;
        if (i11 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.X(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.Y(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.J(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.d0(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.e0(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.Z(scope.getShadowElevation());
            if (scope.getShadowElevation() > BitmapDescriptorFactory.HUE_RED && !this.drawnWithEnabledZ && (aVar = this.invalidateParentLayer) != null) {
                aVar.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.K(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.b0(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.V(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.T(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.U(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.L(scope.getCameraDistance());
        }
        if (i11 != 0) {
            if (androidx.compose.ui.graphics.f.e(this.transformOrigin, androidx.compose.ui.graphics.f.INSTANCE.a())) {
                this.graphicsLayer.P(j3.g.INSTANCE.b());
            } else {
                this.graphicsLayer.P(j3.h.a(androidx.compose.ui.graphics.f.f(this.transformOrigin) * w4.r.g(this.size), androidx.compose.ui.graphics.f.g(this.transformOrigin) * w4.r.f(this.size)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.M(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            n3.c cVar = this.graphicsLayer;
            scope.I();
            cVar.S(null);
        }
        if ((32768 & mutatedFields) != 0) {
            n3.c cVar2 = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            androidx.compose.ui.graphics.a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
            if (androidx.compose.ui.graphics.a.e(compositingStrategy, companion.a())) {
                iB = n3.b.INSTANCE.a();
            } else if (androidx.compose.ui.graphics.a.e(compositingStrategy, companion.c())) {
                iB = n3.b.INSTANCE.c();
            } else {
                if (!androidx.compose.ui.graphics.a.e(compositingStrategy, companion.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = n3.b.INSTANCE.b();
            }
            cVar2.N(iB);
        }
        if (p013kotlin.jvm.internal.s.f(this.outline, scope.getOutline())) {
            z11 = false;
        } else {
            this.outline = scope.getOutline();
            s();
            z11 = true;
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z11) {
            q();
        }
    }

    @Override // b4.i1
    public void l(float[] matrix) {
        float[] fArrC = c();
        if (fArrC != null) {
            k3.n3.p(matrix, fArrC);
        }
    }

    @Override // b4.i1
    public void m(long position) {
        this.graphicsLayer.c0(position);
        q();
    }

    @Override // b4.i1
    public void n() {
        if (this.isDirty) {
            if (!androidx.compose.ui.graphics.f.e(this.transformOrigin, androidx.compose.ui.graphics.f.INSTANCE.a()) && !w4.r.e(this.graphicsLayer.getSize(), this.size)) {
                this.graphicsLayer.P(j3.h.a(androidx.compose.ui.graphics.f.f(this.transformOrigin) * w4.r.g(this.size), androidx.compose.ui.graphics.f.g(this.transformOrigin) * w4.r.f(this.size)));
            }
            this.graphicsLayer.E(this.density, this.layoutDirection, this.size, this.recordLambda);
            p(false);
        }
    }

    @Override // b4.i1
    public void o(wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock, wn0.a<jn0.h0> invalidateParentLayer) {
        k3.g3 g3Var = this.context;
        if (g3Var == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.graphicsLayer.getIsReleased()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = g3Var.a();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.drawnWithEnabledZ = false;
        this.size = w4.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.outline = null;
        this.mutatedFields = 0;
    }
}
