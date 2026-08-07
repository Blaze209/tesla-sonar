package atd.n;

import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/SdkInt;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "getDeviceParameterResult--tjUSDw", "()I", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static char AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private static int getSDKAppID;
    private static char[] getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/SdkInt$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        new getDeviceData((byte) 0);
        int i11 = getDeviceData + 87;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static int AuthenticationRequestParameters() {
        int i11 = getSDKAppID + 103;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            DeviceParameterResult.Success.IntValue.m36constructorimpl(Build.VERSION.SDK_INT);
            throw null;
        }
        int iM36constructorimpl = DeviceParameterResult.Success.IntValue.m36constructorimpl(Build.VERSION.SDK_INT);
        getDeviceData = (getSDKAppID + 125) % 128;
        return iM36constructorimpl;
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{52461, 52456, 52383, 52462};
        AuthenticationRequestParameters = (char) 63814;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        int i11 = getSDKAppID + 73;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.IntValue.m35boximpl(AuthenticationRequestParameters());
        }
        int i12 = 73 / 0;
        return DeviceParameterResult.Success.IntValue.m35boximpl(AuthenticationRequestParameters());
    }
}
