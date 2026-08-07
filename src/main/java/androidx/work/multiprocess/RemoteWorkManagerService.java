package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.work.z;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteWorkManagerService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f14686b = z.i("RemoteWorkManagerService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder f14687a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        z.e().f(f14686b, "Binding to RemoteWorkManager");
        return this.f14687a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f14687a = new g(this);
    }
}
