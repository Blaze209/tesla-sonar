package vf0;

import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes8.dex */
final class k implements sy.d {
    k() {
    }

    @Override // sy.d
    public final void a(int i11, Bundle bundle) {
        if (a.Q == null) {
            Handler unused = a.Q = new Handler(a.W);
        }
        a.Q.sendMessage(a.Q.obtainMessage(1003, Integer.valueOf(i11)));
    }
}
