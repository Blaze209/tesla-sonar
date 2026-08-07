package pg0;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/graphics/Bitmap;", "Lfi0/c;", "sdkFilesManager", "Ljava/io/File;", "a", "(Landroid/graphics/Bitmap;Lfi0/c;)Ljava/io/File;", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r0 {
    public static final File a(Bitmap bitmap, fi0.c sdkFilesManager) {
        p013kotlin.jvm.internal.s.k(bitmap, "<this>");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        File fileD = sdkFilesManager.d("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileD);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            sn0.b.a(fileOutputStream, null);
            return fileD;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }
}
