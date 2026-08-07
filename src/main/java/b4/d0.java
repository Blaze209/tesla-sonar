package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb4/p0;", "Lz3/a;", "alignmentLine", "", "b", "(Lb4/p0;Lz3/a;)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(p0 p0Var, z3.a aVar) {
        p0 p0VarQ1 = p0Var.q1();
        if (!(p0VarQ1 != null)) {
            y3.a.b("Child of " + p0Var + " cannot be null when calculating alignment line");
        }
        if (p0Var.x1().q().containsKey(aVar)) {
            Integer num = p0Var.x1().q().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iG0 = p0VarQ1.g0(aVar);
        if (iG0 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        p0VarQ1.X1(true);
        p0Var.W1(true);
        p0Var.V1();
        p0VarQ1.X1(false);
        p0Var.W1(false);
        return iG0 + (aVar instanceof z3.p ? w4.n.i(p0VarQ1.getPosition()) : w4.n.h(p0VarQ1.getPosition()));
    }
}
