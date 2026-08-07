package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.view.View;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkCountryIso;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class completed extends InitializeResultSuccess {
    private static char[] AuthenticationRequestParameters = null;
    private static int getSDKAppID = 1;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkCountryIso$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "LENGTH", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        View.combineMeasuredStates(0, 0);
        Color.red(0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = getSDKAppID + 31;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public completed(Application application) {
        super(application);
        s.k(application, "");
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{63813, 52454, 52383, 52462};
        getSDKReferenceNumber = (char) 63814;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ != null) {
            getSDKTransactionID = (getSDKAppID + 69) % 128;
            String networkCountryIso = telephonyManagerCF_.getNetworkCountryIso();
            if (networkCountryIso != null) {
                if (networkCountryIso.length() == 2) {
                    int i11 = (getSDKAppID + 61) % 128;
                    getSDKTransactionID = i11;
                    int i12 = i11 + 21;
                    getSDKAppID = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                } else {
                    networkCountryIso = null;
                }
                if (networkCountryIso != null) {
                    int i13 = getSDKTransactionID + 107;
                    getSDKAppID = i13 % 128;
                    if (i13 % 2 != 0) {
                        return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(networkCountryIso));
                    }
                    int i14 = 80 / 0;
                    return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(networkCountryIso));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }
}
