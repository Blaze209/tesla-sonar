package kk;

import android.os.Environment;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class a implements kk.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class<?> f86186f = a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f86187g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f86188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f86189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f86190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jk.a f86191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wk.a f86192e;

    /* JADX INFO: renamed from: kk.a$a, reason: collision with other inner class name */
    private class C1846a implements ok.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<kk.f.a> f86193a;

        @Override // ok.b
        public void a(File file) {
            c cVarT = a.this.t(file);
            if (cVarT == null || cVarT.f86199a != ".cnt") {
                return;
            }
            this.f86193a.add(new b(cVarT.f86200b, file));
        }

        public List<kk.f.a> d() {
            return Collections.unmodifiableList(this.f86193a);
        }

        private C1846a() {
            this.f86193a = new ArrayList();
        }

        @Override // ok.b
        public void b(File file) {
        }

        @Override // ok.b
        public void c(File file) {
        }
    }

    static class b implements kk.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f86195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ik.b f86196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f86197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f86198d;

        @Override // kk.f.a
        public long a() {
            if (this.f86198d < 0) {
                this.f86198d = this.f86196b.getCh.qos.logback.core.joran.action.Action.FILE_ATTRIBUTE java.lang.String().lastModified();
            }
            return this.f86198d;
        }

        public ik.b b() {
            return this.f86196b;
        }

        @Override // kk.f.a
        public String getId() {
            return this.f86195a;
        }

        @Override // kk.f.a
        public long getSize() {
            if (this.f86197c < 0) {
                this.f86197c = this.f86196b.size();
            }
            return this.f86197c;
        }

        private b(String str, File file) {
            pk.k.g(file);
            this.f86195a = (String) pk.k.g(str);
            this.f86196b = ik.b.b(file);
            this.f86197c = -1L;
            this.f86198d = -1L;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86200b;

        public static c b(File file) {
            String strR;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strR = a.r(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strR.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new c(strR, strSubstring);
        }

        public File a(File file) {
            return File.createTempFile(this.f86200b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f86200b + this.f86199a;
        }

        public String toString() {
            return this.f86199a + "(" + this.f86200b + ")";
        }

        private c(String str, String str2) {
            this.f86199a = str;
            this.f86200b = str2;
        }
    }

    private static class d extends IOException {
        public d(long j11, long j12) {
            super("File was not written completely. Expected: " + j11 + ", found: " + j12);
        }
    }

    class e implements kk.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f86201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File f86202b;

        public e(String str, File file) {
            this.f86201a = str;
            this.f86202b = file;
        }

        public ik.a a(Object obj, long j11) throws FileUtils.RenameException {
            jk.a.EnumC1775a enumC1775a;
            File fileP = a.this.p(this.f86201a);
            try {
                FileUtils.b(this.f86202b, fileP);
                if (fileP.exists()) {
                    fileP.setLastModified(j11);
                }
                return ik.b.b(fileP);
            } catch (FileUtils.RenameException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    enumC1775a = jk.a.EnumC1775a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    enumC1775a = jk.a.EnumC1775a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else {
                    enumC1775a = cause instanceof FileNotFoundException ? jk.a.EnumC1775a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : jk.a.EnumC1775a.WRITE_RENAME_FILE_OTHER;
                }
                a.this.f86191d.a(enumC1775a, a.f86186f, "commit", e11);
                throw e11;
            }
        }

        @Override // kk.f.b
        public boolean r() {
            return !this.f86202b.exists() || this.f86202b.delete();
        }

        @Override // kk.f.b
        public void s(jk.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f86202b);
                try {
                    pk.c cVar = new pk.c(fileOutputStream);
                    jVar.write(cVar);
                    cVar.flush();
                    long jC = cVar.c();
                    fileOutputStream.close();
                    if (this.f86202b.length() != jC) {
                        throw new d(jC, this.f86202b.length());
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e11) {
                a.this.f86191d.a(jk.a.EnumC1775a.WRITE_UPDATE_FILE_NOT_FOUND, a.f86186f, "updateResource", e11);
                throw e11;
            }
        }

        @Override // kk.f.b
        public ik.a t(Object obj) {
            return a(obj, a.this.f86192e.now());
        }
    }

    private class f implements ok.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f86204a;

        private boolean d(File file) {
            c cVarT = a.this.t(file);
            if (cVarT == null) {
                return false;
            }
            String str = cVarT.f86199a;
            if (str == ".tmp") {
                return e(file);
            }
            pk.k.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.f86192e.now() - a.f86187g;
        }

        @Override // ok.b
        public void a(File file) {
            if (this.f86204a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // ok.b
        public void b(File file) {
            if (!a.this.f86188a.equals(file) && !this.f86204a) {
                file.delete();
            }
            if (this.f86204a && file.equals(a.this.f86190c)) {
                this.f86204a = false;
            }
        }

        @Override // ok.b
        public void c(File file) {
            if (this.f86204a || !file.equals(a.this.f86190c)) {
                return;
            }
            this.f86204a = true;
        }

        private f() {
        }
    }

    public a(File file, int i11, jk.a aVar) {
        pk.k.g(file);
        this.f86188a = file;
        this.f86189b = x(file, aVar);
        this.f86190c = new File(file, w(i11));
        this.f86191d = aVar;
        A();
        this.f86192e = wk.d.a();
    }

    private void A() {
        if (this.f86188a.exists()) {
            if (this.f86190c.exists()) {
                return;
            } else {
                ok.a.b(this.f86188a);
            }
        }
        try {
            FileUtils.a(this.f86190c);
        } catch (FileUtils.CreateDirectoryException unused) {
            this.f86191d.a(jk.a.EnumC1775a.WRITE_CREATE_DIR, f86186f, "version directory could not be created: " + this.f86190c, null);
        }
    }

    private long o(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String r(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String s(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(v(cVar.f86200b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c t(File file) {
        c cVarB = c.b(file);
        if (cVarB != null && u(cVarB.f86200b).equals(file.getParentFile())) {
            return cVarB;
        }
        return null;
    }

    private File u(String str) {
        return new File(v(str));
    }

    private String v(String str) {
        return this.f86190c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String w(int i11) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i11));
    }

    private static boolean x(File file, jk.a aVar) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
                try {
                    return canonicalPath.contains(string);
                } catch (IOException e11) {
                    e = e11;
                    aVar.a(jk.a.EnumC1775a.OTHER, f86186f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e12) {
                e = e12;
                canonicalPath = null;
            }
        } catch (Exception e13) {
            aVar.a(jk.a.EnumC1775a.OTHER, f86186f, "failed to get the external storage directory!", e13);
            return false;
        }
    }

    private void y(File file, String str) throws FileUtils.CreateDirectoryException {
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e11) {
            this.f86191d.a(jk.a.EnumC1775a.WRITE_CREATE_DIR, f86186f, str, e11);
            throw e11;
        }
    }

    private boolean z(String str, boolean z11) {
        File fileP = p(str);
        boolean zExists = fileP.exists();
        if (z11 && zExists) {
            fileP.setLastModified(this.f86192e.now());
        }
        return zExists;
    }

    @Override // kk.f
    public void a() {
        ok.a.a(this.f86188a);
    }

    @Override // kk.f
    public kk.f.b b(String str, Object obj) throws IOException {
        c cVar = new c(".tmp", str);
        File fileU = u(cVar.f86200b);
        if (!fileU.exists()) {
            y(fileU, "insert");
        }
        try {
            return new e(str, cVar.a(fileU));
        } catch (IOException e11) {
            this.f86191d.a(jk.a.EnumC1775a.WRITE_CREATE_TEMPFILE, f86186f, "insert", e11);
            throw e11;
        }
    }

    @Override // kk.f
    public boolean c(String str, Object obj) {
        return z(str, false);
    }

    @Override // kk.f
    public void d() {
        ok.a.c(this.f86188a, new f());
    }

    @Override // kk.f
    public boolean e(String str, Object obj) {
        return z(str, true);
    }

    @Override // kk.f
    public long f(kk.f.a aVar) {
        return o(((b) aVar).b().getCh.qos.logback.core.joran.action.Action.FILE_ATTRIBUTE java.lang.String());
    }

    @Override // kk.f
    public ik.a g(String str, Object obj) {
        File fileP = p(str);
        if (!fileP.exists()) {
            return null;
        }
        fileP.setLastModified(this.f86192e.now());
        return ik.b.c(fileP);
    }

    @Override // kk.f
    public boolean isExternal() {
        return this.f86189b;
    }

    File p(String str) {
        return new File(s(str));
    }

    @Override // kk.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<kk.f.a> getEntries() {
        C1846a c1846a = new C1846a();
        ok.a.c(this.f86190c, c1846a);
        return c1846a.d();
    }

    @Override // kk.f
    public long remove(String str) {
        return o(p(str));
    }
}
