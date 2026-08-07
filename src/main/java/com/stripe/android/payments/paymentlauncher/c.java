package com.stripe.android.payments.paymentlauncher;

import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/c;", "", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "hostActivityLauncher", "", "statusBarColor", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/Integer;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/stripe/android/payments/paymentlauncher/b$b;", "callback", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/payments/paymentlauncher/b$b;)V", "", "publishableKey", "stripeAccountId", "Lcom/stripe/android/payments/paymentlauncher/b;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/b;", "Landroidx/activity/result/ActivityResultLauncher;", "b", "Ljava/lang/Integer;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<PaymentLauncherContract.a> hostActivityLauncher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer statusBarColor;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a implements ActivityResultCallback, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.payments.paymentlauncher.b.InterfaceC0952b f52203a;

        a(com.stripe.android.payments.paymentlauncher.b.InterfaceC0952b interfaceC0952b) {
            this.f52203a = interfaceC0952b;
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.payments.paymentlauncher.a p11) {
            s.k(p11, "p0");
            this.f52203a.a(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p(1, this.f52203a, com.stripe.android.payments.paymentlauncher.b.InterfaceC0952b.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f52204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f52204c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f52204c;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class C0953c extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f52205c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0953c(String str) {
            super(0);
            this.f52205c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f52205c;
        }
    }

    public c(ActivityResultLauncher<PaymentLauncherContract.a> hostActivityLauncher, Integer num) {
        s.k(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
        this.statusBarColor = num;
    }

    public final com.stripe.android.payments.paymentlauncher.b a(String publishableKey, String stripeAccountId) {
        s.k(publishableKey, "publishableKey");
        Set setC = d1.c("PaymentLauncher");
        return new g(new b(publishableKey), new C0953c(stripeAccountId), this.hostActivityLauncher, this.statusBarColor, false, false, setC);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Fragment fragment, com.stripe.android.payments.paymentlauncher.b.InterfaceC0952b callback) {
        s.k(fragment, "fragment");
        s.k(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new PaymentLauncherContract(), new a(callback));
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        Window window = fragment.requireActivity().getWindow();
        this((ActivityResultLauncher<PaymentLauncherContract.a>) activityResultLauncherRegisterForActivityResult, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
    }
}
