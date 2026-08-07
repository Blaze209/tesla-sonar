package bq0;

import dq0.q;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f17887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f17888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f17889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f17890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f17891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f17892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f17893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f17894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final File[] f17895i;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        f17887a = bigIntegerValueOf;
        BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf);
        f17888b = bigIntegerMultiply;
        BigInteger bigIntegerMultiply2 = bigIntegerValueOf.multiply(bigIntegerMultiply);
        f17889c = bigIntegerMultiply2;
        BigInteger bigIntegerMultiply3 = bigIntegerValueOf.multiply(bigIntegerMultiply2);
        f17890d = bigIntegerMultiply3;
        BigInteger bigIntegerMultiply4 = bigIntegerValueOf.multiply(bigIntegerMultiply3);
        f17891e = bigIntegerMultiply4;
        f17892f = bigIntegerValueOf.multiply(bigIntegerMultiply4);
        BigInteger bigIntegerMultiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(LockFreeTaskQueueCore.FROZEN_MASK));
        f17893g = bigIntegerMultiply5;
        f17894h = bigIntegerValueOf.multiply(bigIntegerMultiply5);
        f17895i = new File[0];
    }

    private static void a(File file, File file2, long j11, long j12) throws IOException {
        if (j11 == j12) {
            return;
        }
        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + j11 + " Actual: " + j12);
    }

    private static void b(File file, File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "target");
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static void c(File file, File file2) throws IOException {
        f(file, file2, true);
    }

    public static void d(File file, File file2, FileFilter fileFilter, boolean z11) throws IOException {
        e(file, file2, fileFilter, z11, StandardCopyOption.REPLACE_EXISTING);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    public static void e(File file, File file2, FileFilter fileFilter, boolean z11, CopyOption... copyOptionArr) throws IOException {
        ArrayList arrayList;
        b(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(fileArrListFiles.length);
                for (File file3 : fileArrListFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
            }
        } else {
            arrayList = null;
        }
        j(file, file2, fileFilter, z11, arrayList, copyOptionArr);
    }

    public static void f(File file, File file2, boolean z11) throws IOException {
        d(file, file2, null, z11);
    }

    public static void g(File file, File file2) throws IOException {
        h(file, file2, true);
    }

    public static void h(File file, File file2, boolean z11) throws IOException {
        i(file, file2, z11, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void i(File file, File file2, boolean z11, CopyOption... copyOptionArr) throws IOException {
        b(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (!file2.exists() || file2.canWrite()) {
            k(file, file2, z11, copyOptionArr);
            return;
        }
        throw new IOException("Destination '" + file2 + "' exists but is read-only");
    }

    private static void j(File file, File file2, FileFilter fileFilter, boolean z11, List<String> list, CopyOption... copyOptionArr) throws IOException {
        FileFilter fileFilter2;
        boolean z12;
        List<String> list2;
        CopyOption[] copyOptionArr2;
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        int length = fileArrListFiles.length;
        int i11 = 0;
        while (i11 < length) {
            File file3 = fileArrListFiles[i11];
            File file4 = new File(file2, file3.getName());
            if (list != null && list.contains(file3.getCanonicalPath())) {
                fileFilter2 = fileFilter;
                z12 = z11;
                list2 = list;
                copyOptionArr2 = copyOptionArr;
            } else if (file3.isDirectory()) {
                fileFilter2 = fileFilter;
                z12 = z11;
                list2 = list;
                copyOptionArr2 = copyOptionArr;
                j(file3, file4, fileFilter2, z12, list2, copyOptionArr2);
            } else {
                fileFilter2 = fileFilter;
                z12 = z11;
                list2 = list;
                copyOptionArr2 = copyOptionArr;
                k(file3, file4, z12, copyOptionArr2);
            }
            i11++;
            fileFilter = fileFilter2;
            z11 = z12;
            list = list2;
            copyOptionArr = copyOptionArr2;
        }
        if (z11) {
            m(file, file2);
        }
    }

    private static void k(File file, File file2, boolean z11, CopyOption... copyOptionArr) throws IOException {
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        Path path = file.toPath();
        Path path2 = file2.toPath();
        Files.copy(path, path2, copyOptionArr);
        a(file, file2, Files.size(path), Files.size(path2));
        a(file, file2, file.length(), file2.length());
        if (z11) {
            m(file, file2);
        }
    }

    public static void l(File file) throws IOException {
        try {
            dq0.a.f fVarA = q.a(file.toPath());
            if (fVarA.a().get() >= 1 || fVarA.c().get() >= 1) {
                return;
            }
            throw new FileNotFoundException("File does not exist: " + file);
        } catch (IOException e11) {
            throw new IOException("Unable to delete file: " + file, e11);
        }
    }

    private static void m(File file, File file2) throws IOException {
        if (file2.setLastModified(file.lastModified())) {
            return;
        }
        throw new IOException("Failed setLastModified on " + file);
    }
}
