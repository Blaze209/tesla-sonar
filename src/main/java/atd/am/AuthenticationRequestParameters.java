package atd.am;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import java.security.cert.X509Certificate;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/adyen/threeds2/internal/result/DirectoryServerKeysResult;", "", "publicKey", "Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;", "rootCertificates", "", "Ljava/security/cert/X509Certificate;", "<init>", "(Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;Ljava/util/List;)V", "getPublicKey", "()Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;", "getRootCertificates", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthenticationRequestParameters {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private final List<X509Certificate> getSDKReferenceNumber;
    private final atd.af.AuthenticationRequestParameters getSDKTransactionID;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationRequestParameters(atd.af.AuthenticationRequestParameters authenticationRequestParameters, List<? extends X509Certificate> list) {
        s.k(authenticationRequestParameters, "");
        s.k(list, "");
        this.getSDKTransactionID = authenticationRequestParameters;
        this.getSDKReferenceNumber = list;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-300)) + (i12 * EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE) + ((~(i11 | i12 | i13)) * (-301));
        int i15 = ~i12;
        int i16 = i14 + (((~(i15 | i13)) | (~((~i13) | i11))) * (-301)) + (((~((~i11) | i13)) | i15) * EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE);
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 != 3) {
                    return i16 != 4 ? AuthenticationRequestParameters(objArr) : getSDKTransactionID(objArr);
                }
                return getDeviceData(objArr);
            }
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            StringBuilder sb2 = new StringBuilder("DirectoryServerKeysResult(publicKey=");
            sb2.append(authenticationRequestParameters.getSDKTransactionID);
            sb2.append(", rootCertificates=");
            sb2.append(authenticationRequestParameters.getSDKReferenceNumber);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            String string = sb2.toString();
            int i17 = AuthenticationRequestParameters;
            getDeviceData = ((i17 & 59) + (i17 | 59)) % 128;
            return string;
        }
        AuthenticationRequestParameters authenticationRequestParameters2 = (AuthenticationRequestParameters) objArr[0];
        Object obj = objArr[1];
        int i18 = AuthenticationRequestParameters;
        int i19 = ((i18 ^ 71) + ((i18 & 71) << 1)) % 128;
        getDeviceData = i19;
        if (authenticationRequestParameters2 == obj) {
            int i21 = i18 & 125;
            int i22 = i21 + ((i18 ^ 125) | i21);
            getDeviceData = i22 % 128;
            boolean z11 = i22 % 2 != 0;
            int i23 = (i18 & (-126)) | ((~i18) & 125);
            int i24 = (i18 & 125) << 1;
            getDeviceData = (((i23 | i24) << 1) - (i23 ^ i24)) % 128;
            return Boolean.valueOf(z11);
        }
        if (!(obj instanceof AuthenticationRequestParameters)) {
            int i25 = (i19 + 63) % 128;
            AuthenticationRequestParameters = i25;
            int i26 = i25 & 37;
            int i27 = i25 | 37;
            getDeviceData = ((i26 & i27) + (i26 | i27)) % 128;
            return Boolean.FALSE;
        }
        AuthenticationRequestParameters authenticationRequestParameters3 = (AuthenticationRequestParameters) obj;
        if (s.f(authenticationRequestParameters2.getSDKTransactionID, authenticationRequestParameters3.getSDKTransactionID)) {
            if (s.f(authenticationRequestParameters2.getSDKReferenceNumber, authenticationRequestParameters3.getSDKReferenceNumber)) {
                AuthenticationRequestParameters = (getDeviceData + 109) % 128;
                return Boolean.TRUE;
            }
            int i28 = AuthenticationRequestParameters;
            int i29 = (((i28 ^ 86) + ((i28 & 86) << 1)) - 1) % 128;
            getDeviceData = i29;
            AuthenticationRequestParameters = ((i29 ^ 29) + ((i29 & 29) << 1)) % 128;
            return Boolean.FALSE;
        }
        int i31 = getDeviceData;
        int i32 = i31 & 49;
        int i33 = (i31 | 49) & (~i32);
        int i34 = -(-(i32 << 1));
        int i35 = ((i33 ^ i34) + ((i33 & i34) << 1)) % 128;
        AuthenticationRequestParameters = i35;
        int i36 = i35 & 41;
        getDeviceData = ((((i35 ^ 41) | i36) << 1) - ((41 | i35) & (~i36))) % 128;
        return Boolean.FALSE;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = ((i11 ^ 67) | (i11 & 67)) << 1;
        int i13 = -(((~i11) & 67) | (i11 & (-68)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        getDeviceData = i14 % 128;
        int i15 = i14 % 2;
        atd.af.AuthenticationRequestParameters authenticationRequestParameters2 = authenticationRequestParameters.getSDKTransactionID;
        if (i15 != 0) {
            return authenticationRequestParameters2;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getDeviceData;
        int i12 = i11 & 119;
        AuthenticationRequestParameters = (((((i11 ^ 119) | i12) << 1) - (~(-((i11 | 119) & (~i12))))) - 1) % 128;
        int iHashCode = authenticationRequestParameters.getSDKTransactionID.hashCode();
        int i13 = iHashCode * 31;
        int iHashCode2 = authenticationRequestParameters.getSDKReferenceNumber.hashCode();
        int iIdentityHashCode = System.identityHashCode(authenticationRequestParameters);
        int i14 = iHashCode2 * (-515);
        int i15 = iHashCode * 16027;
        int i16 = ((i14 ^ i15) - (~((i15 & i14) << 1))) - 1;
        int i17 = ~i13;
        int i18 = ~i13;
        int i19 = i18 | i13;
        int i21 = i17 & i19;
        int i22 = i21 & iIdentityHashCode;
        int i23 = (i21 | iIdentityHashCode) & (~i22);
        int i24 = ~((i23 & i22) | (i23 ^ i22));
        int i25 = ~iIdentityHashCode;
        int i26 = ~((i25 ^ iHashCode2) | (i25 & iHashCode2));
        int i27 = i24 ^ i26;
        int i28 = i24 & i26;
        int i29 = (i28 & i27) | (i27 ^ i28);
        int i31 = i25 ^ i13;
        int i32 = i25 & i13;
        int i33 = (i31 & i32) | (i31 ^ i32);
        int i34 = (i33 | (~i33)) & (~i33);
        int i35 = ((~i34) & i29) | ((~i29) & i34);
        int i36 = i29 & i34;
        int i37 = ((i36 & i35) | (i35 ^ i36)) * (-516);
        int i38 = i16 & i37;
        int i39 = (i38 - (~((i37 ^ i16) | i38))) - 1;
        int i41 = ~iHashCode2;
        int i42 = ~iHashCode2;
        int i43 = i42 | iHashCode2;
        int i44 = i41 & i43;
        int i45 = i19 & (~i13);
        int i46 = ((~i45) & i44) | ((~i44) & i45);
        int i47 = i44 & i45;
        int i48 = (i47 & i46) | (i46 ^ i47);
        int i49 = ~iIdentityHashCode;
        int i51 = (i48 & i49) | ((~i48) & iIdentityHashCode);
        int i52 = i48 & iIdentityHashCode;
        int i53 = ~((i52 & i51) | (i51 ^ i52));
        int i54 = (iIdentityHashCode | i49) & i25;
        int i55 = (i54 & i42) | (i42 ^ i54);
        int i56 = (i55 & i18) | ((~i55) & i13);
        int i57 = i55 & i13;
        int i58 = ~((i57 & i56) | (i56 ^ i57));
        int i59 = -(-(((i58 & i53) | (i53 ^ i58)) * 516));
        int i61 = i39 & i59;
        int i62 = (i59 | i39) & (~i61);
        int i63 = -(-(i61 << 1));
        int i64 = (i62 & i63) + (i62 | i63);
        int i65 = (~iHashCode2) & i43;
        int i66 = (i65 & i13) | (i65 ^ i13);
        int i67 = (i66 | (~i66)) & (~i66);
        int i68 = (i49 & i18) | ((~i49) & i13);
        int i69 = i13 & i49;
        int i71 = ~((i68 & i69) | (i68 ^ i69));
        int i72 = i67 ^ i71;
        int i73 = i67 & i71;
        int i74 = -(-(((i73 & i72) | (i72 ^ i73)) * 516));
        int i75 = ((i64 & i74) - (~(i74 | i64))) - 1;
        int i76 = AuthenticationRequestParameters;
        int i77 = (i76 | 107) << 1;
        int i78 = -(i76 ^ 107);
        int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
        getDeviceData = i79 % 128;
        if (i79 % 2 != 0) {
            return Integer.valueOf(i75);
        }
        int i81 = 34 / 0;
        return Integer.valueOf(i75);
    }

    public final boolean equals(Object other) {
        return ((Boolean) AuthenticationRequestParameters(new Object[]{this, other}, 578856271, -578856270, System.identityHashCode(this))).booleanValue();
    }

    public final List<X509Certificate> getSDKAppID() {
        return (List) AuthenticationRequestParameters(new Object[]{this}, -281403702, 281403702, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) AuthenticationRequestParameters(new Object[]{this}, -2015945055, 2015945059, System.identityHashCode(this))).intValue();
    }

    public final String toString() {
        return (String) AuthenticationRequestParameters(new Object[]{this}, 1411411087, -1411411085, System.identityHashCode(this));
    }

    public final atd.af.AuthenticationRequestParameters getSDKTransactionID() {
        return (atd.af.AuthenticationRequestParameters) AuthenticationRequestParameters(new Object[]{this}, 986276437, -986276434, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        List<X509Certificate> list;
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 ^ 113;
        int i13 = (((i11 & 113) | i12) << 1) - i12;
        getDeviceData = i13 % 128;
        if (i13 % 2 == 0) {
            list = authenticationRequestParameters.getSDKReferenceNumber;
            int i14 = 56 / 0;
        } else {
            list = authenticationRequestParameters.getSDKReferenceNumber;
        }
        System.identityHashCode(authenticationRequestParameters);
        System.identityHashCode(authenticationRequestParameters);
        return list;
    }
}
