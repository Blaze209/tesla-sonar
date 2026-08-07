package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n*\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimSerialNumber;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "simSerialNumber", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getErrorDescription extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResultCancelled = 1;
    private static boolean getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimSerialNumber$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static char[] getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            AuthenticationRequestParameters = 1;
            getSDKReferenceNumber = new char[]{63814, 52410, 52415, 63813};
            getSDKTransactionID = (char) 63814;
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = atd.w.getErrorDescription.getSDKAppID.$$a
                int r7 = r7 * 6
                int r7 = 103 - r7
                int r5 = r5 * 17
                int r1 = r5 + 21
                int r6 = r6 * 37
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r5 = r5 + 20
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r5
                r4 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r3 = r0[r6]
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-8)
                int r6 = r6 + 1
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getErrorDescription.getSDKAppID.a(int, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0185  */
        /* JADX WARN: Code duplicated, block: B:48:0x0199  */
        /* JADX WARN: Code duplicated, block: B:51:0x01df  */
        /* JADX WARN: Code duplicated, block: B:52:0x01ea A[Catch: all -> 0x0365, TryCatch #0 {all -> 0x0365, blocks: (B:15:0x0054, B:19:0x00b9, B:18:0x0071, B:25:0x00e2, B:29:0x0130, B:49:0x019b, B:53:0x0245, B:57:0x0258, B:61:0x02e4, B:60:0x028e, B:52:0x01ea, B:28:0x00f7), top: B:78:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0256  */
        /* JADX WARN: Code duplicated, block: B:59:0x028d  */
        /* JADX WARN: Code duplicated, block: B:60:0x028e A[Catch: all -> 0x0365, TryCatch #0 {all -> 0x0365, blocks: (B:15:0x0054, B:19:0x00b9, B:18:0x0071, B:25:0x00e2, B:29:0x0130, B:49:0x019b, B:53:0x0245, B:57:0x0258, B:61:0x02e4, B:60:0x028e, B:52:0x01ea, B:28:0x00f7), top: B:78:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0305  */
        /* JADX WARN: Code duplicated, block: B:65:0x030c  */
        /* JADX WARN: Code duplicated, block: B:66:0x0332  */
        private static void b(int i11, String str, byte b11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            Map map;
            Object obj;
            Object method;
            int iIntValue;
            int i13;
            int i14;
            int i15;
            Object method2;
            Object method3;
            if (str != null) {
                int i16 = $11 + 9;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.completed completedVar = new atd.az.completed();
            char[] cArr2 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            int i17 = 0;
            if (cArr2 != null) {
                $11 = ($10 + 59) % 128;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj2 = map2.get(-1709775791);
                        if (obj2 != null) {
                            method3 = obj2;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(i17, i17, i17) + 16779529, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 24 - (Process.myPid() >> 22));
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr3 = new Object[1];
                            c(b12, b13, (byte) (b13 & 55), objArr3);
                            method3 = cls2.getMethod((String) objArr3[0], cls);
                            map2.put(-1709775791, method3);
                        }
                        cArr3[i18] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                        i18++;
                        cArr3 = cArr3;
                        cArr = cArr;
                        i17 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = cArr;
            Object[] objArr4 = {Integer.valueOf(getSDKTransactionID)};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method4 = map3.get(-1709775791);
            if (method4 == null) {
                Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2312, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr5 = new Object[1];
                c(b14, b15, (byte) (b15 & 55), objArr5);
                method4 = cls3.getMethod((String) objArr5[0], cls);
                map3.put(-1709775791, method4);
            }
            char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
            char[] cArr5 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr5[i12] = (char) (cArr4[i12] - b11);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                char c11 = 11;
                $10 = ($11 + 11) % 128;
                completedVar.getSDKTransactionID = 0;
                while (true) {
                    int i19 = completedVar.getSDKTransactionID;
                    if (i19 >= i12) {
                        break;
                    }
                    int i21 = $10 + 37;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        char c12 = cArr4[i19];
                        completedVar.getSDKAppID = c12;
                        char c13 = cArr4[i19];
                        completedVar.getSDKReferenceNumber = c13;
                        if (c12 == c13) {
                            cArr5[i19] = (char) (completedVar.getSDKAppID - b11);
                            cArr5[i19 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                        } else {
                            Object[] objArr6 = new Object[13];
                            objArr6[12] = completedVar;
                            objArr6[c11] = Integer.valueOf(cCharValue);
                            objArr6[10] = completedVar;
                            objArr6[r4] = completedVar;
                            objArr6[r7] = Integer.valueOf(cCharValue);
                            objArr6[7] = completedVar;
                            objArr6[6] = completedVar;
                            objArr6[5] = Integer.valueOf(cCharValue);
                            objArr6[4] = completedVar;
                            objArr6[3] = completedVar;
                            objArr6[r6] = Integer.valueOf(cCharValue);
                            objArr6[1] = completedVar;
                            objArr6[0] = completedVar;
                            map = atd.a.getMessageVersion.timedout;
                            obj = map.get(700818725);
                            if (obj != null) {
                                method = obj;
                            } else {
                                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - Gravity.getAbsoluteGravity(0, 0), (char) Color.blue(0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                                byte b16 = (byte) 0;
                                byte b17 = (byte) (b16 - 1);
                                Object[] objArr7 = new Object[1];
                                c(b16, b17, (byte) (b17 + 1), objArr7);
                                String str2 = (String) objArr7[0];
                                Class cls5 = Integer.TYPE;
                                method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                                map.put(700818725, method);
                            }
                            iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                            i13 = completedVar.getSDKEphemeralPublicKey;
                            if (iIntValue == i13) {
                                Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                                method2 = map.get(-248084636);
                                if (method2 != null) {
                                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1721, (char) (48634 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                    byte b18 = (byte) 0;
                                    byte b19 = (byte) (b18 - 1);
                                    Object[] objArr9 = new Object[1];
                                    c(b18, b19, (byte) (b19 & 49), objArr9);
                                    String str3 = (String) objArr9[0];
                                    Class cls7 = Integer.TYPE;
                                    method2 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                    map.put(-248084636, method2);
                                }
                                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                                int i22 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                                int i23 = completedVar.getSDKTransactionID;
                                cArr5[i23] = cArr2[iIntValue2];
                                cArr5[i23 + 1] = cArr2[i22];
                            } else {
                                i14 = completedVar.getDeviceData;
                                i15 = completedVar.AuthenticationRequestParameters;
                                if (i14 == i15) {
                                    int i24 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                    completedVar.getMessageVersion = i24;
                                    int i25 = ((i13 + cCharValue) - 1) % cCharValue;
                                    completedVar.getSDKEphemeralPublicKey = i25;
                                    int i26 = (i15 * cCharValue) + i25;
                                    int i27 = completedVar.getSDKTransactionID;
                                    cArr5[i27] = cArr2[(i14 * cCharValue) + i24];
                                    cArr5[i27 + 1] = cArr2[i26];
                                    $11 = ($10 + 83) % 128;
                                } else {
                                    int i28 = (i14 * cCharValue) + i13;
                                    int i29 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                    int i31 = completedVar.getSDKTransactionID;
                                    cArr5[i31] = cArr2[i28];
                                    cArr5[i31 + 1] = cArr2[i29];
                                }
                            }
                        }
                    } else {
                        char c14 = cArr4[i19];
                        completedVar.getSDKAppID = c14;
                        char c15 = cArr4[i19 + 1];
                        completedVar.getSDKReferenceNumber = c15;
                        if (c14 == c15) {
                            cArr5[i19] = (char) (completedVar.getSDKAppID - b11);
                            cArr5[i19 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                        } else {
                            Object[] objArr10 = new Object[13];
                            objArr10[12] = completedVar;
                            objArr10[c11] = Integer.valueOf(cCharValue);
                            objArr10[10] = completedVar;
                            objArr10[r4] = completedVar;
                            objArr10[r7] = Integer.valueOf(cCharValue);
                            objArr10[7] = completedVar;
                            objArr10[6] = completedVar;
                            objArr10[5] = Integer.valueOf(cCharValue);
                            objArr10[4] = completedVar;
                            objArr10[3] = completedVar;
                            objArr10[r6] = Integer.valueOf(cCharValue);
                            objArr10[1] = completedVar;
                            objArr10[0] = completedVar;
                            map = atd.a.getMessageVersion.timedout;
                            obj = map.get(700818725);
                            if (obj != null) {
                                method = obj;
                            } else {
                                Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - Gravity.getAbsoluteGravity(0, 0), (char) Color.blue(0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                                byte b110 = (byte) 0;
                                byte b111 = (byte) (b110 - 1);
                                Object[] objArr11 = new Object[1];
                                c(b110, b111, (byte) (b111 + 1), objArr11);
                                String str4 = (String) objArr11[0];
                                Class cls9 = Integer.TYPE;
                                method = cls8.getMethod(str4, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class);
                                map.put(700818725, method);
                            }
                            iIntValue = ((Integer) ((Method) method).invoke(null, objArr10)).intValue();
                            i13 = completedVar.getSDKEphemeralPublicKey;
                            if (iIntValue == i13) {
                                Object[] objArr12 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                                method2 = map.get(-248084636);
                                if (method2 != null) {
                                    Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1721, (char) (48634 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                    byte b112 = (byte) 0;
                                    byte b113 = (byte) (b112 - 1);
                                    Object[] objArr13 = new Object[1];
                                    c(b112, b113, (byte) (b113 & 49), objArr13);
                                    String str5 = (String) objArr13[0];
                                    Class cls11 = Integer.TYPE;
                                    method2 = cls10.getMethod(str5, Object.class, Object.class, cls11, cls11, Object.class, Object.class, cls11, cls11, Object.class, cls11, Object.class);
                                    map.put(-248084636, method2);
                                }
                                int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                                int i210 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                                int i211 = completedVar.getSDKTransactionID;
                                cArr5[i211] = cArr2[iIntValue3];
                                cArr5[i211 + 1] = cArr2[i210];
                            } else {
                                i14 = completedVar.getDeviceData;
                                i15 = completedVar.AuthenticationRequestParameters;
                                if (i14 == i15) {
                                    int i212 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                    completedVar.getMessageVersion = i212;
                                    int i213 = ((i13 + cCharValue) - 1) % cCharValue;
                                    completedVar.getSDKEphemeralPublicKey = i213;
                                    int i214 = (i15 * cCharValue) + i213;
                                    int i215 = completedVar.getSDKTransactionID;
                                    cArr5[i215] = cArr2[(i14 * cCharValue) + i212];
                                    cArr5[i215 + 1] = cArr2[i214];
                                    $11 = ($10 + 83) % 128;
                                } else {
                                    int i216 = (i14 * cCharValue) + i13;
                                    int i217 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                    int i32 = completedVar.getSDKTransactionID;
                                    cArr5[i32] = cArr2[i216];
                                    cArr5[i32 + 1] = cArr2[i217];
                                }
                            }
                        }
                    }
                    completedVar.getSDKTransactionID += 2;
                    c11 = 11;
                }
            }
            for (int i33 = 0; i33 < i11; i33++) {
                cArr5[i33] = (char) (cArr5[i33] ^ 13722);
            }
            objArr[0] = new String(cArr5);
        }

        private static void c(byte b11, byte b12, int i11, Object[] objArr) {
            byte[] bArr = $$d;
            int i12 = b11 * 2;
            int i13 = b12 + 4;
            int i14 = 122 - i11;
            byte[] bArr2 = new byte[1 - i12];
            int i15 = 0 - i12;
            int i16 = -1;
            if (bArr == null) {
                i14 += i15;
            }
            while (true) {
                i16++;
                i13++;
                bArr2[i16] = (byte) i14;
                if (i16 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i14 += bArr[i13];
            }
        }

        public static void getSDKReferenceNumber(long j11, long j12) throws Throwable {
            AuthenticationRequestParameters = (getDeviceData + 125) % 128;
            int i11 = $$b;
            byte[] bArr = $$a;
            byte b11 = bArr[36];
            Object[] objArr = new Object[1];
            a((byte) (i11 & 5), b11, (byte) (b11 + 1), objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            getDeviceData = (AuthenticationRequestParameters + 121) % 128;
            byte b12 = (byte) (i11 & 5);
            try {
                byte b13 = bArr[36];
                Object[] objArr2 = new Object[1];
                a(b12, b13, (byte) (b13 + 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b14 = bArr[36];
                byte b15 = b14;
                Object[] objArr3 = new Object[1];
                a(b15, (byte) (b15 + 1), b14, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getDeviceData.class.getField("getSDKAppID").get(null)};
                Object[] objArr5 = new Object[1];
                b(View.getDefaultSize(0, 0) + 3, "\u0003\u0000㙝", (byte) (View.resolveSize(0, 0) + 95), objArr5);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{83, 108, 55, -47, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
            $$b = 131;
        }

        static void init$1() {
            $$d = new byte[]{20, 60, 106, 116};
            $$e = 187;
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        KeyEvent.keyCodeFromString("");
        new getSDKAppID((byte) 0);
        int i11 = getSDKReferenceNumber + 85;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getErrorDescription(Application application) {
        super(application);
        s.k(application, "");
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String cD_(TelephonyManager telephonyManager) {
        int i11 = ChallengeResultCancelled + 103;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            telephonyManager.getSimSerialNumber();
            throw null;
        }
        String simSerialNumber = telephonyManager.getSimSerialNumber();
        int i12 = ChallengeResultCancelled + 67;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 53 / 0;
        }
        return simSerialNumber;
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = new char[]{64764, 64783, 64780, 64774};
        AuthenticationRequestParameters = -185467585;
        getSDKTransactionID = true;
        getDeviceData = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        DeviceParameterResult failure;
        String strCD_;
        int i11 = getSDKReferenceNumber + 99;
        ChallengeResultCancelled = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                cF_();
                throw null;
            }
            TelephonyManager telephonyManagerCF_ = cF_();
            if (telephonyManagerCF_ == null || (strCD_ = cD_(telephonyManagerCF_)) == null) {
                failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            } else {
                getSDKReferenceNumber = (ChallengeResultCancelled + 111) % 128;
                failure = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCD_));
            }
            ChallengeResultCancelled = (getSDKReferenceNumber + 47) % 128;
            return failure;
        } catch (SecurityException unused) {
            failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
    }
}
