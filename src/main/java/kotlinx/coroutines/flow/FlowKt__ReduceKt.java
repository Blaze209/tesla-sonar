package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.n0;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aT\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001aZ\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00028\u00012*\b\u0004\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0086H¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u000f\u0010\u000e\u001a \u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0010\u0010\u000e\u001aD\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011H\u0086@¢\u0006\u0004\b\u0010\u0010\u0014\u001a\"\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u000e\u001aF\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0014\u001a \u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0016\u0010\u000e\u001a\"\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "operation", "reduce", "(Lkotlinx/coroutines/flow/Flow;Lwn0/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "initial", "fold", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lwn0/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "singleOrNull", "first", "Lkotlin/Function2;", "", "predicate", "(Lkotlinx/coroutines/flow/Flow;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass3<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C47671<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47671(Continuation<? super C47671> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C47683<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47683(Continuation<? super C47683> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {40}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    static final class C47691<T, R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47691(Continuation<? super C47691> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ n0<R> $accumulator;
        final /* synthetic */ q<R, T, Continuation<? super R>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(n0<R> n0Var, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
            this.$accumulator = n0Var;
            this.$operation = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t11, Continuation<? super h0> continuation) {
            FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
            n0 n0Var;
            if (continuation instanceof FlowKt__ReduceKt$fold$2$emit$1) {
                flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) continuation;
                int i11 = flowKt__ReduceKt$fold$2$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$fold$2$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
                }
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            }
            Object obj = flowKt__ReduceKt$fold$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = flowKt__ReduceKt$fold$2$emit$1.label;
            if (i12 == 0) {
                t.b(obj);
                n0 n0Var2 = this.$accumulator;
                q<R, T, Continuation<? super R>, Object> qVar = this.$operation;
                T t12 = n0Var2.f86529a;
                flowKt__ReduceKt$fold$2$emit$1.L$0 = n0Var2;
                flowKt__ReduceKt$fold$2$emit$1.label = 1;
                Object objInvoke = qVar.invoke((R) t12, t11, flowKt__ReduceKt$fold$2$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = (T) objInvoke;
                n0Var = n0Var2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var = (n0) flowKt__ReduceKt$fold$2$emit$1.L$0;
                t.b(obj);
            }
            n0Var.f86529a = (T) obj;
            return h0.f84049a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object emit$$forInline(T t11, Continuation<? super h0> continuation) {
            p013kotlin.jvm.internal.q.c(4);
            new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            p013kotlin.jvm.internal.q.c(5);
            n0<R> n0Var = this.$accumulator;
            n0Var.f86529a = (T) this.$operation.invoke((R) n0Var.f86529a, t11, (Continuation<? super R>) continuation);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {151}, m = "last", n = {"result"}, s = {"L$0"})
    static final class C47701<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47701(Continuation<? super C47701> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {163}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    static final class C47721<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47721(Continuation<? super C47721> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    static final class C47741<S, T extends S> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47741(Continuation<? super C47741> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C47752<T> implements FlowCollector {
        final /* synthetic */ n0<Object> $accumulator;
        final /* synthetic */ q<S, T, Continuation<? super S>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        C47752(n0<Object> n0Var, q<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> qVar) {
            this.$accumulator = n0Var;
            this.$operation = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t11, Continuation<? super h0> continuation) {
            FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
            n0<Object> n0Var;
            n0<Object> n0Var2;
            if (continuation instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
                flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) continuation;
                int i11 = flowKt__ReduceKt$reduce$2$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$reduce$2$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
                }
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
            }
            Object obj = flowKt__ReduceKt$reduce$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = flowKt__ReduceKt$reduce$2$emit$1.label;
            if (i12 == 0) {
                t.b(obj);
                n0Var = this.$accumulator;
                Object obj2 = n0Var.f86529a;
                if (obj2 != NullSurrogateKt.NULL) {
                    q<S, T, Continuation<? super S>, Object> qVar = this.$operation;
                    flowKt__ReduceKt$reduce$2$emit$1.L$0 = n0Var;
                    flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                    Object objInvoke = qVar.invoke((S) obj2, t11, flowKt__ReduceKt$reduce$2$emit$1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    n0Var2 = n0Var;
                }
                n0Var.f86529a = t11;
                return h0.f84049a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var2 = (n0) flowKt__ReduceKt$reduce$2$emit$1.L$0;
            t.b(obj);
            Object obj3 = obj;
            n0Var = n0Var2;
            t11 = (T) obj3;
            n0Var.f86529a = t11;
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
    static final class C47761<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C47761(Continuation<? super C47761> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    static final class C47781<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47781(Continuation<? super C47781> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object first(Flow<? extends T> flow, Continuation<? super T> continuation) {
        AnonymousClass1 anonymousClass1;
        n0 n0Var;
        AbortFlowException e11;
        FlowCollector<T> flowCollector;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            t.b(obj);
            final n0 n0Var2 = new n0();
            n0Var2.f86529a = (T) NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t11, Continuation<? super h0> continuation2) {
                    n0Var2.f86529a = t11;
                    throw new AbortFlowException(this);
                }
            };
            try {
                anonymousClass1.L$0 = n0Var2;
                anonymousClass1.L$1 = flowCollector2;
                anonymousClass1.label = 1;
                if (flow.collect(flowCollector2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n0Var = n0Var2;
            } catch (AbortFlowException e12) {
                n0Var = n0Var2;
                e11 = e12;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) anonymousClass1.L$1;
            n0Var = (n0) anonymousClass1.L$0;
            try {
                t.b(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        T t11 = n0Var.f86529a;
        if (t11 != NullSurrogateKt.NULL) {
            return t11;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C47671 c47671;
        n0 n0Var;
        AbortFlowException e11;
        FlowCollector<T> flowCollector;
        if (continuation instanceof C47671) {
            c47671 = (C47671) continuation;
            int i11 = c47671.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47671.label = i11 - Integer.MIN_VALUE;
            } else {
                c47671 = new C47671(continuation);
            }
        } else {
            c47671 = new C47671(continuation);
        }
        Object obj = c47671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47671.label;
        if (i12 == 0) {
            t.b(obj);
            final n0 n0Var2 = new n0();
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t11, Continuation<? super h0> continuation2) {
                    n0Var2.f86529a = t11;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c47671.L$0 = n0Var2;
                c47671.L$1 = flowCollector2;
                c47671.label = 1;
                if (flow.collect(flowCollector2, c47671) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n0Var = n0Var2;
            } catch (AbortFlowException e12) {
                n0Var = n0Var2;
                e11 = e12;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47671.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) c47671.L$1;
            n0Var = (n0) c47671.L$0;
            try {
                t.b(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47671.getContext());
            }
        }
        return n0Var.f86529a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> Object fold(Flow<? extends T> flow, R r11, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super R> continuation) {
        C47691 c47691;
        n0 n0Var;
        if (continuation instanceof C47691) {
            c47691 = (C47691) continuation;
            int i11 = c47691.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47691.label = i11 - Integer.MIN_VALUE;
            } else {
                c47691 = new C47691(continuation);
            }
        } else {
            c47691 = new C47691(continuation);
        }
        Object obj = c47691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47691.label;
        if (i12 == 0) {
            t.b(obj);
            n0 n0Var2 = new n0();
            n0Var2.f86529a = r11;
            FlowCollector<? super Object> anonymousClass2 = new AnonymousClass2<>(n0Var2, qVar);
            c47691.L$0 = n0Var2;
            c47691.label = 1;
            if (flow.collect(anonymousClass2, c47691) == coroutine_suspended) {
                return coroutine_suspended;
            }
            n0Var = n0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) c47691.L$0;
            t.b(obj);
        }
        return n0Var.f86529a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object fold$$forInline(Flow<? extends T> flow, R r11, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super R> continuation) {
        n0 n0Var = new n0();
        n0Var.f86529a = r11;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(n0Var, qVar);
        p013kotlin.jvm.internal.q.c(0);
        flow.collect(anonymousClass2, continuation);
        p013kotlin.jvm.internal.q.c(1);
        return n0Var.f86529a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object last(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C47701 c47701;
        n0 n0Var;
        if (continuation instanceof C47701) {
            c47701 = (C47701) continuation;
            int i11 = c47701.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47701.label = i11 - Integer.MIN_VALUE;
            } else {
                c47701 = new C47701(continuation);
            }
        } else {
            c47701 = new C47701(continuation);
        }
        Object obj = c47701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47701.label;
        if (i12 == 0) {
            t.b(obj);
            final n0 n0Var2 = new n0();
            n0Var2.f86529a = (T) NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.last.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t11, Continuation<? super h0> continuation2) {
                    n0Var2.f86529a = t11;
                    return h0.f84049a;
                }
            };
            c47701.L$0 = n0Var2;
            c47701.label = 1;
            if (flow.collect(flowCollector, c47701) == coroutine_suspended) {
                return coroutine_suspended;
            }
            n0Var = n0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) c47701.L$0;
            t.b(obj);
        }
        T t11 = n0Var.f86529a;
        if (t11 != NullSurrogateKt.NULL) {
            return t11;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object lastOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C47721 c47721;
        n0 n0Var;
        if (continuation instanceof C47721) {
            c47721 = (C47721) continuation;
            int i11 = c47721.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47721.label = i11 - Integer.MIN_VALUE;
            } else {
                c47721 = new C47721(continuation);
            }
        } else {
            c47721 = new C47721(continuation);
        }
        Object obj = c47721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47721.label;
        if (i12 == 0) {
            t.b(obj);
            final n0 n0Var2 = new n0();
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t11, Continuation<? super h0> continuation2) {
                    n0Var2.f86529a = t11;
                    return h0.f84049a;
                }
            };
            c47721.L$0 = n0Var2;
            c47721.label = 1;
            if (flow.collect(flowCollector, c47721) == coroutine_suspended) {
                return coroutine_suspended;
            }
            n0Var = n0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) c47721.L$0;
            t.b(obj);
        }
        return n0Var.f86529a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.Symbol] */
    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, q<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> qVar, Continuation<? super S> continuation) {
        C47741 c47741;
        n0 n0Var;
        if (continuation instanceof C47741) {
            c47741 = (C47741) continuation;
            int i11 = c47741.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47741.label = i11 - Integer.MIN_VALUE;
            } else {
                c47741 = new C47741(continuation);
            }
        } else {
            c47741 = new C47741(continuation);
        }
        Object obj = c47741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47741.label;
        if (i12 == 0) {
            t.b(obj);
            n0 n0Var2 = new n0();
            n0Var2.f86529a = NullSurrogateKt.NULL;
            FlowCollector<? super Object> c47752 = new C47752<>(n0Var2, qVar);
            c47741.L$0 = n0Var2;
            c47741.label = 1;
            if (flow.collect(c47752, c47741) == coroutine_suspended) {
                return coroutine_suspended;
            }
            n0Var = n0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) c47741.L$0;
            t.b(obj);
        }
        T t11 = n0Var.f86529a;
        if (t11 != NullSurrogateKt.NULL) {
            return t11;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object single(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C47761 c47761;
        n0 n0Var;
        if (continuation instanceof C47761) {
            c47761 = (C47761) continuation;
            int i11 = c47761.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47761.label = i11 - Integer.MIN_VALUE;
            } else {
                c47761 = new C47761(continuation);
            }
        } else {
            c47761 = new C47761(continuation);
        }
        Object obj = c47761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47761.label;
        if (i12 == 0) {
            t.b(obj);
            final n0 n0Var2 = new n0();
            n0Var2.f86529a = (T) NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.single.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t11, Continuation<? super h0> continuation2) {
                    n0<Object> n0Var3 = n0Var2;
                    if (n0Var3.f86529a != NullSurrogateKt.NULL) {
                        throw new IllegalArgumentException("Flow has more than one element");
                    }
                    n0Var3.f86529a = t11;
                    return h0.f84049a;
                }
            };
            c47761.L$0 = n0Var2;
            c47761.label = 1;
            if (flow.collect(flowCollector, c47761) == coroutine_suspended) {
                return coroutine_suspended;
            }
            n0Var = n0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) c47761.L$0;
            t.b(obj);
        }
        T t11 = n0Var.f86529a;
        if (t11 != NullSurrogateKt.NULL) {
            return t11;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object singleOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C47781 c47781;
        n0 n0Var;
        AbortFlowException e11;
        FlowCollector<T> flowCollector;
        if (continuation instanceof C47781) {
            c47781 = (C47781) continuation;
            int i11 = c47781.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47781.label = i11 - Integer.MIN_VALUE;
            } else {
                c47781 = new C47781(continuation);
            }
        } else {
            c47781 = new C47781(continuation);
        }
        Object obj = c47781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47781.label;
        if (i12 == 0) {
            t.b(obj);
            final n0 n0Var2 = new n0();
            n0Var2.f86529a = (T) NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t11, Continuation<? super h0> continuation2) {
                    n0 n0Var3 = n0Var2;
                    T t12 = n0Var3.f86529a;
                    T t13 = (T) NullSurrogateKt.NULL;
                    if (t12 == t13) {
                        n0Var3.f86529a = t11;
                        return h0.f84049a;
                    }
                    n0Var3.f86529a = t13;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c47781.L$0 = n0Var2;
                c47781.L$1 = flowCollector2;
                c47781.label = 1;
                if (flow.collect(flowCollector2, c47781) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n0Var = n0Var2;
            } catch (AbortFlowException e12) {
                n0Var = n0Var2;
                e11 = e12;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47781.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) c47781.L$1;
            n0Var = (n0) c47781.L$0;
            try {
                t.b(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47781.getContext());
            }
        }
        T t11 = n0Var.f86529a;
        if (t11 == NullSurrogateKt.NULL) {
            return null;
        }
        return t11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object first(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super T> continuation) {
        AnonymousClass3 anonymousClass3;
        n0 n0Var;
        AbortFlowException e11;
        FlowCollector<? super Object> flowCollector;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i11 = anonymousClass3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        Object obj = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass3.label;
        if (i12 == 0) {
            t.b(obj);
            n0 n0Var2 = new n0();
            n0Var2.f86529a = (T) NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(pVar, n0Var2);
            try {
                anonymousClass3.L$0 = n0Var2;
                anonymousClass3.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                anonymousClass3.label = 1;
                if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, anonymousClass3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n0Var = n0Var2;
            } catch (AbortFlowException e12) {
                n0Var = n0Var2;
                e11 = e12;
                flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(anonymousClass3.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass3.L$1;
            n0Var = (n0) anonymousClass3.L$0;
            try {
                t.b(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(anonymousClass3.getContext());
            }
        }
        T t11 = n0Var.f86529a;
        if (t11 != NullSurrogateKt.NULL) {
            return t11;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super T> continuation) {
        C47683 c47683;
        n0 n0Var;
        AbortFlowException e11;
        FlowCollector<? super Object> flowCollector;
        if (continuation instanceof C47683) {
            c47683 = (C47683) continuation;
            int i11 = c47683.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c47683.label = i11 - Integer.MIN_VALUE;
            } else {
                c47683 = new C47683(continuation);
            }
        } else {
            c47683 = new C47683(continuation);
        }
        Object obj = c47683.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c47683.label;
        if (i12 == 0) {
            t.b(obj);
            n0 n0Var2 = new n0();
            FlowCollector<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(pVar, n0Var2);
            try {
                c47683.L$0 = n0Var2;
                c47683.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                c47683.label = 1;
                if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, c47683) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n0Var = n0Var2;
            } catch (AbortFlowException e12) {
                n0Var = n0Var2;
                e11 = e12;
                flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47683.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c47683.L$1;
            n0Var = (n0) c47683.L$0;
            try {
                t.b(obj);
            } catch (AbortFlowException e13) {
                e11 = e13;
                FlowExceptions_commonKt.checkOwnership(e11, flowCollector);
                JobKt.ensureActive(c47683.getContext());
            }
        }
        return n0Var.f86529a;
    }
}
