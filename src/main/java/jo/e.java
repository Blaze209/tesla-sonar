package jo;

import android.os.Handler;
import android.os.Looper;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends WebSocketListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f84101i = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f84102a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OkHttpClient f84104c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f84106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WebSocket f84107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f84108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f84109h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f84105d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f84103b = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public interface c {
        void a(k kVar);

        void onMessage(String str);
    }

    public e(String str, c cVar, b bVar) {
        this.f84102a = str;
        this.f84108g = cVar;
        this.f84109h = bVar;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f84104c = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
    }

    private void b(String str, Throwable th2) {
        qk.a.n(f84101i, "Error occurred, shutting down websocket connection: " + str, th2);
        d();
    }

    private void d() {
        WebSocket webSocket = this.f84107f;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.f84107f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f84105d) {
            e();
        }
    }

    private void g() {
        if (this.f84105d) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.f84106e) {
            qk.a.I(f84101i, "Couldn't connect to \"" + this.f84102a + "\", will silently retry");
            this.f84106e = true;
        }
        this.f84103b.postDelayed(new a(), 2000L);
    }

    public void c() {
        this.f84105d = true;
        d();
        this.f84108g = null;
        b bVar = this.f84109h;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void e() {
        if (this.f84105d) {
            throw new IllegalStateException("Can't connect closed client");
        }
        this.f84104c.newWebSocket(new Request.Builder().url(this.f84102a).build(), this);
    }

    public synchronized void h(String str) {
        WebSocket webSocket = this.f84107f;
        if (webSocket == null) {
            throw new ClosedChannelException();
        }
        webSocket.send(str);
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onClosed(WebSocket webSocket, int i11, String str) {
        try {
            this.f84107f = null;
            if (!this.f84105d) {
                b bVar = this.f84109h;
                if (bVar != null) {
                    bVar.b();
                }
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        try {
            if (this.f84107f != null) {
                b("Websocket exception", th2);
            }
            if (!this.f84105d) {
                b bVar = this.f84109h;
                if (bVar != null) {
                    bVar.b();
                }
                g();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, String str) {
        c cVar = this.f84108g;
        if (cVar != null) {
            cVar.onMessage(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onOpen(WebSocket webSocket, Response response) {
        this.f84107f = webSocket;
        this.f84106e = false;
        b bVar = this.f84109h;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, k kVar) {
        c cVar = this.f84108g;
        if (cVar != null) {
            cVar.a(kVar);
        }
    }
}
