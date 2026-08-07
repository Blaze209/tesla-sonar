package xo0;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f123845a;

    static {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            p013kotlin.jvm.internal.s.j(property, "getProperty(...)");
            objB = jn0.s.b(p013kotlin.text.t.x(property));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f123845a = num != null ? num.intValue() : PKIFailureInfo.badSenderNonce;
    }
}
