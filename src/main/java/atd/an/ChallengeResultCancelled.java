package atd.an;

/* JADX INFO: loaded from: classes3.dex */
public class ChallengeResultCancelled {
    public float AuthenticationRequestParameters;
    public Object BuildConfig;
    public float ChallengeResult;
    public double ChallengeResultCancelled;
    private final int[] ChallengeResultCompleted;
    private int ChallengeResultError;
    private int ChallengeResultTimeout;
    private final Object[] ChallengeStatusReceiver;
    private final double[] completed;
    private final long[] getAdditionalDetails;
    public int getDeviceData;
    public double getMessageVersion;
    public int getSDKAppID;
    public Object getSDKEphemeralPublicKey;
    public long getSDKReferenceNumber;
    public long getSDKTransactionID;
    private final float[] getTransactionStatus;

    public ChallengeResultCancelled(Object obj, Object obj2) {
        this.ChallengeResultCompleted = new int[11];
        this.getAdditionalDetails = new long[11];
        this.getTransactionStatus = new float[11];
        this.completed = new double[11];
        Object[] objArr = new Object[11];
        this.ChallengeStatusReceiver = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        this.ChallengeResultError = 0;
        this.ChallengeResultTimeout = -1;
    }

    public int AuthenticationRequestParameters(int i11) {
        switch (i11) {
            case 1:
                Object[] objArr = this.ChallengeStatusReceiver;
                int i12 = this.ChallengeResultError;
                this.ChallengeResultError = i12 + 1;
                objArr[i12] = this.BuildConfig;
                return 0;
            case 2:
                int i13 = this.ChallengeResultError - this.getDeviceData;
                this.ChallengeResultError = i13;
                this.ChallengeResultTimeout = i13;
                return 0;
            case 3:
                Object[] objArr2 = this.ChallengeStatusReceiver;
                int i14 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i14 + 1;
                Object obj = objArr2[i14];
                objArr2[i14] = null;
                this.getSDKEphemeralPublicKey = obj;
                return 0;
            case 4:
                int[] iArr = this.ChallengeResultCompleted;
                int i15 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i15 + 1;
                this.getSDKAppID = iArr[i15];
                return 0;
            case 5:
                int[] iArr2 = this.ChallengeResultCompleted;
                int i16 = this.ChallengeResultError;
                this.ChallengeResultError = i16 + 1;
                iArr2[i16] = 0;
                return 0;
            case 6:
                Object[] objArr3 = this.ChallengeStatusReceiver;
                int i17 = this.ChallengeResultError;
                this.ChallengeResultError = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 7:
                int i18 = this.ChallengeResultError;
                int i19 = i18 - 1;
                this.ChallengeResultError = i19;
                Object[] objArr4 = this.ChallengeStatusReceiver;
                Object obj2 = objArr4[i19];
                objArr4[i19] = null;
                objArr4[9] = obj2;
                this.ChallengeResultError = i18;
                objArr4[i19] = objArr4[8];
                return 0;
            case 8:
                Object[] objArr5 = this.ChallengeStatusReceiver;
                int i21 = this.ChallengeResultError;
                this.ChallengeResultError = i21 + 1;
                objArr5[i21] = null;
                return 0;
            case 9:
                int i22 = this.ChallengeResultError - 1;
                this.ChallengeResultError = i22;
                Object[] objArr6 = this.ChallengeStatusReceiver;
                Object obj3 = objArr6[i22];
                objArr6[i22] = null;
                this.getSDKAppID = obj3 == null ? 0 : 1;
                return 0;
            case 10:
                Object[] objArr7 = this.ChallengeStatusReceiver;
                int i23 = this.ChallengeResultError;
                Object obj4 = objArr7[i23 - 1];
                objArr7[i23 - 1] = null;
                Object obj5 = objArr7[i23 - 2];
                objArr7[i23 - 2] = null;
                objArr7[i23 - 1] = obj5;
                objArr7[i23 - 2] = obj4;
                return 0;
            case 11:
                Object[] objArr8 = this.ChallengeStatusReceiver;
                int i24 = this.ChallengeResultError;
                Object obj6 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                this.getSDKEphemeralPublicKey = obj6;
                return 0;
            case 12:
                int i25 = this.ChallengeResultError - 1;
                this.ChallengeResultError = i25;
                this.ChallengeStatusReceiver[i25] = null;
                return 0;
            case 13:
                Object[] objArr9 = this.ChallengeStatusReceiver;
                int i26 = this.ChallengeResultError;
                int i27 = i26 + 1;
                this.ChallengeResultError = i27;
                objArr9[i26] = null;
                int[] iArr3 = this.ChallengeResultCompleted;
                this.ChallengeResultError = i26 + 2;
                iArr3[i27] = 127;
                return 0;
            case 14:
                int[] iArr4 = this.ChallengeResultCompleted;
                int i28 = this.ChallengeResultError;
                this.ChallengeResultError = i28 + 1;
                iArr4[i28] = this.getDeviceData;
                return 0;
            case 15:
                int i29 = this.ChallengeResultError;
                int i31 = i29 - 1;
                this.ChallengeResultError = i31;
                int[] iArr5 = this.ChallengeResultCompleted;
                iArr5[i29 - 2] = iArr5[i29 - 2] - iArr5[i31];
                Object[] objArr10 = this.ChallengeStatusReceiver;
                this.ChallengeResultError = i29;
                objArr10[i31] = null;
                return 0;
            case 16:
                int i32 = this.ChallengeResultError - 1;
                this.ChallengeResultError = i32;
                Object[] objArr11 = this.ChallengeStatusReceiver;
                Object obj7 = objArr11[i32];
                objArr11[i32] = null;
                objArr11[10] = obj7;
                return 0;
            case 17:
                Object[] objArr12 = this.ChallengeStatusReceiver;
                int i33 = this.ChallengeResultError;
                this.ChallengeResultError = i33 + 1;
                objArr12[i33] = objArr12[10];
                return 0;
            case 18:
                Object[] objArr13 = this.ChallengeStatusReceiver;
                int i34 = this.ChallengeResultError;
                this.ChallengeResultError = i34 + 1;
                objArr13[i34] = objArr13[9];
                return 0;
            case 19:
                int[] iArr6 = this.ChallengeResultCompleted;
                int i35 = this.ChallengeResultError;
                int i36 = i35 + 1;
                this.ChallengeResultError = i36;
                iArr6[i35] = 2;
                this.ChallengeResultError = i35 + 2;
                iArr6[i36] = 2;
                int i37 = i35 + 1;
                this.ChallengeResultError = i37;
                iArr6[i35] = iArr6[i35] % iArr6[i37];
                return 0;
            case 21:
                int[] iArr7 = this.ChallengeResultCompleted;
                int i38 = this.ChallengeResultError;
                this.ChallengeResultError = i38 + 1;
                iArr7[i38] = 41;
                this.ChallengeResultError = i38;
                iArr7[i38 - 1] = iArr7[i38 - 1] + iArr7[i38];
                this.ChallengeResultError = i38 + 1;
                iArr7[i38] = iArr7[i38 - 1];
            case 20:
                return 0;
            case 22:
                int[] iArr8 = this.ChallengeResultCompleted;
                int i39 = this.ChallengeResultError;
                this.ChallengeResultError = i39 + 1;
                iArr8[i39] = 128;
                this.ChallengeResultError = i39;
                iArr8[i39 - 1] = iArr8[i39 - 1] % iArr8[i39];
                return 0;
            case 23:
                int[] iArr9 = this.ChallengeResultCompleted;
                int i41 = this.ChallengeResultError;
                this.ChallengeResultError = i41 + 1;
                iArr9[i41] = 2;
                return 0;
            case 24:
                int i42 = this.ChallengeResultError;
                int i43 = i42 - 1;
                this.ChallengeResultError = i43;
                int[] iArr10 = this.ChallengeResultCompleted;
                iArr10[i42 - 2] = iArr10[i42 - 2] % iArr10[i43];
                return 0;
            case 25:
                int i44 = this.ChallengeResultError - 1;
                this.ChallengeResultError = i44;
                this.getSDKAppID = this.ChallengeResultCompleted[i44] == 0 ? 0 : 1;
                return 0;
            case 26:
                Object[] objArr14 = this.ChallengeStatusReceiver;
                int i45 = this.ChallengeResultError;
                this.ChallengeResultError = i45 + 1;
                objArr14[i45] = objArr14[i45 - 1];
                this.ChallengeResultError = i45;
                Object obj8 = objArr14[i45];
                objArr14[i45] = null;
                objArr14[9] = obj8;
                return 0;
            case 27:
                Object[] objArr15 = this.ChallengeStatusReceiver;
                int i46 = this.ChallengeResultError;
                this.ChallengeResultError = i46 + 1;
                objArr15[i46] = objArr15[8];
                return 0;
            case 28:
                int[] iArr11 = this.ChallengeResultCompleted;
                int i47 = this.ChallengeResultError;
                this.ChallengeResultError = i47 + 1;
                iArr11[i47] = 47;
                this.ChallengeResultError = i47;
                iArr11[i47 - 1] = iArr11[i47 - 1] + iArr11[i47];
                return 0;
            case 29:
                int[] iArr12 = this.ChallengeResultCompleted;
                int i48 = this.ChallengeResultError;
                this.ChallengeResultError = i48 + 1;
                iArr12[i48] = iArr12[i48 - 1];
                return 0;
            case 30:
                int[] iArr13 = this.ChallengeResultCompleted;
                int i49 = this.ChallengeResultError;
                this.ChallengeResultError = i49 + 1;
                iArr13[i49] = 128;
                return 0;
            case 31:
                int i51 = this.ChallengeResultError - 1;
                this.ChallengeResultError = i51;
                this.getSDKAppID = this.ChallengeResultCompleted[i51] != 0 ? 0 : 1;
                return 0;
            case 32:
                int[] iArr14 = this.ChallengeResultCompleted;
                int i52 = this.ChallengeResultError - 1;
                this.ChallengeResultError = i52;
                this.getSDKAppID = iArr14[i52];
                return 0;
            case 33:
                int[] iArr15 = this.ChallengeResultCompleted;
                int i53 = this.ChallengeResultError;
                this.ChallengeResultError = i53 + 1;
                iArr15[i53] = 1;
                return 0;
            case 34:
                for (int i54 = this.ChallengeResultError - 1; i54 >= 0; i54--) {
                    this.ChallengeStatusReceiver[i54] = null;
                }
                Object[] objArr16 = this.ChallengeStatusReceiver;
                this.ChallengeResultError = 1;
                objArr16[0] = this.BuildConfig;
                return 0;
            case 35:
                Object[] objArr17 = this.ChallengeStatusReceiver;
                int i55 = this.ChallengeResultError;
                this.ChallengeResultError = i55 + 1;
                objArr17[i55] = objArr17[i55 - 1];
                this.ChallengeResultError = i55;
                Object obj9 = objArr17[i55];
                objArr17[i55] = null;
                objArr17[10] = obj9;
                return 0;
            case 36:
                Object[] objArr18 = this.ChallengeStatusReceiver;
                int i56 = this.ChallengeResultError;
                int i57 = i56 + 1;
                this.ChallengeResultError = i57;
                objArr18[i56] = objArr18[10];
                int i58 = i56 + 2;
                this.ChallengeResultError = i58;
                objArr18[i57] = objArr18[8];
                int[] iArr16 = this.ChallengeResultCompleted;
                this.ChallengeResultError = i56 + 3;
                iArr16[i58] = 1;
                return 0;
            case 37:
                int i59 = this.ChallengeResultError;
                int i61 = i59 - 1;
                this.ChallengeResultError = i61;
                Object[] objArr19 = this.ChallengeStatusReceiver;
                objArr19[i61] = null;
                this.ChallengeResultError = i59;
                objArr19[i61] = objArr19[10];
                return 0;
            case 38:
                int[] iArr17 = this.ChallengeResultCompleted;
                int i62 = this.ChallengeResultError;
                int i63 = i62 + 1;
                this.ChallengeResultError = i63;
                iArr17[i62] = 2;
                this.ChallengeResultError = i62 + 2;
                iArr17[i63] = 2;
                return 0;
            case 39:
                int[] iArr18 = this.ChallengeResultCompleted;
                int i64 = this.ChallengeResultError;
                this.ChallengeResultError = i64 + 1;
                iArr18[i64] = 91;
                return 0;
            case 40:
                int i65 = this.ChallengeResultError;
                int i66 = i65 - 1;
                this.ChallengeResultError = i66;
                int[] iArr19 = this.ChallengeResultCompleted;
                iArr19[i65 - 2] = iArr19[i65 - 2] + iArr19[i66];
                return 0;
            case 41:
                int[] iArr20 = this.ChallengeResultCompleted;
                int i67 = this.ChallengeResultError;
                int i68 = i67 + 1;
                this.ChallengeResultError = i68;
                iArr20[i67] = iArr20[i67 - 1];
                this.ChallengeResultError = i67 + 2;
                iArr20[i68] = 128;
                int i69 = i67 + 1;
                this.ChallengeResultError = i69;
                iArr20[i67] = iArr20[i67] % iArr20[i69];
                return 0;
            case 42:
                int[] iArr21 = this.ChallengeResultCompleted;
                int i71 = this.ChallengeResultError;
                this.ChallengeResultError = i71 + 1;
                iArr21[i71] = 19;
                return 0;
            case 43:
                int i72 = this.ChallengeResultError;
                int i73 = i72 - 1;
                this.ChallengeResultError = i73;
                int[] iArr22 = this.ChallengeResultCompleted;
                iArr22[i72 - 2] = iArr22[i72 - 2] + iArr22[i73];
                this.ChallengeResultError = i72;
                iArr22[i73] = iArr22[i72 - 2];
                this.ChallengeResultError = i72 + 1;
                iArr22[i72] = 128;
                return 0;
            case 44:
                int i74 = this.ChallengeResultError;
                int i75 = i74 - 1;
                this.ChallengeResultError = i75;
                Object[] objArr20 = this.ChallengeStatusReceiver;
                Object obj10 = objArr20[i75];
                objArr20[i75] = null;
                objArr20[10] = obj10;
                this.ChallengeResultError = i74;
                objArr20[i75] = objArr20[9];
                return 0;
            case 45:
                Object[] objArr21 = this.ChallengeStatusReceiver;
                int i76 = this.ChallengeResultError;
                int i77 = i76 + 1;
                this.ChallengeResultError = i77;
                objArr21[i76] = objArr21[10];
                int i78 = i76 + 2;
                this.ChallengeResultError = i78;
                objArr21[i77] = objArr21[8];
                int[] iArr23 = this.ChallengeResultCompleted;
                this.ChallengeResultError = i76 + 3;
                iArr23[i78] = 0;
                return 0;
            default:
                return i11;
        }
    }

    public ChallengeResultCancelled(Object obj) {
        this.ChallengeResultCompleted = new int[11];
        this.getAdditionalDetails = new long[11];
        this.getTransactionStatus = new float[11];
        this.completed = new double[11];
        Object[] objArr = new Object[11];
        this.ChallengeStatusReceiver = objArr;
        objArr[8] = obj;
        this.ChallengeResultError = 0;
        this.ChallengeResultTimeout = -1;
    }
}
