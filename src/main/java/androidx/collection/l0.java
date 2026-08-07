package androidx.collection;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00011B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0003H\u0001¢\u0006\u0004\b%\u0010\u0006J\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0004\b(\u0010\fJ\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0000¢\u0006\u0004\b*\u0010\u0006J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Landroidx/collection/l0;", "E", "Landroidx/collection/v0;", "", "initialCapacity", "<init>", "(I)V", "Ljn0/h0;", "s", "capacity", "r", "q", "()V", "element", "o", "(Ljava/lang/Object;)I", "hash1", "p", "(I)I", "", "h", "(Ljava/lang/Object;)Z", "w", "(Ljava/lang/Object;)V", "", "elements", "j", "(Ljava/lang/Iterable;)Z", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/collection/v0;)Z", "v", "(Ljava/lang/Iterable;)V", "u", "(Landroidx/collection/v0;)V", "x", "t", "index", "y", "m", "k", "n", "newCapacity", "z", "", "l", "()Ljava/util/Set;", "e", "I", "growthLimit", "a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0<E> extends v0<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/collection/l0$a;", "Landroidx/collection/v0$a;", "Landroidx/collection/v0;", "", "<init>", "(Landroidx/collection/l0;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Ljn0/h0;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends v0<E>.a implements Set<E>, xn0.f {

        /* JADX INFO: renamed from: androidx.collection.l0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/collection/l0$a$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljn0/h0;", "remove", "()V", "", "a", "I", "getCurrent", "()I", "b", "(I)V", "current", "", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0073a implements Iterator<E>, xn0.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int current = -1;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Iterator<E> iterator;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l0<E> f3864c;

            /* JADX INFO: renamed from: androidx.collection.l0$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lho0/k;", "Ljn0/h0;", "<anonymous>", "(Lho0/k;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1057}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
            static final class C0074a extends RestrictedSuspendLambda implements wn0.p<ho0.k<? super E>, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f3865n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f3866o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f3867p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f3868q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f3869r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f3870s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f3871t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                long f3872u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                int f3873v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                private /* synthetic */ Object f3874w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ l0<E> f3875x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                final /* synthetic */ C0073a f3876y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0074a(l0 l0Var, C0073a c0073a, Continuation continuation) {
                    super(2, continuation);
                    this.f3875x = l0Var;
                    this.f3876y = c0073a;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    C0074a c0074a = new C0074a(this.f3875x, this.f3876y, continuation);
                    c0074a.f3874w = obj;
                    return c0074a;
                }

                @Override // wn0.p
                public final Object invoke(ho0.k<? super E> kVar, Continuation<? super jn0.h0> continuation) {
                    return ((C0074a) create(kVar, continuation)).invokeSuspend(jn0.h0.f84049a);
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0059  */
                /* JADX WARN: Code duplicated, block: B:21:0x00a0 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
                /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x00a9). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:20:0x009d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009a -> B:20:0x009d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                    /*
                        r21 = this;
                        r0 = r21
                        java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f3873v
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L36
                        if (r2 != r5) goto L2e
                        int r2 = r0.f3871t
                        int r6 = r0.f3870s
                        long r7 = r0.f3872u
                        int r9 = r0.f3869r
                        int r10 = r0.f3868q
                        java.lang.Object r11 = r0.f3867p
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f3866o
                        androidx.collection.l0 r12 = (androidx.collection.l0) r12
                        java.lang.Object r13 = r0.f3865n
                        androidx.collection.l0$a$a r13 = (androidx.collection.l0.a.C0073a) r13
                        java.lang.Object r14 = r0.f3874w
                        ho0.k r14 = (ho0.k) r14
                        jn0.t.b(r22)
                        goto L9d
                    L2e:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L36:
                        jn0.t.b(r22)
                        java.lang.Object r2 = r0.f3874w
                        ho0.k r2 = (ho0.k) r2
                        androidx.collection.l0<E> r6 = r0.f3875x
                        androidx.collection.l0$a$a r7 = r0.f3876y
                        long[] r8 = r6.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String
                        int r9 = r8.length
                        int r9 = r9 + (-2)
                        if (r9 < 0) goto Lae
                        r10 = 0
                    L49:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto La9
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r10
                        r10 = r9
                        r9 = r14
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                    L6d:
                        if (r2 >= r6) goto La0
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.3E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L9d
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.b(r15)
                        java.lang.Object[] r3 = r12.elements
                        r3 = r3[r15]
                        r0.f3874w = r14
                        r0.f3865n = r13
                        r0.f3866o = r12
                        r0.f3867p = r11
                        r0.f3868q = r10
                        r0.f3869r = r9
                        r0.f3872u = r7
                        r0.f3870s = r6
                        r0.f3871t = r2
                        r0.f3873v = r5
                        java.lang.Object r3 = r14.b(r3, r0)
                        if (r3 != r1) goto L9d
                        return r1
                    L9d:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L6d
                    La0:
                        if (r6 != r4) goto Lae
                        r2 = r10
                        r10 = r9
                        r9 = r2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                    La9:
                        if (r10 == r9) goto Lae
                        int r10 = r10 + 1
                        goto L49
                    Lae:
                        jn0.h0 r1 = jn0.h0.f84049a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.collection.l0.a.C0073a.C0074a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0073a(l0<E> l0Var) {
                this.f3864c = l0Var;
                this.iterator = ho0.l.a(new C0074a(l0Var, this, null));
            }

            public final void b(int i11) {
                this.current = i11;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i11 = this.current;
                if (i11 != -1) {
                    this.f3864c.y(i11);
                    this.current = -1;
                }
            }
        }

        public a() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E element) {
            return l0.this.h(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> elements) {
            p013kotlin.jvm.internal.s.k(elements, "elements");
            return l0.this.j(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            l0.this.m();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return new C0073a(l0.this);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object element) {
            return l0.this.x(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            p013kotlin.jvm.internal.s.k(elements, "elements");
            int iC = l0.this.get_size();
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                l0.this.t((E) it.next());
            }
            return iC != l0.this.get_size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            p013kotlin.jvm.internal.s.k(elements, "elements");
            l0<E> l0Var = l0.this;
            long[] jArr = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!elements.contains(l0Var.elements[i14])) {
                                l0Var.y(i14);
                                z11 = true;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return z11;
                    }
                }
                if (i11 == length) {
                    return z11;
                }
                i11++;
            }
        }
    }

    public l0() {
        this(0, 1, null);
    }

    private final int o(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = i13;
            int i19 = i13;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                if (p013kotlin.jvm.internal.s.f(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iP = p(i12);
                if (this.growthLimit == 0 && ((this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String[iP >> 3] >> ((iP & 7) << 3)) & 255) != 254) {
                    k();
                    iP = p(i12);
                }
                this._size++;
                int i21 = this.growthLimit;
                long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int i22 = iP >> 3;
                long j15 = jArr2[i22];
                int i23 = (iP & 7) << 3;
                this.growthLimit = i21 - (((j15 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this._capacity;
                long j16 = ((~(255 << i23)) & j15) | (j12 << i23);
                jArr2[i22] = j16;
                jArr2[(((iP - 7) & i24) + (i24 & 7)) >> 3] = j16;
                return iP;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    private final int p(int hash1) {
        int i11 = this._capacity;
        int i12 = hash1 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j11 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j12) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void q() {
        this.growthLimit = u0.c(get_capacity()) - this._size;
    }

    private final void r(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = u0.f3930a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            p013kotlin.collections.n.C(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String = jArr;
        int i11 = capacity >> 3;
        long j11 = 255 << ((capacity & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j11)) | j11;
        q();
    }

    private final void s(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, u0.f(initialCapacity)) : 0;
        this._capacity = iMax;
        r(iMax);
        this.elements = new Object[iMax];
    }

    public final boolean h(E element) {
        int iC = get_size();
        this.elements[o(element)] = element;
        return get_size() != iC;
    }

    public final boolean i(v0<E> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        int iC = get_size();
        u(elements);
        return iC != get_size();
    }

    public final boolean j(Iterable<? extends E> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        int iC = get_size();
        v(elements);
        return iC != get_size();
    }

    public final void k() {
        if (this._capacity <= 8 || Long.compare(jn0.c0.b(jn0.c0.b(this._size) * 32) ^ Long.MIN_VALUE, jn0.c0.b(jn0.c0.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            z(u0.e(this._capacity));
        } else {
            n();
        }
    }

    public final Set<E> l() {
        return new a();
    }

    public final void m() {
        this._size = 0;
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        if (jArr != u0.f3930a) {
            p013kotlin.collections.n.C(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i11 = this._capacity;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        p013kotlin.collections.n.z(this.elements, null, 0, this._capacity);
        q();
    }

    public final void n() {
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        Object[] objArr = this.elements;
        u0.a(jArr, i11);
        int iB = -1;
        int i12 = 0;
        while (i12 != i11) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j11 = (jArr[i13] >> i14) & 255;
            if (j11 == 128) {
                iB = i12;
                i12++;
            } else {
                if (j11 == 254) {
                    Object obj = objArr[i12];
                    int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                    int i15 = iHashCode ^ (iHashCode << 16);
                    int i16 = i15 >>> 7;
                    int iP = p(i16);
                    int i17 = i16 & i11;
                    if (((iP - i17) & i11) / 8 == ((i12 - i17) & i11) / 8) {
                        jArr[i13] = (((long) (i15 & 127)) << i14) | ((~(255 << i14)) & jArr[i13]);
                        jArr[p013kotlin.collections.n.t0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iP >> 3;
                        long j12 = jArr[i18];
                        int i19 = (iP & 7) << 3;
                        if (((j12 >> i19) & 255) == 128) {
                            jArr[i18] = (((long) (i15 & 127)) << i19) | (j12 & (~(255 << i19)));
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            objArr[iP] = objArr[i12];
                            objArr[i12] = null;
                            iB = i12;
                        } else {
                            jArr[i18] = (((long) (i15 & 127)) << i19) | (j12 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = u0.b(jArr, i12 + 1, i11);
                            }
                            objArr[iB] = objArr[iP];
                            objArr[iP] = objArr[i12];
                            objArr[i12] = objArr[iB];
                            i12--;
                        }
                        jArr[p013kotlin.collections.n.t0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i12++;
            }
        }
        q();
    }

    public final void t(E element) {
        int iNumberOfTrailingZeros;
        int i11 = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this._capacity;
        int i15 = i12 >>> 7;
        loop0: while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (p013kotlin.jvm.internal.s.f(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i11 += 8;
                i15 = i16 + i11;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            y(iNumberOfTrailingZeros);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(v0<E> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        w(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void v(Iterable<? extends E> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public final void w(E element) {
        this.elements[o(element)] = element;
    }

    public final boolean x(E element) {
        int iNumberOfTrailingZeros;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (p013kotlin.jvm.internal.s.f(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z11 = iNumberOfTrailingZeros >= 0;
        if (z11) {
            y(iNumberOfTrailingZeros);
        }
        return z11;
    }

    public final void y(int index) {
        this._size--;
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        int i12 = index >> 3;
        int i13 = (index & 7) << 3;
        long j11 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j11;
        jArr[(((index - 7) & i11) + (i11 & 7)) >> 3] = j11;
        this.elements[index] = null;
    }

    public final void z(int newCapacity) {
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        Object[] objArr = this.elements;
        int i11 = this._capacity;
        s(newCapacity);
        long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        Object[] objArr2 = this.elements;
        int i12 = this._capacity;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iP = p(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iP >> 3;
                int i16 = (iP & 7) << 3;
                long j12 = (jArr2[i15] & (~(255 << i16))) | (j11 << i16);
                jArr2[i15] = j12;
                jArr2[(((iP - 7) & i12) + (i12 & 7)) >> 3] = j12;
                objArr2[iP] = obj;
            }
        }
    }

    public l0(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            n1.d.a("Capacity must be a positive value.");
        }
        s(u0.g(i11));
    }

    public /* synthetic */ l0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }
}
