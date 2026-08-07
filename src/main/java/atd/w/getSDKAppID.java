package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.telephony.TelephonyManager;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/ImeiSv;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "deviceSoftwareVersion", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends InitializeResultSuccess {
    private static int[] AuthenticationRequestParameters = null;
    private static int getDeviceData = 0;
    private static int getSDKTransactionID = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/ImeiSv$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        ViewConfiguration.getDoubleTapTimeout();
        new getDeviceData((byte) 0);
        getSDKTransactionID = (getDeviceData + 5) % 128;
    }

    public /* synthetic */ getSDKAppID(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static String cw_(TelephonyManager telephonyManager) {
        getDeviceData = (getSDKTransactionID + 125) % 128;
        String deviceSoftwareVersion = telephonyManager.getDeviceSoftwareVersion();
        int i11 = getDeviceData + 71;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return deviceSoftwareVersion;
        }
        throw null;
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = new int[]{-122539841, -1919406056, 1839027071, 724347391, 1816869629, -864259570, -1780680237, 735527573, 1314408504, -418463192, 2143020148, 1448580366, -1676777057, 1336851817, 2013187808, -2007625309, 781764885, -1273659763};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        String strCw_;
        if (!BuildConfig()) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            int i11 = getSDKTransactionID + 47;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 68 / 0;
            }
            return failure;
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null || (strCw_ = cw_(telephonyManagerCF_)) == null) {
            DeviceParameterResult.Failure failure2 = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getDeviceData = (getSDKTransactionID + 17) % 128;
            return failure2;
        }
        int i13 = getSDKTransactionID + 59;
        getDeviceData = i13 % 128;
        int i14 = i13 % 2;
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(strCw_);
        if (i14 == 0) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
        }
        DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getSDKAppID(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
