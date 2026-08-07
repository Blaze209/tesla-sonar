package atd.w;

import android.app.Application;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriptionId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InitializeResult extends InitializeResultSuccess {
    private static char AuthenticationRequestParameters = 0;
    private static char getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriptionId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ExpandableListView.getPackedPositionChild(0L);
        new getDeviceData((byte) 0);
        getMessageVersion = (getSDKReferenceNumber + 63) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeResult(Application application) {
        super(application);
        s.k(application, "");
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = (char) 39612;
        getSDKTransactionID = (char) 17344;
        getSDKAppID = (char) 40996;
        AuthenticationRequestParameters = (char) 35083;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        DeviceParameterResult.Success.IntValue intValueM35boximpl;
        int i11 = getMessageVersion + 55;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 82) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i12 = getMessageVersion + 103;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            intValueM35boximpl = DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(telephonyManagerCF_.getSubscriptionId()));
            int i13 = 77 / 0;
        } else {
            intValueM35boximpl = DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(telephonyManagerCF_.getSubscriptionId()));
        }
        getMessageVersion = (getSDKReferenceNumber + 59) % 128;
        return intValueM35boximpl;
    }
}
