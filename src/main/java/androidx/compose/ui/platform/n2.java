package androidx.compose.ui.platform;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/n2;", "", "Lg4/p;", "semanticsNode", "Landroidx/collection/o;", "Landroidx/compose/ui/platform/o2;", "currentSemanticsNodes", "<init>", "(Lg4/p;Landroidx/collection/o;)V", "Lg4/l;", "a", "Lg4/l;", "b", "()Lg4/l;", "unmergedConfig", "Landroidx/collection/d0;", "Landroidx/collection/d0;", "()Landroidx/collection/d0;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g4.l unmergedConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.collection.d0 children = androidx.collection.r.b();

    public n2(g4.p pVar, androidx.collection.o<o2> oVar) {
        this.unmergedConfig = pVar.getUnmergedConfig();
        List<g4.p> listT = pVar.t();
        int size = listT.size();
        for (int i11 = 0; i11 < size; i11++) {
            g4.p pVar2 = listT.get(i11);
            if (oVar.a(pVar2.getId())) {
                this.children.f(pVar2.getId());
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.collection.d0 getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g4.l getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
