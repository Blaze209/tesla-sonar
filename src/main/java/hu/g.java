package hu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fu.f f73645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f73646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f73647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f73648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PackageInfo f73649e;

    public g(Context context, fu.f fVar, b bVar) {
        f fVar2 = new f(new fu.b(fVar));
        this.f73645a = fVar;
        this.f73646b = bVar;
        this.f73647c = context;
        this.f73648d = fVar2;
    }

    private final PackageInfo d() {
        if (this.f73649e == null) {
            try {
                this.f73649e = this.f73647c.getPackageManager().getPackageInfo(this.f73647c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f73649e;
    }

    private static X509Certificate e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e11) {
            Log.e("SplitCompat", "Cannot decode certificate.", e11);
            return null;
        }
    }

    public final boolean a(File[] fileArr) {
        PackageInfo packageInfoD = d();
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoD.getLongVersionCode() : packageInfoD.versionCode;
        AssetManager assetManager = (AssetManager) com.google.android.play.core.splitinstall.internal.c.c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f73648d.b(assetManager, fileArr[length]);
        } while (longVersionCode == this.f73648d.a());
        return false;
    }

    public final boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f73645a.g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(File[] fileArr) {
        PackageInfo packageInfoD = d();
        ArrayList<X509Certificate> arrayList = null;
        if (packageInfoD != null && packageInfoD.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : packageInfoD.signatures) {
                X509Certificate x509CertificateE = e(signature);
                if (x509CertificateE != null) {
                    arrayList.add(x509CertificateE);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                String absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] x509CertificateArrA = g0.a(absolutePath);
                    if (x509CertificateArrA != null && x509CertificateArrA.length != 0 && x509CertificateArrA[0].length != 0) {
                        if (arrayList.isEmpty()) {
                            Log.e("SplitCompat", "No certificates found for app.");
                            break;
                        }
                        for (X509Certificate x509Certificate : arrayList) {
                            int length2 = x509CertificateArrA.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length2) {
                                    Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                                    break loop1;
                                }
                                if (!x509CertificateArrA[i11][0].equals(x509Certificate)) {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.");
                        break;
                    }
                } catch (Exception e11) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e11);
                }
            } catch (Exception e12) {
                Log.e("SplitCompat", "Split verification error.", e12);
                return false;
            }
        }
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }
}
