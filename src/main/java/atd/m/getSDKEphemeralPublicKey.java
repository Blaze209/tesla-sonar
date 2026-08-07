package atd.m;

import android.os.Build;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Hardware;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData;
    private static char[] getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Hardware$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        new getSDKReferenceNumber((byte) 0);
        int i11 = getDeviceData + 39;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static String AuthenticationRequestParameters() {
        getDeviceData = (AuthenticationRequestParameters + 37) % 128;
        String str = Build.HARDWARE;
        s.j(str, "");
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
        int i11 = getDeviceData + 111;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return strM50constructorimpl;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{30792, 30933, 30937, 30931};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        AuthenticationRequestParameters = (getDeviceData + 69) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        int i11 = AuthenticationRequestParameters + 75;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return stringValueM49boximpl;
        }
        throw null;
    }
}
