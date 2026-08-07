package g1;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
class h1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f66946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f66948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f66949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f66950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f66951f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f66952g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66953h = false;

    h1(@NonNull MediaCodec mediaCodec, int i11) {
        this.f66946a = (MediaCodec) u5.h.g(mediaCodec);
        this.f66947b = u5.h.d(i11);
        this.f66948c = mediaCodec.getInputBuffer(i11);
        final AtomicReference atomicReference = new AtomicReference();
        this.f66949d = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: g1.g1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return h1.e(atomicReference, aVar);
            }
        });
        this.f66950e = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference.get());
    }

    public static /* synthetic */ Object e(AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    private void f() {
        if (this.f66951f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // g1.f1
    public void a(boolean z11) {
        f();
        this.f66953h = z11;
    }

    @Override // g1.f1
    public boolean b() {
        if (this.f66951f.getAndSet(true)) {
            return false;
        }
        try {
            this.f66946a.queueInputBuffer(this.f66947b, this.f66948c.position(), this.f66948c.limit(), this.f66952g, this.f66953h ? 4 : 0);
            this.f66950e.c(null);
            return true;
        } catch (IllegalStateException e11) {
            this.f66950e.f(e11);
            return false;
        }
    }

    @Override // g1.f1
    @NonNull
    public com.google.common.util.concurrent.s<Void> c() {
        return j0.n.s(this.f66949d);
    }

    @Override // g1.f1
    public boolean cancel() {
        if (this.f66951f.getAndSet(true)) {
            return false;
        }
        try {
            this.f66946a.queueInputBuffer(this.f66947b, 0, 0, 0L, 0);
            this.f66950e.c(null);
        } catch (IllegalStateException e11) {
            this.f66950e.f(e11);
        }
        return true;
    }

    @Override // g1.f1
    public void d(long j11) {
        f();
        u5.h.a(j11 >= 0);
        this.f66952g = j11;
    }

    @Override // g1.f1
    @NonNull
    public ByteBuffer g() {
        f();
        return this.f66948c;
    }
}
