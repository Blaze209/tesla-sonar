package expo.modules.medialibrary.assets;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AssetException;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.ContentEntryException;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.MediaLibraryUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.b;
import sn0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "uri", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "resolveWithAdditionalData", "Ljava/io/File;", "albumFile", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lexpo/modules/kotlin/Promise;ZLjava/io/File;)V", "Landroid/net/Uri;", "normalizeAssetUri", "(Ljava/lang/String;)Landroid/net/Uri;", "createContentResolverAssetEntry", "()Landroid/net/Uri;", "localFile", "assetUri", "Ljn0/h0;", "writeFileContentsToAsset", "(Ljava/io/File;Landroid/net/Uri;)V", "createAssetUsingContentResolver", "()V", "createAssetFileLegacy", "(Ljava/io/File;)Ljava/io/File;", "execute", "Landroid/content/Context;", "Lexpo/modules/kotlin/Promise;", "Z", "Ljava/io/File;", "mUri", "Landroid/net/Uri;", "isFileExtensionPresent", "()Z", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateAssetWithAlbumFile {
    private final File albumFile;
    private final Context context;
    private final Uri mUri;
    private final Promise promise;
    private final boolean resolveWithAdditionalData;

    public CreateAssetWithAlbumFile(Context context, String uri, Promise promise, boolean z11, File file) {
        s.k(context, "context");
        s.k(uri, "uri");
        s.k(promise, "promise");
        this.context = context;
        this.promise = promise;
        this.resolveWithAdditionalData = z11;
        this.albumFile = file;
        this.mUri = normalizeAssetUri(uri);
    }

    private final File createAssetFileLegacy(File albumFile) throws IOException, AssetFileException {
        String path = this.mUri.getPath();
        s.h(path);
        File file = new File(path);
        MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
        ContentResolver contentResolver = this.context.getContentResolver();
        s.j(contentResolver, "getContentResolver(...)");
        String mimeType = mediaLibraryUtils.getMimeType(contentResolver, this.mUri);
        if (mimeType == null) {
            throw new AssetFileException("Could not guess file type.");
        }
        if (albumFile == null) {
            albumFile = mediaLibraryUtils.getEnvDirectoryForAssetType(mimeType, true);
        }
        File fileSafeCopyFile = mediaLibraryUtils.safeCopyFile(file, albumFile);
        if (albumFile.exists() && fileSafeCopyFile.isFile()) {
            return fileSafeCopyFile;
        }
        throw new AssetFileException("Could not create asset record. Related file does not exist.");
    }

    static /* synthetic */ File createAssetFileLegacy$default(CreateAssetWithAlbumFile createAssetWithAlbumFile, File file, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = null;
        }
        return createAssetWithAlbumFile.createAssetFileLegacy(file);
    }

    private final void createAssetUsingContentResolver() throws ContentEntryException {
        Uri uriCreateContentResolverAssetEntry = createContentResolverAssetEntry();
        if (uriCreateContentResolverAssetEntry == null) {
            throw new ContentEntryException();
        }
        String path = this.mUri.getPath();
        s.h(path);
        writeFileContentsToAsset(new File(path), uriCreateContentResolverAssetEntry);
        if (!this.resolveWithAdditionalData) {
            this.promise.resolve((Object) null);
        } else {
            AssetUtilsKt.queryAssetInfo(this.context, "_id=?", new String[]{String.valueOf(ContentUris.parseId(uriCreateContentResolverAssetEntry))}, false, this.promise);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    private final Uri createContentResolverAssetEntry() {
        String relativePathForAssetType;
        ContentResolver contentResolver = this.context.getContentResolver();
        MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
        s.h(contentResolver);
        String mimeType = mediaLibraryUtils.getMimeType(contentResolver, this.mUri);
        String lastPathSegment = this.mUri.getLastPathSegment();
        File file = this.albumFile;
        if (file != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            s.j(externalStorageDirectory, "getExternalStorageDirectory(...)");
            File fileG = h.G(file, externalStorageDirectory);
            if (fileG == null || (relativePathForAssetType = fileG.getPath()) == null) {
                relativePathForAssetType = mediaLibraryUtils.getRelativePathForAssetType(mimeType, true);
            }
        } else {
            relativePathForAssetType = mediaLibraryUtils.getRelativePathForAssetType(mimeType, true);
        }
        Uri uriMimeTypeToExternalUri = mediaLibraryUtils.mimeTypeToExternalUri(mimeType);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", lastPathSegment);
        contentValues.put("mime_type", mimeType);
        contentValues.put("relative_path", relativePathForAssetType);
        contentValues.put("is_pending", (Integer) 1);
        return contentResolver.insert(uriMimeTypeToExternalUri, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$6(CreateAssetWithAlbumFile createAssetWithAlbumFile, String path, Uri uri) throws AssetException {
        s.k(path, "path");
        if (uri == null) {
            throw new AssetException();
        }
        if (!createAssetWithAlbumFile.resolveWithAdditionalData) {
            createAssetWithAlbumFile.promise.resolve((Object) null);
        } else {
            AssetUtilsKt.queryAssetInfo(createAssetWithAlbumFile.context, "_data=?", new String[]{path}, false, createAssetWithAlbumFile.promise);
        }
    }

    private final boolean isFileExtensionPresent() {
        String lastPathSegment = this.mUri.getLastPathSegment();
        if (lastPathSegment != null) {
            return t.h0(lastPathSegment, ".", false, 2, null);
        }
        return false;
    }

    private final Uri normalizeAssetUri(String uri) {
        if (t.b0(uri, "/", false, 2, null)) {
            Uri uriFromFile = Uri.fromFile(new File(uri));
            s.h(uriFromFile);
            return uriFromFile;
        }
        Uri uri2 = Uri.parse(uri);
        s.h(uri2);
        return uri2;
    }

    private final void writeFileContentsToAsset(File localFile, Uri assetUri) {
        ContentResolver contentResolver = this.context.getContentResolver();
        FileChannel channel = new FileInputStream(localFile).getChannel();
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(assetUri);
            s.i(outputStreamOpenOutputStream, "null cannot be cast to non-null type java.io.FileOutputStream");
            FileChannel channel2 = ((FileOutputStream) outputStreamOpenOutputStream).getChannel();
            try {
                if (channel.transferTo(0L, channel.size(), channel2) != channel.size()) {
                    contentResolver.delete(assetUri, null, null);
                    throw new IOException("Could not save file to " + assetUri + " Not enough space.");
                }
                h0 h0Var = h0.f84049a;
                b.a(channel2, null);
                b.a(channel, null);
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_pending", (Integer) 0);
                contentResolver.update(assetUri, contentValues, null, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(channel2, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(channel, th4);
                throw th5;
            }
        }
    }

    public final void execute() throws AssetFileException {
        if (!isFileExtensionPresent()) {
            throw new AssetFileException("Could not get the file's extension.");
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                createAssetUsingContentResolver();
            } else {
                MediaScannerConnection.scanFile(this.context, new String[]{createAssetFileLegacy(this.albumFile).getPath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: expo.modules.medialibrary.assets.a
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri) throws AssetException {
                        CreateAssetWithAlbumFile.execute$lambda$6(this.f63414a, str, uri);
                    }
                });
            }
        } catch (IOException e11) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_IO_EXCEPTION, "Unable to copy file into external storage.", e11);
        } catch (SecurityException e12) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get asset: need READ_EXTERNAL_STORAGE permission.", e12);
        } catch (Exception e13) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_SAVE, "Could not create asset.", e13);
        }
    }

    public /* synthetic */ CreateAssetWithAlbumFile(Context context, String str, Promise promise, boolean z11, File file, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, promise, (i11 & 8) != 0 ? true : z11, file);
    }
}
