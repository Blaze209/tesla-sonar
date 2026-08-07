package yk0;

import bl0.k;
import bl0.u;
import bl0.v;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import fl0.GMTDate;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010'\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u0013\u0010&R\u001a\u0010,\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\r\u0010+¨\u0006-"}, d2 = {"Lyk0/a;", "Lyk0/c;", "Lpk0/a;", "call", "Lwk0/g;", "responseData", "<init>", "(Lpk0/a;Lwk0/g;)V", "a", "Lpk0/a;", "I", "()Lpk0/a;", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lbl0/v;", "c", "Lbl0/v;", "f", "()Lbl0/v;", PermissionsResponse.STATUS_KEY, "Lbl0/u;", DateTokenConverter.CONVERTER_KEY, "Lbl0/u;", "g", "()Lbl0/u;", "version", "Lfl0/b;", "e", "Lfl0/b;", "()Lfl0/b;", "requestTime", "responseTime", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/g;", "()Lio/ktor/utils/io/g;", "content", "Lbl0/k;", "h", "Lbl0/k;", "()Lbl0/k;", "headers", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pk0.a call;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u version;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final GMTDate requestTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final GMTDate responseTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.g content;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k headers;

    public a(pk0.a call, wk0.g responseData) {
        s.k(call, "call");
        s.k(responseData, "responseData");
        this.call = call;
        this.coroutineContext = responseData.getCallContext();
        this.status = responseData.getStatusCode();
        this.version = responseData.getVersion();
        this.requestTime = responseData.getRequestTime();
        this.responseTime = responseData.getResponseTime();
        Object body = responseData.getBody();
        io.ktor.utils.io.g gVar = body instanceof io.ktor.utils.io.g ? (io.ktor.utils.io.g) body : null;
        this.content = gVar == null ? io.ktor.utils.io.g.INSTANCE.a() : gVar;
        this.headers = responseData.getHeaders();
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: I, reason: from getter */
    public pk0.a getCall() {
        return this.call;
    }

    @Override // bl0.q
    /* JADX INFO: renamed from: b, reason: from getter */
    public k getHeaders() {
        return this.headers;
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public io.ktor.utils.io.g getContent() {
        return this.content;
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public GMTDate getRequestTime() {
        return this.requestTime;
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: e, reason: from getter */
    public GMTDate getResponseTime() {
        return this.responseTime;
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: f, reason: from getter */
    public v getStatus() {
        return this.status;
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: g, reason: from getter */
    public u getVersion() {
        return this.version;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
