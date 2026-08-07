package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import k3.b4;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b-\b\u0001\u0018\u0000 r2\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ5\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010:\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010>\"\u0004\bB\u0010\u001bR\"\u0010\u0014\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010:\u001a\u0004\b@\u0010>\"\u0004\bD\u0010\u001bR\"\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010:\u001a\u0004\bF\u0010>\"\u0004\bG\u0010\u001bR*\u0010O\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010>R\u0014\u0010S\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010>R$\u0010U\u001a\u0004\u0018\u00010T8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010`\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010c\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R$\u0010f\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010]\"\u0004\be\u0010_R$\u0010h\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010]\"\u0004\b<\u0010_R$\u0010k\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010]\"\u0004\bj\u0010_R$\u0010n\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010>\"\u0004\bm\u0010\u001bR$\u0010p\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010>\"\u0004\b:\u0010\u001bR$\u0010s\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010]\"\u0004\br\u0010_R$\u0010u\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010]\"\u0004\bE\u0010_R$\u0010w\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010]\"\u0004\bI\u0010_R$\u0010y\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010]\"\u0004\bC\u0010_R$\u0010|\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bz\u0010]\"\u0004\b{\u0010_R$\u0010\u007f\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b}\u0010]\"\u0004\b~\u0010_R'\u0010\u0082\u0001\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010L\"\u0005\b\u0081\u0001\u0010NR%\u0010\u0083\u0001\u001a\u00020[2\u0006\u0010H\u001a\u00020[8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010]\"\u0004\b2\u0010_R-\u0010\u0086\u0001\u001a\u0002082\u0006\u0010H\u001a\u0002088V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010>\"\u0005\b\u0085\u0001\u0010\u001bR\u0015\u0010\u0087\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/ui/platform/g2;", "Landroidx/compose/ui/platform/c1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Ljn0/h0;", "K", "()V", "Landroid/view/RenderNode;", "renderNode", "P", "(Landroid/view/RenderNode;)V", "Landroid/graphics/Outline;", "outline", "C", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "E", "(IIII)Z", "offset", "y", "(I)V", "t", "Lk3/k1;", "canvasHolder", "Lk3/t3;", "clipPath", "Lkotlin/Function1;", "Lk3/j1;", "drawBlock", "u", "(Lk3/k1;Lk3/t3;Lwn0/l;)V", "Landroid/graphics/Matrix;", "matrix", "x", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "p", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "w", "(Z)Z", "o", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/a;", "c", "I", "internalCompositingStrategy", DateTokenConverter.CONVERTER_KEY, "n", "()I", Gender.MALE, "e", "G", Gender.OTHER, "f", Gender.NONE, "g", "z", "L", "value", "h", "Z", Gender.FEMALE, "()Z", "q", "(Z)V", "clipToBounds", "getWidth", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "Lk3/b4;", "renderEffect", "Lk3/b4;", "getRenderEffect", "()Lk3/b4;", "j", "(Lk3/b4;)V", "", "getScaleX", "()F", "k", "(F)V", "scaleX", "getScaleY", "l", "scaleY", "getTranslationX", "m", "translationX", "getTranslationY", "translationY", "J", "s", "elevation", "getAmbientShadowColor", "H", "ambientShadowColor", "getSpotShadowColor", "spotShadowColor", "getRotationZ", IntegerTokenConverter.CONVERTER_KEY, "rotationZ", "getRotationX", "rotationX", "getRotationY", "rotationY", "getCameraDistance", "cameraDistance", "getPivotX", "A", "pivotX", "getPivotY", "B", "pivotY", "v", "D", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "r", "compositingStrategy", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g2 implements c1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f5735k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int left;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int top;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int right;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int bottom;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f5734j = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f5736l = true;

    public g2(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.renderNode = renderNodeCreate;
        this.internalCompositingStrategy = androidx.compose.ui.graphics.a.INSTANCE.a();
        if (f5736l) {
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
            P(renderNodeCreate);
            K();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f5736l = false;
        }
        if (f5735k) {
            throw new NoClassDefFoundError();
        }
    }

    private final void K() {
        k2.f5834a.a(this.renderNode);
    }

    private final void P(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            l2 l2Var = l2.f5857a;
            l2Var.c(renderNode, l2Var.a(renderNode));
            l2Var.d(renderNode, l2Var.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.c1
    public void A(float f11) {
        this.renderNode.setPivotX(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void B(float f11) {
        this.renderNode.setPivotY(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void C(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.c1
    public void D(boolean z11) {
        this.renderNode.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.platform.c1
    public boolean E(int left, int top, int right, int bottom) {
        M(left);
        O(top);
        N(right);
        L(bottom);
        return this.renderNode.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.c1
    /* JADX INFO: renamed from: F, reason: from getter */
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.c1
    /* JADX INFO: renamed from: G, reason: from getter */
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.c1
    public void H(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            l2.f5857a.c(this.renderNode, i11);
        }
    }

    @Override // androidx.compose.ui.platform.c1
    public void I(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            l2.f5857a.d(this.renderNode, i11);
        }
    }

    @Override // androidx.compose.ui.platform.c1
    public float J() {
        return this.renderNode.getElevation();
    }

    public void L(int i11) {
        this.bottom = i11;
    }

    public void M(int i11) {
        this.left = i11;
    }

    public void N(int i11) {
        this.right = i11;
    }

    public void O(int i11) {
        this.top = i11;
    }

    @Override // androidx.compose.ui.platform.c1
    public void a(float f11) {
        this.renderNode.setAlpha(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public float b() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.c1
    public boolean c() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.c1
    public void d(float f11) {
        this.renderNode.setTranslationY(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.c1
    public void f(float f11) {
        this.renderNode.setCameraDistance(-f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void g(float f11) {
        this.renderNode.setRotationX(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.c1
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.c1
    public void h(float f11) {
        this.renderNode.setRotationY(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void i(float f11) {
        this.renderNode.setRotation(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void k(float f11) {
        this.renderNode.setScaleX(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void l(float f11) {
        this.renderNode.setScaleY(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void m(float f11) {
        this.renderNode.setTranslationX(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.c1
    public void o() {
        K();
    }

    @Override // androidx.compose.ui.platform.c1
    public void p(Canvas canvas) {
        p013kotlin.jvm.internal.s.i(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.c1
    public void q(boolean z11) {
        this.clipToBounds = z11;
        this.renderNode.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void r(int i11) {
        androidx.compose.ui.graphics.a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
        if (androidx.compose.ui.graphics.a.e(i11, companion.c())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i11, companion.b())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i11;
    }

    @Override // androidx.compose.ui.platform.c1
    public void s(float f11) {
        this.renderNode.setElevation(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void t(int offset) {
        O(getTop() + offset);
        L(getBottom() + offset);
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.c1
    public void u(k3.k1 canvasHolder, k3.t3 clipPath, wn0.l<? super k3.j1, jn0.h0> drawBlock) {
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(getWidth(), getHeight());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().z((Canvas) displayListCanvasStart);
        k3.e0 androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.u();
            k3.j1.g(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.o();
        }
        canvasHolder.getAndroidCanvas().z(internalCanvas);
        this.renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.c1
    public boolean v() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.c1
    public boolean w(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.c1
    public void x(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.c1
    public void y(int offset) {
        M(getLeft() + offset);
        N(getRight() + offset);
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.c1
    /* JADX INFO: renamed from: z, reason: from getter */
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.c1
    public void j(b4 b4Var) {
    }
}
