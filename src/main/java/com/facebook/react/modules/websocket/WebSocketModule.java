package com.facebook.react.modules.websocket;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.d;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = "WebSocketModule")
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002>?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\"\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010)J\u001d\u0010+\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b+\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020 H\u0016¢\u0006\u0004\b4\u00100R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule;", "Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "Ljn0/h0;", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "", "id", "message", "notifyWebSocketFailed", "(ILjava/lang/String;)V", "uri", "getCookie", "(Ljava/lang/String;)Ljava/lang/String;", "invalidate", "()V", "Lcom/facebook/react/modules/websocket/WebSocketModule$b;", "contentHandler", "setContentHandler", "(ILcom/facebook/react/modules/websocket/WebSocketModule$b;)V", ImagesContract.URL, "Lcom/facebook/react/bridge/ReadableArray;", "protocols", "Lcom/facebook/react/bridge/ReadableMap;", "options", "", "socketID", "connect", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V", "code", AnalyticsAttribute.Reason, "close", "(DLjava/lang/String;D)V", "send", "(Ljava/lang/String;D)V", "base64String", "sendBinary", "Lokio/k;", "byteString", "(Lokio/k;I)V", "ping", "(D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "", "Lokhttp3/WebSocket;", "webSocketConnections", "Ljava/util/Map;", "contentHandlers", "Lcom/facebook/react/modules/network/d;", "cookieHandler", "Lcom/facebook/react/modules/network/d;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "WebSocketModule";
    private static com.facebook.react.modules.network.b customClientBuilder;
    private final Map<Integer, b> contentHandlers;
    private final d cookieHandler;
    private final Map<Integer, WebSocket> webSocketConnections;

    /* JADX INFO: renamed from: com.facebook.react.modules.websocket.WebSocketModule$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$a;", "", "<init>", "()V", "Lokhttp3/OkHttpClient$Builder;", "builder", "Ljn0/h0;", "c", "(Lokhttp3/OkHttpClient$Builder;)V", "", "uri", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/facebook/react/modules/network/b;", "ccb", "e", "(Lcom/facebook/react/modules/network/b;)V", "NAME", "Ljava/lang/String;", "customClientBuilder", "Lcom/facebook/react/modules/network/b;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(OkHttpClient.Builder builder) {
            WebSocketModule.access$getCustomClientBuilder$cp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:20:0x0035 A[Catch: URISyntaxException -> 0x0092, TryCatch #0 {URISyntaxException -> 0x0092, blocks: (B:2:0x0000, B:4:0x000b, B:14:0x0027, B:20:0x0035, B:28:0x004f, B:31:0x0058, B:33:0x0079, B:17:0x002e, B:21:0x003a, B:25:0x0045), top: B:37:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x004d  */
        public final String d(String uri) {
            String scheme;
            try {
                URI uri2 = new URI(uri);
                String scheme2 = uri2.getScheme();
                if (scheme2 != null) {
                    int iHashCode = scheme2.hashCode();
                    scheme = "http";
                    if (iHashCode != 3804) {
                        if (iHashCode != 118039) {
                            if (iHashCode != 3213448) {
                                if (iHashCode == 99617003 && scheme2.equals("https")) {
                                    scheme = uri2.getScheme();
                                } else {
                                    scheme = "";
                                }
                            } else if (scheme2.equals("http")) {
                                scheme = uri2.getScheme();
                            } else {
                                scheme = "";
                            }
                        } else if (scheme2.equals("wss")) {
                            scheme = "https";
                        } else {
                            scheme = "";
                        }
                    } else if (!scheme2.equals("ws")) {
                        scheme = "";
                    }
                } else {
                    scheme = "";
                }
                if (uri2.getPort() != -1) {
                    t0 t0Var = t0.f86535a;
                    String str = String.format("%s://%s:%s", Arrays.copyOf(new Object[]{scheme, uri2.getHost(), Integer.valueOf(uri2.getPort())}, 3));
                    s.j(str, "format(...)");
                    return str;
                }
                t0 t0Var2 = t0.f86535a;
                String str2 = String.format("%s://%s", Arrays.copyOf(new Object[]{scheme, uri2.getHost()}, 2));
                s.j(str2, "format(...)");
                return str2;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Unable to set " + uri + " as default origin header");
            }
        }

        public final void e(com.facebook.react.modules.network.b ccb) {
            WebSocketModule.access$setCustomClientBuilder$cp(ccb);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$b;", "", "", "text", "Lcom/facebook/react/bridge/WritableMap;", "params", "Ljn0/h0;", "a", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lokio/k;", "byteString", "b", "(Lokio/k;Lcom/facebook/react/bridge/WritableMap;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(String text, WritableMap params);

        void b(k byteString, WritableMap params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(ReactApplicationContext context) {
        super(context);
        s.k(context, "context");
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new d();
    }

    public static final /* synthetic */ com.facebook.react.modules.network.b access$getCustomClientBuilder$cp() {
        return null;
    }

    public static final /* synthetic */ void access$setCustomClientBuilder$cp(com.facebook.react.modules.network.b bVar) {
    }

    private final String getCookie(String uri) {
        try {
            List<String> list = this.cookieHandler.get(new URI(INSTANCE.d(uri)), new HashMap()).get("Cookie");
            List<String> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        } catch (URISyntaxException unused2) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyWebSocketFailed(int id2, String message) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", id2);
        writableMapCreateMap.putString("message", message);
        s.h(writableMapCreateMap);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, WritableMap params) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, params);
        }
    }

    public static final void setCustomClientBuilder(com.facebook.react.modules.network.b bVar) {
        INSTANCE.e(bVar);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String eventName) {
        s.k(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double code, String reason, double socketID) {
        int i11 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) code, reason);
            this.webSocketConnections.remove(Integer.valueOf(i11));
            this.contentHandlers.remove(Integer.valueOf(i11));
        } catch (Exception e11) {
            qk.a.n("ReactNative", "Could not close WebSocket connection for id " + i11, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String url, ReadableArray protocols, ReadableMap options, double socketID) {
        boolean z11;
        s.k(url, "url");
        int i11 = (int) socketID;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES);
        INSTANCE.c(timeout);
        OkHttpClient okHttpClientBuild = timeout.build();
        Request.Builder builderUrl = new Request.Builder().tag(Integer.valueOf(i11)).url(url);
        String cookie = getCookie(url);
        if (cookie != null) {
            builderUrl.addHeader("Cookie", cookie);
        }
        if (options != null && options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z11 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String == map.getType(strNextKey)) {
                    if (t.M(strNextKey, "origin", true)) {
                        z11 = true;
                    }
                    String string = map.getString(strNextKey);
                    if (string == null) {
                        throw new IllegalStateException(("value for name " + strNextKey + " == null").toString());
                    }
                    builderUrl.addHeader(strNextKey, string);
                } else {
                    qk.a.I("ReactNative", "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            builderUrl.addHeader("origin", INSTANCE.d(url));
        }
        if (protocols != null && protocols.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            int size = protocols.size();
            for (int i12 = 0; i12 < size; i12++) {
                String string2 = protocols.getString(i12);
                String string3 = string2 != null ? t.F1(string2).toString() : null;
                if (!(string3 == null || string3.length() == 0) && !t.h0(string3, ",", false, 2, null)) {
                    sb2.append(string3);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                String string4 = sb2.toString();
                s.j(string4, "toString(...)");
                builderUrl.addHeader("Sec-WebSocket-Protocol", string4);
            }
        }
        okHttpClientBuild.newWebSocket(builderUrl.build(), new c(i11));
        okHttpClientBuild.getDispatcher().m648deprecated_executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<WebSocket> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().close(1001, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double socketID) {
        int i11 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i11));
        if (webSocket != null) {
            try {
                webSocket.send(k.f97943e);
                return;
            } catch (Exception e11) {
                notifyWebSocketFailed(i11, e11.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        s.j(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("id", i11);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i11);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString(AnalyticsAttribute.Reason, "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i11));
        this.contentHandlers.remove(Integer.valueOf(i11));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String message, double socketID) {
        s.k(message, "message");
        int i11 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i11));
        if (webSocket != null) {
            try {
                webSocket.send(message);
                return;
            } catch (Exception e11) {
                notifyWebSocketFailed(i11, e11.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        s.j(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("id", i11);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i11);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString(AnalyticsAttribute.Reason, "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i11));
        this.contentHandlers.remove(Integer.valueOf(i11));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String base64String, double socketID) {
        s.k(base64String, "base64String");
        int i11 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i11));
        if (webSocket != null) {
            try {
                k kVarA = k.INSTANCE.a(base64String);
                if (kVarA == null) {
                    throw new IllegalStateException("bytes == null");
                }
                webSocket.send(kVarA);
                return;
            } catch (Exception e11) {
                notifyWebSocketFailed(i11, e11.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        s.j(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("id", i11);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i11);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString(AnalyticsAttribute.Reason, "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i11));
        this.contentHandlers.remove(Integer.valueOf(i11));
    }

    public final void setContentHandler(int id2, b contentHandler) {
        if (contentHandler == null) {
            this.contentHandlers.remove(Integer.valueOf(id2));
        } else {
            this.contentHandlers.put(Integer.valueOf(id2), contentHandler);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"com/facebook/react/modules/websocket/WebSocketModule$c", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Ljn0/h0;", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "websocket", "", "code", "", AnalyticsAttribute.Reason, "onClosing", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosed", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "text", "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "Lokio/k;", "bytes", "(Lokhttp3/WebSocket;Lokio/k;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends WebSocketListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f22875b;

        c(int i11) {
            this.f22875b = i11;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int code, String reason) {
            s.k(webSocket, "webSocket");
            s.k(reason, "reason");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f22875b);
            writableMapCreateMap.putInt("code", code);
            writableMapCreateMap.putString(AnalyticsAttribute.Reason, reason);
            WebSocketModule webSocketModule = WebSocketModule.this;
            s.h(writableMapCreateMap);
            webSocketModule.sendEvent("websocketClosed", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket websocket, int code, String reason) {
            s.k(websocket, "websocket");
            s.k(reason, "reason");
            websocket.close(code, reason);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable t11, Response response) {
            s.k(webSocket, "webSocket");
            s.k(t11, "t");
            WebSocketModule.this.notifyWebSocketFailed(this.f22875b, t11.getMessage());
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            s.k(webSocket, "webSocket");
            s.k(text, "text");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f22875b);
            writableMapCreateMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.contentHandlers.get(Integer.valueOf(this.f22875b));
            if (bVar != null) {
                s.h(writableMapCreateMap);
                bVar.a(text, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", text);
            }
            WebSocketModule webSocketModule = WebSocketModule.this;
            s.h(writableMapCreateMap);
            webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            s.k(webSocket, "webSocket");
            s.k(response, "response");
            WebSocketModule.this.webSocketConnections.put(Integer.valueOf(this.f22875b), webSocket);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f22875b);
            writableMapCreateMap.putString("protocol", response.header("Sec-WebSocket-Protocol", ""));
            WebSocketModule webSocketModule = WebSocketModule.this;
            s.h(writableMapCreateMap);
            webSocketModule.sendEvent("websocketOpen", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, k bytes) {
            s.k(webSocket, "webSocket");
            s.k(bytes, "bytes");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f22875b);
            writableMapCreateMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.contentHandlers.get(Integer.valueOf(this.f22875b));
            if (bVar != null) {
                s.h(writableMapCreateMap);
                bVar.b(bytes, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", bytes.a());
            }
            WebSocketModule webSocketModule = WebSocketModule.this;
            s.h(writableMapCreateMap);
            webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
        }
    }

    public final void sendBinary(k byteString, int id2) {
        s.k(byteString, "byteString");
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(id2));
        if (webSocket == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            s.j(writableMapCreateMap, "createMap(...)");
            writableMapCreateMap.putInt("id", id2);
            writableMapCreateMap.putString("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("id", id2);
            writableMapCreateMap2.putInt("code", 0);
            writableMapCreateMap2.putString(AnalyticsAttribute.Reason, "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.webSocketConnections.remove(Integer.valueOf(id2));
            this.contentHandlers.remove(Integer.valueOf(id2));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e11) {
            notifyWebSocketFailed(id2, e11.getMessage());
        }
    }
}
