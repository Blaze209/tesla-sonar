package z50;

import android.app.Application;
import com.stripe.android.core.exception.StripeException;
import ezvcard.property.Kind;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import w30.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/app/Application;", Kind.APPLICATION, "Lr30/a;", "c", "(Landroid/app/Application;)Lr30/a;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {
    public static final r30.a c(Application application) {
        s.k(application, "application");
        CoroutineDispatcher io2 = Dispatchers.getIO();
        return new r30.a(new r30.c(application, io2), new r30.b(application), new r(io2, null, null, 0, null, 30, null), new r30.n() { // from class: z50.f
            @Override // r30.n
            public final void b(StripeException stripeException) {
                h.d(stripeException);
            }
        }, io2, new r30.m() { // from class: z50.g
            @Override // r30.m
            public final boolean a() {
                return h.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(StripeException it) {
        s.k(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e() {
        return true;
    }
}
