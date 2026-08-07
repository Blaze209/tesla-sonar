package androidx.media3.decoder;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p7.d0;
import p7.u;
import y7.a;
import y7.c;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f9284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f9285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f9286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f9289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f9291i;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9293b;

        public InsufficientCapacityException(int i11, int i12) {
            super("Buffer too small (" + i11 + " < " + i12 + ")");
            this.f9292a = i11;
            this.f9293b = i12;
        }
    }

    static {
        d0.a("media3.decoder");
    }

    public DecoderInputBuffer(int i11) {
        this(i11, 0);
    }

    private ByteBuffer o(int i11) {
        int i12 = this.f9290h;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f9286d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i11);
    }

    public static DecoderInputBuffer s() {
        return new DecoderInputBuffer(0);
    }

    @Override // y7.a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f9286d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f9289g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f9287e = false;
    }

    @EnsuresNonNull({"data"})
    public void p(int i11) {
        int i12 = i11 + this.f9291i;
        ByteBuffer byteBuffer = this.f9286d;
        if (byteBuffer == null) {
            this.f9286d = o(i12);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (iCapacity >= i13) {
            this.f9286d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferO = o(i13);
        byteBufferO.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferO.put(byteBuffer);
        }
        this.f9286d = byteBufferO;
    }

    public final void q() {
        ByteBuffer byteBuffer = this.f9286d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f9289g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean r() {
        return g(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void t(int i11) {
        ByteBuffer byteBuffer = this.f9289g;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            this.f9289g = ByteBuffer.allocate(i11);
        } else {
            this.f9289g.clear();
        }
    }

    public DecoderInputBuffer(int i11, int i12) {
        this.f9285c = new c();
        this.f9290h = i11;
        this.f9291i = i12;
    }
}
