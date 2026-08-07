package atd.q;

import android.app.Application;
import android.provider.Settings;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/SecureSettings;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "setting", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData implements AuthenticationRequestParameters {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKReferenceNumber;
    private final Application getSDKTransactionID;

    public getDeviceData(Application application) {
        s.k(application, "");
        this.getSDKTransactionID = application;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return getDeviceData(objArr);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        String str = (String) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = ((((i11 ^ 9) | (i11 & 9)) << 1) - (~(-(((~i11) & 9) | (i11 & (-10)))))) - 1;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            s.k(str, "");
            Settings.Secure.getString(getdevicedata.getSDKTransactionID.getContentResolver(), str);
            throw null;
        }
        s.k(str, "");
        String string = Settings.Secure.getString(getdevicedata.getSDKTransactionID.getContentResolver(), str);
        int i13 = getSDKReferenceNumber;
        int i14 = i13 & 39;
        AuthenticationRequestParameters = (((((i13 ^ 39) | i14) << 1) - (~(-((i13 | 39) & (~i14))))) - 1) % 128;
        return string;
    }

    @Override // atd.q.AuthenticationRequestParameters
    public final String getSDKTransactionID(String str) {
        return (String) AuthenticationRequestParameters(new Object[]{this, str}, 1850757718, -1850757718, System.identityHashCode(this));
    }
}
