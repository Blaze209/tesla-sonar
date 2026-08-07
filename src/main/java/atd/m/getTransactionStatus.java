package atd.m;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocManufacturer;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransactionStatus extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static char[] getDeviceData;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocManufacturer$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static char[] getSDKAppID;
        private static char getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKTransactionID = 1;
            getSDKAppID = new char[]{52408, 53060, 53058, 52402, 52412, 52395, 52413, 52398, 53063, 52394, 52409, 52375, 52410, 53068, 52464, 52415, 52390, 52405, 53061, 52463, 52411, 53062, 52465, 52400, 53056, 52383, 52467, 52381, 52397, 52403, 52396, 53057, 53059, 53069, 52407, 52401};
            getSDKReferenceNumber = (char) 63810;
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.m.getTransactionStatus.getSDKAppID.$$a
                int r8 = 122 - r8
                int r6 = r6 * 2
                int r6 = 66 - r6
                int r7 = r7 + 2
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r7
                r4 = r2
                goto L24
            L12:
                r3 = r2
            L13:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                r3 = r0[r6]
            L24:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + 6
                int r6 = r6 + 1
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getTransactionStatus.getSDKAppID.a(byte, int, short, java.lang.Object[]):void");
        }

        private static void b(int i11, String str, byte b11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            int i13;
            Object method;
            if (str != null) {
                int i14 = $11 + 67;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.completed completedVar = new atd.az.completed();
            char[] cArr2 = getSDKAppID;
            Class cls = Integer.TYPE;
            int i15 = 0;
            if (cArr2 != null) {
                $10 = ($11 + 31) % 128;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i16 = 0;
                while (i16 < length) {
                    $10 = ($11 + 49) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1709775791);
                        if (obj != null) {
                            i13 = i15;
                            method = obj;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2313, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24);
                            byte b12 = (byte) i15;
                            i13 = i15;
                            Object[] objArr3 = new Object[1];
                            c(b12, (byte) (b12 | 55), (byte) (-1), objArr3);
                            method = cls2.getMethod((String) objArr3[i13], cls);
                            map.put(-1709775791, method);
                        }
                        cArr3[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i16++;
                        i15 = i13;
                        cArr = cArr;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = cArr;
            int i17 = i15;
            Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method2 = map2.get(-1709775791);
            if (method2 == null) {
                Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - KeyEvent.getDeadChar(i17, i17), (char) (TextUtils.indexOf((CharSequence) "", '0', i17, i17) + 1), 23 - TextUtils.lastIndexOf("", '0', i17, i17));
                byte b13 = (byte) i17;
                Object[] objArr5 = new Object[1];
                c(b13, (byte) (b13 | 55), (byte) (-1), objArr5);
                method2 = cls3.getMethod((String) objArr5[i17], cls);
                map2.put(-1709775791, method2);
            }
            char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
            char[] cArr5 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr5[i12] = (char) (cArr4[i12] - b11);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                completedVar.getSDKTransactionID = 0;
                while (true) {
                    int i18 = completedVar.getSDKTransactionID;
                    if (i18 >= i12) {
                        break;
                    }
                    char c11 = cArr4[i18];
                    completedVar.getSDKAppID = c11;
                    char c12 = cArr4[i18 + 1];
                    completedVar.getSDKReferenceNumber = c12;
                    if (c11 == c12) {
                        cArr5[i18] = (char) (c11 - b11);
                        cArr5[i18 + 1] = (char) (c12 - b11);
                    } else {
                        Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(700818725);
                        if (method3 == null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 1920, (char) Color.green(0), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr7 = new Object[1];
                            c(b14, b15, (byte) (b15 - 1), objArr7);
                            String str2 = (String) objArr7[0];
                            Class cls5 = Integer.TYPE;
                            method3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                            map3.put(700818725, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        int i19 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i19) {
                            $10 = ($11 + 63) % 128;
                            Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                            Object method4 = map3.get(-248084636);
                            if (method4 == null) {
                                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 48634), Drawable.resolveOpacity(0, 0) + 24);
                                byte b16 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                c(b16, (byte) (b16 | 49), (byte) (-1), objArr9);
                                String str3 = (String) objArr9[0];
                                Class cls7 = Integer.TYPE;
                                method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map3.put(-248084636, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i21 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i22 = completedVar.getSDKTransactionID;
                            cArr5[i22] = cArr2[iIntValue2];
                            cArr5[i22 + 1] = cArr2[i21];
                        } else {
                            int i23 = completedVar.getDeviceData;
                            int i24 = completedVar.AuthenticationRequestParameters;
                            if (i23 == i24) {
                                int i25 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i25;
                                int i26 = ((i19 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i26;
                                int i27 = (i24 * cCharValue) + i26;
                                int i28 = completedVar.getSDKTransactionID;
                                cArr5[i28] = cArr2[(i23 * cCharValue) + i25];
                                cArr5[i28 + 1] = cArr2[i27];
                            } else {
                                int i29 = (i23 * cCharValue) + i19;
                                int i31 = (i24 * cCharValue) + completedVar.getMessageVersion;
                                int i32 = completedVar.getSDKTransactionID;
                                cArr5[i32] = cArr2[i29];
                                cArr5[i32 + 1] = cArr2[i31];
                                $10 = ($11 + 123) % 128;
                            }
                            completedVar.getSDKTransactionID += 2;
                        }
                    }
                    completedVar.getSDKTransactionID += 2;
                }
            }
            int i33 = 0;
            while (i33 < i11) {
                cArr5[i33] = (char) (cArr5[i33] ^ 13722);
                i33++;
                $11 = ($10 + 89) % 128;
            }
            objArr[0] = new String(cArr5);
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
        private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 4
                int r7 = 122 - r7
                byte[] r0 = atd.m.getTransactionStatus.getSDKAppID.$$d
                int r6 = r6 * 2
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r0
                r4 = r2
                r0 = r8
                goto L2b
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r8 = r8 + 1
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r3 = r0[r8]
                r5 = r0
                r0 = r8
                r8 = r3
                r3 = r5
            L2b:
                int r7 = r7 + r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getTransactionStatus.getSDKAppID.c(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Failed to calculate best type for var: r14v20 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v20 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r14v20 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v20 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r14v21 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v21 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v20 ??, new type: int
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
            	... 5 more
            */
        public static java.lang.Object[] getSDKReferenceNumber(android.content.Context r41, int r42, int r43) {
            /*
                Method dump skipped, instruction units count: 2056
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getTransactionStatus.getSDKAppID.getSDKReferenceNumber(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{75, 126, 55, 101, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
            $$b = 132;
        }

        static void init$1() {
            $$d = new byte[]{77, 3, 102, 118};
            $$e = 46;
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        TextUtils.lastIndexOf("", '0');
        ExpandableListView.getPackedPositionChild(0L);
        new getSDKAppID((byte) 0);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 101) % 128;
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{52458, 52383, 52463, 52459};
        getSDKTransactionID = (char) 63814;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 33) % 128;
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MANUFACTURER;
            s.j(str, "");
            DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(str));
            getSDKReferenceNumber = (AuthenticationRequestParameters + 105) % 128;
            return stringValueM49boximpl;
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        int i11 = getSDKReferenceNumber + 7;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 8 / 0;
        }
        return failure;
    }
}
