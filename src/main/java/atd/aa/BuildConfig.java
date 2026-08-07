package atd.aa;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiManager;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsEnhancedPowerReportingSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends ChallengeResultKt {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsEnhancedPowerReportingSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getScrollFriction();
        Drawable.resolveOpacity(0, 0);
        TypedValue.complexToFloat(0);
        AndroidCharacter.getMirror('0');
        new getDeviceData((byte) 0);
        getSDKEphemeralPublicKey = (getSDKReferenceNumber + 73) % 128;
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = -2019982232;
        getSDKAppID = -1568970036;
        getDeviceData = -1770747500;
        getSDKTransactionID = new byte[]{44, -38, -36, -16};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        int i11 = getSDKReferenceNumber + 99;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            ChallengeResultCancelled();
            throw null;
        }
        if (!ChallengeResultCancelled()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        WifiManager wifiManagerCI_ = cI_();
        if (wifiManagerCI_ == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i12 = getSDKEphemeralPublicKey + 79;
        getSDKReferenceNumber = i12 % 128;
        int i13 = i12 % 2;
        boolean zM15constructorimpl = DeviceParameterResult.Success.BooleanValue.m15constructorimpl(wifiManagerCI_.isEnhancedPowerReportingSupported());
        if (i13 == 0) {
            return DeviceParameterResult.Success.BooleanValue.m14boximpl(zM15constructorimpl);
        }
        DeviceParameterResult.Success.BooleanValue.m14boximpl(zM15constructorimpl);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private BuildConfig(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
