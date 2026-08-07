package atd.t;

import android.app.Application;
import android.view.Gravity;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetSystemAvailableFeatures;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "getDeviceParameterResult--tjUSDw", "()I", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static int[] getDeviceData = null;
    private static int getSDKAppID = 0;
    private static int getSDKTransactionID = 1;
    private final Application getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetSystemAvailableFeatures$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        Gravity.getAbsoluteGravity(0, 0);
        new getDeviceData((byte) 0);
        getSDKAppID = (getSDKTransactionID + 1) % 128;
    }

    public AuthenticationRequestParameters(Application application) {
        s.k(application, "");
        this.getSDKReferenceNumber = application;
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new int[]{242035556, 1877887562, 1082533283, 1946675118, 387302446, 890276630, 1824962249, 711116431, -152500175, -1801868888, -1571870720, 383950177, 527897051, -554028699, 1348475430, 892754029, -1469891627, 1544906771};
    }

    private int getSDKTransactionID() {
        int i11 = getSDKTransactionID + 87;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            DeviceParameterResult.Success.IntValue.m36constructorimpl(this.getSDKReferenceNumber.getPackageManager().getSystemAvailableFeatures().length);
            throw null;
        }
        int iM36constructorimpl = DeviceParameterResult.Success.IntValue.m36constructorimpl(this.getSDKReferenceNumber.getPackageManager().getSystemAvailableFeatures().length);
        getSDKTransactionID = (getSDKAppID + 57) % 128;
        return iM36constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getSDKAppID = (getSDKTransactionID + 35) % 128;
        DeviceParameterResult.Success.IntValue intValueM35boximpl = DeviceParameterResult.Success.IntValue.m35boximpl(getSDKTransactionID());
        int i11 = getSDKTransactionID + 99;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return intValueM35boximpl;
        }
        throw null;
    }
}
