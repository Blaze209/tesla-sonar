package com.facebook.imagepipeline.memory;

import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sk.j;
import xm.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "Lsk/j;", "Lcom/facebook/imagepipeline/memory/e;", "pool", "", "initialCapacity", "<init>", "(Lcom/facebook/imagepipeline/memory/e;I)V", "Ljn0/h0;", "n", "()V", "Lxm/s;", "p", "()Lxm/s;", "size", "()I", "oneByte", "write", "(I)V", "", "buffer", "offset", "count", "([BII)V", "close", "newLength", "o", "a", "Lcom/facebook/imagepipeline/memory/e;", "Ltk/a;", "Lxm/q;", "b", "Ltk/a;", "bufRef", "c", "I", "InvalidStreamException", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MemoryPooledByteBufferOutputStream extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e pool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private tk.a<q> bufRef;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int count;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream$InvalidStreamException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ MemoryPooledByteBufferOutputStream(e eVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i12 & 2) != 0 ? eVar.E() : i11);
    }

    private final void n() {
        if (!tk.a.b0(this.bufRef)) {
            throw new InvalidStreamException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // sk.j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X {
        tk.a.C(this.bufRef);
        this.bufRef = null;
        this.count = -1;
        super.close();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public final void o(int newLength) throws X {
        n();
        tk.a<q> aVar = this.bufRef;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        s.h(aVar);
        if (newLength <= aVar.H().getSize()) {
            return;
        }
        q qVar = this.pool.get(newLength);
        s.j(qVar, "get(...)");
        q qVar2 = qVar;
        tk.a<q> aVar2 = this.bufRef;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        s.h(aVar2);
        aVar2.H().o(0, qVar2, 0, this.count);
        tk.a<q> aVar3 = this.bufRef;
        s.h(aVar3);
        aVar3.close();
        this.bufRef = tk.a.k0(qVar2, this.pool);
    }

    @Override // sk.j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public xm.s c() {
        n();
        tk.a<q> aVar = this.bufRef;
        if (aVar != null) {
            return new xm.s(aVar, this.count);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // sk.j
    /* JADX INFO: renamed from: size, reason: from getter */
    public int getCount() {
        return this.count;
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) throws IOException {
        write(new byte[]{(byte) oneByte});
    }

    public MemoryPooledByteBufferOutputStream(e pool, int i11) {
        s.k(pool, "pool");
        if (i11 > 0) {
            this.pool = pool;
            this.count = 0;
            this.bufRef = tk.a.k0(pool.get(i11), pool);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // java.io.OutputStream
    public void write(byte[] buffer, int offset, int count) throws X {
        s.k(buffer, "buffer");
        if (offset >= 0 && count >= 0 && offset + count <= buffer.length) {
            n();
            o(this.count + count);
            tk.a<q> aVar = this.bufRef;
            if (aVar != null) {
                aVar.H().n(this.count, buffer, offset, count);
                this.count += count;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + offset + "; regionLength=" + count);
    }
}
