package qo0;

import jn0.h0;
import jn0.m;
import jn0.p;
import kotlinx.serialization.MissingFieldException;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import vo0.s0;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lqo0/i;", "Lro0/d;", "Lko0/a$e;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lko0/a$e;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lko0/a$e;", "Lto0/f;", "Lkotlin/Lazy;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements ro0.d<ko0.a.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f105820a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy descriptor = m.a(p.PUBLICATION, a.f105822c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lto0/f;", "b", "()Lto0/f;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<to0.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f105822c = new a();

        /* JADX INFO: renamed from: qo0.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lto0/a;", "Ljn0/h0;", "a", "(Lto0/a;)V"}, k = 3, mv = {1, 9, 0})
        static final class C2249a extends u implements l<to0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2249a f105823c = new C2249a();

            C2249a() {
                super(1);
            }

            public final void a(to0.a buildClassSerialDescriptor) {
                s.k(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                buildClassSerialDescriptor.a("nanoseconds", s0.f119686a.getDescriptor(), v.m(), false);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(to0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final to0.f invoke() {
            return to0.m.d("kotlinx.datetime.TimeBased", new to0.f[0], C2249a.f105823c);
        }
    }

    private i() {
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ko0.a.e deserialize(uo0.e decoder) {
        long j11;
        s.k(decoder, "decoder");
        to0.f descriptor2 = getDescriptor();
        uo0.c cVarB = decoder.b(descriptor2);
        boolean z11 = true;
        if (!cVarB.i()) {
            long j12 = 0;
            boolean z12 = false;
            while (true) {
                i iVar = f105820a;
                int iA = cVarB.A(iVar.getDescriptor());
                if (iA == -1) {
                    z11 = z12;
                    j11 = j12;
                    break;
                }
                if (iA != 0) {
                    c.a(iA);
                    throw new KotlinNothingValueException();
                }
                j12 = cVarB.j(iVar.getDescriptor(), 0);
                z12 = true;
            }
        } else {
            j11 = cVarB.j(f105820a.getDescriptor(), 0);
        }
        h0 h0Var = h0.f84049a;
        cVarB.c(descriptor2);
        if (z11) {
            return new ko0.a.e(j11);
        }
        throw new MissingFieldException("nanoseconds", getDescriptor().getSerialName());
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, ko0.a.e value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        to0.f descriptor2 = getDescriptor();
        uo0.d dVarB = encoder.b(descriptor2);
        dVarB.z(f105820a.getDescriptor(), 0, value.getNanoseconds());
        dVarB.c(descriptor2);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return (to0.f) descriptor.getValue();
    }
}
