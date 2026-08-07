package xm;

import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class s implements PooledByteBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f123748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    tk.a<q> f123749b;

    public s(tk.a<q> aVar, int i11) {
        pk.k.g(aVar);
        pk.k.b(Boolean.valueOf(i11 >= 0 && i11 <= aVar.H().getSize()));
        this.f123749b = aVar.clone();
        this.f123748a = i11;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int M(int i11, byte[] bArr, int i12, int i13) {
        c();
        pk.k.b(Boolean.valueOf(i11 + i13 <= this.f123748a));
        pk.k.g(this.f123749b);
        return this.f123749b.H().M(i11, bArr, i12, i13);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized byte Q(int i11) {
        c();
        pk.k.b(Boolean.valueOf(i11 >= 0));
        pk.k.b(Boolean.valueOf(i11 < this.f123748a));
        pk.k.g(this.f123749b);
        return this.f123749b.H().Q(i11);
    }

    synchronized void c() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        tk.a.C(this.f123749b);
        this.f123749b = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized ByteBuffer g() {
        pk.k.g(this.f123749b);
        return this.f123749b.H().g();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized long getNativePtr() {
        c();
        pk.k.g(this.f123749b);
        return this.f123749b.H().getNativePtr();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !tk.a.b0(this.f123749b);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        c();
        return this.f123748a;
    }
}
