package c2;

import b4.m;
import b4.p1;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p021s1.n;
import v3.f0;
import v3.o;
import v3.o0;
import v3.q0;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\bR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lc2/a;", "Lb4/m;", "Lb4/p1;", "Li3/c;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lwn0/a;)V", "Li3/o;", "focusState", "Ljn0/h0;", "y", "(Li3/o;)V", "Lv3/m;", "pointerEvent", "Lv3/o;", "pass", "Lw4/r;", "bounds", "q0", "(Lv3/m;Lv3/o;J)V", "y0", "()V", "p", "Lwn0/a;", "E2", "()Lwn0/a;", "F2", "q", "Z", "focused", "Lv3/q0;", "r", "Lv3/q0;", "suspendingPointerInputModifierNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a extends m implements p1, i3.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private wn0.a<Boolean> onHandwritingSlopExceeded;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean focused;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final q0 suspendingPointerInputModifierNode = (q0) x2(o0.a(new C0368a(null)));

    /* JADX INFO: renamed from: c2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1", f = "StylusHandwriting.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    static final class C0368a extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18573n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f18574o;

        /* JADX INFO: renamed from: c2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", i = {0, 1, 1, 1, 2, 2}, l = {134, 158, 186}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
        static final class C0369a extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f18576n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f18577o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f18578p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private /* synthetic */ Object f18579q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f18580r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0369a(a aVar, Continuation<? super C0369a> continuation) {
                super(2, continuation);
                this.f18580r = aVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
                return ((C0369a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C0369a c0369a = new C0369a(this.f18580r, continuation);
                c0369a.f18579q = obj;
                return c0369a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
            
                if (r9 == r1) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0180, code lost:
            
                if (r5 == r1) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0182, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e8 -> B:42:0x00ec). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0180 -> B:69:0x0183). Please report as a decompilation issue!!! */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 455
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: c2.a.C0368a.C0369a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C0368a(Continuation<? super C0368a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C0368a c0368a = a.this.new C0368a(continuation);
            c0368a.f18574o = obj;
            return c0368a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18573n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f18574o;
                C0369a c0369a = new C0369a(a.this, null);
                this.f18573n = 1;
                if (n.d(f0Var, c0369a, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
            return ((C0368a) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(wn0.a<Boolean> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }

    public final wn0.a<Boolean> E2() {
        return this.onHandwritingSlopExceeded;
    }

    public final void F2(wn0.a<Boolean> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }

    @Override // b4.p1
    public void q0(v3.m pointerEvent, o pass, long bounds) {
        this.suspendingPointerInputModifierNode.q0(pointerEvent, pass, bounds);
    }

    @Override // i3.c
    public void y(i3.o focusState) {
        this.focused = focusState.isFocused();
    }

    @Override // b4.p1
    public void y0() {
        this.suspendingPointerInputModifierNode.y0();
    }
}
