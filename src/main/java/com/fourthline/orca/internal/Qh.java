package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Qh {
    Nh a(QD qd2, Sh sh2);

    QA a(Sh sh2, Th th2);

    Uh a(Sh sh2);

    InterfaceC3732qh j();

    Kh o();

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:8:0x0027  */
        public static Nh a(Qh qh2, QD receiver, Sh type, boolean z11) {
            Th thA;
            QA qaA;
            p013kotlin.jvm.internal.s.k(receiver, "$receiver");
            p013kotlin.jvm.internal.s.k(type, "type");
            if (z11) {
                Uh uhA = qh2.a(type);
                if (uhA instanceof Uh.a) {
                    thA = ((Uh.a) uhA).a();
                    qaA = qh2.a(type, thA);
                } else {
                    thA = null;
                    qaA = null;
                }
            } else {
                thA = null;
                qaA = null;
            }
            Nh nhA = Nh.a(qh2.a(receiver, type), null, null, false, qaA == null ? Gh.UNFOCUSED : Gh.ERROR, null, null, null, qaA == null ? QA.b.f27435b : qaA, qaA != null ? qh2.j().a(EnumC3689ph.C0) : null, null, 0, 1655, null);
            qh2.o().b(nhA);
            if (thA != null) {
                qh2.o().a(nhA, thA);
            }
            return nhA;
        }

        public static Nh a(Qh qh2, QD receiver, Sh type) {
            p013kotlin.jvm.internal.s.k(receiver, "$receiver");
            p013kotlin.jvm.internal.s.k(type, "type");
            return Nh.a(qh2.a(receiver, type), null, null, false, Gh.FOCUSED, null, null, null, QA.b.f27435b, null, null, 0, 1655, null);
        }
    }
}
