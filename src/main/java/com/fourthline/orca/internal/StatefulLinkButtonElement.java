package com.fourthline.orca.internal;

import ezvcard.property.Gender;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oz, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0003 \u0014\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0014\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/oz;", "", "Lcom/fourthline/orca/internal/OA;", "message", "Lcom/fourthline/orca/internal/oz$c;", "default", "disabled", "<init>", "(Lcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/oz$c;Lcom/fourthline/orca/internal/oz$c;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/OA;Lcom/fourthline/orca/internal/oz$c;Lcom/fourthline/orca/internal/oz$c;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/oz;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/OA;", "c", "()Lcom/fourthline/orca/internal/OA;", "b", "Lcom/fourthline/orca/internal/oz$c;", "()Lcom/fourthline/orca/internal/oz$c;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class StatefulLinkButtonElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextElement message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LinkElement default;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkElement disabled;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oz$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34401b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f34400a = aVar;
            f34401b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulLinkButtonElement", aVar, 3);
            m1Var.o("message", false);
            m1Var.o("default", false);
            m1Var.o("disabled", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StatefulLinkButtonElement deserialize(uo0.e decoder) {
            int i11;
            TextElement textElement;
            LinkElement linkElement;
            LinkElement linkElement2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            TextElement textElement2 = null;
            if (cVarB.i()) {
                TextElement textElement3 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, null);
                LinkElement.a aVar = LinkElement.a.f34404a;
                LinkElement linkElement3 = (LinkElement) cVarB.n(fVar, 1, aVar, null);
                textElement = textElement3;
                linkElement2 = (LinkElement) cVarB.n(fVar, 2, aVar, null);
                linkElement = linkElement3;
                i11 = 7;
            } else {
                boolean z11 = true;
                int i12 = 0;
                LinkElement linkElement4 = null;
                LinkElement linkElement5 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        textElement2 = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, textElement2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        linkElement4 = (LinkElement) cVarB.n(fVar, 1, LinkElement.a.f34404a, linkElement4);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        linkElement5 = (LinkElement) cVarB.n(fVar, 2, LinkElement.a.f34404a, linkElement5);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                textElement = textElement2;
                linkElement = linkElement4;
                linkElement2 = linkElement5;
            }
            cVarB.c(fVar);
            return new StatefulLinkButtonElement(i11, textElement, linkElement, linkElement2, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            LinkElement.a aVar = LinkElement.a.f34404a;
            return new ro0.d[]{TextElement.a.f27138a, aVar, aVar};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, StatefulLinkButtonElement value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            StatefulLinkButtonElement.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oz$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<StatefulLinkButtonElement> serializer() {
            return a.f34400a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oz$c, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u0013 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/oz$c;", "", "Lcom/fourthline/orca/internal/OA;", "link", "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/OA;F)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/OA;FLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/oz$c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/OA;", "()Lcom/fourthline/orca/internal/OA;", "b", Gender.FEMALE, "()F", "getOpacity$annotations", "()V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class LinkElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextElement link;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float opacity;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.oz$c$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34404a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34405b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f34404a = aVar;
                f34405b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.common.StatefulLinkButtonElement.LinkElement", aVar, 2);
                m1Var.o("link", false);
                m1Var.o("link_opacity", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LinkElement deserialize(uo0.e decoder) {
                TextElement textElement;
                float fD;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                vo0.v1 v1Var = null;
                if (cVarB.i()) {
                    textElement = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, null);
                    fD = cVarB.D(fVar, 1);
                    i11 = 3;
                } else {
                    float fD2 = 0.0f;
                    boolean z11 = true;
                    int i12 = 0;
                    textElement = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            textElement = (TextElement) cVarB.n(fVar, 0, TextElement.a.f27138a, textElement);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            fD2 = cVarB.D(fVar, 1);
                            i12 |= 2;
                        }
                    }
                    fD = fD2;
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new LinkElement(i11, textElement, fD, v1Var);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{TextElement.a.f27138a, vo0.d0.f119601a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public final to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(uo0.f encoder, LinkElement value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                LinkElement.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.oz$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<LinkElement> serializer() {
                return a.f34404a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LinkElement(int i11, TextElement textElement, float f11, vo0.v1 v1Var) {
            if (3 != (i11 & 3)) {
                vo0.h1.b(i11, 3, a.f34404a.getDescriptor());
            }
            this.link = textElement;
            this.opacity = f11;
        }

        public static final /* synthetic */ void a(LinkElement self, uo0.d output, to0.f serialDesc) {
            output.D(serialDesc, 0, TextElement.a.f27138a, self.link);
            output.i(serialDesc, 1, self.opacity);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkElement)) {
                return false;
            }
            LinkElement linkElement = (LinkElement) other;
            return p013kotlin.jvm.internal.s.f(this.link, linkElement.link) && Float.compare(this.opacity, linkElement.opacity) == 0;
        }

        public int hashCode() {
            return (this.link.hashCode() * 31) + Float.hashCode(this.opacity);
        }

        public String toString() {
            return "LinkElement(link=" + this.link + ", opacity=" + this.opacity + ")";
        }

        public LinkElement(TextElement link, float f11) {
            p013kotlin.jvm.internal.s.k(link, "link");
            this.link = link;
            this.opacity = f11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextElement getLink() {
            return this.link;
        }
    }

    public /* synthetic */ StatefulLinkButtonElement(int i11, TextElement textElement, LinkElement linkElement, LinkElement linkElement2, vo0.v1 v1Var) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f34400a.getDescriptor());
        }
        this.message = textElement;
        this.default = linkElement;
        this.disabled = linkElement2;
    }

    public static final /* synthetic */ void a(StatefulLinkButtonElement self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, TextElement.a.f27138a, self.message);
        LinkElement.a aVar = LinkElement.a.f34404a;
        output.D(serialDesc, 1, aVar, self.default);
        output.D(serialDesc, 2, aVar, self.disabled);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LinkElement getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextElement getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatefulLinkButtonElement)) {
            return false;
        }
        StatefulLinkButtonElement statefulLinkButtonElement = (StatefulLinkButtonElement) other;
        return p013kotlin.jvm.internal.s.f(this.message, statefulLinkButtonElement.message) && p013kotlin.jvm.internal.s.f(this.default, statefulLinkButtonElement.default) && p013kotlin.jvm.internal.s.f(this.disabled, statefulLinkButtonElement.disabled);
    }

    public int hashCode() {
        return (((this.message.hashCode() * 31) + this.default.hashCode()) * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulLinkButtonElement(message=" + this.message + ", default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    public StatefulLinkButtonElement(TextElement message, LinkElement linkElement, LinkElement disabled) {
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(linkElement, "default");
        p013kotlin.jvm.internal.s.k(disabled, "disabled");
        this.message = message;
        this.default = linkElement;
        this.disabled = disabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LinkElement getDefault() {
        return this.default;
    }
}
