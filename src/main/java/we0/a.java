package we0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.tesla.logging.TeslaLog;
import com.teslamotors.plugins.ble.beacon.BeaconInjector;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lwe0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isSupported", "(Landroid/content/Context;)Z", "", "macAddress", "vin", "Lwe0/c;", "c", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lwe0/c;", "b", "a", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f121714a;

    /* JADX INFO: renamed from: we0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lwe0/a$a;", "", "<init>", "()V", "Lwe0/a;", "a", "()Lwe0/a;", "b", "Lwe0/a;", "instance", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f121714a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final a instance;

        static {
            a aVarA = null;
            try {
                BeaconInjector beaconInjector = BeaconInjector.INSTANCE;
                Object objInvoke = BeaconInjector.class.getDeclaredMethod("inject", null).invoke(BeaconInjector.class.getDeclaredField("INSTANCE").get(null), null);
                if (!(objInvoke instanceof a)) {
                    objInvoke = null;
                }
                aVarA = (a) objInvoke;
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("ReflectionHelper", "can not invoke static method# inject on class# com.teslamotors.plugins.ble.beacon.BeaconInjector", e11);
            }
            if (aVarA == null) {
                aVarA = b.a();
            }
            instance = aVarA;
        }

        private Companion() {
        }

        public final a a() {
            return instance;
        }
    }

    static a a() {
        return INSTANCE.a();
    }

    c b(String macAddress, String vin, Context context);

    c c(String macAddress, String vin, Context context);

    boolean isSupported(Context context);
}
