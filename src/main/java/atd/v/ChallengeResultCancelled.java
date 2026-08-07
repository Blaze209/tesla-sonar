package atd.v;

import android.app.Application;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/DefaultPackageManager;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "canRequestPackageInstalls", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled implements ChallengeResultCompleted {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKReferenceNumber = 1;
    private final Application getSDKTransactionID;

    public ChallengeResultCancelled(Application application) {
        s.k(application, "");
        this.getSDKTransactionID = application;
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        return getSDKTransactionID(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = i11 | 5;
        int i13 = i12 << 1;
        int i14 = -((~(i11 & 5)) & i12);
        AuthenticationRequestParameters = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
        boolean zCanRequestPackageInstalls = challengeResultCancelled.getSDKTransactionID.getPackageManager().canRequestPackageInstalls();
        int i15 = AuthenticationRequestParameters;
        int i16 = i15 & 1;
        int i17 = -(-((i15 ^ 1) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        getSDKReferenceNumber = i18 % 128;
        if (i18 % 2 != 0) {
            return Boolean.valueOf(zCanRequestPackageInstalls);
        }
        throw null;
    }

    @Override // atd.v.ChallengeResultCompleted
    public final boolean getSDKReferenceNumber() {
        return ((Boolean) getSDKAppID(new Object[]{this}, -1131299480, 1131299480, System.identityHashCode(this))).booleanValue();
    }
}
