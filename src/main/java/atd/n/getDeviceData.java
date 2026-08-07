package atd.n;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/Codename;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static int getDeviceData = 0;
    private static char[] getSDKAppID = null;
    private static long getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/version/Codename$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        View.resolveSize(0, 0);
        SystemClock.elapsedRealtime();
        new getSDKTransactionID((byte) 0);
        getSDKTransactionID = (getDeviceData + 101) % 128;
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{'9', 17325, 34692, 52199};
        getSDKReferenceNumber = -6654828015282142307L;
    }

    private static String getSDKTransactionID() {
        getDeviceData = (getSDKTransactionID + 25) % 128;
        String str = Build.VERSION.CODENAME;
        s.j(str, "");
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
        getDeviceData = (getSDKTransactionID + 79) % 128;
        return strM50constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        DeviceParameterResult.Success.StringValue stringValueM49boximpl;
        int i11 = getSDKTransactionID + 55;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
            int i12 = 85 / 0;
        } else {
            stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
        }
        getDeviceData = (getSDKTransactionID + 93) % 128;
        return stringValueM49boximpl;
    }
}
