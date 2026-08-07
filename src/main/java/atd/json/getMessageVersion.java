package atd.json;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getTransactionStatus;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/util/PublicLogger;", "", "<init>", "()V", "", "sourceTag", "message", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "w", "e", "", "priority", "println", "(ILjava/lang/String;Ljava/lang/String;)V", "LOGCAT_MAX_LENGTH", "I", "TAG_PREFIX", "Ljava/lang/String;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static long getSDKAppID;
    public static final getMessageVersion getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getDeviceData();
        SystemClock.elapsedRealtimeNanos();
        getSDKReferenceNumber = new getMessageVersion();
        int i11 = AuthenticationRequestParameters + 125;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getMessageVersion() {
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0225  */
    /* JADX WARN: Code duplicated, block: B:55:0x0226  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Object charArray;
        Throwable cause;
        Object method;
        int i12 = $11 + 93;
        $10 = i12 % 128;
        int i13 = 2;
        int i14 = 0;
        if (i12 % 2 != 0) {
            int i15 = 29 / 0;
            if (str != null) {
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= cArr.length) {
                break;
            }
            int i17 = $11 + 49;
            int i18 = i13;
            $10 = i17 % 128;
            int i19 = i17 % 2;
            Class cls = Integer.TYPE;
            if (i19 != 0) {
                char c11 = cArr[i16];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i18] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i14] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(690 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', i14, i14) + 16023), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() - (getSDKAppID ^ (-2227742522694838850L));
                    Object[] objArr4 = new Object[i18];
                    objArr4[1] = gettransactionstatus;
                    objArr4[0] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(418 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "") + 29017), TextUtils.getCapsMode("", 0, 0) + 24)).getMethod("A", Object.class, Object.class);
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
                cArr = cArr;
                jArr = jArr;
                Object[] objArr5 = {Integer.valueOf(cArr[i16]), gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(962978490);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 689, (char) (KeyEvent.keyCodeFromString("") + 16022), 32 - (Process.myPid() >> 22));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], cls, Object.class, Object.class);
                    map2.put(962978490, method3);
                }
                jArr[i16] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (getSDKAppID ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method4 = map2.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(416 - ImageFormat.getBitsPerPixel(0), (char) (29018 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 24)).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
            jArr = jArr;
            cArr = cArr;
            i13 = 2;
            i14 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr2 = cArr;
        long[] jArr2 = jArr;
        char[] cArr3 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i21 = gettransactionstatus.getSDKTransactionID;
            char[] cArr4 = cArr2;
            if (i21 >= cArr4.length) {
                String str2 = new String(cArr3);
                $11 = ($10 + 51) % 128;
                objArr[0] = str2;
                return;
            }
            cArr3[i21] = (char) jArr2[i21];
            Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method5 = map3.get(-46730980);
            if (method5 == null) {
                method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - ExpandableListView.getPackedPositionType(0L), (char) (29016 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf("", "") + 24)).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method5);
            }
            ((Method) method5).invoke(null, objArr8);
            cArr2 = cArr4;
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
    private static void b(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.json.getMessageVersion.$$a
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 * 3
            int r7 = 118 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
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
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.getMessageVersion.b(byte, int, byte, java.lang.Object[]):void");
    }

    private static void getSDKReferenceNumber(int i11, String str, String str2) throws Throwable {
        int i12;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("췀䫋썷寙탷椲", TextUtils.lastIndexOf("", '0', 0) + 34650, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(str);
        String string = sb2.toString();
        while (str2.length() > 3950) {
            String strSubstring = str2.substring(0, 3950);
            s.j(strSubstring, "");
            Log.println(i11, string, strSubstring);
            String strSubstring2 = str2.substring(3950);
            s.j(strSubstring2, "");
            int length = strSubstring2.length() - 1;
            int i13 = 0;
            boolean z11 = false;
            while (i13 <= length) {
                if (z11) {
                    i12 = length;
                } else {
                    AuthenticationRequestParameters = (getDeviceData + 87) % 128;
                    i12 = i13;
                }
                boolean z12 = s.m(strSubstring2.charAt(i12), 32) <= 0;
                if (!z11) {
                    int i14 = (AuthenticationRequestParameters + 77) % 128;
                    getDeviceData = i14;
                    if (z12) {
                        i13++;
                    } else {
                        AuthenticationRequestParameters = (i14 + 45) % 128;
                        z11 = true;
                    }
                } else if (!z12) {
                    break;
                } else {
                    length--;
                }
            }
            str2 = strSubstring2.subSequence(i13, length + 1).toString();
        }
        Log.println(i11, string, str2);
    }

    static void init$0() {
        $$a = new byte[]{55, -56, 17, -5};
        $$b = 54;
    }

    public final void getDeviceData(String str, String str2) throws Throwable {
        getDeviceData = (AuthenticationRequestParameters + 113) % 128;
        s.k(str, "");
        s.k(str2, "");
        getSDKReferenceNumber(6, str, str2);
        int i11 = getDeviceData + 43;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 17 / 0;
        }
    }

    public final void getSDKTransactionID(String str, String str2) throws Throwable {
        int i11 = getDeviceData + 117;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            s.k(str, "");
            s.k(str2, "");
        } else {
            s.k(str, "");
            s.k(str2, "");
        }
        getSDKReferenceNumber(5, str, str2);
    }

    static void getDeviceData() {
        getSDKAppID = 8339348667519735839L;
    }
}
