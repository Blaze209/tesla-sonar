package bi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f17409d = "OpenDeviceId library";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f17410e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17411a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zh.a f17412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f17413c;

    /* JADX INFO: renamed from: bi.a$a, reason: collision with other inner class name */
    public class ServiceConnectionC0348a implements ServiceConnection {
        public ServiceConnectionC0348a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.f17412b = zh.a.AbstractBinderC2786a.R2(iBinder);
            a.b(a.this);
            a.this.g("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.f17412b = null;
            a.this.g("Service onServiceDisconnected");
        }
    }

    public interface b<T> {
    }

    public static /* synthetic */ b b(a aVar) {
        aVar.getClass();
        return null;
    }

    public int a(Context context, b<String> bVar) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f17411a = context;
        this.f17413c = new ServiceConnectionC0348a();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.f17411a.bindService(intent, this.f17413c, 1)) {
            g("bindService Successful!");
            return 1;
        }
        g("bindService Failed!");
        return -1;
    }

    public final void e(String str) {
        if (f17410e) {
            Log.e(f17409d, str);
        }
    }

    public String f() {
        if (this.f17411a == null) {
            e("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            zh.a aVar = this.f17412b;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        } catch (RemoteException e11) {
            e("getOAID error, RemoteException!");
            e11.printStackTrace();
            return null;
        }
    }

    public final void g(String str) {
        if (f17410e) {
            Log.i(f17409d, str);
        }
    }

    public boolean h() {
        try {
            if (this.f17412b == null) {
                return false;
            }
            g("Device support opendeviceid");
            return this.f17412b.c();
        } catch (RemoteException unused) {
            e("isSupport error, RemoteException!");
            return false;
        }
    }
}
