package atd.an;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeResultKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static byte[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static short[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKTransactionID = 1812394019;
        AuthenticationRequestParameters = -1568970095;
        getSDKAppID = 1121817085;
        getDeviceData = new byte[]{75, -26, 17, -2, -17, -65, 69, 15, 5, -23, -68, 69, -1, 17, -1, -11, 5, -7, -8, 10, -77, 66, 1, 9, -7, 0, 8, -5, 7, -85, 76, -13, -65, 79, 5, -86, 80, -13, 0, -4, 15, -8, -37, 28, 0, -39, -36, 69, 17, -13, 11, -19, 4, -4, 9, -80, 65, -65, 82, -4, -13, 17, -10, 1, -14, -67, 82, -5, -1, -2, -2, -13, -32, -2};
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c4  */
    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        long j11;
        int i14;
        int i15;
        int i16;
        float f11;
        Object method;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i17 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(AuthenticationRequestParameters)};
            int i18 = 0;
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 == null) {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2105 - Color.green(0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21995), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32);
                byte b12 = (byte) 0;
                byte b13 = b12;
                Object[] objArr3 = new Object[1];
                b(b12, b13, (byte) (b13 + 1), objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            boolean z11 = iIntValue == -1;
            if (z11) {
                byte[] bArr = getDeviceData;
                if (bArr != null) {
                    int length = bArr.length;
                    j11 = -671853308956415234L;
                    byte[] bArr2 = new byte[length];
                    int i19 = 0;
                    while (i19 < length) {
                        int i21 = i17;
                        Object[] objArr4 = {Integer.valueOf(bArr[i19])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2937 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(i18, i18), (Process.myTid() >> 22) + 33)).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i19] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i19++;
                        bArr = bArr;
                        i17 = i21;
                        i18 = i18;
                    }
                    i15 = i17;
                    i16 = i18;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                    $10 = ($11 + 53) % 128;
                    bArr = bArr2;
                } else {
                    i15 = 1;
                    i16 = 0;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                    j11 = -671853308956415234L;
                }
                if (bArr != null) {
                    byte[] bArr3 = getDeviceData;
                    Object[] objArr5 = new Object[2];
                    objArr5[i15] = Integer.valueOf(getSDKTransactionID);
                    objArr5[i16] = Integer.valueOf(i13);
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        float f12 = f11;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2105 - View.MeasureSpec.getSize(i16), (char) ((TypedValue.complexToFraction(i16, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(i16, f12, f12) == f12 ? 0 : -1)) + 21995), 30 - TextUtils.lastIndexOf("", '0'));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr6 = new Object[i15];
                        b(b14, b15, (byte) (b15 + 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) AuthenticationRequestParameters) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) getSDKReferenceNumber[i13 + ((int) (((long) getSDKTransactionID) ^ j11))]) ^ j11)) + ((int) (((long) AuthenticationRequestParameters) ^ j11)));
                }
            } else {
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                int i22 = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKTransactionID) ^ j11));
                if (z11) {
                    int i23 = $10 + 11;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        i14 = 0;
                    } else {
                        i14 = 1;
                    }
                } else {
                    i14 = 0;
                }
                challengeResultKt.getDeviceData = i22 + i14;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKAppID), sb2};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2137 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 28);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = getDeviceData;
                if (bArr4 != null) {
                    $11 = ($10 + 107) % 128;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i24 = 0;
                    while (i24 < length2) {
                        int i25 = $11 + 105;
                        $10 = i25 % 128;
                        if (i25 % 2 != 0) {
                            bArr5[i24] = (byte) (((long) bArr4[i24]) - j11);
                        } else {
                            bArr5[i24] = (byte) (((long) bArr4[i24]) ^ j11);
                            i24++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z12 = bArr4 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    int i26 = $10 + 7;
                    $11 = i26 % 128;
                    if (i26 % 2 == 0) {
                        int i27 = 66 / 0;
                        if (z12) {
                            byte[] bArr6 = getDeviceData;
                            int i28 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i28 - 1;
                            challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i28]) ^ j11)) + s11)) ^ b11));
                        } else {
                            short[] sArr = getSDKReferenceNumber;
                            int i29 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i29 - 1;
                            challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i29]) ^ j11)) + s11)) ^ b11));
                        }
                    } else if (z12) {
                        byte[] bArr7 = getDeviceData;
                        int i210 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i210 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr7[i210]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr2 = getSDKReferenceNumber;
                        int i211 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i211 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr2[i211]) ^ j11)) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
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
    private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = atd.an.getSDKTransactionID.$$a
            int r8 = r8 * 7
            int r8 = 121 - r8
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            r3 = r8
            if (r0 != 0) goto L17
            r5 = r2
            r8 = r7
            goto L2b
        L17:
            r8 = r7
            r7 = r3
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
        L2b:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.getSDKTransactionID.b(short, byte, byte, java.lang.Object[]):void");
    }

    public static BigInteger getSDKAppID(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        ChallengeResultCancelled = (getMessageVersion + 99) % 128;
        return bigInteger;
    }

    public static byte[] getSDKTransactionID(BigInteger bigInteger) throws Throwable {
        if (bigInteger.signum() < 0) {
            Object[] objArr = new Object[1];
            a((-37) - TextUtils.getOffsetAfter("", 0), 525927745 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (ViewConfiguration.getTapTimeout() >> 16), 830629156 + ((byte) KeyEvent.getModifierMetaStateMask()), (byte) TextUtils.getCapsMode("", 0, 0), objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 == 0 && byteArray[0] == 0) {
            int i11 = ChallengeResultCancelled;
            int i12 = i11 + 37;
            getMessageVersion = i12 % 128;
            if (i12 % 2 != 0 ? byteArray.length > 1 : byteArray.length > 0) {
                getMessageVersion = (i11 + 81) % 128;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(byteArray, 1, byteArray.length);
                getMessageVersion = (ChallengeResultCancelled + 123) % 128;
                return bArrCopyOfRange;
            }
        }
        return byteArray;
    }

    static void init$0() {
        $$a = new byte[]{87, 105, -57, -104};
        $$b = 113;
    }
}
