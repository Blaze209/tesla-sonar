package androidx.compose.ui.graphics.painter;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import j3.g;
import j3.i;
import j3.j;
import j3.m;
import j3.n;
import jn0.h0;
import k3.j1;
import k3.q0;
import k3.q1;
import k3.r3;
import m3.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w4.t;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010#\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00100\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/painter/b;", "", "<init>", "()V", "Lk3/r3;", "obtainPaint", "()Lk3/r3;", "Lk3/q1;", "colorFilter", "Ljn0/h0;", "configureColorFilter", "(Lk3/q1;)V", "", "alpha", "configureAlpha", "(F)V", "Lw4/t;", "rtl", "configureLayoutDirection", "(Lw4/t;)V", "Lm3/f;", "onDraw", "(Lm3/f;)V", "", "applyAlpha", "(F)Z", "applyColorFilter", "(Lk3/q1;)Z", "layoutDirection", "applyLayoutDirection", "(Lw4/t;)Z", "Lj3/m;", "size", "draw-x_KDEd0", "(Lm3/f;JFLk3/q1;)V", "draw", "layerPaint", "Lk3/r3;", "useLayer", "Z", "Lk3/q1;", Gender.FEMALE, "Lw4/t;", "Lkotlin/Function1;", "drawLambda", "Lwn0/l;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b {
    private q1 colorFilter;
    private r3 layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private t layoutDirection = t.Ltr;
    private final l<f, h0> drawLambda = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<f, h0> {
        a() {
            super(1);
        }

        public final void a(f fVar) {
            b.this.onDraw(fVar);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    private final void configureAlpha(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!applyAlpha(alpha)) {
            if (alpha == 1.0f) {
                r3 r3Var = this.layerPaint;
                if (r3Var != null) {
                    r3Var.a(alpha);
                }
                this.useLayer = false;
            } else {
                obtainPaint().a(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void configureColorFilter(q1 colorFilter) {
        if (s.f(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                r3 r3Var = this.layerPaint;
                if (r3Var != null) {
                    r3Var.t(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().t(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void configureLayoutDirection(t rtl) {
        if (this.layoutDirection != rtl) {
            applyLayoutDirection(rtl);
            this.layoutDirection = rtl;
        }
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m2drawx_KDEd0$default(b bVar, f fVar, long j11, float f11, q1 q1Var, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i11 & 2) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i11 & 4) != 0) {
            q1Var = null;
        }
        bVar.m3drawx_KDEd0(fVar, j11, f12, q1Var);
    }

    private final r3 obtainPaint() {
        r3 r3Var = this.layerPaint;
        if (r3Var != null) {
            return r3Var;
        }
        r3 r3VarA = q0.a();
        this.layerPaint = r3VarA;
        return r3VarA;
    }

    protected boolean applyAlpha(float alpha) {
        return false;
    }

    protected boolean applyColorFilter(q1 colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(t layoutDirection) {
        return false;
    }

    /* JADX INFO: renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m3drawx_KDEd0(f fVar, long j11, float f11, q1 q1Var) {
        configureAlpha(f11);
        configureColorFilter(q1Var);
        configureLayoutDirection(fVar.getLayoutDirection());
        float fK = m.k(fVar.b()) - m.k(j11);
        float fI = m.i(fVar.b()) - m.i(j11);
        fVar.getDrawContext().getTransform().i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fK, fI);
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            try {
                if (m.k(j11) > BitmapDescriptorFactory.HUE_RED && m.i(j11) > BitmapDescriptorFactory.HUE_RED) {
                    if (this.useLayer) {
                        i iVarB = j.b(g.INSTANCE.c(), n.a(m.k(j11), m.i(j11)));
                        j1 j1VarA = fVar.getDrawContext().a();
                        try {
                            j1VarA.e(iVarB, obtainPaint());
                            onDraw(fVar);
                            j1VarA.o();
                        } catch (Throwable th2) {
                            j1VarA.o();
                            throw th2;
                        }
                    } else {
                        onDraw(fVar);
                    }
                }
            } catch (Throwable th3) {
                fVar.getDrawContext().getTransform().i(-0.0f, -0.0f, -fK, -fI);
                throw th3;
            }
        }
        fVar.getDrawContext().getTransform().i(-0.0f, -0.0f, -fK, -fI);
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo1getIntrinsicSizeNHjbRc();

    protected abstract void onDraw(f fVar);
}
