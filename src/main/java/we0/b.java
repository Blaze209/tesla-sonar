package we0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lwe0/a;", "a", "()Lwe0/a;", "tesla-ble_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"we0/b$a", "Lwe0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isSupported", "(Landroid/content/Context;)Z", "", "macAddress", "vin", "Lwe0/c$a;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lwe0/c$a;", "Lwe0/c;", "b", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lwe0/c;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements we0.a {
        a() {
        }

        @Override // we0.a
        public c b(String macAddress, String vin, Context context) {
            s.k(macAddress, "macAddress");
            s.k(vin, "vin");
            s.k(context, "context");
            return c.a.f121716a;
        }

        @Override // we0.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c.a c(String macAddress, String vin, Context context) {
            s.k(macAddress, "macAddress");
            s.k(vin, "vin");
            s.k(context, "context");
            return c.a.f121716a;
        }

        @Override // we0.a
        public boolean isSupported(Context context) {
            s.k(context, "context");
            return false;
        }
    }

    public static final we0.a a() {
        return new a();
    }
}
