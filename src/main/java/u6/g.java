package u6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu6/g;", "T", "", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u6.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu6/g$a;", "", "<init>", "()V", "T", "", "Lu6/f;", "migrations", "Lu6/r;", "api", "Ljn0/h0;", "c", "(Ljava/util/List;Lu6/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "b", "(Ljava/util/List;)Lwn0/p;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: u6.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/r;", "api", "Ljn0/h0;", "<anonymous>", "(Lu6/r;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        static final class C2476a extends SuspendLambda implements wn0.p<r<T>, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115460n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f115461o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ List<f<T>> f115462p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2476a(List<? extends f<T>> list, Continuation<? super C2476a> continuation) {
                super(2, continuation);
                this.f115462p = list;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r<T> rVar, Continuation<? super jn0.h0> continuation) {
                return ((C2476a) create(rVar, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                C2476a c2476a = new C2476a(this.f115462p, continuation);
                c2476a.f115461o = obj;
                return c2476a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f115460n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    r rVar = (r) this.f115461o;
                    Companion companion = g.INSTANCE;
                    List<f<T>> list = this.f115462p;
                    this.f115460n = 1;
                    if (companion.c(list, rVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: u6.g$a$b */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
        static final class b<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f115463n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f115464o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f115465p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f115467r;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f115465p = obj;
                this.f115467r |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: u6.g$a$c */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
        static final class c extends SuspendLambda implements wn0.p<T, Continuation<? super T>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f115468n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f115469o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f115470p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f115471q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f115472r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ List<f<T>> f115473s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List<wn0.l<Continuation<? super jn0.h0>, Object>> f115474t;

            /* JADX INFO: renamed from: u6.g$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
            static final class C2477a extends SuspendLambda implements wn0.l<Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f115475n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ f<T> f115476o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2477a(f<T> fVar, Continuation<? super C2477a> continuation) {
                    super(1, continuation);
                    this.f115476o = fVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Continuation<?> continuation) {
                    return new C2477a(this.f115476o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f115475n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        f<T> fVar = this.f115476o;
                        this.f115475n = 1;
                        if (fVar.b(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    return jn0.h0.f84049a;
                }

                @Override // wn0.l
                public final Object invoke(Continuation<? super jn0.h0> continuation) {
                    return ((C2477a) create(continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends f<T>> list, List<wn0.l<Continuation<? super jn0.h0>, Object>> list2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f115473s = list;
                this.f115474t = list2;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f115473s, this.f115474t, continuation);
                cVar.f115472r = obj;
                return cVar;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004c  */
            /* JADX WARN: Code duplicated, block: B:16:0x0063  */
            /* JADX WARN: Code duplicated, block: B:19:0x0070  */
            /* JADX WARN: Code duplicated, block: B:22:0x008a  */
            /* JADX WARN: Code duplicated, block: B:23:0x008c  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f115471q
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f115468n
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f115472r
                    java.util.List r4 = (java.util.List) r4
                    jn0.t.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f115470p
                    java.lang.Object r4 = r9.f115469o
                    u6.f r4 = (u6.f) r4
                    java.lang.Object r5 = r9.f115468n
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f115472r
                    java.util.List r6 = (java.util.List) r6
                    jn0.t.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    jn0.t.b(r10)
                    java.lang.Object r10 = r9.f115472r
                    java.util.List<u6.f<T>> r1 = r9.f115473s
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<wn0.l<kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object>> r4 = r9.f115474t
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    u6.f r5 = (u6.f) r5
                    r9.f115472r = r4
                    r9.f115468n = r1
                    r9.f115469o = r5
                    r9.f115470p = r10
                    r9.f115471q = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L63
                    goto L89
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    u6.g$a$c$a r10 = new u6.g$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f115472r = r4
                    r9.f115468n = r5
                    r9.f115469o = r7
                    r9.f115470p = r7
                    r9.f115471q = r2
                    java.lang.Object r10 = r6.c(r1, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.g.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(T t11, Continuation<? super T> continuation) {
                return ((c) create(t11, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:37:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006b->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        public final <T> Object c(List<? extends f<T>> list, r<T> rVar, Continuation<? super jn0.h0> continuation) throws Throwable {
            b bVar;
            List list2;
            p013kotlin.jvm.internal.n0 n0Var;
            Iterator<T> it;
            Throwable th2;
            wn0.l lVar;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i11 = bVar.f115467r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f115467r = i11 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(continuation);
                }
            } else {
                bVar = new b(continuation);
            }
            Object obj = bVar.f115465p;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = bVar.f115467r;
            if (i12 == 0) {
                jn0.t.b(obj);
                ArrayList arrayList = new ArrayList();
                wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> cVar = new c(list, arrayList, null);
                bVar.f115463n = arrayList;
                bVar.f115467r = 1;
                if (rVar.a(cVar, bVar) != coroutine_suspended) {
                    list2 = arrayList;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                list2 = (List) bVar.f115463n;
                jn0.t.b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f115464o;
                n0Var = (p013kotlin.jvm.internal.n0) bVar.f115463n;
                try {
                    jn0.t.b(obj);
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    this = this;
                    boolean r0 = r9 instanceof u6.g.Companion.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    u6.g$a$b r0 = (u6.g.Companion.b) r0
                    int r1 = r0.f115467r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f115467r = r1
                    goto L18
                L13:
                    u6.g$a$b r0 = new u6.g$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f115465p
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f115467r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L46
                    if (r2 == r4) goto L3e
                    if (r2 != r3) goto L36
                    java.lang.Object r7 = r0.f115464o
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r0.f115463n
                    kotlin.jvm.internal.n0 r8 = (p013kotlin.jvm.internal.n0) r8
                    jn0.t.b(r9)     // Catch: java.lang.Throwable -> L34
                    goto L6b
                L34:
                    r9 = move-exception
                    goto L84
                L36:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3e:
                    java.lang.Object r7 = r0.f115463n
                    java.util.List r7 = (java.util.List) r7
                    jn0.t.b(r9)
                    goto L60
                L46:
                    jn0.t.b(r9)
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    u6.g$a$c r2 = new u6.g$a$c
                    r5 = 0
                    r2.<init>(r7, r9, r5)
                    r0.f115463n = r9
                    r0.f115467r = r4
                    java.lang.Object r7 = r8.a(r2, r0)
                    if (r7 != r1) goto L5f
                    goto L83
                L5f:
                    r7 = r9
                L60:
                    kotlin.jvm.internal.n0 r8 = new kotlin.jvm.internal.n0
                    r8.<init>()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L6b:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L94
                    java.lang.Object r9 = r7.next()
                    wn0.l r9 = (wn0.l) r9
                    r0.f115463n = r8     // Catch: java.lang.Throwable -> L34
                    r0.f115464o = r7     // Catch: java.lang.Throwable -> L34
                    r0.f115467r = r3     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                    if (r9 != r1) goto L6b
                L83:
                    return r1
                L84:
                    T r2 = r8.f86529a
                    if (r2 != 0) goto L8b
                    r8.f86529a = r9
                    goto L6b
                L8b:
                    p013kotlin.jvm.internal.s.h(r2)
                    java.lang.Throwable r2 = (java.lang.Throwable) r2
                    jn0.g.a(r2, r9)
                    goto L6b
                L94:
                    T r7 = r8.f86529a
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    if (r7 != 0) goto L9d
                    jn0.h0 r7 = jn0.h0.f84049a
                    return r7
                L9d:
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.g.Companion.c(java.util.List, u6.r, kotlin.coroutines.Continuation):java.lang.Object");
            }

            public final <T> wn0.p<r<T>, Continuation<? super jn0.h0>, Object> b(List<? extends f<T>> migrations) {
                p013kotlin.jvm.internal.s.k(migrations, "migrations");
                return new C2476a(migrations, null);
            }

            private Companion() {
            }
        }
    }
