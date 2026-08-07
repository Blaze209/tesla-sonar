package bl0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbl0/h0;", "", "b", "(Lbl0/h0;)Z", "a", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i0 {
    public static final boolean a(URLProtocol uRLProtocol) {
        p013kotlin.jvm.internal.s.k(uRLProtocol, "<this>");
        return p013kotlin.jvm.internal.s.f(uRLProtocol.getName(), "https") || p013kotlin.jvm.internal.s.f(uRLProtocol.getName(), "wss");
    }

    public static final boolean b(URLProtocol uRLProtocol) {
        p013kotlin.jvm.internal.s.k(uRLProtocol, "<this>");
        return p013kotlin.jvm.internal.s.f(uRLProtocol.getName(), "ws") || p013kotlin.jvm.internal.s.f(uRLProtocol.getName(), "wss");
    }
}
