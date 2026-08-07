package iu;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f81876a;

    /* synthetic */ d(f fVar, e eVar) {
        Objects.requireNonNull(fVar);
        this.f81876a = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f81876a;
        fVar.f81881b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        fVar.c().post(new b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.f81876a;
        fVar.f81881b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        fVar.c().post(new c(this));
    }
}
