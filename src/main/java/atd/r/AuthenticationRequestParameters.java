package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AlwaysFinishActivities;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static boolean getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AlwaysFinishActivities$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKTransactionID();
        ExpandableListView.getPackedPositionGroup(0L);
        new getDeviceData((byte) 0);
        int i11 = getMessageVersion + 71;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 7 / 0;
        }
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        Object method;
        String str3 = str2;
        Object obj = str3;
        if (str3 != null) {
            int i12 = $10 + 71;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                str3.getBytes("ISO-8859-1");
                throw null;
            }
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $10 = ($11 + 103) % 128;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        if (str != null) {
            $11 = ($10 + 3) % 128;
            charArray = str.toCharArray();
            $10 = ($11 + 11) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
        char[] cArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj2 = map.get(508097192);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 32 - TextUtils.getTrimmedLength(""))).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr3[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    cArr2 = cArr2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(0) + 2061, (char) KeyEvent.keyCodeFromString(""), 17 - Color.argb(0, 0, 0, 0));
            byte b11 = (byte) 0;
            byte b12 = b11;
            Object[] objArr4 = new Object[1];
            b(b11, b12, b12, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (getSDKTransactionID) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr4 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i14 = challengeStatusReceiver.getDeviceData;
                int i15 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + 1108, (char) Color.alpha(0), 50 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            }
        } else if (getSDKReferenceNumber) {
            int length3 = cArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr5 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i16 = challengeStatusReceiver.getDeviceData;
                int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $11 = ($10 + 61) % 128;
                cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i11] - iIntValue);
                Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) View.MeasureSpec.getSize(0), 50 - TextUtils.getCapsMode("", 0, 0));
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr6 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i18] = (char) (cArr2[iArr[(i19 - 1) - i18] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i18 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.r.AuthenticationRequestParameters.$$a
            int r8 = r8 * 2
            int r8 = r8 + 107
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r0
            r5 = r2
            r0 = r9
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r7 = -r7
            int r7 = r7 + r0
            int r8 = r8 + 1
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.AuthenticationRequestParameters.b(int, int, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getDeviceData = new char[]{64783, 64770, 64761, 64759, 64765, 64785, 64776, 64775, 64768, 64774, 64781, 64762, 64760, 64779, 64815, 64830, 64822, 64824};
        getSDKAppID = -185467538;
        getSDKReferenceNumber = true;
        getSDKTransactionID = true;
    }

    static void init$0() {
        $$a = new byte[]{67, 74, -88, -74};
        $$b = 29;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX WARN: Code duplicated, block: B:9:0x004f A[PHI: r0
      0x004f: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v12 java.lang.String) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String sDKTransactionID;
        Boolean sDKReferenceNumber;
        int i11 = ChallengeResultCancelled + 35;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
            Object[] objArr = new Object[1];
            a(null, null, 110 / (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)), "\u0085\u008e\u0088\u008c\u0088\u008d\u0088\u008c\u008b\u0081\u0086\u008a\u0085\u0088\u0089\u0088\u0087\u0086\u0085\u0084\u0081\u0083\u0082\u0081", objArr);
            sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
            if (sDKTransactionID != null) {
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    ChallengeResultCancelled = (getMessageVersion + 9) % 128;
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        } else {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters2 = this.AuthenticationRequestParameters;
            Object[] objArr2 = new Object[1];
            a(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0085\u008e\u0088\u008c\u0088\u008d\u0088\u008c\u008b\u0081\u0086\u008a\u0085\u0088\u0089\u0088\u0087\u0086\u0085\u0084\u0081\u0083\u0082\u0081", objArr2);
            sDKTransactionID = authenticationRequestParameters2.getSDKTransactionID(((String) objArr2[0]).intern());
            if (sDKTransactionID != null) {
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    ChallengeResultCancelled = (getMessageVersion + 9) % 128;
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private AuthenticationRequestParameters(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
