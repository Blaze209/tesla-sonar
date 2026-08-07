package rj0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p019p1.z;
import p020r2.l;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrj0/h;", "layoutInfo", "Lp1/z;", "", "decayAnimationSpec", "Lp1/i;", "springAnimationSpec", "Lkotlin/Function3;", "", "snapIndex", "Lrj0/e;", "a", "(Lrj0/h;Lp1/z;Lp1/i;Lwn0/q;Lr2/l;II)Lrj0/e;", "lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class g {
    public static final e a(h layoutInfo, z<Float> zVar, p019p1.i<Float> iVar, q<? super h, ? super Integer, ? super Integer, Integer> snapIndex, l lVar, int i11, int i12) {
        s.k(layoutInfo, "layoutInfo");
        s.k(snapIndex, "snapIndex");
        lVar.H(-632874525);
        int i13 = 0;
        if ((i12 & 2) != 0) {
            zVar = p015o1.z.b(lVar, 0);
        }
        if ((i12 & 4) != 0) {
            iVar = f.f108498a.b();
        }
        Object[] objArr = {layoutInfo, zVar, iVar, snapIndex};
        lVar.H(-3685570);
        boolean zN = false;
        while (i13 < 4) {
            Object obj = objArr[i13];
            i13++;
            zN |= lVar.n(obj);
        }
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = new e(layoutInfo, zVar, iVar, snapIndex);
            lVar.B(objI);
        }
        lVar.T();
        e eVar = (e) objI;
        lVar.T();
        return eVar;
    }
}
