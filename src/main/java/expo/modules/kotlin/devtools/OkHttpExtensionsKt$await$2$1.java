package expo.modules.kotlin.devtools;

import java.io.IOException;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"expo/modules/kotlin/devtools/OkHttpExtensionsKt$await$2$1", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "Ljn0/h0;", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class OkHttpExtensionsKt$await$2$1 implements Callback {
    final /* synthetic */ CancellableContinuation<Response> $callback;

    /* JADX WARN: Multi-variable type inference failed */
    public OkHttpExtensionsKt$await$2$1(CancellableContinuation<? super Response> cancellableContinuation) {
        this.$callback = cancellableContinuation;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e11) {
        s.k(call, "call");
        s.k(e11, "e");
        if (this.$callback.isCancelled()) {
            return;
        }
        CancellableContinuation<Response> cancellableContinuation = this.$callback;
        jn0.s.Companion companion = jn0.s.INSTANCE;
        cancellableContinuation.resumeWith(jn0.s.b(t.a(e11)));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        s.k(call, "call");
        s.k(response, "response");
        this.$callback.resumeWith(jn0.s.b(response));
    }
}
