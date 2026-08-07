package g1;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f66957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec.BufferInfo f66958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f66959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteBuffer f66960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f66961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f66962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f66963g = new AtomicBoolean(false);

    j(@NonNull MediaCodec mediaCodec, int i11, @NonNull MediaCodec.BufferInfo bufferInfo) {
        this.f66957a = (MediaCodec) u5.h.g(mediaCodec);
        this.f66959c = i11;
        this.f66960d = mediaCodec.getOutputBuffer(i11);
        this.f66958b = (MediaCodec.BufferInfo) u5.h.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f66961e = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: g1.i
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return j.c(atomicReference, aVar);
            }
        });
        this.f66962f = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    private void o() {
        if (this.f66963g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // g1.h, java.lang.AutoCloseable
    public void close() {
        if (this.f66963g.getAndSet(true)) {
            return;
        }
        try {
            this.f66957a.releaseOutputBuffer(this.f66959c, false);
            this.f66962f.c(null);
        } catch (IllegalStateException e11) {
            this.f66962f.f(e11);
        }
    }

    @Override // g1.h
    @NonNull
    public MediaCodec.BufferInfo f0() {
        return this.f66958b;
    }

    @Override // g1.h
    @NonNull
    public ByteBuffer g() {
        o();
        this.f66960d.position(this.f66958b.offset);
        ByteBuffer byteBuffer = this.f66960d;
        MediaCodec.BufferInfo bufferInfo = this.f66958b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f66960d;
    }

    @Override // g1.h
    public boolean j0() {
        return (this.f66958b.flags & 1) != 0;
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> n() {
        return j0.n.s(this.f66961e);
    }

    @Override // g1.h
    public long size() {
        return this.f66958b.size;
    }

    @Override // g1.h
    public long x0() {
        return this.f66958b.presentationTimeUs;
    }
}
