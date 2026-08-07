package z6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class e {
    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(f(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strF = f(context, uri);
        int i11 = i(context, uri, "flags", 0);
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        if ((i11 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strF) || (i11 & 8) == 0) {
            return (TextUtils.isEmpty(strF) || (i11 & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                b.a(autoCloseable);
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e11) {
            Log.w("DocumentFile", "Failed query: " + e11);
            return false;
        } finally {
            c(cursorQuery);
        }
    }

    public static String e(Context context, Uri uri) {
        return k(context, uri, "_display_name", null);
    }

    private static String f(Context context, Uri uri) {
        return k(context, uri, "mime_type", null);
    }

    public static boolean g(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(f(context, uri));
    }

    public static boolean h(Context context, Uri uri) {
        String strF = f(context, uri);
        return ("vnd.android.document/directory".equals(strF) || TextUtils.isEmpty(strF)) ? false : true;
    }

    private static int i(Context context, Uri uri, String str, int i11) {
        return (int) j(context, uri, str, i11);
    }

    private static long j(Context context, Uri uri, String str, long j11) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j11 : cursorQuery.getLong(0);
        } catch (Exception e11) {
            Log.w("DocumentFile", "Failed query: " + e11);
            return j11;
        } finally {
            c(cursorQuery);
        }
    }

    private static String k(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e11) {
            Log.w("DocumentFile", "Failed query: " + e11);
            return str2;
        } finally {
            c(cursorQuery);
        }
    }
}
