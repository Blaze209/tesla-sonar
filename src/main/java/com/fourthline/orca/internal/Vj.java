package com.fourthline.orca.internal;

import java.io.File;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Vj implements Uj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29127b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f29128c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f29129a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Vj(File assetsFourthlineDirectory) {
        p013kotlin.jvm.internal.s.k(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        this.f29129a = assetsFourthlineDirectory;
    }

    @Override // com.fourthline.orca.internal.Uj
    public Yj a(final Tj key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        File file = new File(Xj.a(key, this.f29129a));
        if (!file.exists()) {
            FF.f25800a.a(AbstractC4053y0.a(this.f29129a), this.f29129a, new wn0.l() { // from class: com.fourthline.orca.internal.ps0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Vj.a(key, (String) obj));
                }
            });
        }
        return new Yj.a(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Tj tj2, String zipFile) {
        p013kotlin.jvm.internal.s.k(zipFile, "zipFile");
        return p013kotlin.text.t.M(zipFile, "animations/" + tj2.b(), true);
    }
}
