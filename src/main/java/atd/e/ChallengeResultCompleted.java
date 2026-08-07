package atd.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCompleted implements Parcelable {
    private static int getSDKAppID = 0;
    private static int getSDKTransactionID = 1;
    private String AuthenticationRequestParameters;
    private String getDeviceData;
    public static final Parcelable.Creator<ChallengeResultCompleted> CREATOR = new Parcelable.Creator<ChallengeResultCompleted>() { // from class: atd.e.ChallengeResultCompleted.3
        private static int getSDKAppID = 0;
        private static int getSDKReferenceNumber = 1;

        public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
            int i14 = ~i12;
            int i15 = (i11 * (-129)) + (i12 * 131) + ((~((~i13) | i14 | i11)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            int i16 = i14 | i11;
            int i17 = i15 + ((~i16) * (-260)) + (((~((~i11) | i12)) | (~(i16 | i13))) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            if (i17 != 1) {
                if (i17 != 2) {
                    return i17 != 3 ? getSDKTransactionID(objArr) : getSDKReferenceNumber(objArr);
                }
                return getDeviceData(objArr);
            }
            int iIntValue = ((Number) objArr[0]).intValue();
            int i18 = getSDKAppID;
            int i19 = i18 & 11;
            int i21 = (~i19) & (i18 | 11);
            int i22 = i19 << 1;
            getSDKReferenceNumber = ((i21 & i22) + (i22 | i21)) % 128;
            ChallengeResultCompleted[] challengeResultCompletedArr = new ChallengeResultCompleted[iIntValue];
            getSDKReferenceNumber = (((i18 ^ 80) + ((i18 & 80) << 1)) - 1) % 128;
            return challengeResultCompletedArr;
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted((Parcel) objArr[0]);
            int i11 = getSDKReferenceNumber;
            int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
            getSDKAppID = i12 % 128;
            if (i12 % 2 == 0) {
                return challengeResultCompleted;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i11 = getSDKAppID + 8;
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 != 0) {
                return (ChallengeResultCompleted[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(iIntValue)}, 693097211, -693097210, iIntValue);
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            Parcel parcel = (Parcel) objArr[1];
            int i11 = getSDKReferenceNumber;
            int i12 = i11 & 31;
            int i13 = (i11 | 31) & (~i12);
            int i14 = -(-(i12 << 1));
            getSDKAppID = ((i13 ^ i14) + ((i13 & i14) << 1)) % 128;
            ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) AuthenticationRequestParameters(new Object[]{parcel}, 283854187, -283854185, (int) System.currentTimeMillis());
            int i15 = getSDKAppID;
            int i16 = (i15 & 23) + (i15 | 23);
            getSDKReferenceNumber = i16 % 128;
            if (i16 % 2 != 0) {
                return challengeResultCompleted;
            }
            throw null;
        }

        private static ChallengeResultCompleted q_(Parcel parcel) {
            return (ChallengeResultCompleted) AuthenticationRequestParameters(new Object[]{parcel}, 283854187, -283854185, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultCompleted, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultCompleted createFromParcel(Parcel parcel) {
            return AuthenticationRequestParameters(new Object[]{this, parcel}, 916261696, -916261696, System.identityHashCode(this));
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultCompleted[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultCompleted[] newArray(int i11) {
            return (Object[]) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, 1710219765, -1710219762, i11);
        }

        private static ChallengeResultCompleted[] getDeviceData(int i11) {
            return (ChallengeResultCompleted[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(i11)}, 693097211, -693097210, i11);
        }
    };
    private static final atd.am.getDeviceData getSDKReferenceNumber = atd.am.getDeviceData.CHALLENGE_SELECT_INFO;

    static {
        int i11 = getSDKTransactionID;
        getSDKAppID = (((i11 & (-116)) | ((~i11) & 115)) + ((i11 & 115) << 1)) % 128;
    }

    private ChallengeResultCompleted(JsonElement jsonElement) {
        JsonObject sDKReferenceNumber = atd.d.getMessageVersion.getSDKReferenceNumber(jsonElement, getSDKReferenceNumber).getSDKReferenceNumber();
        String next = sDKReferenceNumber.j().iterator().next();
        this.getDeviceData = next;
        this.AuthenticationRequestParameters = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{sDKReferenceNumber, next}, -1740739027, 1740739030, (int) System.currentTimeMillis())).getSDKReferenceNumber();
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-501)) + (i12 * 503);
        int i15 = ~i12;
        switch (i14 + (((~(i12 | i11)) | (~(i15 | i13))) * (-502)) + ((~((~i13) | i15 | i11)) * (-502)) + (((~((~i11) | i13)) | i15) * HttpStatusCode.BAD_GATEWAY_502)) {
            case 1:
                return getSDKTransactionID(objArr);
            case 2:
                return getSDKAppID(objArr);
            case 3:
                ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
                int i16 = getSDKAppID;
                getSDKTransactionID = ((i16 ^ 5) + ((i16 & 5) << 1)) % 128;
                String str = challengeResultCompleted.AuthenticationRequestParameters;
                getSDKTransactionID = (i16 + 81) % 128;
                return str;
            case 4:
                return getSDKReferenceNumber(objArr);
            case 5:
                return AuthenticationRequestParameters(objArr);
            case 6:
                return ChallengeResultCancelled(objArr);
            case 7:
                return getMessageVersion(objArr);
            default:
                return getDeviceData(objArr);
        }
    }

    private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = ((i11 & 43) + (i11 | 43)) % 128;
        getSDKAppID = i12;
        String str = challengeResultCompleted.getDeviceData;
        int i13 = ((i12 ^ 79) | (i12 & 79)) << 1;
        int i14 = -(((~i12) & 79) | (i12 & (-80)));
        int i15 = (i13 & i14) + (i13 | i14);
        getSDKTransactionID = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 54 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        JsonArray sDKReferenceNumber = atd.d.getMessageVersion.ChallengeResultCancelled((JsonObject) objArr[0], getSDKReferenceNumber).getSDKReferenceNumber();
        ArrayList arrayList = new ArrayList();
        int i11 = getSDKTransactionID;
        int i12 = i11 & 9;
        int i13 = -(-((i11 ^ 9) | i12));
        getSDKAppID = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        int i14 = 0;
        while (i14 < sDKReferenceNumber.e()) {
            arrayList.add(new ChallengeResultCompleted(sDKReferenceNumber.get(i14)));
            int i15 = i14 ^ 23;
            int i16 = ((((i14 & 23) | i15) << 1) - (~(-i15))) - 1;
            int i17 = i16 | (-22);
            i14 = (i17 << 1) - ((~(i16 & (-22))) & i17);
            int i18 = getSDKTransactionID;
            getSDKAppID = ((i18 ^ 83) + ((i18 & 83) << 1)) % 128;
        }
        int i19 = getSDKAppID;
        int i21 = ((i19 ^ 79) - (~(-(-((i19 & 79) << 1))))) - 1;
        getSDKTransactionID = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 24 / 0;
        }
        return arrayList;
    }

    private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        Object obj = objArr[1];
        int i11 = getSDKTransactionID;
        int i12 = i11 ^ 89;
        int i13 = (i11 & 89) << 1;
        int i14 = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
        getSDKAppID = i14;
        if (challengeResultCompleted == obj) {
            getSDKTransactionID = ((-2) - ((((i14 | 44) << 1) - (i14 ^ 44)) ^ (-1))) % 128;
            return Boolean.TRUE;
        }
        if (obj != null) {
            int i15 = i11 & 101;
            int i16 = (i11 | 101) & (~i15);
            int i17 = i15 << 1;
            int i18 = (i16 & i17) + (i16 | i17);
            getSDKAppID = i18 % 128;
            if (i18 % 2 != 0) {
                challengeResultCompleted.getClass();
                obj.getClass();
                throw null;
            }
            if (challengeResultCompleted.getClass() == obj.getClass()) {
                ChallengeResultCompleted challengeResultCompleted2 = (ChallengeResultCompleted) obj;
                if (!Objects.equals(challengeResultCompleted.getDeviceData, challengeResultCompleted2.getDeviceData)) {
                    System.identityHashCode(challengeResultCompleted);
                    System.identityHashCode(challengeResultCompleted);
                    int i19 = getSDKAppID;
                    getSDKTransactionID = ((i19 ^ 111) + ((i19 & 111) << 1)) % 128;
                    return Boolean.FALSE;
                }
                boolean zEquals = Objects.equals(challengeResultCompleted.AuthenticationRequestParameters, challengeResultCompleted2.AuthenticationRequestParameters);
                int i21 = getSDKAppID;
                int i22 = i21 & 69;
                int i23 = ((i21 ^ 69) | i22) << 1;
                int i24 = -((i21 | 69) & (~i22));
                int i25 = (i23 & i24) + (i24 | i23);
                getSDKTransactionID = i25 % 128;
                if (i25 % 2 != 0) {
                    return Boolean.valueOf(zEquals);
                }
                throw null;
            }
        }
        int i26 = getSDKTransactionID;
        int i27 = i26 & 91;
        int i28 = -(-(i26 | 91));
        int i29 = (i27 & i28) + (i28 | i27);
        getSDKAppID = i29 % 128;
        if (i29 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        int i11 = getSDKAppID;
        int i12 = i11 & 43;
        int i13 = -(-((i11 ^ 43) | i12));
        int i14 = ((i12 & i13) + (i12 | i13)) % 128;
        getSDKTransactionID = i14;
        String str = challengeResultCompleted.getDeviceData;
        if (str != null) {
            int i15 = i14 & 57;
            getSDKAppID = ((((~i15) & (i14 | 57)) - (~(-(-(i15 << 1))))) - 1) % 128;
            iHashCode = str.hashCode();
            int i16 = getSDKTransactionID;
            getSDKAppID = ((((i16 | 22) << 1) - (i16 ^ 22)) - 1) % 128;
        } else {
            getSDKTransactionID = (((i11 | 55) << 1) - (i11 ^ 55)) % 128;
            iHashCode = 0;
        }
        int i17 = iHashCode * 31;
        String str2 = challengeResultCompleted.AuthenticationRequestParameters;
        if (str2 != null) {
            int i18 = getSDKAppID;
            int i19 = ((i18 | 80) << 1) - (i18 ^ 80);
            getSDKTransactionID = ((i19 ^ (-1)) + (i19 << 1)) % 128;
            iHashCode2 = str2.hashCode();
            int i21 = getSDKAppID;
            getSDKTransactionID = ((-2) - (((i21 & 76) + (i21 | 76)) ^ (-1))) % 128;
        } else {
            int i22 = getSDKAppID;
            getSDKTransactionID = (((i22 | 23) << 1) - (i22 ^ 23)) % 128;
            iHashCode2 = 0;
        }
        int i23 = -(~iHashCode2);
        int i24 = ((i17 ^ i23) + ((i23 & i17) << 1)) - 1;
        int i25 = getSDKTransactionID;
        int i26 = i25 & 17;
        int i27 = (((i25 ^ 17) | i26) << 1) - ((i25 | 17) & (~i26));
        getSDKAppID = i27 % 128;
        if (i27 % 2 == 0) {
            return Integer.valueOf(i24);
        }
        int i28 = 17 / 0;
        return Integer.valueOf(i24);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        int i11 = getSDKTransactionID;
        int i12 = ((i11 & 95) + (i11 | 95)) % 128;
        getSDKAppID = i12;
        int i13 = i12 & 73;
        int i14 = i12 | 73;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        getSDKTransactionID = i15 % 128;
        if (i15 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        ((Number) objArr[2]).intValue();
        int i11 = getSDKTransactionID;
        int i12 = ((i11 ^ 87) | (i11 & 87)) << 1;
        int i13 = -(((~i11) & 87) | (i11 & (-88)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        getSDKAppID = i14 % 128;
        if (i14 % 2 == 0) {
            parcel.writeString(challengeResultCompleted.getDeviceData);
            parcel.writeString(challengeResultCompleted.AuthenticationRequestParameters);
            return null;
        }
        parcel.writeString(challengeResultCompleted.getDeviceData);
        parcel.writeString(challengeResultCompleted.AuthenticationRequestParameters);
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return ((Integer) AuthenticationRequestParameters(new Object[]{this}, 459883079, -459883075, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) AuthenticationRequestParameters(new Object[]{this, obj}, 1159750101, -1159750094, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) AuthenticationRequestParameters(new Object[]{this}, -949031775, 949031777, System.identityHashCode(this))).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        AuthenticationRequestParameters(new Object[]{this, parcel, Integer.valueOf(i11)}, 380762533, -380762532, i11);
    }

    public final String getSDKReferenceNumber() {
        return (String) AuthenticationRequestParameters(new Object[]{this}, 1815332088, -1815332085, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        int i11 = getSDKAppID;
        int i12 = i11 ^ 85;
        int i13 = -(-((i11 & 85) << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        getSDKTransactionID = i14 % 128;
        if (i14 % 2 != 0) {
            challengeResultCompleted.getDeviceData = null;
            challengeResultCompleted.AuthenticationRequestParameters = null;
            int i15 = i11 & 51;
            int i16 = (i11 | 51) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            getSDKTransactionID = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }
        challengeResultCompleted.getDeviceData = null;
        challengeResultCompleted.AuthenticationRequestParameters = null;
        throw null;
    }

    protected ChallengeResultCompleted(Parcel parcel) {
        this.getDeviceData = parcel.readString();
        this.AuthenticationRequestParameters = parcel.readString();
    }

    public final String getDeviceData() {
        return (String) AuthenticationRequestParameters(new Object[]{this}, 1536326450, -1536326444, System.identityHashCode(this));
    }

    public final void getSDKAppID() {
        AuthenticationRequestParameters(new Object[]{this}, -432059654, 432059659, System.identityHashCode(this));
    }

    static List<ChallengeResultCompleted> AuthenticationRequestParameters(JsonObject jsonObject) {
        return (List) AuthenticationRequestParameters(new Object[]{jsonObject}, -1020260015, 1020260015, (int) System.currentTimeMillis());
    }
}
