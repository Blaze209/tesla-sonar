package expo.modules.medialibrary.albums.migration;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import java.io.File;
import jn0.h0;
import p013kotlin.Metadata;
import sn0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¨\u0006\u0006"}, d2 = {"getAlbumDirectory", "Ljava/io/File;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "albumId", "", "expo-media-library_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CheckIfAlbumShouldBeMigratedKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final File getAlbumDirectory(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri external_content_uri = MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI();
        Cursor cursorQuery = contentResolver.query(external_content_uri, new String[]{"_data"}, "media_type != 0 AND bucket_id=?", new String[]{str}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    File file = new File(cursorQuery.getString(cursorQuery.getColumnIndex("_data")));
                    if (file.isFile()) {
                        String parent = file.getParent();
                        if (parent == null) {
                            b.a(cursorQuery, null);
                            return null;
                        }
                        File file2 = new File(parent);
                        b.a(cursorQuery, null);
                        return file2;
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        h0 h0Var = h0.f84049a;
        b.a(cursorQuery, null);
        return null;
    }
}
