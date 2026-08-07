package expo.modules.fetch;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.c0;
import okio.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lexpo/modules/fetch/OkHttpFileUrlInterceptor;", "Lokhttp3/Interceptor;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Ljava/lang/ref/WeakReference;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "restoreFileUrl", "", ImagesContract.URL, "Lokhttp3/HttpUrl;", "createFileNotFoundResponse", "request", "Lokhttp3/Request;", "createMediaType", "Lokhttp3/MediaType;", "fileName", "createAssetResponseBody", "Lokhttp3/ResponseBody;", "Companion", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkHttpFileUrlInterceptor implements Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final WeakReference<Context> context;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;", "", "<init>", "()V", "handleFileUrl", "Ljava/net/URL;", ImagesContract.URL, "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URL handleFileUrl(URL url) {
            s.k(url, "url");
            if (!s.f(url.getProtocol(), Action.FILE_ATTRIBUTE)) {
                return url;
            }
            return new URL("http://filesystem.local" + url.getPath());
        }

        private Companion() {
        }
    }

    public OkHttpFileUrlInterceptor(Context context) {
        s.k(context, "context");
        this.context = new WeakReference<>(context);
    }

    private final Response createFileNotFoundResponse(Request request) {
        return new Response.Builder().request(request).protocol(Protocol.HTTP_1_1).code(404).message("File not found").body(ResponseBody.INSTANCE.create("File not found", MediaType.INSTANCE.get("text/plain"))).build();
    }

    private final MediaType createMediaType(String fileName) {
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(fileName);
        if (strGuessContentTypeFromName == null) {
            strGuessContentTypeFromName = "application/octet-stream";
        }
        MediaType.Companion companion = MediaType.INSTANCE;
        MediaType mediaType = companion.parse(strGuessContentTypeFromName);
        return mediaType == null ? companion.get("application/octet-stream") : mediaType;
    }

    private final String restoreFileUrl(HttpUrl url) {
        return t.X(url.getUrl(), "http://filesystem.local", "file://", false, 4, null);
    }

    public final ResponseBody createAssetResponseBody(Context context, String fileName) throws IOException {
        s.k(context, "context");
        s.k(fileName, "fileName");
        InputStream inputStreamOpen = context.getAssets().open(fileName);
        s.j(inputStreamOpen, "open(...)");
        return ResponseBody.Companion.create$default(ResponseBody.INSTANCE, c0.d(c0.m(inputStreamOpen)), createMediaType(fileName), 0L, 2, null);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws FetchAndroidContextLostException {
        s.k(chain, "chain");
        Request request = chain.request();
        String strRestoreFileUrl = restoreFileUrl(request.url());
        if (!t.b0(strRestoreFileUrl, "file://", false, 2, null)) {
            return chain.proceed(request);
        }
        if (t.b0(strRestoreFileUrl, "file:///android_asset/", false, 2, null)) {
            String strT0 = t.T0(strRestoreFileUrl, "file:///android_asset/");
            Context context = this.context.get();
            if (context == null) {
                throw new FetchAndroidContextLostException();
            }
            try {
                return new Response.Builder().request(request).protocol(Protocol.HTTP_1_1).code(200).message("OK").body(createAssetResponseBody(context, strT0)).build();
            } catch (IOException unused) {
                return createFileNotFoundResponse(request);
            }
        }
        String strSubstring = strRestoreFileUrl.substring(7);
        s.j(strSubstring, "substring(...)");
        File file = new File(strSubstring);
        if (!file.exists()) {
            return createFileNotFoundResponse(request);
        }
        ResponseBody.Companion companion = ResponseBody.INSTANCE;
        j jVarD = c0.d(c0.l(file));
        String name = file.getName();
        s.j(name, "getName(...)");
        return new Response.Builder().request(request).protocol(Protocol.HTTP_1_1).code(200).message("OK").body(companion.create(jVarD, createMediaType(name), file.length())).build();
    }
}
