package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/NetworkPreference;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCompleted extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/NetworkPreference$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        BuildConfig = 1;
        getSDKReferenceNumber();
        Drawable.resolveOpacity(0, 0);
        new getSDKReferenceNumber((byte) 0);
        getMessageVersion = (BuildConfig + 11) % 128;
    }

    public /* synthetic */ ChallengeResultCompleted(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12 = ($10 + 55) % 128;
        $11 = i12;
        int i13 = 2;
        if (str != null) {
            int i14 = i12 + 75;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i15 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i16 = challengeStatusHandler.getSDKReferenceNumber;
            if (i16 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            cArr3[i15] = cArr[i16];
            cArr3[1] = cArr[i16 + 1];
            int i17 = 58224;
            int i18 = i15;
            while (i18 < 16) {
                char c11 = cArr3[1];
                char c12 = cArr3[i15];
                int i19 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                int i21 = c12 >>> 5;
                int i22 = i15;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKReferenceNumber);
                    objArr2[i13] = Integer.valueOf(i21);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[i22] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    int i23 = i13;
                    Class cls = Integer.TYPE;
                    if (method == null) {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - ExpandableListView.getPackedPositionType(0L), (char) (16682 - (CdmaCellLocation.convertQuartSecToDecDegrees(i22) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i22) == 0.0d ? 0 : -1))), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        byte b11 = $$a[i22];
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i22], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c13 = cArr3[i22];
                    int i24 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i25 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr4[i23] = Integer.valueOf(i25);
                    objArr4[1] = Integer.valueOf(i24);
                    objArr4[i22] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1744 - ExpandableListView.getPackedPositionChild(0L), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16682), Color.alpha(i22) + 29);
                        byte b13 = $$a[i22];
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i22], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i18++;
                    i13 = i23;
                    i15 = i22;
                    cArr = cArr;
                    cArr3 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr;
            int i26 = i13;
            int i27 = i15;
            char[] cArr5 = cArr3;
            int i28 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i28] = cArr5[i27];
            cArr2[i28 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i26];
            objArr6[1] = challengeStatusHandler;
            objArr6[i27] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1596, (char) (27825 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.combineMeasuredStates(i27, i27) + 25);
                byte b15 = $$a[i27];
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, (byte) (b16 + 1), objArr7);
                method3 = cls4.getMethod((String) objArr7[i27], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            cArr3 = cArr5;
            i15 = 0;
            i13 = i26;
            cArr = cArr4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 112
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = atd.r.ChallengeResultCompleted.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r6]
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.ChallengeResultCompleted.b(short, int, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getDeviceData = (char) 51003;
        AuthenticationRequestParameters = (char) 47241;
        getSDKTransactionID = (char) 26449;
        getSDKReferenceNumber = (char) 19469;
    }

    static void init$0() {
        $$a = new byte[]{0, -124, -15, -20};
        $$b = 186;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a("\ue1e3ꭙ\ue18e妀㷆ꞩ\ud9c3⎺ᩘ\uf341幐Я塪ત∈꼴ᓞꇧ", Color.red(0) + 18, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getMessageVersion = (BuildConfig + 3) % 128;
            return failure;
        }
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
        int i11 = getMessageVersion + 61;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return stringValueM49boximpl;
        }
        throw null;
    }

    private ChallengeResultCompleted(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
