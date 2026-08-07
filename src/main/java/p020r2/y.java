package p020r2;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import z2.e;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lr2/z1;", "Lr2/u;", Action.KEY_ATTRIBUTE, "", "a", "(Lr2/z1;Lr2/u;)Z", "b", "(Lr2/z1;Lr2/u;)Ljava/lang/Object;", "", "Lr2/h2;", "values", "parentScope", "previous", "c", "([Lr2/h2;Lr2/z1;Lr2/z1;)Lr2/z1;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y {
    public static final <T> boolean a(z1 z1Var, u<T> uVar) {
        s.i(uVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return z1Var.containsKey(uVar);
    }

    public static final <T> T b(z1 z1Var, u<T> uVar) {
        s.i(uVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        e4<T> e4VarA = (e4<T>) z1Var.get(uVar);
        if (e4VarA == null) {
            e4VarA = uVar.a();
        }
        return (T) e4VarA.a(z1Var);
    }

    public static final z1 c(h2<?>[] h2VarArr, z1 z1Var, z1 z1Var2) {
        e.a aVarW = f.a().builder();
        for (h2<?> h2Var : h2VarArr) {
            u<?> uVarB = h2Var.b();
            s.i(uVarB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            g2 g2Var = (g2) uVarB;
            if (h2Var.getCanOverride() || !a(z1Var, g2Var)) {
                e4 e4Var = (e4) z1Var2.get(g2Var);
                s.i(h2Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarW.put(g2Var, g2Var.b(h2Var, e4Var));
            }
        }
        return aVarW.build();
    }

    public static /* synthetic */ z1 d(h2[] h2VarArr, z1 z1Var, z1 z1Var2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z1Var2 = f.a();
        }
        return c(h2VarArr, z1Var, z1Var2);
    }
}
