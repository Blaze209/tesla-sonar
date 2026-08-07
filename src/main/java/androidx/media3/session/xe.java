package androidx.media3.session;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
class xe {
    public static void a(n nVar) {
        if (nVar != null) {
            try {
                nVar.c(0);
            } catch (RemoteException unused) {
            }
        }
    }
}
