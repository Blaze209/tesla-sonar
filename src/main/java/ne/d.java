package ne;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.HttpException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.ErrorResponseBody;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u0013*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JH\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 ¨\u0006!"}, d2 = {"Lne/d;", "Lne/a;", "Lokhttp3/OkHttpClient;", "client", "", "baseUrl", "", "defaultHeaders", "<init>", "(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/util/Map;)V", "path", "queryParameters", "b", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lokhttp3/Request;", "request", "", DateTokenConverter.CONVERTER_KEY, "(Lokhttp3/Request;)[B", "Lokhttp3/Headers;", "c", "(Ljava/util/Map;)Lokhttp3/Headers;", "Lokhttp3/Response;", "Lcom/adyen/checkout/core/exception/HttpException;", "e", "(Lokhttp3/Response;)Lcom/adyen/checkout/core/exception/HttpException;", "jsonBody", "headers", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "Ljava/lang/String;", "Ljava/util/Map;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final MediaType f93895e = MediaType.INSTANCE.get("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient client;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String baseUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> defaultHeaders;

    public d(OkHttpClient client, String baseUrl, Map<String, String> defaultHeaders) {
        s.k(client, "client");
        s.k(baseUrl, "baseUrl");
        s.k(defaultHeaders, "defaultHeaders");
        this.client = client;
        this.baseUrl = baseUrl;
        this.defaultHeaders = defaultHeaders;
    }

    private final String b(String path, Map<String, String> queryParameters) {
        HttpUrl.Builder builderNewBuilder;
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(this.baseUrl + path);
        if (httpUrl == null || (builderNewBuilder = httpUrl.newBuilder()) == null) {
            throw new CheckoutException("Failed to parse URL.", null, 2, null);
        }
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            builderNewBuilder.addQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderNewBuilder.toString();
    }

    private final Headers c(Map<String, String> map) {
        return Headers.INSTANCE.of(v0.r(this.defaultHeaders, map));
    }

    private final byte[] d(Request request) throws IOException {
        byte[] bArrBytes;
        Call callNewCall = this.client.newCall(request);
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(callNewCall);
            if (!responseExecute.isSuccessful()) {
                HttpException httpExceptionE = e(responseExecute);
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody == null) {
                    throw httpExceptionE;
                }
                responseBodyBody.close();
                throw httpExceptionE;
            }
            ResponseBody responseBodyBody2 = responseExecute.body();
            if (responseBodyBody2 == null || (bArrBytes = responseBodyBody2.bytes()) == null) {
                bArrBytes = new byte[0];
            }
            ResponseBody responseBodyBody3 = responseExecute.body();
            if (responseBodyBody3 != null) {
                responseBodyBody3.close();
            }
            return bArrBytes;
        } catch (CancellationException e11) {
            callNewCall.cancel();
            throw e11;
        }
    }

    private final HttpException e(Response response) {
        String strString;
        ErrorResponseBody errorResponseBody;
        String strMessage;
        Integer status;
        String str = null;
        try {
            ResponseBody responseBodyBody = response.body();
            strString = responseBodyBody != null ? responseBodyBody.string() : null;
        } catch (IOException unused) {
        }
        if (strString != null) {
            try {
                errorResponseBody = (ErrorResponseBody) ErrorResponseBody.SERIALIZER.b(new JSONObject(strString));
            } catch (ModelSerializationException | JSONException unused2) {
                errorResponseBody = null;
            }
        } else {
            errorResponseBody = null;
        }
        int iCode = (errorResponseBody == null || (status = errorResponseBody.getStatus()) == null) ? response.code() : status.intValue();
        if (errorResponseBody == null || (strMessage = errorResponseBody.getMessage()) == null) {
            if (strString != null && !t.y0(strString)) {
                str = strString;
            }
            strMessage = str == null ? response.message() : str;
        }
        return new HttpException(iCode, strMessage, errorResponseBody);
    }

    @Override // ne.a
    public Object a(String str, String str2, Map<String, String> map, Map<String, String> map2, Continuation<? super byte[]> continuation) {
        return d(new Request.Builder().headers(c(map2)).url(b(str, map)).post(RequestBody.INSTANCE.create(str2, f93895e)).build());
    }
}
