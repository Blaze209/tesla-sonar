package s00;

import okhttp3.RequestBody;
import okio.p0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@FunctionalInterface
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ls00/c;", "Lokio/q;", "Lokio/p0;", "sink", "Lokhttp3/RequestBody;", "requestBody", "Ls00/b;", "progressListener", "<init>", "(Lokio/p0;Lokhttp3/RequestBody;Ls00/b;)V", "Lokio/h;", "source", "", "byteCount", "Ljn0/h0;", "write", "(Lokio/h;J)V", "a", "Lokhttp3/RequestBody;", "b", "Ls00/b;", "c", "J", "bytesWritten", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c extends okio.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RequestBody requestBody;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b progressListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long bytesWritten;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p0 sink, RequestBody requestBody, b progressListener) {
        super(sink);
        s.k(sink, "sink");
        s.k(requestBody, "requestBody");
        s.k(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    @Override // okio.q, okio.p0
    public void write(okio.h source, long byteCount) {
        s.k(source, "source");
        super.write(source, byteCount);
        long j11 = this.bytesWritten + byteCount;
        this.bytesWritten = j11;
        this.progressListener.onProgress(j11, this.requestBody.contentLength());
    }
}
