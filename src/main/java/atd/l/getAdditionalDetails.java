package atd.l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAdditionalDetails extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getMaximumFlingVelocity();
        KeyEvent.keyCodeFromString("");
        new AuthenticationRequestParameters((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 41) % 128;
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{'9', 25140, 50264, 9836, 34975, 60091, 19664, 44726, 4429, 29497, 54540, 14123, 39315, 64482, 24037, 49110, 8721, 33818, 58937, 18586, 27799, 3782, 43168, 19073};
        AuthenticationRequestParameters = -3229859959275888038L;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x01bc  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        int i14;
        Object method;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i12];
        int i15 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i16 = buildConfig.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            $10 = ($11 + 113) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getSDKAppID[i11 + i16])};
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i14 = i15;
                    method = obj;
                    i13 = 2;
                } else {
                    i13 = 2;
                    Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - View.MeasureSpec.getSize(i15), (char) View.getDefaultSize(i15, i15), Drawable.resolveOpacity(i15, i15) + 32);
                    byte b11 = (byte) i15;
                    byte b12 = b11;
                    i14 = i15;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls2.getMethod((String) objArr3[i14], cls);
                    map.put(1019086628, method);
                }
                Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = AuthenticationRequestParameters;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[i13] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i14] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionType(0L) + 441, (char) ((-1) - TextUtils.lastIndexOf("", '0', i14)), 37 - (Process.myTid() >> 22));
                    Class cls4 = Long.TYPE;
                    method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method2);
                }
                jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i13];
                objArr5[1] = buildConfig;
                objArr5[0] = buildConfig;
                Object method3 = map.get(1947342796);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1918, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.alpha(0) + 29);
                    byte b13 = (byte) 1;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                jArr = jArr;
                i15 = 0;
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
            $10 = ($11 + 35) % 128;
            cArr[i17] = (char) jArr2[i17];
            Object[] objArr7 = {buildConfig, buildConfig};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method4 = map2.get(1947342796);
            if (method4 == null) {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 29 - KeyEvent.getDeadChar(0, 0));
                byte b15 = (byte) 1;
                byte b16 = (byte) (b15 - 1);
                Object[] objArr8 = new Object[1];
                b(b15, b16, b16, objArr8);
                method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1947342796, method4);
            }
            ((Method) method4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 * 5
            int r6 = r6 + 108
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = atd.l.getAdditionalDetails.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.getAdditionalDetails.b(byte, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{126, 51, 71, 77};
        $$b = 70;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Field field;
        int i11 = Build.VERSION.SDK_INT;
        Field[] fields = Build.VERSION_CODES.class.getFields();
        s.j(fields, "");
        int length = fields.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                field = null;
                break;
            }
            field = fields[i12];
            if (field.getInt(null) == i11) {
                getDeviceData = (getSDKReferenceNumber + 53) % 128;
                break;
            }
            i12++;
        }
        String name = field != null ? field.getName() : null;
        if (name != null) {
            getSDKReferenceNumber = (getDeviceData + 117) % 128;
            if (name.length() != 0) {
                t0 t0Var = t0.f86535a;
                Object[] objArr = new Object[1];
                a((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ViewConfiguration.getFadingEdgeLength() >> 16, (ViewConfiguration.getTouchSlop() >> 8) + 20, objArr);
                String str = String.format(((String) objArr[0]).intern(), Arrays.copyOf(new Object[]{name, Build.VERSION.RELEASE, Integer.valueOf(i11)}, 3));
                s.j(str, "");
                return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(str));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }
}
