package atd.t;

import android.app.Application;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusHandler;
import atd.az.completed;
import atd.az.getTransactionStatus;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetInstallerPackageName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static long getDeviceData;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final Application getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetInstallerPackageName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static char ChallengeResult;
        private static char getDeviceData;
        private static char[] getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = new char[]{52397, 52368, 52402, 52383, 52392, 52404, 52407, 52478, 52400, 52380, 53063, 52405, 52413, 52393, 52394, 53060, 52401, 52378, 53061, 52391, 52412, 52464, 52455, 52376, 52358, 52408, 52363, 52395, 52366, 52409, 52411, 52369, 52396, 52365, 52398, 52415, 53062, 52459, 52399, 52381, 52406, 52390, 52403, 52466, 52451, 52462, 52371, 52410, 52414};
            getSDKReferenceNumber = (char) 63811;
            AuthenticationRequestParameters = (char) 59161;
            getDeviceData = (char) 60496;
            getSDKTransactionID = (char) 29493;
            ChallengeResult = (char) 31429;
        }

        private getSDKTransactionID() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 3
                int r0 = r5 + 21
                byte[] r1 = atd.t.getDeviceData.getSDKTransactionID.$$a
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = r6 * 4
                int r6 = 103 - r6
                byte[] r0 = new byte[r0]
                int r5 = r5 + 20
                r2 = 0
                if (r1 != 0) goto L19
                r4 = r5
                r6 = r7
                r3 = r2
                goto L2e
            L19:
                r3 = r7
                r7 = r6
                r6 = r3
                r3 = r2
            L1d:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L2a
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L2a:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2e:
                int r7 = r7 + r4
                int r7 = r7 + 3
                int r6 = r6 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.t.getDeviceData.getSDKTransactionID.a(byte, short, short, java.lang.Object[]):void");
        }

        private static void b(int i11, String str, byte b11, Object[] objArr) throws Throwable {
            int i12;
            Object method;
            Class cls;
            Object method2;
            char[] charArray = str != null ? str.toCharArray() : str;
            completed completedVar = new completed();
            char[] cArr = getSDKAppID;
            Class cls2 = Integer.TYPE;
            char c11 = '0';
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i13 = 0;
                while (i13 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(-1709775791);
                        if (obj != null) {
                            cls = cls2;
                            method2 = obj;
                        } else {
                            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2312 - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf("", c11) + 1), 23 - TextUtils.lastIndexOf("", c11));
                            byte b12 = (byte) 0;
                            cls = cls2;
                            Object[] objArr3 = new Object[1];
                            d((byte) 55, b12, b12, objArr3);
                            method2 = cls3.getMethod((String) objArr3[0], cls);
                            map.put(-1709775791, method2);
                        }
                        cArr2[i13] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                        i13++;
                        cArr = cArr;
                        charArray = charArray;
                        cls2 = cls;
                        c11 = '0';
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
            Class cls4 = cls2;
            Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(-1709775791);
            if (method3 == null) {
                Class cls5 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 2313, (char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.lastIndexOf("", '0', 0) + 25);
                byte b13 = (byte) 0;
                Object[] objArr5 = new Object[1];
                d((byte) 55, b13, b13, objArr5);
                method3 = cls5.getMethod((String) objArr5[0], cls4);
                map2.put(-1709775791, method3);
            }
            char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr4[i12] = (char) (cArr3[i12] - b11);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                completedVar.getSDKTransactionID = 0;
                while (true) {
                    int i14 = completedVar.getSDKTransactionID;
                    if (i14 >= i12) {
                        break;
                    }
                    char c12 = cArr3[i14];
                    completedVar.getSDKAppID = c12;
                    char c13 = cArr3[i14 + 1];
                    completedVar.getSDKReferenceNumber = c13;
                    if (c12 == c13) {
                        cArr4[i14] = (char) (c12 - b11);
                        cArr4[i14 + 1] = (char) (c13 - b11);
                        cCharValue = cCharValue;
                    } else {
                        Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                        Map map3 = getMessageVersion.timedout;
                        Object obj2 = map3.get(700818725);
                        if (obj2 != null) {
                            method = obj2;
                        } else {
                            Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1920 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), Color.red(0) + 29);
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr7 = new Object[1];
                            d(b14, b15, b15, objArr7);
                            String str2 = (String) objArr7[0];
                            Class cls7 = Integer.TYPE;
                            method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                            map3.put(700818725, method);
                        }
                        int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        int i15 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i15) {
                            Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                            Object method4 = map3.get(-248084636);
                            if (method4 == null) {
                                Class cls8 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0, 0) + 1722, (char) (48634 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                                byte b16 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                d((byte) 49, b16, b16, objArr9);
                                String str3 = (String) objArr9[0];
                                Class cls9 = Integer.TYPE;
                                method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                                map3.put(-248084636, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i16 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i17 = completedVar.getSDKTransactionID;
                            cArr4[i17] = cArr[iIntValue2];
                            cArr4[i17 + 1] = cArr[i16];
                        } else {
                            int i18 = completedVar.getDeviceData;
                            int i19 = completedVar.AuthenticationRequestParameters;
                            if (i18 == i19) {
                                int i21 = ($10 + 31) % 128;
                                $11 = i21;
                                int i22 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i22;
                                int i23 = ((i15 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i23;
                                int i24 = (i19 * cCharValue) + i23;
                                int i25 = completedVar.getSDKTransactionID;
                                cArr4[i25] = cArr[(i18 * cCharValue) + i22];
                                cArr4[i25 + 1] = cArr[i24];
                                $10 = (i21 + 25) % 128;
                            } else {
                                int i26 = (i18 * cCharValue) + i15;
                                int i27 = (i19 * cCharValue) + completedVar.getMessageVersion;
                                int i28 = completedVar.getSDKTransactionID;
                                cArr4[i28] = cArr[i26];
                                cArr4[i28 + 1] = cArr[i27];
                            }
                            completedVar.getSDKTransactionID += 2;
                            cCharValue = cCharValue;
                        }
                    }
                    completedVar.getSDKTransactionID += 2;
                    cCharValue = cCharValue;
                }
            }
            for (int i29 = 0; i29 < i11; i29++) {
                cArr4[i29] = (char) (cArr4[i29] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        private static void c(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            String str2 = "";
            int i13 = 2;
            if (str != null) {
                int i14 = $11 + 85;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            int i15 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i16 = challengeStatusHandler.getSDKReferenceNumber;
                if (i16 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                int i17 = ($11 + 11) % 128;
                $10 = i17;
                cArr3[i15] = cArr[i16];
                int i18 = 1;
                cArr3[1] = cArr[i16 + 1];
                $11 = (i17 + 105) % 128;
                int i19 = 58224;
                int i21 = i15;
                while (i21 < 16) {
                    char c11 = cArr3[i18];
                    char c12 = cArr3[i15];
                    int i22 = i13;
                    char[] cArr4 = cArr;
                    int i23 = (c12 + i19) ^ ((c12 << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                    int i24 = c12 >>> 5;
                    int i25 = i18;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(ChallengeResult);
                        objArr2[i22] = Integer.valueOf(i24);
                        objArr2[i25] = Integer.valueOf(i23);
                        objArr2[i15] = Integer.valueOf(c11);
                        Map map = getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i15;
                        } else {
                            Class cls2 = (Class) getMessageVersion.getSDKTransactionID((-16775471) - Color.rgb(i15, i15, i15), (char) (MotionEvent.axisFromString(str2) + 16683), 28 - TextUtils.lastIndexOf(str2, '0', i15, i15));
                            byte b11 = (byte) i15;
                            i12 = i15;
                            Object[] objArr3 = new Object[i25];
                            d((byte) 10, b11, b11, objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i26 = (cCharValue + i19) ^ (((char) (((long) AuthenticationRequestParameters) ^ (-2881362678149017980L))) + (cCharValue << 4));
                        int i27 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(getDeviceData);
                        objArr4[i22] = Integer.valueOf(i27);
                        objArr4[1] = Integer.valueOf(i26);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 1745, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16681), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29);
                            byte b12 = (byte) i12;
                            Object[] objArr5 = new Object[1];
                            d((byte) 10, b12, b12, objArr5);
                            method2 = cls3.getMethod((String) objArr5[i12], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i19 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i21++;
                        i13 = i22;
                        cArr = cArr4;
                        str2 = str2;
                        cArr3 = cArr3;
                        i15 = 0;
                        i18 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                String str3 = str2;
                int i28 = i13;
                char[] cArr5 = cArr;
                char[] cArr6 = cArr3;
                int i29 = challengeStatusHandler.getSDKReferenceNumber;
                cArr2[i29] = cArr6[0];
                cArr2[i29 + 1] = cArr6[1];
                Object[] objArr6 = new Object[i28];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + 1596, (char) (Color.green(0) + 27824), ExpandableListView.getPackedPositionType(0L) + 25);
                    byte b13 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    d((byte) 6, b13, b13, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                cArr = cArr5;
                cArr3 = cArr6;
                i15 = 0;
                i13 = i28;
                str2 = str3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r0 = r8 + 1
                int r6 = 122 - r6
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r1 = atd.t.getDeviceData.getSDKTransactionID.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r6 = r8
                r3 = r1
                r4 = r2
                r1 = r7
                goto L2f
            L16:
                r3 = r2
            L17:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r1
                r1 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2f:
                int r6 = r6 + r7
                r7 = r1
                r1 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.t.getDeviceData.getSDKTransactionID.d(byte, short, short, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(android.content.Context r30, int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 1561
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.t.getDeviceData.getSDKTransactionID.getDeviceData(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{20, -70, -28, 54, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10};
            $$b = 79;
        }

        static void init$1() {
            $$d = new byte[]{63, -110, -75, -71};
            $$e = 65;
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        getSDKTransactionID = 0;
        ChallengeResultCancelled = 1;
        getSDKReferenceNumber();
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollBarSize();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        new getSDKTransactionID((byte) 0);
        ChallengeResultCancelled = (getSDKTransactionID + 11) % 128;
    }

    public getDeviceData(Application application) {
        s.k(application, "");
        this.getSDKAppID = application;
    }

    static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{52463, 52383, 52456, 52460};
        AuthenticationRequestParameters = (char) 63814;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0151  */
    /* JADX WARN: Code duplicated, block: B:36:0x0152  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= charArray.length) {
                break;
            }
            char c11 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    method = obj;
                    i12 = i13;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(689 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 16022), 32 - (ViewConfiguration.getTapTimeout() >> 16));
                    byte b11 = (byte) i13;
                    byte b12 = b11;
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getDeviceData ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 416, (char) (29017 - TextUtils.getOffsetBefore("", i12)), 'H' - AndroidCharacter.getMirror('0'))).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                i13 = 0;
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
        long[] jArr2 = jArr;
        char[] cArr = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i15 = gettransactionstatus.getSDKTransactionID;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i15] = (char) jArr2[i15];
            Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(-46730980);
            if (method3 == null) {
                method3 = ((Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 417, (char) (29016 - ImageFormat.getBitsPerPixel(0)), 23 - MotionEvent.axisFromString(""))).getMethod("A", Object.class, Object.class);
                map2.put(-46730980, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 118
            byte[] r0 = atd.t.getDeviceData.$$a
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.t.getDeviceData.b(short, short, int, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getDeviceData = 1790712339231128678L;
    }

    static void init$0() {
        $$a = new byte[]{88, 47, 87, -126};
        $$b = 180;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String installingPackageName;
        if (Build.VERSION.SDK_INT >= 30) {
            int i11 = getSDKTransactionID + 115;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 == 0) {
                this.getSDKAppID.getPackageManager().getInstallSourceInfo(this.getSDKAppID.getPackageName()).getInstallingPackageName();
                throw null;
            }
            installingPackageName = this.getSDKAppID.getPackageManager().getInstallSourceInfo(this.getSDKAppID.getPackageName()).getInstallingPackageName();
        } else {
            PackageManager packageManager = this.getSDKAppID.getPackageManager();
            String packageName = this.getSDKAppID.getPackageName();
            getSDKTransactionID = (ChallengeResultCancelled + 13) % 128;
            try {
                Object[] objArr = new Object[1];
                a("榹\uecbf掮\ue6b1經\uf09c瞊쫉䇳쓦寬\udecf嗑ꣃ⿒ꉱ㤸밬㍔똣\u0d0d耆ݵ驶ᅧ鑜\ueb7f湊\ue54a箼ﺱ疪좊", (ViewConfiguration.getTapTimeout() >> 16) + 34057, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a("榿\udd7a\"矄몪\uee48唆飈쾌㍋晻괧ნ䞢譙\ufe1a◉梈\udc43͓瘵뷦\ue0a7", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 46279, objArr2);
                installingPackageName = (String) cls.getMethod((String) objArr2[0], String.class).invoke(packageManager, packageName);
                ChallengeResultCancelled = (getSDKTransactionID + 61) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        if (installingPackageName != null) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(installingPackageName));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getSDKTransactionID = (ChallengeResultCancelled + 31) % 128;
        return failure;
    }
}
