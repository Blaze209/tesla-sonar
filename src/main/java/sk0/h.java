package sk0;

import bl0.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import wk0.HttpRequestData;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/Request;", "request", "Lwk0/d;", "requestData", "Lokhttp3/Response;", "b", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lwk0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Headers;", "Lbl0/k;", "c", "(Lokhttp3/Headers;)Lbl0/k;", "Lokhttp3/Protocol;", "Lbl0/u;", DateTokenConverter.CONVERTER_KEY, "(Lokhttp3/Protocol;)Lbl0/u;", "Ljava/io/IOException;", "origin", "", "f", "(Lwk0/d;Ljava/io/IOException;)Ljava/lang/Throwable;", "", "e", "(Ljava/io/IOException;)Z", "ktor-client-okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111409a;

        static {
            int[] iArr = new int[Protocol.values().length];
            try {
                iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Protocol.SPDY_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Protocol.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Protocol.QUIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f111409a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Call f111410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Call call) {
            super(1);
            this.f111410c = call;
        }

        public final void a(Throwable th2) {
            this.f111410c.cancel();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\n0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"sk0/h$c", "Lbl0/k;", "", "name", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "", "c", "Z", "()Z", "caseInsensitiveName", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements k {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean caseInsensitiveName = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Headers f111412d;

        c(Headers headers) {
            this.f111412d = headers;
        }

        @Override // dl0.w
        public Set<Map.Entry<String, List<String>>> a() {
            return this.f111412d.toMultimap().entrySet();
        }

        @Override // dl0.w
        public List<String> b(String name) {
            s.k(name, "name");
            List<String> listValues = this.f111412d.values(name);
            if (listValues.isEmpty()) {
                return null;
            }
            return listValues;
        }

        @Override // dl0.w
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getCaseInsensitiveName() {
            return this.caseInsensitiveName;
        }

        @Override // dl0.w
        public void d(p<? super String, ? super List<String>, h0> pVar) {
            k.b.a(this, pVar);
        }

        @Override // dl0.w
        public String get(String str) {
            return k.b.b(this, str);
        }

        @Override // dl0.w
        public Set<String> names() {
            return this.f111412d.names();
        }
    }

    public static final Object b(OkHttpClient okHttpClient, Request request, HttpRequestData httpRequestData, Continuation<? super Response> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Call callNewCall = okHttpClient.newCall(request);
        FirebasePerfOkHttpClient.enqueue(callNewCall, new sk0.b(httpRequestData, cancellableContinuationImpl));
        cancellableContinuationImpl.invokeOnCancellation(new b(callNewCall));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final k c(Headers headers) {
        s.k(headers, "<this>");
        return new c(headers);
    }

    public static final bl0.u d(Protocol protocol) {
        s.k(protocol, "<this>");
        switch (a.f111409a[protocol.ordinal()]) {
            case 1:
                return bl0.u.INSTANCE.a();
            case 2:
                return bl0.u.INSTANCE.b();
            case 3:
                return bl0.u.INSTANCE.e();
            case 4:
                return bl0.u.INSTANCE.c();
            case 5:
                return bl0.u.INSTANCE.c();
            case 6:
                return bl0.u.INSTANCE.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean e(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && t.f0(message, "connect", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(HttpRequestData httpRequestData, IOException iOException) {
        if (iOException instanceof StreamAdapterIOException) {
            Throwable cause = iOException.getCause();
            return cause == null ? iOException : cause;
        }
        if (iOException instanceof SocketTimeoutException) {
            return e(iOException) ? io.ktor.client.plugins.g.a(httpRequestData, iOException) : io.ktor.client.plugins.g.b(httpRequestData, iOException);
        }
        return iOException;
    }
}
