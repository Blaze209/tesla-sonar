package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f extends DecoderInputBuffer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40236k;

    public f() {
        super(2);
        this.f40236k = 32;
    }

    private boolean w(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!A()) {
            return true;
        }
        if (this.f40235j >= this.f40236k || decoderInputBuffer.j() != j()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f39720c;
        return byteBuffer2 == null || (byteBuffer = this.f39720c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean A() {
        return this.f40235j > 0;
    }

    public void B(int i11) {
        ts.a.a(i11 > 0);
        this.f40236k = i11;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, fr.a
    public void f() {
        super.f();
        this.f40235j = 0;
    }

    public boolean v(DecoderInputBuffer decoderInputBuffer) {
        ts.a.a(!decoderInputBuffer.s());
        ts.a.a(!decoderInputBuffer.i());
        ts.a.a(!decoderInputBuffer.k());
        if (!w(decoderInputBuffer)) {
            return false;
        }
        int i11 = this.f40235j;
        this.f40235j = i11 + 1;
        if (i11 == 0) {
            this.f39722e = decoderInputBuffer.f39722e;
            if (decoderInputBuffer.m()) {
                o(1);
            }
        }
        if (decoderInputBuffer.j()) {
            o(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f39720c;
        if (byteBuffer != null) {
            q(byteBuffer.remaining());
            this.f39720c.put(byteBuffer);
        }
        this.f40234i = decoderInputBuffer.f39722e;
        return true;
    }

    public long x() {
        return this.f39722e;
    }

    public long y() {
        return this.f40234i;
    }

    public int z() {
        return this.f40235j;
    }
}
