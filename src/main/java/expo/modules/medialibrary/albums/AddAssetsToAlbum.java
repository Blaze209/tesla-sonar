package expo.modules.medialibrary.albums;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.PermissionsException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lexpo/modules/medialibrary/albums/AddAssetsToAlbum;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "assetIds", "albumId", "", "copyToAlbum", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;ZLexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "[Ljava/lang/String;", "Ljava/lang/String;", "Lexpo/modules/kotlin/Promise;", "Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "strategy", "Lexpo/modules/medialibrary/albums/AssetFileStrategy;", "Ljava/io/File;", "getAlbum", "()Ljava/io/File;", "album", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddAssetsToAlbum {
    private final String albumId;
    private final String[] assetIds;
    private final Context context;
    private final Promise promise;
    private final AssetFileStrategy strategy;

    public AddAssetsToAlbum(Context context, String[] assetIds, String albumId, boolean z11, Promise promise) {
        s.k(context, "context");
        s.k(assetIds, "assetIds");
        s.k(albumId, "albumId");
        s.k(promise, "promise");
        this.context = context;
        this.assetIds = assetIds;
        this.albumId = albumId;
        this.promise = promise;
        AssetFileStrategy.Companion companion = AssetFileStrategy.INSTANCE;
        this.strategy = z11 ? companion.getCopyStrategy() : companion.getMoveStrategy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1(AtomicInteger atomicInteger, AddAssetsToAlbum addAssetsToAlbum, String str, Uri uri) {
        if (atomicInteger.decrementAndGet() == 0) {
            addAssetsToAlbum.promise.resolve(true);
        }
    }

    private final File getAlbum() {
        return AlbumUtilsKt.getAlbumFile(this.context, this.albumId);
    }

    public final void execute() throws PermissionsException {
        MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
        Context context = this.context;
        String[] strArr = this.assetIds;
        List<MediaLibraryUtils.AssetFile> assetsById = mediaLibraryUtils.getAssetsById(context, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (Build.VERSION.SDK_INT >= 30 && !getAlbum().canWrite()) {
            throw new PermissionsException("The application doesn't have permission to write to the album's directory. For more information, check out https://expo.fyi/android-r.");
        }
        List<MediaLibraryUtils.AssetFile> list = assetsById;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.strategy.apply((MediaLibraryUtils.AssetFile) it.next(), getAlbum(), this.context).getPath());
        }
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        MediaScannerConnection.scanFile(this.context, (String[]) arrayList.toArray(new String[0]), null, new MediaScannerConnection.OnScanCompletedListener() { // from class: expo.modules.medialibrary.albums.a
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri) {
                AddAssetsToAlbum.execute$lambda$1(atomicInteger, this, str, uri);
            }
        });
    }
}
