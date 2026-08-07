package atd.af;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.ai.getSDKEphemeralPublicKey;
import atd.an.ChallengeResult;
import atd.az.BuildConfig;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID extends getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getMessageVersion;
    private static long getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private RSAPrivateKey getDeviceData;
    private RSAPublicKey getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getTouchSlop();
        Process.getElapsedCpuTime();
        ViewConfiguration.getKeyRepeatDelay();
        getMessageVersion = (AuthenticationRequestParameters + 35) % 128;
    }

    getSDKAppID(JSONObject jSONObject) throws Throwable {
        BigInteger sDKAppID;
        super(jSONObject);
        atd.json.getDeviceData getdevicedata = (atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
        Object[] objArr = new Object[1];
        a((char) (38736 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 1, Gravity.getAbsoluteGravity(0, 0) + 1, objArr);
        BigInteger sDKAppID2 = atd.an.getSDKTransactionID.getSDKAppID(getdevicedata.getSDKAppID(jSONObject.getString(((String) objArr[0]).intern())));
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43417), (Process.myPid() >> 22) + 1, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        BigInteger sDKAppID3 = atd.an.getSDKTransactionID.getSDKAppID(getdevicedata.getSDKAppID(jSONObject.getString(((String) objArr2[0]).intern())));
        Object[] objArr3 = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), '2' - AndroidCharacter.getMirror('0'), -TextUtils.lastIndexOf("", '0', 0), objArr3);
        if (jSONObject.has(((String) objArr3[0]).intern())) {
            Object[] objArr4 = new Object[1];
            a((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 2, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
            sDKAppID = atd.an.getSDKTransactionID.getSDKAppID(getdevicedata.getSDKAppID(jSONObject.getString(((String) objArr4[0]).intern())));
        } else {
            sDKAppID = null;
        }
        this.getSDKTransactionID = ChallengeResult.AuthenticationRequestParameters(sDKAppID2, sDKAppID3);
        this.getDeviceData = sDKAppID != null ? ChallengeResult.getSDKAppID(sDKAppID2, sDKAppID) : null;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x02fb  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        Object method;
        int i14 = i12;
        BuildConfig buildConfig = new BuildConfig();
        long[] jArr = new long[i14];
        int i15 = 0;
        buildConfig.getDeviceData = 0;
        $11 = ($10 + 91) % 128;
        while (true) {
            int i16 = buildConfig.getDeviceData;
            if (i16 >= i14) {
                break;
            }
            int i17 = $10 + 115;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i18 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(getSDKReferenceNumber[i11 % i16])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(1019086628);
                    if (obj != null) {
                        i13 = i15;
                        method = obj;
                    } else {
                        i13 = i15;
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(Color.red(i15) + 1774, (char) Color.argb(i15, i15, i15, i15), (ViewConfiguration.getFadingEdgeLength() >> 16) + 32);
                        byte b11 = (byte) (-1);
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls3.getMethod((String) objArr3[i13], cls2);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    long j11 = buildConfig.getDeviceData;
                    long j12 = getSDKAppID;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c11);
                    objArr4[2] = Long.valueOf(j12);
                    objArr4[1] = Long.valueOf(j11);
                    objArr4[i13] = l11;
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        int i19 = i13;
                        method2 = ((Class) getMessageVersion.getSDKTransactionID(441 - TextUtils.indexOf("", "", i19), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 37 - Color.green(i19))).getMethod("n", cls, cls, cls, cls2);
                        map.put(-1106061844, method2);
                    }
                    jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {buildConfig, buildConfig};
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1919 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 29 - View.combineMeasuredStates(0, 0));
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, b14, objArr6);
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
                Object[] objArr7 = {Integer.valueOf(getSDKReferenceNumber[i11 + i16])};
                Map map2 = getMessageVersion.timedout;
                Object method4 = map2.get(1019086628);
                if (method4 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 1774, (char) View.combineMeasuredStates(0, 0), 32 - Color.red(0));
                    byte b15 = (byte) (-1);
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr8);
                    method4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(1019086628, method4);
                }
                Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                l12.longValue();
                Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKAppID), Integer.valueOf(c11)};
                Object method5 = map2.get(-1106061844);
                if (method5 == null) {
                    method5 = ((Class) getMessageVersion.getSDKTransactionID(441 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.alpha(0) + 37)).getMethod("n", cls, cls, cls, cls2);
                    map2.put(-1106061844, method5);
                }
                jArr[i16] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {buildConfig, buildConfig};
                Object method6 = map2.get(1947342796);
                if (method6 == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 1920, (char) TextUtils.getOffsetBefore("", 0), 29 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b17 = (byte) (-1);
                    byte b18 = (byte) (b17 + 1);
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, b18, objArr11);
                    method6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1947342796, method6);
                }
                ((Method) method6).invoke(null, objArr10);
            }
            $10 = ($11 + 19) % 128;
            i14 = i12;
            jArr = jArr;
            i15 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[i14];
        buildConfig.getDeviceData = 0;
        $10 = ($11 + 101) % 128;
        while (true) {
            int i21 = buildConfig.getDeviceData;
            if (i21 >= i14) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i21] = (char) jArr2[i21];
            Object[] objArr12 = {buildConfig, buildConfig};
            Map map3 = getMessageVersion.timedout;
            Object method7 = map3.get(1947342796);
            if (method7 == null) {
                Class cls7 = (Class) getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28);
                byte b19 = (byte) (-1);
                byte b21 = (byte) (b19 + 1);
                Object[] objArr13 = new Object[1];
                b(b19, b21, b21, objArr13);
                method7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1947342796, method7);
            }
            ((Method) method7).invoke(null, objArr12);
        }
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
    private static void b(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 5
            int r9 = 113 - r9
            byte[] r0 = atd.af.getSDKAppID.$$a
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2d:
            int r9 = -r9
            int r9 = r9 + r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getSDKAppID.b(byte, short, int, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = new char[]{38726, 43399, 28, 11433, 277, 30682, 27827, 16652, 14300};
        getSDKAppID = -3796747176291521082L;
    }

    static void init$0() {
        $$a = new byte[]{125, 7, -90, 118};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
    }

    public final RSAPublicKey AuthenticationRequestParameters() {
        int i11 = getMessageVersion + 107;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return this.getSDKTransactionID;
        }
        throw null;
    }

    @Override // atd.ai.getSDKReferenceNumber
    public final Object getSDKAppID$660ecda2() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        String strChallengeResultCancelled = ChallengeResultCancelled();
        if (strChallengeResultCancelled != null) {
            int i11 = AuthenticationRequestParameters + 125;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                strChallengeResultCancelled.isEmpty();
                throw null;
            }
            if (!strChallengeResultCancelled.isEmpty()) {
                Object[] objArr = new Object[1];
                a((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 11450), 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 3 - KeyEvent.getDeadChar(0, 0), objArr);
                jSONObject.put(((String) objArr[0]).intern(), strChallengeResultCancelled);
            }
        }
        getSDKEphemeralPublicKey getsdkephemeralpublickey = new getSDKEphemeralPublicKey(atd.ah.BuildConfig.AuthenticationRequestParameters, atd.ag.getSDKTransactionID.getSDKAppID, jSONObject);
        atd.json.JSONObject.getSDKAppID(new Object[]{jSONObject}, -1150790233, 1150790235, (int) System.currentTimeMillis());
        try {
            Object[] objArr2 = {getsdkephemeralpublickey, getsdkephemeralpublickey.getSDKTransactionID().getSDKReferenceNumber(getsdkephemeralpublickey, this), this};
            Map map = getMessageVersion.timedout;
            Object declaredConstructor = map.get(-1730172936);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) getMessageVersion.getSDKTransactionID(171 - Color.alpha(0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10255), Color.rgb(0, 0, 0) + 16777246)).getDeclaredConstructor(getSDKEphemeralPublicKey.class, atd.ag.getDeviceData.class, AuthenticationRequestParameters.class);
                map.put(-1730172936, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr2);
            getMessageVersion = (AuthenticationRequestParameters + 83) % 128;
            return objNewInstance;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // atd.af.AuthenticationRequestParameters
    public final void getSDKTransactionID() {
        super.getSDKTransactionID();
        this.getSDKTransactionID = null;
        try {
            RSAPrivateKey rSAPrivateKey = this.getDeviceData;
            if (rSAPrivateKey != null) {
                int i11 = getMessageVersion + 85;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 != 0) {
                    rSAPrivateKey.destroy();
                    this.getDeviceData = null;
                    throw null;
                }
                rSAPrivateKey.destroy();
                this.getDeviceData = null;
            }
            int i12 = AuthenticationRequestParameters + 1;
            getMessageVersion = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }
}
