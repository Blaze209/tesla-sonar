package atd.d;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ getSDKAppID[] $VALUES;
        public static final getSDKAppID APPLICATION_JOSE;
        public static final getSDKAppID APPLICATION_JSON;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static int getSDKReferenceNumber;
        private final String mValue;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getDeviceData = 0;
            getSDKReferenceNumber = 1;
            getSDKTransactionID();
            Object[] objArr = new Object[1];
            a((Process.myPid() >> 22) + 172, true, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0000\u0004\u0004\ufff5\u0002\u0003\u0007\ufffe\u0013\u0002\u0003�\b\ufff5\ufff7�", KeyEvent.normalizeMetaState(0) + 4, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((Process.myPid() >> 22) + EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, false, (ViewConfiguration.getScrollBarSize() >> 8) + 16, "\t\t\u0005\u0002￼\ufffa\r\u0002\b\u0007\uffc8\u0003\f\b\u0007\ufffa", Gravity.getAbsoluteGravity(0, 0) + 15, objArr2);
            APPLICATION_JSON = new getSDKAppID(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(TextUtils.getOffsetBefore("", 0) + 172, true, Color.rgb(0, 0, 0) + 16777232, "\u0000\u0004\u0004\ufff5\ufff9\u0007\u0003\ufffe\u0013\u0002\u0003�\b\ufff5\ufff7�", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(198 - ImageFormat.getBitsPerPixel(0), true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, "\r\ufffa￼\u0002\u0005\t\t\ufffa\ufffe\f\b\u0003\uffc8\u0007\b\u0002", View.resolveSizeAndState(0, 0, 0) + 8, objArr4);
            APPLICATION_JOSE = new getSDKAppID(strIntern2, 1, ((String) objArr4[0]).intern());
            $VALUES = AuthenticationRequestParameters();
            getSDKReferenceNumber = (getDeviceData + 69) % 128;
        }

        private getSDKAppID(String str, int i11, String str2) {
            super(str, i11);
            this.mValue = str2;
        }

        private static /* synthetic */ getSDKAppID[] AuthenticationRequestParameters() {
            int i11 = getSDKReferenceNumber + 89;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                return new getSDKAppID[]{APPLICATION_JSON, APPLICATION_JOSE};
            }
            getSDKAppID[] getsdkappidArr = new getSDKAppID[3];
            getsdkappidArr[1] = APPLICATION_JSON;
            getsdkappidArr[1] = APPLICATION_JOSE;
            return getsdkappidArr;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x019f  */
        /* JADX WARN: Code duplicated, block: B:41:0x01a0  */
        private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
            int i14;
            char c11;
            Throwable cause;
            int i15;
            Object method;
            $10 = ($11 + 65) % 128;
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
                $10 = ($11 + 101) % 128;
                char c12 = charArray[i17];
                getmessageversion.getSDKTransactionID = c12;
                char c13 = (char) (i11 + c12);
                cArr[i17] = c13;
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[1] = Integer.valueOf(getSDKAppID);
                    objArr2[i16] = Integer.valueOf(c13);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(139968170);
                    if (obj != null) {
                        i15 = i16;
                        method = obj;
                    } else {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1185 - TextUtils.indexOf((CharSequence) "", '0'), (char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', i16) + 47);
                        byte b11 = (byte) i16;
                        byte b12 = b11;
                        i15 = i16;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
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
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(i15) + 1721, (char) (AndroidCharacter.getMirror('0') + 48586), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int i18 = i15;
                        byte b13 = (byte) i18;
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 1), objArr5);
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
            char c14 = '0';
            if (i13 > 0) {
                getmessageversion.getSDKReferenceNumber = i13;
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
                    if (method3 != null) {
                        c11 = c14;
                    } else {
                        c11 = c14;
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1721, (char) (48634 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.lastIndexOf("", c11, 0) + 25);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 1);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 1), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1388326022, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                    c14 = c11;
                }
                cArr = cArr3;
            }
            objArr[0] = new String(cArr);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 2
                int r6 = 68 - r6
                byte[] r0 = atd.d.getDeviceData.getSDKAppID.$$a
                int r7 = r7 * 3
                int r1 = r7 + 1
                int r5 = r5 * 3
                int r5 = 3 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                int r5 = r5 + 1
                int r3 = r3 + 1
                r4 = r0[r5]
            L2a:
                int r4 = -r4
                int r6 = r6 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getDeviceData.getSDKAppID.b(int, int, int, java.lang.Object[]):void");
        }

        static void getSDKTransactionID() {
            getSDKAppID = 1029304841;
        }

        static void init$0() {
            $$a = new byte[]{34, -58, -116, -81};
            $$b = 82;
        }

        public static getSDKAppID valueOf(String str) {
            int i11 = getSDKReferenceNumber + 13;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                return (getSDKAppID) Enum.valueOf(getSDKAppID.class, str);
            }
            Enum.valueOf(getSDKAppID.class, str);
            throw null;
        }

        public static getSDKAppID[] values() {
            getSDKReferenceNumber = (getDeviceData + 85) % 128;
            getSDKAppID[] getsdkappidArr = (getSDKAppID[]) $VALUES.clone();
            getSDKReferenceNumber = (getDeviceData + 81) % 128;
            return getsdkappidArr;
        }

        public final String getSDKReferenceNumber() {
            int i11 = (getDeviceData + 47) % 128;
            getSDKReferenceNumber = i11;
            String str = this.mValue;
            getDeviceData = (i11 + 19) % 128;
            return str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            int i11 = (getDeviceData + 99) % 128;
            getSDKReferenceNumber = i11;
            String str = this.mValue;
            getDeviceData = (i11 + 11) % 128;
            return str;
        }

        static getSDKAppID AuthenticationRequestParameters(String str) {
            getDeviceData = (getSDKReferenceNumber + 51) % 128;
            getSDKAppID[] getsdkappidArrValues = values();
            getSDKReferenceNumber = (getDeviceData + 87) % 128;
            for (getSDKAppID getsdkappid : getsdkappidArrValues) {
                getSDKReferenceNumber = (getDeviceData + 55) % 128;
                if (getsdkappid.mValue.equalsIgnoreCase(str)) {
                    int i11 = getSDKReferenceNumber + 87;
                    getDeviceData = i11 % 128;
                    if (i11 % 2 == 0) {
                        return getsdkappid;
                    }
                    throw null;
                }
            }
            return null;
        }

        public final getSDKReferenceNumber getSDKReferenceNumber(Charset charset) {
            getSDKReferenceNumber getsdkreferencenumber = new getSDKReferenceNumber(this, charset);
            getDeviceData = (getSDKReferenceNumber + 39) % 128;
            return getsdkreferencenumber;
        }
    }

    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int BuildConfig;
        private static int ChallengeResult;
        private static char getSDKAppID;
        private static long getSDKReferenceNumber;
        private final getSDKAppID getDeviceData;
        private final Charset getSDKTransactionID;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ChallengeResult = 0;
            BuildConfig = 1;
            getSDKReferenceNumber = -4201337076207898698L;
            AuthenticationRequestParameters = 1458778038;
            getSDKAppID = (char) 61760;
        }

        getSDKReferenceNumber(getSDKAppID getsdkappid, Charset charset) {
            this.getDeviceData = getsdkappid;
            this.getSDKTransactionID = charset == null ? atd.a.AuthenticationRequestParameters.AuthenticationRequestParameters : charset;
        }

        private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            char[] charArray2;
            Integer num = -2032575242;
            Integer num2 = 262890898;
            if (str3 != null) {
                charArray = str3.toCharArray();
                $11 = ($10 + 93) % 128;
            } else {
                charArray = str3;
            }
            char[] cArr = charArray;
            char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
            if (str != null) {
                charArray2 = str.toCharArray();
                $11 = ($10 + 45) % 128;
            } else {
                charArray2 = str;
            }
            char[] cArr2 = charArray2;
            atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int length2 = charArray3.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(cArr2, 0, cArr3, 0, length);
            System.arraycopy(charArray3, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c11);
            int i12 = 2;
            cArr4[2] = (char) (cArr4[2] + ((char) i11));
            int length3 = cArr.length;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKTransactionID = 0;
            while (challengeResultTimeout.getSDKTransactionID < length3) {
                $11 = ($10 + 29) % 128;
                try {
                    Object[] objArr2 = {challengeResultTimeout};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(num2);
                    int i13 = i12;
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(0, 0, 0) + 1862, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Object.class);
                        map.put(num2, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    Object[] objArr4 = {challengeResultTimeout};
                    Object method2 = map.get(num);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                        map.put(num, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    int i14 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                    Object[] objArr5 = new Object[3];
                    objArr5[i13] = Integer.valueOf(cArr4[iIntValue]);
                    objArr5[1] = Integer.valueOf(i14);
                    objArr5[0] = challengeResultTimeout;
                    Object method3 = map.get(484986213);
                    Class cls2 = Integer.TYPE;
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2446, (char) TextUtils.indexOf("", "", 0, 0), 'B' - AndroidCharacter.getMirror('0'));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, b14, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                        map.put(484986213, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    int i15 = cArr3[iIntValue2] * 32718;
                    char c12 = cArr4[iIntValue];
                    Object[] objArr7 = new Object[i13];
                    objArr7[1] = Integer.valueOf(c12);
                    objArr7[0] = Integer.valueOf(i15);
                    Object method4 = map.get(-919285918);
                    if (method4 == null) {
                        method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0) + 2970, (char) (9914 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36)).getMethod("g", cls2, cls2);
                        map.put(-919285918, method4);
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                    char c13 = challengeResultTimeout.getDeviceData;
                    cArr3[iIntValue2] = c13;
                    int i16 = challengeResultTimeout.getSDKTransactionID;
                    cArr5[i16] = (char) (((((long) (c13 ^ cArr[i16])) ^ (getSDKReferenceNumber ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKAppID) ^ (-4201337076207898698L)))));
                    challengeResultTimeout.getSDKTransactionID = i16 + 1;
                    i12 = i13;
                    cArr = cArr;
                    length3 = length3;
                    cArr3 = cArr3;
                    cArr4 = cArr4;
                    num = num;
                    num2 = num2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r0 = 1 - r6
                int r8 = r8 * 4
                int r8 = 106 - r8
                byte[] r1 = atd.d.getDeviceData.getSDKReferenceNumber.$$a
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L19
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r5
            L2e:
                int r4 = -r4
                int r7 = r7 + r4
                int r8 = r8 + 1
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getDeviceData.getSDKReferenceNumber.b(short, int, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{11, 12, 68, 127};
            $$b = 35;
        }

        public final String AuthenticationRequestParameters() throws Throwable {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getDeviceData.getSDKReferenceNumber());
            Object[] objArr = new Object[1];
            a("ሉ䎄的휪", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 10871), "즴", (-2075950061) - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
            sb2.append(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a("ȶ럤ᓠ䧧", "\u0000\u0000\u0000\u0000", (char) Color.alpha(0), "ꠄ䢲⥒〩\ude48\u0cfa竕", (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 524819454, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("鰅ꥣ愑뽮", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getOffsetBefore("", 0) + 28257), "寜", 296313756 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
            sb2.append(((String) objArr3[0]).intern());
            sb2.append(this.getSDKTransactionID.name());
            String string = sb2.toString();
            int i11 = BuildConfig + 83;
            ChallengeResult = i11 % 128;
            if (i11 % 2 == 0) {
                return string;
            }
            throw null;
        }

        public final getSDKAppID getDeviceData() {
            int i11 = (ChallengeResult + 27) % 128;
            BuildConfig = i11;
            getSDKAppID getsdkappid = this.getDeviceData;
            int i12 = i11 + 23;
            ChallengeResult = i12 % 128;
            if (i12 % 2 == 0) {
                return getsdkappid;
            }
            throw null;
        }

        public final Charset getSDKReferenceNumber() {
            int i11 = ChallengeResult;
            Charset charset = this.getSDKTransactionID;
            int i12 = i11 + 45;
            BuildConfig = i12 % 128;
            if (i12 % 2 != 0) {
                return charset;
            }
            throw null;
        }

        public final String toString() throws Throwable {
            int i11 = BuildConfig + 103;
            ChallengeResult = i11 % 128;
            if (i11 % 2 == 0) {
                return AuthenticationRequestParameters();
            }
            AuthenticationRequestParameters();
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        View.getDefaultSize(0, 0);
        SystemClock.uptimeMillis();
        Process.getElapsedCpuTime();
        KeyEvent.getModifierMetaStateMask();
        Color.alpha(0);
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getLongPressTimeout();
        Color.argb(0, 0, 0, 0);
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        MotionEvent.axisFromString("");
        ViewConfiguration.getScrollBarFadeDuration();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getPressedStateDuration();
        getSDKTransactionID = (getSDKReferenceNumber + 75) % 128;
    }

    public static getSDKReferenceNumber AuthenticationRequestParameters(Map<String, List<String>> map) throws Throwable {
        Map.Entry<String, List<String>> next;
        Object[] objArr;
        List<String> value;
        if (map == null) {
            return null;
        }
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i11 = getSDKTransactionID + 63;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 != 0) {
                next = it.next();
                int i12 = 0 / 0;
                if (next != null) {
                    objArr = new Object[1];
                    a(250 - Color.blue(0), false, (ViewConfiguration.getTouchSlop() >> 8) + 12, "\f\u000b\u0011\u0002\u000b\u0011ￊ\ufff1\u0016\r\u0002￠", 11 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
                    if (((String) objArr[0]).intern().equalsIgnoreCase(next.getKey()) && (value = next.getValue()) != null) {
                        for (String str : value) {
                            getSDKTransactionID = (getSDKReferenceNumber + 3) % 128;
                            if (str != null) {
                                Object[] objArr2 = new Object[1];
                                a(AndroidCharacter.getMirror('0') + 162, true, Color.blue(0) + 1, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                                getSDKReferenceNumber sDKAppID = getSDKAppID(str.split(((String) objArr2[0]).intern()));
                                if (sDKAppID != null) {
                                    return sDKAppID;
                                }
                            }
                        }
                    }
                } else {
                    continue;
                }
            } else {
                next = it.next();
                if (next != null) {
                    objArr = new Object[1];
                    a(250 - Color.blue(0), false, (ViewConfiguration.getTouchSlop() >> 8) + 12, "\f\u000b\u0011\u0002\u000b\u0011ￊ\ufff1\u0016\r\u0002￠", 11 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
                    if (((String) objArr[0]).intern().equalsIgnoreCase(next.getKey())) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x01bc  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        int i14;
        char c11;
        Throwable cause;
        int i15;
        Object method;
        int i16 = $11 + 95;
        $10 = i16 % 128;
        int i17 = 2;
        if (i16 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr = new char[i12];
        int i18 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i19 = getmessageversion.getDeviceData;
            if (i19 >= i12) {
                break;
            }
            $10 = ($11 + 61) % 128;
            char c12 = charArray[i19];
            getmessageversion.getSDKTransactionID = c12;
            char c13 = (char) (i11 + c12);
            cArr[i19] = c13;
            try {
                Object[] objArr2 = new Object[i17];
                objArr2[1] = Integer.valueOf(getDeviceData);
                objArr2[i18] = Integer.valueOf(c13);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    i15 = i18;
                    method = obj;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1186 - (TypedValue.complexToFraction(i18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), Color.blue(i18) + 46);
                    byte b11 = (byte) i18;
                    byte b12 = b11;
                    i15 = i18;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    int i21 = i15;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(i21, i21, i21) + 1721, (char) (KeyEvent.normalizeMetaState(i21) + 48634), 24 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, (byte) (b14 + 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                $10 = ($11 + 17) % 128;
                charArray = charArray;
                i17 = 2;
                i18 = 0;
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
            $10 = ($11 + 29) % 128;
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr2 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i22 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, 0, cArr, i12 - i22, i22);
            int i23 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, i23, cArr, 0, i12 - i23);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr3 = new char[i12];
            getmessageversion.getDeviceData = i14;
            char c14 = 1;
            $11 = ($10 + 1) % 128;
            while (true) {
                int i24 = getmessageversion.getDeviceData;
                if (i24 >= i12) {
                    break;
                }
                cArr3[i24] = cArr[(i12 - i24) - 1];
                Object[] objArr6 = new Object[2];
                objArr6[c14] = getmessageversion;
                objArr6[0] = getmessageversion;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 != null) {
                    c11 = 1;
                } else {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetBefore("", 0) + 1721, (char) (TextUtils.getTrimmedLength("") + 48634), 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    c11 = 1;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                $10 = ($11 + 49) % 128;
                c14 = c11;
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r0 = atd.d.getDeviceData.$$a
            int r7 = r7 * 2
            int r7 = 68 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
        L29:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getDeviceData.b(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0098  */
    /* JADX WARN: Code duplicated, block: B:9:0x0068 A[PHI: r12
      0x0068: PHI (r12v2 java.lang.String[]) = (r12v1 java.lang.String[]), (r12v8 java.lang.String[]) binds: [B:8:0x0066, B:5:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    private static Charset getDeviceData(String str) throws Throwable {
        String[] strArrSplit;
        Object[] objArr;
        int i11 = getSDKReferenceNumber + 119;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            int iIndexOf = 16272 - TextUtils.indexOf("", "", 1, 0);
            ViewConfiguration.getDoubleTapTimeout();
            Object[] objArr2 = new Object[1];
            a(iIndexOf, true, 0, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 << (ViewConfiguration.getJumpTapTimeout() / 16), objArr2);
            strArrSplit = str.split(((String) objArr2[0]).intern());
            if (strArrSplit.length > 0) {
                objArr = new Object[1];
                a(257 - (Process.myPid() >> 22), false, 7 - TextUtils.getOffsetBefore("", 0), "\t\ufffb\n\ufff9\ufffe\ufff7\b", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, objArr);
                if (((String) objArr[0]).intern().equalsIgnoreCase(strArrSplit[0])) {
                    getSDKTransactionID = (getSDKReferenceNumber + 27) % 128;
                    try {
                        return Charset.forName(strArrSplit[1]);
                    } catch (IllegalArgumentException unused) {
                        return null;
                    }
                }
            }
        } else {
            Object[] objArr3 = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0) + EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, false, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            strArrSplit = str.split(((String) objArr3[0]).intern());
            if (strArrSplit.length > 1) {
                objArr = new Object[1];
                a(257 - (Process.myPid() >> 22), false, 7 - TextUtils.getOffsetBefore("", 0), "\t\ufffb\n\ufff9\ufffe\ufff7\b", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, objArr);
                if (((String) objArr[0]).intern().equalsIgnoreCase(strArrSplit[0])) {
                    getSDKTransactionID = (getSDKReferenceNumber + 27) % 128;
                    return Charset.forName(strArrSplit[1]);
                }
            }
        }
        int i12 = getSDKTransactionID + 13;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static getSDKReferenceNumber getSDKAppID(String... strArr) throws Throwable {
        Charset deviceData;
        getSDKAppID getsdkappidAuthenticationRequestParameters;
        getSDKReferenceNumber = (getSDKTransactionID + 39) % 128;
        if (strArr.length > 0) {
            getsdkappidAuthenticationRequestParameters = getSDKAppID.AuthenticationRequestParameters(strArr[0]);
            if (getsdkappidAuthenticationRequestParameters == null) {
                return null;
            }
            if (strArr.length > 1) {
                deviceData = getDeviceData(strArr[1]);
                getSDKReferenceNumber = (getSDKTransactionID + 43) % 128;
            } else {
                deviceData = null;
            }
        } else {
            deviceData = null;
            getsdkappidAuthenticationRequestParameters = null;
        }
        if (getsdkappidAuthenticationRequestParameters != null) {
            return getsdkappidAuthenticationRequestParameters.getSDKReferenceNumber(deviceData);
        }
        getSDKReferenceNumber = (getSDKTransactionID + 103) % 128;
        return null;
    }

    static void getSDKTransactionID() {
        getDeviceData = 1029305086;
    }

    static void init$0() {
        $$a = new byte[]{117, -87, -71, 36};
        $$b = 191;
    }
}
