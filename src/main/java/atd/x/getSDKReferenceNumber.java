package atd.x;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/BluetoothDiscoverabilityTimeout;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static char getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/BluetoothDiscoverabilityTimeout$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        getSDKReferenceNumber();
        KeyEvent.keyCodeFromString("");
        new getSDKAppID((byte) 0);
        ChallengeResultCancelled = (ChallengeResult + 101) % 128;
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        if (str != null) {
            $10 = ($11 + 101) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i13 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i14 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i15 = challengeStatusHandler.getSDKReferenceNumber;
            if (i15 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            cArr3[i13] = cArr[i15];
            cArr3[1] = cArr[i15 + 1];
            int i16 = 58224;
            int i17 = i13;
            while (i17 < 16) {
                char c11 = cArr3[1];
                char c12 = cArr3[i13];
                int i18 = i14;
                char[] cArr4 = cArr3;
                int i19 = (c12 + i16) ^ ((c12 << 4) + ((char) (((long) getSDKAppID) ^ (-2881362678149017980L))));
                int i21 = c12 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i18] = Integer.valueOf(i21);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i13;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1744, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 16682), 29 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    char c13 = cArr4[i12];
                    int i22 = (cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ (-2881362678149017980L))));
                    int i23 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getSDKTransactionID);
                    objArr4[i18] = Integer.valueOf(i23);
                    objArr4[1] = Integer.valueOf(i22);
                    objArr4[i12] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        int i24 = i12;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 16682), 29 - Drawable.resolveOpacity(i24, i24));
                        byte b13 = (byte) i24;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i24], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr4[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i17++;
                    i14 = i18;
                    cArr3 = cArr4;
                    cArr = cArr;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr;
            int i25 = i14;
            char[] cArr6 = cArr3;
            int i26 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i26] = cArr6[0];
            cArr2[i26 + 1] = cArr6[1];
            Object[] objArr6 = new Object[i25];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 1596, (char) (View.MeasureSpec.getMode(0) + 27824), (KeyEvent.getMaxKeyCode() >> 16) + 25);
                byte b15 = (byte) ($$b & 5);
                byte b16 = (byte) (b15 - 1);
                Object[] objArr7 = new Object[1];
                b(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            $11 = ($10 + 15) % 128;
            i14 = i25;
            cArr3 = cArr6;
            cArr = cArr5;
            i13 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 112
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = atd.x.getSDKReferenceNumber.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKReferenceNumber.b(byte, int, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = (char) 24853;
        getSDKTransactionID = (char) 23022;
        getSDKAppID = (char) 34146;
        getDeviceData = (char) 13326;
    }

    static void init$0() {
        $$a = new byte[]{95, 124, -34, 103};
        $$b = 179;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a("惉뱐\ua97e艐땪塁ﷻ\uf4fcᇺ煆\u193c\ue249㈴숥Ư栆獇\ueedb╝冘냬⼛≆쪋鞡暻혤鯔᠘ꬑ䂇᭷\udd18变", 33 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            ChallengeResultCancelled = (ChallengeResult + 63) % 128;
            Integer numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID);
            if (numAuthenticationRequestParameters != null) {
                int i11 = ChallengeResult + 55;
                ChallengeResultCancelled = i11 % 128;
                if (i11 % 2 != 0) {
                    return DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                }
                DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                throw null;
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i12 = ChallengeResultCancelled + 39;
        ChallengeResult = i12 % 128;
        if (i12 % 2 == 0) {
            return failure;
        }
        throw null;
    }

    private getSDKReferenceNumber(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
