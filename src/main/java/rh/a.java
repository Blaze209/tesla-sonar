package rh;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108232c;

    /* JADX INFO: renamed from: rh.a$a, reason: collision with other inner class name */
    public static class C2298a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f108233a = "0";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f108234b = "1";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f108235c = "2";
    }

    public a(String str, String str2, String str3) {
        this.f108230a = str;
        this.f108231b = str2;
        this.f108232c = str3;
    }

    public String a() {
        return this.f108230a;
    }

    public String b() {
        return this.f108231b;
    }

    public String c() {
        return this.f108232c;
    }

    @NonNull
    public String toString() {
        return "updateStrategy: " + this.f108232c + " sha256:" + this.f108230a + " sourceUrl:" + this.f108231b;
    }
}
