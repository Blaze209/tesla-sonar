package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3806sC {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sC$a */
    public static final class a implements InterfaceC3635oC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MD f35232a;

        a(MD md2) {
            this.f35232a = md2;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3635oC
        public MD a() {
            return this.f35232a;
        }
    }

    public static final InterfaceC3635oC a(MD back) {
        p013kotlin.jvm.internal.s.k(back, "back");
        return new a(back);
    }
}
