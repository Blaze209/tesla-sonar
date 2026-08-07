package fi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class b extends fi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f65999a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f66000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ws.a f66001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ServiceConnection f66002d;

    /* JADX INFO: renamed from: fi.b$b, reason: collision with other inner class name */
    private final class ServiceConnectionC1346b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f66003a;

        private ServiceConnectionC1346b(c cVar) {
            if (cVar == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f66003a = cVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            gi.a.a("InstallReferrerClient", "Install Referrer service connected.");
            b.this.f66001c = ws.a.AbstractBinderC2627a.R2(iBinder);
            b.this.f65999a = 2;
            this.f66003a.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            gi.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            b.this.f66001c = null;
            b.this.f65999a = 0;
            this.f66003a.b();
        }
    }

    public b(Context context) {
        this.f66000b = context.getApplicationContext();
    }

    private boolean f() {
        try {
            return this.f66000b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // fi.a
    public d a() throws RemoteException {
        if (!g()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f66000b.getPackageName());
        try {
            return new d(this.f66001c.a(bundle));
        } catch (RemoteException e11) {
            gi.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f65999a = 0;
            throw e11;
        }
    }

    @Override // fi.a
    public void c(c cVar) {
        ServiceInfo serviceInfo;
        if (g()) {
            gi.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            cVar.a(0);
            return;
        }
        int i11 = this.f65999a;
        if (i11 == 1) {
            gi.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            cVar.a(3);
            return;
        }
        if (i11 == 3) {
            gi.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.a(3);
            return;
        }
        gi.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f66000b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f65999a = 0;
            gi.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            cVar.a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !f()) {
            gi.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f65999a = 0;
            cVar.a(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        ServiceConnectionC1346b serviceConnectionC1346b = new ServiceConnectionC1346b(cVar);
        this.f66002d = serviceConnectionC1346b;
        if (this.f66000b.bindService(intent2, serviceConnectionC1346b, 1)) {
            gi.a.a("InstallReferrerClient", "Service was bonded successfully.");
            return;
        }
        gi.a.b("InstallReferrerClient", "Connection to service is blocked.");
        this.f65999a = 0;
        cVar.a(1);
    }

    public boolean g() {
        return (this.f65999a != 2 || this.f66001c == null || this.f66002d == null) ? false : true;
    }
}
