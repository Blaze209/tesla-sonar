package p020r2;

import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001aW\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001aa\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "initialValue", "Lkotlin/Function2;", "Lr2/e2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "producer", "Lr2/y3;", "c", "(Ljava/lang/Object;Lwn0/p;Lr2/l;I)Lr2/y3;", "key1", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/p;Lr2/l;I)Lr2/y3;", "key2", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwn0/p;Lr2/l;I)Lr2/y3;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class p3 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106747n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106748o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<e2<T>, Continuation<? super h0>, Object> f106749p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p1<T> f106750q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, p1<T> p1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f106749p = pVar;
            this.f106750q = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f106749p, this.f106750q, continuation);
            aVar.f106748o = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to r2.p3$a for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f106747n
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f106748o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                wn0.p<r2.e2<T>, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r1 = r5.f106749p
                r2.f2 r3 = new r2.f2
                r2.p1<T> r4 = r5.f106750q
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f106747n = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.p3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2$1", f = "ProduceState.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106751n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106752o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<e2<T>, Continuation<? super h0>, Object> f106753p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p1<T> f106754q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, p1<T> p1Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f106753p = pVar;
            this.f106754q = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f106753p, this.f106754q, continuation);
            bVar.f106752o = obj;
            return bVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to r2.p3$b for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f106751n
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f106752o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                wn0.p<r2.e2<T>, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r1 = r5.f106753p
                r2.f2 r3 = new r2.f2
                r2.p1<T> r4 = r5.f106754q
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f106751n = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.p3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", f = "ProduceState.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106755n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106756o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<e2<T>, Continuation<? super h0>, Object> f106757p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p1<T> f106758q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, p1<T> p1Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f106757p = pVar;
            this.f106758q = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f106757p, this.f106758q, continuation);
            cVar.f106756o = obj;
            return cVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to r2.p3$c for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f106755n
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f106756o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                wn0.p<r2.e2<T>, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r1 = r5.f106757p
                r2.f2 r3 = new r2.f2
                r2.p1<T> r4 = r5.f106758q
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f106755n = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.p3.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T> y3<T> a(T t11, Object obj, Object obj2, p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(-1703169085, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object objI = lVar.I();
        l.Companion companion = l.INSTANCE;
        if (objI == companion.a()) {
            objI = s3.d(t11, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        boolean zK = lVar.K(pVar);
        Object objI2 = lVar.I();
        if (zK || objI2 == companion.a()) {
            objI2 = new c(pVar, p1Var, null);
            lVar.B(objI2);
        }
        Function0.f(obj, obj2, (p) objI2, lVar, (i11 >> 3) & 126);
        if (o.J()) {
            o.R();
        }
        return p1Var;
    }

    public static final <T> y3<T> b(T t11, Object obj, p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(-1928268701, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        Object objI = lVar.I();
        l.Companion companion = l.INSTANCE;
        if (objI == companion.a()) {
            objI = s3.d(t11, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        boolean zK = lVar.K(pVar);
        Object objI2 = lVar.I();
        if (zK || objI2 == companion.a()) {
            objI2 = new b(pVar, p1Var, null);
            lVar.B(objI2);
        }
        Function0.g(obj, (p) objI2, lVar, (i11 >> 3) & 14);
        if (o.J()) {
            o.R();
        }
        return p1Var;
    }

    public static final <T> y3<T> c(T t11, p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(10454275, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        Object objI = lVar.I();
        l.Companion companion = l.INSTANCE;
        if (objI == companion.a()) {
            objI = s3.d(t11, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        h0 h0Var = h0.f84049a;
        boolean zK = lVar.K(pVar);
        Object objI2 = lVar.I();
        if (zK || objI2 == companion.a()) {
            objI2 = new a(pVar, p1Var, null);
            lVar.B(objI2);
        }
        Function0.g(h0Var, (p) objI2, lVar, 6);
        if (o.J()) {
            o.R();
        }
        return p1Var;
    }
}
