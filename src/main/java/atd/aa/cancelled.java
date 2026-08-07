package atd.aa;

import android.graphics.Color;
import android.media.AudioTrack;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiMacAddress;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cancelled extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static char getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiMacAddress$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        Color.red(0);
        AudioTrack.getMaxVolume();
        new AuthenticationRequestParameters((byte) 0);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 35) % 128;
    }

    private static DeviceParameterResult.Failure AuthenticationRequestParameters() {
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        int i11 = AuthenticationRequestParameters + 33;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return failure;
        }
        throw null;
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = -4201337076207898698L;
        getSDKTransactionID = 1458778038;
        getDeviceData = (char) 21965;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        DeviceParameterResult.Failure failureAuthenticationRequestParameters;
        int i11 = AuthenticationRequestParameters + 79;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            failureAuthenticationRequestParameters = AuthenticationRequestParameters();
            int i12 = 34 / 0;
        } else {
            failureAuthenticationRequestParameters = AuthenticationRequestParameters();
        }
        int i13 = AuthenticationRequestParameters + 45;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 56 / 0;
        }
        return failureAuthenticationRequestParameters;
    }
}
