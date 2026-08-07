package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenOffTimeout;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusHandler extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenOffTimeout$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getMessageVersion = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber();
        SystemClock.elapsedRealtime();
        new getSDKAppID((byte) 0);
        getMessageVersion = (ChallengeResult + 29) % 128;
    }

    public /* synthetic */ ChallengeStatusHandler(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        long j11;
        int i13;
        char[] cArr;
        String str3 = str2;
        int i14 = $10 + 77;
        $11 = i14 % 128;
        Object bytes = str3;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            int i15 = $10 + 49;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                charArray = str.toCharArray();
                int i16 = 83 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
        char[] cArr3 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            j11 = 0;
            char[] cArr4 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                $11 = ($10 + 71) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i17])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj == null) {
                        Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 32)).getMethod("o", cls);
                        map.put(508097192, method);
                        obj = method;
                    }
                    cArr4[i17] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i17++;
                    $10 = ($11 + 27) % 128;
                    cArr3 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i12 = 1;
            $11 = ($10 + 33) % 128;
            cArr3 = cArr4;
        } else {
            i12 = 1;
            j11 = 0;
        }
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 2061, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + 17);
            byte b11 = (byte) 0;
            byte b12 = (byte) (b11 - 1);
            Object[] objArr4 = new Object[i12];
            b(b11, b12, (byte) (b12 + 1), objArr4);
            method2 = cls2.getMethod((String) objArr4[0], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (AuthenticationRequestParameters) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr5 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i18] = (char) (cArr3[bArr[(i19 - 1) - i18] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetBefore("", 0) + 1108, (char) KeyEvent.getDeadChar(0, 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 49);
                    byte b13 = (byte) 1;
                    byte b14 = (byte) (-b13);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 + 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            }
        } else if (getSDKAppID) {
            int i21 = $11 + 31;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                int length3 = cArr2.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                cArr = new char[length3];
                i13 = 0;
            } else {
                i13 = 0;
                int length4 = cArr2.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                cArr = new char[length4];
            }
            challengeStatusReceiver.getDeviceData = i13;
            while (true) {
                int i22 = challengeStatusReceiver.getDeviceData;
                int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i22] = (char) (cArr3[cArr2[(i23 - 1) - i22] - i11] - iIntValue);
                Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 50 - Color.argb(0, 0, 0, 0));
                    byte b15 = (byte) 1;
                    byte b16 = (byte) (-b15);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        } else {
            int length5 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length5;
            char[] cArr6 = new char[length5];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i24 = challengeStatusReceiver.getDeviceData;
                int i25 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i24 >= i25) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    $11 = ($10 + 9) % 128;
                    cArr6[i24] = (char) (cArr3[iArr[(i25 - 1) - i24] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i24 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = atd.x.ChallengeStatusHandler.$$a
            int r5 = r5 * 2
            int r5 = r5 + 107
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r5
            r5 = r7
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r6]
        L29:
            int r5 = r5 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusHandler.b(short, short, int, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = new char[]{64689, 64705, 64688, 64703, 64692, 64709, 64693, 64700, 64686, 64699, 64695, 64687, 64739, 64755, 64750};
        getSDKTransactionID = -185467614;
        getSDKAppID = true;
        AuthenticationRequestParameters = true;
    }

    static void init$0() {
        $$a = new byte[]{107, 31, -31, -112};
        $$b = 54;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        ChallengeResult = (getMessageVersion + 91) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getDeviceData;
        Object[] objArr = new Object[1];
        a(null, null, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 127, "\u0089\u008c\u0087\u0084\u008b\u008a\u0089\u0086\u0088\u0088\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            Integer numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID);
            DeviceParameterResult.Success.IntValue intValueM35boximpl = numAuthenticationRequestParameters != null ? DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue())) : null;
            if (intValueM35boximpl != null) {
                int i11 = getMessageVersion + 79;
                ChallengeResult = i11 % 128;
                if (i11 % 2 != 0) {
                    return intValueM35boximpl;
                }
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private ChallengeStatusHandler(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
