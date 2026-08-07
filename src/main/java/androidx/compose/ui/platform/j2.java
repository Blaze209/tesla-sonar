package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.MutableRect;
import k3.a4;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001:B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u000fJ!\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u000fJ\"\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010/J9\u00100\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R,\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010<R$\u0010A\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010?\"\u0004\b:\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010CR\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010?R\u0016\u0010F\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010?R\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010OR\u001c\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0014\u0010U\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010TR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/ui/platform/j2;", "Lb4/i1;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Lk3/j1;", "Ln3/c;", "Ljn0/h0;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lwn0/p;Lwn0/a;)V", "c", "()V", "canvas", "a", "(Lk3/j1;)V", "Landroidx/compose/ui/graphics/d;", "scope", "k", "(Landroidx/compose/ui/graphics/d;)V", "Lj3/g;", "position", "", "j", "(J)Z", "Lw4/r;", "size", IntegerTokenConverter.CONVERTER_KEY, "(J)V", "Lw4/n;", "m", "invalidate", "parentLayer", "f", "(Lk3/j1;Ln3/c;)V", "n", "destroy", "point", "inverse", "g", "(JZ)J", "Lj3/e;", "rect", "h", "(Lj3/e;Z)V", "o", "(Lwn0/p;Lwn0/a;)V", "Lk3/n3;", "matrix", "e", "([F)V", "l", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Lwn0/p;", "Lwn0/a;", "value", DateTokenConverter.CONVERTER_KEY, "Z", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/z1;", "Landroidx/compose/ui/platform/z1;", "outlineResolver", "isDestroyed", "drawnWithZ", "Lk3/r3;", "Lk3/r3;", "softwareLayerPaint", "Landroidx/compose/ui/platform/u1;", "Landroidx/compose/ui/platform/c1;", "Landroidx/compose/ui/platform/u1;", "matrixCache", "Lk3/k1;", "Lk3/k1;", "canvasHolder", "Landroidx/compose/ui/graphics/f;", "J", "transformOrigin", "Landroidx/compose/ui/platform/c1;", "renderNode", "", "I", "mutatedFields", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j2 implements b4.i1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5809o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final wn0.p<c1, Matrix, jn0.h0> f5810p = a.f5824c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private wn0.a<jn0.h0> invalidateParentLayer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private k3.r3 softwareLayerPaint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final c1 renderNode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z1 outlineResolver = new z1();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final u1<c1> matrixCache = new u1<>(f5810p);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k3.k1 canvasHolder = new k3.k1();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/c1;", "rn", "Landroid/graphics/Matrix;", "matrix", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/c1;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<c1, Matrix, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5824c = new a();

        a() {
            super(2);
        }

        public final void a(c1 c1Var, Matrix matrix) {
            c1Var.x(matrix);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(c1 c1Var, Matrix matrix) {
            a(c1Var, matrix);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/j1;", "it", "Ljn0/h0;", "a", "(Lk3/j1;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<k3.j1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p<k3.j1, n3.c, jn0.h0> f5825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar) {
            super(1);
            this.f5825c = pVar;
        }

        public final void a(k3.j1 j1Var) {
            this.f5825c.invoke(j1Var, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(k3.j1 j1Var) {
            a(j1Var);
            return jn0.h0.f84049a;
        }
    }

    public j2(AndroidComposeView androidComposeView, wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar, wn0.a<jn0.h0> aVar) {
        this.ownerView = androidComposeView;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        c1 h2Var = Build.VERSION.SDK_INT >= 29 ? new h2(androidComposeView) : new g2(androidComposeView);
        h2Var.w(true);
        h2Var.q(false);
        this.renderNode = h2Var;
    }

    private final void a(k3.j1 canvas) {
        if (this.renderNode.v() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.a(canvas);
        }
    }

    private final void b(boolean z11) {
        if (z11 != this.isDirty) {
            this.isDirty = z11;
            this.ownerView.w0(this, z11);
        }
    }

    private final void c() {
        if (Build.VERSION.SDK_INT >= 26) {
            t3.f5968a.a(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // b4.i1
    public void destroy() {
        if (this.renderNode.c()) {
            this.renderNode.o();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        b(false);
        this.ownerView.H0();
        this.ownerView.F0(this);
    }

    @Override // b4.i1
    public void e(float[] matrix) {
        k3.n3.p(matrix, this.matrixCache.b(this.renderNode));
    }

    @Override // b4.i1
    public void f(k3.j1 canvas, n3.c parentLayer) {
        Canvas canvasD = k3.f0.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            n();
            boolean z11 = this.renderNode.J() > BitmapDescriptorFactory.HUE_RED;
            this.drawnWithZ = z11;
            if (z11) {
                canvas.p();
            }
            this.renderNode.p(canvasD);
            if (this.drawnWithZ) {
                canvas.j();
                return;
            }
            return;
        }
        float fN = this.renderNode.getLeft();
        float fG = this.renderNode.getTop();
        float fE = this.renderNode.getRight();
        float fZ = this.renderNode.getBottom();
        if (this.renderNode.b() < 1.0f) {
            k3.r3 r3VarA = this.softwareLayerPaint;
            if (r3VarA == null) {
                r3VarA = k3.q0.a();
                this.softwareLayerPaint = r3VarA;
            }
            r3VarA.a(this.renderNode.b());
            canvasD.saveLayer(fN, fG, fE, fZ, r3VarA.getInternalPaint());
        } else {
            canvas.u();
        }
        canvas.c(fN, fG);
        canvas.v(this.matrixCache.b(this.renderNode));
        a(canvas);
        wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(canvas, null);
        }
        canvas.o();
        b(false);
    }

    @Override // b4.i1
    public long g(long point, boolean inverse) {
        if (!inverse) {
            return k3.n3.g(this.matrixCache.b(this.renderNode), point);
        }
        float[] fArrA = this.matrixCache.a(this.renderNode);
        return fArrA != null ? k3.n3.g(fArrA, point) : j3.g.INSTANCE.a();
    }

    @Override // b4.i1
    public void h(MutableRect rect, boolean inverse) {
        if (!inverse) {
            k3.n3.i(this.matrixCache.b(this.renderNode), rect);
            return;
        }
        float[] fArrA = this.matrixCache.a(this.renderNode);
        if (fArrA == null) {
            rect.g(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            k3.n3.i(fArrA, rect);
        }
    }

    @Override // b4.i1
    public void i(long size) {
        int iG = w4.r.g(size);
        int iF = w4.r.f(size);
        this.renderNode.A(androidx.compose.ui.graphics.f.f(this.transformOrigin) * iG);
        this.renderNode.B(androidx.compose.ui.graphics.f.g(this.transformOrigin) * iF);
        c1 c1Var = this.renderNode;
        if (c1Var.E(c1Var.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + iG, this.renderNode.getTop() + iF)) {
            this.renderNode.C(this.outlineResolver.b());
            invalidate();
            this.matrixCache.c();
        }
    }

    @Override // b4.i1
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        b(true);
    }

    @Override // b4.i1
    public boolean j(long position) {
        float fM = j3.g.m(position);
        float fN = j3.g.n(position);
        if (this.renderNode.getClipToBounds()) {
            return BitmapDescriptorFactory.HUE_RED <= fM && fM < ((float) this.renderNode.getWidth()) && BitmapDescriptorFactory.HUE_RED <= fN && fN < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.v()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // b4.i1
    public void k(androidx.compose.ui.graphics.d scope) {
        wn0.a<jn0.h0> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i11 = mutatedFields & 4096;
        if (i11 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z11 = false;
        boolean z12 = this.renderNode.v() && !this.outlineResolver.e();
        if ((mutatedFields & 1) != 0) {
            this.renderNode.k(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.l(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.a(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.m(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.d(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.s(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.H(k3.r1.k(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.I(k3.r1.k(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.i(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.g(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.h(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.renderNode.f(scope.getCameraDistance());
        }
        if (i11 != 0) {
            this.renderNode.A(androidx.compose.ui.graphics.f.f(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.B(androidx.compose.ui.graphics.f.g(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z13 = scope.getClip() && scope.getShape() != a4.a();
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.D(z13);
            this.renderNode.q(scope.getClip() && scope.getShape() == a4.a());
        }
        if ((131072 & mutatedFields) != 0) {
            c1 c1Var = this.renderNode;
            scope.I();
            c1Var.j(null);
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.r(scope.getCompositingStrategy());
        }
        boolean zH = this.outlineResolver.h(scope.getOutline(), scope.getAlpha(), z13, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.C(this.outlineResolver.b());
        }
        if (z13 && !this.outlineResolver.e()) {
            z11 = true;
        }
        if (z12 != z11 || (z11 && zH)) {
            invalidate();
        } else {
            c();
        }
        if (!this.drawnWithZ && this.renderNode.J() > BitmapDescriptorFactory.HUE_RED && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields & 7963) != 0) {
            this.matrixCache.c();
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // b4.i1
    public void l(float[] matrix) {
        float[] fArrA = this.matrixCache.a(this.renderNode);
        if (fArrA != null) {
            k3.n3.p(matrix, fArrA);
        }
    }

    @Override // b4.i1
    public void m(long position) {
        int iN = this.renderNode.getLeft();
        int iG = this.renderNode.getTop();
        int iH = w4.n.h(position);
        int i11 = w4.n.i(position);
        if (iN == iH && iG == i11) {
            return;
        }
        if (iN != iH) {
            this.renderNode.y(iH - iN);
        }
        if (iG != i11) {
            this.renderNode.t(i11 - iG);
        }
        c();
        this.matrixCache.c();
    }

    @Override // b4.i1
    public void n() {
        if (this.isDirty || !this.renderNode.c()) {
            k3.t3 t3VarD = (!this.renderNode.v() || this.outlineResolver.e()) ? null : this.outlineResolver.d();
            wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar = this.drawBlock;
            if (pVar != null) {
                this.renderNode.u(this.canvasHolder, t3VarD, new c(pVar));
            }
            b(false);
        }
    }

    @Override // b4.i1
    public void o(wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock, wn0.a<jn0.h0> invalidateParentLayer) {
        b(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }
}
