package atd.x;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DtmfToneWhenDialing;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DtmfToneWhenDialing$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKAppID = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters();
        TextUtils.indexOf("", "", 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        new getDeviceData((byte) 0);
        getSDKAppID = (getMessageVersion + 21) % 128;
    }

    public /* synthetic */ ChallengeResult(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = -4201337076207898698L;
        getSDKReferenceNumber = -951135701;
        getDeviceData = (char) 12214;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        String str4 = "";
        int i12 = $10;
        $11 = (i12 + 31) % 128;
        if (str3 != null) {
            $11 = (i12 + 61) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + 41) % 128;
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c11);
        int i13 = 2;
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr5 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        $11 = ($10 + 113) % 128;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(num2);
                int i14 = i13;
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1862, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionType(0L) + 21);
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
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(225 - (ViewConfiguration.getTapTimeout() >> 16), (char) TextUtils.indexOf(str4, str4, 0, 0), TextUtils.getTrimmedLength(str4) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i15 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i14] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[1] = Integer.valueOf(i15);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 2446, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 18 - View.getDefaultSize(0, 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i16 = cArr3[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i14];
                objArr7[1] = Integer.valueOf(cArr4[iIntValue]);
                objArr7[0] = Integer.valueOf(i16);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2970 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (9914 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = challengeResultTimeout.getDeviceData;
                cArr3[iIntValue2] = c12;
                int i17 = challengeResultTimeout.getSDKTransactionID;
                cArr5[i17] = (char) (((((long) (c12 ^ cArr[i17])) ^ (getSDKTransactionID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getDeviceData) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i17 + 1;
                cArr = cArr;
                i13 = i14;
                length3 = length3;
                cArr3 = cArr3;
                cArr4 = cArr4;
                num = num;
                num2 = num2;
                str4 = str4;
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

    private static void b(short s11, short s12, byte b11, Object[] objArr) {
        int i11 = (s12 * 4) + 4;
        byte[] bArr = $$a;
        int i12 = 106 - (b11 * 4);
        int i13 = s11 * 4;
        byte[] bArr2 = new byte[1 - i13];
        int i14 = 0 - i13;
        int i15 = -1;
        if (bArr == null) {
            i11++;
            i12 = i14 + i11;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i12;
            if (i15 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i16 = bArr[i11];
                i11++;
                i12 += i16;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{62, 104, -85, -6};
        $$b = 164;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Boolean sDKReferenceNumber;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a("⫿\ud8a1⥜ᝂ", "\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), "\u2d2a喸\uebd5益\uf51e巼ᐁꥱⲶ", 1557700907 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null || (sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID)) == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getMessageVersion = (getSDKAppID + 59) % 128;
            return failure;
        }
        int i11 = getMessageVersion + 119;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
        }
        int i12 = 35 / 0;
        return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
    }

    private ChallengeResult(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
