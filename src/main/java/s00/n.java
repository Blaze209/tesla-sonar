package s00;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.reactnativecompressor.Utils.UploaderOkHttpNullException;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0010*\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010#\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010:\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010?\u001a\u00020;8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010F\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00107¨\u0006G"}, d2 = {"Ls00/n;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", ImagesContract.URL, "fileUriString", "Ls00/p;", "options", "Ls00/k;", "decorator", "Lokhttp3/Request;", "f", "(Ljava/lang/String;Ljava/lang/String;Ls00/p;Ls00/k;)Lokhttp3/Request;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lokhttp3/RequestBody;", "e", "(Ls00/p;Ls00/k;Ljava/io/File;)Lokhttp3/RequestBody;", "Landroid/net/Uri;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/net/Uri;)V", "k", "(Landroid/net/Uri;)Ljava/io/File;", "Lokhttp3/Headers;", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "l", "(Lokhttp3/Headers;)Lcom/facebook/react/bridge/ReadableMap;", "_options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "m", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/bridge/Promise;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/io/File;)Ljava/lang/String;", "uuid", "", "shouldCancelAll", "c", "(Ljava/lang/String;Z)V", "a", "Lcom/facebook/react/bridge/ReactApplicationContext;", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "TAG", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "setClient", "(Lokhttp3/OkHttpClient;)V", "client", "", "J", "h", "()J", "MIN_EVENT_DT_MS", "Ls00/g;", "Ls00/g;", "getHttpCallManager", "()Ls00/g;", "httpCallManager", IntegerTokenConverter.CONVERTER_KEY, "okHttpClient", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private OkHttpClient client;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long MIN_EVENT_DT_MS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g httpCallManager;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109333a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.BINARY_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.MULTIPART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f109333a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"s00/n$b", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "Ljn0/h0;", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f109335b;

        b(Promise promise) {
            this.f109335b = promise;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            s.k(call, "call");
            s.k(e11, "e");
            Log.e(n.this.getTAG(), String.valueOf(e11.getMessage()));
            this.f109335b.reject(n.this.getTAG(), e11.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            s.k(call, "call");
            s.k(response, "response");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt(PermissionsResponse.STATUS_KEY, response.code());
            ResponseBody responseBodyBody = response.body();
            writableMapCreateMap.putString("body", responseBodyBody != null ? responseBodyBody.string() : null);
            writableMapCreateMap.putMap("headers", n.this.l(response.headers()));
            response.close();
            this.f109335b.resolve(writableMapCreateMap);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"s00/n$c", "Ls00/b;", "", "bytesWritten", "contentLength", "Ljn0/h0;", "onProgress", "(JJ)V", "a", "J", "mLastUpdate", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements s00.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long mLastUpdate = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f109338c;

        c(String str) {
            this.f109338c = str;
        }

        @Override // s00.b
        public void onProgress(long bytesWritten, long contentLength) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > this.mLastUpdate + n.this.getMIN_EVENT_DT_MS() || bytesWritten == contentLength) {
                this.mLastUpdate = jCurrentTimeMillis;
                f.INSTANCE.g(bytesWritten, contentLength, this.f109338c);
            }
        }
    }

    public n(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.TAG = "asyncTaskUploader";
        this.MIN_EVENT_DT_MS = 100L;
        this.httpCallManager = new g();
    }

    private final void d(Uri uri) throws IOException {
        File fileK = k(uri);
        if (fileK.exists()) {
            return;
        }
        throw new IOException("Directory for '" + fileK.getPath() + "' doesn't exist.");
    }

    @SuppressLint({"NewApi"})
    private final RequestBody e(UploaderOptions options, k decorator, File file) {
        String strG;
        int i11 = a.f109333a[options.getUploadType().ordinal()];
        if (i11 == 1) {
            String mimeType = options.getMimeType();
            if (mimeType == null || mimeType.length() <= 0) {
                strG = g(this.reactContext, file);
                if (strG == null) {
                    strG = "application/octet-stream";
                }
            } else {
                strG = options.getMimeType();
            }
            return decorator.decorate(RequestBody.INSTANCE.create(file, strG != null ? MediaType.INSTANCE.parse(strG) : null));
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
        Map<String, String> mapE = options.e();
        if (mapE != null) {
            for (Map.Entry<String, String> entry : mapE.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue().toString());
            }
        }
        String mimeType2 = options.getMimeType();
        if (mimeType2 == null) {
            mimeType2 = URLConnection.guessContentTypeFromName(file.getName());
            s.j(mimeType2, "guessContentTypeFromName(...)");
        }
        String fieldName = options.getFieldName();
        if (fieldName == null) {
            fieldName = file.getName();
        }
        s.h(fieldName);
        type.addFormDataPart(fieldName, file.getName(), decorator.decorate(RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(mimeType2))));
        return type.build();
    }

    private final Request f(String url, String fileUriString, UploaderOptions options, k decorator) throws IOException {
        Uri uri = Uri.parse(q.f109347a.j(fileUriString));
        s.h(uri);
        d(uri);
        Request.Builder builderUrl = new Request.Builder().url(url);
        Map<String, String> mapB = options.b();
        if (mapB != null) {
            for (Map.Entry<String, String> entry : mapB.entrySet()) {
                builderUrl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return builderUrl.method(options.getHttpMethod().getValue(), e(options, decorator, k(uri))).build();
    }

    private final synchronized OkHttpClient i() {
        try {
            if (this.client == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.client = builder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.client;
    }

    private final File k(Uri uri) throws IOException {
        if (uri.getPath() != null) {
            String path = uri.getPath();
            s.h(path);
            return new File(path);
        }
        throw new IOException("Invalid Uri: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMap l(Headers headers) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strName = headers.name(i11);
            if (writableMapCreateMap.hasKey(strName)) {
                writableMapCreateMap.putString(strName, writableMapCreateMap.getString(strName) + ", " + headers.value(i11));
            } else {
                writableMapCreateMap.putString(strName, headers.value(i11));
            }
        }
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestBody n(s00.b bVar, RequestBody requestBody) {
        s.k(requestBody, "requestBody");
        return new s00.a(requestBody, bVar);
    }

    public final void c(String uuid, boolean shouldCancelAll) {
        s.k(uuid, "uuid");
        if (shouldCancelAll) {
            this.httpCallManager.a();
            return;
        }
        if (s.f(uuid, "")) {
            Call callD = this.httpCallManager.d();
            if (callD != null) {
                callD.cancel();
                return;
            }
            return;
        }
        Call callE = this.httpCallManager.e(uuid);
        if (callE != null) {
            callE.cancel();
        }
    }

    public final String g(ReactApplicationContext context, File file) {
        String fileExtensionFromUrl;
        s.k(context, "context");
        s.k(file, "file");
        ContentResolver contentResolver = context.getContentResolver();
        s.j(contentResolver, "getContentResolver(...)");
        Uri uriFromFile = Uri.fromFile(file);
        String type = contentResolver.getType(uriFromFile);
        if (type != null || (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString())) == null) {
            return type;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMIN_EVENT_DT_MS() {
        return this.MIN_EVENT_DT_MS;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }

    public final void m(String fileUriString, ReadableMap _options, ReactApplicationContext reactContext, Promise promise) throws IOException {
        s.k(fileUriString, "fileUriString");
        s.k(_options, "_options");
        s.k(reactContext, "reactContext");
        s.k(promise, "promise");
        UploaderOptions uploaderOptionsA = o.a(_options);
        String url = uploaderOptionsA.getUrl();
        String uuid = uploaderOptionsA.getUuid();
        final c cVar = new c(uuid);
        Request requestF = f(url, fileUriString, uploaderOptionsA, new k() { // from class: s00.m
            @Override // s00.k
            public final RequestBody decorate(RequestBody requestBody) {
                return n.n(cVar, requestBody);
            }
        });
        OkHttpClient okHttpClientI = i();
        if (okHttpClientI == null) {
            promise.reject(new UploaderOkHttpNullException());
            return;
        }
        Call callNewCall = okHttpClientI.newCall(requestF);
        this.httpCallManager.b(callNewCall, uuid);
        FirebasePerfOkHttpClient.enqueue(callNewCall, new b(promise));
    }
}
