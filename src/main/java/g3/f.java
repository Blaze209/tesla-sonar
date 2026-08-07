package g3;

import b4.k;
import b4.w1;
import b4.x1;
import b4.y1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import w4.r;
import wn0.l;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lg3/g;", "Lg3/b;", "event", "Ljn0/h0;", "e", "(Lg3/g;Lg3/b;)V", "Lg3/d;", "Lj3/g;", "position", "", DateTokenConverter.CONVERTER_KEY, "(Lg3/d;J)Z", "Lb4/x1;", "T", "Lkotlin/Function1;", "Lb4/w1;", "block", "f", "(Lb4/x1;Lwn0/l;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(d dVar, long j11) {
        if (!dVar.getNode().getIsAttached()) {
            return false;
        }
        v coordinates = k.m(dVar).getCoordinates();
        if (!coordinates.b0()) {
            return false;
        }
        long jE = coordinates.e();
        int iG = r.g(jE);
        int iF = r.f(jE);
        long jF = w.f(coordinates);
        float fM = j3.g.m(jF);
        float fN = j3.g.n(jF);
        float f11 = iG + fM;
        float f12 = iF + fN;
        float fM2 = j3.g.m(j11);
        if (fM <= fM2 && fM2 <= f11) {
            float fN2 = j3.g.n(j11);
            if (fN <= fN2 && fN2 <= f12) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(g gVar, b bVar) {
        gVar.m0(bVar);
        gVar.P1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends x1> void f(T t11, l<? super T, ? extends w1> lVar) {
        if (lVar.invoke(t11) != w1.ContinueTraversal) {
            return;
        }
        y1.f(t11, lVar);
    }
}
