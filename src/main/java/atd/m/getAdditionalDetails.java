package atd.m;

import android.os.Build;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Radio;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAdditionalDetails extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static char[] getDeviceData;
    private static char getSDKAppID;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Radio$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKReferenceNumber;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKReferenceNumber = 0;
            getDeviceData = 1;
            AuthenticationRequestParameters = 4075292946268858305L;
        }

        private getSDKReferenceNumber() {
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12 = $10;
            int i13 = i12 + 33;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                int i14 = i12 + 103;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    charArray = str.toCharArray();
                    int i15 = 93 / 0;
                } else {
                    charArray = str.toCharArray();
                }
            } else {
                charArray = str;
            }
            atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
            char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(AuthenticationRequestParameters ^ 4326518537449951405L, charArray, i11);
            getadditionaldetails.getDeviceData = 4;
            while (true) {
                int i16 = getadditionaldetails.getDeviceData;
                if (i16 >= deviceData.length) {
                    objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                    return;
                }
                int i17 = i16 - 4;
                getadditionaldetails.getSDKTransactionID = i17;
                try {
                    Object[] objArr2 = {Long.valueOf(deviceData[i16] ^ deviceData[i16 % 4]), Long.valueOf(i17), Long.valueOf(AuthenticationRequestParameters)};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1024136788);
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2748, (char) (ExpandableListView.getPackedPositionChild(0L) + 54839), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29);
                        Class cls2 = Long.TYPE;
                        method = cls.getMethod("c", cls2, cls2, cls2);
                        map.put(-1024136788, method);
                    }
                    deviceData[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                    Object method2 = map.get(-719904898);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1401 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (16690 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr4 = new Object[1];
                        c(b11, b12, b12, objArr4);
                        method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(-719904898, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 20
                int r7 = r7 + 4
                byte[] r0 = atd.m.getAdditionalDetails.getSDKReferenceNumber.$$a
                int r6 = r6 * 18
                int r1 = 21 - r6
                int r8 = r8 * 2
                int r8 = 105 - r8
                byte[] r1 = new byte[r1]
                int r6 = 20 - r6
                r2 = 0
                if (r0 != 0) goto L1a
                r8 = r7
                r3 = r0
                r4 = r2
                r0 = r6
                goto L32
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L32:
                int r0 = r0 + r7
                int r7 = r0 + 3
                int r8 = r8 + 1
                r0 = r8
                r8 = r7
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getAdditionalDetails.getSDKReferenceNumber.b(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.m.getAdditionalDetails.getSDKReferenceNumber.$$d
                int r6 = r6 * 2
                int r1 = 1 - r6
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r7 = r7 * 2
                int r7 = r7 + 101
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                r3 = -1
                if (r0 != 0) goto L1a
                r4 = r3
                r3 = r0
                r0 = r8
                goto L34
            L1a:
                r5 = r8
                r8 = r7
                r7 = r5
            L1d:
                int r3 = r3 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2c:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L34:
                int r8 = r8 + 1
                int r7 = -r7
                int r7 = r7 + r0
                r0 = r8
                r8 = r7
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getAdditionalDetails.getSDKReferenceNumber.c(byte, int, short, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(int r39, int r40) {
            /*
                Method dump skipped, instruction units count: 2137
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getAdditionalDetails.getSDKReferenceNumber.getSDKAppID(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{101, 29, 75, 23, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10, 2, -24};
            $$b = 140;
        }

        static void init$1() {
            $$d = new byte[]{86, -79, -114, -51};
            $$e = 105;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        SystemClock.currentThreadTimeMillis();
        ViewConfiguration.getFadingEdgeLength();
        new getSDKReferenceNumber((byte) 0);
        AuthenticationRequestParameters = (getSDKTransactionID + 85) % 128;
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{52462, 52460, 52459, 52383};
        getSDKAppID = (char) 63814;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        String radioVersion = Build.getRadioVersion();
        if (radioVersion == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getSDKTransactionID = (AuthenticationRequestParameters + 5) % 128;
            return failure;
        }
        int i11 = getSDKTransactionID + 17;
        AuthenticationRequestParameters = i11 % 128;
        int i12 = i11 % 2;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(radioVersion));
        if (i12 == 0) {
            int i13 = 60 / 0;
        }
        return stringValueM49boximpl;
    }
}
