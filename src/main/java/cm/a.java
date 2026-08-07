package cm;

import android.net.Uri;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcm/a;", "Lcm/c;", "<init>", "()V", "Landroid/net/Uri;", "uri", "", "callerContext", "a", "(Landroid/net/Uri;Ljava/lang/Object;)Landroid/net/Uri;", "urimod_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19426a = new a();

    private a() {
    }

    @Override // cm.c
    public Uri a(Uri uri, Object callerContext) {
        s.k(uri, "uri");
        return uri;
    }
}
