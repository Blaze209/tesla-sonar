package androidx.compose.foundation.relocation;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/relocation/a;", "Lz1/b;", "<init>", "()V", "Lj3/i;", "rect", "Ljn0/h0;", "b", "(Lj3/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt2/b;", "Landroidx/compose/foundation/relocation/e;", "a", "Lt2/b;", "c", "()Lt2/b;", "modifiers", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a implements z1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t2.b<e> modifiers = new t2.b<>(new e[16], 0);

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {116}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class C0102a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4859n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f4860o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f4861p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4862q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4863r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4865t;

        C0102a(Continuation<? super C0102a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4863r = obj;
            this.f4865t |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 >= r2) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    @Override // z1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(j3.i r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.a.C0102a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.a$a r0 = (androidx.compose.foundation.relocation.a.C0102a) r0
            int r1 = r0.f4865t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4865t = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.a$a r0 = new androidx.compose.foundation.relocation.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4863r
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4865t
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f4862q
            int r2 = r0.f4861p
            java.lang.Object r4 = r0.f4860o
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f4859n
            j3.i r5 = (j3.i) r5
            jn0.t.b(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            jn0.t.b(r9)
            t2.b<androidx.compose.foundation.relocation.e> r9 = r7.modifiers
            int r2 = r9.getSize()
            if (r2 <= 0) goto L6a
            java.lang.Object[] r9 = r9.m()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.e r5 = (androidx.compose.foundation.relocation.e) r5
            r0.f4859n = r9
            r0.f4860o = r4
            r0.f4861p = r2
            r0.f4862q = r8
            r0.f4865t = r3
            java.lang.Object r5 = z1.e.a(r5, r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.b(j3.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final t2.b<e> c() {
        return this.modifiers;
    }
}
