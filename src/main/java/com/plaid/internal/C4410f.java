package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.plaid.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4410f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f47642a;

    /* JADX INFO: renamed from: com.plaid.internal.f$a */
    public static final class a {
        public static String a(String str, String str2) {
            String str3 = str + " " + str2;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset UTF_8 = StandardCharsets.UTF_8;
                p013kotlin.jvm.internal.s.j(UTF_8, "UTF_8");
                byte[] bytes = str3.getBytes(UTF_8);
                p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
                messageDigest.update(bytes);
                String strEncodeToString = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
                p013kotlin.jvm.internal.s.h(strEncodeToString);
                String strSubstring = strEncodeToString.substring(0, 11);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                return strSubstring;
            } catch (NoSuchAlgorithmException e11) {
                X5.a.b(X5.f46812a, "hash:NoSuchAlgorithm", new Object[]{e11});
                return null;
            }
        }
    }

    public final String a(Application application) {
        Signature[] apkContentsSigners;
        p013kotlin.jvm.internal.s.k(application, "application");
        ArrayList<String> arrayList = null;
        if (this.f47642a == null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            try {
                String packageName = application.getPackageName();
                PackageManager packageManager = application.getPackageManager();
                if (Build.VERSION.SDK_INT < 28) {
                    apkContentsSigners = packageManager.getPackageInfo(packageName, 64).signatures;
                } else {
                    SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                    apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                }
                if (apkContentsSigners != null) {
                    Iterator itA = p013kotlin.jvm.internal.c.a(apkContentsSigners);
                    while (itA.hasNext()) {
                        Signature signature = (Signature) itA.next();
                        p013kotlin.jvm.internal.s.h(packageName);
                        String charsString = signature.toCharsString();
                        p013kotlin.jvm.internal.s.j(charsString, "toCharsString(...)");
                        String strA = a.a(packageName, charsString);
                        if (strA != null) {
                            p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
                            String str = String.format("%s", Arrays.copyOf(new Object[]{strA}, 1));
                            p013kotlin.jvm.internal.s.j(str, "format(...)");
                            arrayList2.add(str);
                        }
                    }
                }
                this.f47642a = arrayList2;
            } catch (PackageManager.NameNotFoundException e11) {
                Object[] args = {e11};
                X5.f46812a.getClass();
                p013kotlin.jvm.internal.s.k(args, "args");
                X5.f46813b.a("Unable to find package to obtain hash.", new Object[]{args}, true);
            }
        }
        ArrayList<String> arrayList3 = this.f47642a;
        if (arrayList3 == null) {
            p013kotlin.jvm.internal.s.B("appSignatures");
        } else {
            arrayList = arrayList3;
        }
        return (String) p013kotlin.collections.v.q0(arrayList);
    }
}
