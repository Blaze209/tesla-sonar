package atd.b;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getTransactionStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getDeviceData extends getSDKReferenceNumber<String> {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static long getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 3436066960836173333L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getDeviceData(String str) throws Throwable {
        Object[] objArr = new Object[1];
        c("䯈ቚ\uf8f8䜌ⶣ\uf433剓㣣蜆涉㐰鉖磤윋궙", 22937 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
        super(((String) objArr[0]).intern(), str);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0269  */
    /* JADX WARN: Code duplicated, block: B:60:0x026a  */
    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i12 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i13 = gettransactionstatus.getSDKTransactionID;
            if (i13 >= charArray.length) {
                break;
            }
            int i14 = $11 + 23;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            Class cls = Integer.TYPE;
            if (i15 != 0) {
                char c11 = charArray[i13];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i12] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 688, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16021), (ExpandableListView.getPackedPositionForChild(i12, i12) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i12, i12) == 0L ? 0 : -1)) + 33);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i13] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() / (getSDKTransactionID - (-2227742522694838850L));
                    Object[] objArr4 = {gettransactionstatus, gettransactionstatus};
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 418, (char) (29017 - ExpandableListView.getPackedPositionGroup(0L)), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                charArray = charArray;
                jArr = jArr;
                Object[] objArr5 = {Integer.valueOf(charArray[i13]), gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(962978490);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 689, (char) (16022 - TextUtils.getTrimmedLength("")), 31 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    d(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], cls, Object.class, Object.class);
                    map2.put(962978490, method3);
                }
                jArr[i13] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (getSDKTransactionID ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method4 = map2.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - Color.alpha(0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29018), 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
            jArr = jArr;
            charArray = charArray;
            i12 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = charArray;
        long[] jArr2 = jArr;
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            char[] cArr3 = cArr;
            if (i16 >= cArr3.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i17 = $10 + 67;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr2[i16] = (char) jArr2[i16];
                Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method5 = map3.get(-46730980);
                if (method5 == null) {
                    method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.indexOf("", "") + 29017), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24)).getMethod("A", Object.class, Object.class);
                    map3.put(-46730980, method5);
                }
                ((Method) method5).invoke(null, objArr8);
                throw null;
            }
            cArr2[i16] = (char) jArr2[i16];
            Object[] objArr9 = {gettransactionstatus, gettransactionstatus};
            Map map4 = atd.a.getMessageVersion.timedout;
            Object method6 = map4.get(-46730980);
            if (method6 == null) {
                method6 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(0) + 417, (char) (29016 - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) + 24)).getMethod("A", Object.class, Object.class);
                map4.put(-46730980, method6);
            }
            ((Method) method6).invoke(null, objArr9);
            cArr = cArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 118
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = atd.b.getDeviceData.$$g
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r5]
        L28:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getDeviceData.d(int, byte, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$g = new byte[]{88, -76, 55, 74};
        $$h = 6;
    }
}
