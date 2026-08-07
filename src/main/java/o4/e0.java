package o4;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lo4/z;", "Ljn0/h0;", "onConnectionClosed", "a", "(Landroid/view/inputmethod/InputConnection;Lwn0/l;)Lo4/z;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {
    public static final z a(InputConnection inputConnection, wn0.l<? super z, jn0.h0> lVar) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            return new d0(inputConnection, lVar);
        }
        return i11 >= 25 ? new c0(inputConnection, lVar) : new b0(inputConnection, lVar);
    }
}
