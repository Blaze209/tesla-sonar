package ae0;

import android.net.Uri;
import com.tesla.logging.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lae0/b;", "", "<init>", "()V", "", "Landroid/net/Uri;", "uris", "Ljava/io/File;", "zipFile", "Ljn0/h0;", "a", "(Ljava/util/List;Ljava/io/File;)V", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f985a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("ZipUtil");

    private b() {
    }

    public final void a(List<? extends Uri> uris, File zipFile) {
        s.k(uris, "uris");
        s.k(zipFile, "zipFile");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(zipFile);
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
            byte[] bArr = new byte[512];
            int size = uris.size();
            for (int i11 = 0; i11 < size; i11++) {
                File fileA = p5.b.a(uris.get(i11));
                String name = fileA.getName();
                logger.j("Compressing: " + name + " and writing to " + zipFile);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileA), 512);
                zipOutputStream.putNextEntry(new ZipEntry(i11 + "." + name));
                while (true) {
                    int i12 = bufferedInputStream.read(bArr, 0, 512);
                    if (i12 != -1) {
                        zipOutputStream.write(bArr, 0, i12);
                    }
                }
                bufferedInputStream.close();
            }
            zipOutputStream.close();
            fileOutputStream.close();
            logger.j("Finished zipping to file: " + zipFile);
        } catch (Exception e11) {
            logger.f("Error zipping", e11);
        }
    }
}
