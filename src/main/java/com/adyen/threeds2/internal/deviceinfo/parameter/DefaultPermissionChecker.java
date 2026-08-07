package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.app.Application;
import androidx.core.content.f;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DefaultPermissionChecker;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "checkPermission", "", "permission", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultPermissionChecker implements PermissionChecker {
    private static int getDeviceData = 1;
    private static int getSDKTransactionID;
    private final Application getSDKAppID;

    public DefaultPermissionChecker(Application application) {
        s.k(application, "");
        this.getSDKAppID = application;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return AuthenticationRequestParameters(objArr);
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker
    public final boolean getSDKAppID(String str) {
        return ((Boolean) AuthenticationRequestParameters(new Object[]{this, str}, -1423659540, 1423659540, System.identityHashCode(this))).booleanValue();
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        DefaultPermissionChecker defaultPermissionChecker = (DefaultPermissionChecker) objArr[0];
        String str = (String) objArr[1];
        int i11 = getDeviceData;
        int i12 = i11 & 21;
        int i13 = ((i11 ^ 21) | i12) << 1;
        int i14 = -((i11 | 21) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        getSDKTransactionID = i15 % 128;
        if (i15 % 2 != 0) {
            s.k(str, "");
            f.b(defaultPermissionChecker.getSDKAppID, str);
            throw null;
        }
        s.k(str, "");
        if (f.b(defaultPermissionChecker.getSDKAppID, str) == 0) {
            int i16 = getSDKTransactionID;
            int i17 = (i16 ^ 75) + ((i16 & 75) << 1);
            getDeviceData = i17 % 128;
            if (i17 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        int i18 = getDeviceData;
        int i19 = ((i18 ^ 125) - (~(-(-((i18 & 125) << 1))))) - 1;
        getSDKTransactionID = i19 % 128;
        if (i19 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }
}
