package p7;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f101411e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f101412f = s7.q0.N0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f101413g = s7.q0.N0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f101414h = s7.q0.N0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f101415i = s7.q0.N0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f101419d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f101420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f101421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f101422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f101423d;

        public b(int i11) {
            this.f101420a = i11;
        }

        public m e() {
            s7.a.a(this.f101421b <= this.f101422c);
            return new m(this);
        }

        public b f(int i11) {
            this.f101422c = i11;
            return this;
        }

        public b g(int i11) {
            this.f101421b = i11;
            return this;
        }

        public b h(String str) {
            s7.a.a(this.f101420a != 0 || str == null);
            this.f101423d = str;
            return this;
        }
    }

    public static m a(Bundle bundle) {
        int i11 = bundle.getInt(f101412f, 0);
        int i12 = bundle.getInt(f101413g, 0);
        int i13 = bundle.getInt(f101414h, 0);
        return new b(i11).g(i12).f(i13).h(bundle.getString(f101415i)).e();
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        int i11 = this.f101416a;
        if (i11 != 0) {
            bundle.putInt(f101412f, i11);
        }
        int i12 = this.f101417b;
        if (i12 != 0) {
            bundle.putInt(f101413g, i12);
        }
        int i13 = this.f101418c;
        if (i13 != 0) {
            bundle.putInt(f101414h, i13);
        }
        String str = this.f101419d;
        if (str != null) {
            bundle.putString(f101415i, str);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f101416a == mVar.f101416a && this.f101417b == mVar.f101417b && this.f101418c == mVar.f101418c && Objects.equals(this.f101419d, mVar.f101419d);
    }

    public int hashCode() {
        int i11 = (((((527 + this.f101416a) * 31) + this.f101417b) * 31) + this.f101418c) * 31;
        String str = this.f101419d;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    private m(b bVar) {
        this.f101416a = bVar.f101420a;
        this.f101417b = bVar.f101421b;
        this.f101418c = bVar.f101422c;
        this.f101419d = bVar.f101423d;
    }
}
