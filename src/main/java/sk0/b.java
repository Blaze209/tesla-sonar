package sk0;

import java.io.IOException;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wk0.HttpRequestData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lsk0/b;", "Lokhttp3/Callback;", "Lwk0/d;", "requestData", "Lkotlinx/coroutines/CancellableContinuation;", "Lokhttp3/Response;", "continuation", "<init>", "(Lwk0/d;Lkotlinx/coroutines/CancellableContinuation;)V", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "Ljn0/h0;", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "a", "Lwk0/d;", "b", "Lkotlinx/coroutines/CancellableContinuation;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpRequestData requestData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CancellableContinuation<Response> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public b(HttpRequestData requestData, CancellableContinuation<? super Response> continuation) {
        s.k(requestData, "requestData");
        s.k(continuation, "continuation");
        this.requestData = requestData;
        this.continuation = continuation;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e11) {
        s.k(call, "call");
        s.k(e11, "e");
        if (this.continuation.isCancelled()) {
            return;
        }
        CancellableContinuation<Response> cancellableContinuation = this.continuation;
        jn0.s.Companion companion = jn0.s.INSTANCE;
        cancellableContinuation.resumeWith(jn0.s.b(t.a(h.f(this.requestData, e11))));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        s.k(call, "call");
        s.k(response, "response");
        if (call.getCanceled()) {
            return;
        }
        this.continuation.resumeWith(jn0.s.b(response));
    }
}
