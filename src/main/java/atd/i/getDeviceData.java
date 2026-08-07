package atd.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.am.ChallengeResultCancelled;
import atd.az.ChallengeResultTimeout;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getDeviceData[] $VALUES;
    private static char AuthenticationRequestParameters;
    public static final getDeviceData CHALLENGE_REQUEST;
    public static final getDeviceData CHALLENGE_RESPONSE;
    public static final getDeviceData ERROR;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String mValue;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getDeviceData = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a("虔鸴\uf63bⴍ", "\u0000\u0000\u0000\u0000", (char) ((Process.myPid() >> 22) + 3574), "黏플荋觕皅貼疞痳ꂵ菹羕ﻏ\uf5f7蚻ባ䎅\udd9f", Color.argb(0, 0, 0, 0) + 1000223878, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\uda4b䕁䭯䓢", "\u0000\u0000\u0000\u0000", (char) (Color.red(0) + 57931), "膢鐂꾁裎", Color.red(0), objArr2);
        CHALLENGE_REQUEST = new getDeviceData(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("轫\ua7e9\uee98覤", "\u0000\u0000\u0000\u0000", (char) (ExpandableListView.getPackedPositionChild(0L) + 42223), "뾗\ue755奲땨뮊ⳳ듽괕굴㇟煪蟵䐣ࠠ퀷ﺽᨔ慘", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("몒槯㈴ࣦ", "\u0000\u0000\u0000\u0000", (char) (58930 - (Process.myPid() >> 22)), "벩ꋠ퍗梦", TextUtils.getOffsetAfter("", 0), objArr4);
        CHALLENGE_RESPONSE = new getDeviceData(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a("欩╇緿ꈫ", "\u0000\u0000\u0000\u0000", (char) (ImageFormat.getBitsPerPixel(0) + 11134), "統ㇲ\ue970펙褽", (-14334102) - TextUtils.indexOf((CharSequence) "", '0'), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("\ud979郲畐⎍", "\u0000\u0000\u0000\u0000", (char) (36213 - View.MeasureSpec.getSize(0)), "ᗌꂾ킀ᄧ", ViewConfiguration.getTapTimeout() >> 16, objArr6);
        ERROR = new getDeviceData(strIntern3, 2, ((String) objArr6[0]).intern());
        $VALUES = getSDKTransactionID();
        getSDKTransactionID = (getDeviceData + 101) % 128;
    }

    private getDeviceData(String str, int i11, String str2) {
        super(str, i11);
        this.mValue = str2;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        if (str3 != null) {
            $10 = ($11 + 65) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = charArray2.length;
        char[] cArr3 = new char[length2];
        int i12 = 0;
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(charArray2, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c11);
        int i13 = 2;
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $10 = ($11 + 111) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object method = map.get(num2);
                int i14 = i13;
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 1862, (char) ((-16777216) - Color.rgb(i12, i12, i12)), 21 - View.getDefaultSize(i12, i12));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) KeyEvent.keyCodeFromString(""), TextUtils.getCapsMode("", 0, 0) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i15 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i14] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[1] = Integer.valueOf(i15);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2446 - Drawable.resolveOpacity(0, 0), (char) TextUtils.getOffsetBefore("", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 + 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i16 = cArr2[iIntValue2] * 32718;
                char c12 = cArr3[iIntValue];
                i13 = i14;
                Object[] objArr7 = new Object[i13];
                objArr7[1] = Integer.valueOf(c12);
                objArr7[0] = Integer.valueOf(i16);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID((-16774247) - Color.rgb(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 9914), 37 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr2[iIntValue2] = c13;
                int i17 = challengeResultTimeout.getSDKTransactionID;
                cArr4[i17] = (char) (((((long) (c13 ^ cArr[i17])) ^ (getSDKAppID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i17 + 1;
                $10 = ($11 + 113) % 128;
                cArr = cArr;
                length3 = length3;
                cArr2 = cArr2;
                num = num;
                num2 = num2;
                i12 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void b(short s11, byte b11, int i11, Object[] objArr) {
        byte[] bArr = $$a;
        int i12 = s11 * 2;
        int i13 = 3 - (b11 * 3);
        int i14 = (i11 * 4) + 102;
        byte[] bArr2 = new byte[1 - i12];
        int i15 = 0 - i12;
        int i16 = -1;
        if (bArr == null) {
            i14 += i15;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i14;
            i13++;
            if (i16 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i14 += bArr[i13];
        }
    }

    public static getDeviceData getSDKReferenceNumber(String str) throws Throwable {
        getDeviceData[] getdevicedataArr;
        int length;
        int i11 = getDeviceData + 29;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            getdevicedataArr = (getDeviceData[]) getDeviceData.class.getEnumConstants();
            length = getdevicedataArr.length;
        } else {
            getdevicedataArr = (getDeviceData[]) getDeviceData.class.getEnumConstants();
            length = getdevicedataArr.length;
        }
        int i12 = 0;
        while (i12 < length) {
            getSDKTransactionID = (getDeviceData + 55) % 128;
            getDeviceData getdevicedata = getdevicedataArr[i12];
            if (getdevicedata.getSDKAppID().equals(str)) {
                return getdevicedata;
            }
            i12++;
            getDeviceData = (getSDKTransactionID + 21) % 128;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        a("菚鰺쯦萭", "\u0000\u0000\u0000\u0000", (char) ((-1) - MotionEvent.axisFromString("")), "ᆟꛒ绐喢头靔ꑽ\uf4fa蘣\ueb84揙刉䕜㍻닭༼﵆麑絶駻\u0ef6ꗘ襺댷\u2438ꃻ轜ꐣ팃㰦梩㳟긐", (-425969021) - TextUtils.indexOf("", "", 0, 0), objArr);
        throw new atd.z.AuthenticationRequestParameters(String.format(locale, ((String) objArr[0]).intern(), str), getSDKTransactionID.MESSAGE_RECEIVED_INVALID, ChallengeResultCancelled.INVALID_MESSAGE_TYPE);
    }

    private static /* synthetic */ getDeviceData[] getSDKTransactionID() {
        int i11 = (getDeviceData + 61) % 128;
        getSDKTransactionID = i11;
        getDeviceData[] getdevicedataArr = {CHALLENGE_REQUEST, CHALLENGE_RESPONSE, ERROR};
        getDeviceData = (i11 + 115) % 128;
        return getdevicedataArr;
    }

    static void init$0() {
        $$a = new byte[]{29, -9, 65, -64};
        $$b = EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE;
    }

    public static getDeviceData valueOf(String str) {
        getDeviceData = (getSDKTransactionID + 33) % 128;
        getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
        int i11 = getSDKTransactionID + 115;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 44 / 0;
        }
        return getdevicedata;
    }

    public static getDeviceData[] values() {
        int i11 = getDeviceData + 53;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return (getDeviceData[]) $VALUES.clone();
        }
        int i12 = 58 / 0;
        return (getDeviceData[]) $VALUES.clone();
    }

    public final String getSDKAppID() {
        int i11 = getSDKTransactionID;
        String str = this.mValue;
        getDeviceData = (i11 + 87) % 128;
        return str;
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = -4201337076207898698L;
        getSDKReferenceNumber = 1458778038;
        AuthenticationRequestParameters = (char) 34210;
    }
}
