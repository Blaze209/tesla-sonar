package atd.c;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.AuthenticationRequestParameters;
import atd.ai.ChallengeResultCancelled;
import atd.az.BuildConfig;
import atd.az.ChallengeStatusHandler;
import atd.d.ChallengeResultCompleted;
import atd.d.getDeviceData;
import atd.d.getTransactionStatus;
import atd.e.getMessageVersion;
import atd.e.getSDKEphemeralPublicKey;
import atd.i.getSDKTransactionID;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKReferenceNumber extends atd.d.getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    private static char ChallengeResult;
    private static long ChallengeResultCompleted;
    private static char ChallengeResultError;
    private static char ChallengeResultTimeout;
    private static int completed;
    private static char[] getAdditionalDetails;
    private static final Charset getDeviceData;
    private static final int getSDKAppID;
    private static final int getSDKTransactionID;
    private static int getTransactionStatus;
    private Object ChallengeResultCancelled;
    private String getMessageVersion;
    private ArrayList<ChallengeResultCancelled> getSDKEphemeralPublicKey = new ArrayList<>();

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getTransactionStatus = 0;
        completed = 1;
        getSDKTransactionID();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        getSDKAppID = (int) timeUnit.toMillis(10L);
        getSDKTransactionID = (int) timeUnit.toMillis(10L);
        getDeviceData = AuthenticationRequestParameters.AuthenticationRequestParameters;
        getTransactionStatus = (completed + 27) % 128;
    }

    getSDKReferenceNumber(String str, Object obj) {
        this.getMessageVersion = str;
        this.ChallengeResultCancelled = obj;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        getDeviceData.getSDKAppID deviceData;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[1];
        int i11 = getTransactionStatus + 71;
        completed = i11 % 128;
        Charset sDKReferenceNumber = null;
        if (i11 % 2 == 0) {
            throw null;
        }
        byte[] sDKAppID = (byte[]) ChallengeResultCompleted.getDeviceData(new Object[]{challengeResultCompleted}, 467212410, -467212410, System.identityHashCode(challengeResultCompleted));
        if (sDKAppID == null || sDKAppID.length <= 0) {
            return null;
        }
        getDeviceData.getSDKReferenceNumber getsdkreferencenumberAuthenticationRequestParameters = getDeviceData.AuthenticationRequestParameters((Map) ChallengeResultCompleted.getDeviceData(new Object[]{challengeResultCompleted}, 1373143129, -1373143128, System.identityHashCode(challengeResultCompleted)));
        if (getsdkreferencenumberAuthenticationRequestParameters != null) {
            completed = (getTransactionStatus + 41) % 128;
            deviceData = getsdkreferencenumberAuthenticationRequestParameters.getDeviceData();
        } else {
            completed = (getTransactionStatus + 23) % 128;
            deviceData = null;
        }
        if (getsdkreferencenumberAuthenticationRequestParameters != null) {
            int i12 = completed + 73;
            getTransactionStatus = i12 % 128;
            if (i12 % 2 != 0) {
                getsdkreferencenumberAuthenticationRequestParameters.getSDKReferenceNumber();
                throw null;
            }
            sDKReferenceNumber = getsdkreferencenumberAuthenticationRequestParameters.getSDKReferenceNumber();
        }
        boolean z11 = deviceData == getDeviceData.getSDKAppID.APPLICATION_JOSE;
        if (z11) {
            try {
                sDKAppID = getsdkreferencenumber.getSDKAppID(sDKAppID, sDKReferenceNumber);
            } catch (GeneralSecurityException unused) {
                Object[] objArr2 = new Object[1];
                c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34, TextUtils.indexOf("", "") + 30, (char) (Color.rgb(0, 0, 0) + 16781045), objArr2);
                throw new atd.z.AuthenticationRequestParameters(((String) objArr2[0]).intern(), getSDKTransactionID.DATA_DECRYPTION_FAILURE, atd.am.ChallengeResultCancelled.PARSE_MESSAGE_DECRYPTION_FAILURE);
            }
        }
        if (!z11 && deviceData != getDeviceData.getSDKAppID.APPLICATION_JSON) {
            Object[] objArr3 = new Object[1];
            c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, View.getDefaultSize(0, 0) + 64, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr3);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr3[0]).intern(), getSDKTransactionID.MESSAGE_RECEIVED_INVALID, atd.am.ChallengeResultCancelled.PARSE_MESSAGE_CONTENT_TYPE_MISSING);
        }
        try {
            try {
                JsonObject sDKTransactionID = getSDKTransactionID(sDKAppID, sDKReferenceNumber);
                if (sDKAppID != null) {
                    Arrays.fill(sDKAppID, (byte) 0);
                }
                getMessageVersion sDKTransactionID2 = getMessageVersion.getSDKTransactionID(sDKTransactionID);
                if (z11 || !sDKTransactionID2.getDeviceData()) {
                    return sDKTransactionID2;
                }
                Object[] objArr4 = new Object[1];
                c(52 - ImageFormat.getBitsPerPixel(0), 108 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (23606 - Color.alpha(0)), objArr4);
                throw new atd.z.AuthenticationRequestParameters(((String) objArr4[0]).intern(), getSDKTransactionID.MESSAGE_RECEIVED_INVALID, atd.am.ChallengeResultCancelled.PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED);
            } catch (IllegalArgumentException unused2) {
                Object[] objArr5 = new Object[1];
                b("㼭ᶭꢚ忭秫籅掜\ue14a撹뷍ꛑᕰ췃恳", TextUtils.lastIndexOf("", '0', 0) + 14, objArr5);
                throw new atd.z.AuthenticationRequestParameters(((String) objArr5[0]).intern(), getSDKTransactionID.MESSAGE_RECEIVED_INVALID, atd.am.ChallengeResultCancelled.PARSE_MESSAGE_INVALID_JSON);
            }
        } catch (Throwable th2) {
            if (sDKAppID != null) {
                Arrays.fill(sDKAppID, (byte) 0);
            }
            throw th2;
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
    private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 11
            byte[] r1 = atd.c.getSDKReferenceNumber.$$a
            int r7 = r7 + 4
            int r5 = r5 * 6
            int r5 = 103 - r5
            byte[] r0 = new byte[r0]
            int r6 = r6 + 10
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r7
            r7 = r5
            r5 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            int r5 = r5 + 1
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKReferenceNumber.a(int, byte, short, java.lang.Object[]):void");
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 51) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i13 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i14 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i15 = challengeStatusHandler.getSDKReferenceNumber;
            if (i15 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            cArr3[i13] = cArr[i15];
            int i16 = 1;
            cArr3[1] = cArr[i15 + 1];
            int i17 = 58224;
            int i18 = i13;
            while (i18 < 16) {
                char c11 = cArr3[i16];
                char c12 = cArr3[i13];
                int i19 = i14;
                char[] cArr4 = cArr3;
                int i21 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) ChallengeResultError) ^ (-2881362678149017980L))));
                int i22 = c12 >>> 5;
                int i23 = i16;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ChallengeResultTimeout);
                    objArr2[i19] = Integer.valueOf(i22);
                    objArr2[i23] = Integer.valueOf(i21);
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i13;
                    } else {
                        i12 = i13;
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', i13, i13) + 1746, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16682), 29 - View.combineMeasuredStates(i13, i13));
                        byte length = (byte) $$d.length;
                        byte b11 = (byte) (length - 4);
                        Object[] objArr3 = new Object[i23];
                        d(length, b11, b11, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    char c13 = cArr4[i12];
                    int i24 = (((char) (((long) BuildConfig) ^ (-2881362678149017980L))) + (cCharValue << 4)) ^ (cCharValue + i17);
                    int i25 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(ChallengeResult);
                    objArr4[i19] = Integer.valueOf(i25);
                    objArr4[1] = Integer.valueOf(i24);
                    objArr4[i12] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - TextUtils.getTrimmedLength(""), (char) (16682 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 29 - (Process.myTid() >> 22));
                        byte length2 = (byte) $$d.length;
                        byte b12 = (byte) (length2 - 4);
                        Object[] objArr5 = new Object[1];
                        d(length2, b12, b12, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i12], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr4[i12] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i18++;
                    $11 = ($10 + 29) % 128;
                    i14 = i19;
                    cArr3 = cArr4;
                    i13 = i12;
                    cArr = cArr;
                    i16 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr;
            int i26 = i13;
            int i27 = i14;
            char[] cArr6 = cArr3;
            int i28 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i28] = cArr6[i26];
            cArr2[i28 + 1] = cArr6[1];
            Object[] objArr6 = new Object[i27];
            objArr6[1] = challengeStatusHandler;
            objArr6[i26] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1595 - ExpandableListView.getPackedPositionChild(0L), (char) (View.combineMeasuredStates(i26, i26) + 27824), 24 - TextUtils.indexOf((CharSequence) "", '0', i26));
                byte b13 = (byte) 0;
                Object[] objArr7 = new Object[1];
                d((byte) ($$d[1] + 1), b13, b13, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i27;
            cArr3 = cArr6;
            cArr = cArr5;
            i13 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x030a  */
    /* JADX WARN: Code duplicated, block: B:59:0x030b  */
    private static void c(int i11, int i12, char c11, Object[] objArr) throws Throwable {
        Throwable cause;
        String str;
        int i13 = i11;
        BuildConfig buildConfig = new BuildConfig();
        long[] jArr = new long[i13];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i13) {
                break;
            }
            int i16 = $10 + 121;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i17 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(getAdditionalDetails[i12 * i15])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(1019086628);
                    if (obj == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - View.combineMeasuredStates(i14, i14), (char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.indexOf("", "") + 32);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, b12, objArr3);
                        Method method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(1019086628, method);
                        obj = method;
                    }
                    Long l11 = (Long) ((Method) obj).invoke(null, objArr2);
                    l11.longValue();
                    Object[] objArr4 = {l11, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(ChallengeResultCompleted), Integer.valueOf(c11)};
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(440 - Process.getGidForName(""), (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarSize() >> 8) + 37)).getMethod("n", cls, cls, cls, cls2);
                        map.put(-1106061844, method2);
                    }
                    jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {buildConfig, buildConfig};
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 1919, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 29 - Color.alpha(0));
                        byte b13 = (byte) ($$e & 13);
                        byte b14 = (byte) (b13 - 5);
                        Object[] objArr6 = new Object[1];
                        d(b13, b14, b14, objArr6);
                        method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1947342796, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                jArr = jArr;
                Object[] objArr7 = {Integer.valueOf(getAdditionalDetails[i12 + i15])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1019086628);
                if (method4 != null) {
                    str = "";
                } else {
                    str = "";
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 1774, (char) (TextUtils.lastIndexOf(str, '0', 0, 0) + 1), Color.rgb(0, 0, 0) + 16777248);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    d(b15, b16, b16, objArr8);
                    method4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(1019086628, method4);
                }
                Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                l12.longValue();
                Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(ChallengeResultCompleted), Integer.valueOf(c11)};
                Object method5 = map2.get(-1106061844);
                if (method5 == null) {
                    method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(441 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - Process.getGidForName(str)), 37 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("n", cls, cls, cls, cls2);
                    map2.put(-1106061844, method5);
                }
                jArr[i15] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {buildConfig, buildConfig};
                Object method6 = map2.get(1947342796);
                if (method6 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1918 - Process.getGidForName(str), (char) (TextUtils.lastIndexOf(str, '0', 0, 0) + 1), 29 - KeyEvent.normalizeMetaState(0));
                    byte b17 = (byte) ($$e & 13);
                    byte b18 = (byte) (b17 - 5);
                    Object[] objArr11 = new Object[1];
                    d(b17, b18, b18, objArr11);
                    method6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1947342796, method6);
                }
                ((Method) method6).invoke(null, objArr10);
            }
            i13 = i11;
            jArr = jArr;
            i14 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[i13];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i18 = buildConfig.getDeviceData;
            if (i18 >= i13) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 35) % 128;
            cArr[i18] = (char) jArr2[i18];
            Object[] objArr12 = {buildConfig, buildConfig};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method7 = map3.get(1947342796);
            if (method7 == null) {
                Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 1920, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                byte b19 = (byte) ($$e & 13);
                byte b21 = (byte) (b19 - 5);
                Object[] objArr13 = new Object[1];
                d(b19, b21, b21, objArr13);
                method7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1947342796, method7);
            }
            ((Method) method7).invoke(null, objArr12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 108
            byte[] r0 = atd.c.getSDKReferenceNumber.$$d
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r0
            r0 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = r8 + 1
            int r6 = r6 + r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKReferenceNumber.d(byte, short, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 399) + (i12 * 399);
        int i15 = ~((~i11) | i12);
        int i16 = ~i12;
        int i17 = ~(i16 | i11);
        return ((i14 + (((i15 | i17) | (~(i16 | i13))) * 398)) + ((i11 | i12) * (-1194))) + ((((~((~i13) | i16)) | i15) | i17) * 398) != 1 ? AuthenticationRequestParameters(objArr) : getDeviceData(objArr);
    }

    private static JsonObject getSDKTransactionID(byte[] bArr, Charset charset) {
        if (charset == null) {
            charset = getDeviceData;
        }
        return atd.d.BuildConfig.getSDKReferenceNumber(new String(bArr, charset));
    }

    static void init$0() {
        $$a = new byte[]{86, -59, -39, 110, -3, 14, -34, -16, 6, -11, 46, -1, -40, -6, -3, 14, -49, 32, Tnaf.POW_2_WIDTH, -14, -7, 1, -34, 28, 18, -20, -3, 14, -34, -16, 6, 8, 29, -18, 12, 4, -19, 1, Tnaf.POW_2_WIDTH, -12, 5, -2, -38, -6, 18, -17, -55, 54, -56, 56, -3, 14, -49, 32, Tnaf.POW_2_WIDTH, -14, -7, 1, -34, 28, 18, -20};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
    }

    static void init$1() {
        $$d = new byte[]{36, 7, 47, 54};
        $$e = 151;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc A[SYNTHETIC] */
    public final void getSDKAppID() throws Throwable {
        ChallengeResultCancelled next;
        int i11;
        int i12 = completed;
        getTransactionStatus = (i12 + 15) % 128;
        this.getMessageVersion = null;
        Object obj = this.ChallengeResultCancelled;
        if (obj != null) {
            int i13 = i12 + 21;
            getTransactionStatus = i13 % 128;
            try {
                if (i13 % 2 != 0) {
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1364614541);
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTapTimeout() >> 16) + 171, (char) (10254 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30);
                        byte[] bArr = $$a;
                        byte b11 = (byte) (bArr[21] - 1);
                        Object[] objArr = new Object[1];
                        a(b11, b11, bArr[11], objArr);
                        method = cls.getMethod((String) objArr[0], null);
                        map.put(-1364614541, method);
                    }
                    ((Method) method).invoke(obj, null);
                    this.ChallengeResultCancelled = null;
                    throw null;
                }
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method2 = map2.get(-1364614541);
                if (method2 == null) {
                    Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 172, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 10255), KeyEvent.keyCodeFromString("") + 30);
                    byte[] bArr2 = $$a;
                    byte b12 = (byte) (bArr2[21] - 1);
                    Object[] objArr2 = new Object[1];
                    a(b12, b12, bArr2[11], objArr2);
                    method2 = cls2.getMethod((String) objArr2[0], null);
                    map2.put(-1364614541, method2);
                }
                ((Method) method2).invoke(obj, null);
                this.ChallengeResultCancelled = null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        ArrayList<ChallengeResultCancelled> arrayList = this.getSDKEphemeralPublicKey;
        if (arrayList != null) {
            Iterator<ChallengeResultCancelled> it = arrayList.iterator();
            while (it.hasNext()) {
                int i14 = completed + 111;
                getTransactionStatus = i14 % 128;
                if (i14 % 2 != 0) {
                    next = it.next();
                    int i15 = 4 / 0;
                    if (next != null) {
                        i11 = completed + 87;
                        getTransactionStatus = i11 % 128;
                        if (i11 % 2 != 0) {
                            next.getSDKTransactionID();
                            int i16 = 54 / 0;
                        } else {
                            next.getSDKTransactionID();
                        }
                    }
                } else {
                    next = it.next();
                    if (next != null) {
                        i11 = completed + 87;
                        getTransactionStatus = i11 % 128;
                        if (i11 % 2 != 0) {
                            next.getSDKTransactionID();
                            int i17 = 54 / 0;
                        } else {
                            next.getSDKTransactionID();
                        }
                    }
                }
            }
            this.getSDKEphemeralPublicKey.clear();
            this.getSDKEphemeralPublicKey = null;
        }
    }

    @Override // atd.d.getSDKAppID
    public final int getSDKReferenceNumber() {
        int i11 = completed + 91;
        getTransactionStatus = i11 % 128;
        if (i11 % 2 == 0) {
            return getSDKAppID;
        }
        throw null;
    }

    private getTransactionStatus getSDKReferenceNumber(getSDKEphemeralPublicKey getsdkephemeralpublickey) throws Throwable {
        Map<String, List<String>> deviceData;
        byte[] sDKAppID;
        getTransactionStatus.getSDKReferenceNumber sDKReferenceNumber = new getTransactionStatus.getSDKReferenceNumber().getSDKReferenceNumber(this.getMessageVersion);
        if (getsdkephemeralpublickey.AuthenticationRequestParameters()) {
            deviceData = atd.f.getSDKAppID.getSDKReferenceNumber();
        } else {
            deviceData = atd.f.getSDKAppID.getDeviceData();
            completed = (getTransactionStatus + 19) % 128;
        }
        byte[] deviceData2 = getDeviceData((atd.f.getSDKReferenceNumber) getsdkephemeralpublickey);
        if (getsdkephemeralpublickey.AuthenticationRequestParameters()) {
            sDKAppID = getSDKAppID(deviceData2);
        } else {
            getTransactionStatus = (completed + 121) % 128;
            sDKAppID = deviceData2;
        }
        sDKReferenceNumber.getSDKAppID(deviceData).getDeviceData(sDKAppID);
        if (deviceData2 != null) {
            getTransactionStatus = (completed + 125) % 128;
            Arrays.fill(deviceData2, (byte) 0);
        }
        if (sDKAppID != null) {
            int i11 = completed + 103;
            getTransactionStatus = i11 % 128;
            Arrays.fill(sDKAppID, i11 % 2 != 0 ? (byte) 1 : (byte) 0);
        }
        return sDKReferenceNumber.getSDKReferenceNumber();
    }

    @Override // atd.d.getSDKAppID
    public final int getDeviceData() {
        int i11 = (completed + 89) % 128;
        getTransactionStatus = i11;
        int i12 = getSDKTransactionID;
        completed = (i11 + 111) % 128;
        return i12;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        final getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[1];
        Callable<getMessageVersion> callable = new Callable<getMessageVersion>() { // from class: atd.c.getSDKReferenceNumber.4
            private static int getDeviceData = 0;
            private static int getSDKTransactionID = 1;

            public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr2, int i11, int i12, int i13) {
                int i14 = (i11 * (-167)) + (i12 * (-167));
                int i15 = ~i11;
                int i16 = ~i12;
                return ((i14 + (((~(i15 | i16)) | (~(i16 | i13))) * 336)) + (((~(i12 | i11)) | (~(i11 | i13))) * (-168))) + (((~(i11 | (~i13))) | i16) * 168) != 1 ? getDeviceData(objArr2) : getSDKReferenceNumber(objArr2);
            }

            private static /* synthetic */ Object getDeviceData(Object[] objArr2) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr2[0];
                int i11 = getSDKTransactionID + 121;
                getDeviceData = i11 % 128;
                if (i11 % 2 == 0) {
                    return (getMessageVersion) AuthenticationRequestParameters(new Object[]{anonymousClass4}, 412075883, -412075882, System.identityHashCode(anonymousClass4));
                }
                throw null;
            }

            @SuppressLint({"SyntheticAccessor"})
            private getMessageVersion getSDKAppID() {
                return (getMessageVersion) AuthenticationRequestParameters(new Object[]{this}, 412075883, -412075882, System.identityHashCode(this));
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr2) throws Throwable {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr2[0];
                int i11 = getDeviceData;
                int i12 = i11 & 115;
                int i13 = -(-((i11 ^ 115) | i12));
                getSDKTransactionID = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                getMessageVersion getmessageversionAuthenticationRequestParameters = getSDKReferenceNumber.AuthenticationRequestParameters(getSDKReferenceNumber.this.getSDKAppID(getsdkephemeralpublickey), getsdkephemeralpublickey);
                int i14 = getSDKTransactionID;
                int i15 = (i14 & (-76)) | ((~i14) & 75);
                int i16 = -(-((i14 & 75) << 1));
                int i17 = (i15 & i16) + (i16 | i15);
                getDeviceData = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 64 / 0;
                }
                return getmessageversionAuthenticationRequestParameters;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [atd.e.getMessageVersion, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            @SuppressLint({"SyntheticAccessor"})
            public final /* synthetic */ getMessageVersion call() {
                return AuthenticationRequestParameters(new Object[]{this}, -1218116068, 1218116068, System.identityHashCode(this));
            }
        };
        int i11 = getTransactionStatus + 39;
        completed = i11 % 128;
        if (i11 % 2 != 0) {
            return callable;
        }
        throw null;
    }

    private static byte[] getDeviceData(atd.f.getSDKReferenceNumber getsdkreferencenumber) {
        completed = (getTransactionStatus + 9) % 128;
        JSONObject sDKAppID = getsdkreferencenumber.getSDKAppID();
        String string = sDKAppID.toString();
        atd.json.JSONObject.getSDKAppID(new Object[]{sDKAppID}, -1150790233, 1150790235, (int) System.currentTimeMillis());
        byte[] bytes = string.getBytes(getDeviceData);
        int i11 = completed + 41;
        getTransactionStatus = i11 % 128;
        if (i11 % 2 == 0) {
            return bytes;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        BuildConfig = (char) 19955;
        ChallengeResult = (char) 22098;
        ChallengeResultError = (char) 21081;
        ChallengeResultTimeout = (char) 35853;
        getAdditionalDetails = new char[]{55656, 558, 28549, 19297, 46287, 37295, 64840, 9981, 585, 28519, 18583, 46176, 37324, 64167, 9792, 972, 28507, 18476, 46479, 37244, 64221, 10174, 810, 27900, 18503, 46370, 40593, 64102, 10182, 253, 3787, 54669, 47142, 40130, 25452, 17932, 10987, 61790, 54762, 47300, 40739, 25539, 18018, 11538, 61882, 54354, 47337, 40924, 25106, 18139, 11626, 61451, 54458, 47965, 40944, 25254, 18738, 11717, 61537, 55071, 48061, 40513, 25288, 18722, '*', 56188, 46793, 37419, 28051, 18675, 9293, 65466, 56144, 46713, 37335, 27954, 18576, 9200, 65348, 56055, 46604, 37222, 27855, 18488, 9164, 65251, 55873, 46523, 37184, 27752, 18380, 8999, 65165, 55782, 46407, 37043, 27709, 18393, 8912, 65128, 55699, 46387, 36926, 27611, 18225, 8837, 65011, 55581, 23580, 34634, 60159, 52765, 12709, 5317, 30843, 41868, 34662, 59989, 52705, 12564, 5303, 32714, 41842, 34436, 59962, 52511, 12520, 5138, 32762, 41689, 34429, 59865, 52531, 12377, 7159, 32519, 41643, 34243, 59748, 52372, 12298, 7139, 32396, 41583, 34207, 59711, 52232, 14334, 6919, 32436, 41348, 34165, 59534, 52258, 14153, 6895, 32266, 41402, 33988, 59497, 54228, 34489, 24048, 12357, 5284, 60177, 52854, 41687, 30977, 23961, 12526, 5966, 60336, 52758, 42346, 31199, 23675, 12428, 6116, 59989, 52967, 42254, 30830, 23682, 13095, 6029, 60153, 49487, 42465, 44146, 38088, 20383, 8747, 1742, 63866, 56332, 45309, 27464, 20449, 8851, 1343, 63939, 56438, 46869, 27553, 20061, 8932, 1412, 63593, 56545, 46923, 27165, 20205, 8520, 1516, 63682, 54063, 47055, 27251, 19782, 8616, 1093, 63695, 54137, 46609, 27382};
        ChallengeResultCompleted = 5837084625634712345L;
    }

    final Callable<getMessageVersion> getDeviceData(getSDKEphemeralPublicKey getsdkephemeralpublickey) {
        return (Callable) getDeviceData(new Object[]{this, getsdkephemeralpublickey}, -1002560179, 1002560180, System.identityHashCode(this));
    }

    final getMessageVersion getSDKAppID(getSDKEphemeralPublicKey getsdkephemeralpublickey) throws Throwable {
        try {
            getTransactionStatus sDKReferenceNumber = getSDKReferenceNumber(getsdkephemeralpublickey);
            completed = (getTransactionStatus + 63) % 128;
            try {
                getMessageVersion getmessageversion = (getMessageVersion) getDeviceData(new Object[]{this, AuthenticationRequestParameters(sDKReferenceNumber)}, -184136989, 184136989, System.identityHashCode(this));
                completed = (getTransactionStatus + 29) % 128;
                return getmessageversion;
            } catch (SocketTimeoutException unused) {
                Object[] objArr = new Object[1];
                b("잖떞\uef08䊋ﲶ䧄䖐鼜ᒽ﮹鋾쪧툓ඌ쒅֝\uef43컘ࢷ䙬諽骗\ue423\ue946췃恳", 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), getSDKTransactionID.TRANSACTION_TIMED_OUT, atd.am.ChallengeResultCancelled.POST_MESSAGE_RESPONSE_TIMEOUT);
            } catch (IOException unused2) {
                Object[] objArr2 = new Object[1];
                c(30 - Color.green(0), ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55637), objArr2);
                throw new atd.z.AuthenticationRequestParameters(((String) objArr2[0]).intern(), getSDKTransactionID.SYSTEM_CONNECTION_FAILURE, atd.am.ChallengeResultCancelled.POST_ERROR_ESTABLISHING_CONNECTION);
            }
        } catch (GeneralSecurityException | JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    static getMessageVersion AuthenticationRequestParameters(getMessageVersion getmessageversion, getSDKEphemeralPublicKey getsdkephemeralpublickey) throws Throwable {
        getTransactionStatus = (completed + 47) % 128;
        if (getmessageversion == null && !atd.i.getDeviceData.ERROR.equals(getsdkephemeralpublickey.getDeviceData())) {
            Object[] objArr = new Object[1];
            c(28 - KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionGroup(0L) + 161, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 34444), objArr);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), getSDKTransactionID.MESSAGE_RECEIVED_INVALID, atd.am.ChallengeResultCancelled.EMPTY_MESSAGE);
        }
        if (getmessageversion != null && !atd.i.getDeviceData.ERROR.equals(getmessageversion.BuildConfig())) {
            atd.json.AuthenticationRequestParameters authenticationRequestParametersChallengeResultCancelled = getsdkephemeralpublickey.ChallengeResultCancelled();
            if (((String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParametersChallengeResultCancelled}, 680619687, -680619685, System.identityHashCode(authenticationRequestParametersChallengeResultCancelled))).equals(getmessageversion.getSDKEphemeralPublicKey())) {
                atd.ao.AuthenticationRequestParameters messageVersion = getsdkephemeralpublickey.getMessageVersion();
                String str = (String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{messageVersion}, -118387588, 118387590, System.identityHashCode(messageVersion));
                atd.ao.AuthenticationRequestParameters messageVersion2 = getmessageversion.getMessageVersion();
                if (str.equalsIgnoreCase((String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{messageVersion2}, -118387588, 118387590, System.identityHashCode(messageVersion2)))) {
                    atd.ao.AuthenticationRequestParameters messageVersion3 = getsdkephemeralpublickey.getMessageVersion();
                    String str2 = (String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{messageVersion3}, -785917785, 785917789, System.identityHashCode(messageVersion3));
                    atd.ao.AuthenticationRequestParameters messageVersion4 = getmessageversion.getMessageVersion();
                    if (str2.equalsIgnoreCase((String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{messageVersion4}, -785917785, 785917789, System.identityHashCode(messageVersion4)))) {
                        atd.ao.AuthenticationRequestParameters messageVersion5 = getsdkephemeralpublickey.getMessageVersion();
                        String str3 = (String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{messageVersion5}, 414390748, -414390748, System.identityHashCode(messageVersion5));
                        atd.ao.AuthenticationRequestParameters messageVersion6 = getmessageversion.getMessageVersion();
                        if (str3.equalsIgnoreCase((String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{messageVersion6}, 414390748, -414390748, System.identityHashCode(messageVersion6)))) {
                            byte[] bArr = $$a;
                            Object[] objArr2 = new Object[1];
                            a(bArr[21], bArr[35], (byte) (-bArr[2]), objArr2);
                            if (Class.forName((String) objArr2[0]).isInstance(getmessageversion) && ((Integer) getSDKEphemeralPublicKey.getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey}, -1595404261, 1595404261, System.identityHashCode(getsdkephemeralpublickey))).intValue() != ((atd.e.getDeviceData) getmessageversion).getSDKAppID()) {
                                Object[] objArr3 = new Object[1];
                                b("뜏❪账鈉毐锕掜\ue14a\ud8b4㵦ഀ㆖蝔㙩\uef08䊋ﲶ䧄朶\ud84d嬝緶芬봼彚寄ꭷ냺㴊雸થ⼓숦싓܂\uec19禔a\ud9bcꉬ拐훕췃恳", 43 - TextUtils.indexOf("", "", 0, 0), objArr3);
                                throw new atd.z.AuthenticationRequestParameters(((String) objArr3[0]).intern(), getSDKTransactionID.DATA_DECRYPTION_FAILURE, atd.am.ChallengeResultCancelled.MISMATCHING_COUNTERS);
                            }
                        } else {
                            Object[] objArr4 = new Object[1];
                            b("뜏❪账鈉ં䤵毐锕褳벎ꨩꅗጤ馧宠쥉Ẩ저㴊雸થ⼓숦싓܂\uec19禔a\ud9bcꉬ拐훕췃恳", (Process.myTid() >> 22) + 33, objArr4);
                            throw new atd.z.AuthenticationRequestParameters(((String) objArr4[0]).intern(), getSDKTransactionID.TRANSACTION_ID_NOT_RECOGNIZED, atd.am.ChallengeResultCancelled.MISMATCHING_SDK_TRANSACTION_ID);
                        }
                    } else {
                        Object[] objArr5 = new Object[1];
                        b("\ud8b4㵦ഀ㆖ં䤵毐锕褳벎ꨩꅗጤ馧宠쥉Ẩ저㴊雸થ⼓숦싓܂\uec19禔a\ud9bcꉬ拐훕췃恳", 33 - Color.green(0), objArr5);
                        throw new atd.z.AuthenticationRequestParameters(((String) objArr5[0]).intern(), getSDKTransactionID.TRANSACTION_ID_NOT_RECOGNIZED, atd.am.ChallengeResultCancelled.MISMATCHING_ACS_TRANSACTION_ID);
                    }
                } else {
                    Object[] objArr6 = new Object[1];
                    c((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35, 191 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (38115 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr6);
                    throw new atd.z.AuthenticationRequestParameters(((String) objArr6[0]).intern(), getSDKTransactionID.TRANSACTION_ID_NOT_RECOGNIZED, atd.am.ChallengeResultCancelled.MISMATCHING_THREEDS_SERVER_TRANSACTION_ID);
                }
            } else {
                Object[] objArr7 = new Object[1];
                c(1 - Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 189, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 44070), objArr7);
                String strJoin = TextUtils.join(((String) objArr7[0]).intern(), atd.a.getSDKAppID.getSDKTransactionID());
                Object[] objArr8 = new Object[1];
                b("㼭ᶭꢚ忭秫籅掜\ue14a蝔㙩\uef08䊋ﲶ䧄椶䦎鴂憼甀\ud8dcጤ馧宠쥉캶⩪焱﷋腨﹈남㨈캕赌\ue55d폩掜\ue14a鴂憼甀\ud8dcጤ馧⼢붘繶秽፴絝", 49 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr8);
                throw new atd.z.AuthenticationRequestParameters(String.format(((String) objArr8[0]).intern(), getmessageversion.getSDKEphemeralPublicKey(), strJoin), getSDKTransactionID.MESSAGE_VERSION_NOT_SUPPORTED, atd.am.ChallengeResultCancelled.MISMATCHING_MESSAGE_VERSION);
            }
        }
        getTransactionStatus = (completed + 25) % 128;
        return getmessageversion;
    }

    private byte[] getSDKAppID(byte[] bArr) throws Throwable {
        Object obj = this.ChallengeResultCancelled;
        int i11 = (getTransactionStatus + 111) % 128;
        completed = i11;
        getTransactionStatus = (i11 + 51) % 128;
        try {
            Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0) + 172, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10255), (ViewConfiguration.getTapTimeout() >> 16) + 30);
            byte b11 = $$a[21];
            byte b12 = (byte) (b11 - 1);
            byte b13 = b11;
            Object[] objArr = new Object[1];
            a(b12, b13, (byte) (b13 | 8), objArr);
            ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) cls.getMethod((String) objArr[0], byte[].class).invoke(obj, bArr);
            String deviceData = challengeResultCancelled.getDeviceData();
            this.getSDKEphemeralPublicKey.add(challengeResultCancelled);
            return deviceData.getBytes(getDeviceData);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private byte[] getSDKAppID(byte[] bArr, Charset charset) throws Throwable {
        if (charset == null) {
            charset = getDeviceData;
        }
        ChallengeResultCancelled sDKReferenceNumber = ChallengeResultCancelled.getSDKReferenceNumber(new String(bArr, charset));
        Object obj = this.ChallengeResultCancelled;
        try {
            Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 171, (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 10254), 30 - KeyEvent.normalizeMetaState(0));
            byte[] bArr2 = $$a;
            byte b11 = (byte) (bArr2[21] - 1);
            byte b12 = bArr2[35];
            Object[] objArr = new Object[1];
            a(b11, b12, (byte) (b12 | 17), objArr);
            byte[] bArr3 = (byte[]) cls.getMethod((String) objArr[0], ChallengeResultCancelled.class).invoke(obj, sDKReferenceNumber);
            sDKReferenceNumber.getSDKTransactionID();
            return bArr3;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private getMessageVersion getSDKAppID(ChallengeResultCompleted challengeResultCompleted) {
        return (getMessageVersion) getDeviceData(new Object[]{this, challengeResultCompleted}, -184136989, 184136989, System.identityHashCode(this));
    }
}
