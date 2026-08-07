package b8;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.spongycastle.math.ec.Tnaf;
import s7.q0;
import w8.h0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f16834d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f16835e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, Tnaf.POW_2_WIDTH, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f16836a = AudioProcessor.f9024a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16838c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16837b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i11;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = (i12 + 255) / 255;
        int length = i13 + 27 + i12;
        if (this.f16837b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f16834d.length;
            length += f16835e.length + length2;
            i11 = length2;
        } else {
            i11 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f16837b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f16834d);
            }
            byteBufferC.put(f16835e);
        }
        int iJ = this.f16838c + h0.j(byteBuffer);
        this.f16838c = iJ;
        f(byteBufferC, iJ, this.f16837b, i13, false);
        for (int i14 = 0; i14 < i13; i14++) {
            if (i12 >= 255) {
                byteBufferC.put((byte) -1);
                i12 -= 255;
            } else {
                byteBufferC.put((byte) i12);
                i12 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f16837b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i11;
            byte[] bArr2 = f16835e;
            byteBufferC.putInt(i11 + bArr2.length + 22, q0.z(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, q0.z(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f16837b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i11) {
        if (this.f16836a.capacity() < i11) {
            this.f16836a = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f16836a.clear();
        }
        return this.f16836a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(ru.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, q0.z(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j11, int i11, int i12, boolean z11) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z11 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j11);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i11);
        byteBuffer.putInt(0);
        byteBuffer.put(ru.i.a(i12));
    }

    public void a(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        s7.a.f(decoderInputBuffer.f9286d);
        if (decoderInputBuffer.f9286d.limit() - decoderInputBuffer.f9286d.position() == 0) {
            return;
        }
        this.f16836a = b(decoderInputBuffer.f9286d, (this.f16837b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.f();
        decoderInputBuffer.p(this.f16836a.remaining());
        decoderInputBuffer.f9286d.put(this.f16836a);
        decoderInputBuffer.q();
    }

    public void d() {
        this.f16836a = AudioProcessor.f9024a;
        this.f16838c = 0;
        this.f16837b = 2;
    }
}
