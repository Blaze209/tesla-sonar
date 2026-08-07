package kk;

import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import pk.n;

/* JADX INFO: loaded from: classes3.dex */
public class h implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class<?> f86259f = h.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f86260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<File> f86261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f86262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jk.a f86263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile a f86264e = new a(null, null);

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f86265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f86266b;

        a(File file, f fVar) {
            this.f86265a = fVar;
            this.f86266b = file;
        }
    }

    public h(int i11, n<File> nVar, String str, jk.a aVar) {
        this.f86260a = i11;
        this.f86263d = aVar;
        this.f86261b = nVar;
        this.f86262c = str;
    }

    private void i() throws FileUtils.CreateDirectoryException {
        File file = new File(this.f86261b.get(), this.f86262c);
        h(file);
        this.f86264e = new a(file, new kk.a(file, this.f86260a, this.f86263d));
    }

    private boolean l() {
        File file;
        a aVar = this.f86264e;
        return aVar.f86265a == null || (file = aVar.f86266b) == null || !file.exists();
    }

    @Override // kk.f
    public void a() {
        k().a();
    }

    @Override // kk.f
    public f.b b(String str, Object obj) {
        return k().b(str, obj);
    }

    @Override // kk.f
    public boolean c(String str, Object obj) {
        return k().c(str, obj);
    }

    @Override // kk.f
    public void d() {
        try {
            k().d();
        } catch (IOException e11) {
            qk.a.j(f86259f, "purgeUnexpectedResources", e11);
        }
    }

    @Override // kk.f
    public boolean e(String str, Object obj) {
        return k().e(str, obj);
    }

    @Override // kk.f
    public long f(f.a aVar) {
        return k().f(aVar);
    }

    @Override // kk.f
    public ik.a g(String str, Object obj) {
        return k().g(str, obj);
    }

    @Override // kk.f
    public Collection<f.a> getEntries() {
        return k().getEntries();
    }

    void h(File file) throws FileUtils.CreateDirectoryException {
        try {
            FileUtils.a(file);
            qk.a.a(f86259f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e11) {
            this.f86263d.a(jk.a.EnumC1775a.WRITE_CREATE_DIR, f86259f, "createRootDirectoryIfNecessary", e11);
            throw e11;
        }
    }

    @Override // kk.f
    public boolean isExternal() {
        try {
            return k().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    void j() {
        if (this.f86264e.f86265a == null || this.f86264e.f86266b == null) {
            return;
        }
        ok.a.b(this.f86264e.f86266b);
    }

    synchronized f k() {
        try {
            if (l()) {
                j();
                i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (f) pk.k.g(this.f86264e.f86265a);
    }

    @Override // kk.f
    public long remove(String str) {
        return k().remove(str);
    }
}
