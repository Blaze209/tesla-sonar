package n3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.concurrent.atomic.AtomicBoolean;
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
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 a2\u00020\u0001:\u0001cB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010%\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J;\u0010\u001c\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-H\u0016¢\u0006\u0004\b\u001c\u00100J\u0017\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0015J\u000f\u00109\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u0010;R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u0010;R0\u0010\r\u001a\u00020\f2\u0006\u0010P\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bQ\u0010\u0016\u001a\u0004\b\u001d\u0010R\"\u0004\bS\u0010\u0010R0\u0010X\u001a\u00020T2\u0006\u0010P\u001a\u00020T8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bU\u0010\u0016\u001a\u0004\bV\u0010R\"\u0004\bW\u0010\u0010R.\u0010_\u001a\u0004\u0018\u00010Y2\b\u0010P\u001a\u0004\u0018\u00010Y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\bB\u0010\\\"\u0004\b]\u0010^R*\u0010e\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010a\u001a\u0004\b:\u0010b\"\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010MR0\u0010k\u001a\u00020g2\u0006\u0010P\u001a\u00020g8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bh\u0010;\u001a\u0004\bi\u0010=\"\u0004\ba\u0010jR*\u0010n\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010a\u001a\u0004\bm\u0010b\"\u0004\bQ\u0010dR*\u0010p\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010a\u001a\u0004\bo\u0010b\"\u0004\bU\u0010dR*\u0010r\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010a\u001a\u0004\bq\u0010b\"\u0004\bZ\u0010dR*\u0010u\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010a\u001a\u0004\bt\u0010b\"\u0004\b@\u0010dR*\u0010y\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010a\u001a\u0004\bw\u0010b\"\u0004\bx\u0010dR0\u0010}\u001a\u00020z2\u0006\u0010P\u001a\u00020z8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u0010;\u001a\u0004\b{\u0010=\"\u0004\b|\u0010jR0\u0010\u007f\u001a\u00020z2\u0006\u0010P\u001a\u00020z8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bw\u0010;\u001a\u0004\bl\u0010=\"\u0004\b~\u0010jR,\u0010\u0081\u0001\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001c\u0010a\u001a\u0005\b\u0080\u0001\u0010b\"\u0004\bF\u0010dR,\u0010\u0083\u0001\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001d\u0010a\u001a\u0005\b\u0082\u0001\u0010b\"\u0004\bI\u0010dR+\u0010\u0084\u0001\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010a\u001a\u0004\b;\u0010b\"\u0004\bL\u0010dR+\u0010\u0085\u0001\u001a\u00020`2\u0006\u0010P\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010a\u001a\u0004\bs\u0010b\"\u0004\bD\u0010dR-\u0010\u0088\u0001\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b \u0010M\u001a\u0005\b\u0086\u0001\u0010\u0013\"\u0005\bv\u0010\u0087\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010MR\u0018\u0010\u008b\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010MR&\u0010\u008c\u0001\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\b3\u0010M\u001a\u0005\b\u008c\u0001\u0010\u0013\"\u0006\b\u008a\u0001\u0010\u0087\u0001R*\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\bh\u0010\u0090\u0001\"\u0005\bO\u0010\u0091\u0001R\u0015\u0010\u0092\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0001"}, d2 = {"Ln3/f;", "Ln3/d;", "Landroid/view/View;", "ownerView", "", "ownerId", "Lk3/k1;", "canvasHolder", "Lm3/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLk3/k1;Lm3/a;)V", "Ln3/b;", "compositingStrategy", "Ljn0/h0;", "K", "(I)V", "", "S", "()Z", "T", "()V", "I", "Landroid/view/RenderNode;", "renderNode", Gender.UNKNOWN, "(Landroid/view/RenderNode;)V", "", "x", "y", "Lw4/r;", "size", "B", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "s", "(Landroid/graphics/Outline;J)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Ln3/c;", "layer", "Lkotlin/Function1;", "Lm3/f;", "block", "(Lw4/d;Lw4/t;Ln3/c;Lwn0/l;)V", "Lk3/j1;", "canvas", "E", "(Lk3/j1;)V", "Landroid/graphics/Matrix;", "r", "()Landroid/graphics/Matrix;", "o", Gender.MALE, "b", "J", "getOwnerId", "()J", "c", "Lk3/k1;", DateTokenConverter.CONVERTER_KEY, "Lm3/a;", "e", "Landroid/view/RenderNode;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", IntegerTokenConverter.CONVERTER_KEY, "Z", "outlineIsProvided", "j", "value", "k", "()I", "G", "Lk3/b1;", "l", "n", "setBlendMode-s9anfk8", "blendMode", "Lk3/q1;", "m", "Lk3/q1;", "()Lk3/q1;", "setColorFilter", "(Lk3/q1;)V", "colorFilter", "", Gender.FEMALE, "()F", "a", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Lj3/g;", "p", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "q", Gender.OTHER, "scaleX", "R", "scaleY", "A", "translationX", "t", "z", "translationY", "u", "w", "v", "shadowElevation", "Lk3/p1;", "C", "L", "ambientShadowColor", Gender.NONE, "spotShadowColor", "Q", "rotationX", "H", "rotationY", "rotationZ", "cameraDistance", "P", "(Z)V", "clip", "clipToBounds", "D", "clipToOutline", "isInvalidated", "Lk3/b4;", "renderEffect", "Lk3/b4;", "()Lk3/b4;", "(Lk3/b4;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements d {
    private static boolean G;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
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
    private long outlineSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private q1 colorFilter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;
    private static final AtomicBoolean H = new AtomicBoolean(true);

    public f(View view, long j11, k1 k1Var, m3.a aVar) {
        this.ownerId = j11;
        this.canvasHolder = k1Var;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        w4.r.Companion companion = w4.r.INSTANCE;
        this.size = companion.a();
        this.outlineSize = companion.a();
        if (H.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            U(renderNodeCreate);
            M();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (G) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        b.Companion companion2 = b.INSTANCE;
        K(companion2.a());
        this.compositingStrategy = companion2.a();
        this.blendMode = b1.INSTANCE.B();
        this.alpha = 1.0f;
        this.pivotOffset = j3.g.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        p1.Companion companion3 = p1.INSTANCE;
        this.ambientShadowColor = companion3.a();
        this.spotShadowColor = companion3.a();
        this.cameraDistance = 8.0f;
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

    private final void K(int compositingStrategy) {
        RenderNode renderNode = this.renderNode;
        b.Companion companion = b.INSTANCE;
        if (b.e(compositingStrategy, companion.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.e(compositingStrategy, companion.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean S() {
        return (!b.e(getCompositingStrategy(), b.INSTANCE.c()) && b1.E(getBlendMode(), b1.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void T() {
        if (S()) {
            K(b.INSTANCE.c());
        } else {
            K(getCompositingStrategy());
        }
    }

    private final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            q qVar = q.f92857a;
            qVar.c(renderNode, qVar.a(renderNode));
            qVar.d(renderNode, qVar.b(renderNode));
        }
    }

    @Override // n3.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // n3.d
    public void B(int x11, int y11, long size) {
        this.renderNode.setLeftTopRightBottom(x11, y11, w4.r.g(size) + x11, w4.r.f(size) + y11);
        if (w4.r.e(this.size, size)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(w4.r.g(size) / 2.0f);
            this.renderNode.setPivotY(w4.r.f(size) / 2.0f);
        }
        this.size = size;
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
        DisplayListCanvas displayListCanvasD = f0.d(canvas);
        p013kotlin.jvm.internal.s.i(displayListCanvasD, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasD.drawRenderNode(this.renderNode);
    }

    @Override // n3.d
    public void F(long j11) {
        this.pivotOffset = j11;
        if (j3.h.d(j11)) {
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(w4.r.g(this.size) / 2.0f);
            this.renderNode.setPivotY(w4.r.f(this.size) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j11;
            q.f92857a.c(this.renderNode, r1.k(j11));
        }
    }

    public final void M() {
        p.f92856a.a(this.renderNode);
    }

    @Override // n3.d
    public void N(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j11;
            q.f92857a.d(this.renderNode, r1.k(j11));
        }
    }

    @Override // n3.d
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public boolean getClip() {
        return this.clip;
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
        return this.renderNode.isValid();
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
        this.renderNode.setCameraDistance(-f11);
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
        this.renderNode.setRotation(f11);
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
        M();
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
        this.outlineSize = outlineSize;
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
        Canvas canvasStart = this.renderNode.start(Math.max(w4.r.g(this.size), w4.r.g(this.outlineSize)), Math.max(w4.r.f(this.size), w4.r.f(this.outlineSize)));
        try {
            k1 k1Var = this.canvasHolder;
            Canvas internalCanvas = k1Var.getAndroidCanvas().getInternalCanvas();
            k1Var.getAndroidCanvas().z(canvasStart);
            e0 androidCanvas = k1Var.getAndroidCanvas();
            m3.a aVar = this.canvasDrawScope;
            long jD = w4.s.d(this.size);
            w4.d density2 = aVar.getDrawContext().getDensity();
            w4.t layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
            j1 j1VarA = aVar.getDrawContext().a();
            long jB = aVar.getDrawContext().b();
            c graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
            m3.d drawContext = aVar.getDrawContext();
            drawContext.d(density);
            drawContext.c(layoutDirection);
            drawContext.h(androidCanvas);
            drawContext.f(jD);
            drawContext.e(layer);
            androidCanvas.u();
            try {
                block.invoke(aVar);
                androidCanvas.o();
                m3.d drawContext2 = aVar.getDrawContext();
                drawContext2.d(density2);
                drawContext2.c(layoutDirection2);
                drawContext2.h(j1VarA);
                drawContext2.f(jB);
                drawContext2.e(graphicsLayer);
                k1Var.getAndroidCanvas().z(internalCanvas);
                this.renderNode.end(canvasStart);
                D(false);
            } catch (Throwable th2) {
                androidCanvas.o();
                m3.d drawContext3 = aVar.getDrawContext();
                drawContext3.d(density2);
                drawContext3.c(layoutDirection2);
                drawContext3.h(j1VarA);
                drawContext3.f(jB);
                drawContext3.e(graphicsLayer);
                throw th2;
            }
        } catch (Throwable th3) {
            this.renderNode.end(canvasStart);
            throw th3;
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

    @Override // n3.d
    public void j(b4 b4Var) {
    }

    public /* synthetic */ f(View view, long j11, k1 k1Var, m3.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j11, (i11 & 4) != 0 ? new k1() : k1Var, (i11 & 8) != 0 ? new m3.a() : aVar);
    }
}
