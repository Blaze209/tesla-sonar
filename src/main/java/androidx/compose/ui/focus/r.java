package androidx.compose.ui.focus;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/r;", "Li3/n;", "Landroidx/compose/ui/d$c;", "Landroidx/compose/ui/focus/o;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/o;)V", "Ljn0/h0;", "h2", "()V", "i2", "n", "Landroidx/compose/ui/focus/o;", "x2", "()Landroidx/compose/ui/focus/o;", "y2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r extends androidx.compose.ui.d.c implements i3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private o focusRequester;

    public r(o oVar) {
        this.focusRequester = oVar;
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        super.h2();
        this.focusRequester.e().b(this);
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        this.focusRequester.e().t(this);
        super.i2();
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final o getFocusRequester() {
        return this.focusRequester;
    }

    public final void y2(o oVar) {
        this.focusRequester = oVar;
    }
}
