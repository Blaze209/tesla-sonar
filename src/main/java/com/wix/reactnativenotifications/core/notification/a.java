package com.wix.reactnativenotifications.core.notification;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.r;
import com.tesla.logging.g;
import gj0.d;
import gj0.e;
import gj0.f;
import hj0.NotificationData;
import hj0.c;
import io.reactivex.rxjava3.core.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx3.RxSingleKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import vb0.NotificationPackage;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
public class a implements IPushNotification {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final g f58802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final g f58803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final g f58804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static vb0.a f58805k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f58806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final gj0.b f58807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final gj0.a f58808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final e f58809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final b f58810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NotificationData f58811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final gj0.b.a f58812g = new C1203a();

    /* JADX INFO: renamed from: com.wix.reactnativenotifications.core.notification.a$a, reason: collision with other inner class name */
    class C1203a implements gj0.b.a {
        C1203a() {
        }

        @Override // gj0.b.a
        public void a() {
            a.this.f58807b.d(this);
            a.this.j();
        }

        @Override // gj0.b.a
        public void b() {
        }
    }

    static {
        g gVarH = g.h("ReactNativeNotifs");
        f58802h = gVarH;
        f58803i = gVarH.p("onReceived");
        f58804j = gVarH.p("notifyOwnerApi");
        f58805k = null;
    }

    protected a(Context context, Bundle bundle, gj0.b bVar, gj0.a aVar, e eVar) {
        this.f58806a = context;
        this.f58807b = bVar;
        this.f58808c = aVar;
        this.f58809d = eVar;
        this.f58810e = h(bundle);
        this.f58811f = NotificationData.a(bundle, Boolean.valueOf(bVar.f()));
    }

    public static IPushNotification l(Context context, Bundle bundle) {
        Object applicationContext = context.getApplicationContext();
        return applicationContext instanceof c ? ((c) applicationContext).a(context, bundle, gj0.c.a(), new gj0.a()) : new a(context, bundle, gj0.c.a(), new gj0.a(), new e());
    }

    public static void n(vb0.a aVar) {
        f58805k = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(PendingIntent pendingIntent, CoroutineScope coroutineScope, Continuation continuation) {
        return f58805k.a(this.f58806a, this.f58810e.f58814a, pendingIntent, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Integer num, NotificationPackage notificationPackage, Throwable th2) {
        if (notificationPackage == null) {
            f58802h.c("Null NotificationPackage, id:" + num);
        } else {
            v(notificationPackage.getNotification(), Integer.valueOf(notificationPackage.getId()));
        }
        if (th2 != null) {
            f58802h.d("Exception when catching notificationPackageFuture", th2);
        }
    }

    private void r() {
        Bundle bundle = new Bundle();
        bundle.putBundle("notification", this.f58810e.a());
        this.f58809d.b("notificationOpened", bundle, this.f58807b.c());
    }

    private void s(hj0.a aVar) {
        NotificationData notificationData = this.f58811f;
        if (notificationData == null) {
            f58804j.j("not notifying OAPI, data is null");
            return;
        }
        if (!notificationData.getDeliveryConfirmation()) {
            f58804j.j("not notifying OAPI, data does not require confirmation");
            return;
        }
        f58804j.j("notifying OAPI with data `" + this.f58811f.toString() + "` of type `" + aVar + "`");
        jj0.b.d(this.f58811f, this.f58806a, aVar);
    }

    private void t() {
        this.f58809d.b("notificationReceivedBackground", this.f58810e.a(), this.f58807b.c());
    }

    private void u() {
        this.f58809d.b("notificationReceived", this.f58810e.a(), this.f58807b.c());
    }

    @Override // com.wix.reactnativenotifications.core.notification.IPushNotification
    public void a() {
        g gVar = f58803i;
        gVar.j(this.f58810e.toString());
        boolean zF = this.f58807b.f();
        gVar.j("app is visible `" + zF + "`");
        if (zF) {
            u();
        } else {
            if (!this.f58810e.f58814a.getBoolean("com.tesla.TeslaV4.key-notification-push", false)) {
                x(null);
            }
            t();
        }
        s(hj0.a.RECEIVE);
    }

    @Override // com.wix.reactnativenotifications.core.notification.IPushNotification
    public void b(Integer num) {
        x(num);
    }

    @Override // com.wix.reactnativenotifications.core.notification.IPushNotification
    public void c() {
        i();
        s(hj0.a.OPEN);
    }

    protected u<NotificationPackage> f(final PendingIntent pendingIntent) {
        return RxSingleKt.rxSingle(EmptyCoroutineContext.INSTANCE, new p() { // from class: hj0.h
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return this.f72962a.o(pendingIntent, (CoroutineScope) obj, (Continuation) obj2);
            }
        }).o(vm0.a.c());
    }

    protected int g(Notification notification) {
        return (int) System.nanoTime();
    }

    protected b h(Bundle bundle) {
        return new b(bundle);
    }

    protected void i() {
        if (!this.f58807b.e()) {
            y();
            q();
            return;
        }
        if (this.f58807b.c().getCurrentActivity() == null) {
            y();
        }
        if (this.f58807b.f()) {
            j();
        } else if (this.f58807b.a()) {
            q();
        } else {
            k();
        }
    }

    protected void j() {
        r();
    }

    protected void k() {
        this.f58807b.b(m());
        q();
    }

    protected gj0.b.a m() {
        return this.f58812g;
    }

    protected void q() {
        this.f58806a.startActivity(this.f58808c.a(this.f58806a));
    }

    protected int v(Notification notification, Integer num) {
        int iIntValue = num != null ? num.intValue() : g(notification);
        w(iIntValue, notification);
        return iIntValue;
    }

    protected void w(int i11, Notification notification) {
        r.e(this.f58806a).g(i11, notification);
    }

    @SuppressLint({"CheckResult"})
    protected void x(final Integer num) {
        f(f.b(this.f58806a, this.f58810e)).s(new cm0.b() { // from class: hj0.g
            @Override // cm0.b
            public final void accept(Object obj, Object obj2) {
                this.f72960a.p(num, (NotificationPackage) obj, (Throwable) obj2);
            }
        });
    }

    protected void y() {
        d.c().d(this.f58810e);
    }
}
