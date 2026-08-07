package androidx.compose.ui.focus;

import b4.g0;
import java.util.Comparator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/u;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "Lb4/g0;", "layoutNode", "Lt2/b;", "b", "(Lb4/g0;)Lt2/b;", "a", "", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class u implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f5395a = new u();

    private u() {
    }

    private final t2.b<g0> b(g0 layoutNode) {
        t2.b<g0> bVar = new t2.b<>(new g0[16], 0);
        while (layoutNode != null) {
            bVar.a(0, layoutNode);
            layoutNode = layoutNode.n0();
        }
        return bVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode a11, FocusTargetNode b11) {
        int i11 = 0;
        if (!t.g(a11) || !t.g(b11)) {
            if (t.g(a11)) {
                return -1;
            }
            return t.g(b11) ? 1 : 0;
        }
        g0 g0VarM = b4.k.m(a11);
        g0 g0VarM2 = b4.k.m(b11);
        if (p013kotlin.jvm.internal.s.f(g0VarM, g0VarM2)) {
            return 0;
        }
        t2.b<g0> bVarB = b(g0VarM);
        t2.b<g0> bVarB2 = b(g0VarM2);
        int iMin = Math.min(bVarB.getSize() - 1, bVarB2.getSize() - 1);
        if (iMin >= 0) {
            while (p013kotlin.jvm.internal.s.f(bVarB.m()[i11], bVarB2.m()[i11])) {
                if (i11 != iMin) {
                    i11++;
                }
            }
            return p013kotlin.jvm.internal.s.m(bVarB.m()[i11].o0(), bVarB2.m()[i11].o0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
