package ip0;

import java.io.EOFException;
import java.io.IOException;
import okio.r0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0018"}, d2 = {"Lip0/h;", "Lokio/r;", "Lokio/r0;", "delegate", "", "size", "", "truncate", "<init>", "(Lokio/r0;JZ)V", "Lokio/h;", "newSize", "Ljn0/h0;", "c", "(Lokio/h;J)V", "sink", "byteCount", "read", "(Lokio/h;J)J", "a", "J", "b", "Z", "bytesReceived", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends okio.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean truncate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long bytesReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r0 delegate, long j11, boolean z11) {
        super(delegate);
        s.k(delegate, "delegate");
        this.size = j11;
        this.truncate = z11;
    }

    private final void c(okio.h hVar, long j11) throws EOFException {
        okio.h hVar2 = new okio.h();
        hVar2.q2(hVar);
        hVar.write(hVar2, j11);
        hVar2.c();
    }

    @Override // okio.r, okio.r0
    public long read(okio.h sink, long byteCount) throws IOException {
        s.k(sink, "sink");
        long j11 = this.bytesReceived;
        long j12 = this.size;
        if (j11 > j12) {
            byteCount = 0;
        } else if (this.truncate) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j13);
        }
        long j14 = super.read(sink, byteCount);
        if (j14 != -1) {
            this.bytesReceived += j14;
        }
        long j15 = this.bytesReceived;
        long j16 = this.size;
        if ((j15 >= j16 || j14 != -1) && j15 <= j16) {
            return j14;
        }
        if (j14 > 0 && j15 > j16) {
            c(sink, sink.getSize() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
