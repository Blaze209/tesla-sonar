package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3912uq implements InterfaceC3869tq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4104z8 f35939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Kp f35940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KD f35941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f35942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final X7 f35943e;

    public C3912uq(C4104z8 documentBundle, Kp personBundleByPriority, KD stringExtractor, List countries, X7 x11) {
        p013kotlin.jvm.internal.s.k(documentBundle, "documentBundle");
        p013kotlin.jvm.internal.s.k(personBundleByPriority, "personBundleByPriority");
        p013kotlin.jvm.internal.s.k(stringExtractor, "stringExtractor");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        this.f35939a = documentBundle;
        this.f35940b = personBundleByPriority;
        this.f35941c = stringExtractor;
        this.f35942d = countries;
        this.f35943e = x11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(G5 g11, C3912uq c3912uq) {
        return g11.e() + " " + c3912uq.f35941c.a(g11.f());
    }

    @Override // com.fourthline.orca.internal.Hi
    public InterfaceC3447jx c() {
        final G5 g5D = d();
        if (g5D != null) {
            return new C4042xq(g5D, g5D.f(), new wn0.a() { // from class: com.fourthline.orca.internal.qf1
                @Override // wn0.a
                public final Object invoke() {
                    return C3912uq.a(g5D, this);
                }
            });
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3869tq
    public G5 d() {
        Object next;
        Iterator it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p013kotlin.jvm.internal.s.f(((G5) next).c(), this.f35940b.h())) {
                return (G5) next;
            }
        }
        next = null;
        return (G5) next;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3869tq
    public X7 e() {
        return this.f35943e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3869tq
    public List b() {
        return this.f35942d;
    }

    public /* synthetic */ C3912uq(C4104z8 c4104z8, Kp kp2, KD kd2, List list, X7 x11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4104z8, kp2, kd2, list, (i11 & 16) != 0 ? c4104z8.o() : x11);
    }
}
