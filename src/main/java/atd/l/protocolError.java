package atd.l;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkVersion;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class protocolError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkVersion$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getPressedStateDuration();
        TypedValue.complexToFloat(0);
        new getSDKAppID((byte) 0);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 75) % 128;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        Integer num = -2032575242;
        Integer num2 = 262890898;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c11);
        int i12 = 2;
        cArr2[2] = (char) (cArr2[2] + ((char) i11));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        $11 = ($10 + 115) % 128;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $11 = ($10 + 25) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(num2);
                int i13 = i12;
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 21 - (ViewConfiguration.getTouchSlop() >> 8));
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 + 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) ExpandableListView.getPackedPositionGroup(0L), 44 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i14 = cArr[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i13] = Integer.valueOf(cArr2[iIntValue]);
                objArr5[1] = Integer.valueOf(i14);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getCapsMode("", 0, 0) + 2446, (char) KeyEvent.getDeadChar(0, 0), 18 - ExpandableListView.getPackedPositionType(0L));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i15 = cArr[iIntValue2] * 32718;
                char c12 = cArr2[iIntValue];
                i12 = i13;
                Object[] objArr7 = new Object[i12];
                objArr7[1] = Integer.valueOf(c12);
                objArr7[0] = Integer.valueOf(i15);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2969 - (ViewConfiguration.getTapTimeout() >> 16), (char) (9912 - TextUtils.lastIndexOf("", '0')), 37 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr[iIntValue2] = c13;
                int i16 = challengeResultTimeout.getSDKTransactionID;
                cArr3[i16] = (char) (((((long) (c13 ^ charArray[i16])) ^ (getSDKAppID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getDeviceData) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i16 + 1;
                $10 = ($11 + 99) % 128;
                length3 = length3;
                charArray = charArray;
                cArr = cArr;
                num2 = num2;
                num = num;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.l.protocolError.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r5 = r5 * 3
            int r5 = 3 - r5
            int r6 = r6 * 4
            int r6 = 106 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r6 = r5
            r4 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L2c
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2c:
            int r3 = r3 + 1
            r4 = r0[r6]
        L30:
            int r4 = -r4
            int r5 = r5 + r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.protocolError.b(int, int, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = -4201337076207898698L;
        getDeviceData = 1458778038;
        getSDKTransactionID = (char) 30893;
    }

    private static String getSDKTransactionID() throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 77) % 128;
        Object[] objArr = new Object[1];
        a("ᑝꇡ淪嵊", "\u0000\u0000\u0000\u0000", (char) (19193 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\ue41e㙄뜄纹牦ힰ", TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr);
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(((String) objArr[0]).intern());
        int i11 = AuthenticationRequestParameters + 107;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 69 / 0;
        }
        return strM50constructorimpl;
    }

    static void init$0() {
        $$a = new byte[]{93, -72, -53, -77};
        $$b = 142;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 83) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
        int i11 = getSDKReferenceNumber + 109;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return stringValueM49boximpl;
        }
        throw null;
    }
}
