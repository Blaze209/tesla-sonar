package atd.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultKt extends ChallengeResultError implements Parcelable {
    private static int AuthenticationRequestParameters = 0;
    public static final Parcelable.Creator<ChallengeResultKt> CREATOR = new Parcelable.Creator<ChallengeResultKt>() { // from class: atd.e.ChallengeResultKt.1
        private static int getDeviceData = 0;
        private static int getSDKTransactionID = 1;

        public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = i14 | i15;
            int i17 = (i11 * (-496)) + (i12 * (-496)) + ((~i16) * DownloaderService.STATUS_TOO_MANY_REDIRECTS);
            int i18 = ~(i16 | i13);
            int i19 = ~i13;
            int i21 = i17 + ((i18 | (~(i15 | i19 | i11))) * DownloaderService.STATUS_TOO_MANY_REDIRECTS) + (((~(i11 | i15 | i13)) | (~(i12 | i14)) | (~(i14 | i19))) * DownloaderService.STATUS_TOO_MANY_REDIRECTS);
            if (i21 == 1) {
                return getDeviceData(objArr);
            }
            if (i21 == 2) {
                Parcel parcel = (Parcel) objArr[1];
                int i22 = getDeviceData;
                getSDKTransactionID = ((((i22 ^ 51) | (i22 & 51)) << 1) - (((~i22) & 51) | (i22 & (-52)))) % 128;
                ChallengeResultKt challengeResultKt = (ChallengeResultKt) getDeviceData(new Object[]{parcel}, 737339677, -737339674, (int) System.currentTimeMillis());
                int i23 = getDeviceData;
                getSDKTransactionID = (((i23 & 16) + (i23 | 16)) - 1) % 128;
                return challengeResultKt;
            }
            if (i21 == 3) {
                ChallengeResultKt challengeResultKt2 = new ChallengeResultKt((Parcel) objArr[0]);
                int i24 = getSDKTransactionID;
                int i25 = (i24 | 9) << 1;
                int i26 = -(((~i24) & 9) | (i24 & (-10)));
                getDeviceData = ((i25 & i26) + (i26 | i25)) % 128;
                return challengeResultKt2;
            }
            int iIntValue = ((Number) objArr[1]).intValue();
            int i27 = getSDKTransactionID;
            getDeviceData = (((i27 & 45) - (~(-(-(i27 | 45))))) - 1) % 128;
            ChallengeResultKt[] challengeResultKtArr = (ChallengeResultKt[]) getDeviceData(new Object[]{Integer.valueOf(iIntValue)}, -1259030556, 1259030557, iIntValue);
            int i28 = getSDKTransactionID;
            int i29 = i28 & 77;
            int i31 = i28 | 77;
            getDeviceData = ((i29 ^ i31) + ((i31 & i29) << 1)) % 128;
            return challengeResultKtArr;
        }

        private static ChallengeResultKt[] getSDKAppID(int i11) {
            return (ChallengeResultKt[]) getDeviceData(new Object[]{Integer.valueOf(i11)}, -1259030556, 1259030557, i11);
        }

        private static ChallengeResultKt r_(Parcel parcel) {
            return (ChallengeResultKt) getDeviceData(new Object[]{parcel}, 737339677, -737339674, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultKt, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultKt createFromParcel(Parcel parcel) {
            return getDeviceData(new Object[]{this, parcel}, 559934527, -559934525, System.identityHashCode(this));
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultKt[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultKt[] newArray(int i11) {
            return (Object[]) getDeviceData(new Object[]{this, Integer.valueOf(i11)}, -485544965, 485544965, i11);
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i11 = getSDKTransactionID;
            int i12 = i11 & 33;
            int i13 = -(-((i11 ^ 33) | i12));
            int i14 = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
            getDeviceData = i14;
            ChallengeResultKt[] challengeResultKtArr = new ChallengeResultKt[iIntValue];
            int i15 = ((i14 & (-32)) | ((~i14) & 31)) + ((i14 & 31) << 1);
            getSDKTransactionID = i15 % 128;
            if (i15 % 2 != 0) {
                return challengeResultKtArr;
            }
            throw null;
        }
    };
    private static int getSDKAppID = 1;

    static {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 1;
        int i13 = ((i11 | 1) & (~i12)) + (i12 << 1);
        getSDKAppID = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 96 / 0;
        }
    }

    ChallengeResultKt(JsonObject jsonObject) {
        super(jsonObject);
    }

    protected ChallengeResultKt(Parcel parcel) {
        super(parcel);
    }
}
