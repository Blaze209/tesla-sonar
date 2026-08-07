package g4;

import b4.g0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lg4/r;", "", "Lb4/g0;", "rootNode", "Lg4/f;", "outerSemanticsNode", "<init>", "(Lb4/g0;Lg4/f;)V", "a", "Lb4/g0;", "b", "Lg4/f;", "Lg4/p;", "()Lg4/p;", "unmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 rootNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f outerSemanticsNode;

    public r(g0 g0Var, f fVar) {
        this.rootNode = g0Var;
        this.outerSemanticsNode = fVar;
    }

    public final p a() {
        return new p(this.outerSemanticsNode, false, this.rootNode, new l());
    }
}
