package expo.modules.core.logging;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import sn0.h;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0013J3\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010$\u001a\u00020\b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u001a2\u001a\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\b2\u001a\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lexpo/modules/core/logging/PersistentFileLog;", "", "", "category", "Ljava/io/File;", "filesDirectory", "<init>", "(Ljava/lang/String;Ljava/io/File;)V", "Ljn0/h0;", "ensureFileExists", "()V", "", "getFileSize", "()J", "text", "appendTextToFile", "(Ljava/lang/String;)V", "", "readFileLinesSync", "()Ljava/util/List;", "entries", "writeFileLinesSync", "(Ljava/util/List;)V", "deleteFileSync", "readEntries", "entry", "Lkotlin/Function1;", "Ljava/lang/Error;", "Lkotlin/Error;", "completionHandler", "appendEntry", "(Ljava/lang/String;Lwn0/l;)V", "", "filter", "Ljava/lang/Exception;", "Lkotlin/Exception;", "purgeEntriesNotMatchingFilter", "(Lwn0/l;Lwn0/l;)V", "clearEntries", "(Lwn0/l;)V", "filePath", "Ljava/lang/String;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersistentFileLog {
    private static final String FILE_NAME_PREFIX = "dev.expo.modules.core.logging";
    private final String filePath;
    private static final PersistentFileLogSerialDispatchQueue queue = new PersistentFileLogSerialDispatchQueue();

    public PersistentFileLog(String category, File filesDirectory) {
        s.k(category, "category");
        s.k(filesDirectory, "filesDirectory");
        this.filePath = filesDirectory.getPath() + "/dev.expo.modules.core.logging." + category;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void appendEntry$default(PersistentFileLog persistentFileLog, String str, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new l() { // from class: expo.modules.core.logging.a
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return PersistentFileLog.appendEntry$lambda$0((Error) obj2);
                }
            };
        }
        persistentFileLog.appendEntry(str, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 appendEntry$lambda$0(Error error) {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 appendEntry$lambda$1(PersistentFileLog persistentFileLog, String str, l lVar) {
        try {
            persistentFileLog.ensureFileExists();
            if (persistentFileLog.getFileSize() != 0) {
                str = "\n" + str;
            }
            persistentFileLog.appendTextToFile(str);
            lVar.invoke(null);
        } catch (IOException e11) {
            lVar.invoke(new Error(e11));
        } catch (Error e12) {
            lVar.invoke(e12);
        }
        return h0.f84049a;
    }

    private final void appendTextToFile(String text) {
        File file = new File(this.filePath);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        s.j(charsetDefaultCharset, "defaultCharset(...)");
        h.d(file, text, charsetDefaultCharset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 clearEntries$lambda$3(PersistentFileLog persistentFileLog, l lVar) {
        try {
            persistentFileLog.deleteFileSync();
            lVar.invoke(null);
        } catch (Error e11) {
            lVar.invoke(e11);
        }
        return h0.f84049a;
    }

    private final void deleteFileSync() {
        File file = new File(this.filePath);
        if (file.exists()) {
            file.delete();
        }
    }

    private final void ensureFileExists() throws IOException {
        File file = new File(this.filePath);
        if (file.exists() || file.createNewFile()) {
            return;
        }
        throw new IOException("Unable to create file at path " + this.filePath);
    }

    private final long getFileSize() {
        File file = new File(this.filePath);
        if (!file.exists()) {
            return 0L;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                long size = fileInputStream.getChannel().size();
                sn0.b.a(fileInputStream, null);
                return size;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 purgeEntriesNotMatchingFilter$lambda$2(PersistentFileLog persistentFileLog, l lVar, l lVar2) {
        try {
            persistentFileLog.ensureFileExists();
            List<String> fileLinesSync = persistentFileLog.readFileLinesSync();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fileLinesSync) {
                if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            persistentFileLog.writeFileLinesSync(arrayList);
            lVar2.invoke(null);
        } catch (Throwable th2) {
            lVar2.invoke(new Exception(th2));
        }
        return h0.f84049a;
    }

    private final List<String> readFileLinesSync() {
        File file = new File(this.filePath);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        s.j(charsetDefaultCharset, "defaultCharset(...)");
        List<String> listJ = h.j(file, charsetDefaultCharset);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void writeFileLinesSync(List<String> entries) {
        File file = new File(this.filePath);
        String strY0 = v.y0(entries, "\n", null, null, 0, null, null, 62, null);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        s.j(charsetDefaultCharset, "defaultCharset(...)");
        h.p(file, strY0, charsetDefaultCharset);
    }

    public final void appendEntry(final String entry, final l<? super Error, h0> completionHandler) {
        s.k(entry, "entry");
        s.k(completionHandler, "completionHandler");
        queue.add(new wn0.a() { // from class: expo.modules.core.logging.d
            @Override // wn0.a
            public final Object invoke() {
                return PersistentFileLog.appendEntry$lambda$1(this.f63291a, entry, completionHandler);
            }
        });
    }

    public final void clearEntries(final l<? super Error, h0> completionHandler) {
        s.k(completionHandler, "completionHandler");
        queue.add(new wn0.a() { // from class: expo.modules.core.logging.c
            @Override // wn0.a
            public final Object invoke() {
                return PersistentFileLog.clearEntries$lambda$3(this.f63289a, completionHandler);
            }
        });
    }

    public final void purgeEntriesNotMatchingFilter(final l<? super String, Boolean> filter, final l<? super Exception, h0> completionHandler) {
        s.k(filter, "filter");
        s.k(completionHandler, "completionHandler");
        queue.add(new wn0.a() { // from class: expo.modules.core.logging.b
            @Override // wn0.a
            public final Object invoke() {
                return PersistentFileLog.purgeEntriesNotMatchingFilter$lambda$2(this.f63286a, filter, completionHandler);
            }
        });
    }

    public final List<String> readEntries() {
        return 0 == getFileSize() ? v.m() : readFileLinesSync();
    }
}
