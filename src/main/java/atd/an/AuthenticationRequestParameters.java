package atd.an;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getAdditionalDetails;
import atd.az.getTransactionStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ AuthenticationRequestParameters[] $VALUES;
    private static int AuthenticationRequestParameters;
    public static final AuthenticationRequestParameters P256;
    private static long getDeviceData;
    private static int getSDKReferenceNumber;
    private final String mApiName;
    private final ECParameterSpec mECParameterSpec;

    interface getSDKReferenceNumber {
        ECParameterSpec AuthenticationRequestParameters();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getDeviceData();
        Object[] objArr = new Object[1];
        a("傌\uf813ēꨝ", 43261 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("傌\udb60䟌\uf25a纮", 35729 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr2);
        P256 = new AuthenticationRequestParameters(strIntern, ((String) objArr2[0]).intern(), new getSDKReferenceNumber() { // from class: atd.an.AuthenticationRequestParameters.getSDKTransactionID
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static long AuthenticationRequestParameters;
            private static int getDeviceData;
            private static long getSDKAppID;
            private static int getSDKReferenceNumber;

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getDeviceData = 0;
                getSDKReferenceNumber = 1;
                getSDKAppID = -2072175933353817026L;
                AuthenticationRequestParameters = 5560982766570564792L;
            }

            private static void a(String str, int i11, Object[] objArr3) throws Throwable {
                int i12 = $11 + 81;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                char[] charArray = str != null ? str.toCharArray() : str;
                getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
                char[] deviceData = getAdditionalDetails.getDeviceData(getSDKAppID ^ 4326518537449951405L, charArray, i11);
                getadditionaldetails.getDeviceData = 4;
                $11 = ($10 + 117) % 128;
                while (true) {
                    int i13 = getadditionaldetails.getDeviceData;
                    if (i13 >= deviceData.length) {
                        objArr3[0] = new String(deviceData, 4, deviceData.length - 4);
                        return;
                    }
                    int i14 = i13 - 4;
                    getadditionaldetails.getSDKTransactionID = i14;
                    try {
                        Object[] objArr4 = {Long.valueOf(deviceData[i13] ^ deviceData[i13 % 4]), Long.valueOf(i14), Long.valueOf(getSDKAppID)};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(-1024136788);
                        if (method == null) {
                            Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(AndroidCharacter.getMirror('0') + 2701, (char) (54838 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getTouchSlop() >> 8) + 29);
                            Class cls2 = Long.TYPE;
                            method = cls.getMethod("c", cls2, cls2, cls2);
                            map.put(-1024136788, method);
                        }
                        deviceData[i13] = ((Character) ((Method) method).invoke(null, objArr4)).charValue();
                        Object[] objArr5 = {getadditionaldetails, getadditionaldetails};
                        Object method2 = map.get(-719904898);
                        if (method2 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 1401, (char) (16690 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22);
                            byte b11 = (byte) 1;
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr6 = new Object[1];
                            d(b11, b12, b12, objArr6);
                            method2 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                            map.put(-719904898, method2);
                        }
                        ((Method) method2).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:39:0x016c  */
            /* JADX WARN: Code duplicated, block: B:40:0x016d  */
            private static void b(String str, int i11, Object[] objArr3) throws Throwable {
                char[] charArray;
                Throwable cause;
                int i12;
                Object method;
                int i13 = $11;
                $10 = (i13 + 107) % 128;
                char c11 = 2;
                if (str != null) {
                    int i14 = i13 + 87;
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
                getTransactionStatus gettransactionstatus = new getTransactionStatus();
                gettransactionstatus.getSDKAppID = i11;
                int length = cArr.length;
                long[] jArr = new long[length];
                int i15 = 0;
                gettransactionstatus.getSDKTransactionID = 0;
                while (true) {
                    int i16 = gettransactionstatus.getSDKTransactionID;
                    if (i16 >= cArr.length) {
                        break;
                    }
                    char c12 = cArr[i16];
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[c11] = gettransactionstatus;
                        objArr4[1] = gettransactionstatus;
                        objArr4[i15] = Integer.valueOf(c12);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(962978490);
                        if (obj != null) {
                            i12 = i15;
                            method = obj;
                        } else {
                            Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + 689, (char) (TextUtils.getOffsetAfter("", i15) + 16022), 32 - ((Process.getThreadPriority(i15) + 20) >> 6));
                            byte b11 = (byte) i15;
                            byte b12 = b11;
                            i12 = i15;
                            Object[] objArr5 = new Object[1];
                            d(b11, b12, b12, objArr5);
                            method = cls.getMethod((String) objArr5[i12], Integer.TYPE, Object.class, Object.class);
                            map.put(962978490, method);
                        }
                        jArr[i16] = ((Long) ((Method) method).invoke(null, objArr4)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                        Object[] objArr6 = new Object[2];
                        objArr6[1] = gettransactionstatus;
                        objArr6[i12] = gettransactionstatus;
                        Object method2 = map.get(-46730980);
                        if (method2 == null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 417, (char) (29016 - Process.getGidForName("")), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("A", Object.class, Object.class);
                            map.put(-46730980, method2);
                        }
                        ((Method) method2).invoke(null, objArr6);
                        i15 = i12;
                        jArr = jArr;
                        c11 = 2;
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
                gettransactionstatus.getSDKTransactionID = i15;
                while (true) {
                    int i17 = gettransactionstatus.getSDKTransactionID;
                    if (i17 >= cArr.length) {
                        objArr3[0] = new String(cArr2);
                        return;
                    }
                    $11 = ($10 + 23) % 128;
                    cArr2[i17] = (char) jArr2[i17];
                    Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-46730980);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - TextUtils.getTrimmedLength(""), (char) (TextUtils.lastIndexOf("", '0', 0) + 29018), ImageFormat.getBitsPerPixel(0) + 25)).getMethod("A", Object.class, Object.class);
                        map2.put(-46730980, method3);
                    }
                    ((Method) method3).invoke(null, objArr7);
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
            private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = atd.an.AuthenticationRequestParameters.getSDKTransactionID.$$a
                    int r1 = 31 - r7
                    int r5 = 122 - r5
                    int r6 = r6 * 2
                    int r6 = 65 - r6
                    byte[] r1 = new byte[r1]
                    int r7 = 30 - r7
                    r2 = 0
                    if (r0 != 0) goto L14
                    r4 = r7
                    r3 = r2
                    goto L28
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r6 = r6 + 1
                    if (r3 != r7) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L24:
                    r4 = r0[r6]
                    int r3 = r3 + 1
                L28:
                    int r5 = r5 + r4
                    int r5 = r5 + 6
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.an.AuthenticationRequestParameters.getSDKTransactionID.c(byte, int, int, java.lang.Object[]):void");
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
            private static void d(short r5, byte r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    int r5 = r5 * 17
                    int r5 = 118 - r5
                    int r7 = r7 * 2
                    int r0 = r7 + 1
                    byte[] r1 = atd.an.AuthenticationRequestParameters.getSDKTransactionID.$$d
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L16
                    r4 = r6
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r5
                    r0[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L24:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                L28:
                    int r6 = r6 + 1
                    int r4 = -r4
                    int r5 = r5 + r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.an.AuthenticationRequestParameters.getSDKTransactionID.d(short, byte, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:56:0x0488 A[Catch: Exception -> 0x059e, TRY_LEAVE, TryCatch #2 {Exception -> 0x059e, blocks: (B:54:0x0482, B:56:0x0488), top: B:116:0x0482 }] */
            /* JADX WARN: Code duplicated, block: B:59:0x04b2  */
            /* JADX WARN: Code duplicated, block: B:60:0x04b3 A[Catch: all -> 0x0591, TryCatch #0 {all -> 0x0591, blocks: (B:57:0x04a1, B:61:0x04fa, B:60:0x04b3), top: B:113:0x04a1, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:64:0x058b  */
            /* JADX WARN: Code duplicated, block: B:65:0x058e A[PHI: r20 r27
              0x058e: PHI (r20v2 ??) = (r20v1 ??), (r20v4 ??), (r20v7 ??) binds: [B:72:0x059e, B:112:0x058e, B:63:0x0589] A[DONT_GENERATE, DONT_INLINE]
              0x058e: PHI (r27v1 java.lang.Integer) = (r27v0 java.lang.Integer), (r27v4 java.lang.Integer), (r27v6 java.lang.Integer) binds: [B:72:0x059e, B:112:0x058e, B:63:0x0589] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:73:0x05a3 A[Catch: Exception -> 0x058e, TRY_LEAVE, TryCatch #1 {Exception -> 0x058e, blocks: (B:68:0x0596, B:70:0x059c, B:71:0x059d, B:73:0x05a3, B:79:0x0620, B:81:0x0640, B:83:0x0646, B:84:0x0647, B:57:0x04a1, B:61:0x04fa, B:60:0x04b3, B:74:0x05c1, B:78:0x061a, B:77:0x05d3), top: B:115:0x0486, inners: #0, #5 }] */
            /* JADX WARN: Code duplicated, block: B:76:0x05d2  */
            /* JADX WARN: Code duplicated, block: B:77:0x05d3 A[Catch: all -> 0x063f, TryCatch #5 {all -> 0x063f, blocks: (B:74:0x05c1, B:78:0x061a, B:77:0x05d3), top: B:121:0x05c1, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:86:0x064a  */
            /* JADX WARN: Code duplicated, block: B:89:0x06ad  */
            /* JADX WARN: Code duplicated, block: B:90:0x06ae A[Catch: all -> 0x07c3, TryCatch #3 {all -> 0x07c3, blocks: (B:5:0x0071, B:9:0x00c7, B:8:0x008a, B:17:0x01a3, B:21:0x0201, B:33:0x02d0, B:37:0x0327, B:87:0x0692, B:91:0x06ef, B:90:0x06ae, B:95:0x074d, B:99:0x07ac, B:98:0x0769, B:47:0x0415, B:51:0x046b, B:50:0x042e, B:36:0x02e2, B:20:0x01c0, B:24:0x025b, B:28:0x02b3, B:27:0x0274), top: B:118:0x0025 }] */
            /* JADX WARN: Code duplicated, block: B:94:0x0706  */
            /* JADX WARN: Code duplicated, block: B:97:0x0768  */
            /* JADX WARN: Code duplicated, block: B:98:0x0769 A[Catch: all -> 0x07c3, TryCatch #3 {all -> 0x07c3, blocks: (B:5:0x0071, B:9:0x00c7, B:8:0x008a, B:17:0x01a3, B:21:0x0201, B:33:0x02d0, B:37:0x0327, B:87:0x0692, B:91:0x06ef, B:90:0x06ae, B:95:0x074d, B:99:0x07ac, B:98:0x0769, B:47:0x0415, B:51:0x046b, B:50:0x042e, B:36:0x02e2, B:20:0x01c0, B:24:0x025b, B:28:0x02b3, B:27:0x0274), top: B:118:0x0025 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r20v0, types: [long] */
            /* JADX WARN: Type inference failed for: r20v1 */
            /* JADX WARN: Type inference failed for: r20v10 */
            /* JADX WARN: Type inference failed for: r20v2 */
            /* JADX WARN: Type inference failed for: r20v3 */
            /* JADX WARN: Type inference failed for: r20v4 */
            /* JADX WARN: Type inference failed for: r20v5 */
            /* JADX WARN: Type inference failed for: r20v7 */
            /* JADX WARN: Type inference failed for: r20v8 */
            /* JADX WARN: Type inference failed for: r20v9 */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.reflect.Method] */
            /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
                	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
                	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
                */
            public static java.lang.Object[] getSDKAppID(android.content.Context r33, int r34, int r35) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2005
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.an.AuthenticationRequestParameters.getSDKTransactionID.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{66, 42, -89, -4, -8, 9, -39, -21, 1, 1, 13, -5, -7, 7, -19, 3, -17, -4, -29, 33, -14, -17, -3, 7, 46, -7, -18, -9, 3, 0, -17, -12, -8, 13, -17, 0, -7, -34, 13, 6, -2, -22, 8, -5, -42, 11, 11, -23, 6, -14, 9, -21, 7, -5, -8, 9, -39, -21, 1, -16, 41, -6, -45, -11, -1, -27, -39};
                $$b = 70;
            }

            static void init$1() {
                $$d = new byte[]{64, 55, -50, 126};
                $$e = 80;
            }

            @Override // atd.an.AuthenticationRequestParameters.getSDKReferenceNumber
            public final ECParameterSpec AuthenticationRequestParameters() throws Throwable {
                Object[] objArr3 = new Object[1];
                a("능첖닣၃㞕軵拇\uf738삯舏Სｻ嘍ඍꨛ赙\ue471\uffd1➯ᮔ箥楥뗳ꧡ觩풩쌇☽Ὕ䛽克뒉銁、\uee9f䋅\u20f5ꉕ簣\udf11똹\u2d99詷浭쐛齛ߍ﯏宧इ閹覃\ue973\uf4f3⍥ط缿暿냑铫\uf2cb큫캝⊟\u0097䏗屉뽓", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr3);
                ECFieldFp eCFieldFp = new ECFieldFp(new BigInteger(((String) objArr3[0]).intern(), 16));
                Object[] objArr4 = new Object[1];
                b("㥀鯛籶\ude91댬ᑇ\uf6e2䭽ⷮ蹅挸얟꙲磩\udd4c븢ႆ\uf57d埐⢷贪澁쁤ꋛ\u07be\ud815몈Ὧ\uf1c2効㜜觳橖쳍ꆠȇ\ue4fa륑ᨴﲫ典㎓鐮楉쯤걿ບ\ue335䑐⛫ﬆ嶡㸼鍗痲혍ꢨස\uee5e䃹└螯壊㵠", 41628 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr4);
                BigInteger bigInteger = new BigInteger(((String) objArr4[0]).intern(), 16);
                Object[] objArr5 = new Object[1];
                a("刐\u0082別\udc50累쑊⫕뽚\u206f乨嘙띧뛉쇨\ue0a2않Ӎ㏆浠台魢ꕲ＼\ue1f1椮ᣉ覸湚\uffef諯\u1bf8ﳣ爼ﰓꑗ\u0ad4쁆湄㚘震嚌\ue18b삿┏⒫半䴄돘묖앥\udf03솑\u09b3㣣槚乖鿿ꪮ羽\udc8aሊᰎ营檉\ue052辵ᚁ\uf735", Drawable.resolveOpacity(0, 0) + 1, objArr5);
                BigInteger bigInteger2 = new BigInteger(((String) objArr5[0]).intern(), 16);
                Object[] objArr6 = new Object[1];
                b("㥅㲽㈡⧯⼉⋻ᡬῗᕆଷ໕Д箂煱瓭橔懀朸崾傭嘝䶅䌉䛮뱟돂ꦹ꽗ꊐ頃龆镠裞蹘藁﯍\uf12d\uf4e8\uea05\ue1ff", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1422, objArr6);
                EllipticCurve ellipticCurve = new EllipticCurve(eCFieldFp, bigInteger, bigInteger2, new BigInteger(((String) objArr6[0]).intern(), 16).toByteArray());
                Object[] objArr7 = new Object[1];
                a("㠴埀㠂謑쫊珝게㤂䨼\u192e\ue1feㄵ\udce9雚坆䌐滤撅\udaf4햨\uf142\uf23b䣞枨̍俹㸭\ue802闊\udda8걥窷᠔ꭗᎶ賽ꩣ㤄腼ᄨ㲯뚻眠ꍖ仾Џ晴㗱텃鈤棡䟏揢濗\ude3d졺\uf5dbﶖ䷼媢硘䭃㎽\uecdb訃\ud8f5ꅩ焙", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr7);
                BigInteger bigInteger3 = new BigInteger(((String) objArr7[0]).intern(), 16);
                Object[] objArr8 = new Object[1];
                b("㤲\uf2a9꺑媎ᚖ승︵ꩫ昈ቲ츭梅럝掕ᾁ쯣螮댺漡᭺흷荙뼴梨ⓩ킄貜룓瑃…\udc79蠇䐔灍\u2db7\ud998闱䆘綥⥎\ue558鄕䴏礔㔿\ueeb6骛嚄˵㻝\ueac6ꙛ剦ซ㨖\uf631ꏍ忐எ쟳\uf3af꾲嬮ᝤ", 52200 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
                BigInteger bigInteger4 = new BigInteger(((String) objArr8[0]).intern(), 16);
                Object[] objArr9 = new Object[1];
                b("㥀ಯ办颍\ueefc㓫竚䃉陎\udc51≠桳븂萕쨤့枰궟\uf38e㧽\u0fec嗛鯊\ue139㜨紗䌆襵\udf64╓歂뺱蒤쪊ჽ暝곜\uf2cc㠽ห吟驶\ue001㘔簫䉀觌\udfd3▐殊뇪螢췉ጼ夯꽭\uf508㭲Ė圠鴰\ue0c0㛑糦", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13806, objArr9);
                ECParameterSpec eCParameterSpec = new ECParameterSpec(ellipticCurve, new ECPoint(bigInteger3, bigInteger4), new BigInteger(((String) objArr9[0]).intern(), 16), 1);
                int i11 = getDeviceData + 67;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 16 / 0;
                }
                return eCParameterSpec;
            }
        });
        $VALUES = AuthenticationRequestParameters();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 51) % 128;
    }

    private AuthenticationRequestParameters(String str, String str2, getSDKReferenceNumber getsdkreferencenumber) {
        super(str, 0);
        this.mApiName = str2;
        this.mECParameterSpec = getsdkreferencenumber.AuthenticationRequestParameters();
    }

    private static /* synthetic */ AuthenticationRequestParameters[] AuthenticationRequestParameters() {
        int i11 = AuthenticationRequestParameters;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = {P256};
        int i12 = i11 + 103;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return authenticationRequestParametersArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0218  */
    /* JADX WARN: Code duplicated, block: B:51:0x0219  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
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
            int i14 = $10 + 73;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            Class cls = Integer.TYPE;
            if (i15 == 0) {
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
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(689 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (16022 - Color.argb(i12, i12, i12, i12)), (-16777184) - Color.rgb(i12, i12, i12));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i13] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() - (getDeviceData - 2227742522694838850L);
                    Object[] objArr4 = {gettransactionstatus, gettransactionstatus};
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + 417, (char) (29016 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 24 - TextUtils.indexOf("", "", 0))).getMethod("A", Object.class, Object.class);
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
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.red(0) + 689, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 16023), 32 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], cls, Object.class, Object.class);
                    map2.put(962978490, method3);
                }
                jArr[i13] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (getDeviceData ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method4 = map2.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29017), (ViewConfiguration.getTapTimeout() >> 16) + 24)).getMethod("A", Object.class, Object.class);
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
                break;
            }
            cArr2[i16] = (char) jArr2[i16];
            Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method5 = map3.get(-46730980);
            if (method5 == null) {
                method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.makeMeasureSpec(0, 0) + 417, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29016), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method5);
            }
            ((Method) method5).invoke(null, objArr8);
            cArr = cArr3;
        }
        String str2 = new String(cArr2);
        int i17 = $11 + 53;
        $10 = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r8 = r8 + 118
            byte[] r0 = atd.an.AuthenticationRequestParameters.$$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.AuthenticationRequestParameters.b(byte, byte, int, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getDeviceData = -5421864301784562334L;
    }

    static void init$0() {
        $$a = new byte[]{125, 7, -90, 118};
        $$b = EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE;
    }

    public static AuthenticationRequestParameters valueOf(String str) {
        int i11 = AuthenticationRequestParameters + 21;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(AuthenticationRequestParameters.class, str);
            throw null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) Enum.valueOf(AuthenticationRequestParameters.class, str);
        int i12 = getSDKReferenceNumber + 79;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 96 / 0;
        }
        return authenticationRequestParameters;
    }

    public static AuthenticationRequestParameters[] values() {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 101) % 128;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = (AuthenticationRequestParameters[]) $VALUES.clone();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 1) % 128;
        return authenticationRequestParametersArr;
    }

    final ECParameterSpec getSDKAppID() {
        int i11 = getSDKReferenceNumber + 45;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return this.mECParameterSpec;
        }
        throw null;
    }

    public final String getSDKTransactionID() {
        int i11 = getSDKReferenceNumber;
        int i12 = i11 + 87;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        String str = this.mApiName;
        int i13 = i11 + 39;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static AuthenticationRequestParameters AuthenticationRequestParameters(String str) throws Throwable {
        AuthenticationRequestParameters authenticationRequestParameters;
        AuthenticationRequestParameters[] authenticationRequestParametersArrValues = values();
        int length = authenticationRequestParametersArrValues.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = AuthenticationRequestParameters + 3;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 != 0) {
                authenticationRequestParameters = authenticationRequestParametersArrValues[i11];
                int i13 = 32 / 0;
                if (authenticationRequestParameters.mApiName.equals(str)) {
                    AuthenticationRequestParameters = (getSDKReferenceNumber + 115) % 128;
                    return authenticationRequestParameters;
                }
            } else {
                authenticationRequestParameters = authenticationRequestParametersArrValues[i11];
                if (authenticationRequestParameters.mApiName.equals(str)) {
                    AuthenticationRequestParameters = (getSDKReferenceNumber + 115) % 128;
                    return authenticationRequestParameters;
                }
            }
        }
        Object[] objArr = new Object[1];
        a("傉꿍깑껔교귗걉곗ꭐꯎ\uaa4eꪉꥋ\ua9daꡜ\ua8dbꝉꞝ", 65407 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        throw new IllegalArgumentException(((String) objArr[0]).intern());
    }
}
