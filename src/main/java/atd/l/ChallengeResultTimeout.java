package atd.l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.location.Location;
import android.location.LocationManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\t*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lkotlin/Function1;", "Landroid/location/Location;", "", "getField", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "getLocationField", "(Lwn0/l;)Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "", "isAnyLocationPermissionGranted", "()Z", "getLocationOrNull", "()Landroid/location/Location;", "Landroid/location/LocationManager;", "", "provider", "lastKnownLocation", "(Landroid/location/LocationManager;Ljava/lang/String;)Landroid/location/Location;", "", "getNewestOrFirst", "(Ljava/util/List;)Landroid/location/Location;", "Landroid/app/Application;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "location", "Landroid/location/Location;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultTimeout {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int[] getSDKReferenceNumber;
    private final Location AuthenticationRequestParameters;
    private final Application getSDKAppID;
    private final PermissionChecker getSDKTransactionID;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getDeviceData = 0;
        ChallengeResultCancelled = 1;
        getSDKReferenceNumber = new int[]{-639316753, 613656740, 1725187832, -81179776, -795205271, -241950539, -242379782, -1944565011, 477113910, 171396415, -180335372, 1432579641, 442510615, -1619898415, -1482864383, 998405696, 1398624460, 831466517};
    }

    private ChallengeResultTimeout(Application application, PermissionChecker permissionChecker) {
        s.k(application, "");
        s.k(permissionChecker, "");
        this.getSDKAppID = application;
        this.getSDKTransactionID = permissionChecker;
        this.AuthenticationRequestParameters = co_();
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        char[] cArr;
        long j11;
        Object method;
        Object method2;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr2 = new char[4];
        int i12 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        if (iArr2 != null) {
            j11 = 0;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1861, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i13] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i13++;
                    cArr2 = cArr2;
                    iArr2 = iArr2;
                    length = length;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
            $10 = ($11 + 47) % 128;
            iArr2 = iArr3;
        } else {
            cArr = cArr2;
            j11 = 0;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getSDKReferenceNumber;
        if (iArr5 != null) {
            $10 = ($11 + 79) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i14])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object obj2 = map2.get(2050190164);
                if (obj2 != null) {
                    method = obj2;
                } else {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1862, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    c(b13, b14, b14, objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2050190164, method);
                }
                iArr6[i14] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i14++;
                length3 = length3;
                iArr5 = iArr5;
                iArr6 = iArr6;
                cArr3 = cArr3;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr3;
        int i15 = 16;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i16 = challengeResultCompleted.getDeviceData;
            if (i16 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            $11 = ($10 + 65) % 128;
            int i17 = iArr[i16];
            char c11 = (char) (i17 >> 16);
            cArr[0] = c11;
            char c12 = (char) i17;
            cArr[1] = c12;
            char c13 = (char) (iArr[i16 + 1] >> 16);
            cArr[i12] = c13;
            char c14 = (char) iArr[i16 + 1];
            char c15 = 3;
            cArr[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i18 = 0;
            while (i18 < i15) {
                $10 = ($11 + 73) % 128;
                int i19 = challengeResultCompleted.getSDKAppID ^ iArr4[i18];
                challengeResultCompleted.getSDKAppID = i19;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i19);
                Object[] objArr6 = new Object[4];
                objArr6[c15] = challengeResultCompleted;
                objArr6[i12] = challengeResultCompleted;
                objArr6[1] = Integer.valueOf(sDKAppID);
                objArr6[0] = challengeResultCompleted;
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(929629307);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1300 - (SystemClock.uptimeMillis() > j11 ? 1 : (SystemClock.uptimeMillis() == j11 ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8), 33 - Color.green(0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    c(b15, b16, (byte) (b16 + 3), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                    map3.put(929629307, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i18++;
                c15 = c15;
                i15 = 16;
            }
            char c16 = c15;
            int i21 = challengeResultCompleted.getSDKAppID;
            int i22 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i22;
            challengeResultCompleted.getSDKReferenceNumber = i21;
            i15 = 16;
            int i23 = i21 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i23;
            int i24 = i22 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i24;
            cArr[0] = (char) (i24 >>> 16);
            cArr[1] = (char) i24;
            cArr[i12] = (char) (i23 >>> 16);
            cArr[c16] = (char) i23;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i25 = challengeResultCompleted.getDeviceData;
            cArr4[i25 * 2] = cArr[0];
            cArr4[(i25 * 2) + 1] = cArr[1];
            cArr4[(i25 * 2) + 2] = cArr[i12];
            cArr4[(i25 * 2) + 3] = cArr[c16];
            Object[] objArr8 = new Object[i12];
            objArr8[1] = challengeResultCompleted;
            objArr8[0] = challengeResultCompleted;
            Map map4 = atd.a.getMessageVersion.timedout;
            Object method4 = map4.get(1109131256);
            if (method4 == null) {
                Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + 2061, (char) View.resolveSize(0, 0), 17 - TextUtils.indexOf("", "", 0, 0));
                byte b17 = (byte) 0;
                byte b18 = b17;
                Object[] objArr9 = new Object[1];
                c(b17, b18, (byte) (b18 + 2), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(1109131256, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            i12 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 37
            int r8 = r8 + 4
            int r9 = r9 * 6
            int r9 = 103 - r9
            int r7 = r7 * 17
            int r7 = 38 - r7
            byte[] r0 = atd.l.ChallengeResultTimeout.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2d:
            int r9 = -r9
            int r0 = r0 + r9
            int r9 = r0 + (-8)
            int r8 = r8 + 1
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.ChallengeResultTimeout.b(byte, int, short, java.lang.Object[]):void");
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
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = atd.l.ChallengeResultTimeout.$$d
            int r7 = r7 + 117
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r5]
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.ChallengeResultTimeout.c(short, short, int, java.lang.Object[]):void");
    }

    private final Location co_() throws Throwable {
        LocationManager locationManager;
        List<String> providers;
        getDeviceData = (ChallengeResultCancelled + 87) % 128;
        Application application = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a(new int[]{-1750927029, -1010107804, 1730546830, -415075896}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 8, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof LocationManager) {
            getDeviceData = (ChallengeResultCancelled + 93) % 128;
            locationManager = (LocationManager) systemService;
        } else {
            ChallengeResultCancelled = (getDeviceData + 41) % 128;
            locationManager = null;
        }
        ArrayList arrayList = new ArrayList();
        if (locationManager != null && (providers = locationManager.getProviders(true)) != null) {
            for (String str : providers) {
                s.h(str);
                Location location = (Location) getDeviceData(new Object[]{locationManager, str}, 936911144, -936911144, (int) System.currentTimeMillis());
                if (location != null) {
                    arrayList.add(location);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return cq_(arrayList);
        }
        getDeviceData = (ChallengeResultCancelled + 125) % 128;
        return null;
    }

    @SuppressLint({"MissingPermission"})
    private static Location cp_(LocationManager locationManager, String str) {
        return (Location) getDeviceData(new Object[]{locationManager, str}, 936911144, -936911144, (int) System.currentTimeMillis());
    }

    private static Location cq_(List<? extends Location> list) {
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long elapsedRealtimeNanos = ((Location) next).getElapsedRealtimeNanos();
            do {
                Object next2 = it.next();
                long elapsedRealtimeNanos2 = ((Location) next2).getElapsedRealtimeNanos();
                if (elapsedRealtimeNanos > elapsedRealtimeNanos2) {
                    next = next2;
                    elapsedRealtimeNanos = elapsedRealtimeNanos2;
                }
            } while (it.hasNext());
            int i11 = ChallengeResultCancelled + 103;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 83 / 0;
            }
        } else {
            ChallengeResultCancelled = (getDeviceData + 119) % 128;
        }
        Location location = (Location) next;
        int i13 = ChallengeResultCancelled + 53;
        getDeviceData = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 20 / 0;
        }
        return location;
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        return getDeviceData(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0082 A[RETURN] */
    private final boolean getSDKAppID() throws Throwable {
        ChallengeResultCancelled = (getDeviceData + 89) % 128;
        PermissionChecker permissionChecker = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        a(new int[]{1967734753, -2091381005, -1120188954, -235952425, -1326358619, 994387159, -873459798, 377536332, -737826182, -825076398, 1774051631, -1751859808, 1862901092, -1827577694, 1515589041, 599765978, -294507237, -14217065, -1219048127, 1251497614, 1430208612, 1322229629}, (KeyEvent.getMaxKeyCode() >> 16) + 41, objArr);
        if (!permissionChecker.getSDKAppID(((String) objArr[0]).intern())) {
            int i11 = ChallengeResultCancelled + 53;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                PermissionChecker permissionChecker2 = this.getSDKTransactionID;
                Object[] objArr2 = new Object[1];
                a(new int[]{1967734753, -2091381005, -1120188954, -235952425, -1326358619, 994387159, -873459798, 377536332, -737826182, -825076398, 1774051631, -1751859808, 233773081, -1311903721, 613676713, -1443743542, -1901645688, 1363182848, -2068318295, 1994091508}, 49 >> ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
                if (!permissionChecker2.getSDKAppID(((String) objArr2[0]).intern())) {
                    return false;
                }
            } else {
                PermissionChecker permissionChecker3 = this.getSDKTransactionID;
                Object[] objArr3 = new Object[1];
                a(new int[]{1967734753, -2091381005, -1120188954, -235952425, -1326358619, 994387159, -873459798, 377536332, -737826182, -825076398, 1774051631, -1751859808, 233773081, -1311903721, 613676713, -1443743542, -1901645688, 1363182848, -2068318295, 1994091508}, 38 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
                if (!permissionChecker3.getSDKAppID(((String) objArr3[0]).intern())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void getSDKTransactionID(long j11, long j12) throws Throwable {
        byte[] bArr = $$a;
        byte b11 = bArr[36];
        byte b12 = b11;
        Object[] objArr = new Object[1];
        b(b11, b12, (byte) (b12 + 1), objArr);
        Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
        int i11 = (ChallengeResultCancelled + 117) % 128;
        getDeviceData = i11;
        ChallengeResultCancelled = (i11 + 65) % 128;
        try {
            byte b13 = bArr[36];
            byte b14 = b13;
            Object[] objArr2 = new Object[1];
            b(b13, b14, (byte) (b14 + 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b15 = bArr[36];
            byte b16 = (byte) (b15 + 1);
            Object[] objArr3 = new Object[1];
            b(b16, b16, b15, objArr3);
            Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
            Object[] objArr4 = {atd.ap.AuthenticationRequestParameters.class.getField("getSDKReferenceNumber").get(null)};
            Object[] objArr5 = new Object[1];
            a(new int[]{177665985, -75733751}, TextUtils.indexOf((CharSequence) "", '0', 0) + 4, objArr5);
            getDeviceData = (ChallengeResultCancelled + 9) % 128;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    static void init$0() {
        $$a = new byte[]{29, -9, 65, -64, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
        $$b = 162;
    }

    static void init$1() {
        $$d = new byte[]{14, -72, -78, -9};
        $$e = 224;
    }

    public final ChallengeResultError AuthenticationRequestParameters(l<? super Location, Double> lVar) {
        ChallengeResultCancelled = (getDeviceData + 31) % 128;
        s.k(lVar, "");
        if (getSDKAppID()) {
            Location location = this.AuthenticationRequestParameters;
            if (location != null) {
                return new ChallengeResultError.getSDKAppID(lVar.invoke(location).doubleValue());
            }
            ChallengeResultError.getSDKTransactionID.getSDKReferenceNumber getsdkreferencenumber = ChallengeResultError.getSDKTransactionID.getSDKReferenceNumber.getSDKTransactionID;
            getDeviceData = (ChallengeResultCancelled + 9) % 128;
            return getsdkreferencenumber;
        }
        int i11 = ChallengeResultCancelled + 123;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return ChallengeResultError.getSDKTransactionID.getSDKAppID.getDeviceData;
        }
        ChallengeResultError.getSDKTransactionID.getSDKAppID getsdkappid = ChallengeResultError.getSDKTransactionID.getSDKAppID.getDeviceData;
        throw null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        LocationManager locationManager = (LocationManager) objArr[0];
        String str = (String) objArr[1];
        int i11 = getDeviceData + 73;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return locationManager.getLastKnownLocation(str);
        }
        locationManager.getLastKnownLocation(str);
        throw null;
    }

    public /* synthetic */ ChallengeResultTimeout(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
