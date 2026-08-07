package com.fourthline.orca.internal;

import java.io.File;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3774rh implements InterfaceC3732qh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35070b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35071c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f35072a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rh$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3774rh(File assetsFourthlineDirectory) {
        p013kotlin.jvm.internal.s.k(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        this.f35072a = assetsFourthlineDirectory;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3732qh
    public InterfaceC3903uh a(final EnumC3689ph key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        File file = new File(AbstractC3860th.a(key, this.f35072a));
        if (!file.exists()) {
            FF.f25800a.a(AbstractC4053y0.a(this.f35072a), this.f35072a, new wn0.l() { // from class: com.fourthline.orca.internal.hb1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C3774rh.a(key, (String) obj));
                }
            });
        }
        return new InterfaceC3903uh.a(file, key.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(EnumC3689ph enumC3689ph, String zipFile) {
        p013kotlin.jvm.internal.s.k(zipFile, "zipFile");
        return p013kotlin.text.t.M(zipFile, "images/" + enumC3689ph.b(), true);
    }
}
