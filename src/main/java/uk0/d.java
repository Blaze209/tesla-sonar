package uk0;

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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010!R\u0014\u0010$\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010&¨\u0006("}, d2 = {"Luk0/d;", "Lyk0/c;", "Lpk0/a;", "call", "Lio/ktor/utils/io/g;", "content", "origin", "<init>", "(Lpk0/a;Lio/ktor/utils/io/g;Lyk0/c;)V", "a", "Lpk0/a;", "I", "()Lpk0/a;", "b", "Lio/ktor/utils/io/g;", "c", "()Lio/ktor/utils/io/g;", "Lyk0/c;", "Lkotlin/coroutines/CoroutineContext;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lbl0/v;", "f", "()Lbl0/v;", PermissionsResponse.STATUS_KEY, "Lbl0/u;", "g", "()Lbl0/u;", "version", "Lfl0/b;", "()Lfl0/b;", "requestTime", "e", "responseTime", "Lbl0/k;", "()Lbl0/k;", "headers", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends yk0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pk0.a call;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.g content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yk0.c origin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    public d(pk0.a call, io.ktor.utils.io.g content, yk0.c origin) {
        s.k(call, "call");
        s.k(content, "content");
        s.k(origin, "origin");
        this.call = call;
        this.content = content;
        this.origin = origin;
        this.coroutineContext = origin.getCoroutineContext();
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: I, reason: from getter */
    public pk0.a getCall() {
        return this.call;
    }

    @Override // bl0.q
    /* JADX INFO: renamed from: b */
    public k getHeaders() {
        return this.origin.getHeaders();
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public io.ktor.utils.io.g getContent() {
        return this.content;
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: d */
    public GMTDate getRequestTime() {
        return this.origin.getRequestTime();
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: e */
    public GMTDate getResponseTime() {
        return this.origin.getResponseTime();
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: f */
    public v getStatus() {
        return this.origin.getStatus();
    }

    @Override // yk0.c
    /* JADX INFO: renamed from: g */
    public u getVersion() {
        return this.origin.getVersion();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
