package u3;

import b4.x1;
import b4.y1;
import j3.g;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w4.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b \u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010$R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lu3/c;", "Lb4/x1;", "Lu3/a;", "Landroidx/compose/ui/d$c;", "connection", "Lu3/b;", "dispatcher", "<init>", "(Lu3/a;Lu3/b;)V", "newDispatcher", "Ljn0/h0;", "C2", "(Lu3/b;)V", "D2", "()V", "B2", "Lj3/g;", "available", "Lu3/e;", "source", "L1", "(JI)J", "consumed", "n0", "(JJI)J", "Lw4/y;", "E0", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "V", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h2", "i2", "E2", "n", "Lu3/a;", "getConnection", "()Lu3/a;", "setConnection", "(Lu3/a;)V", "o", "Lu3/b;", "resolvedDispatcher", "", "p", "Ljava/lang/Object;", "P0", "()Ljava/lang/Object;", "traverseKey", "z2", "parentConnection", "Lkotlinx/coroutines/CoroutineScope;", "y2", "()Lkotlinx/coroutines/CoroutineScope;", "nestedCoroutineScope", "A2", "()Lu3/c;", "parentNestedScrollNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends androidx.compose.ui.d.c implements x1, u3.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private u3.a connection;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private u3.b resolvedDispatcher;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {104, 105}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115339n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f115340o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f115341p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f115342q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f115344s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115342q = obj;
            this.f115344s |= Integer.MIN_VALUE;
            return c.this.V(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {97, 98}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115345n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f115346o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115347p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115349r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115347p = obj;
            this.f115349r |= Integer.MIN_VALUE;
            return c.this.E0(0L, this);
        }
    }

    /* JADX INFO: renamed from: u3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "b", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0})
    static final class C2470c extends u implements wn0.a<CoroutineScope> {
        C2470c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return c.this.y2();
        }
    }

    public c(u3.a aVar, u3.b bVar) {
        this.connection = aVar;
        this.resolvedDispatcher = bVar == null ? new u3.b() : bVar;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final void B2() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.j(null);
        }
    }

    private final void C2(u3.b newDispatcher) {
        B2();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new u3.b();
        } else if (!s.f(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            D2();
        }
    }

    private final void D2() {
        this.resolvedDispatcher.j(this);
        this.resolvedDispatcher.i(new C2470c());
        this.resolvedDispatcher.k(X1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope y2() {
        CoroutineScope coroutineScopeY2;
        c cVarA2 = A2();
        if (cVarA2 != null && (coroutineScopeY2 = cVarA2.y2()) != null) {
            return coroutineScopeY2;
        }
        CoroutineScope coroutineScopeH = this.resolvedDispatcher.getScope();
        if (coroutineScopeH != null) {
            return coroutineScopeH;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final u3.a z2() {
        if (getIsAttached()) {
            return A2();
        }
        return null;
    }

    public final c A2() {
        if (getIsAttached()) {
            return (c) y1.b(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r11 == r1) goto L27;
     */
    @Override // u3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E0(long r9, p013kotlin.coroutines.Continuation<? super w4.y> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof u3.c.b
            if (r0 == 0) goto L13
            r0 = r11
            u3.c$b r0 = (u3.c.b) r0
            int r1 = r0.f115349r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115349r = r1
            goto L18
        L13:
            u3.c$b r0 = new u3.c$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f115347p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f115349r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f115346o
            jn0.t.b(r11)
            goto L7d
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f115346o
            java.lang.Object r2 = r0.f115345n
            u3.c r2 = (u3.c) r2
            jn0.t.b(r11)
            goto L57
        L40:
            jn0.t.b(r11)
            u3.a r11 = r8.z2()
            if (r11 == 0) goto L61
            r0.f115345n = r8
            r0.f115346o = r9
            r0.f115349r = r4
            java.lang.Object r11 = r11.E0(r9, r0)
            if (r11 != r1) goto L56
            goto L7c
        L56:
            r2 = r8
        L57:
            w4.y r11 = (w4.y) r11
            long r4 = r11.getPackedValue()
        L5d:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L69
        L61:
            w4.y$a r11 = w4.y.INSTANCE
            long r4 = r11.a()
            r2 = r8
            goto L5d
        L69:
            u3.a r11 = r2.connection
            long r4 = w4.y.k(r4, r9)
            r2 = 0
            r0.f115345n = r2
            r0.f115346o = r9
            r0.f115349r = r3
            java.lang.Object r11 = r11.E0(r4, r0)
            if (r11 != r1) goto L7d
        L7c:
            return r1
        L7d:
            w4.y r11 = (w4.y) r11
            long r0 = r11.getPackedValue()
            long r9 = w4.y.l(r9, r0)
            w4.y r9 = w4.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.c.E0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E2(u3.a connection, u3.b dispatcher) {
        this.connection = connection;
        C2(dispatcher);
    }

    @Override // u3.a
    public long L1(long available, int source) {
        u3.a aVarZ2 = z2();
        long jL1 = aVarZ2 != null ? aVarZ2.L1(available, source) : g.INSTANCE.c();
        return g.r(jL1, this.connection.L1(g.q(available, jL1), source));
    }

    @Override // b4.x1
    /* JADX INFO: renamed from: P0, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // u3.a
    public Object V(long j11, long j12, Continuation<? super y> continuation) {
        a aVar;
        c cVar;
        long j13;
        long j14;
        long packedValue;
        long jA;
        long j15;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f115344s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f115344s = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objV = aVar2.f115342q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f115344s;
        if (i12 != 0) {
            if (i12 == 1) {
                j14 = aVar2.f115341p;
                j13 = aVar2.f115340o;
                cVar = (c) aVar2.f115339n;
                t.b(objV);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = aVar2.f115340o;
                t.b(objV);
            }
            jA = ((y) objV).getPackedValue();
            packedValue = j15;
            return y.b(y.l(packedValue, jA));
        }
        t.b(objV);
        u3.a aVar3 = this.connection;
        aVar2.f115339n = this;
        aVar2.f115340o = j11;
        aVar2.f115341p = j12;
        aVar2.f115344s = 1;
        objV = aVar3.V(j11, j12, aVar2);
        if (objV != coroutine_suspended) {
            cVar = this;
            j13 = j11;
            j14 = j12;
        }
        return coroutine_suspended;
        packedValue = ((y) objV).getPackedValue();
        u3.a aVarZ2 = cVar.z2();
        if (aVarZ2 != null) {
            long jL = y.l(j13, packedValue);
            long jK = y.k(j14, packedValue);
            aVar2.f115339n = null;
            aVar2.f115340o = packedValue;
            aVar2.f115344s = 2;
            objV = aVarZ2.V(jL, jK, aVar2);
            if (objV != coroutine_suspended) {
                j15 = packedValue;
                jA = ((y) objV).getPackedValue();
                packedValue = j15;
            }
            return coroutine_suspended;
        }
        jA = y.INSTANCE.a();
        return y.b(y.l(packedValue, jA));
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        D2();
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        B2();
    }

    @Override // u3.a
    public long n0(long consumed, long available, int source) {
        long jN0 = this.connection.n0(consumed, available, source);
        u3.a aVarZ2 = z2();
        return g.r(jN0, aVarZ2 != null ? aVarZ2.n0(g.r(consumed, jN0), g.q(available, jN0), source) : g.INSTANCE.c());
    }
}
