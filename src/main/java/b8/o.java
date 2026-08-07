package b8;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.util.Arrays;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f16823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f16824j;

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void b(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) s7.a.f(this.f16824j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f9037b.f9030d) * this.f9038c.f9030d);
        while (iPosition < iLimit) {
            for (int i11 : iArr) {
                int iV = (q0.V(this.f9037b.f9029c) * i11) + iPosition;
                int i12 = this.f9037b.f9029c;
                if (i12 == 2) {
                    byteBufferK.putShort(byteBuffer.getShort(iV));
                } else if (i12 == 3) {
                    byteBufferK.put(byteBuffer.get(iV));
                } else if (i12 == 4) {
                    byteBufferK.putFloat(byteBuffer.getFloat(iV));
                } else if (i12 == 21) {
                    q0.o1(byteBufferK, q0.l0(byteBuffer, iV));
                } else {
                    if (i12 != 22) {
                        if (i12 == 268435456) {
                            byteBufferK.putShort(byteBuffer.getShort(iV));
                        } else if (i12 == 1342177280) {
                            q0.o1(byteBufferK, q0.l0(byteBuffer, iV));
                        } else if (i12 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f9037b.f9029c);
                        }
                    }
                    byteBufferK.putInt(byteBuffer.getInt(iV));
                }
            }
            iPosition += this.f9037b.f9030d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // androidx.media3.common.audio.b
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f16823i;
        if (iArr == null) {
            return AudioProcessor.a.f9026e;
        }
        if (!q0.R0(aVar.f9029c)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z11 = aVar.f9028b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f9028b) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z11 |= i12 != i11;
            i11++;
        }
        return z11 ? new AudioProcessor.a(aVar.f9027a, iArr.length, aVar.f9029c) : AudioProcessor.a.f9026e;
    }

    @Override // androidx.media3.common.audio.b
    protected void h() {
        this.f16824j = this.f16823i;
    }

    @Override // androidx.media3.common.audio.b
    protected void j() {
        this.f16824j = null;
        this.f16823i = null;
    }

    public void l(int[] iArr) {
        this.f16823i = iArr;
    }
}
