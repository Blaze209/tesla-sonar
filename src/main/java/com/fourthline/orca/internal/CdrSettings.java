package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Y3, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012 B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/Y3;", "", "", "seen0", "Lcom/fourthline/orca/internal/Ub;", "document", "Lcom/fourthline/orca/internal/Aq;", "person", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILcom/fourthline/orca/internal/Ub;Lcom/fourthline/orca/internal/Aq;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Y3;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/Ub;", "getDocument", "()Lcom/fourthline/orca/internal/Ub;", "b", "Lcom/fourthline/orca/internal/Aq;", "getPerson", "()Lcom/fourthline/orca/internal/Aq;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class CdrSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f29804c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSettings document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonSettings person;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Y3$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29808b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f29807a = aVar;
            f29808b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.CdrSettings", aVar, 2);
            m1Var.o("document", false);
            m1Var.o("person", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CdrSettings deserialize(uo0.e decoder) {
            DocumentSettings documentSettings;
            PersonSettings personSettings;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                documentSettings = (DocumentSettings) cVarB.n(fVar, 0, DocumentSettings.a.f28769a, null);
                personSettings = (PersonSettings) cVarB.n(fVar, 1, PersonSettings.a.f25022a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                documentSettings = null;
                PersonSettings personSettings2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        documentSettings = (DocumentSettings) cVarB.n(fVar, 0, DocumentSettings.a.f28769a, documentSettings);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        personSettings2 = (PersonSettings) cVarB.n(fVar, 1, PersonSettings.a.f25022a, personSettings2);
                        i12 |= 2;
                    }
                }
                personSettings = personSettings2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new CdrSettings(i11, documentSettings, personSettings, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{DocumentSettings.a.f28769a, PersonSettings.a.f25022a};
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
        public final void serialize(uo0.f encoder, CdrSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            CdrSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Y3$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<CdrSettings> serializer() {
            return a.f29807a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CdrSettings(int i11, DocumentSettings documentSettings, PersonSettings personSettings, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f29807a.getDescriptor());
        }
        this.document = documentSettings;
        this.person = personSettings;
    }

    public static final /* synthetic */ void a(CdrSettings self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, DocumentSettings.a.f28769a, self.document);
        output.D(serialDesc, 1, PersonSettings.a.f25022a, self.person);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CdrSettings)) {
            return false;
        }
        CdrSettings cdrSettings = (CdrSettings) other;
        return p013kotlin.jvm.internal.s.f(this.document, cdrSettings.document) && p013kotlin.jvm.internal.s.f(this.person, cdrSettings.person);
    }

    public int hashCode() {
        return (this.document.hashCode() * 31) + this.person.hashCode();
    }

    public String toString() {
        return "CdrSettings(document=" + this.document + ", person=" + this.person + ")";
    }
}
