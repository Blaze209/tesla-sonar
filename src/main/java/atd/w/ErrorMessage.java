package atd.w;

import android.app.Application;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimState;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorMessage extends InitializeResultSuccess {
    private static char[] AuthenticationRequestParameters = null;
    private static boolean getDeviceData = false;
    private static boolean getSDKAppID = false;
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimState$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MINIMUM", "", "MAXIMUM", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        TextUtils.getOffsetBefore("", 0);
        new getSDKTransactionID((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 17;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorMessage(Application application) {
        super(application);
        s.k(application, "");
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{64798, 64817, 64814, 64809};
        getSDKTransactionID = -185467551;
        getDeviceData = true;
        getSDKAppID = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ != null) {
            int i11 = getSDKReferenceNumber + 61;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                telephonyManagerCF_.getSimState();
                throw null;
            }
            Integer numValueOf = Integer.valueOf(telephonyManagerCF_.getSimState());
            int iIntValue = numValueOf.intValue();
            if (iIntValue < 0 || iIntValue >= 10) {
                numValueOf = null;
            } else {
                int i12 = (getSDKEphemeralPublicKey + 55) % 128;
                getSDKReferenceNumber = i12;
                getSDKEphemeralPublicKey = (i12 + 57) % 128;
            }
            if (numValueOf != null) {
                int i13 = getSDKReferenceNumber + 125;
                getSDKEphemeralPublicKey = i13 % 128;
                int i14 = i13 % 2;
                int iM36constructorimpl = DeviceParameterResult.Success.IntValue.m36constructorimpl(numValueOf.intValue());
                if (i14 != 0) {
                    return DeviceParameterResult.Success.IntValue.m35boximpl(iM36constructorimpl);
                }
                DeviceParameterResult.Success.IntValue.m35boximpl(iM36constructorimpl);
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }
}
