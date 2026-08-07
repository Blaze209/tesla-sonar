package ka;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.p1;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p011ja.r;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.n3;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lka/i;", "dialogNavigator", "Ljn0/h0;", "a", "(Lka/i;Lr2/l;I)V", "", "Lja/k;", "", "backStack", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/util/Collection;Lr2/l;I)V", "Landroidx/compose/runtime/snapshots/k;", "f", "(Ljava/util/Collection;Lr2/l;I)Landroidx/compose/runtime/snapshots/k;", "", "dialogBackStack", "", "transitionInProgress", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f85613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p011ja.k f85614d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, p011ja.k kVar) {
            super(0);
            this.f85613c = iVar;
            this.f85614d = kVar;
        }

        public final void b() {
            this.f85613c.m(this.f85614d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p011ja.k f85615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f85616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a3.d f85617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<p011ja.k> f85618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.b f85619g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<l0, k0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<p011ja.k> f85620c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p011ja.k f85621d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i f85622e;

            /* JADX INFO: renamed from: ka.g$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ka/g$b$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class C1824a implements k0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f85623a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ p011ja.k f85624b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ SnapshotStateList f85625c;

                public C1824a(i iVar, p011ja.k kVar, SnapshotStateList snapshotStateList) {
                    this.f85623a = iVar;
                    this.f85624b = kVar;
                    this.f85625c = snapshotStateList;
                }

                @Override // p020r2.k0
                public void dispose() {
                    this.f85623a.p(this.f85624b);
                    this.f85625c.remove(this.f85624b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SnapshotStateList<p011ja.k> snapshotStateList, p011ja.k kVar, i iVar) {
                super(1);
                this.f85620c = snapshotStateList;
                this.f85621d = kVar;
                this.f85622e = iVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k0 invoke(l0 l0Var) {
                this.f85620c.add(this.f85621d);
                return new C1824a(this.f85622e, this.f85621d, this.f85620c);
            }
        }

        /* JADX INFO: renamed from: ka.g$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C1825b extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i.b f85626c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p011ja.k f85627d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1825b(i.b bVar, p011ja.k kVar) {
                super(2);
                this.f85626c = bVar;
                this.f85627d = kVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-497631156, i11, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                }
                this.f85626c.A().invoke(this.f85627d, lVar, 0);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p011ja.k kVar, i iVar, a3.d dVar, SnapshotStateList<p011ja.k> snapshotStateList, i.b bVar) {
            super(2);
            this.f85615c = kVar;
            this.f85616d = iVar;
            this.f85617e = dVar;
            this.f85618f = snapshotStateList;
            this.f85619g = bVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1129586364, i11, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            p011ja.k kVar = this.f85615c;
            boolean zK = lVar.K(kVar) | lVar.n(this.f85616d);
            SnapshotStateList<p011ja.k> snapshotStateList = this.f85618f;
            p011ja.k kVar2 = this.f85615c;
            i iVar = this.f85616d;
            Object objI = lVar.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(snapshotStateList, kVar2, iVar);
                lVar.B(objI);
            }
            Function0.c(kVar, (wn0.l) objI, lVar, 0);
            p011ja.k kVar3 = this.f85615c;
            j.a(kVar3, this.f85617e, z2.c.e(-497631156, true, new C1825b(this.f85619g, kVar3), lVar, 54), lVar, KyberEngine.KyberPolyBytes);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85628n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y3<Set<p011ja.k>> f85629o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ i f85630p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<p011ja.k> f85631q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(y3<? extends Set<p011ja.k>> y3Var, i iVar, SnapshotStateList<p011ja.k> snapshotStateList, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f85629o = y3Var;
            this.f85630p = iVar;
            this.f85631q = snapshotStateList;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f85629o, this.f85630p, this.f85631q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f85628n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Set<p011ja.k> setC = g.c(this.f85629o);
            i iVar = this.f85630p;
            SnapshotStateList<p011ja.k> snapshotStateList = this.f85631q;
            for (p011ja.k kVar : setC) {
                if (!iVar.n().getValue().contains(kVar) && !snapshotStateList.contains(kVar)) {
                    iVar.p(kVar);
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f85632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f85633d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i iVar, int i11) {
            super(2);
            this.f85632c = iVar;
            this.f85633d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            g.a(this.f85632c, lVar, k2.a(this.f85633d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "b", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p011ja.k f85634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f85635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<p011ja.k> f85636e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ka/g$e$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p011ja.k f85637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.p003lifecycle.u f85638b;

            public a(p011ja.k kVar, androidx.p003lifecycle.u uVar) {
                this.f85637a = kVar;
                this.f85638b = uVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f85637a.getLifecycle().d(this.f85638b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p011ja.k kVar, boolean z11, List<p011ja.k> list) {
            super(1);
            this.f85634c = kVar;
            this.f85635d = z11;
            this.f85636e = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(boolean z11, List list, p011ja.k kVar, LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
            if (z11 && !list.contains(kVar)) {
                list.add(kVar);
            }
            if (aVar == Lifecycle.a.ON_START && !list.contains(kVar)) {
                list.add(kVar);
            }
            if (aVar == Lifecycle.a.ON_STOP) {
                list.remove(kVar);
            }
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            final boolean z11 = this.f85635d;
            final List<p011ja.k> list = this.f85636e;
            final p011ja.k kVar = this.f85634c;
            androidx.p003lifecycle.u uVar = new androidx.p003lifecycle.u() { // from class: ka.h
                @Override // androidx.p003lifecycle.u
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                    g.e.c(z11, list, kVar, lifecycleOwner, aVar);
                }
            };
            this.f85634c.getLifecycle().a(uVar);
            return new a(this.f85634c, uVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<p011ja.k> f85639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Collection<p011ja.k> f85640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f85641e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List<p011ja.k> list, Collection<p011ja.k> collection, int i11) {
            super(2);
            this.f85639c = list;
            this.f85640d = collection;
            this.f85641e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            g.d(this.f85639c, this.f85640d, lVar, k2.a(this.f85641e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(i iVar, p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(294589392);
        int i12 = (i11 & 6) == 0 ? (lVarV.n(iVar) ? 4 : 2) | i11 : i11;
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(294589392, i12, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            a3.d dVarA = a3.f.a(lVarV, 0);
            Continuation continuation = null;
            boolean z11 = true;
            y3 y3VarB = n3.b(iVar.n(), null, lVarV, 0, 1);
            SnapshotStateList<p011ja.k> snapshotStateListF = f(b(y3VarB), lVarV, 0);
            d(snapshotStateListF, b(y3VarB), lVarV, 0);
            y3 y3VarB2 = n3.b(iVar.o(), null, lVarV, 0, 1);
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = n3.f();
                lVarV.B(objI);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objI;
            lVarV.o(1361037007);
            for (p011ja.k kVar : snapshotStateListF) {
                r destination = kVar.getDestination();
                s.i(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                i.b bVar = (i.b) destination;
                boolean zK = ((i12 & 14) == 4 ? z11 : false) | lVarV.K(kVar);
                Object objI2 = lVarV.I();
                if (zK || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new a(iVar, kVar);
                    lVarV.B(objI2);
                }
                androidx.compose.ui.window.b.a((wn0.a) objI2, bVar.getDialogProperties(), z2.c.e(1129586364, z11, new b(kVar, iVar, dVarA, snapshotStateList, bVar), lVarV, 54), lVarV, KyberEngine.KyberPolyBytes, 0);
                y3VarB2 = y3VarB2;
                continuation = continuation;
                z11 = z11;
            }
            Continuation continuation2 = continuation;
            boolean z12 = z11;
            y3 y3Var = y3VarB2;
            lVarV.l();
            Set<p011ja.k> setC = c(y3Var);
            boolean zN = lVarV.n(y3Var) | ((i12 & 14) == 4 ? z12 : false);
            Object objI3 = lVarV.I();
            if (zN || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new c(y3Var, iVar, snapshotStateList, continuation2);
                lVarV.B(objI3);
            }
            Function0.f(setC, snapshotStateList, (p) objI3, lVarV, 48);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(iVar, i11));
        }
    }

    private static final List<p011ja.k> b(y3<? extends List<p011ja.k>> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<p011ja.k> c(y3<? extends Set<p011ja.k>> y3Var) {
        return y3Var.getValue();
    }

    public static final void d(List<p011ja.k> list, Collection<p011ja.k> collection, p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(1537894851);
        int i12 = (i11 & 6) == 0 ? (lVarV.K(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(collection) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1537894851, i12, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
            for (p011ja.k kVar : collection) {
                Lifecycle lifecycle = kVar.getLifecycle();
                boolean zP = lVarV.p(zBooleanValue) | lVarV.K(list) | lVarV.K(kVar);
                Object objI = lVarV.I();
                if (zP || objI == p020r2.l.INSTANCE.a()) {
                    objI = new e(kVar, zBooleanValue, list);
                    lVarV.B(objI);
                }
                Function0.c(lifecycle, (wn0.l) objI, lVarV, 0);
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(list, collection, i11));
        }
    }

    public static final SnapshotStateList<p011ja.k> f(Collection<p011ja.k> collection, p020r2.l lVar, int i11) {
        Object obj;
        if (o.J()) {
            o.S(467378629, i11, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)");
        }
        boolean zBooleanValue = ((Boolean) lVar.U(p1.a())).booleanValue();
        boolean zN = lVar.n(collection);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            obj = objI;
            SnapshotStateList snapshotStateListF = n3.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collection) {
                if (zBooleanValue ? true : ((p011ja.k) obj2).getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList.add(obj2);
                }
            }
            snapshotStateListF.addAll(arrayList);
            lVar.B(snapshotStateListF);
            obj = snapshotStateListF;
        }
        obj = objI;
        SnapshotStateList<p011ja.k> snapshotStateList = (SnapshotStateList) obj;
        if (o.J()) {
            o.R();
        }
        return snapshotStateList;
    }
}
