package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n*\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/DeviceId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "deviceId", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "findDeviceId", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData;
    private static long getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/DeviceId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
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
            AuthenticationRequestParameters = (char) 36193;
            getSDKAppID = (char) 54805;
            getSDKReferenceNumber = (char) 16105;
            getDeviceData = (char) 13185;
        }

        private AuthenticationRequestParameters() {
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            int i13 = $10;
            $11 = (i13 + 93) % 128;
            int i14 = 2;
            if (str != null) {
                int i15 = i13 + 103;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            int i16 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            char[] cArr3 = new char[2];
            $10 = ($11 + 25) % 128;
            while (true) {
                int i17 = challengeStatusHandler.getSDKReferenceNumber;
                if (i17 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                cArr3[i16] = cArr[i17];
                char c11 = 1;
                cArr3[1] = cArr[i17 + 1];
                int i18 = 58224;
                int i19 = i16;
                while (i19 < 16) {
                    char c12 = cArr3[c11];
                    char c13 = cArr3[i16];
                    int i21 = (c13 + i18) ^ ((c13 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                    int i22 = c13 >>> 5;
                    int i23 = i14;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getDeviceData);
                        objArr2[i23] = Integer.valueOf(i22);
                        objArr2[c11] = Integer.valueOf(i21);
                        objArr2[i16] = Integer.valueOf(c12);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i16;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - View.MeasureSpec.getMode(i16), (char) (16681 - MotionEvent.axisFromString("")), 29 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            byte b11 = (byte) i16;
                            byte b12 = (byte) (b11 + 1);
                            i12 = i16;
                            Object[] objArr3 = new Object[1];
                            c(b11, b12, (byte) (b12 - 1), objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c14 = cArr3[i12];
                        int i24 = (cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ (-2881362678149017980L))));
                        int i25 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(getSDKAppID);
                        objArr4[i23] = Integer.valueOf(i25);
                        objArr4[1] = Integer.valueOf(i24);
                        objArr4[i12] = Integer.valueOf(c14);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            int i26 = i12;
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1745, (char) (16682 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 28 - (ExpandableListView.getPackedPositionForChild(i26, i26) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i26, i26) == 0L ? 0 : -1)));
                            byte b13 = (byte) i26;
                            byte b14 = (byte) (b13 + 1);
                            Object[] objArr5 = new Object[1];
                            c(b13, b14, (byte) (b14 - 1), objArr5);
                            method2 = cls3.getMethod((String) objArr5[i26], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i18 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i19++;
                        i14 = i23;
                        cArr = cArr;
                        cArr3 = cArr3;
                        i16 = 0;
                        c11 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = cArr;
                int i27 = i14;
                char[] cArr5 = cArr3;
                int i28 = challengeStatusHandler.getSDKReferenceNumber;
                cArr2[i28] = cArr5[0];
                cArr2[i28 + 1] = cArr5[1];
                Object[] objArr6 = new Object[i27];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1596 - Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27824), ExpandableListView.getPackedPositionGroup(0L) + 25);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    c(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                cArr3 = cArr5;
                i16 = 0;
                i14 = i27;
                cArr = cArr4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 20
                int r7 = 23 - r7
                byte[] r0 = atd.w.getDeviceData.AuthenticationRequestParameters.$$a
                int r8 = r8 * 18
                int r1 = r8 + 3
                int r6 = r6 * 2
                int r6 = 105 - r6
                byte[] r1 = new byte[r1]
                int r8 = r8 + 2
                r2 = 0
                if (r0 != 0) goto L1a
                r6 = r8
                r3 = r0
                r4 = r2
                r0 = r7
                goto L33
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r7 = r7 + 1
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L33:
                int r6 = r6 + r7
                int r6 = r6 + 3
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getDeviceData.AuthenticationRequestParameters.b(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r0 = 1 - r6
                int r7 = r7 * 4
                int r7 = 116 - r7
                byte[] r1 = atd.w.getDeviceData.AuthenticationRequestParameters.$$d
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L19
                r3 = r1
                r4 = r2
                r1 = r8
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r1
                r1 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r8 = r8 + 1
                int r7 = -r7
                int r7 = r7 + r1
                r1 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getDeviceData.AuthenticationRequestParameters.c(short, int, int, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(int r38, int r39) {
            /*
                Method dump skipped, instruction units count: 2048
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getDeviceData.AuthenticationRequestParameters.getSDKAppID(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{55, -88, -54, 122, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10, 2, -24};
            $$b = 196;
        }

        static void init$1() {
            $$d = new byte[]{5, -65, 35, -69};
            $$e = 121;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        ViewConfiguration.getTapTimeout();
        new AuthenticationRequestParameters((byte) 0);
        AuthenticationRequestParameters = (getDeviceData + 23) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDeviceData(Application application) {
        super(application);
        s.k(application, "");
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String ct_(TelephonyManager telephonyManager) {
        getDeviceData = (AuthenticationRequestParameters + 99) % 128;
        String deviceId = telephonyManager.getDeviceId();
        int i11 = AuthenticationRequestParameters + 77;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return deviceId;
        }
        throw null;
    }

    @SuppressLint({"MissingPermission"})
    private static String cu_(TelephonyManager telephonyManager) {
        AuthenticationRequestParameters = (getDeviceData + 67) % 128;
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType != 1) {
            if (phoneType != 2) {
                return null;
            }
            return telephonyManager.getMeid();
        }
        String imei = telephonyManager.getImei();
        int i11 = getDeviceData + 107;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return imei;
        }
        throw null;
    }

    static void getSDKReferenceNumber() {
        getSDKTransactionID = -4862801263903334749L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        try {
            String strCu_ = null;
            if (Build.VERSION.SDK_INT < 26) {
                TelephonyManager telephonyManagerCF_ = cF_();
                if (telephonyManagerCF_ != null) {
                    AuthenticationRequestParameters = (getDeviceData + 121) % 128;
                    strCu_ = ct_(telephonyManagerCF_);
                }
            } else {
                TelephonyManager telephonyManagerCF_2 = cF_();
                if (telephonyManagerCF_2 != null) {
                    AuthenticationRequestParameters = (getDeviceData + 111) % 128;
                    strCu_ = cu_(telephonyManagerCF_2);
                }
            }
            return strCu_ != null ? DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCu_)) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        } catch (SecurityException unused) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
    }
}
