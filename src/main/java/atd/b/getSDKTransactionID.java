package atd.b;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeResultError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSDKTransactionID extends getSDKReferenceNumber<String> {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKAppID = new char[]{30827, 30873, 30875, 30877, 30901, 30907, 30882, 30882, 30906, 30904, 30886, 30882, 30885, 30884, 30880, 30886, 30888, 30889};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKTransactionID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{0, 18, 50, 18}, true, objArr);
        super(((String) objArr[0]).intern(), str);
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        Class<Object> cls;
        int length;
        char[] cArr;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Object bytes = str2;
        if (str2 != null) {
            $11 = ($10 + 51) % 128;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr2 = getSDKAppID;
        Class cls3 = Integer.TYPE;
        int i17 = 2;
        if (cArr2 != null) {
            int i18 = $11 + 79;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i19 = 0;
            while (i12 < length) {
                try {
                    byte[] bArr2 = bArr;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    int i21 = i12;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.red(i19) + 2313, (char) ((Process.getThreadPriority(i19) + 20) >> 6), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24);
                        int i22 = i19;
                        byte b11 = (byte) i22;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 2), objArr3);
                        method = cls4.getMethod((String) objArr3[i22], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12 = i21 + 1;
                    bArr = bArr2;
                    length = length;
                    cArr2 = cArr2;
                    cArr = cArr;
                    i15 = i15;
                    i16 = i16;
                    cls2 = cls2;
                    i19 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i23 = i15;
        int i24 = i16;
        char[] cArr3 = new char[i14];
        System.arraycopy(cArr2, i13, cArr3, 0, i14);
        if (bArr3 != null) {
            char[] cArr4 = new char[i14];
            challengeResultError.getSDKAppID = 0;
            $10 = ($11 + 123) % 128;
            char c11 = 0;
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i14) {
                    break;
                }
                if (bArr3[i25] == 1) {
                    $10 = ($11 + 89) % 128;
                    char c12 = cArr3[i25];
                    Object[] objArr4 = new Object[i17];
                    objArr4[1] = Integer.valueOf(c11);
                    objArr4[0] = Integer.valueOf(c12);
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 559, (char) (Color.red(0) + 5486), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 + 3), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr4[i25] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr3 = cArr3;
                    Object[] objArr6 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 200, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23 - ImageFormat.getBitsPerPixel(0))).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr4[i25] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    String str3 = (String) objArr8[0];
                    cls = cls5;
                    method4 = cls7.getMethod(str3, cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr3 = cArr3;
                i17 = 2;
            }
            cArr3 = cArr4;
        }
        if (i24 > 0) {
            $10 = ($11 + 65) % 128;
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i14);
            int i26 = i14 - i24;
            System.arraycopy(cArr5, 0, cArr3, i26, i24);
            System.arraycopy(cArr5, i24, cArr3, 0, i26);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            $11 = ($10 + 57) % 128;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i14) {
                    break;
                }
                cArr6[i27] = cArr3[(i14 - i27) - 1];
                challengeResultError.getSDKAppID = i27 + 1;
            }
            cArr3 = cArr6;
        }
        if (i23 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i28 = challengeResultError.getSDKAppID;
                if (i28 >= i14) {
                    break;
                }
                cArr3[i28] = (char) (cArr3[i28] - iArr[2]);
                challengeResultError.getSDKAppID = i28 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 104 - r8
            byte[] r0 = atd.b.getSDKTransactionID.$$g
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = -r8
            int r8 = r8 + r0
            int r7 = r7 + 1
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKTransactionID.b(byte, short, int, java.lang.Object[]):void");
    }

    private static boolean getSDKAppID(String str) {
        int i11 = AuthenticationRequestParameters + 3;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        getSDKReferenceNumber = (AuthenticationRequestParameters + 73) % 128;
        return true;
    }

    static void init$0() {
        $$g = new byte[]{114, -98, 117, -42};
        $$h = 125;
    }

    @Override // atd.b.getSDKReferenceNumber
    final /* synthetic */ boolean getSDKReferenceNumber(String str) {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 105) % 128;
        boolean sDKAppID = getSDKAppID(str);
        int i11 = AuthenticationRequestParameters + 21;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return sDKAppID;
        }
        throw null;
    }
}
