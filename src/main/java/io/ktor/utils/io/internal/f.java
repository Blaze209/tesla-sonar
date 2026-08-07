package io.ktor.utils.io.internal;

import io.ktor.utils.io.ByteBufferChannel;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/internal/f;", "", "Lio/ktor/utils/io/a;", "channel", "<init>", "(Lio/ktor/utils/io/a;)V", "a", "Lio/ktor/utils/io/a;", "Lml0/a;", "b", "Lml0/a;", "lastView", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ByteBufferChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ml0.a lastView;

    public f(ByteBufferChannel channel) {
        s.k(channel, "channel");
        this.channel = channel;
        this.lastView = ml0.a.INSTANCE.a();
    }
}
