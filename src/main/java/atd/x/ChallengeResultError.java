package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/MuteStreamsAffected;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char[] getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/MuteStreamsAffected$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKTransactionID();
        TypedValue.complexToFloat(0);
        ViewConfiguration.getKeyRepeatTimeout();
        TextUtils.lastIndexOf("", '0', 0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = getDeviceData + 61;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ ChallengeResultError(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0232  */
    /* JADX WARN: Code duplicated, block: B:48:0x0233  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i12];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i12) {
                break;
            }
            $10 = ($11 + 29) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getSDKTransactionID[i11 + i15])};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (method != null) {
                    i13 = i14;
                } else {
                    Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1774, (char) (Color.rgb(i14, i14, i14) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), 32 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b11 = (byte) i14;
                    byte b12 = b11;
                    i13 = i14;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls2.getMethod((String) objArr3[i13], cls);
                    map.put(1019086628, method);
                }
                Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = AuthenticationRequestParameters;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[2] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i13] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    int i16 = i13;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(441 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) TextUtils.indexOf("", "", i16, i16), TextUtils.getCapsMode("", i16, i16) + 37);
                    Class cls4 = Long.TYPE;
                    method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method2);
                }
                jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = {buildConfig, buildConfig};
                Object method3 = map.get(1947342796);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - TextUtils.getTrimmedLength(""), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                jArr = jArr;
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
        char[] cArr = new char[i12];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i17 = buildConfig.getDeviceData;
            if (i17 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = $10 + 23;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr[i17] = (char) jArr2[i17];
                Object[] objArr7 = {buildConfig, buildConfig};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1947342796);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(0) + 20) >> 6) + 1919, (char) (AndroidCharacter.getMirror('0') - '0'), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1947342796, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                int i19 = 92 / 0;
            } else {
                cArr[i17] = (char) jArr2[i17];
                Object[] objArr9 = {buildConfig, buildConfig};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method5 = map3.get(1947342796);
                if (method5 == null) {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1918 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 29);
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 + 1);
                    Object[] objArr10 = new Object[1];
                    b(b17, b18, (byte) (b18 - 1), objArr10);
                    method5 = cls7.getMethod((String) objArr10[0], Object.class, Object.class);
                    map3.put(1947342796, method5);
                }
                ((Method) method5).invoke(null, objArr9);
            }
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
    private static void b(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = atd.x.ChallengeResultError.$$a
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 5
            int r6 = r6 + 108
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r6 = r5
            r3 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r7]
        L2b:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultError.b(short, byte, int, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{64097, 23684, 46978, 3742, 24999, 47246, 5014, 27285, 52609, 9352, 32643, 54944, 10639, 32948, 56252, 12985, 38329, 60578, 18354, 40622, 61868, '9', 42676, 19891, 62655};
        AuthenticationRequestParameters = -1223098429231946107L;
    }

    static void init$0() {
        $$a = new byte[]{116, 90, 119, 13};
        $$b = EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0064 A[PHI: r0
      0x0064: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v12 java.lang.String) binds: [B:8:0x0062, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String sDKTransactionID;
        Integer numAuthenticationRequestParameters;
        int i11 = getSDKAppID + 67;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)) + 64117), View.MeasureSpec.makeMeasureSpec(0, 1), 25 / View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
            if (sDKTransactionID != null) {
                numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID);
                if (numAuthenticationRequestParameters != null) {
                    getSDKAppID = (getDeviceData + 29) % 128;
                    return DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                }
            }
        } else {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters2 = this.getSDKReferenceNumber;
            Object[] objArr2 = new Object[1];
            a((char) (64117 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 21, objArr2);
            sDKTransactionID = authenticationRequestParameters2.getSDKTransactionID(((String) objArr2[0]).intern());
            if (sDKTransactionID != null) {
                numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID);
                if (numAuthenticationRequestParameters != null) {
                    getSDKAppID = (getDeviceData + 29) % 128;
                    return DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private ChallengeResultError(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
