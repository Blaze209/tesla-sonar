package atd.l;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkRefNumber;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusReceiver extends DeviceParameter {
    private static int getSDKAppID = 1;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final Application getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkRefNumber$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static int getMessageVersion;
        private static int getSDKAppID;
        private static boolean getSDKReferenceNumber;
        private static char[] getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            getMessageVersion = 1;
            getSDKTransactionID = new char[]{64891, 64881, 64926, 64895, 64896, 64879, 64893, 64880, 64929, 64885, 64884, 64897, 64878, 64894, 64877, 64899, 64924, 64948, 64949, 64875, 64889, 64886, 64901, 64882, 64892, 64947};
            AuthenticationRequestParameters = -185467422;
            getDeviceData = true;
            getSDKReferenceNumber = true;
        }

        private getSDKAppID() {
        }

        private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
            String str3 = str2;
            int i12 = 1;
            $10 = ($11 + 1) % 128;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
            char[] cArr = getSDKTransactionID;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i13 = 0;
                while (i13 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                        int i14 = i12;
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj == null) {
                            Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 32 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("o", cls);
                            map.put(508097192, method);
                            obj = method;
                        }
                        cArr2[i13] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i13++;
                        i12 = i14;
                        cArr = cArr;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            int i15 = i12;
            Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method2 = map2.get(-852383591);
            if (method2 == null) {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16779277, (char) (ImageFormat.getBitsPerPixel(0) + 1), 17 - TextUtils.getOffsetBefore("", 0));
                byte b11 = $$d[2];
                byte b12 = b11;
                Object[] objArr4 = new Object[i15];
                c(b12, (byte) (b12 - 1), b11, objArr4);
                method2 = cls2.getMethod((String) objArr4[0], cls);
                map2.put(-852383591, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
            long j11 = 0;
            if (getSDKReferenceNumber) {
                int length2 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length2;
                char[] cArr3 = new char[length2];
                challengeStatusReceiver.getDeviceData = 0;
                $11 = ($10 + 117) % 128;
                while (true) {
                    int i16 = challengeStatusReceiver.getDeviceData;
                    int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i16 >= i17) {
                        objArr[0] = new String(cArr3);
                        return;
                    }
                    cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                    Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-249860496);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1109 - (SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 50 - Color.green(0));
                        byte b13 = (byte) ($$e & 3);
                        Object[] objArr6 = new Object[1];
                        c(b13, (byte) (-b13), $$d[2], objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                        map3.put(-249860496, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    j11 = j11;
                }
            } else if (getDeviceData) {
                int length3 = charArray.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                char[] cArr4 = new char[length3];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i18 = challengeStatusReceiver.getDeviceData;
                    int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i18 >= i19) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    int i21 = $11 + 61;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        cArr4[i18] = (char) (cArr[charArray[i19 - i18] - i11] << iIntValue);
                        Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object method4 = map4.get(-249860496);
                        if (method4 == null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1108, (char) ExpandableListView.getPackedPositionType(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50);
                            byte b14 = (byte) ($$e & 3);
                            Object[] objArr8 = new Object[1];
                            c(b14, (byte) (-b14), $$d[2], objArr8);
                            method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                            map4.put(-249860496, method4);
                        }
                        ((Method) method4).invoke(null, objArr7);
                    } else {
                        cArr4[i18] = (char) (cArr[charArray[(i19 - 1) - i18] - i11] - iIntValue);
                        Object[] objArr9 = {challengeStatusReceiver, challengeStatusReceiver};
                        Map map5 = atd.a.getMessageVersion.timedout;
                        Object method5 = map5.get(-249860496);
                        if (method5 == null) {
                            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + 1108, (char) ExpandableListView.getPackedPositionType(0L), 50 - KeyEvent.getDeadChar(0, 0));
                            byte b15 = (byte) ($$e & 3);
                            Object[] objArr10 = new Object[1];
                            c(b15, (byte) (-b15), $$d[2], objArr10);
                            method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                            map5.put(-249860496, method5);
                        }
                        ((Method) method5).invoke(null, objArr9);
                    }
                }
            } else {
                int length4 = iArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                char[] cArr5 = new char[length4];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i22 = challengeStatusReceiver.getDeviceData;
                    int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i22 >= i23) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i22] = (char) (cArr[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                        challengeStatusReceiver.getDeviceData = i22 + 1;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.l.ChallengeStatusReceiver.getSDKAppID.$$a
                int r8 = r8 * 18
                int r1 = r8 + 3
                int r6 = r6 * 2
                int r6 = r6 + 103
                int r7 = r7 * 20
                int r7 = 23 - r7
                byte[] r1 = new byte[r1]
                int r8 = r8 + 2
                r2 = 0
                if (r0 != 0) goto L1a
                r6 = r8
                r3 = r0
                r4 = r2
                r0 = r7
                goto L32
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                int r7 = r7 + 1
                r3 = r0[r7]
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r5
            L32:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + 3
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.ChallengeStatusReceiver.getSDKAppID.b(byte, byte, byte, java.lang.Object[]):void");
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
        private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r0 = 1 - r8
                int r6 = r6 * 2
                int r6 = r6 + 107
                byte[] r1 = atd.l.ChallengeStatusReceiver.getSDKAppID.$$d
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L17
                r3 = r1
                r4 = r2
                r1 = r7
                goto L30
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                int r7 = r7 + 1
                r0[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r1
                r1 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = r6 + r7
                r7 = r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.ChallengeStatusReceiver.getSDKAppID.c(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKTransactionID(int r39, int r40) {
            /*
                Method dump skipped, instruction units count: 2084
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.ChallengeStatusReceiver.getSDKAppID.getSDKTransactionID(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{85, -48, -99, -78, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10, -2, 24};
            $$b = 19;
        }

        static void init$1() {
            $$d = new byte[]{75, 34, 0, 64};
            $$e = 37;
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        Color.green(0);
        new getSDKAppID((byte) 0);
        int i11 = getSDKAppID + 101;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
    }

    public ChallengeStatusReceiver(Application application) {
        s.k(application, "");
        this.getDeviceData = application;
    }

    private String AuthenticationRequestParameters() throws Throwable {
        Application application = this.getDeviceData;
        atd.al.AuthenticationRequestParameters sDKAppID = atd.al.AuthenticationRequestParameters.getSDKAppID();
        s.j(sDKAppID, "");
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(new atd.a.getSDKTransactionID(application, sDKAppID).getSDKAppID());
        int i11 = getSDKAppID + 33;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 62 / 0;
        }
        return strM50constructorimpl;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = 5833057764789733488L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getSDKTransactionID = (getSDKAppID + 97) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        int i11 = getSDKTransactionID + 111;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 27 / 0;
        }
        return stringValueM49boximpl;
    }
}
