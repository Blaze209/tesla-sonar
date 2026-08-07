package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* JADX INFO: loaded from: classes3.dex */
class CxxInspectorPackagerConnection implements k0 {

    @in.a
    private final HybridData mHybridData;

    private static class DelegateImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OkHttpClient f22370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f22371b;

        class a extends WebSocketListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebSocketDelegate f22372a;

            /* JADX INFO: renamed from: com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl$a$a, reason: collision with other inner class name */
            class RunnableC0445a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f22374a;

                RunnableC0445a(Throwable th2) {
                    this.f22374a = th2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    String message = this.f22374a.getMessage();
                    WebSocketDelegate webSocketDelegate = a.this.f22372a;
                    if (message == null) {
                        message = "<Unknown error>";
                    }
                    webSocketDelegate.didFailWithError(null, message);
                    a.this.f22372a.close();
                }
            }

            class b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f22376a;

                b(String str) {
                    this.f22376a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f22372a.didReceiveMessage(this.f22376a);
                }
            }

            class c implements Runnable {
                c() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f22372a.didOpen();
                }
            }

            class d implements Runnable {
                d() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f22372a.didClose();
                    a.this.f22372a.close();
                }
            }

            a(WebSocketDelegate webSocketDelegate) {
                this.f22372a = webSocketDelegate;
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int i11, String str) {
                DelegateImpl.this.scheduleCallback(new d(), 0L);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
                DelegateImpl.this.scheduleCallback(new RunnableC0445a(th2), 0L);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String str) {
                DelegateImpl.this.scheduleCallback(new b(str), 0L);
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                DelegateImpl.this.scheduleCallback(new c(), 0L);
            }
        }

        class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebSocket f22380a;

            b(WebSocket webSocket) {
                this.f22380a = webSocket;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f22380a.close(1000, "End of session");
            }
        }

        @in.a
        public a connectWebSocket(String str, WebSocketDelegate webSocketDelegate) {
            return new b(this.f22370a.newWebSocket(new Request.Builder().url(str).build(), new a(webSocketDelegate)));
        }

        @in.a
        public void scheduleCallback(Runnable runnable, long j11) {
            this.f22371b.postDelayed(runnable, j11);
        }

        private DelegateImpl() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f22370a = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
            this.f22371b = new Handler(Looper.getMainLooper());
        }
    }

    @in.a
    private static class WebSocketDelegate implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HybridData f22382a;

        @in.a
        private WebSocketDelegate(HybridData hybridData) {
            this.f22382a = hybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f22382a.resetNative();
        }

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didOpen();

        public native void didReceiveMessage(String str);
    }

    private interface a extends Closeable {
    }

    static {
        g0.a();
    }

    public CxxInspectorPackagerConnection(String str, String str2, String str3) {
        this.mHybridData = initHybrid(str, str2, str3, new DelegateImpl());
    }

    private static native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.k0
    public native void closeQuietly();

    @Override // com.facebook.react.devsupport.k0
    public native void connect();

    @Override // com.facebook.react.devsupport.k0
    public native void sendEventToAllConnections(String str);
}
