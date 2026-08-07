package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3645og {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.og$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f34274a;

        public b(c result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f34274a = result;
        }

        public final c a() {
            return this.f34274a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f34274a, ((b) obj).f34274a);
        }

        public int hashCode() {
            return this.f34274a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f34274a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.og$c */
    public interface c {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.og$c$a */
        public static final class a {
            public static Rf a(c cVar) {
                d dVar = cVar instanceof d ? (d) cVar : null;
                if (dVar != null) {
                    return dVar.c();
                }
                return null;
            }

            public static boolean b(c cVar) {
                return cVar instanceof C0595c;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.og$c$b */
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34275a = new b();

            private b() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3645og.c
            public Rf a() {
                return a.a(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3645og.c
            public boolean b() {
                return a.b(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.og$c$c, reason: collision with other inner class name */
        public static final class C0595c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0595c f34276a = new C0595c();

            private C0595c() {
            }

            @Override // com.fourthline.orca.internal.InterfaceC3645og.c
            public Rf a() {
                return a.a(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3645og.c
            public boolean b() {
                return a.b(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.og$c$d */
        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34277a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Rf f34278b;

            public d(String name, Rf rf2) {
                p013kotlin.jvm.internal.s.k(name, "name");
                this.f34277a = name;
                this.f34278b = rf2;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3645og.c
            public Rf a() {
                return a.a(this);
            }

            @Override // com.fourthline.orca.internal.InterfaceC3645og.c
            public boolean b() {
                return a.b(this);
            }

            public final Rf c() {
                return this.f34278b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p013kotlin.jvm.internal.s.f(this.f34277a, dVar.f34277a) && p013kotlin.jvm.internal.s.f(this.f34278b, dVar.f34278b);
            }

            public int hashCode() {
                int iHashCode = this.f34277a.hashCode() * 31;
                Rf rf2 = this.f34278b;
                return iHashCode + (rf2 == null ? 0 : rf2.hashCode());
            }

            public String toString() {
                return "StartNextFlow(name=" + this.f34277a + ", config=" + this.f34278b + ")";
            }
        }

        Rf a();

        boolean b();
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.og$d, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0014 B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%¨\u0006'"}, d2 = {"Lcom/fourthline/orca/internal/og$d;", "", "", "seen0", "", "name", "", "featureVariants", "Lkotlinx/serialization/json/JsonObject;", "configuration", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/og$d;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lkotlinx/serialization/json/JsonObject;", "()Lkotlinx/serialization/json/JsonObject;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class WhatsNextResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f34279d = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ro0.d[] f34280e = {null, new vo0.e(vo0.z1.f119730a), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List featureVariants;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final JsonObject configuration;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.og$d$a */
        public /* synthetic */ class a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34284a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34285b;
            private static final to0.f descriptor;

            static {
                a aVar = new a();
                f34284a = aVar;
                f34285b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.flow.whatsnext.FlowWhatsNextWorker.WhatsNextResponse", aVar, 3);
                m1Var.o("name", false);
                m1Var.o("featureVariants", true);
                m1Var.o("configuration", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WhatsNextResponse deserialize(uo0.e decoder) {
                int i11;
                String str;
                List list;
                JsonObject jsonObject;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                ro0.d[] dVarArr = WhatsNextResponse.f34280e;
                String strT = null;
                if (cVarB.i()) {
                    String strT2 = cVarB.t(fVar, 0);
                    list = (List) cVarB.n(fVar, 1, dVarArr[1], null);
                    str = strT2;
                    jsonObject = (JsonObject) cVarB.v(fVar, 2, wo0.c0.f122112a, null);
                    i11 = 7;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    List list2 = null;
                    JsonObject jsonObject2 = null;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            strT = cVarB.t(fVar, 0);
                            i12 |= 1;
                        } else if (iA == 1) {
                            list2 = (List) cVarB.n(fVar, 1, dVarArr[1], list2);
                            i12 |= 2;
                        } else {
                            if (iA != 2) {
                                throw new UnknownFieldException(iA);
                            }
                            jsonObject2 = (JsonObject) cVarB.v(fVar, 2, wo0.c0.f122112a, jsonObject2);
                            i12 |= 4;
                        }
                    }
                    i11 = i12;
                    str = strT;
                    list = list2;
                    jsonObject = jsonObject2;
                }
                cVarB.c(fVar);
                return new WhatsNextResponse(i11, str, list, jsonObject, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.z1.f119730a, WhatsNextResponse.f34280e[1], so0.a.p(wo0.c0.f122112a)};
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
            public final void serialize(uo0.f encoder, WhatsNextResponse value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                WhatsNextResponse.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.og$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<WhatsNextResponse> serializer() {
                return a.f34284a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ WhatsNextResponse(int i11, String str, List list, JsonObject jsonObject, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, a.f34284a.getDescriptor());
            }
            this.name = str;
            if ((i11 & 2) == 0) {
                this.featureVariants = p013kotlin.collections.v.m();
            } else {
                this.featureVariants = list;
            }
            if ((i11 & 4) == 0) {
                this.configuration = null;
            } else {
                this.configuration = jsonObject;
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final JsonObject getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getFeatureVariants() {
            return this.featureVariants;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhatsNextResponse)) {
                return false;
            }
            WhatsNextResponse whatsNextResponse = (WhatsNextResponse) other;
            return p013kotlin.jvm.internal.s.f(this.name, whatsNextResponse.name) && p013kotlin.jvm.internal.s.f(this.featureVariants, whatsNextResponse.featureVariants) && p013kotlin.jvm.internal.s.f(this.configuration, whatsNextResponse.configuration);
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.featureVariants.hashCode()) * 31;
            JsonObject jsonObject = this.configuration;
            return iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode());
        }

        public String toString() {
            return "WhatsNextResponse(name=" + this.name + ", featureVariants=" + this.featureVariants + ", configuration=" + this.configuration + ")";
        }

        public static final /* synthetic */ void a(WhatsNextResponse self, uo0.d output, to0.f serialDesc) {
            ro0.d[] dVarArr = f34280e;
            output.e(serialDesc, 0, self.name);
            if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.featureVariants, p013kotlin.collections.v.m())) {
                output.D(serialDesc, 1, dVarArr[1], self.featureVariants);
            }
            if (!output.G(serialDesc, 2) && self.configuration == null) {
                return;
            }
            output.y(serialDesc, 2, wo0.c0.f122112a, self.configuration);
        }
    }

    Object a(a aVar, Continuation continuation);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.og$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WorkflowConfigurationResponse f34273a;

        public a(WorkflowConfigurationResponse workflowConfigurationResponse) {
            this.f34273a = workflowConfigurationResponse;
        }

        public final WorkflowConfigurationResponse a() {
            return this.f34273a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f34273a, ((a) obj).f34273a);
        }

        public int hashCode() {
            WorkflowConfigurationResponse workflowConfigurationResponse = this.f34273a;
            if (workflowConfigurationResponse == null) {
                return 0;
            }
            return workflowConfigurationResponse.hashCode();
        }

        public String toString() {
            return "Input(workflowTenantConfig=" + this.f34273a + ")";
        }

        public /* synthetic */ a(WorkflowConfigurationResponse workflowConfigurationResponse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : workflowConfigurationResponse);
        }
    }
}
