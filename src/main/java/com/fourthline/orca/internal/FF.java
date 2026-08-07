package com.fourthline.orca.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class FF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FF f25800a = new FF();

    private FF() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(String it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return true;
    }

    private final void a(ZipInputStream zipInputStream, String str) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            sn0.a.b(zipInputStream, fileOutputStream, 0, 2, null);
            sn0.b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void a(FF ff2, File file, File file2, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new wn0.l() { // from class: com.fourthline.orca.internal.ya0
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(FF.a((String) obj2));
                }
            };
        }
        ff2.a(file, file2, lVar);
    }

    public final void a(File zipFile, File destDir, wn0.l fileFilter) {
        p013kotlin.jvm.internal.s.k(zipFile, "zipFile");
        p013kotlin.jvm.internal.s.k(destDir, "destDir");
        p013kotlin.jvm.internal.s.k(fileFilter, "fileFilter");
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
        try {
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                String name = nextEntry.getName();
                String canonicalPath = new File(destDir, name).getCanonicalPath();
                p013kotlin.jvm.internal.s.h(canonicalPath);
                if (p013kotlin.text.t.b0(canonicalPath, destDir.getCanonicalPath() + File.separator, false, 2, null)) {
                    if (nextEntry.isDirectory()) {
                        File file = new File(canonicalPath);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } else {
                        p013kotlin.jvm.internal.s.h(name);
                        if (((Boolean) fileFilter.invoke(name)).booleanValue()) {
                            f25800a.a(zipInputStream, canonicalPath);
                        }
                    }
                    zipInputStream.closeEntry();
                } else {
                    throw new SecurityException("Zip entry is outside of the target dir: " + name);
                }
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            sn0.b.a(zipInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(zipInputStream, th2);
                throw th3;
            }
        }
    }
}
