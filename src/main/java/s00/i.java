package s00;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Ls00/i;", "", "<init>", "()V", "", "imagePath", "Ljn0/h0;", "c", "(Ljava/lang/String;)V", "a", "filePath", "b", "", "Ljava/util/List;", "completedImagePaths", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f109324a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> completedImagePaths = new ArrayList();

    private i() {
    }

    public static final void c(String imagePath) {
        if (imagePath != null) {
            List<String> list = completedImagePaths;
            if (!list.contains(imagePath)) {
                Log.d("MediaCache", "Image path not found in the completedImagePaths list: " + imagePath);
                return;
            }
            list.remove(imagePath);
            if (t.b0(imagePath, "file://", false, 2, null)) {
                imagePath = imagePath.substring(7);
                s.j(imagePath, "substring(...)");
            }
            File file = new File(imagePath);
            if (!file.exists()) {
                Log.d("MediaCache", "Image file not found: " + imagePath);
                return;
            }
            if (file.delete()) {
                Log.d("MediaCache", "Successfully deleted image file: " + imagePath);
                return;
            }
            Log.d("MediaCache", "Failed to delete image file: " + imagePath);
        }
    }

    public final void a(String imagePath) {
        if (imagePath != null) {
            completedImagePaths.add(imagePath);
            Log.d("MediaCache", "Successfully added image path: " + imagePath);
        }
    }

    public final void b(String filePath) {
        s.k(filePath, "filePath");
        File file = new File(t.V(filePath, "file://", "", false, 4, null));
        if (!file.exists()) {
            System.out.println((Object) "File not found.");
        } else if (file.delete()) {
            System.out.println((Object) "File deleted successfully.");
        } else {
            System.out.println((Object) "File couldn't be deleted.");
        }
    }
}
