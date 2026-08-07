package sy;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f111925a;

    private e(f fVar) {
        this.f111925a = fVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xf0.j.c("HwOpenPayTask", "---onServiceConnected---begin");
        synchronized (this.f111925a.f111926a) {
            this.f111925a.f111928c = j.R2(iBinder);
            xf0.j.c("HwOpenPayTask", "---onServiceConnected---");
            this.f111925a.f111926a.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        xf0.j.c("HwOpenPayTask", "---onServiceDisconnected---begin");
        synchronized (this.f111925a.f111926a) {
            xf0.j.c("HwOpenPayTask", "---onServiceDisconnected---");
            this.f111925a.f111928c = null;
            this.f111925a.f111926a.notifyAll();
        }
    }

    /* synthetic */ e(f fVar, a aVar) {
        this(fVar);
    }
}
