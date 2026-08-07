package o4;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lo4/c0;", "Lo4/b0;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lo4/z;", "Ljn0/h0;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lwn0/l;)V", "Landroid/view/inputmethod/InputContentInfo;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class c0 extends b0 {
    public c0(InputConnection inputConnection, wn0.l<? super z, jn0.h0> lVar) {
        super(inputConnection, lVar);
    }

    @Override // o4.a0, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo p11, int p12, Bundle p13) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.commitContent(p11, p12, p13);
        }
        return false;
    }
}
