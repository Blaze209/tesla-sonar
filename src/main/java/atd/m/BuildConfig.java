package atd.m;

import android.os.Build;
import android.view.View;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Manufacturer;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends DeviceParameter {
    private static boolean AuthenticationRequestParameters = false;
    private static int ChallengeResultCancelled = 1;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Manufacturer$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        View.MeasureSpec.getMode(0);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = ChallengeResultCancelled + 125;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{64883, 64898, 64895};
        getSDKAppID = -185467470;
        AuthenticationRequestParameters = true;
        getSDKTransactionID = true;
    }

    private static String getSDKReferenceNumber() {
        String strM50constructorimpl;
        int i11 = ChallengeResultCancelled + 33;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            String str = Build.MANUFACTURER;
            s.j(str, "");
            strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
            int i12 = 34 / 0;
        } else {
            String str2 = Build.MANUFACTURER;
            s.j(str2, "");
            strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str2);
        }
        getSDKReferenceNumber = (ChallengeResultCancelled + 39) % 128;
        return strM50constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        int i11 = getSDKReferenceNumber + 107;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            DeviceParameterResult.Success.StringValue.m49boximpl(getSDKReferenceNumber());
            throw null;
        }
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKReferenceNumber());
        ChallengeResultCancelled = (getSDKReferenceNumber + 1) % 128;
        return stringValueM49boximpl;
    }
}
