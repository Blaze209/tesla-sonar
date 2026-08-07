package f4;

import androidx.compose.ui.platform.p2;
import b4.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.ScrollAxisRange;
import g4.k;
import g4.m;
import g4.p;
import g4.s;
import java.util.List;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import w4.q;
import wn0.l;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0013\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lg4/p;", "fromNode", "", "depth", "Lkotlin/Function1;", "Lf4/i;", "Ljn0/h0;", "onCandidate", DateTokenConverter.CONVERTER_KEY, "(Lg4/p;ILwn0/l;)V", "", "b", "(Lg4/p;)Ljava/util/List;", "Lkotlin/Function2;", "Lj3/g;", "Lkotlin/coroutines/Continuation;", "", "c", "(Lg4/p;)Lwn0/p;", "scrollCaptureScrollByAction", "", "a", "(Lg4/p;)Z", "canScrollVertically", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    private static final boolean a(p pVar) {
        wn0.p<j3.g, Continuation<? super j3.g>, Object> pVarC = c(pVar);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) m.a(pVar.getUnmergedConfig(), s.f67271a.I());
        return (pVarC == null || scrollAxisRange == null || scrollAxisRange.a().invoke().floatValue() <= BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    private static final List<p> b(p pVar) {
        return pVar.l(false, false, false);
    }

    public static final wn0.p<j3.g, Continuation<? super j3.g>, Object> c(p pVar) {
        return (wn0.p) m.a(pVar.getUnmergedConfig(), k.f67225a.u());
    }

    private static final void d(p pVar, int i11, l<? super ScrollCaptureCandidate, h0> lVar) {
        t2.b bVar = new t2.b(new p[16], 0);
        List<p> listB = b(pVar);
        while (true) {
            bVar.d(bVar.getSize(), listB);
            while (bVar.q()) {
                p pVar2 = (p) bVar.v(bVar.getSize() - 1);
                if (p2.g(pVar2) && !pVar2.getUnmergedConfig().e(s.f67271a.f())) {
                    z0 z0VarE = pVar2.e();
                    if (z0VarE == null) {
                        y3.a.c("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    v vVarT1 = z0VarE.t1();
                    w4.p pVarB = q.b(w.c(vVarT1));
                    if (pVarB.l()) {
                        continue;
                    } else if (a(pVar2)) {
                        int i12 = i11 + 1;
                        lVar.invoke(new ScrollCaptureCandidate(pVar2, i12, pVarB, vVarT1));
                        d(pVar2, i12, lVar);
                    } else {
                        listB = b(pVar2);
                    }
                }
            }
            return;
        }
    }

    static /* synthetic */ void e(p pVar, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        d(pVar, i11, lVar);
    }
}
