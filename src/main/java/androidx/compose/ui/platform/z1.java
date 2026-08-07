package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0019\u001a\u00020\u0018*\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R$\u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b/\u00107R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u0010:\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u001c\u0010@\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010?R\u001c\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010?R\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0013\u0010I\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010HR\u0011\u0010J\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u00107R\u0013\u0010L\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/platform/z1;", "", "<init>", "()V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "Lj3/i;", "rect", "k", "(Lj3/i;)V", "Lj3/k;", "roundRect", "l", "(Lj3/k;)V", "Lk3/t3;", "composePath", "j", "(Lk3/t3;)V", "Lj3/g;", "offset", "Lj3/m;", "size", "", "radius", "", "g", "(Lj3/k;JJF)Z", "Lk3/p3;", "outline", "alpha", "clipToOutline", "elevation", "h", "(Lk3/p3;FZFJ)Z", "position", "f", "(J)Z", "Lk3/j1;", "canvas", "a", "(Lk3/j1;)V", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "b", "Landroid/graphics/Outline;", "cachedOutline", "c", "Lk3/p3;", DateTokenConverter.CONVERTER_KEY, "Lk3/t3;", "cachedRrectPath", "e", "outlinePath", "<set-?>", "()Z", "cacheIsDirty", "usePathForClip", "tmpPath", "Lj3/k;", "tmpRoundRect", Gender.FEMALE, "roundedCornerRadius", "J", "rectTopLeft", "rectSize", "m", "outlineNeeded", "n", "tmpTouchPointPath", "o", "tmpOpPath", "()Landroid/graphics/Outline;", "androidOutline", "outlineClipSupported", "()Lk3/t3;", "clipPath", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isSupportedOutline = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Outline cachedOutline;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private k3.p3 outline;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k3.t3 cachedRrectPath;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k3.t3 outlinePath;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean cacheIsDirty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private k3.t3 tmpPath;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private j3.k tmpRoundRect;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float roundedCornerRadius;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long rectTopLeft;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rectSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean outlineNeeded;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private k3.t3 tmpTouchPointPath;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private k3.t3 tmpOpPath;

    public z1() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = j3.g.INSTANCE.c();
        this.rectSize = j3.m.INSTANCE.b();
    }

    private final boolean g(j3.k kVar, long j11, long j12, float f11) {
        return kVar != null && j3.l.e(kVar) && kVar.getLeft() == j3.g.m(j11) && kVar.getTop() == j3.g.n(j11) && kVar.getRight() == j3.g.m(j11) + j3.m.k(j12) && kVar.getBottom() == j3.g.n(j11) + j3.m.i(j12) && j3.a.d(kVar.getTopLeftCornerRadius()) == f11;
    }

    private final void i() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = j3.g.INSTANCE.c();
            this.roundedCornerRadius = BitmapDescriptorFactory.HUE_RED;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            k3.p3 p3Var = this.outline;
            if (p3Var == null || !this.outlineNeeded || j3.m.k(this.rectSize) <= BitmapDescriptorFactory.HUE_RED || j3.m.i(this.rectSize) <= BitmapDescriptorFactory.HUE_RED) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (p3Var instanceof k3.p3.b) {
                k(((k3.p3.b) p3Var).b());
            } else if (p3Var instanceof k3.p3.c) {
                l(((k3.p3.c) p3Var).getRoundRect());
            } else if (p3Var instanceof k3.p3.a) {
                j(((k3.p3.a) p3Var).getPath());
            }
        }
    }

    private final void j(k3.t3 composePath) {
        if (Build.VERSION.SDK_INT > 28 || composePath.n()) {
            Outline outline = this.cachedOutline;
            if (!(composePath instanceof k3.r0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((k3.r0) composePath).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    private final void k(j3.i rect) {
        this.rectTopLeft = j3.h.a(rect.getLeft(), rect.getTop());
        this.rectSize = j3.n.a(rect.o(), rect.h());
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void l(j3.k roundRect) {
        float fD = j3.a.d(roundRect.getTopLeftCornerRadius());
        this.rectTopLeft = j3.h.a(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = j3.n.a(roundRect.j(), roundRect.d());
        if (j3.l.e(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), fD);
            this.roundedCornerRadius = fD;
            return;
        }
        k3.t3 t3VarA = this.cachedRrectPath;
        if (t3VarA == null) {
            t3VarA = k3.w0.a();
            this.cachedRrectPath = t3VarA;
        }
        t3VarA.reset();
        k3.t3.d(t3VarA, roundRect, null, 2, null);
        j(t3VarA);
    }

    public final void a(k3.j1 canvas) {
        k3.t3 t3VarD = d();
        if (t3VarD != null) {
            k3.j1.g(canvas, t3VarD, 0, 2, null);
            return;
        }
        float f11 = this.roundedCornerRadius;
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            k3.j1.l(canvas, j3.g.m(this.rectTopLeft), j3.g.n(this.rectTopLeft), j3.m.k(this.rectSize) + j3.g.m(this.rectTopLeft), j3.m.i(this.rectSize) + j3.g.n(this.rectTopLeft), 0, 16, null);
            return;
        }
        k3.t3 t3VarA = this.tmpPath;
        j3.k kVar = this.tmpRoundRect;
        if (t3VarA == null || !g(kVar, this.rectTopLeft, this.rectSize, f11)) {
            j3.k kVarC = j3.l.c(j3.g.m(this.rectTopLeft), j3.g.n(this.rectTopLeft), j3.g.m(this.rectTopLeft) + j3.m.k(this.rectSize), j3.g.n(this.rectTopLeft) + j3.m.i(this.rectSize), j3.b.b(this.roundedCornerRadius, BitmapDescriptorFactory.HUE_RED, 2, null));
            if (t3VarA == null) {
                t3VarA = k3.w0.a();
            } else {
                t3VarA.reset();
            }
            k3.t3.d(t3VarA, kVarC, null, 2, null);
            this.tmpRoundRect = kVarC;
            this.tmpPath = t3VarA;
        }
        k3.j1.g(canvas, t3VarA, 0, 2, null);
    }

    public final Outline b() {
        i();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    public final k3.t3 d() {
        i();
        return this.outlinePath;
    }

    public final boolean e() {
        return !this.usePathForClip;
    }

    public final boolean f(long position) {
        k3.p3 p3Var;
        if (this.outlineNeeded && (p3Var = this.outline) != null) {
            return q2.b(p3Var, j3.g.m(position), j3.g.n(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean h(k3.p3 outline, float alpha, boolean clipToOutline, float elevation, long size) {
        this.cachedOutline.setAlpha(alpha);
        boolean zF = p013kotlin.jvm.internal.s.f(this.outline, outline);
        boolean z11 = !zF;
        if (!zF) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = size;
        boolean z12 = outline != null && (clipToOutline || elevation > BitmapDescriptorFactory.HUE_RED);
        if (this.outlineNeeded != z12) {
            this.outlineNeeded = z12;
            this.cacheIsDirty = true;
        }
        return z11;
    }
}
