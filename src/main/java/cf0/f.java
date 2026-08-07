package cf0;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcf0/f;", "", "<init>", "(Ljava/lang/String;I)V", "", "description", "()Ljava/lang/String;", "CONNECTED", "DISCONNECTED", "SERVICES_DISCOVER", "MTU_CHANGED", "DESCRIPTOR_WRITE", "CONNECTION_COMPLETE", "CHARACTERISTIC_READ", "CHARACTERISTIC_CHANGE", "CHARACTERISTIC_WRITE", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum f {
    CONNECTED,
    DISCONNECTED,
    SERVICES_DISCOVER,
    MTU_CHANGED,
    DESCRIPTOR_WRITE,
    CONNECTION_COMPLETE,
    CHARACTERISTIC_READ,
    CHARACTERISTIC_CHANGE,
    CHARACTERISTIC_WRITE;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19215a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.SERVICES_DISCOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.MTU_CHANGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.DESCRIPTOR_WRITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.CONNECTION_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.CHARACTERISTIC_READ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f.CHARACTERISTIC_CHANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f.CHARACTERISTIC_WRITE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f19215a = iArr;
        }
    }

    public static EnumEntries<f> getEntries() {
        return $ENTRIES;
    }

    public final String description() {
        switch (a.f19215a[ordinal()]) {
            case 1:
                return "connected";
            case 2:
                return "disconnected";
            case 3:
                return "onServicesDiscovered";
            case 4:
                return "onMTUChanged";
            case 5:
                return "onDescriptorWrite";
            case 6:
                return "connectionComplete";
            case 7:
                return "onCharacteristicRead";
            case 8:
                return "onCharacteristicChanged";
            case 9:
                return "onCharacteristicWrite";
            default:
                return "unknown";
        }
    }
}
