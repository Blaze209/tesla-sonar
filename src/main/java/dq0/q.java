package dq0;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e[] f60839a = new e[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FileVisitOption[] f60840b = new FileVisitOption[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkOption[] f60841c = new LinkOption[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final OpenOption[] f60842d = new OpenOption[0];

    public static a.f a(Path path) {
        return b(path, f60839a);
    }

    public static a.f b(Path path, e... eVarArr) {
        return Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS) ? c(path, eVarArr) : d(path, eVarArr);
    }

    public static a.f c(Path path, e... eVarArr) {
        return ((g) h(new g(a.b(), eVarArr, new String[0]), path)).a();
    }

    public static a.f d(Path path, e... eVarArr) throws NoSuchFileException {
        LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
        if (Files.isDirectory(path, linkOption)) {
            i.a();
            throw h.a(path.toString());
        }
        a.f fVarB = a.b();
        boolean zExists = Files.exists(path, linkOption);
        long size = zExists ? Files.size(path) : 0L;
        if (f(eVarArr) && zExists) {
            g(path, false, linkOption);
        }
        if (Files.deleteIfExists(path)) {
            fVarB.a().a();
            fVarB.b().add(size);
        }
        return fVarB;
    }

    public static boolean e(Path path) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
        try {
            if (directoryStreamNewDirectoryStream.iterator().hasNext()) {
                directoryStreamNewDirectoryStream.close();
                return false;
            }
            directoryStreamNewDirectoryStream.close();
            return true;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    private static boolean f(e[] eVarArr) {
        if (eVarArr == null) {
            return false;
        }
        for (e eVar : eVarArr) {
            if (eVar == s.OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }

    public static Path g(Path path, boolean z11, LinkOption... linkOptionArr) {
        DosFileAttributeView dosFileAttributeViewA = k.a(Files.getFileAttributeView(path, j.a(), linkOptionArr));
        if (dosFileAttributeViewA != null) {
            dosFileAttributeViewA.setReadOnly(z11);
            return path;
        }
        PosixFileAttributeView posixFileAttributeViewA = m.a(Files.getFileAttributeView(path, l.a(), linkOptionArr));
        if (posixFileAttributeViewA == null) {
            throw new IOException("No DosFileAttributeView or PosixFileAttributeView for " + path);
        }
        Set<PosixFilePermission> setPermissions = posixFileAttributeViewA.readAttributes().permissions();
        setPermissions.remove(PosixFilePermission.OWNER_WRITE);
        setPermissions.remove(PosixFilePermission.GROUP_WRITE);
        setPermissions.remove(PosixFilePermission.OTHERS_WRITE);
        return Files.setPosixFilePermissions(path, setPermissions);
    }

    public static <T extends FileVisitor<? super Path>> T h(T t11, Path path) throws IOException {
        Files.walkFileTree(path, t11);
        return t11;
    }
}
