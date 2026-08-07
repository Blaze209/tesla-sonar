package g1;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f66888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec.BufferInfo f66889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f66890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f66891d;

    public g(@NonNull h hVar) {
        this.f66889b = o(hVar);
        this.f66888a = n(hVar);
        final AtomicReference atomicReference = new AtomicReference();
        this.f66890c = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: g1.f
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return g.c(atomicReference, aVar);
            }
        });
        this.f66891d = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    @NonNull
    private ByteBuffer n(@NonNull h hVar) {
        ByteBuffer byteBufferG = hVar.g();
        MediaCodec.BufferInfo bufferInfoF0 = hVar.f0();
        byteBufferG.position(bufferInfoF0.offset);
        byteBufferG.limit(bufferInfoF0.offset + bufferInfoF0.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoF0.size);
        byteBufferAllocate.order(byteBufferG.order());
        byteBufferAllocate.put(byteBufferG);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    @NonNull
    private MediaCodec.BufferInfo o(@NonNull h hVar) {
        MediaCodec.BufferInfo bufferInfoF0 = hVar.f0();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoF0.size, bufferInfoF0.presentationTimeUs, bufferInfoF0.flags);
        return bufferInfo;
    }

    @Override // g1.h, java.lang.AutoCloseable
    public void close() {
        this.f66891d.c(null);
    }

    @Override // g1.h
    @NonNull
    public MediaCodec.BufferInfo f0() {
        return this.f66889b;
    }

    @Override // g1.h
    @NonNull
    public ByteBuffer g() {
        return this.f66888a;
    }

    @Override // g1.h
    public boolean j0() {
        return (this.f66889b.flags & 1) != 0;
    }

    @Override // g1.h
    public long size() {
        return this.f66889b.size;
    }

    @Override // g1.h
    public long x0() {
        return this.f66889b.presentationTimeUs;
    }
}
