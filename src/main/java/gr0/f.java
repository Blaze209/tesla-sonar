package gr0;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
@g(tags = {5})
public class f extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f69440d;

    public f() {
        this.f69420a = 5;
    }

    @Override // gr0.b
    int a() {
        return this.f69440d.length;
    }

    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.f69440d = bArr;
        byteBuffer.get(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f69440d, ((f) obj).f69440d);
    }

    public ByteBuffer g() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b());
        mr0.e.i(byteBufferAllocate, this.f69420a);
        f(byteBufferAllocate, a());
        byteBufferAllocate.put(this.f69440d);
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    public int hashCode() {
        byte[] bArr = this.f69440d;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // gr0.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderSpecificInfo");
        sb2.append("{bytes=");
        byte[] bArr = this.f69440d;
        sb2.append(bArr == null ? Address.ADDRESS_NULL_PLACEHOLDER : mr0.c.a(bArr));
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}
