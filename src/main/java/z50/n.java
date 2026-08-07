package z50;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.StripeException;
import java.util.concurrent.CancellationException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ls50/a;", "", "b", "(Ls50/a;)Z", "T", "", "a", "(Ls50/a;)Ljava/lang/Throwable;", AnalyticsAttribute.Error, "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n {
    public static final <T> Throwable a(s50.a<? extends T> aVar) {
        s.k(aVar, "<this>");
        s50.a.Fail fail = aVar instanceof s50.a.Fail ? (s50.a.Fail) aVar : null;
        if (fail != null) {
            return fail.getError();
        }
        return null;
    }

    public static final boolean b(s50.a<?> aVar) {
        s.k(aVar, "<this>");
        if (!(aVar instanceof s50.a.Fail)) {
            return false;
        }
        s50.a.Fail fail = (s50.a.Fail) aVar;
        if (fail.getError() instanceof CancellationException) {
            return true;
        }
        return (fail.getError() instanceof StripeException) && (fail.getError().getCause() instanceof CancellationException);
    }
}
