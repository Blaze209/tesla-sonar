package atd.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.am.ChallengeResultCancelled;
import atd.az.ChallengeResultTimeout;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ AuthenticationRequestParameters[] $VALUES;
    private static int AuthenticationRequestParameters;
    private static AuthenticationRequestParameters N;
    public static final AuthenticationRequestParameters Y;
    private static int getDeviceData;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private final String mValue;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a("ଞ\ue467这Ł", "\u0000\u0000\u0000\u0000", (char) (KeyEvent.normalizeMetaState(0) + 16783), "ꕞ", TextUtils.indexOf((CharSequence) "", '0', 0) - 639342836, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("ଞ\ue467这Ł", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 16783), "ꕞ", (-639342837) - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr2);
        Y = new AuthenticationRequestParameters(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("뒕羆\uec69瑣", "\u0000\u0000\u0000\u0000", (char) (Color.alpha(0) + 25580), "舟", MotionEvent.axisFromString("") + 1769965237, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("뒕羆\uec69瑣", "\u0000\u0000\u0000\u0000", (char) (25580 - (ViewConfiguration.getLongPressTimeout() >> 16)), "舟", Gravity.getAbsoluteGravity(0, 0) + 1769965236, objArr4);
        N = new AuthenticationRequestParameters(strIntern2, 1, ((String) objArr4[0]).intern());
        $VALUES = getDeviceData();
        getDeviceData = (AuthenticationRequestParameters + 115) % 128;
    }

    private AuthenticationRequestParameters(String str, int i11, String str2) {
        super(str, i11);
        this.mValue = str2;
    }

    public static AuthenticationRequestParameters AuthenticationRequestParameters(String str, atd.am.getDeviceData getdevicedata) throws Throwable {
        AuthenticationRequestParameters = (getDeviceData + 99) % 128;
        AuthenticationRequestParameters sDKAppID = getSDKAppID(str);
        if (sDKAppID == null) {
            Object[] objArr = new Object[1];
            a("뜢նꬍ튒", "\u0000\u0000\u0000\u0000", (char) ((-1) - MotionEvent.axisFromString("")), "팼葔ᛊ㣐ᣦ鈶\uf841\udcae셁뼳甴뗐솼菸곚Ⴈ穫⚌鼚ଢ଼め", 218461879 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT, getdevicedata);
        }
        int i11 = (getDeviceData + 27) % 128;
        AuthenticationRequestParameters = i11;
        getDeviceData = (i11 + 55) % 128;
        return sDKAppID;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        Object charArray;
        char[] charArray2;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        int i12 = $11 + 85;
        $10 = i12 % 128;
        int i13 = 2;
        if (i12 % 2 != 0) {
            int i14 = 28 / 0;
            if (str3 != null) {
                charArray = str3.toCharArray();
            } else {
                charArray = str3;
            }
        } else if (str3 != null) {
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = (char[]) charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + 47) % 128;
            charArray2 = str.toCharArray();
            $10 = ($11 + 117) % 128;
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c11);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr5 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $10 = ($11 + 9) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object method = map.get(num2);
                int i15 = i13;
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(1862 - TextUtils.indexOf("", ""), (char) View.combineMeasuredStates(0, 0), 21 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte b11 = (byte) ($$b - 2);
                    byte b12 = (byte) (-$$a[i15]);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(225 - KeyEvent.keyCodeFromString(""), (char) ExpandableListView.getPackedPositionType(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 44)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i16 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                char c12 = cArr4[iIntValue];
                Object[] objArr5 = new Object[3];
                objArr5[i15] = Integer.valueOf(c12);
                objArr5[1] = Integer.valueOf(i16);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2446 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) Color.green(0), (ViewConfiguration.getTapTimeout() >> 16) + 18);
                    byte b13 = (byte) ($$b - 2);
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i17 = cArr3[iIntValue2] * 32718;
                char c13 = cArr4[iIntValue];
                Object[] objArr7 = new Object[i15];
                objArr7[1] = Integer.valueOf(c13);
                objArr7[0] = Integer.valueOf(i17);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 2970, (char) (TextUtils.indexOf("", "", 0, 0) + 9913), 37 - View.MeasureSpec.getSize(0))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c14 = challengeResultTimeout.getDeviceData;
                cArr3[iIntValue2] = c14;
                int i18 = challengeResultTimeout.getSDKTransactionID;
                cArr5[i18] = (char) (((((long) (c14 ^ cArr[i18])) ^ (getSDKTransactionID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKAppID) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i18 + 1;
                length3 = length3;
                i13 = i15;
                cArr3 = cArr3;
                cArr4 = cArr4;
                num = num;
                num2 = num2;
                cArr = cArr;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr5);
        $11 = ($10 + 49) % 128;
        objArr[0] = str4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 4
            int r6 = 106 - r6
            byte[] r0 = atd.i.AuthenticationRequestParameters.$$a
            int r5 = r5 * 3
            int r1 = 1 - r5
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L19
            r3 = r6
            r4 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r7]
        L2b:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.i.AuthenticationRequestParameters.b(byte, byte, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ AuthenticationRequestParameters[] getDeviceData() {
        int i11 = getDeviceData;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = {Y, N};
        AuthenticationRequestParameters = (i11 + 87) % 128;
        return authenticationRequestParametersArr;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    public static AuthenticationRequestParameters getSDKAppID(String str) {
        AuthenticationRequestParameters authenticationRequestParameters;
        int i11;
        if (str == null) {
            return N;
        }
        AuthenticationRequestParameters[] authenticationRequestParametersArrValues = values();
        int length = authenticationRequestParametersArrValues.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = getDeviceData + 25;
            AuthenticationRequestParameters = i13 % 128;
            if (i13 % 2 == 0) {
                authenticationRequestParameters = authenticationRequestParametersArrValues[i12];
                int i14 = 8 / 0;
                if (str.equalsIgnoreCase(authenticationRequestParameters.mValue)) {
                    i11 = getDeviceData + 57;
                    AuthenticationRequestParameters = i11 % 128;
                    if (i11 % 2 != 0) {
                        return authenticationRequestParameters;
                    }
                    throw null;
                }
            } else {
                authenticationRequestParameters = authenticationRequestParametersArrValues[i12];
                if (str.equalsIgnoreCase(authenticationRequestParameters.mValue)) {
                    i11 = getDeviceData + 57;
                    AuthenticationRequestParameters = i11 % 128;
                    if (i11 % 2 != 0) {
                        return authenticationRequestParameters;
                    }
                    throw null;
                }
            }
        }
        return null;
    }

    static void getSDKReferenceNumber() {
        getSDKTransactionID = -4201337076207898698L;
        getSDKReferenceNumber = 1458778038;
        getSDKAppID = (char) 61762;
    }

    static void init$0() {
        $$a = new byte[]{31, -124, -1, 73};
        $$b = 2;
    }

    public static AuthenticationRequestParameters valueOf(String str) {
        int i11 = AuthenticationRequestParameters + 83;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(AuthenticationRequestParameters.class, str);
            throw null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) Enum.valueOf(AuthenticationRequestParameters.class, str);
        getDeviceData = (AuthenticationRequestParameters + 101) % 128;
        return authenticationRequestParameters;
    }

    public static AuthenticationRequestParameters[] values() {
        int i11 = AuthenticationRequestParameters + 19;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return (AuthenticationRequestParameters[]) $VALUES.clone();
        }
        int i12 = 37 / 0;
        return (AuthenticationRequestParameters[]) $VALUES.clone();
    }

    public final boolean AuthenticationRequestParameters() throws Throwable {
        AuthenticationRequestParameters = (getDeviceData + 21) % 128;
        Object[] objArr = new Object[1];
        a("ଞ\ue467这Ł", "\u0000\u0000\u0000\u0000", (char) (View.combineMeasuredStates(0, 0) + 16783), "ꕞ", (-639342837) - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
        boolean zEquals = ((String) objArr[0]).intern().equals(this.mValue);
        getDeviceData = (AuthenticationRequestParameters + 97) % 128;
        return zEquals;
    }

    public final boolean getSDKAppID() throws Throwable {
        getDeviceData = (AuthenticationRequestParameters + 105) % 128;
        Object[] objArr = new Object[1];
        a("뒕羆\uec69瑣", "\u0000\u0000\u0000\u0000", (char) (25580 - TextUtils.indexOf("", "")), "舟", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1769965235, objArr);
        boolean zEquals = ((String) objArr[0]).intern().equals(this.mValue);
        int i11 = getDeviceData + 73;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }
}
