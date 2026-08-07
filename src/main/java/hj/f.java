package hj;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f72921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f72922b;

        a(Context context, String str) {
            this.f72921a = context;
            this.f72922b = str;
        }

        @Override // hj.d.a
        public File getCacheDirectory() {
            File cacheDir = this.f72921a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f72922b != null ? new File(cacheDir, this.f72922b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j11) {
        super(new a(context, str), j11);
    }
}
