package atd.aq;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultError;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber implements LayoutInflater.Factory2 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static final String[] getSDKAppID;
    private static char[] getSDKTransactionID;
    private final getSDKTransactionID AuthenticationRequestParameters;
    private final Window getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        ChallengeResult = 1;
        getSDKTransactionID();
        Object[] objArr = new Object[1];
        a("\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{34, 13, 0, 12}, true, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{47, 15, 120, 0}, true, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{62, 15, 0, 0}, false, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{77, 12, 0, 7}, false, objArr4);
        getSDKAppID = new String[]{strIntern, strIntern2, strIntern3, ((String) objArr4[0]).intern()};
        getDeviceData = (ChallengeResult + 83) % 128;
    }

    public getSDKReferenceNumber(Window window, getSDKTransactionID getsdktransactionid) {
        this.getSDKReferenceNumber = window;
        this.AuthenticationRequestParameters = getsdktransactionid;
        getSDKTransactionID.getSDKTransactionID(new Object[]{getsdktransactionid, window}, 1131574936, -1131574924, System.identityHashCode(getsdktransactionid));
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Integer num = -399400818;
        $11 = ($10 + 13) % 128;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = getSDKTransactionID;
        Class cls3 = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            $10 = ($11 + 123) % 128;
            int i16 = 0;
            while (i16 < length) {
                try {
                    int i17 = i16;
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    char[] cArr3 = cArr2;
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ExpandableListView.getPackedPositionType(0L), Process.getGidForName("") + 25);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr3[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16 = i17 + 1;
                    cArr2 = cArr3;
                    i14 = i14;
                    length = length;
                    i15 = i15;
                    cArr = cArr;
                    cls2 = cls2;
                    num = num;
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
        Class<Object> cls5 = cls2;
        Integer num2 = num;
        int i18 = i14;
        int i19 = i15;
        char[] cArr4 = new char[i13];
        System.arraycopy(cArr, i12, cArr4, 0, i13);
        if (bArr != 0) {
            char[] cArr5 = new char[i13];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i21 = challengeResultError.getSDKAppID;
                if (i21 >= i13) {
                    break;
                }
                if (bArr[i21] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr4[i21]), Integer.valueOf(c11)};
                    Map map2 = getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) getMessageVersion.getSDKTransactionID(558 - ExpandableListView.getPackedPositionGroup(0L), (char) (5486 - View.MeasureSpec.makeMeasureSpec(0, 0)), 23 - View.combineMeasuredStates(0, 0));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i21] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i21]), Integer.valueOf(c11)};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) getMessageVersion.getSDKTransactionID(202 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-16777192) - Color.rgb(0, 0, 0))).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr5[i21] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = getMessageVersion.timedout;
                Integer num3 = num2;
                Object method4 = map4.get(num3);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.indexOf("", "", 0), Gravity.getAbsoluteGravity(0, 0) + 24);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 3), objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(num3, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                num2 = num3;
                cls5 = cls;
                cArr4 = cArr4;
                cArr5 = cArr5;
            }
            cArr4 = cArr5;
        }
        if (i19 > 0) {
            char[] cArr6 = new char[i13];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i13);
            int i22 = i13 - i19;
            System.arraycopy(cArr6, 0, cArr4, i22, i19);
            System.arraycopy(cArr6, i19, cArr4, 0, i22);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr7 = new char[i13];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i13) {
                    break;
                }
                $10 = ($11 + 65) % 128;
                cArr7[i23] = cArr4[(i13 - i23) - 1];
                challengeResultError.getSDKAppID = i23 + 1;
            }
            cArr4 = cArr7;
        }
        if (i18 > 0) {
            $10 = ($11 + 17) % 128;
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i24 = challengeResultError.getSDKAppID;
                if (i24 >= i13) {
                    break;
                }
                cArr4[i24] = (char) (cArr4[i24] - iArr[2]);
                challengeResultError.getSDKAppID = i24 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            int r7 = r7 * 2
            int r7 = r7 + 98
            byte[] r1 = atd.aq.getSDKReferenceNumber.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r6]
        L29:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aq.getSDKReferenceNumber.b(byte, short, short, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{30808, 30733, 30804, 30798, 30839, 30837, 30801, 30809, 30800, 30837, 30749, 30731, 30823, 30796, 30798, 30806, 30844, 30841, 30800, 30799, 30836, 30845, 30809, 30805, 30807, 30844, 30847, 30809, 30808, 30804, 30797, 30839, 30765, 30740, 30725, 30800, 30809, 30801, 30828, 30839, 30808, 30802, 30798, 30805, 30807, 30809, 30841, 30829, 30967, 30938, 30944, 30947, 30944, 30934, 30964, 30975, 30944, 30938, 30934, 30941, 30943, 30945, 30734, 30809, 30807, 30805, 30798, 30802, 30808, 30839, 30828, 30800, 30813, 30808, 30804, 30800, 30831, 30730, 30808, 30839, 30841, 30806, 30798, 30833, 30841, 30809, 30807, 30805, 30798};
    }

    static void init$0() {
        $$a = new byte[]{55, -88, -54, 122};
        $$b = 53;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) throws Throwable {
        int i11 = getDeviceData + 35;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            return onCreateView(null, str, context, attributeSet);
        }
        onCreateView(null, str, context, attributeSet);
        throw null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Throwable {
        View viewCreateView;
        ChallengeResult = (getDeviceData + 95) % 128;
        LayoutInflater layoutInflater = this.getSDKReferenceNumber.getLayoutInflater();
        Object[] objArr = new Object[1];
        a("\u0001", new int[]{0, 1, 159, 0}, true, objArr);
        if (str.contains(((String) objArr[0]).intern())) {
            try {
                viewCreateView = layoutInflater.createView(str, null, attributeSet);
            } catch (InflateException unused) {
                viewCreateView = null;
            } catch (ClassNotFoundException e11) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{1, 31, 0, 10}, false, objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(str);
                Object[] objArr3 = new Object[1];
                a("\u0001\u0001", new int[]{32, 2, 0, 1}, true, objArr3);
                sb2.append(((String) objArr3[0]).intern());
                throw new RuntimeException(sb2.toString(), e11);
            }
        } else {
            String[] strArr = getSDKAppID;
            int length = strArr.length;
            getDeviceData = (ChallengeResult + 35) % 128;
            View viewCreateView2 = null;
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = getDeviceData + 89;
                ChallengeResult = i12 % 128;
                if (i12 % 2 == 0) {
                    layoutInflater.createView(str, strArr[i11], attributeSet);
                    throw null;
                }
                try {
                    viewCreateView2 = layoutInflater.createView(str, strArr[i11], attributeSet);
                    if (viewCreateView2 != null) {
                        break;
                    }
                } catch (InflateException | ClassNotFoundException unused2) {
                    continue;
                }
                continue;
            }
            viewCreateView = viewCreateView2;
        }
        if (viewCreateView != null) {
            int i13 = ChallengeResult + 47;
            getDeviceData = i13 % 128;
            if (i13 % 2 != 0) {
                getSDKTransactionID getsdktransactionid = this.AuthenticationRequestParameters;
                getSDKTransactionID.getSDKTransactionID(new Object[]{getsdktransactionid, viewCreateView, attributeSet}, -1414219135, 1414219137, System.identityHashCode(getsdktransactionid));
                throw null;
            }
            getSDKTransactionID getsdktransactionid2 = this.AuthenticationRequestParameters;
            getSDKTransactionID.getSDKTransactionID(new Object[]{getsdktransactionid2, viewCreateView, attributeSet}, -1414219135, 1414219137, System.identityHashCode(getsdktransactionid2));
        }
        return viewCreateView;
    }
}
