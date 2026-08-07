package com.stripe.android.financialconnections.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.s, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u001e$B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010#\u001a\u0004\b$\u0010&¨\u0006)"}, d2 = {"Lcom/stripe/android/financialconnections/model/s;", "", "", "showManualEntry", "", "Lcom/stripe/android/financialconnections/model/q;", "data", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/model/s;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "getShowManualEntry$annotations", "()V", "b", "Ljava/util/List;", "()Ljava/util/List;", "getData$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class InstitutionResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f50553c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d<Object>[] f50554d = {null, new vo0.e(FinancialConnectionsInstitution.a.f50550a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean showManualEntry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FinancialConnectionsInstitution> data;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.s$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/InstitutionResponse.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/s;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/s;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/s;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<InstitutionResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50557a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50557a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.InstitutionResponse", aVar, 2);
            m1Var.o("show_manual_entry", true);
            m1Var.o("data", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstitutionResponse deserialize(uo0.e decoder) {
            List list;
            Boolean bool;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = InstitutionResponse.f50554d;
            v1 v1Var = null;
            if (cVarB.i()) {
                bool = (Boolean) cVarB.v(descriptor2, 0, vo0.h.f119620a, null);
                list = (List) cVarB.n(descriptor2, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                Boolean bool2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        bool2 = (Boolean) cVarB.v(descriptor2, 0, vo0.h.f119620a, bool2);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(descriptor2, 1, dVarArr[1], list2);
                        i12 |= 2;
                    }
                }
                list = list2;
                bool = bool2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new InstitutionResponse(i11, bool, list, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, InstitutionResponse value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            InstitutionResponse.d(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{so0.a.p(vo0.h.f119620a), InstitutionResponse.f50554d[1]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.s$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/s$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/s;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<InstitutionResponse> serializer() {
            return a.f50557a;
        }

        private Companion() {
        }
    }

    @jn0.e
    public /* synthetic */ InstitutionResponse(int i11, @ro0.o("show_manual_entry") Boolean bool, @ro0.o("data") List list, v1 v1Var) {
        if (2 != (i11 & 2)) {
            h1.b(i11, 2, a.f50557a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.showManualEntry = Boolean.FALSE;
        } else {
            this.showManualEntry = bool;
        }
        this.data = list;
    }

    public static final /* synthetic */ void d(InstitutionResponse self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50554d;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.showManualEntry, Boolean.FALSE)) {
            output.y(serialDesc, 0, vo0.h.f119620a, self.showManualEntry);
        }
        output.D(serialDesc, 1, dVarArr[1], self.data);
    }

    public final List<FinancialConnectionsInstitution> b() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getShowManualEntry() {
        return this.showManualEntry;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionResponse)) {
            return false;
        }
        InstitutionResponse institutionResponse = (InstitutionResponse) other;
        return p013kotlin.jvm.internal.s.f(this.showManualEntry, institutionResponse.showManualEntry) && p013kotlin.jvm.internal.s.f(this.data, institutionResponse.data);
    }

    public int hashCode() {
        Boolean bool = this.showManualEntry;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "InstitutionResponse(showManualEntry=" + this.showManualEntry + ", data=" + this.data + ")";
    }

    public InstitutionResponse(Boolean bool, List<FinancialConnectionsInstitution> data) {
        p013kotlin.jvm.internal.s.k(data, "data");
        this.showManualEntry = bool;
        this.data = data;
    }
}
