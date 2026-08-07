package on;

import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;
import sn0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lon/a;", "", "<init>", "()V", "", ImagesContract.URL, "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "a", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "Lokhttp3/OkHttpClient;", "b", "Lokhttp3/OkHttpClient;", "client", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98180a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static OkHttpClient client;

    /* JADX INFO: renamed from: on.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"on/a$a", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "Ljn0/h0;", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2110a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InspectorNetworkRequestListener f98182a;

        C2110a(InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            this.f98182a = inspectorNetworkRequestListener;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            s.k(call, "call");
            s.k(e11, "e");
            if (call.getCanceled()) {
                return;
            }
            this.f98182a.onError(e11.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            s.k(call, "call");
            s.k(response, "response");
            Headers headers = response.getHeaders();
            HashMap map = new HashMap();
            for (String str : headers.names()) {
                map.put(str, headers.get(str));
            }
            this.f98182a.onHeaders(response.getCode(), map);
            try {
                ResponseBody body = response.getBody();
                InspectorNetworkRequestListener inspectorNetworkRequestListener = this.f98182a;
                if (body != null) {
                    try {
                        InputStream inputStreamByteStream = body.byteStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                int i11 = inputStreamByteStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                } else {
                                    inspectorNetworkRequestListener.onData(new String(bArr, 0, i11, d.UTF_8));
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    b.a(inputStreamByteStream, th2);
                                    throw th3;
                                }
                            }
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                b.a(body, th);
                                throw th4;
                            }
                        }
                        h0 h0Var = h0.f84049a;
                        b.a(inputStreamByteStream, null);
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                inspectorNetworkRequestListener.onCompletion();
                h0 h0Var2 = h0.f84049a;
                b.a(body, null);
            } catch (IOException e11) {
                this.f98182a.onError(e11.getMessage());
            }
        }
    }

    private a() {
    }

    public static final void a(String url, InspectorNetworkRequestListener listener) {
        s.k(url, "url");
        s.k(listener, "listener");
        if (client == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            client = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
        }
        try {
            Request requestBuild = new Request.Builder().url(url).build();
            OkHttpClient okHttpClient = client;
            if (okHttpClient == null) {
                s.B("client");
                okHttpClient = null;
            }
            FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(requestBuild), new C2110a(listener));
        } catch (IllegalArgumentException unused) {
            listener.onError("Not a valid URL: " + url);
        }
    }
}
