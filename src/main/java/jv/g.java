package jv;

import android.content.Context;
import bv.i;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f84349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f84350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f84351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f84352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f84353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f84354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f84355g;

    public g(Context context) {
        String str;
        String strD = i.f18125a.e(context).d();
        this.f84349a = strD;
        File filesDir = context.getFilesDir();
        this.f84350b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileS = s(new File(filesDir, str));
        this.f84351c = fileS;
        this.f84352d = s(new File(fileS, "open-sessions"));
        this.f84353e = s(new File(fileS, "reports"));
        this.f84354f = s(new File(fileS, "priority-reports"));
        this.f84355g = s(new File(fileS, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f84350b, str);
        if (file.exists() && u(file)) {
            bv.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f84350b.exists() || (list = this.f84350b.list(new FilenameFilter() { // from class: jv.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return t(new File(this.f84352d, str));
    }

    private static synchronized File s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                bv.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                bv.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static File t(File file) {
        file.mkdirs();
        return file;
    }

    static boolean u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                u(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> v(T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    static String w(String str) {
        return str.length() > 40 ? com.google.firebase.crashlytics.internal.common.i.A(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean x() {
        return !this.f84349a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (x()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return u(new File(this.f84352d, str));
    }

    public List<String> f() {
        return v(this.f84352d.list());
    }

    public File g(String str) {
        return new File(this.f84351c, str);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return v(this.f84351c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f84355g, str);
    }

    public List<File> j() {
        return v(this.f84355g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f84354f, str);
    }

    public List<File> m() {
        return v(this.f84354f.listFiles());
    }

    public File n(String str) {
        return new File(this.f84353e, str);
    }

    public List<File> o() {
        return v(this.f84353e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List<File> r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }
}
