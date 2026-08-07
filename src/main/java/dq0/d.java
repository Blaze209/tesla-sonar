package dq0;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class d extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String[] f60835b = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.f f60836a;

    public d(a.f fVar) {
        Objects.requireNonNull(fVar, "pathCounter");
        this.f60836a = fVar;
    }

    public a.f a() {
        return this.f60836a;
    }

    public FileVisitResult b(Path path, IOException iOException) {
        this.f60836a.c().a();
        return FileVisitResult.CONTINUE;
    }

    protected void c(Path path, BasicFileAttributes basicFileAttributes) {
        this.f60836a.a().a();
        this.f60836a.b().add(basicFileAttributes.size());
    }

    public FileVisitResult d(Path path, BasicFileAttributes basicFileAttributes) {
        if (Files.exists(path, new LinkOption[0])) {
            c(path, basicFileAttributes);
        }
        return FileVisitResult.CONTINUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Objects.equals(this.f60836a, ((d) obj).f60836a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f60836a);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return b(b.a(obj), iOException);
    }

    public String toString() {
        return this.f60836a.toString();
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return d(b.a(obj), basicFileAttributes);
    }
}
