package q1;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¢\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Lw4/d;", "Lj3/g;", "sourceCenter", "magnifierCenter", "Lw4/k;", "Ljn0/h0;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lw4/h;", "cornerRadius", "elevation", "clippingEnabled", "Lq1/q0;", "platformMagnifierFactory", "e", "(Landroidx/compose/ui/d;Lwn0/l;Lwn0/l;Lwn0/l;FZJFFZLq1/q0;)Landroidx/compose/ui/d;", "", "sdkVersion", "c", "(I)Z", "other", "a", "(FF)Z", "Lg4/x;", "Lkotlin/Function0;", "Lg4/x;", "b", "()Lg4/x;", "MagnifierPositionInRoot", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g4.x<wn0.a<j3.g>> f104266a = new g4.x<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean a(float f11, float f12) {
        return (Float.isNaN(f11) && Float.isNaN(f12)) || f11 == f12;
    }

    public static final g4.x<wn0.a<j3.g>> b() {
        return f104266a;
    }

    public static final boolean c(int i11) {
        return i11 >= 28;
    }

    public static /* synthetic */ boolean d(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Build.VERSION.SDK_INT;
        }
        return c(i11);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, wn0.l<? super w4.d, j3.g> lVar, wn0.l<? super w4.d, j3.g> lVar2, wn0.l<? super w4.k, jn0.h0> lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, q0 q0Var) {
        if (d(0, 1, null)) {
            return dVar.g(new MagnifierElement(lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, q0Var == null ? q0.INSTANCE.a() : q0Var, null));
        }
        return dVar;
    }

    public static /* synthetic */ androidx.compose.ui.d f(androidx.compose.ui.d dVar, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, q0 q0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar2 = null;
        }
        if ((i11 & 4) != 0) {
            lVar3 = null;
        }
        if ((i11 & 8) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        if ((i11 & 32) != 0) {
            j11 = w4.k.INSTANCE.a();
        }
        if ((i11 & 64) != 0) {
            f12 = w4.h.INSTANCE.c();
        }
        if ((i11 & 128) != 0) {
            f13 = w4.h.INSTANCE.c();
        }
        if ((i11 & 256) != 0) {
            z12 = true;
        }
        if ((i11 & 512) != 0) {
            q0Var = null;
        }
        return e(dVar, lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, q0Var);
    }
}
