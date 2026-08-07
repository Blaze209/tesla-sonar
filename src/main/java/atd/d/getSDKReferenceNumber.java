package atd.d;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeResultKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
abstract class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static int ChallengeResultCancelled;
    private static final SSLSocketFactory getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getDeviceData();
        try {
            getDeviceData = new ChallengeResultTimeout();
            int i11 = ChallengeResultCancelled + 63;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (KeyManagementException | NoSuchAlgorithmException e11) {
            Object[] objArr = new Object[1];
            a(TextUtils.lastIndexOf("", '0') - 23, (-1424610682) + (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) TextUtils.indexOf("", "", 0), (-901790469) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            throw new RuntimeException(((String) objArr[0]).intern(), e11);
        }
    }

    getSDKReferenceNumber() {
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        long j11;
        int i14;
        int i15;
        long j12;
        int length;
        byte[] bArr;
        int i16;
        Object method;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        int i17 = 2;
        try {
            int i18 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(AuthenticationRequestParameters)};
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 != null) {
                i14 = 0;
                j11 = 0;
            } else {
                j11 = 0;
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2105, (char) (22043 - AndroidCharacter.getMirror('0')), 31 - ExpandableListView.getPackedPositionGroup(0L));
                byte b12 = (byte) 0;
                byte b13 = b12;
                i14 = 0;
                Object[] objArr3 = new Object[1];
                b(b12, b13, (byte) (b13 + 1), objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                $10 = ($11 + 71) % 128;
                i15 = 1;
            } else {
                i15 = i14;
            }
            if (i15 != 0) {
                byte[] bArr2 = getSDKTransactionID;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i19 = i14;
                    j12 = -671853308956415234L;
                    while (i19 < length2) {
                        Object[] objArr4 = {Integer.valueOf(bArr2[i19])};
                        int i21 = i18;
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(i14) + 2936, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 33 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr3[i19] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i19++;
                        i18 = i21;
                        i17 = i17;
                        bArr2 = bArr2;
                    }
                    bArr2 = bArr3;
                } else {
                    j12 = -671853308956415234L;
                }
                int i22 = i17;
                int i23 = i18;
                if (bArr2 != null) {
                    int i24 = $11 + 91;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        byte[] bArr4 = getSDKTransactionID;
                        Object[] objArr5 = new Object[i22];
                        objArr5[i23] = Integer.valueOf(getSDKAppID);
                        objArr5[i14] = Integer.valueOf(i13);
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(557807898);
                        if (method3 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2105, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)) + 21994), TextUtils.lastIndexOf("", '0') + 32);
                            int i25 = i14;
                            byte b14 = (byte) i25;
                            byte b15 = b14;
                            Object[] objArr6 = new Object[i23];
                            b(b14, b15, (byte) (b15 + 1), objArr6);
                            method3 = cls3.getMethod((String) objArr6[i25], cls, cls);
                            map3.put(557807898, method3);
                        }
                        i16 = ((byte) (((long) bArr4[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) | j12)) << ((int) (((long) AuthenticationRequestParameters) ^ j12));
                    } else {
                        byte[] bArr5 = getSDKTransactionID;
                        Object[] objArr7 = {Integer.valueOf(i13), Integer.valueOf(getSDKAppID)};
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object method4 = map4.get(557807898);
                        if (method4 == null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) + 2104, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21995), 31 - Color.green(0));
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            Object[] objArr8 = new Object[1];
                            b(b16, b17, (byte) (b17 + 1), objArr8);
                            method4 = cls4.getMethod((String) objArr8[0], cls, cls);
                            map4.put(557807898, method4);
                        }
                        i16 = ((byte) (((long) bArr5[((Integer) ((Method) method4).invoke(null, objArr7)).intValue()]) ^ j12)) + ((int) (((long) AuthenticationRequestParameters) ^ j12));
                    }
                    iIntValue = (byte) i16;
                    $10 = ($11 + 5) % 128;
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i13 + ((int) (((long) getSDKAppID) ^ j12))]) ^ j12)) + ((int) (((long) AuthenticationRequestParameters) ^ j12)));
                }
            } else {
                j12 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j12)) + i15;
                Object[] objArr9 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKReferenceNumber), sb2};
                Map map5 = atd.a.getMessageVersion.timedout;
                Object method5 = map5.get(-1793105104);
                if (method5 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2137 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - (Process.myTid() >> 22));
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr10 = new Object[1];
                    b(b18, b19, b19, objArr10);
                    method5 = cls5.getMethod((String) objArr10[0], Object.class, cls, cls, Object.class);
                    map5.put(-1793105104, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr9)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr6 = getSDKTransactionID;
                if (bArr6 != null) {
                    int i26 = $10 + 63;
                    $11 = i26 % 128;
                    if (i26 % 2 == 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i27 = 0; i27 < length; i27++) {
                        bArr[i27] = (byte) (((long) bArr6[i27]) ^ j12);
                    }
                    $11 = ($10 + 81) % 128;
                    bArr6 = bArr;
                }
                boolean z11 = bArr6 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    $10 = ($11 + 89) % 128;
                    if (z11) {
                        byte[] bArr7 = getSDKTransactionID;
                        int i28 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i28 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr7[i28]) ^ j12)) + s11)) ^ b11));
                    } else {
                        short[] sArr = ChallengeResult;
                        int i29 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i29 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i29]) ^ j12)) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
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
    private static void b(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.d.getSDKReferenceNumber.$$a
            int r5 = r5 * 4
            int r1 = r5 + 1
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 7
            int r7 = 121 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2e
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2e:
            int r6 = r6 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKReferenceNumber.b(byte, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{46, -33, 18, -76};
        $$b = 8;
    }

    final HttpURLConnection getDeviceData(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        if (!(httpURLConnection instanceof HttpsURLConnection)) {
            return getSDKAppID(httpURLConnection);
        }
        ChallengeResultCancelled = (BuildConfig + 59) % 128;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        httpsURLConnection.setSSLSocketFactory(getDeviceData);
        int i11 = ChallengeResultCancelled + 89;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 85 / 0;
        }
        return httpsURLConnection;
    }

    abstract HttpURLConnection getSDKAppID(HttpURLConnection httpURLConnection);

    static void getDeviceData() {
        getSDKAppID = -1749331464;
        AuthenticationRequestParameters = -1568970007;
        getSDKReferenceNumber = -158154941;
        getSDKTransactionID = new byte[]{-15, 75, -7, -3, 5, -17, -4, -27, 44, -15, 4, -10, 10, -30, -7, 7, -2, -51, 69, 21, -17, 3, -11, 6, 11, -11, 5, -5, -73, 82, -5, -1, -80, 66, 6, 9, -8, -46};
    }
}
