package atd.aa;

import android.app.Application;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProviderFriendlyName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "passpointProvider", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class completed extends ChallengeResultKt {
    private static long getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private final ChallengeResultTimeout AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProviderFriendlyName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        TypedValue.complexToFloat(0);
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getGlobalActionKeyTimeout();
        new getDeviceData((byte) 0);
        int i11 = getSDKAppID + 75;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ completed(Application application) {
        this(application, new DefaultPermissionChecker(application), new ChallengeStatusReceiver(application));
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{'9', 46016, 26462, 6875};
        getDeviceData = -4894483909532273679L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        getSDKReferenceNumber = (getSDKAppID + 7) % 128;
        if (Build.VERSION.SDK_INT < 29) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (!ChallengeResultCancelled()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        String deviceData = this.AuthenticationRequestParameters.getDeviceData();
        if (deviceData == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i11 = getSDKReferenceNumber + 61;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 39 / 0;
            }
            return failure;
        }
        int i13 = getSDKReferenceNumber + 37;
        getSDKAppID = i13 % 128;
        int i14 = i13 % 2;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(deviceData));
        if (i14 == 0) {
            int i15 = 23 / 0;
        }
        return stringValueM49boximpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private completed(Application application, PermissionChecker permissionChecker, ChallengeResultTimeout challengeResultTimeout) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
        s.k(challengeResultTimeout, "");
        this.AuthenticationRequestParameters = challengeResultTimeout;
    }
}
