package atd.r;

import android.app.Application;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/TransitionAnimationScale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultTimeout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/TransitionAnimationScale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        new getSDKAppID((byte) 0);
        int i11 = getSDKTransactionID + 17;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 49 / 0;
        }
    }

    public /* synthetic */ ChallengeResultTimeout(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new int[]{1636406294, -1306055978, -258944684, 1311373058, 607587118, -366476765, 1275201877, 759331056, -2002503039, -1965373043, -1668776985, -407830519, 2073193783, 1628560746, -909740328, 244658678, 1717831901, 677536119};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        Object method;
        int length;
        int[] iArr2;
        int i12;
        Object method2;
        Integer num = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i13 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getDeviceData;
        Class cls = Integer.TYPE;
        int i14 = 0;
        if (iArr3 != null) {
            int i15 = $10 + 107;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i12 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i12 = 0;
            }
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i12])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1861 - TextUtils.lastIndexOf("", '0', i14), (char) TextUtils.getTrimmedLength(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 3), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr2[i12] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i12++;
                    $10 = ($11 + 65) % 128;
                    cArr = cArr;
                    length = length;
                    iArr2 = iArr2;
                    iArr3 = iArr3;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        char[] cArr3 = cArr;
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getDeviceData;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            $11 = ($10 + 113) % 128;
            int i16 = 0;
            while (i16 < length3) {
                int i17 = $11 + 101;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i16])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 21 - ExpandableListView.getPackedPositionType(0L));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 3);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 3), objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr6[i16] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    iArr5 = iArr5;
                    i16 = i16;
                } else {
                    num = num;
                    cArr2 = cArr2;
                    int[] iArr7 = iArr5;
                    length3 = length3;
                    iArr6 = iArr6;
                    int i18 = i16;
                    Object[] objArr6 = {Integer.valueOf(iArr7[i18])};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + 1863, (char) View.resolveSizeAndState(0, 0, 0), 22 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 3), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr6[i18] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i16 = i18 + 1;
                    iArr5 = iArr7;
                }
                length3 = length3;
                iArr6 = iArr6;
                cArr2 = cArr2;
                num = num;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i19 = challengeResultCompleted.getDeviceData;
            if (i19 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i21 = iArr[i19];
            char c12 = (char) (i21 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i21;
            cArr3[1] = c13;
            int i22 = 16;
            char c14 = (char) (iArr[i19 + 1] >> 16);
            cArr3[i13] = c14;
            char c15 = (char) iArr[i19 + 1];
            char c16 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i23 = 0;
            while (i23 < i22) {
                int i24 = challengeResultCompleted.getSDKAppID ^ iArr4[i23];
                challengeResultCompleted.getSDKAppID = i24;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i24);
                Object[] objArr8 = new Object[4];
                objArr8[c16] = challengeResultCompleted;
                objArr8[i13] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1299 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> i22) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 32 - TextUtils.lastIndexOf("", '0', 0, 0));
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, b18, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i23++;
                i22 = i22;
                c16 = c16;
            }
            char c17 = c16;
            int i25 = challengeResultCompleted.getSDKAppID;
            int i26 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i26;
            challengeResultCompleted.getSDKReferenceNumber = i25;
            int i27 = i25 ^ iArr4[i22];
            challengeResultCompleted.getSDKReferenceNumber = i27;
            int i28 = i26 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i28;
            cArr3[0] = (char) (i28 >>> 16);
            cArr3[1] = (char) i28;
            cArr3[i13] = (char) (i27 >>> 16);
            cArr3[c17] = (char) i27;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i29 = challengeResultCompleted.getDeviceData;
            cArr4[i29 * 2] = cArr3[0];
            cArr4[(i29 * 2) + 1] = cArr3[1];
            cArr4[(i29 * 2) + 2] = cArr3[i13];
            cArr4[(i29 * 2) + 3] = cArr3[c17];
            Object[] objArr10 = new Object[i13];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object method5 = map5.get(num3);
            if (method5 == null) {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 2061, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 17 - (ViewConfiguration.getTouchSlop() >> 8));
                byte b19 = (byte) 0;
                byte b21 = (byte) (b19 + 1);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 1), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(num3, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            num2 = num3;
            c11 = 0;
            i13 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = atd.r.ChallengeResultTimeout.$$a
            int r7 = 120 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r7 = r7 + r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.ChallengeResultTimeout.b(byte, short, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{14, -72, -78, -9};
        $$b = 22;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Float fV;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(new int[]{1308646862, -56801798, -565124199, -127731597, -2026595232, 415356139, 1679493737, -1186077661, -2093289673, -436068503, 894579501, 1418688477, -1154827293, 1128148442}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null || (fV = t.v(sDKTransactionID)) == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getSDKTransactionID = (getSDKAppID + 1) % 128;
            return failure;
        }
        int i11 = getSDKAppID + 23;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return DeviceParameterResult.Success.FloatValue.m28boximpl(DeviceParameterResult.Success.FloatValue.m29constructorimpl(fV.floatValue()));
        }
        int i12 = 53 / 0;
        return DeviceParameterResult.Success.FloatValue.m28boximpl(DeviceParameterResult.Success.FloatValue.m29constructorimpl(fV.floatValue()));
    }

    private ChallengeResultTimeout(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
