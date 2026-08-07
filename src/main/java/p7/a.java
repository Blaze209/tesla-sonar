package p7;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f101177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101179c;

    /* JADX INFO: renamed from: p7.a$a, reason: collision with other inner class name */
    public static final class C2150a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f101180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f101181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f101182c;

        public C2150a(View view, int i11) {
            this.f101180a = view;
            this.f101181b = i11;
        }

        public a a() {
            return new a(this.f101180a, this.f101181b, this.f101182c);
        }

        public C2150a b(String str) {
            this.f101182c = str;
            return this;
        }
    }

    @Deprecated
    public a(View view, int i11, String str) {
        this.f101177a = view;
        this.f101178b = i11;
        this.f101179c = str;
    }
}
