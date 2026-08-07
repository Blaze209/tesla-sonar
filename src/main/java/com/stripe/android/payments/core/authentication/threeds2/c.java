package com.stripe.android.payments.core.authentication.threeds2;

import androidx.p002activity.result.ActivityResultLauncher;
import com.stripe.android.view.m;
import com.stripe.android.view.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/c;", "Lcom/stripe/android/view/m;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c extends m<Stripe3ds2TransactionContract.Args> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/c$a;", "Lcom/stripe/android/payments/core/authentication/threeds2/c;", "Lcom/stripe/android/view/n;", "host", "<init>", "(Lcom/stripe/android/view/n;)V", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "args", "Ljn0/h0;", "b", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;)V", "a", "Lcom/stripe/android/view/n;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n host;

        public a(n host) {
            s.k(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.Args args) {
            s.k(args, "args");
            this.host.b(Stripe3ds2TransactionActivity.class, args.k(), com.stripe.android.b.INSTANCE.c(args.getStripeIntent()));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/c$b;", "Lcom/stripe/android/payments/core/authentication/threeds2/c;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "launcher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "args", "Ljn0/h0;", "b", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;)V", "a", "Landroidx/activity/result/ActivityResultLauncher;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultLauncher<Stripe3ds2TransactionContract.Args> launcher;

        public b(ActivityResultLauncher<Stripe3ds2TransactionContract.Args> launcher) {
            s.k(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.Args args) {
            s.k(args, "args");
            this.launcher.b(args);
        }
    }
}
