package androidx.compose.ui.layout;

import p013kotlin.Metadata;
import z3.h0;
import z3.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/d;", "", "layoutId", "b", "(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;", "Lz3/h0;", "a", "(Lz3/h0;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final Object a(h0 h0Var) {
        Object objC = h0Var.c();
        y yVar = objC instanceof y ? (y) objC : null;
        if (yVar != null) {
            return yVar.getLayoutId();
        }
        return null;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, Object obj) {
        return dVar.g(new LayoutIdElement(obj));
    }
}
