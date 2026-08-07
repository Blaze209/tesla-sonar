package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class M5 implements C5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f26893c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f26894d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rw f26895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P5 f26896b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public M5(Rw resourcesManager, P5 countrySupportedUseCase) {
        p013kotlin.jvm.internal.s.k(resourcesManager, "resourcesManager");
        p013kotlin.jvm.internal.s.k(countrySupportedUseCase, "countrySupportedUseCase");
        this.f26895a = resourcesManager;
        this.f26896b = countrySupportedUseCase;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(D5.a item1, D5.a item2) {
        p013kotlin.jvm.internal.s.k(item1, "item1");
        p013kotlin.jvm.internal.s.k(item2, "item2");
        boolean zA = a(item1.a());
        boolean zA2 = a(item2.a());
        if (zA && !zA2) {
            return -1;
        }
        if (!zA && zA2) {
            return 1;
        }
        int first = item1.b().getFirst();
        int first2 = item2.b().getFirst();
        if (first < first2) {
            return -1;
        }
        if (first > first2) {
            return 1;
        }
        return RA.a(item1.a().getName(), this.f26895a.b()).compareTo(RA.a(item2.a().getName(), this.f26895a.b()));
    }

    private final boolean a(InterfaceC3447jx interfaceC3447jx) {
        G5 g11 = interfaceC3447jx instanceof G5 ? (G5) interfaceC3447jx : null;
        if (g11 != null) {
            return this.f26896b.a(g11);
        }
        return false;
    }
}
