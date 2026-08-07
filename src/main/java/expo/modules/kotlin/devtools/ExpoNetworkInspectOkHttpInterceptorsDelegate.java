package expo.modules.kotlin.devtools;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "", "", "requestId", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "redirectResponse", "Ljn0/h0;", "willSendRequest", "(Ljava/lang/String;Lokhttp3/Request;Lokhttp3/Response;)V", "response", "Lokhttp3/ResponseBody;", "body", "didReceiveResponse", "(Ljava/lang/String;Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/ResponseBody;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ExpoNetworkInspectOkHttpInterceptorsDelegate {
    void didReceiveResponse(String requestId, Request request, Response response, ResponseBody body);

    void willSendRequest(String requestId, Request request, Response redirectResponse);
}
