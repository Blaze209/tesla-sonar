package androidx.compose.ui.graphics;

import b4.b0;
import b4.b1;
import b4.k;
import b4.z0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import k3.b4;
import k3.g4;
import k3.p1;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010&\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\bF\u0010.\"\u0004\bG\u00100R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\b@\u0010.\"\u0004\bI\u00100R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010U\u001a\u0004\bV\u0010W\"\u0004\bC\u0010XR(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010F\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR(\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b[\u0010F\u001a\u0004\b\\\u0010L\"\u0004\b]\u0010NR(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\b:\u0010bR\"\u0010g\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u001d0c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"Landroidx/compose/ui/graphics/e;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lk3/g4;", "shape", "", "clip", "Lk3/b4;", "renderEffect", "Lk3/p1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLk3/g4;ZLk3/b4;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "G2", "()V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "", "toString", "()Ljava/lang/String;", "n", Gender.FEMALE, Gender.OTHER, "()F", "k", "(F)V", "o", "R", "l", "p", "y2", "a", "q", "A", "m", "r", "z", DateTokenConverter.CONVERTER_KEY, "s", "D2", "v", "t", "Q", "g", "u", "H", "h", "J", IntegerTokenConverter.CONVERTER_KEY, "w", "f", "x", "h1", "()J", "k0", "(J)V", "y", "Lk3/g4;", "E2", "()Lk3/g4;", "T", "(Lk3/g4;)V", "Z", "A2", "()Z", "(Z)V", "z2", "L", "B", "F2", Gender.NONE, "C", "I", "B2", "()I", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "D", "Lwn0/l;", "layerBlock", "Lk3/b4;", "C2", "()Lk3/b4;", "j", "(Lk3/b4;)V", "c2", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SimpleGraphicsLayerModifier extends androidx.compose.ui.d.c implements b0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private long spotShadowColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private int compositingStrategy;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private l<? super c, h0> layerBlock;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleX;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleY;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationY;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private float shadowElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationX;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationY;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationZ;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private float cameraDistance;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private long transformOrigin;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private g4 shape;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean clip;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.e$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<c, h0> {
        a() {
            super(1);
        }

        public final void a(c cVar) {
            cVar.k(SimpleGraphicsLayerModifier.this.getScaleX());
            cVar.l(SimpleGraphicsLayerModifier.this.getScaleY());
            cVar.a(SimpleGraphicsLayerModifier.this.getAlpha());
            cVar.m(SimpleGraphicsLayerModifier.this.getTranslationX());
            cVar.d(SimpleGraphicsLayerModifier.this.getTranslationY());
            cVar.v(SimpleGraphicsLayerModifier.this.getShadowElevation());
            cVar.g(SimpleGraphicsLayerModifier.this.getRotationX());
            cVar.h(SimpleGraphicsLayerModifier.this.getRotationY());
            cVar.i(SimpleGraphicsLayerModifier.this.getRotationZ());
            cVar.f(SimpleGraphicsLayerModifier.this.getCameraDistance());
            cVar.k0(SimpleGraphicsLayerModifier.this.getTransformOrigin());
            cVar.T(SimpleGraphicsLayerModifier.this.getShape());
            cVar.u(SimpleGraphicsLayerModifier.this.getClip());
            SimpleGraphicsLayerModifier.this.C2();
            cVar.j(null);
            cVar.L(SimpleGraphicsLayerModifier.this.getAmbientShadowColor());
            cVar.N(SimpleGraphicsLayerModifier.this.getSpotShadowColor());
            cVar.r(SimpleGraphicsLayerModifier.this.getCompositingStrategy());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.e$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f5462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SimpleGraphicsLayerModifier f5463d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w0 w0Var, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
            super(1);
            this.f5462c = w0Var;
            this.f5463d = simpleGraphicsLayerModifier;
        }

        public final void a(w0.a aVar) {
            w0.a.v(aVar, this.f5462c, 0, 0, BitmapDescriptorFactory.HUE_RED, this.f5463d.layerBlock, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, g4 g4Var, boolean z11, b4 b4Var, long j12, long j13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, g4Var, z11, b4Var, j12, j13, i11);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: A2, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: B2, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    public final b4 C2() {
        return null;
    }

    /* JADX INFO: renamed from: D2, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final g4 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: F2, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void G2() {
        z0 wrapped = k.h(this, b1.a(2)).getWrapped();
        if (wrapped != null) {
            wrapped.x3(this.layerBlock, true);
        }
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void L(long j11) {
        this.ambientShadowColor = j11;
    }

    public final void N(long j11) {
        this.spotShadowColor = j11;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public final void T(g4 g4Var) {
        this.shape = g4Var;
    }

    public final void a(float f11) {
        this.alpha = f11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(j11);
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new b(w0VarX0, this), 4, null);
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void d(float f11) {
        this.translationY = f11;
    }

    public final void f(float f11) {
        this.cameraDistance = f11;
    }

    public final void g(float f11) {
        this.rotationX = f11;
    }

    public final void h(float f11) {
        this.rotationY = f11;
    }

    /* JADX INFO: renamed from: h1, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final void i(float f11) {
        this.rotationZ = f11;
    }

    public final void k(float f11) {
        this.scaleX = f11;
    }

    public final void k0(long j11) {
        this.transformOrigin = j11;
    }

    public final void l(float f11) {
        this.scaleY = f11;
    }

    public final void m(float f11) {
        this.translationX = f11;
    }

    public final void r(int i11) {
        this.compositingStrategy = i11;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) f.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) p1.y(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) p1.y(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.a.g(this.compositingStrategy)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void u(boolean z11) {
        this.clip = z11;
    }

    public final void v(float f11) {
        this.shadowElevation = f11;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    private SimpleGraphicsLayerModifier(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, g4 g4Var, boolean z11, b4 b4Var, long j12, long j13, int i11) {
        this.scaleX = f11;
        this.scaleY = f12;
        this.alpha = f13;
        this.translationX = f14;
        this.translationY = f15;
        this.shadowElevation = f16;
        this.rotationX = f17;
        this.rotationY = f18;
        this.rotationZ = f19;
        this.cameraDistance = f21;
        this.transformOrigin = j11;
        this.shape = g4Var;
        this.clip = z11;
        this.ambientShadowColor = j12;
        this.spotShadowColor = j13;
        this.compositingStrategy = i11;
        this.layerBlock = new a();
    }

    public final void j(b4 b4Var) {
    }
}
