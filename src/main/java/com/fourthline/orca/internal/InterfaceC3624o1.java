package com.fourthline.orca.internal;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3624o1 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o1$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/o1$a;", "", "", "match", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/o1$a;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getMatch", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class BavConfirmIbanResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean match;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0592a implements vo0.e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0592a f34032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34033b;
            private static final to0.f descriptor;

            static {
                C0592a c0592a = new C0592a();
                f34032a = c0592a;
                f34033b = 8;
                vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.bav.internal.worker.BavConfirmIbanWorker.BavConfirmIbanResult", c0592a, 1);
                m1Var.o("match", false);
                descriptor = m1Var;
            }

            private C0592a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BavConfirmIbanResult deserialize(uo0.e decoder) {
                boolean zW;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f fVar = descriptor;
                uo0.c cVarB = decoder.b(fVar);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(fVar, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(fVar);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(fVar, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(fVar);
                return new BavConfirmIbanResult(i11, zW, null);
            }

            @Override // vo0.e0
            public final ro0.d[] childSerializers() {
                return new ro0.d[]{vo0.h.f119620a};
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
            public final void serialize(uo0.f encoder, BavConfirmIbanResult value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f fVar = descriptor;
                uo0.d dVarB = encoder.b(fVar);
                BavConfirmIbanResult.a(value, dVarB, fVar);
                dVarB.c(fVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o1$a$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<BavConfirmIbanResult> serializer() {
                return C0592a.f34032a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ BavConfirmIbanResult(int i11, boolean z11, vo0.v1 v1Var) {
            if (1 != (i11 & 1)) {
                vo0.h1.b(i11, 1, C0592a.f34032a.getDescriptor());
            }
            this.match = z11;
        }

        public static final /* synthetic */ void a(BavConfirmIbanResult self, uo0.d output, to0.f serialDesc) {
            output.A(serialDesc, 0, self.match);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BavConfirmIbanResult) && this.match == ((BavConfirmIbanResult) other).match;
        }

        public int hashCode() {
            return Boolean.hashCode(this.match);
        }

        public String toString() {
            return "BavConfirmIbanResult(match=" + this.match + ")";
        }

        public BavConfirmIbanResult(boolean z11) {
            this.match = z11;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o1$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34035b;

        public b(String workflowId, String iban) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(iban, "iban");
            this.f34034a = workflowId;
            this.f34035b = iban;
        }

        public final String a() {
            return this.f34034a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f34034a, bVar.f34034a) && p013kotlin.jvm.internal.s.f(this.f34035b, bVar.f34035b);
        }

        public int hashCode() {
            return (this.f34034a.hashCode() * 31) + this.f34035b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f34034a + ", iban=" + this.f34035b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o1$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BavConfirmIbanResult f34036a;

        public c(BavConfirmIbanResult result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f34036a = result;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f34036a, ((c) obj).f34036a);
        }

        public int hashCode() {
            return this.f34036a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f34036a + ")";
        }
    }

    Object a(b bVar, Continuation continuation);
}
