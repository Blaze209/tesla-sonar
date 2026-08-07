package uh;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static d f116197j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f116199a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f116201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f116202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f116203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sh.a f116204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sh.a f116205g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f116196i = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f116198k = ".UTSystemConfig" + File.separator + "Global";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f116200b = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Pattern f116206h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f116199a = null;
        this.f116201c = null;
        this.f116202d = "xx_utdid_key";
        this.f116203e = "xx_utdid_domain";
        this.f116204f = null;
        this.f116205g = null;
        this.f116199a = context;
        this.f116205g = new sh.a(context, f116198k, "Alvin2", false, true);
        this.f116204f = new sh.a(context, ".DataStorage", "ContextData", false, true);
        this.f116201c = new e();
        this.f116202d = String.format("K_%d", Integer.valueOf(qh.f.a(this.f116202d)));
        this.f116203e = String.format("D_%d", Integer.valueOf(qh.f.a(this.f116203e)));
    }

    public static String a(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(qh.e.b(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return qh.b.e(mac.doFinal(bArr), 2);
    }

    public static d b(Context context) {
        if (context != null && f116197j == null) {
            synchronized (f116196i) {
                try {
                    if (f116197j == null) {
                        d dVar = new d(context);
                        f116197j = dVar;
                        dVar.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f116197j;
    }

    public final void c() {
        boolean z11;
        sh.a aVar = this.f116205g;
        if (aVar != null) {
            if (qh.f.b(aVar.a("UTDID2"))) {
                String strA = this.f116205g.a("UTDID");
                if (!qh.f.b(strA)) {
                    e(strA);
                }
            }
            boolean z12 = true;
            if (qh.f.b(this.f116205g.a("DID"))) {
                z11 = false;
            } else {
                this.f116205g.d("DID");
                z11 = true;
            }
            if (!qh.f.b(this.f116205g.a("EI"))) {
                this.f116205g.d("EI");
                z11 = true;
            }
            if (qh.f.b(this.f116205g.a("SI"))) {
                z12 = z11;
            } else {
                this.f116205g.d("SI");
            }
            if (z12) {
                this.f116205g.e();
            }
        }
    }

    public final boolean d(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f116206h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public final void e(String str) {
        sh.a aVar;
        if (d(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (aVar = this.f116205g) == null) {
                return;
            }
            aVar.c("UTDID2", str);
            this.f116205g.e();
        }
    }

    public final byte[] f() throws IOException {
        String strB;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrA = qh.c.a(iCurrentTimeMillis);
        byte[] bArrA2 = qh.c.a(iNextInt);
        byteArrayOutputStream.write(bArrA, 0, 4);
        byteArrayOutputStream.write(bArrA2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strB = qh.d.b(this.f116199a);
        } catch (Exception unused) {
            strB = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(qh.c.a(qh.f.a(strB)), 0, 4);
        byteArrayOutputStream.write(qh.c.a(qh.f.a(a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    public final String g() {
        sh.a aVar = this.f116205g;
        if (aVar == null) {
            return null;
        }
        String strA = aVar.a("UTDID2");
        if (qh.f.b(strA) || this.f116201c.a(strA) == null) {
            return null;
        }
        return strA;
    }

    public final void h(String str) {
        sh.a aVar;
        if (str == null || (aVar = this.f116204f) == null || str.equals(aVar.a(this.f116202d))) {
            return;
        }
        this.f116204f.c(this.f116202d, str);
        this.f116204f.e();
    }

    public synchronized String i() {
        String strK = k();
        this.f116200b = strK;
        if (!TextUtils.isEmpty(strK)) {
            return this.f116200b;
        }
        try {
            byte[] bArrF = f();
            if (bArrF != null) {
                String strE = qh.b.e(bArrF, 2);
                this.f116200b = strE;
                e(strE);
                String strB = this.f116201c.b(bArrF);
                if (strB != null) {
                    h(strB);
                }
                return this.f116200b;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    public synchronized String j() {
        String str = this.f116200b;
        if (str != null) {
            return str;
        }
        return i();
    }

    public synchronized String k() {
        String strG = g();
        if (d(strG)) {
            h(this.f116201c.a(strG));
            this.f116200b = strG;
            return strG;
        }
        String strA = this.f116204f.a(this.f116202d);
        if (!qh.f.b(strA)) {
            String strA2 = new f().a(strA);
            if (!d(strA2)) {
                strA2 = this.f116201c.c(strA);
            }
            if (d(strA2) && !qh.f.b(strA2)) {
                this.f116200b = strA2;
                e(strA2);
                return this.f116200b;
            }
        }
        return null;
    }
}
