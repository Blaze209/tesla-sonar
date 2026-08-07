package p015o1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.r1;
import l3.c;
import l3.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p019p1.p;
import p019p1.p1;
import wn0.l;

/* JADX INFO: renamed from: o1.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\",\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0000*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Ll3/c;", "Lp1/p1;", "Lk3/p1;", "Lp1/p;", "a", "Lwn0/l;", "ColorToVector", "Lk3/p1$a;", "(Lk3/p1$a;)Lwn0/l;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<c, p1<k3.p1, p>> f95646a = a.f95647c;

    /* JADX INFO: renamed from: o1.h$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll3/c;", "colorSpace", "Lp1/p1;", "Lk3/p1;", "Lp1/p;", "a", "(Ll3/c;)Lp1/p1;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<c, p1<k3.p1, p>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f95647c = new a();

        /* JADX INFO: renamed from: o1.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/p1;", "color", "Lp1/p;", "a", "(J)Lp1/p;"}, k = 3, mv = {1, 8, 0})
        static final class C2041a extends u implements l<k3.p1, p> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2041a f95648c = new C2041a();

            C2041a() {
                super(1);
            }

            public final p a(long j11) {
                long jN = k3.p1.n(j11, g.f89510a.t());
                return new p(k3.p1.s(jN), k3.p1.w(jN), k3.p1.v(jN), k3.p1.t(jN));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ p invoke(k3.p1 p1Var) {
                return a(p1Var.getValue());
            }
        }

        /* JADX INFO: renamed from: o1.h$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/p;", "vector", "Lk3/p1;", "a", "(Lp1/p;)J"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements l<p, k3.p1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f95649c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(1);
                this.f95649c = cVar;
            }

            public final long a(p pVar) {
                float v11 = pVar.getV2();
                float f11 = BitmapDescriptorFactory.HUE_RED;
                if (v11 < BitmapDescriptorFactory.HUE_RED) {
                    v11 = 0.0f;
                }
                if (v11 > 1.0f) {
                    v11 = 1.0f;
                }
                float v12 = pVar.getV3();
                if (v12 < -0.5f) {
                    v12 = -0.5f;
                }
                if (v12 > 0.5f) {
                    v12 = 0.5f;
                }
                float v13 = pVar.getV4();
                float f12 = v13 >= -0.5f ? v13 : -0.5f;
                float f13 = f12 <= 0.5f ? f12 : 0.5f;
                float v14 = pVar.getV1();
                if (v14 >= BitmapDescriptorFactory.HUE_RED) {
                    f11 = v14;
                }
                return k3.p1.n(r1.a(v11, v12, f13, f11 <= 1.0f ? f11 : 1.0f, g.f89510a.t()), this.f95649c);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ k3.p1 invoke(p pVar) {
                return k3.p1.l(a(pVar));
            }
        }

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p1<k3.p1, p> invoke(c cVar) {
            return p019p1.r1.a(C2041a.f95648c, new b(cVar));
        }
    }

    public static final l<c, p1<k3.p1, p>> a(k3.p1.Companion companion) {
        return f95646a;
    }
}
