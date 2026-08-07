package ej;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f63013f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f63014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f63015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gj.b f63016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentResolver f63017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f63018e;

    e(List<ImageHeaderParser> list, d dVar, gj.b bVar, ContentResolver contentResolver) {
        this(list, f63013f, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:28), block:B:11:0x001b */
    private String b(@NonNull Uri uri) throws Throwable {
        Cursor cursorA;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorA = this.f63015b.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException e11) {
                        e = e11;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SecurityException e12) {
            e = e12;
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.f63014a.a(file) && 0 < this.f63014a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f63017d.openInputStream(uri);
                return com.bumptech.glide.load.a.b(this.f63018e, inputStreamOpenInputStream, this.f63016c);
            } finally {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException | NullPointerException e11) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e11);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f63014a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f63017d.openInputStream(uriFromFile);
        } catch (NullPointerException e11) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e11));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, gj.b bVar, ContentResolver contentResolver) {
        this.f63014a = aVar;
        this.f63015b = dVar;
        this.f63016c = bVar;
        this.f63017d = contentResolver;
        this.f63018e = list;
    }
}
