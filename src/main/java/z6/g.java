package z6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class g extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f127026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f127027c;

    g(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f127026b = context;
        this.f127027c = uri;
    }

    private static void n(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                b.a(autoCloseable);
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    private static Uri o(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // z6.a
    public boolean a() {
        return e.a(this.f127026b, this.f127027c);
    }

    @Override // z6.a
    public boolean b() {
        return e.b(this.f127026b, this.f127027c);
    }

    @Override // z6.a
    public a c(String str) {
        Uri uriO = o(this.f127026b, this.f127027c, "vnd.android.document/directory", str);
        if (uriO != null) {
            return new g(this, this.f127026b, uriO);
        }
        return null;
    }

    @Override // z6.a
    public a d(String str, String str2) {
        Uri uriO = o(this.f127026b, this.f127027c, str, str2);
        if (uriO != null) {
            return new g(this, this.f127026b, uriO);
        }
        return null;
    }

    @Override // z6.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f127026b.getContentResolver(), this.f127027c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // z6.a
    public boolean f() {
        return e.d(this.f127026b, this.f127027c);
    }

    @Override // z6.a
    public String i() {
        return e.e(this.f127026b, this.f127027c);
    }

    @Override // z6.a
    public Uri j() {
        return this.f127027c;
    }

    @Override // z6.a
    public boolean k() {
        return e.g(this.f127026b, this.f127027c);
    }

    @Override // z6.a
    public boolean l() {
        return e.h(this.f127026b, this.f127027c);
    }

    @Override // z6.a
    public a[] m() {
        ContentResolver contentResolver = this.f127026b.getContentResolver();
        Uri uri = this.f127027c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f127027c, cursorQuery.getString(0)));
                }
            } catch (Exception e11) {
                Log.w("DocumentFile", "Failed query: " + e11);
            }
            n(cursorQuery);
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i11 = 0; i11 < uriArr.length; i11++) {
                aVarArr[i11] = new g(this, this.f127026b, uriArr[i11]);
            }
            return aVarArr;
        } catch (Throwable th2) {
            n(cursorQuery);
            throw th2;
        }
    }
}
