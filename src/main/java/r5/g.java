package r5;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import c0.h0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f107019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f107020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f107021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f107022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f107023e;

        @Deprecated
        public b(Uri uri, int i11, int i12, boolean z11, int i13) {
            this.f107019a = (Uri) u5.h.g(uri);
            this.f107020b = i11;
            this.f107021c = i12;
            this.f107022d = z11;
            this.f107023e = i13;
        }

        static b a(Uri uri, int i11, int i12, boolean z11, int i13) {
            return new b(uri, i11, i12, z11, i13);
        }

        public int b() {
            return this.f107023e;
        }

        public int c() {
            return this.f107020b;
        }

        public Uri d() {
            return this.f107019a;
        }

        public int e() {
            return this.f107021c;
        }

        public boolean f() {
            return this.f107022d;
        }
    }

    public static class c {
        public void a(int i11) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return k5.h.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, h0.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List<e> list, int i11, boolean z11, int i12, Handler handler, c cVar) {
        r5.a aVar = new r5.a(cVar, h.b(handler));
        if (!z11) {
            return f.d(context, list, i11, null, aVar);
        }
        if (list.size() <= 1) {
            return f.e(context, list.get(0), aVar, i11, i12);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f107017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<b[]> f107018b;

        @Deprecated
        public a(int i11, b[] bVarArr) {
            this.f107017a = i11;
            this.f107018b = Collections.singletonList(bVarArr);
        }

        static a a(int i11, List<b[]> list) {
            return new a(i11, list);
        }

        static a b(int i11, b[] bVarArr) {
            return new a(i11, bVarArr);
        }

        public b[] c() {
            return this.f107018b.get(0);
        }

        public List<b[]> d() {
            return this.f107018b;
        }

        public int e() {
            return this.f107017a;
        }

        boolean f() {
            return this.f107018b.size() > 1;
        }

        a(int i11, List<b[]> list) {
            this.f107017a = i11;
            this.f107018b = list;
        }
    }
}
