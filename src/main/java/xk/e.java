package xk;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.contacts.Columns;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f123627a = Uri.withAppendedPath((Uri) gn.a.e(ContactsContract.AUTHORITY_URI), "display_photo");

    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (l(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    private static String b(boolean z11) {
        return "_data";
    }

    private static Uri c(boolean z11) {
        return z11 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    private static String d(boolean z11) {
        return Columns.ID;
    }

    public static String e(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!l(uri)) {
            if (m(uri)) {
                return uri.getPath();
            }
            return null;
        }
        boolean z11 = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            k.g(documentId);
            uri2 = (Uri) k.g(c(z11));
            str = d(z11) + "=?";
            strArr = new String[]{documentId.split(":")[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{b(z11)}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(b(z11))) != -1) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    public static String f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri g(int i11) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i11)).build();
    }

    public static boolean h(Uri uri) {
        return "data".equals(f(uri));
    }

    public static boolean i(Uri uri) {
        return "asset".equals(f(uri));
    }

    public static boolean j(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean k(Uri uri) {
        return uri.getPath() != null && l(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) gn.a.e(f123627a.getPath()));
    }

    public static boolean l(Uri uri) {
        return "content".equals(f(uri));
    }

    public static boolean m(Uri uri) {
        return Action.FILE_ATTRIBUTE.equals(f(uri));
    }

    public static boolean n(Uri uri) {
        return "res".equals(f(uri));
    }

    public static boolean o(Uri uri) {
        String strF = f(uri);
        return "https".equals(strF) || "http".equals(strF);
    }

    public static boolean p(Uri uri) {
        return "android.resource".equals(f(uri));
    }

    public static URL q(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e11) {
            throw new RuntimeException(e11);
        }
    }
}
