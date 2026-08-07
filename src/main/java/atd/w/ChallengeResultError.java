package atd.w;

import android.app.Application;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/ManufacturerCode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultError extends InitializeResultSuccess {
    private static char AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static char getSDKAppID;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/ManufacturerCode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long getDeviceData;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKReferenceNumber = 1;
            getDeviceData = 7219623067705426621L;
        }

        private getSDKTransactionID() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(int r36, int r37) {
            /*
                Method dump skipped, instruction units count: 2017
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResultError.getSDKTransactionID.AuthenticationRequestParameters(int, int):java.lang.Object[]");
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            $10 = ($11 + 5) % 128;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
            char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getDeviceData ^ 4326518537449951405L, charArray, i11);
            getadditionaldetails.getDeviceData = 4;
            $11 = ($10 + 45) % 128;
            while (true) {
                int i12 = getadditionaldetails.getDeviceData;
                if (i12 >= deviceData.length) {
                    objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                    return;
                }
                int i13 = i12 - 4;
                getadditionaldetails.getSDKTransactionID = i13;
                try {
                    Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getDeviceData)};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1024136788);
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(2749 - TextUtils.indexOf("", ""), (char) (54838 - View.MeasureSpec.getMode(0)), 29 - ExpandableListView.getPackedPositionGroup(0L));
                        Class cls2 = Long.TYPE;
                        method = cls.getMethod("c", cls2, cls2, cls2);
                        map.put(-1024136788, method);
                    }
                    deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                    Object method2 = map.get(-719904898);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + 1401, (char) (16689 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 22);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr4 = new Object[1];
                        c(b11, b12, (byte) (b12 + 1), objArr4);
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

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(int r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                byte[] r0 = atd.w.ChallengeResultError.getSDKTransactionID.$$a
                int r8 = r8 * 18
                int r8 = r8 + 3
                int r6 = r6 * 2
                int r6 = 105 - r6
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r0
                r4 = r2
                r0 = r7
                goto L32
            L15:
                r3 = r7
                r7 = r6
                r6 = r3
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r6 = r6 + 1
                int r3 = r3 + 1
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L32:
                int r0 = r0 + r6
                int r6 = r0 + 3
                r0 = r7
                r7 = r6
                r6 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResultError.getSDKTransactionID.b(int, byte, short, java.lang.Object[]):void");
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
        private static void c(byte r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 101
                int r5 = r5 * 3
                int r0 = 1 - r5
                byte[] r1 = atd.w.ChallengeResultError.getSDKTransactionID.$$d
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                int r5 = 0 - r5
                if (r1 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2a:
                int r7 = r7 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResultError.getSDKTransactionID.c(byte, short, short, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{82, 111, -78, -28, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10, 2, -24};
            $$b = 75;
        }

        static void init$1() {
            $$d = new byte[]{114, -98, 117, -42};
            $$e = 98;
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        AndroidCharacter.getMirror('0');
        new getSDKTransactionID((byte) 0);
        getMessageVersion = (getDeviceData + 81) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeResultError(Application application) {
        super(application);
        s.k(application, "");
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = (char) 24686;
        getSDKTransactionID = (char) 56918;
        getSDKReferenceNumber = (char) 7385;
        AuthenticationRequestParameters = (char) 17954;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        String manufacturerCode;
        if (Build.VERSION.SDK_INT < 29) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null || (manufacturerCode = telephonyManagerCF_.getManufacturerCode()) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = getMessageVersion + 101;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(manufacturerCode);
        if (i12 != 0) {
            DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
            throw null;
        }
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
        int i13 = getMessageVersion + 121;
        getDeviceData = i13 % 128;
        if (i13 % 2 == 0) {
            return stringValueM49boximpl;
        }
        throw null;
    }
}
