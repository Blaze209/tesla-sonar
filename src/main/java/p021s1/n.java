package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import v3.PointerInputChange;
import v3.f0;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0087@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\u0000H\u0080@¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0003*\u00020\bH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a8\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086@¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lv3/f0;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "e", "(Lv3/f0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv3/c;", "", "a", "(Lv3/c;)Z", "c", "(Lv3/f0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Lv3/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109587n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109588o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
            return ((a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f109588o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109587n;
            if (i11 == 0) {
                t.b(obj);
                v3.c cVar = (v3.c) this.f109588o;
                this.f109587n = 1;
                if (n.b(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {86}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109589n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f109590o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f109591p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109590o = obj;
            this.f109591p |= Integer.MIN_VALUE;
            return n.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {104, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
    static final class c extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109592n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109593o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f109594p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<v3.c, Continuation<? super h0>, Object> f109595q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(CoroutineContext coroutineContext, p<? super v3.c, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f109594p = coroutineContext;
            this.f109595q = pVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
            return ((c) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f109594p, this.f109595q, continuation);
            cVar.f109593o = obj;
            return cVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:38|21|(2:24|25)|34) */
        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Code duplicated, block: B:32:0x0068  */
        /* JADX WARN: Code duplicated, block: B:35:0x0073  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:38:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        
            if (r8 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
        
            r1 = r8;
            r8 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        
            if (p021s1.n.b(r1, r7) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, v3.c] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, v3.c] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f109592n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.f109593o
                v3.c r1 = (v3.c) r1
                jn0.t.b(r8)
                goto L28
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f109593o
                v3.c r1 = (v3.c) r1
                jn0.t.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r8 = r1
                goto L3b
            L2a:
                r8 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r7.f109593o
                v3.c r1 = (v3.c) r1
                jn0.t.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f109593o
                v3.c r8 = (v3.c) r8
            L3b:
                kotlin.coroutines.CoroutineContext r1 = r7.f109594p
                boolean r1 = kotlinx.coroutines.JobKt.isActive(r1)
                if (r1 == 0) goto L74
                wn0.p<v3.c, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r1 = r7.f109595q     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f109593o = r8     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f109592n = r4     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                goto L72
            L50:
                r1 = r8
            L51:
                r7.f109593o = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r7.f109592n = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r8 = p021s1.n.b(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r8 != r0) goto L28
                goto L72
            L5c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L60:
                kotlin.coroutines.CoroutineContext r5 = r7.f109594p
                boolean r5 = kotlinx.coroutines.JobKt.isActive(r5)
                if (r5 == 0) goto L73
                r7.f109593o = r1
                r7.f109592n = r2
                java.lang.Object r8 = p021s1.n.b(r1, r7)
                if (r8 != r0) goto L28
            L72:
                return r0
            L73:
                throw r8
            L74:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.n.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, 56}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109596n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109597o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f109598p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f109599q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f109600r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109599q = obj;
            this.f109600r |= Integer.MIN_VALUE;
            return n.e(null, null, this);
        }
    }

    public static final boolean a(v3.c cVar) {
        List<PointerInputChange> listC = cVar.s1().c();
        int size = listC.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            if (listC.get(i11).getPressed()) {
                z11 = true;
                break;
            }
        }
        return !z11;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[LOOP:0: B:20:0x0056->B:24:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[EDGE_INSN: B:28:0x003e->B:16:0x003e BREAK  A[LOOP:0: B:20:0x0056->B:24:0x0065], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(v3.c r6, p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            boolean r0 = r7 instanceof s1.n.b
            if (r0 == 0) goto L13
            r0 = r7
            s1.n$b r0 = (s1.n.b) r0
            int r1 = r0.f109591p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109591p = r1
            goto L18
        L13:
            s1.n$b r0 = new s1.n$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f109590o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f109591p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f109589n
            v3.c r6 = (v3.c) r6
            jn0.t.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            jn0.t.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            v3.o r7 = v3.o.Final
            r0.f109589n = r6
            r0.f109591p = r3
            java.lang.Object r7 = r6.S0(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            v3.m r7 = (v3.m) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            v3.x r5 = (v3.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.n.b(v3.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(f0 f0Var, Continuation<? super h0> continuation) {
        Object objZ0 = f0Var.z0(new a(null), continuation);
        return objZ0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZ0 : h0.f84049a;
    }

    public static final Object d(f0 f0Var, p<? super v3.c, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objZ0 = f0Var.z0(new c(continuation.getContext(), pVar, null), continuation);
        return objZ0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZ0 : h0.f84049a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:44|27|(2:30|31)|40) */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r2 = r8;
        r8 = r10;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (c(r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, v3.f0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, v3.f0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [v3.f0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    @jn0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(v3.f0 r8, wn0.p<? super v3.f0, ? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r9, p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            boolean r0 = r10 instanceof s1.n.d
            if (r0 == 0) goto L13
            r0 = r10
            s1.n$d r0 = (s1.n.d) r0
            int r1 = r0.f109600r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109600r = r1
            goto L18
        L13:
            s1.n$d r0 = new s1.n$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f109599q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f109600r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.f109598p
            kotlin.coroutines.CoroutineContext r8 = (p013kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f109597o
            wn0.p r9 = (wn0.p) r9
            java.lang.Object r2 = r0.f109596n
            v3.f0 r2 = (v3.f0) r2
            jn0.t.b(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.f109598p
            kotlin.coroutines.CoroutineContext r8 = (p013kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f109597o
            wn0.p r9 = (wn0.p) r9
            java.lang.Object r2 = r0.f109596n
            v3.f0 r2 = (v3.f0) r2
            jn0.t.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            r10 = move-exception
            goto L99
        L57:
            java.lang.Object r8 = r0.f109598p
            kotlin.coroutines.CoroutineContext r8 = (p013kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f109597o
            wn0.p r9 = (wn0.p) r9
            java.lang.Object r2 = r0.f109596n
            v3.f0 r2 = (v3.f0) r2
            jn0.t.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
            goto L85
        L67:
            jn0.t.b(r10)
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
        L6e:
            boolean r2 = kotlinx.coroutines.JobKt.isActive(r10)
            if (r2 == 0) goto Laf
            r0.f109596n = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f109597o = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f109598p = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.f109600r = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            goto Lad
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.f109596n = r2     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f109597o = r9     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f109598p = r8     // Catch: java.util.concurrent.CancellationException -> L55
            r0.f109600r = r4     // Catch: java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L55
            if (r10 != r1) goto L52
            goto Lad
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = kotlinx.coroutines.JobKt.isActive(r8)
            if (r6 == 0) goto Lae
            r0.f109596n = r2
            r0.f109597o = r9
            r0.f109598p = r8
            r0.f109600r = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L52
        Lad:
            return r1
        Lae:
            throw r10
        Laf:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.n.e(v3.f0, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
