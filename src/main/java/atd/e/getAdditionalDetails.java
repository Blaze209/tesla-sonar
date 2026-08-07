package atd.e;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class getAdditionalDetails extends getSDKTransactionID {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    public static final Parcelable.Creator<getAdditionalDetails> CREATOR;
    private static int[] ChallengeResultCompleted;
    private static int ChallengeResultError;
    private static int ChallengeResultTimeout;
    private atd.i.AuthenticationRequestParameters AuthenticationRequestParameters;
    private String BuildConfig;
    private String ChallengeResult;
    private String ChallengeResultCancelled;
    private String getAdditionalDetails;
    private String getDeviceData;
    private String getMessageVersion;
    private String getSDKAppID;
    private ChallengeResultCancelled getSDKEphemeralPublicKey;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;
    private ChallengeResultCancelled getTransactionStatus;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultError = 0;
        ChallengeResultTimeout = 1;
        onCompletion();
        CREATOR = new Parcelable.Creator<getAdditionalDetails>() { // from class: atd.e.getAdditionalDetails.3
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKAppID;

            public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
                int i14 = ~i11;
                int i15 = ~i12;
                int i16 = i14 | i15;
                int i17 = ~(i16 | i13);
                int i18 = ~i13;
                int i19 = (i11 * (-919)) + (i12 * (-919)) + ((i17 | (~(i15 | i18 | i11))) * 920) + (((~i16) | (~(i14 | i18))) * 920) + (((~(i11 | i15 | i13)) | (~(i12 | i14 | i13)) | (~(i16 | i18))) * 920);
                if (i19 == 1) {
                    return getSDKTransactionID(objArr);
                }
                if (i19 == 2) {
                    Parcel parcel = (Parcel) objArr[1];
                    AuthenticationRequestParameters = (getSDKAppID + 83) % 128;
                    getAdditionalDetails getadditionaldetails = (getAdditionalDetails) AuthenticationRequestParameters(new Object[]{parcel}, -9860933, 9860936, (int) System.currentTimeMillis());
                    int i21 = AuthenticationRequestParameters;
                    getSDKAppID = (((i21 ^ 122) + ((i21 & 122) << 1)) - 1) % 128;
                    return getadditionaldetails;
                }
                if (i19 == 3) {
                    getAdditionalDetails getadditionaldetails2 = new getAdditionalDetails((Parcel) objArr[0]);
                    int i22 = getSDKAppID;
                    AuthenticationRequestParameters = (((i22 & (-110)) | ((~i22) & 109)) + ((i22 & 109) << 1)) % 128;
                    return getadditionaldetails2;
                }
                int iIntValue = ((Number) objArr[0]).intValue();
                int i23 = getSDKAppID;
                int i24 = i23 ^ 97;
                int i25 = -(-((i23 & 97) << 1));
                int i26 = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                AuthenticationRequestParameters = i26;
                getAdditionalDetails[] getadditionaldetailsArr = new getAdditionalDetails[iIntValue];
                int i27 = i26 & 105;
                int i28 = (i26 ^ 105) | i27;
                getSDKAppID = (((i27 | i28) << 1) - (i27 ^ i28)) % 128;
                return getadditionaldetailsArr;
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = getSDKAppID + 35;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                getAdditionalDetails[] getadditionaldetailsArr = (getAdditionalDetails[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(iIntValue)}, 606691009, -606691009, iIntValue);
                int i12 = getSDKAppID;
                int i13 = (i12 & 82) + (i12 | 82);
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                AuthenticationRequestParameters = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 73 / 0;
                }
                return getadditionaldetailsArr;
            }

            private static getAdditionalDetails m_(Parcel parcel) {
                return (getAdditionalDetails) AuthenticationRequestParameters(new Object[]{parcel}, -9860933, 9860936, (int) System.currentTimeMillis());
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.getAdditionalDetails, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getAdditionalDetails createFromParcel(Parcel parcel) {
                return AuthenticationRequestParameters(new Object[]{this, parcel}, 1811811984, -1811811982, System.identityHashCode(this));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.getAdditionalDetails[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getAdditionalDetails[] newArray(int i11) {
                return (Object[]) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, 188158835, -188158834, i11);
            }

            private static getAdditionalDetails[] getSDKTransactionID(int i11) {
                return (getAdditionalDetails[]) AuthenticationRequestParameters(new Object[]{Integer.valueOf(i11)}, 606691009, -606691009, i11);
            }
        };
        ChallengeResultError = (ChallengeResultTimeout + 25) % 128;
    }

    getAdditionalDetails(JsonObject jsonObject) throws Throwable {
        super(jsonObject);
        this.getSDKAppID = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.CHALLENGE_INFO_HEADER).getSDKReferenceNumber();
        this.getSDKReferenceNumber = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.CHALLENGE_INFO_TEXT).getSDKReferenceNumber();
        this.getDeviceData = getDeviceData() == atd.i.getSDKAppID.OUT_OF_BAND ? (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.CHALLENGE_INFO_LABEL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber() : atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.CHALLENGE_INFO_LABEL).getSDKReferenceNumber();
        atd.am.getDeviceData getdevicedata = atd.am.getDeviceData.CHALLENGE_INFO_TEXT_INDICATOR;
        this.AuthenticationRequestParameters = atd.i.AuthenticationRequestParameters.AuthenticationRequestParameters((String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, getdevicedata}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber(), getdevicedata);
        this.getSDKTransactionID = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.RESEND_INFO_LABEL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.BuildConfig = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.WHY_INFO_LABEL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.ChallengeResult = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.WHY_INFO_TEXT}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.getMessageVersion = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.EXPAND_INFO_LABEL}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.ChallengeResultCancelled = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.EXPAND_INFO_TEXT}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.getSDKEphemeralPublicKey = ChallengeResultCancelled.getDeviceData(jsonObject, atd.am.getDeviceData.ISSUER_IMAGE);
        this.getTransactionStatus = ChallengeResultCancelled.getDeviceData(jsonObject, atd.am.getDeviceData.PS_IMAGE);
        atd.am.getDeviceData getdevicedata2 = atd.am.getDeviceData.WHITELISTING_INFO_TEXT;
        String str = (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, getdevicedata2}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber();
        this.getAdditionalDetails = str;
        if (str == null || str.length() <= 64) {
            return;
        }
        Object[] objArr = new Object[1];
        c(new int[]{-2120422746, 292237467, 1712701961, -755612807, 1891332013, -2129562558, -894736737, 1122065419, -2045701788, 2019360330, 1620533908, 459094533, -813509680, 667626117, 996086719, 1674846085, 406464171, -1059528048, -972177176, -171256810, 1900322438, -1420720122, 389869747, 411669128}, ExpandableListView.getPackedPositionGroup(0L) + 46, objArr);
        throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_TOO_LONG, getdevicedata2);
    }

    private static void c(int[] iArr, int i11, Object[] objArr) throws Throwable {
        Object method;
        Object method2;
        String str = "";
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i12 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ChallengeResultCompleted;
        Class cls = Integer.TYPE;
        int i13 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        int i15 = i13;
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1861 - (ExpandableListView.getPackedPositionForChild(i13, i13) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i13, i13) == 0L ? 0 : -1)), (char) TextUtils.indexOf(str, str), 21 - Color.alpha(i15));
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, b12, objArr3);
                        method2 = cls2.getMethod((String) objArr3[i15], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i14++;
                    cArr = cArr;
                    str = str;
                    iArr3 = iArr3;
                    iArr2 = iArr2;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        char[] cArr3 = cArr;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ChallengeResultCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i16 = 0;
            while (i16 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i16])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object obj2 = map2.get(2050190164);
                if (obj2 != null) {
                    method = obj2;
                } else {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 1862, (char) KeyEvent.normalizeMetaState(0), 20 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    d(b13, b14, b14, objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2050190164, method);
                }
                iArr6[i16] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i16++;
                iArr5 = iArr5;
                length3 = length3;
                iArr6 = iArr6;
                cArr2 = cArr2;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr2;
        int i17 = 16;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        $10 = ($11 + 23) % 128;
        while (true) {
            int i18 = challengeResultCompleted.getDeviceData;
            if (i18 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i19 = iArr[i18];
            char c11 = (char) (i19 >> 16);
            cArr3[0] = c11;
            char c12 = (char) i19;
            cArr3[1] = c12;
            char c13 = (char) (iArr[i18 + 1] >> 16);
            cArr3[i12] = c13;
            char c14 = (char) iArr[i18 + 1];
            char c15 = 3;
            cArr3[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            $11 = ($10 + 65) % 128;
            int i21 = 0;
            while (i21 < i17) {
                int i22 = challengeResultCompleted.getSDKAppID ^ iArr4[i21];
                challengeResultCompleted.getSDKAppID = i22;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i22);
                Object[] objArr6 = new Object[4];
                objArr6[c15] = challengeResultCompleted;
                objArr6[i12] = challengeResultCompleted;
                objArr6[1] = Integer.valueOf(sDKAppID);
                objArr6[0] = challengeResultCompleted;
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(929629307);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((-16775917) - Color.rgb(0, 0, 0), (char) (CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 33 - View.combineMeasuredStates(0, 0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    d(b15, b16, (byte) (b16 + 3), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                    map3.put(929629307, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i21++;
                c15 = c15;
                i17 = 16;
            }
            char c16 = c15;
            int i23 = challengeResultCompleted.getSDKAppID;
            int i24 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i24;
            challengeResultCompleted.getSDKReferenceNumber = i23;
            i17 = 16;
            int i25 = i23 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i25;
            int i26 = i24 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i26;
            cArr3[0] = (char) (i26 >>> 16);
            cArr3[1] = (char) i26;
            cArr3[i12] = (char) (i25 >>> 16);
            cArr3[c16] = (char) i25;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i27 = challengeResultCompleted.getDeviceData;
            cArr4[i27 * 2] = cArr3[0];
            cArr4[(i27 * 2) + 1] = cArr3[1];
            cArr4[(i27 * 2) + 2] = cArr3[i12];
            cArr4[(i27 * 2) + 3] = cArr3[c16];
            Object[] objArr8 = new Object[i12];
            objArr8[1] = challengeResultCompleted;
            objArr8[0] = challengeResultCompleted;
            Map map4 = atd.a.getMessageVersion.timedout;
            Object method4 = map4.get(1109131256);
            if (method4 == null) {
                Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.makeMeasureSpec(0, 0) + 2061, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 18 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                byte b17 = (byte) 0;
                byte b18 = b17;
                Object[] objArr9 = new Object[1];
                d(b17, b18, (byte) (b18 + 2), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(1109131256, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            i12 = 2;
        }
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
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r8 = r8 + 117
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = atd.e.getAdditionalDetails.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + 1
            int r8 = -r8
            int r8 = r8 + r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getAdditionalDetails.d(short, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = (i11 * (-129)) + (i12 * 131) + ((~((~i13) | i14 | i11)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        int i16 = i14 | i11;
        if (i15 + ((~i16) * (-260)) + (((~((~i11) | i12)) | (~(i16 | i13))) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) == 1) {
            return getSDKAppID(objArr);
        }
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[0];
        int i17 = ChallengeResultError;
        ChallengeResultTimeout = (i17 + 21) % 128;
        String str = getadditionaldetails.getDeviceData;
        ChallengeResultTimeout = (i17 + 47) % 128;
        return str;
    }

    static void init$0() {
        $$d = new byte[]{82, 42, -92, 24};
        $$e = 7;
    }

    static void onCompletion() {
        ChallengeResultCompleted = new int[]{2128686873, 95339782, -737461752, 422576980, -353280749, -1642043558, -835733460, -1352463793, 656251319, -1121099285, 1379980379, -1420470844, -884633842, -717094285, -1606807721, 1645308206, -394060536, 2051285357};
    }

    public final String AuthenticationRequestParameters() {
        int i11 = (ChallengeResultTimeout + 65) % 128;
        ChallengeResultError = i11;
        String str = this.getSDKAppID;
        ChallengeResultTimeout = (i11 + 61) % 128;
        return str;
    }

    public final String BuildConfig() {
        return (String) getSDKAppID(new Object[]{this}, -364749472, 364749473, System.identityHashCode(this));
    }

    public final String ChallengeResult() {
        int i11 = ChallengeResultTimeout + 121;
        int i12 = i11 % 128;
        ChallengeResultError = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.getMessageVersion;
        int i13 = i12 + 5;
        ChallengeResultTimeout = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 72 / 0;
        }
        return str;
    }

    public final String ChallengeResultCancelled() {
        int i11 = (ChallengeResultTimeout + 23) % 128;
        ChallengeResultError = i11;
        String str = this.BuildConfig;
        ChallengeResultTimeout = (i11 + 81) % 128;
        return str;
    }

    public final String ChallengeResultCompleted() {
        int i11 = ChallengeResultTimeout;
        int i12 = i11 + 111;
        ChallengeResultError = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        String str = this.ChallengeResultCancelled;
        int i13 = i11 + 31;
        ChallengeResultError = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean ChallengeResultError() throws Throwable {
        ChallengeResultError = (ChallengeResultTimeout + 121) % 128;
        boolean zAuthenticationRequestParameters = this.AuthenticationRequestParameters.AuthenticationRequestParameters();
        int i11 = ChallengeResultError + 51;
        ChallengeResultTimeout = i11 % 128;
        if (i11 % 2 != 0) {
            return zAuthenticationRequestParameters;
        }
        throw null;
    }

    public final String ChallengeResultTimeout() {
        int i11 = ChallengeResultError + 57;
        ChallengeResultTimeout = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getAdditionalDetails;
        }
        int i12 = 41 / 0;
        return this.getAdditionalDetails;
    }

    @Override // atd.e.getSDKTransactionID, android.os.Parcelable
    public int describeContents() {
        int i11 = ChallengeResultTimeout + 45;
        ChallengeResultError = i11 % 128;
        if (i11 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    @Override // atd.e.getSDKTransactionID
    public boolean equals(Object obj) {
        ChallengeResultTimeout = (ChallengeResultError + 29) % 128;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            int i11 = ChallengeResultTimeout + 31;
            ChallengeResultError = i11 % 128;
            return i11 % 2 != 0;
        }
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) obj;
        if (!((Boolean) atd.json.ChallengeResult.AuthenticationRequestParameters(new Object[]{this.getSDKAppID, getadditionaldetails.getSDKAppID}, 931709424, -931709424, (int) System.currentTimeMillis())).booleanValue()) {
            return false;
        }
        if (!((Boolean) atd.json.ChallengeResult.AuthenticationRequestParameters(new Object[]{this.getSDKReferenceNumber, getadditionaldetails.getSDKReferenceNumber}, 931709424, -931709424, (int) System.currentTimeMillis())).booleanValue()) {
            ChallengeResultTimeout = (ChallengeResultError + 75) % 128;
            return false;
        }
        if (!((Boolean) atd.json.ChallengeResult.AuthenticationRequestParameters(new Object[]{this.getDeviceData, getadditionaldetails.getDeviceData}, 931709424, -931709424, (int) System.currentTimeMillis())).booleanValue()) {
            return false;
        }
        if (this.AuthenticationRequestParameters == getadditionaldetails.AuthenticationRequestParameters) {
            return ((Boolean) atd.json.ChallengeResult.AuthenticationRequestParameters(new Object[]{this.getSDKTransactionID, getadditionaldetails.getSDKTransactionID}, 931709424, -931709424, (int) System.currentTimeMillis())).booleanValue();
        }
        int i12 = ChallengeResultTimeout + 51;
        ChallengeResultError = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 44 / 0;
        }
        return false;
    }

    public final ChallengeResultCancelled getAdditionalDetails() {
        int i11 = ChallengeResultTimeout + 35;
        ChallengeResultError = i11 % 128;
        if (i11 % 2 == 0) {
            return this.getTransactionStatus;
        }
        throw null;
    }

    public final String getMessageVersion() {
        int i11 = ChallengeResultError;
        String str = this.ChallengeResult;
        int i12 = i11 + 71;
        ChallengeResultTimeout = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getSDKEphemeralPublicKey() {
        return (String) getSDKAppID(new Object[]{this}, -433727603, 433727603, System.identityHashCode(this));
    }

    public final String getSDKReferenceNumber() {
        int i11 = ChallengeResultError;
        String str = this.getSDKReferenceNumber;
        ChallengeResultTimeout = (i11 + 83) % 128;
        return str;
    }

    @Override // atd.e.getSDKTransactionID
    public void getSDKTransactionID() {
        super.getSDKTransactionID();
        this.getSDKAppID = null;
        this.getSDKReferenceNumber = null;
        this.getDeviceData = null;
        this.AuthenticationRequestParameters = null;
        this.getSDKTransactionID = null;
        this.BuildConfig = null;
        this.ChallengeResult = null;
        this.getMessageVersion = null;
        this.ChallengeResultCancelled = null;
        ChallengeResultCancelled challengeResultCancelled = this.getSDKEphemeralPublicKey;
        if (challengeResultCancelled != null) {
            ChallengeResultError = (ChallengeResultTimeout + 101) % 128;
            challengeResultCancelled.getSDKAppID();
            this.getSDKEphemeralPublicKey = null;
        }
        ChallengeResultCancelled challengeResultCancelled2 = this.getTransactionStatus;
        if (challengeResultCancelled2 != null) {
            int i11 = ChallengeResultError + 87;
            ChallengeResultTimeout = i11 % 128;
            if (i11 % 2 == 0) {
                challengeResultCancelled2.getSDKAppID();
                this.getTransactionStatus = null;
                throw null;
            }
            challengeResultCancelled2.getSDKAppID();
            this.getTransactionStatus = null;
        }
        this.getAdditionalDetails = null;
    }

    public final ChallengeResultCancelled getTransactionStatus() {
        int i11 = (ChallengeResultError + 105) % 128;
        ChallengeResultTimeout = i11;
        ChallengeResultCancelled challengeResultCancelled = this.getSDKEphemeralPublicKey;
        ChallengeResultError = (i11 + 57) % 128;
        return challengeResultCancelled;
    }

    @Override // atd.e.getSDKTransactionID
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4 = super.hashCode() * 31;
        String str = this.getSDKAppID;
        if (str != null) {
            iHashCode = str.hashCode();
            ChallengeResultError = (ChallengeResultTimeout + 67) % 128;
        } else {
            iHashCode = 0;
        }
        int i11 = (iHashCode4 + iHashCode) * 31;
        String str2 = this.getSDKReferenceNumber;
        if (str2 != null) {
            ChallengeResultTimeout = (ChallengeResultError + 107) % 128;
            iHashCode2 = str2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i12 = (i11 + iHashCode2) * 31;
        String str3 = this.getDeviceData;
        if (str3 != null) {
            int i13 = ChallengeResultError + 123;
            ChallengeResultTimeout = i13 % 128;
            if (i13 % 2 == 0) {
                iHashCode3 = str3.hashCode();
                int i14 = 41 / 0;
            } else {
                iHashCode3 = str3.hashCode();
            }
        } else {
            iHashCode3 = 0;
        }
        int i15 = (i12 + iHashCode3) * 31;
        atd.i.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        int iHashCode5 = (i15 + (authenticationRequestParameters != null ? authenticationRequestParameters.hashCode() : 0)) * 31;
        String str4 = this.getSDKTransactionID;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // atd.e.getSDKTransactionID, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        ChallengeResultTimeout = (ChallengeResultError + 43) % 128;
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.getSDKAppID);
        parcel.writeString(this.getSDKReferenceNumber);
        parcel.writeString(this.getDeviceData);
        parcel.writeString(this.AuthenticationRequestParameters.name());
        parcel.writeString(this.getSDKTransactionID);
        parcel.writeString(this.BuildConfig);
        parcel.writeString(this.ChallengeResult);
        parcel.writeString(this.getMessageVersion);
        parcel.writeString(this.ChallengeResultCancelled);
        parcel.writeParcelable(this.getSDKEphemeralPublicKey, i11);
        parcel.writeParcelable(this.getTransactionStatus, i11);
        parcel.writeString(this.getAdditionalDetails);
        ChallengeResultError = (ChallengeResultTimeout + 3) % 128;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[0];
        int i11 = ChallengeResultTimeout;
        int i12 = i11 + 55;
        ChallengeResultError = i12 % 128;
        int i13 = i12 % 2;
        String str = getadditionaldetails.getSDKTransactionID;
        if (i13 != 0) {
            throw null;
        }
        int i14 = i11 + 113;
        ChallengeResultError = i14 % 128;
        if (i14 % 2 == 0) {
            return str;
        }
        throw null;
    }

    protected getAdditionalDetails(Parcel parcel) throws Throwable {
        super(parcel);
        this.getSDKAppID = parcel.readString();
        this.getSDKReferenceNumber = parcel.readString();
        this.getDeviceData = parcel.readString();
        atd.i.AuthenticationRequestParameters sDKAppID = atd.i.AuthenticationRequestParameters.getSDKAppID(parcel.readString());
        this.AuthenticationRequestParameters = sDKAppID;
        if (sDKAppID != null) {
            this.getSDKTransactionID = parcel.readString();
            this.BuildConfig = parcel.readString();
            this.ChallengeResult = parcel.readString();
            this.getMessageVersion = parcel.readString();
            this.ChallengeResultCancelled = parcel.readString();
            this.getSDKEphemeralPublicKey = (ChallengeResultCancelled) parcel.readParcelable(ChallengeResultCancelled.class.getClassLoader());
            this.getTransactionStatus = (ChallengeResultCancelled) parcel.readParcelable(ChallengeResultCancelled.class.getClassLoader());
            this.getAdditionalDetails = parcel.readString();
            return;
        }
        Object[] objArr = new Object[1];
        c(new int[]{-942868711, 1172313727, -283720580, -1920681085, 33321963, -1895560300, 1952214385, 1142912588, -115124449, -98992452, 428941361, -1655094648}, 20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        throw new RuntimeException(((String) objArr[0]).intern());
    }
}
