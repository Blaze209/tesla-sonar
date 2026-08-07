package ng;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lg.a f94991a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f94992b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f94993c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f94994d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f94995e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.f94991a = lg.a.AbstractBinderC1899a.R2(iBinder);
            synchronized (b.this.f94994d) {
                b.this.f94994d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f94991a = null;
        }
    }

    /* JADX INFO: renamed from: ng.b$b, reason: collision with other inner class name */
    public static class C2023b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f94997a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
    }

    public synchronized String a(Context context, String str) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (this.f94991a != null) {
                try {
                    return c(context, str);
                } catch (RemoteException e11) {
                    e11.printStackTrace();
                    return "";
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (context.bindService(intent, this.f94995e, 1)) {
                synchronized (this.f94994d) {
                    try {
                        this.f94994d.wait(3000L);
                    } catch (InterruptedException e12) {
                        e12.printStackTrace();
                    }
                }
            }
            if (this.f94991a == null) {
                return "";
            }
            try {
                return c(context, str);
            } catch (RemoteException e13) {
                e13.printStackTrace();
                return "";
            }
            throw th;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
            }
            return packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public final String c(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f94992b)) {
            this.f94992b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f94993c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f94992b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e11) {
                e11.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b11 : bArrDigest) {
                            sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                        }
                        string = sb2.toString();
                    }
                } catch (NoSuchAlgorithmException e12) {
                    e12.printStackTrace();
                }
            }
            this.f94993c = string;
        }
        String strR2 = ((lg.a.AbstractBinderC1899a.C1900a) this.f94991a).R2(this.f94992b, this.f94993c, str);
        return TextUtils.isEmpty(strR2) ? "" : strR2;
    }
}
