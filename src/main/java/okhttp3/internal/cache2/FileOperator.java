package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import okio.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "pos", "Lokio/h;", "source", "byteCount", "Ljn0/h0;", "write", "(JLokio/h;J)V", "sink", "read", "Ljava/nio/channels/FileChannel;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        s.k(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, h sink, long byteCount) throws IOException {
        s.k(sink, "sink");
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = pos;
        long j12 = byteCount;
        while (j12 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j11, j12, sink);
            j11 += jTransferTo;
            j12 -= jTransferTo;
        }
    }

    public final void write(long pos, h source, long byteCount) throws IOException {
        s.k(source, "source");
        if (byteCount < 0 || byteCount > source.getSize()) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = pos;
        long j12 = byteCount;
        while (j12 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j11, j12);
            j11 += jTransferFrom;
            j12 -= jTransferFrom;
        }
    }
}
