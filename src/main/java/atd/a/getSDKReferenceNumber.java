package atd.a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getSDKAppID;
    private static int getSDKTransactionID;
    private ArrayList<Object> getDeviceData = new ArrayList<>();

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getSDKAppID = new char[]{30720, 30812, 30809, 30900, 30807, 30823, 30785, 30897, 30898, 30907, 30908, 30799, 30798, 30904, 30908, 30910, 30785, 30910, 30908, 30906, 30903, 30907, 30732, 30802, 30799, 30806, 30808, 30806, 30811, 30807, 30805, 30800, 30798, 30808, 30813, 30821, 30821, 30730, 30801, 30799, 30797, 30790, 30794, 30800, 30831, 30833, 30798, 30790, 30825, 30721, 30820, 30797, 30792, 30793, 30793, 30792, 30784, 30800, 30808, 30795, 30797, 30805, 30804, 30950, 30949, 30945, 30945, 30862, 30941, 30947, 30954, 30943, 30943, 30938, 30956, 30947, 30944, 30950, 30941, 30958, 30956, 30761, 30841, 30805, 30805, 30811, 30805, 30807, 30802, 30797, 30792, 30808, 30846, 30836, 30804, 30809, 30808, 30826, 30873, 30866, 30882, 30886, 30862, 30867, 30889, 30877, 30855, 30863, 30863, 30858, 30866, 30873, 30871};
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 477) + (i12 * (-475));
        int i15 = ~((~i11) | i12);
        int i16 = ~i12;
        int i17 = ~(i16 | i11 | i13);
        return ((i14 + ((i15 | i17) * (-476))) + (i17 * 952)) + ((~(i11 | (i16 | (~i13)))) * 476) != 1 ? AuthenticationRequestParameters(objArr) : getDeviceData(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 * 2
            int r6 = r6 + 98
            byte[] r1 = atd.a.getSDKReferenceNumber.$$g
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r7
            r7 = r8
            goto L31
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L31:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKReferenceNumber.a(int, int, byte, java.lang.Object[]):void");
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
    private static void b(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 6
            int r7 = 103 - r7
            byte[] r0 = atd.a.getSDKReferenceNumber.$$d
            int r5 = 264 - r5
            int r1 = r6 + 11
            byte[] r1 = new byte[r1]
            int r6 = r6 + 10
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-3)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKReferenceNumber.b(int, short, byte, java.lang.Object[]):void");
    }

    private static void c(boolean z11, String str, int[] iArr, Object[] objArr) throws Throwable {
        int i11;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr = getSDKAppID;
        Class cls3 = Integer.TYPE;
        int i17 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            while (i12 < length) {
                try {
                    byte[] bArr2 = bArr;
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    int i18 = i12;
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + 2313, (char) ((-16777216) - Color.rgb(0, 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23);
                        byte b11 = (byte) ($$h & 5);
                        byte b12 = (byte) (-b11);
                        Object[] objArr3 = new Object[1];
                        a(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12 = i18 + 1;
                    bArr = bArr2;
                    length = length;
                    cArr2 = cArr2;
                    cArr = cArr;
                    i15 = i15;
                    i16 = i16;
                    cls2 = cls2;
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
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i19 = i15;
        int i21 = i16;
        char[] cArr3 = new char[i14];
        System.arraycopy(cArr, i13, cArr3, 0, i14);
        if (bArr3 != null) {
            char[] cArr4 = new char[i14];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i22 = challengeResultError.getSDKAppID;
                if (i22 >= i14) {
                    cArr3 = cArr4;
                    break;
                }
                int i23 = ($10 + 89) % 128;
                $11 = i23;
                if (bArr3[i22] == 1) {
                    int i24 = i23 + 59;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        char c12 = cArr3[i22];
                        Object[] objArr4 = new Object[i17];
                        objArr4[1] = Integer.valueOf(c11);
                        objArr4[0] = Integer.valueOf(c12);
                        Map map2 = getMessageVersion.timedout;
                        Object method2 = map2.get(10570995);
                        if (method2 == null) {
                            Class cls6 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 558, (char) (5486 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23);
                            byte b13 = (byte) 0;
                            byte b14 = (byte) (b13 - 1);
                            Object[] objArr5 = new Object[1];
                            a(b13, b14, (byte) (b14 + 1), objArr5);
                            method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                            map2.put(10570995, method2);
                        }
                        cArr4[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    Object[] objArr6 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c11)};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(10570995);
                    if (method3 == null) {
                        Class cls7 = (Class) getMessageVersion.getSDKTransactionID(558 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (5486 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        a(b15, b16, (byte) (b16 + 1), objArr7);
                        method3 = cls7.getMethod((String) objArr7[0], cls3, cls3);
                        map3.put(10570995, method3);
                    }
                    cArr4[i22] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                } else {
                    cArr3 = cArr3;
                    Object[] objArr8 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c11)};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(-502074319);
                    if (method4 == null) {
                        method4 = ((Class) getMessageVersion.getSDKTransactionID(201 - (ViewConfiguration.getTouchSlop() >> 8), (char) View.combineMeasuredStates(0, 0), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("a", cls3, cls3);
                        map4.put(-502074319, method4);
                    }
                    cArr4[i22] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                }
                c11 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr9 = {challengeResultError, challengeResultError};
                Map map5 = getMessageVersion.timedout;
                Object method5 = map5.get(-399400818);
                if (method5 != null) {
                    cls = cls5;
                } else {
                    Class cls8 = (Class) getMessageVersion.getSDKTransactionID(854 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), 24 - View.getDefaultSize(0, 0));
                    byte b17 = (byte) ($$h & 7);
                    byte b18 = (byte) (b17 - 4);
                    Object[] objArr10 = new Object[1];
                    a(b17, b18, (byte) (b18 + 1), objArr10);
                    cls = cls5;
                    method5 = cls8.getMethod((String) objArr10[0], cls, cls);
                    map5.put(-399400818, method5);
                }
                ((Method) method5).invoke(null, objArr9);
                cls5 = cls;
                cArr3 = cArr3;
                i17 = 2;
            }
        }
        if (i21 > 0) {
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i14);
            int i25 = i14 - i21;
            System.arraycopy(cArr5, 0, cArr3, i25, i21);
            System.arraycopy(cArr5, i21, cArr3, 0, i25);
            $11 = ($10 + 107) % 128;
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i14) {
                    break;
                }
                int i27 = $11 + 69;
                $10 = i27 % 128;
                if (i27 % 2 != 0) {
                    cArr6[i26] = cArr3[(i14 * i26) % 1];
                } else {
                    cArr6[i26] = cArr3[(i14 - i26) - 1];
                    i26++;
                }
                challengeResultError.getSDKAppID = i26;
            }
            cArr3 = cArr6;
        }
        if (i19 > 0) {
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.a.getSDKReferenceNumber.$$a
            int r7 = r7 * 2
            int r7 = 73 - r7
            int r5 = r5 * 2
            int r1 = 31 - r5
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r5 = 30 - r5
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKReferenceNumber.d(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x06d1 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x072e  */
    /* JADX WARN: Code duplicated, block: B:109:0x072f A[Catch: all -> 0x0764, TryCatch #2 {all -> 0x0764, blocks: (B:106:0x0712, B:110:0x0759, B:109:0x072f), top: B:419:0x0712 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x076d A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:128:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:132:0x090b  */
    /* JADX WARN: Code duplicated, block: B:133:0x090c A[Catch: all -> 0x093e, TryCatch #15 {all -> 0x093e, blocks: (B:130:0x08f0, B:134:0x0936, B:133:0x090c), top: B:444:0x08f0 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0947 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0967  */
    /* JADX WARN: Code duplicated, block: B:145:0x0968 A[Catch: all -> 0x099a, TryCatch #26 {all -> 0x099a, blocks: (B:142:0x094f, B:146:0x0992, B:145:0x0968), top: B:466:0x094f }] */
    /* JADX WARN: Code duplicated, block: B:153:0x09a3 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:161:0x0a67 A[Catch: all -> 0x15ec, TryCatch #8 {all -> 0x15ec, blocks: (B:158:0x0a4e, B:162:0x0a92, B:161:0x0a67), top: B:430:0x0a4e }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:172:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:173:0x0b23 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:182:0x0baa A[Catch: all -> 0x0be6, TryCatch #4 {all -> 0x0be6, blocks: (B:179:0x0b8c, B:183:0x0bd9, B:182:0x0baa), top: B:423:0x0b8c }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0bef A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0c31  */
    /* JADX WARN: Code duplicated, block: B:194:0x0c46 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_ENTER, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0c63 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_ENTER, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x015e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0d31  */
    /* JADX WARN: Code duplicated, block: B:205:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:20:0x015f A[Catch: all -> 0x01b2, TryCatch #11 {all -> 0x01b2, blocks: (B:17:0x0145, B:21:0x018d, B:20:0x015f), top: B:436:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0dd9 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0e7c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0ea9  */
    /* JADX WARN: Code duplicated, block: B:223:0x0eaa A[Catch: all -> 0x0ee2, TryCatch #0 {all -> 0x0ee2, blocks: (B:220:0x0e91, B:224:0x0ed9, B:223:0x0eaa), top: B:415:0x0e91 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0eeb  */
    /* JADX WARN: Code duplicated, block: B:237:0x0f84  */
    /* JADX WARN: Code duplicated, block: B:238:0x0f85 A[Catch: all -> 0x15d1, TryCatch #21 {all -> 0x15d1, blocks: (B:235:0x0f6c, B:239:0x0fb1, B:238:0x0f85), top: B:456:0x0f6c }] */
    /* JADX WARN: Code duplicated, block: B:244:0x100b  */
    /* JADX WARN: Code duplicated, block: B:246:0x1027  */
    /* JADX WARN: Code duplicated, block: B:249:0x1044  */
    /* JADX WARN: Code duplicated, block: B:250:0x1047 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x1061  */
    /* JADX WARN: Code duplicated, block: B:257:0x10c4  */
    /* JADX WARN: Code duplicated, block: B:258:0x10c5 A[Catch: all -> 0x112e, TryCatch #9 {all -> 0x112e, blocks: (B:255:0x10a0, B:259:0x111f, B:258:0x10c5), top: B:432:0x10a0 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x1137 A[Catch: GeneralSecurityException | JSONException -> 0x1631, GeneralSecurityException | JSONException -> 0x1631, TRY_LEAVE, TryCatch #7 {GeneralSecurityException | JSONException -> 0x1631, blocks: (B:3:0x0049, B:9:0x00c3, B:9:0x00c3, B:15:0x0101, B:15:0x0101, B:47:0x0395, B:47:0x0395, B:50:0x03ae, B:50:0x03ae, B:71:0x04e9, B:71:0x04e9, B:80:0x05aa, B:80:0x05aa, B:81:0x05ad, B:81:0x05ad, B:85:0x060a, B:85:0x060a, B:91:0x0636, B:91:0x0636, B:124:0x08c9, B:124:0x08c9, B:129:0x08e8, B:129:0x08e8, B:164:0x0ab0, B:164:0x0ab0, B:170:0x0b08, B:170:0x0b08, B:177:0x0b4c, B:177:0x0b4c, B:216:0x0e6c, B:216:0x0e6c, B:219:0x0e89, B:219:0x0e89, B:241:0x0fc5, B:241:0x0fc5, B:247:0x1029, B:247:0x1029, B:253:0x1062, B:253:0x1062, B:303:0x141e, B:303:0x141e, B:305:0x1424, B:305:0x1424, B:306:0x1425, B:306:0x1425, B:308:0x1427, B:308:0x1427, B:310:0x142d, B:310:0x142d, B:311:0x142e, B:311:0x142e, B:330:0x1596, B:330:0x1596, B:332:0x159c, B:332:0x159c, B:333:0x159d, B:333:0x159d, B:335:0x159f, B:335:0x159f, B:337:0x15a5, B:337:0x15a5, B:338:0x15a6, B:338:0x15a6, B:340:0x15a8, B:340:0x15a8, B:342:0x15ae, B:342:0x15ae, B:343:0x15af, B:343:0x15af, B:345:0x15b1, B:345:0x15b1, B:347:0x15b7, B:347:0x15b7, B:348:0x15b8, B:348:0x15b8, B:350:0x15ba, B:350:0x15ba, B:352:0x15c0, B:352:0x15c0, B:353:0x15c1, B:353:0x15c1, B:262:0x112f, B:262:0x112f, B:264:0x1135, B:264:0x1135, B:265:0x1136, B:265:0x1136, B:250:0x1047, B:250:0x1047, B:266:0x1137, B:266:0x1137, B:273:0x11f8, B:273:0x11f8, B:275:0x1245, B:275:0x1245, B:354:0x15c2, B:354:0x15c2, B:355:0x15c7, B:355:0x15c7, B:357:0x15c9, B:357:0x15c9, B:359:0x15cf, B:359:0x15cf, B:360:0x15d0, B:360:0x15d0, B:227:0x0ee3, B:227:0x0ee3, B:229:0x0ee9, B:229:0x0ee9, B:230:0x0eea, B:230:0x0eea, B:234:0x0f64, B:234:0x0f64, B:362:0x15d2, B:362:0x15d2, B:364:0x15d8, B:364:0x15d8, B:365:0x15d9, B:365:0x15d9, B:367:0x15db, B:367:0x15db, B:369:0x15e1, B:369:0x15e1, B:370:0x15e2, B:370:0x15e2, B:186:0x0be7, B:186:0x0be7, B:188:0x0bed, B:188:0x0bed, B:189:0x0bee, B:189:0x0bee, B:173:0x0b23, B:173:0x0b23, B:190:0x0bef, B:190:0x0bef, B:194:0x0c46, B:194:0x0c46, B:196:0x0c63, B:196:0x0c63, B:199:0x0c69, B:199:0x0c69, B:206:0x0d49, B:206:0x0d49, B:208:0x0d95, B:208:0x0d95, B:209:0x0dcf, B:209:0x0dcf, B:213:0x0e63, B:213:0x0e63, B:214:0x0e68, B:214:0x0e68, B:210:0x0dd9, B:210:0x0dd9, B:212:0x0e23, B:212:0x0e23, B:372:0x15e4, B:372:0x15e4, B:374:0x15ea, B:374:0x15ea, B:375:0x15eb, B:375:0x15eb, B:137:0x093f, B:137:0x093f, B:139:0x0945, B:139:0x0945, B:140:0x0946, B:140:0x0946, B:141:0x0947, B:141:0x0947, B:149:0x099b, B:149:0x099b, B:151:0x09a1, B:151:0x09a1, B:152:0x09a2, B:152:0x09a2, B:153:0x09a3, B:153:0x09a3, B:157:0x0a46, B:157:0x0a46, B:377:0x15ed, B:377:0x15ed, B:379:0x15f3, B:379:0x15f3, B:380:0x15f4, B:380:0x15f4, B:382:0x15f6, B:382:0x15f6, B:384:0x15fc, B:384:0x15fc, B:385:0x15fd, B:385:0x15fd, B:100:0x06c9, B:100:0x06c9, B:102:0x06cf, B:102:0x06cf, B:103:0x06d0, B:103:0x06d0, B:104:0x06d1, B:104:0x06d1, B:113:0x0765, B:113:0x0765, B:115:0x076b, B:115:0x076b, B:116:0x076c, B:116:0x076c, B:117:0x076d, B:117:0x076d, B:120:0x0822, B:120:0x0822, B:122:0x0873, B:122:0x0873, B:386:0x15fe, B:386:0x15fe, B:387:0x1603, B:387:0x1603, B:389:0x1605, B:389:0x1605, B:391:0x160b, B:391:0x160b, B:392:0x160c, B:392:0x160c, B:394:0x160e, B:394:0x160e, B:396:0x1614, B:396:0x1614, B:397:0x1615, B:397:0x1615, B:58:0x0414, B:58:0x0414, B:60:0x041a, B:60:0x041a, B:61:0x041b, B:61:0x041b, B:65:0x0497, B:65:0x0497, B:399:0x1617, B:399:0x1617, B:401:0x161d, B:401:0x161d, B:402:0x161e, B:402:0x161e, B:404:0x1620, B:404:0x1620, B:406:0x1626, B:406:0x1626, B:407:0x1627, B:407:0x1627, B:25:0x01b3, B:25:0x01b3, B:27:0x01b9, B:27:0x01b9, B:28:0x01ba, B:28:0x01ba, B:30:0x01bf, B:30:0x01bf, B:33:0x0215, B:33:0x0215, B:34:0x0219, B:34:0x0219, B:39:0x02e8, B:39:0x02e8, B:41:0x0337, B:41:0x0337, B:43:0x0389, B:43:0x0389, B:44:0x038e, B:44:0x038e, B:409:0x1629, B:409:0x1629, B:411:0x162f, B:411:0x162f, B:412:0x1630, B:412:0x1630, B:13:0x00e4, B:13:0x00e4), top: B:429:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x11a5  */
    /* JADX WARN: Code duplicated, block: B:271:0x11a6 A[Catch: all -> 0x15c8, TryCatch #18 {all -> 0x15c8, blocks: (B:268:0x1181, B:272:0x11f1, B:271:0x11a6), top: B:450:0x1181 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x12a6  */
    /* JADX WARN: Code duplicated, block: B:280:0x12a8 A[Catch: all -> 0x15b9, TryCatch #13 {all -> 0x15b9, blocks: (B:277:0x1297, B:281:0x12dd, B:280:0x12a8), top: B:440:0x1297 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x12f6  */
    /* JADX WARN: Code duplicated, block: B:286:0x12f8 A[Catch: all -> 0x15b0, TryCatch #10 {all -> 0x15b0, blocks: (B:283:0x12ec, B:287:0x132c, B:286:0x12f8), top: B:434:0x12ec }] */
    /* JADX WARN: Code duplicated, block: B:289:0x133a  */
    /* JADX WARN: Code duplicated, block: B:292:0x1358  */
    /* JADX WARN: Code duplicated, block: B:293:0x135a A[Catch: all -> 0x1426, TryCatch #3 {all -> 0x1426, blocks: (B:290:0x134e, B:294:0x138d, B:293:0x135a), top: B:421:0x134e }] */
    /* JADX WARN: Code duplicated, block: B:298:0x13b3  */
    /* JADX WARN: Code duplicated, block: B:299:0x13b4 A[Catch: all -> 0x141d, TryCatch #28 {all -> 0x141d, blocks: (B:296:0x1399, B:300:0x1409, B:299:0x13b4), top: B:470:0x1399 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x142f  */
    /* JADX WARN: Code duplicated, block: B:317:0x14b9  */
    /* JADX WARN: Code duplicated, block: B:318:0x14bb A[Catch: all -> 0x159e, TryCatch #30 {all -> 0x159e, blocks: (B:315:0x14af, B:319:0x14ef, B:318:0x14bb), top: B:474:0x14af }] */
    /* JADX WARN: Code duplicated, block: B:323:0x1516  */
    /* JADX WARN: Code duplicated, block: B:324:0x1517 A[Catch: all -> 0x1595, TryCatch #24 {all -> 0x1595, blocks: (B:321:0x14fb, B:325:0x1575, B:324:0x1517), top: B:462:0x14fb }] */
    /* JADX WARN: Code duplicated, block: B:49:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x03cd A[Catch: all -> 0x0413, TryCatch #23 {all -> 0x0413, blocks: (B:51:0x03b6, B:55:0x03fb, B:54:0x03cd), top: B:460:0x03b6 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x041c  */
    /* JADX WARN: Code duplicated, block: B:68:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x04b7 A[Catch: all -> 0x1616, TryCatch #25 {all -> 0x1616, blocks: (B:66:0x049e, B:70:0x04e3, B:69:0x04b7), top: B:464:0x049e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0505 A[Catch: all -> 0x160d, TRY_ENTER, TryCatch #20 {all -> 0x160d, blocks: (B:74:0x0505, B:77:0x055c), top: B:454:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x055a A[PHI: r2 r30
      0x055a: PHI (r2v257 atd.ai.ChallengeResultCancelled) = (r2v74 atd.ai.ChallengeResultCancelled), (r2v260 atd.ai.ChallengeResultCancelled) binds: [B:78:0x05a7, B:75:0x0558] A[DONT_GENERATE, DONT_INLINE]
      0x055a: PHI (r30v4 long) = (r30v2 long), (r30v5 long) binds: [B:78:0x05a7, B:75:0x0558] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x055c A[Catch: all -> 0x160d, TRY_LEAVE, TryCatch #20 {all -> 0x160d, blocks: (B:74:0x0505, B:77:0x055c), top: B:454:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0621  */
    /* JADX WARN: Code duplicated, block: B:90:0x0633  */
    /* JADX WARN: Code duplicated, block: B:95:0x0692  */
    /* JADX WARN: Code duplicated, block: B:96:0x0693 A[Catch: all -> 0x06c8, TryCatch #19 {all -> 0x06c8, blocks: (B:93:0x0676, B:97:0x06b9, B:96:0x0693), top: B:452:0x0676 }] */
    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        Integer num;
        String str;
        Context context;
        int iIntValue;
        byte[] bArr;
        Object[] objArr2;
        int i11;
        int i12;
        Map map;
        Object method;
        int i13;
        long j11;
        atd.ai.ChallengeResultCancelled challengeResultCancelled;
        int i14;
        long j12;
        Object[] objArr3;
        char c11;
        int i15;
        int i16;
        Map map2;
        Object method2;
        long j13;
        Context applicationContext;
        Object[] objArr4;
        Object[] objArr5;
        int i17;
        Long lValueOf;
        Class cls;
        String str2;
        int i18;
        int i19;
        int i21;
        Map map3;
        Object method3;
        long j14;
        Map map4;
        Object method4;
        Object objInvoke;
        Map map5;
        Object method5;
        Object[] objArr6;
        int iIntValue2;
        Object method6;
        Object[] objArr7;
        int iIntValue3;
        Object method7;
        Object[] objArr8;
        Object method8;
        Object method9;
        Object[] objArr9;
        Object method10;
        int i22;
        Map map6;
        Object method11;
        Map map7;
        Object method12;
        int i23;
        Map map8;
        Object method13;
        int i24;
        Map map9;
        Object method14;
        Map map10;
        Object method15;
        int i25;
        Map map11;
        Object method16;
        Map map12;
        Object method17;
        Map map13;
        Object method18;
        Map map14;
        Object method19;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        atd.ai.getSDKReferenceNumber getsdkreferencenumber2 = (atd.ai.getSDKReferenceNumber) objArr[1];
        JSONObject jSONObject = (JSONObject) objArr[2];
        System.identityHashCode(getsdkreferencenumber);
        System.identityHashCode(getsdkreferencenumber);
        Object[] objArr10 = new Object[1];
        c(false, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{0, 22, 25, 16}, objArr10);
        String str3 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        c(true, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{22, 15, 0, 6}, objArr11);
        String str4 = (String) objArr11[0];
        try {
            byte[] bytes = jSONObject.toString().getBytes(AuthenticationRequestParameters.AuthenticationRequestParameters);
            Object sDKAppID$660ecda2 = getsdkreferencenumber2.getSDKAppID$660ecda2();
            Class cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            byte[] bArr2 = $$a;
            Object[] objArr12 = new Object[1];
            d(bArr2[89], bArr2[21], (byte) (-bArr2[6]), objArr12);
            long j15 = cls2.getField((String) objArr12[0]).getLong(null);
            Class cls3 = Integer.TYPE;
            try {
                try {
                    try {
                        try {
                            if (j15 != -1) {
                                int i26 = AuthenticationRequestParameters;
                                int i27 = (-2) - (((i26 & 66) + (i26 | 66)) ^ (-1));
                                getSDKTransactionID = i27 % 128;
                                if (i27 % 2 == 0) {
                                    num = 0;
                                    if ((j15 ^ 1919) >= ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[1]).invoke(null, null)).longValue()) {
                                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(664 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 24 - TextUtils.lastIndexOf("", '0'));
                                        str = str3;
                                        Object[] objArr13 = new Object[1];
                                        d((byte) $$b, bArr2[21], (byte) (-bArr2[87]), objArr13);
                                        try {
                                            Object[] objArr14 = {cls4.getField((String) objArr13[0]).get(null), 209657836, num};
                                            map14 = getMessageVersion.timedout;
                                            method19 = map14.get(1046315470);
                                            if (method19 != null) {
                                                method19 = ((Class) getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64314), 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                map14.put(1046315470, method19);
                                            }
                                            objArr2 = (Object[]) ((Method) method19).invoke(null, objArr14);
                                            int i28 = getSDKTransactionID;
                                            int i29 = (i28 & (-86)) | ((~i28) & 85);
                                            int i31 = (i28 & 85) << 1;
                                            AuthenticationRequestParameters = ((i29 & i31) + (i31 | i29)) % 128;
                                            bArr = bArr2;
                                        } catch (Throwable th2) {
                                            Throwable cause = th2.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th2;
                                        }
                                    }
                                } else {
                                    num = 0;
                                    if (j15 + 1919 >= ((Long) Class.forName(str3).getDeclaredMethod(str4, null).invoke(null, null)).longValue()) {
                                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID(664 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 24 - TextUtils.lastIndexOf("", '0'));
                                        str = str3;
                                        Object[] objArr15 = new Object[1];
                                        d((byte) $$b, bArr2[21], (byte) (-bArr2[87]), objArr15);
                                        Object[] objArr16 = {cls5.getField((String) objArr15[0]).get(null), 209657836, num};
                                        map14 = getMessageVersion.timedout;
                                        method19 = map14.get(1046315470);
                                        if (method19 != null) {
                                            method19 = ((Class) getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64314), 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                            map14.put(1046315470, method19);
                                        }
                                        objArr2 = (Object[]) ((Method) method19).invoke(null, objArr16);
                                        int i210 = getSDKTransactionID;
                                        int i211 = (i210 & (-86)) | ((~i210) & 85);
                                        int i32 = (i210 & 85) << 1;
                                        AuthenticationRequestParameters = ((i211 & i32) + (i32 | i211)) % 128;
                                        bArr = bArr2;
                                    }
                                }
                                i11 = ((int[]) objArr2[1])[0];
                                i12 = ((int[]) objArr2[0])[0];
                                if (i12 == i11) {
                                    getSDKTransactionID = (AuthenticationRequestParameters + 35) % 128;
                                    try {
                                        Object[] objArr17 = {objArr2, Integer.valueOf(((int[]) objArr2[3])[0]), num};
                                        map13 = getMessageVersion.timedout;
                                        method18 = map13.get(1046315470);
                                        if (method18 != null) {
                                            method18 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarFadeDuration() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                            map13.put(1046315470, method18);
                                        }
                                        ((Method) method18).invoke(null, objArr17);
                                        int i33 = AuthenticationRequestParameters;
                                        int i34 = i33 ^ 41;
                                        getSDKTransactionID = ((((i33 & 41) | i34) << 1) - i34) % 128;
                                    } catch (Throwable th3) {
                                        Throwable cause2 = th3.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th3;
                                    }
                                } else {
                                    int i35 = i11 & i12;
                                    long j16 = ((long) (((i11 ^ i12) | i35) & (~i35))) ^ (-7533677128890449920L);
                                    int i36 = getSDKTransactionID;
                                    AuthenticationRequestParameters = (((i36 & 89) - (~(-(-(i36 | 89))))) - 1) % 128;
                                    try {
                                        Object[] objArr18 = {Long.valueOf(j16), -1754070891L};
                                        byte[] bArr3 = $$d;
                                        Object[] objArr19 = objArr2;
                                        Object[] objArr20 = new Object[1];
                                        b((short) 195, (byte) (bArr3[33] + 1), (byte) (-bArr3[4]), objArr20);
                                        Class<?> cls6 = Class.forName((String) objArr20[0]);
                                        Object[] objArr21 = new Object[1];
                                        b((short) EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, bArr3[0], bArr3[23], objArr21);
                                        String str5 = (String) objArr21[0];
                                        Class cls7 = Long.TYPE;
                                        cls6.getMethod(str5, cls7, cls7).invoke(null, objArr18);
                                        try {
                                            Object[] objArr22 = {objArr19, Integer.valueOf(((int[]) objArr19[3])[0]), num};
                                            map = getMessageVersion.timedout;
                                            method = map.get(1046315470);
                                            if (method != null) {
                                                method = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) ((Process.myTid() >> 22) + 64314), (ViewConfiguration.getTouchSlop() >> 8) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                map.put(1046315470, method);
                                            }
                                            ((Method) method).invoke(null, objArr22);
                                        } catch (Throwable th4) {
                                            Throwable cause3 = th4.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th4;
                                        }
                                    } catch (Throwable th5) {
                                        Throwable cause4 = th5.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th5;
                                    }
                                }
                                getsdkreferencenumber.getDeviceData.add(sDKAppID$660ecda2);
                                int i37 = AuthenticationRequestParameters;
                                int i38 = i37 & 99;
                                i13 = (i38 - (~((i37 ^ 99) | i38))) - 1;
                                getSDKTransactionID = i13 % 128;
                                if (i13 % 2 == 0) {
                                    Class cls8 = (Class) getMessageVersion.getSDKTransactionID(171 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 10255), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                                    byte[] bArr4 = $$d;
                                    j11 = 0;
                                    Object[] objArr23 = new Object[1];
                                    b((short) 159, bArr4[13], bArr4[23], objArr23);
                                    String str6 = (String) objArr23[0];
                                    Class<?>[] clsArr = new Class[1];
                                    clsArr[1] = byte[].class;
                                    challengeResultCancelled = (atd.ai.ChallengeResultCancelled) cls8.getMethod(str6, clsArr).invoke(sDKAppID$660ecda2, bytes);
                                    if (bytes != null) {
                                        Arrays.fill(bytes, (byte) 0);
                                    }
                                } else {
                                    j11 = 0;
                                    Class cls9 = (Class) getMessageVersion.getSDKTransactionID(171 - ExpandableListView.getPackedPositionType(0L), (char) (Color.red(0) + 10255), 30 - View.getDefaultSize(0, 0));
                                    byte[] bArr5 = $$d;
                                    Object[] objArr24 = new Object[1];
                                    b((short) 159, bArr5[13], bArr5[23], objArr24);
                                    challengeResultCancelled = (atd.ai.ChallengeResultCancelled) cls9.getMethod((String) objArr24[0], byte[].class).invoke(sDKAppID$660ecda2, bytes);
                                    if (bytes != null) {
                                        Arrays.fill(bytes, (byte) 0);
                                    }
                                }
                                Class cls10 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                i14 = $$b;
                                byte b11 = bArr[21];
                                Object[] objArr25 = new Object[1];
                                d((byte) (i14 - 3), b11, (byte) (b11 | 24), objArr25);
                                j12 = cls10.getField((String) objArr25[0]).getLong(null);
                                if (j12 != -1) {
                                    int i39 = AuthenticationRequestParameters;
                                    int i41 = i39 & 3;
                                    int i42 = (i39 ^ 3) | i41;
                                    getSDKTransactionID = ((i41 ^ i42) + ((i42 & i41) << 1)) % 128;
                                    if (j12 + 1932 >= ((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue()) {
                                        i25 = (-2) - ((AuthenticationRequestParameters + 74) ^ (-1));
                                        getSDKTransactionID = i25 % 128;
                                        if (i25 % 2 == 0) {
                                            Class cls11 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 665, (char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.getCapsMode("", 0, 0) + 25);
                                            Object[] objArr26 = new Object[1];
                                            d(bArr[89], bArr[69], bArr[18], objArr26);
                                            try {
                                                Object[] objArr27 = {cls11.getField((String) objArr26[0]).get(null), -2118021610, num};
                                                map12 = getMessageVersion.timedout;
                                                method17 = map12.get(1046315470);
                                                if (method17 != null) {
                                                    method17 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (Color.green(0) + 64314), 28 - TextUtils.getCapsMode("", 0, 0))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                    map12.put(1046315470, method17);
                                                }
                                                objArr3 = (Object[]) ((Method) method17).invoke(null, objArr27);
                                            } catch (Throwable th6) {
                                                Throwable cause5 = th6.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th6;
                                            }
                                        } else {
                                            Class cls12 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1)) + 663, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 25 - View.combineMeasuredStates(0, 0));
                                            Object[] objArr28 = new Object[1];
                                            d(bArr[89], bArr[69], bArr[18], objArr28);
                                            try {
                                                Object[] objArr29 = {cls12.getField((String) objArr28[0]).get(null), -2118021610, num};
                                                map11 = getMessageVersion.timedout;
                                                method16 = map11.get(1046315470);
                                                if (method16 != null) {
                                                    method16 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (KeyEvent.getDeadChar(0, 0) + 64314), (ViewConfiguration.getTapTimeout() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                    map11.put(1046315470, method16);
                                                }
                                                objArr3 = (Object[]) ((Method) method16).invoke(null, objArr29);
                                            } catch (Throwable th7) {
                                                Throwable cause6 = th7.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th7;
                                            }
                                        }
                                        c11 = 1;
                                    } else {
                                        Object[] objArr30 = new Object[1];
                                        c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr30);
                                        Class<?> cls13 = Class.forName((String) objArr30[0]);
                                        Object[] objArr31 = new Object[1];
                                        c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr31);
                                        int iIntValue4 = ((Integer) cls13.getMethod((String) objArr31[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                                        int i43 = AuthenticationRequestParameters;
                                        int i44 = i43 | 55;
                                        getSDKTransactionID = (((i44 << 1) - (~(-((~(i43 & 55)) & i44)))) - 1) % 128;
                                        try {
                                            Object[] objArr32 = {Integer.valueOf(iIntValue4), -2118021610};
                                            byte[] bArr6 = $$d;
                                            Object[] objArr33 = new Object[1];
                                            b((short) 147, bArr6[136], (byte) (-bArr6[4]), objArr33);
                                            Class<?> cls14 = Class.forName((String) objArr33[0]);
                                            short s11 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                            byte b12 = bArr6[23];
                                            Object[] objArr34 = new Object[1];
                                            b(s11, b12, b12, objArr34);
                                            objArr3 = (Object[]) cls14.getMethod((String) objArr34[0], cls3, cls3).invoke(null, objArr32);
                                            Class cls15 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) Drawable.resolveOpacity(0, 0), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                            Object[] objArr35 = new Object[1];
                                            d(bArr[89], bArr[69], bArr[18], objArr35);
                                            cls15.getField((String) objArr35[0]).set(null, objArr3);
                                            try {
                                                Long lValueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                                Class cls16 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.normalizeMetaState(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                byte b13 = bArr[21];
                                                Object[] objArr36 = new Object[1];
                                                d((byte) (i14 - 3), b13, (byte) (b13 | 24), objArr36);
                                                cls16.getField((String) objArr36[0]).set(null, lValueOf2);
                                                int i45 = getSDKTransactionID;
                                                c11 = 1;
                                                AuthenticationRequestParameters = (((i45 ^ 83) - (~((i45 & 83) << 1))) - 1) % 128;
                                            } catch (Exception unused) {
                                                throw new RuntimeException();
                                            }
                                        } catch (Throwable th8) {
                                            Throwable cause7 = th8.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th8;
                                        }
                                    }
                                } else {
                                    Object[] objArr37 = new Object[1];
                                    c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr37);
                                    Class<?> cls17 = Class.forName((String) objArr37[0]);
                                    Object[] objArr38 = new Object[1];
                                    c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr38);
                                    int iIntValue5 = ((Integer) cls17.getMethod((String) objArr38[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                                    int i46 = AuthenticationRequestParameters;
                                    int i47 = i46 | 55;
                                    getSDKTransactionID = (((i47 << 1) - (~(-((~(i46 & 55)) & i47)))) - 1) % 128;
                                    Object[] objArr39 = {Integer.valueOf(iIntValue5), -2118021610};
                                    byte[] bArr7 = $$d;
                                    Object[] objArr310 = new Object[1];
                                    b((short) 147, bArr7[136], (byte) (-bArr7[4]), objArr310);
                                    Class<?> cls18 = Class.forName((String) objArr310[0]);
                                    short s12 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                    byte b14 = bArr7[23];
                                    Object[] objArr311 = new Object[1];
                                    b(s12, b14, b14, objArr311);
                                    objArr3 = (Object[]) cls18.getMethod((String) objArr311[0], cls3, cls3).invoke(null, objArr39);
                                    Class cls19 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) Drawable.resolveOpacity(0, 0), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                    Object[] objArr312 = new Object[1];
                                    d(bArr[89], bArr[69], bArr[18], objArr312);
                                    cls19.getField((String) objArr312[0]).set(null, objArr3);
                                    Long lValueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                    Class cls110 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.normalizeMetaState(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                    byte b15 = bArr[21];
                                    Object[] objArr313 = new Object[1];
                                    d((byte) (i14 - 3), b15, (byte) (b15 | 24), objArr313);
                                    cls110.getField((String) objArr313[0]).set(null, lValueOf3);
                                    int i48 = getSDKTransactionID;
                                    c11 = 1;
                                    AuthenticationRequestParameters = (((i48 ^ 83) - (~((i48 & 83) << 1))) - 1) % 128;
                                }
                                i15 = ((int[]) objArr3[c11])[0];
                                i16 = ((int[]) objArr3[0])[0];
                                if (i16 == i15) {
                                    i24 = getSDKTransactionID + 33;
                                    AuthenticationRequestParameters = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        try {
                                            Object[] objArr40 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[1]), 1};
                                            map10 = getMessageVersion.timedout;
                                            method15 = map10.get(1046315470);
                                            if (method15 != null) {
                                                method15 = ((Class) getMessageVersion.getSDKTransactionID(2802 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (64314 - (ViewConfiguration.getEdgeSlop() >> 16)), 27 - ExpandableListView.getPackedPositionChild(j11))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                map10.put(1046315470, method15);
                                            }
                                            ((Method) method15).invoke(null, objArr40);
                                        } catch (Throwable th9) {
                                            Throwable cause8 = th9.getCause();
                                            if (cause8 != null) {
                                                throw cause8;
                                            }
                                            throw th9;
                                        }
                                    } else {
                                        try {
                                            Object[] objArr41 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[0]), num};
                                            map9 = getMessageVersion.timedout;
                                            method14 = map9.get(1046315470);
                                            if (method14 != null) {
                                                method14 = ((Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (Color.rgb(0, 0, 0) + 16841530), TextUtils.indexOf((CharSequence) "", '0') + 29)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                map9.put(1046315470, method14);
                                            }
                                            ((Method) method14).invoke(null, objArr41);
                                        } catch (Throwable th10) {
                                            Throwable cause9 = th10.getCause();
                                            if (cause9 != null) {
                                                throw cause9;
                                            }
                                            throw th10;
                                        }
                                    }
                                } else {
                                    new ArrayList().add((String) objArr3[2]);
                                    long j17 = ((long) (((~i15) & i16) | ((~i16) & i15))) ^ (-1121146327233724416L);
                                    int i49 = getSDKTransactionID;
                                    int i51 = i49 ^ 85;
                                    int i52 = (i49 & 85) << 1;
                                    int i53 = (((i51 | i52) << 1) - (i52 ^ i51)) % 128;
                                    AuthenticationRequestParameters = i53;
                                    int i54 = ((i53 ^ 29) | (i53 & 29)) << 1;
                                    int i55 = -((i53 & (-30)) | ((~i53) & 29));
                                    getSDKTransactionID = (((i54 | i55) << 1) - (i54 ^ i55)) % 128;
                                    try {
                                        Object[] objArr42 = {Long.valueOf(j17), -261037237L};
                                        byte[] bArr8 = $$d;
                                        Object[] objArr43 = new Object[1];
                                        b((short) 100, (byte) (bArr8[159] - 1), (byte) (-bArr8[4]), objArr43);
                                        Class<?> cls20 = Class.forName((String) objArr43[0]);
                                        Object[] objArr44 = new Object[1];
                                        b((short) 159, bArr8[13], bArr8[23], objArr44);
                                        String str7 = (String) objArr44[0];
                                        Class cls21 = Long.TYPE;
                                        cls20.getMethod(str7, cls21, cls21).invoke(null, objArr42);
                                        try {
                                            Object[] objArr45 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[0]), num};
                                            map2 = getMessageVersion.timedout;
                                            method2 = map2.get(1046315470);
                                            if (method2 != null) {
                                                method2 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - TextUtils.getOffsetBefore("", 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                map2.put(1046315470, method2);
                                            }
                                            ((Method) method2).invoke(null, objArr45);
                                            int i56 = getSDKTransactionID;
                                            AuthenticationRequestParameters = ((((i56 | 107) << 1) - (~(-(((~i56) & 107) | (i56 & (-108)))))) - 1) % 128;
                                        } catch (Throwable th11) {
                                            Throwable cause10 = th11.getCause();
                                            if (cause10 != null) {
                                                throw cause10;
                                            }
                                            throw th11;
                                        }
                                    } catch (Throwable th12) {
                                        Throwable cause11 = th12.getCause();
                                        if (cause11 != null) {
                                            throw cause11;
                                        }
                                        throw th12;
                                    }
                                }
                                Class cls22 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 664, (char) TextUtils.indexOf("", ""), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25);
                                Object[] objArr46 = new Object[1];
                                d(bArr[8], bArr[21], bArr[89], objArr46);
                                j13 = cls22.getField((String) objArr46[0]).getLong(null);
                                if (j13 != -1) {
                                    int i57 = AuthenticationRequestParameters;
                                    i23 = (i57 & 49) + (i57 | 49);
                                    getSDKTransactionID = i23 % 128;
                                    if (i23 % 2 == 0) {
                                        if ((j13 & 1996) >= ((Long) Class.forName(str).getDeclaredMethod(str4, new Class[1]).invoke(null, null)).longValue()) {
                                            int i58 = getSDKTransactionID;
                                            AuthenticationRequestParameters = ((i58 ^ 49) + ((i58 & 49) << 1)) % 128;
                                            Class cls23 = (Class) getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 665, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25);
                                            byte b16 = bArr[21];
                                            Object[] objArr47 = new Object[1];
                                            d(b16, (byte) (-bArr[94]), b16, objArr47);
                                            try {
                                                Object[] objArr48 = {cls23.getField((String) objArr47[0]).get(null), 1587322970, num};
                                                map8 = getMessageVersion.timedout;
                                                method13 = map8.get(1046315470);
                                                if (method13 != null) {
                                                    method13 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64313 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                    map8.put(1046315470, method13);
                                                }
                                                objArr5 = (Object[]) ((Method) method13).invoke(null, objArr48);
                                            } catch (Throwable th13) {
                                                Throwable cause12 = th13.getCause();
                                                if (cause12 != null) {
                                                    throw cause12;
                                                }
                                                throw th13;
                                            }
                                        } else {
                                            Object[] objArr49 = new Object[1];
                                            c(false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{37, 26, 8, 26}, objArr49);
                                            Class<?> cls24 = Class.forName((String) objArr49[0]);
                                            Object[] objArr50 = new Object[1];
                                            c(true, null, new int[]{63, 18, 111, 12}, objArr50);
                                            applicationContext = (Context) cls24.getMethod((String) objArr50[0], null).invoke(null, null);
                                            if (applicationContext != null) {
                                                int i59 = AuthenticationRequestParameters;
                                                i18 = ((i59 | 5) << 1) - (i59 ^ 5);
                                                getSDKTransactionID = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    applicationContext.getApplicationContext();
                                                    throw null;
                                                }
                                                applicationContext = applicationContext.getApplicationContext();
                                                int i61 = AuthenticationRequestParameters;
                                                int i62 = i61 & 123;
                                                int i63 = ((i61 ^ 123) | i62) << 1;
                                                int i64 = -((i61 | 123) & (~i62));
                                                getSDKTransactionID = ((i63 & i64) + (i64 | i63)) % 128;
                                            }
                                            Object[] objArr51 = new Object[1];
                                            c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr51);
                                            Class<?> cls25 = Class.forName((String) objArr51[0]);
                                            Object[] objArr52 = new Object[1];
                                            c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr52);
                                            int iIntValue6 = ((Integer) cls25.getMethod((String) objArr52[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                                            int i65 = AuthenticationRequestParameters;
                                            int i66 = i65 & 23;
                                            int i67 = -(-((i65 ^ 23) | i66));
                                            int i68 = ((i66 & i67) + (i67 | i66)) % 128;
                                            getSDKTransactionID = i68;
                                            AuthenticationRequestParameters = (i68 + 71) % 128;
                                            try {
                                                Object[] objArr53 = {applicationContext, Integer.valueOf(iIntValue6), 1587322970};
                                                byte[] bArr9 = $$d;
                                                Object[] objArr54 = new Object[1];
                                                b(bArr9[74], (byte) (-bArr9[193]), (byte) (-bArr9[4]), objArr54);
                                                Class<?> cls26 = Class.forName((String) objArr54[0]);
                                                Object[] objArr55 = new Object[1];
                                                b((short) 159, bArr9[13], bArr9[23], objArr55);
                                                objArr4 = (Object[]) cls26.getMethod((String) objArr55[0], Context.class, cls3, cls3).invoke(null, objArr53);
                                                if (applicationContext != null) {
                                                    int i69 = AuthenticationRequestParameters;
                                                    i17 = (((i69 | 6) << 1) - (i69 ^ 6)) - 1;
                                                    getSDKTransactionID = i17 % 128;
                                                    try {
                                                        if (i17 % 2 == 0) {
                                                            Class cls27 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.getOffsetBefore("", 0), (char) Color.alpha(0), (Process.myPid() >> 22) + 25);
                                                            byte b17 = bArr[21];
                                                            Object[] objArr56 = new Object[1];
                                                            d(b17, (byte) (-bArr[94]), b17, objArr56);
                                                            cls27.getField((String) objArr56[0]).set(null, objArr4);
                                                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, new Object[1])).longValue());
                                                            cls = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                            Object[] objArr57 = new Object[1];
                                                            d(bArr[8], bArr[21], bArr[89], objArr57);
                                                            str2 = (String) objArr57[0];
                                                        } else {
                                                            Class cls28 = (Class) getMessageVersion.getSDKTransactionID(664 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 25);
                                                            byte b18 = bArr[21];
                                                            Object[] objArr58 = new Object[1];
                                                            d(b18, (byte) (-bArr[94]), b18, objArr58);
                                                            cls28.getField((String) objArr58[0]).set(null, objArr4);
                                                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                                            cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1))), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                                            Object[] objArr59 = new Object[1];
                                                            d(bArr[8], bArr[21], bArr[89], objArr59);
                                                            str2 = (String) objArr59[0];
                                                        }
                                                        cls.getField(str2).set(null, lValueOf);
                                                    } catch (Exception unused2) {
                                                        throw new RuntimeException();
                                                    }
                                                }
                                                objArr5 = objArr4;
                                            } catch (Throwable th14) {
                                                Throwable cause13 = th14.getCause();
                                                if (cause13 != null) {
                                                    throw cause13;
                                                }
                                                throw th14;
                                            }
                                        }
                                    } else if (j13 + 1996 >= ((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue()) {
                                        int i510 = getSDKTransactionID;
                                        AuthenticationRequestParameters = ((i510 ^ 49) + ((i510 & 49) << 1)) % 128;
                                        Class cls29 = (Class) getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 665, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25);
                                        byte b19 = bArr[21];
                                        Object[] objArr410 = new Object[1];
                                        d(b19, (byte) (-bArr[94]), b19, objArr410);
                                        Object[] objArr411 = {cls29.getField((String) objArr410[0]).get(null), 1587322970, num};
                                        map8 = getMessageVersion.timedout;
                                        method13 = map8.get(1046315470);
                                        if (method13 != null) {
                                            method13 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64313 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                            map8.put(1046315470, method13);
                                        }
                                        objArr5 = (Object[]) ((Method) method13).invoke(null, objArr411);
                                    } else {
                                        Object[] objArr412 = new Object[1];
                                        c(false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{37, 26, 8, 26}, objArr412);
                                        Class<?> cls210 = Class.forName((String) objArr412[0]);
                                        Object[] objArr510 = new Object[1];
                                        c(true, null, new int[]{63, 18, 111, 12}, objArr510);
                                        applicationContext = (Context) cls210.getMethod((String) objArr510[0], null).invoke(null, null);
                                        if (applicationContext != null) {
                                            int i511 = AuthenticationRequestParameters;
                                            i18 = ((i511 | 5) << 1) - (i511 ^ 5);
                                            getSDKTransactionID = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                applicationContext.getApplicationContext();
                                                throw null;
                                            }
                                            applicationContext = applicationContext.getApplicationContext();
                                            int i610 = AuthenticationRequestParameters;
                                            int i611 = i610 & 123;
                                            int i612 = ((i610 ^ 123) | i611) << 1;
                                            int i613 = -((i610 | 123) & (~i611));
                                            getSDKTransactionID = ((i612 & i613) + (i613 | i612)) % 128;
                                        }
                                        Object[] objArr511 = new Object[1];
                                        c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr511);
                                        Class<?> cls211 = Class.forName((String) objArr511[0]);
                                        Object[] objArr512 = new Object[1];
                                        c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr512);
                                        int iIntValue7 = ((Integer) cls211.getMethod((String) objArr512[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                                        int i614 = AuthenticationRequestParameters;
                                        int i615 = i614 & 23;
                                        int i616 = -(-((i614 ^ 23) | i615));
                                        int i617 = ((i615 & i616) + (i616 | i615)) % 128;
                                        getSDKTransactionID = i617;
                                        AuthenticationRequestParameters = (i617 + 71) % 128;
                                        Object[] objArr513 = {applicationContext, Integer.valueOf(iIntValue7), 1587322970};
                                        byte[] bArr10 = $$d;
                                        Object[] objArr514 = new Object[1];
                                        b(bArr10[74], (byte) (-bArr10[193]), (byte) (-bArr10[4]), objArr514);
                                        Class<?> cls212 = Class.forName((String) objArr514[0]);
                                        Object[] objArr515 = new Object[1];
                                        b((short) 159, bArr10[13], bArr10[23], objArr515);
                                        objArr4 = (Object[]) cls212.getMethod((String) objArr515[0], Context.class, cls3, cls3).invoke(null, objArr513);
                                        if (applicationContext != null) {
                                            int i618 = AuthenticationRequestParameters;
                                            i17 = (((i618 | 6) << 1) - (i618 ^ 6)) - 1;
                                            getSDKTransactionID = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                Class cls213 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.getOffsetBefore("", 0), (char) Color.alpha(0), (Process.myPid() >> 22) + 25);
                                                byte b110 = bArr[21];
                                                Object[] objArr516 = new Object[1];
                                                d(b110, (byte) (-bArr[94]), b110, objArr516);
                                                cls213.getField((String) objArr516[0]).set(null, objArr4);
                                                lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, new Object[1])).longValue());
                                                cls = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                Object[] objArr517 = new Object[1];
                                                d(bArr[8], bArr[21], bArr[89], objArr517);
                                                str2 = (String) objArr517[0];
                                            } else {
                                                Class cls214 = (Class) getMessageVersion.getSDKTransactionID(664 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 25);
                                                byte b111 = bArr[21];
                                                Object[] objArr518 = new Object[1];
                                                d(b111, (byte) (-bArr[94]), b111, objArr518);
                                                cls214.getField((String) objArr518[0]).set(null, objArr4);
                                                lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                                cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1))), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                                Object[] objArr519 = new Object[1];
                                                d(bArr[8], bArr[21], bArr[89], objArr519);
                                                str2 = (String) objArr519[0];
                                            }
                                            cls.getField(str2).set(null, lValueOf);
                                        }
                                        objArr5 = objArr4;
                                    }
                                } else {
                                    Object[] objArr413 = new Object[1];
                                    c(false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{37, 26, 8, 26}, objArr413);
                                    Class<?> cls215 = Class.forName((String) objArr413[0]);
                                    Object[] objArr5110 = new Object[1];
                                    c(true, null, new int[]{63, 18, 111, 12}, objArr5110);
                                    applicationContext = (Context) cls215.getMethod((String) objArr5110[0], null).invoke(null, null);
                                    if (applicationContext != null) {
                                        int i512 = AuthenticationRequestParameters;
                                        i18 = ((i512 | 5) << 1) - (i512 ^ 5);
                                        getSDKTransactionID = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            applicationContext.getApplicationContext();
                                            throw null;
                                        }
                                        applicationContext = applicationContext.getApplicationContext();
                                        int i619 = AuthenticationRequestParameters;
                                        int i6110 = i619 & 123;
                                        int i6111 = ((i619 ^ 123) | i6110) << 1;
                                        int i6112 = -((i619 | 123) & (~i6110));
                                        getSDKTransactionID = ((i6111 & i6112) + (i6112 | i6111)) % 128;
                                    }
                                    Object[] objArr5111 = new Object[1];
                                    c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr5111);
                                    Class<?> cls216 = Class.forName((String) objArr5111[0]);
                                    Object[] objArr5112 = new Object[1];
                                    c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr5112);
                                    int iIntValue8 = ((Integer) cls216.getMethod((String) objArr5112[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                                    int i6113 = AuthenticationRequestParameters;
                                    int i6114 = i6113 & 23;
                                    int i6115 = -(-((i6113 ^ 23) | i6114));
                                    int i6116 = ((i6114 & i6115) + (i6115 | i6114)) % 128;
                                    getSDKTransactionID = i6116;
                                    AuthenticationRequestParameters = (i6116 + 71) % 128;
                                    Object[] objArr5113 = {applicationContext, Integer.valueOf(iIntValue8), 1587322970};
                                    byte[] bArr11 = $$d;
                                    Object[] objArr5114 = new Object[1];
                                    b(bArr11[74], (byte) (-bArr11[193]), (byte) (-bArr11[4]), objArr5114);
                                    Class<?> cls217 = Class.forName((String) objArr5114[0]);
                                    Object[] objArr5115 = new Object[1];
                                    b((short) 159, bArr11[13], bArr11[23], objArr5115);
                                    objArr4 = (Object[]) cls217.getMethod((String) objArr5115[0], Context.class, cls3, cls3).invoke(null, objArr5113);
                                    if (applicationContext != null) {
                                        int i6117 = AuthenticationRequestParameters;
                                        i17 = (((i6117 | 6) << 1) - (i6117 ^ 6)) - 1;
                                        getSDKTransactionID = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            Class cls218 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.getOffsetBefore("", 0), (char) Color.alpha(0), (Process.myPid() >> 22) + 25);
                                            byte b112 = bArr[21];
                                            Object[] objArr5116 = new Object[1];
                                            d(b112, (byte) (-bArr[94]), b112, objArr5116);
                                            cls218.getField((String) objArr5116[0]).set(null, objArr4);
                                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, new Object[1])).longValue());
                                            cls = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            Object[] objArr5117 = new Object[1];
                                            d(bArr[8], bArr[21], bArr[89], objArr5117);
                                            str2 = (String) objArr5117[0];
                                        } else {
                                            Class cls219 = (Class) getMessageVersion.getSDKTransactionID(664 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 25);
                                            byte b113 = bArr[21];
                                            Object[] objArr5118 = new Object[1];
                                            d(b113, (byte) (-bArr[94]), b113, objArr5118);
                                            cls219.getField((String) objArr5118[0]).set(null, objArr4);
                                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                            cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1))), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                            Object[] objArr5119 = new Object[1];
                                            d(bArr[8], bArr[21], bArr[89], objArr5119);
                                            str2 = (String) objArr5119[0];
                                        }
                                        cls.getField(str2).set(null, lValueOf);
                                    }
                                    objArr5 = objArr4;
                                }
                                i19 = ((int[]) objArr5[1])[0];
                                i21 = ((int[]) objArr5[0])[0];
                                if (i21 == i19) {
                                    AuthenticationRequestParameters = ((-2) - ((getSDKTransactionID + 116) ^ (-1))) % 128;
                                    try {
                                        Object[] objArr60 = {objArr5, Integer.valueOf(((int[]) objArr5[3])[0]), num};
                                        map7 = getMessageVersion.timedout;
                                        method12 = map7.get(1046315470);
                                        if (method12 != null) {
                                            method12 = ((Class) getMessageVersion.getSDKTransactionID(2803 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 64315), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                            map7.put(1046315470, method12);
                                        }
                                        ((Method) method12).invoke(null, objArr60);
                                    } catch (Throwable th15) {
                                        Throwable cause14 = th15.getCause();
                                        if (cause14 != null) {
                                            throw cause14;
                                        }
                                        throw th15;
                                    }
                                } else {
                                    int i71 = i19 & i21;
                                    long j18 = ((long) (((i19 ^ i21) | i71) & (~i71))) ^ (-5687560886395338752L);
                                    int i72 = (getSDKTransactionID + 21) % 128;
                                    AuthenticationRequestParameters = i72;
                                    getSDKTransactionID = ((-2) - ((i72 + 68) ^ (-1))) % 128;
                                    try {
                                        Object[] objArr61 = {Long.valueOf(j18), -1324237950L};
                                        byte[] bArr12 = $$d;
                                        Object[] objArr62 = new Object[1];
                                        b((short) 195, (byte) (bArr12[33] + 1), (byte) (-bArr12[4]), objArr62);
                                        Class<?> cls30 = Class.forName((String) objArr62[0]);
                                        Object[] objArr63 = new Object[1];
                                        b((short) EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, bArr12[0], bArr12[23], objArr63);
                                        String str8 = (String) objArr63[0];
                                        Class cls31 = Long.TYPE;
                                        cls30.getMethod(str8, cls31, cls31).invoke(null, objArr61);
                                        try {
                                            Object[] objArr64 = {objArr5, Integer.valueOf(((int[]) objArr5[3])[0]), num};
                                            map3 = getMessageVersion.timedout;
                                            method3 = map3.get(1046315470);
                                            if (method3 != null) {
                                                method3 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                                map3.put(1046315470, method3);
                                            }
                                            ((Method) method3).invoke(null, objArr64);
                                            int i73 = getSDKTransactionID;
                                            int i74 = i73 & 47;
                                            AuthenticationRequestParameters = (i74 + ((i73 ^ 47) | i74)) % 128;
                                        } catch (Throwable th16) {
                                            Throwable cause15 = th16.getCause();
                                            if (cause15 != null) {
                                                throw cause15;
                                            }
                                            throw th16;
                                        }
                                    } catch (Throwable th17) {
                                        Throwable cause16 = th17.getCause();
                                        if (cause16 != null) {
                                            throw cause16;
                                        }
                                        throw th17;
                                    }
                                }
                                Class cls32 = (Class) getMessageVersion.getSDKTransactionID(754 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (16829 - (ExpandableListView.getPackedPositionForChild(0, 0) > j11 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j11 ? 0 : -1))), 36 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)));
                                byte b21 = bArr[21];
                                Object[] objArr65 = new Object[1];
                                d(b21, (byte) (-bArr[94]), b21, objArr65);
                                j14 = cls32.getField((String) objArr65[0]).getLong(null);
                                if (j14 != -1) {
                                    int i75 = getSDKTransactionID;
                                    int i76 = i75 ^ 83;
                                    int i77 = ((i75 & 83) | i76) << 1;
                                    int i78 = -i76;
                                    i22 = ((i77 | i78) << 1) - (i77 ^ i78);
                                    AuthenticationRequestParameters = i22 % 128;
                                    if (i22 % 2 != 0) {
                                        if (j14 % 1936 >= ((Long) Class.forName(str).getDeclaredMethod(str4, new Class[1]).invoke(null, null)).longValue()) {
                                            Class cls33 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + 754, (char) (16878 - AndroidCharacter.getMirror('0')), 35 - ExpandableListView.getPackedPositionGroup(j11));
                                            Object[] objArr66 = new Object[1];
                                            d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr66);
                                            try {
                                                Object[] objArr67 = {cls33.getField((String) objArr66[0]).get(null), -1709429944, num};
                                                map6 = getMessageVersion.timedout;
                                                method11 = map6.get(245738379);
                                                if (method11 != null) {
                                                    method11 = ((Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 2778, (char) (39469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 24 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) + 2748, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54838), 29 - Color.green(0)), cls3, cls3);
                                                    map6.put(245738379, method11);
                                                }
                                                objInvoke = ((Method) method11).invoke(null, objArr67);
                                                System.identityHashCode(getsdkreferencenumber);
                                                System.identityHashCode(getsdkreferencenumber);
                                            } catch (Throwable th18) {
                                                Throwable cause17 = th18.getCause();
                                                if (cause17 != null) {
                                                    throw cause17;
                                                }
                                                throw th18;
                                            }
                                        } else {
                                            Object[] objArr68 = new Object[1];
                                            c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr68);
                                            Class<?> cls34 = Class.forName((String) objArr68[0]);
                                            Object[] objArr69 = new Object[1];
                                            c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr69);
                                            try {
                                                Object[] objArr70 = {Integer.valueOf(((Integer) cls34.getMethod((String) objArr69[0], Object.class).invoke(null, getsdkreferencenumber)).intValue()), -1709429944};
                                                map4 = getMessageVersion.timedout;
                                                method4 = map4.get(-836670848);
                                                if (method4 != null) {
                                                    Class cls35 = (Class) getMessageVersion.getSDKTransactionID(755 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16830), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35);
                                                    byte b22 = (byte) (i14 - 3);
                                                    byte b23 = bArr[21];
                                                    Object[] objArr71 = new Object[1];
                                                    d(b22, b23, (byte) (b23 | 24), objArr71);
                                                    method4 = cls35.getMethod((String) objArr71[0], cls3, cls3);
                                                    map4.put(-836670848, method4);
                                                }
                                                objInvoke = ((Method) method4).invoke(null, objArr70);
                                                Class cls36 = (Class) getMessageVersion.getSDKTransactionID(754 - ExpandableListView.getPackedPositionGroup(j11), (char) ((Process.myPid() >> 22) + 16830), 35 - View.getDefaultSize(0, 0));
                                                Object[] objArr72 = new Object[1];
                                                d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr72);
                                                cls36.getField((String) objArr72[0]).set(null, objInvoke);
                                                try {
                                                    Long lValueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                                    Class cls37 = (Class) getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (16829 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 36);
                                                    byte b24 = bArr[21];
                                                    Object[] objArr73 = new Object[1];
                                                    d(b24, (byte) (-bArr[94]), b24, objArr73);
                                                    cls37.getField((String) objArr73[0]).set(null, lValueOf4);
                                                    int i79 = AuthenticationRequestParameters;
                                                    getSDKTransactionID = ((((i79 | 44) << 1) - (i79 ^ 44)) - 1) % 128;
                                                } catch (Exception unused3) {
                                                    throw new RuntimeException();
                                                }
                                            } catch (Throwable th19) {
                                                Throwable cause18 = th19.getCause();
                                                if (cause18 != null) {
                                                    throw cause18;
                                                }
                                                throw th19;
                                            }
                                        }
                                    } else if (j14 + 1936 >= ((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue()) {
                                        Class cls38 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + 754, (char) (16878 - AndroidCharacter.getMirror('0')), 35 - ExpandableListView.getPackedPositionGroup(j11));
                                        Object[] objArr610 = new Object[1];
                                        d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr610);
                                        Object[] objArr611 = {cls38.getField((String) objArr610[0]).get(null), -1709429944, num};
                                        map6 = getMessageVersion.timedout;
                                        method11 = map6.get(245738379);
                                        if (method11 != null) {
                                            method11 = ((Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 2778, (char) (39469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 24 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) + 2748, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54838), 29 - Color.green(0)), cls3, cls3);
                                            map6.put(245738379, method11);
                                        }
                                        objInvoke = ((Method) method11).invoke(null, objArr611);
                                        System.identityHashCode(getsdkreferencenumber);
                                        System.identityHashCode(getsdkreferencenumber);
                                    } else {
                                        Object[] objArr612 = new Object[1];
                                        c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr612);
                                        Class<?> cls39 = Class.forName((String) objArr612[0]);
                                        Object[] objArr613 = new Object[1];
                                        c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr613);
                                        Object[] objArr74 = {Integer.valueOf(((Integer) cls39.getMethod((String) objArr613[0], Object.class).invoke(null, getsdkreferencenumber)).intValue()), -1709429944};
                                        map4 = getMessageVersion.timedout;
                                        method4 = map4.get(-836670848);
                                        if (method4 != null) {
                                            Class cls310 = (Class) getMessageVersion.getSDKTransactionID(755 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16830), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35);
                                            byte b25 = (byte) (i14 - 3);
                                            byte b26 = bArr[21];
                                            Object[] objArr75 = new Object[1];
                                            d(b25, b26, (byte) (b26 | 24), objArr75);
                                            method4 = cls310.getMethod((String) objArr75[0], cls3, cls3);
                                            map4.put(-836670848, method4);
                                        }
                                        objInvoke = ((Method) method4).invoke(null, objArr74);
                                        Class cls311 = (Class) getMessageVersion.getSDKTransactionID(754 - ExpandableListView.getPackedPositionGroup(j11), (char) ((Process.myPid() >> 22) + 16830), 35 - View.getDefaultSize(0, 0));
                                        Object[] objArr76 = new Object[1];
                                        d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr76);
                                        cls311.getField((String) objArr76[0]).set(null, objInvoke);
                                        Long lValueOf5 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                        Class cls312 = (Class) getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (16829 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 36);
                                        byte b27 = bArr[21];
                                        Object[] objArr77 = new Object[1];
                                        d(b27, (byte) (-bArr[94]), b27, objArr77);
                                        cls312.getField((String) objArr77[0]).set(null, lValueOf5);
                                        int i710 = AuthenticationRequestParameters;
                                        getSDKTransactionID = ((((i710 | 44) << 1) - (i710 ^ 44)) - 1) % 128;
                                    }
                                } else {
                                    Object[] objArr614 = new Object[1];
                                    c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr614);
                                    Class<?> cls313 = Class.forName((String) objArr614[0]);
                                    Object[] objArr615 = new Object[1];
                                    c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr615);
                                    Object[] objArr78 = {Integer.valueOf(((Integer) cls313.getMethod((String) objArr615[0], Object.class).invoke(null, getsdkreferencenumber)).intValue()), -1709429944};
                                    map4 = getMessageVersion.timedout;
                                    method4 = map4.get(-836670848);
                                    if (method4 != null) {
                                        Class cls314 = (Class) getMessageVersion.getSDKTransactionID(755 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16830), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35);
                                        byte b28 = (byte) (i14 - 3);
                                        byte b29 = bArr[21];
                                        Object[] objArr79 = new Object[1];
                                        d(b28, b29, (byte) (b29 | 24), objArr79);
                                        method4 = cls314.getMethod((String) objArr79[0], cls3, cls3);
                                        map4.put(-836670848, method4);
                                    }
                                    objInvoke = ((Method) method4).invoke(null, objArr78);
                                    Class cls315 = (Class) getMessageVersion.getSDKTransactionID(754 - ExpandableListView.getPackedPositionGroup(j11), (char) ((Process.myPid() >> 22) + 16830), 35 - View.getDefaultSize(0, 0));
                                    Object[] objArr710 = new Object[1];
                                    d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr710);
                                    cls315.getField((String) objArr710[0]).set(null, objInvoke);
                                    Long lValueOf6 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                    Class cls316 = (Class) getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (16829 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 36);
                                    byte b210 = bArr[21];
                                    Object[] objArr711 = new Object[1];
                                    d(b210, (byte) (-bArr[94]), b210, objArr711);
                                    cls316.getField((String) objArr711[0]).set(null, lValueOf6);
                                    int i711 = AuthenticationRequestParameters;
                                    getSDKTransactionID = ((((i711 | 44) << 1) - (i711 ^ 44)) - 1) % 128;
                                }
                                map5 = getMessageVersion.timedout;
                                method5 = map5.get(693253393);
                                if (method5 != null) {
                                    objArr6 = null;
                                } else {
                                    objArr6 = null;
                                    method5 = ((Class) getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (54838 - TextUtils.getOffsetAfter("", 0)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29)).getMethod("getSDKReferenceNumber", null);
                                    map5.put(693253393, method5);
                                }
                                iIntValue2 = ((Integer) ((Method) method5).invoke(objInvoke, objArr6)).intValue();
                                method6 = map5.get(-635346729);
                                if (method6 != null) {
                                    objArr7 = null;
                                } else {
                                    objArr7 = null;
                                    method6 = ((Class) getMessageVersion.getSDKTransactionID(2749 - (Process.myPid() >> 22), (char) (54838 - View.MeasureSpec.getSize(0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28)).getMethod("getDeviceData", null);
                                    map5.put(-635346729, method6);
                                }
                                iIntValue3 = ((Integer) ((Method) method6).invoke(objInvoke, objArr7)).intValue();
                                if (iIntValue3 == iIntValue2) {
                                    int i81 = AuthenticationRequestParameters;
                                    int i82 = i81 & 121;
                                    getSDKTransactionID = ((i82 - (~((i81 ^ 121) | i82))) - 1) % 128;
                                    try {
                                        method9 = map5.get(560827737);
                                        if (method9 != null) {
                                            objArr9 = null;
                                        } else {
                                            objArr9 = null;
                                            method9 = ((Class) getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(0, 0, 0) + 2749, (char) (54838 - (ViewConfiguration.getScrollBarSize() >> 8)), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)))).getMethod("getSDKAppID", null);
                                            map5.put(560827737, method9);
                                        }
                                        Integer num2 = (Integer) ((Method) method9).invoke(objInvoke, objArr9);
                                        num2.intValue();
                                        try {
                                            Object[] objArr80 = {objInvoke, num2, num};
                                            method10 = map5.get(245738379);
                                            if (method10 != null) {
                                                method10 = ((Class) getMessageVersion.getSDKTransactionID(2778 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 39468), 24 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2750 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 54838), TextUtils.indexOf("", "", 0) + 29), cls3, cls3);
                                                map5.put(245738379, method10);
                                            }
                                            ((Method) method10).invoke(null, objArr80);
                                            int i83 = AuthenticationRequestParameters;
                                            int i84 = i83 & 43;
                                            getSDKTransactionID = (i84 + ((i83 ^ 43) | i84)) % 128;
                                        } catch (Throwable th20) {
                                            Throwable cause19 = th20.getCause();
                                            if (cause19 != null) {
                                                throw cause19;
                                            }
                                            throw th20;
                                        }
                                    } catch (Throwable th21) {
                                        Throwable cause20 = th21.getCause();
                                        if (cause20 != null) {
                                            throw cause20;
                                        }
                                        throw th21;
                                    }
                                } else {
                                    int i85 = (~iIntValue3) & iIntValue2;
                                    int i86 = (~iIntValue2) & iIntValue3;
                                    long j19 = ((long) ((i86 & i85) | (i85 ^ i86))) ^ 6536085740768460800L;
                                    int i87 = AuthenticationRequestParameters;
                                    int i88 = i87 & 47;
                                    int i89 = (i87 ^ 47) | i88;
                                    getSDKTransactionID = (((i88 | i89) << 1) - (i89 ^ i88)) % 128;
                                    try {
                                        Object[] objArr81 = {Long.valueOf(j19), 1521803098L};
                                        byte[] bArr13 = $$d;
                                        Object[] objArr82 = new Object[1];
                                        b(bArr13[90], (byte) (bArr13[243] - 1), (byte) (-bArr13[4]), objArr82);
                                        Class<?> cls40 = Class.forName((String) objArr82[0]);
                                        byte b31 = bArr13[23];
                                        Object[] objArr83 = new Object[1];
                                        b(b31, bArr13[99], b31, objArr83);
                                        String str9 = (String) objArr83[0];
                                        Class cls41 = Long.TYPE;
                                        cls40.getMethod(str9, cls41, cls41).invoke(null, objArr81);
                                        try {
                                            method7 = map5.get(560827737);
                                            if (method7 != null) {
                                                objArr8 = null;
                                            } else {
                                                objArr8 = null;
                                                method7 = ((Class) getMessageVersion.getSDKTransactionID(2750 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 54838), 28 - MotionEvent.axisFromString(""))).getMethod("getSDKAppID", null);
                                                map5.put(560827737, method7);
                                            }
                                            Integer num3 = (Integer) ((Method) method7).invoke(objInvoke, objArr8);
                                            num3.intValue();
                                            try {
                                                Object[] objArr84 = {objInvoke, num3, num};
                                                method8 = map5.get(245738379);
                                                if (method8 != null) {
                                                    method8 = ((Class) getMessageVersion.getSDKTransactionID(2778 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (39468 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24)).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 2749, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 54838), AndroidCharacter.getMirror('0') - 19), cls3, cls3);
                                                    map5.put(245738379, method8);
                                                }
                                                ((Method) method8).invoke(null, objArr84);
                                                AuthenticationRequestParameters = (getSDKTransactionID + 103) % 128;
                                            } catch (Throwable th22) {
                                                Throwable cause21 = th22.getCause();
                                                if (cause21 != null) {
                                                    throw cause21;
                                                }
                                                throw th22;
                                            }
                                        } catch (Throwable th23) {
                                            Throwable cause22 = th23.getCause();
                                            if (cause22 != null) {
                                                throw cause22;
                                            }
                                            throw th23;
                                        }
                                    } catch (Throwable th24) {
                                        Throwable cause23 = th24.getCause();
                                        if (cause23 != null) {
                                            throw cause23;
                                        }
                                        throw th24;
                                    }
                                }
                                int i91 = AuthenticationRequestParameters;
                                int i92 = i91 & 93;
                                getSDKTransactionID = (((i91 | 93) & (~i92)) + (i92 << 1)) % 128;
                                return challengeResultCancelled;
                            }
                            num = 0;
                            method6 = map5.get(-635346729);
                            if (method6 != null) {
                                objArr7 = null;
                            } else {
                                objArr7 = null;
                                method6 = ((Class) getMessageVersion.getSDKTransactionID(2749 - (Process.myPid() >> 22), (char) (54838 - View.MeasureSpec.getSize(0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28)).getMethod("getDeviceData", null);
                                map5.put(-635346729, method6);
                            }
                            iIntValue3 = ((Integer) ((Method) method6).invoke(objInvoke, objArr7)).intValue();
                            if (iIntValue3 == iIntValue2) {
                                int i810 = AuthenticationRequestParameters;
                                int i811 = i810 & 121;
                                getSDKTransactionID = ((i811 - (~((i810 ^ 121) | i811))) - 1) % 128;
                                method9 = map5.get(560827737);
                                if (method9 != null) {
                                    objArr9 = null;
                                } else {
                                    objArr9 = null;
                                    method9 = ((Class) getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(0, 0, 0) + 2749, (char) (54838 - (ViewConfiguration.getScrollBarSize() >> 8)), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)))).getMethod("getSDKAppID", null);
                                    map5.put(560827737, method9);
                                }
                                Integer num4 = (Integer) ((Method) method9).invoke(objInvoke, objArr9);
                                num4.intValue();
                                Object[] objArr85 = {objInvoke, num4, num};
                                method10 = map5.get(245738379);
                                if (method10 != null) {
                                    method10 = ((Class) getMessageVersion.getSDKTransactionID(2778 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 39468), 24 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2750 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 54838), TextUtils.indexOf("", "", 0) + 29), cls3, cls3);
                                    map5.put(245738379, method10);
                                }
                                ((Method) method10).invoke(null, objArr85);
                                int i812 = AuthenticationRequestParameters;
                                int i813 = i812 & 43;
                                getSDKTransactionID = (i813 + ((i812 ^ 43) | i813)) % 128;
                            } else {
                                int i814 = (~iIntValue3) & iIntValue2;
                                int i815 = (~iIntValue2) & iIntValue3;
                                long j110 = ((long) ((i815 & i814) | (i814 ^ i815))) ^ 6536085740768460800L;
                                int i816 = AuthenticationRequestParameters;
                                int i817 = i816 & 47;
                                int i818 = (i816 ^ 47) | i817;
                                getSDKTransactionID = (((i817 | i818) << 1) - (i818 ^ i817)) % 128;
                                Object[] objArr86 = {Long.valueOf(j110), 1521803098L};
                                byte[] bArr14 = $$d;
                                Object[] objArr87 = new Object[1];
                                b(bArr14[90], (byte) (bArr14[243] - 1), (byte) (-bArr14[4]), objArr87);
                                Class<?> cls42 = Class.forName((String) objArr87[0]);
                                byte b32 = bArr14[23];
                                Object[] objArr88 = new Object[1];
                                b(b32, bArr14[99], b32, objArr88);
                                String str10 = (String) objArr88[0];
                                Class cls43 = Long.TYPE;
                                cls42.getMethod(str10, cls43, cls43).invoke(null, objArr86);
                                method7 = map5.get(560827737);
                                if (method7 != null) {
                                    objArr8 = null;
                                } else {
                                    objArr8 = null;
                                    method7 = ((Class) getMessageVersion.getSDKTransactionID(2750 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 54838), 28 - MotionEvent.axisFromString(""))).getMethod("getSDKAppID", null);
                                    map5.put(560827737, method7);
                                }
                                Integer num5 = (Integer) ((Method) method7).invoke(objInvoke, objArr8);
                                num5.intValue();
                                Object[] objArr89 = {objInvoke, num5, num};
                                method8 = map5.get(245738379);
                                if (method8 != null) {
                                    method8 = ((Class) getMessageVersion.getSDKTransactionID(2778 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (39468 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24)).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 2749, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 54838), AndroidCharacter.getMirror('0') - 19), cls3, cls3);
                                    map5.put(245738379, method8);
                                }
                                ((Method) method8).invoke(null, objArr89);
                                AuthenticationRequestParameters = (getSDKTransactionID + 103) % 128;
                            }
                            int i93 = AuthenticationRequestParameters;
                            int i94 = i93 & 93;
                            getSDKTransactionID = (((i93 | 93) & (~i94)) + (i94 << 1)) % 128;
                            return challengeResultCancelled;
                        } catch (Throwable th25) {
                            Throwable cause24 = th25.getCause();
                            if (cause24 != null) {
                                throw cause24;
                            }
                            throw th25;
                        }
                        map5 = getMessageVersion.timedout;
                        method5 = map5.get(693253393);
                        if (method5 != null) {
                            objArr6 = null;
                        } else {
                            objArr6 = null;
                            method5 = ((Class) getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (54838 - TextUtils.getOffsetAfter("", 0)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29)).getMethod("getSDKReferenceNumber", null);
                            map5.put(693253393, method5);
                        }
                        iIntValue2 = ((Integer) ((Method) method5).invoke(objInvoke, objArr6)).intValue();
                    } catch (Throwable th26) {
                        Throwable cause25 = th26.getCause();
                        if (cause25 != null) {
                            throw cause25;
                        }
                        throw th26;
                    }
                    if (i13 % 2 == 0) {
                        Class cls44 = (Class) getMessageVersion.getSDKTransactionID(171 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 10255), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                        byte[] bArr15 = $$d;
                        j11 = 0;
                        Object[] objArr210 = new Object[1];
                        b((short) 159, bArr15[13], bArr15[23], objArr210);
                        String str11 = (String) objArr210[0];
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[1] = byte[].class;
                        challengeResultCancelled = (atd.ai.ChallengeResultCancelled) cls44.getMethod(str11, clsArr2).invoke(sDKAppID$660ecda2, bytes);
                        if (bytes != null) {
                            Arrays.fill(bytes, (byte) 0);
                        }
                    } else {
                        j11 = 0;
                        Class cls45 = (Class) getMessageVersion.getSDKTransactionID(171 - ExpandableListView.getPackedPositionType(0L), (char) (Color.red(0) + 10255), 30 - View.getDefaultSize(0, 0));
                        byte[] bArr16 = $$d;
                        Object[] objArr211 = new Object[1];
                        b((short) 159, bArr16[13], bArr16[23], objArr211);
                        challengeResultCancelled = (atd.ai.ChallengeResultCancelled) cls45.getMethod((String) objArr211[0], byte[].class).invoke(sDKAppID$660ecda2, bytes);
                        if (bytes != null) {
                            Arrays.fill(bytes, (byte) 0);
                        }
                    }
                    Class cls111 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    i14 = $$b;
                    byte b114 = bArr[21];
                    Object[] objArr212 = new Object[1];
                    d((byte) (i14 - 3), b114, (byte) (b114 | 24), objArr212);
                    j12 = cls111.getField((String) objArr212[0]).getLong(null);
                    if (j12 != -1) {
                        int i310 = AuthenticationRequestParameters;
                        int i410 = i310 & 3;
                        int i411 = (i310 ^ 3) | i410;
                        getSDKTransactionID = ((i410 ^ i411) + ((i411 & i410) << 1)) % 128;
                        if (j12 + 1932 >= ((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue()) {
                            i25 = (-2) - ((AuthenticationRequestParameters + 74) ^ (-1));
                            getSDKTransactionID = i25 % 128;
                            if (i25 % 2 == 0) {
                                Class cls112 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 665, (char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.getCapsMode("", 0, 0) + 25);
                                Object[] objArr213 = new Object[1];
                                d(bArr[89], bArr[69], bArr[18], objArr213);
                                Object[] objArr214 = {cls112.getField((String) objArr213[0]).get(null), -2118021610, num};
                                map12 = getMessageVersion.timedout;
                                method17 = map12.get(1046315470);
                                if (method17 != null) {
                                    method17 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (Color.green(0) + 64314), 28 - TextUtils.getCapsMode("", 0, 0))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map12.put(1046315470, method17);
                                }
                                objArr3 = (Object[]) ((Method) method17).invoke(null, objArr214);
                            } else {
                                Class cls113 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1)) + 663, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 25 - View.combineMeasuredStates(0, 0));
                                Object[] objArr215 = new Object[1];
                                d(bArr[89], bArr[69], bArr[18], objArr215);
                                Object[] objArr216 = {cls113.getField((String) objArr215[0]).get(null), -2118021610, num};
                                map11 = getMessageVersion.timedout;
                                method16 = map11.get(1046315470);
                                if (method16 != null) {
                                    method16 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (KeyEvent.getDeadChar(0, 0) + 64314), (ViewConfiguration.getTapTimeout() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map11.put(1046315470, method16);
                                }
                                objArr3 = (Object[]) ((Method) method16).invoke(null, objArr216);
                            }
                            c11 = 1;
                        } else {
                            Object[] objArr314 = new Object[1];
                            c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr314);
                            Class<?> cls114 = Class.forName((String) objArr314[0]);
                            Object[] objArr315 = new Object[1];
                            c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr315);
                            int iIntValue9 = ((Integer) cls114.getMethod((String) objArr315[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                            int i412 = AuthenticationRequestParameters;
                            int i413 = i412 | 55;
                            getSDKTransactionID = (((i413 << 1) - (~(-((~(i412 & 55)) & i413)))) - 1) % 128;
                            Object[] objArr316 = {Integer.valueOf(iIntValue9), -2118021610};
                            byte[] bArr17 = $$d;
                            Object[] objArr317 = new Object[1];
                            b((short) 147, bArr17[136], (byte) (-bArr17[4]), objArr317);
                            Class<?> cls115 = Class.forName((String) objArr317[0]);
                            short s13 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                            byte b115 = bArr17[23];
                            Object[] objArr318 = new Object[1];
                            b(s13, b115, b115, objArr318);
                            objArr3 = (Object[]) cls115.getMethod((String) objArr318[0], cls3, cls3).invoke(null, objArr316);
                            Class cls116 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) Drawable.resolveOpacity(0, 0), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                            Object[] objArr319 = new Object[1];
                            d(bArr[89], bArr[69], bArr[18], objArr319);
                            cls116.getField((String) objArr319[0]).set(null, objArr3);
                            Long lValueOf7 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                            Class cls117 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.normalizeMetaState(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            byte b116 = bArr[21];
                            Object[] objArr3110 = new Object[1];
                            d((byte) (i14 - 3), b116, (byte) (b116 | 24), objArr3110);
                            cls117.getField((String) objArr3110[0]).set(null, lValueOf7);
                            int i414 = getSDKTransactionID;
                            c11 = 1;
                            AuthenticationRequestParameters = (((i414 ^ 83) - (~((i414 & 83) << 1))) - 1) % 128;
                        }
                    } else {
                        Object[] objArr3111 = new Object[1];
                        c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr3111);
                        Class<?> cls118 = Class.forName((String) objArr3111[0]);
                        Object[] objArr3112 = new Object[1];
                        c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr3112);
                        int iIntValue10 = ((Integer) cls118.getMethod((String) objArr3112[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                        int i415 = AuthenticationRequestParameters;
                        int i416 = i415 | 55;
                        getSDKTransactionID = (((i416 << 1) - (~(-((~(i415 & 55)) & i416)))) - 1) % 128;
                        Object[] objArr3113 = {Integer.valueOf(iIntValue10), -2118021610};
                        byte[] bArr18 = $$d;
                        Object[] objArr3114 = new Object[1];
                        b((short) 147, bArr18[136], (byte) (-bArr18[4]), objArr3114);
                        Class<?> cls119 = Class.forName((String) objArr3114[0]);
                        short s14 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                        byte b117 = bArr18[23];
                        Object[] objArr3115 = new Object[1];
                        b(s14, b117, b117, objArr3115);
                        objArr3 = (Object[]) cls119.getMethod((String) objArr3115[0], cls3, cls3).invoke(null, objArr3113);
                        Class cls1110 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) Drawable.resolveOpacity(0, 0), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        Object[] objArr3116 = new Object[1];
                        d(bArr[89], bArr[69], bArr[18], objArr3116);
                        cls1110.getField((String) objArr3116[0]).set(null, objArr3);
                        Long lValueOf8 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                        Class cls1111 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.normalizeMetaState(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        byte b118 = bArr[21];
                        Object[] objArr3117 = new Object[1];
                        d((byte) (i14 - 3), b118, (byte) (b118 | 24), objArr3117);
                        cls1111.getField((String) objArr3117[0]).set(null, lValueOf8);
                        int i417 = getSDKTransactionID;
                        c11 = 1;
                        AuthenticationRequestParameters = (((i417 ^ 83) - (~((i417 & 83) << 1))) - 1) % 128;
                    }
                    i15 = ((int[]) objArr3[c11])[0];
                    i16 = ((int[]) objArr3[0])[0];
                    if (i16 == i15) {
                        i24 = getSDKTransactionID + 33;
                        AuthenticationRequestParameters = i24 % 128;
                        if (i24 % 2 != 0) {
                            Object[] objArr414 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[1]), 1};
                            map10 = getMessageVersion.timedout;
                            method15 = map10.get(1046315470);
                            if (method15 != null) {
                                method15 = ((Class) getMessageVersion.getSDKTransactionID(2802 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (64314 - (ViewConfiguration.getEdgeSlop() >> 16)), 27 - ExpandableListView.getPackedPositionChild(j11))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                map10.put(1046315470, method15);
                            }
                            ((Method) method15).invoke(null, objArr414);
                        } else {
                            Object[] objArr415 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[0]), num};
                            map9 = getMessageVersion.timedout;
                            method14 = map9.get(1046315470);
                            if (method14 != null) {
                                method14 = ((Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (Color.rgb(0, 0, 0) + 16841530), TextUtils.indexOf((CharSequence) "", '0') + 29)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                map9.put(1046315470, method14);
                            }
                            ((Method) method14).invoke(null, objArr415);
                        }
                    } else {
                        new ArrayList().add((String) objArr3[2]);
                        long j111 = ((long) (((~i15) & i16) | ((~i16) & i15))) ^ (-1121146327233724416L);
                        int i418 = getSDKTransactionID;
                        int i513 = i418 ^ 85;
                        int i514 = (i418 & 85) << 1;
                        int i515 = (((i513 | i514) << 1) - (i514 ^ i513)) % 128;
                        AuthenticationRequestParameters = i515;
                        int i516 = ((i515 ^ 29) | (i515 & 29)) << 1;
                        int i517 = -((i515 & (-30)) | ((~i515) & 29));
                        getSDKTransactionID = (((i516 | i517) << 1) - (i516 ^ i517)) % 128;
                        Object[] objArr416 = {Long.valueOf(j111), -261037237L};
                        byte[] bArr19 = $$d;
                        Object[] objArr417 = new Object[1];
                        b((short) 100, (byte) (bArr19[159] - 1), (byte) (-bArr19[4]), objArr417);
                        Class<?> cls220 = Class.forName((String) objArr417[0]);
                        Object[] objArr418 = new Object[1];
                        b((short) 159, bArr19[13], bArr19[23], objArr418);
                        String str12 = (String) objArr418[0];
                        Class cls221 = Long.TYPE;
                        cls220.getMethod(str12, cls221, cls221).invoke(null, objArr416);
                        Object[] objArr419 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[0]), num};
                        map2 = getMessageVersion.timedout;
                        method2 = map2.get(1046315470);
                        if (method2 != null) {
                            method2 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - TextUtils.getOffsetBefore("", 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map2.put(1046315470, method2);
                        }
                        ((Method) method2).invoke(null, objArr419);
                        int i518 = getSDKTransactionID;
                        AuthenticationRequestParameters = ((((i518 | 107) << 1) - (~(-(((~i518) & 107) | (i518 & (-108)))))) - 1) % 128;
                    }
                    Class cls222 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 664, (char) TextUtils.indexOf("", ""), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25);
                    Object[] objArr420 = new Object[1];
                    d(bArr[8], bArr[21], bArr[89], objArr420);
                    j13 = cls222.getField((String) objArr420[0]).getLong(null);
                    if (j13 != -1) {
                        int i519 = AuthenticationRequestParameters;
                        i23 = (i519 & 49) + (i519 | 49);
                        getSDKTransactionID = i23 % 128;
                        if (i23 % 2 == 0) {
                            if ((j13 & 1996) >= ((Long) Class.forName(str).getDeclaredMethod(str4, new Class[1]).invoke(null, null)).longValue()) {
                                int i5110 = getSDKTransactionID;
                                AuthenticationRequestParameters = ((i5110 ^ 49) + ((i5110 & 49) << 1)) % 128;
                                Class cls223 = (Class) getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 665, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25);
                                byte b119 = bArr[21];
                                Object[] objArr4110 = new Object[1];
                                d(b119, (byte) (-bArr[94]), b119, objArr4110);
                                Object[] objArr4111 = {cls223.getField((String) objArr4110[0]).get(null), 1587322970, num};
                                map8 = getMessageVersion.timedout;
                                method13 = map8.get(1046315470);
                                if (method13 != null) {
                                    method13 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64313 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map8.put(1046315470, method13);
                                }
                                objArr5 = (Object[]) ((Method) method13).invoke(null, objArr4111);
                            } else {
                                Object[] objArr4112 = new Object[1];
                                c(false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{37, 26, 8, 26}, objArr4112);
                                Class<?> cls2110 = Class.forName((String) objArr4112[0]);
                                Object[] objArr51110 = new Object[1];
                                c(true, null, new int[]{63, 18, 111, 12}, objArr51110);
                                applicationContext = (Context) cls2110.getMethod((String) objArr51110[0], null).invoke(null, null);
                                if (applicationContext != null) {
                                    int i5111 = AuthenticationRequestParameters;
                                    i18 = ((i5111 | 5) << 1) - (i5111 ^ 5);
                                    getSDKTransactionID = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        applicationContext.getApplicationContext();
                                        throw null;
                                    }
                                    applicationContext = applicationContext.getApplicationContext();
                                    int i6118 = AuthenticationRequestParameters;
                                    int i6119 = i6118 & 123;
                                    int i61110 = ((i6118 ^ 123) | i6119) << 1;
                                    int i61111 = -((i6118 | 123) & (~i6119));
                                    getSDKTransactionID = ((i61110 & i61111) + (i61111 | i61110)) % 128;
                                }
                                Object[] objArr51111 = new Object[1];
                                c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr51111);
                                Class<?> cls2111 = Class.forName((String) objArr51111[0]);
                                Object[] objArr51112 = new Object[1];
                                c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr51112);
                                int iIntValue11 = ((Integer) cls2111.getMethod((String) objArr51112[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                                int i61112 = AuthenticationRequestParameters;
                                int i61113 = i61112 & 23;
                                int i61114 = -(-((i61112 ^ 23) | i61113));
                                int i61115 = ((i61113 & i61114) + (i61114 | i61113)) % 128;
                                getSDKTransactionID = i61115;
                                AuthenticationRequestParameters = (i61115 + 71) % 128;
                                Object[] objArr51113 = {applicationContext, Integer.valueOf(iIntValue11), 1587322970};
                                byte[] bArr110 = $$d;
                                Object[] objArr51114 = new Object[1];
                                b(bArr110[74], (byte) (-bArr110[193]), (byte) (-bArr110[4]), objArr51114);
                                Class<?> cls2112 = Class.forName((String) objArr51114[0]);
                                Object[] objArr51115 = new Object[1];
                                b((short) 159, bArr110[13], bArr110[23], objArr51115);
                                objArr4 = (Object[]) cls2112.getMethod((String) objArr51115[0], Context.class, cls3, cls3).invoke(null, objArr51113);
                                if (applicationContext != null) {
                                    int i61116 = AuthenticationRequestParameters;
                                    i17 = (((i61116 | 6) << 1) - (i61116 ^ 6)) - 1;
                                    getSDKTransactionID = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        Class cls2113 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.getOffsetBefore("", 0), (char) Color.alpha(0), (Process.myPid() >> 22) + 25);
                                        byte b1110 = bArr[21];
                                        Object[] objArr51116 = new Object[1];
                                        d(b1110, (byte) (-bArr[94]), b1110, objArr51116);
                                        cls2113.getField((String) objArr51116[0]).set(null, objArr4);
                                        lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, new Object[1])).longValue());
                                        cls = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                        Object[] objArr51117 = new Object[1];
                                        d(bArr[8], bArr[21], bArr[89], objArr51117);
                                        str2 = (String) objArr51117[0];
                                    } else {
                                        Class cls2114 = (Class) getMessageVersion.getSDKTransactionID(664 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 25);
                                        byte b1111 = bArr[21];
                                        Object[] objArr51118 = new Object[1];
                                        d(b1111, (byte) (-bArr[94]), b1111, objArr51118);
                                        cls2114.getField((String) objArr51118[0]).set(null, objArr4);
                                        lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                        cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1))), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                        Object[] objArr51119 = new Object[1];
                                        d(bArr[8], bArr[21], bArr[89], objArr51119);
                                        str2 = (String) objArr51119[0];
                                    }
                                    cls.getField(str2).set(null, lValueOf);
                                }
                                objArr5 = objArr4;
                            }
                        } else if (j13 + 1996 >= ((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue()) {
                            int i5112 = getSDKTransactionID;
                            AuthenticationRequestParameters = ((i5112 ^ 49) + ((i5112 & 49) << 1)) % 128;
                            Class cls224 = (Class) getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 665, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25);
                            byte b1112 = bArr[21];
                            Object[] objArr4113 = new Object[1];
                            d(b1112, (byte) (-bArr[94]), b1112, objArr4113);
                            Object[] objArr4114 = {cls224.getField((String) objArr4113[0]).get(null), 1587322970, num};
                            map8 = getMessageVersion.timedout;
                            method13 = map8.get(1046315470);
                            if (method13 != null) {
                                method13 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64313 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                map8.put(1046315470, method13);
                            }
                            objArr5 = (Object[]) ((Method) method13).invoke(null, objArr4114);
                        } else {
                            Object[] objArr4115 = new Object[1];
                            c(false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{37, 26, 8, 26}, objArr4115);
                            Class<?> cls2115 = Class.forName((String) objArr4115[0]);
                            Object[] objArr511110 = new Object[1];
                            c(true, null, new int[]{63, 18, 111, 12}, objArr511110);
                            applicationContext = (Context) cls2115.getMethod((String) objArr511110[0], null).invoke(null, null);
                            if (applicationContext != null) {
                                int i5113 = AuthenticationRequestParameters;
                                i18 = ((i5113 | 5) << 1) - (i5113 ^ 5);
                                getSDKTransactionID = i18 % 128;
                                if (i18 % 2 != 0) {
                                    applicationContext.getApplicationContext();
                                    throw null;
                                }
                                applicationContext = applicationContext.getApplicationContext();
                                int i61117 = AuthenticationRequestParameters;
                                int i61118 = i61117 & 123;
                                int i61119 = ((i61117 ^ 123) | i61118) << 1;
                                int i611110 = -((i61117 | 123) & (~i61118));
                                getSDKTransactionID = ((i61119 & i611110) + (i611110 | i61119)) % 128;
                            }
                            Object[] objArr511111 = new Object[1];
                            c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr511111);
                            Class<?> cls2116 = Class.forName((String) objArr511111[0]);
                            Object[] objArr511112 = new Object[1];
                            c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr511112);
                            int iIntValue12 = ((Integer) cls2116.getMethod((String) objArr511112[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                            int i611111 = AuthenticationRequestParameters;
                            int i611112 = i611111 & 23;
                            int i611113 = -(-((i611111 ^ 23) | i611112));
                            int i611114 = ((i611112 & i611113) + (i611113 | i611112)) % 128;
                            getSDKTransactionID = i611114;
                            AuthenticationRequestParameters = (i611114 + 71) % 128;
                            Object[] objArr511113 = {applicationContext, Integer.valueOf(iIntValue12), 1587322970};
                            byte[] bArr111 = $$d;
                            Object[] objArr511114 = new Object[1];
                            b(bArr111[74], (byte) (-bArr111[193]), (byte) (-bArr111[4]), objArr511114);
                            Class<?> cls2117 = Class.forName((String) objArr511114[0]);
                            Object[] objArr511115 = new Object[1];
                            b((short) 159, bArr111[13], bArr111[23], objArr511115);
                            objArr4 = (Object[]) cls2117.getMethod((String) objArr511115[0], Context.class, cls3, cls3).invoke(null, objArr511113);
                            if (applicationContext != null) {
                                int i611115 = AuthenticationRequestParameters;
                                i17 = (((i611115 | 6) << 1) - (i611115 ^ 6)) - 1;
                                getSDKTransactionID = i17 % 128;
                                if (i17 % 2 == 0) {
                                    Class cls2118 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.getOffsetBefore("", 0), (char) Color.alpha(0), (Process.myPid() >> 22) + 25);
                                    byte b1113 = bArr[21];
                                    Object[] objArr511116 = new Object[1];
                                    d(b1113, (byte) (-bArr[94]), b1113, objArr511116);
                                    cls2118.getField((String) objArr511116[0]).set(null, objArr4);
                                    lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, new Object[1])).longValue());
                                    cls = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                    Object[] objArr511117 = new Object[1];
                                    d(bArr[8], bArr[21], bArr[89], objArr511117);
                                    str2 = (String) objArr511117[0];
                                } else {
                                    Class cls2119 = (Class) getMessageVersion.getSDKTransactionID(664 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 25);
                                    byte b1114 = bArr[21];
                                    Object[] objArr511118 = new Object[1];
                                    d(b1114, (byte) (-bArr[94]), b1114, objArr511118);
                                    cls2119.getField((String) objArr511118[0]).set(null, objArr4);
                                    lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                    cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1))), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                    Object[] objArr511119 = new Object[1];
                                    d(bArr[8], bArr[21], bArr[89], objArr511119);
                                    str2 = (String) objArr511119[0];
                                }
                                cls.getField(str2).set(null, lValueOf);
                            }
                            objArr5 = objArr4;
                        }
                    } else {
                        Object[] objArr4116 = new Object[1];
                        c(false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{37, 26, 8, 26}, objArr4116);
                        Class<?> cls21110 = Class.forName((String) objArr4116[0]);
                        Object[] objArr5111110 = new Object[1];
                        c(true, null, new int[]{63, 18, 111, 12}, objArr5111110);
                        applicationContext = (Context) cls21110.getMethod((String) objArr5111110[0], null).invoke(null, null);
                        if (applicationContext != null) {
                            int i5114 = AuthenticationRequestParameters;
                            i18 = ((i5114 | 5) << 1) - (i5114 ^ 5);
                            getSDKTransactionID = i18 % 128;
                            if (i18 % 2 != 0) {
                                applicationContext.getApplicationContext();
                                throw null;
                            }
                            applicationContext = applicationContext.getApplicationContext();
                            int i611116 = AuthenticationRequestParameters;
                            int i611117 = i611116 & 123;
                            int i611118 = ((i611116 ^ 123) | i611117) << 1;
                            int i611119 = -((i611116 | 123) & (~i611117));
                            getSDKTransactionID = ((i611118 & i611119) + (i611119 | i611118)) % 128;
                        }
                        Object[] objArr5111111 = new Object[1];
                        c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr5111111);
                        Class<?> cls21111 = Class.forName((String) objArr5111111[0]);
                        Object[] objArr5111112 = new Object[1];
                        c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr5111112);
                        int iIntValue13 = ((Integer) cls21111.getMethod((String) objArr5111112[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
                        int i6111110 = AuthenticationRequestParameters;
                        int i6111111 = i6111110 & 23;
                        int i6111112 = -(-((i6111110 ^ 23) | i6111111));
                        int i6111113 = ((i6111111 & i6111112) + (i6111112 | i6111111)) % 128;
                        getSDKTransactionID = i6111113;
                        AuthenticationRequestParameters = (i6111113 + 71) % 128;
                        Object[] objArr5111113 = {applicationContext, Integer.valueOf(iIntValue13), 1587322970};
                        byte[] bArr112 = $$d;
                        Object[] objArr5111114 = new Object[1];
                        b(bArr112[74], (byte) (-bArr112[193]), (byte) (-bArr112[4]), objArr5111114);
                        Class<?> cls21112 = Class.forName((String) objArr5111114[0]);
                        Object[] objArr5111115 = new Object[1];
                        b((short) 159, bArr112[13], bArr112[23], objArr5111115);
                        objArr4 = (Object[]) cls21112.getMethod((String) objArr5111115[0], Context.class, cls3, cls3).invoke(null, objArr5111113);
                        if (applicationContext != null) {
                            int i6111114 = AuthenticationRequestParameters;
                            i17 = (((i6111114 | 6) << 1) - (i6111114 ^ 6)) - 1;
                            getSDKTransactionID = i17 % 128;
                            if (i17 % 2 == 0) {
                                Class cls21113 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.getOffsetBefore("", 0), (char) Color.alpha(0), (Process.myPid() >> 22) + 25);
                                byte b1115 = bArr[21];
                                Object[] objArr5111116 = new Object[1];
                                d(b1115, (byte) (-bArr[94]), b1115, objArr5111116);
                                cls21113.getField((String) objArr5111116[0]).set(null, objArr4);
                                lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, new Object[1])).longValue());
                                cls = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                Object[] objArr5111117 = new Object[1];
                                d(bArr[8], bArr[21], bArr[89], objArr5111117);
                                str2 = (String) objArr5111117[0];
                            } else {
                                Class cls21114 = (Class) getMessageVersion.getSDKTransactionID(664 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 25);
                                byte b1116 = bArr[21];
                                Object[] objArr5111118 = new Object[1];
                                d(b1116, (byte) (-bArr[94]), b1116, objArr5111118);
                                cls21114.getField((String) objArr5111118[0]).set(null, objArr4);
                                lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1))), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                Object[] objArr5111119 = new Object[1];
                                d(bArr[8], bArr[21], bArr[89], objArr5111119);
                                str2 = (String) objArr5111119[0];
                            }
                            cls.getField(str2).set(null, lValueOf);
                        }
                        objArr5 = objArr4;
                    }
                    i19 = ((int[]) objArr5[1])[0];
                    i21 = ((int[]) objArr5[0])[0];
                    if (i21 == i19) {
                        AuthenticationRequestParameters = ((-2) - ((getSDKTransactionID + 116) ^ (-1))) % 128;
                        Object[] objArr616 = {objArr5, Integer.valueOf(((int[]) objArr5[3])[0]), num};
                        map7 = getMessageVersion.timedout;
                        method12 = map7.get(1046315470);
                        if (method12 != null) {
                            method12 = ((Class) getMessageVersion.getSDKTransactionID(2803 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 64315), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map7.put(1046315470, method12);
                        }
                        ((Method) method12).invoke(null, objArr616);
                    } else {
                        int i712 = i19 & i21;
                        long j112 = ((long) (((i19 ^ i21) | i712) & (~i712))) ^ (-5687560886395338752L);
                        int i713 = (getSDKTransactionID + 21) % 128;
                        AuthenticationRequestParameters = i713;
                        getSDKTransactionID = ((-2) - ((i713 + 68) ^ (-1))) % 128;
                        Object[] objArr617 = {Long.valueOf(j112), -1324237950L};
                        byte[] bArr113 = $$d;
                        Object[] objArr618 = new Object[1];
                        b((short) 195, (byte) (bArr113[33] + 1), (byte) (-bArr113[4]), objArr618);
                        Class<?> cls317 = Class.forName((String) objArr618[0]);
                        Object[] objArr619 = new Object[1];
                        b((short) EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, bArr113[0], bArr113[23], objArr619);
                        String str13 = (String) objArr619[0];
                        Class cls318 = Long.TYPE;
                        cls317.getMethod(str13, cls318, cls318).invoke(null, objArr617);
                        Object[] objArr620 = {objArr5, Integer.valueOf(((int[]) objArr5[3])[0]), num};
                        map3 = getMessageVersion.timedout;
                        method3 = map3.get(1046315470);
                        if (method3 != null) {
                            method3 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method3);
                        }
                        ((Method) method3).invoke(null, objArr620);
                        int i714 = getSDKTransactionID;
                        int i715 = i714 & 47;
                        AuthenticationRequestParameters = (i715 + ((i714 ^ 47) | i715)) % 128;
                    }
                    Class cls319 = (Class) getMessageVersion.getSDKTransactionID(754 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (16829 - (ExpandableListView.getPackedPositionForChild(0, 0) > j11 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j11 ? 0 : -1))), 36 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)));
                    byte b211 = bArr[21];
                    Object[] objArr621 = new Object[1];
                    d(b211, (byte) (-bArr[94]), b211, objArr621);
                    j14 = cls319.getField((String) objArr621[0]).getLong(null);
                    if (j14 != -1) {
                        int i716 = getSDKTransactionID;
                        int i717 = i716 ^ 83;
                        int i718 = ((i716 & 83) | i717) << 1;
                        int i719 = -i717;
                        i22 = ((i718 | i719) << 1) - (i718 ^ i719);
                        AuthenticationRequestParameters = i22 % 128;
                        if (i22 % 2 != 0) {
                            if (j14 % 1936 >= ((Long) Class.forName(str).getDeclaredMethod(str4, new Class[1]).invoke(null, null)).longValue()) {
                                Class cls320 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + 754, (char) (16878 - AndroidCharacter.getMirror('0')), 35 - ExpandableListView.getPackedPositionGroup(j11));
                                Object[] objArr6110 = new Object[1];
                                d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr6110);
                                Object[] objArr6111 = {cls320.getField((String) objArr6110[0]).get(null), -1709429944, num};
                                map6 = getMessageVersion.timedout;
                                method11 = map6.get(245738379);
                                if (method11 != null) {
                                    method11 = ((Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 2778, (char) (39469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 24 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) + 2748, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54838), 29 - Color.green(0)), cls3, cls3);
                                    map6.put(245738379, method11);
                                }
                                objInvoke = ((Method) method11).invoke(null, objArr6111);
                                System.identityHashCode(getsdkreferencenumber);
                                System.identityHashCode(getsdkreferencenumber);
                            } else {
                                Object[] objArr6112 = new Object[1];
                                c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr6112);
                                Class<?> cls3110 = Class.forName((String) objArr6112[0]);
                                Object[] objArr6113 = new Object[1];
                                c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr6113);
                                Object[] objArr712 = {Integer.valueOf(((Integer) cls3110.getMethod((String) objArr6113[0], Object.class).invoke(null, getsdkreferencenumber)).intValue()), -1709429944};
                                map4 = getMessageVersion.timedout;
                                method4 = map4.get(-836670848);
                                if (method4 != null) {
                                    Class cls3111 = (Class) getMessageVersion.getSDKTransactionID(755 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16830), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35);
                                    byte b212 = (byte) (i14 - 3);
                                    byte b213 = bArr[21];
                                    Object[] objArr713 = new Object[1];
                                    d(b212, b213, (byte) (b213 | 24), objArr713);
                                    method4 = cls3111.getMethod((String) objArr713[0], cls3, cls3);
                                    map4.put(-836670848, method4);
                                }
                                objInvoke = ((Method) method4).invoke(null, objArr712);
                                Class cls3112 = (Class) getMessageVersion.getSDKTransactionID(754 - ExpandableListView.getPackedPositionGroup(j11), (char) ((Process.myPid() >> 22) + 16830), 35 - View.getDefaultSize(0, 0));
                                Object[] objArr714 = new Object[1];
                                d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr714);
                                cls3112.getField((String) objArr714[0]).set(null, objInvoke);
                                Long lValueOf9 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                                Class cls3113 = (Class) getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (16829 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 36);
                                byte b214 = bArr[21];
                                Object[] objArr715 = new Object[1];
                                d(b214, (byte) (-bArr[94]), b214, objArr715);
                                cls3113.getField((String) objArr715[0]).set(null, lValueOf9);
                                int i7110 = AuthenticationRequestParameters;
                                getSDKTransactionID = ((((i7110 | 44) << 1) - (i7110 ^ 44)) - 1) % 128;
                            }
                        } else if (j14 + 1936 >= ((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue()) {
                            Class cls321 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + 754, (char) (16878 - AndroidCharacter.getMirror('0')), 35 - ExpandableListView.getPackedPositionGroup(j11));
                            Object[] objArr6114 = new Object[1];
                            d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr6114);
                            Object[] objArr6115 = {cls321.getField((String) objArr6114[0]).get(null), -1709429944, num};
                            map6 = getMessageVersion.timedout;
                            method11 = map6.get(245738379);
                            if (method11 != null) {
                                method11 = ((Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 2778, (char) (39469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 24 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) + 2748, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54838), 29 - Color.green(0)), cls3, cls3);
                                map6.put(245738379, method11);
                            }
                            objInvoke = ((Method) method11).invoke(null, objArr6115);
                            System.identityHashCode(getsdkreferencenumber);
                            System.identityHashCode(getsdkreferencenumber);
                        } else {
                            Object[] objArr6116 = new Object[1];
                            c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr6116);
                            Class<?> cls3114 = Class.forName((String) objArr6116[0]);
                            Object[] objArr6117 = new Object[1];
                            c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr6117);
                            Object[] objArr716 = {Integer.valueOf(((Integer) cls3114.getMethod((String) objArr6117[0], Object.class).invoke(null, getsdkreferencenumber)).intValue()), -1709429944};
                            map4 = getMessageVersion.timedout;
                            method4 = map4.get(-836670848);
                            if (method4 != null) {
                                Class cls3115 = (Class) getMessageVersion.getSDKTransactionID(755 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16830), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35);
                                byte b215 = (byte) (i14 - 3);
                                byte b216 = bArr[21];
                                Object[] objArr717 = new Object[1];
                                d(b215, b216, (byte) (b216 | 24), objArr717);
                                method4 = cls3115.getMethod((String) objArr717[0], cls3, cls3);
                                map4.put(-836670848, method4);
                            }
                            objInvoke = ((Method) method4).invoke(null, objArr716);
                            Class cls3116 = (Class) getMessageVersion.getSDKTransactionID(754 - ExpandableListView.getPackedPositionGroup(j11), (char) ((Process.myPid() >> 22) + 16830), 35 - View.getDefaultSize(0, 0));
                            Object[] objArr718 = new Object[1];
                            d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr718);
                            cls3116.getField((String) objArr718[0]).set(null, objInvoke);
                            Long lValueOf10 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                            Class cls3117 = (Class) getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (16829 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 36);
                            byte b217 = bArr[21];
                            Object[] objArr719 = new Object[1];
                            d(b217, (byte) (-bArr[94]), b217, objArr719);
                            cls3117.getField((String) objArr719[0]).set(null, lValueOf10);
                            int i7111 = AuthenticationRequestParameters;
                            getSDKTransactionID = ((((i7111 | 44) << 1) - (i7111 ^ 44)) - 1) % 128;
                        }
                    } else {
                        Object[] objArr6118 = new Object[1];
                        c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr6118);
                        Class<?> cls3118 = Class.forName((String) objArr6118[0]);
                        Object[] objArr6119 = new Object[1];
                        c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr6119);
                        Object[] objArr7110 = {Integer.valueOf(((Integer) cls3118.getMethod((String) objArr6119[0], Object.class).invoke(null, getsdkreferencenumber)).intValue()), -1709429944};
                        map4 = getMessageVersion.timedout;
                        method4 = map4.get(-836670848);
                        if (method4 != null) {
                            Class cls3119 = (Class) getMessageVersion.getSDKTransactionID(755 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16830), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35);
                            byte b218 = (byte) (i14 - 3);
                            byte b219 = bArr[21];
                            Object[] objArr7111 = new Object[1];
                            d(b218, b219, (byte) (b219 | 24), objArr7111);
                            method4 = cls3119.getMethod((String) objArr7111[0], cls3, cls3);
                            map4.put(-836670848, method4);
                        }
                        objInvoke = ((Method) method4).invoke(null, objArr7110);
                        Class cls31110 = (Class) getMessageVersion.getSDKTransactionID(754 - ExpandableListView.getPackedPositionGroup(j11), (char) ((Process.myPid() >> 22) + 16830), 35 - View.getDefaultSize(0, 0));
                        Object[] objArr7112 = new Object[1];
                        d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr7112);
                        cls31110.getField((String) objArr7112[0]).set(null, objInvoke);
                        Long lValueOf11 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                        Class cls31111 = (Class) getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (16829 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 36);
                        byte b2110 = bArr[21];
                        Object[] objArr7113 = new Object[1];
                        d(b2110, (byte) (-bArr[94]), b2110, objArr7113);
                        cls31111.getField((String) objArr7113[0]).set(null, lValueOf11);
                        int i7112 = AuthenticationRequestParameters;
                        getSDKTransactionID = ((((i7112 | 44) << 1) - (i7112 ^ 44)) - 1) % 128;
                    }
                } catch (Throwable th27) {
                    Throwable cause26 = th27.getCause();
                    if (cause26 != null) {
                        throw cause26;
                    }
                    throw th27;
                }
                Object[] objArr90 = {context, Integer.valueOf(iIntValue), 209657836};
                short s15 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE;
                byte[] bArr20 = $$d;
                byte b33 = (byte) (bArr20[243] - 1);
                byte b34 = (byte) (-bArr20[4]);
                Object[] objArr91 = new Object[1];
                b(s15, b33, b34, objArr91);
                Class<?> cls46 = Class.forName((String) objArr91[0]);
                bArr = bArr2;
                Object[] objArr92 = new Object[1];
                b((short) EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, bArr20[0], bArr20[23], objArr92);
                Object[] objArr93 = (Object[]) cls46.getMethod((String) objArr92[0], Context.class, cls3, cls3).invoke(null, objArr90);
                if (context != null) {
                    int i95 = AuthenticationRequestParameters;
                    getSDKTransactionID = ((i95 ^ 3) + ((i95 & 3) << 1)) % 128;
                    Class cls47 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.indexOf("", "", 0, 0), (char) ((-1) - Process.getGidForName("")), 25 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    Object[] objArr94 = new Object[1];
                    d((byte) $$b, bArr[21], (byte) (-bArr[87]), objArr94);
                    cls47.getField((String) objArr94[0]).set(null, objArr93);
                    try {
                        Long lValueOf12 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str4, null).invoke(null, null)).longValue());
                        Class cls48 = (Class) getMessageVersion.getSDKTransactionID(664 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), 25 - View.getDefaultSize(0, 0));
                        Object[] objArr95 = new Object[1];
                        d(bArr[89], bArr[21], (byte) (-bArr[6]), objArr95);
                        cls48.getField((String) objArr95[0]).set(null, lValueOf12);
                        int i96 = getSDKTransactionID;
                        AuthenticationRequestParameters = (((i96 & 16) + (i96 | 16)) - 1) % 128;
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                objArr2 = objArr93;
                i11 = ((int[]) objArr2[1])[0];
                i12 = ((int[]) objArr2[0])[0];
                if (i12 == i11) {
                    getSDKTransactionID = (AuthenticationRequestParameters + 35) % 128;
                    Object[] objArr110 = {objArr2, Integer.valueOf(((int[]) objArr2[3])[0]), num};
                    map13 = getMessageVersion.timedout;
                    method18 = map13.get(1046315470);
                    if (method18 != null) {
                        method18 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarFadeDuration() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map13.put(1046315470, method18);
                    }
                    ((Method) method18).invoke(null, objArr110);
                    int i311 = AuthenticationRequestParameters;
                    int i312 = i311 ^ 41;
                    getSDKTransactionID = ((((i311 & 41) | i312) << 1) - i312) % 128;
                } else {
                    int i313 = i11 & i12;
                    long j113 = ((long) (((i11 ^ i12) | i313) & (~i313))) ^ (-7533677128890449920L);
                    int i314 = getSDKTransactionID;
                    AuthenticationRequestParameters = (((i314 & 89) - (~(-(-(i314 | 89))))) - 1) % 128;
                    Object[] objArr111 = {Long.valueOf(j113), -1754070891L};
                    byte[] bArr21 = $$d;
                    Object[] objArr112 = objArr2;
                    Object[] objArr217 = new Object[1];
                    b((short) 195, (byte) (bArr21[33] + 1), (byte) (-bArr21[4]), objArr217);
                    Class<?> cls49 = Class.forName((String) objArr217[0]);
                    Object[] objArr218 = new Object[1];
                    b((short) EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, bArr21[0], bArr21[23], objArr218);
                    String str14 = (String) objArr218[0];
                    Class cls50 = Long.TYPE;
                    cls49.getMethod(str14, cls50, cls50).invoke(null, objArr111);
                    Object[] objArr219 = {objArr112, Integer.valueOf(((int[]) objArr112[3])[0]), num};
                    map = getMessageVersion.timedout;
                    method = map.get(1046315470);
                    if (method != null) {
                        method = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) ((Process.myTid() >> 22) + 64314), (ViewConfiguration.getTouchSlop() >> 8) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map.put(1046315470, method);
                    }
                    ((Method) method).invoke(null, objArr219);
                }
                getsdkreferencenumber.getDeviceData.add(sDKAppID$660ecda2);
                int i315 = AuthenticationRequestParameters;
                int i316 = i315 & 99;
                i13 = (i316 - (~((i315 ^ 99) | i316))) - 1;
                getSDKTransactionID = i13 % 128;
            } catch (Throwable th28) {
                Throwable cause27 = th28.getCause();
                if (cause27 != null) {
                    throw cause27;
                }
                throw th28;
            }
            str = str3;
            Object[] objArr96 = new Object[1];
            c(false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{37, 26, 8, 26}, objArr96);
            Class<?> cls51 = Class.forName((String) objArr96[0]);
            Object[] objArr97 = new Object[1];
            c(true, null, new int[]{63, 18, 111, 12}, objArr97);
            Context applicationContext2 = (Context) cls51.getMethod((String) objArr97[0], null).invoke(null, null);
            if (applicationContext2 != null) {
                int i97 = AuthenticationRequestParameters;
                int i98 = i97 ^ 27;
                getSDKTransactionID = (((((i97 & 27) | i98) << 1) - (~(-i98))) - 1) % 128;
                applicationContext2 = applicationContext2.getApplicationContext();
            }
            Object[] objArr98 = new Object[1];
            c(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{81, 16, 0, 5}, objArr98);
            Class<?> cls52 = Class.forName((String) objArr98[0]);
            context = applicationContext2;
            Object[] objArr99 = new Object[1];
            c(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{97, 16, 67, 0}, objArr99);
            iIntValue = ((Integer) cls52.getMethod((String) objArr99[0], Object.class).invoke(null, getsdkreferencenumber)).intValue();
            int i99 = getSDKTransactionID;
            AuthenticationRequestParameters = (((i99 | 93) << 1) - (i99 ^ 93)) % 128;
        } catch (GeneralSecurityException | JSONException unused5) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    static void init$0() {
        $$a = new byte[]{33, -44, 93, -79, -4, 13, -35, -17, 5, -12, 45, -2, -41, -7, -4, 13, -50, 31, 15, -15, -8, 0, -35, 27, 17, -21, -4, 13, -35, -17, 5, 7, 28, -19, 11, 3, -20, 0, 15, -13, 4, -3, -39, -7, 49, -14, 1, -10, -35, 42, -3, -10, 1, -4, -4, 13, -35, -17, 5, 5, 17, -1, -3, 11, -15, 7, -13, 0, -25, 37, -10, -13, 1, 11, 50, -3, -14, -5, 7, 4, -13, -8, -4, 17, -13, 4, -3, -30, 17, 10, 2, -18, 12, -1, -38, 15, 15, -19, 10, -10, 13, -17, 11, -1};
        $$b = 9;
    }

    static void init$1() {
        $$d = new byte[]{8, -110, -18, -108, -1, -18, 30, 12, -10, 7, -50, -3, 36, 2, -22, 13, 51, -57, 51, -22, -55, -2, 9, 0, -12, -9, 8, 3, -1, -22, 8, -9, -2, 25, -22, -15, -7, 13, -17, -4, 33, -20, -20, 14, -15, 5, -18, 12, -16, -4, 76, -17, -1, -18, 30, 12, -10, -12, -33, 14, -16, -8, 15, -5, -20, 8, -9, -2, 34, 2, -22, 13, 51, -77, 71, -24, -40, 4, -14, -3, 4, -12, 4, -1, Tnaf.POW_2_WIDTH, -22, -17, -5, 6, -11, 38, -44, 77, -70, -1, -18, 45, -36, -20, 10, 3, -5, 30, -32, -22, Tnaf.POW_2_WIDTH, -1, -18, 45, -36, -20, 10, 3, -5, 30, -32, -22, Tnaf.POW_2_WIDTH, -22, 13, 51, -66, 60, -60, -1, -18, 48, -38, -3, -8, -14, 8, -9, -2, 10, -14, 37, -36, -18, Tnaf.POW_2_WIDTH, -11, -6, -10, 76, -70, -1, -18, 30, 12, -10, -10, -22, -4, -2, -16, 10, -12, 8, -5, 20, -42, 5, 8, -6, -16, -22, 13, 51, -55, 49, -60, -1, -18, 30, 12, -10, 3, -46, 5, 0, -11, 5, -16, 14, -14, 25, -40, Tnaf.POW_2_WIDTH, -13, 0, 3, 21, -29, -23, -22, 13, 51, -54, -3, 48, -24, -40, 4, -14, -3, 4, -12, 4, -1, Tnaf.POW_2_WIDTH, -22, -17, -5, 6, -11, 77, -70, -1, -18, 30, 12, -10, 7, -50, -3, 36, 2, -22, 13, 51, -66, 60, -60, -1, -18, 30, 12, -10, 7, -50, -3, 36, 2, 29, -70, -1, -18, 30, 12, -10, -10, -22, -4, -2, -16, 10, -12, 8, -5, 20, -42, 5, 8, -6, -16, -1, -18, 30, 12, -10, -10, -22, -4, -2, -16, 10, -12, 8, -5, 20, -42, 5, 8, -6, -16};
        $$e = 54;
    }

    static void init$2() {
        $$g = new byte[]{81, 2, -35, -124};
        $$h = EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }

    final void getSDKAppID() {
        AuthenticationRequestParameters(new Object[]{this}, -2134745698, 2134745698, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = i11 ^ 79;
        int i13 = ((i11 & 79) | i12) << 1;
        int i14 = -i12;
        AuthenticationRequestParameters = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        ArrayList<Object> arrayList = getsdkreferencenumber.getDeviceData;
        if (arrayList != null) {
            int i15 = i11 & 111;
            int i16 = -(-(i11 | 111));
            int i17 = (i15 & i16) + (i16 | i15);
            AuthenticationRequestParameters = i17 % 128;
            if (i17 % 2 != 0) {
                arrayList.iterator();
                throw null;
            }
            for (Object obj : arrayList) {
                int i18 = AuthenticationRequestParameters;
                getSDKTransactionID = ((i18 & 101) + (i18 | 101)) % 128;
                if (obj != null) {
                    int i19 = AuthenticationRequestParameters;
                    getSDKTransactionID = (((i19 ^ 53) - (~(-(-((i19 & 53) << 1))))) - 1) % 128;
                    try {
                        Map map = getMessageVersion.timedout;
                        Object method = map.get(-1364614541);
                        if (method == null) {
                            Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 171, (char) (ExpandableListView.getPackedPositionType(0L) + 10255), TextUtils.lastIndexOf("", '0', 0, 0) + 31);
                            short s11 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                            byte b11 = $$d[23];
                            Object[] objArr2 = new Object[1];
                            b(s11, b11, b11, objArr2);
                            method = cls.getMethod((String) objArr2[0], null);
                            map.put(-1364614541, method);
                        }
                        ((Method) method).invoke(obj, null);
                        int i21 = AuthenticationRequestParameters;
                        int i22 = i21 & 103;
                        int i23 = i21 | 103;
                        getSDKTransactionID = (((i22 | i23) << 1) - (i23 ^ i22)) % 128;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                }
                int i24 = getSDKTransactionID;
                AuthenticationRequestParameters = (((i24 | 105) << 1) - (i24 ^ 105)) % 128;
            }
            getsdkreferencenumber.getDeviceData.clear();
            getsdkreferencenumber.getDeviceData = null;
            int i25 = getSDKTransactionID;
            int i26 = i25 & 39;
            int i27 = (i25 | 39) & (~i26);
            int i28 = i26 << 1;
            AuthenticationRequestParameters = (((i27 | i28) << 1) - (i27 ^ i28)) % 128;
        }
        int i29 = AuthenticationRequestParameters;
        int i31 = (i29 & (-46)) | ((~i29) & 45);
        int i32 = (i29 & 45) << 1;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        getSDKTransactionID = i33 % 128;
        if (i33 % 2 == 0) {
            int i34 = 14 / 0;
        }
        return null;
    }

    public final atd.ai.ChallengeResultCancelled getSDKAppID(atd.ai.getSDKReferenceNumber getsdkreferencenumber, JSONObject jSONObject) {
        return (atd.ai.ChallengeResultCancelled) AuthenticationRequestParameters(new Object[]{this, getsdkreferencenumber, jSONObject}, -1196160154, 1196160155, System.identityHashCode(this));
    }
}
