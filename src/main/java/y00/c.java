package y00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.util.FileSize;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"Ly00/c;", "Lfr0/b;", "<init>", "()V", "", "contentSize", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "getSize", "()J", "b", "offset", "Ljn0/h0;", "f", "(J)V", "e", "a", "Ljava/nio/channels/WritableByteChannel;", "writableByteChannel", "c", "(Ljava/nio/channels/WritableByteChannel;)V", "J", "dataOffset", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements fr0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long contentSize = FileSize.GB_COEFFICIENT;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long dataOffset;

    private final boolean d(long contentSize) {
        return contentSize + ((long) 8) < 4294967296L;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentSize() {
        return this.contentSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDataOffset() {
        return this.dataOffset;
    }

    @Override // fr0.b
    public void c(WritableByteChannel writableByteChannel) throws IOException {
        s.k(writableByteChannel, "writableByteChannel");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        long size = getSize();
        if (!d(size) || size < 0 || size > 4294967296L) {
            mr0.e.g(byteBufferAllocate, 1L);
        } else {
            mr0.e.g(byteBufferAllocate, size);
        }
        byteBufferAllocate.put(fr0.c.B("mdat"));
        if (d(size)) {
            byteBufferAllocate.put(new byte[8]);
        } else {
            if (size < 0) {
                size = 1;
            }
            mr0.e.h(byteBufferAllocate, size);
        }
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
    }

    public final void e(long contentSize) {
        this.contentSize = contentSize;
    }

    public final void f(long offset) {
        this.dataOffset = offset;
    }

    @Override // fr0.b
    public long getSize() {
        return ((long) 16) + this.contentSize;
    }
}
