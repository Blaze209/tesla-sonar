package di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f60674a = {"10.1.5.1013151", "10.1.5.1013148"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f60675b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f60676a;

        public a(Activity activity) {
            this.f60676a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60676a.finish();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f60677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f60678b;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.f60677a = runnable;
            this.f60678b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f60677a.run();
            } finally {
                this.f60678b.open();
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PackageInfo f60679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60681c;

        public c(PackageInfo packageInfo, int i11, String str) {
            this.f60679a = packageInfo;
            this.f60680b = i11;
            this.f60681c = str;
        }

        public boolean a() {
            return this.f60679a.versionCode < this.f60680b;
        }

        public boolean b(ai.a aVar) {
            Signature[] signatureArr = this.f60679a.signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String strM = p.m(aVar, signature.toByteArray());
                    if (strM != null && !TextUtils.equals(strM, this.f60681c)) {
                        hh.a.g(aVar, "biz", "PublicKeyUnmatch", String.format("Got %s, expected %s", strM, this.f60681c));
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean A(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f60674a;
            return TextUtils.equals(str, strArr[0]) || TextUtils.equals(str, strArr[1]);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String B() {
        if (kg.b.c()) {
            return TextUtils.equals("hk.alipay.wallet", fh.a.f65949d.get(0).f90020a) ? "hk.alipay.walletRC" : "com.eg.android.AlipayGphoneRC";
        }
        try {
            return fh.a.f65949d.get(0).f90020a;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    public static String C(Context context) {
        return "-1;-1";
    }

    public static String D(String str, String str2) {
        String string = Settings.Secure.getString(((Application) ai.b.d().c()).getContentResolver(), str);
        return string != null ? string : str2;
    }

    public static Map<String, String> E(ai.a aVar, String str) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), Q(aVar, str2.substring(iIndexOf2 + 1)));
                }
            }
        }
        return map;
    }

    public static Map<String, String> F(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=", 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), URLDecoder.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    public static boolean G(ai.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f1117g)) {
            return false;
        }
        return aVar.f1117g.toLowerCase().contains("auth");
    }

    public static String H(ai.a aVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e11) {
            hh.a.g(aVar, "biz", "rflex", e11.getClass().getSimpleName());
            return null;
        }
    }

    public static String I(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String J(String str) {
        return (kg.b.c() && TextUtils.equals(str, "com.eg.android.AlipayGphoneRC")) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static int K(String str) {
        for (int i11 = 0; i11 < 64; i11++) {
            if (str.equals(String.valueOf(f60675b[i11]))) {
                return i11;
            }
        }
        return 0;
    }

    public static DisplayMetrics L(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String M() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(line);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static boolean N(ai.a aVar, String str) {
        try {
            int iO = O(str);
            hh.a.b(aVar, "biz", "bindExt", "" + iO);
            return lh.b.E().O() && (iO & 2) == 2;
        } catch (Throwable unused) {
        }
    }

    public static int O(String str) {
        try {
            String strI = lh.b.E().I();
            if (TextUtils.isEmpty(strI)) {
                return 0;
            }
            return (D(strI, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static String P() {
        String strM = M();
        int iIndexOf = strM.indexOf("-");
        if (iIndexOf != -1) {
            strM = strM.substring(0, iIndexOf);
        }
        int iIndexOf2 = strM.indexOf("\n");
        if (iIndexOf2 != -1) {
            strM = strM.substring(0, iIndexOf2);
        }
        return "Linux " + strM;
    }

    public static String Q(ai.a aVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e11) {
            hh.a.c(aVar, "biz", "H5PayDataAnalysisError", e11);
            return "";
        }
    }

    public static String R(Context context) {
        String strB = o.b(context);
        return strB.substring(0, strB.indexOf("://"));
    }

    public static String S() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String T(Context context) {
        DisplayMetrics displayMetricsL = L(context);
        return displayMetricsL.widthPixels + Marker.ANY_MARKER + displayMetricsL.heightPixels;
    }

    public static boolean U(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net|hk)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static int V() {
        try {
            return Process.myUid();
        } catch (Throwable th2) {
            g.d(th2);
            return -200;
        }
    }

    public static String W(Context context) {
        String strS = S();
        String strP = P();
        String strI = I(context);
        String strT = T(context);
        StringBuilder sb2 = new StringBuilder();
        if (lh.b.E().U()) {
            sb2.append(" (");
            sb2.append(strS);
            sb2.append(";");
            sb2.append(strP);
            sb2.append(";");
            sb2.append(strI);
            sb2.append(";");
            sb2.append(";");
            sb2.append(strT);
            sb2.append(")");
            sb2.append("(sdk android)");
            return sb2.toString();
        }
        sb2.append(" (");
        sb2.append(strS);
        sb2.append(";");
        sb2.append(strP);
        sb2.append(";");
        sb2.append(strI);
        sb2.append(";");
        sb2.append(";");
        sb2.append(strT);
        sb2.append(";");
        sb2.append("15.8.42");
        sb2.append(")");
        sb2.append("(sdk android)");
        return sb2.toString();
    }

    public static String X(String str) {
        return q(str, true);
    }

    public static JSONObject Y(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static boolean Z() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static int a() {
        String strE = ai.b.d().e();
        if (TextUtils.isEmpty(strE)) {
            return -1;
        }
        String strReplaceAll = strE.replaceAll("=", "");
        if (strReplaceAll.length() >= 5) {
            strReplaceAll = strReplaceAll.substring(0, 5);
        }
        int iB = (int) (b(strReplaceAll) % 10000);
        return iB < 0 ? iB * (-1) : iB;
    }

    public static boolean a0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static long b(String str) {
        return c(str, 6);
    }

    public static String b0(String str) {
        try {
            Uri uri = Uri.parse(str);
            return String.format("%s%s", uri.getAuthority(), uri.getPath());
        } catch (Throwable th2) {
            g.d(th2);
            return "-";
        }
    }

    public static long c(String str, int i11) {
        int iPow = (int) Math.pow(2.0d, i11);
        int length = str.length();
        long j11 = 0;
        int i12 = 0;
        int i13 = length;
        while (i12 < length) {
            int i14 = i12 + 1;
            j11 += ((long) Integer.parseInt(String.valueOf(K(str.substring(i12, i14))))) * ((long) Math.pow(iPow, i13 - 1));
            i13--;
            i12 = i14;
        }
        return j11;
    }

    public static ActivityInfo d(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            g.d(th2);
            return null;
        }
    }

    public static PackageInfo e(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static c f(ai.a aVar, Context context, String str, int i11, String str2) {
        PackageInfo packageInfoE;
        if (kg.b.c()) {
            if ("com.eg.android.AlipayGphone".equals(str)) {
                str = "com.eg.android.AlipayGphoneRC";
            } else if ("hk.alipay.wallet".equals(str)) {
                str = "hk.alipay.walletRC";
            }
        }
        try {
            packageInfoE = e(context, str);
        } catch (Throwable th2) {
            hh.a.g(aVar, "auth", "GetPackageInfoEx", th2.getMessage());
            packageInfoE = null;
        }
        if (x(aVar, packageInfoE)) {
            return h(packageInfoE, i11, str2);
        }
        return null;
    }

    public static c g(ai.a aVar, Context context, List<lh.b.C1902b> list) {
        c cVarF;
        if (list == null) {
            return null;
        }
        for (lh.b.C1902b c1902b : list) {
            if (c1902b != null && (cVarF = f(aVar, context, c1902b.f90020a, c1902b.f90021b, c1902b.f90022c)) != null && !cVarF.b(aVar) && !cVarF.a()) {
                return cVarF;
            }
        }
        return null;
    }

    public static c h(PackageInfo packageInfo, int i11, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i11, str);
    }

    public static <T> T i(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String j(int i11) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                sb2.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb2.toString();
    }

    public static String k(ai.a aVar) {
        return H(aVar, "ro.build.fingerprint");
    }

    public static String l(ai.a aVar, Context context) {
        try {
            String strA = l.a(aVar, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            try {
                l.c(aVar, context, "alipay_cashier_ap_fi", dh.a.b("FU", System.currentTimeMillis(), new dh.d(), (short) 0, new dh.f()).a());
                String strA2 = l.a(aVar, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(strA2)) {
                    return strA2;
                }
                hh.a.g(aVar, "biz", "e_regen_empty", "");
                return "";
            } catch (Exception e11) {
                hh.a.g(aVar, "biz", "e_gen", e11.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e12) {
            hh.a.c(aVar, "biz", "e_gen_err", e12);
            return "";
        }
    }

    public static String m(ai.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e11) {
            hh.a.c(aVar, "auth", "GetPublicKeyFromSignEx", e11);
            return null;
        }
    }

    public static String n(File file) throws NoSuchAlgorithmException, IOException {
        int i11;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i12 = fileInputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i12);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        try {
            int iIndexOf = str3.indexOf(str) + str.length();
            if (iIndexOf <= str.length()) {
                return "";
            }
            int iIndexOf2 = !TextUtils.isEmpty(str2) ? str3.indexOf(str2, iIndexOf) : 0;
            return iIndexOf2 < 1 ? str3.substring(iIndexOf) : str3.substring(iIndexOf, iIndexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String q(String str, boolean z11) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (!z11 || bArrDigest.length <= 16) {
                return r(bArrDigest);
            }
            byte[] bArr = new byte[16];
            System.arraycopy(bArrDigest, 0, bArr, 0, 16);
            return r(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String r(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append(Character.forDigit((b11 & 240) >> 4, 16));
            sb2.append(Character.forDigit(b11 & 15, 16));
        }
        return sb2.toString();
    }

    public static Map<String, String> s(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, jSONObject.optString(next));
                } catch (Throwable th2) {
                    g.d(th2);
                }
            }
        }
        return map;
    }

    public static JSONObject t(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static void u(String str, String str2, Context context, ai.a aVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || G(aVar) || !lh.b.E().W()) {
            return;
        }
        try {
            Intent intent = new Intent("android.app.intent.action.APP_EXCEPTION_OCCUR");
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            hh.a.b(aVar, "biz", "AppNotify", str + "|" + str2);
        } catch (Exception unused) {
        }
    }

    public static boolean v(long j11, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            if (j11 > 0) {
                return conditionVariable.block(j11);
            }
            conditionVariable.block();
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean w(ai.a aVar, Context context, List<lh.b.C1902b> list, boolean z11) {
        try {
            for (lh.b.C1902b c1902b : list) {
                if (c1902b != null) {
                    String str = c1902b.f90020a;
                    if (kg.b.c()) {
                        if ("com.eg.android.AlipayGphone".equals(str)) {
                            str = "com.eg.android.AlipayGphoneRC";
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = "hk.alipay.walletRC";
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z11) {
                                return true;
                            }
                            hh.a.b(aVar, "biz", "PgWltVer", packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "CheckLaunchAppExistEx", th2);
            return false;
        }
    }

    public static boolean x(ai.a aVar, PackageInfo packageInfo) {
        String str = "";
        boolean z11 = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                z11 = true;
            }
        }
        if (!z11) {
            hh.a.g(aVar, "auth", "NotIncludeSignatures", str);
        }
        return z11;
    }

    public static boolean y(ai.a aVar, String str) {
        try {
            String host = new URL(str).getHost();
            return host.endsWith("alipay.com") || host.endsWith("alipay.net");
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "ckUrlErr", th2);
            return false;
        }
    }

    public static boolean z(ai.a aVar, String str, Activity activity) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) || str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
            try {
                c cVarG = g(aVar, activity, fh.a.f65949d);
                if (cVarG != null && !cVarG.a() && !cVarG.b(aVar)) {
                    if (str.startsWith("intent://platformapi/startapp")) {
                        str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                    }
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Throwable unused) {
            }
            return true;
        }
        if (TextUtils.equals(str, "sdklite://h5quit") || TextUtils.equals(str, o("http", "://m.alipay.com/?action=h5quit"))) {
            fh.b.c(fh.b.a());
            activity.finish();
            return true;
        }
        if (!str.startsWith("sdklite://h5quit?result=")) {
            return false;
        }
        try {
            String strSubstring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
            int i11 = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf("&end_code=") + 10));
            if (i11 == fh.c.SUCCEEDED.c() || i11 == fh.c.PAY_WAITTING.c()) {
                if (jh.a.f83726d) {
                    StringBuilder sb2 = new StringBuilder();
                    String strDecode = URLDecoder.decode(str);
                    String strDecode2 = URLDecoder.decode(strDecode);
                    String str2 = strDecode2.substring(strDecode2.indexOf("sdklite://h5quit?result=") + 24, strDecode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                    int iIndexOf = strDecode.indexOf("&return_url=") + 12;
                    sb2.append(str2);
                    sb2.append("&return_url=");
                    sb2.append(strDecode.substring(iIndexOf, strDecode.indexOf("&", iIndexOf)));
                    sb2.append(strDecode.substring(strDecode.indexOf("&", iIndexOf)));
                    strSubstring = sb2.toString();
                } else {
                    String strDecode3 = URLDecoder.decode(str);
                    strSubstring = strDecode3.substring(strDecode3.indexOf("sdklite://h5quit?result=") + 24, strDecode3.lastIndexOf("&end_code="));
                }
                fh.c cVarA = fh.c.a(i11);
                fh.b.c(fh.b.b(cVarA.c(), cVarA.b(), strSubstring));
            } else {
                fh.c cVarA2 = fh.c.a(fh.c.FAILED.c());
                fh.b.c(fh.b.b(cVarA2.c(), cVarA2.b(), ""));
            }
        } catch (Exception unused2) {
            fh.b.c(fh.b.h());
        }
        activity.runOnUiThread(new a(activity));
        return true;
    }
}
