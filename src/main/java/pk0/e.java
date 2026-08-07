package pk0;

import bl0.k;
import bl0.u;
import bl0.v;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import fl0.GMTDate;
import io.ktor.utils.io.g;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010&\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u000e\u0010%R\u001a\u0010+\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R \u00102\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b\u0012\u0010/¨\u00063"}, d2 = {"Lpk0/e;", "Lyk0/c;", "Lpk0/c;", "call", "", "body", "origin", "<init>", "(Lpk0/c;[BLyk0/c;)V", "a", "Lpk0/c;", "h", "()Lpk0/c;", "Lkotlinx/coroutines/CompletableJob;", "b", "Lkotlinx/coroutines/CompletableJob;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbl0/v;", "c", "Lbl0/v;", "f", "()Lbl0/v;", PermissionsResponse.STATUS_KEY, "Lbl0/u;", DateTokenConverter.CONVERTER_KEY, "Lbl0/u;", "g", "()Lbl0/u;", "version", "Lfl0/b;", "e", "Lfl0/b;", "()Lfl0/b;", "requestTime", "responseTime", "Lbl0/k;", "Lbl0/k;", "()Lbl0/k;", "headers", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/g;", IntegerTokenConverter.CONVERTER_KEY, "Lio/ktor/utils/io/g;", "()Lio/ktor/utils/io/g;", "getContent$annotations", "()V", "content", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends yk0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c call;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CompletableJob context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u version;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final GMTDate requestTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final GMTDate responseTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k headers;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g content;

    public e(c call, byte[] body, yk0.c origin) {
        s.k(call, "call");
        s.k(body, "body");
        s.k(origin, "origin");
        this.call = call;
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.context = completableJobJob$default;
        this.status = origin.getStatus();
        this.version = origin.getVersion();
        this.requestTime = origin.getRequestTime();
        this.responseTime = origin.getResponseTime();
        this.headers = origin.getHeaders();
        this.coroutineContext = origin.getCoroutineContext().plus(completableJobJob$default);
        this.content = io.ktor.utils.io.d.a(body);
    }

    @Override // bl0.q
    /* JADX INFO: renamed from: b, reason: from getter */
    public k getHeaders() {
        return this.headers;
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public g getContent() {
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

    @Override // yk0.c
    /* JADX INFO: renamed from: h, reason: from getter */
    public c getCall() {
        return this.call;
    }
}
