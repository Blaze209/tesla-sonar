package expo.modules.medialibrary.albums;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.contacts.Columns;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.MediaLibraryException;
import expo.modules.medialibrary.MediaLibraryUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "selection", "", "selectionArgs", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "queryAlbum", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", "albumIds", "", "getAssetsInAlbums", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "Ljava/io/File;", "getFileOrNullByContextResolver", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)Ljava/io/File;", "albumName", "getAlbumFileByNameOrNull", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "albumId", "getAlbumFileOrNull", "getAlbumFile", "mimeType", "createAlbumFile", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "expo-media-library_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AlbumUtilsKt {
    public static final File createAlbumFile(String mimeType, String albumName) throws AlbumException, AssetFileException {
        s.k(mimeType, "mimeType");
        s.k(albumName, "albumName");
        File envDirectoryForAssetType = MediaLibraryUtils.INSTANCE.getEnvDirectoryForAssetType(mimeType, false);
        if (envDirectoryForAssetType == null) {
            throw new AssetFileException("Could not guess asset type.");
        }
        File file = new File(envDirectoryForAssetType.getPath(), albumName);
        if (!file.exists() && !file.mkdirs()) {
            file = null;
        }
        if (file != null) {
            return file;
        }
        throw new AlbumException("Could not create album directory.");
    }

    public static final File getAlbumFile(Context context, String albumId) throws AlbumException {
        s.k(context, "context");
        s.k(albumId, "albumId");
        File albumFileOrNull = getAlbumFileOrNull(context, albumId);
        if (albumFileOrNull != null) {
            return albumFileOrNull;
        }
        throw new AlbumException("Could not get album. Query returns null.");
    }

    public static final File getAlbumFileByNameOrNull(Context context, String albumName) {
        s.k(context, "context");
        s.k(albumName, "albumName");
        return getFileOrNullByContextResolver(context, "media_type != 0 AND bucket_display_name=?", new String[]{albumName});
    }

    public static final File getAlbumFileOrNull(Context context, String albumId) {
        s.k(context, "context");
        s.k(albumId, "albumId");
        return getFileOrNullByContextResolver(context, "bucket_id=?", new String[]{albumId});
    }

    public static final List<String> getAssetsInAlbums(Context context, String... albumIds) {
        s.k(context, "context");
        s.k(albumIds, "albumIds");
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{Columns.ID}, "bucket_id IN (" + MediaLibraryUtils.INSTANCE.queryPlaceholdersFor(albumIds) + " )", albumIds, null);
        if (cursorQuery == null) {
            sn0.b.a(cursorQuery, null);
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex(Columns.ID));
                s.h(string);
                arrayList.add(string);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        h0 h0Var = h0.f84049a;
        sn0.b.a(cursorQuery, null);
        return arrayList;
    }

    public static final File getFileOrNullByContextResolver(Context context, String selection, String[] selectionArgs) {
        s.k(context, "context");
        s.k(selection, "selection");
        s.k(selectionArgs, "selectionArgs");
        Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_data"}, selection, selectionArgs, null);
        try {
            if (cursorQuery == null) {
                throw new AlbumException("Could not get album. Query returns null.");
            }
            if (cursorQuery.getCount() == 0) {
                sn0.b.a(cursorQuery, null);
                return null;
            }
            cursorQuery.moveToNext();
            File file = new File(cursorQuery.getString(cursorQuery.getColumnIndex("_data")));
            if (!file.isFile() && !file.isDirectory()) {
                throw new MediaLibraryException();
            }
            String parent = file.getParent();
            s.h(parent);
            File file2 = new File(parent);
            sn0.b.a(cursorQuery, null);
            return file2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    public static final void queryAlbum(Context context, String selection, String[] strArr, Promise promise) {
        s.k(context, "context");
        s.k(selection, "selection");
        s.k(promise, "promise");
        try {
            Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"bucket_id", "bucket_display_name"}, selection, strArr, "bucket_display_name");
            try {
                if (cursorQuery == null) {
                    throw new AlbumException("Could not get album. Query is incorrect.");
                }
                if (!cursorQuery.moveToNext()) {
                    promise.resolve((Object) null);
                    sn0.b.a(cursorQuery, null);
                    return;
                }
                int columnIndex = cursorQuery.getColumnIndex("bucket_id");
                int columnIndex2 = cursorQuery.getColumnIndex("bucket_display_name");
                Bundle bundle = new Bundle();
                bundle.putString("id", cursorQuery.getString(columnIndex));
                bundle.putString("title", cursorQuery.getString(columnIndex2));
                bundle.putInt("assetCount", cursorQuery.getCount());
                promise.resolve(bundle);
                h0 h0Var = h0.f84049a;
                sn0.b.a(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(cursorQuery, th2);
                    throw th3;
                }
            }
        } catch (IllegalArgumentException e11) {
            promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD, "Could not get album.", e11);
        } catch (SecurityException e12) {
            promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get albums: need READ_EXTERNAL_STORAGE permission.", e12);
        }
    }
}
