package atd.json;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultTimeout;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/adyen/threeds2/internal/util/AlreadyDestroyedException;", "Ljava/lang/Exception;", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char getDeviceData;
    private static long getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = -4201337076207898698L;
        AuthenticationRequestParameters = 1458778038;
        getDeviceData = (char) 54263;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKTransactionID() throws Throwable {
        Object[] objArr = new Object[1];
        a("꩑ሯ㷁햗", "\u0000\u0000\u0000\u0000", (char) View.resolveSizeAndState(0, 0, 0), "㳊骡᠁쇢뜕㸇썌⛘湆Ḝ灴㍥务婌ꁶﬅ㧉蛂釿\u09c9볫\uda5d具틹痻惻瓸䜗㹾㈾抪캕裏䙾\ue60d", (-1055772759) - TextUtils.lastIndexOf("", '0'), objArr);
        super(((String) objArr[0]).intern());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        int i12;
        Object charArray;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        int i13 = $11 + 101;
        int i14 = i13 % 128;
        $10 = i14;
        int i15 = 2;
        int i16 = 0;
        if (i13 % 2 != 0) {
            int i17 = 39 / 0;
            if (str3 != null) {
                i12 = i14 + 59;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    charArray = str3.toCharArray();
                    int i18 = 21 / 0;
                } else {
                    charArray = str3.toCharArray();
                }
            } else {
                charArray = str3;
            }
        } else if (str3 != null) {
            i12 = i14 + 59;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                charArray = str3.toCharArray();
                int i19 = 21 / 0;
            } else {
                charArray = str3.toCharArray();
            }
        } else {
            charArray = str3;
        }
        char[] cArr = (char[]) charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = charArray2.length;
        char[] cArr3 = new char[length2];
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(charArray2, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c11);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $11 = ($10 + 121) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object method = map.get(num2);
                int i21 = i15;
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(1861 - ImageFormat.getBitsPerPixel(i16), (char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(224 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i22 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i21] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[1] = Integer.valueOf(i22);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 2446, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 + 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i23 = cArr2[iIntValue2] * 32718;
                char c12 = cArr3[iIntValue];
                Object[] objArr7 = new Object[i21];
                objArr7[1] = Integer.valueOf(c12);
                objArr7[0] = Integer.valueOf(i23);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID(2968 - ImageFormat.getBitsPerPixel(0), (char) (9912 - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionGroup(0L) + 37)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr2[iIntValue2] = c13;
                int i24 = challengeResultTimeout.getSDKTransactionID;
                cArr4[i24] = (char) (((((long) (c13 ^ cArr[i24])) ^ (getSDKReferenceNumber ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getDeviceData) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i24 + 1;
                cArr2 = cArr2;
                i15 = i21;
                length3 = length3;
                num = num;
                num2 = num2;
                i16 = 0;
                cArr = cArr;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.json.getSDKTransactionID.$$a
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = r9 + 102
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            r3 = r9
            if (r0 != 0) goto L17
            r5 = r2
            r9 = r8
            goto L2e
        L17:
            r9 = r8
            r8 = r3
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r8 = r8 + 1
            int r9 = r9 + r3
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.getSDKTransactionID.b(int, int, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{86, -79, -114, -51};
        $$b = 48;
    }
}
