package atd.x;

import android.app.Application;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/SoundEffectsEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class completed extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/SoundEffectsEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters();
        AndroidCharacter.getMirror('0');
        View.resolveSizeAndState(0, 0, 0);
        new getDeviceData((byte) 0);
        getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 95) % 128;
    }

    public /* synthetic */ completed(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = -4201337076207898698L;
        getSDKTransactionID = 1458778038;
        getSDKReferenceNumber = (char) 26887;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
        int i12 = 2;
        if (str2 != null) {
            int i13 = $10 + 123;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        if (str != null) {
            int i14 = $10 + 107;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        int i15 = 0;
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c11);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(num2);
                int i16 = i12;
                int i17 = i15;
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (CdmaCellLocation.convertQuartSecToDecDegrees(i17) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i17) == 0.0d ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 21 - (ViewConfiguration.getTapTimeout() >> 16));
                    byte b11 = (byte) ($$b & 3);
                    byte b12 = (byte) (-b11);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 + 1), objArr3);
                    method = cls.getMethod((String) objArr3[i17], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(224 - (ExpandableListView.getPackedPositionForChild(i17, i17) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i17, i17) == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i17, i17)), 43 - TextUtils.indexOf("", ""))).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i18 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i16] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[1] = Integer.valueOf(i18);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > r10 ? 1 : (SystemClock.uptimeMillis() == r10 ? 0 : -1)) + 2445, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 + 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i19 = cArr3[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i16];
                objArr7[1] = Integer.valueOf(cArr4[iIntValue]);
                objArr7[0] = Integer.valueOf(i19);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 2969, (char) (ExpandableListView.getPackedPositionChild(0L) + 9914), TextUtils.getOffsetBefore("", 0) + 37)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = challengeResultTimeout.getDeviceData;
                cArr3[iIntValue2] = c12;
                int i21 = challengeResultTimeout.getSDKTransactionID;
                cArr5[i21] = (char) (((((long) (c12 ^ charArray3[i21])) ^ (getDeviceData ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKTransactionID) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i21 + 1;
                i12 = i16;
                charArray3 = charArray3;
                length3 = length3;
                cArr3 = cArr3;
                num2 = num2;
                num = num;
                i15 = 0;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = atd.x.completed.$$a
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = 106 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r7
            r7 = r8
            goto L32
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L32:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.completed.b(byte, byte, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{5, -65, 35, -69};
        $$b = 109;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Boolean sDKReferenceNumber;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a("⻈떍ᆒ疫", "\u0000\u0000\u0000\u0000", (char) View.resolveSizeAndState(0, 0, 0), "잻\ud906\uf758靻暷길肺卥◌\uf76bҝﾀ檆駈䌖휳炪뿇维㳪妞", (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1833595602, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null || (sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 31) % 128;
        DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
        int i11 = getSDKEphemeralPublicKey + 65;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
        return booleanValueM14boximpl;
    }

    private completed(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
