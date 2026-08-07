package k70;

import android.app.Application;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements qj0.e<t80.n> {
    public static t80.n a(z zVar, Application application, Stripe3ds2TransactionContract.Args args, CoroutineContext coroutineContext) {
        return (t80.n) qj0.h.d(zVar.a(application, args, coroutineContext));
    }
}
