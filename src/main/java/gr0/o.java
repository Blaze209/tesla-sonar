package gr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public class o extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Logger f69462e = LoggerFactory.getLogger((Class<?>) o.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f69463d;

    @Override // gr0.b
    int a() {
        throw new RuntimeException("sdjlhfl");
    }

    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        this.f69463d = byteBuffer.slice();
    }

    @Override // gr0.b
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f69420a + ", sizeOfInstance=" + this.f69421b + ", data=" + this.f69463d + CoreConstants.CURLY_RIGHT;
    }
}
