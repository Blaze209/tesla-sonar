package ec;

import android.net.Uri;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/net/Uri;", "Lec/g0;", "b", "(Landroid/net/Uri;)Lec/g0;", "a", "(Lec/g0;)Landroid/net/Uri;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {
    public static final Uri a(g0 g0Var) {
        return Uri.parse(g0Var.getData());
    }

    public static final g0 b(Uri uri) {
        return h0.j(uri.toString(), null, 1, null);
    }
}
