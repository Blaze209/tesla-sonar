package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.d;
import p013kotlin.Metadata;
import t3.e;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/b;", "Lt3/e;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Lt3/b;", "", "onEvent", "onPreEvent", "<init>", "(Lwn0/l;Lwn0/l;)V", "event", "B1", "(Landroid/view/KeyEvent;)Z", "s0", "n", "Lwn0/l;", "getOnEvent", "()Lwn0/l;", "x2", "(Lwn0/l;)V", "o", "getOnPreEvent", "y2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends d.c implements e {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private l<? super t3.b, Boolean> onEvent;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private l<? super t3.b, Boolean> onPreEvent;

    public b(l<? super t3.b, Boolean> lVar, l<? super t3.b, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @Override // t3.e
    public boolean B1(KeyEvent event) {
        l<? super t3.b, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(t3.b.a(event)).booleanValue();
        }
        return false;
    }

    @Override // t3.e
    public boolean s0(KeyEvent event) {
        l<? super t3.b, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(t3.b.a(event)).booleanValue();
        }
        return false;
    }

    public final void x2(l<? super t3.b, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void y2(l<? super t3.b, Boolean> lVar) {
        this.onPreEvent = lVar;
    }
}
