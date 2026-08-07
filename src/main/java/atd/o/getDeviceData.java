package atd.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.media.AudioTrack;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/Address;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/bluetooth/BluetoothAdapter;", "", PlaceTypes.ADDRESS, "(Landroid/bluetooth/BluetoothAdapter;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends atd.o.getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 0;
    private static char[] getDeviceData = null;
    private static int getMessageVersion = 1;
    private static int getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/Address$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        AudioTrack.getMinVolume();
        new getSDKReferenceNumber((byte) 0);
        int i11 = getMessageVersion + 57;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 84 / 0;
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"HardwareIds"})
    private static String cg_(BluetoothAdapter bluetoothAdapter) {
        AuthenticationRequestParameters = (getMessageVersion + 49) % 128;
        String address = bluetoothAdapter.getAddress();
        int i11 = getMessageVersion + 105;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return address;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        getDeviceData = new char[]{64914, 64933, 64928, 64922};
        getSDKAppID = -185467435;
        getSDKTransactionID = true;
        getSDKReferenceNumber = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        String strCg_;
        if (!getSDKReferenceNumber() && !getMessageVersion()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        BluetoothAdapter bluetoothAdapterCh_ = ch_();
        if (bluetoothAdapterCh_ != null && (strCg_ = cg_(bluetoothAdapterCh_)) != null) {
            getMessageVersion = (AuthenticationRequestParameters + 95) % 128;
            if (!BuildConfig.getSDKAppID(strCg_)) {
                strCg_ = null;
            }
            if (strCg_ != null) {
                getMessageVersion = (AuthenticationRequestParameters + 9) % 128;
                return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCg_));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getDeviceData(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
