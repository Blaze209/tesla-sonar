package bc;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<String> f16953a = new ArrayList<>();

    public static Uri a(@NonNull ReactContext reactContext, @NonNull File file) {
        b(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && f16953a.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith("content://")) {
            return Uri.fromFile(file);
        }
        Uri uriForFile = null;
        int i11 = 0;
        while (true) {
            ArrayList<String> arrayList = f16953a;
            if (i11 >= arrayList.size()) {
                break;
            }
            try {
                uriForFile = FileProvider.getUriForFile(reactContext, arrayList.get(i11), file);
                if (uriForFile != null) {
                    break;
                }
                i11++;
            } catch (Exception e11) {
                System.out.println("RNSharePathUtil::compatUriFromFile ERROR " + e11.getMessage());
            }
        }
        return uriForFile;
    }

    public static void b(ReactContext reactContext) {
        ArrayList<String> arrayList = f16953a;
        if (arrayList.size() == 0) {
            ComponentCallbacks2 componentCallbacks2 = (Application) reactContext.getApplicationContext();
            if (componentCallbacks2 instanceof e) {
                arrayList.add(((e) componentCallbacks2).f());
            }
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:33:? A[SYNTHETIC] */
    public static String c(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th2;
        Exception exc;
        Cursor cursorLoadInBackground;
        Cursor cursor = null;
        try {
            cursorLoadInBackground = new androidx.loader.content.b(context, uri, new String[]{"_data"}, str, strArr, null).loadInBackground();
            if (cursorLoadInBackground != null) {
                try {
                    try {
                        if (cursorLoadInBackground.moveToFirst()) {
                            String string = cursorLoadInBackground.getString(cursorLoadInBackground.getColumnIndexOrThrow("_data"));
                            cursorLoadInBackground.close();
                            return string;
                        }
                    } catch (Exception e11) {
                        exc = e11;
                        exc.printStackTrace();
                        if (cursorLoadInBackground != null) {
                            cursorLoadInBackground.close();
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorLoadInBackground;
                    if (cursor != null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            }
            if (cursorLoadInBackground != null) {
                cursorLoadInBackground.close();
            }
            return null;
        } catch (Exception e12) {
            exc = e12;
            cursorLoadInBackground = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
    }

    public static String d(Context context, Uri uri, Boolean bool) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (f(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str = strArrSplit[0];
                if ("primary".equalsIgnoreCase(str) || WebrtcBuildVersion.maint_version.equalsIgnoreCase(str)) {
                    return "" + (bool.booleanValue() ? context.getCacheDir() : context.getExternalCacheDir()) + "/" + strArrSplit[1];
                }
                if ("raw".equalsIgnoreCase(str)) {
                    return "" + strArrSplit[1];
                }
                if (!TextUtils.isEmpty(str)) {
                    return "/storage/" + str + "/" + strArrSplit[1];
                }
            } else {
                if (e(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return "" + documentId.replaceFirst("raw:", "");
                    }
                    return "" + c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                }
                if (h(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = strArrSplit2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else if ("raw".equalsIgnoreCase(str2)) {
                        return "" + strArrSplit2[1];
                    }
                    return "" + c(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (g(uri)) {
                    return uri.getLastPathSegment();
                }
                return "" + c(context, uri, null, null);
            }
            if (Action.FILE_ATTRIBUTE.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean e(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
