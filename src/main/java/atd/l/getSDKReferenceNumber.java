package atd.l;

import android.app.Application;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/AppId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static long getDeviceData;
    private static int getSDKTransactionID;
    private final Application getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/AppId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        ViewConfiguration.getKeyRepeatDelay();
        new getDeviceData((byte) 0);
        getSDKTransactionID = (AuthenticationRequestParameters + 73) % 128;
    }

    public getSDKReferenceNumber(Application application) {
        s.k(application, "");
        this.getSDKReferenceNumber = application;
    }

    private String AuthenticationRequestParameters() throws Throwable {
        Application application = this.getSDKReferenceNumber;
        atd.al.AuthenticationRequestParameters sDKAppID = atd.al.AuthenticationRequestParameters.getSDKAppID();
        s.j(sDKAppID, "");
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(new atd.a.getSDKTransactionID(application, sDKAppID).getDeviceData());
        AuthenticationRequestParameters = (getSDKTransactionID + 69) % 128;
        return strM50constructorimpl;
    }

    static void getSDKTransactionID() {
        getDeviceData = 324328202994123875L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        int i11 = getSDKTransactionID + 47;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        }
        DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        throw null;
    }
}
