package expo.modules.fetch;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.net.URL;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/fetch/NativeRequest;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/fetch/NativeResponse;", "response", "<init>", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/fetch/NativeResponse;)V", "Lokhttp3/OkHttpClient;", "client", "Ljava/net/URL;", ImagesContract.URL, "Lexpo/modules/fetch/NativeRequestInit;", "requestInit", "", "requestBody", "Ljn0/h0;", "start", "(Lokhttp3/OkHttpClient;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V", "cancel", "()V", "Lexpo/modules/fetch/NativeResponse;", "getResponse$expo_release", "()Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/fetch/RequestHolder;", "requestHolder", "Lexpo/modules/fetch/RequestHolder;", "Lokhttp3/Call;", "task", "Lokhttp3/Call;", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeRequest extends SharedObject {
    private final RequestHolder requestHolder;
    private final NativeResponse response;
    private Call task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeRequest(AppContext appContext, NativeResponse response) {
        super(appContext);
        s.k(appContext, "appContext");
        s.k(response, "response");
        this.response = response;
        this.requestHolder = new RequestHolder(null);
    }

    public final void cancel() {
        Call call = this.task;
        if (call == null) {
            return;
        }
        call.cancel();
        this.response.emitRequestCanceled();
    }

    /* JADX INFO: renamed from: getResponse$expo_release, reason: from getter */
    public final NativeResponse getResponse() {
        return this.response;
    }

    public final void start(OkHttpClient client, URL url, NativeRequestInit requestInit, byte[] requestBody) {
        s.k(client, "client");
        s.k(url, "url");
        s.k(requestInit, "requestInit");
        if (requestInit.getCredentials() != NativeRequestCredentials.INCLUDE) {
            client = client.newBuilder().cookieJar(CookieJar.NO_COOKIES).build();
        }
        Headers headers = RequestUtilsKt.toHeaders(requestInit.getHeaders());
        String str = headers.get("Content-Type");
        Request requestBuild = new Request.Builder().headers(headers).method(requestInit.getMethod(), requestBody != null ? RequestBody.Companion.create$default(RequestBody.INSTANCE, requestBody, str != null ? MediaType.INSTANCE.parse(str) : null, 0, 0, 6, (Object) null) : null).url(OkHttpFileUrlInterceptor.INSTANCE.handleFileUrl(url)).build();
        this.requestHolder.setRequest(requestBuild);
        Call callNewCall = client.newCall(requestBuild);
        this.task = callNewCall;
        if (callNewCall != null) {
            FirebasePerfOkHttpClient.enqueue(callNewCall, this.response);
        }
        this.response.onStarted();
    }
}
