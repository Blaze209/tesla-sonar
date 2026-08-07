package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3212eb {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.eb$a */
    public static final class a {
        public static C3725qa a(InterfaceC3212eb interfaceC3212eb) {
            return C3725qa.f34786b.a();
        }

        public static DocumentType b(InterfaceC3212eb interfaceC3212eb) {
            return interfaceC3212eb.t().getType();
        }
    }

    G5 a();

    boolean c();

    DocumentType d();

    Integer f();

    boolean h();

    C3725qa i();

    boolean k();

    InterfaceC3281g0 m();

    boolean o();

    double p();

    boolean r();

    DocumentScannerConfig t();
}
