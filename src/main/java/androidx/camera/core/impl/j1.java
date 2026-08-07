package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface j1 {

    public static abstract class a {
        @NonNull
        public static a a(int i11, @NonNull String str, int i12, int i13, int i14, int i15) {
            return new e(i11, str, i12, i13, i14, i15);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        @NonNull
        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    public static abstract class b implements j1 {
        @NonNull
        public static b h(int i11, int i12, @NonNull List<a> list, @NonNull List<c> list2) {
            return new f(i11, i12, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    public static abstract class c {
        @NonNull
        public static c a(int i11, @NonNull String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            return new g(i11, str, i12, i13, i14, i15, i16, i17, i18, i19);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        @NonNull
        public abstract String i();

        public abstract int j();

        public abstract int k();
    }

    static int a(int i11) {
        if (i11 == 3) {
            return 2;
        }
        if (i11 != 4) {
            return i11 != 5 ? -1 : 39;
        }
        return 5;
    }

    @NonNull
    static String f(int i11) {
        switch (i11) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    @NonNull
    static String g(int i11) {
        switch (i11) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    int b();

    @NonNull
    List<a> c();

    int d();

    @NonNull
    List<c> e();
}
