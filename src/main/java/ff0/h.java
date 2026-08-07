package ff0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vc0.i2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lff0/h;", "", "<init>", "()V", "Lvc0/i2;", "phoneLogForHandlePulledWithoutAuthentication", "", "b", "(Lvc0/i2;)[B", "byteArray", "a", "([B)Lvc0/i2;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f65844a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("PhoneKeyLogConverter");

    private h() {
    }

    public static final i2 a(byte[] byteArray) {
        s.k(byteArray, "byteArray");
        try {
            return i2.f118750p.decode(byteArray);
        } catch (Exception unused) {
            logger.j("decode error in PhoneLogForHandlePulledWithoutAuthentication");
            return null;
        }
    }

    public static final byte[] b(i2 phoneLogForHandlePulledWithoutAuthentication) {
        s.k(phoneLogForHandlePulledWithoutAuthentication, "phoneLogForHandlePulledWithoutAuthentication");
        try {
            return i2.f118750p.encode(phoneLogForHandlePulledWithoutAuthentication);
        } catch (Exception unused) {
            logger.j("encode error in PhoneLogForHandlePulledWithoutAuthentication");
            return null;
        }
    }
}
