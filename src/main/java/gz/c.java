package gz;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.Address;
import dz.v0;
import java.io.File;
import java.io.FileOutputStream;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgz/c;", "", "a", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: gz.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgz/c$a;", "", "<init>", "()V", "", "path", "Ljava/io/File;", "a", "(Ljava/lang/String;)Ljava/io/File;", "Landroid/graphics/Bitmap;", "bitmap", Action.FILE_ATTRIBUTE, "", "quality", "Ljn0/h0;", "c", "(Landroid/graphics/Bitmap;Ljava/io/File;I)V", "imagePath", "Landroid/util/Size;", "b", "(Ljava/lang/String;)Landroid/util/Size;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final File a(String path) throws v0 {
            if (path == null) {
                throw new v0(Address.ADDRESS_NULL_PLACEHOLDER);
            }
            File file = new File(path);
            if (file.isDirectory()) {
                return file;
            }
            throw new v0(path);
        }

        public final Size b(String imagePath) {
            s.k(imagePath, "imagePath");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(imagePath, options);
            return new Size(options.outWidth, options.outHeight);
        }

        public final void c(Bitmap bitmap, File file, int quality) {
            s.k(bitmap, "bitmap");
            s.k(file, "file");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, quality, fileOutputStream);
                sn0.b.a(fileOutputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        }

        private Companion() {
        }
    }
}
