package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkOperator;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusHandler extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkOperator$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static char[] getSDKAppID;
        private static boolean getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = new char[]{64798, 64809, 64786, 64784, 64858, 64791, 64805, 64807, 64789, 64790, 64801, 64788, 64785, 64800, 64853, 64856, 64816, 64824, 64794, 64792, 64796, 64803, 64799, 64826, 64797, 64804, 64795, 64829, 64833, 64802, 64839, 64834, 64838, 64841, 64849, 64823, 64806};
            getSDKTransactionID = -185467512;
            getSDKReferenceNumber = true;
            getDeviceData = true;
            AuthenticationRequestParameters = new char[]{30839, 30901, 30902, 30907, 30785, 30889, 30871, 30869, 30862, 30866, 30872, 30908, 30796, 30890, 30877, 30869, 30864, 30903, 30787, 30904, 30785, 30889, 30871, 30869, 30862, 30866, 30872, 30902, 30793, 30910, 30903, 30735, 30805, 30800, 30827, 30846, 30839, 30826, 30721, 30723, 30840, 30721, 30825, 30807, 30805, 30798, 30802, 30808, 30838, 30729, 30838, 30843, 30721, 30825, 30807, 30805, 30798, 30802, 30808, 30844, 30732, 30826, 30832, 30877, 30875, 30873, 30866, 30870, 30876, 30907, 30906, 30875, 30868, 30867, 30870, 30875, 30867, 30899, 30794, 30891, 30868, 30867, 30870, 30868, 30860, 31032, 31030, 31036, 31025, 31036, 30928, 31032, 31030, 31036, 31026, 31034, 31036, 30927, 31019, 31032, 31030, 31021, 30733, 30808, 30802, 30812, 30822, 30812, 30809, 30808, 30810, 30808, 30825, 30821, 30804, 30804, 30721, 30788, 30790, 30793, 30903, 30734, 30809, 30806, 30810, 30808, 30808, 30802, 30816, 30821, 30798, 30797, 30840, 30898, 30908, 30785, 30908, 30910, 30792, 30822, 30811, 30904, 30809, 30807, 30903, 30911, 30906, 30903, 30904, 30911, 30814, 30815, 30784, 30906, 30902, 30909, 30911, 30785, 30789, 30909, 30791, 30927, 30922, 30922, 30920, 30922, 30923, 30921, 30945, 30945, 30920, 30912, 30919, 30924, 30924, 30927, 30931, 30923, 30921};
        }

        private getDeviceData() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 2
                int r7 = 4 - r7
                int r5 = r5 * 2
                int r0 = r5 + 21
                int r6 = r6 * 2
                int r6 = r6 + 103
                byte[] r1 = atd.w.ChallengeStatusHandler.getDeviceData.$$a
                byte[] r0 = new byte[r0]
                int r5 = r5 + 20
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r7
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r1[r7]
            L2a:
                int r7 = r7 + 1
                int r6 = r6 + r4
                int r6 = r6 + 3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeStatusHandler.getDeviceData.a(byte, short, int, java.lang.Object[]):void");
        }

        private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
            char[] charArray;
            String str3 = str2;
            $11 = ($10 + 13) % 128;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            if (str != null) {
                $11 = ($10 + 67) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
            char[] cArr2 = getSDKAppID;
            Class cls = Integer.TYPE;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i12 = 0;
                while (i12 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj == null) {
                            Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 32)).getMethod("o", cls);
                            map.put(508097192, method);
                            obj = method;
                        }
                        cArr3[i12] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i12++;
                        cArr2 = cArr2;
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
            Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method2 = map2.get(-852383591);
            if (method2 == null) {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16779277, (char) Color.blue(0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17);
                byte b11 = (byte) ($$e & 7);
                byte b12 = (byte) (b11 - 2);
                Object[] objArr4 = new Object[1];
                d(b11, b12, b12, objArr4);
                method2 = cls2.getMethod((String) objArr4[0], cls);
                map2.put(-852383591, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
            int i13 = 2;
            if (getDeviceData) {
                int length2 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length2;
                char[] cArr4 = new char[length2];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i14 = challengeStatusReceiver.getDeviceData;
                    int i15 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i14 >= i15) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                    Object[] objArr5 = new Object[i13];
                    objArr5[1] = challengeStatusReceiver;
                    objArr5[0] = challengeStatusReceiver;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-249860496);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getMode(0) + 1108, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 50);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        d(b13, b14, b14, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                        map3.put(-249860496, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    i13 = 2;
                }
            } else if (getSDKReferenceNumber) {
                $10 = ($11 + 107) % 128;
                int length3 = cArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                char[] cArr5 = new char[length3];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i16 = challengeStatusReceiver.getDeviceData;
                    int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i16 >= i17) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i11] - iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 50 - (AudioTrack.getMinVolume() > 0 ? 1 : (AudioTrack.getMinVolume() == 0 ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        d(b15, b16, b16, objArr8);
                        method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                        map4.put(-249860496, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                }
            } else {
                int length4 = iArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                char[] cArr6 = new char[length4];
                challengeStatusReceiver.getDeviceData = 0;
                int i18 = $10 + 35;
                while (true) {
                    $11 = i18 % 128;
                    int i19 = challengeStatusReceiver.getDeviceData;
                    int i21 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i19 >= i21) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[i19] = (char) (cArr2[iArr[(i21 - 1) - i19] - i11] - iIntValue);
                        challengeStatusReceiver.getDeviceData = i19 + 1;
                        i18 = $10 + 33;
                    }
                }
            }
        }

        private static void c(boolean z11, int[] iArr, String str, Object[] objArr) throws Throwable {
            int i11;
            long j11;
            Class<Object> cls;
            Object method;
            String str2 = str;
            Class<Object> cls2 = Object.class;
            Integer num = -399400818;
            Object bytes = str2;
            if (str2 != null) {
                $10 = ($11 + 1) % 128;
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = iArr[3];
            char[] cArr = AuthenticationRequestParameters;
            Class cls3 = Integer.TYPE;
            int i16 = 2;
            if (cArr != null) {
                int length = cArr.length;
                int i17 = 0;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    int i19 = i18;
                    int i21 = $11 + 67;
                    length = length;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                            Map map = atd.a.getMessageVersion.timedout;
                            Object obj = map.get(-1708792688);
                            if (obj != null) {
                                method = obj;
                            } else {
                                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(i17) + 2313, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getTouchSlop() >> 8) + 24);
                                byte b11 = (byte) i17;
                                Object[] objArr3 = new Object[1];
                                d($$d[i17], b11, b11, objArr3);
                                method = cls4.getMethod((String) objArr3[i17], cls3);
                                map.put(-1708792688, method);
                            }
                            cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                            i18 = i19;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        cls2 = cls2;
                        num = num;
                        cArr2 = cArr2;
                        i14 = i14;
                        i15 = i15;
                        cArr = cArr;
                        Object[] objArr4 = {Integer.valueOf(cArr[i19])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method2 = map2.get(-1708792688);
                        if (method2 == null) {
                            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 23 - TextUtils.lastIndexOf("", '0', 0));
                            byte b12 = (byte) 0;
                            Object[] objArr5 = new Object[1];
                            d($$d[0], b12, b12, objArr5);
                            method2 = cls5.getMethod((String) objArr5[0], cls3);
                            map2.put(-1708792688, method2);
                        }
                        cArr2[i19] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i18 = i19 + 1;
                    }
                    cArr2 = cArr2;
                    i15 = i15;
                    i14 = i14;
                    cArr = cArr;
                    cls2 = cls2;
                    num = num;
                    i17 = 0;
                }
                cArr = cArr2;
            }
            Class<Object> cls6 = cls2;
            Integer num2 = num;
            int i22 = i14;
            int i23 = i15;
            char[] cArr3 = new char[i13];
            System.arraycopy(cArr, i12, cArr3, 0, i13);
            if (bArr != 0) {
                char[] cArr4 = new char[i13];
                challengeResultError.getSDKAppID = 0;
                $11 = ($10 + 47) % 128;
                char c11 = 0;
                while (true) {
                    int i24 = challengeResultError.getSDKAppID;
                    if (i24 >= i13) {
                        break;
                    }
                    if (bArr[i24] == 1) {
                        char c12 = cArr3[i24];
                        Object[] objArr6 = new Object[i16];
                        objArr6[1] = Integer.valueOf(c11);
                        objArr6[0] = Integer.valueOf(c12);
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(10570995);
                        if (method3 != null) {
                            j11 = 0;
                        } else {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(558 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (5486 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22);
                            j11 = 0;
                            byte b13 = (byte) 0;
                            Object[] objArr7 = new Object[1];
                            d((byte) 11, b13, b13, objArr7);
                            method3 = cls7.getMethod((String) objArr7[0], cls3, cls3);
                            map3.put(10570995, method3);
                        }
                        cArr4[i24] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    } else {
                        cArr3 = cArr3;
                        j11 = 0;
                        Object[] objArr8 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c11)};
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object method4 = map4.get(-502074319);
                        if (method4 == null) {
                            method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 200, (char) TextUtils.indexOf("", "", 0), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("a", cls3, cls3);
                            map4.put(-502074319, method4);
                        }
                        cArr4[i24] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                    }
                    char c13 = cArr4[challengeResultError.getSDKAppID];
                    Object[] objArr9 = {challengeResultError, challengeResultError};
                    Map map5 = atd.a.getMessageVersion.timedout;
                    Integer num3 = num2;
                    Object method5 = map5.get(num3);
                    if (method5 != null) {
                        cls = cls6;
                    } else {
                        Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getCapsMode("", 0, 0) + 854, (char) ((SystemClock.elapsedRealtime() > j11 ? 1 : (SystemClock.elapsedRealtime() == j11 ? 0 : -1)) - 1), (Process.myPid() >> 22) + 24);
                        byte b14 = (byte) 5;
                        byte b15 = (byte) (b14 - 5);
                        Object[] objArr10 = new Object[1];
                        d(b14, b15, b15, objArr10);
                        cls = cls6;
                        method5 = cls8.getMethod((String) objArr10[0], cls, cls);
                        map5.put(num3, method5);
                    }
                    ((Method) method5).invoke(null, objArr9);
                    num2 = num3;
                    cls6 = cls;
                    c11 = c13;
                    cArr3 = cArr3;
                    i16 = 2;
                }
                cArr3 = cArr4;
            }
            if (i23 > 0) {
                $10 = ($11 + 75) % 128;
                char[] cArr5 = new char[i13];
                i11 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i13);
                int i25 = i13 - i23;
                System.arraycopy(cArr5, 0, cArr3, i25, i23);
                System.arraycopy(cArr5, i23, cArr3, 0, i25);
            } else {
                i11 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i13];
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i26 = challengeResultError.getSDKAppID;
                    if (i26 >= i13) {
                        break;
                    }
                    cArr6[i26] = cArr3[(i13 - i26) - 1];
                    challengeResultError.getSDKAppID = i26 + 1;
                }
                cArr3 = cArr6;
            }
            if (i22 > 0) {
                int i27 = $10;
                challengeResultError.getSDKAppID = 0;
                $11 = (i27 + 95) % 128;
                while (true) {
                    int i28 = challengeResultError.getSDKAppID;
                    if (i28 >= i13) {
                        break;
                    }
                    $10 = ($11 + 79) % 128;
                    cArr3[i28] = (char) (cArr3[i28] - iArr[2]);
                    challengeResultError.getSDKAppID = i28 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static void d(int i11, int i12, int i13, Object[] objArr) {
            int i14 = (i12 * 4) + 4;
            int i15 = i13 * 4;
            byte[] bArr = $$d;
            int i16 = 109 - i11;
            byte[] bArr2 = new byte[i15 + 1];
            int i17 = -1;
            if (bArr == null) {
                i14++;
                i16 = i14 + i15;
            }
            while (true) {
                int i18 = i14;
                int i19 = i16;
                i17++;
                bArr2[i17] = (byte) i19;
                if (i17 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i14 = i18 + 1;
                    i16 = i19 + bArr[i18];
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v17 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v2, types: [int[], java.lang.String] */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKTransactionID(android.content.Context r26, int r27, int r28) {
            /*
                Method dump skipped, instruction units count: 1428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeStatusHandler.getDeviceData.getSDKTransactionID(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{91, -66, -77, -12, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10};
            $$b = EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{9, -7, -35, -64};
            $$e = 122;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollBarSize();
        new getDeviceData((byte) 0);
        int i11 = ChallengeResult + 29;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeStatusHandler(Application application) {
        super(application);
        s.k(application, "");
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{64903, 64918, 64911};
        getSDKAppID = -185467450;
        getSDKReferenceNumber = true;
        getSDKTransactionID = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r0 = cF_();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r1 = atd.w.ChallengeStatusHandler.ChallengeResult + 73;
        atd.w.ChallengeStatusHandler.AuthenticationRequestParameters = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r0 = r0.getNetworkOperator();
        r1 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r0 = r0.getNetworkOperator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0));
        atd.w.ChallengeStatusHandler.ChallengeResult = (atd.w.ChallengeStatusHandler.AuthenticationRequestParameters + 33) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        r1 = atd.w.ChallengeStatusHandler.AuthenticationRequestParameters + 115;
        atd.w.ChallengeStatusHandler.ChallengeResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if ((r1 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (ChallengeResultCancelled() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (ChallengeResultCancelled() != false) goto L9;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() {
        /*
            r3 = this;
            int r0 = atd.w.ChallengeStatusHandler.AuthenticationRequestParameters
            int r0 = r0 + 69
            int r1 = r0 % 128
            atd.w.ChallengeStatusHandler.ChallengeResult = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = r3.ChallengeResultCancelled()
            r1 = 47
            int r1 = r1 / 0
            if (r0 == 0) goto L25
            goto L1d
        L17:
            boolean r0 = r3.ChallengeResultCancelled()
            if (r0 == 0) goto L25
        L1d:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L25:
            android.telephony.TelephonyManager r0 = r3.cF_()
            if (r0 == 0) goto L59
            int r1 = atd.w.ChallengeStatusHandler.ChallengeResult
            int r1 = r1 + 73
            int r2 = r1 % 128
            atd.w.ChallengeStatusHandler.AuthenticationRequestParameters = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L42
            java.lang.String r0 = r0.getNetworkOperator()
            r1 = 81
            int r1 = r1 / 0
            if (r0 == 0) goto L59
            goto L48
        L42:
            java.lang.String r0 = r0.getNetworkOperator()
            if (r0 == 0) goto L59
        L48:
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(r0)
            int r1 = atd.w.ChallengeStatusHandler.AuthenticationRequestParameters
            int r1 = r1 + 33
            int r1 = r1 % 128
            atd.w.ChallengeStatusHandler.ChallengeResult = r1
            return r0
        L59:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            int r1 = atd.w.ChallengeStatusHandler.AuthenticationRequestParameters
            int r1 = r1 + 115
            int r2 = r1 % 128
            atd.w.ChallengeStatusHandler.ChallengeResult = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L6d
            return r0
        L6d:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeStatusHandler.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }
}
