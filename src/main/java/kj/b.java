package kj;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import dj.h;
import java.io.InputStream;
import jj.o;
import jj.p;
import jj.s;

/* JADX INFO: loaded from: classes3.dex */
public class b implements o<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f86159a;

    public b(Context context) {
        this.f86159a = context.getApplicationContext();
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@NonNull Uri uri, int i11, int i12, @NonNull h hVar) {
        if (ej.b.e(i11, i12)) {
            return new o.a<>(new wj.d(uri), ej.c.f(this.f86159a, uri));
        }
        return null;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return ej.b.b(uri);
    }

    public static class a implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f86160a;

        public a(Context context) {
            this.f86160a = context;
        }

        @Override // jj.p
        @NonNull
        public o<Uri, InputStream> e(s sVar) {
            return new b(this.f86160a);
        }

        @Override // jj.p
        public void d() {
        }
    }
}
