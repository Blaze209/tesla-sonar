package gr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
@g(tags = {0})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f69420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f69422c;

    abstract int a();

    public int b() {
        return a() + c() + 1;
    }

    public int c() {
        int iA = a();
        int i11 = 0;
        while (true) {
            if (iA <= 0 && i11 >= this.f69422c) {
                return i11;
            }
            iA >>>= 7;
            i11++;
        }
    }

    public final void d(int i11, ByteBuffer byteBuffer) {
        this.f69420a = i11;
        int iL = mr0.d.l(byteBuffer);
        this.f69421b = iL & 127;
        int i12 = 1;
        while ((iL >>> 7) == 1) {
            iL = mr0.d.l(byteBuffer);
            i12++;
            this.f69421b = (this.f69421b << 7) | (iL & 127);
        }
        this.f69422c = i12;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f69421b);
        e(byteBufferSlice);
        byteBuffer.position(byteBuffer.position() + this.f69421b);
    }

    public abstract void e(ByteBuffer byteBuffer);

    public void f(ByteBuffer byteBuffer, int i11) {
        int iPosition = byteBuffer.position();
        int i12 = 0;
        while (true) {
            if (i11 <= 0 && i12 >= this.f69422c) {
                byteBuffer.position(iPosition + c());
                return;
            }
            i12++;
            if (i11 > 0) {
                byteBuffer.put((c() + iPosition) - i12, (byte) (i11 & 127));
            } else {
                byteBuffer.put((c() + iPosition) - i12, (byte) -128);
            }
            i11 >>>= 7;
        }
    }

    public String toString() {
        return "BaseDescriptor{tag=" + this.f69420a + ", sizeOfInstance=" + this.f69421b + CoreConstants.CURLY_RIGHT;
    }
}
