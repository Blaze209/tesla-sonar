package k60;

import com.stripe.android.core.exception.APIConnectionException;
import f30.d0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lk60/b;", "a", "(Ljava/lang/Throwable;)Lk60/b;", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final b a(Throwable th2) {
        s.k(th2, "<this>");
        if (th2 instanceof APIConnectionException) {
            return new b.FromResources(d0.f63963o0);
        }
        String localizedMessage = th2.getLocalizedMessage();
        return localizedMessage != null ? new b.Raw(localizedMessage) : new b.FromResources(d0.f63975u0);
    }
}
