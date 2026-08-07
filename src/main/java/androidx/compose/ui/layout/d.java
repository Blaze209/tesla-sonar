package androidx.compose.ui.layout;

import b4.t;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/d;", "Landroidx/compose/ui/d$c;", "Lb4/t;", "Lkotlin/Function1;", "Lz3/v;", "Ljn0/h0;", "callback", "<init>", "(Lwn0/l;)V", "coordinates", "P", "(Lz3/v;)V", "n", "Lwn0/l;", "getCallback", "()Lwn0/l;", "x2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d extends androidx.compose.ui.d.c implements t {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private l<? super v, h0> callback;

    public d(l<? super v, h0> lVar) {
        this.callback = lVar;
    }

    @Override // b4.t
    public void P(v coordinates) {
        this.callback.invoke(coordinates);
    }

    public final void x2(l<? super v, h0> lVar) {
        this.callback = lVar;
    }
}
