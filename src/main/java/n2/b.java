package n2;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Ln2/b;", "Ln2/c;", "", "bounded", "Lw4/h;", "radius", "Lr2/y3;", "Lk3/p1;", "color", "<init>", "(ZFLr2/y3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lu1/j;", "interactionSource", "Ln2/d;", "rippleAlpha", "Landroidx/compose/material/ripple/d;", "c", "(Lu1/j;ZFLr2/y3;Lr2/y3;Lr2/l;I)Landroidx/compose/material/ripple/d;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends c {
    public /* synthetic */ b(boolean z11, float f11, y3 y3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, y3Var);
    }

    @Override // n2.c
    public androidx.compose.material.ripple.d c(u1.j jVar, boolean z11, float f11, y3<p1> y3Var, y3<RippleAlpha> y3Var2, p020r2.l lVar, int i11) {
        lVar.o(331259447);
        if (p020r2.o.J()) {
            p020r2.o.S(331259447, i11, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        ViewGroup viewGroupE = o.e((View) lVar.U(AndroidCompositionLocals_androidKt.k()));
        boolean zN = ((((i11 & 14) ^ 6) > 4 && lVar.n(jVar)) || (i11 & 6) == 4) | ((((458752 & i11) ^ 196608) > 131072 && lVar.n(this)) || (i11 & 196608) == 131072) | lVar.n(viewGroupE);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            Object aVar = new androidx.compose.material.ripple.a(z11, f11, y3Var, y3Var2, viewGroupE, null);
            lVar.B(aVar);
            objI = aVar;
        }
        androidx.compose.material.ripple.a aVar2 = (androidx.compose.material.ripple.a) objI;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return aVar2;
    }

    private b(boolean z11, float f11, y3<p1> y3Var) {
        super(z11, f11, y3Var, null);
    }
}
