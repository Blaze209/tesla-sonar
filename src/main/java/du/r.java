package du;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes5.dex */
final class r implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f61033a;

    /* synthetic */ r(t tVar, s sVar) {
        this.f61033a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f61033a.f61036b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f61033a.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f61033a.f61036b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f61033a.c().post(new q(this));
    }
}
