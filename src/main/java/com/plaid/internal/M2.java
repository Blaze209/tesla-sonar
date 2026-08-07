package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.Plaid;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class M2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4465l0 f46453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f46454b;

    public M2(Application application) {
        p013kotlin.jvm.internal.s.k(application, "application");
        C4465l0 c4465l0 = new C4465l0();
        this.f46453a = c4465l0;
        this.f46454b = p013kotlin.collections.v.e(LinkActivity.class.getName());
        application.registerActivityLifecycleCallbacks(c4465l0);
    }

    public final boolean a(Throwable throwable) {
        p013kotlin.jvm.internal.s.k(throwable, "throwable");
        Activity activity = this.f46453a.f47820a.get();
        if (activity == null || !this.f46454b.contains(activity.getClass().getName())) {
            return false;
        }
        Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(activity, 6148, L2.b(throwable, null));
        C4465l0 c4465l0 = this.f46453a;
        WeakReference<Activity> weakReference = new WeakReference<>(null);
        c4465l0.getClass();
        p013kotlin.jvm.internal.s.k(weakReference, "<set-?>");
        c4465l0.f47820a = weakReference;
        return true;
    }
}
