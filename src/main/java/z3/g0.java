package z3;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Lb4/q0;", "a", "(Lb4/q0;)Lb4/q0;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {
    public static final b4.q0 a(b4.q0 q0Var) {
        b4.g0 layoutNode = q0Var.getLayoutNode();
        while (true) {
            b4.g0 g0VarN0 = layoutNode.n0();
            if ((g0VarN0 != null ? g0VarN0.getLookaheadRoot() : null) == null) {
                b4.q0 lookaheadDelegate = layoutNode.l0().getLookaheadDelegate();
                p013kotlin.jvm.internal.s.h(lookaheadDelegate);
                return lookaheadDelegate;
            }
            b4.g0 g0VarN1 = layoutNode.n0();
            b4.g0 lookaheadRoot = g0VarN1 != null ? g0VarN1.getLookaheadRoot() : null;
            p013kotlin.jvm.internal.s.h(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                layoutNode = layoutNode.n0();
                p013kotlin.jvm.internal.s.h(layoutNode);
            } else {
                b4.g0 g0VarN2 = layoutNode.n0();
                p013kotlin.jvm.internal.s.h(g0VarN2);
                layoutNode = g0VarN2.getLookaheadRoot();
                p013kotlin.jvm.internal.s.h(layoutNode);
            }
        }
    }
}
