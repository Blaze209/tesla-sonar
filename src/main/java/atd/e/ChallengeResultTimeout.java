package atd.e;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultTimeout extends getAdditionalDetails {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    public static final Parcelable.Creator<ChallengeResultTimeout> CREATOR;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static final List<String> getSDKReferenceNumber;
    private String AuthenticationRequestParameters;
    private String getDeviceData;
    private String getSDKAppID;
    private String getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        CompletionEvent();
        CREATOR = new Parcelable.Creator<ChallengeResultTimeout>() { // from class: atd.e.ChallengeResultTimeout.5
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKAppID;

            private static /* synthetic */ Object getDeviceData(Object[] objArr) {
                Parcel parcel = (Parcel) objArr[1];
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 ^ 55;
                int i13 = ((i11 & 55) | i12) << 1;
                int i14 = -i12;
                int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                getSDKAppID = i15 % 128;
                Object[] objArr2 = {parcel};
                if (i15 % 2 != 0) {
                    throw null;
                }
                ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) getSDKAppID(objArr2, -1014195128, 1014195129, (int) System.currentTimeMillis());
                int i16 = AuthenticationRequestParameters;
                int i17 = i16 & 29;
                int i18 = (i16 | 29) & (~i17);
                int i19 = -(-(i17 << 1));
                getSDKAppID = ((i18 & i19) + (i19 | i18)) % 128;
                return challengeResultTimeout;
            }

            public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
                int i14 = ~i11;
                int i15 = ~i12;
                int i16 = ~(i14 | i15);
                int i17 = (i11 * (-575)) + (i12 * (-575)) + (((~(i15 | i13)) | i16) * 576) + (((~(i11 | (~i13) | i15)) | (~(i12 | i14))) * 576) + (i16 * 576);
                if (i17 != 1) {
                    if (i17 != 2) {
                        return i17 != 3 ? getSDKReferenceNumber(objArr) : getSDKTransactionID(objArr);
                    }
                    return getDeviceData(objArr);
                }
                ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout((Parcel) objArr[0]);
                int i18 = AuthenticationRequestParameters;
                int i19 = i18 & 121;
                int i21 = (i18 | 121) & (~i19);
                int i22 = i19 << 1;
                getSDKAppID = ((i21 & i22) + (i21 | i22)) % 128;
                return challengeResultTimeout;
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                ChallengeResultTimeout[] challengeResultTimeoutArr;
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 63;
                int i13 = (i11 ^ 63) | i12;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getSDKAppID = i14 % 128;
                if (i14 % 2 != 0) {
                    challengeResultTimeoutArr = (ChallengeResultTimeout[]) getSDKAppID(new Object[]{Integer.valueOf(iIntValue)}, 18905735, -18905732, iIntValue);
                    int i15 = 84 / 0;
                } else {
                    challengeResultTimeoutArr = (ChallengeResultTimeout[]) getSDKAppID(new Object[]{Integer.valueOf(iIntValue)}, 18905735, -18905732, iIntValue);
                }
                int i16 = getSDKAppID;
                int i17 = (((i16 | 90) << 1) - (i16 ^ 90)) - 1;
                AuthenticationRequestParameters = i17 % 128;
                if (i17 % 2 != 0) {
                    return challengeResultTimeoutArr;
                }
                throw null;
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i11 = getSDKAppID;
                int i12 = i11 & 31;
                int i13 = -(-((i11 ^ 31) | i12));
                int i14 = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                AuthenticationRequestParameters = i14;
                ChallengeResultTimeout[] challengeResultTimeoutArr = new ChallengeResultTimeout[iIntValue];
                int i15 = ((((i14 ^ 65) | (i14 & 65)) << 1) - (~(-((i14 & (-66)) | ((~i14) & 65))))) - 1;
                getSDKAppID = i15 % 128;
                if (i15 % 2 == 0) {
                    return challengeResultTimeoutArr;
                }
                throw null;
            }

            private static ChallengeResultTimeout o_(Parcel parcel) {
                return (ChallengeResultTimeout) getSDKAppID(new Object[]{parcel}, -1014195128, 1014195129, (int) System.currentTimeMillis());
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultTimeout, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResultTimeout createFromParcel(Parcel parcel) {
                return getSDKAppID(new Object[]{this, parcel}, 312139305, -312139303, System.identityHashCode(this));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.ChallengeResultTimeout[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResultTimeout[] newArray(int i11) {
                return (Object[]) getSDKAppID(new Object[]{this, Integer.valueOf(i11)}, -1598873871, 1598873871, i11);
            }

            private static ChallengeResultTimeout[] getSDKReferenceNumber(int i11) {
                return (ChallengeResultTimeout[]) getSDKAppID(new Object[]{Integer.valueOf(i11)}, 18905735, -18905732, i11);
            }
        };
        Object[] objArr = new Object[1];
        e(View.combineMeasuredStates(0, 0) + 3, false, 2 - TextUtils.lastIndexOf("", '0', 0, 0), View.MeasureSpec.getSize(0) + 163, "\u0002\uffff\u0001", objArr);
        getSDKReferenceNumber = Collections.singletonList(((String) objArr[0]).intern());
        int i11 = getMessageVersion + 53;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    ChallengeResultTimeout(JsonObject jsonObject) {
        super(jsonObject);
        this.getDeviceData = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.CHALLENGE_ADD_INFO}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.getSDKAppID = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.OOP_APP_LABEL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.getSDKTransactionID = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.OOB_APP_URL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.AuthenticationRequestParameters = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.OOB_CONTINUE_LABEL).getSDKReferenceNumber();
        AuthenticationRequestParameters(new Object[]{this, jsonObject}, 108648867, -108648867, System.identityHashCode(this));
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-244)) + (i12 * EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
        int i15 = ~i12;
        int i16 = i14 + (((~((~i13) | i15)) | (~(i15 | i11))) * (-245));
        int i17 = ~(i15 | i13);
        return (i16 + (i17 * (-245))) + ((i11 | i17) * EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) != 1 ? AuthenticationRequestParameters(objArr) : getSDKReferenceNumber(objArr);
    }

    static void CompletionEvent() {
        BuildConfig = 1029304861;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0185  */
    /* JADX WARN: Code duplicated, block: B:41:0x0186  */
    private static void e(int i11, boolean z11, int i12, int i13, String str, Object[] objArr) throws Throwable {
        int i14;
        Throwable cause;
        int i15;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            $10 = ($11 + 79) % 128;
            char c11 = charArray[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i13 + c11);
            cArr[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(BuildConfig);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i16;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionType(0L) + 1186, (char) ((Process.getThreadPriority(i16) + 20) >> 6), 46 - Color.green(i16));
                    byte b11 = (byte) i16;
                    byte b12 = b11;
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    f(b11, b12, (byte) (b12 + 1), objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    int i18 = i15;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i15) + 1721, (char) (48634 - (TypedValue.complexToFraction(i18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23 - TextUtils.lastIndexOf("", '0', i18, i18));
                    byte b13 = (byte) i18;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    f(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[i18], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                charArray = charArray;
                i16 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        if (i11 > 0) {
            getmessageversion.getSDKReferenceNumber = i11;
            char[] cArr2 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, 0, cArr, i12 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, i21, cArr, 0, i12 - i21);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr3 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i22 = getmessageversion.getDeviceData;
                if (i22 >= i12) {
                    break;
                }
                cArr3[i22] = cArr[(i12 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSize(0, 0) + 1721, (char) (View.MeasureSpec.getMode(0) + 48634), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    f(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                $10 = ($11 + 111) % 128;
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 66
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = atd.e.ChallengeResultTimeout.$$g
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = -r8
            int r8 = r8 + r0
            int r6 = r6 + 1
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultTimeout.f(byte, int, byte, java.lang.Object[]):void");
    }

    private void getDeviceData(BuildConfig buildConfig) {
        AuthenticationRequestParameters(new Object[]{this, buildConfig}, 1744264635, -1744264634, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
        BuildConfig buildConfig = (BuildConfig) objArr[1];
        ChallengeResultCancelled = (getMessageVersion + 3) % 128;
        JsonObject sDKReferenceNumber = atd.d.getMessageVersion.getSDKTransactionID(buildConfig.getDeviceData(), atd.am.getDeviceData.MESSAGE_EXTENSION_CHALLENGE_DATA).getSDKReferenceNumber();
        challengeResultTimeout.getSDKAppID = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{sDKReferenceNumber, atd.am.getDeviceData.OOP_APP_LABEL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        challengeResultTimeout.getSDKTransactionID = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{sDKReferenceNumber, atd.am.getDeviceData.OOB_APP_URL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        int i11 = ChallengeResultCancelled + 77;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static void init$0() {
        $$g = new byte[]{106, 18, 2, -83};
        $$h = 12;
    }

    public final String ChallengeResultKt() {
        int i11 = (getMessageVersion + 63) % 128;
        ChallengeResultCancelled = i11;
        String str = this.getSDKTransactionID;
        int i12 = i11 + 93;
        getMessageVersion = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String ChallengeStatusHandler() {
        int i11 = ChallengeResultCancelled + 79;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            return this.getDeviceData;
        }
        throw null;
    }

    public final String ChallengeStatusReceiver() {
        int i11 = getMessageVersion;
        String str = this.getSDKAppID;
        int i12 = i11 + 11;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String completed() {
        int i11 = ChallengeResultCancelled + 15;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            return this.AuthenticationRequestParameters;
        }
        throw null;
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID, android.os.Parcelable
    public final int describeContents() {
        getMessageVersion = (ChallengeResultCancelled + 57) % 128;
        return 0;
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public final boolean equals(Object obj) {
        int i11 = (ChallengeResultCancelled + 69) % 128;
        getMessageVersion = i11;
        if (this == obj) {
            ChallengeResultCancelled = (i11 + 19) % 128;
            return true;
        }
        if (obj == null || ChallengeResultTimeout.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) obj;
        if (!Objects.equals(this.getDeviceData, challengeResultTimeout.getDeviceData)) {
            getMessageVersion = (ChallengeResultCancelled + 103) % 128;
            return false;
        }
        if (Objects.equals(this.getSDKAppID, challengeResultTimeout.getSDKAppID) && Objects.equals(this.getSDKTransactionID, challengeResultTimeout.getSDKTransactionID)) {
            return Objects.equals(this.AuthenticationRequestParameters, challengeResultTimeout.AuthenticationRequestParameters);
        }
        return false;
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public final void getSDKTransactionID() {
        int i11 = ChallengeResultCancelled + 71;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            super.getSDKTransactionID();
            this.getDeviceData = null;
            this.getSDKAppID = null;
            this.getSDKTransactionID = null;
            this.AuthenticationRequestParameters = null;
            return;
        }
        super.getSDKTransactionID();
        this.getDeviceData = null;
        this.getSDKAppID = null;
        this.getSDKTransactionID = null;
        this.AuthenticationRequestParameters = null;
        throw null;
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = super.hashCode() * 31;
        String str = this.getDeviceData;
        if (str != null) {
            int i11 = ChallengeResultCancelled + 53;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                iHashCode = str.hashCode();
                int i12 = 94 / 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            ChallengeResultCancelled = (getMessageVersion + 17) % 128;
            iHashCode = 0;
        }
        int i13 = (iHashCode3 + iHashCode) * 31;
        String str2 = this.getSDKAppID;
        int iHashCode4 = (i13 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getSDKTransactionID;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
            ChallengeResultCancelled = (getMessageVersion + 67) % 128;
        } else {
            iHashCode2 = 0;
        }
        int i14 = (iHashCode4 + iHashCode2) * 31;
        String str4 = this.AuthenticationRequestParameters;
        return i14 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // atd.e.getAdditionalDetails, atd.e.getSDKTransactionID, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        ChallengeResultCancelled = (getMessageVersion + 23) % 128;
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.getDeviceData);
        parcel.writeString(this.getSDKAppID);
        parcel.writeString(this.getSDKTransactionID);
        parcel.writeString(this.AuthenticationRequestParameters);
        int i12 = getMessageVersion + 41;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 8 / 0;
        }
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        JsonArray sDKReferenceNumber;
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
        JsonObject jsonObject = (JsonObject) objArr[1];
        int i11 = ChallengeResultCancelled + 87;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            sDKReferenceNumber = atd.d.getMessageVersion.getSDKEphemeralPublicKey(jsonObject, atd.am.getDeviceData.MESSAGE_EXTENSION).getSDKReferenceNumber();
            int i12 = 77 / 0;
            if (sDKReferenceNumber == null) {
                return null;
            }
        } else {
            sDKReferenceNumber = atd.d.getMessageVersion.getSDKEphemeralPublicKey(jsonObject, atd.am.getDeviceData.MESSAGE_EXTENSION).getSDKReferenceNumber();
            if (sDKReferenceNumber == null) {
                return null;
            }
        }
        ChallengeResultCancelled = (getMessageVersion + 105) % 128;
        for (BuildConfig buildConfig : BuildConfig.AuthenticationRequestParameters(sDKReferenceNumber)) {
            getMessageVersion = (ChallengeResultCancelled + 45) % 128;
            if (AuthenticationRequestParameters(buildConfig)) {
                AuthenticationRequestParameters(new Object[]{challengeResultTimeout, buildConfig}, 1744264635, -1744264634, System.identityHashCode(challengeResultTimeout));
            }
        }
        return null;
    }

    protected ChallengeResultTimeout(Parcel parcel) {
        super(parcel);
        this.getDeviceData = parcel.readString();
        this.getSDKAppID = parcel.readString();
        this.getSDKTransactionID = parcel.readString();
        this.AuthenticationRequestParameters = parcel.readString();
    }

    private static boolean AuthenticationRequestParameters(BuildConfig buildConfig) throws Throwable {
        Object[] objArr = new Object[1];
        e((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), true, TextUtils.indexOf("", "", 0) + 8, (Process.myTid() >> 22) + EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, "\uffde\u0003\n\u0005\u0003\u0000\u0005\u000e", objArr);
        boolean zEquals = ((String) objArr[0]).intern().equals(buildConfig.AuthenticationRequestParameters());
        Object[] objArr2 = new Object[1];
        e(8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, Color.argb(0, 0, 0, 0) + 14, (ViewConfiguration.getFadingEdgeLength() >> 16) + 166, "\u0006\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\u000f\u0002\ufffe\ufffe\ufffb\u0000\ufffe", objArr2);
        boolean zEquals2 = ((String) objArr2[0]).intern().equals(buildConfig.getSDKTransactionID());
        boolean z11 = buildConfig.getSDKAppID() == null || getSDKReferenceNumber.contains(buildConfig.getSDKAppID());
        if (zEquals) {
            int i11 = (getMessageVersion + 57) % 128;
            ChallengeResultCancelled = i11;
            if (zEquals2 && z11) {
                getMessageVersion = (i11 + 77) % 128;
                return true;
            }
        }
        return false;
    }

    private void AuthenticationRequestParameters(JsonObject jsonObject) {
        AuthenticationRequestParameters(new Object[]{this, jsonObject}, 108648867, -108648867, System.identityHashCode(this));
    }
}
