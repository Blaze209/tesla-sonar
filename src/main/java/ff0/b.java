package ff0;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.d2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lff0/b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "toInt", "()I", "I", "getValue", "Companion", "a", "APP_NOT_ALIVE", "NOT_CONNECTED", "CONNECTED_BLE_ALGO_FAILURE", "CONNECTED_OTHER_FAILURE", "OTHERS", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum b {
    APP_NOT_ALIVE(1),
    NOT_CONNECTED(2),
    CONNECTED_BLE_ALGO_FAILURE(3),
    CONNECTED_OTHER_FAILURE(4),
    OTHERS(-1);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ff0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lff0/b$a;", "", "<init>", "()V", "", "timeSinceAppLaunchInSeconds", "timeSinceConnectInSeconds", "Lvc0/d2;", "peripheralState", "", "anyHighThreshSignalPresent", "Lff0/b;", "a", "(IILvc0/d2;Z)Lff0/b;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int timeSinceAppLaunchInSeconds, int timeSinceConnectInSeconds, d2 peripheralState, boolean anyHighThreshSignalPresent) {
            s.k(peripheralState, "peripheralState");
            if (timeSinceAppLaunchInSeconds <= 0) {
                return b.APP_NOT_ALIVE;
            }
            if (timeSinceConnectInSeconds < 0) {
                return b.NOT_CONNECTED;
            }
            if (peripheralState == d2.PERIPHERALSTATE_CONNECTED) {
                return anyHighThreshSignalPresent ? b.CONNECTED_OTHER_FAILURE : b.CONNECTED_BLE_ALGO_FAILURE;
            }
            return b.OTHERS;
        }

        private Companion() {
        }
    }

    b(int i11) {
        this.value = i11;
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final int toInt() {
        return this.value;
    }
}
