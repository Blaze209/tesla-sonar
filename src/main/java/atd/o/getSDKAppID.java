package atd.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesMac;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/bluetooth/BluetoothAdapter;", "", "Landroid/bluetooth/BluetoothDevice;", "kotlin.jvm.PlatformType", "", "bondedDevices", "(Landroid/bluetooth/BluetoothAdapter;)Ljava/util/Set;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 0;
    private static char getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static char[] getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesMac$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        Process.myPid();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKAppID + 119;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getSDKAppID(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static Set<BluetoothDevice> cl_(BluetoothAdapter bluetoothAdapter) {
        int i11 = getSDKAppID + 15;
        AuthenticationRequestParameters = i11 % 128;
        int i12 = i11 % 2;
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        if (i12 != 0) {
            int i13 = 56 / 0;
        }
        AuthenticationRequestParameters = (getSDKAppID + 87) % 128;
        return bondedDevices;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{63813, 52383, 52458, 52462};
        getDeviceData = (char) 63814;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        Set<BluetoothDevice> setCl_;
        if (!getSDKReferenceNumber()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter bluetoothAdapterCh_ = ch_();
        if (bluetoothAdapterCh_ != null && (setCl_ = cl_(bluetoothAdapterCh_)) != null) {
            int i11 = AuthenticationRequestParameters + 43;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                setCl_.iterator();
                throw null;
            }
            for (BluetoothDevice bluetoothDevice : setCl_) {
                if (bluetoothDevice != null) {
                    int i12 = AuthenticationRequestParameters + 81;
                    getSDKAppID = i12 % 128;
                    if (i12 % 2 == 0) {
                        bluetoothDevice.getAddress();
                        throw null;
                    }
                    String address = bluetoothDevice.getAddress();
                    if (address != null && BuildConfig.getSDKAppID(address)) {
                        getSDKAppID = (AuthenticationRequestParameters + 99) % 128;
                        arrayList.add(address);
                        getSDKAppID = (AuthenticationRequestParameters + 41) % 128;
                    }
                }
            }
        }
        return DeviceParameterResult.Success.StringsListValue.m56boximpl(DeviceParameterResult.Success.StringsListValue.m57constructorimpl(arrayList));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getSDKAppID(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
