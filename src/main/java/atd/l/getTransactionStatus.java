package atd.l;

import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsVersion;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransactionStatus extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static long getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsVersion$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        View.resolveSize(0, 0);
        TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKAppID + 1;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = -4201337076207898698L;
        getDeviceData = 1458778038;
        getSDKTransactionID = (char) 32467;
    }

    private static String getSDKTransactionID() {
        String strM50constructorimpl;
        int i11 = getSDKAppID + 31;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            String str = Build.VERSION.RELEASE;
            s.j(str, "");
            strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
            int i12 = 23 / 0;
        } else {
            String str2 = Build.VERSION.RELEASE;
            s.j(str2, "");
            strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str2);
        }
        int i13 = AuthenticationRequestParameters + 95;
        getSDKAppID = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 60 / 0;
        }
        return strM50constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        int i11 = getSDKAppID + 47;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
            throw null;
        }
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
        getSDKAppID = (AuthenticationRequestParameters + 45) % 128;
        return stringValueM49boximpl;
    }
}
