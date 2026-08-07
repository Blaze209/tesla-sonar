package expo.modules.medialibrary.albums.migration;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.MediaLibraryUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/medialibrary/albums/migration/MigrateAlbum;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;", "assetFiles", "", "albumDirName", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "Ljava/util/List;", "Ljava/lang/String;", "Lexpo/modules/kotlin/Promise;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MigrateAlbum {
    private final String albumDirName;
    private final List<MediaLibraryUtils.AssetFile> assetFiles;
    private final Context context;
    private final Promise promise;

    public MigrateAlbum(Context context, List<MediaLibraryUtils.AssetFile> assetFiles, String albumDirName, Promise promise) {
        s.k(context, "context");
        s.k(assetFiles, "assetFiles");
        s.k(albumDirName, "albumDirName");
        s.k(promise, "promise");
        this.context = context;
        this.assetFiles = assetFiles;
        this.albumDirName = albumDirName;
        this.promise = promise;
    }

    public final void execute() throws AlbumException {
        List<MediaLibraryUtils.AssetFile> list = this.assetFiles;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(MediaLibraryUtils.INSTANCE.getRelativePathForAssetType(((MediaLibraryUtils.AssetFile) it.next()).getMimeType(), false));
        }
        Set setR1 = v.r1(arrayList);
        if (setR1.size() > 1) {
            throw new AlbumException("The album contains incompatible file types.");
        }
        String str = setR1.iterator().next() + File.separator + this.albumDirName;
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", str);
        for (MediaLibraryUtils.AssetFile assetFile : this.assetFiles) {
            this.context.getContentResolver().update(ContentUris.withAppendedId(MediaLibraryUtils.INSTANCE.mimeTypeToExternalUri(assetFile.getMimeType()), Long.parseLong(assetFile.getAssetId())), contentValues, null);
        }
        this.promise.resolve((Object) null);
    }
}
