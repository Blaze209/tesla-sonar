package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.k;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/viewinterop/i;", "Landroidx/compose/ui/d$c;", "Li3/j;", "<init>", "()V", "Landroidx/compose/ui/focus/k;", "focusProperties", "Ljn0/h0;", "y1", "(Landroidx/compose/ui/focus/k;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i extends androidx.compose.ui.d.c implements i3.j {
    @Override // i3.j
    public void y1(k focusProperties) {
        focusProperties.r(getNode().getIsAttached() && g.g(this).hasFocusable());
    }
}
