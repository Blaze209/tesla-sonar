package atd.e;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult extends getSDKTransactionID {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    public static final Parcelable.Creator<ChallengeResult> CREATOR;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private String AuthenticationRequestParameters;
    private String getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        ChallengeResultCancelled();
        CREATOR = new Parcelable.Creator<ChallengeResult>() { // from class: atd.e.ChallengeResult.3
            private static int getDeviceData = 1;
            private static int getSDKReferenceNumber;

            public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
                int i14 = ~i11;
                int i15 = ~i12;
                int i16 = (i11 * (-103)) + (i12 * (-103)) + (((~(i14 | i15)) | (~(i15 | i13))) * 104) + ((~(i12 | (~i13) | i11)) * (-104)) + ((i11 | i13) * 104);
                if (i16 != 1) {
                    if (i16 != 2) {
                        return i16 != 3 ? getSDKReferenceNumber(objArr) : getDeviceData(objArr);
                    }
                    return getSDKTransactionID(objArr);
                }
                ChallengeResult challengeResult = new ChallengeResult((Parcel) objArr[0]);
                int i17 = getDeviceData;
                int i18 = i17 & 111;
                int i19 = -(-((i17 ^ 111) | i18));
                getSDKReferenceNumber = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
                return challengeResult;
            }

            private static /* synthetic */ Object getDeviceData(Object[] objArr) {
                ChallengeResult[] challengeResultArr = new ChallengeResult[((Number) objArr[0]).intValue()];
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 109;
                int i13 = ((i11 ^ 109) | i12) << 1;
                int i14 = -((i11 | 109) & (~i12));
                int i15 = (i13 & i14) + (i14 | i13);
                getDeviceData = i15 % 128;
                if (i15 % 2 != 0) {
                    return challengeResultArr;
                }
                throw null;
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 3;
                int i13 = (i11 ^ 3) | i12;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getDeviceData = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                ChallengeResult[] challengeResultArr = (ChallengeResult[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(iIntValue)}, -1657750540, 1657750543, iIntValue);
                int i15 = getDeviceData;
                int i16 = (i15 | 57) << 1;
                int i17 = -(((~i15) & 57) | (i15 & (-58)));
                getSDKReferenceNumber = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                return challengeResultArr;
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                ChallengeResult challengeResult;
                Parcel parcel = (Parcel) objArr[1];
                int i11 = getDeviceData;
                int i12 = i11 & 43;
                int i13 = -(-((i11 ^ 43) | i12));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getSDKReferenceNumber = i14 % 128;
                Object[] objArr2 = {parcel};
                if (i14 % 2 != 0) {
                    challengeResult = (ChallengeResult) AuthenticationRequestParameters(objArr2, -49107945, 49107946, (int) System.currentTimeMillis());
                    int i15 = 20 / 0;
                } else {
                    challengeResult = (ChallengeResult) AuthenticationRequestParameters(objArr2, -49107945, 49107946, (int) System.currentTimeMillis());
                }
                int i16 = getSDKReferenceNumber;
                int i17 = i16 & 61;
                int i18 = (i16 | 61) & (~i17);
                int i19 = -(-(i17 << 1));
                int i21 = (i18 & i19) + (i18 | i19);
                getDeviceData = i21 % 128;
                if (i21 % 2 != 0) {
                    return challengeResult;
                }
                throw null;
            }

            private static ChallengeResult i_(Parcel parcel) {
                return (ChallengeResult) AuthenticationRequestParameters(new Object[]{parcel}, -49107945, 49107946, (int) System.currentTimeMillis());
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResult, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResult createFromParcel(Parcel parcel) {
                return AuthenticationRequestParameters(new Object[]{this, parcel}, 18084326, -18084324, System.identityHashCode(this));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResult[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResult[] newArray(int i11) {
                return (Object[]) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, 1474366804, -1474366804, i11);
            }

            private static ChallengeResult[] getDeviceData(int i11) {
                return (ChallengeResult[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(i11)}, -1657750540, 1657750543, i11);
            }
        };
        int i11 = ChallengeResultCancelled + 15;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    ChallengeResult(JsonObject jsonObject) throws Throwable {
        super(jsonObject);
        atd.am.getDeviceData getdevicedata = atd.am.getDeviceData.ACS_HTML;
        String sDKReferenceNumber = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, getdevicedata).getSDKReferenceNumber();
        this.getSDKAppID = sDKReferenceNumber;
        if (!atd.json.getDeviceData.getDeviceData(sDKReferenceNumber)) {
            Object[] objArr = new Object[1];
            c("뭘홏昍诼㲕汊튻\ue138옹\ud8eb鯤̜䌀\ue7b8럟鯓扱⅄츨⩷뜷졪삛塬肵쾉飾⭯", 28 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_NOT_BASE64URL_ENCODED, getdevicedata);
        }
        atd.am.getDeviceData getdevicedata2 = atd.am.getDeviceData.ACS_HTML_REFRESH;
        String str = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, getdevicedata2}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.AuthenticationRequestParameters = str;
        if (atd.json.getDeviceData.getDeviceData(str)) {
            return;
        }
        Object[] objArr2 = new Object[1];
        c("뭘홏昍诼㲕汊튻\ue138옹\ud8eb鯤̜䌀\ue7b8럟鯓扱⅄츨⩷뜷졪삛塬肵쾉飾⭯", (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, objArr2);
        throw new atd.z.AuthenticationRequestParameters(((String) objArr2[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_NOT_BASE64URL_ENCODED, getdevicedata2);
    }

    static void ChallengeResultCancelled() {
        getSDKTransactionID = (char) 51269;
        getDeviceData = (char) 24722;
        getSDKReferenceNumber = (char) 49512;
        BuildConfig = (char) 40522;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        Object charArray;
        int i12;
        int i13 = $10 + 59;
        $11 = i13 % 128;
        int i14 = 2;
        int i15 = 0;
        if (i13 % 2 == 0) {
            int i16 = 9 / 0;
            if (str != null) {
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i17 = challengeStatusHandler.getSDKReferenceNumber;
            if (i17 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i18 = $10 + 43;
            $11 = i18 % 128;
            int i19 = 58224;
            int i21 = 1;
            if (i18 % i14 == 0) {
                cArr3[1] = cArr[i17];
                cArr3[1] = cArr[i17];
            } else {
                cArr3[i15] = cArr[i17];
                cArr3[1] = cArr[i17 + 1];
            }
            int i22 = i15;
            while (i22 < 16) {
                $10 = ($11 + 55) % 128;
                char c11 = cArr3[i21];
                char c12 = cArr3[i15];
                int i23 = i14;
                int i24 = (c12 + i19) ^ ((c12 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                int i25 = c12 >>> 5;
                int i26 = i21;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(BuildConfig);
                    objArr2[i23] = Integer.valueOf(i25);
                    objArr2[i26] = Integer.valueOf(i24);
                    objArr2[i15] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i15;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(i15, i15) + 1745, (char) (TextUtils.lastIndexOf("", '0') + 16683), (Process.myPid() >> 22) + 29);
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        i12 = i15;
                        Object[] objArr3 = new Object[i26];
                        d(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c13 = cArr3[i12];
                    int i27 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                    int i28 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getDeviceData);
                    objArr4[i23] = Integer.valueOf(i28);
                    objArr4[1] = Integer.valueOf(i27);
                    objArr4[i12] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        int i29 = i12;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1744, (char) (KeyEvent.getDeadChar(i29, i29) + 16682), 29 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        d(b13, b14, (byte) (b14 + 1), objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i19 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i22++;
                    i14 = i23;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i15 = 0;
                    i21 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr;
            int i31 = i14;
            char[] cArr5 = cArr3;
            int i32 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i32] = cArr5[0];
            cArr2[i32 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i31];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1596, (char) (27824 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                d(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i31;
            cArr = cArr4;
            cArr3 = cArr5;
            i15 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = atd.e.ChallengeResult.$$d
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 116 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResult.d(short, short, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        return getSDKTransactionID(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        ChallengeResult challengeResult = (ChallengeResult) objArr[0];
        int i11 = ChallengeResultCancelled + 83;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            super.getSDKTransactionID();
            challengeResult.getSDKAppID = null;
            challengeResult.AuthenticationRequestParameters = null;
            int i12 = 39 / 0;
        } else {
            super.getSDKTransactionID();
            challengeResult.getSDKAppID = null;
            challengeResult.AuthenticationRequestParameters = null;
        }
        int i13 = getMessageVersion + 25;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static void init$0() {
        $$d = new byte[]{55, -56, 17, -5};
        $$e = 172;
    }

    public final String AuthenticationRequestParameters() {
        String str;
        int i11 = ChallengeResultCancelled + 119;
        int i12 = i11 % 128;
        getMessageVersion = i12;
        if (i11 % 2 == 0) {
            str = this.getSDKAppID;
            int i13 = 9 / 0;
        } else {
            str = this.getSDKAppID;
        }
        ChallengeResultCancelled = (i12 + 111) % 128;
        return str;
    }

    @Override // atd.e.getSDKTransactionID, android.os.Parcelable
    public final int describeContents() {
        int i11 = (ChallengeResultCancelled + 47) % 128;
        getMessageVersion = i11;
        int i12 = i11 + 61;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    @Override // atd.e.getSDKTransactionID
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeResult)) {
            getMessageVersion = (ChallengeResultCancelled + 87) % 128;
            return false;
        }
        if (!super.equals(obj)) {
            int i11 = ChallengeResultCancelled + 77;
            getMessageVersion = i11 % 128;
            return i11 % 2 == 0;
        }
        ChallengeResult challengeResult = (ChallengeResult) obj;
        if (!Objects.equals(this.getSDKAppID, challengeResult.getSDKAppID)) {
            ChallengeResultCancelled = (getMessageVersion + 41) % 128;
            return false;
        }
        boolean zEquals = Objects.equals(this.AuthenticationRequestParameters, challengeResult.AuthenticationRequestParameters);
        int i12 = ChallengeResultCancelled + 3;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    @Override // atd.e.getSDKTransactionID
    public final int hashCode() {
        getMessageVersion = (ChallengeResultCancelled + 49) % 128;
        int iHashCode = super.hashCode() * 31;
        String str = this.getSDKAppID;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.AuthenticationRequestParameters;
        if (str2 != null) {
            int i11 = getMessageVersion + 121;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 != 0) {
                str2.hashCode();
                throw null;
            }
            iHashCode2 = str2.hashCode();
        }
        int i12 = iHashCode3 + iHashCode2;
        int i13 = getMessageVersion + 51;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 == 0) {
            return i12;
        }
        throw null;
    }

    @Override // atd.e.getSDKTransactionID, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = ChallengeResultCancelled + 115;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.getSDKAppID);
            parcel.writeString(this.AuthenticationRequestParameters);
        } else {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.getSDKAppID);
            parcel.writeString(this.AuthenticationRequestParameters);
            int i13 = 11 / 0;
        }
    }

    public final String getSDKReferenceNumber() {
        int i11 = getMessageVersion;
        String str = this.AuthenticationRequestParameters;
        int i12 = i11 + 49;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 93 / 0;
        }
        return str;
    }

    protected ChallengeResult(Parcel parcel) {
        super(parcel);
        this.getSDKAppID = parcel.readString();
        this.AuthenticationRequestParameters = parcel.readString();
    }

    @Override // atd.e.getSDKTransactionID
    public final void getSDKTransactionID() {
        getSDKReferenceNumber(new Object[]{this}, 1620864961, -1620864961, System.identityHashCode(this));
    }
}
