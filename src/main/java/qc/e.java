package qc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.t;
import nc.NetworkHeaders;
import nc.NetworkRequest;
import nc.NetworkResponse;
import nc.i;
import nc.o;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.h;
import okio.j;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnc/n;", "Lokhttp3/Request;", "h", "(Lnc/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnc/o;", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "(Lnc/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Response;", "Lnc/p;", "g", "(Lokhttp3/Response;)Lnc/p;", "Lnc/m;", "Lokhttp3/Headers;", "e", "(Lnc/m;)Lokhttp3/Headers;", "f", "(Lokhttp3/Headers;)Lnc/m;", "coil-network-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", i = {0}, l = {39}, m = "readByteString", n = {"buffer"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f105328n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f105329o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f105330p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f105329o = obj;
            this.f105330p |= Integer.MIN_VALUE;
            return e.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", i = {0, 0}, l = {32}, m = "toRequest", n = {"$this$toRequest", "request"}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f105331n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f105332o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f105333p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f105334q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f105335r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f105336s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f105335r = obj;
            this.f105336s |= Integer.MIN_VALUE;
            return e.h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(o oVar, Continuation<? super k> continuation) {
        a aVar;
        h hVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f105330p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f105330p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f105329o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f105330p;
        if (i12 == 0) {
            t.b(obj);
            h hVar2 = new h();
            aVar.f105328n = hVar2;
            aVar.f105330p = 1;
            if (oVar.u(hVar2, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            hVar = hVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) aVar.f105328n;
            t.b(obj);
        }
        return hVar.m1();
    }

    private static final Headers e(NetworkHeaders networkHeaders) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : networkHeaders.b().entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder.addUnsafeNonAscii(key, it.next());
            }
        }
        return builder.build();
    }

    private static final NetworkHeaders f(Headers headers) {
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        for (Pair<? extends String, ? extends String> pair : headers) {
            aVar.a(pair.a(), pair.b());
        }
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkResponse g(Response response) {
        j bodySource;
        int iCode = response.code();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        NetworkHeaders networkHeadersF = f(response.headers());
        ResponseBody responseBodyBody = response.body();
        return new NetworkResponse(iCode, jSentRequestAtMillis, jReceivedResponseAtMillis, networkHeadersF, (responseBodyBody == null || (bodySource = responseBodyBody.getSource()) == null) ? null : i.a(bodySource), response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(NetworkRequest networkRequest, Continuation<? super Request> continuation) {
        b bVar;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        Request.Builder builder3;
        NetworkRequest networkRequest2;
        String str2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f105336s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f105336s = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f105335r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f105336s;
        RequestBody requestBodyCreate$default = null;
        if (i12 == 0) {
            t.b(obj);
            builder = new Request.Builder();
            builder.url(networkRequest.getUrl());
            String method = networkRequest.getMethod();
            o body = networkRequest.getBody();
            if (body != null) {
                bVar.f105331n = networkRequest;
                bVar.f105332o = builder;
                bVar.f105333p = builder;
                bVar.f105334q = method;
                bVar.f105336s = 1;
                Object objD = d(body, bVar);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                builder3 = builder;
                obj = objD;
                networkRequest2 = networkRequest;
                str2 = method;
                builder2 = builder3;
            } else {
                str = method;
                builder2 = builder;
            }
            String str3 = str;
            networkRequest2 = networkRequest;
            str2 = str3;
            builder3 = builder;
            builder3.method(str2, requestBodyCreate$default);
            builder2.headers(e(networkRequest2.getHeaders()));
            return builder2.build();
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) bVar.f105334q;
        builder3 = (Request.Builder) bVar.f105333p;
        builder2 = (Request.Builder) bVar.f105332o;
        networkRequest2 = (NetworkRequest) bVar.f105331n;
        t.b(obj);
        k kVar = (k) obj;
        if (kVar != null) {
            requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, kVar, (MediaType) null, 1, (Object) null);
        } else {
            NetworkRequest networkRequest3 = networkRequest2;
            str = str2;
            networkRequest = networkRequest3;
            builder = builder3;
            String str4 = str;
            networkRequest2 = networkRequest;
            str2 = str4;
            builder3 = builder;
        }
        builder3.method(str2, requestBodyCreate$default);
        builder2.headers(e(networkRequest2.getHeaders()));
        return builder2.build();
    }
}
