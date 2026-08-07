package gr0;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
@g(tags = {19})
public class j extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f69457d;

    public j() {
        this.f69420a = 19;
    }

    @Override // gr0.b
    int a() {
        throw new RuntimeException("Not Implemented");
    }

    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        if (b() > 0) {
            byte[] bArr = new byte[b()];
            this.f69457d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // gr0.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f69457d;
        sb2.append(bArr == null ? Address.ADDRESS_NULL_PLACEHOLDER : mr0.c.a(bArr));
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}
