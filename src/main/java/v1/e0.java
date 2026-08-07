package v1;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lv1/b$e;", "horizontalArrangement", "Ld3/c$c;", "verticalAlignment", "Lz3/i0;", "b", "(Lv1/b$e;Ld3/c$c;Lr2/l;I)Lz3/i0;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Lw4/b;", "a", "(ZIIII)J", "Lz3/i0;", "getDefaultRowMeasurePolicy", "()Lz3/i0;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z3.i0 f117484a = new RowMeasurePolicy(b.f117444a.f(), d3.c.INSTANCE.l());

    public static final long a(boolean z11, int i11, int i12, int i13, int i14) {
        return !z11 ? w4.c.a(i11, i13, i12, i14) : w4.b.INSTANCE.b(i11, i13, i12, i14);
    }

    public static final z3.i0 b(b.e eVar, d3.c.InterfaceC1212c interfaceC1212c, p020r2.l lVar, int i11) {
        z3.i0 i0Var;
        if (p020r2.o.J()) {
            p020r2.o.S(-837807694, i11, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:122)");
        }
        if (p013kotlin.jvm.internal.s.f(eVar, b.f117444a.f()) && p013kotlin.jvm.internal.s.f(interfaceC1212c, d3.c.INSTANCE.l())) {
            lVar.o(-849081669);
            lVar.l();
            i0Var = f117484a;
        } else {
            lVar.o(-849030798);
            boolean z11 = ((((i11 & 14) ^ 6) > 4 && lVar.n(eVar)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.n(interfaceC1212c)) || (i11 & 48) == 32);
            Object objI = lVar.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new RowMeasurePolicy(eVar, interfaceC1212c);
                lVar.B(objI);
            }
            i0Var = (RowMeasurePolicy) objI;
            lVar.l();
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return i0Var;
    }
}
