package wg;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.components.core.action.SdkAction;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.MediaStreamTrack;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f121800b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f121801a;

    public static String E(Context context) {
        if (d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype != 4 && subtype != 1 && subtype != 2 && subtype != 7 && subtype != 11) {
                    if (subtype != 3 && subtype != 5 && subtype != 6 && subtype != 8 && subtype != 9 && subtype != 10 && subtype != 12 && subtype != 14 && subtype != 15) {
                        return subtype == 13 ? "4G" : "UNKNOW";
                    }
                    return "3G";
                }
                return "2G";
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static b c(f fVar) {
        b bVar = f121800b;
        bVar.f121801a = fVar;
        return bVar;
    }

    public static boolean d(Context context, String str) {
        return !g(context, str);
    }

    public static boolean g(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public String A(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String B() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            return "" + (jCurrentTimeMillis - (jCurrentTimeMillis % 1000));
        } catch (Throwable unused) {
            return "";
        }
    }

    public String C(Context context) {
        try {
            String strE = E(context);
            String strG = G(context);
            if (!sg.a.f(strE) || !sg.a.f(strG)) {
                return "";
            }
            return strE + ":" + G(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String D() {
        try {
            return SystemClock.elapsedRealtime() + "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String F() {
        try {
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb2.append("00:");
            for (int i11 = 0; i11 < 7; i11++) {
                sb2.append(new File(strArr[i11]).exists() ? "1" : WebrtcBuildVersion.maint_version);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String G(Context context) {
        String strA = d.a("ip");
        if (strA != null) {
            return strA;
        }
        if (this.f121801a.isBackgroundRunning()) {
            return "";
        }
        if (strA == null) {
            strA = "";
        }
        d.b("ip", strA);
        return strA;
    }

    public String H() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("00");
        sb2.append(":");
        try {
            Class.forName(new String[]{"dalvik.system.Taint"}[0]);
            sb2.append("1");
        } catch (Throwable unused) {
            sb2.append(WebrtcBuildVersion.maint_version);
        }
        return sb2.toString();
    }

    public String I(Context context) {
        long jLastModified;
        try {
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            long jMax = 0;
            for (int i11 = 0; i11 < 5; i11++) {
                try {
                    jLastModified = new File(strArr[i11]).lastModified();
                } catch (Throwable unused) {
                    jLastModified = -1;
                }
                jMax = Math.max(jLastModified, jMax);
            }
            return "1:" + jMax;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String J() {
        LineNumberReader lineNumberReader;
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        sb2.append("00:");
        for (String str : linkedHashMap.keySet()) {
            char c11 = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String line = lineNumberReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c11 = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb2.append('0');
                        if (lineNumberReader != null) {
                        }
                    }
                }
                sb2.append(c11);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb2.toString();
    }

    public String K(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(null, intentFilter, 2) : context.registerReceiver(null, intentFilter);
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra(PermissionsResponse.STATUS_KEY, -1);
            boolean z11 = intExtra2 == 2 || intExtra2 == 5;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z11 ? "1" : WebrtcBuildVersion.maint_version);
            sb2.append(":");
            sb2.append(intExtra);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String L() {
        char c11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", SdkAction.ACTION_TYPE);
        linkedHashMap.put("MODEL", SdkAction.ACTION_TYPE);
        for (String str : linkedHashMap.keySet()) {
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                c11 = (lowerCase == null || !lowerCase.contains(str3)) ? '0' : '1';
            } catch (Throwable unused) {
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public String M() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", SdkAction.ACTION_TYPE);
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", SdkAction.ACTION_TYPE);
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String strE = sg.a.e(str, "");
            sb2.append((strE == null || !strE.contains(str2)) ? '0' : '1');
        }
        return sb2.toString();
    }

    public final String N() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, PKIFailureInfo.certRevoked);
                try {
                    String line = bufferedReader2.readLine();
                    if (!sg.a.c(line)) {
                        String strTrim = line.trim();
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            fileReader.close();
                        } catch (Throwable unused2) {
                        }
                        return strTrim;
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                }
            } catch (Throwable unused6) {
            }
        } catch (Throwable unused7) {
            fileReader = null;
        }
        try {
            fileReader.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    public final String O() {
        BufferedReader bufferedReader;
        String[] strArrSplit;
        String strTrim = "";
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2, PKIFailureInfo.certRevoked);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!sg.a.c(line) && (strArrSplit = line.split(":")) != null && strArrSplit.length > 1 && strArrSplit[0].contains("BogoMIPS")) {
                            strTrim = strArrSplit[1].trim();
                            break;
                        }
                    } catch (Throwable unused) {
                        fileReader = fileReader2;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bufferedReader != null) {
                        }
                        return strTrim;
                    }
                }
                try {
                    fileReader2.close();
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
                bufferedReader = null;
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused6) {
        }
        return strTrim;
    }

    public String a() {
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            availableBlocks = 0;
        }
        return "" + availableBlocks;
    }

    public synchronized String b(Context context) {
        String subscriberId = this.f121801a.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        String strA = d.a("imsi");
        if (strA != null) {
            return strA;
        }
        if (this.f121801a.isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (strA == null) {
            strA = "";
        }
        d.b("imsi", strA);
        return strA;
    }

    public String e() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return "" + blockSize;
    }

    public String f(Context context) {
        int i11 = 0;
        try {
            i11 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i11 == 1 ? "1" : WebrtcBuildVersion.maint_version;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public String h() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        String strTrim = "0000000000000000";
        LineNumberReader lineNumberReader = null;
        try {
            fileInputStream = new FileInputStream(new File("/proc/cpuinfo"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    LineNumberReader lineNumberReader2 = new LineNumberReader(inputStreamReader);
                    for (int i11 = 1; i11 < 100; i11++) {
                        try {
                            String line = lineNumberReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.indexOf("Serial") > -1) {
                                strTrim = line.substring(line.indexOf(":") + 1, line.length()).trim();
                                break;
                            }
                        } catch (Throwable unused) {
                            lineNumberReader = lineNumberReader2;
                            if (lineNumberReader != null) {
                                try {
                                    lineNumberReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            if (fileInputStream != null) {
                            }
                            if (strTrim == null) {
                                return "";
                            }
                            return strTrim;
                        }
                    }
                    try {
                        lineNumberReader2.close();
                    } catch (Throwable unused4) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused5) {
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
                inputStreamReader = null;
            }
        } catch (Throwable unused8) {
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            fileInputStream.close();
        } catch (Throwable unused9) {
        }
        if (strTrim == null) {
            return "";
        }
        return strTrim;
    }

    public String i(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i11 = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", "" + i11);
            jSONObject.put("call", "" + streamVolume);
            jSONObject.put("system", "" + streamVolume2);
            jSONObject.put("ring", "" + streamVolume3);
            jSONObject.put("music", "" + streamVolume4);
            jSONObject.put("alarm", "" + streamVolume5);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public String j() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public synchronized String k(Context context) {
        try {
            String strA = d.a("NetworkOperatorName");
            if (strA != null) {
                return strA;
            }
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        strA = telephonyManager.getNetworkOperatorName();
                    }
                } catch (Throwable unused) {
                }
            }
            if (strA == null || Address.ADDRESS_NULL_PLACEHOLDER.equals(strA)) {
                strA = "";
            }
            d.b("NetworkOperatorName", strA);
            return strA;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String l() {
        String strN = N();
        return !sg.a.c(strN) ? strN : O();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    public String m(Context context) {
        List<Sensor> sensorList;
        String strI;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0) {
                    strI = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb2.append(sensor.getName());
                        sb2.append(sensor.getVersion());
                        sb2.append(sensor.getVendor());
                    }
                    strI = sg.a.i(sb2.toString());
                }
            } catch (Throwable unused) {
            }
        } else {
            strI = null;
        }
        return strI == null ? "" : strI;
    }

    public String n() {
        BufferedReader bufferedReader;
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2);
                try {
                    String[] strArrSplit = bufferedReader.readLine().split(":\\s+", 2);
                    if (strArrSplit != null && strArrSplit.length > 1) {
                        String str = strArrSplit[1];
                        try {
                            fileReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                        return str;
                    }
                    try {
                        fileReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (bufferedReader == null) {
                        return "";
                    }
                }
            } catch (Throwable unused6) {
                bufferedReader = null;
            }
        } catch (Throwable unused7) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    public String o(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public String p() {
        BufferedReader bufferedReader;
        long j11 = 0;
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader2, PKIFailureInfo.certRevoked);
                try {
                    String line = bufferedReader.readLine();
                    j11 = line != null ? Integer.parseInt(line.split("\\s+")[1]) : 0L;
                    try {
                        fileReader2.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (bufferedReader != null) {
                    }
                    return "" + j11;
                }
            } catch (Throwable unused4) {
                bufferedReader = null;
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused6) {
        }
        return "" + j11;
    }

    public String q(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + Marker.ANY_MARKER + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String r() {
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            blockCount = 0;
        }
        return "" + blockCount;
    }

    public String s(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String t() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return "" + blockSize;
    }

    public String u(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String v() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public synchronized String w(Context context) {
        String strA = d.a("SimSerial");
        if (strA != null) {
            return strA;
        }
        if (this.f121801a.isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        d.b("SimSerial", strA);
        return strA;
    }

    public String x() {
        String string;
        try {
            string = Locale.getDefault().toString();
        } catch (Throwable unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    public synchronized String y(Context context) {
        String androidId = this.f121801a.getAndroidId();
        if (androidId != null) {
            return androidId;
        }
        String strA = d.a("ANDROIDID");
        if (strA != null) {
            return strA;
        }
        if (this.f121801a.isBackgroundRunning()) {
            return "";
        }
        try {
            strA = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
        }
        if (strA == null) {
            strA = "";
        }
        d.b("ANDROIDID", strA);
        return strA;
    }

    public String z() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = "";
        }
        return displayName == null ? "" : displayName;
    }
}
