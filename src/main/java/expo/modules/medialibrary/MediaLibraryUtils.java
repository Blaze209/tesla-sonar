package expo.modules.medialibrary;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.contacts.Columns;
import expo.modules.kotlin.Promise;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jn0.e;
import jn0.h0;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J;\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0019\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00042\u0010\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0018¢\u0006\u0004\b \u0010!J3\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0018\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\b\u0012\u0004\u0012\u00020)0#2\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010#¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u0002022\u0006\u0010\t\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryUtils;", "", "<init>", "()V", "", ImagesContract.URL, "getMimeTypeFromFileUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "getManifestPermissions", "(Landroid/content/Context;)Ljava/util/Set;", "name", "Lkotlin/Pair;", "getFileNameAndExtension", "(Ljava/lang/String;)Lkotlin/Pair;", "Ljava/io/File;", "src", "destDir", "safeMoveFile", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "safeCopyFile", "selection", "", "selectionArgs", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "deleteAssets", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", "assetIds", "queryPlaceholdersFor", "([Ljava/lang/String;)Ljava/lang/String;", "assetsId", "", "Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;", "getAssetsById", "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "getMimeType", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;", "getAssetsUris", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "mimeType", "mimeTypeToExternalUri", "(Ljava/lang/String;)Landroid/net/Uri;", "", "useCameraDir", "getRelativePathForAssetType", "(Ljava/lang/String;Z)Ljava/lang/String;", "getEnvDirectoryForAssetType", "(Ljava/lang/String;Z)Ljava/io/File;", "permission", "hasManifestPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "AssetFile", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaLibraryUtils {
    public static final MediaLibraryUtils INSTANCE = new MediaLibraryUtils();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;", "Ljava/io/File;", "pathname", "", "assetId", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getMimeType", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AssetFile extends File {
        private final String assetId;
        private final String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetFile(String pathname, String assetId, String mimeType) {
            super(pathname);
            s.k(pathname, "pathname");
            s.k(assetId, "assetId");
            s.k(mimeType, "mimeType");
            this.assetId = assetId;
            this.mimeType = mimeType;
        }

        public final String getAssetId() {
            return this.assetId;
        }

        public final String getMimeType() {
            return this.mimeType;
        }
    }

    private MediaLibraryUtils() {
    }

    private final Set<String> getManifestPermissions(Context context) {
        Set<String> setJ1;
        PackageManager packageManager = context.getPackageManager();
        s.j(packageManager, "getPackageManager(...)");
        try {
            String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && (setJ1 = n.J1(strArr)) != null) {
                return setJ1;
            }
            return d1.d();
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("expo-media-library", "Failed to list AndroidManifest.xml permissions");
            e11.printStackTrace();
            return d1.d();
        }
    }

    private final String getMimeTypeFromFileUrl(String url) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(url);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    public final void deleteAssets(Context context, String selection, String[] selectionArgs, Promise promise) {
        s.k(context, "context");
        s.k(promise, "promise");
        try {
            Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{Columns.ID, "_data"}, selection, selectionArgs, null);
            try {
                if (cursorQuery == null) {
                    throw new AssetFileException("Could not delete assets. Cursor is null.");
                }
                while (cursorQuery.moveToNext()) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), cursorQuery.getLong(cursorQuery.getColumnIndex(Columns.ID)));
                        s.j(uriWithAppendedId, "withAppendedId(...)");
                        if (context.getContentResolver().delete(uriWithAppendedId, null) == 0) {
                            throw new AssetFileException("Could not delete file.");
                        }
                    } else {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                        if (!new File(string).delete()) {
                            throw new AssetFileException("Could not delete file.");
                        }
                        context.getContentResolver().delete(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), "_data=?", new String[]{string});
                    }
                }
                promise.resolve(true);
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
        } catch (SecurityException e11) {
            promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_SAVE_PERMISSION, "Could not delete asset: need WRITE_EXTERNAL_STORAGE permission.", e11);
        } catch (Exception e12) {
            e12.printStackTrace();
            promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_DELETE, "Could not delete file.", e12);
        }
    }

    public final List<AssetFile> getAssetsById(Context context, String... assetsId) {
        s.k(context, "context");
        s.k(assetsId, "assetsId");
        Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{Columns.ID, "_data", "bucket_id", "mime_type"}, "_id IN ( " + queryPlaceholdersFor(assetsId) + " )", assetsId, null);
        try {
            if (cursorQuery == null) {
                throw new AssetFileException("Could not get assets. Query returns null.");
            }
            if (cursorQuery.getCount() != assetsId.length) {
                throw new AssetFileException("Could not get all of the requested assets");
            }
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                int columnIndex = cursorQuery.getColumnIndex(Columns.ID);
                int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
                s.h(string);
                String string2 = cursorQuery.getString(columnIndex);
                s.j(string2, "getString(...)");
                String string3 = cursorQuery.getString(columnIndex2);
                s.j(string3, "getString(...)");
                AssetFile assetFile = new AssetFile(string, string2, string3);
                if (!assetFile.exists() || !assetFile.isFile()) {
                    throw new AssetFileException("Path " + string + " does not exist or isn't file.");
                }
                arrayList.add(assetFile);
            }
            sn0.b.a(cursorQuery, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    public final List<Uri> getAssetsUris(Context context, List<String> assetsId) {
        s.k(context, "context");
        ArrayList arrayList = new ArrayList();
        s.h(assetsId);
        Cursor cursorQuery = context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{Columns.ID, "mime_type"}, "_id IN (" + TextUtils.join(",", assetsId) + " )", null, null);
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                int columnIndex = cursorQuery.getColumnIndex(Columns.ID);
                Uri uriWithAppendedId = ContentUris.withAppendedId(INSTANCE.mimeTypeToExternalUri(cursorQuery.getString(cursorQuery.getColumnIndex("mime_type"))), cursorQuery.getLong(columnIndex));
                s.j(uriWithAppendedId, "withAppendedId(...)");
                arrayList.add(uriWithAppendedId);
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

    @e
    public final File getEnvDirectoryForAssetType(String mimeType, boolean useCameraDir) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(getRelativePathForAssetType(mimeType, useCameraDir));
        s.j(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
        return externalStoragePublicDirectory;
    }

    public final Pair<String, String> getFileNameAndExtension(String name) {
        s.k(name, "name");
        Integer numValueOf = Integer.valueOf(t.C0(name, ".", 0, false, 6, null));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : name.length();
        String strSubstring = name.substring(iIntValue);
        s.j(strSubstring, "substring(...)");
        String strSubstring2 = name.substring(0, iIntValue);
        s.j(strSubstring2, "substring(...)");
        return new Pair<>(strSubstring2, strSubstring);
    }

    public final String getMimeType(ContentResolver contentResolver, Uri uri) {
        s.k(contentResolver, "contentResolver");
        s.k(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type != null) {
            return type;
        }
        String string = uri.toString();
        s.j(string, "toString(...)");
        return getMimeTypeFromFileUrl(string);
    }

    public final String getRelativePathForAssetType(String mimeType, boolean useCameraDir) {
        if ((mimeType != null && t.h0(mimeType, "image", false, 2, null)) || (mimeType != null && t.h0(mimeType, MediaStreamTrack.VIDEO_TRACK_KIND, false, 2, null))) {
            if (useCameraDir) {
                String DIRECTORY_DCIM = Environment.DIRECTORY_DCIM;
                s.j(DIRECTORY_DCIM, "DIRECTORY_DCIM");
                return DIRECTORY_DCIM;
            }
            String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
            s.j(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
            return DIRECTORY_PICTURES;
        }
        if (mimeType != null && t.h0(mimeType, MediaStreamTrack.AUDIO_TRACK_KIND, false, 2, null)) {
            String DIRECTORY_MUSIC = Environment.DIRECTORY_MUSIC;
            s.j(DIRECTORY_MUSIC, "DIRECTORY_MUSIC");
            return DIRECTORY_MUSIC;
        }
        if (useCameraDir) {
            String DIRECTORY_DCIM2 = Environment.DIRECTORY_DCIM;
            s.j(DIRECTORY_DCIM2, "DIRECTORY_DCIM");
            return DIRECTORY_DCIM2;
        }
        String DIRECTORY_PICTURES2 = Environment.DIRECTORY_PICTURES;
        s.j(DIRECTORY_PICTURES2, "DIRECTORY_PICTURES");
        return DIRECTORY_PICTURES2;
    }

    public final boolean hasManifestPermission(Context context, String permission) {
        s.k(context, "context");
        s.k(permission, "permission");
        return getManifestPermissions(context).contains(permission);
    }

    public final Uri mimeTypeToExternalUri(String mimeType) {
        if (mimeType == null) {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            s.j(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI;
        }
        if (t.h0(mimeType, "image", false, 2, null)) {
            Uri EXTERNAL_CONTENT_URI2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            s.j(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI2;
        }
        if (t.h0(mimeType, MediaStreamTrack.VIDEO_TRACK_KIND, false, 2, null)) {
            Uri EXTERNAL_CONTENT_URI3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            s.j(EXTERNAL_CONTENT_URI3, "EXTERNAL_CONTENT_URI");
            return EXTERNAL_CONTENT_URI3;
        }
        if (!t.h0(mimeType, MediaStreamTrack.AUDIO_TRACK_KIND, false, 2, null)) {
            return MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI();
        }
        Uri EXTERNAL_CONTENT_URI4 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        s.j(EXTERNAL_CONTENT_URI4, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI4;
    }

    public final String queryPlaceholdersFor(String[] assetIds) {
        s.k(assetIds, "assetIds");
        String[] strArr = new String[assetIds.length];
        n.D(strArr, CallerData.NA, 0, 0, 6, null);
        return n.T0(strArr, ",", null, null, 0, null, null, 62, null);
    }

    public final File safeCopyFile(File src, File destDir) throws IOException {
        s.k(src, "src");
        s.k(destDir, "destDir");
        File file = new File(destDir, src.getName());
        String name = src.getName();
        s.j(name, "getName(...)");
        Pair<String, String> fileNameAndExtension = getFileNameAndExtension(name);
        String strA = fileNameAndExtension.a();
        String strB = fileNameAndExtension.b();
        int i11 = 0;
        while (file.exists()) {
            file = new File(destDir, strA + "_" + i11 + strB);
            i11++;
            if (i11 > 32767) {
                throw new IOException("File name suffix limit reached (32767)");
            }
        }
        FileChannel channel = new FileInputStream(src).getChannel();
        try {
            try {
                FileChannel channel2 = new FileOutputStream(file).getChannel();
                try {
                    if (channel.transferTo(0L, channel.size(), channel2) == channel.size()) {
                        sn0.b.a(channel2, null);
                        sn0.b.a(channel, null);
                        return file;
                    }
                    file.delete();
                    throw new IOException("Could not save file to " + destDir + " Not enough space.");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(channel2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
            throw th4;
        } catch (Throwable th5) {
            sn0.b.a(channel, th4);
            throw th5;
        }
    }

    public final File safeMoveFile(File src, File destDir) throws IOException {
        s.k(src, "src");
        s.k(destDir, "destDir");
        File fileSafeCopyFile = safeCopyFile(src, destDir);
        src.delete();
        return fileSafeCopyFile;
    }
}
