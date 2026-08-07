package atd.l;

import android.view.KeyEvent;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkTransId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultKt extends DeviceParameter {
    private static long AuthenticationRequestParameters = 0;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkTransId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        KeyEvent.keyCodeFromString("");
        new getSDKReferenceNumber((byte) 0);
        int i11 = getSDKReferenceNumber + 3;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = -6833643793613421568L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        DeviceParameterResult failure;
        int i11 = getSDKReferenceNumber + 71;
        getSDKAppID = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                atd.a.BuildConfig buildConfig = atd.a.BuildConfig.getSDKAppID;
                DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl((String) atd.a.BuildConfig.getSDKReferenceNumber(new Object[0], -1879293315, 1879293315, (int) System.currentTimeMillis())));
                throw null;
            }
            atd.a.BuildConfig buildConfig2 = atd.a.BuildConfig.getSDKAppID;
            failure = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl((String) atd.a.BuildConfig.getSDKReferenceNumber(new Object[0], -1879293315, 1879293315, (int) System.currentTimeMillis())));
            int i12 = getSDKAppID + 83;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 != 0) {
                return failure;
            }
            throw null;
        } catch (atd.a.ChallengeResultCancelled unused) {
            failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
    }
}
