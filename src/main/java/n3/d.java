package n3;

import android.graphics.Matrix;
import android.graphics.Outline;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import k3.b4;
import k3.j1;
import k3.p1;
import k3.q1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u0000 02\u00020\u0001:\u00010J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019H&¢\u0006\u0004\b\u0003\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!R\"\u0010&\u001a\u00020\"8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0004\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020'8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u00102\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u0002038&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u001e\u0010<\u001a\u0004\u0018\u0001078&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010?\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\b=\u0010/\"\u0004\b>\u00101R\u001c\u0010B\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R\u001c\u0010E\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010/\"\u0004\bD\u00101R\u001c\u0010H\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010/\"\u0004\bG\u00101R\u001c\u0010K\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010/\"\u0004\bJ\u00101R\"\u0010O\u001a\u00020L8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bM\u0010)\"\u0004\bN\u0010+R\"\u0010R\u001a\u00020L8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R\u001c\u0010U\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u0010/\"\u0004\bT\u00101R\u001c\u0010X\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u0010/\"\u0004\bW\u00101R\u001c\u0010[\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u0010/\"\u0004\bZ\u00101R\u001c\u0010^\u001a\u00020-8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010/\"\u0004\b]\u00101R\u001c\u0010d\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010j\u001a\u0004\u0018\u00010e8&@&X¦\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010k\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\u0014\u0010n\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010aø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0001"}, d2 = {"Ln3/d;", "", "", "x", "y", "Lw4/r;", "size", "Ljn0/h0;", "B", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "s", "(Landroid/graphics/Outline;J)V", "Lk3/j1;", "canvas", "E", "(Lk3/j1;)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Ln3/c;", "layer", "Lkotlin/Function1;", "Lm3/f;", "block", "(Lw4/d;Lw4/t;Ln3/c;Lwn0/l;)V", "o", "()V", "Landroid/graphics/Matrix;", "r", "()Landroid/graphics/Matrix;", "Ln3/b;", "()I", "G", "(I)V", "compositingStrategy", "Lj3/g;", "getPivotOffset-F1C5BW0", "()J", Gender.FEMALE, "(J)V", "pivotOffset", "", "b", "()F", "a", "(F)V", "alpha", "Lk3/b1;", "n", "setBlendMode-s9anfk8", "blendMode", "Lk3/q1;", "e", "()Lk3/q1;", "setColorFilter", "(Lk3/q1;)V", "colorFilter", Gender.OTHER, "k", "scaleX", "R", "l", "scaleY", "A", "m", "translationX", "z", DateTokenConverter.CONVERTER_KEY, "translationY", "w", "v", "shadowElevation", "Lk3/p1;", "C", "L", "ambientShadowColor", "q", Gender.NONE, "spotShadowColor", "Q", "g", "rotationX", "H", "h", "rotationY", "J", IntegerTokenConverter.CONVERTER_KEY, "rotationZ", "t", "f", "cameraDistance", "", "getClip", "()Z", "u", "(Z)V", "clip", "Lk3/b4;", "p", "()Lk3/b4;", "j", "(Lk3/b4;)V", "renderEffect", "isInvalidated", "D", "c", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f92771a;

    /* JADX INFO: renamed from: n3.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ln3/d$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "b", "Lwn0/l;", "a", "()Lwn0/l;", "DefaultDrawBlock", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f92771a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final wn0.l<m3.f, h0> DefaultDrawBlock = C1982a.f92773c;

        /* JADX INFO: renamed from: n3.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
        static final class C1982a extends p013kotlin.jvm.internal.u implements wn0.l<m3.f, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1982a f92773c = new C1982a();

            C1982a() {
                super(1);
            }

            public final void a(m3.f fVar) {
                m3.f.C0(fVar, p1.INSTANCE.i(), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
                a(fVar);
                return h0.f84049a;
            }
        }

        private Companion() {
        }

        public final wn0.l<m3.f, h0> a() {
            return DefaultDrawBlock;
        }
    }

    /* JADX INFO: renamed from: A */
    float getTranslationX();

    void B(int x11, int y11, long size);

    /* JADX INFO: renamed from: C */
    long getAmbientShadowColor();

    void D(boolean z11);

    void E(j1 canvas);

    void F(long j11);

    void G(int i11);

    /* JADX INFO: renamed from: H */
    float getRotationY();

    /* JADX INFO: renamed from: J */
    float getRotationZ();

    void L(long j11);

    void N(long j11);

    /* JADX INFO: renamed from: O */
    float getScaleX();

    /* JADX INFO: renamed from: Q */
    float getRotationX();

    /* JADX INFO: renamed from: R */
    float getScaleY();

    void a(float f11);

    /* JADX INFO: renamed from: b */
    float getAlpha();

    default boolean c() {
        return true;
    }

    void d(float f11);

    /* JADX INFO: renamed from: e */
    q1 getColorFilter();

    void f(float f11);

    void g(float f11);

    void h(float f11);

    void i(float f11);

    void j(b4 b4Var);

    void k(float f11);

    void l(float f11);

    void m(float f11);

    /* JADX INFO: renamed from: n */
    int getBlendMode();

    void o();

    b4 p();

    /* JADX INFO: renamed from: q */
    long getSpotShadowColor();

    Matrix r();

    void s(Outline outline, long outlineSize);

    /* JADX INFO: renamed from: t */
    float getCameraDistance();

    void u(boolean z11);

    void v(float f11);

    /* JADX INFO: renamed from: w */
    float getShadowElevation();

    void x(w4.d density, w4.t layoutDirection, c layer, wn0.l<? super m3.f, h0> block);

    /* JADX INFO: renamed from: y */
    int getCompositingStrategy();

    /* JADX INFO: renamed from: z */
    float getTranslationY();
}
