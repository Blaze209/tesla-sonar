package h1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import c0.y0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static boolean a(@NonNull File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static String b(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws Throwable {
        Throwable th2;
        Uri uri2;
        RuntimeException runtimeException;
        Cursor cursorQuery;
        ?? r11 = 0;
        try {
            try {
                try {
                    uri2 = uri;
                    try {
                        cursorQuery = contentResolver.query(uri2, new String[]{str}, null, null, null);
                        if (cursorQuery == null) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                        try {
                            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(str);
                            cursorQuery.moveToFirst();
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            cursorQuery.close();
                            return string;
                        } catch (RuntimeException e11) {
                            runtimeException = e11;
                            y0.c("OutputUtil", String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                    } catch (RuntimeException e12) {
                        e = e12;
                        runtimeException = e;
                        cursorQuery = null;
                        y0.c("OutputUtil", String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    r11 = contentResolver;
                    if (r11 != 0) {
                        throw th2;
                    }
                    r11.close();
                    throw th2;
                }
            } catch (RuntimeException e13) {
                e = e13;
                uri2 = uri;
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (r11 != 0) {
                throw th2;
            }
            r11.close();
            throw th2;
        }
    }
}
