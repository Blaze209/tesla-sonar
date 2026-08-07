package kj0;

import android.content.Context;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.x;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tesla.logging.g;
import gj0.e;

/* JADX INFO: loaded from: classes8.dex */
public class b implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static String f86182d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f86183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e f86184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f86185c = g.h("ReactNativeNotifs");

    protected b(Context context) {
        if (!(context instanceof x)) {
            throw new IllegalStateException("Application instance isn't a react-application");
        }
        this.f86184b = new e();
        this.f86183a = context;
    }

    public static c e(Context context) {
        return new b(context.getApplicationContext());
    }

    @Override // kj0.c
    public void a() {
        synchronized (this.f86183a) {
            try {
                if (f86182d == null) {
                    f();
                } else {
                    g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kj0.c
    public void b() {
        synchronized (this.f86183a) {
            try {
                if (f86182d == null) {
                    f();
                } else {
                    g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kj0.c
    public void c() {
        synchronized (this.f86183a) {
            f();
        }
    }

    @Override // kj0.c
    public void d() {
        f86182d = null;
    }

    protected void f() {
        FirebaseMessaging.q().t().addOnSuccessListener(new OnSuccessListener() { // from class: kj0.a
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f86181a.setToken((String) obj);
            }
        });
    }

    protected void g() {
        ReactContext reactContextE = ((x) this.f86183a).d().getReactInstanceManager().E();
        if (reactContextE != null && reactContextE.hasActiveCatalystInstance()) {
            Bundle bundle = new Bundle();
            bundle.putString("deviceToken", f86182d);
            this.f86184b.b("remoteNotificationsRegistered", bundle, reactContextE);
        }
        jj0.b.e(this.f86183a, f86182d);
    }

    @Override // kj0.c
    public void setToken(String str) {
        f86182d = str;
        g();
    }
}
