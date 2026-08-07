package atd.ab;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.BuildConfig;
import com.adyen.threeds2.RuntimeErrorEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters implements RuntimeErrorEvent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private final String getDeviceData;
    private final String getSDKAppID;
    private final String getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = new char[]{50522, 37132, 27984, 14729, 38363, 24639, 15429, 34992, 25852, 13108, 36688, 23299, 'r', 21540, 43128, 64673, 20723, 42263, 63843, 19858, 41411, 62986, 18979, 40556, 62129, 18087, 39750};
        getSDKReferenceNumber = 5287210220049028161L;
    }

    public AuthenticationRequestParameters(String str, String str2, String str3) {
        this.getDeviceData = str;
        this.getSDKTransactionID = str2;
        this.getSDKAppID = str3;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x01be  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Object method;
        Throwable cause;
        int i13;
        int i14;
        Object method2;
        BuildConfig buildConfig = new BuildConfig();
        long[] jArr = new long[i12];
        int i15 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i16 = buildConfig.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            $10 = ($11 + 75) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(AuthenticationRequestParameters[i11 + i16])};
                Map map = getMessageVersion.timedout;
                Object obj = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    method2 = obj;
                    i13 = 2;
                    i14 = i15;
                } else {
                    i13 = 2;
                    i14 = i15;
                    Class cls2 = (Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1773, (char) KeyEvent.keyCodeFromString(""), 32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b11 = (byte) ($$b & 3);
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method2 = cls2.getMethod((String) objArr3[i14], cls);
                    map.put(1019086628, method2);
                }
                Long l11 = (Long) ((Method) method2).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = getSDKReferenceNumber;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[i13] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i14] = l11;
                Object method3 = map.get(-1106061844);
                if (method3 == null) {
                    int i17 = i14;
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(i17, i17) + 441, (char) ((-1) - MotionEvent.axisFromString("")), 36 - MotionEvent.axisFromString(""));
                    Class cls4 = Long.TYPE;
                    method3 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method3);
                }
                jArr[i16] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i13];
                objArr5[1] = buildConfig;
                objArr5[0] = buildConfig;
                Object method4 = map.get(1947342796);
                if (method4 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 1920, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 29 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method4 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1947342796, method4);
                }
                ((Method) method4).invoke(null, objArr5);
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
        $11 = ($10 + 49) % 128;
        while (true) {
            int i18 = buildConfig.getDeviceData;
            if (i18 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i18] = (char) jArr2[i18];
            Object[] objArr7 = {buildConfig, buildConfig};
            Map map2 = getMessageVersion.timedout;
            Object obj2 = map2.get(1947342796);
            if (obj2 != null) {
                method = obj2;
            } else {
                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 1920, (char) (ViewConfiguration.getTouchSlop() >> 8), 29 - View.MeasureSpec.makeMeasureSpec(0, 0));
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr8 = new Object[1];
                b(b15, b16, b16, objArr8);
                method = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1947342796, method);
            }
            ((Method) method).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.ab.AuthenticationRequestParameters.$$a
            int r9 = r9 * 2
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 * 5
            int r7 = 113 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r9
            goto L30
        L17:
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r2
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r0
            r0 = r7
            r7 = r3
            r3 = r6
        L30:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r0 + 1
            r0 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.AuthenticationRequestParameters.b(short, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{64, 55, -50, 126};
        $$b = 93;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public final String getAdditionalDetails() {
        int i11 = (getMessageVersion + 25) % 128;
        getSDKEphemeralPublicKey = i11;
        String str = this.getSDKAppID;
        getMessageVersion = (i11 + 115) % 128;
        return str;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public final String getErrorCode() {
        String str;
        int i11 = getMessageVersion + 1;
        int i12 = i11 % 128;
        getSDKEphemeralPublicKey = i12;
        if (i11 % 2 != 0) {
            str = this.getDeviceData;
            int i13 = 63 / 0;
        } else {
            str = this.getDeviceData;
        }
        int i14 = i12 + 109;
        getMessageVersion = i14 % 128;
        if (i14 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public final String getErrorMessage() {
        String str;
        int i11 = getMessageVersion + 11;
        int i12 = i11 % 128;
        getSDKEphemeralPublicKey = i12;
        if (i11 % 2 != 0) {
            str = this.getSDKTransactionID;
            int i13 = 49 / 0;
        } else {
            str = this.getSDKTransactionID;
        }
        int i14 = i12 + 47;
        getMessageVersion = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 25 / 0;
        }
        return str;
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (50472 - View.MeasureSpec.getMode(0)), (-1) - MotionEvent.axisFromString(""), 12 - Color.red(0), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(getErrorCode());
        Object[] objArr2 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 12 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 15 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(getErrorMessage());
        String string = sb2.toString();
        getSDKEphemeralPublicKey = (getMessageVersion + 23) % 128;
        return string;
    }
}
