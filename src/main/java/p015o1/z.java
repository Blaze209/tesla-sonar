package p015o1;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.z0;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p019p1.b0;
import p020r2.l;
import p020r2.o;
import w4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"T", "Lp1/z;", "b", "(Lr2/l;I)Lp1/z;", "", "a", Gender.FEMALE, "()F", "platformFlingScrollFriction", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f95698a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f95698a;
    }

    public static final <T> p019p1.z<T> b(l lVar, int i11) {
        if (o.J()) {
            o.S(904445851, i11, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        d dVar = (d) lVar.U(z0.g());
        boolean zQ = lVar.q(dVar.getDensity());
        Object objI = lVar.I();
        if (zQ || objI == l.INSTANCE.a()) {
            objI = b0.b(new y(dVar));
            lVar.B(objI);
        }
        p019p1.z<T> zVar = (p019p1.z) objI;
        if (o.J()) {
            o.R();
        }
        return zVar;
    }
}
