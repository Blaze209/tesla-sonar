package atd.l;

import android.app.Application;
import android.text.TextUtils;
import android.view.Gravity;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/PackageName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusHandler extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private final Application getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/PackageName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        new getSDKTransactionID((byte) 0);
        BuildConfig = (getSDKAppID + 111) % 128;
    }

    public ChallengeStatusHandler(Application application) {
        s.k(application, "");
        this.getDeviceData = application;
    }

    static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = -4201337076207898698L;
        AuthenticationRequestParameters = 1458778038;
        getSDKTransactionID = (char) 43214;
    }

    private String getSDKReferenceNumber() {
        String strM50constructorimpl;
        int i11 = getSDKAppID + 3;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            String packageName = this.getDeviceData.getPackageName();
            s.j(packageName, "");
            strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(packageName);
            int i12 = 14 / 0;
        } else {
            String packageName2 = this.getDeviceData.getPackageName();
            s.j(packageName2, "");
            strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(packageName2);
        }
        int i13 = getSDKAppID + 27;
        BuildConfig = i13 % 128;
        if (i13 % 2 != 0) {
            return strM50constructorimpl;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        BuildConfig = (getSDKAppID + 97) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKReferenceNumber());
        int i11 = BuildConfig + 17;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 81 / 0;
        }
        return stringValueM49boximpl;
    }
}
