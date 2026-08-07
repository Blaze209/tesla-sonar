package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class f extends DecoderInputBuffer {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10542l;

    public f() {
        super(2);
        this.f10542l = 32;
    }

    private boolean v(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!z()) {
            return true;
        }
        if (this.f10541k >= this.f10542l) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f9286d;
        return byteBuffer2 == null || (byteBuffer = this.f9286d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public void A(int i11) {
        s7.a.a(i11 > 0);
        this.f10542l = i11;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, y7.a
    public void f() {
        super.f();
        this.f10541k = 0;
    }

    public boolean u(DecoderInputBuffer decoderInputBuffer) {
        s7.a.a(!decoderInputBuffer.r());
        s7.a.a(!decoderInputBuffer.h());
        s7.a.a(!decoderInputBuffer.i());
        if (!v(decoderInputBuffer)) {
            return false;
        }
        int i11 = this.f10541k;
        this.f10541k = i11 + 1;
        if (i11 == 0) {
            this.f9288f = decoderInputBuffer.f9288f;
            if (decoderInputBuffer.k()) {
                n(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f9286d;
        if (byteBuffer != null) {
            p(byteBuffer.remaining());
            this.f9286d.put(byteBuffer);
        }
        this.f10540j = decoderInputBuffer.f9288f;
        return true;
    }

    public long w() {
        return this.f9288f;
    }

    public long x() {
        return this.f10540j;
    }

    public int y() {
        return this.f10541k;
    }

    public boolean z() {
        return this.f10541k > 0;
    }
}
