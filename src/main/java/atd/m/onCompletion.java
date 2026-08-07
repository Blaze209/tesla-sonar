package atd.m;

import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Time;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "getDeviceParameterResult-9LCWfJs", "()J", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCompletion extends DeviceParameter {
    private static char AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Time$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        TypedValue.complexToFloat(0);
        TextUtils.lastIndexOf("", '0');
        new getDeviceData((byte) 0);
        int i11 = getSDKAppID + 121;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static long AuthenticationRequestParameters() {
        getDeviceData = (getSDKAppID + 107) % 128;
        long jM43constructorimpl = DeviceParameterResult.Success.LongValue.m43constructorimpl(Build.TIME);
        int i11 = getDeviceData + 49;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return jM43constructorimpl;
        }
        throw null;
    }

    static void getSDKReferenceNumber() {
        getSDKTransactionID = -4201337076207898698L;
        getSDKReferenceNumber = 1458778038;
        AuthenticationRequestParameters = (char) 48853;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getDeviceData = (getSDKAppID + 35) % 128;
        DeviceParameterResult.Success.LongValue longValueM42boximpl = DeviceParameterResult.Success.LongValue.m42boximpl(AuthenticationRequestParameters());
        getDeviceData = (getSDKAppID + 43) % 128;
        return longValueM42boximpl;
    }
}
