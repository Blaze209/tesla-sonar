package dq0;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class g extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f60837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f60838d;

    public g(a.f fVar, e[] eVarArr, String... strArr) {
        super(fVar);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : d.f60835b;
        Arrays.sort(strArr2);
        this.f60837c = strArr2;
        this.f60838d = s.overrideReadOnly(eVarArr);
    }

    private boolean e(Path path) {
        return Arrays.binarySearch(this.f60837c, Objects.toString(path.getFileName(), null)) < 0;
    }

    @Override // dq0.d
    public FileVisitResult b(Path path, IOException iOException) throws IOException {
        if (q.e(path)) {
            Files.deleteIfExists(path);
        }
        return super.b(path, iOException);
    }

    @Override // dq0.d
    public FileVisitResult d(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (e(path)) {
            LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
            if (Files.exists(path, linkOption)) {
                if (this.f60838d) {
                    q.g(path, false, linkOption);
                }
                Files.deleteIfExists(path);
            }
        }
        c(path, basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    @Override // dq0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f60838d == gVar.f60838d && Arrays.equals(this.f60837c, gVar.f60837c);
    }

    public FileVisitResult f(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        super.preVisitDirectory(path, basicFileAttributes);
        return e(path) ? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
    }

    @Override // dq0.d
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.f60837c)) * 31) + Objects.hash(Boolean.valueOf(this.f60838d));
    }

    @Override // dq0.d, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return b(b.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return f(b.a(obj), basicFileAttributes);
    }

    @Override // dq0.d, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return d(b.a(obj), basicFileAttributes);
    }
}
