package atd.ad;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.completed;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
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
    private static char AuthenticationRequestParameters;
    public static final AuthenticationRequestParameters CHALLENGE_PRESENTATION_FAILURE;
    public static final AuthenticationRequestParameters CRYPTO_FAILURE;
    public static final AuthenticationRequestParameters DEVICE_DATA_FAILURE;
    private static AuthenticationRequestParameters SECURE_CHANNEL_SETUP_FAILURE;
    private static AuthenticationRequestParameters UNKNOWN_DIRECTORY_SERVER;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private final String mErrorMessage;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a(30 - (ViewConfiguration.getEdgeSlop() >> 16), "\u000f\u001c\u0002($,%\u0004-\u001d\u0000\u001b0$.$!\u0006\u001c!\u000b%\u001d\n\u0004!(\u001e\u0016*", (byte) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(KeyEvent.getDeadChar(0, 0) + 31, View.MeasureSpec.makeMeasureSpec(0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, true, "\n\uffff\u0006￡ￌ\u0003\u0010\u0013\n\u0007\uffff\u0004ﾾ\f\r\u0007\u0012\uffff\u0012\f\u0003\u0011\u0003\u0010\u000eﾾ\u0003\u0005\f\u0003\n", 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        CHALLENGE_PRESENTATION_FAILURE = new AuthenticationRequestParameters(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(14 - Color.green(0), "\u0015\u001c\u001b\u0005\u001e\r\u001d\n\u0004!(\u001e\u0016*", (byte) (120 - View.resolveSize(0, 0)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(22 - KeyEvent.normalizeMetaState(0), 237 - TextUtils.indexOf((CharSequence) "", '0'), false, "\u0004\u000f\ufffe\r\u0005\u0006\u0000ﾽ\u0003\ufffe\u0006\t\u0012\u000f\u0002ￋ￠\u000f\u0016\r\u0011\f", (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr4);
        CRYPTO_FAILURE = new AuthenticationRequestParameters(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, "\u0016.\u0004'\u000f* \u0018\u0006!\u0003!\f\u0001\u001e'\u001c\u001a㘩", (byte) (74 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b(Color.blue(0) + 20, 231 - TextUtils.indexOf("", "", 0), false, "\u0005\u0018\u0005ￄ\n\u0005\r\u0010\u0019\u0016\tￒ￨\t\u001a\r\u0007\tￄ\b", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, objArr6);
        DEVICE_DATA_FAILURE = new AuthenticationRequestParameters(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(28 - TextUtils.getOffsetBefore("", 0), "$0\u0013\u001c\u0016*\u001c\u0011!\u0001㗠㗠,$\"&0\u001d\"\u0005\u001d\n\u0004!(\u001e\u0016*", (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(29 - View.resolveSizeAndState(0, 0, 0), "&0\u0007\u000e\u00110\u0000\u0007)/㗿㗿,\u0011-\u00070\u0018\u000b\u000e,\u0015+\u0014\u000e\t\u00110㖿", (byte) (Drawable.resolveOpacity(0, 0) + 11), objArr8);
        SECURE_CHANNEL_SETUP_FAILURE = new AuthenticationRequestParameters(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 24, " (\u0012.\n\u0010&  '\u0016*\u0014\u001c\u0007\u0017\u0018!$0\u0019**\u0016", (byte) (52 - TextUtils.indexOf("", "", 0, 0)), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(25 - View.resolveSizeAndState(0, 0, 0), "\"\f0\f\u0017\u001f\u00070\b\u0016\u00110\u0006\u0015\u001b\u0011-+\u0011\u0003\u0011)0\u0011㗭", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 57), objArr10);
        UNKNOWN_DIRECTORY_SERVER = new AuthenticationRequestParameters(strIntern5, 4, ((String) objArr10[0]).intern());
        $VALUES = getSDKAppID();
        int i11 = getDeviceData + 121;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private AuthenticationRequestParameters(String str, int i11, String str2) {
        super(str, i11);
        this.mErrorMessage = str2;
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c11;
        int i14;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = getSDKTransactionID;
        Class cls = Integer.TYPE;
        char c12 = '0';
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        method = obj;
                        i14 = i15;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 2314, (char) (TextUtils.indexOf("", c12, i15, i15) + 1), ExpandableListView.getPackedPositionChild(0L) + 25);
                        byte b12 = (byte) i15;
                        i14 = i15;
                        Object[] objArr3 = new Object[1];
                        c(b12, (byte) (b12 | 55), b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i14], cls);
                        map.put(-1709775791, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    i15 = i14;
                    charArray = charArray;
                    c12 = '0';
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = charArray;
        int i17 = i15;
        Object[] objArr4 = {Integer.valueOf(AuthenticationRequestParameters)};
        Map map2 = getMessageVersion.timedout;
        Object method2 = map2.get(-1709775791);
        if (method2 == null) {
            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 24 - View.MeasureSpec.getSize(i17));
            byte b13 = (byte) i17;
            Object[] objArr5 = new Object[1];
            c(b13, (byte) (b13 | 55), b13, objArr5);
            method2 = cls3.getMethod((String) objArr5[i17], cls);
            map2.put(-1709775791, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = 1;
            $11 = ($10 + 1) % 128;
            i13 = i11 - 1;
            cArr4[i13] = (char) (cArr3[i13] - b11);
        } else {
            i12 = 1;
            i13 = i11;
        }
        if (i13 > i12) {
            int i18 = $10 + 67;
            $11 = i18 % 128;
            char c13 = 2;
            if (i18 % 2 == 0) {
                completedVar.getSDKTransactionID = i12;
            } else {
                completedVar.getSDKTransactionID = 0;
            }
            while (true) {
                int i19 = completedVar.getSDKTransactionID;
                if (i19 >= i13) {
                    break;
                }
                char c14 = cArr3[i19];
                completedVar.getSDKAppID = c14;
                char c15 = cArr3[i19 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    cArr4[i19] = (char) (c14 - b11);
                    cArr4[i19 + 1] = (char) (c15 - b11);
                    c11 = c13;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = completedVar;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = completedVar;
                    objArr6[9] = completedVar;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = completedVar;
                    objArr6[6] = completedVar;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = completedVar;
                    objArr6[3] = completedVar;
                    objArr6[c13] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    objArr6[0] = completedVar;
                    c11 = c13;
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(700818725);
                    if (method3 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1920 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf((CharSequence) "", '0') + 30);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        c(b14, b15, b15, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(700818725, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i21 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i21) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c11] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls6 = (Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionType(0L) + 1721, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 48635), (ViewConfiguration.getEdgeSlop() >> 16) + 24);
                            byte b16 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            c(b16, (byte) (b16 | 49), b16, objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls7 = Integer.TYPE;
                            method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i22 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i23 = completedVar.getSDKTransactionID;
                        cArr4[i23] = cArr[iIntValue2];
                        cArr4[i23 + 1] = cArr[i22];
                    } else {
                        int i24 = completedVar.getDeviceData;
                        int i25 = completedVar.AuthenticationRequestParameters;
                        if (i24 == i25) {
                            int i26 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i26;
                            int i27 = ((i21 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i27;
                            int i28 = (i25 * cCharValue) + i27;
                            int i29 = completedVar.getSDKTransactionID;
                            cArr4[i29] = cArr[(i24 * cCharValue) + i26];
                            cArr4[i29 + 1] = cArr[i28];
                        } else {
                            int i31 = (i24 * cCharValue) + i21;
                            int i32 = (i25 * cCharValue) + completedVar.getMessageVersion;
                            int i33 = completedVar.getSDKTransactionID;
                            cArr4[i33] = cArr[i31];
                            cArr4[i33 + 1] = cArr[i32];
                        }
                        completedVar.getSDKTransactionID += 2;
                        c13 = c11;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                c13 = c11;
            }
        }
        $10 = ($11 + 113) % 128;
        for (int i34 = 0; i34 < i11; i34++) {
            cArr4[i34] = (char) (cArr4[i34] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x018e  */
    /* JADX WARN: Code duplicated, block: B:42:0x018f  */
    private static void b(int i11, int i12, boolean z11, String str, int i13, Object[] objArr) throws Throwable {
        int i14;
        Throwable cause;
        int i15;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr = new char[i11];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        $11 = ($10 + 43) % 128;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i11) {
                break;
            }
            char c11 = charArray[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i12 + c11);
            cArr[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getSDKReferenceNumber);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i16;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(i16) + 1187, (char) Color.red(i16), 46 - KeyEvent.keyCodeFromString(""));
                    byte b11 = (byte) i16;
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    c(b11, (byte) (b11 | 54), b11, objArr3);
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
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0') + 1722, (char) (48634 - Color.green(i15)), 24 - View.MeasureSpec.getMode(i15));
                    int i18 = i15;
                    byte b12 = (byte) i18;
                    Object[] objArr5 = new Object[1];
                    c(b12, (byte) (b12 | 56), b12, objArr5);
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
        if (i13 > 0) {
            $11 = ($10 + 71) % 128;
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr2 = new char[i11];
            i14 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i11);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, 0, cArr, i11 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, i21, cArr, 0, i11 - i21);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr3 = new char[i11];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i22 = getmessageversion.getDeviceData;
                if (i22 >= i11) {
                    break;
                }
                $10 = ($11 + 67) % 128;
                cArr3[i22] = cArr[(i11 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(Color.green(0) + 1721, (char) (48634 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24);
                    byte b13 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    c(b13, (byte) (b13 | 56), b13, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = 122 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = atd.ad.AuthenticationRequestParameters.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r1
            int r7 = r7 + 1
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ad.AuthenticationRequestParameters.c(short, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ AuthenticationRequestParameters[] getSDKAppID() {
        int i11 = (getDeviceData + 47) % 128;
        getSDKAppID = i11;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = {CHALLENGE_PRESENTATION_FAILURE, CRYPTO_FAILURE, DEVICE_DATA_FAILURE, SECURE_CHANNEL_SETUP_FAILURE, UNKNOWN_DIRECTORY_SERVER};
        getDeviceData = (i11 + 9) % 128;
        return authenticationRequestParametersArr;
    }

    static void getSDKReferenceNumber() {
        getSDKTransactionID = new char[]{52413, 52410, 52377, 53062, 53063, 52383, 52366, 52395, 52376, 52369, 52397, 52373, 53060, 52400, 52381, 52407, 52402, 52361, 52398, 52409, 52396, 52364, 52414, 52408, 52401, 52378, 52359, 52394, 53056, 52374, 52393, 52353, 52375, 52363, 52362, 52464, 53061, 52370, 52392, 52368, 52406, 52365, 52478, 52379, 52391, 52411, 52360, 52405, 52415};
        AuthenticationRequestParameters = (char) 63811;
        getSDKReferenceNumber = 1029305058;
    }

    static void init$0() {
        $$a = new byte[]{46, -33, 18, -76};
        $$b = 15;
    }

    public static AuthenticationRequestParameters valueOf(String str) {
        int i11 = getSDKAppID + 93;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(AuthenticationRequestParameters.class, str);
            throw null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) Enum.valueOf(AuthenticationRequestParameters.class, str);
        int i12 = getSDKAppID + 75;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    public static AuthenticationRequestParameters[] values() throws CloneNotSupportedException {
        int i11 = getDeviceData + 93;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            $VALUES.clone();
            throw null;
        }
        AuthenticationRequestParameters[] authenticationRequestParametersArr = (AuthenticationRequestParameters[]) $VALUES.clone();
        int i12 = getSDKAppID + 103;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 79 / 0;
        }
        return authenticationRequestParametersArr;
    }

    public final SDKRuntimeException AuthenticationRequestParameters() {
        SDKRuntimeException sDKRuntimeException = new SDKRuntimeException(this.mErrorMessage, null, null);
        getDeviceData = (getSDKAppID + 7) % 128;
        return sDKRuntimeException;
    }

    public final SDKRuntimeException getSDKTransactionID() {
        int i11 = getSDKAppID + 123;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return AuthenticationRequestParameters();
        }
        int i12 = 33 / 0;
        return AuthenticationRequestParameters();
    }
}
