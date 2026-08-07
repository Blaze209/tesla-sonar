package com.stripe.android.stripe3ds2.transaction;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0002\"(B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u0004\u0018\u00010\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001aH\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/r;", "Lt80/k;", "", ImagesContract.URL, "Lcom/stripe/android/stripe3ds2/transaction/r$a;", "connectionFactory", "Lr80/c;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/r$a;Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "requestBody", CMSAttributeTableGenerator.CONTENT_TYPE, "Lt80/l;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lt80/l;", "", "responseCode", "", "l", "(I)Z", "Ljava/io/InputStream;", "inputStream", "j", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;", "f", "()Ljava/net/HttpURLConnection;", "e", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conn", "k", "(Ljava/net/HttpURLConnection;)Lt80/l;", "Ljava/lang/String;", "b", "Lcom/stripe/android/stripe3ds2/transaction/r$a;", "c", "Lr80/c;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r implements t80.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a connectionFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/r$a;", "", "", ImagesContract.URL, "Ljava/net/HttpURLConnection;", "a", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        HttpURLConnection a(String url);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/r$b;", "Lcom/stripe/android/stripe3ds2/transaction/r$a;", "<init>", "()V", "", ImagesContract.URL, "Ljava/net/HttpURLConnection;", "a", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {
        @Override // com.stripe.android.stripe3ds2.transaction.r.a
        public HttpURLConnection a(String url) {
            s.k(url, "url");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
            s.i(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) uRLConnection;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Ljava/io/InputStream;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doGetRequest$2", f = "StripeHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super InputStream>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54091n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f54092o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = r.this.new c(continuation);
            cVar.f54092o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f54091n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            r rVar = r.this;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                HttpURLConnection httpURLConnectionF = rVar.f();
                httpURLConnectionF.connect();
                objB = jn0.s.b(httpURLConnectionF.getResponseCode() == 200 ? httpURLConnectionF.getInputStream() : null);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            r rVar2 = r.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                rVar2.errorReporter.Y0(thE);
            }
            if (jn0.s.g(objB)) {
                return null;
            }
            return objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InputStream> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lt80/l;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lt80/l;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeHttpClient$doPostRequest$2", f = "StripeHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super t80.l>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54094n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f54095o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f54097q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f54098r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f54097q = str;
            this.f54098r = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = r.this.new d(this.f54097q, this.f54098r, continuation);
            dVar.f54095o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f54094n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            r rVar = r.this;
            String str = this.f54097q;
            String str2 = this.f54098r;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(rVar.i(str, str2));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            r rVar2 = r.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                rVar2.errorReporter.Y0(thE);
            }
            Throwable thE2 = jn0.s.e(objB);
            if (thE2 == null) {
                return objB;
            }
            throw new SDKRuntimeException(thE2);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super t80.l> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public r(String url, a connectionFactory, r80.c errorReporter, CoroutineContext workContext) {
        s.k(url, "url");
        s.k(connectionFactory, "connectionFactory");
        s.k(errorReporter, "errorReporter");
        s.k(workContext, "workContext");
        this.url = url;
        this.connectionFactory = connectionFactory;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    private final HttpURLConnection e() {
        return this.connectionFactory.a(this.url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpURLConnection f() {
        HttpURLConnection httpURLConnectionE = e();
        httpURLConnectionE.setDoInput(true);
        return httpURLConnectionE;
    }

    private final HttpURLConnection g(String requestBody, String contentType) throws ProtocolException {
        HttpURLConnection httpURLConnectionE = e();
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        httpURLConnectionE.setRequestProperty("Content-Type", contentType);
        httpURLConnectionE.setRequestProperty("Content-Length", String.valueOf(requestBody.length()));
        return httpURLConnectionE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t80.l i(String requestBody, String contentType) throws IOException {
        HttpURLConnection httpURLConnectionG = g(requestBody, contentType);
        OutputStream outputStream = httpURLConnectionG.getOutputStream();
        try {
            s.h(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            s.j(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(requestBody);
                outputStreamWriter.flush();
                h0 h0Var = h0.f84049a;
                sn0.b.a(outputStreamWriter, null);
                sn0.b.a(outputStream, null);
                httpURLConnectionG.connect();
                return k(httpURLConnectionG);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(outputStreamWriter, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                sn0.b.a(outputStream, th4);
                throw th5;
            }
        }
    }

    private final String j(InputStream inputStream) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked);
            try {
                String strF = sn0.r.f(bufferedReader);
                sn0.b.a(bufferedReader, null);
                objB = jn0.s.b(strF);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th4));
        }
        String str = (String) (jn0.s.g(objB) ? null : objB);
        return str == null ? "" : str;
    }

    private final boolean l(int responseCode) {
        return 200 <= responseCode && responseCode < 300;
    }

    @Override // t80.k
    public Object a(String str, String str2, Continuation<? super t80.l> continuation) {
        return BuildersKt.withContext(this.workContext, new d(str, str2, null), continuation);
    }

    public Object h(Continuation<? super InputStream> continuation) {
        return BuildersKt.withContext(this.workContext, new c(null), continuation);
    }

    public final t80.l k(HttpURLConnection conn) throws IOException {
        s.k(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (l(responseCode)) {
            InputStream inputStream = conn.getInputStream();
            s.j(inputStream, "getInputStream(...)");
            return new t80.l(j(inputStream), conn.getContentType());
        }
        throw new SDKRuntimeException("Unsuccessful response code from " + this.url + ": " + responseCode, null, 2, null);
    }

    public /* synthetic */ r(String str, a aVar, r80.c cVar, CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new b() : aVar, cVar, coroutineContext);
    }
}
