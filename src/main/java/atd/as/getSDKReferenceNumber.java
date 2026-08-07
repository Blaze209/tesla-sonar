package atd.as;

import android.content.Context;
import atd.ap.ChallengeResult;
import ch.qos.logback.core.CoreConstants;
import com.adyen.threeds2.Warning;
import com.plaid.internal.EnumC4419g;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/security/DeviceLockSecurityCheck;", "Lcom/adyen/threeds2/internal/security/SecurityCheck;", "deviceLockChecker", "Lcom/adyen/threeds2/internal/security/checker/DeviceLockChecker;", "<init>", "(Lcom/adyen/threeds2/internal/security/checker/DeviceLockChecker;)V", "warning", "Lcom/adyen/threeds2/Warning;", "getWarning", "()Lcom/adyen/threeds2/Warning;", "shouldWarn", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends getDeviceData {
    private static int getSDKAppID = 1;
    private static int getSDKTransactionID;
    private final atd.ar.getSDKReferenceNumber getSDKReferenceNumber;

    public getSDKReferenceNumber(atd.ar.getSDKReferenceNumber getsdkreferencenumber) {
        s.k(getsdkreferencenumber, "");
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        Object objB;
        boolean z11 = false;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        Context context = (Context) objArr[1];
        int i11 = getSDKTransactionID;
        int i12 = (i11 | 39) << 1;
        int i13 = -(i11 ^ 39);
        int i14 = (i12 & i13) + (i13 | i12);
        getSDKAppID = i14 % 128;
        try {
            if (i14 % 2 == 0) {
                s.k(context, "");
                jn0.s.Companion companion = jn0.s.INSTANCE;
                int i15 = 74 / 0;
                if (getsdkreferencenumber.getSDKReferenceNumber.AuthenticationRequestParameters(context)) {
                    int i16 = getSDKTransactionID;
                    int i17 = i16 & 7;
                    int i18 = (i16 ^ 7) | i17;
                    getSDKAppID = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
                } else {
                    int i19 = getSDKTransactionID;
                    int i21 = i19 & 55;
                    int i22 = (i19 ^ 55) | i21;
                    getSDKAppID = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
                    z11 = true;
                }
            } else {
                s.k(context, "");
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                if (getsdkreferencenumber.getSDKReferenceNumber.AuthenticationRequestParameters(context)) {
                    int i110 = getSDKTransactionID;
                    int i111 = i110 & 7;
                    int i112 = (i110 ^ 7) | i111;
                    getSDKAppID = ((i111 ^ i112) + ((i112 & i111) << 1)) % 128;
                } else {
                    int i113 = getSDKTransactionID;
                    int i23 = i113 & 55;
                    int i24 = (i113 ^ 55) | i23;
                    getSDKAppID = ((i23 ^ i24) + ((i24 & i23) << 1)) % 128;
                    z11 = true;
                }
            }
            objB = jn0.s.b(Boolean.valueOf(z11));
            int i25 = getSDKTransactionID;
            getSDKAppID = ((-2) - (((i25 ^ 46) + ((i25 & 46) << 1)) ^ (-1))) % 128;
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Boolean bool = Boolean.TRUE;
        if (jn0.s.g(objB)) {
            int i26 = getSDKAppID;
            int i27 = i26 ^ 107;
            int i28 = ((i26 & 107) | i27) << 1;
            int i29 = -i27;
            int i31 = (((i28 | i29) << 1) - (i28 ^ i29)) % 128;
            getSDKTransactionID = i31;
            getSDKAppID = ((i31 ^ 93) + ((i31 & 93) << 1)) % 128;
            objB = bool;
        } else {
            System.identityHashCode(getsdkreferencenumber);
            System.identityHashCode(getsdkreferencenumber);
        }
        Boolean bool2 = (Boolean) objB;
        bool2.booleanValue();
        int i32 = getSDKAppID;
        int i33 = (i32 ^ 111) + ((i32 & 111) << 1);
        getSDKTransactionID = i33 % 128;
        if (i33 % 2 == 0) {
            return bool2;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE) + (i12 * 471);
        int i15 = ~i11;
        return ((i14 + (((~((~i13) | i15)) | i12) * (-235))) + (((~(i15 | i13)) | i12) * (-470))) + (((~(i11 | (~i12))) | (~((i12 | i15) | i13))) * EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) != 1 ? getSDKTransactionID(objArr) : getSDKAppID(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        int i11 = getSDKTransactionID;
        getSDKAppID = (((((i11 ^ 79) | (i11 & 79)) << 1) - (~(-(((~i11) & 79) | (i11 & (-80)))))) - 1) % 128;
        ChallengeResult challengeResult = ChallengeResult.AuthenticationRequestParameters;
        int i12 = getSDKTransactionID;
        int i13 = i12 & 125;
        int i14 = (((i12 ^ 125) | i13) << 1) - ((i12 | 125) & (~i13));
        getSDKAppID = i14 % 128;
        if (i14 % 2 != 0) {
            return challengeResult;
        }
        throw null;
    }

    @Override // atd.as.getDeviceData
    protected final boolean AuthenticationRequestParameters(Context context) {
        return ((Boolean) getSDKReferenceNumber(new Object[]{this, context}, -1719037071, 1719037072, System.identityHashCode(this))).booleanValue();
    }

    @Override // atd.as.getDeviceData
    protected final Warning getDeviceData() {
        return (Warning) getSDKReferenceNumber(new Object[]{this}, 1240174568, -1240174568, System.identityHashCode(this));
    }
}
