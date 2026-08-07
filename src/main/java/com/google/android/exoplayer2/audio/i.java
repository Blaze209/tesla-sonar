package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class i extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f39592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f39593j;

    i() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ts.a.e(this.f39593j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f39585b.f39420d) * this.f39586c.f39420d);
        while (iPosition < iLimit) {
            for (int i11 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i11 * 2) + iPosition));
            }
            iPosition += this.f39585b.f39420d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f39592i;
        if (iArr == null) {
            return AudioProcessor.a.f39416e;
        }
        if (aVar.f39419c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z11 = aVar.f39418b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f39418b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z11 |= i12 != i11;
            i11++;
        }
        return z11 ? new AudioProcessor.a(aVar.f39417a, iArr.length, 2) : AudioProcessor.a.f39416e;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void h() {
        this.f39593j = this.f39592i;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void j() {
        this.f39593j = null;
        this.f39592i = null;
    }

    public void l(int[] iArr) {
        this.f39592i = iArr;
    }
}
