package atd.b;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeResultCompleted;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public final class getMessageVersion extends getSDKReferenceNumber<String> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int getSDKAppID;
    private static int[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        getSDKReferenceNumber = new int[]{-1797247923, -1700988380, 461366186, 1259663370, 1234644455, -977111920, -323178449, 1584752991, 1506264012, 1427459201, 673073297, 1637451051, -1624798562, -712401060, -956646425, 1758739792, 639825785, -867108129};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getMessageVersion() throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{345680992, -675172530, 599427818, -1086850815, 1036059952, 2086054342, -506022817, -2026134470}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr);
        super(((String) objArr[0]).intern(), atd.i.AuthenticationRequestParameters.Y.name());
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        Object method;
        Object method2;
        Integer num = 1109131256;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i12 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i13 = 0;
            while (i13 < length) {
                $11 = ($10 + 65) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 21);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 1), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i13] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i13++;
                    cArr = cArr;
                    iArr3 = iArr3;
                    iArr2 = iArr2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        char[] cArr3 = cArr;
        int i14 = 16;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getSDKReferenceNumber;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i15 = 0;
            while (i15 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object obj2 = map2.get(2050190164);
                if (obj2 != null) {
                    method = obj2;
                } else {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - TextUtils.getOffsetBefore("", 0), (char) Drawable.resolveOpacity(0, 0), TextUtils.getOffsetBefore("", 0) + 21);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2050190164, method);
                }
                iArr6[i15] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i15++;
                length3 = length3;
                iArr5 = iArr5;
                iArr6 = iArr6;
                cArr2 = cArr2;
                num = num;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        $11 = ($10 + 103) % 128;
        while (true) {
            int i16 = challengeResultCompleted.getDeviceData;
            if (i16 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i17 = iArr[i16];
            char c11 = (char) (i17 >> 16);
            cArr3[0] = c11;
            char c12 = (char) i17;
            cArr3[1] = c12;
            char c13 = (char) (iArr[i16 + 1] >> 16);
            cArr3[i12] = c13;
            char c14 = (char) iArr[i16 + 1];
            char c15 = 3;
            cArr3[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i18 = 0;
            while (i18 < i14) {
                int i19 = $11 + 19;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    int i21 = challengeResultCompleted.getSDKAppID ^ iArr4[i18];
                    challengeResultCompleted.getSDKAppID = i21;
                    int sDKAppID = ChallengeResultCompleted.getSDKAppID(i21);
                    Object[] objArr6 = new Object[4];
                    objArr6[c15] = challengeResultCompleted;
                    objArr6[i12] = challengeResultCompleted;
                    objArr6[1] = Integer.valueOf(sDKAppID);
                    objArr6[0] = challengeResultCompleted;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(929629307);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 1299, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 32 - TextUtils.lastIndexOf("", '0', 0));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 4), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                        map3.put(929629307, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                    challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                    i18 += 71;
                } else {
                    c15 = c15;
                    int i22 = challengeResultCompleted.getSDKAppID ^ iArr4[i18];
                    challengeResultCompleted.getSDKAppID = i22;
                    int sDKAppID2 = ChallengeResultCompleted.getSDKAppID(i22);
                    Object[] objArr8 = new Object[4];
                    objArr8[c15] = challengeResultCompleted;
                    objArr8[i12] = challengeResultCompleted;
                    objArr8[1] = Integer.valueOf(sDKAppID2);
                    objArr8[0] = challengeResultCompleted;
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(929629307);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(0) + 20) >> 6) + 1299, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 33 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b17 = (byte) 0;
                        byte b18 = (byte) (b17 + 3);
                        Object[] objArr9 = new Object[1];
                        b(b17, b18, (byte) (b18 - 4), objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                        map4.put(929629307, method4);
                    }
                    int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                    challengeResultCompleted.getSDKReferenceNumber = iIntValue2;
                    i18++;
                }
                c15 = c15;
                i14 = 16;
            }
            char c16 = c15;
            int i23 = challengeResultCompleted.getSDKAppID;
            int i24 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i24;
            challengeResultCompleted.getSDKReferenceNumber = i23;
            int i25 = i23 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i25;
            int i26 = i24 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i26;
            cArr3[0] = (char) (i26 >>> 16);
            cArr3[1] = (char) i26;
            cArr3[i12] = (char) (i25 >>> 16);
            cArr3[c16] = (char) i25;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i27 = challengeResultCompleted.getDeviceData;
            cArr4[i27 * 2] = cArr3[0];
            cArr4[(i27 * 2) + 1] = cArr3[1];
            cArr4[(i27 * 2) + 2] = cArr3[i12];
            cArr4[(i27 * 2) + 3] = cArr3[c16];
            Object[] objArr10 = new Object[i12];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object method5 = map5.get(num3);
            if (method5 != null) {
                i14 = 16;
            } else {
                i14 = 16;
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), 17 - (ViewConfiguration.getEdgeSlop() >> 16));
                byte b19 = (byte) 0;
                byte b21 = (byte) (b19 + 2);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 3), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(num3, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            num2 = num3;
            i12 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 117
            byte[] r0 = atd.b.getMessageVersion.$$d
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getMessageVersion.b(byte, byte, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$d = new byte[]{40, -122, 91, -69};
        $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
    }

    @Override // atd.b.getSDKReferenceNumber
    final /* synthetic */ boolean getSDKReferenceNumber(String str) {
        int i11 = getSDKTransactionID + 95;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        boolean sDKReferenceNumber2 = getSDKReferenceNumber2(str);
        if (i12 == 0) {
            int i13 = 49 / 0;
        }
        int i14 = getSDKAppID + 49;
        getSDKTransactionID = i14 % 128;
        if (i14 % 2 == 0) {
            return sDKReferenceNumber2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: getSDKReferenceNumber, reason: avoid collision after fix types in other method */
    private static boolean getSDKReferenceNumber2(String str) {
        int i11 = getSDKAppID + 37;
        getSDKTransactionID = i11 % 128;
        int i12 = i11 % 2;
        atd.i.AuthenticationRequestParameters sDKAppID = atd.i.AuthenticationRequestParameters.getSDKAppID(str);
        if (i12 != 0) {
            int i13 = 59 / 0;
            if (sDKAppID != null) {
                return true;
            }
        } else if (sDKAppID != null) {
            return true;
        }
        int i14 = getSDKAppID + 5;
        getSDKTransactionID = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 62 / 0;
        }
        return false;
    }
}
