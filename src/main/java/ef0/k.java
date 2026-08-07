package ef0;

import android.bluetooth.BluetoothAdapter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0003R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lef0/k;", "", "<init>", "()V", "Landroid/bluetooth/BluetoothAdapter;", "mBluetoothAdapter", "", "a", "(Landroid/bluetooth/BluetoothAdapter;)Z", "Ljn0/h0;", "b", "(Landroid/bluetooth/BluetoothAdapter;)V", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "getLogger", "()Lcom/tesla/logging/g;", "logger", "Lef0/a;", "Lef0/a;", "getBluetoothState", "()Lef0/a;", "setBluetoothState", "(Lef0/a;)V", "bluetoothState", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f62906a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("BluetoothStateHelper");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static transient a bluetoothState = a.UNKNOWN;

    private k() {
    }

    public final boolean a(BluetoothAdapter mBluetoothAdapter) {
        b(mBluetoothAdapter);
        return bluetoothState == a.ENABLED;
    }

    public final void b(BluetoothAdapter mBluetoothAdapter) {
        if (bluetoothState == a.UNKNOWN) {
            if (mBluetoothAdapter != null) {
                bluetoothState = mBluetoothAdapter.isEnabled() ? a.ENABLED : a.DISABLED;
            }
            logger.j("initializing bluetooth state: " + bluetoothState.name());
        }
    }

    public final void c() {
        a aVar = bluetoothState;
        a aVar2 = a.DISABLED;
        if (aVar != aVar2) {
            bluetoothState = aVar2;
        }
    }

    public final void d() {
        a aVar = bluetoothState;
        a aVar2 = a.ENABLED;
        if (aVar != aVar2) {
            bluetoothState = aVar2;
        }
    }
}
