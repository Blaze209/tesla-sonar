package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.r0;
import okio.s0;

/* JADX INFO: loaded from: classes10.dex */
final class r<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f107926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f107927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f107928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Call.Factory f107929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h<ResponseBody, T> f107930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f107931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Call f107932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Throwable f107933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f107934i;

    class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f107935a;

        a(f fVar) {
            this.f107935a = fVar;
        }

        private void a(Throwable th2) {
            try {
                this.f107935a.onFailure(r.this, th2);
            } catch (Throwable th3) {
                d0.t(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f107935a.onResponse(r.this, r.this.d(response));
                } catch (Throwable th2) {
                    d0.t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                d0.t(th3);
                a(th3);
            }
        }
    }

    static final class b extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ResponseBody f107937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final okio.j f107938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IOException f107939c;

        class a extends okio.r {
            a(r0 r0Var) {
                super(r0Var);
            }

            @Override // okio.r, okio.r0
            public long read(okio.h hVar, long j11) throws IOException {
                try {
                    return super.read(hVar, j11);
                } catch (IOException e11) {
                    b.this.f107939c = e11;
                    throw e11;
                }
            }
        }

        b(ResponseBody responseBody) {
            this.f107937a = responseBody;
            this.f107938b = okio.c0.d(new a(responseBody.getSource()));
        }

        void c() throws IOException {
            IOException iOException = this.f107939c;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f107937a.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f107937a.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.f107937a.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public okio.j getSource() {
            return this.f107938b;
        }
    }

    static final class c extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaType f107941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f107942b;

        c(MediaType mediaType, long j11) {
            this.f107941a = mediaType;
            this.f107942b = j11;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f107942b;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.f107941a;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public okio.j getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    r(x xVar, Object obj, Object[] objArr, Call.Factory factory, h<ResponseBody, T> hVar) {
        this.f107926a = xVar;
        this.f107927b = obj;
        this.f107928c = objArr;
        this.f107929d = factory;
        this.f107930e = hVar;
    }

    private Call b() {
        Call callNewCall = this.f107929d.newCall(this.f107926a.a(this.f107927b, this.f107928c));
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private Call c() throws IOException {
        Call call = this.f107932g;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f107933h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            Call callB = b();
            this.f107932g = callB;
            return callB;
        } catch (IOException | Error | RuntimeException e11) {
            d0.t(e11);
            this.f107933h = e11;
            throw e11;
        }
    }

    @Override // retrofit2.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public r<T> m123clone() {
        return new r<>(this.f107926a, this.f107927b, this.f107928c, this.f107929d, this.f107930e);
    }

    @Override // retrofit2.d
    public void cancel() {
        Call call;
        this.f107931f = true;
        synchronized (this) {
            call = this.f107932g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    y<T> d(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.get$contentType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return y.d(d0.a(responseBodyBody), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return y.j(null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return y.j(this.f107930e.convert(bVar), responseBuild);
        } catch (RuntimeException e11) {
            bVar.c();
            throw e11;
        }
    }

    @Override // retrofit2.d
    public void enqueue(f<T> fVar) {
        Call call;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f107934i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f107934i = true;
                call = this.f107932g;
                th2 = this.f107933h;
                if (call == null && th2 == null) {
                    try {
                        Call callB = b();
                        this.f107932g = callB;
                        call = callB;
                    } catch (Throwable th3) {
                        th2 = th3;
                        d0.t(th2);
                        this.f107933h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            fVar.onFailure(this, th2);
            return;
        }
        if (this.f107931f) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new a(fVar));
    }

    @Override // retrofit2.d
    public y<T> execute() {
        Call callC;
        synchronized (this) {
            if (this.f107934i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f107934i = true;
            callC = c();
        }
        if (this.f107931f) {
            callC.cancel();
        }
        return d(FirebasePerfOkHttpClient.execute(callC));
    }

    @Override // retrofit2.d
    public boolean isCanceled() {
        boolean z11 = true;
        if (this.f107931f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f107932g;
                if (call == null || !call.getCanceled()) {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // retrofit2.d
    public synchronized boolean isExecuted() {
        return this.f107934i;
    }

    @Override // retrofit2.d
    public synchronized Request request() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create request.", e11);
        }
        return c().request();
    }

    @Override // retrofit2.d
    public synchronized s0 timeout() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create call.", e11);
        }
        return c().timeout();
    }
}
