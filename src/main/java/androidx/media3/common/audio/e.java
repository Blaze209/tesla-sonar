package androidx.media3.common.audio;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.nio.ByteBuffer;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.f9037b.f9029c;
        if (i12 == 3) {
            i11 *= 2;
        } else if (i12 == 4) {
            i11 /= 2;
        } else {
            if (i12 != 21) {
                if (i12 == 22) {
                    i11 /= 2;
                } else if (i12 != 268435456) {
                    if (i12 != 1342177280) {
                        if (i12 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i11 /= 2;
                    }
                }
            }
            i11 /= 3;
            i11 *= 2;
        }
        ByteBuffer byteBufferK = k(i11);
        int i13 = this.f9037b.f9029c;
        if (i13 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) + RangingPosition.RSSI_UNKNOWN));
                iPosition++;
            }
        } else if (i13 == 4) {
            while (iPosition < iLimit) {
                short sQ = (short) (q0.q(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sQ & 255));
                byteBufferK.put((byte) ((sQ >> 8) & 255));
                iPosition += 4;
            }
        } else if (i13 == 21) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i13 == 22) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i13 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i13 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i13 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i11 = aVar.f9029c;
        if (i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4) {
            return i11 != 2 ? new AudioProcessor.a(aVar.f9027a, aVar.f9028b, 2) : AudioProcessor.a.f9026e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
