package sy;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f111927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f111928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f111929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f111930e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f111926a = new byte[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ServiceConnection f111931f = new e(this, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f111932g = new a(this);

    public f(Context context) {
        this.f111927b = new WeakReference(context);
    }

    static /* synthetic */ c a(f fVar) {
        fVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f111930e) {
            this.f111930e = false;
            this.f111928c = null;
            if (this.f111927b == null || this.f111931f == null) {
                return;
            }
            xf0.j.c("HwOpenPayTask", "---unbindService---start");
            try {
                Context context = (Context) this.f111927b.get();
                if (context != null) {
                    context.unbindService(this.f111931f);
                }
            } catch (Exception unused) {
            }
            xf0.j.c("HwOpenPayTask", "---unbindService---end");
        }
    }

    private void j() {
        xf0.j.c("HwOpenPayTask", "--failResult--:");
        d dVar = this.f111929d;
        if (dVar != null) {
            dVar.a(0, new Bundle());
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        String str;
        String str2;
        Context context;
        synchronized (this.f111926a) {
            try {
                if (this.f111928c == null) {
                    Intent intent = new Intent("com.huawei.nfc.action.OPEN_AIDL_API_PAY");
                    intent.setPackage("com.huawei.wallet");
                    xf0.j.c("HwOpenPayTask", "---bindService---start");
                    WeakReference weakReference = this.f111927b;
                    boolean zBindService = (weakReference == null || (context = (Context) weakReference.get()) == null) ? false : context.bindService(intent, this.f111931f, 1);
                    xf0.j.c("HwOpenPayTask", "---bindService---end:" + zBindService);
                    if (zBindService) {
                        this.f111930e = true;
                        if (this.f111928c == null) {
                            try {
                                xf0.j.c("HwOpenPayTask", "--waiting--");
                                this.f111926a.wait();
                            } catch (Exception unused) {
                                xf0.j.d("HwOpenPayTask", "---InterruptedException--");
                                j();
                            }
                        } else {
                            str = "HwOpenPayTask";
                            str2 = "---initNfcService---isConnection mOpenService not null";
                        }
                    }
                    j();
                } else {
                    str = "HwOpenPayTask";
                    str2 = "---initNfcService---mOpenService not null";
                }
                xf0.j.c(str, str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(String str, d dVar) {
        Executors.newCachedThreadPool().execute(new b(this, dVar, str));
    }
}
