package androidx.compose.ui.focus;

import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/c;", "Li3/c;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Li3/o;", "Ljn0/h0;", "onFocusChanged", "<init>", "(Lwn0/l;)V", "focusState", "y", "(Li3/o;)V", "n", "Lwn0/l;", "getOnFocusChanged", "()Lwn0/l;", "x2", "o", "Li3/o;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c extends androidx.compose.ui.d.c implements i3.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super i3.o, h0> onFocusChanged;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private i3.o focusState;

    public c(wn0.l<? super i3.o, h0> lVar) {
        this.onFocusChanged = lVar;
    }

    public final void x2(wn0.l<? super i3.o, h0> lVar) {
        this.onFocusChanged = lVar;
    }

    @Override // i3.c
    public void y(i3.o focusState) {
        if (p013kotlin.jvm.internal.s.f(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }
}
