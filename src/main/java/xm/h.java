package xm;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class h implements q, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f123730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f123731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f123732c = System.identityHashCode(this);

    public h(int i11) {
        this.f123730a = ByteBuffer.allocateDirect(i11);
        this.f123731b = i11;
    }

    private void p(int i11, q qVar, int i12, int i13) {
        if (!(qVar instanceof h)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        pk.k.i(!isClosed());
        pk.k.i(!qVar.isClosed());
        pk.k.g(this.f123730a);
        r.b(i11, qVar.getSize(), i12, i13, this.f123731b);
        this.f123730a.position(i11);
        ByteBuffer byteBuffer = (ByteBuffer) pk.k.g(qVar.g());
        byteBuffer.position(i12);
        byte[] bArr = new byte[i13];
        this.f123730a.get(bArr, 0, i13);
        byteBuffer.put(bArr, 0, i13);
    }

    @Override // xm.q
    public synchronized int M(int i11, byte[] bArr, int i12, int i13) {
        int iA;
        pk.k.g(bArr);
        pk.k.i(!isClosed());
        pk.k.g(this.f123730a);
        iA = r.a(i11, i13, this.f123731b);
        r.b(i11, bArr.length, i12, iA, this.f123731b);
        this.f123730a.position(i11);
        this.f123730a.get(bArr, i12, iA);
        return iA;
    }

    @Override // xm.q
    public synchronized byte Q(int i11) {
        boolean z11 = true;
        pk.k.i(!isClosed());
        pk.k.b(Boolean.valueOf(i11 >= 0));
        if (i11 >= this.f123731b) {
            z11 = false;
        }
        pk.k.b(Boolean.valueOf(z11));
        pk.k.g(this.f123730a);
        return this.f123730a.get(i11);
    }

    @Override // xm.q
    public long c() {
        return this.f123732c;
    }

    @Override // xm.q, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f123730a = null;
    }

    @Override // xm.q
    public synchronized ByteBuffer g() {
        return this.f123730a;
    }

    @Override // xm.q
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // xm.q
    public int getSize() {
        return this.f123731b;
    }

    @Override // xm.q
    public synchronized boolean isClosed() {
        return this.f123730a == null;
    }

    @Override // xm.q
    public synchronized int n(int i11, byte[] bArr, int i12, int i13) {
        int iA;
        pk.k.g(bArr);
        pk.k.i(!isClosed());
        pk.k.g(this.f123730a);
        iA = r.a(i11, i13, this.f123731b);
        r.b(i11, bArr.length, i12, iA, this.f123731b);
        this.f123730a.position(i11);
        this.f123730a.put(bArr, i12, iA);
        return iA;
    }

    @Override // xm.q
    public void o(int i11, q qVar, int i12, int i13) {
        pk.k.g(qVar);
        if (qVar.c() == c()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(c()) + " to BufferMemoryChunk " + Long.toHexString(qVar.c()) + " which are the same ");
            pk.k.b(Boolean.FALSE);
        }
        if (qVar.c() < c()) {
            synchronized (qVar) {
                synchronized (this) {
                    p(i11, qVar, i12, i13);
                }
            }
        } else {
            synchronized (this) {
                synchronized (qVar) {
                    p(i11, qVar, i12, i13);
                }
            }
        }
    }
}
