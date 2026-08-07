package atd.y;

import android.app.Application;
import android.view.View;
import android.webkit.WebSettings;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/webview/WebViewUserAgent;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static int ChallengeResultCancelled = 0;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static char[] getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static boolean getSDKTransactionID;
    private final Application AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/webview/WebViewUserAgent$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        new getDeviceData((byte) 0);
        ChallengeResultCancelled = (getMessageVersion + 45) % 128;
    }

    public getSDKAppID(Application application) {
        s.k(application, "");
        this.AuthenticationRequestParameters = application;
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = new char[]{64871, 64887, 64885, 64881};
        getDeviceData = -185467482;
        getSDKTransactionID = true;
        getSDKReferenceNumber = true;
    }

    private String getSDKTransactionID() {
        int i11 = getMessageVersion + 9;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.AuthenticationRequestParameters);
            s.j(defaultUserAgent, "");
            return DeviceParameterResult.Success.StringValue.m50constructorimpl(defaultUserAgent);
        }
        String defaultUserAgent2 = WebSettings.getDefaultUserAgent(this.AuthenticationRequestParameters);
        s.j(defaultUserAgent2, "");
        int i12 = 74 / 0;
        return DeviceParameterResult.Success.StringValue.m50constructorimpl(defaultUserAgent2);
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        ChallengeResultCancelled = (getMessageVersion + 67) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
        ChallengeResultCancelled = (getMessageVersion + 37) % 128;
        return stringValueM49boximpl;
    }
}
