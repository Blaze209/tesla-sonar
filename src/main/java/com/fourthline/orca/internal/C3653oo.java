package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3653oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f34334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f34335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f34336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f34337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f34338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f34339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f34340g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oo$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f34341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f34342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f34343c;

        public /* synthetic */ a(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, j13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k3.p1.r(this.f34341a, aVar.f34341a) && k3.p1.r(this.f34342b, aVar.f34342b) && k3.p1.r(this.f34343c, aVar.f34343c);
        }

        public int hashCode() {
            return (((k3.p1.x(this.f34341a) * 31) + k3.p1.x(this.f34342b)) * 31) + k3.p1.x(this.f34343c);
        }

        public String toString() {
            return "OrcaButton(textColor=" + k3.p1.y(this.f34341a) + ", backgroundColor=" + k3.p1.y(this.f34342b) + ", borderColor=" + k3.p1.y(this.f34343c) + ")";
        }

        private a(long j11, long j12, long j13) {
            this.f34341a = j11;
            this.f34342b = j12;
            this.f34343c = j13;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oo$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f34344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f34345b;

        public /* synthetic */ b(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k3.p1.r(this.f34344a, bVar.f34344a) && k3.p1.r(this.f34345b, bVar.f34345b);
        }

        public int hashCode() {
            return (k3.p1.x(this.f34344a) * 31) + k3.p1.x(this.f34345b);
        }

        public String toString() {
            return "OrcaCheckbox(tintColor=" + k3.p1.y(this.f34344a) + ", iconColor=" + k3.p1.y(this.f34345b) + ")";
        }

        private b(long j11, long j12) {
            this.f34344a = j11;
            this.f34345b = j12;
        }
    }

    public /* synthetic */ C3653oo(a aVar, a aVar2, a aVar3, a aVar4, b bVar, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, aVar3, aVar4, bVar, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3653oo)) {
            return false;
        }
        C3653oo c3653oo = (C3653oo) obj;
        return p013kotlin.jvm.internal.s.f(this.f34334a, c3653oo.f34334a) && p013kotlin.jvm.internal.s.f(this.f34335b, c3653oo.f34335b) && p013kotlin.jvm.internal.s.f(this.f34336c, c3653oo.f34336c) && p013kotlin.jvm.internal.s.f(this.f34337d, c3653oo.f34337d) && p013kotlin.jvm.internal.s.f(this.f34338e, c3653oo.f34338e) && k3.p1.r(this.f34339f, c3653oo.f34339f) && k3.p1.r(this.f34340g, c3653oo.f34340g);
    }

    public int hashCode() {
        return (((((((((((this.f34334a.hashCode() * 31) + this.f34335b.hashCode()) * 31) + this.f34336c.hashCode()) * 31) + this.f34337d.hashCode()) * 31) + this.f34338e.hashCode()) * 31) + k3.p1.x(this.f34339f)) * 31) + k3.p1.x(this.f34340g);
    }

    public String toString() {
        return "OrcaButtons(primary=" + this.f34334a + ", secondary=" + this.f34335b + ", scannerPrimary=" + this.f34336c + ", scannerSecondary=" + this.f34337d + ", checkbox=" + this.f34338e + ", linkButtonColor=" + k3.p1.y(this.f34339f) + ", backButtonColor=" + k3.p1.y(this.f34340g) + ")";
    }

    private C3653oo(a primary, a secondary, a scannerPrimary, a scannerSecondary, b checkbox, long j11, long j12) {
        p013kotlin.jvm.internal.s.k(primary, "primary");
        p013kotlin.jvm.internal.s.k(secondary, "secondary");
        p013kotlin.jvm.internal.s.k(scannerPrimary, "scannerPrimary");
        p013kotlin.jvm.internal.s.k(scannerSecondary, "scannerSecondary");
        p013kotlin.jvm.internal.s.k(checkbox, "checkbox");
        this.f34334a = primary;
        this.f34335b = secondary;
        this.f34336c = scannerPrimary;
        this.f34337d = scannerSecondary;
        this.f34338e = checkbox;
        this.f34339f = j11;
        this.f34340g = j12;
    }
}
