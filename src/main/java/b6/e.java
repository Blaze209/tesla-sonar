package b6;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f16680a;

    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f16680a = new a(uri, clipDescription, uri2);
        } else {
            this.f16680a = new b(uri, clipDescription, uri2);
        }
    }

    public static e f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new e(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f16680a.b();
    }

    public ClipDescription b() {
        return this.f16680a.getDescription();
    }

    public Uri c() {
        return this.f16680a.d();
    }

    public void d() {
        this.f16680a.c();
    }

    public Object e() {
        return this.f16680a.a();
    }

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f16681a;

        a(Object obj) {
            this.f16681a = (InputContentInfo) obj;
        }

        @Override // b6.e.c
        public Object a() {
            return this.f16681a;
        }

        @Override // b6.e.c
        public Uri b() {
            return this.f16681a.getContentUri();
        }

        @Override // b6.e.c
        public void c() {
            this.f16681a.requestPermission();
        }

        @Override // b6.e.c
        public Uri d() {
            return this.f16681a.getLinkUri();
        }

        @Override // b6.e.c
        public ClipDescription getDescription() {
            return this.f16681a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f16681a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private e(c cVar) {
        this.f16680a = cVar;
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f16682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f16683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f16684c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f16682a = uri;
            this.f16683b = clipDescription;
            this.f16684c = uri2;
        }

        @Override // b6.e.c
        public Object a() {
            return null;
        }

        @Override // b6.e.c
        public Uri b() {
            return this.f16682a;
        }

        @Override // b6.e.c
        public Uri d() {
            return this.f16684c;
        }

        @Override // b6.e.c
        public ClipDescription getDescription() {
            return this.f16683b;
        }

        @Override // b6.e.c
        public void c() {
        }
    }
}
