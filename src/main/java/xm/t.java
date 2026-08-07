package xm;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lxm/t;", "Lsk/h;", "Lcom/facebook/imagepipeline/memory/e;", "pool", "Lsk/k;", "pooledByteStreams", "<init>", "(Lcom/facebook/imagepipeline/memory/e;Lsk/k;)V", "Ljava/io/InputStream;", "inputStream", "Lxm/s;", "g", "(Ljava/io/InputStream;)Lxm/s;", "", "bytes", IntegerTokenConverter.CONVERTER_KEY, "([B)Lxm/s;", "", "initialCapacity", "h", "(Ljava/io/InputStream;I)Lxm/s;", "Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "outputStream", "f", "(Ljava/io/InputStream;Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;)Lxm/s;", "j", "()Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "k", "(I)Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "a", "Lcom/facebook/imagepipeline/memory/e;", "b", "Lsk/k;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements sk.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.imagepipeline.memory.e pool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sk.k pooledByteStreams;

    public t(com.facebook.imagepipeline.memory.e pool, sk.k pooledByteStreams) {
        p013kotlin.jvm.internal.s.k(pool, "pool");
        p013kotlin.jvm.internal.s.k(pooledByteStreams, "pooledByteStreams");
        this.pool = pool;
        this.pooledByteStreams = pooledByteStreams;
    }

    public final s f(InputStream inputStream, MemoryPooledByteBufferOutputStream outputStream) {
        p013kotlin.jvm.internal.s.k(inputStream, "inputStream");
        p013kotlin.jvm.internal.s.k(outputStream, "outputStream");
        this.pooledByteStreams.a(inputStream, outputStream);
        return outputStream.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // sk.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s a(InputStream inputStream) throws X {
        p013kotlin.jvm.internal.s.k(inputStream, "inputStream");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
        try {
            return f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // sk.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public s e(InputStream inputStream, int initialCapacity) throws X {
        p013kotlin.jvm.internal.s.k(inputStream, "inputStream");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
        try {
            return f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // sk.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s c(byte[] bytes) throws X {
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, bytes.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bytes, 0, bytes.length);
                s sVarC = memoryPooledByteBufferOutputStream.c();
                memoryPooledByteBufferOutputStream.close();
                return sVarC;
            } catch (IOException e11) {
                throw pk.p.a(e11);
            }
        } catch (Throwable th2) {
            memoryPooledByteBufferOutputStream.close();
            throw th2;
        }
    }

    @Override // sk.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream b() {
        return new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
    }

    @Override // sk.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream d(int initialCapacity) {
        return new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
    }
}
