package expo.modules.medialibrary.albums;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.MediaLibraryUtils;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/medialibrary/albums/CreateAlbum;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "albumName", "assetId", "", "copyAsset", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "Ljava/lang/String;", "Lexpo/modules/kotlin/Promise;", "Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "mStrategy", "Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateAlbum {
    private final String albumName;
    private final String assetId;
    private final Context context;
    private final AssetFileStrategy mStrategy;
    private final Promise promise;

    public CreateAlbum(Context context, String albumName, String assetId, boolean z11, Promise promise) {
        s.k(context, "context");
        s.k(albumName, "albumName");
        s.k(assetId, "assetId");
        s.k(promise, "promise");
        this.context = context;
        this.albumName = albumName;
        this.assetId = assetId;
        this.promise = promise;
        AssetFileStrategy.Companion companion = AssetFileStrategy.INSTANCE;
        this.mStrategy = z11 ? companion.getCopyStrategy() : companion.getMoveStrategy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(CreateAlbum createAlbum, String path, Uri uri) throws AlbumException {
        s.k(path, "path");
        if (uri == null) {
            throw new AlbumException("Could not add image to album.");
        }
        AlbumUtilsKt.queryAlbum(createAlbum.context, "_data=?", new String[]{path}, createAlbum.promise);
    }

    public final void execute() throws AlbumException, AssetFileException {
        try {
            MediaLibraryUtils.AssetFile assetFile = MediaLibraryUtils.INSTANCE.getAssetsById(this.context, this.assetId).get(0);
            MediaScannerConnection.scanFile(this.context, new String[]{this.mStrategy.apply(assetFile, AlbumUtilsKt.createAlbumFile(assetFile.getMimeType(), this.albumName), this.context).getPath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: expo.modules.medialibrary.albums.d
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri) throws AlbumException {
                    CreateAlbum.execute$lambda$0(this.f63413a, str, uri);
                }
            });
        } catch (IOException e11) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD, "Could not read file or parse EXIF tags", e11);
        } catch (SecurityException e12) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not create album: need WRITE_EXTERNAL_STORAGE permission.", e12);
        }
    }
}
