package kj;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.f0;
import dj.h;
import java.io.InputStream;
import jj.o;
import jj.p;
import jj.s;

/* JADX INFO: loaded from: classes3.dex */
public class c implements o<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f86161a;

    public c(Context context) {
        this.f86161a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l11 = (Long) hVar.c(f0.f20795d);
        return l11 != null && l11.longValue() == -1;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@NonNull Uri uri, int i11, int i12, @NonNull h hVar) {
        if (ej.b.e(i11, i12) && e(hVar)) {
            return new o.a<>(new wj.d(uri), ej.c.g(this.f86161a, uri));
        }
        return null;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return ej.b.d(uri);
    }

    public static class a implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f86162a;

        public a(Context context) {
            this.f86162a = context;
        }

        @Override // jj.p
        @NonNull
        public o<Uri, InputStream> e(s sVar) {
            return new c(this.f86162a);
        }

        @Override // jj.p
        public void d() {
        }
    }
}
