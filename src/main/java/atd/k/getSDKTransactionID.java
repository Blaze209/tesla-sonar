package atd.k;

import android.app.Application;
import android.graphics.Color;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Xdpi;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "getDeviceParameterResult-Ffr52qI", "()F", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 1;
    private static char getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Xdpi$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getEdgeSlop();
        Color.alpha(0);
        new getSDKAppID((byte) 0);
        getSDKTransactionID = (AuthenticationRequestParameters + 65) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKTransactionID(Application application) {
        super(application);
        s.k(application, "");
    }

    static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{52463, 52383, 52458, 52461};
        getSDKAppID = (char) 63814;
    }

    private float getSDKReferenceNumber() {
        int i11 = getSDKTransactionID + 85;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.FloatValue.m29constructorimpl(cs_().xdpi);
        }
        DeviceParameterResult.Success.FloatValue.m29constructorimpl(cs_().xdpi);
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        int i11 = getSDKTransactionID + 123;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.FloatValue.m28boximpl(getSDKReferenceNumber());
        }
        int i12 = 14 / 0;
        return DeviceParameterResult.Success.FloatValue.m28boximpl(getSDKReferenceNumber());
    }
}
