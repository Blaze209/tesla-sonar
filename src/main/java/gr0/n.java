package gr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
@g(tags = {6})
public class n extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f69461d;

    public n() {
        this.f69420a = 6;
    }

    @Override // gr0.b
    int a() {
        return 1;
    }

    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        this.f69461d = mr0.d.l(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f69461d == ((n) obj).f69461d;
    }

    public ByteBuffer g() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b());
        mr0.e.i(byteBufferAllocate, 6);
        f(byteBufferAllocate, a());
        mr0.e.i(byteBufferAllocate, this.f69461d);
        return byteBufferAllocate;
    }

    public void h(int i11) {
        this.f69461d = i11;
    }

    public int hashCode() {
        return this.f69461d;
    }

    @Override // gr0.b
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f69461d + CoreConstants.CURLY_RIGHT;
    }
}
