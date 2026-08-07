package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/FontScale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int[] getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/FontScale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static char ChallengeResultCancelled;
        private static char getDeviceData;
        private static char getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char[] getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = (char) 28718;
            AuthenticationRequestParameters = (char) 26110;
            getSDKReferenceNumber = (char) 16766;
            getSDKAppID = (char) 33706;
            getSDKTransactionID = new char[]{63810, 52398, 52391, 52365, 63820, 52397, 52413, 63808, 52411, 63821, 52368, 63813, 52371, 52407, 52410, 52403, 52478, 52375, 52464, 52383, 52409, 52381, 52402, 52396, 52401, 63809, 52451, 52390, 63811, 52366, 52400, 52378, 52408, 52369, 63814, 52363, 63815, 52394, 52404, 52358, 52412, 52466, 52455, 52392, 52462, 52459, 52415, 52405, 52395};
            ChallengeResultCancelled = (char) 63811;
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 2
                int r8 = 21 - r8
                int r7 = r7 * 3
                int r7 = r7 + 103
                byte[] r0 = atd.x.BuildConfig.getSDKAppID.$$a
                int r9 = r9 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r0
                r5 = r2
                r0 = r9
                goto L2d
            L15:
                r3 = r2
            L16:
                int r9 = r9 + 1
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L2d:
                int r7 = r7 + r9
                int r7 = r7 + 3
                r9 = r0
                r0 = r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.BuildConfig.getSDKAppID.a(byte, int, byte, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            if (str != null) {
                $11 = ($10 + 27) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            int i13 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            int i14 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i15 = challengeStatusHandler.getSDKReferenceNumber;
                if (i15 >= cArr.length) {
                    int i16 = i13;
                    objArr[i16] = new String(cArr2, i16, i11);
                    return;
                }
                cArr3[i13] = cArr[i15];
                cArr3[1] = cArr[i15 + 1];
                int i17 = 58224;
                int i18 = i13;
                while (i18 < 16) {
                    $11 = ($10 + 91) % 128;
                    char c11 = cArr3[1];
                    char c12 = cArr3[i13];
                    int i19 = i14;
                    int i21 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                    int i22 = c12 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKAppID);
                        objArr2[i19] = Integer.valueOf(i22);
                        objArr2[1] = Integer.valueOf(i21);
                        objArr2[i13] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i13;
                        } else {
                            i12 = i13;
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1745, (char) (16681 - ((byte) KeyEvent.getModifierMetaStateMask())), View.getDefaultSize(i13, i13) + 29);
                            byte b11 = (byte) ($$e - 1);
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            d(b11, b12, (byte) (b12 | 10), objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i23 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                        int i24 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                        objArr4[i19] = Integer.valueOf(i24);
                        objArr4[1] = Integer.valueOf(i23);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(i12) + 20) >> 6) + 1745, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16681), View.MeasureSpec.getMode(i12) + 29);
                            byte b13 = (byte) ($$e - 1);
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            d(b13, b14, (byte) (b14 | 10), objArr5);
                            method2 = cls3.getMethod((String) objArr5[i12], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[i12] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i17 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i18++;
                        i14 = i19;
                        cArr = cArr;
                        i13 = i12;
                        cArr3 = cArr3;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = cArr;
                int i25 = i13;
                int i26 = i14;
                char[] cArr5 = cArr3;
                int i27 = challengeStatusHandler.getSDKReferenceNumber;
                cArr2[i27] = cArr5[i25];
                cArr2[i27 + 1] = cArr5[1];
                Object[] objArr6 = new Object[i26];
                objArr6[1] = challengeStatusHandler;
                objArr6[i25] = challengeStatusHandler;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1596 - ExpandableListView.getPackedPositionType(0L), (char) (27824 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25);
                    byte b15 = (byte) ($$e - 1);
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    d(b15, b16, (byte) (b16 | 6), objArr7);
                    method3 = cls4.getMethod((String) objArr7[i25], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = i26;
                cArr = cArr4;
                i13 = i25;
                cArr3 = cArr5;
            }
        }

        private static void c(byte b11, String str, int i11, Object[] objArr) throws Throwable {
            int i12;
            Object method;
            int length;
            char[] cArr;
            int i13;
            Object method2;
            $10 = ($11 + 85) % 128;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.completed completedVar = new atd.az.completed();
            char[] cArr2 = getSDKTransactionID;
            Class cls = Integer.TYPE;
            int i14 = 2;
            int i15 = 0;
            if (cArr2 != null) {
                int i16 = $11 + 83;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                int i17 = 0;
                while (i17 < length) {
                    int i18 = $10 + 33;
                    $11 = i18 % 128;
                    if (i18 % i14 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                            Map map = atd.a.getMessageVersion.timedout;
                            Object obj = map.get(-1709775791);
                            if (obj != null) {
                                i13 = i15;
                                method2 = obj;
                            } else {
                                i13 = i15;
                                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2313, (char) KeyEvent.getDeadChar(i15, i15), (-16777192) - Color.rgb(i15, i15, i15));
                                byte b12 = (byte) ($$e - 1);
                                byte b13 = b12;
                                Object[] objArr3 = new Object[1];
                                d(b12, b13, (byte) (b13 | 55), objArr3);
                                method2 = cls2.getMethod((String) objArr3[i13], cls);
                                map.put(-1709775791, method2);
                            }
                            cArr[i17] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                            i17 %= 0;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        charArray = charArray;
                        cArr2 = cArr2;
                        i14 = i14;
                        i13 = i15;
                        Object[] objArr4 = {Integer.valueOf(cArr2[i17])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method3 = map2.get(-1709775791);
                        if (method3 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getTouchSlop() >> 8), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            byte b14 = (byte) ($$e - 1);
                            byte b15 = b14;
                            Object[] objArr5 = new Object[1];
                            d(b14, b15, (byte) (b15 | 55), objArr5);
                            method3 = cls3.getMethod((String) objArr5[i13], cls);
                            map2.put(-1709775791, method3);
                        }
                        cArr[i17] = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
                        i17++;
                    }
                    i14 = i14;
                    charArray = charArray;
                    cArr2 = cArr2;
                    i15 = i13;
                }
                cArr2 = cArr;
            }
            char[] cArr3 = charArray;
            int i19 = i14;
            int i21 = i15;
            Object[] objArr6 = {Integer.valueOf(ChallengeResultCancelled)};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method4 = map3.get(-1709775791);
            if (method4 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 23 - MotionEvent.axisFromString(""));
                byte b16 = (byte) ($$e - 1);
                byte b17 = b16;
                Object[] objArr7 = new Object[1];
                d(b16, b17, (byte) (b17 | 55), objArr7);
                method4 = cls4.getMethod((String) objArr7[i21], cls);
                map3.put(-1709775791, method4);
            }
            char cCharValue = ((Character) ((Method) method4).invoke(null, objArr6)).charValue();
            char[] cArr4 = new char[i11];
            if (i11 % 2 != 0) {
                int i22 = $10 + 111;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    i12 = i11 + 57;
                    cArr4[i12] = (char) (cArr3[i12] % b11);
                } else {
                    i12 = i11 - 1;
                    cArr4[i12] = (char) (cArr3[i12] - b11);
                }
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                int i23 = i21;
                while (true) {
                    completedVar.getSDKTransactionID = i23;
                    int i24 = completedVar.getSDKTransactionID;
                    if (i24 >= i12) {
                        break;
                    }
                    char c11 = cArr3[i24];
                    completedVar.getSDKAppID = c11;
                    char c12 = cArr3[i24 + 1];
                    completedVar.getSDKReferenceNumber = c12;
                    if (c11 == c12) {
                        cArr4[i24] = (char) (c11 - b11);
                        cArr4[i24 + 1] = (char) (c12 - b11);
                    } else {
                        Object[] objArr8 = new Object[13];
                        objArr8[12] = completedVar;
                        objArr8[11] = Integer.valueOf(cCharValue);
                        objArr8[10] = completedVar;
                        objArr8[9] = completedVar;
                        objArr8[8] = Integer.valueOf(cCharValue);
                        objArr8[7] = completedVar;
                        objArr8[6] = completedVar;
                        objArr8[5] = Integer.valueOf(cCharValue);
                        objArr8[4] = completedVar;
                        objArr8[3] = completedVar;
                        objArr8[i19] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object obj2 = map4.get(700818725);
                        if (obj2 != null) {
                            method = obj2;
                        } else {
                            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + 1920, (char) Color.blue(0), View.combineMeasuredStates(0, 0) + 29);
                            byte b18 = (byte) ($$e - 1);
                            byte b19 = b18;
                            Object[] objArr9 = new Object[1];
                            d(b18, b19, b19, objArr9);
                            String str2 = (String) objArr9[0];
                            Class cls6 = Integer.TYPE;
                            method = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                            map4.put(700818725, method);
                        }
                        int iIntValue = ((Integer) ((Method) method).invoke(null, objArr8)).intValue();
                        int i25 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i25) {
                            Object[] objArr10 = new Object[11];
                            objArr10[10] = completedVar;
                            objArr10[9] = Integer.valueOf(cCharValue);
                            objArr10[8] = completedVar;
                            objArr10[7] = Integer.valueOf(cCharValue);
                            objArr10[6] = Integer.valueOf(cCharValue);
                            objArr10[5] = completedVar;
                            objArr10[4] = completedVar;
                            objArr10[3] = Integer.valueOf(cCharValue);
                            objArr10[i19] = Integer.valueOf(cCharValue);
                            objArr10[1] = completedVar;
                            objArr10[0] = completedVar;
                            Object method5 = map4.get(-248084636);
                            if (method5 == null) {
                                Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 48635), 24 - (ViewConfiguration.getTouchSlop() >> 8));
                                byte b21 = (byte) ($$e - 1);
                                byte b22 = b21;
                                Object[] objArr11 = new Object[1];
                                d(b21, b22, (byte) (b22 | 49), objArr11);
                                String str3 = (String) objArr11[0];
                                Class cls8 = Integer.TYPE;
                                method5 = cls7.getMethod(str3, Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                                map4.put(-248084636, method5);
                            }
                            int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                            int i26 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i27 = completedVar.getSDKTransactionID;
                            cArr4[i27] = cArr2[iIntValue2];
                            cArr4[i27 + 1] = cArr2[i26];
                        } else {
                            int i28 = completedVar.getDeviceData;
                            int i29 = completedVar.AuthenticationRequestParameters;
                            if (i28 == i29) {
                                int i31 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i31;
                                int i32 = ((i25 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i32;
                                int i33 = (i29 * cCharValue) + i32;
                                int i34 = completedVar.getSDKTransactionID;
                                cArr4[i34] = cArr2[(i28 * cCharValue) + i31];
                                cArr4[i34 + 1] = cArr2[i33];
                            } else {
                                int i35 = (i28 * cCharValue) + i25;
                                int i36 = (i29 * cCharValue) + completedVar.getMessageVersion;
                                int i37 = completedVar.getSDKTransactionID;
                                cArr4[i37] = cArr2[i35];
                                cArr4[i37 + 1] = cArr2[i36];
                            }
                        }
                    }
                    i23 = completedVar.getSDKTransactionID + 2;
                }
            }
            $10 = ($11 + 85) % 128;
            for (int i38 = 0; i38 < i11; i38++) {
                cArr4[i38] = (char) (cArr4[i38] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        private static void d(short s11, int i11, int i12, Object[] objArr) {
            int i13 = 122 - i12;
            int i14 = 3 - (s11 * 2);
            byte[] bArr = $$d;
            int i15 = i11 * 4;
            byte[] bArr2 = new byte[i15 + 1];
            int i16 = -1;
            if (bArr == null) {
                i13 = i14 + i13;
                i14 = i14;
                bArr = bArr;
                i16 = -1;
            }
            while (true) {
                int i17 = i16 + 1;
                bArr2[i17] = (byte) i13;
                if (i17 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i18 = i14 + 1;
                byte[] bArr3 = bArr;
                i13 = bArr[i18] + i13;
                i14 = i18;
                bArr = bArr3;
                i16 = i17;
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKTransactionID(android.content.Context r31, int r32, int r33) {
            /*
                Method dump skipped, instruction units count: 1527
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.BuildConfig.getSDKAppID.getSDKTransactionID(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{64, -12, 5, 6, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10};
            $$b = 43;
        }

        static void init$1() {
            $$d = new byte[]{76, 124, -43, -121};
            $$e = 1;
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getSDKReferenceNumber();
        TextUtils.lastIndexOf("", '0', 0);
        new getSDKAppID((byte) 0);
        AuthenticationRequestParameters = (getDeviceData + 3) % 128;
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        float f11;
        Object method;
        Object method2;
        Integer num = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i12 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i13 = 0;
        if (iArr2 != null) {
            f11 = BitmapDescriptorFactory.HUE_RED;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i14 = 0;
            while (i14 < length) {
                $11 = ($10 + 21) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (KeyEvent.getMaxKeyCode() >> 16), (char) View.combineMeasuredStates(i13, i13), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 3), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i14++;
                    cArr = cArr;
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
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        char[] cArr3 = cArr;
        int i15 = 16;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getSDKReferenceNumber;
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
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1861 - MotionEvent.axisFromString(""), (char) (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 22);
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 3);
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, (byte) (b14 - 3), objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2050190164, method);
                }
                iArr6[i16] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i16++;
                iArr5 = iArr5;
                iArr6 = iArr6;
                length3 = length3;
                cArr2 = cArr2;
                num = num;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i17 = challengeResultCompleted.getDeviceData;
            if (i17 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i18 = iArr[i17];
            char c12 = (char) (i18 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i18;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i17 + 1] >> 16);
            cArr3[i12] = c14;
            char c15 = (char) iArr[i17 + 1];
            char c16 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            $11 = ($10 + 43) % 128;
            int i19 = 0;
            while (i19 < i15) {
                int i21 = challengeResultCompleted.getSDKAppID ^ iArr4[i19];
                challengeResultCompleted.getSDKAppID = i21;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i21);
                Object[] objArr6 = new Object[4];
                objArr6[c16] = challengeResultCompleted;
                objArr6[i12] = challengeResultCompleted;
                objArr6[1] = Integer.valueOf(sDKAppID);
                objArr6[0] = challengeResultCompleted;
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(929629307);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1299 - (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)), (char) (CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 - TextUtils.indexOf((CharSequence) "", '0')), 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                    map3.put(929629307, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i19++;
                c16 = c16;
                i15 = 16;
            }
            char c17 = c16;
            int i22 = challengeResultCompleted.getSDKAppID;
            int i23 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i23;
            challengeResultCompleted.getSDKReferenceNumber = i22;
            i15 = 16;
            int i24 = i22 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i24;
            int i25 = i23 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i25;
            cArr3[0] = (char) (i25 >>> 16);
            cArr3[1] = (char) i25;
            cArr3[i12] = (char) (i24 >>> 16);
            cArr3[c17] = (char) i24;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i26 = challengeResultCompleted.getDeviceData;
            cArr4[i26 * 2] = cArr3[0];
            cArr4[(i26 * 2) + 1] = cArr3[1];
            cArr4[(i26 * 2) + 2] = cArr3[i12];
            cArr4[(i26 * 2) + 3] = cArr3[c17];
            Object[] objArr8 = new Object[i12];
            objArr8[1] = challengeResultCompleted;
            objArr8[0] = challengeResultCompleted;
            Map map4 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object method4 = map4.get(num3);
            if (method4 == null) {
                Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2060 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.myTid() >> 22), Process.getGidForName("") + 18);
                byte b17 = (byte) 0;
                byte b18 = (byte) (b17 + 1);
                Object[] objArr9 = new Object[1];
                b(b17, b18, (byte) (b18 - 1), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(num3, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            num2 = num3;
            c11 = 0;
            i12 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 120 - r7
            byte[] r0 = atd.x.BuildConfig.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.BuildConfig.b(short, byte, int, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = new int[]{-86993144, 1094569789, 568766069, 373385483, -1260412671, -967899019, -587231282, 1708894863, 1558444927, -1063712076, 718339767, -1960344682, -1812836067, -1396804514, -1489976639, -910608609, 697011494, 1173255579};
    }

    static void init$0() {
        $$a = new byte[]{93, 60, 36, -28};
        $$b = 78;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x0051 A[PHI: r0
      0x0051: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v14 java.lang.String) binds: [B:8:0x004f, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String sDKTransactionID;
        Float fV;
        int i11 = AuthenticationRequestParameters + 95;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
            Object[] objArr = new Object[1];
            a(new int[]{2090062001, 2067740827, -1373154644, 688023499, 1254658505, -1308289625}, 122 % KeyEvent.normalizeMetaState(0), objArr);
            sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
            if (sDKTransactionID != null) {
                fV = t.v(sDKTransactionID);
                if (fV != null) {
                    if (fV.floatValue() < BitmapDescriptorFactory.HUE_RED) {
                        fV = null;
                    }
                    if (fV != null) {
                        DeviceParameterResult.Success.FloatValue floatValueM28boximpl = DeviceParameterResult.Success.FloatValue.m28boximpl(DeviceParameterResult.Success.FloatValue.m29constructorimpl(fV.floatValue()));
                        AuthenticationRequestParameters = (getDeviceData + 115) % 128;
                        return floatValueM28boximpl;
                    }
                }
            }
        } else {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters2 = this.getSDKAppID;
            Object[] objArr2 = new Object[1];
            a(new int[]{2090062001, 2067740827, -1373154644, 688023499, 1254658505, -1308289625}, 10 - KeyEvent.normalizeMetaState(0), objArr2);
            sDKTransactionID = authenticationRequestParameters2.getSDKTransactionID(((String) objArr2[0]).intern());
            if (sDKTransactionID != null) {
                fV = t.v(sDKTransactionID);
                if (fV != null) {
                    if (fV.floatValue() < BitmapDescriptorFactory.HUE_RED) {
                        fV = null;
                    }
                    if (fV != null) {
                        DeviceParameterResult.Success.FloatValue floatValueM28boximpl2 = DeviceParameterResult.Success.FloatValue.m28boximpl(DeviceParameterResult.Success.FloatValue.m29constructorimpl(fV.floatValue()));
                        AuthenticationRequestParameters = (getDeviceData + 115) % 128;
                        return floatValueM28boximpl2;
                    }
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private BuildConfig(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
