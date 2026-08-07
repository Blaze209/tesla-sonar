package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lb4/j;", "Lb4/b1;", "type", "stopType", "Landroidx/compose/ui/d$c;", "b", "(Lb4/j;II)Landroidx/compose/ui/d$c;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d.c b(j jVar, int i11, int i12) {
        androidx.compose.ui.d.c child = jVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i11) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i12) != 0) {
                return null;
            }
            if ((kindSet & i11) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
