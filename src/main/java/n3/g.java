package n3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.b1;
import k3.b4;
import k3.e0;
import k3.f0;
import k3.j1;
import k3.k1;
import k3.p1;
import k3.q1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J;\u0010\u0018\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\b\u0018\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010\u001b\u001a\u00020@8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010S\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\b5\u0010P\"\u0004\bQ\u0010RR0\u0010Z\u001a\u00020T2\u0006\u0010M\u001a\u00020T8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bU\u0010\u000b\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR.\u0010a\u001a\u0004\u0018\u00010[2\b\u0010M\u001a\u0004\u0018\u00010[8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b=\u0010^\"\u0004\b_\u0010`R0\u0010f\u001a\u00020b2\u0006\u0010M\u001a\u00020b8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bc\u00106\u001a\u0004\bd\u00108\"\u0004\bO\u0010eR*\u0010h\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010O\u001a\u0004\bg\u0010P\"\u0004\bU\u0010RR*\u0010j\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010O\u001a\u0004\bi\u0010P\"\u0004\b\\\u0010RR*\u0010m\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010O\u001a\u0004\bl\u0010P\"\u0004\bc\u0010RR*\u0010p\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010O\u001a\u0004\bo\u0010P\"\u0004\b;\u0010RR*\u0010s\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010O\u001a\u0004\bq\u0010P\"\u0004\br\u0010RR0\u0010w\u001a\u00020t2\u0006\u0010M\u001a\u00020t8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u00106\u001a\u0004\bu\u00108\"\u0004\bv\u0010eR0\u0010z\u001a\u00020t2\u0006\u0010M\u001a\u00020t8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u00106\u001a\u0004\bn\u00108\"\u0004\by\u0010eR*\u0010}\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b{\u0010O\u001a\u0004\b|\u0010P\"\u0004\bC\u0010RR*\u0010\u007f\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010O\u001a\u0004\b~\u0010P\"\u0004\bF\u0010RR+\u0010\u0080\u0001\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010O\u001a\u0004\b6\u0010P\"\u0004\bI\u0010RR+\u0010\u0081\u0001\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010O\u001a\u0004\bx\u0010P\"\u0004\bA\u0010RR-\u0010\u0084\u0001\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00138\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b\u0019\u0010J\u001a\u0005\b\u0082\u0001\u0010\u0015\"\u0005\b{\u0010\u0083\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010JR\u0017\u0010\u0086\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010JR1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u0019\u0010W\"\u0005\b\u0087\u0001\u0010YR&\u0010\u0088\u0001\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\bu\u0010J\u001a\u0005\b\u0088\u0001\u0010\u0015\"\u0006\b\u0089\u0001\u0010\u0083\u0001R5\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010M\u001a\u0005\u0018\u00010\u008a\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\bk\u0010\u008d\u0001\"\u0005\bN\u0010\u008e\u0001R\u0015\u0010\u008f\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0090\u0001"}, d2 = {"Ln3/g;", "Ln3/d;", "", "ownerId", "Lk3/k1;", "canvasHolder", "Lm3/a;", "canvasDrawScope", "<init>", "(JLk3/k1;Lm3/a;)V", "Ljn0/h0;", "I", "()V", "Landroid/graphics/RenderNode;", "Ln3/b;", "compositingStrategy", "K", "(Landroid/graphics/RenderNode;I)V", "T", "", "P", "()Z", "S", "", "x", "y", "Lw4/r;", "size", "B", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "s", "(Landroid/graphics/Outline;J)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Ln3/c;", "layer", "Lkotlin/Function1;", "Lm3/f;", "block", "(Lw4/d;Lw4/t;Ln3/c;Lwn0/l;)V", "Lk3/j1;", "canvas", "E", "(Lk3/j1;)V", "Landroid/graphics/Matrix;", "r", "()Landroid/graphics/Matrix;", "o", "b", "J", "getOwnerId", "()J", "c", "Lk3/k1;", DateTokenConverter.CONVERTER_KEY, "Lm3/a;", "e", "Landroid/graphics/RenderNode;", "renderNode", "Lj3/m;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", IntegerTokenConverter.CONVERTER_KEY, "Z", "outlineIsProvided", "", "value", "j", Gender.FEMALE, "()F", "a", "(F)V", "alpha", "Lk3/b1;", "k", "n", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Lk3/q1;", "l", "Lk3/q1;", "()Lk3/q1;", "setColorFilter", "(Lk3/q1;)V", "colorFilter", "Lj3/g;", "m", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", Gender.OTHER, "scaleX", "R", "scaleY", "p", "A", "translationX", "q", "z", "translationY", "w", "v", "shadowElevation", "Lk3/p1;", "C", "L", "ambientShadowColor", "t", Gender.NONE, "spotShadowColor", "u", "Q", "rotationX", "H", "rotationY", "rotationZ", "cameraDistance", Gender.MALE, "(Z)V", "clip", "clipToBounds", "clipToOutline", "G", "isInvalidated", "D", "Lk3/b4;", "renderEffect", "Lk3/b4;", "()Lk3/b4;", "(Lk3/b4;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k1 canvasHolder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m3.a canvasDrawScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Matrix matrix;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private q1 colorFilter;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    public g(long j11, k1 k1Var, m3.a aVar) {
        this.ownerId = j11;
        this.canvasHolder = k1Var;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeA = q1.p.a("graphicsLayer");
        this.renderNode = renderNodeA;
        this.size = j3.m.INSTANCE.b();
        renderNodeA.setClipToBounds(false);
        b.Companion companion = b.INSTANCE;
        K(renderNodeA, companion.a());
        this.alpha = 1.0f;
        this.blendMode = b1.INSTANCE.B();
        this.pivotOffset = j3.g.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        p1.Companion companion2 = p1.INSTANCE;
        this.ambientShadowColor = companion2.a();
        this.spotShadowColor = companion2.a();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.a();
        this.isInvalidated = true;
    }

    private final void I() {
        boolean z11 = false;
        boolean z12 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z11 = true;
        }
        if (z12 != this.clipToBounds) {
            this.clipToBounds = z12;
            this.renderNode.setClipToBounds(z12);
        }
        if (z11 != this.clipToOutline) {
            this.clipToOutline = z11;
            this.renderNode.setClipToOutline(z11);
        }
    }

    private final void K(RenderNode renderNode, int i11) {
        b.Companion companion = b.INSTANCE;
        if (b.e(i11, companion.c())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.e(i11, companion.b())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean P() {
        if (b.e(getCompositingStrategy(), b.INSTANCE.c()) || S()) {
            return true;
        }
        p();
        return false;
    }

    private final boolean S() {
        return (b1.E(getBlendMode(), b1.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void T() {
        if (P()) {
            K(this.renderNode, b.INSTANCE.c());
        } else {
            K(this.renderNode, getCompositingStrategy());
        }
    }

    @Override // n3.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // n3.d
    public void B(int x11, int y11, long size) {
        this.renderNode.setPosition(x11, y11, w4.r.g(size) + x11, w4.r.f(size) + y11);
        this.size = w4.s.d(size);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // n3.d
    public void D(boolean z11) {
        this.isInvalidated = z11;
    }

    @Override // n3.d
    public void E(j1 canvas) {
        f0.d(canvas).drawRenderNode(this.renderNode);
    }

    @Override // n3.d
    public void F(long j11) {
        this.pivotOffset = j11;
        if (j3.h.d(j11)) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(j3.g.m(j11));
            this.renderNode.setPivotY(j3.g.n(j11));
        }
    }

    @Override // n3.d
    public void G(int i11) {
        this.compositingStrategy = i11;
        T();
    }

    @Override // n3.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // n3.d
    public void L(long j11) {
        this.ambientShadowColor = j11;
        this.renderNode.setAmbientShadowColor(r1.k(j11));
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // n3.d
    public void N(long j11) {
        this.spotShadowColor = j11;
        this.renderNode.setSpotShadowColor(r1.k(j11));
    }

    @Override // n3.d
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: Q, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: R, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // n3.d
    public void a(float f11) {
        this.alpha = f11;
        this.renderNode.setAlpha(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // n3.d
    public boolean c() {
        return this.renderNode.hasDisplayList();
    }

    @Override // n3.d
    public void d(float f11) {
        this.translationY = f11;
        this.renderNode.setTranslationY(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public q1 getColorFilter() {
        return this.colorFilter;
    }

    @Override // n3.d
    public void f(float f11) {
        this.cameraDistance = f11;
        this.renderNode.setCameraDistance(f11);
    }

    @Override // n3.d
    public void g(float f11) {
        this.rotationX = f11;
        this.renderNode.setRotationX(f11);
    }

    @Override // n3.d
    public void h(float f11) {
        this.rotationY = f11;
        this.renderNode.setRotationY(f11);
    }

    @Override // n3.d
    public void i(float f11) {
        this.rotationZ = f11;
        this.renderNode.setRotationZ(f11);
    }

    @Override // n3.d
    public void j(b4 b4Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            r.f92858a.a(this.renderNode, b4Var);
        }
    }

    @Override // n3.d
    public void k(float f11) {
        this.scaleX = f11;
        this.renderNode.setScaleX(f11);
    }

    @Override // n3.d
    public void l(float f11) {
        this.scaleY = f11;
        this.renderNode.setScaleY(f11);
    }

    @Override // n3.d
    public void m(float f11) {
        this.translationX = f11;
        this.renderNode.setTranslationX(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // n3.d
    public void o() {
        this.renderNode.discardDisplayList();
    }

    @Override // n3.d
    public b4 p() {
        return null;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // n3.d
    public Matrix r() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // n3.d
    public void s(Outline outline, long outlineSize) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        I();
    }

    @Override // n3.d
    /* JADX INFO: renamed from: t, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // n3.d
    public void u(boolean z11) {
        this.clip = z11;
        I();
    }

    @Override // n3.d
    public void v(float f11) {
        this.shadowElevation = f11;
        this.renderNode.setElevation(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // n3.d
    public void x(w4.d density, w4.t layoutDirection, c layer, wn0.l<? super m3.f, h0> block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            k1 k1Var = this.canvasHolder;
            Canvas internalCanvas = k1Var.getAndroidCanvas().getInternalCanvas();
            k1Var.getAndroidCanvas().z(recordingCanvasBeginRecording);
            e0 androidCanvas = k1Var.getAndroidCanvas();
            m3.d drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.d(density);
            drawContext.c(layoutDirection);
            drawContext.e(layer);
            drawContext.f(this.size);
            drawContext.h(androidCanvas);
            block.invoke(this.canvasDrawScope);
            k1Var.getAndroidCanvas().z(internalCanvas);
            this.renderNode.endRecording();
            D(false);
        } catch (Throwable th2) {
            this.renderNode.endRecording();
            throw th2;
        }
    }

    @Override // n3.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    public /* synthetic */ g(long j11, k1 k1Var, m3.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? new k1() : k1Var, (i11 & 4) != 0 ? new m3.a() : aVar);
    }
}
