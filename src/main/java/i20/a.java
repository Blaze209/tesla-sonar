package i20;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.google.android.gms.tasks.Task;
import expo.modules.interfaces.permissions.PermissionsResponse;
import h20.g;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Locale;
import java.util.MissingResourceException;
import k20.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u001bR\u0014\u0010&\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010*\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0014\u0010,\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0014\u0010/\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0016\u00103\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010%¨\u00064"}, d2 = {"Li20/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/ActivityManager$MemoryInfo;", "j", "(Landroid/content/Context;)Landroid/app/ActivityManager$MemoryInfo;", "", "e", "(Landroid/content/Context;)Ljava/lang/String;", "a", "Landroid/net/NetworkInfo;", "networkInfo", "m", "(Landroid/net/NetworkInfo;)Ljava/lang/String;", "l", "k", "(Landroid/content/Context;)Landroid/net/NetworkInfo;", "", "p", "(Landroid/content/Context;)J", "s", "Landroid/util/Pair;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Landroid/util/Pair;", "", "h", "(Landroid/content/Context;)Ljava/lang/Boolean;", "q", "", "r", "(Landroid/content/Context;)Ljava/lang/Float;", "b", "n", "()Ljava/lang/String;", "osType", "o", "osVersion", "f", "deviceModel", "g", "deviceVendor", "c", "()J", "availableStorage", "t", "totalStorage", IntegerTokenConverter.CONVERTER_KEY, "language", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f75566b = a.class.getSimpleName();

    /* JADX INFO: renamed from: i20.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJW\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Li20/a$a;", "", "<init>", "()V", "instance", "", "methodName", "", "Ljava/lang/Class;", "cArgs", "args", "c", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "className", "e", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "classObject", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object c(Object instance, String methodName, Class<?>[] cArgs, Object... args) {
            return d(instance.getClass(), methodName, instance, cArgs, Arrays.copyOf(args, args.length));
        }

        private final Object d(Class<?> classObject, String methodName, Object instance, Class<?>[] cArgs, Object... args) {
            return (cArgs == null ? classObject.getMethod(methodName, null) : classObject.getMethod(methodName, (Class[]) Arrays.copyOf(cArgs, cArgs.length))).invoke(instance, Arrays.copyOf(args, args.length));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object e(String className, String methodName, Class<?>[] cArgs, Object... args) throws ClassNotFoundException {
            Class<?> classObject = Class.forName(className);
            s.j(classObject, "classObject");
            return d(classObject, methodName, null, cArgs, Arrays.copyOf(args, args.length));
        }

        private Companion() {
        }
    }

    private final ActivityManager.MemoryInfo j(Context context) {
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        return memoryInfo;
    }

    public String a(Context context) {
        s.k(context, "context");
        if (s.f(Looper.myLooper(), Looper.getMainLooper())) {
            return null;
        }
        try {
            Companion companion = INSTANCE;
            Object objE = companion.e("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
            Object objC = objE != null ? companion.c(objE, "isLimitAdTrackingEnabled", null, new Object[0]) : null;
            if (s.f(objC instanceof Boolean ? (Boolean) objC : null, Boolean.TRUE)) {
                return "";
            }
            Object objC2 = objE != null ? companion.c(objE, "getId", null, new Object[0]) : null;
            if (objC2 instanceof String) {
                return (String) objC2;
            }
            return null;
        } catch (Exception e11) {
            String strA = q.INSTANCE.a();
            s.j(strA, "TrackerConfiguration.TAG");
            g.b(strA, "Exception getting the Advertising ID: %s", e11.toString());
            return null;
        }
    }

    public Pair<String, String> b(Context context) {
        Object objC;
        Object objC2;
        Object objC3;
        s.k(context, "context");
        if (s.f(Looper.myLooper(), Looper.getMainLooper())) {
            return null;
        }
        try {
            Companion companion = INSTANCE;
            Object objE = companion.e("com.google.android.gms.appset.AppSet", "getClient", new Class[]{Context.class}, context);
            if (objE == null || (objC = companion.c(objE, "getAppSetIdInfo", null, new Object[0])) == null) {
                return null;
            }
            s.j(Task.class, "forName(\"com.google.android.gms.tasks.Task\")");
            Object objE2 = companion.e("com.google.android.gms.tasks.Tasks", AwaitAction.ACTION_TYPE, new Class[]{Task.class}, objC);
            if (objE2 == null || (objC2 = companion.c(objE2, "getId", null, new Object[0])) == null || (objC3 = companion.c(objE2, "getScope", null, new Object[0])) == null) {
                return null;
            }
            return new Pair<>((String) objC2, ((Integer) objC3).intValue() == 1 ? "app" : "developer");
        } catch (ClassNotFoundException unused) {
            String TAG = f75566b;
            s.j(TAG, "TAG");
            g.a(TAG, "AppSetID error: Google Play Services not found", new Object[0]);
            return null;
        } catch (InvocationTargetException unused2) {
            String TAG2 = f75566b;
            s.j(TAG2, "TAG");
            g.a(TAG2, "AppSetID error: Google Play Services not available", new Object[0]);
            return null;
        } catch (Exception unused3) {
            String TAG3 = f75566b;
            s.j(TAG3, "TAG");
            g.a(TAG3, "AppSetID error: couldn't connect to Google Play Services", new Object[0]);
            return null;
        }
    }

    public long c() {
        return new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes();
    }

    public Pair<String, Integer> d(Context context) {
        s.k(context, "context");
        String str = null;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra(PermissionsResponse.STATUS_KEY, -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1 || intExtra3 == -1) {
            return null;
        }
        if (intExtra != 1) {
            if (intExtra != 2) {
                str = intExtra != 5 ? "unplugged" : "full";
            } else {
                str = "charging";
            }
        }
        return new Pair<>(str, Integer.valueOf((int) ((intExtra2 * 100) / intExtra3)));
    }

    public String e(Context context) {
        s.k(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        if (s.f(networkOperatorName, "")) {
            return null;
        }
        return networkOperatorName;
    }

    public String f() {
        String MODEL = Build.MODEL;
        s.j(MODEL, "MODEL");
        return MODEL;
    }

    public String g() {
        String MANUFACTURER = Build.MANUFACTURER;
        s.j(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    public Boolean h(Context context) {
        s.k(context, "context");
        return Boolean.valueOf(context.getResources().getConfiguration().orientation == 1);
    }

    public String i() {
        try {
            return Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
            return null;
        }
    }

    public final NetworkInfo k(Context context) {
        NetworkInfo activeNetworkInfo;
        s.k(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e11) {
                String strA = q.INSTANCE.a();
                s.j(strA, "TrackerConfiguration.TAG");
                g.b(strA, "Security exception getting NetworkInfo: %s", e11.toString());
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        return activeNetworkInfo;
    }

    public String l(NetworkInfo networkInfo) {
        if (networkInfo == null || !t.M(networkInfo.getTypeName(), "MOBILE", true)) {
            return null;
        }
        return networkInfo.getSubtypeName();
    }

    public String m(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return "offline";
        }
        String typeName = networkInfo.getTypeName();
        s.j(typeName, "networkInfo.typeName");
        Locale locale = Locale.getDefault();
        s.j(locale, "getDefault()");
        String lowerCase = typeName.toLowerCase(locale);
        s.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return s.f(lowerCase, "mobile") ? true : s.f(lowerCase, "wifi") ? lowerCase : "offline";
    }

    public String n() {
        return "android";
    }

    public String o() {
        String RELEASE = Build.VERSION.RELEASE;
        s.j(RELEASE, "RELEASE");
        return RELEASE;
    }

    public long p(Context context) {
        s.k(context, "context");
        return j(context).totalMem;
    }

    public String q(Context context) {
        s.k(context, "context");
        int i11 = context.getResources().getDisplayMetrics().widthPixels;
        int i12 = context.getResources().getDisplayMetrics().heightPixels;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append('x');
        sb2.append(i12);
        return sb2.toString();
    }

    public Float r(Context context) {
        s.k(context, "context");
        return Float.valueOf(context.getResources().getDisplayMetrics().density);
    }

    public long s(Context context) {
        s.k(context, "context");
        return j(context).availMem;
    }

    public long t() {
        return new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
    }
}
