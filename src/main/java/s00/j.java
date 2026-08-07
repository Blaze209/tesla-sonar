package s00;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\rJE\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Ls00/j;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/net/Uri;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;", "fileUri", "e", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/net/Uri;)Ljava/lang/String;", "f", "selection", "", "selectionArgs", "actualUri", "c", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;", "fileName", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "Ljava/io/File;", "destFile", "a", "(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;)Landroid/net/Uri;", "", "h", "(Landroid/net/Uri;)Z", "g", "j", IntegerTokenConverter.CONVERTER_KEY, "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f109326a = new j();

    private j() {
    }

    private final String b(Uri uri, ReactApplicationContext context) {
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        s.h(cursorQuery);
        String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
        s.h(string);
        String strD = d(string);
        new File(context.getCacheDir(), UUID.randomUUID().toString());
        try {
            String string2 = a(context, uri, new File(q.c(strD, context))).toString();
            s.j(string2, "toString(...)");
            return string2;
        } catch (Exception e11) {
            e11.printStackTrace();
            String string3 = uri.toString();
            s.j(string3, "toString(...)");
            return string3;
        }
    }

    public final Uri a(Context context, Uri uri, File destFile) throws FileNotFoundException {
        s.k(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        s.h(uri);
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            try {
                byte[] bArr = new byte[PKIFailureInfo.certRevoked];
                while (true) {
                    s.h(inputStreamOpenInputStream);
                    int i11 = inputStreamOpenInputStream.read(bArr);
                    if (i11 <= 0) {
                        Uri uriFromFile = Uri.fromFile(destFile);
                        s.j(uriFromFile, "fromFile(...)");
                        sn0.b.a(fileOutputStream, null);
                        sn0.b.a(inputStreamOpenInputStream, null);
                        return uriFromFile;
                    }
                    fileOutputStream.write(bArr, 0, i11);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        sn0.b.a(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    sn0.b.a(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final String c(ReactApplicationContext context, Uri uri, String selection, String[] selectionArgs, Uri actualUri) {
        s.k(context, "context");
        String[] strArr = {"_data"};
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                s.h(uri);
                Cursor cursorQuery = contentResolver.query(uri, strArr, selection, selectionArgs, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    cursorQuery.close();
                    return string;
                }
                s.h(actualUri);
                String strB = b(actualUri, context);
                i.f109324a.a(strB);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return strB;
            } catch (Exception unused) {
                s.h(actualUri);
                String strB2 = b(actualUri, context);
                i.f109324a.a(strB2);
                if (0 != 0) {
                    cursor.close();
                }
                return strB2;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
    }

    public final String d(String fileName) {
        s.k(fileName, "fileName");
        return t.h0(fileName, ".", false, 2, null) ? t.v1(fileName, ".", null, 2, null) : "";
    }

    public final String e(ReactApplicationContext context, Uri fileUri) {
        s.k(context, "context");
        s.k(fileUri, "fileUri");
        return f(context, fileUri);
    }

    @SuppressLint({"NewApi"})
    public final String f(ReactApplicationContext context, Uri uri) {
        List listM;
        Uri contentUri;
        List listM2;
        s.k(context, "context");
        s.k(uri, "uri");
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            if (t.M("content", uri.getScheme(), true)) {
                return i(uri) ? uri.getLastPathSegment() : c(context, uri, null, null, uri);
            }
            if (t.M(Action.FILE_ATTRIBUTE, uri.getScheme(), true)) {
                return uri.getPath();
            }
            return null;
        }
        if (h(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            s.h(documentId);
            List<String> listM3 = new p013kotlin.text.q(":").m(documentId, 0);
            if (!listM3.isEmpty()) {
                ListIterator<String> listIterator = listM3.listIterator(listM3.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listM2 = v.m();
                        break;
                    }
                    if (listIterator.previous().length() != 0) {
                        listM2 = v.d1(listM3, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listM2 = v.m();
                break;
            }
            String[] strArr = (String[]) listM2.toArray(new String[0]);
            if (!t.M("primary", strArr[0], true)) {
                return null;
            }
            return Environment.getExternalStorageDirectory() + "/" + strArr[1];
        }
        if (g(uri)) {
            String documentId2 = DocumentsContract.getDocumentId(uri);
            Uri uri2 = Uri.parse("content://downloads/public_downloads");
            Long lValueOf = Long.valueOf(documentId2);
            s.j(lValueOf, "valueOf(...)");
            Uri uriWithAppendedId = ContentUris.withAppendedId(uri2, lValueOf.longValue());
            s.j(uriWithAppendedId, "withAppendedId(...)");
            return c(context, uriWithAppendedId, null, null, uri);
        }
        if (!j(uri)) {
            return null;
        }
        String documentId3 = DocumentsContract.getDocumentId(uri);
        s.h(documentId3);
        List<String> listM4 = new p013kotlin.text.q(":").m(documentId3, 0);
        if (!listM4.isEmpty()) {
            ListIterator<String> listIterator2 = listM4.listIterator(listM4.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listM = v.m();
                    break;
                }
                if (listIterator2.previous().length() != 0) {
                    listM = v.d1(listM4, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listM = v.m();
            break;
        }
        String[] strArr2 = (String[]) listM.toArray(new String[0]);
        String str = strArr2[0];
        if (s.f("image", str)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (s.f(MediaStreamTrack.VIDEO_TRACK_KIND, str)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = s.f(MediaStreamTrack.AUDIO_TRACK_KIND, str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Files.getContentUri("external");
        }
        return c(context, contentUri, "_id=?", new String[]{strArr2[1]}, uri);
    }

    public final boolean g(Uri uri) {
        s.k(uri, "uri");
        return s.f("com.android.providers.downloads.documents", uri.getAuthority());
    }

    public final boolean h(Uri uri) {
        s.k(uri, "uri");
        return s.f("com.android.externalstorage.documents", uri.getAuthority());
    }

    public final boolean i(Uri uri) {
        s.k(uri, "uri");
        return s.f("com.google.android.apps.photos.content", uri.getAuthority());
    }

    public final boolean j(Uri uri) {
        s.k(uri, "uri");
        return s.f("com.android.providers.media.documents", uri.getAuthority());
    }
}
