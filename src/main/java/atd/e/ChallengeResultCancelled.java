package atd.e;

import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCancelled implements Parcelable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    public static final Parcelable.Creator<ChallengeResultCancelled> CREATOR;
    private static int ChallengeResult;
    private static char getDeviceData;
    private static char getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private String AuthenticationRequestParameters;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber();
        CREATOR = new Parcelable.Creator<ChallengeResultCancelled>() { // from class: atd.e.ChallengeResultCancelled.1
            private static int AuthenticationRequestParameters = 1;
            private static int getDeviceData;

            public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
                int i14 = (i11 * EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE) + (i12 * (-215)) + ((~(i11 | i13)) * EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                int i15 = (~i12) | i11;
                int i16 = ~i13;
                int i17 = i14 + ((i15 | i16) * (-216)) + (((~(i11 | i16)) | i12) * EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                if (i17 == 1) {
                    return AuthenticationRequestParameters(objArr);
                }
                if (i17 == 2) {
                    return getSDKReferenceNumber(objArr);
                }
                if (i17 == 3) {
                    return getSDKTransactionID(objArr);
                }
                ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled((Parcel) objArr[0]);
                int i18 = getDeviceData;
                int i19 = i18 & 23;
                AuthenticationRequestParameters = (((i18 | 23) & (~i19)) + (i19 << 1)) % 128;
                return challengeResultCancelled;
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = getDeviceData;
                AuthenticationRequestParameters = ((i11 & 5) + (i11 | 5)) % 128;
                ChallengeResultCancelled[] challengeResultCancelledArr = (ChallengeResultCancelled[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(iIntValue)}, -1354681827, 1354681828, iIntValue);
                int i12 = AuthenticationRequestParameters + 89;
                getDeviceData = i12 % 128;
                if (i12 % 2 == 0) {
                    return challengeResultCancelledArr;
                }
                throw null;
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                Parcel parcel = (Parcel) objArr[1];
                int i11 = getDeviceData;
                int i12 = (i11 & (-68)) | ((~i11) & 67);
                int i13 = (i11 & 67) << 1;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                AuthenticationRequestParameters = i14 % 128;
                Object[] objArr2 = {parcel};
                if (i14 % 2 != 0) {
                    return (ChallengeResultCancelled) AuthenticationRequestParameters(objArr2, -1749758000, 1749758000, (int) System.currentTimeMillis());
                }
                int i15 = 16 / 0;
                return (ChallengeResultCancelled) AuthenticationRequestParameters(objArr2, -1749758000, 1749758000, (int) System.currentTimeMillis());
            }

            private static ChallengeResultCancelled l_(Parcel parcel) {
                return (ChallengeResultCancelled) AuthenticationRequestParameters(new Object[]{parcel}, -1749758000, 1749758000, (int) System.currentTimeMillis());
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultCancelled, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResultCancelled createFromParcel(Parcel parcel) {
                return AuthenticationRequestParameters(new Object[]{this, parcel}, -395611093, 395611096, System.identityHashCode(this));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultCancelled[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResultCancelled[] newArray(int i11) {
                return (Object[]) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, -527273098, 527273100, i11);
            }

            private static ChallengeResultCancelled[] getSDKTransactionID(int i11) {
                return (ChallengeResultCancelled[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(i11)}, -1354681827, 1354681828, i11);
            }

            private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i11 = getDeviceData;
                int i12 = i11 & 53;
                int i13 = (~i12) & (i11 | 53);
                int i14 = -(-(i12 << 1));
                int i15 = (i13 & i14) + (i14 | i13);
                AuthenticationRequestParameters = i15 % 128;
                ChallengeResultCancelled[] challengeResultCancelledArr = new ChallengeResultCancelled[iIntValue];
                if (i15 % 2 == 0) {
                    throw null;
                }
                int i16 = i11 & 19;
                int i17 = ((i11 ^ 19) | i16) << 1;
                int i18 = -((i11 | 19) & (~i16));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                AuthenticationRequestParameters = i19 % 128;
                if (i19 % 2 != 0) {
                    return challengeResultCancelledArr;
                }
                throw null;
            }
        };
        getSDKEphemeralPublicKey = (ChallengeResult + 101) % 128;
    }

    private ChallengeResultCancelled(JsonObject jsonObject) throws Throwable {
        this.getSDKReferenceNumber = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.ISSUER_IMAGE_MEDIUM}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.AuthenticationRequestParameters = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.ISSUER_IMAGE_HIGH}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        String str = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.ISSUER_IMAGE_EXTRA_HIGH}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.getSDKTransactionID = str;
        if (this.getSDKReferenceNumber == null && this.AuthenticationRequestParameters == null && str == null) {
            Object[] objArr = new Object[1];
            a("⢻錯葋倝ﲡ\ue9c9á芜\uf5a5퐀癮\ueb1a\ud993쮍ᑈ板\uf3eb猙䒱䖂葢⽯퓿ዎ", (ViewConfiguration.getEdgeSlop() >> 16) + 24, objArr);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT);
        }
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr = new char[charArray.length];
        int i13 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i14 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i15 = challengeStatusHandler.getSDKReferenceNumber;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            cArr2[i13] = charArray[i15];
            int i16 = 1;
            cArr2[1] = charArray[i15 + 1];
            $10 = ($11 + 69) % 128;
            int i17 = 58224;
            int i18 = i13;
            while (i18 < 16) {
                $10 = ($11 + 103) % 128;
                char c11 = cArr2[i16];
                char c12 = cArr2[i13];
                int i19 = i14;
                int i21 = i16;
                int i22 = i18;
                int i23 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getMessageVersion) ^ (-2881362678149017980L))));
                int i24 = c12 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(BuildConfig);
                    objArr2[i19] = Integer.valueOf(i24);
                    objArr2[i21] = Integer.valueOf(i23);
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i13;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf("", "", i13, i13) + 16682), 29 - (TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[i21];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    char c13 = cArr2[i12];
                    int i25 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ (-2881362678149017980L))));
                    int i26 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getDeviceData);
                    objArr4[i19] = Integer.valueOf(i26);
                    objArr4[1] = Integer.valueOf(i25);
                    objArr4[i12] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        int i27 = i12;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1745, (char) (ImageFormat.getBitsPerPixel(i12) + 16683), View.resolveSizeAndState(i27, i27, i27) + 29);
                        byte b13 = (byte) i27;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i27], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i18 = i22 + 1;
                    i14 = i19;
                    charArray = charArray;
                    i13 = 0;
                    i16 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr3 = charArray;
            int i28 = i14;
            int i29 = challengeStatusHandler.getSDKReferenceNumber;
            cArr[i29] = cArr2[0];
            cArr[i29 + 1] = cArr2[1];
            Object[] objArr6 = new Object[i28];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1596, (char) (27823 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.lastIndexOf("", '0') + 26);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, (byte) (b16 + 1), objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i28;
            charArray = cArr3;
            i13 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r9 = r9 * 4
            int r9 = r9 + 112
            byte[] r0 = atd.e.ChallengeResultCancelled.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r8 = r8 + r3
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultCancelled.b(byte, byte, byte, java.lang.Object[]):void");
    }

    public static ChallengeResultCancelled getDeviceData(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 65;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            atd.d.getMessageVersion.ChallengeResult(jsonObject, getdevicedata).getSDKReferenceNumber();
            throw null;
        }
        JsonObject sDKReferenceNumber = atd.d.getMessageVersion.ChallengeResult(jsonObject, getdevicedata).getSDKReferenceNumber();
        if (sDKReferenceNumber == null) {
            getSDKEphemeralPublicKey = (ChallengeResult + 13) % 128;
            return null;
        }
        try {
            return new ChallengeResultCancelled(sDKReferenceNumber);
        } catch (atd.z.AuthenticationRequestParameters unused) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("⢻錯葋倝ﲡ\ue9c9á芜\uf5a5퐀癮\ueb1a\ud993쮍㌹슨秭㽮辜좘\uf32e쟰忭듵몦\ud8c0", 25 - TextUtils.getOffsetAfter("", 0), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata.AuthenticationRequestParameters());
            throw new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT, getdevicedata);
        }
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        int iHashCode;
        int iHashCode2;
        int i14 = ~i11;
        int i15 = (i11 * 592) + (i12 * (-590)) + ((~(i14 | i12)) * (-1182));
        int i16 = ~i12;
        if (i15 + (((~(i11 | i12)) | (~(i14 | i16 | (~i13)))) * (-591)) + ((i13 | i14 | i16) * 591) != 1) {
            return getDeviceData(objArr);
        }
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[0];
        int i17 = (ChallengeResult + 73) % 128;
        getSDKEphemeralPublicKey = i17;
        String str = challengeResultCancelled.getSDKReferenceNumber;
        if (str != null) {
            ChallengeResult = (i17 + 79) % 128;
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int i18 = iHashCode * 31;
        String str2 = challengeResultCancelled.AuthenticationRequestParameters;
        if (str2 != null) {
            ChallengeResult = (getSDKEphemeralPublicKey + 63) % 128;
            iHashCode2 = str2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i19 = (i18 + iHashCode2) * 31;
        String str3 = challengeResultCancelled.getSDKTransactionID;
        return Integer.valueOf(i19 + (str3 != null ? str3.hashCode() : 0));
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = (char) 57270;
        getDeviceData = (char) 2147;
        getMessageVersion = (char) 36053;
        BuildConfig = (char) 48767;
    }

    static void init$0() {
        $$a = new byte[]{2, 58, 30, 104};
        $$b = 131;
    }

    private static String j_(Parcel parcel) {
        String string = parcel.readString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        int i11 = (ChallengeResult + 33) % 128;
        getSDKEphemeralPublicKey = i11;
        int i12 = i11 + 71;
        ChallengeResult = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 44 / 0;
        }
        return string;
    }

    private static void k_(Parcel parcel, String str) {
        int i11 = getSDKEphemeralPublicKey;
        ChallengeResult = (i11 + 67) % 128;
        if (str != null) {
            ChallengeResult = (i11 + 71) % 128;
            parcel.writeString(str);
        } else {
            parcel.writeString(null);
            getSDKEphemeralPublicKey = (ChallengeResult + 115) % 128;
        }
    }

    public final String AuthenticationRequestParameters() {
        int i11 = (ChallengeResult + 77) % 128;
        getSDKEphemeralPublicKey = i11;
        String str = this.getSDKReferenceNumber;
        ChallengeResult = (i11 + 51) % 128;
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i11 = ChallengeResult + 63;
        getSDKEphemeralPublicKey = i11 % 128;
        return i11 % 2 != 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) getSDKAppID(new Object[]{this, obj}, 1517598891, -1517598891, System.identityHashCode(this))).booleanValue();
    }

    public final String getSDKTransactionID() {
        int i11 = (getSDKEphemeralPublicKey + 73) % 128;
        ChallengeResult = i11;
        String str = this.AuthenticationRequestParameters;
        getSDKEphemeralPublicKey = (i11 + 61) % 128;
        return str;
    }

    public final int hashCode() {
        return ((Integer) getSDKAppID(new Object[]{this}, 1077797514, -1077797513, System.identityHashCode(this))).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = ChallengeResult + 17;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 != 0) {
            k_(parcel, this.getSDKReferenceNumber);
            k_(parcel, this.AuthenticationRequestParameters);
            k_(parcel, this.getSDKTransactionID);
            throw null;
        }
        k_(parcel, this.getSDKReferenceNumber);
        k_(parcel, this.AuthenticationRequestParameters);
        k_(parcel, this.getSDKTransactionID);
        ChallengeResult = (getSDKEphemeralPublicKey + 5) % 128;
    }

    protected ChallengeResultCancelled(Parcel parcel) {
        this.getSDKReferenceNumber = j_(parcel);
        this.AuthenticationRequestParameters = j_(parcel);
        this.getSDKTransactionID = j_(parcel);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[0];
        Object obj = objArr[1];
        int i11 = getSDKEphemeralPublicKey + 91;
        int i12 = i11 % 128;
        ChallengeResult = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (challengeResultCancelled == obj) {
            int i13 = i12 + 85;
            getSDKEphemeralPublicKey = i13 % 128;
            if (i13 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (obj != null && challengeResultCancelled.getClass() == obj.getClass()) {
            ChallengeResultCancelled challengeResultCancelled2 = (ChallengeResultCancelled) obj;
            if (!Objects.equals(challengeResultCancelled.getSDKReferenceNumber, challengeResultCancelled2.getSDKReferenceNumber)) {
                return Boolean.FALSE;
            }
            if (!Objects.equals(challengeResultCancelled.AuthenticationRequestParameters, challengeResultCancelled2.AuthenticationRequestParameters)) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Objects.equals(challengeResultCancelled.getSDKTransactionID, challengeResultCancelled2.getSDKTransactionID));
        }
        int i14 = getSDKEphemeralPublicKey + 73;
        ChallengeResult = i14 % 128;
        if (i14 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public final void getSDKAppID() {
        int i11 = (ChallengeResult + 121) % 128;
        getSDKEphemeralPublicKey = i11;
        this.getSDKReferenceNumber = null;
        this.AuthenticationRequestParameters = null;
        this.getSDKTransactionID = null;
        int i12 = i11 + 109;
        ChallengeResult = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 65 / 0;
        }
    }

    public final String getDeviceData() {
        int i11 = ChallengeResult;
        String str = this.getSDKTransactionID;
        int i12 = i11 + 91;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
