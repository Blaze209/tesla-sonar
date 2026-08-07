package atd.z;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.am.ChallengeResultCancelled;
import atd.am.getDeviceData;
import atd.az.getMessageVersion;
import atd.i.getSDKTransactionID;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0019B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/adyen/threeds2/internal/exception/ThreeDS2ChallengeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "protocolErrorMessage", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "protocolErrorType", "Lcom/adyen/threeds2/internal/result/ResultCode;", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/MessageField;", "messageField", "<init>", "(Ljava/lang/String;Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;Lcom/adyen/threeds2/internal/result/ResultCode;Lcom/adyen/threeds2/internal/result/MessageField;)V", "message", "errorType", "(Ljava/lang/String;Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;Lcom/adyen/threeds2/internal/result/ResultCode;)V", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "getProtocolErrorType", "()Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "Lcom/adyen/threeds2/internal/result/ResultCode;", "getResultCode", "()Lcom/adyen/threeds2/internal/result/ResultCode;", "Lcom/adyen/threeds2/internal/result/MessageField;", "getMessageField", "()Lcom/adyen/threeds2/internal/result/MessageField;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends Exception {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKAppID = 1;
    private final getSDKTransactionID getDeviceData;
    private final getDeviceData getSDKReferenceNumber;
    private final ChallengeResultCancelled getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/exception/ThreeDS2ChallengeException$Companion;", "", "<init>", "()V", "serialVersionUID", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int getSDKAppID;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKAppID = 1;
            getSDKReferenceNumber = 1029305049;
        }

        private getSDKReferenceNumber() {
        }

        public static void AuthenticationRequestParameters(long j11, long j12) throws Throwable {
            int i11 = getSDKTransactionID + 113;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                byte b11 = $$a[36];
                byte b12 = b11;
                Object[] objArr = new Object[1];
                a(b12, (byte) (b12 + 1), b11, objArr);
                Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
                throw null;
            }
            byte[] bArr = $$a;
            byte b13 = bArr[36];
            byte b14 = b13;
            Object[] objArr2 = new Object[1];
            a(b14, (byte) (b14 + 1), b13, objArr2);
            Class.forName((String) objArr2[0]).getField("getSDKReferenceNumber").get(null);
            try {
                byte b15 = bArr[36];
                byte b16 = b15;
                Object[] objArr3 = new Object[1];
                a(b16, (byte) (b16 + 1), b15, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b17 = bArr[36];
                byte b18 = (byte) (b17 + 1);
                byte b19 = b17;
                Object[] objArr4 = new Object[1];
                a(b18, b19, (byte) (b19 + 1), objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(null, null);
                Object[] objArr5 = {atd.ap.getSDKReferenceNumber.class.getField("AuthenticationRequestParameters").get(null)};
                Object[] objArr6 = new Object[1];
                b(275 - View.MeasureSpec.getSize(0), true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, "\u0001\u0001\ufffe", Color.green(0) + 3, objArr6);
                int i12 = getSDKAppID + 125;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 46 / 0;
                }
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 6
                int r7 = r7 + 97
                int r9 = r9 * 17
                int r9 = 38 - r9
                byte[] r0 = atd.z.AuthenticationRequestParameters.getSDKReferenceNumber.$$a
                int r8 = r8 * 37
                int r8 = 40 - r8
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r0
                r4 = r2
                r0 = r8
                r8 = r9
                goto L31
            L18:
                r3 = r2
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r8 = r8 + 1
                if (r4 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r0
                r0 = r6
            L31:
                int r7 = -r7
                int r8 = r8 + r7
                int r7 = r8 + (-8)
                r8 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.AuthenticationRequestParameters.getSDKReferenceNumber.a(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:39:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:40:0x01b8  */
        private static void b(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
            char[] charArray;
            int i14;
            Throwable cause;
            int i15;
            Object method;
            int i16 = $11;
            $10 = (i16 + 53) % 128;
            if (str != null) {
                $10 = (i16 + 103) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            getMessageVersion getmessageversion = new getMessageVersion();
            char[] cArr2 = new char[i12];
            int i17 = 0;
            getmessageversion.getDeviceData = 0;
            while (true) {
                int i18 = getmessageversion.getDeviceData;
                if (i18 >= i12) {
                    break;
                }
                $11 = ($10 + 35) % 128;
                char c11 = cArr[i18];
                getmessageversion.getSDKTransactionID = c11;
                char c12 = (char) (i11 + c11);
                cArr2[i18] = c12;
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[1] = Integer.valueOf(getSDKReferenceNumber);
                    objArr2[i17] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(139968170);
                    if (obj != null) {
                        i15 = i17;
                        method = obj;
                    } else {
                        i15 = i17;
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1186 - (CdmaCellLocation.convertQuartSecToDecDegrees(i17) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i17) == 0.0d ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 46 - View.combineMeasuredStates(i17, i17));
                        byte b11 = (byte) (-1);
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        String str2 = (String) objArr3[i15];
                        Class cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2);
                        map.put(139968170, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = getmessageversion;
                    objArr4[i15] = getmessageversion;
                    Object method2 = map.get(-1388326022);
                    if (method2 == null) {
                        int i19 = i15;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetBefore("", i19) + 1721, (char) (TextUtils.indexOf((CharSequence) "", '0') + 48635), 24 - Color.alpha(i19));
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (-b13);
                        Object[] objArr5 = new Object[1];
                        c(b13, b14, (byte) (b14 - 1), objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(-1388326022, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    cArr = cArr;
                    i17 = 0;
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
            if (i13 > 0) {
                $10 = ($11 + 63) % 128;
                getmessageversion.getSDKReferenceNumber = i13;
                char[] cArr3 = new char[i12];
                i14 = 0;
                System.arraycopy(cArr2, 0, cArr3, 0, i12);
                int i21 = getmessageversion.getSDKReferenceNumber;
                System.arraycopy(cArr3, 0, cArr2, i12 - i21, i21);
                int i22 = getmessageversion.getSDKReferenceNumber;
                System.arraycopy(cArr3, i22, cArr2, 0, i12 - i22);
            } else {
                i14 = 0;
            }
            if (z11) {
                $10 = ($11 + 95) % 128;
                char[] cArr4 = new char[i12];
                getmessageversion.getDeviceData = i14;
                while (true) {
                    int i23 = getmessageversion.getDeviceData;
                    if (i23 >= i12) {
                        break;
                    }
                    cArr4[i23] = cArr2[(i12 - i23) - 1];
                    Object[] objArr6 = {getmessageversion, getmessageversion};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-1388326022);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - TextUtils.lastIndexOf("", '0'), (char) (View.resolveSize(0, 0) + 48634), 24 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b15 = (byte) (-1);
                        byte b16 = (byte) (-b15);
                        Object[] objArr7 = new Object[1];
                        c(b15, b16, (byte) (b16 - 1), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1388326022, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                }
                $11 = ($10 + 81) % 128;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 3
                int r0 = r7 + 1
                int r6 = r6 * 2
                int r6 = 68 - r6
                int r5 = r5 + 4
                byte[] r1 = atd.z.AuthenticationRequestParameters.getSDKReferenceNumber.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L22:
                int r5 = r5 + 1
                int r3 = r3 + 1
                r4 = r1[r5]
            L28:
                int r4 = -r4
                int r6 = r6 + r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.AuthenticationRequestParameters.getSDKReferenceNumber.c(int, byte, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{55, -88, -54, 122, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
            $$b = 56;
        }

        static void init$1() {
            $$d = new byte[]{29, 18, Tnaf.POW_2_WIDTH, -56};
            $$e = 188;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        new getSDKReferenceNumber((byte) 0);
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public /* synthetic */ AuthenticationRequestParameters(String str, getSDKTransactionID getsdktransactionid, ChallengeResultCancelled challengeResultCancelled, byte b11) {
        this(str, getsdktransactionid, challengeResultCancelled, getDeviceData.NONE);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKAppID;
        int i12 = i11 + 44;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        AuthenticationRequestParameters = i13 % 128;
        int i14 = i13 % 2;
        ChallengeResultCancelled challengeResultCancelled = authenticationRequestParameters.getSDKTransactionID;
        if (i14 != 0) {
            throw null;
        }
        int i15 = i11 & 35;
        int i16 = (((i11 ^ 35) | i15) << 1) - ((i11 | 35) & (~i15));
        AuthenticationRequestParameters = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 36 / 0;
        }
        return challengeResultCancelled;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKAppID;
        int i12 = ((i11 & (-96)) | ((~i11) & 95)) + ((i11 & 95) << 1);
        AuthenticationRequestParameters = i12 % 128;
        int i13 = i12 % 2;
        getDeviceData getdevicedata = authenticationRequestParameters.getSDKReferenceNumber;
        if (i13 != 0) {
            int i14 = 9 / 0;
        }
        return getdevicedata;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = (i11 * (-520)) + (i12 * 522) + ((~(i14 | i12 | i13)) * 521);
        int i16 = ~(i11 | (~i12));
        int i17 = i15 + (i16 * (-1042)) + ((i16 | (~(i12 | (~i13) | i14))) * 521);
        if (i17 != 1) {
            return i17 != 2 ? AuthenticationRequestParameters(objArr) : getDeviceData(objArr);
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i18 = AuthenticationRequestParameters;
        int i19 = i18 & 51;
        getSDKAppID = ((((i18 ^ 51) | i19) << 1) - ((~i19) & (i18 | 51))) % 128;
        getSDKTransactionID getsdktransactionid = authenticationRequestParameters.getDeviceData;
        int i21 = i18 ^ 35;
        int i22 = ((i18 & 35) | i21) << 1;
        int i23 = -i21;
        getSDKAppID = ((i22 & i23) + (i22 | i23)) % 128;
        return getsdktransactionid;
    }

    public final ChallengeResultCancelled getSDKAppID() {
        return (ChallengeResultCancelled) getSDKTransactionID(new Object[]{this}, -861264258, 861264258, System.identityHashCode(this));
    }

    public final getSDKTransactionID getSDKReferenceNumber() {
        return (getSDKTransactionID) getSDKTransactionID(new Object[]{this}, -1812069396, 1812069397, System.identityHashCode(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationRequestParameters(String str, getSDKTransactionID getsdktransactionid, ChallengeResultCancelled challengeResultCancelled, getDeviceData getdevicedata) {
        super(str);
        s.k(str, "");
        s.k(getsdktransactionid, "");
        s.k(challengeResultCancelled, "");
        s.k(getdevicedata, "");
        this.getDeviceData = getsdktransactionid;
        this.getSDKTransactionID = challengeResultCancelled;
        this.getSDKReferenceNumber = getdevicedata;
    }

    public final getDeviceData getSDKTransactionID() {
        return (getDeviceData) getSDKTransactionID(new Object[]{this}, -1903152757, 1903152759, System.identityHashCode(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationRequestParameters(String str, getSDKTransactionID getsdktransactionid, ChallengeResultCancelled challengeResultCancelled) {
        this(str, getsdktransactionid, challengeResultCancelled, getDeviceData.NONE);
        s.k(str, "");
        s.k(getsdktransactionid, "");
        s.k(challengeResultCancelled, "");
    }
}
