package io.ktor.utils.io.jvm.javaio;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"", "b", "()Z", "Ljava/lang/ThreadLocal;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", "a", "Ljava/lang/ThreadLocal;", "parkingImplLocal", "()Lio/ktor/utils/io/jvm/javaio/e;", "parkingImpl", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<e<Thread>> f78819a = new ThreadLocal<>();

    public static final e<Thread> a() {
        e<Thread> eVar = f78819a.get();
        return eVar == null ? c.f78808a : eVar;
    }

    public static final boolean b() {
        return a() != g.f78820a;
    }
}
