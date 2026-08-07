package atd.d;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCompleted {
    private static int BuildConfig = 1;
    private static int getSDKTransactionID;
    private final byte[] AuthenticationRequestParameters;
    private final int getDeviceData;
    private final String getSDKAppID;
    private final Map<String, List<String>> getSDKReferenceNumber;

    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int BuildConfig;
        private static int getSDKEphemeralPublicKey;
        String getDeviceData;
        int getSDKAppID;
        Map<String, List<String>> getSDKReferenceNumber;
        byte[] getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            BuildConfig = 0;
            getSDKEphemeralPublicKey = 1;
            AuthenticationRequestParameters = 1683118884962843206L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 6
                int r8 = r8 + 97
                int r7 = r7 + 4
                byte[] r0 = atd.d.ChallengeResultCompleted.getSDKReferenceNumber.$$a
                int r6 = r6 * 17
                int r1 = r6 + 21
                byte[] r1 = new byte[r1]
                int r6 = r6 + 20
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r6
                goto L2f
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                int r7 = r7 + 1
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r0[r7]
                r5 = r0
                r0 = r8
                r8 = r3
                r3 = r5
            L2f:
                int r8 = -r8
                int r0 = r0 + r8
                int r8 = r0 + (-8)
                r0 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.ChallengeResultCompleted.getSDKReferenceNumber.a(short, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0178  */
        /* JADX WARN: Code duplicated, block: B:39:0x0179  */
        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            Throwable cause;
            int i12;
            Object method;
            char c11 = 2;
            int i13 = 0;
            if (str != null) {
                int i14 = $11 + 29;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    charArray = str.toCharArray();
                    int i15 = 58 / 0;
                } else {
                    charArray = str.toCharArray();
                }
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
            gettransactionstatus.getSDKAppID = i11;
            int length = cArr.length;
            long[] jArr = new long[length];
            gettransactionstatus.getSDKTransactionID = 0;
            $11 = ($10 + 119) % 128;
            while (true) {
                int i16 = gettransactionstatus.getSDKTransactionID;
                if (i16 >= cArr.length) {
                    break;
                }
                char c12 = cArr[i16];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[c11] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i13] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        method = obj;
                        i12 = i13;
                    } else {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 688, (char) (16022 - TextUtils.indexOf("", "")), 32 - View.MeasureSpec.makeMeasureSpec(i13, i13));
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        int i17 = i12;
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - TextUtils.indexOf("", "", i17), (char) (29017 - KeyEvent.keyCodeFromString("")), 24 - KeyEvent.getDeadChar(i17, i17))).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    $11 = ($10 + 19) % 128;
                    jArr = jArr;
                    c11 = 2;
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
            char[] cArr2 = new char[length];
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i18 = gettransactionstatus.getSDKTransactionID;
                if (i18 >= cArr.length) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                $10 = ($11 + 81) % 128;
                cArr2[i18] = (char) jArr2[i18];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 416, (char) (29017 - TextUtils.getOffsetAfter("", 0)), 24 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            }
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
        private static void c(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = atd.d.ChallengeResultCompleted.getSDKReferenceNumber.$$d
                int r6 = r6 * 3
                int r6 = 4 - r6
                int r5 = r5 * 3
                int r1 = 1 - r5
                int r7 = r7 * 3
                int r7 = 118 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r6]
            L2a:
                int r6 = r6 + 1
                int r7 = r7 + r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.ChallengeResultCompleted.getSDKReferenceNumber.c(byte, short, int, java.lang.Object[]):void");
        }

        private static void getSDKAppID() throws Throwable {
            BuildConfig = (getSDKEphemeralPublicKey + 113) % 128;
            byte[] bArr = $$a;
            byte b11 = bArr[36];
            byte b12 = (byte) (b11 + 1);
            Object[] objArr = new Object[1];
            a(b12, (byte) (-b12), b11, objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            getSDKEphemeralPublicKey = (BuildConfig + 63) % 128;
            try {
                byte b13 = bArr[36];
                byte b14 = (byte) (b13 + 1);
                Object[] objArr2 = new Object[1];
                a(b14, (byte) (-b14), b13, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b15 = bArr[36];
                byte b16 = b15;
                Object[] objArr3 = new Object[1];
                a(b16, (byte) (b16 | 36), (byte) (b15 + 1), objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b("\uef99山衆", 46062 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr5);
                int i11 = BuildConfig + 71;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
            return getSDKTransactionID(objArr);
        }

        static void init$0() {
            $$a = new byte[]{55, -88, -54, 122, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
            $$b = 118;
        }

        static void init$1() {
            $$d = new byte[]{125, -62, 102, 61};
            $$e = 40;
        }

        public final getSDKReferenceNumber AuthenticationRequestParameters(String str) {
            int i11 = getSDKEphemeralPublicKey;
            this.getDeviceData = str;
            int i12 = i11 + 99;
            BuildConfig = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 85 / 0;
            }
            return this;
        }

        public final getSDKReferenceNumber getDeviceData(Map<String, List<String>> map) {
            return (getSDKReferenceNumber) getSDKTransactionID(new Object[]{this, map}, -1999070795, 1999070795, System.identityHashCode(this));
        }

        public final getSDKReferenceNumber getSDKTransactionID(int i11) {
            int i12 = BuildConfig + 81;
            getSDKEphemeralPublicKey = i12 % 128;
            if (i12 % 2 != 0) {
                this.getSDKAppID = i11;
                return this;
            }
            this.getSDKAppID = i11;
            throw null;
        }

        public final ChallengeResultCompleted AuthenticationRequestParameters() {
            ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted(this);
            BuildConfig = (getSDKEphemeralPublicKey + 17) % 128;
            return challengeResultCompleted;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
            Map<String, List<String>> map = (Map) objArr[1];
            int i11 = getSDKEphemeralPublicKey + 65;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                getsdkreferencenumber.getSDKReferenceNumber = map;
                return getsdkreferencenumber;
            }
            getsdkreferencenumber.getSDKReferenceNumber = map;
            throw null;
        }

        public final getSDKReferenceNumber getSDKTransactionID(byte[] bArr) {
            int i11 = getSDKEphemeralPublicKey + 29;
            BuildConfig = i11 % 128;
            byte[] bArrCopyOf = null;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (bArr != null) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                getSDKEphemeralPublicKey = (BuildConfig + 81) % 128;
            }
            this.getSDKTransactionID = bArrCopyOf;
            return this;
        }
    }

    ChallengeResultCompleted(getSDKReferenceNumber getsdkreferencenumber) {
        this.getDeviceData = getsdkreferencenumber.getSDKAppID;
        this.getSDKAppID = getsdkreferencenumber.getDeviceData;
        this.getSDKReferenceNumber = getsdkreferencenumber.getSDKReferenceNumber;
        this.AuthenticationRequestParameters = getsdkreferencenumber.getSDKTransactionID;
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~((~i11) | i12);
        return ((((i11 * 71) + (i12 * (-69))) + (((~(i12 | i13)) | i14) * (-140))) + ((~((i11 | i12) | i13)) * 70)) + (((~(i11 | i13)) | ((~((~i12) | i11)) | i14)) * 70) != 1 ? getSDKReferenceNumber(objArr) : getSDKAppID(objArr);
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        int i11 = BuildConfig;
        getSDKTransactionID = (i11 + 3) % 128;
        Map<String, List<String>> map = challengeResultCompleted.getSDKReferenceNumber;
        int i12 = (((i11 | 76) << 1) - (i11 ^ 76)) - 1;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            return map;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = ((i11 ^ 105) | (i11 & 105)) << 1;
        int i13 = -((i11 & (-106)) | ((~i11) & 105));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        int i15 = i14 % 128;
        BuildConfig = i15;
        int i16 = i14 % 2;
        byte[] bArr = challengeResultCompleted.AuthenticationRequestParameters;
        if (i16 == 0) {
            throw null;
        }
        if (bArr == null) {
            int i17 = i11 & 117;
            int i18 = (((i11 | 117) & (~i17)) - (~(i17 << 1))) - 1;
            BuildConfig = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i19 = i15 ^ 117;
        int i21 = -(-((i15 & 117) << 1));
        getSDKTransactionID = ((i19 ^ i21) + ((i19 & i21) << 1)) % 128;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i22 = BuildConfig;
        int i23 = (i22 & 12) + (i22 | 12);
        getSDKTransactionID = ((i23 ^ (-1)) + (i23 << 1)) % 128;
        return bArrCopyOf;
    }

    public final byte[] AuthenticationRequestParameters() {
        return (byte[]) getDeviceData(new Object[]{this}, 467212410, -467212410, System.identityHashCode(this));
    }

    public final Map<String, List<String>> getSDKAppID() {
        return (Map) getDeviceData(new Object[]{this}, 1373143129, -1373143128, System.identityHashCode(this));
    }
}
