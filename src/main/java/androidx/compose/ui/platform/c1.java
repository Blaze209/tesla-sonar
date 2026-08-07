package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import k3.b4;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0011J5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u001c\u00107\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010:\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001c\u0010=\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001c\u0010@\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001c\u0010C\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001c\u0010F\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010*\"\u0004\bE\u0010\u0011R\u001c\u0010I\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010*\"\u0004\bH\u0010\u0011R\u001c\u0010L\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\u001c\u0010O\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001c\u0010R\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R\u001c\u0010U\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001c\u0010X\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\u001c\u0010[\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001c\u0010`\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010c\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\u001c\u0010f\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00104\"\u0004\be\u00106R\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010]R\"\u0010r\u001a\u00020o8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bp\u0010*\"\u0004\bq\u0010\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006sÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/c1;", "", "Landroid/graphics/Outline;", "outline", "Ljn0/h0;", "C", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "E", "(IIII)Z", "offset", "y", "(I)V", "t", "Lk3/k1;", "canvasHolder", "Lk3/t3;", "clipPath", "Lkotlin/Function1;", "Lk3/j1;", "drawBlock", "u", "(Lk3/k1;Lk3/t3;Lwn0/l;)V", "Landroid/graphics/Matrix;", "matrix", "x", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "p", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "w", "(Z)Z", "o", "()V", "n", "()I", "G", "e", "z", "getWidth", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "", "getScaleX", "()F", "k", "(F)V", "scaleX", "getScaleY", "l", "scaleY", "getTranslationX", "m", "translationX", "getTranslationY", DateTokenConverter.CONVERTER_KEY, "translationY", "J", "s", "elevation", "getAmbientShadowColor", "H", "ambientShadowColor", "getSpotShadowColor", "I", "spotShadowColor", "getRotationZ", IntegerTokenConverter.CONVERTER_KEY, "rotationZ", "getRotationX", "g", "rotationX", "getRotationY", "h", "rotationY", "getCameraDistance", "f", "cameraDistance", "getPivotX", "A", "pivotX", "getPivotY", "B", "pivotY", "v", "()Z", "D", "(Z)V", "clipToOutline", Gender.FEMALE, "q", "clipToBounds", "b", "a", "alpha", "Lk3/b4;", "getRenderEffect", "()Lk3/b4;", "j", "(Lk3/b4;)V", "renderEffect", "c", "hasDisplayList", "Landroidx/compose/ui/graphics/a;", "getCompositingStrategy--NrFUSI", "r", "compositingStrategy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c1 {
    void A(float f11);

    void B(float f11);

    void C(Outline outline);

    void D(boolean z11);

    boolean E(int left, int top, int right, int bottom);

    boolean F();

    int G();

    void H(int i11);

    void I(int i11);

    float J();

    void a(float f11);

    float b();

    boolean c();

    void d(float f11);

    int e();

    void f(float f11);

    void g(float f11);

    int getHeight();

    int getWidth();

    void h(float f11);

    void i(float f11);

    void j(b4 b4Var);

    void k(float f11);

    void l(float f11);

    void m(float f11);

    int n();

    void o();

    void p(Canvas canvas);

    void q(boolean z11);

    void r(int i11);

    void s(float f11);

    void t(int offset);

    void u(k3.k1 canvasHolder, k3.t3 clipPath, wn0.l<? super k3.j1, jn0.h0> drawBlock);

    boolean v();

    boolean w(boolean hasOverlappingRendering);

    void x(Matrix matrix);

    void y(int offset);

    int z();
}
