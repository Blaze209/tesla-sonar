package k70;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk70/z;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "args", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lt80/n;", "a", "(Landroid/app/Application;Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;Lkotlin/coroutines/CoroutineContext;)Lt80/n;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class z {
    public final t80.n a(Application application, Stripe3ds2TransactionContract.Args args, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        return new com.stripe.android.stripe3ds2.transaction.l(application, args.getStripeIntent().getIsLiveMode(), args.getSdkTransactionId(), args.getConfig().getUiCustomization().getUiCustomization(), args.c().getDirectoryServerEncryption().e(), args.getEnableLogging(), workContext).a();
    }
}
