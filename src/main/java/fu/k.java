package fu;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f66595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f66596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ZipFile f66597c;

    k(o oVar, Set set, u uVar, ZipFile zipFile) {
        this.f66595a = set;
        this.f66596b = uVar;
        this.f66597c = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // fu.m
    public final void a(n nVar, File file, boolean z11) throws IllegalAccessException, IOException, InvocationTargetException {
        this.f66595a.add(file);
        if (z11) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f66596b.b(), nVar.f66598a, this.f66596b.a().getAbsolutePath(), nVar.f66599b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f66597c;
        ZipEntry zipEntry = nVar.f66599b;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                f.m(file);
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i11);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th5;
        }
    }
}
