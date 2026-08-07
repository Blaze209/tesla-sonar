package com.google.android.exoplayer2.audio;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.nio.ByteBuffer;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p extends h {
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.f39585b.f39419c;
        if (i12 == 3) {
            i11 *= 2;
        } else if (i12 == 4) {
            i11 /= 2;
        } else if (i12 != 268435456) {
            if (i12 != 536870912) {
                if (i12 != 805306368) {
                    throw new IllegalStateException();
                }
                i11 /= 2;
            } else {
                i11 /= 3;
                i11 *= 2;
            }
        }
        ByteBuffer byteBufferK = k(i11);
        int i13 = this.f39585b.f39419c;
        if (i13 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) + RangingPosition.RSSI_UNKNOWN));
                iPosition++;
            }
        } else if (i13 == 4) {
            while (iPosition < iLimit) {
                short sP = (short) (p0.p(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sP & 255));
                byteBufferK.put((byte) ((sP >> 8) & 255));
                iPosition += 4;
            }
        } else if (i13 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i13 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i13 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i11 = aVar.f39419c;
        if (i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 536870912 || i11 == 805306368 || i11 == 4) {
            return i11 != 2 ? new AudioProcessor.a(aVar.f39417a, aVar.f39418b, 2) : AudioProcessor.a.f39416e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
