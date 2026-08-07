package atd.ag;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultCompleted;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData extends SecretKeySpec {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static char BuildConfig;
    private static int ChallengeResult;
    private static char getDeviceData;
    private static int[] getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKTransactionID;
    private final SecretKey getSDKAppID;
    private final SecretKey getSDKReferenceNumber;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        getDeviceData = (char) 59217;
        AuthenticationRequestParameters = (char) 30675;
        getSDKTransactionID = (char) 3436;
        BuildConfig = (char) 37130;
        getMessageVersion = new int[]{2065276001, -160508951, 1698643435, -1303879611, 1859076391, 1099979966, -391570353, 962801870, 664106592, -1510725678, -329189588, 1114281169, -2010615909, 1892518530, 2004989737, 943741079, -1891943063, -963122437};
    }

    public getDeviceData(byte[] bArr, AuthenticationRequestParameters authenticationRequestParameters) {
        super(bArr, authenticationRequestParameters.getDeviceData());
        int length = bArr.length;
        int i11 = length / 2;
        this.getSDKAppID = new SecretKeySpec(Arrays.copyOfRange(bArr, i11, length), authenticationRequestParameters.getDeviceData());
        this.getSDKReferenceNumber = new SecretKeySpec(Arrays.copyOfRange(bArr, 0, i11), authenticationRequestParameters.BuildConfig());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r0 = atd.ag.getDeviceData.$$a
            int r7 = r7 * 4
            int r1 = r7 + 21
            int r6 = r6 * 4
            int r6 = r6 + 103
            byte[] r1 = new byte[r1]
            int r7 = r7 + 20
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r6 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + 3
            int r5 = r5 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getDeviceData.a(byte, byte, int, java.lang.Object[]):void");
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14 = 2;
        if (str != null) {
            int i15 = $11 + 35;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
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
        int i16 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr3 = new char[2];
        int i17 = 1;
        $11 = ($10 + 1) % 128;
        while (true) {
            int i18 = challengeStatusHandler.getSDKReferenceNumber;
            if (i18 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i19 = $11 + 115;
            $10 = i19 % 128;
            int i21 = 58224;
            if (i19 % i14 != 0) {
                cArr3[i16] = cArr[i18];
                cArr3[i17] = cArr[i18 % 0];
            } else {
                cArr3[i16] = cArr[i18];
                cArr3[i17] = cArr[i18 + 1];
            }
            int i22 = i16;
            while (i22 < 16) {
                char c11 = cArr3[i17];
                char c12 = cArr3[i16];
                int i23 = i14;
                int i24 = (c12 + i21) ^ ((c12 << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                int i25 = c12 >>> 5;
                int i26 = i17;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(BuildConfig);
                    objArr2[i23] = Integer.valueOf(i25);
                    objArr2[i26] = Integer.valueOf(i24);
                    objArr2[i16] = Integer.valueOf(c11);
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i13 = i16;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(1745 - Drawable.resolveOpacity(i16, i16), (char) (16682 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 29 - View.combineMeasuredStates(i16, i16));
                        byte b11 = (byte) i16;
                        byte b12 = b11;
                        i13 = i16;
                        Object[] objArr3 = new Object[i26];
                        d(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i13], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c13 = cArr3[i13];
                    int i27 = (cCharValue + i21) ^ ((cCharValue << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i28 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr4[i23] = Integer.valueOf(i28);
                    objArr4[1] = Integer.valueOf(i27);
                    objArr4[i13] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 1745, (char) ((Process.myTid() >> 22) + 16682), 29 - (Process.myTid() >> 22));
                        int i29 = i13;
                        byte b13 = (byte) i29;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        d(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i29], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i21 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i22++;
                    $10 = ($11 + 117) % 128;
                    i14 = i23;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i16 = 0;
                    i17 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i31 = i14;
            char[] cArr4 = cArr;
            char[] cArr5 = cArr3;
            int i32 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i32] = cArr5[0];
            cArr2[i32 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i31];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 != null) {
                i12 = 1;
            } else {
                Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1597 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27824), (Process.myPid() >> 22) + 25);
                byte length = (byte) $$d.length;
                byte b15 = (byte) (length - 4);
                i12 = 1;
                Object[] objArr7 = new Object[1];
                d(length, b15, b15, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i31;
            i17 = i12;
            cArr = cArr4;
            cArr3 = cArr5;
            i16 = 0;
        }
    }

    private static void c(int[] iArr, int i11, Object[] objArr) throws Throwable {
        long j11;
        Object method;
        int i12;
        Object method2;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i13 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getMessageVersion;
        Class cls = Integer.TYPE;
        int i14 = 0;
        if (iArr2 != null) {
            j11 = 0;
            $10 = ($11 + 55) % 128;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i15 = 0;
            while (i15 < length) {
                $11 = ($10 + 43) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i15])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        i12 = i14;
                        method2 = obj;
                    } else {
                        i12 = i14;
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(1862 - (ExpandableListView.getPackedPositionForGroup(i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i14) == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(i14, i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i14, i14) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20);
                        byte b11 = (byte) ($$e & 5);
                        byte b12 = (byte) (b11 - 5);
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, b12, objArr3);
                        method2 = cls2.getMethod((String) objArr3[i12], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i15] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i15++;
                    i14 = i12;
                    cArr = cArr;
                    iArr2 = iArr2;
                    length = length;
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
            j11 = 0;
        }
        char[] cArr3 = cArr;
        int i16 = i14;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getMessageVersion;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i17 = i16;
            while (i17 < length3) {
                int i18 = $11 + 95;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i17])};
                    Map map2 = getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        int i19 = i16;
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 1862, (char) KeyEvent.keyCodeFromString(""), Color.rgb(i19, i19, i19) + 16777237);
                        byte b13 = (byte) ($$e & 5);
                        byte b14 = (byte) (b13 - 5);
                        Object[] objArr5 = new Object[1];
                        d(b13, b14, b14, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr6[i17] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i17--;
                } else {
                    cArr2 = cArr2;
                    iArr5 = iArr5;
                    length3 = length3;
                    iArr6 = iArr6;
                    int i21 = i17;
                    Object[] objArr6 = {Integer.valueOf(iArr5[i21])};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1862 - TextUtils.getOffsetAfter("", 0), (char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 20 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        byte b15 = (byte) ($$e & 5);
                        byte b16 = (byte) (b15 - 5);
                        Object[] objArr7 = new Object[1];
                        d(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr6[i21] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i17 = i21 + 1;
                }
                length3 = length3;
                iArr5 = iArr5;
                iArr6 = iArr6;
                cArr2 = cArr2;
                i16 = 0;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr2;
        int i22 = 16;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        char c11 = 17;
        $10 = ($11 + 17) % 128;
        while (true) {
            int i23 = challengeResultCompleted.getDeviceData;
            if (i23 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i24 = iArr[i23];
            char c12 = (char) (i24 >> 16);
            cArr3[0] = c12;
            char c13 = (char) i24;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i23 + 1] >> 16);
            cArr3[i13] = c14;
            char c15 = (char) iArr[i23 + 1];
            char c16 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i25 = 0;
            while (i25 < i22) {
                int i26 = challengeResultCompleted.getSDKAppID ^ iArr4[i25];
                challengeResultCompleted.getSDKAppID = i26;
                int sDKAppID = ChallengeResultCompleted.getSDKAppID(i26);
                Object[] objArr8 = new Object[4];
                objArr8[c16] = challengeResultCompleted;
                objArr8[i13] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID(1299 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((SystemClock.elapsedRealtime() > j11 ? 1 : (SystemClock.elapsedRealtime() == j11 ? 0 : -1)) + CipherSuite.TLS_PSK_WITH_AES_128_CCM_8), 33 - ((Process.getThreadPriority(0) + 20) >> 6));
                    byte b17 = (byte) 0;
                    Object[] objArr9 = new Object[1];
                    d((byte) (-$$d[c16]), b17, b17, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i25++;
                c11 = c11;
                c16 = c16;
                i22 = 16;
            }
            char c17 = c11;
            char c18 = c16;
            int i27 = challengeResultCompleted.getSDKAppID;
            int i28 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i28;
            challengeResultCompleted.getSDKReferenceNumber = i27;
            int i29 = i27 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i29;
            int i31 = i28 ^ iArr4[c17];
            challengeResultCompleted.getSDKAppID = i31;
            cArr3[0] = (char) (i31 >>> 16);
            cArr3[1] = (char) i31;
            cArr3[i13] = (char) (i29 >>> 16);
            cArr3[c18] = (char) i29;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i32 = challengeResultCompleted.getDeviceData;
            cArr4[i32 * 2] = cArr3[0];
            cArr4[(i32 * 2) + 1] = cArr3[1];
            cArr4[(i32 * 2) + 2] = cArr3[i13];
            cArr4[(i32 * 2) + 3] = cArr3[c18];
            Object[] objArr10 = new Object[i13];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = getMessageVersion.timedout;
            Object method5 = map5.get(1109131256);
            if (method5 != null) {
                i22 = 16;
            } else {
                i22 = 16;
                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(2062 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > j11 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j11 ? 0 : -1)));
                byte b18 = (byte) 0;
                Object[] objArr11 = new Object[1];
                d((byte) ($$e & 7), b18, b18, objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(1109131256, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            c11 = c17;
            i13 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.ag.getDeviceData.$$d
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r6 = r6 + 112
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r0 + 1
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getDeviceData.d(byte, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{14, -72, -78, -9, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10};
        $$b = 174;
    }

    static void init$1() {
        $$d = new byte[]{102, 100, -115, -8};
        $$e = 191;
    }

    public final SecretKey getSDKAppID() {
        int i11 = (getSDKEphemeralPublicKey + 75) % 128;
        ChallengeResult = i11;
        SecretKey secretKey = this.getSDKAppID;
        getSDKEphemeralPublicKey = (i11 + 63) % 128;
        return secretKey;
    }

    public final Key getSDKReferenceNumber() {
        int i11 = getSDKEphemeralPublicKey + 59;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKReferenceNumber;
        }
        int i12 = 39 / 0;
        return this.getSDKReferenceNumber;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] getSDKAppID(android.content.Context r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getDeviceData.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
    }

    public getDeviceData(SecretKey secretKey, AuthenticationRequestParameters authenticationRequestParameters) {
        this(secretKey.getEncoded(), authenticationRequestParameters);
    }
}
