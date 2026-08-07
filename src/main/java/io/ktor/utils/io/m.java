package io.ktor.utils.io;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/m;", "", "Lio/ktor/utils/io/u;", "Lkotlinx/coroutines/CoroutineScope;", "delegate", "Lio/ktor/utils/io/c;", "channel", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/c;)V", "a", "Lio/ktor/utils/io/c;", "b", "()Lio/ktor/utils/io/c;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m implements CoroutineScope, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f78830b;

    public m(CoroutineScope delegate, c channel) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(channel, "channel");
        this.channel = channel;
        this.f78830b = delegate;
    }

    @Override // io.ktor.utils.io.u
    /* JADX INFO: renamed from: b, reason: from getter */
    public c getChannel() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f78830b.getCoroutineContext();
    }
}
