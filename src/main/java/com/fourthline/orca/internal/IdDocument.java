package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ch, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u0017#B;\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR!\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010\u001c¨\u0006*"}, d2 = {"Lcom/fourthline/orca/internal/ch;", "", "", "Lcom/fourthline/orca/core/internal/backend/model/DocumentType;", "type", "", "Lcom/fourthline/orca/core/internal/backend/model/Country;", "nationalities", "nfcIssueDate", "", "validityPeriod", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/ch;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "I", "e", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class IdDocument {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30890e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f30891f = {null, new vo0.e(vo0.z1.f119730a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List nationalities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nfcIssueDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int validityPeriod;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ch$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30897b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f30896a = aVar;
            f30897b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.IdDocument", aVar, 4);
            m1Var.o("type", false);
            m1Var.o("nationalities", false);
            m1Var.o("nfcIssueDate", true);
            m1Var.o("validityPeriod", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdDocument deserialize(uo0.e decoder) {
            int iE;
            int i11;
            String str;
            List list;
            String str2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = IdDocument.f30891f;
            if (cVarB.i()) {
                String strT = cVarB.t(fVar, 0);
                List list2 = (List) cVarB.n(fVar, 1, dVarArr[1], null);
                String str3 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, null);
                list = list2;
                str = strT;
                iE = cVarB.e(fVar, 3);
                str2 = str3;
                i11 = 15;
            } else {
                boolean z11 = true;
                int iE2 = 0;
                String strT2 = null;
                List list3 = null;
                String str4 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT2 = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        list3 = (List) cVarB.n(fVar, 1, dVarArr[1], list3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str4 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, str4);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        iE2 = cVarB.e(fVar, 3);
                        i12 |= 8;
                    }
                }
                iE = iE2;
                i11 = i12;
                str = strT2;
                list = list3;
                str2 = str4;
            }
            cVarB.c(fVar);
            return new IdDocument(i11, str, list, str2, iE, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = IdDocument.f30891f;
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, dVarArr[1], so0.a.p(z1Var), vo0.j0.f119632a};
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
        public final void serialize(uo0.f encoder, IdDocument value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            IdDocument.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ch$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<IdDocument> serializer() {
            return a.f30896a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IdDocument(int i11, String str, List list, String str2, int i12, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f30896a.getDescriptor());
        }
        this.type = str;
        this.nationalities = list;
        if ((i11 & 4) == 0) {
            this.nfcIssueDate = null;
        } else {
            this.nfcIssueDate = str2;
        }
        if ((i11 & 8) == 0) {
            this.validityPeriod = 0;
        } else {
            this.validityPeriod = i12;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getNationalities() {
        return this.nationalities;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNfcIssueDate() {
        return this.nfcIssueDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getValidityPeriod() {
        return this.validityPeriod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdDocument)) {
            return false;
        }
        IdDocument idDocument = (IdDocument) other;
        return p013kotlin.jvm.internal.s.f(this.type, idDocument.type) && p013kotlin.jvm.internal.s.f(this.nationalities, idDocument.nationalities) && p013kotlin.jvm.internal.s.f(this.nfcIssueDate, idDocument.nfcIssueDate) && this.validityPeriod == idDocument.validityPeriod;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.nationalities.hashCode()) * 31;
        String str = this.nfcIssueDate;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.validityPeriod);
    }

    public String toString() {
        return "IdDocument(type=" + this.type + ", nationalities=" + this.nationalities + ", nfcIssueDate=" + this.nfcIssueDate + ", validityPeriod=" + this.validityPeriod + ")";
    }

    public IdDocument(String type, List nationalities, String str, int i11) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(nationalities, "nationalities");
        this.type = type;
        this.nationalities = nationalities;
        this.nfcIssueDate = str;
        this.validityPeriod = i11;
    }

    public static final /* synthetic */ void a(IdDocument self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f30891f;
        output.e(serialDesc, 0, self.type);
        output.D(serialDesc, 1, dVarArr[1], self.nationalities);
        if (output.G(serialDesc, 2) || self.nfcIssueDate != null) {
            output.y(serialDesc, 2, vo0.z1.f119730a, self.nfcIssueDate);
        }
        if (!output.G(serialDesc, 3) && self.validityPeriod == 0) {
            return;
        }
        output.x(serialDesc, 3, self.validityPeriod);
    }

    public /* synthetic */ IdDocument(String str, List list, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? 0 : i11);
    }
}
