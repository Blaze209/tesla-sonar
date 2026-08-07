package io.ktor.utils.io.internal;

import io.ktor.utils.io.ByteBufferChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/internal/d;", "", "Ljn0/h0;", "a", "()V", "Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/a;", "c", "()Lio/ktor/utils/io/a;", "delegatedTo", "", "b", "Z", "()Z", "delegateClose", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78741c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_closeWaitJob");
    private volatile /* synthetic */ Object _closeWaitJob;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ByteBufferChannel delegatedTo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean delegateClose;
    private volatile /* synthetic */ int closed;

    public final void a() {
        this.closed = 1;
        Job job = (Job) f78741c.getAndSet(this, null);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDelegateClose() {
        return this.delegateClose;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ByteBufferChannel getDelegatedTo() {
        return this.delegatedTo;
    }
}
