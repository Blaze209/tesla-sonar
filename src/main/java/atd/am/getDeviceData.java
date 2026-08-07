package atd.am;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultCompleted;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068"}, d2 = {"Lcom/adyen/threeds2/internal/result/MessageField;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "NONE", "MESSAGE_TYPE", "MESSAGE_VERSION", "ACS_TRANSACTION_ID", "THREEDS_SERVER_TRANSACTION_ID", "SDK_TRANSACTION_ID", "THREEDS_REQUESTOR_APP_URL", "SDK_COUNTER_A_TO_S", "ACS_COUNTER_A_TO_S", "ACS_UI_TYPE", "TRANSACTION_STATUS", "CHALLENGE_COMPLETION_INDICATOR", "ACS_HTML", "ACS_HTML_REFRESH", "CHALLENGE_INFO_HEADER", "CHALLENGE_INFO_TEXT", "CHALLENGE_INFO_LABEL", "CHALLENGE_INFO_TEXT_INDICATOR", "RESEND_INFO_LABEL", "WHY_INFO_LABEL", "WHY_INFO_TEXT", "EXPAND_INFO_LABEL", "EXPAND_INFO_TEXT", "ISSUER_IMAGE", "ISSUER_IMAGE_MEDIUM", "ISSUER_IMAGE_HIGH", "ISSUER_IMAGE_EXTRA_HIGH", "PS_IMAGE", "WHITELISTING_INFO_TEXT", "WHITELISTING_DATA_ENTRY", "SUBMIT_AUTHENTICATION_LABEL", "CHALLENGE_ADD_INFO", "OOB_CONTINUE_LABEL", "OOP_APP_LABEL", "OOB_APP_URL", "CHALLENGE_SELECT_INFO", "MESSAGE_EXTENSION", "MESSAGE_EXTENSION_NAME", "MESSAGE_EXTENSION_ID", "MESSAGE_EXTENSION_CRITICALITY_INDICATOR", "MESSAGE_EXTENSION_DATA", "MESSAGE_EXTENSION_VERSION", "MESSAGE_EXTENSION_CHALLENGE_DATA", "ERROR_CODE", "ERROR_COMPONENT", "ERROR_DESCRIPTION", "ERROR_DETAIL", "ERROR_MESSAGE_TYPE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ getDeviceData[] $VALUES;
    public static final getDeviceData ACS_COUNTER_A_TO_S;
    public static final getDeviceData ACS_HTML;
    public static final getDeviceData ACS_HTML_REFRESH;
    public static final getDeviceData ACS_TRANSACTION_ID;
    public static final getDeviceData ACS_UI_TYPE;
    public static final getDeviceData CHALLENGE_ADD_INFO;
    public static final getDeviceData CHALLENGE_COMPLETION_INDICATOR;
    public static final getDeviceData CHALLENGE_INFO_HEADER;
    public static final getDeviceData CHALLENGE_INFO_LABEL;
    public static final getDeviceData CHALLENGE_INFO_TEXT;
    public static final getDeviceData CHALLENGE_INFO_TEXT_INDICATOR;
    public static final getDeviceData CHALLENGE_SELECT_INFO;
    public static final getDeviceData ERROR_CODE;
    public static final getDeviceData ERROR_COMPONENT;
    public static final getDeviceData ERROR_DESCRIPTION;
    public static final getDeviceData ERROR_DETAIL;
    public static final getDeviceData ERROR_MESSAGE_TYPE;
    public static final getDeviceData EXPAND_INFO_LABEL;
    public static final getDeviceData EXPAND_INFO_TEXT;
    public static final getDeviceData ISSUER_IMAGE;
    public static final getDeviceData ISSUER_IMAGE_EXTRA_HIGH;
    public static final getDeviceData ISSUER_IMAGE_HIGH;
    public static final getDeviceData ISSUER_IMAGE_MEDIUM;
    public static final getDeviceData MESSAGE_EXTENSION;
    public static final getDeviceData MESSAGE_EXTENSION_CHALLENGE_DATA;
    public static final getDeviceData MESSAGE_EXTENSION_CRITICALITY_INDICATOR;
    public static final getDeviceData MESSAGE_EXTENSION_DATA;
    public static final getDeviceData MESSAGE_EXTENSION_ID;
    public static final getDeviceData MESSAGE_EXTENSION_NAME;
    public static final getDeviceData MESSAGE_EXTENSION_VERSION;
    public static final getDeviceData MESSAGE_TYPE;
    public static final getDeviceData MESSAGE_VERSION;
    public static final getDeviceData NONE;
    public static final getDeviceData OOB_APP_URL;
    public static final getDeviceData OOB_CONTINUE_LABEL;
    public static final getDeviceData OOP_APP_LABEL;
    public static final getDeviceData PS_IMAGE;
    public static final getDeviceData RESEND_INFO_LABEL;
    public static final getDeviceData SDK_COUNTER_A_TO_S;
    public static final getDeviceData SDK_TRANSACTION_ID;
    public static final getDeviceData SUBMIT_AUTHENTICATION_LABEL;
    public static final getDeviceData THREEDS_REQUESTOR_APP_URL;
    public static final getDeviceData THREEDS_SERVER_TRANSACTION_ID;
    public static final getDeviceData TRANSACTION_STATUS;
    public static final getDeviceData WHITELISTING_DATA_ENTRY;
    public static final getDeviceData WHITELISTING_INFO_TEXT;
    public static final getDeviceData WHY_INFO_LABEL;
    public static final getDeviceData WHY_INFO_TEXT;
    private static int getDeviceData;
    private static int[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private final String identifier;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        getSDKAppID();
        NONE = new getDeviceData("NONE", 0, "Non Applicable");
        MESSAGE_TYPE = new getDeviceData("MESSAGE_TYPE", 1, "messageType");
        MESSAGE_VERSION = new getDeviceData("MESSAGE_VERSION", 2, "messageVersion");
        ACS_TRANSACTION_ID = new getDeviceData("ACS_TRANSACTION_ID", 3, "acsTransID");
        THREEDS_SERVER_TRANSACTION_ID = new getDeviceData("THREEDS_SERVER_TRANSACTION_ID", 4, "threeDSServerTransID");
        SDK_TRANSACTION_ID = new getDeviceData("SDK_TRANSACTION_ID", 5, "sdkTransID");
        THREEDS_REQUESTOR_APP_URL = new getDeviceData("THREEDS_REQUESTOR_APP_URL", 6, "threeDSRequestorAppURL");
        SDK_COUNTER_A_TO_S = new getDeviceData("SDK_COUNTER_A_TO_S", 7, "sdkCounterStoA");
        ACS_COUNTER_A_TO_S = new getDeviceData("ACS_COUNTER_A_TO_S", 8, "acsCounterAtoS");
        ACS_UI_TYPE = new getDeviceData("ACS_UI_TYPE", 9, "acsUiType");
        TRANSACTION_STATUS = new getDeviceData("TRANSACTION_STATUS", 10, "transStatus");
        CHALLENGE_COMPLETION_INDICATOR = new getDeviceData("CHALLENGE_COMPLETION_INDICATOR", 11, "challengeCompletionInd");
        ACS_HTML = new getDeviceData("ACS_HTML", 12, "acsHTML");
        ACS_HTML_REFRESH = new getDeviceData("ACS_HTML_REFRESH", 13, "acsHTMLRefresh");
        CHALLENGE_INFO_HEADER = new getDeviceData("CHALLENGE_INFO_HEADER", 14, "challengeInfoHeader");
        CHALLENGE_INFO_TEXT = new getDeviceData("CHALLENGE_INFO_TEXT", 15, "challengeInfoText");
        CHALLENGE_INFO_LABEL = new getDeviceData("CHALLENGE_INFO_LABEL", 16, "challengeInfoLabel");
        CHALLENGE_INFO_TEXT_INDICATOR = new getDeviceData("CHALLENGE_INFO_TEXT_INDICATOR", 17, "challengeInfoTextIndicator");
        RESEND_INFO_LABEL = new getDeviceData("RESEND_INFO_LABEL", 18, "resendInformationLabel");
        WHY_INFO_LABEL = new getDeviceData("WHY_INFO_LABEL", 19, "whyInfoLabel");
        WHY_INFO_TEXT = new getDeviceData("WHY_INFO_TEXT", 20, "whyInfoText");
        EXPAND_INFO_LABEL = new getDeviceData("EXPAND_INFO_LABEL", 21, "expandInfoLabel");
        EXPAND_INFO_TEXT = new getDeviceData("EXPAND_INFO_TEXT", 22, "expandInfoText");
        ISSUER_IMAGE = new getDeviceData("ISSUER_IMAGE", 23, "issuerImage");
        ISSUER_IMAGE_MEDIUM = new getDeviceData("ISSUER_IMAGE_MEDIUM", 24, "medium");
        ISSUER_IMAGE_HIGH = new getDeviceData("ISSUER_IMAGE_HIGH", 25, "high");
        ISSUER_IMAGE_EXTRA_HIGH = new getDeviceData("ISSUER_IMAGE_EXTRA_HIGH", 26, "extraHigh");
        PS_IMAGE = new getDeviceData("PS_IMAGE", 27, "psImage");
        WHITELISTING_INFO_TEXT = new getDeviceData("WHITELISTING_INFO_TEXT", 28, "whitelistingInfoText");
        WHITELISTING_DATA_ENTRY = new getDeviceData("WHITELISTING_DATA_ENTRY", 29, "whitelistingDataEntry");
        SUBMIT_AUTHENTICATION_LABEL = new getDeviceData("SUBMIT_AUTHENTICATION_LABEL", 30, "submitAuthenticationLabel");
        CHALLENGE_ADD_INFO = new getDeviceData("CHALLENGE_ADD_INFO", 31, "challengeAddInfo");
        OOB_CONTINUE_LABEL = new getDeviceData("OOB_CONTINUE_LABEL", 32, "oobContinueLabel");
        OOP_APP_LABEL = new getDeviceData("OOP_APP_LABEL", 33, "oobAppLabel");
        OOB_APP_URL = new getDeviceData("OOB_APP_URL", 34, "oobAppURL");
        CHALLENGE_SELECT_INFO = new getDeviceData("CHALLENGE_SELECT_INFO", 35, "challengeSelectInfo");
        MESSAGE_EXTENSION = new getDeviceData("MESSAGE_EXTENSION", 36, "messageExtension");
        MESSAGE_EXTENSION_NAME = new getDeviceData("MESSAGE_EXTENSION_NAME", 37, "name");
        MESSAGE_EXTENSION_ID = new getDeviceData("MESSAGE_EXTENSION_ID", 38, "id");
        MESSAGE_EXTENSION_CRITICALITY_INDICATOR = new getDeviceData("MESSAGE_EXTENSION_CRITICALITY_INDICATOR", 39, "criticalityIndicator");
        Object[] objArr = new Object[1];
        a(new int[]{186141087, -222174402}, (Process.myPid() >> 22) + 4, objArr);
        MESSAGE_EXTENSION_DATA = new getDeviceData("MESSAGE_EXTENSION_DATA", 40, ((String) objArr[0]).intern());
        MESSAGE_EXTENSION_VERSION = new getDeviceData("MESSAGE_EXTENSION_VERSION", 41, "version");
        MESSAGE_EXTENSION_CHALLENGE_DATA = new getDeviceData("MESSAGE_EXTENSION_CHALLENGE_DATA", 42, "challengeData");
        ERROR_CODE = new getDeviceData("ERROR_CODE", 43, "errorCode");
        ERROR_COMPONENT = new getDeviceData("ERROR_COMPONENT", 44, "errorComponent");
        ERROR_DESCRIPTION = new getDeviceData("ERROR_DESCRIPTION", 45, "errorDescription");
        ERROR_DETAIL = new getDeviceData("ERROR_DETAIL", 46, "errorDetail");
        ERROR_MESSAGE_TYPE = new getDeviceData("ERROR_MESSAGE_TYPE", 47, "errorMessageType");
        getDeviceData[] deviceData = getDeviceData();
        $VALUES = deviceData;
        on0.a.a(deviceData);
        int i11 = getDeviceData + 97;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getDeviceData(String str, int i11, String str2) {
        super(str, i11);
        this.identifier = str2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x03e5  */
    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        float f11;
        int i12;
        Throwable cause;
        int length;
        int[] iArr2;
        Object method;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i13 = 2;
        if (iArr3 != null) {
            i12 = 16;
            int i14 = $11 + 35;
            f11 = BitmapDescriptorFactory.HUE_RED;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i15 = 0;
            loop0: while (true) {
                while (true) {
                    if (i15 >= length) {
                        break loop0;
                    }
                    int i16 = $11 + 49;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i15])};
                            Map map = getMessageVersion.timedout;
                            Object obj = map.get(2050190164);
                            if (obj != null) {
                                method = obj;
                            } else {
                                Class cls2 = (Class) getMessageVersion.getSDKTransactionID(1861 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 21);
                                byte b11 = (byte) 3;
                                byte b12 = (byte) (b11 - 3);
                                Object[] objArr3 = new Object[1];
                                b(b11, b12, b12, objArr3);
                                method = cls2.getMethod((String) objArr3[0], cls);
                                map.put(2050190164, method);
                            }
                            iArr2[i15] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                            cArr = cArr;
                            i15 = i15;
                            iArr3 = iArr3;
                            length = length;
                        } catch (Throwable th2) {
                            cause = th2.getCause();
                            if (cause != null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        int i17 = i15;
                        char[] cArr3 = cArr;
                        int[] iArr4 = iArr3;
                        int i18 = length;
                        Object[] objArr4 = {Integer.valueOf(iArr4[i17])};
                        Map map2 = getMessageVersion.timedout;
                        Object method2 = map2.get(2050190164);
                        if (method2 == null) {
                            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1863, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 22 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            byte b13 = (byte) 3;
                            byte b14 = (byte) (b13 - 3);
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, b14, objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], cls);
                            map2.put(2050190164, method2);
                        }
                        iArr2[i17] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                        i15 = i17 + 1;
                        cArr = cArr3;
                        iArr3 = iArr4;
                        length = i18;
                    }
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
            i12 = 16;
        }
        char[] cArr4 = cArr;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKAppID;
        if (iArr6 != null) {
            $11 = ($10 + 61) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i19 = 0;
            while (i19 < length3) {
                int i21 = $10 + 85;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    Object[] objArr6 = {Integer.valueOf(iArr6[i19])};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        float f12 = f11;
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 1862, (char) (TypedValue.complexToFraction(0, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(0, f12, f12) == f12 ? 0 : -1)), 21 - (Process.myPid() >> 22));
                        byte b15 = (byte) 3;
                        byte b16 = (byte) (b15 - 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr7[i19] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    length3 = length3;
                    iArr6 = iArr6;
                    iArr7 = iArr7;
                    i19 = i19;
                } else {
                    cArr2 = cArr2;
                    int[] iArr8 = iArr6;
                    int i22 = length3;
                    int[] iArr9 = iArr7;
                    int i23 = i19;
                    Object[] objArr8 = {Integer.valueOf(iArr8[i23])};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(2050190164);
                    if (method4 == null) {
                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID(1863 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), AndroidCharacter.getMirror('0') - 27);
                        byte b17 = (byte) 3;
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr9 = new Object[1];
                        b(b17, b18, b18, objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], cls);
                        map4.put(2050190164, method4);
                    }
                    iArr9[i23] = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    i19 = i23 + 1;
                    length3 = i22;
                    iArr6 = iArr8;
                    iArr7 = iArr9;
                }
                cArr2 = cArr2;
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            iArr6 = iArr7;
        }
        char[] cArr5 = cArr2;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i24 = challengeResultCompleted.getDeviceData;
            if (i24 >= iArr.length) {
                objArr[0] = new String(cArr5, 0, i11);
                return;
            }
            $11 = ($10 + 45) % 128;
            int i25 = iArr[i24];
            char c11 = (char) (i25 >> 16);
            cArr4[0] = c11;
            char c12 = (char) i25;
            cArr4[1] = c12;
            char c13 = (char) (iArr[i24 + 1] >> 16);
            cArr4[i13] = c13;
            char c14 = (char) iArr[i24 + 1];
            cArr4[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            ChallengeResultCompleted.getSDKAppID(iArr5);
            int i26 = 0;
            while (i26 < i12) {
                int i27 = challengeResultCompleted.getSDKAppID ^ iArr5[i26];
                challengeResultCompleted.getSDKAppID = i27;
                int sDKAppID = ChallengeResultCompleted.getSDKAppID(i27);
                Object[] objArr10 = new Object[4];
                objArr10[3] = challengeResultCompleted;
                objArr10[i13] = challengeResultCompleted;
                objArr10[1] = Integer.valueOf(sDKAppID);
                objArr10[0] = challengeResultCompleted;
                Map map5 = getMessageVersion.timedout;
                Object method5 = map5.get(929629307);
                if (method5 == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1299 - Color.alpha(0), (char) (49369 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollBarSize() >> 8) + 33);
                    byte b19 = (byte) 0;
                    byte b21 = b19;
                    Object[] objArr11 = new Object[1];
                    b(b19, b21, b21, objArr11);
                    method5 = cls6.getMethod((String) objArr11[0], Object.class, cls, Object.class, Object.class);
                    map5.put(929629307, method5);
                }
                int iIntValue = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i26++;
                i12 = 16;
            }
            int i28 = challengeResultCompleted.getSDKAppID;
            int i29 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i29;
            challengeResultCompleted.getSDKReferenceNumber = i28;
            i12 = 16;
            int i31 = i28 ^ iArr5[16];
            challengeResultCompleted.getSDKReferenceNumber = i31;
            int i32 = i29 ^ iArr5[17];
            challengeResultCompleted.getSDKAppID = i32;
            cArr4[0] = (char) (i32 >>> 16);
            cArr4[1] = (char) i32;
            cArr4[i13] = (char) (i31 >>> 16);
            cArr4[3] = (char) i31;
            ChallengeResultCompleted.getSDKAppID(iArr5);
            int i33 = challengeResultCompleted.getDeviceData;
            cArr5[i33 * 2] = cArr4[0];
            cArr5[(i33 * 2) + 1] = cArr4[1];
            cArr5[(i33 * 2) + 2] = cArr4[i13];
            cArr5[(i33 * 2) + 3] = cArr4[3];
            int i34 = i13;
            Object[] objArr12 = new Object[i34];
            objArr12[1] = challengeResultCompleted;
            objArr12[0] = challengeResultCompleted;
            Map map6 = getMessageVersion.timedout;
            Object method6 = map6.get(1109131256);
            if (method6 == null) {
                Class cls7 = (Class) getMessageVersion.getSDKTransactionID(2061 - View.getDefaultSize(0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (Process.myTid() >> 22) + 17);
                byte b22 = (byte) ($$b & 7);
                byte b23 = (byte) (b22 - 1);
                Object[] objArr13 = new Object[1];
                b(b22, b23, b23, objArr13);
                method6 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map6.put(1109131256, method6);
            }
            ((Method) method6).invoke(null, objArr12);
            i13 = i34;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.am.getDeviceData.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r5 = 120 - r5
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.am.getDeviceData.b(int, short, int, java.lang.Object[]):void");
    }

    private static final /* synthetic */ getDeviceData[] getDeviceData() {
        int i11 = (getSDKReferenceNumber + 111) % 128;
        getDeviceData = i11;
        getDeviceData[] getdevicedataArr = {NONE, MESSAGE_TYPE, MESSAGE_VERSION, ACS_TRANSACTION_ID, THREEDS_SERVER_TRANSACTION_ID, SDK_TRANSACTION_ID, THREEDS_REQUESTOR_APP_URL, SDK_COUNTER_A_TO_S, ACS_COUNTER_A_TO_S, ACS_UI_TYPE, TRANSACTION_STATUS, CHALLENGE_COMPLETION_INDICATOR, ACS_HTML, ACS_HTML_REFRESH, CHALLENGE_INFO_HEADER, CHALLENGE_INFO_TEXT, CHALLENGE_INFO_LABEL, CHALLENGE_INFO_TEXT_INDICATOR, RESEND_INFO_LABEL, WHY_INFO_LABEL, WHY_INFO_TEXT, EXPAND_INFO_LABEL, EXPAND_INFO_TEXT, ISSUER_IMAGE, ISSUER_IMAGE_MEDIUM, ISSUER_IMAGE_HIGH, ISSUER_IMAGE_EXTRA_HIGH, PS_IMAGE, WHITELISTING_INFO_TEXT, WHITELISTING_DATA_ENTRY, SUBMIT_AUTHENTICATION_LABEL, CHALLENGE_ADD_INFO, OOB_CONTINUE_LABEL, OOP_APP_LABEL, OOB_APP_URL, CHALLENGE_SELECT_INFO, MESSAGE_EXTENSION, MESSAGE_EXTENSION_NAME, MESSAGE_EXTENSION_ID, MESSAGE_EXTENSION_CRITICALITY_INDICATOR, MESSAGE_EXTENSION_DATA, MESSAGE_EXTENSION_VERSION, MESSAGE_EXTENSION_CHALLENGE_DATA, ERROR_CODE, ERROR_COMPONENT, ERROR_DESCRIPTION, ERROR_DETAIL, ERROR_MESSAGE_TYPE};
        getSDKReferenceNumber = (i11 + 79) % 128;
        return getdevicedataArr;
    }

    static void getSDKAppID() {
        getSDKAppID = new int[]{-2065691136, -1829923303, 89577975, -449690872, 314507963, -1976870338, 930585311, -494377725, -1931081197, 406302851, -515298593, 540448253, -19251593, 1962391707, 1901850901, -889574202, 353462622, 1696585591};
    }

    static void init$0() {
        $$a = new byte[]{79, -70, -97, 13};
        $$b = 113;
    }

    public static getDeviceData valueOf(String str) {
        getSDKReferenceNumber = (getDeviceData + 17) % 128;
        getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
        getDeviceData = (getSDKReferenceNumber + 21) % 128;
        return getdevicedata;
    }

    public static getDeviceData[] values() {
        int i11 = getDeviceData + 95;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return (getDeviceData[]) $VALUES.clone();
        }
        throw null;
    }

    public final String AuthenticationRequestParameters() {
        int i11 = getDeviceData + 85;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return this.identifier;
        }
        throw null;
    }
}
