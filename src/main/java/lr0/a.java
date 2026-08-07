package lr0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements fr0.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Logger f90670f = LoggerFactory.getLogger((Class<?>) a.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f90671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f90672b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f90674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f90675e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f90673c = true;

    protected a(String str) {
        this.f90671a = str;
    }

    private void e(ByteBuffer byteBuffer) {
        if (i()) {
            mr0.e.g(byteBuffer, getSize());
            byteBuffer.put(fr0.c.B(f()));
        } else {
            mr0.e.g(byteBuffer, 1L);
            byteBuffer.put(fr0.c.B(f()));
            mr0.e.h(byteBuffer, getSize());
        }
        if ("uuid".equals(f())) {
            byteBuffer.put(g());
        }
    }

    private boolean i() {
        int i11 = "uuid".equals(f()) ? 24 : 8;
        if (!this.f90673c) {
            return ((long) (this.f90672b.limit() + i11)) < 4294967296L;
        }
        long jD = d();
        ByteBuffer byteBuffer = this.f90675e;
        return (jD + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i11) < 4294967296L;
    }

    protected abstract void a(ByteBuffer byteBuffer);

    protected abstract void b(ByteBuffer byteBuffer);

    @Override // fr0.b
    public void c(WritableByteChannel writableByteChannel) throws IOException {
        if (!this.f90673c) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i() ? 8 : 16) + ("uuid".equals(f()) ? 16 : 0));
            e(byteBufferAllocate);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
            writableByteChannel.write((ByteBuffer) this.f90672b.position(0));
            return;
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(mr0.a.a(getSize()));
        e(byteBufferAllocate2);
        b(byteBufferAllocate2);
        ByteBuffer byteBuffer = this.f90675e;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.f90675e.remaining() > 0) {
                byteBufferAllocate2.put(this.f90675e);
            }
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate2.rewind());
    }

    protected abstract long d();

    public String f() {
        return this.f90671a;
    }

    public byte[] g() {
        return this.f90674d;
    }

    @Override // fr0.b
    public long getSize() {
        long jD = this.f90673c ? d() : this.f90672b.limit();
        long j11 = jD + ((long) ((jD >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(f()) ? 16 : 0)));
        ByteBuffer byteBuffer = this.f90675e;
        return j11 + ((long) (byteBuffer != null ? byteBuffer.limit() : 0));
    }

    public boolean h() {
        return this.f90673c;
    }

    public final synchronized void j() {
        try {
            f90670f.debug("parsing details of {}", f());
            ByteBuffer byteBuffer = this.f90672b;
            if (byteBuffer != null) {
                this.f90673c = true;
                byteBuffer.rewind();
                a(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f90675e = byteBuffer.slice();
                }
                this.f90672b = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
