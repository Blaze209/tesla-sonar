package androidx.compose.ui.focus;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/n;", "Li3/j;", "Landroidx/compose/ui/d$c;", "Li3/l;", "focusPropertiesScope", "<init>", "(Li3/l;)V", "Landroidx/compose/ui/focus/k;", "focusProperties", "Ljn0/h0;", "y1", "(Landroidx/compose/ui/focus/k;)V", "n", "Li3/l;", "getFocusPropertiesScope", "()Li3/l;", "x2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n extends androidx.compose.ui.d.c implements i3.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private i3.l focusPropertiesScope;

    public n(i3.l lVar) {
        this.focusPropertiesScope = lVar;
    }

    public final void x2(i3.l lVar) {
        this.focusPropertiesScope = lVar;
    }

    @Override // i3.j
    public void y1(k focusProperties) {
        this.focusPropertiesScope.a(focusProperties);
    }
}
