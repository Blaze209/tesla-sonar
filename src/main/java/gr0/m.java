package gr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
@g(tags = {20})
public class m extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f69460d;

    public m() {
        this.f69420a = 20;
    }

    @Override // gr0.b
    public int a() {
        return 1;
    }

    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        this.f69460d = mr0.d.l(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f69460d == ((m) obj).f69460d;
    }

    public ByteBuffer g() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b());
        mr0.e.i(byteBufferAllocate, 20);
        f(byteBufferAllocate, a());
        mr0.e.i(byteBufferAllocate, this.f69460d);
        return byteBufferAllocate;
    }

    public int hashCode() {
        return this.f69460d;
    }

    @Override // gr0.b
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f69460d) + CoreConstants.CURLY_RIGHT;
    }
}
