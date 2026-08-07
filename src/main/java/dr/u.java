package dr;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.spongycastle.math.ec.Tnaf;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f60914d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f60915e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, Tnaf.POW_2_WIDTH, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f60916a = AudioProcessor.f39415a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60918c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60917b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i11;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = (i12 + 255) / 255;
        int length = i13 + 27 + i12;
        if (this.f60917b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f60914d.length;
            length += f60915e.length + length2;
            i11 = length2;
        } else {
            i11 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f60917b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f60914d);
            }
            byteBufferC.put(f60915e);
        }
        int i14 = this.f60918c + v.i(byteBuffer);
        this.f60918c = i14;
        f(byteBufferC, i14, this.f60917b, i13, false);
        for (int i15 = 0; i15 < i13; i15++) {
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
        if (this.f60917b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i11;
            byte[] bArr2 = f60915e;
            byteBufferC.putInt(i11 + bArr2.length + 22, p0.s(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, p0.s(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f60917b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i11) {
        if (this.f60916a.capacity() < i11) {
            this.f60916a = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f60916a.clear();
        }
        return this.f60916a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(ru.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, p0.s(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
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
        ts.a.e(decoderInputBuffer.f39720c);
        if (decoderInputBuffer.f39720c.limit() - decoderInputBuffer.f39720c.position() == 0) {
            return;
        }
        this.f60916a = b(decoderInputBuffer.f39720c, (this.f60917b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.f();
        decoderInputBuffer.q(this.f60916a.remaining());
        decoderInputBuffer.f39720c.put(this.f60916a);
        decoderInputBuffer.r();
    }

    public void d() {
        this.f60916a = AudioProcessor.f39415a;
        this.f60918c = 0;
        this.f60917b = 2;
    }
}
