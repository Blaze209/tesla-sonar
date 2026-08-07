package w30;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0003\u0006\b\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lw30/n;", "", "Lw30/k0;", "request", "Lw30/i0;", "", "a", "(Lw30/k0;)Lw30/i0;", "b", "c", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lw30/n$a;", "", "<init>", "()V", "", "b", "I", "CONNECT_TIMEOUT", "c", "READ_TIMEOUT", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f120656a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int CONNECT_TIMEOUT;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final int READ_TIMEOUT;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CONNECT_TIMEOUT = (int) timeUnit.toMillis(30L);
            READ_TIMEOUT = (int) timeUnit.toMillis(80L);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\tJ1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw30/n$b;", "", "Lw30/k0;", "request", "Lkotlin/Function2;", "Ljava/net/HttpURLConnection;", "Ljn0/h0;", "callback", "Ljavax/net/ssl/HttpsURLConnection;", "a", "(Lw30/k0;Lwn0/p;)Ljavax/net/ssl/HttpsURLConnection;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw30/n$b$a;", "Lw30/n$b;", "<init>", "()V", "Lw30/k0;", "request", "Lkotlin/Function2;", "Ljava/net/HttpURLConnection;", "Ljn0/h0;", "callback", "Ljavax/net/ssl/HttpsURLConnection;", "a", "(Lw30/k0;Lwn0/p;)Ljavax/net/ssl/HttpsURLConnection;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f120659a = new a();

            private a() {
            }

            @Override // w30.n.b
            public HttpsURLConnection a(k0 request, wn0.p<? super HttpURLConnection, ? super k0, jn0.h0> callback) {
                p013kotlin.jvm.internal.s.k(request, "request");
                p013kotlin.jvm.internal.s.k(callback, "callback");
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(request.getUrl()).openConnection());
                p013kotlin.jvm.internal.s.i(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                callback.invoke(httpsURLConnection, request);
                return httpsURLConnection;
            }
        }

        HttpsURLConnection a(k0 request, wn0.p<? super HttpURLConnection, ? super k0, jn0.h0> callback);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lw30/n$c;", "Lw30/n;", "<init>", "()V", "Lw30/k0;", "originalRequest", "Ljavax/net/ssl/HttpsURLConnection;", "b", "(Lw30/k0;)Ljavax/net/ssl/HttpsURLConnection;", "request", "Lw30/i0;", "", "a", "(Lw30/k0;)Lw30/i0;", "Lw30/n$b;", "Lw30/n$b;", "getConnectionOpener", "()Lw30/n$b;", "setConnectionOpener", "(Lw30/n$b;)V", "connectionOpener", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f120660a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static volatile b connectionOpener = b.a.f120659a;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/net/HttpURLConnection;", "Lw30/k0;", "request", "Ljn0/h0;", "a", "(Ljava/net/HttpURLConnection;Lw30/k0;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.p<HttpURLConnection, k0, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f120662c = new a();

            a() {
                super(2);
            }

            public final void a(HttpURLConnection open, k0 request) throws IOException {
                p013kotlin.jvm.internal.s.k(open, "$this$open");
                p013kotlin.jvm.internal.s.k(request, "request");
                open.setConnectTimeout(a.CONNECT_TIMEOUT);
                open.setReadTimeout(a.READ_TIMEOUT);
                open.setUseCaches(request.getShouldCache());
                open.setRequestMethod(request.getMethod().getCode());
                for (Map.Entry<String, String> entry : request.a().entrySet()) {
                    open.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (k0.a.POST == request.getMethod()) {
                    open.setDoOutput(true);
                    Map<String, String> mapC = request.c();
                    if (mapC != null) {
                        for (Map.Entry<String, String> entry2 : mapC.entrySet()) {
                            open.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                    }
                    OutputStream outputStream = open.getOutputStream();
                    try {
                        p013kotlin.jvm.internal.s.h(outputStream);
                        request.g(outputStream);
                        jn0.h0 h0Var = jn0.h0.f84049a;
                        sn0.b.a(outputStream, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(outputStream, th2);
                            throw th3;
                        }
                    }
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(HttpURLConnection httpURLConnection, k0 k0Var) throws IOException {
                a(httpURLConnection, k0Var);
                return jn0.h0.f84049a;
            }
        }

        private c() {
        }

        private final HttpsURLConnection b(k0 originalRequest) {
            return connectionOpener.a(originalRequest, a.f120662c);
        }

        @Override // w30.n
        public /* synthetic */ i0 a(k0 request) {
            p013kotlin.jvm.internal.s.k(request, "request");
            return new i0.b(b(request));
        }
    }

    i0<String> a(k0 request);
}
