package androidx.compose.ui.platform;

import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001aB\u0010\r\u001a\u00020\u0004*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0082@¢\u0006\u0004\b\r\u0010\u000e\"\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/c2;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/f2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "b", "(Landroidx/compose/ui/platform/c2;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lb4/j1;", "Landroidx/compose/ui/platform/w0;", "chainedInterceptor", "session", "c", "(Lb4/j1;Landroidx/compose/ui/platform/w0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr2/g2;", "a", "Lr2/g2;", "LocalChainedPlatformTextInputInterceptor", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p020r2.g2<w0> f5680a = p020r2.w.f(a.f5681c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/w0;", "b", "()Landroidx/compose/ui/platform/w0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<w0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5681c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w0 invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {143}, m = "establishTextInputSession", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5682n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f5683o;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5682n = obj;
            this.f5683o |= Integer.MIN_VALUE;
            return d2.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {194, 196}, m = "interceptedTextInputSession", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f5685o;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5684n = obj;
            this.f5685o |= Integer.MIN_VALUE;
            return d2.c(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(c2 c2Var, wn0.p<? super f2, ? super Continuation<?>, ? extends Object> pVar, Continuation<?> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f5683o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f5683o = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f5682n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f5683o;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (!c2Var.getNode().getIsAttached()) {
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
            b4.j1 j1VarN = b4.k.n(c2Var);
            w0 w0Var = (w0) b4.k.m(c2Var).getCompositionLocalMap().b(f5680a);
            bVar.f5683o = 1;
            if (c(j1VarN, w0Var, pVar, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r5.g(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.c(r5, r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(b4.j1 r5, androidx.compose.ui.platform.w0 r6, wn0.p<? super androidx.compose.ui.platform.f2, ? super p013kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r7, p013kotlin.coroutines.Continuation<?> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.d2.c
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.d2$c r0 = (androidx.compose.ui.platform.d2.c) r0
            int r1 = r0.f5685o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5685o = r1
            goto L18
        L13:
            androidx.compose.ui.platform.d2$c r0 = new androidx.compose.ui.platform.d2$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5684n
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5685o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            jn0.t.b(r8)
            goto L55
        L34:
            jn0.t.b(r8)
            goto L46
        L38:
            jn0.t.b(r8)
            if (r6 != 0) goto L4c
            r0.f5685o = r4
            java.lang.Object r5 = r5.g(r7, r0)
            if (r5 != r1) goto L46
            goto L54
        L46:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L4c:
            r0.f5685o = r3
            java.lang.Object r5 = r6.c(r5, r7, r0)
            if (r5 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d2.c(b4.j1, androidx.compose.ui.platform.w0, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
