package v1;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lv1/b$m;", "verticalArrangement", "Ld3/c$b;", "horizontalAlignment", "Lz3/i0;", "a", "(Lv1/b$m;Ld3/c$b;Lr2/l;I)Lz3/i0;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Lw4/b;", "b", "(ZIIII)J", "Lz3/i0;", "getDefaultColumnMeasurePolicy", "()Lz3/i0;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z3.i0 f117495a = new ColumnMeasurePolicy(b.f117444a.g(), d3.c.INSTANCE.k());

    public static final z3.i0 a(b.m mVar, d3.c.b bVar, p020r2.l lVar, int i11) {
        z3.i0 i0Var;
        if (p020r2.o.J()) {
            p020r2.o.S(1089876336, i11, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");
        }
        if (p013kotlin.jvm.internal.s.f(mVar, b.f117444a.g()) && p013kotlin.jvm.internal.s.f(bVar, d3.c.INSTANCE.k())) {
            lVar.o(345962472);
            lVar.l();
            i0Var = f117495a;
        } else {
            lVar.o(346016319);
            boolean z11 = ((((i11 & 14) ^ 6) > 4 && lVar.n(mVar)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.n(bVar)) || (i11 & 48) == 32);
            Object objI = lVar.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new ColumnMeasurePolicy(mVar, bVar);
                lVar.B(objI);
            }
            i0Var = (ColumnMeasurePolicy) objI;
            lVar.l();
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return i0Var;
    }

    public static final long b(boolean z11, int i11, int i12, int i13, int i14) {
        return !z11 ? w4.c.a(i12, i14, i11, i13) : w4.b.INSTANCE.a(i12, i14, i11, i13);
    }
}
