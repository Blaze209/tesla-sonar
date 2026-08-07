package xm;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(27)
public class a implements q, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedMemory f123709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f123710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f123711c;

    public a(int i11) {
        pk.k.b(Boolean.valueOf(i11 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i11);
            this.f123709a = sharedMemoryCreate;
            this.f123710b = sharedMemoryCreate.mapReadWrite();
            this.f123711c = System.identityHashCode(this);
        } catch (ErrnoException e11) {
            throw new RuntimeException("Fail to create AshmemMemory", e11);
        }
    }

    private void p(int i11, q qVar, int i12, int i13) {
        if (!(qVar instanceof a)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        pk.k.i(!isClosed());
        pk.k.i(!qVar.isClosed());
        pk.k.g(this.f123710b);
        pk.k.g(qVar.g());
        r.b(i11, qVar.getSize(), i12, i13, getSize());
        this.f123710b.position(i11);
        qVar.g().position(i12);
        byte[] bArr = new byte[i13];
        this.f123710b.get(bArr, 0, i13);
        qVar.g().put(bArr, 0, i13);
    }

    @Override // xm.q
    public synchronized int M(int i11, byte[] bArr, int i12, int i13) {
        int iA;
        pk.k.g(bArr);
        pk.k.g(this.f123710b);
        iA = r.a(i11, i13, getSize());
        r.b(i11, bArr.length, i12, iA, getSize());
        this.f123710b.position(i11);
        this.f123710b.get(bArr, i12, iA);
        return iA;
    }

    @Override // xm.q
    public synchronized byte Q(int i11) {
        boolean z11 = true;
        pk.k.i(!isClosed());
        pk.k.b(Boolean.valueOf(i11 >= 0));
        if (i11 >= getSize()) {
            z11 = false;
        }
        pk.k.b(Boolean.valueOf(z11));
        pk.k.g(this.f123710b);
        return this.f123710b.get(i11);
    }

    @Override // xm.q
    public long c() {
        return this.f123711c;
    }

    @Override // xm.q, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f123709a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f123710b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f123710b = null;
                this.f123709a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // xm.q
    public ByteBuffer g() {
        return this.f123710b;
    }

    @Override // xm.q
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // xm.q
    public int getSize() {
        pk.k.g(this.f123709a);
        return this.f123709a.getSize();
    }

    @Override // xm.q
    public synchronized boolean isClosed() {
        return this.f123710b == null || this.f123709a == null;
    }

    @Override // xm.q
    public synchronized int n(int i11, byte[] bArr, int i12, int i13) {
        int iA;
        pk.k.g(bArr);
        pk.k.g(this.f123710b);
        iA = r.a(i11, i13, getSize());
        r.b(i11, bArr.length, i12, iA, getSize());
        this.f123710b.position(i11);
        this.f123710b.put(bArr, i12, iA);
        return iA;
    }

    @Override // xm.q
    public void o(int i11, q qVar, int i12, int i13) {
        pk.k.g(qVar);
        if (qVar.c() == c()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(c()) + " to AshmemMemoryChunk " + Long.toHexString(qVar.c()) + " which are the same ");
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
