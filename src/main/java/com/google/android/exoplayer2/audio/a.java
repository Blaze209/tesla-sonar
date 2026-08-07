package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f39502g = new e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f39503h = p0.t0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f39504i = p0.t0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f39505j = p0.t0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f39506k = p0.t0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f39507l = p0.t0(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<a> f39508m = new com.google.android.exoplayer2.g.a() { // from class: dr.d
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return com.google.android.exoplayer2.audio.a.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f39514f;

    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i11) {
            builder.setAllowedCapturePolicy(i11);
        }
    }

    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i11) {
            builder.setSpatializationBehavior(i11);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f39515a;

        private d(a aVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(aVar.f39509a).setFlags(aVar.f39510b).setUsage(aVar.f39511c);
            int i11 = p0.f115040a;
            if (i11 >= 29) {
                b.a(usage, aVar.f39512d);
            }
            if (i11 >= 32) {
                c.a(usage, aVar.f39513e);
            }
            this.f39515a = usage.build();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f39516a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39517b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f39518c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f39519d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39520e = 0;

        public a a() {
            return new a(this.f39516a, this.f39517b, this.f39518c, this.f39519d, this.f39520e);
        }

        public e b(int i11) {
            this.f39519d = i11;
            return this;
        }

        public e c(int i11) {
            this.f39516a = i11;
            return this;
        }

        public e d(int i11) {
            this.f39517b = i11;
            return this;
        }

        public e e(int i11) {
            this.f39520e = i11;
            return this;
        }

        public e f(int i11) {
            this.f39518c = i11;
            return this;
        }
    }

    public static /* synthetic */ a a(Bundle bundle) {
        e eVar = new e();
        String str = f39503h;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = f39504i;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = f39505j;
        if (bundle.containsKey(str3)) {
            eVar.f(bundle.getInt(str3));
        }
        String str4 = f39506k;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = f39507l;
        if (bundle.containsKey(str5)) {
            eVar.e(bundle.getInt(str5));
        }
        return eVar.a();
    }

    public d b() {
        if (this.f39514f == null) {
            this.f39514f = new d();
        }
        return this.f39514f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f39509a == aVar.f39509a && this.f39510b == aVar.f39510b && this.f39511c == aVar.f39511c && this.f39512d == aVar.f39512d && this.f39513e == aVar.f39513e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f39509a) * 31) + this.f39510b) * 31) + this.f39511c) * 31) + this.f39512d) * 31) + this.f39513e;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f39503h, this.f39509a);
        bundle.putInt(f39504i, this.f39510b);
        bundle.putInt(f39505j, this.f39511c);
        bundle.putInt(f39506k, this.f39512d);
        bundle.putInt(f39507l, this.f39513e);
        return bundle;
    }

    private a(int i11, int i12, int i13, int i14, int i15) {
        this.f39509a = i11;
        this.f39510b = i12;
        this.f39511c = i13;
        this.f39512d = i14;
        this.f39513e = i15;
    }
}
