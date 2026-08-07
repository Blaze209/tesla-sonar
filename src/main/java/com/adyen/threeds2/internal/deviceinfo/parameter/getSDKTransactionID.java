package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getTransactionStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"toBooleanOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "toPositiveIntOrNull", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters = -2320046866482744221L;
    }

    public static final Integer AuthenticationRequestParameters(String str) {
        int iIntValue;
        s.k(str, "");
        Integer numX = t.x(str);
        if (numX == null || (iIntValue = numX.intValue()) < 0) {
            return null;
        }
        getSDKReferenceNumber = (getSDKAppID + 39) % 128;
        Integer numValueOf = Integer.valueOf(iIntValue);
        int i11 = getSDKReferenceNumber + 71;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 11 / 0;
        }
        return numValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x01af  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        int i12;
        Object method;
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 33) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= cArr.length) {
                break;
            }
            char c11 = cArr[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    method = obj;
                    i12 = i13;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(688 - TextUtils.indexOf((CharSequence) "", '0', i13), (char) (16022 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getTrimmedLength("") + 32);
                    byte b11 = (byte) i13;
                    byte b12 = b11;
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i15 = i12;
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(417 - (Process.myPid() >> 22), (char) (29017 - View.resolveSizeAndState(i15, i15, i15)), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                i13 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= cArr.length) {
                break;
            }
            int i17 = $10 + 49;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr2[i16] = (char) jArr2[i16];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) getMessageVersion.getSDKTransactionID(417 - Drawable.resolveOpacity(0, 0), (char) (Color.argb(0, 0, 0, 0) + 29017), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i18 = 72 / 0;
            } else {
                cArr2[i16] = (char) jArr2[i16];
                Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
                Map map3 = getMessageVersion.timedout;
                Object method4 = map3.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID(416 - TextUtils.indexOf((CharSequence) "", '0'), (char) (29017 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 25 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                    map3.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr6);
            }
            $10 = ($11 + 55) % 128;
        }
        String str2 = new String(cArr2);
        int i19 = $11 + 25;
        $10 = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.$$a
            int r7 = r7 * 2
            int r7 = 118 - r7
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.b(short, int, byte, java.lang.Object[]):void");
    }

    public static final Boolean getSDKReferenceNumber(String str) throws Throwable {
        Boolean bool;
        int i11;
        s.k(str, "");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == 48) {
            Object[] objArr = new Object[1];
            a("懭", (ViewConfiguration.getTouchSlop() >> 8) + 38851, objArr);
            if (lowerCase.equals(((String) objArr[0]).intern())) {
                return Boolean.FALSE;
            }
            return null;
        }
        if (iHashCode != 49) {
            if (iHashCode == 3569038) {
                Object[] objArr2 = new Object[1];
                a("憩擘歆燝", 1399 - (Process.myPid() >> 22), objArr2);
                if (lowerCase.equals(((String) objArr2[0]).intern())) {
                    return Boolean.TRUE;
                }
                return null;
            }
            if (iHashCode != 97196323) {
                return null;
            }
            Object[] objArr3 = new Object[1];
            a("憻쓝⭳醍\uf43c", 42336 - MotionEvent.axisFromString(""), objArr3);
            if (!lowerCase.equals(((String) objArr3[0]).intern())) {
                return null;
            }
            bool = Boolean.FALSE;
            int i12 = getSDKReferenceNumber + 71;
            getSDKAppID = i12 % 128;
            i11 = i12 % 2 == 0 ? 12 : 50;
            return bool;
        }
        Object[] objArr4 = new Object[1];
        a("懬", ExpandableListView.getPackedPositionChild(0L) + 38834, objArr4);
        if (!lowerCase.equals(((String) objArr4[0]).intern())) {
            return null;
        }
        bool = Boolean.TRUE;
        int i13 = getSDKAppID + 75;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            return bool;
        }
        int i14 = i11 / 0;
        return bool;
    }

    static void init$0() {
        $$a = new byte[]{33, -29, 53, -35};
        $$b = 109;
    }
}
