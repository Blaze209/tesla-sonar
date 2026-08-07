package com.facebook.imagepipeline.backends.okhttp3;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.imagepipeline.producers.a1;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.f;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.t0;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jn0.h0;
import jn0.x;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000253B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010,2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/a;", "Lcom/facebook/imagepipeline/producers/d;", "Lcom/facebook/imagepipeline/backends/okhttp3/a$b;", "Lokhttp3/Call$Factory;", "callFactory", "Ljava/util/concurrent/Executor;", "cancellationExecutor", "", "disableOkHttpCache", "<init>", "(Lokhttp3/Call$Factory;Ljava/util/concurrent/Executor;Z)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "", "message", "Lokhttp3/Response;", "response", "Ljava/io/IOException;", "n", "(Ljava/lang/String;Lokhttp3/Response;)Ljava/io/IOException;", "Lokhttp3/Call;", "call", "Ljava/lang/Exception;", "e", "Lcom/facebook/imagepipeline/producers/t0$a;", "callback", "Ljn0/h0;", "m", "(Lokhttp3/Call;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/t0$a;)V", "Lcom/facebook/imagepipeline/producers/n;", "Lum/k;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", CoreConstants.CONTEXT_SCOPE_VALUE, IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;)Lcom/facebook/imagepipeline/backends/okhttp3/a$b;", "fetchState", "j", "(Lcom/facebook/imagepipeline/backends/okhttp3/a$b;Lcom/facebook/imagepipeline/producers/t0$a;)V", "", "byteSize", "o", "(Lcom/facebook/imagepipeline/backends/okhttp3/a$b;I)V", "", "l", "(Lcom/facebook/imagepipeline/backends/okhttp3/a$b;I)Ljava/util/Map;", "Lokhttp3/Request;", "request", "k", "(Lcom/facebook/imagepipeline/backends/okhttp3/a$b;Lcom/facebook/imagepipeline/producers/t0$a;Lokhttp3/Request;)V", "a", "Lokhttp3/Call$Factory;", "b", "Ljava/util/concurrent/Executor;", "Lokhttp3/CacheControl;", "c", "Lokhttp3/CacheControl;", "cacheControl", DateTokenConverter.CONVERTER_KEY, "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a extends com.facebook.imagepipeline.producers.d<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0436a f21676d = new C0436a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Call.Factory callFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Executor cancellationExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CacheControl cacheControl;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/a$a;", "", "<init>", "()V", "", "QUEUE_TIME", "Ljava/lang/String;", "FETCH_TIME", "TOTAL_TIME", "IMAGE_SIZE", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C0436a {
        public /* synthetic */ C0436a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0436a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/a$b;", "Lcom/facebook/imagepipeline/producers/c0;", "Lcom/facebook/imagepipeline/producers/n;", "Lum/k;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "<init>", "(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;)V", "", "f", "J", "submitTime", "g", "responseTime", "h", "fetchCompleteTime", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends c0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public long submitTime;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public long responseTime;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public long fetchCompleteTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n<k> consumer, a1 producerContext) {
            super(consumer, producerContext);
            s.k(consumer, "consumer");
            s.k(producerContext, "producerContext");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/imagepipeline/backends/okhttp3/a$c", "Lcom/facebook/imagepipeline/producers/f;", "Ljn0/h0;", "b", "()V", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Call f21683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f21684b;

        c(Call call, a aVar) {
            this.f21683a = call;
            this.f21684b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Call call) {
            call.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            if (!s.f(Looper.myLooper(), Looper.getMainLooper())) {
                this.f21683a.cancel();
                return;
            }
            Executor executor = this.f21684b.cancellationExecutor;
            final Call call = this.f21683a;
            executor.execute(new Runnable() { // from class: lm.b
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.imagepipeline.backends.okhttp3.a.c.f(call);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/facebook/imagepipeline/backends/okhttp3/a$d", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "Ljn0/h0;", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "imagepipeline-okhttp3_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f21685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f21686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0.a f21687c;

        d(b bVar, a aVar, t0.a aVar2) {
            this.f21685a = bVar;
            this.f21686b = aVar;
            this.f21687c = aVar2;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            s.k(call, "call");
            s.k(e11, "e");
            this.f21686b.m(call, e11, this.f21687c);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            s.k(call, "call");
            s.k(response, "response");
            this.f21685a.responseTime = SystemClock.elapsedRealtime();
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                a aVar = this.f21686b;
                aVar.m(call, aVar.n("Response body null: " + response, response), this.f21687c);
                return;
            }
            a aVar2 = this.f21686b;
            t0.a aVar3 = this.f21687c;
            b bVar = this.f21685a;
            try {
                try {
                    if (response.isSuccessful()) {
                        om.b bVarC = om.b.INSTANCE.c(response.header("Content-Range"));
                        if (bVarC != null && (bVarC.from != 0 || bVarC.to != Integer.MAX_VALUE)) {
                            bVar.j(bVarC);
                            bVar.i(8);
                        }
                        aVar3.b(responseBodyBody.byteStream(), responseBodyBody.getContentLength() < 0 ? 0 : (int) responseBodyBody.getContentLength());
                    } else {
                        aVar2.m(call, aVar2.n("Unexpected HTTP code " + response, response), aVar3);
                    }
                } catch (Exception e11) {
                    aVar2.m(call, e11, aVar3);
                }
                h0 h0Var = h0.f84049a;
                sn0.b.a(responseBodyBody, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(responseBodyBody, th2);
                    throw th3;
                }
            }
        }
    }

    public /* synthetic */ a(Call.Factory factory, Executor executor, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(factory, executor, (i11 & 4) != 0 ? true : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Call call, Exception e11, t0.a callback) {
        if (call.getCanceled()) {
            callback.a();
        } else {
            callback.onFailure(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOException n(String message, Response response) {
        return new IOException(message, OkHttpNetworkFetcherException.INSTANCE.a(response));
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b b(n<k> consumer, a1 context) {
        s.k(consumer, "consumer");
        s.k(context, "context");
        return new b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void c(b fetchState, t0.a callback) {
        s.k(fetchState, "fetchState");
        s.k(callback, "callback");
        fetchState.submitTime = SystemClock.elapsedRealtime();
        Uri uriG = fetchState.g();
        s.j(uriG, "getUri(...)");
        try {
            Request.Builder builder = new Request.Builder().url(uriG.toString()).get();
            CacheControl cacheControl = this.cacheControl;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            om.b bVarB = fetchState.b().B().b();
            if (bVarB != null) {
                builder.addHeader("Range", bVarB.f());
            }
            Request requestBuild = builder.build();
            s.j(requestBuild, "build(...)");
            k(fetchState, callback, requestBuild);
        } catch (Exception e11) {
            callback.onFailure(e11);
        }
    }

    protected void k(b fetchState, t0.a callback, Request request) {
        s.k(fetchState, "fetchState");
        s.k(callback, "callback");
        s.k(request, "request");
        Call callNewCall = this.callFactory.newCall(request);
        fetchState.b().H(new c(callNewCall, this));
        FirebasePerfOkHttpClient.enqueue(callNewCall, new d(fetchState, this, callback));
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Map<String, String> e(b fetchState, int byteSize) {
        s.k(fetchState, "fetchState");
        return v0.m(x.a("queue_time", String.valueOf(fetchState.responseTime - fetchState.submitTime)), x.a("fetch_time", String.valueOf(fetchState.fetchCompleteTime - fetchState.responseTime)), x.a("total_time", String.valueOf(fetchState.fetchCompleteTime - fetchState.submitTime)), x.a("image_size", String.valueOf(byteSize)));
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void a(b fetchState, int byteSize) {
        s.k(fetchState, "fetchState");
        fetchState.fetchCompleteTime = SystemClock.elapsedRealtime();
    }

    public a(Call.Factory callFactory, Executor cancellationExecutor, boolean z11) {
        s.k(callFactory, "callFactory");
        s.k(cancellationExecutor, "cancellationExecutor");
        this.callFactory = callFactory;
        this.cancellationExecutor = cancellationExecutor;
        this.cacheControl = z11 ? new CacheControl.Builder().noStore().build() : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(OkHttpClient okHttpClient) {
        s.k(okHttpClient, "okHttpClient");
        ExecutorService executorService = okHttpClient.dispatcher().executorService();
        s.j(executorService, "executorService(...)");
        this(okHttpClient, executorService, false, 4, null);
    }
}
