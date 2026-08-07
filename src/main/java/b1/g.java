package b1;

import android.net.Uri;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import z0.q;
import z0.r;
import z0.t;
import z0.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lb1/g;", "Lb1/f;", "Lz0/u;", "outputOptions", "<init>", "(Lz0/u;)V", "", "a", "()J", "Lz0/u;", "b", "camera-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f15264b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u outputOptions;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(u outputOptions) {
        s.k(outputOptions, "outputOptions");
        this.outputOptions = outputOptions;
    }

    @Override // b1.f
    public long a() {
        u uVar = this.outputOptions;
        if (uVar instanceof r) {
            String path = ((r) uVar).d().getPath();
            s.j(path, "outputOptions.file.path");
            return h1.e.c(path);
        }
        if (uVar instanceof t) {
            Uri uriD = ((t) uVar).d();
            s.j(uriD, "outputOptions.collectionUri");
            return h1.e.d(uriD);
        }
        if (uVar instanceof q) {
            return Long.MAX_VALUE;
        }
        throw new AssertionError("Unknown OutputOptions: " + this.outputOptions);
    }
}
