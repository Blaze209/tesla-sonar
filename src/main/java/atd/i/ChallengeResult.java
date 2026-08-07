package atd.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.am.ChallengeResultCancelled;
import atd.az.BuildConfig;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ ChallengeResult[] $VALUES;
    private static String INVALID_TRANS_STATUS_MSG;
    private static ChallengeResult N;
    public static final ChallengeResult Y;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private final String mValue;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getDeviceData();
        SystemClock.elapsedRealtime();
        Process.getThreadPriority(0);
        View.resolveSize(0, 0);
        Object[] objArr = new Object[1];
        a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 27 - TextUtils.getTrimmedLength(""), 1 - View.MeasureSpec.getMode(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 28, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        Y = new ChallengeResult(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), 28 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((char) Gravity.getAbsoluteGravity(0, 0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr4);
        N = new ChallengeResult(strIntern2, 1, ((String) objArr4[0]).intern());
        $VALUES = getSDKAppID();
        int i11 = getDeviceData + 43;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 99 / 0;
        }
    }

    private ChallengeResult(String str, int i11, String str2) {
        super(str, i11);
        this.mValue = str2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x01cc  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        BuildConfig buildConfig = new BuildConfig();
        long[] jArr = new long[i12];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i12) {
                break;
            }
            $10 = ($11 + 83) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getSDKTransactionID[i11 + i15])};
                Map map = getMessageVersion.timedout;
                Object method = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (method != null) {
                    i13 = i14;
                } else {
                    i13 = i14;
                    Class cls2 = (Class) getMessageVersion.getSDKTransactionID(Color.red(i14) + 1774, (char) Color.blue(i13), 32 - TextUtils.indexOf("", ""));
                    byte b11 = $$a[2];
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b12, (byte) (b12 + 1), b11, objArr3);
                    method = cls2.getMethod((String) objArr3[i13], cls);
                    map.put(1019086628, method);
                }
                Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = getSDKReferenceNumber;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[2] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i13] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', i13) + 442, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.keyCodeFromString("") + 37);
                    Class cls4 = Long.TYPE;
                    method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method2);
                }
                jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = {buildConfig, buildConfig};
                Object method3 = map.get(1947342796);
                if (method3 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID(1919 - View.resolveSize(0, 0), (char) View.getDefaultSize(0, 0), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    byte b13 = $$a[2];
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                jArr = jArr;
                i14 = 0;
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
        char[] cArr = new char[i12];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i16 = buildConfig.getDeviceData;
            if (i16 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            $10 = ($11 + 7) % 128;
            cArr[i16] = (char) jArr2[i16];
            Object[] objArr7 = {buildConfig, buildConfig};
            Map map2 = getMessageVersion.timedout;
            Object method4 = map2.get(1947342796);
            if (method4 == null) {
                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1919 - ExpandableListView.getPackedPositionType(0L), (char) TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 29);
                byte b15 = $$a[2];
                byte b16 = b15;
                Object[] objArr8 = new Object[1];
                b(b15, b16, b16, objArr8);
                method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1947342796, method4);
            }
            ((Method) method4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 5
            int r7 = 113 - r7
            byte[] r0 = atd.i.ChallengeResult.$$a
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L31
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L31:
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.i.ChallengeResult.b(int, short, byte, java.lang.Object[]):void");
    }

    public static ChallengeResult getDeviceData(String str) throws Throwable {
        int i11 = getSDKAppID + 89;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        for (ChallengeResult challengeResult : values()) {
            getDeviceData = (getSDKAppID + 81) % 128;
            if (str.equalsIgnoreCase(challengeResult.mValue)) {
                return challengeResult;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25208), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, 27 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(str);
        throw new atd.z.AuthenticationRequestParameters(sb2.toString(), getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, ChallengeResultCancelled.INVALID_TRANSACTION_STATUS);
    }

    private static /* synthetic */ ChallengeResult[] getSDKAppID() {
        ChallengeResult[] challengeResultArr;
        int i11 = getDeviceData;
        int i12 = i11 + 115;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            challengeResultArr = new ChallengeResult[3];
            challengeResultArr[0] = Y;
            challengeResultArr[1] = N;
        } else {
            challengeResultArr = new ChallengeResult[]{Y, N};
        }
        getSDKAppID = (i11 + 111) % 128;
        return challengeResultArr;
    }

    static void init$0() {
        $$a = new byte[]{75, 34, 0, 64};
        $$b = 43;
    }

    public static ChallengeResult valueOf(String str) {
        int i11 = getDeviceData + 13;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return (ChallengeResult) Enum.valueOf(ChallengeResult.class, str);
        }
        Enum.valueOf(ChallengeResult.class, str);
        throw null;
    }

    public static ChallengeResult[] values() {
        int i11 = getDeviceData + 1;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return (ChallengeResult[]) $VALUES.clone();
        }
        int i12 = 94 / 0;
        return (ChallengeResult[]) $VALUES.clone();
    }

    public final String getSDKReferenceNumber() {
        int i11 = getSDKAppID + 55;
        int i12 = i11 % 128;
        getDeviceData = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.mValue;
        getSDKAppID = (i12 + 75) % 128;
        return str;
    }

    static void getDeviceData() {
        getSDKTransactionID = new char[]{25161, 23474, 4558, 53237, 34076, 17189, 14668, 63268, 44180, 27342, 8441, 7706, 54307, 37503, 18556, 389, 65460, 46569, 29451, 10612, 59206, 56685, 39556, 20657, 3781, 50246, 33400, '!', '6'};
        getSDKReferenceNumber = -2118292098036909660L;
    }
}
