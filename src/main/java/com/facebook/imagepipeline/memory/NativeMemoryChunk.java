package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import pk.k;
import xm.q;
import xm.r;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
public class NativeMemoryChunk implements q, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21706c;

    static {
        bp.a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i11) {
        k.b(Boolean.valueOf(i11 > 0));
        this.f21705b = i11;
        this.f21704a = nativeAllocate(i11);
        this.f21706c = false;
    }

    @pk.d
    private static native long nativeAllocate(int i11);

    @pk.d
    private static native void nativeCopyFromByteArray(long j11, byte[] bArr, int i11, int i12);

    @pk.d
    private static native void nativeCopyToByteArray(long j11, byte[] bArr, int i11, int i12);

    @pk.d
    private static native void nativeFree(long j11);

    @pk.d
    private static native void nativeMemcpy(long j11, long j12, int i11);

    @pk.d
    private static native byte nativeReadByte(long j11);

    private void p(int i11, q qVar, int i12, int i13) {
        if (!(qVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!qVar.isClosed());
        r.b(i11, qVar.getSize(), i12, i13, this.f21705b);
        nativeMemcpy(qVar.getNativePtr() + ((long) i12), this.f21704a + ((long) i11), i13);
    }

    @Override // xm.q
    public synchronized int M(int i11, byte[] bArr, int i12, int i13) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = r.a(i11, i13, this.f21705b);
        r.b(i11, bArr.length, i12, iA, this.f21705b);
        nativeCopyToByteArray(this.f21704a + ((long) i11), bArr, i12, iA);
        return iA;
    }

    @Override // xm.q
    public synchronized byte Q(int i11) {
        boolean z11 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i11 >= 0));
        if (i11 >= this.f21705b) {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        return nativeReadByte(this.f21704a + ((long) i11));
    }

    @Override // xm.q
    public long c() {
        return this.f21704a;
    }

    @Override // xm.q, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f21706c) {
            this.f21706c = true;
            nativeFree(this.f21704a);
        }
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // xm.q
    public ByteBuffer g() {
        return null;
    }

    @Override // xm.q
    public long getNativePtr() {
        return this.f21704a;
    }

    @Override // xm.q
    public int getSize() {
        return this.f21705b;
    }

    @Override // xm.q
    public synchronized boolean isClosed() {
        return this.f21706c;
    }

    @Override // xm.q
    public synchronized int n(int i11, byte[] bArr, int i12, int i13) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = r.a(i11, i13, this.f21705b);
        r.b(i11, bArr.length, i12, iA, this.f21705b);
        nativeCopyFromByteArray(this.f21704a + ((long) i11), bArr, i12, iA);
        return iA;
    }

    @Override // xm.q
    public void o(int i11, q qVar, int i12, int i13) {
        k.g(qVar);
        if (qVar.c() == c()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(qVar)) + " which share the same address " + Long.toHexString(this.f21704a));
            k.b(Boolean.FALSE);
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

    public NativeMemoryChunk() {
        this.f21705b = 0;
        this.f21704a = 0L;
        this.f21706c = true;
    }
}
