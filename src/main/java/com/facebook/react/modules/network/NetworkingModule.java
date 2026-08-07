package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.c0;
import okio.u;

/* JADX INFO: loaded from: classes3.dex */
@xn.a(name = "Networking")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static com.facebook.react.modules.network.b customClientBuilder;
    private final OkHttpClient mClient;
    private final com.facebook.react.modules.network.d mCookieHandler;
    private final com.facebook.react.modules.network.a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<d> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<e> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<f> mUriHandlers;

    class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f22811a = System.nanoTime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f22813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22814d;

        a(String str, ReactApplicationContext reactApplicationContext, int i11) {
            this.f22812b = str;
            this.f22813c = reactApplicationContext;
            this.f22814d = i11;
        }

        @Override // com.facebook.react.modules.network.j
        public void a(long j11, long j12, boolean z11) {
            long jNanoTime = System.nanoTime();
            if ((z11 || NetworkingModule.shouldDispatch(jNanoTime, this.f22811a)) && !this.f22812b.equals("text")) {
                p.c(this.f22813c, this.f22814d, j11, j12);
                this.f22811a = jNanoTime;
            }
        }
    }

    class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f22817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f22819d;

        b(int i11, ReactApplicationContext reactApplicationContext, String str, boolean z11) {
            this.f22816a = i11;
            this.f22817b = reactApplicationContext;
            this.f22818c = str;
            this.f22819d = z11;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            String message;
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f22816a);
            if (iOException.getMessage() != null) {
                message = iOException.getMessage();
            } else {
                message = "Error while executing request: " + iOException.getClass().getSimpleName();
            }
            p.f(this.f22817b, this.f22816a, message, iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f22816a);
            p.h(this.f22817b, this.f22816a, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().getUrl());
            try {
                ResponseBody responseBodyBody = response.body();
                if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && responseBodyBody != null) {
                    u uVar = new u(responseBodyBody.getSource());
                    String strHeader = response.header("Content-Type");
                    responseBodyBody = ResponseBody.create(strHeader != null ? MediaType.parse(strHeader) : null, -1L, c0.d(uVar));
                }
                for (e eVar : NetworkingModule.this.mResponseHandlers) {
                    if (eVar.b(this.f22818c)) {
                        p.a(this.f22817b, this.f22816a, eVar.a(responseBodyBody));
                        p.g(this.f22817b, this.f22816a);
                        return;
                    }
                }
                if (this.f22819d && this.f22818c.equals("text")) {
                    NetworkingModule.this.readWithProgress(this.f22816a, responseBodyBody);
                    p.g(this.f22817b, this.f22816a);
                    return;
                }
                String strString = "";
                if (this.f22818c.equals("text")) {
                    try {
                        strString = responseBodyBody.string();
                    } catch (IOException e11) {
                        if (!response.request().method().equalsIgnoreCase("HEAD")) {
                            p.f(this.f22817b, this.f22816a, e11.getMessage(), e11);
                        }
                    }
                } else if (this.f22818c.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                    strString = Base64.encodeToString(responseBodyBody.bytes(), 2);
                }
                p.b(this.f22817b, this.f22816a, strString);
                p.g(this.f22817b, this.f22816a);
            } catch (IOException e12) {
                p.f(this.f22817b, this.f22816a, e12.getMessage(), e12);
            }
        }
    }

    class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f22821a = System.nanoTime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f22822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22823c;

        c(ReactApplicationContext reactApplicationContext, int i11) {
            this.f22822b = reactApplicationContext;
            this.f22823c = i11;
        }

        @Override // com.facebook.react.modules.network.j
        public void a(long j11, long j12, boolean z11) {
            long jNanoTime = System.nanoTime();
            if (z11 || NetworkingModule.shouldDispatch(jNanoTime, this.f22821a)) {
                p.d(this.f22822b, this.f22823c, j11, j12);
                this.f22821a = jNanoTime;
            }
        }
    }

    public interface d {
        boolean a(ReadableMap readableMap);

        RequestBody b(ReadableMap readableMap, String str);
    }

    public interface e {
        WritableMap a(ResponseBody responseBody);

        boolean b(String str);
    }

    public interface f {
        WritableMap a(Uri uri);

        boolean b(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<com.facebook.react.modules.network.f> list) {
        super(reactApplicationContext);
        this.mCookieHandler = new com.facebook.react.modules.network.d();
        this.mRequestIds = new HashSet();
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        this.mShuttingDown = false;
        if (list != null) {
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            Iterator<com.facebook.react.modules.network.f> it = list.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addNetworkInterceptor(it.next().create());
            }
            okHttpClient = builderNewBuilder.build();
        }
        this.mClient = okHttpClient;
        if (okHttpClient.cookieJar() instanceof com.facebook.react.modules.network.a) {
            this.mCookieJarContainer = (com.facebook.react.modules.network.a) okHttpClient.cookieJar();
        } else {
            this.mCookieJarContainer = null;
        }
        this.mDefaultUserAgent = str;
    }

    private synchronized void addRequest(int i11) {
        this.mRequestIds.add(Integer.valueOf(i11));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
    }

    private synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.mRequestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.mRequestIds.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void cancelRequest(int i11) {
        nn.a.a(this.mClient, Integer.valueOf(i11));
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i11) {
        MediaType mediaType;
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            ReadableMap map = readableArray.getMap(i12);
            Headers headersExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (headersExtractHeaders == null) {
                p.f(reactApplicationContextIfActiveOrWarn, i11, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str2 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                headersExtractHeaders = headersExtractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (map.hasKey("string")) {
                builder.addPart(headersExtractHeaders, RequestBody.create(mediaType, map.getString("string")));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                p.f(reactApplicationContextIfActiveOrWarn, i11, "Unrecognized FormData part.", null);
            } else {
                if (mediaType == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i11, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string = map.getString(REQUEST_BODY_KEY_URI);
                InputStream inputStreamH = o.h(getReactApplicationContext(), string);
                if (inputStreamH == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i11, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(headersExtractHeaders, o.c(mediaType, inputStreamH));
            }
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableArray array = readableArray.getArray(i11);
            if (array != null && array.size() == 2) {
                String strA = com.facebook.react.modules.network.e.a(array.getString(0));
                String string = array.getString(1);
                if (strA != null && string != null) {
                    builder.addUnsafeNonAscii(strA, string);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey("string")) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Response lambda$sendRequestInternal$0(String str, ReactApplicationContext reactApplicationContext, int i11, Interceptor.Chain chain) {
        Response responseProceed = chain.proceed(chain.request());
        return responseProceed.newBuilder().body(new l(responseProceed.body(), new a(str, reactApplicationContext, i11))).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(int i11, ResponseBody responseBody) throws IOException {
        long jT;
        long j11;
        long j12;
        m mVar;
        InputStream inputStreamByteStream;
        byte[] bArr;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        long contentLength = -1;
        try {
            try {
                l lVar = (l) responseBody;
                jT = lVar.t();
                try {
                    contentLength = lVar.getContentLength();
                    while (true) {
                        int i12 = inputStreamByteStream.read(bArr);
                        if (i12 == -1) {
                            inputStreamByteStream.close();
                            return;
                        } else {
                            int i13 = i11;
                            p.e(reactApplicationContextIfActiveOrWarn, i13, mVar.a(bArr, i12), j12, j11);
                            i11 = i13;
                        }
                    }
                } catch (ClassCastException unused) {
                }
            } catch (ClassCastException unused2) {
                jT = -1;
            }
            bArr = new byte[8192];
            reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        } catch (Throwable th2) {
            inputStreamByteStream.close();
            throw th2;
        }
        j11 = contentLength;
        j12 = jT;
        mVar = new m(responseBody.get$contentType() == null ? StandardCharsets.UTF_8 : responseBody.get$contentType().charset(StandardCharsets.UTF_8));
        inputStreamByteStream = responseBody.byteStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i11) {
        this.mRequestIds.remove(Integer.valueOf(i11));
    }

    public static void setCustomClientBuilder(com.facebook.react.modules.network.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j11, long j12) {
        return j12 + 100000000 < j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < headers.size(); i11++) {
            String strName = headers.name(i11);
            if (bundle.containsKey(strName)) {
                bundle.putString(strName, bundle.getString(strName) + ", " + headers.value(i11));
            } else {
                bundle.putString(strName, headers.value(i11));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, int i11) {
        if (requestBody == null) {
            return null;
        }
        return o.e(requestBody, new c(getReactApplicationContextIfActiveOrWarn(), i11));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d11) {
        int i11 = (int) d11;
        cancelRequest(i11);
        removeRequest(i11);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(d dVar) {
        this.mRequestBodyHandlers.add(dVar);
    }

    public void addResponseHandler(e eVar) {
        this.mResponseHandlers.add(eVar);
    }

    public void addUriHandler(f fVar) {
        this.mUriHandlers.add(fVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
        this.mCookieHandler.d(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        com.facebook.react.modules.network.a aVar = this.mCookieJarContainer;
        if (aVar != null) {
            aVar.b(new JavaNetCookieJar(this.mCookieHandler));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.f();
        com.facebook.react.modules.network.a aVar = this.mCookieJarContainer;
        if (aVar != null) {
            aVar.a();
        }
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d11) {
    }

    public void removeRequestBodyHandler(d dVar) {
        this.mRequestBodyHandlers.remove(dVar);
    }

    public void removeResponseHandler(e eVar) {
        this.mResponseHandlers.remove(eVar);
    }

    public void removeUriHandler(f fVar) {
        this.mUriHandlers.remove(fVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d11, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z11, double d12, boolean z12) {
        int i11 = (int) d11;
        try {
            sendRequestInternal(str, str2, i11, readableArray, readableMap, str3, z11, (int) d12, z12);
        } catch (Throwable th2) {
            qk.a.n("Networking", "Failed to send url request: " + str2, th2);
            p.f(getReactApplicationContextIfActiveOrWarn(), i11, th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    public void sendRequestInternal(String str, String str2, final int i11, ReadableArray readableArray, ReadableMap readableMap, final String str3, boolean z11, int i12, boolean z12) {
        d next;
        RequestBody requestBodyG;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri uri = Uri.parse(str2);
            for (f fVar : this.mUriHandlers) {
                if (fVar.b(uri, str3)) {
                    p.a(reactApplicationContextIfActiveOrWarn, i11, fVar.a(uri));
                    p.g(reactApplicationContextIfActiveOrWarn, i11);
                    return;
                }
            }
            try {
                Request.Builder builderUrl = new Request.Builder().url(str2);
                if (i11 != 0) {
                    builderUrl.tag(Integer.valueOf(i11));
                }
                OkHttpClient.Builder builderNewBuilder = this.mClient.newBuilder();
                applyCustomBuilder(builderNewBuilder);
                if (!z12) {
                    builderNewBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z11) {
                    builderNewBuilder.addNetworkInterceptor(new Interceptor() { // from class: com.facebook.react.modules.network.g
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) {
                            return this.f22829a.lambda$sendRequestInternal$0(str3, reactApplicationContextIfActiveOrWarn, i11, chain);
                        }
                    });
                }
                if (i12 != this.mClient.callTimeoutMillis()) {
                    builderNewBuilder.callTimeout(i12, TimeUnit.MILLISECONDS);
                }
                OkHttpClient okHttpClientBuild = builderNewBuilder.build();
                Headers headersExtractHeaders = extractHeaders(readableArray, readableMap);
                if (headersExtractHeaders == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i11, "Unrecognized headers format", null);
                    return;
                }
                String str4 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = headersExtractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                builderUrl.headers(headersExtractHeaders);
                if (readableMap == null) {
                    next = null;
                    break;
                }
                Iterator<d> it = this.mRequestBodyHandlers.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.a(readableMap));
                if (readableMap != null) {
                    Locale locale = Locale.ROOT;
                    if (str.toLowerCase(locale).equals("get") || str.toLowerCase(locale).equals("head")) {
                        requestBodyG = o.g(str);
                    } else if (next != null) {
                        requestBodyG = next.b(readableMap, str4);
                    } else if (readableMap.hasKey("string")) {
                        if (str4 == null) {
                            p.f(reactApplicationContextIfActiveOrWarn, i11, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        String string = readableMap.getString("string");
                        MediaType mediaType = MediaType.parse(str4);
                        if (o.i(str5)) {
                            requestBodyG = o.d(mediaType, string);
                            if (requestBodyG == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i11, "Failed to gzip request body", null);
                                return;
                            }
                        } else {
                            requestBodyG = RequestBody.create(mediaType, string.getBytes(mediaType == null ? StandardCharsets.UTF_8 : mediaType.charset(StandardCharsets.UTF_8)));
                        }
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                        if (str4 == null) {
                            p.f(reactApplicationContextIfActiveOrWarn, i11, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        requestBodyG = RequestBody.create(MediaType.parse(str4), okio.k.c(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                        if (str4 == null) {
                            p.f(reactApplicationContextIfActiveOrWarn, i11, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                        InputStream inputStreamH = o.h(getReactApplicationContext(), string2);
                        if (inputStreamH == null) {
                            p.f(reactApplicationContextIfActiveOrWarn, i11, "Could not retrieve file for uri " + string2, null);
                            return;
                        }
                        requestBodyG = o.c(MediaType.parse(str4), inputStreamH);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                        if (str4 == null) {
                            str4 = "multipart/form-data";
                        }
                        MultipartBody.Builder builderConstructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str4, i11);
                        if (builderConstructMultipartBody == null) {
                            return;
                        } else {
                            requestBodyG = builderConstructMultipartBody.build();
                        }
                    } else {
                        requestBodyG = o.g(str);
                    }
                } else {
                    requestBodyG = o.g(str);
                }
                builderUrl.method(str, wrapRequestBodyWithProgressEmitter(requestBodyG, i11));
                addRequest(i11);
                FirebasePerfOkHttpClient.enqueue(okHttpClientBuild.newCall(builderUrl.build()), new b(i11, reactApplicationContextIfActiveOrWarn, str3, z11));
            } catch (Exception e11) {
                p.f(reactApplicationContextIfActiveOrWarn, i11, e11.getMessage(), null);
            }
        } catch (IOException e12) {
            p.f(reactApplicationContextIfActiveOrWarn, i11, e12.getMessage(), e12);
        }
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, h.b(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<com.facebook.react.modules.network.f> list) {
        this(reactApplicationContext, null, h.b(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, h.b(reactApplicationContext), null);
    }
}
