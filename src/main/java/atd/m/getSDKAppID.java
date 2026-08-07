package atd.m;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Display;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static char[] getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Display$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static char getDeviceData;
        private static char getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static char getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKEphemeralPublicKey = 1;
            getSDKAppID = (char) 46739;
            AuthenticationRequestParameters = (char) 55024;
            getDeviceData = (char) 63639;
            getSDKReferenceNumber = (char) 21448;
        }

        private getSDKReferenceNumber() {
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
        private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 6
                int r7 = r7 + 97
                int r8 = r8 * 17
                int r8 = 38 - r8
                byte[] r0 = atd.m.getSDKAppID.getSDKReferenceNumber.$$a
                int r9 = r9 * 37
                int r9 = r9 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r9
                goto L2d
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r0
                r0 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r7 = -r7
                int r9 = r9 + 1
                int r0 = r0 + r7
                int r7 = r0 + (-8)
                r0 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getSDKAppID.getSDKReferenceNumber.a(byte, byte, short, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            float f11;
            int i12;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
            char[] cArr = new char[charArray.length];
            int i13 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            int i14 = 2;
            char[] cArr2 = new char[2];
            while (true) {
                int i15 = challengeStatusHandler.getSDKReferenceNumber;
                if (i15 >= charArray.length) {
                    break;
                }
                cArr2[i13] = charArray[i15];
                int i16 = 1;
                cArr2[1] = charArray[i15 + 1];
                int i17 = 58224;
                int i18 = i13;
                while (i18 < 16) {
                    char c11 = cArr2[i16];
                    char c12 = cArr2[i13];
                    int i19 = i14;
                    char[] cArr3 = cArr2;
                    int i21 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i22 = c12 >>> 5;
                    int i23 = i16;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKReferenceNumber);
                        objArr2[i19] = Integer.valueOf(i22);
                        objArr2[i23] = Integer.valueOf(i21);
                        objArr2[i13] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i13;
                            f11 = 0.0f;
                        } else {
                            f11 = 0.0f;
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - (TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16682), 29 - TextUtils.getOffsetAfter("", i13));
                            byte b11 = (byte) i13;
                            byte b12 = b11;
                            i12 = i13;
                            Object[] objArr3 = new Object[i23];
                            c(b11, b12, (byte) (b12 + 1), objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i24 = i17;
                        int i25 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ (-2881362678149017980L))));
                        int i26 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                        objArr4[i19] = Integer.valueOf(i26);
                        objArr4[1] = Integer.valueOf(i25);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16682), 29 - (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)));
                            int i27 = i12;
                            byte b13 = (byte) i27;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            c(b13, b14, (byte) (b14 + 1), objArr5);
                            method2 = cls3.getMethod((String) objArr5[i27], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i17 = i24 - FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i18++;
                        $11 = ($10 + 1) % 128;
                        i14 = i19;
                        cArr2 = cArr3;
                        charArray = charArray;
                        i13 = 0;
                        i16 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = charArray;
                int i28 = i14;
                char[] cArr5 = cArr2;
                int i29 = challengeStatusHandler.getSDKReferenceNumber;
                cArr[i29] = cArr5[0];
                cArr[i29 + 1] = cArr5[1];
                Object[] objArr6 = new Object[i28];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 1597, (char) (27824 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (KeyEvent.getMaxKeyCode() >> 16) + 25);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    c(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                $10 = ($11 + 15) % 128;
                cArr2 = cArr5;
                charArray = cArr4;
                i13 = 0;
                i14 = 2;
            }
            String str2 = new String(cArr, 0, i11);
            int i31 = $11 + 25;
            $10 = i31 % 128;
            if (i31 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        private static void c(short s11, short s12, int i11, Object[] objArr) {
            int i12 = s12 * 2;
            int i13 = 116 - (i11 * 4);
            int i14 = (s11 * 2) + 4;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i12 + 1];
            int i15 = -1;
            if (bArr == null) {
                i13 = i12 + i13;
                i14++;
            }
            while (true) {
                i15++;
                bArr2[i15] = (byte) i13;
                if (i15 == i12) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i13 += bArr[i14];
                    i14++;
                }
            }
        }

        public static void getSDKReferenceNumber(long j11, long j12) throws Throwable {
            int i11 = getSDKTransactionID + 67;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                byte b11 = $$a[36];
                byte b12 = b11;
                Object[] objArr = new Object[1];
                a(b11, b12, b12, objArr);
                Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
                int i12 = 43 / 0;
            } else {
                byte b13 = $$a[36];
                byte b14 = b13;
                Object[] objArr2 = new Object[1];
                a(b13, b14, b14, objArr2);
                Class.forName((String) objArr2[0]).getField("getSDKReferenceNumber").get(null);
            }
            getSDKTransactionID = (getSDKEphemeralPublicKey + 105) % 128;
            try {
                byte[] bArr = $$a;
                byte b15 = bArr[36];
                byte b16 = b15;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b17 = (byte) (bArr[36] + 1);
                byte b18 = b17;
                Object[] objArr4 = new Object[1];
                a(b17, b18, b18, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(null, null);
                Object[] objArr5 = {atd.ap.getDeviceData.class.getField("getSDKAppID").get(null)};
                Object[] objArr6 = new Object[1];
                b("埃梆Ỉ\udbd8", 3 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr6);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{87, 105, -57, -104, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
            $$b = 10;
        }

        static void init$1() {
            $$d = new byte[]{32, 120, 5, 50};
            $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        new getSDKReferenceNumber((byte) 0);
        int i11 = getSDKAppID + 23;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = new char[]{30810, 30972, 30850, 30855};
    }

    private static String getSDKTransactionID() {
        getSDKReferenceNumber = (getSDKAppID + 33) % 128;
        String str = Build.DISPLAY;
        s.j(str, "");
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
        int i11 = getSDKReferenceNumber + 61;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return strM50constructorimpl;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getSDKReferenceNumber = (getSDKAppID + 101) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
        getSDKReferenceNumber = (getSDKAppID + 83) % 128;
        return stringValueM49boximpl;
    }
}
