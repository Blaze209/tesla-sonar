package androidx.compose.animation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p019p1.f2;
import p019p1.g0;
import w4.r;
import w4.s;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/d;", "Lp1/g0;", "Lw4/r;", "animationSpec", "Lkotlin/Function2;", "Ljn0/h0;", "finishedListener", "a", "(Landroidx/compose/ui/d;Lp1/g0;Lwn0/p;)Landroidx/compose/ui/d;", "J", "c", "()J", "InvalidSize", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "isValid", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f4054a = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, g0<r> g0Var, p<? super r, ? super r, h0> pVar) {
        return h3.e.b(dVar).g(new SizeAnimationModifierElement(g0Var, d3.c.INSTANCE.o(), pVar));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, g0 g0Var, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, r.b(f2.f(r.INSTANCE)), 1, null);
        }
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        return a(dVar, g0Var, pVar);
    }

    public static final long c() {
        return f4054a;
    }

    public static final boolean d(long j11) {
        return !r.e(j11, f4054a);
    }
}
