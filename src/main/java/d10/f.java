package d10;

import android.os.CancellationSignal;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.e1;
import androidx.core.view.f1;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import jn0.m;
import p004c7.Function1;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001/\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0003J\u0019\u0010!\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Ld10/f;", "", "<init>", "()V", "Landroidx/core/view/f1;", "controller", "Ljn0/h0;", "v", "(Landroidx/core/view/f1;)V", "w", "", "visible", "", "velocityY", "g", "(ZLjava/lang/Float;)V", "Landroid/view/View;", "view", "Lkotlin/Function1;", "onRequestReady", "x", "(Landroid/view/View;Lwn0/l;)V", "", "dy", "r", "(I)I", "inset", "s", "t", "()Z", "u", "n", "o", "l", "(Ljava/lang/Float;)V", "q", "()I", "a", "Landroidx/core/view/f1;", "insetsAnimationController", "Landroid/os/CancellationSignal;", "b", "Landroid/os/CancellationSignal;", "pendingRequestCancellationSignal", "c", "Lwn0/l;", "pendingRequestOnReady", "d10/f$a", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "p", "()Ld10/f$a;", "animationControlListener", "e", "Z", "isImeShownAtStart", "Lc7/f;", "f", "Lc7/f;", "currentSpringAnimation", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private f1 insetsAnimationController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private CancellationSignal pendingRequestCancellationSignal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private l<? super f1, h0> pendingRequestOnReady;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy animationControlListener = m.b(new wn0.a() { // from class: d10.e
        @Override // wn0.a
        public final Object invoke() {
            return f.m(this.f59241a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isImeShownAtStart;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p004c7.f currentSpringAnimation;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"d10/f$a", "Landroidx/core/view/e1;", "Landroidx/core/view/f1;", "controller", "", "types", "Ljn0/h0;", "b", "(Landroidx/core/view/f1;I)V", "c", "(Landroidx/core/view/f1;)V", "a", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e1 {
        a() {
        }

        @Override // androidx.core.view.e1
        public void a(f1 controller) {
            f.this.w();
        }

        @Override // androidx.core.view.e1
        public void b(f1 controller, int types) {
            s.k(controller, "controller");
            f.this.v(controller);
        }

        @Override // androidx.core.view.e1
        public void c(f1 controller) {
            s.k(controller, "controller");
            f.this.w();
        }
    }

    private final void g(boolean visible, Float velocityY) {
        final f1 f1Var = this.insetsAnimationController;
        if (f1Var == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        p004c7.f fVarB = Function1.b(new l() { // from class: d10.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return f.i(this.f59238a, ((Float) obj).floatValue());
            }
        }, new wn0.a() { // from class: d10.c
            @Override // wn0.a
            public final Object invoke() {
                return Float.valueOf(f.j(f1Var));
            }
        }, visible ? f1Var.e().f84927d : f1Var.d().f84927d);
        if (fVarB.v() == null) {
            fVarB.y(new p004c7.g());
        }
        p004c7.g spring = fVarB.v();
        s.g(spring, "spring");
        spring.d(1.0f);
        spring.f(1500.0f);
        if (velocityY != null) {
            fVarB.o(velocityY.floatValue());
        }
        fVarB.b(new c7.b.q() { // from class: d10.d
            @Override // c7.b.q
            public final void a(p004c7.b bVar, boolean z11, float f11, float f12) {
                f.k(this.f59240a, bVar, z11, f11, f12);
            }
        });
        fVarB.q();
        this.currentSpringAnimation = fVarB;
    }

    static /* synthetic */ void h(f fVar, boolean z11, Float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = null;
        }
        fVar.g(z11, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(f fVar, float f11) {
        fVar.s(yn0.a.d(f11));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(f1 f1Var) {
        return f1Var.c().f84927d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f fVar, p004c7.b bVar, boolean z11, float f11, float f12) {
        if (s.f(bVar, fVar.currentSpringAnimation)) {
            fVar.currentSpringAnimation = null;
        }
        fVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a m(f fVar) {
        return fVar.new a();
    }

    private final a p() {
        return (a) this.animationControlListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(f1 controller) {
        this.pendingRequestCancellationSignal = null;
        this.insetsAnimationController = controller;
        l<? super f1, h0> lVar = this.pendingRequestOnReady;
        if (lVar != null) {
            lVar.invoke(controller);
        }
        this.pendingRequestOnReady = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        this.insetsAnimationController = null;
        this.pendingRequestCancellationSignal = null;
        this.isImeShownAtStart = false;
        p004c7.f fVar = this.currentSpringAnimation;
        if (fVar != null) {
            fVar.d();
        }
        this.currentSpringAnimation = null;
        this.pendingRequestOnReady = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void y(f fVar, View view, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        fVar.x(view, lVar);
    }

    public final void l(Float velocityY) {
        f1 f1Var = this.insetsAnimationController;
        if (f1Var == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        d10.a.f59236a.b(false);
        int i11 = f1Var.c().f84927d;
        int i12 = f1Var.e().f84927d;
        int i13 = f1Var.d().f84927d;
        if (velocityY != null) {
            g(velocityY.floatValue() < BitmapDescriptorFactory.HUE_RED, velocityY);
            return;
        }
        if (i11 == i12) {
            f1Var.a(true);
            return;
        }
        if (i11 == i13) {
            f1Var.a(false);
        } else if (f1Var.b() >= 0.15f) {
            h(this, !this.isImeShownAtStart, null, 2, null);
        } else {
            h(this, this.isImeShownAtStart, null, 2, null);
        }
    }

    public final void n() {
        f1 f1Var = this.insetsAnimationController;
        if (f1Var != null) {
            f1Var.a(this.isImeShownAtStart);
        }
        CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        p004c7.f fVar = this.currentSpringAnimation;
        if (fVar != null) {
            fVar.d();
        }
        w();
    }

    public final void o() {
        f1 f1Var = this.insetsAnimationController;
        if (f1Var == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int i11 = f1Var.c().f84927d;
        int i12 = f1Var.e().f84927d;
        int i13 = f1Var.d().f84927d;
        if (i11 == i12) {
            f1Var.a(true);
            return;
        }
        if (i11 == i13) {
            f1Var.a(false);
        } else if (f1Var.b() >= 0.15f) {
            f1Var.a(!this.isImeShownAtStart);
        } else {
            f1Var.a(this.isImeShownAtStart);
        }
    }

    public final int q() {
        f1 f1Var = this.insetsAnimationController;
        if (f1Var != null) {
            return f1Var.c().f84927d;
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public final int r(int dy2) {
        f1 f1Var = this.insetsAnimationController;
        if (f1Var == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        d10.a.f59236a.b(true);
        return s(f1Var.c().f84927d - dy2);
    }

    public final int s(int inset) {
        f1 f1Var = this.insetsAnimationController;
        if (f1Var == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        int i11 = f1Var.d().f84927d;
        int i12 = f1Var.e().f84927d;
        boolean z11 = this.isImeShownAtStart;
        int i13 = z11 ? i12 : i11;
        int i14 = z11 ? i11 : i12;
        int iN = n.n(inset, i11, i12);
        int i15 = f1Var.c().f84927d - iN;
        f1Var.f(k5.e.c(0, 0, 0, iN), 1.0f, (iN - i13) / (i14 - i13));
        return i15;
    }

    public final boolean t() {
        return this.insetsAnimationController != null;
    }

    public final boolean u() {
        return this.pendingRequestCancellationSignal != null;
    }

    public final void x(View view, l<? super f1, h0> onRequestReady) {
        s.k(view, "view");
        if (t()) {
            throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
        }
        WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(view);
        boolean z11 = false;
        if (windowInsetsCompatH != null && windowInsetsCompatH.q(WindowInsetsCompat.n.c())) {
            z11 = true;
        }
        this.isImeShownAtStart = z11;
        this.pendingRequestCancellationSignal = new CancellationSignal();
        this.pendingRequestOnReady = onRequestReady;
        d10.a.f59236a.b(true);
        WindowInsetsControllerCompat windowInsetsControllerCompatL = ViewCompat.L(view);
        if (windowInsetsControllerCompatL != null) {
            windowInsetsControllerCompatL.a(WindowInsetsCompat.n.c(), -1L, g.f59249a, this.pendingRequestCancellationSignal, p());
        }
    }
}
