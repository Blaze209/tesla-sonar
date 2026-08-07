package atd.ap;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultKt;
import com.adyen.threeds2.Warning;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/EmulatorDetectedWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    public static final getSDKTransactionID getDeviceData;
    private static int getSDKAppID;
    private static short[] getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        BuildConfig = 1;
        getSDKReferenceNumber();
        getDeviceData = new getSDKTransactionID();
        ChallengeResultCancelled = (BuildConfig + 7) % 128;
    }

    private getSDKTransactionID() {
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        long j11;
        Object method;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKAppID)};
            Map map = getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 == null) {
                Class cls2 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2105, (char) (21995 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30);
                byte b12 = (byte) 0;
                byte b13 = b12;
                Object[] objArr3 = new Object[1];
                b(b12, b13, b13, objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i16 = iIntValue == -1 ? 1 : 0;
            if (i16 != 0) {
                byte[] bArr = getSDKTransactionID;
                if (bArr != null) {
                    $10 = ($11 + 109) % 128;
                    int length = bArr.length;
                    j11 = -671853308956415234L;
                    byte[] bArr2 = new byte[length];
                    int i17 = 0;
                    while (i17 < length) {
                        int i18 = i15;
                        int i19 = $11 + 35;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            Object[] objArr4 = {Integer.valueOf(bArr[i17])};
                            Map map2 = getMessageVersion.timedout;
                            Object obj = map2.get(-844142059);
                            if (obj != null) {
                                method = obj;
                            } else {
                                method = ((Class) getMessageVersion.getSDKTransactionID(2937 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), View.MeasureSpec.getMode(0) + 33)).getMethod("s", cls);
                                map2.put(-844142059, method);
                            }
                            bArr2[i17] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                            i17 >>= 1;
                        } else {
                            bArr = bArr;
                            i16 = i16;
                            bArr2 = bArr2;
                            Object[] objArr5 = {Integer.valueOf(bArr[i17])};
                            Map map3 = getMessageVersion.timedout;
                            Object method3 = map3.get(-844142059);
                            if (method3 == null) {
                                method3 = ((Class) getMessageVersion.getSDKTransactionID(2936 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), 33 - TextUtils.indexOf("", ""))).getMethod("s", cls);
                                map3.put(-844142059, method3);
                            }
                            bArr2[i17] = ((Byte) ((Method) method3).invoke(null, objArr5)).byteValue();
                            i17++;
                        }
                        i15 = i18;
                        i16 = i16;
                        bArr = bArr;
                        bArr2 = bArr2;
                    }
                    bArr = bArr2;
                } else {
                    j11 = -671853308956415234L;
                }
                i14 = i16;
                int i21 = i15;
                if (bArr != null) {
                    byte[] bArr3 = getSDKTransactionID;
                    Object[] objArr6 = new Object[2];
                    objArr6[i21] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr6[0] = Integer.valueOf(i13);
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(557807898);
                    if (method4 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2105 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21994), ((byte) KeyEvent.getModifierMetaStateMask()) + 32);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[i21];
                        b(b14, b15, b15, objArr7);
                        method4 = cls3.getMethod((String) objArr7[0], cls, cls);
                        map4.put(557807898, method4);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr6)).intValue()]) ^ j11)) + ((int) (((long) getSDKAppID) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) getSDKEphemeralPublicKey[i13 + ((int) (((long) AuthenticationRequestParameters) ^ j11))]) ^ j11)) + ((int) (((long) getSDKAppID) ^ j11)));
                    $10 = ($11 + 109) % 128;
                }
            } else {
                i14 = i16;
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) AuthenticationRequestParameters) ^ j11)) + i14;
                Object[] objArr8 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKReferenceNumber), sb2};
                Map map5 = getMessageVersion.timedout;
                Object method5 = map5.get(-1793105104);
                if (method5 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2135 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.indexOf("", "", 0), 27 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 1);
                    Object[] objArr9 = new Object[1];
                    b(b16, b17, (byte) (b17 - 1), objArr9);
                    method5 = cls4.getMethod((String) objArr9[0], Object.class, cls, cls, Object.class);
                    map5.put(-1793105104, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr8)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = getSDKTransactionID;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i22 = 0;
                    while (i22 < length2) {
                        bArr5[i22] = (byte) (((long) bArr4[i22]) ^ j11);
                        i22++;
                        $10 = ($11 + 67) % 128;
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    $10 = ($11 + 27) % 128;
                    if (z11) {
                        byte[] bArr6 = getSDKTransactionID;
                        int i23 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i23 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i23]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr = getSDKEphemeralPublicKey;
                        int i24 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i24 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i24]) ^ j11)) + s11)) ^ b11));
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

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 3 - r5
            int r6 = r6 * 7
            int r6 = r6 + 114
            byte[] r0 = atd.ap.getSDKTransactionID.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            int r5 = r5 + 1
            if (r3 != r7) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2a:
            r3 = r0[r5]
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ap.getSDKTransactionID.b(byte, short, int, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = 1094534632;
        getSDKAppID = -1568970058;
        getSDKReferenceNumber = -2092012977;
        getSDKTransactionID = new byte[]{66, 121, -93, 126, 31, -84, 18, 61, 51, -87, -17, -26, 70, -96, -21, 17, 64, -93, -23, 70, -82, -19, -32, -20, 71, -85, -21, 23, 22, 17, 80, -65, 24, 91, -68, 17, -23, 1, -25, -27, 26, 26, 87, -96, 63};
    }

    static void init$0() {
        $$a = new byte[]{93, -72, -53, -77};
        $$b = 71;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getID() throws Throwable {
        ChallengeResultCancelled = (BuildConfig + 75) % 128;
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) - 72, TextUtils.indexOf("", "") - 557121630, (short) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 481939691, (byte) ((-125) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        BuildConfig = (ChallengeResultCancelled + 79) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getMessage() throws Throwable {
        ChallengeResultCancelled = (BuildConfig + 113) % 128;
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 74, (-557121648) - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 481939694 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((-20) - TextUtils.getOffsetBefore("", 0)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        BuildConfig = (ChallengeResultCancelled + 29) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final Warning.Severity getSeverity() {
        int i11 = ChallengeResultCancelled + 65;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return Warning.Severity.HIGH;
        }
        int i12 = 13 / 0;
        return Warning.Severity.HIGH;
    }
}
