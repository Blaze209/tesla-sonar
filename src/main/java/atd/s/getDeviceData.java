package atd.s;

import android.os.Environment;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/environment/GetExternalStorageState;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static long getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/environment/GetExternalStorageState$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        TextUtils.indexOf("", "");
        TextUtils.indexOf((CharSequence) "", '0');
        ViewConfiguration.getScrollDefaultDelay();
        new getSDKTransactionID((byte) 0);
        AuthenticationRequestParameters = (getSDKTransactionID + 3) % 128;
    }

    private static String AuthenticationRequestParameters() {
        AuthenticationRequestParameters = (getSDKTransactionID + 25) % 128;
        String externalStorageState = Environment.getExternalStorageState();
        s.j(externalStorageState, "");
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(externalStorageState);
        int i11 = getSDKTransactionID + 57;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 38 / 0;
        }
        return strM50constructorimpl;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{'9', 13293, 26370, 39597};
        getSDKAppID = 4480451212563067868L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        int i11 = getSDKTransactionID + 93;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        }
        DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        throw null;
    }
}
