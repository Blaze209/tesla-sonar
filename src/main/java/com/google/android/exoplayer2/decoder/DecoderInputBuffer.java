package com.google.android.exoplayer2.decoder;

import br.p;
import fr.a;
import fr.c;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f39719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f39720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f39723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f39724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f39725h;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39727b;

        public InsufficientCapacityException(int i11, int i12) {
            super("Buffer too small (" + i11 + " < " + i12 + ")");
            this.f39726a = i11;
            this.f39727b = i12;
        }
    }

    static {
        p.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i11) {
        this(i11, 0);
    }

    private ByteBuffer p(int i11) {
        int i12 = this.f39724g;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f39720c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i11);
    }

    public static DecoderInputBuffer t() {
        return new DecoderInputBuffer(0);
    }

    @Override // fr.a
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.f39720c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f39723f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f39721d = false;
    }

    @EnsuresNonNull({"data"})
    public void q(int i11) {
        int i12 = i11 + this.f39725h;
        ByteBuffer byteBuffer = this.f39720c;
        if (byteBuffer == null) {
            this.f39720c = p(i12);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (iCapacity >= i13) {
            this.f39720c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferP = p(i13);
        byteBufferP.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferP.put(byteBuffer);
        }
        this.f39720c = byteBufferP;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.f39720c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f39723f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean s() {
        return h(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void u(int i11) {
        ByteBuffer byteBuffer = this.f39723f;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            this.f39723f = ByteBuffer.allocate(i11);
        } else {
            this.f39723f.clear();
        }
    }

    public DecoderInputBuffer(int i11, int i12) {
        this.f39719b = new c();
        this.f39724g = i11;
        this.f39725h = i12;
    }
}
