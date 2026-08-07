package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H$¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0013H$¢\u0006\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\fR\u001b\u0010,\u001a\u00060&j\u0002`'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lokio/m;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "Lokio/h;", "sink", "byteCount", "I", "(JLokio/h;J)J", "size", "()J", "Lokio/r0;", "J", "(J)Lokio/r0;", "Ljn0/h0;", "close", "()V", "", "array", "", "arrayOffset", "C", "(J[BII)I", "H", "B", "a", "Z", "getReadWrite", "()Z", "b", "closed", "c", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/locks/ReentrantLock;", "t", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean readWrite;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int openStreamCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = v0.b();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lokio/m$a;", "Lokio/r0;", "Lokio/m;", "fileHandle", "", "position", "<init>", "(Lokio/m;J)V", "Lokio/h;", "sink", "byteCount", "read", "(Lokio/h;J)J", "Lokio/s0;", "timeout", "()Lokio/s0;", "Ljn0/h0;", "close", "()V", "a", "Lokio/m;", "getFileHandle", "()Lokio/m;", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "", "c", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m fileHandle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long position;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a(m fileHandle, long j11) {
            p013kotlin.jvm.internal.s.k(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j11;
        }

        @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                this.fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    lock.unlock();
                    this.fileHandle.B();
                    return;
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Override // okio.r0
        public long read(h sink, long byteCount) {
            p013kotlin.jvm.internal.s.k(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long jI = this.fileHandle.I(this.position, sink, byteCount);
            if (jI != -1) {
                this.position += jI;
            }
            return jI;
        }

        @Override // okio.r0
        public s0 timeout() {
            return s0.NONE;
        }
    }

    public m(boolean z11) {
        this.readWrite = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long I(long fileOffset, h sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        long j11 = byteCount + fileOffset;
        long j12 = fileOffset;
        while (j12 < j11) {
            m0 m0VarU0 = sink.u0(1);
            byte[] bArr = m0VarU0.data;
            int i11 = m0VarU0.limit;
            int iC = C(j12, bArr, i11, (int) Math.min(j11 - j12, 8192 - i11));
            if (iC == -1) {
                if (m0VarU0.pos == m0VarU0.limit) {
                    sink.head = m0VarU0.b();
                    n0.b(m0VarU0);
                }
                if (fileOffset != j12) {
                    break;
                }
                return -1L;
            }
            m0VarU0.limit += iC;
            long j13 = iC;
            j12 += j13;
            sink.r0(sink.getSize() + j13);
        }
        return j12 - fileOffset;
    }

    protected abstract void B();

    protected abstract int C(long fileOffset, byte[] array, int arrayOffset, int byteCount);

    protected abstract long H();

    public final r0 J(long fileOffset) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new a(this, fileOffset);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                reentrantLock.unlock();
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                reentrantLock.unlock();
                return;
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            reentrantLock.unlock();
            B();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            reentrantLock.unlock();
            return H();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ReentrantLock getLock() {
        return this.lock;
    }
}
