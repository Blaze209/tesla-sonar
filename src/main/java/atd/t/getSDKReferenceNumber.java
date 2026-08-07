package atd.t;

import android.app.Application;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/IsSafeMode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$BooleanValue;", "getDeviceParameterResult-f40dxT0", "()Z", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends DeviceParameter {
    private static char[] AuthenticationRequestParameters = null;
    private static int getDeviceData = 1;
    private static int getSDKReferenceNumber;
    private final Application getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/IsSafeMode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        new getDeviceData((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 29) % 128;
    }

    public getSDKReferenceNumber(Application application) {
        s.k(application, "");
        this.getSDKTransactionID = application;
    }

    private boolean getSDKReferenceNumber() {
        boolean zM15constructorimpl;
        int i11 = getDeviceData + 49;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            zM15constructorimpl = DeviceParameterResult.Success.BooleanValue.m15constructorimpl(this.getSDKTransactionID.getPackageManager().isSafeMode());
            int i12 = 38 / 0;
        } else {
            zM15constructorimpl = DeviceParameterResult.Success.BooleanValue.m15constructorimpl(this.getSDKTransactionID.getPackageManager().isSafeMode());
        }
        int i13 = getSDKReferenceNumber + 85;
        getDeviceData = i13 % 128;
        if (i13 % 2 != 0) {
            return zM15constructorimpl;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{30794, 30940, 30949, 30951};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getDeviceData = (getSDKReferenceNumber + 101) % 128;
        DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(getSDKReferenceNumber());
        getDeviceData = (getSDKReferenceNumber + 65) % 128;
        return booleanValueM14boximpl;
    }
}
