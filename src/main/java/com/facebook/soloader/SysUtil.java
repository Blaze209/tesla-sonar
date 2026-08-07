package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class SysUtil {

    @g
    @TargetApi(21)
    private static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @g
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j11) throws IOException {
            int i11;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j11);
            } catch (ErrnoException e11) {
                if (e11.errno != OsConstants.EOPNOTSUPP && (i11 = e11.errno) != OsConstants.ENOSYS && i11 != OsConstants.EINVAL) {
                    throw new IOException(e11.toString(), e11);
                }
            }
        }

        @g
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add("arm64-v8a");
                    treeSet.add("x86_64");
                } else {
                    treeSet.add("armeabi-v7a");
                    treeSet.add("x86");
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e11) {
                p.b("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e11.errno), e11.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @g
        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    @g
    @TargetApi(23)
    private static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        public static boolean a(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        public static boolean b(Context context, int i11) {
            if (i11 == 2) {
                return true;
            }
            return a(context);
        }

        @g
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add("arm64-v8a");
                treeSet.add("x86_64");
            } else {
                treeSet.add("armeabi-v7a");
                treeSet.add("x86");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @g
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i11, byte[] bArr) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, 0, Math.min(bArr.length, i11 - i12));
            if (i13 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, i13);
            i12 += i13;
        }
        return i12;
    }

    public static void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            p.b("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static void c(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                b(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b((File) arrayList.get(size));
        }
    }

    public static void d(FileDescriptor fileDescriptor, long j11) throws IOException {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j11);
    }

    public static int e(String[] strArr, String str) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            if (str2 != null && str.equals(str2)) {
                return i11;
            }
        }
        return -1;
    }

    public static void f(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("cannot list directory " + file2);
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    p.b("SysUtil", "Syncing failed for " + file2 + ": " + e11.getMessage());
                }
            }
        }
    }

    public static int g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    @g
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
            } catch (Exception e11) {
                p.c("SysUtil", "Cannot call getLdLibraryPath", e11);
                return null;
            }
        }
        throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
    }

    @g
    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e11) {
            p.h("SysUtil", "Cannot get nativeLoad method", e11);
            return null;
        }
    }

    public static n h(File file) {
        return n.c(file);
    }

    public static n i(File file, File file2) throws Throwable {
        boolean z11;
        try {
            return h(file2);
        } catch (FileNotFoundException e11) {
            z11 = true;
            try {
                if (!file.setWritable(true)) {
                    throw e11;
                }
                n nVarH = h(file2);
                if (!file.setWritable(false)) {
                    p.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                return nVarH;
            } catch (Throwable th2) {
                th = th2;
                if (z11 && !file.setWritable(false)) {
                    p.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
            if (z11) {
                p.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    public static String[] j() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean k() {
        return MarshmallowSysdeps.is64Bit();
    }

    public static boolean l(Context context, int i11) {
        return MarshmallowSysdeps.b(context, i11);
    }

    public static void m(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}
