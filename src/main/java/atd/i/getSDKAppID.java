package atd.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.am.ChallengeResultCancelled;
import atd.az.getMessageVersion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Locale;
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
    private static int AuthenticationRequestParameters;
    public static final getSDKAppID HTML_UI;
    private static String MESSAGE_FORMAT_INVALID_ID;
    public static final getSDKAppID MULTI_SELECT;
    public static final getSDKAppID OUT_OF_BAND;
    public static final getSDKAppID SINGLE_SELECT;
    public static final getSDKAppID SINGLE_TEXT_INPUT;
    private static int getDeviceData;
    private static int getSDKTransactionID;
    private int mId;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getDeviceData = 1;
        getSDKAppID();
        KeyEvent.normalizeMetaState(0);
        TextUtils.lastIndexOf("", '0');
        ExpandableListView.getPackedPositionForChild(0, 0);
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 112, true, KeyEvent.normalizeMetaState(0) + 17, "\u0004\b\ufff5\u0004\u000f\ufff5￼\ufff7\ufffe\ufff9\u0003\u0004\u0005\u0000\ufffe\ufff9\u000f", KeyEvent.keyCodeFromString("") + 11, objArr);
        SINGLE_TEXT_INPUT = new getSDKAppID(((String) objArr[0]).intern(), 0, 1);
        Object[] objArr2 = new Object[1];
        a(Color.blue(0) + 109, true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, "\u0000\ufffb\u0002�\u0007\b\ufff7\ufff9\u0000\ufff9\u0007\u0013\ufff9", View.resolveSizeAndState(0, 0, 0) + 5, objArr2);
        SINGLE_SELECT = new getSDKAppID(((String) objArr2[0]).intern(), 1, 2);
        Object[] objArr3 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0) + 111, true, 12 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0006\ufff5\ufff7\ufffe\ufff7\u0005\u0011\ufffb\u0006\ufffe\u0007\uffff", TextUtils.getTrimmedLength("") + 12, objArr3);
        MULTI_SELECT = new getSDKAppID(((String) objArr3[0]).intern(), 2, 3);
        Object[] objArr4 = new Object[1];
        a(111 - View.MeasureSpec.makeMeasureSpec(0, 0), false, (Process.myTid() >> 22) + 11, "\u0007\u0006\u0011\u0001\ufff8\u0011\ufff4\ufff3\u0000\ufff6\u0001", 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        OUT_OF_BAND = new getSDKAppID(((String) objArr4[0]).intern(), 3, 4);
        Object[] objArr5 = new Object[1];
        a(View.resolveSize(0, 0) + 113, false, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6, "\u0004�￼\u000f\u0005\ufff9\ufff8", (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6, objArr5);
        HTML_UI = new getSDKAppID(((String) objArr5[0]).intern(), 4, 5);
        $VALUES = AuthenticationRequestParameters();
        int i11 = getSDKTransactionID + 41;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getSDKAppID(String str, int i11, int i12) {
        super(str, i11);
        this.mId = i12;
    }

    private static /* synthetic */ getSDKAppID[] AuthenticationRequestParameters() {
        int i11 = getSDKTransactionID + 97;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return new getSDKAppID[]{SINGLE_TEXT_INPUT, SINGLE_SELECT, MULTI_SELECT, OUT_OF_BAND, HTML_UI};
        }
        getSDKAppID[] getsdkappidArr = new getSDKAppID[2];
        getsdkappidArr[0] = SINGLE_TEXT_INPUT;
        getsdkappidArr[0] = SINGLE_SELECT;
        getsdkappidArr[3] = MULTI_SELECT;
        getsdkappidArr[4] = OUT_OF_BAND;
        getsdkappidArr[2] = HTML_UI;
        return getsdkappidArr;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a3  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        int i14;
        Object method;
        Throwable cause;
        int i15;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 35) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            $10 = ($11 + 71) % 128;
            char c11 = cArr[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(AuthenticationRequestParameters);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method2 = map.get(139968170);
                if (method2 != null) {
                    i15 = i16;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', i16, i16) + 1187, (char) ('0' - AndroidCharacter.getMirror('0')), (CdmaCellLocation.convertQuartSecToDecDegrees(i16) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i16) == 0.0d ? 0 : -1)) + 46);
                    byte b11 = (byte) i16;
                    byte b12 = b11;
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method2 = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method2);
                }
                cArr2[i17] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method3 = map.get(-1388326022);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1720, (char) (48635 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 24);
                    byte b13 = (byte) 1;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method3 = cls3.getMethod((String) objArr5[i15], Object.class, Object.class);
                    map.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr4);
                i16 = i15;
                cArr = cArr;
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
        int i18 = i16;
        if (i13 > 0) {
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr3 = new char[i12];
            i14 = i18;
            System.arraycopy(cArr2, i14, cArr3, i14, i12);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i14, cArr2, i12 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i21, cArr2, i14, i12 - i21);
        } else {
            i14 = i18;
        }
        if (z11) {
            char[] cArr4 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i22 = getmessageversion.getDeviceData;
                if (i22 >= i12) {
                    break;
                }
                $11 = ($10 + 121) % 128;
                cArr4[i22] = cArr2[(i12 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object obj = map2.get(-1388326022);
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSize(0, 0) + 1721, (char) (48634 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24);
                    byte b15 = (byte) 1;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method);
                }
                ((Method) method).invoke(null, objArr6);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(short s11, int i11, byte b11, Object[] objArr) {
        int i12 = (b11 * 4) + 4;
        byte[] bArr = $$a;
        int i13 = i11 * 3;
        int i14 = 68 - (s11 * 2);
        byte[] bArr2 = new byte[1 - i13];
        int i15 = 0 - i13;
        int i16 = -1;
        if (bArr == null) {
            i12++;
            i14 = i15 + i12;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i14;
            if (i16 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i17 = bArr[i12];
                i12++;
                i14 += i17;
            }
        }
    }

    static void getSDKAppID() {
        AuthenticationRequestParameters = 1029304904;
    }

    public static getSDKAppID getSDKTransactionID(int i11) {
        getDeviceData = (getSDKTransactionID + 85) % 128;
        getSDKAppID[] getsdkappidArrValues = values();
        int length = getsdkappidArrValues.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = getSDKTransactionID + 13;
            getDeviceData = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = getsdkappidArrValues[i12].mId;
                throw null;
            }
            getSDKAppID getsdkappid = getsdkappidArrValues[i12];
            if (getsdkappid.mId == i11) {
                return getsdkappid;
            }
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 113, true, 14 - TextUtils.indexOf("", "", 0), "&\u001e\ufff9#ￕ\uffd0￪\ufff4\ufff9\uffd0\u0014\u0019\u001c\u0011", TextUtils.indexOf("", "", 0, 0) + 3, objArr);
        throw new atd.z.AuthenticationRequestParameters(String.format(locale, ((String) objArr[0]).intern(), Integer.valueOf(i11)), getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, ChallengeResultCancelled.INVALID_CHALLENGE_TYPE);
    }

    static void init$0() {
        $$a = new byte[]{88, -76, 55, 74};
        $$b = EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE;
    }

    public static getSDKAppID valueOf(String str) {
        int i11 = getSDKTransactionID + 121;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            Enum.valueOf(getSDKAppID.class, str);
            throw null;
        }
        getSDKAppID getsdkappid = (getSDKAppID) Enum.valueOf(getSDKAppID.class, str);
        int i12 = getDeviceData + 67;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 67 / 0;
        }
        return getsdkappid;
    }

    public static getSDKAppID[] values() {
        getSDKTransactionID = (getDeviceData + 13) % 128;
        getSDKAppID[] getsdkappidArr = (getSDKAppID[]) $VALUES.clone();
        getSDKTransactionID = (getDeviceData + 101) % 128;
        return getsdkappidArr;
    }

    public final int getDeviceData() {
        int i11 = getSDKTransactionID + 67;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return this.mId;
        }
        throw null;
    }
}
