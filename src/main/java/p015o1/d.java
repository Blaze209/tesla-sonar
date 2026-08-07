package p015o1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p019p1.l1;
import p019p1.m1;
import p019p1.u0;
import p020r2.d4;
import p020r2.e2;
import p020r2.k2;
import p020r2.n3;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.x;
import p020r2.y3;
import w4.r;
import w4.s;
import wn0.p;
import wn0.q;
import z3.h0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aS\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0011\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aY\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001ac\u0010\u001a\u001a\u00020\f\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0089\u0001\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00000\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b!\u0010\"\u001a;\u0010$\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010#\u001a\u00028\u0000H\u0003¢\u0006\u0004\b$\u0010%\"\u001e\u0010(\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u001d0\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+²\u0006$\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00000\u001c\"\u0004\b\u0000\u0010\u00178\nX\u008a\u0084\u0002²\u0006\u0012\u0010*\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00178\nX\u008a\u0084\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/d;", "modifier", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Lo1/e;", "Ljn0/h0;", "content", "f", "(ZLandroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lwn0/q;Lr2/l;II)V", "Lv1/i;", "e", "(Lv1/i;ZLandroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lwn0/q;Lr2/l;II)V", "Lp1/u0;", "visibleState", DateTokenConverter.CONVERTER_KEY, "(Lp1/u0;Landroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lwn0/q;Lr2/l;II)V", "T", "Lp1/l1;", "transition", "g", "(Lp1/l1;Lwn0/l;Landroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lwn0/q;Lr2/l;I)V", "Lkotlin/Function2;", "Lo1/k;", "shouldDisposeBlock", "Lo1/s;", "onLookaheadMeasured", "a", "(Lp1/l1;Lwn0/l;Landroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lwn0/p;Lo1/s;Lwn0/q;Lr2/l;II)V", "targetState", "k", "(Lp1/l1;Lwn0/l;Ljava/lang/Object;Lr2/l;I)Lo1/k;", "j", "(Lp1/l1;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/k0;Lz3/h0;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<k0, h0, w4.b, j0> {

        /* JADX INFO: renamed from: o1.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2039a extends u implements wn0.l<w0.a, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w0 f95583c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2039a(w0 w0Var) {
                super(1);
                this.f95583c = w0Var;
            }

            public final void a(w0.a aVar) {
                w0.a.h(aVar, this.f95583c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
                a(aVar);
                return jn0.h0.f84049a;
            }
        }

        a(s sVar) {
            super(3);
        }

        public final j0 a(k0 k0Var, h0 h0Var, long j11) {
            w0 w0VarX0 = h0Var.x0(j11);
            if (!k0Var.d1()) {
                return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new C2039a(w0VarX0), 4, null);
            }
            s.a(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
            throw null;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ j0 invoke(k0 k0Var, h0 h0Var, w4.b bVar) {
            return a(k0Var, h0Var, bVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<T> f95584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<T, Boolean> f95585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f95587f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f95588g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<p015o1.k, p015o1.k, Boolean> f95589h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q<p015o1.e, p020r2.l, Integer, jn0.h0> f95590i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f95591j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f95592k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l1<T> l1Var, wn0.l<? super T, Boolean> lVar, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, p<? super p015o1.k, ? super p015o1.k, Boolean> pVar, s sVar, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, int i11, int i12) {
            super(2);
            this.f95584c = l1Var;
            this.f95585d = lVar;
            this.f95586e = dVar;
            this.f95587f = iVar;
            this.f95588g = kVar;
            this.f95589h = pVar;
            this.f95590i = qVar;
            this.f95591j = i11;
            this.f95592k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.a(this.f95584c, this.f95585d, this.f95586e, this.f95587f, this.f95588g, this.f95589h, null, this.f95590i, lVar, k2.a(this.f95591j | 1), this.f95592k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lr2/e2;", "", "Ljn0/h0;", "<anonymous>", "(Lr2/e2;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", i = {}, l = {756}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<e2<Boolean>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f95593n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f95594o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ l1<p015o1.k> f95595p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y3<p<p015o1.k, p015o1.k, Boolean>> f95596q;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l1<p015o1.k> f95597c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l1<p015o1.k> l1Var) {
                super(0);
                this.f95597c = l1Var;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(d.j(this.f95597c));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2<Boolean> f95598a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1<p015o1.k> f95599b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<p<p015o1.k, p015o1.k, Boolean>> f95600c;

            /* JADX WARN: Multi-variable type inference failed */
            b(e2<Boolean> e2Var, l1<p015o1.k> l1Var, y3<? extends p<? super p015o1.k, ? super p015o1.k, Boolean>> y3Var) {
                this.f95598a = e2Var;
                this.f95599b = l1Var;
                this.f95600c = y3Var;
            }

            public final Object a(boolean z11, Continuation<? super jn0.h0> continuation) {
                this.f95598a.setValue(Boxing.boxBoolean(z11 ? ((Boolean) d.b(this.f95600c).invoke(this.f95599b.i(), this.f95599b.p())).booleanValue() : false));
                return jn0.h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(l1<p015o1.k> l1Var, y3<? extends p<? super p015o1.k, ? super p015o1.k, Boolean>> y3Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f95595p = l1Var;
            this.f95596q = y3Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e2<Boolean> e2Var, Continuation<? super jn0.h0> continuation) {
            return ((c) create(e2Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f95595p, this.f95596q, continuation);
            cVar.f95594o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f95593n;
            if (i11 == 0) {
                t.b(obj);
                e2 e2Var = (e2) this.f95594o;
                Flow flowP = n3.p(new a(this.f95595p));
                b bVar = new b(e2Var, this.f95595p, this.f95596q);
                this.f95593n = 1;
                if (flowP.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: o1.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class C2040d extends u implements wn0.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2040d f95601c = new C2040d();

        C2040d() {
            super(1);
        }

        public final Boolean a(boolean z11) {
            return Boolean.valueOf(z11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f95602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f95604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f95605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f95606g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<p015o1.e, p020r2.l, Integer, jn0.h0> f95607h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f95608i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f95609j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z11, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, int i11, int i12) {
            super(2);
            this.f95602c = z11;
            this.f95603d = dVar;
            this.f95604e = iVar;
            this.f95605f = kVar;
            this.f95606g = str;
            this.f95607h = qVar;
            this.f95608i = i11;
            this.f95609j = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.f(this.f95602c, this.f95603d, this.f95604e, this.f95605f, this.f95606g, this.f95607h, lVar, k2.a(this.f95608i | 1), this.f95609j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f95610c = new f();

        f() {
            super(1);
        }

        public final Boolean a(boolean z11) {
            return Boolean.valueOf(z11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends u implements p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1.i f95611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f95612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f95614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f95615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f95616h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q<p015o1.e, p020r2.l, Integer, jn0.h0> f95617i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f95618j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f95619k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(v1.i iVar, boolean z11, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, String str, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, int i11, int i12) {
            super(2);
            this.f95611c = iVar;
            this.f95612d = z11;
            this.f95613e = dVar;
            this.f95614f = iVar2;
            this.f95615g = kVar;
            this.f95616h = str;
            this.f95617i = qVar;
            this.f95618j = i11;
            this.f95619k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.e(this.f95611c, this.f95612d, this.f95613e, this.f95614f, this.f95615g, this.f95616h, this.f95617i, lVar, k2.a(this.f95618j | 1), this.f95619k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f95620c = new h();

        h() {
            super(1);
        }

        public final Boolean a(boolean z11) {
            return Boolean.valueOf(z11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends u implements p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0<Boolean> f95621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f95623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f95624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f95625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<p015o1.e, p020r2.l, Integer, jn0.h0> f95626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f95627i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f95628j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(u0<Boolean> u0Var, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, int i11, int i12) {
            super(2);
            this.f95621c = u0Var;
            this.f95622d = dVar;
            this.f95623e = iVar;
            this.f95624f = kVar;
            this.f95625g = str;
            this.f95626h = qVar;
            this.f95627i = i11;
            this.f95628j = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.d(this.f95621c, this.f95622d, this.f95623e, this.f95624f, this.f95625g, this.f95626h, lVar, k2.a(this.f95627i | 1), this.f95628j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/k0;Lz3/h0;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements q<k0, h0, w4.b, j0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<T, Boolean> f95629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1<T> f95630d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<w0.a, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w0 f95631c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w0 w0Var) {
                super(1);
                this.f95631c = w0Var;
            }

            public final void a(w0.a aVar) {
                w0.a.h(aVar, this.f95631c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
                a(aVar);
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(wn0.l<? super T, Boolean> lVar, l1<T> l1Var) {
            super(3);
            this.f95629c = lVar;
            this.f95630d = l1Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final j0 a(k0 k0Var, h0 h0Var, long j11) {
            w0 w0VarX0 = h0Var.x0(j11);
            long jA = (!k0Var.d1() || this.f95629c.invoke((T) this.f95630d.p()).booleanValue()) ? s.a(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) : r.INSTANCE.a();
            return k0.N1(k0Var, r.g(jA), r.f(jA), null, new a(w0VarX0), 4, null);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ j0 invoke(k0 k0Var, h0 h0Var, w4.b bVar) {
            return a(k0Var, h0Var, bVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lo1/k;", "current", "target", "", "a", "(Lo1/k;Lo1/k;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class k extends u implements p<p015o1.k, p015o1.k, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f95632c = new k();

        k() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p015o1.k kVar, p015o1.k kVar2) {
            return Boolean.valueOf(kVar == kVar2 && kVar2 == p015o1.k.PostExit);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends u implements p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<T> f95633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<T, Boolean> f95634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f95636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f95637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<p015o1.e, p020r2.l, Integer, jn0.h0> f95638h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f95639i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(l1<T> l1Var, wn0.l<? super T, Boolean> lVar, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, int i11) {
            super(2);
            this.f95633c = l1Var;
            this.f95634d = lVar;
            this.f95635e = dVar;
            this.f95636f = iVar;
            this.f95637g = kVar;
            this.f95638h = qVar;
            this.f95639i = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.g(this.f95633c, this.f95634d, this.f95635e, this.f95636f, this.f95637g, this.f95638h, lVar, k2.a(this.f95639i | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final <T> void a(l1<T> l1Var, wn0.l<? super T, Boolean> lVar, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, p<? super p015o1.k, ? super p015o1.k, Boolean> pVar, s sVar, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, p020r2.l lVar2, int i11, int i12) {
        int i13;
        androidx.compose.animation.i iVar2;
        androidx.compose.animation.k kVar2;
        s sVar2;
        p020r2.l lVar3;
        androidx.compose.ui.d dVarA;
        s sVar3 = sVar;
        p020r2.l lVarV = lVar2.v(-891967166);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(l1Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(lVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(dVar) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            if ((i11 & 3072) == 0) {
                i13 |= lVarV.n(iVar2) ? 2048 : 1024;
            }
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if ((i11 & 24576) == 0) {
                i13 |= lVarV.n(kVar2) ? 16384 : PKIFailureInfo.certRevoked;
            }
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= lVarV.K(pVar) ? 131072 : 65536;
        }
        int i14 = i12 & 64;
        int i15 = 1572864;
        if (i14 != 0) {
            i13 |= i15;
        } else if ((i11 & 1572864) == 0) {
            i15 = (i11 & PKIFailureInfo.badSenderNonce) == 0 ? lVarV.n(sVar3) : lVarV.K(sVar3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            i13 |= i15;
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i13 |= lVarV.K(qVar) ? 8388608 : 4194304;
        }
        int i16 = i13;
        if ((4793491 & i16) == 4793490 && lVarV.b()) {
            lVarV.j();
            sVar2 = sVar3;
            lVar3 = lVarV;
        } else {
            if (i14 != 0) {
                sVar3 = null;
            }
            if (o.J()) {
                o.S(-891967166, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if (lVar.invoke(l1Var.p()).booleanValue() || lVar.invoke(l1Var.i()).booleanValue() || l1Var.u() || l1Var.j()) {
                lVarV.o(1787977937);
                int i17 = i16 & 14;
                int i18 = i17 | 48;
                int i19 = i18 & 14;
                boolean z11 = ((i19 ^ 6) > 4 && lVarV.n(l1Var)) || (i18 & 6) == 4;
                Object objI = lVarV.I();
                if (z11 || objI == p020r2.l.INSTANCE.a()) {
                    objI = l1Var.i();
                    lVarV.B(objI);
                }
                if (l1Var.u()) {
                    objI = l1Var.i();
                }
                lVarV.o(-466616829);
                if (o.J()) {
                    o.S(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                int i21 = i16 & 126;
                p015o1.k kVarK = k(l1Var, lVar, objI, lVarV, i21);
                if (o.J()) {
                    o.R();
                }
                lVarV.l();
                T tP = l1Var.p();
                lVarV.o(-466616829);
                if (o.J()) {
                    o.S(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                p015o1.k kVarK2 = k(l1Var, lVar, tP, lVarV, i21);
                if (o.J()) {
                    o.R();
                }
                lVarV.l();
                sVar2 = sVar3;
                l1 l1VarB = m1.b(l1Var, kVarK, kVarK2, "EnterExitTransition", lVarV, i19 | 3072);
                y3 y3VarO = n3.o(pVar, lVarV, (i16 >> 15) & 14);
                Boolean boolInvoke = pVar.invoke(l1VarB.i(), l1VarB.p());
                boolean zN = lVarV.n(l1VarB) | lVarV.n(y3VarO);
                Object objI2 = lVarV.I();
                if (zN || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new c(l1VarB, y3VarO, null);
                    lVarV.B(objI2);
                }
                y3 y3VarM = n3.m(boolInvoke, (p) objI2, lVarV, 0);
                if (j(l1VarB) && c(y3VarM)) {
                    lVarV.o(1790256282);
                    lVarV.l();
                    lVar3 = lVarV;
                } else {
                    lVarV.o(1788869559);
                    boolean z12 = i17 == 4;
                    Object objI3 = lVarV.I();
                    if (z12 || objI3 == p020r2.l.INSTANCE.a()) {
                        objI3 = new p015o1.f(l1VarB);
                        lVarV.B(objI3);
                    }
                    p015o1.f fVar = (p015o1.f) objI3;
                    int i22 = i16 >> 6;
                    androidx.compose.ui.d dVarG = androidx.compose.animation.g.g(l1VarB, iVar2, kVar2, null, "Built-in", lVarV, (i22 & 896) | (i22 & 112) | 24576, 4);
                    lVar3 = lVarV;
                    if (sVar2 != null) {
                        lVar3.o(1789227361);
                        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
                        boolean z13 = (3670016 & i16) == 1048576 || ((i16 & PKIFailureInfo.badSenderNonce) != 0 && lVar3.K(sVar2));
                        Object objI4 = lVar3.I();
                        if (z13 || objI4 == p020r2.l.INSTANCE.a()) {
                            objI4 = new a(sVar2);
                            lVar3.B(objI4);
                        }
                        dVarA = androidx.compose.ui.layout.b.a(companion, (q) objI4);
                        lVar3.l();
                    } else {
                        lVar3.o(1581766416);
                        lVar3.l();
                        dVarA = androidx.compose.ui.d.INSTANCE;
                    }
                    androidx.compose.ui.d dVarG2 = dVar.g(dVarG.g(dVarA));
                    Object objI5 = lVar3.I();
                    if (objI5 == p020r2.l.INSTANCE.a()) {
                        objI5 = new p015o1.c(fVar);
                        lVar3.B(objI5);
                    }
                    p015o1.c cVar = (p015o1.c) objI5;
                    int iA = p020r2.j.a(lVar3, 0);
                    x xVarC = lVar3.c();
                    androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar3, dVarG2);
                    b4.g.Companion companion2 = b4.g.INSTANCE;
                    wn0.a<b4.g> aVarA = companion2.a();
                    if (lVar3.w() == null) {
                        p020r2.j.c();
                    }
                    lVar3.h();
                    if (lVar3.getInserting()) {
                        lVar3.z(aVarA);
                    } else {
                        lVar3.d();
                    }
                    p020r2.l lVarA = d4.a(lVar3);
                    d4.b(lVarA, cVar, companion2.c());
                    d4.b(lVarA, xVarC, companion2.e());
                    p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
                    if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE, companion2.d());
                    qVar.invoke(fVar, lVar3, Integer.valueOf((i16 >> 18) & 112));
                    lVar3.g();
                    lVar3.l();
                }
                lVar3.l();
            } else {
                lVarV.o(1790262234);
                lVarV.l();
                sVar2 = sVar3;
                lVar3 = lVarV;
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new b(l1Var, lVar, dVar, iVar, kVar, pVar, sVar2, qVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<p015o1.k, p015o1.k, Boolean> b(y3<? extends p<? super p015o1.k, ? super p015o1.k, Boolean>> y3Var) {
        return (p) y3Var.getValue();
    }

    private static final boolean c(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0150  */
    /* JADX WARN: Code duplicated, block: B:98:0x015d  */
    public static final void d(u0<Boolean> u0Var, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        androidx.compose.animation.i iVar2;
        int i15;
        int i16;
        androidx.compose.animation.k kVar2;
        int i17;
        int i18;
        String str2;
        int i19;
        q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar2;
        int i21;
        androidx.compose.ui.d dVar3;
        androidx.compose.animation.i iVarC;
        androidx.compose.animation.k kVarC;
        String str3;
        String str4;
        androidx.compose.ui.d dVar4;
        androidx.compose.animation.i iVar3;
        androidx.compose.animation.k kVar3;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(-222898426);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(u0Var) : lVarV.K(u0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    iVar2 = iVar;
                    if (lVarV.n(iVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        kVar2 = kVar;
                        if (lVarV.n(kVar2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((i11 & 24576) == 0) {
                            str2 = str;
                            if (lVarV.n(str2)) {
                                i19 = 16384;
                            } else {
                                i19 = PKIFailureInfo.certRevoked;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 32) != 0) {
                            i13 |= 196608;
                            qVar2 = qVar;
                        } else {
                            qVar2 = qVar;
                            if ((i11 & 196608) == 0) {
                                if (lVarV.K(qVar2)) {
                                    i21 = 131072;
                                } else {
                                    i21 = 65536;
                                }
                                i13 |= i21;
                            }
                        }
                        if ((74899 & i13) == 74898 || !lVarV.b()) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                            } else {
                                iVarC = iVar2;
                            }
                            if (i16 != 0) {
                                kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                            } else {
                                kVarC = kVar2;
                            }
                            if (i18 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str2;
                            }
                            if (o.J()) {
                                o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                            }
                            int i23 = i13 << 3;
                            androidx.compose.ui.d dVar5 = dVar3;
                            androidx.compose.animation.i iVar4 = iVarC;
                            g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar5, iVar4, kVarC, qVar2, lVarV, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i13 & 458752));
                            if (o.J()) {
                                o.R();
                            }
                            str4 = str3;
                            dVar4 = dVar5;
                            iVar3 = iVar4;
                            kVar3 = kVarC;
                        } else {
                            lVarV.j();
                            dVar4 = dVar2;
                            iVar3 = iVar2;
                            kVar3 = kVar2;
                            str4 = str2;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                        }
                    }
                    i13 |= 24576;
                    str2 = str;
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i24 = i13 << 3;
                        androidx.compose.ui.d dVar6 = dVar3;
                        androidx.compose.animation.i iVar5 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar6, iVar5, kVarC, qVar2, lVarV, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar6;
                        iVar3 = iVar5;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i25 = i13 << 3;
                        androidx.compose.ui.d dVar7 = dVar3;
                        androidx.compose.animation.i iVar6 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar7, iVar6, kVarC, qVar2, lVarV, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar7;
                        iVar3 = iVar6;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 3072;
                kVar2 = kVar;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i26 = i13 << 3;
                        androidx.compose.ui.d dVar8 = dVar3;
                        androidx.compose.animation.i iVar7 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar8, iVar7, kVarC, qVar2, lVarV, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar8;
                        iVar3 = iVar7;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i27 = i13 << 3;
                        androidx.compose.ui.d dVar9 = dVar3;
                        androidx.compose.animation.i iVar8 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar9, iVar8, kVarC, qVar2, lVarV, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar9;
                        iVar3 = iVar8;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 24576;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i28 = i13 << 3;
                    androidx.compose.ui.d dVar10 = dVar3;
                    androidx.compose.animation.i iVar9 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar10, iVar9, kVarC, qVar2, lVarV, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar10;
                    iVar3 = iVar9;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i29 = i13 << 3;
                    androidx.compose.ui.d dVar11 = dVar3;
                    androidx.compose.animation.i iVar10 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar11, iVar10, kVarC, qVar2, lVarV, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar11;
                    iVar3 = iVar10;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            iVar2 = iVar;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    kVar2 = kVar;
                    if (lVarV.n(kVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i210 = i13 << 3;
                        androidx.compose.ui.d dVar12 = dVar3;
                        androidx.compose.animation.i iVar11 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar12, iVar11, kVarC, qVar2, lVarV, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar12;
                        iVar3 = iVar11;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i211 = i13 << 3;
                        androidx.compose.ui.d dVar13 = dVar3;
                        androidx.compose.animation.i iVar12 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar13, iVar12, kVarC, qVar2, lVarV, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar13;
                        iVar3 = iVar12;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 24576;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i212 = i13 << 3;
                    androidx.compose.ui.d dVar14 = dVar3;
                    androidx.compose.animation.i iVar13 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar14, iVar13, kVarC, qVar2, lVarV, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar14;
                    iVar3 = iVar13;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i213 = i13 << 3;
                    androidx.compose.ui.d dVar15 = dVar3;
                    androidx.compose.animation.i iVar14 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar15, iVar14, kVarC, qVar2, lVarV, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar15;
                    iVar3 = iVar14;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            kVar2 = kVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i214 = i13 << 3;
                    androidx.compose.ui.d dVar16 = dVar3;
                    androidx.compose.animation.i iVar15 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar16, iVar15, kVarC, qVar2, lVarV, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar16;
                    iVar3 = iVar15;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i215 = i13 << 3;
                    androidx.compose.ui.d dVar17 = dVar3;
                    androidx.compose.animation.i iVar16 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar17, iVar16, kVarC, qVar2, lVarV, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar17;
                    iVar3 = iVar16;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i216 = i13 << 3;
                androidx.compose.ui.d dVar18 = dVar3;
                androidx.compose.animation.i iVar17 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar18, iVar17, kVarC, qVar2, lVarV, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar18;
                iVar3 = iVar17;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i217 = i13 << 3;
                androidx.compose.ui.d dVar19 = dVar3;
                androidx.compose.animation.i iVar18 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar19, iVar18, kVarC, qVar2, lVarV, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar19;
                iVar3 = iVar18;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                iVar2 = iVar;
                if (lVarV.n(iVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    kVar2 = kVar;
                    if (lVarV.n(kVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i218 = i13 << 3;
                        androidx.compose.ui.d dVar110 = dVar3;
                        androidx.compose.animation.i iVar19 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar110, iVar19, kVarC, qVar2, lVarV, (i218 & 57344) | (i218 & 896) | 48 | (i218 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar110;
                        iVar3 = iVar19;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                        }
                        int i219 = i13 << 3;
                        androidx.compose.ui.d dVar111 = dVar3;
                        androidx.compose.animation.i iVar110 = iVarC;
                        g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar111, iVar110, kVarC, qVar2, lVarV, (i219 & 57344) | (i219 & 896) | 48 | (i219 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar111;
                        iVar3 = iVar110;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 24576;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i2110 = i13 << 3;
                    androidx.compose.ui.d dVar112 = dVar3;
                    androidx.compose.animation.i iVar111 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar112, iVar111, kVarC, qVar2, lVarV, (i2110 & 57344) | (i2110 & 896) | 48 | (i2110 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar112;
                    iVar3 = iVar111;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i2111 = i13 << 3;
                    androidx.compose.ui.d dVar113 = dVar3;
                    androidx.compose.animation.i iVar112 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar113, iVar112, kVarC, qVar2, lVarV, (i2111 & 57344) | (i2111 & 896) | 48 | (i2111 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar113;
                    iVar3 = iVar112;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            kVar2 = kVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i2112 = i13 << 3;
                    androidx.compose.ui.d dVar114 = dVar3;
                    androidx.compose.animation.i iVar113 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar114, iVar113, kVarC, qVar2, lVarV, (i2112 & 57344) | (i2112 & 896) | 48 | (i2112 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar114;
                    iVar3 = iVar113;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i2113 = i13 << 3;
                    androidx.compose.ui.d dVar115 = dVar3;
                    androidx.compose.animation.i iVar114 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar115, iVar114, kVarC, qVar2, lVarV, (i2113 & 57344) | (i2113 & 896) | 48 | (i2113 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar115;
                    iVar3 = iVar114;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i2114 = i13 << 3;
                androidx.compose.ui.d dVar116 = dVar3;
                androidx.compose.animation.i iVar115 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar116, iVar115, kVarC, qVar2, lVarV, (i2114 & 57344) | (i2114 & 896) | 48 | (i2114 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar116;
                iVar3 = iVar115;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i2115 = i13 << 3;
                androidx.compose.ui.d dVar117 = dVar3;
                androidx.compose.animation.i iVar116 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar117, iVar116, kVarC, qVar2, lVarV, (i2115 & 57344) | (i2115 & 896) | 48 | (i2115 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar117;
                iVar3 = iVar116;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        iVar2 = iVar;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                kVar2 = kVar;
                if (lVarV.n(kVar2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i2116 = i13 << 3;
                    androidx.compose.ui.d dVar118 = dVar3;
                    androidx.compose.animation.i iVar117 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar118, iVar117, kVarC, qVar2, lVarV, (i2116 & 57344) | (i2116 & 896) | 48 | (i2116 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar118;
                    iVar3 = iVar117;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                    }
                    int i2117 = i13 << 3;
                    androidx.compose.ui.d dVar119 = dVar3;
                    androidx.compose.animation.i iVar118 = iVarC;
                    g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar119, iVar118, kVarC, qVar2, lVarV, (i2117 & 57344) | (i2117 & 896) | 48 | (i2117 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar119;
                    iVar3 = iVar118;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i2118 = i13 << 3;
                androidx.compose.ui.d dVar1110 = dVar3;
                androidx.compose.animation.i iVar119 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar1110, iVar119, kVarC, qVar2, lVarV, (i2118 & 57344) | (i2118 & 896) | 48 | (i2118 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1110;
                iVar3 = iVar119;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i2119 = i13 << 3;
                androidx.compose.ui.d dVar1111 = dVar3;
                androidx.compose.animation.i iVar1110 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar1111, iVar1110, kVarC, qVar2, lVarV, (i2119 & 57344) | (i2119 & 896) | 48 | (i2119 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1111;
                iVar3 = iVar1110;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        kVar2 = kVar;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i13 |= i19;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i21110 = i13 << 3;
                androidx.compose.ui.d dVar1112 = dVar3;
                androidx.compose.animation.i iVar1111 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar1112, iVar1111, kVarC, qVar2, lVarV, (i21110 & 57344) | (i21110 & 896) | 48 | (i21110 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1112;
                iVar3 = iVar1111;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                }
                int i21111 = i13 << 3;
                androidx.compose.ui.d dVar1113 = dVar3;
                androidx.compose.animation.i iVar1112 = iVarC;
                g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar1113, iVar1112, kVarC, qVar2, lVarV, (i21111 & 57344) | (i21111 & 896) | 48 | (i21111 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1113;
                iVar3 = iVar1112;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 24576;
        str2 = str;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((i11 & 196608) == 0) {
                if (lVarV.K(qVar2)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
        }
        if ((74899 & i13) == 74898) {
            if (i22 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
            } else {
                iVarC = iVar2;
            }
            if (i16 != 0) {
                kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
            } else {
                kVarC = kVar2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
            }
            int i21112 = i13 << 3;
            androidx.compose.ui.d dVar1114 = dVar3;
            androidx.compose.animation.i iVar1113 = iVarC;
            g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar1114, iVar1113, kVarC, qVar2, lVarV, (i21112 & 57344) | (i21112 & 896) | 48 | (i21112 & 7168) | (i13 & 458752));
            if (o.J()) {
                o.R();
            }
            str4 = str3;
            dVar4 = dVar1114;
            iVar3 = iVar1113;
            kVar3 = kVarC;
        } else {
            if (i22 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
            } else {
                iVarC = iVar2;
            }
            if (i16 != 0) {
                kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.s(null, null, false, null, 15, null));
            } else {
                kVarC = kVar2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(-222898426, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
            }
            int i21113 = i13 << 3;
            androidx.compose.ui.d dVar1115 = dVar3;
            androidx.compose.animation.i iVar1114 = iVarC;
            g(m1.f(u0Var, str3, lVarV, u0.f100644d | (i13 & 14) | ((i13 >> 9) & 112), 0), h.f95620c, dVar1115, iVar1114, kVarC, qVar2, lVarV, (i21113 & 57344) | (i21113 & 896) | 48 | (i21113 & 7168) | (i13 & 458752));
            if (o.J()) {
                o.R();
            }
            str4 = str3;
            dVar4 = dVar1115;
            iVar3 = iVar1114;
            kVar3 = kVarC;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new i(u0Var, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0159  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void e(v1.i iVar, boolean z11, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, String str, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, p020r2.l lVar, int i11, int i12) {
        boolean z12;
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        androidx.compose.animation.i iVarC;
        int i15;
        int i16;
        androidx.compose.animation.k kVar2;
        int i17;
        int i18;
        String str2;
        int i19;
        q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar2;
        int i21;
        androidx.compose.ui.d dVar3;
        androidx.compose.animation.k kVarC;
        String str3;
        String str4;
        androidx.compose.ui.d dVar4;
        androidx.compose.animation.i iVar3;
        androidx.compose.animation.k kVar3;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(1766503102);
        if ((i12 & 1) != 0) {
            i13 = i11 | 48;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i11 & 48) == 0) {
                i13 = (lVarV.p(z12) ? 32 : 16) | i11;
            } else {
                i13 = i11;
            }
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    iVarC = iVar2;
                    if (lVarV.n(iVarC)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        kVar2 = kVar;
                        if (lVarV.n(kVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((196608 & i11) == 0) {
                            str2 = str;
                            if (lVarV.n(str2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 32) != 0) {
                            i13 |= 1572864;
                            qVar2 = qVar;
                        } else {
                            qVar2 = qVar;
                            if ((i11 & 1572864) == 0) {
                                if (lVarV.K(qVar2)) {
                                    i21 = PKIFailureInfo.badCertTemplate;
                                } else {
                                    i21 = PKIFailureInfo.signerNotTrusted;
                                }
                                i13 |= i21;
                            }
                        }
                        if ((599185 & i13) == 599184 || !lVarV.b()) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                            }
                            if (i16 != 0) {
                                kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                            } else {
                                kVarC = kVar2;
                            }
                            if (i18 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str2;
                            }
                            if (o.J()) {
                                o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                            }
                            int i23 = i13 >> 3;
                            androidx.compose.ui.d dVar5 = dVar3;
                            androidx.compose.animation.i iVar4 = iVarC;
                            g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i23 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar5, iVar4, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i23));
                            if (o.J()) {
                                o.R();
                            }
                            str4 = str3;
                            dVar4 = dVar5;
                            iVar3 = iVar4;
                            kVar3 = kVarC;
                        } else {
                            lVarV.j();
                            dVar4 = dVar2;
                            iVar3 = iVarC;
                            kVar3 = kVar2;
                            str4 = str2;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                        }
                    }
                    i13 |= 196608;
                    str2 = str;
                    if ((i12 & 32) != 0) {
                        i13 |= 1572864;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((599185 & i13) == 599184) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i24 = i13 >> 3;
                        androidx.compose.ui.d dVar6 = dVar3;
                        androidx.compose.animation.i iVar5 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i24 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar6, iVar5, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i24));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar6;
                        iVar3 = iVar5;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i25 = i13 >> 3;
                        androidx.compose.ui.d dVar7 = dVar3;
                        androidx.compose.animation.i iVar6 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i25 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar7, iVar6, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i25));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar7;
                        iVar3 = iVar6;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 24576;
                kVar2 = kVar;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 1572864;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((599185 & i13) == 599184) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i26 = i13 >> 3;
                        androidx.compose.ui.d dVar8 = dVar3;
                        androidx.compose.animation.i iVar7 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i26 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar8, iVar7, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i26));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar8;
                        iVar3 = iVar7;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i27 = i13 >> 3;
                        androidx.compose.ui.d dVar9 = dVar3;
                        androidx.compose.animation.i iVar8 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i27 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar9, iVar8, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i27));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar9;
                        iVar3 = iVar8;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 196608;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 1572864;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                }
                if ((599185 & i13) == 599184) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i28 = i13 >> 3;
                    androidx.compose.ui.d dVar10 = dVar3;
                    androidx.compose.animation.i iVar9 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i28 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar10, iVar9, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i28));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar10;
                    iVar3 = iVar9;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i29 = i13 >> 3;
                    androidx.compose.ui.d dVar11 = dVar3;
                    androidx.compose.animation.i iVar10 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i29 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar11, iVar10, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i29));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar11;
                    iVar3 = iVar10;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            iVarC = iVar2;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    kVar2 = kVar;
                    if (lVarV.n(kVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 1572864;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((599185 & i13) == 599184) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i210 = i13 >> 3;
                        androidx.compose.ui.d dVar12 = dVar3;
                        androidx.compose.animation.i iVar11 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i210 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar12, iVar11, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i210));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar12;
                        iVar3 = iVar11;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i211 = i13 >> 3;
                        androidx.compose.ui.d dVar13 = dVar3;
                        androidx.compose.animation.i iVar12 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i211 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar13, iVar12, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i211));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar13;
                        iVar3 = iVar12;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 196608;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 1572864;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                }
                if ((599185 & i13) == 599184) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i212 = i13 >> 3;
                    androidx.compose.ui.d dVar14 = dVar3;
                    androidx.compose.animation.i iVar13 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i212 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar14, iVar13, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i212));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar14;
                    iVar3 = iVar13;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i213 = i13 >> 3;
                    androidx.compose.ui.d dVar15 = dVar3;
                    androidx.compose.animation.i iVar14 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i213 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar15, iVar14, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i213));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar15;
                    iVar3 = iVar14;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            kVar2 = kVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 1572864;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                }
                if ((599185 & i13) == 599184) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i214 = i13 >> 3;
                    androidx.compose.ui.d dVar16 = dVar3;
                    androidx.compose.animation.i iVar15 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i214 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar16, iVar15, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i214));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar16;
                    iVar3 = iVar15;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i215 = i13 >> 3;
                    androidx.compose.ui.d dVar17 = dVar3;
                    androidx.compose.animation.i iVar16 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i215 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar17, iVar16, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i215));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar17;
                    iVar3 = iVar16;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 196608;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 1572864;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
            }
            if ((599185 & i13) == 599184) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i216 = i13 >> 3;
                androidx.compose.ui.d dVar18 = dVar3;
                androidx.compose.animation.i iVar17 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i216 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar18, iVar17, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i216));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar18;
                iVar3 = iVar17;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i217 = i13 >> 3;
                androidx.compose.ui.d dVar19 = dVar3;
                androidx.compose.animation.i iVar18 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i217 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar19, iVar18, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i217));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar19;
                iVar3 = iVar18;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                iVarC = iVar2;
                if (lVarV.n(iVarC)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    kVar2 = kVar;
                    if (lVarV.n(kVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 1572864;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((599185 & i13) == 599184) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i218 = i13 >> 3;
                        androidx.compose.ui.d dVar110 = dVar3;
                        androidx.compose.animation.i iVar19 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i218 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar110, iVar19, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i218));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar110;
                        iVar3 = iVar19;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i219 = i13 >> 3;
                        androidx.compose.ui.d dVar111 = dVar3;
                        androidx.compose.animation.i iVar110 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i219 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar111, iVar110, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i219));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar111;
                        iVar3 = iVar110;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 196608;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 1572864;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                }
                if ((599185 & i13) == 599184) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2110 = i13 >> 3;
                    androidx.compose.ui.d dVar112 = dVar3;
                    androidx.compose.animation.i iVar111 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2110 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar112, iVar111, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2110));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar112;
                    iVar3 = iVar111;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2111 = i13 >> 3;
                    androidx.compose.ui.d dVar113 = dVar3;
                    androidx.compose.animation.i iVar112 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2111 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar113, iVar112, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2111));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar113;
                    iVar3 = iVar112;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            kVar2 = kVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 1572864;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                }
                if ((599185 & i13) == 599184) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2112 = i13 >> 3;
                    androidx.compose.ui.d dVar114 = dVar3;
                    androidx.compose.animation.i iVar113 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2112 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar114, iVar113, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2112));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar114;
                    iVar3 = iVar113;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2113 = i13 >> 3;
                    androidx.compose.ui.d dVar115 = dVar3;
                    androidx.compose.animation.i iVar114 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2113 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar115, iVar114, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2113));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar115;
                    iVar3 = iVar114;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 196608;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 1572864;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
            }
            if ((599185 & i13) == 599184) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2114 = i13 >> 3;
                androidx.compose.ui.d dVar116 = dVar3;
                androidx.compose.animation.i iVar115 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2114 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar116, iVar115, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2114));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar116;
                iVar3 = iVar115;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2115 = i13 >> 3;
                androidx.compose.ui.d dVar117 = dVar3;
                androidx.compose.animation.i iVar116 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2115 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar117, iVar116, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2115));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar117;
                iVar3 = iVar116;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        iVarC = iVar2;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                kVar2 = kVar;
                if (lVarV.n(kVar2)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 1572864;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                }
                if ((599185 & i13) == 599184) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2116 = i13 >> 3;
                    androidx.compose.ui.d dVar118 = dVar3;
                    androidx.compose.animation.i iVar117 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2116 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar118, iVar117, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2116));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar118;
                    iVar3 = iVar117;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2117 = i13 >> 3;
                    androidx.compose.ui.d dVar119 = dVar3;
                    androidx.compose.animation.i iVar118 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2117 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar119, iVar118, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2117));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar119;
                    iVar3 = iVar118;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 196608;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 1572864;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
            }
            if ((599185 & i13) == 599184) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2118 = i13 >> 3;
                androidx.compose.ui.d dVar1110 = dVar3;
                androidx.compose.animation.i iVar119 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2118 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar1110, iVar119, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2118));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1110;
                iVar3 = iVar119;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2119 = i13 >> 3;
                androidx.compose.ui.d dVar1111 = dVar3;
                androidx.compose.animation.i iVar1110 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i2119 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar1111, iVar1110, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i2119));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1111;
                iVar3 = iVar1110;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 24576;
        kVar2 = kVar;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((196608 & i11) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((i12 & 32) != 0) {
                i13 |= 1572864;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
            }
            if ((599185 & i13) == 599184) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i21110 = i13 >> 3;
                androidx.compose.ui.d dVar1112 = dVar3;
                androidx.compose.animation.i iVar1111 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i21110 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar1112, iVar1111, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i21110));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1112;
                iVar3 = iVar1111;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i21111 = i13 >> 3;
                androidx.compose.ui.d dVar1113 = dVar3;
                androidx.compose.animation.i iVar1112 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i21111 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar1113, iVar1112, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i21111));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1113;
                iVar3 = iVar1112;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 196608;
        str2 = str;
        if ((i12 & 32) != 0) {
            i13 |= 1572864;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((i11 & 1572864) == 0) {
                if (lVarV.K(qVar2)) {
                    i21 = PKIFailureInfo.badCertTemplate;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i21;
            }
        }
        if ((599185 & i13) == 599184) {
            if (i22 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
            }
            if (i16 != 0) {
                kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
            } else {
                kVarC = kVar2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
            }
            int i21112 = i13 >> 3;
            androidx.compose.ui.d dVar1114 = dVar3;
            androidx.compose.animation.i iVar1113 = iVarC;
            g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i21112 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar1114, iVar1113, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i21112));
            if (o.J()) {
                o.R();
            }
            str4 = str3;
            dVar4 = dVar1114;
            iVar3 = iVar1113;
            kVar3 = kVarC;
        } else {
            if (i22 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.k(null, null, false, null, 15, null));
            }
            if (i16 != 0) {
                kVarC = androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.u(null, null, false, null, 15, null));
            } else {
                kVarC = kVar2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(1766503102, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
            }
            int i21113 = i13 >> 3;
            androidx.compose.ui.d dVar1115 = dVar3;
            androidx.compose.animation.i iVar1114 = iVarC;
            g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i21113 & 14) | ((i13 >> 12) & 112), 0), f.f95610c, dVar1115, iVar1114, kVarC, qVar2, lVarV, (i13 & 896) | 48 | (i13 & 7168) | (i13 & 57344) | (458752 & i21113));
            if (o.J()) {
                o.R();
            }
            str4 = str3;
            dVar4 = dVar1115;
            iVar3 = iVar1114;
            kVar3 = kVarC;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(iVar, z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x0118  */
    /* JADX WARN: Code duplicated, block: B:91:0x014e  */
    /* JADX WARN: Code duplicated, block: B:95:0x015b  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void f(boolean z11, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, p020r2.l lVar, int i11, int i12) {
        boolean z12;
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        androidx.compose.animation.i iVar2;
        int i15;
        int i16;
        androidx.compose.animation.k kVar2;
        int i17;
        int i18;
        String str2;
        int i19;
        q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar2;
        int i21;
        androidx.compose.ui.d dVar3;
        androidx.compose.animation.i iVarC;
        androidx.compose.animation.k kVarC;
        String str3;
        String str4;
        androidx.compose.ui.d dVar4;
        androidx.compose.animation.i iVar3;
        androidx.compose.animation.k kVar3;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(2088733774);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 6) == 0) {
            z12 = z11;
            i13 = (lVarV.p(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    iVar2 = iVar;
                    if (lVarV.n(iVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        kVar2 = kVar;
                        if (lVarV.n(kVar2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((i11 & 24576) == 0) {
                            str2 = str;
                            if (lVarV.n(str2)) {
                                i19 = 16384;
                            } else {
                                i19 = PKIFailureInfo.certRevoked;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 32) != 0) {
                            i13 |= 196608;
                            qVar2 = qVar;
                        } else {
                            qVar2 = qVar;
                            if ((i11 & 196608) == 0) {
                                if (lVarV.K(qVar2)) {
                                    i21 = 131072;
                                } else {
                                    i21 = 65536;
                                }
                                i13 |= i21;
                            }
                        }
                        if ((74899 & i13) == 74898 || !lVarV.b()) {
                            if (i22 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                            } else {
                                iVarC = iVar2;
                            }
                            if (i16 != 0) {
                                kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                            } else {
                                kVarC = kVar2;
                            }
                            if (i18 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str2;
                            }
                            if (o.J()) {
                                o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                            }
                            int i23 = i13 << 3;
                            androidx.compose.ui.d dVar5 = dVar3;
                            androidx.compose.animation.i iVar4 = iVarC;
                            g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar5, iVar4, kVarC, qVar2, lVarV, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i13 & 458752));
                            if (o.J()) {
                                o.R();
                            }
                            str4 = str3;
                            dVar4 = dVar5;
                            iVar3 = iVar4;
                            kVar3 = kVarC;
                        } else {
                            lVarV.j();
                            dVar4 = dVar2;
                            iVar3 = iVar2;
                            kVar3 = kVar2;
                            str4 = str2;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                        }
                    }
                    i13 |= 24576;
                    str2 = str;
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i24 = i13 << 3;
                        androidx.compose.ui.d dVar6 = dVar3;
                        androidx.compose.animation.i iVar5 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar6, iVar5, kVarC, qVar2, lVarV, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar6;
                        iVar3 = iVar5;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i25 = i13 << 3;
                        androidx.compose.ui.d dVar7 = dVar3;
                        androidx.compose.animation.i iVar6 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar7, iVar6, kVarC, qVar2, lVarV, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar7;
                        iVar3 = iVar6;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 3072;
                kVar2 = kVar;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i26 = i13 << 3;
                        androidx.compose.ui.d dVar8 = dVar3;
                        androidx.compose.animation.i iVar7 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar8, iVar7, kVarC, qVar2, lVarV, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar8;
                        iVar3 = iVar7;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i27 = i13 << 3;
                        androidx.compose.ui.d dVar9 = dVar3;
                        androidx.compose.animation.i iVar8 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar9, iVar8, kVarC, qVar2, lVarV, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar9;
                        iVar3 = iVar8;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 24576;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i28 = i13 << 3;
                    androidx.compose.ui.d dVar10 = dVar3;
                    androidx.compose.animation.i iVar9 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar10, iVar9, kVarC, qVar2, lVarV, (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar10;
                    iVar3 = iVar9;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i29 = i13 << 3;
                    androidx.compose.ui.d dVar11 = dVar3;
                    androidx.compose.animation.i iVar10 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar11, iVar10, kVarC, qVar2, lVarV, (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar11;
                    iVar3 = iVar10;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            iVar2 = iVar;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    kVar2 = kVar;
                    if (lVarV.n(kVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i210 = i13 << 3;
                        androidx.compose.ui.d dVar12 = dVar3;
                        androidx.compose.animation.i iVar11 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar12, iVar11, kVarC, qVar2, lVarV, (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar12;
                        iVar3 = iVar11;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i211 = i13 << 3;
                        androidx.compose.ui.d dVar13 = dVar3;
                        androidx.compose.animation.i iVar12 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar13, iVar12, kVarC, qVar2, lVarV, (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar13;
                        iVar3 = iVar12;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 24576;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i212 = i13 << 3;
                    androidx.compose.ui.d dVar14 = dVar3;
                    androidx.compose.animation.i iVar13 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar14, iVar13, kVarC, qVar2, lVarV, (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar14;
                    iVar3 = iVar13;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i213 = i13 << 3;
                    androidx.compose.ui.d dVar15 = dVar3;
                    androidx.compose.animation.i iVar14 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar15, iVar14, kVarC, qVar2, lVarV, (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar15;
                    iVar3 = iVar14;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            kVar2 = kVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i214 = i13 << 3;
                    androidx.compose.ui.d dVar16 = dVar3;
                    androidx.compose.animation.i iVar15 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar16, iVar15, kVarC, qVar2, lVarV, (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar16;
                    iVar3 = iVar15;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i215 = i13 << 3;
                    androidx.compose.ui.d dVar17 = dVar3;
                    androidx.compose.animation.i iVar16 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar17, iVar16, kVarC, qVar2, lVarV, (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar17;
                    iVar3 = iVar16;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i216 = i13 << 3;
                androidx.compose.ui.d dVar18 = dVar3;
                androidx.compose.animation.i iVar17 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar18, iVar17, kVarC, qVar2, lVarV, (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar18;
                iVar3 = iVar17;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i217 = i13 << 3;
                androidx.compose.ui.d dVar19 = dVar3;
                androidx.compose.animation.i iVar18 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar19, iVar18, kVarC, qVar2, lVarV, (i217 & 57344) | (i217 & 896) | 48 | (i217 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar19;
                iVar3 = iVar18;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                iVar2 = iVar;
                if (lVarV.n(iVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    kVar2 = kVar;
                    if (lVarV.n(kVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 196608) == 0) {
                            if (lVarV.K(qVar2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((74899 & i13) == 74898) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i218 = i13 << 3;
                        androidx.compose.ui.d dVar110 = dVar3;
                        androidx.compose.animation.i iVar19 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar110, iVar19, kVarC, qVar2, lVarV, (i218 & 57344) | (i218 & 896) | 48 | (i218 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar110;
                        iVar3 = iVar19;
                        kVar3 = kVarC;
                    } else {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                        } else {
                            iVarC = iVar2;
                        }
                        if (i16 != 0) {
                            kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                        } else {
                            kVarC = kVar2;
                        }
                        if (i18 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i219 = i13 << 3;
                        androidx.compose.ui.d dVar111 = dVar3;
                        androidx.compose.animation.i iVar110 = iVarC;
                        g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar111, iVar110, kVarC, qVar2, lVarV, (i219 & 57344) | (i219 & 896) | 48 | (i219 & 7168) | (i13 & 458752));
                        if (o.J()) {
                            o.R();
                        }
                        str4 = str3;
                        dVar4 = dVar111;
                        iVar3 = iVar110;
                        kVar3 = kVarC;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 24576;
                str2 = str;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2110 = i13 << 3;
                    androidx.compose.ui.d dVar112 = dVar3;
                    androidx.compose.animation.i iVar111 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar112, iVar111, kVarC, qVar2, lVarV, (i2110 & 57344) | (i2110 & 896) | 48 | (i2110 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar112;
                    iVar3 = iVar111;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2111 = i13 << 3;
                    androidx.compose.ui.d dVar113 = dVar3;
                    androidx.compose.animation.i iVar112 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar113, iVar112, kVarC, qVar2, lVarV, (i2111 & 57344) | (i2111 & 896) | 48 | (i2111 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar113;
                    iVar3 = iVar112;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            kVar2 = kVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2112 = i13 << 3;
                    androidx.compose.ui.d dVar114 = dVar3;
                    androidx.compose.animation.i iVar113 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar114, iVar113, kVarC, qVar2, lVarV, (i2112 & 57344) | (i2112 & 896) | 48 | (i2112 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar114;
                    iVar3 = iVar113;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2113 = i13 << 3;
                    androidx.compose.ui.d dVar115 = dVar3;
                    androidx.compose.animation.i iVar114 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar115, iVar114, kVarC, qVar2, lVarV, (i2113 & 57344) | (i2113 & 896) | 48 | (i2113 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar115;
                    iVar3 = iVar114;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2114 = i13 << 3;
                androidx.compose.ui.d dVar116 = dVar3;
                androidx.compose.animation.i iVar115 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar116, iVar115, kVarC, qVar2, lVarV, (i2114 & 57344) | (i2114 & 896) | 48 | (i2114 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar116;
                iVar3 = iVar115;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2115 = i13 << 3;
                androidx.compose.ui.d dVar117 = dVar3;
                androidx.compose.animation.i iVar116 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar117, iVar116, kVarC, qVar2, lVarV, (i2115 & 57344) | (i2115 & 896) | 48 | (i2115 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar117;
                iVar3 = iVar116;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        iVar2 = iVar;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                kVar2 = kVar;
                if (lVarV.n(kVar2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar2)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((74899 & i13) == 74898) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2116 = i13 << 3;
                    androidx.compose.ui.d dVar118 = dVar3;
                    androidx.compose.animation.i iVar117 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar118, iVar117, kVarC, qVar2, lVarV, (i2116 & 57344) | (i2116 & 896) | 48 | (i2116 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar118;
                    iVar3 = iVar117;
                    kVar3 = kVarC;
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                    } else {
                        iVarC = iVar2;
                    }
                    if (i16 != 0) {
                        kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                    } else {
                        kVarC = kVar2;
                    }
                    if (i18 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2117 = i13 << 3;
                    androidx.compose.ui.d dVar119 = dVar3;
                    androidx.compose.animation.i iVar118 = iVarC;
                    g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar119, iVar118, kVarC, qVar2, lVarV, (i2117 & 57344) | (i2117 & 896) | 48 | (i2117 & 7168) | (i13 & 458752));
                    if (o.J()) {
                        o.R();
                    }
                    str4 = str3;
                    dVar4 = dVar119;
                    iVar3 = iVar118;
                    kVar3 = kVarC;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
                }
            }
            i13 |= 24576;
            str2 = str;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2118 = i13 << 3;
                androidx.compose.ui.d dVar1110 = dVar3;
                androidx.compose.animation.i iVar119 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar1110, iVar119, kVarC, qVar2, lVarV, (i2118 & 57344) | (i2118 & 896) | 48 | (i2118 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1110;
                iVar3 = iVar119;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2119 = i13 << 3;
                androidx.compose.ui.d dVar1111 = dVar3;
                androidx.compose.animation.i iVar1110 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar1111, iVar1110, kVarC, qVar2, lVarV, (i2119 & 57344) | (i2119 & 896) | 48 | (i2119 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1111;
                iVar3 = iVar1110;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        kVar2 = kVar;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i13 |= i19;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar2)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((74899 & i13) == 74898) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i21110 = i13 << 3;
                androidx.compose.ui.d dVar1112 = dVar3;
                androidx.compose.animation.i iVar1111 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar1112, iVar1111, kVarC, qVar2, lVarV, (i21110 & 57344) | (i21110 & 896) | 48 | (i21110 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1112;
                iVar3 = iVar1111;
                kVar3 = kVarC;
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
                } else {
                    iVarC = iVar2;
                }
                if (i16 != 0) {
                    kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
                } else {
                    kVarC = kVar2;
                }
                if (i18 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i21111 = i13 << 3;
                androidx.compose.ui.d dVar1113 = dVar3;
                androidx.compose.animation.i iVar1112 = iVarC;
                g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar1113, iVar1112, kVarC, qVar2, lVarV, (i21111 & 57344) | (i21111 & 896) | 48 | (i21111 & 7168) | (i13 & 458752));
                if (o.J()) {
                    o.R();
                }
                str4 = str3;
                dVar4 = dVar1113;
                iVar3 = iVar1112;
                kVar3 = kVarC;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
            }
        }
        i13 |= 24576;
        str2 = str;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((i11 & 196608) == 0) {
                if (lVarV.K(qVar2)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
        }
        if ((74899 & i13) == 74898) {
            if (i22 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
            } else {
                iVarC = iVar2;
            }
            if (i16 != 0) {
                kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
            } else {
                kVarC = kVar2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            int i21112 = i13 << 3;
            androidx.compose.ui.d dVar1114 = dVar3;
            androidx.compose.animation.i iVar1113 = iVarC;
            g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar1114, iVar1113, kVarC, qVar2, lVarV, (i21112 & 57344) | (i21112 & 896) | 48 | (i21112 & 7168) | (i13 & 458752));
            if (o.J()) {
                o.R();
            }
            str4 = str3;
            dVar4 = dVar1114;
            iVar3 = iVar1113;
            kVar3 = kVarC;
        } else {
            if (i22 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                iVarC = androidx.compose.animation.g.m(null, BitmapDescriptorFactory.HUE_RED, 3, null).c(androidx.compose.animation.g.i(null, null, false, null, 15, null));
            } else {
                iVarC = iVar2;
            }
            if (i16 != 0) {
                kVarC = androidx.compose.animation.g.s(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, BitmapDescriptorFactory.HUE_RED, 3, null));
            } else {
                kVarC = kVar2;
            }
            if (i18 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(2088733774, i13, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            int i21113 = i13 << 3;
            androidx.compose.ui.d dVar1115 = dVar3;
            androidx.compose.animation.i iVar1114 = iVarC;
            g(m1.g(Boolean.valueOf(z12), str3, lVarV, (i13 & 14) | ((i13 >> 9) & 112), 0), C2040d.f95601c, dVar1115, iVar1114, kVarC, qVar2, lVarV, (i21113 & 57344) | (i21113 & 896) | 48 | (i21113 & 7168) | (i13 & 458752));
            if (o.J()) {
                o.R();
            }
            str4 = str3;
            dVar4 = dVar1115;
            iVar3 = iVar1114;
            kVar3 = kVarC;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(z12, dVar4, iVar3, kVar3, str4, qVar, i11, i12));
        }
    }

    public static final <T> void g(l1<T> l1Var, wn0.l<? super T, Boolean> lVar, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, q<? super p015o1.e, ? super p020r2.l, ? super Integer, jn0.h0> qVar, p020r2.l lVar2, int i11) {
        int i12;
        androidx.compose.animation.k kVar2;
        p020r2.l lVarV = lVar2.v(429978603);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(l1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(lVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.n(dVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.n(iVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            kVar2 = kVar;
            i12 |= lVarV.n(kVar2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 196608) == 0) {
            i12 |= lVarV.K(qVar) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(429978603, i12, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i13 = i12 & 112;
            int i14 = i12 & 14;
            boolean z11 = (i13 == 32) | (i14 == 4);
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new j(lVar, l1Var);
                lVarV.B(objI);
            }
            a(l1Var, lVar, androidx.compose.ui.layout.b.a(dVar, (q) objI), iVar, kVar2, k.f95632c, null, qVar, lVarV, i13 | i14 | 196608 | (i12 & 7168) | (57344 & i12) | ((i12 << 6) & 29360128), 64);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new l(l1Var, lVar, dVar, iVar, kVar, qVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(l1<p015o1.k> l1Var) {
        p015o1.k kVarI = l1Var.i();
        p015o1.k kVar = p015o1.k.PostExit;
        return kVarI == kVar && l1Var.p() == kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> p015o1.k k(l1<T> l1Var, wn0.l<? super T, Boolean> lVar, T t11, p020r2.l lVar2, int i11) {
        p015o1.k kVar;
        if (o.J()) {
            o.S(361571134, i11, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        lVar2.M(-902048200, l1Var);
        if (l1Var.u()) {
            lVar2.o(2101296683);
            lVar2.l();
            if (lVar.invoke(t11).booleanValue()) {
                kVar = p015o1.k.Visible;
            } else {
                kVar = lVar.invoke(l1Var.i()).booleanValue() ? p015o1.k.PostExit : p015o1.k.PreEnter;
            }
        } else {
            lVar2.o(2101530516);
            Object objI = lVar2.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = s3.d(Boolean.FALSE, null, 2, null);
                lVar2.B(objI);
            }
            p1 p1Var = (p1) objI;
            if (lVar.invoke(l1Var.i()).booleanValue()) {
                p1Var.setValue(Boolean.TRUE);
            }
            if (lVar.invoke(t11).booleanValue()) {
                kVar = p015o1.k.Visible;
            } else {
                kVar = ((Boolean) p1Var.getValue()).booleanValue() ? p015o1.k.PostExit : p015o1.k.PreEnter;
            }
            lVar2.l();
        }
        lVar2.S();
        if (o.J()) {
            o.R();
        }
        return kVar;
    }
}
