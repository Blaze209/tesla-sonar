package je0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/bluetooth/BluetoothDevice;", "", "a", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "b", "()Lcom/tesla/logging/g;", "logger", "utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.tesla.logging.g f83653a = com.tesla.logging.g.INSTANCE.a("EnergyBle");

    public static final String a(BluetoothDevice bluetoothDevice) {
        s.k(bluetoothDevice, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            String name = bluetoothDevice.getName();
            return name == null ? "" : name;
        }
        String alias = bluetoothDevice.getAlias();
        if (alias != null) {
            return alias;
        }
        String name2 = bluetoothDevice.getName();
        return name2 == null ? "" : name2;
    }

    public static final com.tesla.logging.g b() {
        return f83653a;
    }
}
