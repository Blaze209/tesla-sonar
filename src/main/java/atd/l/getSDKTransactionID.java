package atd.l;

import android.app.Application;
import android.os.LocaleList;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.util.Locale;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DefaultApplicationLocale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getLocales", "Ljava/util/Locale;", "position", "", "getLocale", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID implements AuthenticationRequestParameters {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private final Application getSDKTransactionID;

    public getSDKTransactionID(Application application) {
        s.k(application, "");
        this.getSDKTransactionID = application;
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-317)) + (i12 * EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE);
        int i15 = ~i11;
        int i16 = ~i12;
        if (i14 + (((~(i12 | (~i13) | i11)) | (~(i15 | i16 | i13))) * (-318)) + (((~(i11 | i13)) | (~(i16 | i11))) * (-318)) + (((~(i15 | i13)) | i16) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) != 1) {
            return getSDKReferenceNumber(objArr);
        }
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i17 = getDeviceData;
        int i18 = ((i17 | 77) << 1) - (i17 ^ 77);
        AuthenticationRequestParameters = i18 % 128;
        int i19 = i18 % 2;
        LocaleList locales = getsdktransactionid.getSDKTransactionID.getResources().getConfiguration().getLocales();
        Locale locale = i19 != 0 ? locales.get(1) : locales.get(0);
        s.j(locale, "");
        return locale;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 ^ 41;
        getDeviceData = ((((i11 & 41) | i12) << 1) - i12) % 128;
        Locale locale = getsdktransactionid.getSDKTransactionID.getResources().getConfiguration().locale;
        s.j(locale, "");
        int i13 = AuthenticationRequestParameters;
        int i14 = ((i13 | 95) << 1) - (i13 ^ 95);
        getDeviceData = i14 % 128;
        if (i14 % 2 != 0) {
            return locale;
        }
        throw null;
    }

    @Override // atd.l.AuthenticationRequestParameters
    @e
    public final Locale AuthenticationRequestParameters() {
        return (Locale) getSDKAppID(new Object[]{this}, -1149030549, 1149030549, System.identityHashCode(this));
    }

    @Override // atd.l.AuthenticationRequestParameters
    public final Locale getSDKTransactionID() {
        return (Locale) getSDKAppID(new Object[]{this}, 774085938, -774085937, System.identityHashCode(this));
    }
}
