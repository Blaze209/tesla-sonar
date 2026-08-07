package atd.e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public class ChallengeResultError extends getAdditionalDetails {
    private static int AuthenticationRequestParameters = 0;
    public static final Parcelable.Creator<ChallengeResultError> CREATOR = new Parcelable.Creator<ChallengeResultError>() { // from class: atd.e.ChallengeResultError.3
        private static int getDeviceData = 1;
        private static int getSDKTransactionID;

        private static ChallengeResultError[] getDeviceData(int i11) {
            return (ChallengeResultError[]) getSDKAppID(new Object[]{Integer.valueOf(i11)}, -1969443923, 1969443925, i11);
        }

        public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = (i11 * 881) + (i12 * 881) + (((~(i15 | i13)) | (~(i14 | i15)) | (~(i14 | i13))) * (-880));
            int i17 = i12 | (~(i14 | (~i13)));
            int i18 = ~(i11 | i13);
            int i19 = i16 + ((i17 | i18) * (-880)) + (i18 * 880);
            if (i19 == 1) {
                return getSDKReferenceNumber(objArr);
            }
            if (i19 == 2) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i21 = getDeviceData;
                int i22 = i21 ^ 93;
                getSDKTransactionID = (((((i21 & 93) | i22) << 1) - (~(-i22))) - 1) % 128;
                ChallengeResultError[] challengeResultErrorArr = new ChallengeResultError[iIntValue];
                int i23 = i21 & 105;
                int i24 = ((i21 ^ 105) | i23) << 1;
                int i25 = -((i21 | 105) & (~i23));
                getSDKTransactionID = ((i24 ^ i25) + ((i25 & i24) << 1)) % 128;
                return challengeResultErrorArr;
            }
            if (i19 != 3) {
                ChallengeResultError challengeResultError = new ChallengeResultError((Parcel) objArr[0]);
                int i26 = getSDKTransactionID;
                int i27 = i26 & 97;
                int i28 = -(-((i26 ^ 97) | i27));
                getDeviceData = (((i27 | i28) << 1) - (i28 ^ i27)) % 128;
                return challengeResultError;
            }
            int iIntValue2 = ((Number) objArr[1]).intValue();
            int i29 = getDeviceData;
            int i31 = i29 & 119;
            int i32 = (i29 ^ 119) | i31;
            getSDKTransactionID = ((i31 ^ i32) + ((i32 & i31) << 1)) % 128;
            ChallengeResultError[] challengeResultErrorArr2 = (ChallengeResultError[]) getSDKAppID(new Object[]{Integer.valueOf(iIntValue2)}, -1969443923, 1969443925, iIntValue2);
            int i33 = getSDKTransactionID;
            int i34 = i33 & 103;
            int i35 = -(-((i33 ^ 103) | i34));
            getDeviceData = (((i34 | i35) << 1) - (i35 ^ i34)) % 128;
            return challengeResultErrorArr2;
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            ChallengeResultError challengeResultError;
            Parcel parcel = (Parcel) objArr[1];
            int i11 = getDeviceData;
            int i12 = i11 & 85;
            int i13 = (i11 ^ 85) | i12;
            int i14 = (i12 & i13) + (i13 | i12);
            getSDKTransactionID = i14 % 128;
            Object[] objArr2 = {parcel};
            if (i14 % 2 != 0) {
                challengeResultError = (ChallengeResultError) getSDKAppID(objArr2, -1137762642, 1137762642, (int) System.currentTimeMillis());
                int i15 = 46 / 0;
            } else {
                challengeResultError = (ChallengeResultError) getSDKAppID(objArr2, -1137762642, 1137762642, (int) System.currentTimeMillis());
            }
            int i16 = getSDKTransactionID;
            int i17 = i16 & 21;
            int i18 = (i16 | 21) & (~i17);
            int i19 = i17 << 1;
            getDeviceData = ((i18 & i19) + (i18 | i19)) % 128;
            return challengeResultError;
        }

        private static ChallengeResultError n_(Parcel parcel) {
            return (ChallengeResultError) getSDKAppID(new Object[]{parcel}, -1137762642, 1137762642, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultError, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultError createFromParcel(Parcel parcel) {
            return getSDKAppID(new Object[]{this, parcel}, -669242243, 669242244, System.identityHashCode(this));
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultError[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultError[] newArray(int i11) {
            return (Object[]) getSDKAppID(new Object[]{this, Integer.valueOf(i11)}, -856335493, 856335496, i11);
        }
    };
    private static int getSDKAppID = 1;
    private String getSDKReferenceNumber;

    static {
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 | 7) << 1;
        int i13 = -(((~i11) & 7) | (i11 & (-8)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        getSDKAppID = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    ChallengeResultError(JsonObject jsonObject) {
        super(jsonObject);
        this.getSDKReferenceNumber = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.SUBMIT_AUTHENTICATION_LABEL).getSDKReferenceNumber();
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        return getSDKTransactionID(objArr);
    }

    public final String ChallengeStatusReceiver() {
        return (String) getSDKTransactionID(new Object[]{this}, 856692704, -856692704, System.identityHashCode(this));
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID, android.os.Parcelable
    public int describeContents() {
        int i11 = AuthenticationRequestParameters;
        int i12 = (((((i11 ^ 99) | (i11 & 99)) << 1) - (~(-(((~i11) & 99) | (i11 & (-100)))))) - 1) % 128;
        getSDKAppID = i12;
        AuthenticationRequestParameters = (((i12 ^ 68) + ((i12 & 68) << 1)) - 1) % 128;
        return 0;
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public boolean equals(Object obj) {
        int i11 = getSDKAppID;
        int i12 = i11 & 31;
        int i13 = -(-((i11 ^ 31) | i12));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        AuthenticationRequestParameters = i15;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            System.identityHashCode(this);
            System.identityHashCode(this);
            int i16 = AuthenticationRequestParameters;
            int i17 = ((i16 ^ 63) | (i16 & 63)) << 1;
            int i18 = -(((~i16) & 63) | (i16 & (-64)));
            getSDKAppID = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
            return true;
        }
        if (obj != null) {
            int i19 = (((i15 ^ 5) | (i15 & 5)) << 1) - (((~i15) & 5) | (i15 & (-6)));
            getSDKAppID = i19 % 128;
            if (i19 % 2 == 0) {
                obj.getClass();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                if (super.equals(obj)) {
                    boolean zEquals = Objects.equals(this.getSDKReferenceNumber, ((ChallengeResultError) obj).getSDKReferenceNumber);
                    int i21 = AuthenticationRequestParameters;
                    int i22 = ((i21 ^ 56) + ((i21 & 56) << 1)) - 1;
                    getSDKAppID = i22 % 128;
                    if (i22 % 2 != 0) {
                        return zEquals;
                    }
                    throw null;
                }
                int i23 = AuthenticationRequestParameters;
                int i24 = i23 & 17;
                int i25 = -(-((i23 ^ 17) | i24));
                int i26 = ((i24 ^ i25) + ((i25 & i24) << 1)) % 128;
                getSDKAppID = i26;
                AuthenticationRequestParameters = ((((i26 | 106) << 1) - (i26 ^ 106)) - 1) % 128;
                return false;
            }
        }
        int i27 = getSDKAppID;
        int i28 = i27 & 11;
        int i29 = (i27 | 11) & (~i28);
        int i31 = i28 << 1;
        AuthenticationRequestParameters = ((i29 ^ i31) + ((i29 & i31) << 1)) % 128;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045 A[PHI: r2
      0x0045: PHI (r2v17 int) = (r2v0 int), (r2v19 int) binds: [B:8:0x0034, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r2
      0x0036: PHI (r2v1 int) = (r2v0 int), (r2v19 int) binds: [B:8:0x0034, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i11 = getSDKAppID;
        int i12 = (i11 ^ 58) + ((i11 & 58) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 != 0) {
            int iHashCode3 = super.hashCode();
            int i14 = iHashCode3 & 66;
            int i15 = -(-((iHashCode3 ^ 66) | i14));
            iHashCode = (i14 ^ i15) + ((i15 & i14) << 1);
            if (this.getSDKReferenceNumber != null) {
                iHashCode2 = this.getSDKReferenceNumber.hashCode();
                getSDKAppID = (AuthenticationRequestParameters + 105) % 128;
            } else {
                int i16 = getSDKAppID;
                int i17 = i16 & 37;
                int i18 = (i16 ^ 37) | i17;
                AuthenticationRequestParameters = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
                iHashCode2 = 0;
            }
        } else {
            iHashCode = super.hashCode() * 31;
            if (this.getSDKReferenceNumber != null) {
                iHashCode2 = this.getSDKReferenceNumber.hashCode();
                getSDKAppID = (AuthenticationRequestParameters + 105) % 128;
            } else {
                int i19 = getSDKAppID;
                int i110 = i19 & 37;
                int i111 = (i19 ^ 37) | i110;
                AuthenticationRequestParameters = ((i110 ^ i111) + ((i111 & i110) << 1)) % 128;
                iHashCode2 = 0;
            }
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = iHashCode2 * (-167);
        int i22 = iHashCode * (-167);
        int i23 = i21 & i22;
        int i24 = ((i21 ^ i22) | i23) << 1;
        int i25 = -((i21 | i22) & (~i23));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        int i27 = ~iHashCode2;
        int i28 = ~iHashCode;
        int i29 = i27 & i28;
        int i31 = (~i29) & (i27 | i28);
        int i32 = ~((i29 & i31) | (i31 ^ i29));
        int i33 = ~iHashCode;
        int i34 = ~iIdentityHashCode;
        int i35 = ~iIdentityHashCode;
        int i36 = i34 & (i35 | iIdentityHashCode);
        int i37 = i33 & i36;
        int i38 = (i36 | i33) & (~i37);
        int i39 = (i38 & i37) | (i38 ^ i37);
        int i41 = (i39 | (~i39)) & (~i39);
        int i42 = ((i32 & i41) | ((~i41) & i32) | ((~i32) & i41)) * 168;
        int i43 = i26 ^ i42;
        int i44 = ((((i26 & i42) | i43) << 1) - (~(-i43))) - 1;
        int i45 = (i27 ^ i33) | (i33 & i27);
        int i46 = (i45 & i35) | ((~i45) & iIdentityHashCode);
        int i47 = i45 & iIdentityHashCode;
        int i48 = -(~((~((i47 & i46) | (i46 ^ i47))) * 168));
        int i49 = ((i44 ^ i48) + ((i44 & i48) << 1)) - 1;
        int i51 = ~iHashCode2;
        int i52 = ~iIdentityHashCode;
        int i53 = (i52 & i51) | ((~i52) & i51) | ((~i51) & i52);
        int i54 = (i53 | (~i53)) & (~i53);
        int i55 = (i27 | iHashCode2) & i51;
        int i56 = i55 & iHashCode;
        int i57 = (iHashCode | i55) & (~i56);
        int i58 = (~((i57 & i56) | (i57 ^ i56))) | i54;
        int i59 = i28 ^ iHashCode2;
        int i61 = iHashCode2 & i28;
        int i62 = (i61 & i59) | (i59 ^ i61);
        int i63 = (i62 & iIdentityHashCode) | (i62 ^ iIdentityHashCode);
        int i64 = (i63 | (~i63)) & (~i63);
        int i65 = i58 ^ i64;
        int i66 = i64 & i58;
        int i67 = ((i66 & i65) | (i65 ^ i66)) * 168;
        int i68 = ((((i49 ^ i67) | (i49 & i67)) << 1) - (~(-((i67 & (~i49)) | ((~i67) & i49))))) - 1;
        int i69 = AuthenticationRequestParameters;
        getSDKAppID = (((i69 | 17) << 1) - (i69 ^ 17)) % 128;
        return i68;
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = AuthenticationRequestParameters;
        int i13 = i12 & 119;
        int i14 = (((i12 ^ 119) | i13) << 1) - ((i12 | 119) & (~i13));
        getSDKAppID = i14 % 128;
        if (i14 % 2 == 0) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.getSDKReferenceNumber);
            throw null;
        }
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.getSDKReferenceNumber);
        int i15 = getSDKAppID;
        AuthenticationRequestParameters = ((i15 ^ 47) + ((i15 & 47) << 1)) % 128;
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public void getSDKTransactionID() {
        int i11 = getSDKAppID;
        int i12 = (i11 & 25) + (i11 | 25);
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 != 0) {
            super.getSDKTransactionID();
            this.getSDKReferenceNumber = null;
            throw null;
        }
        super.getSDKTransactionID();
        this.getSDKReferenceNumber = null;
        int i13 = getSDKAppID;
        int i14 = ((i13 ^ 82) + ((i13 & 82) << 1)) - 1;
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 18 / 0;
        }
    }

    protected ChallengeResultError(Parcel parcel) {
        super(parcel);
        this.getSDKReferenceNumber = parcel.readString();
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        ChallengeResultError challengeResultError = (ChallengeResultError) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 & 123) + (i11 | 123);
        getSDKAppID = i12 % 128;
        int i13 = i12 % 2;
        String str = challengeResultError.getSDKReferenceNumber;
        if (i13 == 0) {
            throw null;
        }
        int i14 = i11 & 15;
        int i15 = (i11 ^ 15) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        getSDKAppID = i16 % 128;
        if (i16 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
