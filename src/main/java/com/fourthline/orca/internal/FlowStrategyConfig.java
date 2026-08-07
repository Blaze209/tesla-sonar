package com.fourthline.orca.internal;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lg, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\u0012\"B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/lg;", "", "", "", "values", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/lg;Luo0/d;Lto0/f;)V", "strategy", "", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class FlowStrategyConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33313b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ro0.d[] f33314c = {new vo0.e(vo0.z1.f119730a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List values;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lg$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33317b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33316a = aVar;
            f33317b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.flow.model.FlowStrategyConfig", aVar, 1);
            m1Var.o("values", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FlowStrategyConfig deserialize(uo0.e decoder) {
            List list;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = FlowStrategyConfig.f33314c;
            int i11 = 1;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                list = (List) cVarB.n(fVar, 0, dVarArr[0], null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(fVar, 0, dVarArr[0], list2);
                        i12 = 1;
                    }
                }
                list = list2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new FlowStrategyConfig(i11, list, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{FlowStrategyConfig.f33314c[0]};
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
        public final void serialize(uo0.f encoder, FlowStrategyConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            FlowStrategyConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lg$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<FlowStrategyConfig> serializer() {
            return a.f33316a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FlowStrategyConfig(int i11, List list, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.values = p013kotlin.collections.v.m();
        } else {
            this.values = list;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FlowStrategyConfig) && p013kotlin.jvm.internal.s.f(this.values, ((FlowStrategyConfig) other).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "FlowStrategyConfig(values=" + this.values + ")";
    }

    public static final /* synthetic */ void a(FlowStrategyConfig self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f33314c;
        if (!output.G(serialDesc, 0) && p013kotlin.jvm.internal.s.f(self.values, p013kotlin.collections.v.m())) {
            return;
        }
        output.D(serialDesc, 0, dVarArr[0], self.values);
    }

    public FlowStrategyConfig(List values) {
        p013kotlin.jvm.internal.s.k(values, "values");
        this.values = values;
    }

    public final boolean a(String strategy) {
        p013kotlin.jvm.internal.s.k(strategy, "strategy");
        return this.values.contains(strategy);
    }

    public /* synthetic */ FlowStrategyConfig(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list);
    }
}
