package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzfu {
    public static String zza(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return zzb(signature);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e11);
            return null;
        }
    }

    private static String zzb(Signature signature) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signature.toByteArray());
            return zzmj.zzd().zze(bArrDigest, 0, bArrDigest.length);
        } catch (NoSuchAlgorithmException e11) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e11);
            return null;
        }
    }
}
