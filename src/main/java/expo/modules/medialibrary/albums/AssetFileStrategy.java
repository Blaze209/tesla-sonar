package expo.modules.medialibrary.albums;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import ch.qos.logback.core.CoreConstants;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.MediaLibraryUtils;
import java.io.File;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "", "apply", "Ljava/io/File;", "src", "dir", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AssetFileStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;", "", "<init>", "()V", "copyStrategy", "Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "getCopyStrategy", "()Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "moveStrategy", "getMoveStrategy", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AssetFileStrategy copyStrategy = new AssetFileStrategy() { // from class: expo.modules.medialibrary.albums.b
            @Override // expo.modules.medialibrary.albums.AssetFileStrategy
            public final File apply(File file, File file2, Context context) {
                return AssetFileStrategy.Companion.copyStrategy$lambda$0(file, file2, context);
            }
        };
        private static final AssetFileStrategy moveStrategy = new AssetFileStrategy() { // from class: expo.modules.medialibrary.albums.c
            @Override // expo.modules.medialibrary.albums.AssetFileStrategy
            public final File apply(File file, File file2, Context context) {
                return AssetFileStrategy.Companion.moveStrategy$lambda$1(file, file2, context);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File copyStrategy$lambda$0(File src, File dir, Context context) {
            s.k(src, "src");
            s.k(dir, "dir");
            s.k(context, "<unused var>");
            return MediaLibraryUtils.INSTANCE.safeCopyFile(src, dir);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File moveStrategy$lambda$1(File src, File dir, Context context) throws IOException {
            s.k(src, "src");
            s.k(dir, "dir");
            s.k(context, "context");
            if (Build.VERSION.SDK_INT < 30 || !(src instanceof MediaLibraryUtils.AssetFile)) {
                File fileSafeMoveFile = MediaLibraryUtils.INSTANCE.safeMoveFile(src, dir);
                context.getContentResolver().delete(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), "_data=?", new String[]{src.getPath()});
                return fileSafeMoveFile;
            }
            MediaLibraryUtils.AssetFile assetFile = (MediaLibraryUtils.AssetFile) src;
            String assetId = assetFile.getAssetId();
            Uri uriWithAppendedId = t.b0(assetFile.getMimeType(), MediaStreamTrack.VIDEO_TRACK_KIND, false, 2, null) ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, Long.parseLong(assetId)) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(assetId));
            s.h(uriWithAppendedId);
            File fileSafeCopyFile = MediaLibraryUtils.INSTANCE.safeCopyFile(src, dir);
            context.getContentResolver().delete(uriWithAppendedId, null);
            return fileSafeCopyFile;
        }

        public final AssetFileStrategy getCopyStrategy() {
            return copyStrategy;
        }

        public final AssetFileStrategy getMoveStrategy() {
            return moveStrategy;
        }
    }

    File apply(File src, File dir, Context context);
}
