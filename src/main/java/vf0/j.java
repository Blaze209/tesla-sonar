package vf0;

import android.os.Message;

/* JADX INFO: loaded from: classes8.dex */
final class j implements Runnable {
    j() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a.Q.sendEmptyMessageDelayed(1001, 800L);
            wf0.c cVar = new wf0.c(a.P, xf0.b.b(a.J()));
            cVar.a();
            String strB = cVar.b();
            if (a.Q != null) {
                Message messageObtainMessage = a.Q.obtainMessage();
                messageObtainMessage.what = 1002;
                messageObtainMessage.obj = strB;
                a.Q.removeMessages(1001);
                a.Q.sendMessage(messageObtainMessage);
            }
        } catch (Exception unused) {
        }
    }
}
