package atd.q;

import android.app.Application;
import android.provider.Settings;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/SystemSettings;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "setting", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID implements AuthenticationRequestParameters {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData;
    private final Application getSDKTransactionID;

    public getSDKAppID(Application application) {
        s.k(application, "");
        this.getSDKTransactionID = application;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        String str = (String) objArr[1];
        getDeviceData = (AuthenticationRequestParameters + 63) % 128;
        s.k(str, "");
        String string = Settings.System.getString(getsdkappid.getSDKTransactionID.getContentResolver(), str);
        int i14 = getDeviceData;
        AuthenticationRequestParameters = ((((i14 | 4) << 1) - (i14 ^ 4)) - 1) % 128;
        return string;
    }

    @Override // atd.q.AuthenticationRequestParameters
    public final String getSDKTransactionID(String str) {
        return (String) getSDKTransactionID(new Object[]{this, str}, -2013957350, 2013957350, System.identityHashCode(this));
    }
}
