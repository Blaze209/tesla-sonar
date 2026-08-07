package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Gv implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f26012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f26013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Nh f26014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f26015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f26016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final QA f26017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f26019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final QA f26020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f26021j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f26022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f26023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f26024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Integer f26025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f26026e;

        public a(boolean z11, QA prefixText, QA actionText, Integer num) {
            p013kotlin.jvm.internal.s.k(prefixText, "prefixText");
            p013kotlin.jvm.internal.s.k(actionText, "actionText");
            this.f26022a = z11;
            this.f26023b = prefixText;
            this.f26024c = actionText;
            this.f26025d = num;
            this.f26026e = 30;
        }

        public final a a(boolean z11, QA prefixText, QA actionText, Integer num) {
            p013kotlin.jvm.internal.s.k(prefixText, "prefixText");
            p013kotlin.jvm.internal.s.k(actionText, "actionText");
            return new a(z11, prefixText, actionText, num);
        }

        public final Integer b() {
            return this.f26025d;
        }

        public final int c() {
            return this.f26026e;
        }

        public final QA d() {
            return this.f26023b;
        }

        public final boolean e() {
            return this.f26022a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26022a == aVar.f26022a && p013kotlin.jvm.internal.s.f(this.f26023b, aVar.f26023b) && p013kotlin.jvm.internal.s.f(this.f26024c, aVar.f26024c) && p013kotlin.jvm.internal.s.f(this.f26025d, aVar.f26025d);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.f26022a) * 31) + this.f26023b.hashCode()) * 31) + this.f26024c.hashCode()) * 31;
            Integer num = this.f26025d;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "SendAgain(isEnabled=" + this.f26022a + ", prefixText=" + this.f26023b + ", actionText=" + this.f26024c + ", counterValue=" + this.f26025d + ")";
        }

        public static /* synthetic */ a a(a aVar, boolean z11, QA qa2, QA qa3, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = aVar.f26022a;
            }
            if ((i11 & 2) != 0) {
                qa2 = aVar.f26023b;
            }
            if ((i11 & 4) != 0) {
                qa3 = aVar.f26024c;
            }
            if ((i11 & 8) != 0) {
                num = aVar.f26025d;
            }
            return aVar.a(z11, qa2, qa3, num);
        }

        public final QA a() {
            return this.f26024c;
        }

        public /* synthetic */ a(boolean z11, QA qa2, QA qa3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, qa2, qa3, (i11 & 8) != 0 ? null : num);
        }
    }

    public Gv(QA title, QA description, Nh codeInput, QA hint, a sendAgainSection, QA primaryButtonText, boolean z11, boolean z12, QA secondaryButtonText, boolean z13) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(codeInput, "codeInput");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(sendAgainSection, "sendAgainSection");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        this.f26012a = title;
        this.f26013b = description;
        this.f26014c = codeInput;
        this.f26015d = hint;
        this.f26016e = sendAgainSection;
        this.f26017f = primaryButtonText;
        this.f26018g = z11;
        this.f26019h = z12;
        this.f26020i = secondaryButtonText;
        this.f26021j = z13;
    }

    public final Gv a(QA title, QA description, Nh codeInput, QA hint, a sendAgainSection, QA primaryButtonText, boolean z11, boolean z12, QA secondaryButtonText, boolean z13) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(codeInput, "codeInput");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(sendAgainSection, "sendAgainSection");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        return new Gv(title, description, codeInput, hint, sendAgainSection, primaryButtonText, z11, z12, secondaryButtonText, z13);
    }

    public final QA b() {
        return this.f26013b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gv)) {
            return false;
        }
        Gv gv2 = (Gv) obj;
        return p013kotlin.jvm.internal.s.f(this.f26012a, gv2.f26012a) && p013kotlin.jvm.internal.s.f(this.f26013b, gv2.f26013b) && p013kotlin.jvm.internal.s.f(this.f26014c, gv2.f26014c) && p013kotlin.jvm.internal.s.f(this.f26015d, gv2.f26015d) && p013kotlin.jvm.internal.s.f(this.f26016e, gv2.f26016e) && p013kotlin.jvm.internal.s.f(this.f26017f, gv2.f26017f) && this.f26018g == gv2.f26018g && this.f26019h == gv2.f26019h && p013kotlin.jvm.internal.s.f(this.f26020i, gv2.f26020i) && this.f26021j == gv2.f26021j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f26012a.hashCode() * 31) + this.f26013b.hashCode()) * 31) + this.f26014c.hashCode()) * 31) + this.f26015d.hashCode()) * 31) + this.f26016e.hashCode()) * 31) + this.f26017f.hashCode()) * 31) + Boolean.hashCode(this.f26018g)) * 31) + Boolean.hashCode(this.f26019h)) * 31) + this.f26020i.hashCode()) * 31) + Boolean.hashCode(this.f26021j);
    }

    public final Nh p() {
        return this.f26014c;
    }

    public final QA q() {
        return this.f26015d;
    }

    public final a r() {
        return this.f26016e;
    }

    public final boolean s() {
        return this.f26019h;
    }

    public final boolean t() {
        return this.f26018g;
    }

    public String toString() {
        return "State(title=" + this.f26012a + ", description=" + this.f26013b + ", codeInput=" + this.f26014c + ", hint=" + this.f26015d + ", sendAgainSection=" + this.f26016e + ", primaryButtonText=" + this.f26017f + ", isPrimaryButtonInProgress=" + this.f26018g + ", isPrimaryButtonEnabled=" + this.f26019h + ", secondaryButtonText=" + this.f26020i + ", isSecondaryButtonEnabled=" + this.f26021j + ")";
    }

    public final boolean u() {
        return this.f26021j;
    }

    public static /* synthetic */ Gv a(Gv gv2, QA qa2, QA qa3, Nh nh2, QA qa4, a aVar, QA qa5, boolean z11, boolean z12, QA qa6, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = gv2.f26012a;
        }
        if ((i11 & 2) != 0) {
            qa3 = gv2.f26013b;
        }
        if ((i11 & 4) != 0) {
            nh2 = gv2.f26014c;
        }
        if ((i11 & 8) != 0) {
            qa4 = gv2.f26015d;
        }
        if ((i11 & 16) != 0) {
            aVar = gv2.f26016e;
        }
        if ((i11 & 32) != 0) {
            qa5 = gv2.f26017f;
        }
        if ((i11 & 64) != 0) {
            z11 = gv2.f26018g;
        }
        if ((i11 & 128) != 0) {
            z12 = gv2.f26019h;
        }
        if ((i11 & 256) != 0) {
            qa6 = gv2.f26020i;
        }
        if ((i11 & 512) != 0) {
            z13 = gv2.f26021j;
        }
        QA qa7 = qa6;
        boolean z14 = z13;
        boolean z15 = z11;
        boolean z16 = z12;
        a aVar2 = aVar;
        QA qa8 = qa5;
        return gv2.a(qa2, qa3, nh2, qa4, aVar2, qa8, z15, z16, qa7, z14);
    }

    public final QA a() {
        return this.f26012a;
    }
}
