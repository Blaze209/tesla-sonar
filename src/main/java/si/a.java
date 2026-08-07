package si;

import bo0.n;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ji.HttpHeader;
import ji.j;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.i;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lsi/a;", "Lsi/c;", "Lokhttp3/Call$Factory;", "httpCallFactory", "<init>", "(Lokhttp3/Call$Factory;)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "", "timeoutMillis", "(J)V", "connectTimeout", "readTimeout", "(JJ)V", "Lji/g;", "request", "Lji/i;", "a", "(Lji/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "dispose", "()V", "Lokhttp3/Call$Factory;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Call.Factory httpCallFactory;

    /* JADX INFO: renamed from: si.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class C2368a extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Call f111169c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2368a(Call call) {
            super(1);
            this.f111169c = call;
        }

        public final void a(Throwable th2) {
            this.f111169c.cancel();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"si/a$b", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "", "isOneShot", "()Z", "Lokio/i;", "sink", "Ljn0/h0;", "writeTo", "(Lokio/i;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ji.c f111170a;

        b(ji.c cVar) {
            this.f111170a = cVar;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f111170a.getContentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getF22850a() {
            return MediaType.INSTANCE.get(this.f111170a.getOrg.spongycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String());
        }

        @Override // okhttp3.RequestBody
        public boolean isOneShot() {
            return this.f111170a instanceof j;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(i sink) {
            s.k(sink, "sink");
            this.f111170a.a(sink);
        }
    }

    public a(Call.Factory httpCallFactory) {
        s.k(httpCallFactory, "httpCallFactory");
        this.httpCallFactory = httpCallFactory;
    }

    @Override // si.c
    public Object a(ji.g gVar, Continuation<? super ji.i> continuation) throws IOException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Request.Builder builderHeaders = new Request.Builder().url(gVar.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String()).headers(ri.b.a(gVar.b()));
        if (gVar.getMethod() == ji.f.Get) {
            builderHeaders.get();
        } else {
            ji.c body = gVar.getBody();
            if (body == null) {
                throw new IllegalStateException("HTTP POST requires a request body");
            }
            builderHeaders.post(new b(body));
        }
        Call callNewCall = this.httpCallFactory.newCall(builderHeaders.build());
        cancellableContinuationImpl.invokeOnCancellation(new C2368a(callNewCall));
        Response responseExecute = null;
        try {
            responseExecute = FirebasePerfOkHttpClient.execute(callNewCall);
            e = null;
        } catch (IOException e11) {
            e = e11;
        }
        if (e != null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuationImpl.resumeWith(jn0.s.b(t.a(new ApolloNetworkException("Failed to execute GraphQL http network request", e))));
        } else {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            s.h(responseExecute);
            ji.i.a aVar = new ji.i.a(responseExecute.code());
            ResponseBody responseBodyBody = responseExecute.body();
            s.h(responseBodyBody);
            ji.i.a aVarB = aVar.b(responseBodyBody.getSource());
            Headers headers = responseExecute.headers();
            bo0.j jVarW = n.w(0, headers.size());
            ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                int iNextInt = ((s0) it).nextInt();
                arrayList.add(new HttpHeader(headers.name(iNextInt), headers.value(iNextInt)));
            }
            Object objB = jn0.s.b(aVarB.a(arrayList).c());
            t.b(objB);
            cancellableContinuationImpl.resumeWith(jn0.s.b(objB));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(OkHttpClient okHttpClient) {
        this((Call.Factory) okHttpClient);
        s.k(okHttpClient, "okHttpClient");
    }

    public a(long j11) {
        this(j11, j11);
    }

    public /* synthetic */ a(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 60000L : j11);
    }

    public a(long j11, long j12) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this(builder.connectTimeout(j11, timeUnit).readTimeout(j12, timeUnit).build());
    }

    @Override // si.c
    public void dispose() {
    }
}
