package expo.modules.imagemanipulator;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lexpo/modules/imagemanipulator/FileUtils;", "", "<init>", "()V", "generateRandomOutputPath", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "imageFormat", "Lexpo/modules/imagemanipulator/ImageFormat;", "ensureDirExists", "Ljava/io/File;", "dir", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {
    }

    private final File ensureDirExists(File dir) throws ImageWriteFailedException {
        if (dir.isDirectory() || dir.mkdirs()) {
            return dir;
        }
        String path = dir.getPath();
        s.j(path, "getPath(...)");
        throw new ImageWriteFailedException(path);
    }

    public final String generateRandomOutputPath(Context context, ImageFormat imageFormat) throws ImageWriteFailedException {
        s.k(context, "context");
        s.k(imageFormat, "imageFormat");
        File cacheDir = context.getCacheDir();
        String str = File.separator;
        File file = new File(cacheDir + str + "ImageManipulator");
        ensureDirExists(file);
        return file + str + UUID.randomUUID() + imageFormat.getFileExtension();
    }
}
