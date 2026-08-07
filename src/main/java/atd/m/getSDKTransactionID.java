package atd.m;

import android.os.Build;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Brand;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static int[] getDeviceData = null;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Brand$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        ViewConfiguration.getScrollBarFadeDuration();
        new getSDKAppID((byte) 0);
        int i11 = getSDKTransactionID + 125;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 27 / 0;
        }
    }

    private static String getSDKReferenceNumber() {
        getSDKReferenceNumber = (getSDKTransactionID + 121) % 128;
        String str = Build.BRAND;
        s.j(str, "");
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
        getSDKReferenceNumber = (getSDKTransactionID + 13) % 128;
        return strM50constructorimpl;
    }

    static void getSDKTransactionID() {
        getDeviceData = new int[]{273473923, -466222575, 120301170, 510704567, 1235746295, 1493240907, -478348056, 814732317, -1140710099, 1159876059, 1476088476, -946433369, -801406399, -1602864131, -1385873790, -565793393, 897054107, -2093294955};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        DeviceParameterResult.Success.StringValue stringValueM49boximpl;
        int i11 = getSDKTransactionID + 27;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKReferenceNumber());
            int i12 = 65 / 0;
        } else {
            stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKReferenceNumber());
        }
        getSDKReferenceNumber = (getSDKTransactionID + 99) % 128;
        return stringValueM49boximpl;
    }
}
