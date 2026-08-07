package androidx.media3.session;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class we implements ve.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f12581k = s7.q0.N0(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f12582l = s7.q0.N0(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f12583m = s7.q0.N0(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f12584n = s7.q0.N0(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f12585o = s7.q0.N0(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f12586p = s7.q0.N0(5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f12587q = s7.q0.N0(6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f12588r = s7.q0.N0(7);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f12589s = s7.q0.N0(8);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f12590t = s7.q0.N0(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f12596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ComponentName f12597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IBinder f12598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bundle f12599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final MediaSession.Token f12600j;

    public we(int i11, int i12, int i13, int i14, String str, o oVar, Bundle bundle, MediaSession.Token token) {
        this(i11, i12, i13, i14, (String) s7.a.f(str), "", null, oVar.asBinder(), (Bundle) s7.a.f(bundle), token);
    }

    @Override // androidx.media3.session.ve.a
    public int a() {
        return this.f12591a;
    }

    @Override // androidx.media3.session.ve.a
    public String e() {
        return this.f12595e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return this.f12591a == weVar.f12591a && this.f12592b == weVar.f12592b && this.f12593c == weVar.f12593c && this.f12594d == weVar.f12594d && TextUtils.equals(this.f12595e, weVar.f12595e) && TextUtils.equals(this.f12596f, weVar.f12596f) && Objects.equals(this.f12597g, weVar.f12597g) && Objects.equals(this.f12598h, weVar.f12598h) && Objects.equals(this.f12600j, weVar.f12600j);
    }

    @Override // androidx.media3.session.ve.a
    public Object f() {
        return this.f12598h;
    }

    @Override // androidx.media3.session.ve.a
    public ComponentName g() {
        return this.f12597g;
    }

    @Override // androidx.media3.session.ve.a
    public Bundle getExtras() {
        return new Bundle(this.f12599i);
    }

    @Override // androidx.media3.session.ve.a
    public String getServiceName() {
        return this.f12596f;
    }

    @Override // androidx.media3.session.ve.a
    public int getType() {
        return this.f12592b;
    }

    @Override // androidx.media3.session.ve.a
    public int h() {
        return this.f12594d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12591a), Integer.valueOf(this.f12592b), Integer.valueOf(this.f12593c), Integer.valueOf(this.f12594d), this.f12595e, this.f12596f, this.f12597g, this.f12598h, this.f12600j);
    }

    @Override // androidx.media3.session.ve.a
    public boolean i() {
        return false;
    }

    @Override // androidx.media3.session.ve.a
    public MediaSession.Token j() {
        return this.f12600j;
    }

    @Override // androidx.media3.session.ve.a
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f12581k, this.f12591a);
        bundle.putInt(f12582l, this.f12592b);
        bundle.putInt(f12583m, this.f12593c);
        bundle.putString(f12584n, this.f12595e);
        bundle.putString(f12585o, this.f12596f);
        androidx.core.app.h.b(bundle, f12587q, this.f12598h);
        bundle.putParcelable(f12586p, this.f12597g);
        bundle.putBundle(f12588r, this.f12599i);
        bundle.putInt(f12589s, this.f12594d);
        MediaSession.Token token = this.f12600j;
        if (token != null) {
            bundle.putParcelable(f12590t, token);
        }
        return bundle;
    }

    public String toString() {
        return "SessionToken {pkg=" + this.f12595e + " type=" + this.f12592b + " libraryVersion=" + this.f12593c + " interfaceVersion=" + this.f12594d + " service=" + this.f12596f + " IMediaSession=" + this.f12598h + " extras=" + this.f12599i + "}";
    }

    private we(int i11, int i12, int i13, int i14, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.f12591a = i11;
        this.f12592b = i12;
        this.f12593c = i13;
        this.f12594d = i14;
        this.f12595e = str;
        this.f12596f = str2;
        this.f12597g = componentName;
        this.f12598h = iBinder;
        this.f12599i = bundle;
        this.f12600j = token;
    }
}
