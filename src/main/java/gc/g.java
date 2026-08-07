package gc;

import android.content.res.AssetFileDescriptor;
import ec.g0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgc/g;", "Lgc/u$a;", "Lec/g0;", "uri", "Landroid/content/res/AssetFileDescriptor;", "assetFileDescriptor", "<init>", "(Lec/g0;Landroid/content/res/AssetFileDescriptor;)V", "a", "Lec/g0;", "getUri", "()Lec/g0;", "b", "Landroid/content/res/AssetFileDescriptor;", "()Landroid/content/res/AssetFileDescriptor;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AssetFileDescriptor assetFileDescriptor;

    public g(g0 g0Var, AssetFileDescriptor assetFileDescriptor) {
        this.uri = g0Var;
        this.assetFileDescriptor = assetFileDescriptor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }
}
