package com.ReactNativeBlobUtil;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public class g extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.ReactNativeBlobUtil.b f19710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f19711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f19712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f19713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f19714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f19715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f19716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ReadableArray f19717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ReadableMap f19718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Callback f19719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f19720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f19721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    com.ReactNativeBlobUtil.a f19722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    EnumC0406g f19723n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    i f19724o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    WritableMap f19726q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    OkHttpClient f19729t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f19730u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Future<?> f19733x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static HashMap<String, Call> f19709z = new HashMap<>();
    public static HashMap<String, Long> A = new HashMap<>();
    static HashMap<String, com.ReactNativeBlobUtil.f> B = new HashMap<>();
    static HashMap<String, com.ReactNativeBlobUtil.f> C = new HashMap<>();
    static ConnectionPool D = new ConnectionPool();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    h f19725p = h.Auto;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f19727r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<String> f19728s = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f19731v = 1314;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ScheduledExecutorService f19732w = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f19734y = new Handler(new a());

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1314 && message.getData().getLong("downloadManagerId") == g.this.f19721l) {
                DownloadManager downloadManager = (DownloadManager) com.ReactNativeBlobUtil.d.f19645b.getApplicationContext().getSystemService("download");
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(g.this.f19721l);
                Cursor cursorQuery = downloadManager.query(query);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    long j11 = cursorQuery.getInt(cursorQuery.getColumnIndex("bytes_so_far"));
                    long j12 = cursorQuery.getLong(cursorQuery.getColumnIndex("total_size"));
                    cursorQuery.close();
                    com.ReactNativeBlobUtil.f fVarL = g.l(g.this.f19711b);
                    float f11 = j12 > 0 ? j11 / j12 : BitmapDescriptorFactory.HUE_RED;
                    if (fVarL != null && fVarL.a(f11)) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("taskId", String.valueOf(g.this.f19711b));
                        writableMapCreateMap.putString("written", String.valueOf(j11));
                        writableMapCreateMap.putString("total", String.valueOf(j12));
                        writableMapCreateMap.putString("chunk", "");
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.ReactNativeBlobUtil.d.f19645b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
                    }
                    if (j12 == j11) {
                        g.this.f19733x.cancel(true);
                    }
                }
            }
            return true;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Message messageObtainMessage = g.this.f19734y.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putLong("downloadManagerId", g.this.f19721l);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.what = 1314;
            g.this.f19734y.sendMessage(messageObtainMessage);
        }
    }

    class c implements Interceptor {
        c() {
        }

        @Override // okhttp3.Interceptor
        @NonNull
        public Response intercept(@NonNull Interceptor.Chain chain) {
            g.this.f19728s.add(chain.request().url().getUrl());
            return chain.proceed(chain.request());
        }
    }

    class d implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Request f19738a;

        d(Request request) {
            this.f19738a = request;
        }

        @Override // okhttp3.Interceptor
        @NonNull
        public Response intercept(@NonNull Interceptor.Chain chain) {
            ResponseBody aVar;
            Response responseProceed = null;
            try {
                responseProceed = chain.proceed(this.f19738a);
                int i11 = f.f19742b[g.this.f19724o.ordinal()];
                if (i11 == 1 || i11 != 2) {
                    aVar = new bd.a(com.ReactNativeBlobUtil.d.f19645b, g.this.f19711b, responseProceed.body(), g.this.f19710a.f19636n.booleanValue());
                } else {
                    ReactApplicationContext reactApplicationContext = com.ReactNativeBlobUtil.d.f19645b;
                    String str = g.this.f19711b;
                    ResponseBody responseBodyBody = responseProceed.body();
                    g gVar = g.this;
                    aVar = new bd.b(reactApplicationContext, str, responseBodyBody, gVar.f19715f, gVar.f19710a.f19634l.booleanValue());
                }
                return responseProceed.newBuilder().body(aVar).build();
            } catch (SocketException unused) {
                g.this.f19727r = true;
                if (responseProceed != null) {
                    responseProceed.close();
                }
                return chain.proceed(chain.request());
            } catch (SocketTimeoutException unused2) {
                g.this.f19727r = true;
                if (responseProceed != null) {
                    responseProceed.close();
                }
                return chain.proceed(chain.request());
            } catch (Exception unused3) {
                if (responseProceed != null) {
                    responseProceed.close();
                }
                return chain.proceed(chain.request());
            }
        }
    }

    class e implements okhttp3.Callback {
        e() {
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            g.f(g.this.f19711b);
            g gVar = g.this;
            if (gVar.f19726q == null) {
                gVar.f19726q = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                g.this.f19726q.putBoolean("timeout", true);
                g.this.o("The request timed out.", null, null);
            } else {
                g.this.o(iOException.getLocalizedMessage(), null, null);
            }
            g.this.s();
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            ReadableMap readableMap = g.this.f19710a.f19627e;
            if (readableMap != null) {
                String string = readableMap.hasKey("title") ? g.this.f19710a.f19627e.getString("title") : "";
                String string2 = readableMap.hasKey("description") ? readableMap.getString("description") : "";
                String string3 = readableMap.hasKey("mime") ? readableMap.getString("mime") : "text/plain";
                boolean z11 = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                boolean z12 = readableMap.hasKey("notification") ? readableMap.getBoolean("notification") : false;
                DownloadManager downloadManager = (DownloadManager) com.ReactNativeBlobUtil.d.f19645b.getSystemService("download");
                g gVar = g.this;
                downloadManager.addCompletedDownload(string, string2, z11, string3, gVar.f19715f, gVar.f19720k, z12);
            }
            g.this.g(response);
        }
    }

    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19742b;

        static {
            int[] iArr = new int[i.values().length];
            f19742b = iArr;
            try {
                iArr[i.KeepInMemory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19742b[i.FileStorage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0406g.values().length];
            f19741a = iArr2;
            try {
                iArr2[EnumC0406g.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19741a[EnumC0406g.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19741a[EnumC0406g.Form.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19741a[EnumC0406g.WithoutBody.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ReactNativeBlobUtil.g$g, reason: collision with other inner class name */
    enum EnumC0406g {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    enum h {
        Auto,
        UTF8,
        BASE64
    }

    enum i {
        KeepInMemory,
        FileStorage
    }

    public g(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, OkHttpClient okHttpClient, Callback callback) {
        this.f19712c = str2.toUpperCase(Locale.ROOT);
        com.ReactNativeBlobUtil.b bVar = new com.ReactNativeBlobUtil.b(readableMap);
        this.f19710a = bVar;
        this.f19711b = str;
        this.f19713d = str3;
        this.f19718i = readableMap2;
        this.f19719j = callback;
        this.f19714e = str4;
        this.f19717h = readableArray;
        this.f19729t = okHttpClient;
        this.f19730u = false;
        if ((bVar.f19623a.booleanValue() || this.f19710a.f19625c != null) && !t()) {
            this.f19724o = i.FileStorage;
        } else {
            this.f19724o = i.KeepInMemory;
        }
        if (str4 != null) {
            this.f19723n = EnumC0406g.SingleFile;
        } else if (readableArray != null) {
            this.f19723n = EnumC0406g.Form;
        } else {
            this.f19723n = EnumC0406g.WithoutBody;
        }
    }

    public static void f(String str) {
        Call call = f19709z.get(str);
        if (call != null) {
            call.cancel();
            f19709z.remove(str);
        }
        if (A.containsKey(str)) {
            ((DownloadManager) com.ReactNativeBlobUtil.d.f19645b.getApplicationContext().getSystemService("download")).remove(A.get(str).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0141 A[Catch: IOException -> 0x01b4, TryCatch #2 {IOException -> 0x01b4, blocks: (B:41:0x0121, B:42:0x0127, B:44:0x0141, B:46:0x0151, B:49:0x0159, B:51:0x0169, B:53:0x0185, B:55:0x018b, B:56:0x019c, B:57:0x01ac, B:58:0x01b3), top: B:74:0x00f0, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0151 A[Catch: IOException -> 0x01b4, TRY_LEAVE, TryCatch #2 {IOException -> 0x01b4, blocks: (B:41:0x0121, B:42:0x0127, B:44:0x0141, B:46:0x0151, B:49:0x0159, B:51:0x0169, B:53:0x0185, B:55:0x018b, B:56:0x019c, B:57:0x01ac, B:58:0x01b3), top: B:74:0x00f0, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0159 A[Catch: IOException -> 0x01b4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x01b4, blocks: (B:41:0x0121, B:42:0x0127, B:44:0x0141, B:46:0x0151, B:49:0x0159, B:51:0x0169, B:53:0x0185, B:55:0x018b, B:56:0x019c, B:57:0x01ac, B:58:0x01b3), top: B:74:0x00f0, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ac A[Catch: IOException -> 0x01b4, TryCatch #2 {IOException -> 0x01b4, blocks: (B:41:0x0121, B:42:0x0127, B:44:0x0141, B:46:0x0151, B:49:0x0159, B:51:0x0169, B:53:0x0185, B:55:0x018b, B:56:0x019c, B:57:0x01ac, B:58:0x01b3), top: B:74:0x00f0, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void g(Response response) {
        long j11;
        byte[] bArrBytes;
        boolean zP = p(response);
        WritableMap writableMapN = n(response, zP);
        h(writableMapN.copy());
        h(n(response, zP));
        int i11 = f.f19742b[this.f19724o.ordinal()];
        long j12 = 0;
        String strString = null;
        if (i11 == 1) {
            ResponseBody responseBodyBody = response.body();
            try {
                if (zP) {
                    try {
                        if (this.f19710a.f19633k.booleanValue()) {
                            String strN = com.ReactNativeBlobUtil.c.n(this.f19711b);
                            InputStream inputStreamByteStream = response.body().byteStream();
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(strN));
                            byte[] bArr = new byte[10240];
                            while (true) {
                                int i12 = inputStreamByteStream.read(bArr);
                                long j13 = j12;
                                if (i12 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i12);
                                j12 = j13;
                            }
                            inputStreamByteStream.close();
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            o(null, "path", strN, writableMapN.copy());
                        } else {
                            j11 = 0;
                            bArrBytes = response.body().bytes();
                            if (!t()) {
                                throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
                            }
                            if (this.f19725p == h.BASE64) {
                                o(null, "base64", Base64.encodeToString(bArrBytes, 2), writableMapN.copy());
                                return;
                            }
                            try {
                                Charset charsetForName = Charset.forName("UTF-8");
                                charsetForName.newDecoder().decode(ByteBuffer.wrap(bArrBytes));
                                o(null, "utf8", new String(bArrBytes, charsetForName));
                            } catch (CharacterCodingException unused) {
                                if (this.f19725p == h.UTF8) {
                                    o(null, "utf8", new String(bArrBytes), writableMapN.copy());
                                } else {
                                    o(null, "base64", Base64.encodeToString(bArrBytes, 2), writableMapN.copy());
                                }
                            }
                        }
                    } catch (IOException unused2) {
                        j11 = j12;
                        if (responseBodyBody == null) {
                            o("ReactNativeBlobUtil failed to encode response data to BASE64 string.", writableMapN.copy());
                        } else {
                            o("ReactNativeBlobUtil failed to encode response data to BASE64 string.", writableMapN.copy());
                        }
                    }
                } else {
                    j11 = 0;
                    bArrBytes = response.body().bytes();
                    if (!t()) {
                        throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
                    }
                    if (this.f19725p == h.BASE64) {
                        o(null, "base64", Base64.encodeToString(bArrBytes, 2), writableMapN.copy());
                        return;
                    } else {
                        Charset charsetForName2 = Charset.forName("UTF-8");
                        charsetForName2.newDecoder().decode(ByteBuffer.wrap(bArrBytes));
                        o(null, "utf8", new String(bArrBytes, charsetForName2));
                    }
                }
            } catch (IOException unused3) {
                if (responseBodyBody == null && (responseBodyBody.getContentLength() == -1 || responseBodyBody.getContentLength() == j11)) {
                    o(null, "utf8", "");
                } else {
                    o("ReactNativeBlobUtil failed to encode response data to BASE64 string.", writableMapN.copy());
                }
            }
        } else if (i11 != 2) {
            try {
                o(null, "utf8", new String(response.body().bytes(), "UTF-8"), writableMapN.copy());
            } catch (IOException unused4) {
                o("ReactNativeBlobUtil failed to encode response data to UTF8 string.", writableMapN.copy());
            }
        } else {
            ResponseBody responseBodyBody2 = response.body();
            try {
                responseBodyBody2.bytes();
            } catch (Exception unused5) {
            }
            try {
                bd.b bVar = (bd.b) responseBodyBody2;
                if (bVar == null || bVar.c()) {
                    String strReplace = this.f19715f.replace("?append=true", "");
                    this.f19715f = strReplace;
                    o(null, "path", strReplace, writableMapN.copy());
                } else {
                    o("Download interrupted.", writableMapN.copy());
                }
            } catch (ClassCastException unused6) {
                if (responseBodyBody2 == null) {
                    o("Unexpected FileStorage response with no file.", writableMapN.copy());
                    return;
                }
                try {
                    boolean z11 = responseBodyBody2.getSource().getBufferField().getSize() > 0;
                    boolean z12 = responseBodyBody2.getContentLength() > 0;
                    if (z11 && z12) {
                        strString = responseBodyBody2.string();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                o("Unexpected FileStorage response file: " + strString, writableMapN.copy());
                return;
            }
        }
        response.body().close();
        s();
    }

    private void h(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.ReactNativeBlobUtil.d.f19645b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilState", writableMap);
    }

    public static OkHttpClient.Builder i(OkHttpClient.Builder builder) {
        return builder;
    }

    private String j(HashMap<String, String> map, String str) {
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = map.get(str.toLowerCase(Locale.ROOT));
        return str3 == null ? "" : str3;
    }

    private String k(Headers headers, String str) {
        String str2 = headers.get(str);
        if (str2 != null) {
            return str2;
        }
        Locale locale = Locale.ROOT;
        return headers.get(str.toLowerCase(locale)) == null ? "" : headers.get(str.toLowerCase(locale));
    }

    public static com.ReactNativeBlobUtil.f l(String str) {
        if (B.containsKey(str)) {
            return B.get(str);
        }
        return null;
    }

    public static com.ReactNativeBlobUtil.f m(String str) {
        if (C.containsKey(str)) {
            return C.get(str);
        }
        return null;
    }

    private WritableMap n(Response response, boolean z11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(PermissionsResponse.STATUS_KEY, response.code());
        writableMapCreateMap.putString("state", "2");
        writableMapCreateMap.putString("taskId", this.f19711b);
        writableMapCreateMap.putBoolean("timeout", this.f19727r);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        for (int i11 = 0; i11 < response.headers().size(); i11++) {
            writableMapCreateMap2.putString(response.headers().name(i11), response.headers().value(i11));
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<String> it = this.f19728s.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        writableMapCreateMap.putArray("redirects", writableArrayCreateArray);
        writableMapCreateMap.putMap("headers", writableMapCreateMap2);
        Headers headers = response.headers();
        if (z11) {
            writableMapCreateMap.putString("respType", "blob");
            return writableMapCreateMap;
        }
        if (k(headers, "content-type").equalsIgnoreCase("text/")) {
            writableMapCreateMap.putString("respType", "text");
            return writableMapCreateMap;
        }
        if (k(headers, "content-type").contains("application/json")) {
            writableMapCreateMap.putString("respType", "json");
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("respType", "");
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Object... objArr) {
        if (this.f19730u) {
            return;
        }
        this.f19719j.invoke(objArr);
        this.f19730u = true;
    }

    private boolean p(Response response) {
        boolean z11;
        String strK = k(response.headers(), "Content-Type");
        boolean zEqualsIgnoreCase = strK.equalsIgnoreCase("text/");
        boolean zEqualsIgnoreCase2 = strK.equalsIgnoreCase("application/json");
        if (this.f19710a.f19638p == null) {
            z11 = false;
            break;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f19710a.f19638p.size()) {
                z11 = false;
                break;
            }
            Locale locale = Locale.ROOT;
            if (strK.toLowerCase(locale).contains(this.f19710a.f19638p.getString(i11).toLowerCase(locale))) {
                z11 = true;
                break;
            }
            i11++;
        }
        return (zEqualsIgnoreCase2 && zEqualsIgnoreCase) || z11;
    }

    private boolean q(ConnectivityManager connectivityManager, Network network) {
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null || networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return networkCapabilities.hasTransport(1);
    }

    private boolean r(ConnectivityManager connectivityManager, Network network, String str) {
        Inet4Address dhcpServerAddress;
        LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
        if (linkProperties == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30 && (dhcpServerAddress = linkProperties.getDhcpServerAddress()) != null && dhcpServerAddress.getHostAddress().equals(str)) {
            return true;
        }
        List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
        if (linkAddresses != null && !linkAddresses.isEmpty()) {
            Iterator<LinkAddress> it = linkAddresses.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().getHostAddress().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (f19709z.containsKey(this.f19711b)) {
            f19709z.remove(this.f19711b);
        }
        if (A.containsKey(this.f19711b)) {
            A.remove(this.f19711b);
        }
        if (C.containsKey(this.f19711b)) {
            C.remove(this.f19711b);
        }
        if (B.containsKey(this.f19711b)) {
            B.remove(this.f19711b);
        }
        com.ReactNativeBlobUtil.a aVar = this.f19722m;
        if (aVar != null) {
            aVar.b();
        }
    }

    private boolean t() {
        if (this.f19710a.f19624b.booleanValue()) {
            return this.f19710a.f19623a.booleanValue() || this.f19710a.f19625c != null;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String string;
        Cursor cursorQuery;
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            Context applicationContext = com.ReactNativeBlobUtil.d.f19645b.getApplicationContext();
            if (intent.getExtras().getLong("extra_download_id") == this.f19721l) {
                s();
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(this.f19721l);
                DownloadManager downloadManager = (DownloadManager) applicationContext.getSystemService("download");
                downloadManager.query(query);
                Cursor cursorQuery2 = downloadManager.query(query);
                if (cursorQuery2 == null) {
                    o("Download manager failed to download from  " + this.f19713d + ". Query was unsuccessful ", null, null);
                    return;
                }
                try {
                    if (cursorQuery2.moveToFirst()) {
                        int i11 = cursorQuery2.getInt(cursorQuery2.getColumnIndex(PermissionsResponse.STATUS_KEY));
                        if (i11 == 16) {
                            o("Download manager failed to download from  " + this.f19713d + ". Status Code = " + i11, null, null);
                            cursorQuery2.close();
                            return;
                        }
                        String string2 = cursorQuery2.getString(cursorQuery2.getColumnIndex("local_uri"));
                        if (string2 == null || (cursorQuery = applicationContext.getContentResolver().query(Uri.parse(string2), new String[]{"_data"}, null, null, null)) == null) {
                            string = null;
                        } else {
                            cursorQuery.moveToFirst();
                            string = cursorQuery.getString(0);
                            cursorQuery.close();
                        }
                    } else {
                        string = null;
                    }
                    cursorQuery2.close();
                    if (this.f19710a.f19627e.hasKey("path") || this.f19710a.f19627e.hasKey("storeLocal")) {
                        try {
                            String str = this.f19716g;
                            if (!new File(str).exists()) {
                                throw new Exception("Download manager download failed, the file does not downloaded to destination.");
                            }
                            o(null, "path", str);
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            o(e11.getLocalizedMessage(), null);
                            return;
                        }
                    }
                    if (Build.VERSION.SDK_INT < 29 || !this.f19710a.f19627e.hasKey("storeInDownloads") || !this.f19710a.f19627e.getBoolean("storeInDownloads")) {
                        if (string == null) {
                            o("Download manager could not resolve downloaded file path.", "path", null);
                            return;
                        } else {
                            o(null, "path", string);
                            return;
                        }
                    }
                    Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(this.f19721l);
                    if (uriForDownloadedFile == null) {
                        o("Download manager could not resolve downloaded file uri.", "path", null);
                    } else {
                        o(null, "path", uriForDownloadedFile.toString());
                    }
                } catch (Throwable th2) {
                    cursorQuery2.close();
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Context applicationContext = com.ReactNativeBlobUtil.d.f19645b.getApplicationContext();
        ReadableMap readableMap = this.f19710a.f19627e;
        if (readableMap != null && readableMap.hasKey("useDownloadManager") && this.f19710a.f19627e.getBoolean("useDownloadManager")) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.f19713d));
            if (this.f19710a.f19627e.hasKey("notification") && this.f19710a.f19627e.getBoolean("notification")) {
                request.setNotificationVisibility(1);
            } else {
                request.setNotificationVisibility(2);
            }
            if (this.f19710a.f19627e.hasKey("title")) {
                request.setTitle(this.f19710a.f19627e.getString("title"));
            }
            if (this.f19710a.f19627e.hasKey("description")) {
                request.setDescription(this.f19710a.f19627e.getString("description"));
            }
            if (this.f19710a.f19627e.hasKey("path")) {
                String string = this.f19710a.f19627e.getString("path");
                File file = new File(string);
                File parentFile = file.getParentFile();
                if (!file.exists() && parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    o("Failed to create parent directory of '" + string + "'", null, null);
                    return;
                }
                request.setDestinationUri(Uri.parse("file://" + string));
                this.f19716g = string;
            }
            if (this.f19710a.f19627e.hasKey("storeLocal") && this.f19710a.f19627e.getBoolean("storeLocal")) {
                String str = ((String) com.ReactNativeBlobUtil.c.m(com.ReactNativeBlobUtil.d.f19645b).get("DownloadDir")) + UUID.randomUUID().toString();
                File file2 = new File(str);
                File parentFile2 = file2.getParentFile();
                if (!file2.exists() && parentFile2 != null && !parentFile2.exists() && !parentFile2.mkdirs() && !parentFile2.exists()) {
                    o("Failed to create parent directory of '" + str + "'", null, null);
                    return;
                }
                request.setDestinationUri(Uri.parse("file://" + str));
                this.f19716g = str;
            }
            if (this.f19710a.f19627e.hasKey("mime")) {
                request.setMimeType(this.f19710a.f19627e.getString("mime"));
            }
            if (this.f19710a.f19627e.hasKey("mediaScannable") && this.f19710a.f19627e.getBoolean("mediaScannable")) {
                request.allowScanningByMediaScanner();
            }
            if (Build.VERSION.SDK_INT >= 29 && this.f19710a.f19627e.hasKey("storeInDownloads") && this.f19710a.f19627e.getBoolean("storeInDownloads")) {
                String string2 = this.f19710a.f19627e.getString("title");
                if (string2 == null || string2.isEmpty()) {
                    string2 = UUID.randomUUID().toString();
                }
                String str2 = this.f19710a.f19626d;
                if (str2 != null && !str2.isEmpty()) {
                    string2 = string2 + "." + this.f19710a.f19626d;
                }
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, string2);
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.f19718i.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                request.addRequestHeader(strNextKey, this.f19718i.getString(strNextKey));
            }
            try {
                URL url = new URL(this.f19713d);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e11) {
                e11.printStackTrace();
            }
            long jEnqueue = ((DownloadManager) applicationContext.getSystemService("download")).enqueue(request);
            this.f19721l = jEnqueue;
            A.put(this.f19711b, Long.valueOf(jEnqueue));
            if (Build.VERSION.SDK_INT >= 34) {
                applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
            } else {
                applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            }
            this.f19733x = this.f19732w.scheduleAtFixedRate(new b(), 0L, 100L, TimeUnit.MILLISECONDS);
            return;
        }
        String strB = this.f19711b;
        String str3 = this.f19710a.f19626d;
        String str4 = (str3 == null || str3.isEmpty()) ? "" : "." + this.f19710a.f19626d;
        String str5 = this.f19710a.f19631i;
        if (str5 != null) {
            strB = com.ReactNativeBlobUtil.i.b(str5);
            if (strB == null) {
                strB = this.f19711b;
            }
            File file3 = new File(com.ReactNativeBlobUtil.c.n(strB) + str4);
            if (file3.exists()) {
                o(null, "path", file3.getAbsolutePath());
                return;
            }
        }
        com.ReactNativeBlobUtil.b bVar = this.f19710a;
        String str6 = bVar.f19625c;
        if (str6 != null) {
            this.f19715f = str6;
        } else if (bVar.f19623a.booleanValue()) {
            this.f19715f = com.ReactNativeBlobUtil.c.n(strB) + str4;
        }
        try {
            final OkHttpClient.Builder builderC = this.f19710a.f19628f.booleanValue() ? com.ReactNativeBlobUtil.i.c(this.f19729t) : this.f19729t.newBuilder();
            List<Interceptor> list = com.ReactNativeBlobUtil.i.f19748b;
            Objects.requireNonNull(builderC);
            list.forEach(new Consumer() { // from class: ad.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    builderC.addNetworkInterceptor((Interceptor) obj);
                }
            });
            String str7 = this.f19710a.f19630h;
            boolean z11 = (str7 == null || str7.isEmpty()) ? false : true;
            if (this.f19710a.f19629g.booleanValue()) {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.ReactNativeBlobUtil.d.f19645b.getSystemService("connectivity");
                boolean z12 = false;
                for (Network network : connectivityManager.getAllNetworks()) {
                    if (q(connectivityManager, network)) {
                        if (z11 && r(connectivityManager, network, this.f19710a.f19630h)) {
                            builderC.proxy(Proxy.NO_PROXY);
                            builderC.socketFactory(network.getSocketFactory());
                        } else if (z12) {
                            continue;
                        } else {
                            builderC.proxy(Proxy.NO_PROXY);
                            builderC.socketFactory(network.getSocketFactory());
                            if (z11) {
                                z12 = true;
                            }
                        }
                        z12 = true;
                        break;
                    }
                }
                if (!z12) {
                    o("No available WiFi connections.", null, null);
                    s();
                    return;
                }
            }
            Request.Builder builder = new Request.Builder();
            try {
                builder.url(new URL(this.f19713d));
            } catch (MalformedURLException e12) {
                e12.printStackTrace();
            }
            HashMap<String, String> map = new HashMap<>();
            ReadableMap readableMap2 = this.f19718i;
            if (readableMap2 != null) {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = readableMap2.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
                    String strNextKey2 = readableMapKeySetIteratorKeySetIterator2.nextKey();
                    String string3 = this.f19718i.getString(strNextKey2);
                    if (!strNextKey2.equalsIgnoreCase("RNFB-Response")) {
                        Locale locale = Locale.ROOT;
                        builder.header(strNextKey2.toLowerCase(locale), string3);
                        map.put(strNextKey2.toLowerCase(locale), string3);
                    } else if (string3.equalsIgnoreCase("base64")) {
                        this.f19725p = h.BASE64;
                    } else if (string3.equalsIgnoreCase("utf8")) {
                        this.f19725p = h.UTF8;
                    }
                }
            }
            if (this.f19712c.equalsIgnoreCase("post") || this.f19712c.equalsIgnoreCase("put") || this.f19712c.equalsIgnoreCase("patch") || this.f19712c.equalsIgnoreCase("delete")) {
                String strJ = j(map, "Content-Type");
                Locale locale2 = Locale.ROOT;
                String lowerCase = strJ.toLowerCase(locale2);
                if (this.f19717h != null) {
                    this.f19723n = EnumC0406g.Form;
                } else if (lowerCase == null || lowerCase.isEmpty()) {
                    if (!lowerCase.equalsIgnoreCase("")) {
                        builder.header("Content-Type", "application/octet-stream");
                    }
                    this.f19723n = EnumC0406g.SingleFile;
                }
                String str8 = this.f19714e;
                if (str8 != null) {
                    if (str8.startsWith("ReactNativeBlobUtil-file://") || this.f19714e.startsWith("ReactNativeBlobUtil-content://")) {
                        this.f19723n = EnumC0406g.SingleFile;
                    } else if (lowerCase.toLowerCase(locale2).contains(";base64") || lowerCase.toLowerCase(locale2).startsWith("application/octet")) {
                        String strReplace = lowerCase.replace(";base64", "").replace(";BASE64", "");
                        if (map.containsKey("content-type")) {
                            map.put("content-type", strReplace);
                        }
                        if (map.containsKey("Content-Type")) {
                            map.put("Content-Type", strReplace);
                        }
                        this.f19723n = EnumC0406g.SingleFile;
                    } else {
                        this.f19723n = EnumC0406g.AsIs;
                    }
                }
            } else {
                this.f19723n = EnumC0406g.WithoutBody;
            }
            boolean zEqualsIgnoreCase = j(map, "Transfer-Encoding").equalsIgnoreCase("chunked");
            int i11 = f.f19741a[this.f19723n.ordinal()];
            if (i11 == 1) {
                com.ReactNativeBlobUtil.a aVarL = new com.ReactNativeBlobUtil.a(this.f19711b).a(zEqualsIgnoreCase).m(this.f19723n).k(this.f19714e).l(MediaType.parse(j(map, "content-type")));
                this.f19722m = aVarL;
                builder.method(this.f19712c, aVarL);
            } else if (i11 == 2) {
                com.ReactNativeBlobUtil.a aVarL2 = new com.ReactNativeBlobUtil.a(this.f19711b).a(zEqualsIgnoreCase).m(this.f19723n).k(this.f19714e).l(MediaType.parse(j(map, "content-type")));
                this.f19722m = aVarL2;
                builder.method(this.f19712c, aVarL2);
            } else if (i11 == 3) {
                com.ReactNativeBlobUtil.a aVarL3 = new com.ReactNativeBlobUtil.a(this.f19711b).a(zEqualsIgnoreCase).m(this.f19723n).j(this.f19717h).l(MediaType.parse("multipart/form-data; boundary=" + ("ReactNativeBlobUtil-" + this.f19711b)));
                this.f19722m = aVarL3;
                builder.method(this.f19712c, aVarL3);
            } else if (i11 == 4) {
                if (this.f19712c.equalsIgnoreCase("post") || this.f19712c.equalsIgnoreCase("put") || this.f19712c.equalsIgnoreCase("patch") || this.f19712c.equalsIgnoreCase("delete")) {
                    builder.method(this.f19712c, RequestBody.create((MediaType) null, new byte[0]));
                } else {
                    builder.method(this.f19712c, null);
                }
            }
            Request requestBuild = builder.build();
            builderC.addNetworkInterceptor(new c());
            builderC.addInterceptor(new d(requestBuild));
            long j11 = this.f19710a.f19635m;
            if (j11 >= 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                builderC.connectTimeout(j11, timeUnit);
                builderC.readTimeout(this.f19710a.f19635m, timeUnit);
            }
            builderC.connectionPool(D);
            builderC.retryOnConnectionFailure(false);
            builderC.followRedirects(this.f19710a.f19637o.booleanValue());
            builderC.followSslRedirects(this.f19710a.f19637o.booleanValue());
            builderC.retryOnConnectionFailure(true);
            Call callNewCall = i(builderC).build().newCall(requestBuild);
            f19709z.put(this.f19711b, callNewCall);
            FirebasePerfOkHttpClient.enqueue(callNewCall, new e());
        } catch (Exception e13) {
            e13.printStackTrace();
            s();
            o("ReactNativeBlobUtil request error: " + e13.getMessage() + e13.getCause());
        }
    }
}
