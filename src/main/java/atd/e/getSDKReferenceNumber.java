package atd.e;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/ErrorMessageRequest;", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "errorType", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "errorDetail", "", "messageVersion", "threeDSRequestorAppURL", "<init>", "(Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Lcom/adyen/threeds2/internal/util/DestroyableString;Ljava/lang/String;Ljava/lang/String;)V", "", "requiresEncryption", "()Z", "Lorg/json/JSONObject;", "serialize", "()Lorg/json/JSONObject;", "Ljn0/h0;", "clear", "()V", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static short[] ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static byte[] getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.json.AuthenticationRequestParameters AuthenticationRequestParameters;
    private atd.i.getSDKTransactionID getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getSDKEphemeralPublicKey = 1;
        getDeviceData = -716804715;
        getSDKTransactionID = -1568970032;
        getSDKReferenceNumber = 1710440144;
        getMessageVersion = new byte[]{-79, -84, -80, -2, -2};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKReferenceNumber(atd.i.getSDKTransactionID getsdktransactionid, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, atd.json.AuthenticationRequestParameters authenticationRequestParameters2, String str, String str2) {
        super(atd.i.getDeviceData.ERROR, authenticationRequestParameters, new atd.json.AuthenticationRequestParameters(str), str2 != null ? new atd.json.AuthenticationRequestParameters(str2) : null);
        s.k(authenticationRequestParameters, "");
        s.k(authenticationRequestParameters2, "");
        s.k(str, "");
        this.getSDKAppID = getsdktransactionid;
        this.AuthenticationRequestParameters = authenticationRequestParameters2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01d1 A[PHI: r2
      0x01d1: PHI (r2v8 int) = (r2v7 int), (r2v22 int) binds: [B:45:0x01cf, B:42:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01da A[PHI: r2
      0x01da: PHI (r2v18 int) = (r2v7 int), (r2v22 int) binds: [B:45:0x01cf, B:42:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        int i18;
        Object method;
        atd.az.ChallengeResultKt challengeResultKt = new atd.az.ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i19 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKTransactionID)};
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 != null) {
                i14 = 0;
            } else {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2105 - View.resolveSize(0, 0), (char) (21994 - Process.getGidForName("")), (ViewConfiguration.getTouchSlop() >> 8) + 31);
                byte b12 = (byte) 0;
                byte b13 = b12;
                i14 = 0;
                Object[] objArr3 = new Object[1];
                b(b12, b13, b13, objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i21 = iIntValue == -1 ? 1 : i14;
            if (i21 != 0) {
                byte[] bArr = getMessageVersion;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i22 = i14;
                    j11 = -671853308956415234L;
                    while (i22 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i22])};
                        int i23 = i19;
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(i14) + 2936, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 33)).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i22] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i22++;
                        i19 = i23;
                        bArr = bArr;
                        i21 = i21;
                    }
                    bArr = bArr2;
                } else {
                    j11 = -671853308956415234L;
                }
                i15 = i21;
                int i24 = i19;
                if (bArr != null) {
                    byte[] bArr3 = getMessageVersion;
                    Object[] objArr5 = new Object[2];
                    objArr5[i24] = Integer.valueOf(getDeviceData);
                    objArr5[i14] = Integer.valueOf(i13);
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        int i25 = i14;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', i25) + 2106, (char) (Color.rgb(i25, i25, i25) + 16799211), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr6 = new Object[i24];
                        b(b14, b15, b15, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i13 + ((int) (((long) getDeviceData) ^ j11))]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                }
            } else {
                i15 = i21;
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                int i26 = $10 + 115;
                int i27 = i26 % 128;
                $11 = i27;
                if (i26 % 2 == 0) {
                    i16 = ((i13 - iIntValue) << 3) << ((int) (((long) getDeviceData) ^ j11));
                    if (i15 != 0) {
                        $10 = (i27 + 21) % 128;
                        i17 = i16;
                        i18 = 1;
                    } else {
                        i17 = i16;
                        i18 = 0;
                    }
                } else {
                    i16 = ((i13 + iIntValue) - 2) + ((int) (((long) getDeviceData) ^ j11));
                    if (i15 != 0) {
                        $10 = (i27 + 21) % 128;
                        i17 = i16;
                        i18 = 1;
                    } else {
                        i17 = i16;
                        i18 = 0;
                    }
                }
                challengeResultKt.getDeviceData = i17 + i18;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKReferenceNumber), sb2};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2136, (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarSize() >> 8) + 28);
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, (byte) (b17 - 1), objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = getMessageVersion;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i28 = 0; i28 < length2; i28++) {
                        bArr5[i28] = (byte) (((long) bArr4[i28]) ^ j11);
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr6 = getMessageVersion;
                        int i29 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i29 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i29]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr = ChallengeResult;
                        int i31 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i31 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i31]) ^ j11)) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                    $10 = ($11 + 77) % 128;
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r8 = r8 * 7
            int r8 = r8 + 114
            byte[] r0 = atd.e.getSDKReferenceNumber.$$a
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2f
        L17:
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r2
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2f:
            int r9 = r9 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKReferenceNumber.b(int, short, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{102, 100, -115, -8};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
    }

    @Override // atd.e.getSDKEphemeralPublicKey
    public final boolean AuthenticationRequestParameters() {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = i11 + 11;
        ChallengeResultCancelled = i12 % 128;
        boolean z11 = i12 % 2 != 0;
        ChallengeResultCancelled = (i11 + 59) % 128;
        return z11;
    }

    @Override // atd.e.getSDKEphemeralPublicKey, atd.f.getSDKReferenceNumber
    public final JSONObject getSDKAppID() throws Throwable {
        String sDKReferenceNumber;
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 3) % 128;
        JSONObject sDKAppID = super.getSDKAppID();
        String strAuthenticationRequestParameters = atd.am.getDeviceData.ERROR_CODE.AuthenticationRequestParameters();
        atd.i.getSDKTransactionID getsdktransactionid = this.getSDKAppID;
        String deviceData = null;
        if (getsdktransactionid != null) {
            int i11 = ChallengeResultCancelled + 73;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                getsdktransactionid.getSDKReferenceNumber();
                throw null;
            }
            sDKReferenceNumber = getsdktransactionid.getSDKReferenceNumber();
            ChallengeResultCancelled = (getSDKEphemeralPublicKey + 47) % 128;
        } else {
            sDKReferenceNumber = null;
        }
        sDKAppID.put(strAuthenticationRequestParameters, sDKReferenceNumber);
        String strAuthenticationRequestParameters2 = atd.am.getDeviceData.ERROR_COMPONENT.AuthenticationRequestParameters();
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 45, 947366933 + (Process.myPid() >> 22), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 2000488299, (byte) (ImageFormat.getBitsPerPixel(0) - 40), objArr);
        sDKAppID.put(strAuthenticationRequestParameters2, ((String) objArr[0]).intern());
        String strAuthenticationRequestParameters3 = atd.am.getDeviceData.ERROR_DESCRIPTION.AuthenticationRequestParameters();
        atd.i.getSDKTransactionID getsdktransactionid2 = this.getSDKAppID;
        if (getsdktransactionid2 != null) {
            deviceData = getsdktransactionid2.getDeviceData();
        } else {
            ChallengeResultCancelled = (getSDKEphemeralPublicKey + 105) % 128;
        }
        sDKAppID.put(strAuthenticationRequestParameters3, deviceData);
        String strAuthenticationRequestParameters4 = atd.am.getDeviceData.ERROR_MESSAGE_TYPE.AuthenticationRequestParameters();
        Object[] objArr2 = new Object[1];
        a((-42) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 947366932, (short) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 2000488299, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64), objArr2);
        sDKAppID.put(strAuthenticationRequestParameters4, ((String) objArr2[0]).intern());
        String strAuthenticationRequestParameters5 = atd.am.getDeviceData.ERROR_DETAIL.AuthenticationRequestParameters();
        atd.json.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        sDKAppID.put(strAuthenticationRequestParameters5, (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters)));
        return sDKAppID;
    }

    @Override // atd.e.getSDKEphemeralPublicKey
    public final void getSDKReferenceNumber() {
        int i11 = getSDKEphemeralPublicKey + 99;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            super.getSDKReferenceNumber();
            this.getSDKAppID = null;
            atd.json.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
            atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters));
            return;
        }
        super.getSDKReferenceNumber();
        this.getSDKAppID = null;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters2 = this.AuthenticationRequestParameters;
        atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters2));
        throw null;
    }
}
