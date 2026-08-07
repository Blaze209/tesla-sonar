package sn0;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.g0;
import p013kotlin.collections.v;
import p013kotlin.io.FileAlreadyExistsException;
import p013kotlin.io.FileSystemException;
import p013kotlin.io.NoSuchFileException;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0004\u001a-\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001f*\b\u0012\u0004\u0012\u00020\u00000\u001fH\u0002¢\u0006\u0004\b \u0010!\"\u0015\u0010$\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010&\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Ljava/io/File;", "base", "", "J", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", "G", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "K", "target", "", "overwrite", "", "bufferSize", "z", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lsn0/p;", "onError", "w", "(Ljava/io/File;Ljava/io/File;ZLwn0/p;)Z", "B", "(Ljava/io/File;)Z", "other", "H", "(Ljava/io/File;Ljava/io/File;)Z", "I", "(Ljava/io/File;Ljava/lang/String;)Z", "Lsn0/e;", Gender.FEMALE, "(Lsn0/e;)Lsn0/e;", "", "E", "(Ljava/util/List;)Ljava/util/List;", "C", "(Ljava/io/File;)Ljava/lang/String;", "extension", "D", "nameWithoutExtension", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class n extends l {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f111477a = new a();

        a() {
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(File file, IOException exception) throws IOException {
            s.k(file, "<unused var>");
            s.k(exception, "exception");
            throw exception;
        }
    }

    public static /* synthetic */ File A(File file, File file2, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = PKIFailureInfo.certRevoked;
        }
        return z(file, file2, z11, i11);
    }

    public static boolean B(File file) {
        s.k(file, "<this>");
        while (true) {
            boolean z11 = true;
            for (File file2 : l.t(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z11) {
                    }
                }
                z11 = false;
            }
            return z11;
        }
    }

    public static String C(File file) {
        s.k(file, "<this>");
        String name = file.getName();
        s.j(name, "getName(...)");
        return t.s1(name, CoreConstants.DOT, "");
    }

    public static String D(File file) {
        s.k(file, "<this>");
        String name = file.getName();
        s.j(name, "getName(...)");
        return t.D1(name, ".", null, 2, null);
    }

    private static final List<File> E(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!s.f(name, ".")) {
                if (!s.f(name, CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || s.f(((File) v.A0(arrayList)).getName(), CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final FilePathComponents F(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.getRoot(), E(filePathComponents.b()));
    }

    public static File G(File file, File base) {
        s.k(file, "<this>");
        s.k(base, "base");
        return new File(J(file, base));
    }

    public static final boolean H(File file, File other) {
        s.k(file, "<this>");
        s.k(other, "other");
        FilePathComponents filePathComponentsB = i.b(file);
        FilePathComponents filePathComponentsB2 = i.b(other);
        if (s.f(filePathComponentsB.getRoot(), filePathComponentsB2.getRoot()) && filePathComponentsB.c() >= filePathComponentsB2.c()) {
            return filePathComponentsB.b().subList(0, filePathComponentsB2.c()).equals(filePathComponentsB2.b());
        }
        return false;
    }

    public static boolean I(File file, String other) {
        s.k(file, "<this>");
        s.k(other, "other");
        return H(file, new File(other));
    }

    public static final String J(File file, File base) throws IOException {
        s.k(file, "<this>");
        s.k(base, "base");
        String strK = K(file, base);
        if (strK != null) {
            return strK;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + CoreConstants.DOT);
    }

    private static final String K(File file, File file2) throws IOException {
        FilePathComponents filePathComponentsF = F(i.b(file));
        FilePathComponents filePathComponentsF2 = F(i.b(file2));
        if (!s.f(filePathComponentsF.getRoot(), filePathComponentsF2.getRoot())) {
            return null;
        }
        int iC = filePathComponentsF2.c();
        int iC2 = filePathComponentsF.c();
        int iMin = Math.min(iC2, iC);
        int i11 = 0;
        while (i11 < iMin && s.f(filePathComponentsF.b().get(i11), filePathComponentsF2.b().get(i11))) {
            i11++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = iC - 1;
        if (i11 <= i12) {
            while (!s.f(filePathComponentsF2.b().get(i12).getName(), CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
                if (i12 != i11) {
                    sb2.append(File.separatorChar);
                }
                if (i12 != i11) {
                    i12--;
                }
            }
            return null;
        }
        if (i11 < iC2) {
            if (i11 < iC) {
                sb2.append(File.separatorChar);
            }
            List listI0 = v.i0(filePathComponentsF.b(), i11);
            String separator = File.separator;
            s.j(separator, "separator");
            g0.v0(listI0, sb2, (124 & 2) != 0 ? ", " : separator, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb2.toString();
    }

    public static final boolean w(File file, File target, boolean z11, final wn0.p<? super File, ? super IOException, ? extends p> onError) {
        s.k(file, "<this>");
        s.k(target, "target");
        s.k(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != p.TERMINATE;
        }
        try {
            for (File file2 : l.u(file).h(new wn0.p() { // from class: sn0.m
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return n.y(onError, (File) obj, (IOException) obj2);
                }
            })) {
                if (file2.exists()) {
                    File file3 = new File(target, J(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z11) {
                            if (file3.isDirectory()) {
                                if (!B(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError.invoke(file3, new FileAlreadyExistsException(file2, file3, "The destination file already exists.")) == p.TERMINATE) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z12 = z11;
                        if (A(file2, file3, z12, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == p.TERMINATE) {
                            return false;
                        }
                        z11 = z12;
                    }
                } else {
                    if (onError.invoke(file2, new NoSuchFileException(file2, null, "The source file doesn't exist.", 2, null)) == p.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (q unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean x(File file, File file2, boolean z11, wn0.p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            pVar = a.f111477a;
        }
        return w(file, file2, z11, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 y(wn0.p pVar, File f11, IOException e11) throws q {
        s.k(f11, "f");
        s.k(e11, "e");
        if (pVar.invoke(f11, e11) != p.TERMINATE) {
            return h0.f84049a;
        }
        throw new q(f11);
    }

    public static final File z(File file, File target, boolean z11, int i11) throws FileSystemException {
        s.k(file, "<this>");
        s.k(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z11) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                sn0.a.a(fileInputStream, fileOutputStream, i11);
                b.a(fileOutputStream, null);
                b.a(fileInputStream, null);
                return target;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(fileInputStream, th4);
                throw th5;
            }
        }
    }
}
