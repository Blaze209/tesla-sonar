package atd.al;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.BuildConfig;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters implements getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private final String getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        TextUtils.indexOf((CharSequence) "", '0');
        ViewConfiguration.getMinimumFlingVelocity();
        View.MeasureSpec.getSize(0);
        int i11 = AuthenticationRequestParameters + 41;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private AuthenticationRequestParameters(String str) throws Throwable {
        if (str == null) {
            Object[] objArr = new Object[1];
            a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20 - TextUtils.getOffsetBefore("", 0), objArr);
            str = ((String) objArr[0]).intern();
        }
        this.getSDKAppID = str;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b8  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        int i14;
        BuildConfig buildConfig = new BuildConfig();
        long[] jArr = new long[i12];
        int i15 = 0;
        buildConfig.getDeviceData = 0;
        $10 = ($11 + 85) % 128;
        while (true) {
            int i16 = buildConfig.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(getSDKTransactionID[i11 + i16])};
                Map map = getMessageVersion.timedout;
                Object method = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (method != null) {
                    i13 = i15;
                    i14 = 2;
                } else {
                    i13 = i15;
                    i14 = 2;
                    Class cls2 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.getOffsetBefore("", i15) + 1774, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 32 - (ExpandableListView.getPackedPositionForGroup(i13) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i13) == 0L ? 0 : -1)));
                    byte b11 = (byte) 1;
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls2.getMethod((String) objArr3[i13], cls);
                    map.put(1019086628, method);
                }
                Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = getDeviceData;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[i14] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i13] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(442 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    Class cls4 = Long.TYPE;
                    method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method2);
                }
                jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i14];
                objArr5[1] = buildConfig;
                objArr5[i13] = buildConfig;
                Object method3 = map.get(1947342796);
                if (method3 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 1919, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int i17 = i13;
                    byte b13 = (byte) i17;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls5.getMethod((String) objArr6[i17], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                jArr = jArr;
                i15 = 0;
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
            int i18 = buildConfig.getDeviceData;
            if (i18 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 31) % 128;
            cArr[i18] = (char) jArr2[i18];
            Object[] objArr7 = {buildConfig, buildConfig};
            Map map2 = getMessageVersion.timedout;
            Object method4 = map2.get(1947342796);
            if (method4 == null) {
                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1919 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.myPid() >> 22) + 29);
                byte b15 = (byte) 0;
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.al.AuthenticationRequestParameters.$$a
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 5
            int r6 = 113 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
        L2b:
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.al.AuthenticationRequestParameters.b(short, short, int, java.lang.Object[]):void");
    }

    public static AuthenticationRequestParameters getSDKAppID() throws Throwable {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 109) % 128;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, Color.blue(0) + 20, objArr);
        AuthenticationRequestParameters sDKTransactionID = getSDKTransactionID(((String) objArr[0]).intern());
        AuthenticationRequestParameters = (getSDKReferenceNumber + 19) % 128;
        return sDKTransactionID;
    }

    private static AuthenticationRequestParameters getSDKTransactionID(String str) {
        AuthenticationRequestParameters authenticationRequestParameters = new AuthenticationRequestParameters(str);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 45) % 128;
        return authenticationRequestParameters;
    }

    static void init$0() {
        $$a = new byte[]{91, -6, 53, -91};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE;
    }

    @Override // atd.al.getSDKTransactionID
    public final String AuthenticationRequestParameters(Context context, String str) {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 3) % 128;
        String string = context.getSharedPreferences(this.getSDKAppID, 0).getString(str, null);
        int i11 = AuthenticationRequestParameters + 33;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{'\f', 19479, 38916, 58376, 12289, 31807, 51233, 5243, 24607, 44087, 63564, 17488, 36938, 56390, 10344, 29812, 49254, 3180, 22627, 42126};
        getDeviceData = 1316610349452905599L;
    }

    @Override // atd.al.getSDKTransactionID
    public final void AuthenticationRequestParameters(Context context, String str, String str2) {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 105) % 128;
        context.getSharedPreferences(this.getSDKAppID, 0).edit().putString(str, str2).apply();
        int i11 = getSDKReferenceNumber + 77;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 61 / 0;
        }
    }
}
