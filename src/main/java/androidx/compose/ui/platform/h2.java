package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import k3.b4;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010:R\u0014\u0010?\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0014\u0010A\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R$\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010K\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR$\u0010N\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010E\"\u0004\bM\u0010GR$\u0010Q\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR$\u0010T\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u0010E\"\u0004\bS\u0010GR$\u0010W\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010:\"\u0004\bV\u0010\u0015R$\u0010Y\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010:\"\u0004\b7\u0010\u0015R$\u0010\\\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010E\"\u0004\b[\u0010GR$\u0010_\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010E\"\u0004\b^\u0010GR$\u0010b\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010E\"\u0004\ba\u0010GR$\u0010e\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010E\"\u0004\bd\u0010GR$\u0010h\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010E\"\u0004\bg\u0010GR$\u0010k\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010E\"\u0004\bj\u0010GR$\u0010p\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010s\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010m\"\u0004\br\u0010oR$\u0010t\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010E\"\u0004\b-\u0010GR(\u0010z\u001a\u0004\u0018\u00010u2\b\u0010C\u001a\u0004\u0018\u00010u8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR*\u0010}\u001a\u0002052\u0006\u0010C\u001a\u0002058V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b{\u0010:\"\u0004\b|\u0010\u0015R\u0014\u0010~\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010m\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/platform/h2;", "Landroidx/compose/ui/platform/c1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroid/graphics/Outline;", "outline", "Ljn0/h0;", "C", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "E", "(IIII)Z", "offset", "y", "(I)V", "t", "Lk3/k1;", "canvasHolder", "Lk3/t3;", "clipPath", "Lkotlin/Function1;", "Lk3/j1;", "drawBlock", "u", "(Lk3/k1;Lk3/t3;Lwn0/l;)V", "Landroid/graphics/Matrix;", "matrix", "x", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "p", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "w", "(Z)Z", "o", "()V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "b", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/a;", "c", "I", "internalCompositingStrategy", "n", "()I", "G", "e", "z", "getWidth", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "", "value", "getScaleX", "()F", "k", "(F)V", "scaleX", "getScaleY", "l", "scaleY", "getTranslationX", "m", "translationX", "getTranslationY", DateTokenConverter.CONVERTER_KEY, "translationY", "J", "s", "elevation", "getAmbientShadowColor", "H", "ambientShadowColor", "getSpotShadowColor", "spotShadowColor", "getRotationZ", IntegerTokenConverter.CONVERTER_KEY, "rotationZ", "getRotationX", "g", "rotationX", "getRotationY", "h", "rotationY", "getCameraDistance", "f", "cameraDistance", "getPivotX", "A", "pivotX", "getPivotY", "B", "pivotY", "v", "()Z", "D", "(Z)V", "clipToOutline", Gender.FEMALE, "q", "clipToBounds", "alpha", "Lk3/b4;", "getRenderEffect", "()Lk3/b4;", "j", "(Lk3/b4;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "r", "compositingStrategy", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h2 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode = q1.p.a("Compose");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy = androidx.compose.ui.graphics.a.INSTANCE.a();

    public h2(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
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
        return this.renderNode.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.c1
    public boolean F() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.c1
    public int G() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.c1
    public void H(int i11) {
        this.renderNode.setAmbientShadowColor(i11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void I(int i11) {
        this.renderNode.setSpotShadowColor(i11);
    }

    @Override // androidx.compose.ui.platform.c1
    public float J() {
        return this.renderNode.getElevation();
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
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.c1
    public void d(float f11) {
        this.renderNode.setTranslationY(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public int e() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.c1
    public void f(float f11) {
        this.renderNode.setCameraDistance(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void g(float f11) {
        this.renderNode.setRotationX(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.ui.platform.c1
    public int getWidth() {
        return this.renderNode.getWidth();
    }

    @Override // androidx.compose.ui.platform.c1
    public void h(float f11) {
        this.renderNode.setRotationY(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void i(float f11) {
        this.renderNode.setRotationZ(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void j(b4 b4Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            i2.f5766a.a(this.renderNode, b4Var);
        }
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
    public int n() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.ui.platform.c1
    public void o() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.c1
    public void p(Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.c1
    public void q(boolean z11) {
        this.renderNode.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void r(int i11) {
        RenderNode renderNode = this.renderNode;
        androidx.compose.ui.graphics.a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
        if (androidx.compose.ui.graphics.a.e(i11, companion.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i11, companion.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i11;
    }

    @Override // androidx.compose.ui.platform.c1
    public void s(float f11) {
        this.renderNode.setElevation(f11);
    }

    @Override // androidx.compose.ui.platform.c1
    public void t(int offset) {
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.c1
    public void u(k3.k1 canvasHolder, k3.t3 clipPath, wn0.l<? super k3.j1, jn0.h0> drawBlock) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().z(recordingCanvasBeginRecording);
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
        this.renderNode.endRecording();
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
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.c1
    public int z() {
        return this.renderNode.getBottom();
    }
}
