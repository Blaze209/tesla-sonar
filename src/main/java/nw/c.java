package nw;

import com.google.firebase.perf.util.l;
import lw.h;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes5.dex */
public class c<T> implements ResponseHandler<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ResponseHandler<? extends T> f95484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f95485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f95486c;

    public c(ResponseHandler<? extends T> responseHandler, l lVar, h hVar) {
        this.f95484a = responseHandler;
        this.f95485b = lVar;
        this.f95486c = hVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) {
        this.f95486c.x(this.f95485b.c());
        this.f95486c.l(httpResponse.getStatusLine().getStatusCode());
        Long lA = d.a(httpResponse);
        if (lA != null) {
            this.f95486c.v(lA.longValue());
        }
        String strB = d.b(httpResponse);
        if (strB != null) {
            this.f95486c.u(strB);
        }
        this.f95486c.b();
        return this.f95484a.handleResponse(httpResponse);
    }
}
