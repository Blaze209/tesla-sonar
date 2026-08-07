package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultCompleted;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.adyen.threeds2.internal.deviceinfo.parameter.AuthenticationRequestParameters, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionRequestedChecker;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "checkPermission", "", "permission", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionRequestedChecker implements PermissionChecker {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int AuthenticationRequestParameters;
    private static int[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private final Application getSDKTransactionID;

    static {
        init$0();
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKAppID = new int[]{227163840, 2111312584, 1083026933, 560743797, 882093595, 1773831576, -2030103385, 1324033394, -1544142358, -2021851407, 1851694836, 798609152, 1554927997, -860663103, 92804803, 1929053629, -177649675, -505107600};
    }

    public PermissionRequestedChecker(Application application) {
        s.k(application, "");
        this.getSDKTransactionID = application;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return AuthenticationRequestParameters(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = 120 - r8
            byte[] r1 = com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r6
            goto L30
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L30:
            int r7 = -r7
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.a(int, int, byte, java.lang.Object[]):void");
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        Object method2;
        Integer num = 1109131256;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i13 = 2;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i14 = 0;
            i12 = 16;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(1862 - Color.red(0), (char) (KeyEvent.getMaxKeyCode() >> 16), Process.getGidForName("") + 22);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        a(b11, b12, (byte) (b12 + 3), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i14++;
                    length = length;
                    iArr3 = iArr3;
                    cArr = cArr;
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
        } else {
            i12 = 16;
        }
        char[] cArr3 = cArr;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getSDKAppID;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i15 = 0;
            while (i15 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                Map map2 = getMessageVersion.timedout;
                Object obj2 = map2.get(2050190164);
                if (obj2 != null) {
                    method = obj2;
                } else {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1861 - TextUtils.lastIndexOf("", '0'), (char) Color.green(0), TextUtils.indexOf("", "") + 21);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    a(b13, b14, (byte) (b14 + 3), objArr5);
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
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i16 = challengeResultCompleted.getDeviceData;
            if (i16 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i17 = iArr[i16];
            char c12 = (char) (i17 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i17;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i16 + 1] >> 16);
            cArr3[i13] = c14;
            char c15 = (char) iArr[i16 + 1];
            char c16 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i18 = 0;
            while (i18 < i12) {
                int i19 = challengeResultCompleted.getSDKAppID ^ iArr4[i18];
                challengeResultCompleted.getSDKAppID = i19;
                int sDKAppID = ChallengeResultCompleted.getSDKAppID(i19);
                Object[] objArr6 = new Object[4];
                objArr6[c16] = challengeResultCompleted;
                objArr6[i13] = challengeResultCompleted;
                objArr6[1] = Integer.valueOf(sDKAppID);
                objArr6[0] = challengeResultCompleted;
                Map map3 = getMessageVersion.timedout;
                Object method3 = map3.get(929629307);
                if (method3 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 1299, (char) (CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 - KeyEvent.keyCodeFromString("")), 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    a(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                    map3.put(929629307, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i18++;
                c16 = c16;
                i12 = 16;
            }
            char c17 = c16;
            int i21 = challengeResultCompleted.getSDKAppID;
            int i22 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i22;
            challengeResultCompleted.getSDKReferenceNumber = i21;
            i12 = 16;
            int i23 = i21 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i23;
            int i24 = i22 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i24;
            cArr3[0] = (char) (i24 >>> 16);
            cArr3[1] = (char) i24;
            cArr3[i13] = (char) (i23 >>> 16);
            cArr3[c17] = (char) i23;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i25 = challengeResultCompleted.getDeviceData;
            cArr4[i25 * 2] = cArr3[0];
            cArr4[(i25 * 2) + 1] = cArr3[1];
            cArr4[(i25 * 2) + 2] = cArr3[i13];
            cArr4[(i25 * 2) + 3] = cArr3[c17];
            Object[] objArr8 = new Object[i13];
            objArr8[1] = challengeResultCompleted;
            objArr8[0] = challengeResultCompleted;
            Map map4 = getMessageVersion.timedout;
            Integer num3 = num2;
            Object method4 = map4.get(num3);
            if (method4 == null) {
                Class cls5 = (Class) getMessageVersion.getSDKTransactionID(2061 - Drawable.resolveOpacity(0, 0), (char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0') + 18);
                byte b17 = (byte) 0;
                byte b18 = b17;
                Object[] objArr9 = new Object[1];
                a(b17, b18, (byte) (b18 + 1), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(num3, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            num2 = num3;
            c11 = 0;
            i13 = 2;
        }
    }

    static void init$0() {
        $$a = new byte[]{81, 33, -107, -119};
        $$b = 65;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker
    public final boolean getSDKAppID(String str) {
        return ((Boolean) AuthenticationRequestParameters(new Object[]{this, str}, -39869188, 39869188, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01aa  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c7, code lost:
    
        if (r7.length() == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ce, code lost:
    
        if (r7.length() == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d1, code lost:
    
        r14 = com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.AuthenticationRequestParameters;
        r0 = ((r14 & 23) + (r14 | 23)) % 128;
        com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.getSDKReferenceNumber = r0;
        r0 = r0 + 61;
        com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.AuthenticationRequestParameters = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e3, code lost:
    
        if ((r0 % 2) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ea, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.AuthenticationRequestParameters(java.lang.Object[]):java.lang.Object");
    }
}
