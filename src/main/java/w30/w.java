package w30;

import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"", "", "a", "Ljava/lang/Iterable;", "()Ljava/lang/Iterable;", "DEFAULT_RETRY_CODES", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Iterable<Integer> f120696a = new bo0.j(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429);

    public static final Iterable<Integer> a() {
        return f120696a;
    }
}
