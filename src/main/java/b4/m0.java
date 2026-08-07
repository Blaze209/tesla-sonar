package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/g0;", "", "a", "(Lb4/g0;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m0 {
    public static final boolean a(g0 g0Var) {
        if (g0Var.getLookaheadRoot() == null) {
            return false;
        }
        g0 g0VarN0 = g0Var.n0();
        return (g0VarN0 != null ? g0VarN0.getLookaheadRoot() : null) == null || g0Var.getLayoutDelegate().getDetachedFromParentLookaheadPass();
    }
}
