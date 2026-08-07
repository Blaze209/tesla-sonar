package atd.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKEphemeralPublicKey extends getSDKAppID {
    private static int BuildConfig = 1;
    private static int getSDKTransactionID;
    public static final getSDKEphemeralPublicKey getSDKAppID = new getSDKEphemeralPublicKey();
    private static final Executor getDeviceData = Executors.newFixedThreadPool(2);

    static {
        int i11 = getSDKTransactionID + 120;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        BuildConfig = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private getSDKEphemeralPublicKey() {
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        final getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        final WeakReference weakReference = (WeakReference) objArr[1];
        final String str = (String) objArr[2];
        int i11 = getSDKTransactionID;
        int i12 = i11 & 3;
        int i13 = i12 + ((i11 ^ 3) | i12);
        BuildConfig = i13 % 128;
        try {
            if (i13 % 2 == 0) {
                ((ImageView) weakReference.get()).setTag(str);
                int i14 = 39 / 0;
            } else {
                ((ImageView) weakReference.get()).setTag(str);
            }
            getSDKTransactionID = (BuildConfig + 23) % 128;
            getDeviceData.execute(new Runnable() { // from class: atd.d.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14999a.getSDKTransactionID(str, weakReference);
                }
            });
            int i15 = getSDKTransactionID;
            int i16 = i15 & 95;
            int i17 = (((i15 ^ 95) | i16) << 1) - ((i15 | 95) & (~i16));
            BuildConfig = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 88 / 0;
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    private void f_(ImageView imageView, String... strArr) {
        getSDKReferenceNumber(new Object[]{this, imageView, strArr}, 1981051964, -1981051964, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g_(ImageView imageView, Bitmap bitmap) {
        getSDKReferenceNumber(new Object[]{imageView, bitmap}, -2054793041, 2054793042, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        String str = (String) objArr[1];
        WeakReference weakReference = (WeakReference) objArr[2];
        try {
            ChallengeResultCompleted challengeResultCompletedAuthenticationRequestParameters = getsdkephemeralpublickey.AuthenticationRequestParameters(new getTransactionStatus.getSDKReferenceNumber().getSDKReferenceNumber(str).getSDKAppID().getSDKReferenceNumber());
            byte[] bArr = (byte[]) ChallengeResultCompleted.getDeviceData(new Object[]{challengeResultCompletedAuthenticationRequestParameters}, 467212410, -467212410, System.identityHashCode(challengeResultCompletedAuthenticationRequestParameters));
            final ImageView imageView = (ImageView) weakReference.get();
            if (imageView != null) {
                int i11 = getSDKTransactionID;
                int i12 = (i11 & 56) + (i11 | 56);
                BuildConfig = ((i12 ^ (-1)) + (i12 << 1)) % 128;
                if (imageView.getTag().equals(str)) {
                    int i13 = getSDKTransactionID;
                    BuildConfig = (((i13 ^ 70) + ((i13 & 70) << 1)) - 1) % 128;
                    final Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    imageView.post(new Runnable() { // from class: atd.d.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            getSDKEphemeralPublicKey.g_(imageView, bitmapDecodeByteArray);
                        }
                    });
                    getSDKTransactionID = (BuildConfig + 41) % 128;
                }
            }
            int i14 = getSDKTransactionID;
            int i15 = ((i14 & 38) + (i14 | 38)) - 1;
            BuildConfig = i15 % 128;
            if (i15 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        ImageView imageView = (ImageView) objArr[1];
        atd.e.ChallengeResultCancelled challengeResultCancelled = (atd.e.ChallengeResultCancelled) objArr[2];
        int i11 = BuildConfig + 56;
        int i12 = ((i11 ^ (-1)) + (i11 << 1)) % 128;
        getSDKTransactionID = i12;
        if (imageView != null) {
            int i13 = i12 & 55;
            BuildConfig = ((((i12 | 55) & (~i13)) - (~(i13 << 1))) - 1) % 128;
            if (challengeResultCancelled != null) {
                int i14 = Resources.getSystem().getDisplayMetrics().densityDpi;
                if (i14 > 320) {
                    int i15 = getSDKTransactionID;
                    int i16 = ((i15 ^ 46) + ((i15 & 46) << 1)) - 1;
                    BuildConfig = i16 % 128;
                    if (i16 % 2 == 0) {
                        String[] strArr = new String[5];
                        strArr[1] = challengeResultCancelled.getDeviceData();
                        strArr[1] = challengeResultCancelled.getSDKTransactionID();
                        strArr[3] = challengeResultCancelled.AuthenticationRequestParameters();
                        getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, imageView, strArr}, 1981051964, -1981051964, System.identityHashCode(getsdkephemeralpublickey));
                    } else {
                        getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, imageView, new String[]{challengeResultCancelled.getDeviceData(), challengeResultCancelled.getSDKTransactionID(), challengeResultCancelled.AuthenticationRequestParameters()}}, 1981051964, -1981051964, System.identityHashCode(getsdkephemeralpublickey));
                    }
                    int i17 = BuildConfig;
                    int i18 = (i17 ^ 51) + ((i17 & 51) << 1);
                    getSDKTransactionID = i18 % 128;
                    if (i18 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                if (i14 <= 240) {
                    getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, imageView, new String[]{challengeResultCancelled.AuthenticationRequestParameters(), challengeResultCancelled.getSDKTransactionID(), challengeResultCancelled.getDeviceData()}}, 1981051964, -1981051964, System.identityHashCode(getsdkephemeralpublickey));
                    int i19 = BuildConfig;
                    int i21 = i19 & 101;
                    int i22 = (i21 - (~(-(-((i19 ^ 101) | i21))))) - 1;
                    getSDKTransactionID = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 92 / 0;
                    }
                    return null;
                }
                int i24 = BuildConfig + 67;
                getSDKTransactionID = i24 % 128;
                if (i24 % 2 != 0) {
                    String[] strArr2 = new String[3];
                    strArr2[0] = challengeResultCancelled.getSDKTransactionID();
                    strArr2[0] = challengeResultCancelled.AuthenticationRequestParameters();
                    strArr2[4] = challengeResultCancelled.getDeviceData();
                    getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, imageView, strArr2}, 1981051964, -1981051964, System.identityHashCode(getsdkephemeralpublickey));
                } else {
                    getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, imageView, new String[]{challengeResultCancelled.getSDKTransactionID(), challengeResultCancelled.AuthenticationRequestParameters(), challengeResultCancelled.getDeviceData()}}, 1981051964, -1981051964, System.identityHashCode(getsdkephemeralpublickey));
                }
                return null;
            }
        }
        int i25 = BuildConfig;
        getSDKTransactionID = (((i25 | 1) << 1) - (i25 ^ 1)) % 128;
        return null;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        switch ((i11 * (-575)) + (i12 * (-575)) + (((~(i15 | i13)) | i16) * 576) + (((~(i11 | (~i13) | i15)) | (~(i12 | i14))) * 576) + (i16 * 576)) {
            case 1:
                ImageView imageView = (ImageView) objArr[0];
                Bitmap bitmap = (Bitmap) objArr[1];
                int i17 = getSDKTransactionID;
                int i18 = i17 & 19;
                int i19 = (i17 ^ 19) | i18;
                BuildConfig = ((i18 & i19) + (i19 | i18)) % 128;
                imageView.setImageBitmap(bitmap);
                int i21 = getSDKTransactionID;
                BuildConfig = ((((i21 & (-44)) | ((~i21) & 43)) - (~((i21 & 43) << 1))) - 1) % 128;
                return null;
            case 2:
                return getSDKReferenceNumber(objArr);
            case 3:
                int i22 = getSDKTransactionID;
                int i23 = ((i22 | 86) << 1) - (i22 ^ 86);
                int i24 = ((i23 ^ (-1)) + (i23 << 1)) % 128;
                BuildConfig = i24;
                int i25 = getSDKAppID.AuthenticationRequestParameters;
                int i26 = i24 | 51;
                getSDKTransactionID = (((i26 << 1) - (~(-((~(i24 & 51)) & i26)))) - 1) % 128;
                return Integer.valueOf(i25);
            case 4:
                return AuthenticationRequestParameters(objArr);
            case 5:
                return getDeviceData(objArr);
            case 6:
                return getSDKAppID(objArr);
            default:
                return getSDKTransactionID(objArr);
        }
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        int i11 = 0;
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        ImageView imageView = (ImageView) objArr[1];
        String[] strArr = (String[]) objArr[2];
        int i12 = getSDKTransactionID;
        BuildConfig = ((i12 & 33) + (i12 | 33)) % 128;
        int length = strArr.length;
        int i13 = i12 & 117;
        int i14 = (i12 | 117) & (~i13);
        int i15 = -(-(i13 << 1));
        BuildConfig = (((i14 | i15) << 1) - (i14 ^ i15)) % 128;
        while (i11 < 3) {
            int i16 = getSDKTransactionID;
            int i17 = i16 & 81;
            int i18 = i17 + ((i16 ^ 81) | i17);
            int i19 = i18 % 128;
            BuildConfig = i19;
            if (i18 % 2 == 0) {
                String str = strArr[i11];
                throw null;
            }
            String str2 = strArr[i11];
            if (str2 != null) {
                getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, new WeakReference(imageView), str2}, 1787387227, -1787387223, System.identityHashCode(getsdkephemeralpublickey));
                int i21 = BuildConfig;
                int i22 = i21 & 47;
                getSDKTransactionID = ((i22 - (~((i21 ^ 47) | i22))) - 1) % 128;
                return null;
            }
            int i23 = (i11 & 122) | ((~i11) & (-123));
            int i24 = -(-((i11 & (-123)) << 1));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = ((i25 ^ 124) | (i25 & 124)) << 1;
            int i27 = -((i25 & (-125)) | ((~i25) & 124));
            i11 = (i26 | i27) + (i26 & i27);
            int i28 = i19 & 73;
            int i29 = (i19 | 73) & (~i28);
            int i31 = i28 << 1;
            getSDKTransactionID = ((i29 & i31) + (i29 | i31)) % 128;
        }
        int i32 = getSDKTransactionID;
        int i33 = ((i32 ^ 57) | (i32 & 57)) << 1;
        int i34 = -(((~i32) & 57) | (i32 & (-58)));
        BuildConfig = (((i33 | i34) << 1) - (i34 ^ i33)) % 128;
        return null;
    }

    public final void e_(ImageView imageView, atd.e.ChallengeResultCancelled challengeResultCancelled) {
        getSDKReferenceNumber(new Object[]{this, imageView, challengeResultCancelled}, 2049407921, -2049407915, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        int i11 = (BuildConfig + 95) % 128;
        getSDKTransactionID = i11;
        int i12 = getSDKAppID.getSDKReferenceNumber;
        int i13 = (i11 & 19) + (i11 | 19);
        BuildConfig = i13 % 128;
        if (i13 % 2 != 0) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    @Override // atd.d.getSDKAppID
    protected final int getSDKReferenceNumber() {
        return ((Integer) getSDKReferenceNumber(new Object[]{this}, -1342369720, 1342369722, System.identityHashCode(this))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getSDKTransactionID(String str, WeakReference weakReference) {
        getSDKReferenceNumber(new Object[]{this, str, weakReference}, 1518396449, -1518396444, System.identityHashCode(this));
    }

    @Override // atd.d.getSDKAppID
    protected final int getDeviceData() {
        return ((Integer) getSDKReferenceNumber(new Object[]{this}, -1771625714, 1771625717, System.identityHashCode(this))).intValue();
    }

    private void getSDKAppID(WeakReference<ImageView> weakReference, String str) {
        getSDKReferenceNumber(new Object[]{this, weakReference, str}, 1787387227, -1787387223, System.identityHashCode(this));
    }
}
