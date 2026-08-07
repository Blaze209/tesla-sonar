package atd.m;

import android.os.Build;
import android.text.AndroidCharacter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Supported64BitAbis;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultKt extends DeviceParameter {
    private static char[] AuthenticationRequestParameters = null;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static boolean getSDKAppID;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Supported64BitAbis$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        AndroidCharacter.getMirror('0');
        new getSDKTransactionID((byte) 0);
        int i11 = getMessageVersion + 123;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = new char[]{64820, 64839, 64832};
        getSDKReferenceNumber = -185467529;
        getSDKTransactionID = true;
        getSDKAppID = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        getMessageVersion = (getDeviceData + 109) % 128;
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        if (strArr != null) {
            int i11 = getDeviceData + 65;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                n.w1(strArr);
                throw null;
            }
            List listW1 = n.w1(strArr);
            if (listW1 != null) {
                DeviceParameterResult.Success.StringsListValue stringsListValueM56boximpl = DeviceParameterResult.Success.StringsListValue.m56boximpl(DeviceParameterResult.Success.StringsListValue.m57constructorimpl(listW1));
                getDeviceData = (getMessageVersion + 7) % 128;
                return stringsListValueM56boximpl;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }
}
