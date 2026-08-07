package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultSynth;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultKt extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getMessageVersion;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultSynth$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters();
        View.MeasureSpec.getSize(0);
        Drawable.resolveOpacity(0, 0);
        new AuthenticationRequestParameters((byte) 0);
        getSDKTransactionID = (getMessageVersion + 71) % 128;
    }

    public /* synthetic */ ChallengeResultKt(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = -4201337076207898698L;
        getSDKReferenceNumber = 1557286369;
        AuthenticationRequestParameters = (char) 12214;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        int i12 = $10;
        $11 = (i12 + 45) % 128;
        int i13 = 2;
        if (str3 != null) {
            int i14 = i12 + 75;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = charArray2.length;
        char[] cArr3 = new char[length2];
        int i15 = 0;
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(charArray2, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c11);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $10 = ($11 + 109) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(num2);
                int i16 = i13;
                int i17 = i15;
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(i17) + 1863, (char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetAfter("", i17) + 21);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 224, (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i18 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                char c12 = cArr3[iIntValue];
                Object[] objArr5 = new Object[3];
                objArr5[i16] = Integer.valueOf(c12);
                objArr5[1] = Integer.valueOf(i18);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2445 - TextUtils.lastIndexOf("", '0', 0), (char) Color.red(0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    byte b13 = (byte) ($$b & 1);
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i19 = cArr2[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i16];
                objArr7[1] = Integer.valueOf(cArr3[iIntValue]);
                objArr7[0] = Integer.valueOf(i19);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2968 - TextUtils.lastIndexOf("", '0', 0), (char) (9913 - View.MeasureSpec.getSize(0)), TextUtils.lastIndexOf("", '0') + 38)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr2[iIntValue2] = c13;
                int i21 = challengeResultTimeout.getSDKTransactionID;
                cArr4[i21] = (char) (((((long) (c13 ^ cArr[i21])) ^ (getDeviceData ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i21 + 1;
                i13 = i16;
                length3 = length3;
                cArr2 = cArr2;
                cArr3 = cArr3;
                num = num;
                num2 = num2;
                i15 = 0;
                cArr = cArr;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.v.ChallengeResultKt.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r6 = r6 * 4
            int r6 = r6 + 102
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r3 = r0
            r4 = r2
            r0 = r7
            goto L34
        L19:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L34:
            int r7 = r7 + 1
            int r6 = -r6
            int r6 = r6 + r0
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.ChallengeResultKt.b(short, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{14, -72, -78, -9};
        $$b = 255;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Integer numAuthenticationRequestParameters;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a("愡廋伓ᇠ", "\u0000\u0000\u0000\u0000", (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 57424), "ꚠ嚹ᑆ췐馛ᰣ篬\uf3dbᕊ齙\ue5a3鐽⠒橭Ĩ蠅ϊ", 324979553 - Gravity.getAbsoluteGravity(0, 0), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null && (numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID)) != null) {
            DeviceParameterResult.Success.IntValue intValueM35boximpl = DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
            getMessageVersion = (getSDKTransactionID + 29) % 128;
            return intValueM35boximpl;
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i11 = getSDKTransactionID + 113;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return failure;
        }
        throw null;
    }

    private ChallengeResultKt(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
