package atd.w;

import android.app.Application;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperator;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isNumeric", "(Ljava/lang/String;)Z", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cancelled extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static boolean getDeviceData = false;
    private static int getMessageVersion = 1;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperator$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MAX_LENGTH", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        KeyEvent.getDeadChar(0, 0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = getMessageVersion + 43;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 33 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cancelled(Application application) {
        super(application);
        s.k(application, "");
    }

    private static boolean getSDKReferenceNumber(String str) {
        int i11 = getMessageVersion + 41;
        getSDKAppID = i11 % 128;
        for (int i12 = i11 % 2 != 0 ? 1 : 0; i12 < str.length(); i12++) {
            getSDKAppID = (getMessageVersion + 75) % 128;
            if (!Character.isDigit(str.charAt(i12))) {
                getSDKAppID = (getMessageVersion + 35) % 128;
                return false;
            }
        }
        return true;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{64893, 64908, 64909, 64905};
        AuthenticationRequestParameters = -185467460;
        getSDKTransactionID = true;
        getDeviceData = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        String simOperator;
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ != null && (simOperator = telephonyManagerCF_.getSimOperator()) != null) {
            if (simOperator.length() > 6 || !getSDKReferenceNumber(simOperator)) {
                simOperator = null;
            } else {
                getSDKAppID = (getMessageVersion + 65) % 128;
            }
            if (simOperator != null) {
                return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(simOperator));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }
}
