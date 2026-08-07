package dr;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class v {
    public static List<byte[]> a(byte[] bArr) {
        long j11 = j(f(bArr));
        long j12 = j(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(j11));
        arrayList.add(b(j12));
        return arrayList;
    }

    private static byte[] b(long j11) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j11).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long d(byte b11, byte b12) {
        int i11;
        int i12;
        int i13 = b11 & 255;
        int i14 = b11 & 3;
        if (i14 != 0) {
            i11 = 2;
            if (i14 != 1 && i14 != 2) {
                i11 = b12 & 63;
            }
        } else {
            i11 = 1;
        }
        int i15 = i13 >> 3;
        int i16 = i15 & 3;
        if (i15 >= 16) {
            i12 = 2500 << i16;
        } else if (i15 >= 12) {
            i12 = 10000 << (i15 & 1);
        } else {
            i12 = i16 == 3 ? 60000 : 10000 << i16;
        }
        return ((long) i11) * ((long) i12);
    }

    public static long e(byte[] bArr) {
        return d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    private static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int g(ByteBuffer byteBuffer) {
        int iH = h(byteBuffer);
        int i11 = byteBuffer.get(iH + 26) + 27 + iH;
        return (int) ((d(byteBuffer.get(i11), byteBuffer.limit() - i11 > 1 ? byteBuffer.get(i11 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int h(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b11 = byteBuffer.get(26);
        int i11 = 28;
        int i12 = 28;
        for (int i13 = 0; i13 < b11; i13++) {
            i12 += byteBuffer.get(i13 + 27);
        }
        byte b12 = byteBuffer.get(i12 + 26);
        for (int i14 = 0; i14 < b12; i14++) {
            i11 += byteBuffer.get(i12 + 27 + i14);
        }
        return i12 + i11;
    }

    public static int i(ByteBuffer byteBuffer) {
        return (int) ((d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    private static long j(long j11) {
        return (j11 * 1000000000) / 48000;
    }
}
