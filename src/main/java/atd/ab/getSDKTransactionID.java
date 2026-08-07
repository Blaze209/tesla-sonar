package atd.ab;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getTransactionStatus;
import com.adyen.threeds2.CompletionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKTransactionID implements CompletionEvent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final String getDeviceData;
    private final String getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters = 4935605134804723165L;
    }

    public getSDKTransactionID(String str, String str2) {
        this.getDeviceData = str;
        this.getSDKReferenceNumber = str2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0237  */
    /* JADX WARN: Code duplicated, block: B:51:0x0238  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Object method;
        Throwable cause;
        int i12;
        Object method2;
        $10 = ($11 + 23) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 111) % 128;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = $10 + 105;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            Class cls = Integer.TYPE;
            if (i16 == 0) {
                char c11 = charArray[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        i12 = i13;
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(689 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (16021 - TextUtils.indexOf((CharSequence) "", '0', i13, i13)), 32 - TextUtils.indexOf("", ""));
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method2 = cls2.getMethod((String) objArr3[i12], cls, Object.class, Object.class);
                        map.put(962978490, method2);
                    }
                    jArr[i14] = ((Long) ((Method) method2).invoke(null, objArr2)).longValue() % (AuthenticationRequestParameters & (-2227742522694838850L));
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method3 = map.get(-46730980);
                    if (method3 == null) {
                        method3 = ((Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 418, (char) (29065 - AndroidCharacter.getMirror('0')), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method3);
                    }
                    ((Method) method3).invoke(null, objArr4);
                    jArr = jArr;
                    i13 = i12;
                    charArray = charArray;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                char[] cArr = charArray;
                long[] jArr2 = jArr;
                int i17 = i13;
                char c12 = cArr[i14];
                Object[] objArr5 = new Object[3];
                objArr5[2] = gettransactionstatus;
                objArr5[1] = gettransactionstatus;
                objArr5[i17] = Integer.valueOf(c12);
                Map map2 = getMessageVersion.timedout;
                Object method4 = map2.get(962978490);
                if (method4 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(i17) + 20) >> 6) + 689, (char) (16021 - TextUtils.lastIndexOf("", '0')), 32 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    byte b13 = (byte) i17;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method4 = cls3.getMethod((String) objArr6[i17], cls, Object.class, Object.class);
                    map2.put(962978490, method4);
                }
                jArr2[i14] = ((Long) ((Method) method4).invoke(null, objArr5)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method5 = map2.get(-46730980);
                if (method5 == null) {
                    method5 = ((Class) getMessageVersion.getSDKTransactionID(AndroidCharacter.getMirror('0') + 369, (char) (Color.green(0) + 29017), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23)).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method5);
                }
                ((Method) method5).invoke(null, objArr7);
                jArr = jArr2;
                charArray = cArr;
                i13 = 0;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr2 = charArray;
        long[] jArr3 = jArr;
        char[] cArr3 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i18 = gettransactionstatus.getSDKTransactionID;
            char[] cArr4 = cArr2;
            if (i18 >= cArr4.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i18] = (char) jArr3[i18];
            Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
            Map map3 = getMessageVersion.timedout;
            Object obj2 = map3.get(-46730980);
            if (obj2 != null) {
                method = obj2;
            } else {
                method = ((Class) getMessageVersion.getSDKTransactionID(416 - TextUtils.lastIndexOf("", '0'), (char) (29017 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 24)).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method);
            }
            ((Method) method).invoke(null, objArr8);
            cArr2 = cArr4;
        }
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
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = r6 * 2
            int r6 = r6 + 118
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = atd.ab.getSDKTransactionID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r7
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getSDKTransactionID.b(byte, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{47, -3, 31, -125};
        $$b = 15;
    }

    @Override // com.adyen.threeds2.CompletionEvent
    public final String getSDKTransactionID() {
        int i11 = getSDKTransactionID + 71;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getDeviceData;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.CompletionEvent
    public final String getTransactionStatus() {
        int i11 = getSDKAppID + 81;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return this.getSDKReferenceNumber;
        }
        throw null;
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("\uf069\udbf7Ꟊ玽徫⮒\uf768썜꼨笝䜆ዺﻞ쪷隯抣乷ᨎ\ue67d", ExpandableListView.getPackedPositionChild(0L) + 11240, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(getSDKTransactionID());
        Object[] objArr2 = new Object[1];
        a("\uf069\uaac4䖷\ue07b魁㘏탰诅⚏셡簲\u171c뇔沠ވꉊ崦\uf813銏䷪", 23251 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(getTransactionStatus());
        String string = sb2.toString();
        getSDKTransactionID = (getSDKAppID + 45) % 128;
        return string;
    }
}
