package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f7777a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f7778a;

        public a(ClipData clipData, int i11) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f7778a = new b(clipData, i11);
            } else {
                this.f7778a = new C0159d(clipData, i11);
            }
        }

        public d a() {
            return this.f7778a.build();
        }

        public a b(Bundle bundle) {
            this.f7778a.setExtras(bundle);
            return this;
        }

        public a c(int i11) {
            this.f7778a.a(i11);
            return this;
        }

        public a d(Uri uri) {
            this.f7778a.b(uri);
            return this;
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f7779a;

        b(ClipData clipData, int i11) {
            this.f7779a = androidx.core.view.e.a(clipData, i11);
        }

        @Override // androidx.core.view.d.c
        public void a(int i11) {
            this.f7779a.setFlags(i11);
        }

        @Override // androidx.core.view.d.c
        public void b(Uri uri) {
            this.f7779a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new e(this.f7779a.build()));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f7779a.setExtras(bundle);
        }
    }

    private interface c {
        void a(int i11);

        void b(Uri uri);

        d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0159d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f7780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f7783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f7784e;

        C0159d(ClipData clipData, int i11) {
            this.f7780a = clipData;
            this.f7781b = i11;
        }

        @Override // androidx.core.view.d.c
        public void a(int i11) {
            this.f7782c = i11;
        }

        @Override // androidx.core.view.d.c
        public void b(Uri uri) {
            this.f7783d = uri;
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f7784e = bundle;
        }
    }

    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f7785a;

        e(ContentInfo contentInfo) {
            this.f7785a = androidx.core.view.c.a(u5.h.g(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.f7785a.getSource();
        }

        @Override // androidx.core.view.d.f
        public int j() {
            return this.f7785a.getFlags();
        }

        @Override // androidx.core.view.d.f
        public ClipData k() {
            return this.f7785a.getClip();
        }

        @Override // androidx.core.view.d.f
        public ContentInfo l() {
            return this.f7785a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f7785a + "}";
        }
    }

    private interface f {
        int getSource();

        int j();

        ClipData k();

        ContentInfo l();
    }

    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f7786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f7789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f7790e;

        g(C0159d c0159d) {
            this.f7786a = (ClipData) u5.h.g(c0159d.f7780a);
            this.f7787b = u5.h.c(c0159d.f7781b, 0, 5, "source");
            this.f7788c = u5.h.f(c0159d.f7782c, 1);
            this.f7789d = c0159d.f7783d;
            this.f7790e = c0159d.f7784e;
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.f7787b;
        }

        @Override // androidx.core.view.d.f
        public int j() {
            return this.f7788c;
        }

        @Override // androidx.core.view.d.f
        public ClipData k() {
            return this.f7786a;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo l() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f7786a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.f7787b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f7788c));
            if (this.f7789d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f7789d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f7790e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    d(f fVar) {
        this.f7777a = fVar;
    }

    static String a(int i11) {
        return (i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11);
    }

    static String e(int i11) {
        if (i11 == 0) {
            return "SOURCE_APP";
        }
        if (i11 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i11 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i11 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i11 != 4) {
            return i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f7777a.k();
    }

    public int c() {
        return this.f7777a.j();
    }

    public int d() {
        return this.f7777a.getSource();
    }

    public ContentInfo f() {
        ContentInfo contentInfoL = this.f7777a.l();
        Objects.requireNonNull(contentInfoL);
        androidx.core.view.c.a(contentInfoL);
        return contentInfoL;
    }

    public String toString() {
        return this.f7777a.toString();
    }
}
