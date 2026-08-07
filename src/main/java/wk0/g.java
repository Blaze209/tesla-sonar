package wk0;

import bl0.k;
import bl0.u;
import bl0.v;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fl0.GMTDate;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0012\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b\u0016\u0010$R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006&"}, d2 = {"Lwk0/g;", "", "Lbl0/v;", "statusCode", "Lfl0/b;", "requestTime", "Lbl0/k;", "headers", "Lbl0/u;", "version", "body", "Lkotlin/coroutines/CoroutineContext;", "callContext", "<init>", "(Lbl0/v;Lfl0/b;Lbl0/k;Lbl0/u;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "", "toString", "()Ljava/lang/String;", "a", "Lbl0/v;", "f", "()Lbl0/v;", "b", "Lfl0/b;", DateTokenConverter.CONVERTER_KEY, "()Lfl0/b;", "c", "Lbl0/k;", "()Lbl0/k;", "Lbl0/u;", "g", "()Lbl0/u;", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "responseTime", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final v statusCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final GMTDate requestTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u version;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object body;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext callContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final GMTDate responseTime;

    public g(v statusCode, GMTDate requestTime, k headers, u version, Object body, CoroutineContext callContext) {
        s.k(statusCode, "statusCode");
        s.k(requestTime, "requestTime");
        s.k(headers, "headers");
        s.k(version, "version");
        s.k(body, "body");
        s.k(callContext, "callContext");
        this.statusCode = statusCode;
        this.requestTime = requestTime;
        this.headers = headers;
        this.version = version;
        this.body = body;
        this.callContext = callContext;
        this.responseTime = fl0.a.b(null, 1, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CoroutineContext getCallContext() {
        return this.callContext;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final GMTDate getRequestTime() {
        return this.requestTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final GMTDate getResponseTime() {
        return this.responseTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final v getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final u getVersion() {
        return this.version;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.statusCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
