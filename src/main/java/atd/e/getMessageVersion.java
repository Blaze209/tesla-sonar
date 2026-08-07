package atd.e;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getMessageVersion {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private List<BuildConfig> getDeviceData;
    private final atd.ao.AuthenticationRequestParameters getSDKAppID;
    private atd.i.getDeviceData getSDKReferenceNumber;
    private String getSDKTransactionID;

    /* JADX INFO: renamed from: atd.e.getMessageVersion$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AuthenticationRequestParameters;
        private static int getSDKAppID = 0;
        private static int getSDKReferenceNumber = 1;

        static {
            int[] iArr = new int[atd.i.getDeviceData.values().length];
            AuthenticationRequestParameters = iArr;
            try {
                iArr[atd.i.getDeviceData.CHALLENGE_RESPONSE.ordinal()] = 1;
                int i11 = getSDKReferenceNumber;
                getSDKAppID = ((i11 ^ 49) + ((i11 & 49) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AuthenticationRequestParameters[atd.i.getDeviceData.ERROR.ordinal()] = 2;
                int i12 = getSDKReferenceNumber;
                int i13 = (i12 & (-4)) | ((~i12) & 3);
                int i14 = -(-((i12 & 3) << 1));
                getSDKAppID = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters = -426005678925467789L;
    }

    getMessageVersion(JsonObject jsonObject) throws Throwable {
        this.getSDKReferenceNumber = atd.i.getDeviceData.getSDKReferenceNumber(atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.MESSAGE_TYPE).getSDKReferenceNumber());
        this.getSDKTransactionID = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.MESSAGE_VERSION).getSDKReferenceNumber();
        this.getSDKAppID = new atd.ao.AuthenticationRequestParameters(atd.d.getMessageVersion.getMessageVersion(jsonObject, atd.am.getDeviceData.SDK_TRANSACTION_ID).getSDKReferenceNumber(), atd.d.getMessageVersion.getMessageVersion(jsonObject, atd.am.getDeviceData.THREEDS_SERVER_TRANSACTION_ID).getSDKReferenceNumber(), getSDKTransactionID(jsonObject, atd.am.getDeviceData.ACS_TRANSACTION_ID), null);
        JsonArray sDKReferenceNumber = atd.d.getMessageVersion.getSDKEphemeralPublicKey(jsonObject, atd.am.getDeviceData.MESSAGE_EXTENSION).getSDKReferenceNumber();
        List<BuildConfig> listAuthenticationRequestParameters = sDKReferenceNumber != null ? BuildConfig.AuthenticationRequestParameters(sDKReferenceNumber) : null;
        this.getDeviceData = listAuthenticationRequestParameters;
        if (listAuthenticationRequestParameters == null || listAuthenticationRequestParameters.size() <= 10) {
            return;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        e("滋쐥螬䅸¼숏趉伅໕젗诳啴ᓼ홸釜卍ዒ\udc54鿀廨ᡩ\udbfbꔳ擅♋", 16007 - View.resolveSize(0, 0), objArr);
        throw new atd.z.AuthenticationRequestParameters(String.format(locale, ((String) objArr[0]).intern(), Integer.valueOf(this.getDeviceData.size())), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.TOO_MANY_MESSAGE_EXTENSIONS);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x01af  */
    private static void e(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        int i12;
        char c11 = 2;
        if (str != null) {
            int i13 = $10 + 43;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        int i14 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i15 = gettransactionstatus.getSDKTransactionID;
            if (i15 >= cArr.length) {
                break;
            }
            $10 = ($11 + 9) % 128;
            char c12 = cArr[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c11] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i14] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(962978490);
                if (method != null) {
                    i12 = i14;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(i14, i14, i14) + 689, (char) (View.combineMeasuredStates(i14, i14) + 16022), KeyEvent.normalizeMetaState(i14) + 32);
                    byte b11 = (byte) i14;
                    byte b12 = b11;
                    i12 = i14;
                    Object[] objArr3 = new Object[1];
                    f(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i16 = i12;
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (29017 - View.getDefaultSize(i16, i16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24)).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                c11 = 2;
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
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 115) % 128;
        while (true) {
            int i17 = gettransactionstatus.getSDKTransactionID;
            if (i17 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i18 = $10 + 3;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr2[i17] = (char) jArr2[i17];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSize(0, 0) + 417, (char) (29017 - (Process.myTid() >> 22)), TextUtils.indexOf("", "", 0) + 24)).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                throw null;
            }
            cArr2[i17] = (char) jArr2[i17];
            Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method4 = map3.get(-46730980);
            if (method4 == null) {
                method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(416 - MotionEvent.axisFromString(""), (char) (Color.blue(0) + 29017), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23)).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method4);
            }
            ((Method) method4).invoke(null, objArr6);
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
    private static void f(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 * 2
            int r8 = r8 + 118
            byte[] r0 = atd.e.getMessageVersion.$$g
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2f
        L17:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getMessageVersion.f(short, int, byte, java.lang.Object[]):void");
    }

    public static getMessageVersion getSDKTransactionID(JsonObject jsonObject) throws Throwable {
        int i11 = ChallengeResultCancelled + 75;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = AnonymousClass4.AuthenticationRequestParameters[atd.i.getDeviceData.getSDKReferenceNumber(atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.MESSAGE_TYPE).getSDKReferenceNumber()).ordinal()];
            throw null;
        }
        String sDKReferenceNumber = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.MESSAGE_TYPE).getSDKReferenceNumber();
        int i13 = AnonymousClass4.AuthenticationRequestParameters[atd.i.getDeviceData.getSDKReferenceNumber(sDKReferenceNumber).ordinal()];
        if (i13 == 1) {
            return new getDeviceData(jsonObject);
        }
        if (i13 == 2) {
            AuthenticationRequestParameters authenticationRequestParameters = new AuthenticationRequestParameters(jsonObject);
            BuildConfig = (ChallengeResultCancelled + 99) % 128;
            return authenticationRequestParameters;
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        e("彩⏎䡡盫鼕얅\ue227ଖ㇗幽蓼괒쮾\uf02a᥈䟋氽誄댞\ud9aaج⼆喳", 55662 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(sDKReferenceNumber);
        throw new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.MESSAGE_RECEIVED_INVALID, atd.am.ChallengeResultCancelled.INVALID_MESSAGE_TYPE);
    }

    static void init$0() {
        $$g = new byte[]{124, -16, -101, -118};
        $$h = 168;
    }

    public final atd.i.getDeviceData BuildConfig() {
        int i11 = BuildConfig + 71;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKReferenceNumber;
        }
        throw null;
    }

    public void ChallengeResultCancelled() {
        this.getSDKReferenceNumber = null;
        this.getSDKTransactionID = null;
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{authenticationRequestParameters}, 208540168, -208540167, System.identityHashCode(authenticationRequestParameters));
        List<BuildConfig> list = this.getDeviceData;
        if (list != null) {
            for (BuildConfig buildConfig : list) {
                ChallengeResultCancelled = (BuildConfig + 17) % 128;
                if (buildConfig != null) {
                    int i11 = BuildConfig + 95;
                    ChallengeResultCancelled = i11 % 128;
                    if (i11 % 2 == 0) {
                        BuildConfig.getSDKReferenceNumber(new Object[]{buildConfig}, -804692130, 804692130, System.identityHashCode(buildConfig));
                        throw null;
                    }
                    BuildConfig.getSDKReferenceNumber(new Object[]{buildConfig}, -804692130, 804692130, System.identityHashCode(buildConfig));
                }
                BuildConfig = (ChallengeResultCancelled + 5) % 128;
            }
            this.getDeviceData.clear();
            this.getDeviceData = null;
        }
    }

    public abstract boolean getDeviceData();

    public final atd.ao.AuthenticationRequestParameters getMessageVersion() {
        int i11 = (ChallengeResultCancelled + 123) % 128;
        BuildConfig = i11;
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        int i12 = i11 + 41;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    public final String getSDKEphemeralPublicKey() {
        int i11 = ChallengeResultCancelled;
        String str = this.getSDKTransactionID;
        BuildConfig = (i11 + 125) % 128;
        return str;
    }

    abstract String getSDKTransactionID(JsonObject jsonObject, atd.am.getDeviceData getdevicedata);
}
