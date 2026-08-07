package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/NotificationSound;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAdditionalDetails extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/NotificationSound$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] getDeviceData;
        private static int getSDKAppID;
        private static int getSDKReferenceNumber;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKReferenceNumber = 0;
            getSDKAppID = 1;
            getDeviceData = new char[]{30815, 30971, 30851, 30853, 30974, 30851, 30870, 30905, 30878, 30974, 30854, 30853, 30974, 30851, 30854, 30889, 30886, 30859, 30853, 30849, 30852, 30854, 30856, 30725, 30792, 30786, 30804, 30806, 30910, 30784, 30788, 30792, 30796, 30788, 30784, 30786, 30784, 30805, 30805, 30788, 30788, 30729, 30807, 30838, 30839, 30808, 30802, 30798, 30805, 30807, 30809, 30806, 30804, 30804, 30821, 30821, 30800, 30802, 30800, 30804, 30812, 30808, 30804, 30800, 30798, 30822, 30729, 30835, 30800, 30833, 30831, 30799, 30807, 30802, 30799, 30808, 30956, 30959, 30960, 30965, 30735, 30815, 30810, 30809, 30800, 30805, 30813, 30810, 30838, 30838, 30809, 30805, 30802, 30835, 30831, 30800, 30805, 30805, 30834, 30839, 30805, 30802, 30836, 30839, 30804, 30830, 30839, 30806, 30734, 30815, 30809, 30806, 30805, 30798, 30832, 30839, 30810, 30813, 30805, 30800, 30809, 30758};
        }

        private getSDKTransactionID() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 2
                int r7 = 66 - r7
                int r0 = 31 - r6
                byte[] r1 = atd.x.getAdditionalDetails.getSDKTransactionID.$$a
                int r5 = 122 - r5
                byte[] r0 = new byte[r0]
                int r6 = 30 - r6
                r2 = -1
                if (r1 != 0) goto L14
                r3 = r6
                r5 = r7
                goto L29
            L14:
                r4 = r7
                r7 = r5
                r5 = r4
            L17:
                int r2 = r2 + 1
                byte r3 = (byte) r7
                r0[r2] = r3
                if (r2 != r6) goto L27
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r0, r6)
                r8[r6] = r5
                return
            L27:
                r3 = r1[r5]
            L29:
                int r7 = r7 + r3
                int r5 = r5 + 1
                int r7 = r7 + 6
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.getAdditionalDetails.getSDKTransactionID.a(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:29:0x011c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0127 A[PHI: r12
          0x0127: PHI (r12v3 char) = (r12v2 char), (r12v21 char) binds: [B:31:0x0125, B:27:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x0142  */
        /* JADX WARN: Code duplicated, block: B:36:0x0147 A[Catch: all -> 0x0257, TryCatch #0 {all -> 0x0257, blocks: (B:10:0x005f, B:14:0x00c3, B:13:0x0082, B:40:0x0198, B:44:0x01da, B:47:0x01ee, B:51:0x0245, B:50:0x0207, B:43:0x01b3, B:33:0x012b, B:37:0x0185, B:36:0x0147), top: B:76:0x005f }] */
        /* JADX WARN: Code duplicated, block: B:42:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:43:0x01b3 A[Catch: all -> 0x0257, TryCatch #0 {all -> 0x0257, blocks: (B:10:0x005f, B:14:0x00c3, B:13:0x0082, B:40:0x0198, B:44:0x01da, B:47:0x01ee, B:51:0x0245, B:50:0x0207, B:43:0x01b3, B:33:0x012b, B:37:0x0185, B:36:0x0147), top: B:76:0x005f }] */
        private static void b(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
            int i11;
            char c11;
            Map map;
            Object method;
            Class<Object> cls;
            Map map2;
            Object method2;
            Object method3;
            String str2 = str;
            Class<Object> cls2 = Object.class;
            Integer num = -399400818;
            $11 = ($10 + 91) % 128;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = iArr[3];
            char[] cArr = getDeviceData;
            Class cls3 = Integer.TYPE;
            int i16 = 2;
            if (cArr != null) {
                $10 = ($11 + 27) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i17 = 0;
                while (i17 < length) {
                    try {
                        int i18 = i17;
                        Object[] objArr2 = {Integer.valueOf(cArr[i17])};
                        char[] cArr3 = cArr2;
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object obj = map3.get(-1708792688);
                        if (obj != null) {
                            method3 = obj;
                        } else {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0) + 2313, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 24 - View.resolveSizeAndState(0, 0, 0));
                            byte b11 = (byte) 1;
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr3 = new Object[1];
                            c(b11, b12, b12, objArr3);
                            method3 = cls4.getMethod((String) objArr3[0], cls3);
                            map3.put(-1708792688, method3);
                        }
                        cArr3[i18] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                        i17 = i18 + 1;
                        cArr2 = cArr3;
                        i14 = i14;
                        length = length;
                        cArr = cArr;
                        i15 = i15;
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
            int i19 = i14;
            int i21 = i15;
            char[] cArr4 = new char[i13];
            System.arraycopy(cArr, i12, cArr4, 0, i13);
            if (bArr != 0) {
                char[] cArr5 = new char[i13];
                challengeResultError.getSDKAppID = 0;
                char c12 = 0;
                while (true) {
                    int i22 = challengeResultError.getSDKAppID;
                    if (i22 >= i13) {
                        break;
                    }
                    int i23 = $10 + 31;
                    $11 = i23 % 128;
                    int i24 = i23 % 2;
                    float f11 = BitmapDescriptorFactory.HUE_RED;
                    if (i24 == 0) {
                        c11 = 1;
                        if (bArr[i22] == 1) {
                            char c13 = cArr4[i22];
                            Object[] objArr4 = new Object[i16];
                            objArr4[c11] = Integer.valueOf(c12);
                            objArr4[0] = Integer.valueOf(c13);
                            map = atd.a.getMessageVersion.timedout;
                            method = map.get(10570995);
                            if (method != null) {
                                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5486), 22 - TextUtils.indexOf((CharSequence) "", '0'));
                                byte b13 = (byte) 0;
                                byte b14 = b13;
                                Object[] objArr5 = new Object[1];
                                c(b13, b14, b14, objArr5);
                                method = cls6.getMethod((String) objArr5[0], cls3, cls3);
                                map.put(10570995, method);
                            }
                            cArr5[i22] = ((Character) ((Method) method).invoke(null, objArr4)).charValue();
                        } else {
                            cArr4 = cArr4;
                            f11 = 0.0f;
                            Object[] objArr6 = {Integer.valueOf(cArr4[i22]), Integer.valueOf(c12)};
                            map2 = atd.a.getMessageVersion.timedout;
                            method2 = map2.get(-502074319);
                            if (method2 != null) {
                                method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - TextUtils.getTrimmedLength(""), (char) View.resolveSize(0, 0), Color.rgb(0, 0, 0) + 16777240)).getMethod("a", cls3, cls3);
                                map2.put(-502074319, method2);
                            }
                            cArr5[i22] = ((Character) ((Method) method2).invoke(null, objArr6)).charValue();
                        }
                    } else {
                        c11 = 1;
                        if (bArr[i22] == 1) {
                            char c14 = cArr4[i22];
                            Object[] objArr7 = new Object[i16];
                            objArr7[c11] = Integer.valueOf(c12);
                            objArr7[0] = Integer.valueOf(c14);
                            map = atd.a.getMessageVersion.timedout;
                            method = map.get(10570995);
                            if (method != null) {
                                Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5486), 22 - TextUtils.indexOf((CharSequence) "", '0'));
                                byte b15 = (byte) 0;
                                byte b16 = b15;
                                Object[] objArr8 = new Object[1];
                                c(b15, b16, b16, objArr8);
                                method = cls7.getMethod((String) objArr8[0], cls3, cls3);
                                map.put(10570995, method);
                            }
                            cArr5[i22] = ((Character) ((Method) method).invoke(null, objArr7)).charValue();
                        } else {
                            cArr4 = cArr4;
                            f11 = 0.0f;
                            Object[] objArr9 = {Integer.valueOf(cArr4[i22]), Integer.valueOf(c12)};
                            map2 = atd.a.getMessageVersion.timedout;
                            method2 = map2.get(-502074319);
                            if (method2 != null) {
                                method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - TextUtils.getTrimmedLength(""), (char) View.resolveSize(0, 0), Color.rgb(0, 0, 0) + 16777240)).getMethod("a", cls3, cls3);
                                map2.put(-502074319, method2);
                            }
                            cArr5[i22] = ((Character) ((Method) method2).invoke(null, objArr9)).charValue();
                        }
                    }
                    c12 = cArr5[challengeResultError.getSDKAppID];
                    Object[] objArr10 = {challengeResultError, challengeResultError};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Integer num3 = num2;
                    Object method4 = map4.get(num3);
                    if (method4 != null) {
                        cls = cls5;
                    } else {
                        Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0') + 855, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollFriction() > f11 ? 1 : (ViewConfiguration.getScrollFriction() == f11 ? 0 : -1)) + 23);
                        byte b17 = (byte) 3;
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr11 = new Object[1];
                        c(b17, b18, b18, objArr11);
                        cls = cls5;
                        method4 = cls8.getMethod((String) objArr11[0], cls, cls);
                        map4.put(num3, method4);
                    }
                    ((Method) method4).invoke(null, objArr10);
                    num2 = num3;
                    cls5 = cls;
                    cArr5 = cArr5;
                    cArr4 = cArr4;
                    i16 = 2;
                }
                cArr4 = cArr5;
            }
            if (i21 > 0) {
                char[] cArr6 = new char[i13];
                i11 = 0;
                System.arraycopy(cArr4, 0, cArr6, 0, i13);
                int i25 = i13 - i21;
                System.arraycopy(cArr6, 0, cArr4, i25, i21);
                System.arraycopy(cArr6, i21, cArr4, 0, i25);
            } else {
                i11 = 0;
            }
            if (z11) {
                char[] cArr7 = new char[i13];
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i26 = challengeResultError.getSDKAppID;
                    if (i26 >= i13) {
                        break;
                    }
                    $11 = ($10 + 101) % 128;
                    cArr7[i26] = cArr4[(i13 - i26) - 1];
                    challengeResultError.getSDKAppID = i26 + 1;
                }
                cArr4 = cArr7;
            }
            if (i19 > 0) {
                challengeResultError.getSDKAppID = 0;
                while (true) {
                    int i27 = challengeResultError.getSDKAppID;
                    if (i27 >= i13) {
                        break;
                    }
                    cArr4[i27] = (char) (cArr4[i27] - iArr[2]);
                    challengeResultError.getSDKAppID = i27 + 1;
                }
            }
            String str3 = new String(cArr4);
            $10 = ($11 + 107) % 128;
            objArr[0] = str3;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 2
                int r8 = 1 - r8
                int r7 = r7 * 2
                int r7 = r7 + 98
                int r9 = r9 * 3
                int r9 = 3 - r9
                byte[] r0 = atd.x.getAdditionalDetails.getSDKTransactionID.$$d
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r5 = r2
                r0 = r9
                goto L2f
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L2f:
                int r9 = -r9
                int r7 = r7 + r9
                r9 = r0
                r0 = r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.getAdditionalDetails.getSDKTransactionID.c(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r21v0 */
        /* JADX WARN: Type inference failed for: r21v1 */
        /* JADX WARN: Type inference failed for: r21v10 */
        /* JADX WARN: Type inference failed for: r21v2 */
        /* JADX WARN: Type inference failed for: r21v3 */
        /* JADX WARN: Type inference failed for: r21v4 */
        /* JADX WARN: Type inference failed for: r21v5 */
        /* JADX WARN: Type inference failed for: r21v7 */
        /* JADX WARN: Type inference failed for: r21v8 */
        /* JADX WARN: Type inference failed for: r21v9 */
        /* JADX WARN: Type inference failed for: r22v1 */
        /* JADX WARN: Type inference failed for: r22v10 */
        /* JADX WARN: Type inference failed for: r22v11 */
        /* JADX WARN: Type inference failed for: r22v12 */
        /* JADX WARN: Type inference failed for: r22v13 */
        /* JADX WARN: Type inference failed for: r22v2 */
        /* JADX WARN: Type inference failed for: r22v3 */
        /* JADX WARN: Type inference failed for: r22v4 */
        /* JADX WARN: Type inference failed for: r22v5 */
        /* JADX WARN: Type inference failed for: r22v7 */
        /* JADX WARN: Type inference failed for: r22v8 */
        /* JADX WARN: Type inference failed for: r22v9 */
        /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.reflect.Method] */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKReferenceNumber(android.content.Context r31, int r32, int r33) {
            /*
                Method dump skipped, instruction units count: 1988
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.getAdditionalDetails.getSDKTransactionID.getSDKReferenceNumber(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{81, -98, -48, -128, -8, 9, -39, -21, 1, 1, 13, -5, -7, 7, -19, 3, -17, -4, -29, 33, -14, -17, -3, 7, 46, -7, -18, -9, 3, 0, -17, -12, -8, 13, -17, 0, -7, -34, 13, 6, -2, -22, 8, -5, -42, 11, 11, -23, 6, -14, 9, -21, 7, -5, -8, 9, -39, -21, 1, -16, 41, -6, -45, -11, -1, -27, -39};
            $$b = 126;
        }

        static void init$1() {
            $$d = new byte[]{13, -98, -57, -23};
            $$e = 138;
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getMaximumFlingVelocity();
        AndroidCharacter.getMirror('0');
        ExpandableListView.getPackedPositionForGroup(0);
        new getSDKTransactionID((byte) 0);
        int i11 = getSDKAppID + 17;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getAdditionalDetails(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        char[] cArr;
        Throwable cause;
        int i14;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr2 = new char[i12];
        int i15 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i16 = getmessageversion.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            char c11 = charArray[i16];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i16] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getDeviceData);
                objArr2[i15] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    i14 = i15;
                    method = obj;
                } else {
                    i14 = i15;
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(i15, i15) + 1186, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 45 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    byte b11 = $$a[3];
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 + 1), objArr3);
                    String str2 = (String) objArr3[i14];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i14] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    int i17 = i14;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (48634 - View.combineMeasuredStates(i17, i17)), 24 - TextUtils.indexOf("", "", i17));
                    byte b13 = $$a[3];
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                charArray = charArray;
                i15 = 0;
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
        if (i13 > 0) {
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr3 = new char[i12];
            System.arraycopy(cArr2, 0, cArr3, 0, i12);
            int i18 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, 0, cArr2, i12 - i18, i18);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i19, cArr2, 0, i12 - i19);
        }
        if (z11) {
            int i21 = $10 + 15;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                cArr = new char[i12];
                getmessageversion.getDeviceData = 1;
            } else {
                cArr = new char[i12];
                getmessageversion.getDeviceData = 0;
            }
            while (true) {
                int i22 = getmessageversion.getDeviceData;
                if (i22 >= i12) {
                    break;
                }
                cArr[i22] = cArr2[(i12 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.getOffsetAfter("", 0) + 48634), Color.argb(0, 0, 0, 0) + 24);
                    byte b15 = $$a[3];
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                $11 = ($10 + 51) % 128;
            }
            cArr2 = cArr;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(short s11, int i11, short s12, Object[] objArr) {
        byte[] bArr = $$a;
        int i12 = s11 * 3;
        int i13 = (s12 * 2) + 66;
        int i14 = 3 - (i11 * 4);
        byte[] bArr2 = new byte[i12 + 1];
        int i15 = -1;
        if (bArr == null) {
            i13 += -i12;
        }
        while (true) {
            i15++;
            i14++;
            bArr2[i15] = (byte) i13;
            if (i15 == i12) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i13 += -bArr[i14];
        }
    }

    static void getSDKReferenceNumber() {
        getDeviceData = 1029304933;
    }

    static void init$0() {
        $$a = new byte[]{25, 11, 21, 0};
        $$b = 56;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 119, false, 18 - TextUtils.indexOf("", ""), "\u0003\ufff4\b\u0004\n\u0003\ufff9\u0003\u0004\t\ufffe\ufffb\ufffe\ufff8\ufff6\t\ufffe\u0004", (Process.myPid() >> 22) + 7, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        getSDKTransactionID = (getSDKAppID + 79) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
        int i11 = getSDKAppID + 93;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return stringValueM49boximpl;
        }
        throw null;
    }

    private getAdditionalDetails(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
