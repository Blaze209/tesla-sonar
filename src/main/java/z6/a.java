package z6;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f127023a;

    a(a aVar) {
        this.f127023a = aVar;
    }

    public static a g(@NonNull Context context, @NonNull Uri uri) {
        return new f(null, context, uri);
    }

    public static a h(@NonNull Context context, @NonNull Uri uri) {
        return new g(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract a c(@NonNull String str);

    public abstract a d(@NonNull String str, @NonNull String str2);

    public abstract boolean e();

    public abstract boolean f();

    public abstract String i();

    @NonNull
    public abstract Uri j();

    public abstract boolean k();

    public abstract boolean l();

    @NonNull
    public abstract a[] m();
}
