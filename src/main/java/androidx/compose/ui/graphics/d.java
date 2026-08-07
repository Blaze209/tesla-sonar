package androidx.compose.ui.graphics;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import j3.m;
import k3.a4;
import k3.b4;
import k3.g4;
import k3.h3;
import k3.p1;
import k3.p3;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\b\u0010\u0015R*\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R*\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\u0013\"\u0004\b\u001b\u0010\u0015R*\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R0\u0010/\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020(8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00103\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020(8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R*\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010\n\u001a\u0004\b5\u0010\u0013\"\u0004\b$\u0010\u0015R*\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b7\u0010\u0013\"\u0004\b)\u0010\u0015R*\u00109\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\n\u001a\u0004\b*\u0010\u0013\"\u0004\b0\u0010\u0015R*\u0010;\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b:\u0010\u0013\"\u0004\b!\u0010\u0015R0\u0010?\u001a\u00020<2\u0006\u0010\u0010\u001a\u00020<8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R*\u0010G\u001a\u00020@2\u0006\u0010\u0010\u001a\u00020@8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010O\u001a\u00020H2\u0006\u0010\u0010\u001a\u00020H8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR0\u0010S\u001a\u00020P2\u0006\u0010\u0010\u001a\u00020P8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bK\u0010\t\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR(\u0010V\u001a\u00020T8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bR\u0010*\u001a\u0004\b\u0011\u0010,\"\u0004\bU\u0010.R\"\u0010^\u001a\u00020W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010e\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR.\u0010m\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010f8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0013R\u0014\u0010q\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0013R.\u0010s\u001a\u0004\u0018\u00010r2\b\u0010\u0010\u001a\u0004\u0018\u00010r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\b\t\u0010u\"\u0004\b4\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006w"}, d2 = {"Landroidx/compose/ui/graphics/d;", "Landroidx/compose/ui/graphics/c;", "<init>", "()V", "Ljn0/h0;", Gender.UNKNOWN, "b0", "", "a", "I", Gender.FEMALE, "()I", "setMutatedFields$ui_release", "(I)V", "mutatedFields", "", "value", "b", Gender.OTHER, "()F", "k", "(F)V", "scaleX", "c", "R", "l", "scaleY", DateTokenConverter.CONVERTER_KEY, "alpha", "e", "A", "m", "translationX", "f", "z", "translationY", "g", "K", "v", "shadowElevation", "Lk3/p1;", "h", "J", "n", "()J", "L", "(J)V", "ambientShadowColor", IntegerTokenConverter.CONVERTER_KEY, "P", Gender.NONE, "spotShadowColor", "j", "Q", "rotationX", "H", "rotationY", "rotationZ", "t", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "h1", "k0", "transformOrigin", "Lk3/g4;", "o", "Lk3/g4;", Gender.MALE, "()Lk3/g4;", "T", "(Lk3/g4;)V", "shape", "", "p", "Z", "q", "()Z", "u", "(Z)V", "clip", "Landroidx/compose/ui/graphics/a;", "y", "r", "compositingStrategy", "Lj3/m;", "a0", "size", "Lw4/d;", "s", "Lw4/d;", "B", "()Lw4/d;", "V", "(Lw4/d;)V", "graphicsDensity", "Lw4/t;", "Lw4/t;", "D", "()Lw4/t;", "X", "(Lw4/t;)V", "layoutDirection", "Lk3/p3;", "<set-?>", "Lk3/p3;", "G", "()Lk3/p3;", "setOutline$ui_release", "(Lk3/p3;)V", "outline", "getDensity", "density", "M1", "fontScale", "Lk3/b4;", "renderEffect", "Lk3/b4;", "()Lk3/b4;", "(Lk3/b4;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private p3 outline;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor = h3.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor = h3.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = f.INSTANCE.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private g4 shape = a4.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy = a.INSTANCE.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long size = m.INSTANCE.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private w4.d graphicsDensity = w4.f.b(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: A, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final w4.d getGraphicsDensity() {
        return this.graphicsDensity;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final p3 getOutline() {
        return this.outline;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: H, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    public b4 I() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.c
    public void L(long j11) {
        if (p1.r(this.ambientShadowColor, j11)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j11;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public g4 getShape() {
        return this.shape;
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.c
    public void N(long j11) {
        if (p1.r(this.spotShadowColor, j11)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j11;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: Q, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: R, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.c
    public void T(g4 g4Var) {
        if (s.f(this.shape, g4Var)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.certRevoked;
        this.shape = g4Var;
    }

    public final void U() {
        k(1.0f);
        l(1.0f);
        a(1.0f);
        m(BitmapDescriptorFactory.HUE_RED);
        d(BitmapDescriptorFactory.HUE_RED);
        v(BitmapDescriptorFactory.HUE_RED);
        L(h3.a());
        N(h3.a());
        g(BitmapDescriptorFactory.HUE_RED);
        h(BitmapDescriptorFactory.HUE_RED);
        i(BitmapDescriptorFactory.HUE_RED);
        f(8.0f);
        k0(f.INSTANCE.a());
        T(a4.a());
        u(false);
        j(null);
        r(a.INSTANCE.a());
        a0(m.INSTANCE.a());
        this.outline = null;
        this.mutatedFields = 0;
    }

    public final void V(w4.d dVar) {
        this.graphicsDensity = dVar;
    }

    public final void X(t tVar) {
        this.layoutDirection = tVar;
    }

    @Override // androidx.compose.ui.graphics.c
    public void a(float f11) {
        if (this.alpha == f11) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f11;
    }

    public void a0(long j11) {
        this.size = j11;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void b0() {
        this.outline = getShape().a(getSize(), this.layoutDirection, this.graphicsDensity);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.c
    public void d(float f11) {
        if (this.translationY == f11) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f11;
    }

    @Override // androidx.compose.ui.graphics.c
    public void f(float f11) {
        if (this.cameraDistance == f11) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f11;
    }

    @Override // androidx.compose.ui.graphics.c
    public void g(float f11) {
        if (this.rotationX == f11) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f11;
    }

    @Override // w4.d
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.graphics.c
    public void h(float f11) {
        if (this.rotationY == f11) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f11;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: h1, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.c
    public void i(float f11) {
        if (this.rotationZ == f11) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f11;
    }

    @Override // androidx.compose.ui.graphics.c
    public void j(b4 b4Var) {
        if (s.f(null, b4Var)) {
            return;
        }
        this.mutatedFields |= 131072;
    }

    @Override // androidx.compose.ui.graphics.c
    public void k(float f11) {
        if (this.scaleX == f11) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f11;
    }

    @Override // androidx.compose.ui.graphics.c
    public void k0(long j11) {
        if (f.e(this.transformOrigin, j11)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j11;
    }

    @Override // androidx.compose.ui.graphics.c
    public void l(float f11) {
        if (this.scaleY == f11) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f11;
    }

    @Override // androidx.compose.ui.graphics.c
    public void m(float f11) {
        if (this.translationX == f11) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f11;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.c
    public void r(int i11) {
        if (a.e(this.compositingStrategy, i11)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i11;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: t, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.c
    public void u(boolean z11) {
        if (this.clip != z11) {
            this.mutatedFields |= 16384;
            this.clip = z11;
        }
    }

    @Override // androidx.compose.ui.graphics.c
    public void v(float f11) {
        if (this.shadowElevation == f11) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f11;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.c
    /* JADX INFO: renamed from: z, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }
}
