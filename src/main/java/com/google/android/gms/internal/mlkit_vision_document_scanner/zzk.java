package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzk {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String str = Build.HARDWARE;
        zzc = new String[]{"media", (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        int i11 = Build.VERSION.SDK_INT;
        zzd = new String[]{i11 <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "", i11 <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ac A[Catch: IOException -> 0x0154, FileNotFoundException -> 0x0157, TryCatch #3 {FileNotFoundException -> 0x0157, IOException -> 0x0154, blocks: (B:68:0x0115, B:70:0x012f, B:72:0x0137, B:75:0x0141, B:77:0x0147, B:110:0x01be, B:87:0x0169, B:89:0x016f, B:91:0x0175, B:94:0x0180, B:96:0x018d, B:98:0x0191, B:101:0x019c, B:102:0x019f, B:104:0x01ac, B:106:0x01b0, B:109:0x01bb, B:84:0x015a, B:112:0x01c4, B:114:0x01ca, B:115:0x01d3), top: B:127:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01b0 A[Catch: IOException -> 0x0154, FileNotFoundException -> 0x0157, TryCatch #3 {FileNotFoundException -> 0x0157, IOException -> 0x0154, blocks: (B:68:0x0115, B:70:0x012f, B:72:0x0137, B:75:0x0141, B:77:0x0147, B:110:0x01be, B:87:0x0169, B:89:0x016f, B:91:0x0175, B:94:0x0180, B:96:0x018d, B:98:0x0191, B:101:0x019c, B:102:0x019f, B:104:0x01ac, B:106:0x01b0, B:109:0x01bb, B:84:0x015a, B:112:0x01c4, B:114:0x01ca, B:115:0x01d3), top: B:127:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x019c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01bb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0169 A[Catch: IOException -> 0x0154, FileNotFoundException -> 0x0157, TryCatch #3 {FileNotFoundException -> 0x0157, IOException -> 0x0154, blocks: (B:68:0x0115, B:70:0x012f, B:72:0x0137, B:75:0x0141, B:77:0x0147, B:110:0x01be, B:87:0x0169, B:89:0x016f, B:91:0x0175, B:94:0x0180, B:96:0x018d, B:98:0x0191, B:101:0x019c, B:102:0x019f, B:104:0x01ac, B:106:0x01b0, B:109:0x01bb, B:84:0x015a, B:112:0x01c4, B:114:0x01ca, B:115:0x01d3), top: B:127:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0180 A[Catch: IOException -> 0x0154, FileNotFoundException -> 0x0157, TryCatch #3 {FileNotFoundException -> 0x0157, IOException -> 0x0154, blocks: (B:68:0x0115, B:70:0x012f, B:72:0x0137, B:75:0x0141, B:77:0x0147, B:110:0x01be, B:87:0x0169, B:89:0x016f, B:91:0x0175, B:94:0x0180, B:96:0x018d, B:98:0x0191, B:101:0x019c, B:102:0x019f, B:104:0x01ac, B:106:0x01b0, B:109:0x01bb, B:84:0x015a, B:112:0x01c4, B:114:0x01ca, B:115:0x01d3), top: B:127:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x018d A[Catch: IOException -> 0x0154, FileNotFoundException -> 0x0157, TryCatch #3 {FileNotFoundException -> 0x0157, IOException -> 0x0154, blocks: (B:68:0x0115, B:70:0x012f, B:72:0x0137, B:75:0x0141, B:77:0x0147, B:110:0x01be, B:87:0x0169, B:89:0x016f, B:91:0x0175, B:94:0x0180, B:96:0x018d, B:98:0x0191, B:101:0x019c, B:102:0x019f, B:104:0x01ac, B:106:0x01b0, B:109:0x01bb, B:84:0x015a, B:112:0x01c4, B:114:0x01ca, B:115:0x01d3), top: B:127:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0191 A[Catch: IOException -> 0x0154, FileNotFoundException -> 0x0157, TryCatch #3 {FileNotFoundException -> 0x0157, IOException -> 0x0154, blocks: (B:68:0x0115, B:70:0x012f, B:72:0x0137, B:75:0x0141, B:77:0x0147, B:110:0x01be, B:87:0x0169, B:89:0x016f, B:91:0x0175, B:94:0x0180, B:96:0x018d, B:98:0x0191, B:101:0x019c, B:102:0x019f, B:104:0x01ac, B:106:0x01b0, B:109:0x01bb, B:84:0x015a, B:112:0x01c4, B:114:0x01ca, B:115:0x01d3), top: B:127:0x0115 }] */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c2, code lost:
    
        if (r3 == r10.zza()) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r10.zza() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r10.zza() != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream zza(final android.content.Context r8, android.net.Uri r9, com.google.android.gms.internal.mlkit_vision_document_scanner.zzj r10) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_document_scanner.zzk.zza(android.content.Context, android.net.Uri, com.google.android.gms.internal.mlkit_vision_document_scanner.zzj):java.io.InputStream");
    }

    private static void zzb(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e11) {
                throw new IOException(e11);
            }
        } catch (ErrnoException e12) {
            throw new IOException(e12);
        }
    }

    private static String zzc(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    private static File[] zzd(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    private static void zze(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e11) {
            fileNotFoundException.addSuppressed(e11);
        }
    }
}
