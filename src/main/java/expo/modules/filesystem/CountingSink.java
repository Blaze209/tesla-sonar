package expo.modules.filesystem;

import okhttp3.RequestBody;
import okio.h;
import okio.p0;
import okio.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/filesystem/CountingSink;", "Lokio/q;", "Lokio/p0;", "sink", "Lokhttp3/RequestBody;", "requestBody", "Lexpo/modules/filesystem/CountingRequestListener;", "progressListener", "<init>", "(Lokio/p0;Lokhttp3/RequestBody;Lexpo/modules/filesystem/CountingRequestListener;)V", "Lokio/h;", "source", "", "byteCount", "Ljn0/h0;", "write", "(Lokio/h;J)V", "Lokhttp3/RequestBody;", "Lexpo/modules/filesystem/CountingRequestListener;", "bytesWritten", "J", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CountingSink extends q {
    private long bytesWritten;
    private final CountingRequestListener progressListener;
    private final RequestBody requestBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountingSink(p0 sink, RequestBody requestBody, CountingRequestListener progressListener) {
        super(sink);
        s.k(sink, "sink");
        s.k(requestBody, "requestBody");
        s.k(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    @Override // okio.q, okio.p0
    public void write(h source, long byteCount) {
        s.k(source, "source");
        super.write(source, byteCount);
        long j11 = this.bytesWritten + byteCount;
        this.bytesWritten = j11;
        this.progressListener.onProgress(j11, this.requestBody.contentLength());
    }
}
