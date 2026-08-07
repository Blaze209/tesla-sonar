package atd.af;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.ah.BuildConfig;
import atd.ai.getSDKEphemeralPublicKey;
import atd.az.ChallengeResultKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData extends getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static byte[] ChallengeResultCancelled;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;
    private atd.an.AuthenticationRequestParameters AuthenticationRequestParameters;
    private ECPrivateKey getDeviceData;
    private ECPublicKey getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        BuildConfig();
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getMaximumFlingVelocity();
        MotionEvent.axisFromString("");
        AudioTrack.getMaxVolume();
        ExpandableListView.getPackedPositionChild(0L);
        int i11 = BuildConfig + 107;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getDeviceData(String str, atd.an.AuthenticationRequestParameters authenticationRequestParameters) throws Throwable {
        Object[] objArr = new Object[1];
        a(MotionEvent.axisFromString("") - 115, (-883180847) + (KeyEvent.getMaxKeyCode() >> 16), (short) (KeyEvent.keyCodeFromString("") + 105), (-1642141622) - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        super(str, ((String) objArr[0]).intern());
        this.AuthenticationRequestParameters = authenticationRequestParameters;
        KeyPair keyPairAuthenticationRequestParameters = atd.an.getDeviceData.AuthenticationRequestParameters(authenticationRequestParameters);
        this.getSDKReferenceNumber = (ECPublicKey) keyPairAuthenticationRequestParameters.getPublic();
        this.getDeviceData = (ECPrivateKey) keyPairAuthenticationRequestParameters.getPrivate();
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return getSDKReferenceNumber(objArr);
    }

    static void BuildConfig() {
        getSDKAppID = -1013285559;
        getSDKTransactionID = -1568970099;
        getMessageVersion = -1763758198;
        ChallengeResultCancelled = new byte[]{113, 107, 112, 112, 112, 110, 91, 78, 110, -66, -70, 110, 45, 40, 110, 21, 5};
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        int i15;
        long j11;
        Object method;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i16 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKTransactionID)};
            Map map = getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 != null) {
                i14 = 0;
            } else {
                Class cls2 = (Class) getMessageVersion.getSDKTransactionID(2105 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21994), Process.getGidForName("") + 32);
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 - 1);
                i14 = 0;
                Object[] objArr3 = new Object[1];
                b(b12, b13, (byte) (b13 + 1), objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i17 = iIntValue == -1 ? 1 : i14;
            if (i17 != 0) {
                byte[] bArr = ChallengeResultCancelled;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i18 = i14;
                    j11 = -671853308956415234L;
                    while (i18 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i18])};
                        int i19 = i16;
                        Map map2 = getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            int i21 = i14;
                            method = ((Class) getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(i21, i21) + 2936, (char) TextUtils.indexOf("", ""), KeyEvent.keyCodeFromString("") + 33)).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i18] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i18++;
                        i16 = i19;
                        bArr = bArr;
                        i17 = i17;
                        i14 = 0;
                    }
                    bArr = bArr2;
                } else {
                    j11 = -671853308956415234L;
                }
                i15 = i17;
                int i22 = i16;
                if (bArr != null) {
                    byte[] bArr3 = ChallengeResultCancelled;
                    Object[] objArr5 = new Object[2];
                    objArr5[i22] = Integer.valueOf(getSDKAppID);
                    objArr5[0] = Integer.valueOf(i13);
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + 2105, (char) ((-16755221) - Color.rgb(0, 0, 0)), 31 - TextUtils.indexOf("", "", 0));
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 - 1);
                        Object[] objArr6 = new Object[i22];
                        b(b14, b15, (byte) (b15 + 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i13 + ((int) (((long) getSDKAppID) ^ j11))]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                    $10 = ($11 + 123) % 128;
                }
            } else {
                i15 = i17;
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j11)) + i15;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getMessageVersion), sb2};
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(AndroidCharacter.getMirror('0') + 2088, (char) TextUtils.getOffsetAfter("", 0), 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, (byte) (-b17), objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = ChallengeResultCancelled;
                if (bArr4 != null) {
                    $11 = ($10 + 31) % 128;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    loop1: while (true) {
                        int i23 = 0;
                        while (true) {
                            if (i23 >= length2) {
                                break loop1;
                            }
                            int i24 = $11 + 103;
                            $10 = i24 % 128;
                            if (i24 % 2 != 0) {
                                bArr5[i23] = (byte) (((long) bArr4[i23]) % j11);
                            } else {
                                bArr5[i23] = (byte) (((long) bArr4[i23]) ^ j11);
                                i23++;
                            }
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr6 = ChallengeResultCancelled;
                        int i25 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i25 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i25]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr = ChallengeResult;
                        int i26 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i26 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i26]) ^ j11)) + s11)) ^ b11));
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

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 7
            int r9 = r9 + 114
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = atd.af.getDeviceData.$$a
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r4 = r2
            r0 = r9
            r9 = r8
            goto L2f
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r8 = -r8
            int r8 = r8 + r0
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getDeviceData.b(byte, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{81, 33, -107, -119};
        $$b = 79;
    }

    public final ECPublicKey getDeviceData() {
        int i11 = (BuildConfig + 7) % 128;
        getSDKEphemeralPublicKey = i11;
        ECPublicKey eCPublicKey = this.getSDKReferenceNumber;
        BuildConfig = (i11 + 123) % 128;
        return eCPublicKey;
    }

    @Override // atd.ai.getSDKReferenceNumber
    public final Object getSDKAppID$660ecda2() throws Throwable {
        getDeviceData getdevicedata = new getDeviceData(ChallengeResultCancelled(), atd.an.AuthenticationRequestParameters.P256);
        JSONObject jSONObject = new JSONObject();
        String strChallengeResultCancelled = getdevicedata.ChallengeResultCancelled();
        if (strChallengeResultCancelled != null) {
            BuildConfig = (getSDKEphemeralPublicKey + 43) % 128;
            if (!strChallengeResultCancelled.isEmpty()) {
                getSDKEphemeralPublicKey = (BuildConfig + 75) % 128;
                Object[] objArr = new Object[1];
                a((-116) - View.resolveSizeAndState(0, 0, 0), (-883180809) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40), (-1642141612) - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                jSONObject.put(((String) objArr[0]).intern(), strChallengeResultCancelled);
            }
        }
        Object[] objArr2 = new Object[1];
        a((-116) - (ViewConfiguration.getLongPressTimeout() >> 16), (-883180814) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15), (-1642141610) + (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr2);
        jSONObject.put(((String) objArr2[0]).intern(), getdevicedata.getSDKReferenceNumber());
        atd.ah.getSDKReferenceNumber getsdkreferencenumber = BuildConfig.getSDKTransactionID;
        atd.ag.AuthenticationRequestParameters authenticationRequestParameters = atd.ag.getSDKTransactionID.getSDKAppID;
        getSDKEphemeralPublicKey getsdkephemeralpublickey = new getSDKEphemeralPublicKey(getsdkreferencenumber, authenticationRequestParameters, jSONObject);
        byte[] deviceData = getdevicedata.getDeviceData(ChallengeResultCancelled(), getDeviceData());
        getSDKReferenceNumber getsdkreferencenumber2 = new getSDKReferenceNumber(ChallengeResultCancelled(), deviceData);
        try {
            Object[] objArr3 = {getsdkephemeralpublickey, BuildConfig.getDeviceData.getSDKAppID(authenticationRequestParameters, deviceData), getsdkreferencenumber2};
            Map map = getMessageVersion.timedout;
            Object declaredConstructor = map.get(-1730172936);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) getMessageVersion.getSDKTransactionID(171 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10255), 31 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getDeclaredConstructor(getSDKEphemeralPublicKey.class, atd.ag.getDeviceData.class, AuthenticationRequestParameters.class);
                map.put(-1730172936, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr3);
            getsdkreferencenumber2.getSDKTransactionID();
            return objNewInstance;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final JSONObject getSDKReferenceNumber() throws Throwable {
        ECPoint w11 = this.getSDKReferenceNumber.getW();
        atd.json.getDeviceData getdevicedata = (atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
        String sDKTransactionID = getdevicedata.getSDKTransactionID(atd.an.getSDKTransactionID.getSDKTransactionID(w11.getAffineX()));
        String sDKTransactionID2 = getdevicedata.getSDKTransactionID(atd.an.getSDKTransactionID.getSDKTransactionID(w11.getAffineY()));
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            a((-116) - Color.red(0), (-883180809) - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) (Gravity.getAbsoluteGravity(0, 0) - 59), (-1642141614) + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) KeyEvent.getDeadChar(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(TextUtils.getCapsMode("", 0, 0) - 116, (-883180847) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (104 - Process.getGidForName("")), (-1642141623) - TextUtils.indexOf("", "", 0, 0), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            jSONObject.put(strIntern, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(((Process.getThreadPriority(0) + 20) >> 6) - 116, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 883180818, (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 95), (-1642141618) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
            jSONObject.put(((String) objArr3[0]).intern(), this.AuthenticationRequestParameters.getSDKTransactionID());
            Object[] objArr4 = new Object[1];
            a((-116) - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 883180796, (short) ((Process.myTid() >> 22) - 9), Color.red(0) - 1642141621, (byte) View.combineMeasuredStates(0, 0), objArr4);
            jSONObject.put(((String) objArr4[0]).intern(), sDKTransactionID);
            Object[] objArr5 = new Object[1];
            a((Process.myTid() >> 22) - 116, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 883180796, (short) (ImageFormat.getBitsPerPixel(0) + 116), (-1642141621) - Process.getGidForName(""), (byte) View.MeasureSpec.getMode(0), objArr5);
            jSONObject.put(((String) objArr5[0]).intern(), sDKTransactionID2);
            getSDKEphemeralPublicKey = (BuildConfig + 95) % 128;
            return jSONObject;
        } catch (JSONException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    @Override // atd.af.AuthenticationRequestParameters
    public final void getSDKTransactionID() {
        AuthenticationRequestParameters(new Object[]{this}, -582042577, 582042577, System.identityHashCode(this));
    }

    public final ECPrivateKey AuthenticationRequestParameters() {
        int i11 = (BuildConfig + 45) % 128;
        getSDKEphemeralPublicKey = i11;
        ECPrivateKey eCPrivateKey = this.getDeviceData;
        BuildConfig = (i11 + 15) % 128;
        return eCPrivateKey;
    }

    public final byte[] getDeviceData(String str, ECPublicKey eCPublicKey) {
        int i11 = BuildConfig + 1;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            byte[] sDKAppID = atd.an.getDeviceData.getSDKAppID(eCPublicKey, this.getDeviceData);
            return atd.an.getSDKReferenceNumber.getSDKReferenceNumber(sDKAppID, sDKAppID.length >>> 4, null, null, str);
        }
        byte[] sDKAppID2 = atd.an.getDeviceData.getSDKAppID(eCPublicKey, this.getDeviceData);
        return atd.an.getSDKReferenceNumber.getSDKReferenceNumber(sDKAppID2, sDKAppID2.length << 3, null, null, str);
    }

    getDeviceData(JSONObject jSONObject) throws Throwable {
        BigInteger sDKAppID;
        super(jSONObject);
        atd.json.getDeviceData getdevicedata = (atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
        Object[] objArr = new Object[1];
        a((-116) - TextUtils.getCapsMode("", 0, 0), (-883180796) + (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((-10) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) - 1642141621, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr);
        BigInteger sDKAppID2 = atd.an.getSDKTransactionID.getSDKAppID(getdevicedata.getSDKAppID(jSONObject.getString(((String) objArr[0]).intern())));
        Object[] objArr2 = new Object[1];
        a((-116) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 883180794, (short) (TextUtils.lastIndexOf("", '0') + 116), Gravity.getAbsoluteGravity(0, 0) - 1642141620, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        BigInteger sDKAppID3 = atd.an.getSDKTransactionID.getSDKAppID(getdevicedata.getSDKAppID(jSONObject.getString(((String) objArr2[0]).intern())));
        Object[] objArr3 = new Object[1];
        a((-116) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-899958032) - Color.rgb(0, 0, 0), (short) (ExpandableListView.getPackedPositionChild(0L) + 88), (-1642141619) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) KeyEvent.keyCodeFromString(""), objArr3);
        if (jSONObject.has(((String) objArr3[0]).intern())) {
            Object[] objArr4 = new Object[1];
            a((-116) - Color.blue(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 883180816, (short) (Gravity.getAbsoluteGravity(0, 0) + 87), View.resolveSize(0, 0) - 1642141619, (byte) (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
            sDKAppID = atd.an.getSDKTransactionID.getSDKAppID(getdevicedata.getSDKAppID(jSONObject.getString(((String) objArr4[0]).intern())));
        } else {
            sDKAppID = null;
        }
        Object[] objArr5 = new Object[1];
        a((-115) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-883180817) - (Process.myTid() >> 22), (short) ((Process.myTid() >> 22) + 95), Color.argb(0, 0, 0, 0) - 1642141618, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
        atd.an.AuthenticationRequestParameters AuthenticationRequestParameters = atd.an.AuthenticationRequestParameters.AuthenticationRequestParameters(jSONObject.getString(((String) objArr5[0]).intern()));
        this.AuthenticationRequestParameters = AuthenticationRequestParameters;
        this.getSDKReferenceNumber = atd.an.getDeviceData.AuthenticationRequestParameters(AuthenticationRequestParameters, sDKAppID2, sDKAppID3);
        this.getDeviceData = sDKAppID != null ? atd.an.getDeviceData.getSDKTransactionID(this.AuthenticationRequestParameters, sDKAppID) : null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        BuildConfig = (getSDKEphemeralPublicKey + 15) % 128;
        super.getSDKTransactionID();
        getdevicedata.AuthenticationRequestParameters = null;
        getdevicedata.getSDKReferenceNumber = null;
        try {
            ECPrivateKey eCPrivateKey = getdevicedata.getDeviceData;
            if (eCPrivateKey != null) {
                eCPrivateKey.destroy();
                getdevicedata.getDeviceData = null;
                getSDKEphemeralPublicKey = (BuildConfig + 51) % 128;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
