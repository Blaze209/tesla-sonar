package com.stripe.android.payments;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import h70.h;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "args", "Ljn0/h0;", "r", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;)V", "p", "n", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/stripe/android/payments/a;", "f", "Lkotlin/Lazy;", "q", "()Lcom/stripe/android/payments/a;", "viewModel", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StripeBrowserLauncherActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    public static final class a extends u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f51944c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f51944c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class b extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51945c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f51945c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f51945c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class c extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f51946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f51946c = aVar;
            this.f51947d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f51946c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f51947d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f51948c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new com.stripe.android.payments.a.b();
        }
    }

    public StripeBrowserLauncherActivity() {
        wn0.a aVar = d.f51948c;
        this.viewModel = new e1(o0.b(com.stripe.android.payments.a.class), new b(this), aVar == null ? new a(this) : aVar, new c(null, this));
    }

    private final void n(PaymentBrowserAuthContract.Args args) {
        setResult(-1, q().f(args));
        finish();
    }

    private final void p(PaymentBrowserAuthContract.Args args) {
        setResult(-1, q().h(args));
        finish();
    }

    private final com.stripe.android.payments.a q() {
        return (com.stripe.android.payments.a) this.viewModel.getValue();
    }

    private final void r(final PaymentBrowserAuthContract.Args args) {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: a70.l
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                StripeBrowserLauncherActivity.s(this.f576a, args, (h.a) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        try {
            activityResultLauncherRegisterForActivityResult.b(q().c(args));
            q().j(true);
        } catch (ActivityNotFoundException e11) {
            h.Companion companion = h.INSTANCE;
            Context applicationContext = getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            h.b.a(h.Companion.b(companion, applicationContext, null, 2, null), h.d.BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND, StripeException.INSTANCE.b(e11), null, 4, null);
            n(args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(StripeBrowserLauncherActivity this$0, PaymentBrowserAuthContract.Args args, h.a aVar) {
        s.k(this$0, "this$0");
        s.k(args, "$args");
        this$0.p(args);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.INSTANCE;
        Intent intent = getIntent();
        s.j(intent, "getIntent(...)");
        PaymentBrowserAuthContract.Args argsA = companion.a(intent);
        if (argsA != null) {
            if (q().g()) {
                p(argsA);
                return;
            } else {
                r(argsA);
                return;
            }
        }
        finish();
        h.Companion companion2 = h.INSTANCE;
        Context applicationContext = getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        h.b.a(h.Companion.b(companion2, applicationContext, null, 2, null), h.d.BROWSER_LAUNCHER_NULL_ARGS, null, null, 6, null);
    }
}
