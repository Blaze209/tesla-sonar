package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.paymentsheet.b0;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/stripe/android/paymentsheet/c;", "Lcom/stripe/android/paymentsheet/a0;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "activityResultLauncher", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", Kind.APPLICATION, "Ln70/q;", "callback", "", "initializedViaCompose", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Ln70/q;Z)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Ln70/q;)V", "Lcom/stripe/android/paymentsheet/y$m;", "mode", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "Ljn0/h0;", "a", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;)V", "Landroidx/activity/result/ActivityResultLauncher;", "b", "Landroid/app/Activity;", "c", "Landroidx/lifecycle/LifecycleOwner;", DateTokenConverter.CONVERTER_KEY, "Landroid/app/Application;", "e", "Ln70/q;", "f", "Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<PaymentSheetContractV2.Args> activityResultLauncher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n70.q callback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean initializedViaCompose;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/paymentsheet/c$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            p013kotlin.jvm.internal.s.k(owner, "owner");
            i.INSTANCE.b(null);
            n70.j.f93418a.c(null);
            super.onDestroy(owner);
        }
    }

    public c(ActivityResultLauncher<PaymentSheetContractV2.Args> activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, n70.q callback, boolean z11) {
        p013kotlin.jvm.internal.s.k(activityResultLauncher, "activityResultLauncher");
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.activityResultLauncher = activityResultLauncher;
        this.activity = activity;
        this.lifecycleOwner = lifecycleOwner;
        this.application = application;
        this.callback = callback;
        this.initializedViaCompose = z11;
        lifecycleOwner.getLifecycle().a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(n70.q callback, b0 b0Var) {
        p013kotlin.jvm.internal.s.k(callback, "$callback");
        p013kotlin.jvm.internal.s.h(b0Var);
        callback.a(b0Var);
    }

    @Override // com.stripe.android.paymentsheet.a0
    public void a(y.m mode, y.Configuration configuration) {
        p013kotlin.jvm.internal.s.k(mode, "mode");
        if (configuration == null) {
            configuration = y.Configuration.INSTANCE.a(this.activity);
        }
        Window window = this.activity.getWindow();
        PaymentSheetContractV2.Args aVar = new PaymentSheetContractV2.Args(mode, configuration, window != null ? Integer.valueOf(window.getStatusBarColor()) : null, this.initializedViaCompose);
        Context applicationContext = this.application.getApplicationContext();
        r90.b bVar = r90.b.f107376a;
        androidx.core.app.d dVarA = androidx.core.app.d.a(applicationContext, bVar.a(), bVar.b());
        p013kotlin.jvm.internal.s.j(dVarA, "makeCustomAnimation(...)");
        try {
            this.activityResultLauncher.c(aVar, dVarA);
        } catch (IllegalStateException e11) {
            this.callback.a(new b0.Failed(new IllegalStateException("The host activity is not in a valid state (" + this.lifecycleOwner.getLifecycle().getState() + ").", e11)));
        }
    }

    public /* synthetic */ c(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, n70.q qVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(activityResultLauncher, activity, lifecycleOwner, application, qVar, (i11 & 32) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Fragment fragment, final n70.q callback) {
        p013kotlin.jvm.internal.s.k(fragment, "fragment");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new PaymentSheetContractV2(), new ActivityResultCallback() { // from class: n70.d
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.paymentsheet.c.c(callback, (b0) obj);
            }
        });
        p013kotlin.jvm.internal.s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        androidx.fragment.app.u uVarRequireActivity = fragment.requireActivity();
        p013kotlin.jvm.internal.s.j(uVarRequireActivity, "requireActivity(...)");
        Application application = fragment.requireActivity().getApplication();
        p013kotlin.jvm.internal.s.j(application, "getApplication(...)");
        this(activityResultLauncherRegisterForActivityResult, uVarRequireActivity, fragment, application, callback, false, 32, null);
    }
}
