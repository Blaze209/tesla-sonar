package i70;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0017¢\u0006\u0004\b\u0007\u0010\tJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\f\u0010\rR$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Li70/i;", "Li70/k;", "Lkotlin/Function1;", "Ljavax/net/ssl/HttpsURLConnection;", "Ljn0/h0;", "Lcom/stripe/android/payments/core/authentication/ConfigureSslHandler;", "configureSSL", "<init>", "(Lwn0/l;)V", "()V", "", ImagesContract.URL, "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn0/l;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<HttpsURLConnection, h0> configureSSL;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljavax/net/ssl/HttpsURLConnection;", "Ljn0/h0;", "a", "(Ljavax/net/ssl/HttpsURLConnection;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<HttpsURLConnection, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f76107c = new a();

        a() {
            super(1);
        }

        public final void a(HttpsURLConnection httpsURLConnection) {
            p013kotlin.jvm.internal.s.k(httpsURLConnection, "$this$null");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(HttpsURLConnection httpsURLConnection) {
            a(httpsURLConnection);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(wn0.l<? super HttpsURLConnection, h0> configureSSL) {
        p013kotlin.jvm.internal.s.k(configureSSL, "configureSSL");
        this.configureSSL = configureSSL;
    }

    @Override // i70.k
    public Object a(String str, Continuation<? super String> continuation) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            p013kotlin.jvm.internal.s.i(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            if (httpURLConnection instanceof HttpsURLConnection) {
                this.configureSSL.invoke((HttpsURLConnection) httpURLConnection);
            }
            httpURLConnection.getResponseCode();
            objB = jn0.s.b(httpURLConnection.getURL().toString());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        return jn0.s.e(objB) == null ? objB : str;
    }

    public i() {
        this(a.f76107c);
    }
}
