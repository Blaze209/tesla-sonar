package atd.u;

import android.graphics.Color;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/statfs/GetTotalBytes;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "getDeviceParameterResult-9LCWfJs", "()J", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static long getDeviceData = 0;
    private static int getSDKTransactionID = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/statfs/GetTotalBytes$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getSDKAppID;
        private static long getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            AuthenticationRequestParameters = 1;
            getSDKTransactionID = 1418331030592562576L;
        }

        private getSDKTransactionID() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 + 4
                byte[] r0 = atd.u.getSDKAppID.getSDKTransactionID.$$a
                int r7 = r7 * 6
                int r7 = r7 + 97
                int r6 = r6 * 17
                int r1 = 38 - r6
                byte[] r1 = new byte[r1]
                int r6 = 37 - r6
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r5 = r5 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r5]
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-8)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.u.getSDKAppID.getSDKTransactionID.a(int, int, int, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray = str != null ? str.toCharArray() : str;
            getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
            char[] deviceData = getAdditionalDetails.getDeviceData(getSDKTransactionID ^ 4326518537449951405L, charArray, i11);
            getadditionaldetails.getDeviceData = 4;
            while (true) {
                int i12 = getadditionaldetails.getDeviceData;
                if (i12 >= deviceData.length) {
                    break;
                }
                $11 = ($10 + 9) % 128;
                int i13 = i12 - 4;
                getadditionaldetails.getSDKTransactionID = i13;
                try {
                    Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKTransactionID)};
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(-1024136788);
                    if (method == null) {
                        Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2749, (char) (54837 - TextUtils.indexOf((CharSequence) "", '0')), 29 - (ViewConfiguration.getScrollBarSize() >> 8));
                        Class cls2 = Long.TYPE;
                        method = cls.getMethod("c", cls2, cls2, cls2);
                        map.put(-1024136788, method);
                    }
                    deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                    Object method2 = map.get(-719904898);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((-16775815) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 16690), 22 - Color.red(0));
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
            String str2 = new String(deviceData, 4, deviceData.length - 4);
            int i14 = $10 + 9;
            $11 = i14 % 128;
            if (i14 % 2 != 0) {
                objArr[0] = str2;
            } else {
                int i15 = 30 / 0;
                objArr[0] = str2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r8 = 101 - r8
                int r6 = r6 * 3
                int r0 = r6 + 1
                byte[] r1 = atd.u.getSDKAppID.getSDKTransactionID.$$d
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r1
                r4 = r2
                r1 = r8
                r8 = r7
                goto L32
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L32:
                int r7 = r7 + r1
                r1 = r8
                r8 = r7
                r7 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.u.getSDKAppID.getSDKTransactionID.c(byte, byte, short, java.lang.Object[]):void");
        }

        private static void getSDKReferenceNumber() throws Throwable {
            getSDKAppID = (AuthenticationRequestParameters + 47) % 128;
            byte[] bArr = $$a;
            byte b11 = bArr[36];
            byte b12 = (byte) (b11 - 1);
            byte b13 = b11;
            Object[] objArr = new Object[1];
            a(b12, b13, b13, objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            AuthenticationRequestParameters = (getSDKAppID + 79) % 128;
            try {
                byte b14 = bArr[36];
                byte b15 = (byte) (b14 - 1);
                byte b16 = b14;
                Object[] objArr2 = new Object[1];
                a(b15, b16, b16, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b17 = (byte) (bArr[18] - 1);
                Object[] objArr3 = new Object[1];
                a((byte) 36, b17, b17, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b("攢敃\uf8a4\ue5f7݇\u0dfd\u0fe9", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr5);
                AuthenticationRequestParameters = (getSDKAppID + 39) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{32, 120, 5, 50, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{59, 90, 71, -86};
            $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        TextUtils.indexOf("", "");
        new getSDKTransactionID((byte) 0);
        getSDKTransactionID = (AuthenticationRequestParameters + 89) % 128;
    }

    private static long AuthenticationRequestParameters() {
        long jM43constructorimpl = DeviceParameterResult.Success.LongValue.m43constructorimpl(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
        getSDKTransactionID = (AuthenticationRequestParameters + 85) % 128;
        return jM43constructorimpl;
    }

    static void getSDKTransactionID() {
        getDeviceData = -8113824088204103214L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        AuthenticationRequestParameters = (getSDKTransactionID + 43) % 128;
        DeviceParameterResult.Success.LongValue longValueM42boximpl = DeviceParameterResult.Success.LongValue.m42boximpl(AuthenticationRequestParameters());
        getSDKTransactionID = (AuthenticationRequestParameters + 123) % 128;
        return longValueM42boximpl;
    }
}
