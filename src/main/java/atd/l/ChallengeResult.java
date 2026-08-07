package atd.l;

import android.location.Location;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Latitude;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "location", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;
    private final ChallengeResultTimeout getDeviceData;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Latitude$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        ViewConfiguration.getGlobalActionKeyTimeout();
        TypedValue.complexToFloat(0);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getZoomControlsTimeout();
        TextUtils.getTrimmedLength("");
        new getSDKAppID((byte) 0);
        int i11 = ChallengeResultCancelled + 49;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public ChallengeResult(ChallengeResultTimeout challengeResultTimeout) {
        s.k(challengeResultTimeout, "");
        this.getDeviceData = challengeResultTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double cn_(Location location) {
        ChallengeResult = (ChallengeResultCancelled + 69) % 128;
        s.k(location, "");
        double latitude = location.getLatitude();
        ChallengeResult = (ChallengeResultCancelled + 113) % 128;
        return latitude;
    }

    static void getSDKTransactionID() {
        getSDKAppID = -867194039;
        AuthenticationRequestParameters = -1568970101;
        getSDKReferenceNumber = 1088884569;
        getSDKTransactionID = new byte[]{75, 74, -90, -2};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        ChallengeResult = (ChallengeResultCancelled + 117) % 128;
        ChallengeResultError challengeResultErrorAuthenticationRequestParameters = this.getDeviceData.AuthenticationRequestParameters(new l() { // from class: atd.l.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Double.valueOf(ChallengeResult.cn_((Location) obj));
            }
        });
        if (challengeResultErrorAuthenticationRequestParameters instanceof ChallengeResultError.getSDKAppID) {
            ChallengeResultError.getSDKAppID getsdkappid = (ChallengeResultError.getSDKAppID) challengeResultErrorAuthenticationRequestParameters;
            Double dValueOf = Double.valueOf(((Double) ChallengeResultError.getSDKAppID.getDeviceData(new Object[]{getsdkappid}, -1630442064, 1630442064, System.identityHashCode(getsdkappid))).doubleValue());
            double dDoubleValue = dValueOf.doubleValue();
            if (-90.0d > dDoubleValue || dDoubleValue > 90.0d) {
                dValueOf = null;
            } else {
                ChallengeResultCancelled = (ChallengeResult + 19) % 128;
            }
            return dValueOf != null ? DeviceParameterResult.Success.DoubleValue.m21boximpl(DeviceParameterResult.Success.DoubleValue.m22constructorimpl(dValueOf.doubleValue())) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        if (!s.f(challengeResultErrorAuthenticationRequestParameters, ChallengeResultError.getSDKTransactionID.getSDKReferenceNumber.getSDKTransactionID)) {
            if (s.f(challengeResultErrorAuthenticationRequestParameters, ChallengeResultError.getSDKTransactionID.getSDKAppID.getDeviceData)) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            }
            throw new NoWhenBranchMatchedException();
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i11 = ChallengeResult + 83;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 20 / 0;
        }
        return failure;
    }
}
