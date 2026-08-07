package atd.ad;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import com.adyen.threeds2.RuntimeErrorEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getSDKAppID[] $VALUES;
    public static final getSDKAppID ACTIVITY_REFERENCE_MISSING;
    private static getSDKAppID ACTIVITY_WEAK_REFERENCE_MISSING;
    private static int AuthenticationRequestParameters;
    public static final getSDKAppID MESSAGE_INDICES_MISMATCH;
    public static final getSDKAppID MESSAGE_VERSIONS_MISMATCH;
    public static final getSDKAppID UNKNOWN;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static long getSDKTransactionID;
    private final String mErrorCode;
    private final String mErrorMessage;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        Object[] objArr = new Object[1];
        a("琑\uf840瑄\ue74f㩚៨掬党紎㎳櫹", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("琑\uf840瑄\ue74f㩚៨掬党紎㎳櫹", TextUtils.getCapsMode("", 0, 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 149, true, "\u000b\u0014\f\u000b\b\u000b\ufff2ￋ\u000f\f\u000f\u000f\u0002ﾽ\u0002\n\u0006\u0011\u000b\u0012\u000fﾽ", (Process.myPid() >> 22) + 7, objArr3);
        UNKNOWN = new getSDKAppID(strIntern, 0, strIntern2, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a("✋쿕❆ꉏහﴣ⚴뮌⸚ж⿲괰㗽᭤㕕ꓬ㲲ᇞʙ龜Ȕ⠌௮酌\u09d6㽰ᄣ裬Ⴃ", TextUtils.getOffsetBefore("", 0), objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a("✋쿕❆ꉏහﴣ⚴뮌⸚ж⿲괰㗽᭤㕕ꓬ㲲ᇞʙ龜Ȕ⠌௮酌\u09d6㽰ᄣ裬Ⴃ", ViewConfiguration.getPressedStateDuration() >> 16, objArr5);
        String strIntern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b(60 - (ViewConfiguration.getJumpTapTimeout() >> 16), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 144, true, "\r\uffc0\u0014ￇ\u000e\u000f\u0004\uffc0\u0013\u000e\u000f\t\u0013\u0012\u0005\u0016\uffc0\u0005\u0007\u0001\u0013\u0013\u0005\r\uffc0\u0005\u0013\u000e\u000f\u0010\u0013\u0005\u0012\uffc0\u0004\u000e\u0001\uffc0\u0014\u0013\u0005\u0015\u0011\u0005\u0012\uffc0\u0005\u0007\u000e\u0005\f\f\u0001\b￣ￎ\b\u0003\u0014\u0001", (ViewConfiguration.getTapTimeout() >> 16) + 55, objArr6);
        MESSAGE_VERSIONS_MISMATCH = new getSDKAppID(strIntern3, 1, strIntern4, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a("ꮌᱹꯁ꘦\ude68\ue81d⋝꺲ꊝ힚⮛렎륥죃ㄪ뇈뀿쉸ۭ誮躁ﮤྜྷ葬蕝\uecc9ᕝ鷙", KeyEvent.getDeadChar(0, 0), objArr7);
        String strIntern5 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a("ꮌᱹꯁ꘦\ude68\ue81d⋝꺲ꊝ힚⮛렎륥죃ㄪ뇈뀿쉸ۭ誮躁ﮤྜྷ葬蕝\uecc9ᕝ鷙", KeyEvent.getMaxKeyCode() >> 16, objArr8);
        String strIntern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b(51 - ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 144, true, "\u0015\u0007\u0014ￂ\u0006\u0010\u0003ￂ\u0016\u0015\u0007\u0017\u0013\u0007\u0014ￂ\u0007\t\u0010\u0007\u000e\u000e\u0003\n￥\uffd0\n\u0005\u0016\u0003\u000fￂ\u0016\uffc9\u0010\u0011\u0006ￂ\u0015\u0007\u0005\u000b\u0006\u0010\u000bￂ\u0007\u0015\u0010\u0011\u0012", 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr9);
        MESSAGE_INDICES_MISMATCH = new getSDKAppID(strIntern5, 2, strIntern6, ((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        b(TextUtils.indexOf("", "") + 31, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 125, true, "\t￼\u0007\ufff6\ufff4\ufffa\u0001￼\u0006\u0006￼\u0000\u0012\ufff8\ufff6\u0001\ufff8\u0005\ufff8\ufff9\ufff8\u0005\u0012\ufffe\ufff4\ufff8\n\u0012\f\u0007￼", View.MeasureSpec.makeMeasureSpec(0, 0) + 5, objArr10);
        String strIntern7 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        b(31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 125, true, "\t￼\u0007\ufff6\ufff4\ufffa\u0001￼\u0006\u0006￼\u0000\u0012\ufff8\ufff6\u0001\ufff8\u0005\ufff8\ufff9\ufff8\u0005\u0012\ufffe\ufff4\ufff8\n\u0012\f\u0007￼", 5 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr11);
        String strIntern8 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(TextUtils.lastIndexOf("", '0') + 41, 145 - ExpandableListView.getPackedPositionType(0L), true, "\u0012\u0015￣ￎ\f\f\u0015\u000e\uffc0\u0013\t\uffc0\u0005\u0003\u000e\u0005\u0012\u0005\u0006\u0005\u0012\uffc0\u000b\u0001\u0005\u0017\uffc0\u0019\u0014\t\u0016\t\u0014\u0003\u0001\uffc0\u0014\u000e\u0005\u0012", View.MeasureSpec.getSize(0) + 3, objArr12);
        ACTIVITY_WEAK_REFERENCE_MISSING = new getSDKAppID(strIntern7, 3, strIntern8, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        b(AndroidCharacter.getMirror('0') - 22, 126 - Color.argb(0, 0, 0, 0), true, "￼\u0000\u0012\ufff8\ufff6\u0001\ufff8\u0005\ufff8\ufff9\ufff8\u0005\u0012\f\u0007￼\t￼\u0007\ufff6\ufff4\ufffa\u0001￼\u0006\u0006", 21 - (ViewConfiguration.getEdgeSlop() >> 16), objArr13);
        String strIntern9 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 27, 126 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, "￼\u0000\u0012\ufff8\ufff6\u0001\ufff8\u0005\ufff8\ufff9\ufff8\u0005\u0012\f\u0007￼\t￼\u0007\ufff6\ufff4\ufffa\u0001￼\u0006\u0006", 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr14);
        String strIntern10 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        a("ᣵ䓵ᢶ郁蛔隦ᐛ퀨ᇀ輿ᵍ웊\u0a34遢߽콓ͳ高〭\uf433㶕ꌓ㥌\ufafc㘀둣⎜\ue344⽶뺤Ⱪ\ue813妶䝑啷ỿ则䡍忇", ViewConfiguration.getTapTimeout() >> 16, objArr15);
        ACTIVITY_REFERENCE_MISSING = new getSDKAppID(strIntern9, 4, strIntern10, ((String) objArr15[0]).intern());
        $VALUES = getSDKReferenceNumber();
        getSDKAppID = (AuthenticationRequestParameters + 7) % 128;
    }

    private getSDKAppID(String str, int i11, String str2, String str3) {
        super(str, i11);
        this.mErrorCode = str2;
        this.mErrorMessage = str3;
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = -9138055263541128455L;
        getDeviceData = 1029304920;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $10 = ($11 + 63) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(getSDKTransactionID ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        $11 = ($10 + 1) % 128;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            $11 = ($10 + 49) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKTransactionID)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0') + 54839), Color.red(0) + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 1401, (char) (KeyEvent.getDeadChar(0, 0) + 16690), View.resolveSize(0, 0) + 22);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    c(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a1  */
    private static void b(int i11, int i12, boolean z11, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        int i14;
        Throwable cause;
        int i15;
        if (str != null) {
            $11 = ($10 + 91) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr2 = new char[i11];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i11) {
                break;
            }
            $11 = ($10 + 73) % 128;
            char c11 = cArr[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i12 + c11);
            cArr2[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getDeviceData);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i16;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(1186 - (ExpandableListView.getPackedPositionForGroup(i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i16) == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i16) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 46);
                    byte b11 = (byte) i16;
                    byte b12 = b11;
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    c(b11, b12, (byte) (b12 | 33), objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i15) == 0L ? 0 : -1)) + 1721, (char) (48634 - (TypedValue.complexToFraction(i15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 24 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    c(b13, b14, (byte) (b14 | 35), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                cArr = cArr;
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
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr3 = new char[i11];
            i14 = 0;
            System.arraycopy(cArr2, 0, cArr3, 0, i11);
            int i18 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, 0, cArr2, i11 - i18, i18);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i19, cArr2, 0, i11 - i19);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr4 = new char[i11];
            getmessageversion.getDeviceData = i14;
            $10 = ($11 + 75) % 128;
            while (true) {
                int i21 = getmessageversion.getDeviceData;
                if (i21 >= i11) {
                    break;
                }
                $11 = ($10 + 93) % 128;
                cArr4[i21] = cArr2[(i11 - i21) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 1722, (char) (View.resolveSizeAndState(0, 0, 0) + 48634), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    c(b15, b16, (byte) (b16 | 35), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 101 - r8
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = atd.ad.getSDKAppID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ad.getSDKAppID.c(short, int, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ getSDKAppID[] getSDKReferenceNumber() {
        getSDKAppID[] getsdkappidArr;
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 + 95;
        getSDKAppID = i12 % 128;
        if (i12 % 2 != 0) {
            getsdkappidArr = new getSDKAppID[3];
            getsdkappidArr[0] = UNKNOWN;
            getsdkappidArr[1] = MESSAGE_VERSIONS_MISMATCH;
            getsdkappidArr[4] = MESSAGE_INDICES_MISMATCH;
            getsdkappidArr[2] = ACTIVITY_WEAK_REFERENCE_MISSING;
            getsdkappidArr[3] = ACTIVITY_REFERENCE_MISSING;
        } else {
            getsdkappidArr = new getSDKAppID[]{UNKNOWN, MESSAGE_VERSIONS_MISMATCH, MESSAGE_INDICES_MISMATCH, ACTIVITY_WEAK_REFERENCE_MISSING, ACTIVITY_REFERENCE_MISSING};
        }
        getSDKAppID = (i11 + 105) % 128;
        return getsdkappidArr;
    }

    static void init$0() {
        $$a = new byte[]{83, -47, 56, 73};
        $$b = 194;
    }

    public static getSDKAppID valueOf(String str) {
        getSDKAppID = (AuthenticationRequestParameters + 85) % 128;
        getSDKAppID getsdkappid = (getSDKAppID) Enum.valueOf(getSDKAppID.class, str);
        int i11 = getSDKAppID + 39;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 83 / 0;
        }
        return getsdkappid;
    }

    public static getSDKAppID[] values() {
        getSDKAppID = (AuthenticationRequestParameters + 11) % 128;
        getSDKAppID[] getsdkappidArr = (getSDKAppID[]) $VALUES.clone();
        int i11 = AuthenticationRequestParameters + 119;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkappidArr;
        }
        throw null;
    }

    public final RuntimeErrorEvent getDeviceData() {
        atd.ab.AuthenticationRequestParameters authenticationRequestParameters = new atd.ab.AuthenticationRequestParameters(this.mErrorCode, this.mErrorMessage, "");
        int i11 = AuthenticationRequestParameters + 99;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    public final RuntimeErrorEvent getSDKAppID() {
        atd.ab.AuthenticationRequestParameters authenticationRequestParameters = new atd.ab.AuthenticationRequestParameters(this.mErrorCode, this.mErrorMessage, "");
        getSDKAppID = (AuthenticationRequestParameters + 113) % 128;
        return authenticationRequestParameters;
    }
}
