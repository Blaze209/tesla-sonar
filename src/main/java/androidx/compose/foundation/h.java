package androidx.compose.foundation;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "Lu1/l;", "interactionSource", "", "enabled", "a", "(Landroidx/compose/ui/d;Lu1/l;Z)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, u1.l lVar, boolean z11) {
        return dVar.g(z11 ? new HoverableElement(lVar) : androidx.compose.ui.d.INSTANCE);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, u1.l lVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return a(dVar, lVar, z11);
    }
}
