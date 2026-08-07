package v3;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "Lv3/s;", "icon", "", "overrideDescendants", "a", "(Landroidx/compose/ui/d;Lv3/s;Z)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, s sVar, boolean z11) {
        return dVar.g(new PointerHoverIconModifierElement(sVar, z11));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, s sVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a(dVar, sVar, z11);
    }
}
