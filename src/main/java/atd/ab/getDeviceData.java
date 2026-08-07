package atd.ab;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultTimeout;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.ErrorMessage;
import com.adyen.threeds2.ProtocolErrorEvent;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/event/ProtocolErrorEventImpl;", "Lcom/adyen/threeds2/ProtocolErrorEvent;", "sdkTransactionID", "", "errorMessage", "Lcom/adyen/threeds2/ErrorMessage;", "additionalDetails", "<init>", "(Ljava/lang/String;Lcom/adyen/threeds2/ErrorMessage;Ljava/lang/String;)V", "toString", "getSDKTransactionID", "getErrorMessage", "getAdditionalDetails", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData implements ProtocolErrorEvent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static long getDeviceData;
    private static int getMessageVersion;
    private static char getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private final String AuthenticationRequestParameters;
    private final ErrorMessage getSDKAppID;
    private final String getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        getDeviceData = -4201337076207898698L;
        getSDKReferenceNumber = -606464786;
        getSDKEphemeralPublicKey = (char) 12214;
    }

    public getDeviceData(String str, ErrorMessage errorMessage, String str2) {
        s.k(errorMessage, "");
        s.k(str2, "");
        this.getSDKTransactionID = str;
        this.getSDKAppID = errorMessage;
        this.AuthenticationRequestParameters = str2;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        Integer num = -2032575242;
        Integer num2 = 262890898;
        int i12 = $10 + 105;
        $11 = i12 % 128;
        int i13 = 2;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c11);
        cArr2[2] = (char) (cArr2[2] + ((char) i11));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $10 = ($11 + 117) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object method = map.get(num2);
                int i14 = i13;
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 1863, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 + 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(225 - Color.alpha(0), (char) ExpandableListView.getPackedPositionGroup(0L), 44 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i15 = cArr[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i14] = Integer.valueOf(cArr2[iIntValue]);
                objArr5[1] = Integer.valueOf(i15);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 2446, (char) Color.blue(0), 18 - View.getDefaultSize(0, 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i16 = cArr[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i14];
                objArr7[1] = Integer.valueOf(cArr2[iIntValue]);
                objArr7[0] = Integer.valueOf(i16);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 2969, (char) (9913 - Color.alpha(0)), 37 - KeyEvent.getDeadChar(0, 0))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = challengeResultTimeout.getDeviceData;
                cArr[iIntValue2] = c12;
                int i17 = challengeResultTimeout.getSDKTransactionID;
                cArr3[i17] = (char) (((((long) (c12 ^ charArray[i17])) ^ (getDeviceData ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKEphemeralPublicKey) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i17 + 1;
                i13 = i14;
                length3 = length3;
                cArr = cArr;
                num = num;
                num2 = num2;
                charArray = charArray;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 106 - r8
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = atd.ab.getDeviceData.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getDeviceData.b(short, byte, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{81, 93, -56, -49};
        $$b = 115;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    public final String getAdditionalDetails() {
        int i11 = (getMessageVersion + 53) % 128;
        ChallengeResultCancelled = i11;
        String str = this.AuthenticationRequestParameters;
        int i12 = i11 + 113;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 46 / 0;
        }
        return str;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    public final ErrorMessage getErrorMessage() {
        ErrorMessage errorMessage;
        int i11 = ChallengeResultCancelled + 25;
        int i12 = i11 % 128;
        getMessageVersion = i12;
        if (i11 % 2 != 0) {
            errorMessage = this.getSDKAppID;
            int i13 = 61 / 0;
        } else {
            errorMessage = this.getSDKAppID;
        }
        int i14 = i12 + 45;
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 16 / 0;
        }
        return errorMessage;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    public final String getSDKTransactionID() {
        int i11 = getMessageVersion + 63;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKTransactionID;
        }
        int i12 = 18 / 0;
        return this.getSDKTransactionID;
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("閚\ue88f켷糷", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getOffsetBefore("", 0) + 63439), "䜯ﷷ꒴\udaae맞捭荬㟭폦鉀ٟ婔皫ᩞ넞\ua954\uf7d2彾\uf798襩쫅\uf3cd磼፶㊸凥鹜Я춽봷렪黏里ᵕც\u0ad5\uda5a朶傟䙒\uf691ꑂ푡䈯", (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.getSDKTransactionID);
        Object[] objArr2 = new Object[1];
        a("䔼ݠ佽蔰", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getCapsMode("", 0, 0) + 12367), "ᄠ\uee14悐\uf5e2\ud85b璺䳥契쁪\ueb0a㖫铳⦘⒴춤娹薨柭\uf16b␉蓁\u0c8dẄ爋矍\ua8de콓", 2097635397 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(this.getSDKAppID);
        Object[] objArr3 = new Object[1];
        a("䷝䝊衪挦", "\u0000\u0000\u0000\u0000", (char) (ExpandableListView.getPackedPositionGroup(0L) + 9864), "㈛叛\uef83\uec8f돹溈쪨븰\uf6a1륇帙ၤ\ua83a", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1783056972, objArr3);
        sb2.append(((String) objArr3[0]).intern());
        String strN = t.n(sb2.toString());
        int i11 = getMessageVersion + 65;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 5 / 0;
        }
        return strN;
    }
}
