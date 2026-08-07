package atd.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesAlias;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/bluetooth/BluetoothAdapter;", "", "Landroid/bluetooth/BluetoothDevice;", "kotlin.jvm.PlatformType", "", "bondedDevices", "(Landroid/bluetooth/BluetoothAdapter;)Ljava/util/Set;", "", "alias", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends getSDKReferenceNumber {
    private static char[] AuthenticationRequestParameters = null;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static char getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesAlias$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getWindowTouchSlop();
        new getSDKAppID((byte) 0);
        getDeviceData = (getSDKAppID + 81) % 128;
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static Set<BluetoothDevice> cj_(BluetoothAdapter bluetoothAdapter) {
        getSDKAppID = (getDeviceData + 31) % 128;
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        getSDKAppID = (getDeviceData + 103) % 128;
        return bondedDevices;
    }

    @SuppressLint({"MissingPermission"})
    private static String ck_(BluetoothDevice bluetoothDevice) {
        int i11 = getSDKAppID + 71;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        String alias = bluetoothDevice.getAlias();
        if (i12 != 0) {
            int i13 = 76 / 0;
        }
        return alias;
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{52455, 52458, 52383, 52463};
        getSDKReferenceNumber = (char) 63814;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        Set<BluetoothDevice> setCj_;
        if (Build.VERSION.SDK_INT < 30) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (!getSDKReferenceNumber()) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            getDeviceData = (getSDKAppID + 39) % 128;
            return failure;
        }
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter bluetoothAdapterCh_ = ch_();
        if (bluetoothAdapterCh_ == null || (setCj_ = cj_(bluetoothAdapterCh_)) == null) {
            getDeviceData = (getSDKAppID + 105) % 128;
        } else {
            getSDKAppID = (getDeviceData + 105) % 128;
            for (BluetoothDevice bluetoothDevice : setCj_) {
                if (bluetoothDevice != null) {
                    int i11 = getSDKAppID + 69;
                    getDeviceData = i11 % 128;
                    if (i11 % 2 != 0) {
                        ck_(bluetoothDevice);
                        throw null;
                    }
                    String strCk_ = ck_(bluetoothDevice);
                    if (strCk_ != null) {
                        arrayList.add(strCk_);
                    }
                }
            }
        }
        return DeviceParameterResult.Success.StringsListValue.m56boximpl(DeviceParameterResult.Success.StringsListValue.m57constructorimpl(arrayList));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getSDKTransactionID(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
