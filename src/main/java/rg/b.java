package rg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class b implements pg.a {

    public static final class c implements IInterface {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public IBinder f108135n;

        public c(IBinder iBinder) {
            this.f108135n = iBinder;
        }

        public String R2() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f108135n.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f108135n;
        }
    }

    @Override // pg.a
    public String a(Context context) {
        ServiceConnectionC2297b serviceConnectionC2297b = new ServiceConnectionC2297b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC2297b, 1)) {
            try {
                return new c(serviceConnectionC2297b.a()).R2();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC2297b);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: rg.b$b, reason: collision with other inner class name */
    public static final class ServiceConnectionC2297b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f108134b;

        public ServiceConnectionC2297b() {
            this.f108133a = false;
            this.f108134b = new LinkedBlockingQueue<>();
        }

        public IBinder a() {
            if (this.f108133a) {
                throw new IllegalStateException();
            }
            this.f108133a = true;
            return this.f108134b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f108134b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
