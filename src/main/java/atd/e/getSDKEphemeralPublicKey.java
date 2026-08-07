package atd.e;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "Lcom/adyen/threeds2/internal/api/json/JsonSerializable;", "Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;", "messageType", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "messageVersion", "threeDSRequestorAppURL", "<init>", "(Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Lcom/adyen/threeds2/internal/util/DestroyableString;Lcom/adyen/threeds2/internal/util/DestroyableString;)V", "", "requiresEncryption", "()Z", "Lorg/json/JSONObject;", "serialize", "()Lorg/json/JSONObject;", "Ljn0/h0;", "clear", "()V", "Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;", "getMessageType", "()Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;", "setMessageType", "(Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;)V", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "getTransactionIdentifiers", "()Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "getMessageVersion", "()Lcom/adyen/threeds2/internal/util/DestroyableString;", "getThreeDSRequestorAppURL", "", "sdkCounterStoA", "I", "getSdkCounterStoA", "()I", "setSdkCounterStoA", "(I)V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getSDKEphemeralPublicKey implements atd.f.getSDKReferenceNumber {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static long ChallengeResultCancelled;
    private static int getMessageVersion;
    private static char getSDKEphemeralPublicKey;
    private final atd.json.AuthenticationRequestParameters AuthenticationRequestParameters;
    private int getDeviceData;
    private final atd.json.AuthenticationRequestParameters getSDKAppID;
    private atd.i.getDeviceData getSDKReferenceNumber;
    private final atd.ao.AuthenticationRequestParameters getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        ChallengeResultCancelled = -5535186485327930921L;
        BuildConfig = 1458778038;
        getSDKEphemeralPublicKey = (char) 12214;
    }

    public getSDKEphemeralPublicKey(atd.i.getDeviceData getdevicedata, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, atd.json.AuthenticationRequestParameters authenticationRequestParameters2, atd.json.AuthenticationRequestParameters authenticationRequestParameters3) {
        s.k(authenticationRequestParameters, "");
        s.k(authenticationRequestParameters2, "");
        this.getSDKReferenceNumber = getdevicedata;
        this.getSDKTransactionID = authenticationRequestParameters;
        this.getSDKAppID = authenticationRequestParameters2;
        this.AuthenticationRequestParameters = authenticationRequestParameters3;
    }

    private static void d(int i11, String str, char c11, String str2, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        Object method;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        $10 = ($11 + 15) % 128;
        char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $11 = ($10 + 91) % 128;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        int i12 = 2;
        if (str != null) {
            int i13 = $11 + 79;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i14 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c11);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $11 = ($10 + 111) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(num2);
                int i15 = i12;
                if (obj != null) {
                    method = obj;
                } else {
                    int i16 = i14;
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - Drawable.resolveOpacity(i14, i14), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 21 - (TypedValue.complexToFloat(i16) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i16) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b11 = (byte) i16;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    e(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i16], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(225 - Color.blue(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 44)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i17 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i15] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[1] = Integer.valueOf(i17);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2446, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Process.getThreadPriority(0) + 20) >> 6) + 18);
                    byte b13 = (byte) 1;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    e(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i18 = cArr3[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i15];
                objArr7[1] = Integer.valueOf(cArr4[iIntValue]);
                objArr7[0] = Integer.valueOf(i18);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2970 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (9912 - TextUtils.indexOf((CharSequence) "", '0', 0)), 37 - KeyEvent.keyCodeFromString(""))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = challengeResultTimeout.getDeviceData;
                cArr3[iIntValue2] = c12;
                int i19 = challengeResultTimeout.getSDKTransactionID;
                cArr5[i19] = (char) (((((long) (c12 ^ charArray3[i19])) ^ (ChallengeResultCancelled ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) BuildConfig) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKEphemeralPublicKey) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i19 + 1;
                i12 = i15;
                length3 = length3;
                charArray3 = charArray3;
                cArr3 = cArr3;
                cArr4 = cArr4;
                num = num;
                num2 = num2;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 4
            int r6 = r6 + 102
            byte[] r1 = atd.e.getSDKEphemeralPublicKey.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r8
            goto L32
        L19:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r6]
            r5 = r1
            r1 = r6
            r6 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r1 + 1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKEphemeralPublicKey.e(short, short, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        return getSDKReferenceNumber(objArr);
    }

    static void init$0() {
        $$d = new byte[]{124, 78, -55, -16};
        $$e = 186;
    }

    public abstract boolean AuthenticationRequestParameters();

    public final atd.json.AuthenticationRequestParameters BuildConfig() {
        int i11 = getMessageVersion + 57;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            return this.AuthenticationRequestParameters;
        }
        throw null;
    }

    public final int ChallengeResult() {
        return ((Integer) getSDKReferenceNumber(new Object[]{this}, -1595404261, 1595404261, System.identityHashCode(this))).intValue();
    }

    public final atd.json.AuthenticationRequestParameters ChallengeResultCancelled() {
        int i11 = ChallengeResult + 55;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            return this.getSDKAppID;
        }
        throw null;
    }

    public final atd.i.getDeviceData getDeviceData() {
        int i11 = (ChallengeResult + 81) % 128;
        getMessageVersion = i11;
        atd.i.getDeviceData getdevicedata = this.getSDKReferenceNumber;
        ChallengeResult = (i11 + 73) % 128;
        return getdevicedata;
    }

    public final atd.ao.AuthenticationRequestParameters getMessageVersion() {
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters;
        int i11 = getMessageVersion + 91;
        int i12 = i11 % 128;
        ChallengeResult = i12;
        if (i11 % 2 == 0) {
            authenticationRequestParameters = this.getSDKTransactionID;
            int i13 = 87 / 0;
        } else {
            authenticationRequestParameters = this.getSDKTransactionID;
        }
        getMessageVersion = (i12 + 119) % 128;
        return authenticationRequestParameters;
    }

    @Override // atd.f.getSDKReferenceNumber
    public JSONObject getSDKAppID() throws Throwable {
        String sDKAppID;
        JSONObject jSONObject = new JSONObject();
        String strAuthenticationRequestParameters = atd.am.getDeviceData.MESSAGE_TYPE.AuthenticationRequestParameters();
        atd.i.getDeviceData getdevicedata = this.getSDKReferenceNumber;
        if (getdevicedata != null) {
            ChallengeResult = (getMessageVersion + 71) % 128;
            sDKAppID = getdevicedata.getSDKAppID();
        } else {
            getMessageVersion = (ChallengeResult + 19) % 128;
            sDKAppID = null;
        }
        jSONObject.put(strAuthenticationRequestParameters, sDKAppID);
        String strAuthenticationRequestParameters2 = atd.am.getDeviceData.MESSAGE_VERSION.AuthenticationRequestParameters();
        atd.json.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        jSONObject.put(strAuthenticationRequestParameters2, (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters)));
        String strAuthenticationRequestParameters3 = atd.am.getDeviceData.THREEDS_SERVER_TRANSACTION_ID.AuthenticationRequestParameters();
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters2 = this.getSDKTransactionID;
        jSONObject.put(strAuthenticationRequestParameters3, (String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{authenticationRequestParameters2}, -118387588, 118387590, System.identityHashCode(authenticationRequestParameters2)));
        String strAuthenticationRequestParameters4 = atd.am.getDeviceData.ACS_TRANSACTION_ID.AuthenticationRequestParameters();
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters3 = this.getSDKTransactionID;
        jSONObject.put(strAuthenticationRequestParameters4, (String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{authenticationRequestParameters3}, -785917785, 785917789, System.identityHashCode(authenticationRequestParameters3)));
        String strAuthenticationRequestParameters5 = atd.am.getDeviceData.SDK_TRANSACTION_ID.AuthenticationRequestParameters();
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters4 = this.getSDKTransactionID;
        jSONObject.put(strAuthenticationRequestParameters5, (String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{authenticationRequestParameters4}, 414390748, -414390748, System.identityHashCode(authenticationRequestParameters4)));
        String strAuthenticationRequestParameters6 = atd.am.getDeviceData.SDK_COUNTER_A_TO_S.AuthenticationRequestParameters();
        t0 t0Var = t0.f86535a;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        d(ViewConfiguration.getDoubleTapTimeout() >> 16, "癡뚏쬇皞", (char) (17959 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "꤫ﲐ❬\uf346", "\ue443픺ꆼ랥", objArr);
        String str = String.format(locale, ((String) objArr[0]).intern(), Arrays.copyOf(new Object[]{Integer.valueOf(this.getDeviceData)}, 1));
        s.j(str, "");
        jSONObject.put(strAuthenticationRequestParameters6, str);
        String strAuthenticationRequestParameters7 = atd.am.getDeviceData.THREEDS_REQUESTOR_APP_URL.AuthenticationRequestParameters();
        atd.json.AuthenticationRequestParameters authenticationRequestParameters5 = this.AuthenticationRequestParameters;
        jSONObject.putOpt(strAuthenticationRequestParameters7, authenticationRequestParameters5 != null ? (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters5}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters5)) : null);
        return jSONObject;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        int i11 = getMessageVersion;
        ChallengeResult = (i11 + 37) % 128;
        int i12 = getsdkephemeralpublickey.getDeviceData;
        int i13 = i11 + 117;
        ChallengeResult = i13 % 128;
        if (i13 % 2 != 0) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    public final void getSDKReferenceNumber(int i11) {
        int i12 = ChallengeResult;
        this.getDeviceData = i11;
        getMessageVersion = (i12 + 115) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        r0 = atd.e.getSDKEphemeralPublicKey.ChallengeResult + 5;
        atd.e.getSDKEphemeralPublicKey.getMessageVersion = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        atd.json.AuthenticationRequestParameters.getDeviceData(new java.lang.Object[]{r0}, -1497589000, 1497589000, java.lang.System.identityHashCode(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getSDKReferenceNumber() {
        /*
            r8 = this;
            int r0 = atd.e.getSDKEphemeralPublicKey.ChallengeResult
            int r0 = r0 + 119
            int r1 = r0 % 128
            atd.e.getSDKEphemeralPublicKey.getMessageVersion = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = -208540167(0xfffffffff391edf9, float:-2.3123465E31)
            r3 = 208540168(0xc6e1208, float:1.8340279E-31)
            r4 = 1497589000(0x59436508, float:3.437419E15)
            r5 = -1497589000(0xffffffffa6bc9af8, float:-1.3087125E-15)
            r6 = 0
            if (r0 == 0) goto L3d
            r8.getSDKReferenceNumber = r6
            atd.ao.AuthenticationRequestParameters r0 = r8.getSDKTransactionID
            java.lang.Object[] r7 = new java.lang.Object[]{r0}
            int r0 = java.lang.System.identityHashCode(r0)
            atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(r7, r3, r2, r0)
            atd.aw.AuthenticationRequestParameters r0 = r8.getSDKAppID
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            int r0 = java.lang.System.identityHashCode(r0)
            atd.json.AuthenticationRequestParameters.getDeviceData(r2, r5, r4, r0)
            r8.getDeviceData = r1
            atd.aw.AuthenticationRequestParameters r0 = r8.AuthenticationRequestParameters
            if (r0 == 0) goto L6b
            goto L5f
        L3d:
            r8.getSDKReferenceNumber = r6
            atd.ao.AuthenticationRequestParameters r0 = r8.getSDKTransactionID
            java.lang.Object[] r7 = new java.lang.Object[]{r0}
            int r0 = java.lang.System.identityHashCode(r0)
            atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(r7, r3, r2, r0)
            atd.aw.AuthenticationRequestParameters r0 = r8.getSDKAppID
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            int r0 = java.lang.System.identityHashCode(r0)
            atd.json.AuthenticationRequestParameters.getDeviceData(r2, r5, r4, r0)
            r8.getDeviceData = r1
            atd.aw.AuthenticationRequestParameters r0 = r8.AuthenticationRequestParameters
            if (r0 == 0) goto L6b
        L5f:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            int r0 = java.lang.System.identityHashCode(r0)
            atd.json.AuthenticationRequestParameters.getDeviceData(r1, r5, r4, r0)
            return
        L6b:
            int r0 = atd.e.getSDKEphemeralPublicKey.ChallengeResult
            int r0 = r0 + 5
            int r1 = r0 % 128
            atd.e.getSDKEphemeralPublicKey.getMessageVersion = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L78
            return
        L78:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKEphemeralPublicKey.getSDKReferenceNumber():void");
    }
}
