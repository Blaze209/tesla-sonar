package androidx.compose.animation;

import androidx.collection.k0;
import androidx.collection.u0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p015o1.v;
import p019p1.g0;
import p019p1.l1;
import p019p1.m1;
import p019p1.r1;
import p020r2.n3;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import w4.r;
import w4.s;
import w4.t;
import z3.j0;
import z3.t0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0019'B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R1\u00109\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R,\u0010@\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0;0:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R*\u0010G\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010K\u001a\u00020H*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010M\u001a\u00020H*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u001a\u0010\r\u001a\u00020\u000b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u00106R\u0014\u0010Q\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T²\u0006\u0014\u0010S\u001a\u00020H\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/e;", "S", "Landroidx/compose/animation/d;", "Lp1/l1;", "transition", "Ld3/c;", "contentAlignment", "Lw4/t;", "layoutDirection", "<init>", "(Lp1/l1;Ld3/c;Lw4/t;)V", "Lw4/r;", "fullSize", "currentSize", "Lw4/n;", IntegerTokenConverter.CONVERTER_KEY, "(JJ)J", "Landroidx/compose/animation/d$a;", "towards", "Lp1/g0;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/i;", "a", "(ILp1/g0;Lwn0/l;)Landroidx/compose/animation/i;", "targetOffset", "Landroidx/compose/animation/k;", "c", "(ILp1/g0;Lwn0/l;)Landroidx/compose/animation/k;", "Lo1/i;", "contentTransform", "Landroidx/compose/ui/d;", "j", "(Lo1/i;Lr2/l;I)Landroidx/compose/ui/d;", "Lp1/l1;", "q", "()Lp1/l1;", "b", "Ld3/c;", "m", "()Ld3/c;", "u", "(Ld3/c;)V", "Lw4/t;", "getLayoutDirection$animation_release", "()Lw4/t;", "v", "(Lw4/t;)V", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Lr2/p1;", "o", "()J", "w", "(J)V", "measuredSize", "Landroidx/collection/k0;", "Lr2/y3;", "e", "Landroidx/collection/k0;", "p", "()Landroidx/collection/k0;", "targetSizeMap", "f", "Lr2/y3;", "getAnimatedSize$animation_release", "()Lr2/y3;", "t", "(Lr2/y3;)V", "animatedSize", "", "r", "(I)Z", "isLeft", "s", "isRight", "n", "getInitialState", "()Ljava/lang/Object;", "initialState", "targetState", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e<S> implements androidx.compose.animation.d<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l1<S> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d3.c contentAlignment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 measuredSize = s3.d(r.b(r.INSTANCE.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0<S, y3<r>> targetSizeMap = u0.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private y3<r> animatedSize;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B5\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/e$b;", "Lo1/r;", "Lp1/l1$a;", "Lw4/r;", "Lp1/n;", "Lp1/l1;", "sizeAnimation", "Lr2/y3;", "Lo1/v;", "sizeTransform", "<init>", "(Landroidx/compose/animation/e;Lp1/l1$a;Lr2/y3;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "b", "Lp1/l1$a;", "getSizeAnimation", "()Lp1/l1$a;", "Lr2/y3;", IntegerTokenConverter.CONVERTER_KEY, "()Lr2/y3;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends p015o1.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final l1<S>.a<r, p019p1.n> sizeAnimation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final y3<v> sizeTransform;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e<S> f4032c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ w0 f4033d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f4034e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e<S> eVar, w0 w0Var, long j11) {
                super(1);
                this.f4032c = eVar;
                this.f4033d = w0Var;
                this.f4034e = j11;
            }

            public final void a(w0.a aVar) {
                w0.a.j(aVar, this.f4033d, this.f4032c.getContentAlignment().a(s.a(this.f4033d.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), this.f4033d.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()), this.f4034e, t.Ltr), BitmapDescriptorFactory.HUE_RED, 2, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "Lp1/l1$b;", "Lp1/g0;", "Lw4/r;", "a", "(Lp1/l1$b;)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
        static final class C0081b extends u implements wn0.l<l1.b<S>, g0<r>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e<S> f4035c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e<S>.b f4036d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0081b(e<S> eVar, e<S>.b bVar) {
                super(1);
                this.f4035c = eVar;
                this.f4036d = bVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0<r> invoke(l1.b<S> bVar) {
                g0<r> g0VarA;
                y3<r> y3VarC = this.f4035c.p().c(bVar.getInitialState());
                long packedValue = y3VarC != null ? y3VarC.getValue().getPackedValue() : r.INSTANCE.a();
                y3<r> y3VarC2 = this.f4035c.p().c(bVar.e());
                long packedValue2 = y3VarC2 != null ? y3VarC2.getValue().getPackedValue() : r.INSTANCE.a();
                v value = this.f4036d.i().getValue();
                return (value == null || (g0VarA = value.a(packedValue, packedValue2)) == null) ? p019p1.j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null) : g0VarA;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "Lw4/r;", "b", "(Ljava/lang/Object;)J"}, k = 3, mv = {1, 8, 0})
        static final class c extends u implements wn0.l<S, r> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e<S> f4037c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e<S> eVar) {
                super(1);
                this.f4037c = eVar;
            }

            public final long b(S s11) {
                y3<r> y3VarC = this.f4037c.p().c(s11);
                return y3VarC != null ? y3VarC.getValue().getPackedValue() : r.INSTANCE.a();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                return r.b(b(obj));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(l1<S>.a<r, p019p1.n> aVar, y3<? extends v> y3Var) {
            this.sizeAnimation = aVar;
            this.sizeTransform = y3Var;
        }

        @Override // z3.b0
        public j0 c(z3.k0 k0Var, z3.h0 h0Var, long j11) {
            w0 w0VarX0 = h0Var.x0(j11);
            y3<r> y3VarA = this.sizeAnimation.a(new C0081b(e.this, this), new c(e.this));
            e.this.t(y3VarA);
            long jA = k0Var.d1() ? s.a(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) : y3VarA.getValue().getPackedValue();
            return z3.k0.N1(k0Var, r.g(jA), r.f(jA), null, new a(e.this, w0VarX0, jA), 4, null);
        }

        public final y3<v> i() {
            return this.sizeTransform;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<S> f4039d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f4038c = lVar;
            this.f4039d = eVar;
        }

        public final Integer a(int i11) {
            return this.f4038c.invoke(Integer.valueOf(r.g(this.f4039d.n()) - w4.n.h(this.f4039d.i(s.a(i11, i11), this.f4039d.n()))));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<S> f4041d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(wn0.l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f4040c = lVar;
            this.f4041d = eVar;
        }

        public final Integer a(int i11) {
            return this.f4040c.invoke(Integer.valueOf((-w4.n.h(this.f4041d.i(s.a(i11, i11), this.f4041d.n()))) - i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class C0082e extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<S> f4043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0082e(wn0.l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f4042c = lVar;
            this.f4043d = eVar;
        }

        public final Integer a(int i11) {
            return this.f4042c.invoke(Integer.valueOf(r.f(this.f4043d.n()) - w4.n.i(this.f4043d.i(s.a(i11, i11), this.f4043d.n()))));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<S> f4045d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(wn0.l<? super Integer, Integer> lVar, e<S> eVar) {
            super(1);
            this.f4044c = lVar;
            this.f4045d = eVar;
        }

        public final Integer a(int i11) {
            return this.f4044c.invoke(Integer.valueOf((-w4.n.i(this.f4045d.i(s.a(i11, i11), this.f4045d.n()))) - i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<S> f4046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4047d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(e<S> eVar, wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4046c = eVar;
            this.f4047d = lVar;
        }

        public final Integer a(int i11) {
            y3 y3Var = (y3) this.f4046c.p().c(this.f4046c.q().p());
            return this.f4047d.invoke(Integer.valueOf((-w4.n.h(this.f4046c.i(s.a(i11, i11), y3Var != null ? ((r) y3Var.getValue()).getPackedValue() : r.INSTANCE.a()))) - i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<S> f4048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(e<S> eVar, wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4048c = eVar;
            this.f4049d = lVar;
        }

        public final Integer a(int i11) {
            y3 y3Var = (y3) this.f4048c.p().c(this.f4048c.q().p());
            long packedValue = y3Var != null ? ((r) y3Var.getValue()).getPackedValue() : r.INSTANCE.a();
            return this.f4049d.invoke(Integer.valueOf((-w4.n.h(this.f4048c.i(s.a(i11, i11), packedValue))) + r.g(packedValue)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<S> f4050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4051d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(e<S> eVar, wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4050c = eVar;
            this.f4051d = lVar;
        }

        public final Integer a(int i11) {
            y3 y3Var = (y3) this.f4050c.p().c(this.f4050c.q().p());
            return this.f4051d.invoke(Integer.valueOf((-w4.n.i(this.f4050c.i(s.a(i11, i11), y3Var != null ? ((r) y3Var.getValue()).getPackedValue() : r.INSTANCE.a()))) - i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<S> f4052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4053d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(e<S> eVar, wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4052c = eVar;
            this.f4053d = lVar;
        }

        public final Integer a(int i11) {
            y3 y3Var = (y3) this.f4052c.p().c(this.f4052c.q().p());
            long packedValue = y3Var != null ? ((r) y3Var.getValue()).getPackedValue() : r.INSTANCE.a();
            return this.f4053d.invoke(Integer.valueOf((-w4.n.i(this.f4052c.i(s.a(i11, i11), packedValue))) + r.f(packedValue)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public e(l1<S> l1Var, d3.c cVar, t tVar) {
        this.transition = l1Var;
        this.contentAlignment = cVar;
        this.layoutDirection = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long i(long fullSize, long currentSize) {
        return getContentAlignment().a(fullSize, currentSize, t.Ltr);
    }

    private static final boolean k(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    private static final void l(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long n() {
        y3<r> y3Var = this.animatedSize;
        return y3Var != null ? y3Var.getValue().getPackedValue() : o();
    }

    private final boolean r(int i11) {
        androidx.compose.animation.d.a.Companion companion = androidx.compose.animation.d.a.INSTANCE;
        if (androidx.compose.animation.d.a.h(i11, companion.c())) {
            return true;
        }
        if (androidx.compose.animation.d.a.h(i11, companion.e()) && this.layoutDirection == t.Ltr) {
            return true;
        }
        return androidx.compose.animation.d.a.h(i11, companion.b()) && this.layoutDirection == t.Rtl;
    }

    private final boolean s(int i11) {
        androidx.compose.animation.d.a.Companion companion = androidx.compose.animation.d.a.INSTANCE;
        if (androidx.compose.animation.d.a.h(i11, companion.d())) {
            return true;
        }
        if (androidx.compose.animation.d.a.h(i11, companion.e()) && this.layoutDirection == t.Rtl) {
            return true;
        }
        return androidx.compose.animation.d.a.h(i11, companion.b()) && this.layoutDirection == t.Ltr;
    }

    @Override // androidx.compose.animation.d
    public androidx.compose.animation.i a(int towards, g0<w4.n> animationSpec, wn0.l<? super Integer, Integer> initialOffset) {
        if (r(towards)) {
            return androidx.compose.animation.g.w(animationSpec, new c(initialOffset, this));
        }
        if (s(towards)) {
            return androidx.compose.animation.g.w(animationSpec, new d(initialOffset, this));
        }
        androidx.compose.animation.d.a.Companion companion = androidx.compose.animation.d.a.INSTANCE;
        if (androidx.compose.animation.d.a.h(towards, companion.f())) {
            return androidx.compose.animation.g.x(animationSpec, new C0082e(initialOffset, this));
        }
        return androidx.compose.animation.d.a.h(towards, companion.a()) ? androidx.compose.animation.g.x(animationSpec, new f(initialOffset, this)) : androidx.compose.animation.i.INSTANCE.a();
    }

    @Override // androidx.compose.animation.d
    public k c(int towards, g0<w4.n> animationSpec, wn0.l<? super Integer, Integer> targetOffset) {
        if (r(towards)) {
            return androidx.compose.animation.g.A(animationSpec, new g(this, targetOffset));
        }
        if (s(towards)) {
            return androidx.compose.animation.g.A(animationSpec, new h(this, targetOffset));
        }
        androidx.compose.animation.d.a.Companion companion = androidx.compose.animation.d.a.INSTANCE;
        if (androidx.compose.animation.d.a.h(towards, companion.f())) {
            return androidx.compose.animation.g.B(animationSpec, new i(this, targetOffset));
        }
        return androidx.compose.animation.d.a.h(towards, companion.a()) ? androidx.compose.animation.g.B(animationSpec, new j(this, targetOffset)) : k.INSTANCE.a();
    }

    @Override // p1.l1.b
    public S e() {
        return this.transition.n().e();
    }

    @Override // p1.l1.b
    public S getInitialState() {
        return this.transition.n().getInitialState();
    }

    public final androidx.compose.ui.d j(p015o1.i iVar, p020r2.l lVar, int i11) {
        androidx.compose.ui.d dVar;
        if (o.J()) {
            o.S(93755870, i11, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean zN = lVar.n(this);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(Boolean.FALSE, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        y3 y3VarO = n3.o(iVar.getSizeTransform(), lVar, 0);
        if (p013kotlin.jvm.internal.s.f(this.transition.i(), this.transition.p())) {
            l(p1Var, false);
        } else if (y3VarO.getValue() != null) {
            l(p1Var, true);
        }
        if (k(p1Var)) {
            lVar.o(249037309);
            l1.a aVarC = m1.c(this.transition, r1.j(r.INSTANCE), null, lVar, 0, 2);
            boolean zN2 = lVar.n(aVarC);
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                v vVar = (v) y3VarO.getValue();
                objI2 = ((vVar == null || vVar.getClip()) ? h3.e.b(androidx.compose.ui.d.INSTANCE) : androidx.compose.ui.d.INSTANCE).g(new b(aVarC, y3VarO));
                lVar.B(objI2);
            }
            dVar = (androidx.compose.ui.d) objI2;
            lVar.l();
        } else {
            lVar.o(249353726);
            lVar.l();
            this.animatedSize = null;
            dVar = androidx.compose.ui.d.INSTANCE;
        }
        if (o.J()) {
            o.R();
        }
        return dVar;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public d3.c getContentAlignment() {
        return this.contentAlignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long o() {
        return ((r) this.measuredSize.getValue()).getPackedValue();
    }

    public final k0<S, y3<r>> p() {
        return this.targetSizeMap;
    }

    public final l1<S> q() {
        return this.transition;
    }

    public final void t(y3<r> y3Var) {
        this.animatedSize = y3Var;
    }

    public void u(d3.c cVar) {
        this.contentAlignment = cVar;
    }

    public final void v(t tVar) {
        this.layoutDirection = tVar;
    }

    public final void w(long j11) {
        this.measuredSize.setValue(r.b(j11));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/e$a;", "Lz3/t0;", "", "isTarget", "<init>", "(Z)V", "Lw4/d;", "", "parentData", "G", "(Lw4/d;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "b", "Lr2/p1;", IntegerTokenConverter.CONVERTER_KEY, "()Z", "m", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements t0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p1 isTarget;

        public a(boolean z11) {
            this.isTarget = s3.d(Boolean.valueOf(z11), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean i() {
            return ((Boolean) this.isTarget.getValue()).booleanValue();
        }

        public final void m(boolean z11) {
            this.isTarget.setValue(Boolean.valueOf(z11));
        }

        @Override // z3.t0
        public Object G(w4.d dVar, Object obj) {
            return this;
        }
    }
}
