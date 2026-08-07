package atd.h;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeStatusReceiver;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformationFactory;", "", "<init>", "()V", "create", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformation;", Kind.APPLICATION, "Landroid/app/Application;", "configParameters", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "warnings", "", "Lcom/adyen/threeds2/Warning;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    public static final getSDKReferenceNumber getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters();
        getSDKAppID = new getSDKReferenceNumber();
        ChallengeResult = (ChallengeResultCancelled + 81) % 128;
    }

    private getSDKReferenceNumber() {
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = new char[]{64694, 64683, 64693, 64679, 64680, 64686, 64747, 64676, 64708, 64670, 64677, 64690, 64682, 64724, 64685, 64692, 64684, 64681, 64711, 64687, 64675, 64688, 64721, 64689, 64726, 64709, 64674};
        getDeviceData = -185467623;
        getSDKReferenceNumber = true;
        AuthenticationRequestParameters = true;
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        float f11;
        int i12;
        long j11;
        char[] cArr;
        float f12;
        Object method;
        String str3 = str2;
        $11 = ($10 + 97) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr2 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        float f13 = BitmapDescriptorFactory.HUE_RED;
        if (cArr2 != null) {
            $11 = ($10 + 113) % 128;
            int length = cArr2.length;
            j11 = 0;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                int i14 = $10 + 41;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj != null) {
                            f12 = f13;
                            method = obj;
                        } else {
                            f12 = f13;
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (PointF.length(f13, f13) > f12 ? 1 : (PointF.length(f13, f13) == f12 ? 0 : -1)), (char) (AudioTrack.getMinVolume() > f12 ? 1 : (AudioTrack.getMinVolume() == f12 ? 0 : -1)), 32 - Color.argb(0, 0, 0, 0))).getMethod("o", cls);
                            map.put(508097192, method);
                        }
                        cArr3[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    cArr2 = cArr2;
                    cArr3 = cArr3;
                    f12 = f13;
                    Object[] objArr3 = {Integer.valueOf(cArr2[i13])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(508097192);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - Color.argb(0, 0, 0, 0), (char) Color.blue(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31)).getMethod("o", cls);
                        map2.put(508097192, method2);
                    }
                    cArr3[i13] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i13++;
                }
                cArr3 = cArr3;
                f13 = f12;
                cArr2 = cArr2;
            }
            f11 = f13;
            i12 = 2;
            $11 = ($10 + 33) % 128;
            cArr2 = cArr3;
        } else {
            f11 = 0.0f;
            i12 = 2;
            j11 = 0;
        }
        Object[] objArr4 = {Integer.valueOf(getDeviceData)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method3 = map3.get(-852383591);
        if (method3 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - Color.green(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), ((byte) KeyEvent.getModifierMetaStateMask()) + 18);
            byte b11 = (byte) 0;
            byte b12 = (byte) (b11 - 1);
            Object[] objArr5 = new Object[1];
            d(b11, b12, (byte) (-b12), objArr5);
            method3 = cls2.getMethod((String) objArr5[0], cls);
            map3.put(-852383591, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
        if (AuthenticationRequestParameters) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr4 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i15 = challengeStatusReceiver.getDeviceData;
                int i16 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i15] = (char) (cArr2[bArr[(i16 - 1) - i15] + i11] - iIntValue);
                Object[] objArr6 = new Object[i12];
                objArr6[1] = challengeStatusReceiver;
                objArr6[0] = challengeStatusReceiver;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    float f14 = f11;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - (ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)), (char) (PointF.length(f14, f14) > f14 ? 1 : (PointF.length(f14, f14) == f14 ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50);
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr7 = new Object[1];
                    d(b13, b14, (byte) (b14 + 1), objArr7);
                    method4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                i12 = 2;
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
        } else if (getSDKReferenceNumber) {
            int i17 = $10 + 107;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                int length3 = charArray.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                cArr = new char[length3];
                challengeStatusReceiver.getDeviceData = 1;
            } else {
                int length4 = charArray.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                cArr = new char[length4];
                challengeStatusReceiver.getDeviceData = 0;
            }
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i18] = (char) (cArr2[charArray[(i19 - 1) - i18] - i11] - iIntValue);
                Object[] objArr8 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map5 = atd.a.getMessageVersion.timedout;
                Object method5 = map5.get(-249860496);
                if (method5 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 50);
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr9 = new Object[1];
                    d(b15, b16, (byte) (b16 + 1), objArr9);
                    method5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-249860496, method5);
                }
                ((Method) method5).invoke(null, objArr8);
            }
        } else {
            int length5 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length5;
            char[] cArr5 = new char[length5];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i21 = challengeStatusReceiver.getDeviceData;
                int i22 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    $11 = ($10 + 25) % 128;
                    cArr5[i21] = (char) (cArr2[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i21 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            byte[] r0 = atd.h.getSDKReferenceNumber.$$a
            int r8 = r8 * 2
            int r8 = 94 - r8
            int r7 = r7 * 2
            int r7 = 31 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + 2
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKReferenceNumber.b(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = 254 - r5
            int r0 = r6 + 13
            byte[] r1 = atd.h.getSDKReferenceNumber.$$d
            int r7 = r7 * 6
            int r7 = r7 + 97
            byte[] r0 = new byte[r0]
            int r6 = r6 + 12
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r5
            r4 = r6
            r3 = r2
            goto L2a
        L15:
            r3 = r7
            r7 = r5
            r5 = r3
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKReferenceNumber.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r0 = r5 + 1
            int r7 = r7 * 2
            int r7 = 109 - r7
            byte[] r1 = atd.h.getSDKReferenceNumber.$$g
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
        L29:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKReferenceNumber.d(short, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{59, 90, 71, -86, -4, 13, -50, 31, 15, -15, -8, 0, -35, 27, 17, -21, -4, 13, -35, -17, 5, 5, 17, -1, -3, 11, -15, 7, -13, 0, -25, 37, -10, -13, 1, 11, 50, -3, -14, -5, 7, 4, -13, -8, -4, 17, -13, 4, -3, -30, 17, 10, 2, -18, 12, -1, -38, 15, 15, -19, 10, -10, 13, -17, 11, -1, -4, 13, -35, -17, 5, -12, 45, -2, -41, -7, -4, 13, -35, -17, 5, 7, 28, -19, 11, 3, -20, 0, 15, -13, 4, -3, -39, -7, 49, -14, 1, -10, -35, 42, -3, -10, 1, -4};
        $$b = 28;
    }

    static void init$1() {
        $$d = new byte[]{75, 34, 0, 64, -24, 11, 49, -79, 69, -26, -42, 2, -16, -5, 2, -14, 2, -3, 13, -38, 14, -24, -6, -3, 28, -24, -3, -7, -9, -18, 12, -18, 73, -72, -3, -20, 43, -38, -22, 8, 1, -7, 28, -34, -24, 14, -3, -20, 28, 10, -12, -14, -35, 12, -18, -10, 13, -7, -22, 6, -11, -4, 32, 0, -24, 11, 49, -68, 58, -62, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0, 27, -72, -3, -20, 28, 10, -12, -12, -24, -6, -4, -18, 8, -14, 6, -7, 18, -44, 3, 6, -8, -18, -3, -20, 28, 10, -12, -12, -24, -6, -4, -18, 8, -14, 6, -7, 18, -44, 3, 6, -8, -18, -24, 11, 49, -67, 57, -62, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0, 27, -72, -3, -20, 28, 10, -12, -12, -24, -6, -4, -18, 8, -14, 6, -7, 18, -44, 3, 6, -8, -18, -24, 11, 49, -67, 57, -26, -42, 2, -16, -5, 2, -14, 2, -3, 14, -24, -19, -7, 4, -13, 27, -26, -9, 3, -15, -11, -4, -24, 11, 49, -66, 56, -62, -3, -20, 28, 10, -12, -12, -24, -6, -4, -18, 8, -14, 6, -7, 18, -44, 3, 6, -8, -18, -24, 11, 49, -57, 47, -62, -3, -20, 28, 10, -12, 1, -48, 3, -2, -13, 3, -18, 12, -16, 23, -42, 14, -15, -2, 1, 19, -31, -25, -3, -20, 43, -38, -22, 8, 1, -7, 28, -34, -24, 14, -24, 11, 49, -78, 68, -62, -3, -20, 28, 10, -12, 1, -48, 3, -2, -13, 3, -18, 12, -16, 23, -42, 14, -15, -2, 1, 19, -31, -25, 80, -72, -3, -20, 43, -38, -22, 8, 1, -7, 28, -34, -24, 14};
        $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE;
    }

    static void init$2() {
        $$g = new byte[]{102, 100, -115, -8};
        $$h = EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x08da  */
    /* JADX WARN: Code duplicated, block: B:105:0x08dc A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0934  */
    /* JADX WARN: Code duplicated, block: B:109:0x0935 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:125:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:129:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:134:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:141:0x0c19  */
    /* JADX WARN: Code duplicated, block: B:142:0x0c1a A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0c4c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0cd1  */
    /* JADX WARN: Code duplicated, block: B:151:0x0cd2 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0d3f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0e1e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0f38  */
    /* JADX WARN: Code duplicated, block: B:179:0x0f55  */
    /* JADX WARN: Code duplicated, block: B:180:0x0f56 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0f8b  */
    /* JADX WARN: Code duplicated, block: B:188:0x101f  */
    /* JADX WARN: Code duplicated, block: B:189:0x1020 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x114e  */
    /* JADX WARN: Code duplicated, block: B:206:0x1191  */
    /* JADX WARN: Code duplicated, block: B:208:0x119f  */
    /* JADX WARN: Code duplicated, block: B:210:0x11a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x122a  */
    /* JADX WARN: Code duplicated, block: B:217:0x1238  */
    /* JADX WARN: Code duplicated, block: B:221:0x12c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x1366  */
    /* JADX WARN: Code duplicated, block: B:232:0x1383  */
    /* JADX WARN: Code duplicated, block: B:233:0x1384 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x13b3  */
    /* JADX WARN: Code duplicated, block: B:241:0x1439  */
    /* JADX WARN: Code duplicated, block: B:242:0x143a A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x14a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:290:0x14ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x149d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:34:0x0300 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0337  */
    /* JADX WARN: Code duplicated, block: B:41:0x035d  */
    /* JADX WARN: Code duplicated, block: B:42:0x035e A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0396  */
    /* JADX WARN: Code duplicated, block: B:50:0x045f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0460 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x04db  */
    /* JADX WARN: Code duplicated, block: B:70:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0628  */
    /* JADX WARN: Code duplicated, block: B:74:0x0629 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0716  */
    /* JADX WARN: Code duplicated, block: B:82:0x0718 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0761  */
    /* JADX WARN: Code duplicated, block: B:86:0x0763 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x07a7 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:92:0x07b6 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x080c  */
    /* JADX WARN: Code duplicated, block: B:96:0x080d A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:7:0x0123, B:11:0x0179, B:31:0x02e2, B:35:0x032c, B:64:0x0567, B:68:0x05dd, B:79:0x0707, B:83:0x0748, B:87:0x0799, B:89:0x07a7, B:93:0x07e6, B:97:0x085f, B:117:0x0a34, B:121:0x0a78, B:139:0x0c03, B:143:0x0c44, B:163:0x0dc6, B:167:0x0e10, B:177:0x0f3f, B:181:0x0f82, B:197:0x10f0, B:201:0x1139, B:230:0x136d, B:234:0x13ab, B:233:0x1384, B:239:0x1423, B:243:0x1464, B:242:0x143a, B:200:0x110c, B:180:0x0f56, B:186:0x1009, B:190:0x104e, B:189:0x1020, B:166:0x0de2, B:142:0x0c1a, B:148:0x0cbb, B:152:0x0cfd, B:151:0x0cd2, B:120:0x0a50, B:96:0x080d, B:92:0x07b6, B:102:0x08d0, B:106:0x090d, B:110:0x0988, B:109:0x0935, B:105:0x08dc, B:86:0x0763, B:82:0x0718, B:67:0x058c, B:71:0x0604, B:75:0x066e, B:74:0x0629, B:34:0x0300, B:39:0x0340, B:43:0x038f, B:42:0x035e, B:48:0x0440, B:52:0x048f, B:51:0x0460, B:10:0x0144, B:18:0x01b2, B:22:0x0228, B:21:0x01db), top: B:282:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0868  */
    public final getDeviceData s_(Application application, ConfigParameters configParameters, List<? extends Warning> list) throws Throwable {
        int i11;
        String str;
        Integer num;
        Object[] objArr;
        char c11;
        int i12;
        int i13;
        char c12;
        Map map;
        Object method;
        long j11;
        Map map2;
        Object method2;
        Object objInvoke;
        Map map3;
        Object method3;
        Object[] objArr2;
        int iIntValue;
        Object method4;
        Object[] objArr3;
        int iIntValue2;
        Object method5;
        Object[] objArr4;
        Object method6;
        long j12;
        Context applicationContext;
        Context context;
        Object[] objArr5;
        Object[] objArr6;
        int i14;
        int i15;
        Object method7;
        long j13;
        char c13;
        char c14;
        Object[] objArr7;
        int i16;
        int i17;
        Object method8;
        long j14;
        Context applicationContext2;
        Object[] objArr8;
        Object[] objArr9;
        int i18;
        Long lValueOf;
        Class cls;
        Object obj;
        int i19;
        int i21;
        int i22;
        Object method9;
        ArrayList arrayList;
        Object method10;
        Object method11;
        int i23;
        Object method12;
        Object method13;
        Object[] objArr10;
        Object method14;
        int i24;
        int i25;
        Map map4;
        Object method15;
        Map map5;
        Object method16;
        Object[] objArr11 = new Object[1];
        a(null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr11);
        String strIntern = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr12);
        String strIntern2 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        a(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), "\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0096\u0082\u0081\u008f\u0087\u0081\u0095\u0081\u0094", objArr13);
        String strIntern3 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u008c\u0083\u0085\u008e\u0098\u0088\u0081\u0097\u008a\u008b\u0086\u008b\u0082\u008c\u0083\u0086", objArr14);
        String strIntern4 = ((String) objArr14[0]).intern();
        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(722 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 33);
        byte[] bArr = $$a;
        byte b11 = bArr[11];
        char c15 = 0;
        Object[] objArr15 = new Object[1];
        b(b11, (byte) (b11 | 9), bArr[72], objArr15);
        long j15 = cls2.getField((String) objArr15[0]).getLong(null);
        Class cls3 = Integer.TYPE;
        try {
            try {
                if (j15 != -1) {
                    i11 = 2;
                    if (j15 + 1859 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 721, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 33 - Color.green(0));
                        str = strIntern;
                        num = 0;
                        Object[] objArr16 = new Object[1];
                        b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr16);
                        Object[] objArr17 = {cls4.getField((String) objArr16[0]).get(null), -1087466761, null};
                        Map map6 = atd.a.getMessageVersion.timedout;
                        Object method17 = map6.get(-1124906587);
                        if (method17 == null) {
                            method17 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(0) + 20) >> 6) + 2718, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getTouchSlop() >> 8) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls3, cls3);
                            map6.put(-1124906587, method17);
                        }
                        objArr = (Object[]) ((Method) method17).invoke(null, objArr17);
                        strIntern3 = strIntern3;
                        bArr = bArr;
                        c11 = 1;
                    }
                    i12 = ((int[]) objArr[c11])[c15];
                    i13 = ((int[]) objArr[c15])[c15];
                    if (i13 == i12) {
                        i25 = ChallengeResultCancelled + 113;
                        ChallengeResult = i25 % 128;
                        if (i25 % 2 != 0) {
                            int i26 = ((int[]) objArr[64])[0];
                            Object[] objArr18 = new Object[3];
                            objArr18[i11] = num;
                            objArr18[1] = Integer.valueOf(i26);
                            objArr18[0] = objArr;
                            map5 = atd.a.getMessageVersion.timedout;
                            method16 = map5.get(-1124906587);
                            if (method16 != null) {
                                method16 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2717 - TextUtils.indexOf((CharSequence) "", '0'), (char) ExpandableListView.getPackedPositionType(0L), 31 - View.getDefaultSize(0, 0))).getMethod("AuthenticationRequestParameters", Object[].class, cls3, cls3);
                                map5.put(-1124906587, method16);
                            }
                            ((Method) method16).invoke(null, objArr18);
                        } else {
                            int i27 = ((int[]) objArr[9])[0];
                            Object[] objArr19 = new Object[3];
                            objArr19[i11] = num;
                            objArr19[1] = Integer.valueOf(i27);
                            objArr19[0] = objArr;
                            map4 = atd.a.getMessageVersion.timedout;
                            method15 = map4.get(-1124906587);
                            if (method15 != null) {
                                method15 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 2718, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls3, cls3);
                                map4.put(-1124906587, method15);
                            }
                            ((Method) method15).invoke(null, objArr19);
                        }
                        c12 = '\t';
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add((String) objArr[i11]);
                        arrayList2.add((String) objArr[3]);
                        arrayList2.add((String) objArr[4]);
                        arrayList2.add((String) objArr[5]);
                        arrayList2.add((String) objArr[6]);
                        arrayList2.add((String) objArr[7]);
                        arrayList2.add((String) objArr[8]);
                        long j16 = ((long) (i12 ^ i13)) ^ 7941231025194008576L;
                        try {
                            Object[] objArr20 = new Object[i11];
                            objArr20[1] = 1848961930L;
                            objArr20[0] = Long.valueOf(j16);
                            byte[] bArr2 = $$d;
                            c12 = '\t';
                            Object[] objArr21 = new Object[1];
                            c((short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, (byte) 30, bArr2[2], objArr21);
                            Class<?> cls5 = Class.forName((String) objArr21[0]);
                            Object[] objArr22 = new Object[1];
                            c((short) EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, bArr2[59], bArr2[40], objArr22);
                            String str2 = (String) objArr22[0];
                            Class cls6 = Long.TYPE;
                            cls5.getMethod(str2, cls6, cls6).invoke(null, objArr20);
                            Object[] objArr23 = {objArr, Integer.valueOf(((int[]) objArr[9])[0]), num};
                            map = atd.a.getMessageVersion.timedout;
                            method = map.get(-1124906587);
                            if (method != null) {
                                method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0, 0) + 2719, (char) ((-1) - MotionEvent.axisFromString("")), Color.red(0) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls3, cls3);
                                map.put(-1124906587, method);
                            }
                            ((Method) method).invoke(null, objArr23);
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    }
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (16830 - (ViewConfiguration.getTouchSlop() >> 8)), 35 - KeyEvent.getDeadChar(0, 0));
                    byte b12 = (byte) (-bArr[56]);
                    byte b13 = bArr[11];
                    Object[] objArr24 = new Object[1];
                    b(b12, b13, (byte) (b13 | 29), objArr24);
                    j11 = cls7.getField((String) objArr24[0]).getLong(null);
                    if (j11 != -1) {
                        i24 = ChallengeResult + 25;
                        ChallengeResultCancelled = i24 % 128;
                        if (i24 % 2 == 0 ? j11 + 1930 < ((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue() : j11 + 1930 < ((Long) Class.forName(str).getDeclaredMethod(strIntern2, new Class[1]).invoke(null, null)).longValue()) {
                            Object[] objArr25 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1064275419};
                            map2 = atd.a.getMessageVersion.timedout;
                            method2 = map2.get(-836670848);
                            if (method2 == null) {
                                Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (16831 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 35 - TextUtils.getOffsetBefore("", 0));
                                byte b14 = bArr[11];
                                byte b15 = (byte) (b14 | 6);
                                Object[] objArr26 = new Object[1];
                                b(b14, b15, (byte) (b15 + 3), objArr26);
                                method2 = cls8.getMethod((String) objArr26[0], cls3, cls3);
                                map2.put(-836670848, method2);
                            }
                            objInvoke = ((Method) method2).invoke(null, objArr25);
                            Class cls9 = (Class) atd.a.getMessageVersion.getSDKTransactionID(755 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 16830), 35 - View.resolveSizeAndState(0, 0, 0));
                            Object[] objArr27 = new Object[1];
                            b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr27);
                            cls9.getField((String) objArr27[0]).set(null, objInvoke);
                            try {
                                Long lValueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                                Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 755, (char) (KeyEvent.keyCodeFromString("") + 16830), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35);
                                byte b16 = (byte) (-bArr[56]);
                                byte b17 = bArr[11];
                                Object[] objArr28 = new Object[1];
                                b(b16, b17, (byte) (b17 | 29), objArr28);
                                cls10.getField((String) objArr28[0]).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        } else {
                            Class cls11 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16829), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36);
                            Object[] objArr29 = new Object[1];
                            b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr29);
                            Object[] objArr30 = {cls11.getField((String) objArr29[0]).get(null), 1064275419, num};
                            Map map7 = atd.a.getMessageVersion.timedout;
                            Object method18 = map7.get(245738379);
                            if (method18 == null) {
                                method18 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2778 - View.MeasureSpec.getSize(0), (char) (39468 - (ViewConfiguration.getTapTimeout() >> 16)), 24 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("getSDKReferenceNumber", (Class) atd.a.getMessageVersion.getSDKTransactionID(2748 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 54839), 'M' - AndroidCharacter.getMirror('0')), cls3, cls3);
                                map7.put(245738379, method18);
                            }
                            objInvoke = ((Method) method18).invoke(null, objArr30);
                        }
                    } else {
                        Object[] objArr210 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1064275419};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-836670848);
                        if (method2 == null) {
                            Class cls12 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (16831 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 35 - TextUtils.getOffsetBefore("", 0));
                            byte b18 = bArr[11];
                            byte b19 = (byte) (b18 | 6);
                            Object[] objArr211 = new Object[1];
                            b(b18, b19, (byte) (b19 + 3), objArr211);
                            method2 = cls12.getMethod((String) objArr211[0], cls3, cls3);
                            map2.put(-836670848, method2);
                        }
                        objInvoke = ((Method) method2).invoke(null, objArr210);
                        Class cls13 = (Class) atd.a.getMessageVersion.getSDKTransactionID(755 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 16830), 35 - View.resolveSizeAndState(0, 0, 0));
                        Object[] objArr212 = new Object[1];
                        b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr212);
                        cls13.getField((String) objArr212[0]).set(null, objInvoke);
                        Long lValueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls14 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 755, (char) (KeyEvent.keyCodeFromString("") + 16830), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35);
                        byte b110 = (byte) (-bArr[56]);
                        byte b111 = bArr[11];
                        Object[] objArr213 = new Object[1];
                        b(b110, b111, (byte) (b111 | 29), objArr213);
                        cls14.getField((String) objArr213[0]).set(null, lValueOf3);
                    }
                    map3 = atd.a.getMessageVersion.timedout;
                    method3 = map3.get(693253393);
                    if (method3 != null) {
                        objArr2 = null;
                    } else {
                        objArr2 = null;
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2748 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (54839 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 29 - TextUtils.indexOf("", "", 0, 0))).getMethod("getSDKReferenceNumber", null);
                        map3.put(693253393, method3);
                    }
                    iIntValue = ((Integer) ((Method) method3).invoke(objInvoke, objArr2)).intValue();
                    method4 = map3.get(-635346729);
                    if (method4 != null) {
                        objArr3 = null;
                    } else {
                        objArr3 = null;
                        method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2750 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 54838), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29)).getMethod("getDeviceData", null);
                        map3.put(-635346729, method4);
                    }
                    iIntValue2 = ((Integer) ((Method) method4).invoke(objInvoke, objArr3)).intValue();
                    if (iIntValue2 == iIntValue) {
                        method13 = map3.get(560827737);
                        if (method13 != null) {
                            objArr10 = null;
                        } else {
                            objArr10 = null;
                            method13 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 2749, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 54838), 'M' - AndroidCharacter.getMirror('0'))).getMethod("getSDKAppID", null);
                            map3.put(560827737, method13);
                        }
                        Integer num2 = (Integer) ((Method) method13).invoke(objInvoke, objArr10);
                        num2.intValue();
                        Object[] objArr31 = {objInvoke, num2, num};
                        method14 = map3.get(245738379);
                        if (method14 != null) {
                            method14 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2778 - KeyEvent.getDeadChar(0, 0), (char) (39468 - View.MeasureSpec.makeMeasureSpec(0, 0)), 24 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("getSDKReferenceNumber", (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0') + 2750, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54837), (ViewConfiguration.getTapTimeout() >> 16) + 29), cls3, cls3);
                            map3.put(245738379, method14);
                        }
                        ((Method) method14).invoke(null, objArr31);
                    } else {
                        Object[] objArr32 = {Long.valueOf(((long) (iIntValue ^ iIntValue2)) ^ (-3107492264100757504L)), -723521472L};
                        byte[] bArr3 = $$d;
                        byte b21 = (byte) (-bArr3[c12]);
                        byte b22 = bArr3[2];
                        Object[] objArr33 = new Object[1];
                        c((short) 190, b21, b22, objArr33);
                        Class<?> cls15 = Class.forName((String) objArr33[0]);
                        Object[] objArr34 = new Object[1];
                        c((short) 152, bArr3[39], bArr3[40], objArr34);
                        String str3 = (String) objArr34[0];
                        Class cls16 = Long.TYPE;
                        cls15.getMethod(str3, cls16, cls16).invoke(null, objArr32);
                        method5 = map3.get(560827737);
                        if (method5 != null) {
                            objArr4 = null;
                        } else {
                            objArr4 = null;
                            method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2748 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (54839 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 29)).getMethod("getSDKAppID", null);
                            map3.put(560827737, method5);
                        }
                        Integer num3 = (Integer) ((Method) method5).invoke(objInvoke, objArr4);
                        num3.intValue();
                        Object[] objArr35 = {objInvoke, num3, num};
                        method6 = map3.get(245738379);
                        if (method6 != null) {
                            method6 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2778 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 39468), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2748, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 54838), 29 - View.MeasureSpec.makeMeasureSpec(0, 0)), cls3, cls3);
                            map3.put(245738379, method6);
                        }
                        ((Method) method6).invoke(null, objArr35);
                    }
                    Class cls17 = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - TextUtils.indexOf("", "", 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 26 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    Object[] objArr36 = new Object[1];
                    b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr36);
                    j12 = cls17.getField((String) objArr36[0]).getLong(null);
                    if (j12 != -1 || j12 + 1959 < ((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                        Object[] objArr37 = new Object[1];
                        a(null, null, 127 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u0083\u0081\u008c\u0084\u0098\u009a\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0099\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr37);
                        Class<?> cls18 = Class.forName(((String) objArr37[0]).intern());
                        Object[] objArr38 = new Object[1];
                        a(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0099\u008b\u0082\u008c\u0084\u0084\u009b\u0090", objArr38);
                        applicationContext = (Context) cls18.getMethod(((String) objArr38[0]).intern(), null).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                        try {
                            Object[] objArr39 = {applicationContext, Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 257047078};
                            short s11 = (short) ($$e & 917);
                            byte[] bArr4 = $$d;
                            context = applicationContext;
                            Object[] objArr40 = new Object[1];
                            c(s11, (byte) (-bArr4[c12]), bArr4[2], objArr40);
                            Class<?> cls19 = Class.forName((String) objArr40[0]);
                            Object[] objArr41 = new Object[1];
                            c((short) EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, bArr4[59], bArr4[40], objArr41);
                            objArr5 = (Object[]) cls19.getMethod((String) objArr41[0], Context.class, cls3, cls3).invoke(null, objArr39);
                            if (context != null) {
                                Class cls20 = (Class) atd.a.getMessageVersion.getSDKTransactionID(663 - TextUtils.lastIndexOf("", '0'), (char) Color.green(0), TextUtils.indexOf("", "") + 25);
                                byte b23 = bArr[11];
                                Object[] objArr42 = new Object[1];
                                b(b23, (byte) (b23 | 9), bArr[72], objArr42);
                                cls20.getField((String) objArr42[0]).set(null, objArr5);
                                try {
                                    Long lValueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                                    Class cls21 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 664, (char) KeyEvent.keyCodeFromString(""), 'I' - AndroidCharacter.getMirror('0'));
                                    Object[] objArr43 = new Object[1];
                                    b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr43);
                                    cls21.getField((String) objArr43[0]).set(null, lValueOf4);
                                } catch (Exception unused2) {
                                    throw new RuntimeException();
                                }
                            }
                            objArr6 = objArr5;
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th3;
                        }
                    } else {
                        Class cls22 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(0) + 20) >> 6) + 664, (char) TextUtils.getCapsMode("", 0, 0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25);
                        byte b24 = bArr[11];
                        Object[] objArr44 = new Object[1];
                        b(b24, (byte) (b24 | 9), bArr[72], objArr44);
                        Object[] objArr45 = {cls22.getField((String) objArr44[0]).get(null), 257047078, num};
                        Object method19 = map3.get(1046315470);
                        if (method19 == null) {
                            method19 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2801 - Process.getGidForName(""), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64314), Process.getGidForName("") + 29)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method19);
                        }
                        objArr6 = (Object[]) ((Method) method19).invoke(null, objArr45);
                    }
                    i14 = ((int[]) objArr6[1])[0];
                    i15 = ((int[]) objArr6[0])[0];
                    if (i15 == i14) {
                        Object[] objArr46 = {objArr6, Integer.valueOf(((int[]) objArr6[3])[0]), num};
                        method12 = map3.get(1046315470);
                        if (method12 != null) {
                            method12 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2802 - View.getDefaultSize(0, 0), (char) (64313 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 29)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method12);
                        }
                        ((Method) method12).invoke(null, objArr46);
                    } else {
                        Object[] objArr47 = {Long.valueOf(((long) (i14 ^ i15)) ^ 1298746617947488256L), 302388015L};
                        byte[] bArr5 = $$d;
                        Object[] objArr48 = objArr6;
                        Object[] objArr49 = new Object[1];
                        c((short) 94, (byte) (-bArr5[184]), bArr5[2], objArr49);
                        Class<?> cls23 = Class.forName((String) objArr49[0]);
                        Object[] objArr50 = new Object[1];
                        c((short) EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, bArr5[59], bArr5[40], objArr50);
                        String str4 = (String) objArr50[0];
                        Class cls24 = Long.TYPE;
                        cls23.getMethod(str4, cls24, cls24).invoke(null, objArr47);
                        Object[] objArr51 = {objArr48, Integer.valueOf(((int[]) objArr48[3])[0]), num};
                        method7 = map3.get(1046315470);
                        if (method7 != null) {
                            method7 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2801 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (64314 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getTrimmedLength("") + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method7);
                        }
                        ((Method) method7).invoke(null, objArr51);
                    }
                    Class cls25 = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - (Process.myPid() >> 22), (char) View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionType(0L) + 25);
                    byte b25 = bArr[11];
                    byte b26 = (byte) (b25 | 6);
                    Object[] objArr52 = new Object[1];
                    b(b25, b26, (byte) (b26 + 3), objArr52);
                    j13 = cls25.getField((String) objArr52[0]).getLong(null);
                    if (j13 != -1) {
                        i23 = ChallengeResult + 111;
                        ChallengeResultCancelled = i23 % 128;
                        if (i23 % 2 == 0 ? j13 + 2043 < ((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue() : j13 - 2043 < ((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, new Object[1])).longValue()) {
                            Object[] objArr53 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1843719650};
                            byte[] bArr6 = $$d;
                            Object[] objArr54 = new Object[1];
                            c((short) (-bArr6[125]), bArr6[20], bArr6[2], objArr54);
                            Class<?> cls26 = Class.forName((String) objArr54[0]);
                            Object[] objArr55 = new Object[1];
                            c((short) 152, bArr6[39], bArr6[40], objArr55);
                            Object[] objArr56 = (Object[]) cls26.getMethod((String) objArr55[0], cls3, cls3).invoke(null, objArr53);
                            Class cls27 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 25 - KeyEvent.keyCodeFromString(""));
                            Object[] objArr57 = new Object[1];
                            b(bArr[31], bArr[51], bArr[11], objArr57);
                            cls27.getField((String) objArr57[0]).set(null, objArr56);
                            try {
                                Long lValueOf5 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                                Class cls28 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.blue(0) + 664, (char) KeyEvent.getDeadChar(0, 0), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                byte b27 = bArr[11];
                                byte b28 = (byte) (b27 | 6);
                                c13 = 1;
                                Object[] objArr58 = new Object[1];
                                b(b27, b28, (byte) (b28 + 3), objArr58);
                                c14 = 0;
                                cls28.getField((String) objArr58[0]).set(null, lValueOf5);
                                objArr7 = objArr56;
                            } catch (Exception unused3) {
                                throw new RuntimeException();
                            }
                        } else {
                            Class cls29 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 664, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 25 - View.MeasureSpec.getSize(0));
                            Object[] objArr59 = new Object[1];
                            b(bArr[31], bArr[51], bArr[11], objArr59);
                            Object[] objArr60 = {cls29.getField((String) objArr59[0]).get(null), 1843719650, num};
                            Object method20 = map3.get(1046315470);
                            if (method20 == null) {
                                method20 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + NearbyMessagesStatusCodes.TOO_MANY_PENDING_INTENTS, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 64314), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                map3.put(1046315470, method20);
                            }
                            objArr7 = (Object[]) ((Method) method20).invoke(null, objArr60);
                            c13 = 1;
                            c14 = 0;
                        }
                    } else {
                        Object[] objArr510 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1843719650};
                        byte[] bArr7 = $$d;
                        Object[] objArr511 = new Object[1];
                        c((short) (-bArr7[125]), bArr7[20], bArr7[2], objArr511);
                        Class<?> cls210 = Class.forName((String) objArr511[0]);
                        Object[] objArr512 = new Object[1];
                        c((short) 152, bArr7[39], bArr7[40], objArr512);
                        Object[] objArr513 = (Object[]) cls210.getMethod((String) objArr512[0], cls3, cls3).invoke(null, objArr510);
                        Class cls211 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 25 - KeyEvent.keyCodeFromString(""));
                        Object[] objArr514 = new Object[1];
                        b(bArr[31], bArr[51], bArr[11], objArr514);
                        cls211.getField((String) objArr514[0]).set(null, objArr513);
                        Long lValueOf6 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls212 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.blue(0) + 664, (char) KeyEvent.getDeadChar(0, 0), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b29 = bArr[11];
                        byte b210 = (byte) (b29 | 6);
                        c13 = 1;
                        Object[] objArr515 = new Object[1];
                        b(b29, b210, (byte) (b210 + 3), objArr515);
                        c14 = 0;
                        cls212.getField((String) objArr515[0]).set(null, lValueOf6);
                        objArr7 = objArr513;
                    }
                    i16 = ((int[]) objArr7[c13])[c14];
                    i17 = ((int[]) objArr7[c14])[c14];
                    if (i17 == i16) {
                        int i28 = ((int[]) objArr7[3])[c14];
                        Object[] objArr61 = new Object[3];
                        objArr61[2] = num;
                        objArr61[1] = Integer.valueOf(i28);
                        objArr61[c14] = objArr7;
                        method11 = map3.get(1046315470);
                        if (method11 != null) {
                            method11 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + NearbyMessagesStatusCodes.TOO_MANY_PENDING_INTENTS, (char) (64314 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 27 - ImageFormat.getBitsPerPixel(0))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method11);
                        }
                        ((Method) method11).invoke(null, objArr61);
                    } else {
                        new ArrayList().add((String) objArr7[2]);
                        Object[] objArr62 = {Long.valueOf(((long) (i16 ^ i17)) ^ 217523476313931776L), 50646115L};
                        byte[] bArr8 = $$d;
                        Object[] objArr63 = objArr7;
                        Object[] objArr64 = new Object[1];
                        c((short) 41, (byte) (bArr8[96] - 1), bArr8[2], objArr64);
                        Class<?> cls30 = Class.forName((String) objArr64[0]);
                        Object[] objArr65 = new Object[1];
                        c(bArr8[30], bArr8[2], bArr8[40], objArr65);
                        String str5 = (String) objArr65[0];
                        Class cls31 = Long.TYPE;
                        cls30.getMethod(str5, cls31, cls31).invoke(null, objArr62);
                        Object[] objArr66 = {objArr63, Integer.valueOf(((int[]) objArr63[3])[0]), num};
                        method8 = map3.get(1046315470);
                        if (method8 != null) {
                            method8 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64315 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (Process.myPid() >> 22) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method8);
                        }
                        ((Method) method8).invoke(null, objArr66);
                    }
                    Class cls32 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 664, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24 - TextUtils.lastIndexOf("", '0'));
                    Object[] objArr67 = new Object[1];
                    b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr67);
                    j14 = cls32.getField((String) objArr67[0]).getLong(null);
                    if (j14 != -1 || j14 + 1912 < ((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                        Object[] objArr68 = new Object[1];
                        a(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0083\u0081\u008c\u0084\u0098\u009a\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0099\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr68);
                        Class<?> cls33 = Class.forName(((String) objArr68[0]).intern());
                        Object[] objArr69 = new Object[1];
                        a(null, null, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 127, "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0099\u008b\u0082\u008c\u0084\u0084\u009b\u0090", objArr69);
                        applicationContext2 = (Context) cls33.getMethod(((String) objArr69[0]).intern(), null).invoke(null, null);
                        if (applicationContext2 != null) {
                            i19 = ChallengeResultCancelled + 97;
                            ChallengeResult = i19 % 128;
                            if (i19 % 2 != 0) {
                                applicationContext2.getApplicationContext();
                                throw null;
                            }
                            applicationContext2 = applicationContext2.getApplicationContext();
                        }
                        Object[] objArr70 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), -920297431};
                        byte[] bArr9 = $$d;
                        byte b31 = bArr9[2];
                        Object[] objArr71 = new Object[1];
                        c(b31, (byte) (-bArr9[240]), b31, objArr71);
                        Class<?> cls34 = Class.forName((String) objArr71[0]);
                        Object[] objArr72 = new Object[1];
                        c(bArr9[30], bArr9[2], bArr9[40], objArr72);
                        objArr8 = (Object[]) cls34.getMethod((String) objArr72[0], Context.class, cls3, cls3).invoke(null, objArr70);
                        if (applicationContext2 != null) {
                            i18 = ChallengeResult + 97;
                            ChallengeResultCancelled = i18 % 128;
                            try {
                                if (i18 % 2 == 0) {
                                    Class cls35 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + 664, (char) TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 25);
                                    byte b32 = (byte) (-bArr[56]);
                                    byte b33 = bArr[11];
                                    Object[] objArr73 = new Object[1];
                                    b(b32, b33, (byte) (b33 | 29), objArr73);
                                    cls35.getField((String) objArr73[0]).set(null, objArr8);
                                    lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, new Class[1]).invoke(null, null)).longValue());
                                    cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - TextUtils.getTrimmedLength(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                    Object[] objArr74 = new Object[1];
                                    b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr74);
                                    obj = objArr74[0];
                                } else {
                                    Class cls36 = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - Color.blue(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getMode(0) + 25);
                                    byte b34 = (byte) (-bArr[56]);
                                    byte b35 = bArr[11];
                                    Object[] objArr75 = new Object[1];
                                    b(b34, b35, (byte) (b35 | 29), objArr75);
                                    cls36.getField((String) objArr75[0]).set(null, objArr8);
                                    lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                                    cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 663, (char) TextUtils.indexOf("", "", 0), 25 - TextUtils.getOffsetAfter("", 0));
                                    Object[] objArr76 = new Object[1];
                                    b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr76);
                                    obj = objArr76[0];
                                }
                                cls.getField((String) obj).set(null, lValueOf);
                            } catch (Exception unused4) {
                                throw new RuntimeException();
                            }
                        }
                        objArr9 = objArr8;
                    } else {
                        Class cls37 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.combineMeasuredStates(0, 0) + 664, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 26);
                        byte b36 = (byte) (-bArr[56]);
                        byte b37 = bArr[11];
                        Object[] objArr77 = new Object[1];
                        b(b36, b37, (byte) (b37 | 29), objArr77);
                        Object[] objArr78 = {cls37.getField((String) objArr77[0]).get(null), -920297431, num};
                        Object method21 = map3.get(1046315470);
                        if (method21 == null) {
                            method21 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2802 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((Process.myTid() >> 22) + 64314), 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method21);
                        }
                        objArr9 = (Object[]) ((Method) method21).invoke(null, objArr78);
                        ChallengeResultCancelled = (ChallengeResult + 69) % 128;
                    }
                    i21 = ((int[]) objArr9[1])[0];
                    i22 = ((int[]) objArr9[0])[0];
                    if (i22 == i21) {
                        Object[] objArr79 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), num};
                        method10 = map3.get(1046315470);
                        if (method10 != null) {
                            method10 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2801 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (KeyEvent.getDeadChar(0, 0) + 64314), TextUtils.getOffsetAfter("", 0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method10);
                        }
                        ((Method) method10).invoke(null, objArr79);
                    } else {
                        Object[] objArr80 = {Long.valueOf(((long) (i21 ^ i22)) ^ 2471928630045835264L), 575541246L};
                        byte[] bArr10 = $$d;
                        Object[] objArr81 = new Object[1];
                        c((short) 41, (byte) (bArr10[96] - 1), bArr10[2], objArr81);
                        Class<?> cls38 = Class.forName((String) objArr81[0]);
                        Object[] objArr82 = new Object[1];
                        c(bArr10[30], bArr10[2], bArr10[40], objArr82);
                        String str6 = (String) objArr82[0];
                        Class cls39 = Long.TYPE;
                        cls38.getMethod(str6, cls39, cls39).invoke(null, objArr80);
                        Object[] objArr83 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), num};
                        method9 = map3.get(1046315470);
                        if (method9 != null) {
                            method9 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64313 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map3.put(1046315470, method9);
                        }
                        ((Method) method9).invoke(null, objArr83);
                    }
                    p013kotlin.jvm.internal.s.k(application, "");
                    p013kotlin.jvm.internal.s.k(configParameters, "");
                    p013kotlin.jvm.internal.s.k(list, "");
                    getMessageVersion getmessageversion = new getMessageVersion((Collection) AuthenticationRequestParameters.getSDKAppID(new Object[]{configParameters}, 374901766, -374901766, (int) System.currentTimeMillis()));
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!(((Warning) obj2) instanceof atd.ap.getSDKAppID)) {
                            arrayList.add(obj2);
                        }
                    }
                    return new getDeviceData(arrayList, getmessageversion.t_(application), getSDKAppID.V1_6);
                }
                i11 = 2;
                Long lValueOf7 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                Class cls40 = (Class) atd.a.getMessageVersion.getSDKTransactionID(721 - Color.argb(0, 0, 0, 0), (char) View.MeasureSpec.getSize(0), Process.getGidForName("") + 34);
                byte b38 = (byte) bArr[11];
                byte b39 = (byte) bArr[72];
                c11 = 1;
                Object[] objArr84 = new Object[1];
                b(b38, (byte) (b38 | 9), b39, objArr84);
                c15 = 0;
                cls40.getField((String) objArr84[0]).set(null, lValueOf7);
                i12 = ((int[]) objArr[c11])[c15];
                i13 = ((int[]) objArr[c15])[c15];
                if (i13 == i12) {
                    i25 = ChallengeResultCancelled + 113;
                    ChallengeResult = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i29 = ((int[]) objArr[64])[0];
                        Object[] objArr110 = new Object[3];
                        objArr110[i11] = num;
                        objArr110[1] = Integer.valueOf(i29);
                        objArr110[0] = objArr;
                        map5 = atd.a.getMessageVersion.timedout;
                        method16 = map5.get(-1124906587);
                        if (method16 != null) {
                            method16 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2717 - TextUtils.indexOf((CharSequence) "", '0'), (char) ExpandableListView.getPackedPositionType(0L), 31 - View.getDefaultSize(0, 0))).getMethod("AuthenticationRequestParameters", Object[].class, cls3, cls3);
                            map5.put(-1124906587, method16);
                        }
                        ((Method) method16).invoke(null, objArr110);
                    } else {
                        int i210 = ((int[]) objArr[9])[0];
                        Object[] objArr111 = new Object[3];
                        objArr111[i11] = num;
                        objArr111[1] = Integer.valueOf(i210);
                        objArr111[0] = objArr;
                        map4 = atd.a.getMessageVersion.timedout;
                        method15 = map4.get(-1124906587);
                        if (method15 != null) {
                            method15 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 2718, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls3, cls3);
                            map4.put(-1124906587, method15);
                        }
                        ((Method) method15).invoke(null, objArr111);
                    }
                    c12 = '\t';
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add((String) objArr[i11]);
                    arrayList3.add((String) objArr[3]);
                    arrayList3.add((String) objArr[4]);
                    arrayList3.add((String) objArr[5]);
                    arrayList3.add((String) objArr[6]);
                    arrayList3.add((String) objArr[7]);
                    arrayList3.add((String) objArr[8]);
                    long j17 = ((long) (i12 ^ i13)) ^ 7941231025194008576L;
                    Object[] objArr214 = new Object[i11];
                    objArr214[1] = 1848961930L;
                    objArr214[0] = Long.valueOf(j17);
                    byte[] bArr11 = $$d;
                    c12 = '\t';
                    Object[] objArr215 = new Object[1];
                    c((short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, (byte) 30, bArr11[2], objArr215);
                    Class<?> cls41 = Class.forName((String) objArr215[0]);
                    Object[] objArr216 = new Object[1];
                    c((short) EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, bArr11[59], bArr11[40], objArr216);
                    String str7 = (String) objArr216[0];
                    Class cls42 = Long.TYPE;
                    cls41.getMethod(str7, cls42, cls42).invoke(null, objArr214);
                    Object[] objArr217 = {objArr, Integer.valueOf(((int[]) objArr[9])[0]), num};
                    map = atd.a.getMessageVersion.timedout;
                    method = map.get(-1124906587);
                    if (method != null) {
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0, 0) + 2719, (char) ((-1) - MotionEvent.axisFromString("")), Color.red(0) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls3, cls3);
                        map.put(-1124906587, method);
                    }
                    ((Method) method).invoke(null, objArr217);
                }
                Class cls43 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (16830 - (ViewConfiguration.getTouchSlop() >> 8)), 35 - KeyEvent.getDeadChar(0, 0));
                byte b112 = (byte) (-bArr[56]);
                byte b113 = bArr[11];
                Object[] objArr218 = new Object[1];
                b(b112, b113, (byte) (b113 | 29), objArr218);
                j11 = cls43.getField((String) objArr218[0]).getLong(null);
                if (j11 != -1) {
                    i24 = ChallengeResult + 25;
                    ChallengeResultCancelled = i24 % 128;
                    if (i24 % 2 == 0) {
                        Object[] objArr219 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1064275419};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-836670848);
                        if (method2 == null) {
                            Class cls110 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (16831 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 35 - TextUtils.getOffsetBefore("", 0));
                            byte b114 = bArr[11];
                            byte b115 = (byte) (b114 | 6);
                            Object[] objArr2110 = new Object[1];
                            b(b114, b115, (byte) (b115 + 3), objArr2110);
                            method2 = cls110.getMethod((String) objArr2110[0], cls3, cls3);
                            map2.put(-836670848, method2);
                        }
                        objInvoke = ((Method) method2).invoke(null, objArr219);
                        Class cls111 = (Class) atd.a.getMessageVersion.getSDKTransactionID(755 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 16830), 35 - View.resolveSizeAndState(0, 0, 0));
                        Object[] objArr2111 = new Object[1];
                        b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr2111);
                        cls111.getField((String) objArr2111[0]).set(null, objInvoke);
                        Long lValueOf8 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls112 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 755, (char) (KeyEvent.keyCodeFromString("") + 16830), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35);
                        byte b116 = (byte) (-bArr[56]);
                        byte b117 = bArr[11];
                        Object[] objArr2112 = new Object[1];
                        b(b116, b117, (byte) (b117 | 29), objArr2112);
                        cls112.getField((String) objArr2112[0]).set(null, lValueOf8);
                    } else {
                        Object[] objArr2113 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1064275419};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-836670848);
                        if (method2 == null) {
                            Class cls113 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (16831 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 35 - TextUtils.getOffsetBefore("", 0));
                            byte b118 = bArr[11];
                            byte b119 = (byte) (b118 | 6);
                            Object[] objArr2114 = new Object[1];
                            b(b118, b119, (byte) (b119 + 3), objArr2114);
                            method2 = cls113.getMethod((String) objArr2114[0], cls3, cls3);
                            map2.put(-836670848, method2);
                        }
                        objInvoke = ((Method) method2).invoke(null, objArr2113);
                        Class cls114 = (Class) atd.a.getMessageVersion.getSDKTransactionID(755 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 16830), 35 - View.resolveSizeAndState(0, 0, 0));
                        Object[] objArr2115 = new Object[1];
                        b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr2115);
                        cls114.getField((String) objArr2115[0]).set(null, objInvoke);
                        Long lValueOf9 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls115 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 755, (char) (KeyEvent.keyCodeFromString("") + 16830), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35);
                        byte b1110 = (byte) (-bArr[56]);
                        byte b1111 = bArr[11];
                        Object[] objArr2116 = new Object[1];
                        b(b1110, b1111, (byte) (b1111 | 29), objArr2116);
                        cls115.getField((String) objArr2116[0]).set(null, lValueOf9);
                    }
                } else {
                    Object[] objArr2117 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1064275419};
                    map2 = atd.a.getMessageVersion.timedout;
                    method2 = map2.get(-836670848);
                    if (method2 == null) {
                        Class cls116 = (Class) atd.a.getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (16831 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 35 - TextUtils.getOffsetBefore("", 0));
                        byte b1112 = bArr[11];
                        byte b1113 = (byte) (b1112 | 6);
                        Object[] objArr2118 = new Object[1];
                        b(b1112, b1113, (byte) (b1113 + 3), objArr2118);
                        method2 = cls116.getMethod((String) objArr2118[0], cls3, cls3);
                        map2.put(-836670848, method2);
                    }
                    objInvoke = ((Method) method2).invoke(null, objArr2117);
                    Class cls117 = (Class) atd.a.getMessageVersion.getSDKTransactionID(755 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 16830), 35 - View.resolveSizeAndState(0, 0, 0));
                    Object[] objArr2119 = new Object[1];
                    b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr2119);
                    cls117.getField((String) objArr2119[0]).set(null, objInvoke);
                    Long lValueOf10 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                    Class cls118 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 755, (char) (KeyEvent.keyCodeFromString("") + 16830), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35);
                    byte b1114 = (byte) (-bArr[56]);
                    byte b1115 = bArr[11];
                    Object[] objArr21110 = new Object[1];
                    b(b1114, b1115, (byte) (b1115 | 29), objArr21110);
                    cls118.getField((String) objArr21110[0]).set(null, lValueOf10);
                }
                map3 = atd.a.getMessageVersion.timedout;
                method3 = map3.get(693253393);
                if (method3 != null) {
                    objArr2 = null;
                } else {
                    objArr2 = null;
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2748 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (54839 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 29 - TextUtils.indexOf("", "", 0, 0))).getMethod("getSDKReferenceNumber", null);
                    map3.put(693253393, method3);
                }
                iIntValue = ((Integer) ((Method) method3).invoke(objInvoke, objArr2)).intValue();
                method4 = map3.get(-635346729);
                if (method4 != null) {
                    objArr3 = null;
                } else {
                    objArr3 = null;
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2750 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 54838), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29)).getMethod("getDeviceData", null);
                    map3.put(-635346729, method4);
                }
                iIntValue2 = ((Integer) ((Method) method4).invoke(objInvoke, objArr3)).intValue();
                if (iIntValue2 == iIntValue) {
                    method13 = map3.get(560827737);
                    if (method13 != null) {
                        objArr10 = null;
                    } else {
                        objArr10 = null;
                        method13 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 2749, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 54838), 'M' - AndroidCharacter.getMirror('0'))).getMethod("getSDKAppID", null);
                        map3.put(560827737, method13);
                    }
                    Integer num4 = (Integer) ((Method) method13).invoke(objInvoke, objArr10);
                    num4.intValue();
                    Object[] objArr310 = {objInvoke, num4, num};
                    method14 = map3.get(245738379);
                    if (method14 != null) {
                        method14 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2778 - KeyEvent.getDeadChar(0, 0), (char) (39468 - View.MeasureSpec.makeMeasureSpec(0, 0)), 24 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("getSDKReferenceNumber", (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0') + 2750, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54837), (ViewConfiguration.getTapTimeout() >> 16) + 29), cls3, cls3);
                        map3.put(245738379, method14);
                    }
                    ((Method) method14).invoke(null, objArr310);
                } else {
                    Object[] objArr311 = {Long.valueOf(((long) (iIntValue ^ iIntValue2)) ^ (-3107492264100757504L)), -723521472L};
                    byte[] bArr12 = $$d;
                    byte b211 = (byte) (-bArr12[c12]);
                    byte b212 = bArr12[2];
                    Object[] objArr312 = new Object[1];
                    c((short) 190, b211, b212, objArr312);
                    Class<?> cls119 = Class.forName((String) objArr312[0]);
                    Object[] objArr313 = new Object[1];
                    c((short) 152, bArr12[39], bArr12[40], objArr313);
                    String str8 = (String) objArr313[0];
                    Class cls120 = Long.TYPE;
                    cls119.getMethod(str8, cls120, cls120).invoke(null, objArr311);
                    method5 = map3.get(560827737);
                    if (method5 != null) {
                        objArr4 = null;
                    } else {
                        objArr4 = null;
                        method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2748 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (54839 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 29)).getMethod("getSDKAppID", null);
                        map3.put(560827737, method5);
                    }
                    Integer num5 = (Integer) ((Method) method5).invoke(objInvoke, objArr4);
                    num5.intValue();
                    Object[] objArr314 = {objInvoke, num5, num};
                    method6 = map3.get(245738379);
                    if (method6 != null) {
                        method6 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2778 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 39468), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("getSDKReferenceNumber", (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2748, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 54838), 29 - View.MeasureSpec.makeMeasureSpec(0, 0)), cls3, cls3);
                        map3.put(245738379, method6);
                    }
                    ((Method) method6).invoke(null, objArr314);
                }
                Class cls121 = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - TextUtils.indexOf("", "", 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 26 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                Object[] objArr315 = new Object[1];
                b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr315);
                j12 = cls121.getField((String) objArr315[0]).getLong(null);
                if (j12 != -1) {
                    Object[] objArr316 = new Object[1];
                    a(null, null, 127 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u0083\u0081\u008c\u0084\u0098\u009a\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0099\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr316);
                    Class<?> cls122 = Class.forName(((String) objArr316[0]).intern());
                    Object[] objArr317 = new Object[1];
                    a(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0099\u008b\u0082\u008c\u0084\u0084\u009b\u0090", objArr317);
                    applicationContext = (Context) cls122.getMethod(((String) objArr317[0]).intern(), null).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                    Object[] objArr318 = {applicationContext, Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 257047078};
                    short s12 = (short) ($$e & 917);
                    byte[] bArr13 = $$d;
                    context = applicationContext;
                    Object[] objArr410 = new Object[1];
                    c(s12, (byte) (-bArr13[c12]), bArr13[2], objArr410);
                    Class<?> cls123 = Class.forName((String) objArr410[0]);
                    Object[] objArr411 = new Object[1];
                    c((short) EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, bArr13[59], bArr13[40], objArr411);
                    objArr5 = (Object[]) cls123.getMethod((String) objArr411[0], Context.class, cls3, cls3).invoke(null, objArr318);
                    if (context != null) {
                        Class cls213 = (Class) atd.a.getMessageVersion.getSDKTransactionID(663 - TextUtils.lastIndexOf("", '0'), (char) Color.green(0), TextUtils.indexOf("", "") + 25);
                        byte b213 = bArr[11];
                        Object[] objArr412 = new Object[1];
                        b(b213, (byte) (b213 | 9), bArr[72], objArr412);
                        cls213.getField((String) objArr412[0]).set(null, objArr5);
                        Long lValueOf11 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls214 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 664, (char) KeyEvent.keyCodeFromString(""), 'I' - AndroidCharacter.getMirror('0'));
                        Object[] objArr413 = new Object[1];
                        b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr413);
                        cls214.getField((String) objArr413[0]).set(null, lValueOf11);
                    }
                    objArr6 = objArr5;
                } else {
                    Object[] objArr319 = new Object[1];
                    a(null, null, 127 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u0083\u0081\u008c\u0084\u0098\u009a\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0099\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr319);
                    Class<?> cls124 = Class.forName(((String) objArr319[0]).intern());
                    Object[] objArr3110 = new Object[1];
                    a(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0099\u008b\u0082\u008c\u0084\u0084\u009b\u0090", objArr3110);
                    applicationContext = (Context) cls124.getMethod(((String) objArr3110[0]).intern(), null).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                    Object[] objArr3111 = {applicationContext, Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 257047078};
                    short s13 = (short) ($$e & 917);
                    byte[] bArr14 = $$d;
                    context = applicationContext;
                    Object[] objArr414 = new Object[1];
                    c(s13, (byte) (-bArr14[c12]), bArr14[2], objArr414);
                    Class<?> cls125 = Class.forName((String) objArr414[0]);
                    Object[] objArr415 = new Object[1];
                    c((short) EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, bArr14[59], bArr14[40], objArr415);
                    objArr5 = (Object[]) cls125.getMethod((String) objArr415[0], Context.class, cls3, cls3).invoke(null, objArr3111);
                    if (context != null) {
                        Class cls215 = (Class) atd.a.getMessageVersion.getSDKTransactionID(663 - TextUtils.lastIndexOf("", '0'), (char) Color.green(0), TextUtils.indexOf("", "") + 25);
                        byte b214 = bArr[11];
                        Object[] objArr416 = new Object[1];
                        b(b214, (byte) (b214 | 9), bArr[72], objArr416);
                        cls215.getField((String) objArr416[0]).set(null, objArr5);
                        Long lValueOf12 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls216 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 664, (char) KeyEvent.keyCodeFromString(""), 'I' - AndroidCharacter.getMirror('0'));
                        Object[] objArr417 = new Object[1];
                        b(bArr[11], bArr[51], (byte) (-bArr[38]), objArr417);
                        cls216.getField((String) objArr417[0]).set(null, lValueOf12);
                    }
                    objArr6 = objArr5;
                }
                i14 = ((int[]) objArr6[1])[0];
                i15 = ((int[]) objArr6[0])[0];
                if (i15 == i14) {
                    Object[] objArr418 = {objArr6, Integer.valueOf(((int[]) objArr6[3])[0]), num};
                    method12 = map3.get(1046315470);
                    if (method12 != null) {
                        method12 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2802 - View.getDefaultSize(0, 0), (char) (64313 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 29)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map3.put(1046315470, method12);
                    }
                    ((Method) method12).invoke(null, objArr418);
                } else {
                    Object[] objArr419 = {Long.valueOf(((long) (i14 ^ i15)) ^ 1298746617947488256L), 302388015L};
                    byte[] bArr15 = $$d;
                    Object[] objArr420 = objArr6;
                    Object[] objArr421 = new Object[1];
                    c((short) 94, (byte) (-bArr15[184]), bArr15[2], objArr421);
                    Class<?> cls217 = Class.forName((String) objArr421[0]);
                    Object[] objArr516 = new Object[1];
                    c((short) EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, bArr15[59], bArr15[40], objArr516);
                    String str9 = (String) objArr516[0];
                    Class cls218 = Long.TYPE;
                    cls217.getMethod(str9, cls218, cls218).invoke(null, objArr419);
                    Object[] objArr517 = {objArr420, Integer.valueOf(((int[]) objArr420[3])[0]), num};
                    method7 = map3.get(1046315470);
                    if (method7 != null) {
                        method7 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2801 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (64314 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getTrimmedLength("") + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map3.put(1046315470, method7);
                    }
                    ((Method) method7).invoke(null, objArr517);
                }
                Class cls219 = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - (Process.myPid() >> 22), (char) View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionType(0L) + 25);
                byte b215 = bArr[11];
                byte b216 = (byte) (b215 | 6);
                Object[] objArr518 = new Object[1];
                b(b215, b216, (byte) (b216 + 3), objArr518);
                j13 = cls219.getField((String) objArr518[0]).getLong(null);
                if (j13 != -1) {
                    i23 = ChallengeResult + 111;
                    ChallengeResultCancelled = i23 % 128;
                    if (i23 % 2 == 0) {
                        Object[] objArr519 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1843719650};
                        byte[] bArr16 = $$d;
                        Object[] objArr5110 = new Object[1];
                        c((short) (-bArr16[125]), bArr16[20], bArr16[2], objArr5110);
                        Class<?> cls2110 = Class.forName((String) objArr5110[0]);
                        Object[] objArr5111 = new Object[1];
                        c((short) 152, bArr16[39], bArr16[40], objArr5111);
                        Object[] objArr5112 = (Object[]) cls2110.getMethod((String) objArr5111[0], cls3, cls3).invoke(null, objArr519);
                        Class cls2111 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 25 - KeyEvent.keyCodeFromString(""));
                        Object[] objArr5113 = new Object[1];
                        b(bArr[31], bArr[51], bArr[11], objArr5113);
                        cls2111.getField((String) objArr5113[0]).set(null, objArr5112);
                        Long lValueOf13 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls2112 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.blue(0) + 664, (char) KeyEvent.getDeadChar(0, 0), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b217 = bArr[11];
                        byte b218 = (byte) (b217 | 6);
                        c13 = 1;
                        Object[] objArr5114 = new Object[1];
                        b(b217, b218, (byte) (b218 + 3), objArr5114);
                        c14 = 0;
                        cls2112.getField((String) objArr5114[0]).set(null, lValueOf13);
                        objArr7 = objArr5112;
                    } else {
                        Object[] objArr5115 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1843719650};
                        byte[] bArr17 = $$d;
                        Object[] objArr5116 = new Object[1];
                        c((short) (-bArr17[125]), bArr17[20], bArr17[2], objArr5116);
                        Class<?> cls2113 = Class.forName((String) objArr5116[0]);
                        Object[] objArr5117 = new Object[1];
                        c((short) 152, bArr17[39], bArr17[40], objArr5117);
                        Object[] objArr5118 = (Object[]) cls2113.getMethod((String) objArr5117[0], cls3, cls3).invoke(null, objArr5115);
                        Class cls2114 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 25 - KeyEvent.keyCodeFromString(""));
                        Object[] objArr5119 = new Object[1];
                        b(bArr[31], bArr[51], bArr[11], objArr5119);
                        cls2114.getField((String) objArr5119[0]).set(null, objArr5118);
                        Long lValueOf14 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls2115 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.blue(0) + 664, (char) KeyEvent.getDeadChar(0, 0), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b219 = bArr[11];
                        byte b2110 = (byte) (b219 | 6);
                        c13 = 1;
                        Object[] objArr51110 = new Object[1];
                        b(b219, b2110, (byte) (b2110 + 3), objArr51110);
                        c14 = 0;
                        cls2115.getField((String) objArr51110[0]).set(null, lValueOf14);
                        objArr7 = objArr5118;
                    }
                } else {
                    Object[] objArr51111 = {Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), 1843719650};
                    byte[] bArr18 = $$d;
                    Object[] objArr51112 = new Object[1];
                    c((short) (-bArr18[125]), bArr18[20], bArr18[2], objArr51112);
                    Class<?> cls2116 = Class.forName((String) objArr51112[0]);
                    Object[] objArr51113 = new Object[1];
                    c((short) 152, bArr18[39], bArr18[40], objArr51113);
                    Object[] objArr51114 = (Object[]) cls2116.getMethod((String) objArr51113[0], cls3, cls3).invoke(null, objArr51111);
                    Class cls2117 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 664, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 25 - KeyEvent.keyCodeFromString(""));
                    Object[] objArr51115 = new Object[1];
                    b(bArr[31], bArr[51], bArr[11], objArr51115);
                    cls2117.getField((String) objArr51115[0]).set(null, objArr51114);
                    Long lValueOf15 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                    Class cls2118 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.blue(0) + 664, (char) KeyEvent.getDeadChar(0, 0), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b2111 = bArr[11];
                    byte b2112 = (byte) (b2111 | 6);
                    c13 = 1;
                    Object[] objArr51116 = new Object[1];
                    b(b2111, b2112, (byte) (b2112 + 3), objArr51116);
                    c14 = 0;
                    cls2118.getField((String) objArr51116[0]).set(null, lValueOf15);
                    objArr7 = objArr51114;
                }
                i16 = ((int[]) objArr7[c13])[c14];
                i17 = ((int[]) objArr7[c14])[c14];
                if (i17 == i16) {
                    int i211 = ((int[]) objArr7[3])[c14];
                    Object[] objArr610 = new Object[3];
                    objArr610[2] = num;
                    objArr610[1] = Integer.valueOf(i211);
                    objArr610[c14] = objArr7;
                    method11 = map3.get(1046315470);
                    if (method11 != null) {
                        method11 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + NearbyMessagesStatusCodes.TOO_MANY_PENDING_INTENTS, (char) (64314 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 27 - ImageFormat.getBitsPerPixel(0))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map3.put(1046315470, method11);
                    }
                    ((Method) method11).invoke(null, objArr610);
                } else {
                    new ArrayList().add((String) objArr7[2]);
                    Object[] objArr611 = {Long.valueOf(((long) (i16 ^ i17)) ^ 217523476313931776L), 50646115L};
                    byte[] bArr19 = $$d;
                    Object[] objArr612 = objArr7;
                    Object[] objArr613 = new Object[1];
                    c((short) 41, (byte) (bArr19[96] - 1), bArr19[2], objArr613);
                    Class<?> cls310 = Class.forName((String) objArr613[0]);
                    Object[] objArr614 = new Object[1];
                    c(bArr19[30], bArr19[2], bArr19[40], objArr614);
                    String str10 = (String) objArr614[0];
                    Class cls311 = Long.TYPE;
                    cls310.getMethod(str10, cls311, cls311).invoke(null, objArr611);
                    Object[] objArr615 = {objArr612, Integer.valueOf(((int[]) objArr612[3])[0]), num};
                    method8 = map3.get(1046315470);
                    if (method8 != null) {
                        method8 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64315 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (Process.myPid() >> 22) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map3.put(1046315470, method8);
                    }
                    ((Method) method8).invoke(null, objArr615);
                }
                Class cls312 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 664, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24 - TextUtils.lastIndexOf("", '0'));
                Object[] objArr616 = new Object[1];
                b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr616);
                j14 = cls312.getField((String) objArr616[0]).getLong(null);
                if (j14 != -1) {
                    Object[] objArr617 = new Object[1];
                    a(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0083\u0081\u008c\u0084\u0098\u009a\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0099\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr617);
                    Class<?> cls313 = Class.forName(((String) objArr617[0]).intern());
                    Object[] objArr618 = new Object[1];
                    a(null, null, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 127, "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0099\u008b\u0082\u008c\u0084\u0084\u009b\u0090", objArr618);
                    applicationContext2 = (Context) cls313.getMethod(((String) objArr618[0]).intern(), null).invoke(null, null);
                    if (applicationContext2 != null) {
                        i19 = ChallengeResultCancelled + 97;
                        ChallengeResult = i19 % 128;
                        if (i19 % 2 != 0) {
                            applicationContext2.getApplicationContext();
                            throw null;
                        }
                        applicationContext2 = applicationContext2.getApplicationContext();
                    }
                    Object[] objArr710 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), -920297431};
                    byte[] bArr20 = $$d;
                    byte b310 = bArr20[2];
                    Object[] objArr711 = new Object[1];
                    c(b310, (byte) (-bArr20[240]), b310, objArr711);
                    Class<?> cls314 = Class.forName((String) objArr711[0]);
                    Object[] objArr712 = new Object[1];
                    c(bArr20[30], bArr20[2], bArr20[40], objArr712);
                    objArr8 = (Object[]) cls314.getMethod((String) objArr712[0], Context.class, cls3, cls3).invoke(null, objArr710);
                    if (applicationContext2 != null) {
                        i18 = ChallengeResult + 97;
                        ChallengeResultCancelled = i18 % 128;
                        if (i18 % 2 == 0) {
                            Class cls315 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + 664, (char) TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 25);
                            byte b311 = (byte) (-bArr[56]);
                            byte b312 = bArr[11];
                            Object[] objArr713 = new Object[1];
                            b(b311, b312, (byte) (b312 | 29), objArr713);
                            cls315.getField((String) objArr713[0]).set(null, objArr8);
                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, new Class[1]).invoke(null, null)).longValue());
                            cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - TextUtils.getTrimmedLength(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            Object[] objArr714 = new Object[1];
                            b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr714);
                            obj = objArr714[0];
                        } else {
                            Class cls316 = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - Color.blue(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getMode(0) + 25);
                            byte b313 = (byte) (-bArr[56]);
                            byte b314 = bArr[11];
                            Object[] objArr715 = new Object[1];
                            b(b313, b314, (byte) (b314 | 29), objArr715);
                            cls316.getField((String) objArr715[0]).set(null, objArr8);
                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                            cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 663, (char) TextUtils.indexOf("", "", 0), 25 - TextUtils.getOffsetAfter("", 0));
                            Object[] objArr716 = new Object[1];
                            b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr716);
                            obj = objArr716[0];
                        }
                        cls.getField((String) obj).set(null, lValueOf);
                    }
                    objArr9 = objArr8;
                } else {
                    Object[] objArr619 = new Object[1];
                    a(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0083\u0081\u008c\u0084\u0098\u009a\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0099\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr619);
                    Class<?> cls317 = Class.forName(((String) objArr619[0]).intern());
                    Object[] objArr6110 = new Object[1];
                    a(null, null, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 127, "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0099\u008b\u0082\u008c\u0084\u0084\u009b\u0090", objArr6110);
                    applicationContext2 = (Context) cls317.getMethod(((String) objArr6110[0]).intern(), null).invoke(null, null);
                    if (applicationContext2 != null) {
                        i19 = ChallengeResultCancelled + 97;
                        ChallengeResult = i19 % 128;
                        if (i19 % 2 != 0) {
                            applicationContext2.getApplicationContext();
                            throw null;
                        }
                        applicationContext2 = applicationContext2.getApplicationContext();
                    }
                    Object[] objArr717 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue()), -920297431};
                    byte[] bArr21 = $$d;
                    byte b315 = bArr21[2];
                    Object[] objArr718 = new Object[1];
                    c(b315, (byte) (-bArr21[240]), b315, objArr718);
                    Class<?> cls318 = Class.forName((String) objArr718[0]);
                    Object[] objArr719 = new Object[1];
                    c(bArr21[30], bArr21[2], bArr21[40], objArr719);
                    objArr8 = (Object[]) cls318.getMethod((String) objArr719[0], Context.class, cls3, cls3).invoke(null, objArr717);
                    if (applicationContext2 != null) {
                        i18 = ChallengeResult + 97;
                        ChallengeResultCancelled = i18 % 128;
                        if (i18 % 2 == 0) {
                            Class cls319 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + 664, (char) TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 25);
                            byte b316 = (byte) (-bArr[56]);
                            byte b317 = bArr[11];
                            Object[] objArr7110 = new Object[1];
                            b(b316, b317, (byte) (b317 | 29), objArr7110);
                            cls319.getField((String) objArr7110[0]).set(null, objArr8);
                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, new Class[1]).invoke(null, null)).longValue());
                            cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - TextUtils.getTrimmedLength(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            Object[] objArr7111 = new Object[1];
                            b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr7111);
                            obj = objArr7111[0];
                        } else {
                            Class cls3110 = (Class) atd.a.getMessageVersion.getSDKTransactionID(664 - Color.blue(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getMode(0) + 25);
                            byte b318 = (byte) (-bArr[56]);
                            byte b319 = bArr[11];
                            Object[] objArr7112 = new Object[1];
                            b(b318, b319, (byte) (b319 | 29), objArr7112);
                            cls3110.getField((String) objArr7112[0]).set(null, objArr8);
                            lValueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                            cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 663, (char) TextUtils.indexOf("", "", 0), 25 - TextUtils.getOffsetAfter("", 0));
                            Object[] objArr7113 = new Object[1];
                            b(bArr[11], bArr[20], (byte) (-bArr[92]), objArr7113);
                            obj = objArr7113[0];
                        }
                        cls.getField((String) obj).set(null, lValueOf);
                    }
                    objArr9 = objArr8;
                }
                i21 = ((int[]) objArr9[1])[0];
                i22 = ((int[]) objArr9[0])[0];
                if (i22 == i21) {
                    Object[] objArr720 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), num};
                    method10 = map3.get(1046315470);
                    if (method10 != null) {
                        method10 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2801 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (KeyEvent.getDeadChar(0, 0) + 64314), TextUtils.getOffsetAfter("", 0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map3.put(1046315470, method10);
                    }
                    ((Method) method10).invoke(null, objArr720);
                } else {
                    Object[] objArr85 = {Long.valueOf(((long) (i21 ^ i22)) ^ 2471928630045835264L), 575541246L};
                    byte[] bArr110 = $$d;
                    Object[] objArr86 = new Object[1];
                    c((short) 41, (byte) (bArr110[96] - 1), bArr110[2], objArr86);
                    Class<?> cls320 = Class.forName((String) objArr86[0]);
                    Object[] objArr87 = new Object[1];
                    c(bArr110[30], bArr110[2], bArr110[40], objArr87);
                    String str11 = (String) objArr87[0];
                    Class cls321 = Long.TYPE;
                    cls320.getMethod(str11, cls321, cls321).invoke(null, objArr85);
                    Object[] objArr88 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), num};
                    method9 = map3.get(1046315470);
                    if (method9 != null) {
                        method9 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64313 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                        map3.put(1046315470, method9);
                    }
                    ((Method) method9).invoke(null, objArr88);
                }
                p013kotlin.jvm.internal.s.k(application, "");
                p013kotlin.jvm.internal.s.k(configParameters, "");
                p013kotlin.jvm.internal.s.k(list, "");
                getMessageVersion getmessageversion2 = new getMessageVersion((Collection) AuthenticationRequestParameters.getSDKAppID(new Object[]{configParameters}, 374901766, -374901766, (int) System.currentTimeMillis()));
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    if (!(((Warning) obj2) instanceof atd.ap.getSDKAppID)) {
                        arrayList.add(obj2);
                    }
                }
                return new getDeviceData(arrayList, getmessageversion2.t_(application), getSDKAppID.V1_6);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
            str = strIntern;
            num = 0;
            int iIntValue3 = ((Integer) Class.forName(strIntern3).getMethod(strIntern4, Object.class).invoke(null, this)).intValue();
            Object[] objArr89 = new Object[3];
            objArr89[i11] = -1087466761;
            objArr89[1] = null;
            objArr89[0] = Integer.valueOf(iIntValue3);
            Map map8 = atd.a.getMessageVersion.timedout;
            Object method22 = map8.get(1459979046);
            if (method22 == null) {
                Class cls44 = (Class) atd.a.getMessageVersion.getSDKTransactionID(721 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 33 - Color.argb(0, 0, 0, 0));
                byte b41 = bArr[11];
                byte b42 = bArr[20];
                byte b43 = (byte) (-bArr[92]);
                Object[] objArr90 = new Object[1];
                b(b41, b42, b43, objArr90);
                method22 = cls44.getMethod((String) objArr90[0], cls3, cls3, cls3);
                map8.put(1459979046, method22);
            }
            objArr = (Object[]) ((Method) method22).invoke(null, objArr89);
            Class cls45 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 721, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 33 - KeyEvent.getDeadChar(0, 0));
            byte b44 = (byte) bArr[11];
            byte b45 = (byte) bArr[20];
            byte b46 = (byte) (-bArr[92]);
            Object[] objArr91 = new Object[1];
            b(b44, b45, b46, objArr91);
            cls45.getField((String) objArr91[0]).set(null, objArr);
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }
}
