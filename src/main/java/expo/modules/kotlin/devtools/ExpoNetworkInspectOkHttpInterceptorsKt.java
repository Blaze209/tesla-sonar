package expo.modules.kotlin.devtools;

import java.io.EOFException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.c0;
import okio.h;
import okio.j;
import okio.u;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"TAG", "", "delegate", "Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "getDelegate", "()Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "peekResponseBody", "Lokhttp3/ResponseBody;", "response", "Lokhttp3/Response;", "byteCount", "", "shouldParseBody", "", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExpoNetworkInspectOkHttpInterceptorsKt {
    private static final String TAG = "ExpoNetworkInspector";
    private static final ExpoNetworkInspectOkHttpInterceptorsDelegate delegate = ExpoRequestCdpInterceptor.INSTANCE;

    public static final ExpoNetworkInspectOkHttpInterceptorsDelegate getDelegate() {
        return delegate;
    }

    public static final ResponseBody peekResponseBody(Response response, long j11) throws EOFException {
        s.k(response, "response");
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return null;
        }
        j jVarPeek = responseBodyBody.getBodySource().peek();
        try {
            if (jVarPeek.request(1 + j11)) {
                return null;
            }
        } catch (IOException unused) {
        }
        if (t.M(Response.header$default(response, "Content-Encoding", null, 2, null), "gzip", true)) {
            jVarPeek = c0.d(new u(jVarPeek));
            jVarPeek.request(j11);
        }
        h hVar = new h();
        hVar.y0(jVarPeek, Math.min(j11, jVarPeek.getBufferField().getSize()));
        return ResponseBody.INSTANCE.create(hVar, responseBodyBody.get$contentType(), hVar.getSize());
    }

    public static /* synthetic */ ResponseBody peekResponseBody$default(Response response, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1048576;
        }
        return peekResponseBody(response, j11);
    }

    public static final boolean shouldParseBody(Response response) {
        s.k(response, "response");
        List listP = v.p("text/event-stream", "text/x-component", MediaStreamTrack.AUDIO_TRACK_KIND, MediaStreamTrack.VIDEO_TRACK_KIND);
        String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
        if (strHeader$default == null) {
            strHeader$default = "";
        }
        List list = listP;
        boolean z11 = list instanceof Collection;
        if (!z11 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (t.b0(strHeader$default, (String) it.next(), false, 2, null)) {
                    return false;
                }
            }
        }
        String strHeader = response.request().header("Accept");
        String str = strHeader != null ? strHeader : "";
        if (!z11 || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (t.b0(str, (String) it2.next(), false, 2, null)) {
                    return false;
                }
            }
        }
        if (t.M("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) {
            return false;
        }
        String strHeader$default2 = Response.header$default(response, "Content-Length", null, 2, null);
        long j11 = strHeader$default2 != null ? Long.parseLong(strHeader$default2) : -1L;
        return j11 < 1 || j11 <= 1048576;
    }
}
