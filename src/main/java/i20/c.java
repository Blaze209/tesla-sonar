package i20;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import h20.g;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\"\u0010!J7\u0010'\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010#2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040%\"\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010+H\u0007¢\u0006\u0004\b-\u0010.J%\u00100\u001a\u0004\u0018\u00010/2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040#H\u0007¢\u0006\u0004\b0\u00101J%\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010#2\u0006\u00102\u001a\u00020/H\u0007¢\u0006\u0004\b3\u00104J/\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010#H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00042\u0006\u0010\r\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004¢\u0006\u0004\b>\u0010\u0011R\u001c\u0010A\u001a\n ?*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@¨\u0006B"}, d2 = {"Li20/c;", "", "<init>", "()V", "", "p", "()Ljava/lang/String;", "", "timestamp", "f", "(J)Ljava/lang/String;", "Ljava/util/Date;", InquiryField.DateField.TYPE, "e", "(Ljava/util/Date;)Ljava/lang/String;", InquiryField.StringField.TYPE, "b", "(Ljava/lang/String;)Ljava/lang/String;", "r", "s", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)J", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "j", "(Landroid/content/Context;)Z", "", "list", "k", "(Ljava/util/List;)Ljava/lang/String;", "Lr20/b;", "g", "(Landroid/content/Context;)Lr20/b;", DateTokenConverter.CONVERTER_KEY, "", "map", "", "keys", "l", "(Ljava/util/Map;[Ljava/lang/String;)Z", Action.KEY_ATTRIBUTE, "value", "", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "", "n", "(Ljava/util/Map;)[B", "bytes", "c", "([B)Ljava/util/Map;", "m", "(Ljava/util/Map;)Ljava/util/Map;", "", "o", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Landroid/location/Location;", "h", "(Landroid/content/Context;)Landroid/location/Location;", ImagesContract.URL, "q", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f75571a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String TAG = c.class.getSimpleName();

    private c() {
    }

    public static final void a(String key, Object value, Map<String, Object> map) {
        s.k(map, "map");
        if (key == null || value == null || key.length() == 0) {
            return;
        }
        map.put(key, value);
    }

    public static final String b(String string) {
        s.k(string, "string");
        byte[] bytes = string.getBytes(d.UTF_8);
        s.j(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        s.j(strEncodeToString, "encodeToString(string.to…eArray(), Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public static final Map<String, String> c(byte[] bytes) {
        s.k(bytes, "bytes");
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object object = objectInputStream.readObject();
            HashMap map = object instanceof HashMap ? (HashMap) object : null;
            objectInputStream.close();
            byteArrayInputStream.close();
            return map;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        } catch (ClassNotFoundException e12) {
            e12.printStackTrace();
            return null;
        } catch (NullPointerException e13) {
            e13.printStackTrace();
            return null;
        }
    }

    public static final r20.b d(Context context) {
        s.k(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
            if (str == null) {
                return null;
            }
            HashMap map = new HashMap();
            a("version", str, map);
            a("build", strValueOf, map);
            return new r20.b("iglu:com.snowplowanalytics.mobile/application/jsonschema/1-0-0", map);
        } catch (PackageManager.NameNotFoundException e11) {
            String TAG2 = TAG;
            s.j(TAG2, "TAG");
            g.b(TAG2, "Failed to find application context: %s", e11.getMessage());
            return null;
        }
    }

    public static final String e(Date date) {
        s.k(date, "date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", new Locale("en"));
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(date);
        s.j(str, "dateFormat.format(date)");
        return str;
    }

    public static final String f(long timestamp) {
        return e(new Date(timestamp));
    }

    public static final r20.b g(Context context) {
        s.k(context, "context");
        Location locationH = f75571a.h(context);
        if (locationH == null) {
            return null;
        }
        HashMap map = new HashMap();
        a(OrcaKeys.LATITUDE, Double.valueOf(locationH.getLatitude()), map);
        a(OrcaKeys.LONGITUDE, Double.valueOf(locationH.getLongitude()), map);
        a("altitude", Double.valueOf(locationH.getAltitude()), map);
        a("latitudeLongitudeAccuracy", Float.valueOf(locationH.getAccuracy()), map);
        a("speed", Float.valueOf(locationH.getSpeed()), map);
        a("bearing", Float.valueOf(locationH.getBearing()), map);
        a("timestamp", Long.valueOf(System.currentTimeMillis()), map);
        if (l(map, OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE)) {
            return new r20.b("iglu:com.snowplowanalytics.snowplow/geolocation_context/jsonschema/1-1-0", map);
        }
        return null;
    }

    public static final long i(String s11) {
        long j11;
        int i11;
        s.k(s11, "s");
        long j12 = 0;
        int i12 = 0;
        while (i12 < s11.length()) {
            char cCharAt = s11.charAt(i12);
            if (cCharAt <= 127) {
                j11 = 1;
            } else {
                if (cCharAt <= 2047) {
                    i11 = 2;
                } else {
                    if (55296 <= cCharAt && cCharAt < 57344) {
                        j12 += (long) 4;
                        i12++;
                    } else if (cCharAt < 65535) {
                        i11 = 3;
                    } else {
                        j11 = 4;
                    }
                    i12++;
                }
                j11 = i11;
            }
            j12 += j11;
            i12++;
        }
        return j12;
    }

    public static final boolean j(Context context) {
        s.k(context, "context");
        String TAG2 = TAG;
        s.j(TAG2, "TAG");
        boolean z11 = false;
        g.j(TAG2, "Checking tracker internet connectivity.", new Object[0]);
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e11) {
                String TAG3 = TAG;
                s.j(TAG3, "TAG");
                g.b(TAG3, "Security exception checking connection: %s", e11.toString());
                return true;
            }
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z11 = true;
        }
        s.j(TAG2, "TAG");
        g.a(TAG2, "Tracker connection online: %s", Boolean.valueOf(z11));
        return z11;
    }

    public static final String k(List<Long> list) {
        s.k(list, "list");
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11) != null) {
                sb2.append(list.get(i11));
                if (i11 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        String string = sb2.toString();
        s.j(string, "s.toString()");
        if (t.L(string, ",", false, 2, null)) {
            sb2 = new StringBuilder(sb2.substring(0, sb2.length() - 1));
        }
        String string2 = sb2.toString();
        s.j(string2, "s.toString()");
        return string2;
    }

    public static final boolean l(Map<String, ? extends Object> map, String... keys) {
        s.k(map, "map");
        s.k(keys, "keys");
        for (String str : keys) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        return true;
    }

    public static final Map<String, String> m(Map<String, ? extends Object> map) {
        s.k(map, "map");
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue().toString());
        }
        return map2;
    }

    public static final byte[] n(Map<String, String> map) {
        s.k(map, "map");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static final String o(Throwable e11) {
        s.k(e11, "e");
        StringWriter stringWriter = new StringWriter();
        e11.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        s.j(string, "sw.toString()");
        return string;
    }

    public static final String p() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static final String r() {
        String string = UUID.randomUUID().toString();
        s.j(string, "randomUUID().toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[Catch: SecurityException -> 0x0023, TryCatch #0 {SecurityException -> 0x0023, blocks: (B:8:0x001b, B:25:0x0045, B:27:0x0049, B:30:0x0051, B:14:0x0027, B:18:0x0030, B:21:0x0038, B:23:0x003e), top: B:35:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[Catch: SecurityException -> 0x0023, TryCatch #0 {SecurityException -> 0x0023, blocks: (B:8:0x001b, B:25:0x0045, B:27:0x0049, B:30:0x0051, B:14:0x0027, B:18:0x0030, B:21:0x0038, B:23:0x003e), top: B:35:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    @SuppressLint({"MissingPermission"})
    public final Location h(Context context) {
        String str;
        List<String> providers;
        String str2 = "network";
        s.k(context, "context");
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null) {
            try {
                if (locationManager.isProviderEnabled("gps")) {
                    str2 = "gps";
                } else if (locationManager != null || !locationManager.isProviderEnabled("network")) {
                    if (locationManager != null) {
                        providers = locationManager.getProviders(true);
                    } else {
                        providers = null;
                    }
                    if (providers != null || providers.size() <= 0) {
                        str2 = null;
                    } else {
                        str2 = providers.get(0);
                    }
                }
                str = str2;
                if (str != null || str.length() <= 0 || locationManager == null) {
                    return null;
                }
                return locationManager.getLastKnownLocation(str);
            } catch (SecurityException e11) {
                String TAG2 = TAG;
                s.j(TAG2, "TAG");
                g.b(TAG2, "Exception occurred when retrieving location: %s", e11.toString());
            }
        } else {
            if (locationManager != null) {
                if (locationManager != null) {
                    providers = locationManager.getProviders(true);
                } else {
                    providers = null;
                }
                if (providers != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
            } else {
                if (locationManager != null) {
                    providers = locationManager.getProviders(true);
                } else {
                    providers = null;
                }
                if (providers != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
            }
            str = str2;
            if (str != null) {
                return null;
            }
        }
        return null;
    }

    public final String q(String url) {
        s.k(url, "url");
        List listF1 = t.f1(url, new String[]{"://"}, false, 0, 6, null);
        return listF1.size() > 1 ? v.y0(v.P0(v.e(t.T1((String) v.o0(listF1), 16)), v.i0(listF1, 1)), "://", null, null, 0, null, null, 62, null) : url;
    }
}
