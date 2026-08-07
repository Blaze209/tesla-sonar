package io.ktor.client.plugins;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lio/ktor/utils/io/errors/IOException;", "", ImagesContract.URL, "", "timeoutMillis", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "Lwk0/c;", "request", "(Lwk0/c;)V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpRequestTimeoutException extends IOException {
    public HttpRequestTimeoutException(String url, Long l11) {
        s.k(url, "url");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        sb2.append(l11 == null ? "unknown" : l11);
        sb2.append(" ms]");
        super(sb2.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(wk0.c request) {
        s.k(request, "request");
        String strC = request.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String().c();
        f.a aVar = (f.a) request.f(f.INSTANCE);
        this(strC, aVar != null ? aVar.get_requestTimeoutMillis() : null);
    }
}
