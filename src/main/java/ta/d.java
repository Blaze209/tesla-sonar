package ta;

import androidx.room.r0;
import androidx.room.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import sa.m;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JH\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2(\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2(\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010#\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\"¨\u0006$"}, d2 = {"Lta/d;", "Landroidx/room/s0;", "Lsa/m;", "Lta/a;", "delegate", "<init>", "(Lta/a;)V", "R", "Landroidx/room/s0$a;", "type", "Lkotlin/Function2;", "Landroidx/room/r0;", "Lkotlin/coroutines/Continuation;", "", "block", "f", "(Landroidx/room/s0$a;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Lya/d;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lta/a;", "getDelegate", "()Lta/a;", "Landroidx/room/s0$a;", "currentTransactionType", "Lya/b;", "()Lya/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d implements s0, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ta.a delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private s0.a currentTransactionType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lta/d$a;", "T", "Landroidx/room/r0;", "Lsa/m;", "<init>", "(Lta/d;)V", "R", "", "sql", "Lkotlin/Function1;", "Lya/d;", "block", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lya/b;", "a", "()Lya/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class a<T> implements r0<T>, m {
        public a() {
        }

        @Override // sa.m
        public ya.b a() {
            return d.this.a();
        }

        @Override // androidx.room.u
        public <R> Object d(String str, l<? super ya.d, ? extends R> lVar, Continuation<? super R> continuation) {
            return d.this.d(str, lVar, continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113013a;

        static {
            int[] iArr = new int[s0.a.values().length];
            try {
                iArr[s0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f113013a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", i = {0, 0}, l = {83}, m = "transaction", n = {"this", "db"}, s = {"L$0", "L$1"})
    static final class c<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f113014n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f113015o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f113016p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f113018r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f113016p = obj;
            this.f113018r |= Integer.MIN_VALUE;
            return d.this.f(null, null, this);
        }
    }

    public d(ta.a delegate) {
        s.k(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <R> Object f(s0.a aVar, p<? super r0<R>, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) throws Throwable {
        c cVar;
        Throwable th2;
        za.c cVar2;
        d dVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f113018r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f113018r = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f113016p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f113018r;
        if (i12 == 0) {
            t.b(obj);
            za.c db2 = this.delegate.getDb();
            if (!db2.y3()) {
                this.currentTransactionType = aVar;
            }
            int i13 = b.f113013a[aVar.ordinal()];
            if (i13 == 1) {
                db2.W0();
            } else if (i13 == 2) {
                db2.i0();
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                db2.beginTransaction();
            }
            try {
                a aVar2 = new a();
                cVar.f113014n = this;
                cVar.f113015o = db2;
                cVar.f113018r = 1;
                Object objInvoke = pVar.invoke(aVar2, cVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objInvoke;
                cVar2 = db2;
                dVar = this;
            } catch (Throwable th3) {
                th2 = th3;
                cVar2 = db2;
                dVar = this;
                cVar2.n2();
                if (!cVar2.y3()) {
                    dVar.currentTransactionType = null;
                }
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = (za.c) cVar.f113015o;
            dVar = (d) cVar.f113014n;
            try {
                t.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                cVar2.n2();
                if (!cVar2.y3()) {
                    dVar.currentTransactionType = null;
                }
                throw th2;
            }
        }
        cVar2.g2();
        cVar2.n2();
        if (!cVar2.y3()) {
            dVar.currentTransactionType = null;
        }
        return obj;
    }

    @Override // sa.m
    public ya.b a() {
        return this.delegate;
    }

    @Override // androidx.room.s0
    public Object b(Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.delegate.getDb().y3());
    }

    @Override // androidx.room.s0
    public <R> Object c(s0.a aVar, p<? super r0<R>, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        return f(aVar, pVar, continuation);
    }

    @Override // androidx.room.u
    public <R> Object d(String str, l<? super ya.d, ? extends R> lVar, Continuation<? super R> continuation) throws Exception {
        e eVarL1 = this.delegate.L1(str);
        try {
            R rInvoke = lVar.invoke(eVarL1);
            un0.a.a(eVarL1, null);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(eVarL1, th2);
                throw th3;
            }
        }
    }
}
