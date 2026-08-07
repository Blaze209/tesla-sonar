package atd.l;

import android.location.Location;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Longitude;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "location", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCompleted extends DeviceParameter {
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int[] getSDKTransactionID;
    private final ChallengeResultTimeout getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Longitude$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getKeyRepeatDelay();
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKAppID + 87;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
    }

    public ChallengeResultCompleted(ChallengeResultTimeout challengeResultTimeout) {
        s.k(challengeResultTimeout, "");
        this.getSDKReferenceNumber = challengeResultTimeout;
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = new int[]{294276083, -1203316122, -2000139043, -1035527742, 901150200, 2140513498, -1890187056, -1005004434, -528522454, -776696808, -2091780346, -1228185534, 232443713, -833602587, 802536629, 925150823, -1782093167, -1545942468};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double cr_(Location location) {
        getDeviceData = (getSDKAppID + 35) % 128;
        s.k(location, "");
        double longitude = location.getLongitude();
        int i11 = getSDKAppID + 69;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return longitude;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        ChallengeResultError challengeResultErrorAuthenticationRequestParameters = this.getSDKReferenceNumber.AuthenticationRequestParameters(new l() { // from class: atd.l.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Double.valueOf(ChallengeResultCompleted.cr_((Location) obj));
            }
        });
        if (!(challengeResultErrorAuthenticationRequestParameters instanceof ChallengeResultError.getSDKAppID)) {
            if (s.f(challengeResultErrorAuthenticationRequestParameters, ChallengeResultError.getSDKTransactionID.getSDKReferenceNumber.getSDKTransactionID)) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            }
            if (s.f(challengeResultErrorAuthenticationRequestParameters, ChallengeResultError.getSDKTransactionID.getSDKAppID.getDeviceData)) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            }
            throw new NoWhenBranchMatchedException();
        }
        ChallengeResultError.getSDKAppID getsdkappid = (ChallengeResultError.getSDKAppID) challengeResultErrorAuthenticationRequestParameters;
        Double dValueOf = Double.valueOf(((Double) ChallengeResultError.getSDKAppID.getDeviceData(new Object[]{getsdkappid}, -1630442064, 1630442064, System.identityHashCode(getsdkappid))).doubleValue());
        double dDoubleValue = dValueOf.doubleValue();
        if (-180.0d > dDoubleValue) {
            dValueOf = null;
        } else if (dDoubleValue > 180.0d) {
            getSDKAppID = (getDeviceData + 47) % 128;
            dValueOf = null;
        }
        if (dValueOf == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        DeviceParameterResult.Success.DoubleValue doubleValueM21boximpl = DeviceParameterResult.Success.DoubleValue.m21boximpl(DeviceParameterResult.Success.DoubleValue.m22constructorimpl(dValueOf.doubleValue()));
        getSDKAppID = (getDeviceData + 17) % 128;
        return doubleValueM21boximpl;
    }
}
