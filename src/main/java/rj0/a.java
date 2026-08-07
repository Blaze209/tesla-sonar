package rj0;

import androidx.compose.ui.platform.z0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p019p1.z;
import p020r2.l;
import w1.a0;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Lw1/a0;", "lazyListState", "Lkotlin/Function2;", "Lrj0/h;", "Lrj0/i;", "", "snapOffsetForItem", "Lw4/h;", "endContentPadding", "Lp1/z;", "", "decayAnimationSpec", "Lp1/i;", "springAnimationSpec", "Lkotlin/Function3;", "snapIndex", "Lrj0/e;", "b", "(Lw1/a0;Lwn0/p;FLp1/z;Lp1/i;Lwn0/q;Lr2/l;II)Lrj0/e;", "Lrj0/b;", "a", "(Lw1/a0;Lwn0/p;FLr2/l;II)Lrj0/b;", "lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class a {
    public static final b a(a0 lazyListState, p<? super h, ? super SnapperLayoutItemInfo, Integer> pVar, float f11, l lVar, int i11, int i12) {
        s.k(lazyListState, "lazyListState");
        lVar.H(-1050829263);
        if ((i12 & 2) != 0) {
            pVar = d.f108457a.a();
        }
        p<? super h, ? super SnapperLayoutItemInfo, Integer> pVar2 = pVar;
        if ((i12 & 4) != 0) {
            f11 = w4.h.g(0);
        }
        lVar.H(-3686552);
        boolean zN = lVar.n(lazyListState) | lVar.n(pVar2);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            b bVar = new b(lazyListState, pVar2, 0, 4, null);
            lVar.B(bVar);
            objI = bVar;
        }
        lVar.T();
        b bVar2 = (b) objI;
        bVar2.o(((w4.d) lVar.U(z0.g())).i1(f11));
        lVar.T();
        return bVar2;
    }

    public static final e b(a0 lazyListState, p<? super h, ? super SnapperLayoutItemInfo, Integer> pVar, float f11, z<Float> zVar, p019p1.i<Float> iVar, q<? super h, ? super Integer, ? super Integer, Integer> snapIndex, l lVar, int i11, int i12) {
        s.k(lazyListState, "lazyListState");
        s.k(snapIndex, "snapIndex");
        lVar.H(-632875458);
        if ((i12 & 2) != 0) {
            pVar = d.f108457a.a();
        }
        p<? super h, ? super SnapperLayoutItemInfo, Integer> pVar2 = pVar;
        if ((i12 & 4) != 0) {
            f11 = w4.h.g(0);
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            zVar = p015o1.z.b(lVar, 0);
        }
        if ((i12 & 16) != 0) {
            iVar = f.f108498a.b();
        }
        e eVarA = g.a(a(lazyListState, pVar2, f12, lVar, i11 & 1022, 0), zVar, iVar, snapIndex, lVar, ((i11 >> 6) & 7168) | 576, 0);
        lVar.T();
        return eVarA;
    }
}
