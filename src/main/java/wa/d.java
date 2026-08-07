package wa;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.b0;
import androidx.room.o0;
import androidx.room.r0;
import androidx.room.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationInterceptor;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"R", "Landroidx/room/b0;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Lya/b;", "block", "e", "(Landroidx/room/b0;ZZLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/room/b0;ZZLwn0/l;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "c", "(Landroidx/room/b0;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lza/f;", "sqLiteQuery", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "f", "(Landroidx/room/b0;Lza/f;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Lza/c;", "Ljn0/h0;", "b", "(Lza/c;)V", "Ljava/io/File;", "databaseFile", "", "g", "(Ljava/io/File;)I", "a", "()Landroid/os/CancellationSignal;", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
final /* synthetic */ class d {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a<R> extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f121570n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ b0 f121571o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f121572p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f121573q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.l<ya.b, R> f121574r;

        /* JADX INFO: renamed from: wa.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Landroidx/room/s0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
        public static final class C2605a extends SuspendLambda implements wn0.p<s0, Continuation<? super R>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f121575n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f121576o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f121577p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ boolean f121578q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f121579r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f121580s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ wn0.l f121581t;

            /* JADX INFO: renamed from: wa.d$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Landroidx/room/r0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C2606a extends SuspendLambda implements wn0.p<r0<R>, Continuation<? super R>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f121582n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f121583o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ wn0.l f121584p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2606a(Continuation continuation, wn0.l lVar) {
                    super(2, continuation);
                    this.f121584p = lVar;
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(r0<R> r0Var, Continuation<? super R> continuation) {
                    return ((C2606a) create(r0Var, continuation)).invokeSuspend(h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    C2606a c2606a = new C2606a(continuation, this.f121584p);
                    c2606a.f121583o = obj;
                    return c2606a;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f121582n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    r0 r0Var = (r0) this.f121583o;
                    p013kotlin.jvm.internal.s.i(r0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f121584p.invoke(((sa.m) r0Var).a());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2605a(boolean z11, boolean z12, b0 b0Var, Continuation continuation, wn0.l lVar) {
                super(2, continuation);
                this.f121578q = z11;
                this.f121579r = z12;
                this.f121580s = b0Var;
                this.f121581t = lVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s0 s0Var, Continuation<? super R> continuation) {
                return ((C2605a) create(s0Var, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C2605a c2605a = new C2605a(this.f121578q, this.f121579r, this.f121580s, continuation, this.f121581t);
                c2605a.f121577p = obj;
                return c2605a;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
              0x00a2: PHI (r1v11 androidx.room.s0) = (r1v8 androidx.room.s0), (r1v18 androidx.room.s0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
              0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                s0.a aVar;
                s0 s0Var;
                s0 s0Var2;
                s0.a aVar2;
                s0 s0Var3;
                Object objB;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f121576o;
                if (i11 == 0) {
                    t.b(obj);
                    s0 s0Var4 = (s0) this.f121577p;
                    if (!this.f121578q) {
                        p013kotlin.jvm.internal.s.i(s0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return this.f121581t.invoke(((sa.m) s0Var4).a());
                    }
                    boolean z11 = this.f121579r;
                    aVar = z11 ? s0.a.DEFERRED : s0.a.IMMEDIATE;
                    if (z11) {
                        s0Var = s0Var4;
                        C2606a c2606a = new C2606a(null, this.f121581t);
                        this.f121577p = s0Var;
                        this.f121575n = null;
                        this.f121576o = 3;
                        obj = s0Var.c(aVar, c2606a, this);
                        if (obj != coroutine_suspended) {
                            if (this.f121579r) {
                                return obj;
                            }
                            this.f121577p = obj;
                            this.f121576o = 4;
                            objB = s0Var.b(this);
                            if (objB != coroutine_suspended) {
                                obj2 = obj;
                                obj = objB;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f121580s.getInvalidationTracker().u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        this.f121577p = s0Var4;
                        this.f121575n = aVar;
                        this.f121576o = 1;
                        Object objB2 = s0Var4.b(this);
                        if (objB2 != coroutine_suspended) {
                            s0Var2 = s0Var4;
                            obj = objB2;
                            aVar2 = aVar;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    aVar2 = (s0.a) this.f121575n;
                    s0Var2 = (s0) this.f121577p;
                    t.b(obj);
                } else {
                    if (i11 == 2) {
                        aVar2 = (s0.a) this.f121575n;
                        s0Var3 = (s0) this.f121577p;
                        t.b(obj);
                        aVar = aVar2;
                        s0Var = s0Var3;
                        C2606a c2606a2 = new C2606a(null, this.f121581t);
                        this.f121577p = s0Var;
                        this.f121575n = null;
                        this.f121576o = 3;
                        obj = s0Var.c(aVar, c2606a2, this);
                        if (obj != coroutine_suspended) {
                            if (this.f121579r) {
                                return obj;
                            }
                            this.f121577p = obj;
                            this.f121576o = 4;
                            objB = s0Var.b(this);
                            if (objB != coroutine_suspended) {
                                obj2 = obj;
                                obj = objB;
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i11 == 3) {
                        s0Var = (s0) this.f121577p;
                        t.b(obj);
                        if (this.f121579r) {
                            return obj;
                        }
                        this.f121577p = obj;
                        this.f121576o = 4;
                        objB = s0Var.b(this);
                        if (objB != coroutine_suspended) {
                            obj2 = obj;
                            obj = objB;
                        }
                        return coroutine_suspended;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f121577p;
                    t.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.f121580s.getInvalidationTracker().u();
                }
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    aVar = aVar2;
                    s0Var = s0Var2;
                    C2606a c2606a3 = new C2606a(null, this.f121581t);
                    this.f121577p = s0Var;
                    this.f121575n = null;
                    this.f121576o = 3;
                    obj = s0Var.c(aVar, c2606a3, this);
                    if (obj != coroutine_suspended) {
                        if (this.f121579r) {
                            return obj;
                        }
                        this.f121577p = obj;
                        this.f121576o = 4;
                        objB = s0Var.b(this);
                        if (objB != coroutine_suspended) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f121580s.getInvalidationTracker().u();
                            }
                            return obj2;
                        }
                    }
                } else {
                    androidx.room.p invalidationTracker = this.f121580s.getInvalidationTracker();
                    this.f121577p = s0Var2;
                    this.f121575n = aVar2;
                    this.f121576o = 2;
                    if (invalidationTracker.A(this) != coroutine_suspended) {
                        s0Var3 = s0Var2;
                        aVar = aVar2;
                        s0Var = s0Var3;
                        C2606a c2606a4 = new C2606a(null, this.f121581t);
                        this.f121577p = s0Var;
                        this.f121575n = null;
                        this.f121576o = 3;
                        obj = s0Var.c(aVar, c2606a4, this);
                        if (obj != coroutine_suspended) {
                            if (this.f121579r) {
                                return obj;
                            }
                            this.f121577p = obj;
                            this.f121576o = 4;
                            objB = s0Var.b(this);
                            if (objB != coroutine_suspended) {
                                obj2 = obj;
                                obj = objB;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f121580s.getInvalidationTracker().u();
                                }
                                return obj2;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0 b0Var, boolean z11, boolean z12, wn0.l<? super ya.b, ? extends R> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f121571o = b0Var;
            this.f121572p = z11;
            this.f121573q = z12;
            this.f121574r = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f121571o, this.f121572p, this.f121573q, this.f121574r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f121570n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            b0 b0Var = this.f121571o;
            boolean z11 = this.f121572p;
            C2605a c2605a = new C2605a(this.f121573q, z11, b0Var, null, this.f121574r);
            this.f121570n = 1;
            Object objUseConnection$room_runtime_release = b0Var.useConnection$room_runtime_release(z11, c2605a, this);
            return objUseConnection$room_runtime_release == coroutine_suspended ? coroutine_suspended : objUseConnection$room_runtime_release;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<R> extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f121585n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ b0 f121586o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f121587p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f121588q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.l f121589r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, b0 b0Var, boolean z11, boolean z12, wn0.l lVar) {
            super(2, continuation);
            this.f121586o = b0Var;
            this.f121587p = z11;
            this.f121588q = z12;
            this.f121589r = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(continuation, this.f121586o, this.f121587p, this.f121588q, this.f121589r);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f121585n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            b0 b0Var = this.f121586o;
            boolean z11 = this.f121587p;
            C2607d c2607d = new C2607d(this.f121588q, z11, b0Var, null, this.f121589r);
            this.f121585n = 1;
            Object objUseConnection$room_runtime_release = b0Var.useConnection$room_runtime_release(z11, c2607d, this);
            return objUseConnection$room_runtime_release == coroutine_suspended ? coroutine_suspended : objUseConnection$room_runtime_release;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", i = {1, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m = "performSuspending", n = {"db", "block", "isReadOnly", "inTransaction"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
    static final class c<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121590n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f121591o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f121592p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f121593q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f121594r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f121595s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f121594r = obj;
            this.f121595s |= Integer.MIN_VALUE;
            return wa.b.f(null, false, false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: wa.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Landroidx/room/s0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
    public static final class C2607d<R> extends SuspendLambda implements wn0.p<s0, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121596n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f121597o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f121598p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f121599q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f121600r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b0 f121601s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ wn0.l f121602t;

        /* JADX INFO: renamed from: wa.d$d$a */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Landroidx/room/r0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements wn0.p<r0<R>, Continuation<? super R>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f121603n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f121604o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ wn0.l f121605p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, wn0.l lVar) {
                super(2, continuation);
                this.f121605p = lVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r0<R> r0Var, Continuation<? super R> continuation) {
                return ((a) create(r0Var, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation, this.f121605p);
                aVar.f121604o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f121603n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                r0 r0Var = (r0) this.f121604o;
                p013kotlin.jvm.internal.s.i(r0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f121605p.invoke(((sa.m) r0Var).a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2607d(boolean z11, boolean z12, b0 b0Var, Continuation continuation, wn0.l lVar) {
            super(2, continuation);
            this.f121599q = z11;
            this.f121600r = z12;
            this.f121601s = b0Var;
            this.f121602t = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(s0 s0Var, Continuation<? super R> continuation) {
            return ((C2607d) create(s0Var, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2607d c2607d = new C2607d(this.f121599q, this.f121600r, this.f121601s, continuation, this.f121602t);
            c2607d.f121598p = obj;
            return c2607d;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 androidx.room.s0) = (r1v8 androidx.room.s0), (r1v18 androidx.room.s0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            s0.a aVar;
            s0 s0Var;
            s0 s0Var2;
            s0.a aVar2;
            s0 s0Var3;
            Object objB;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f121597o;
            if (i11 == 0) {
                t.b(obj);
                s0 s0Var4 = (s0) this.f121598p;
                if (!this.f121599q) {
                    p013kotlin.jvm.internal.s.i(s0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f121602t.invoke(((sa.m) s0Var4).a());
                }
                boolean z11 = this.f121600r;
                aVar = z11 ? s0.a.DEFERRED : s0.a.IMMEDIATE;
                if (z11) {
                    s0Var = s0Var4;
                    a aVar3 = new a(null, this.f121602t);
                    this.f121598p = s0Var;
                    this.f121596n = null;
                    this.f121597o = 3;
                    obj = s0Var.c(aVar, aVar3, this);
                    if (obj != coroutine_suspended) {
                        if (this.f121600r) {
                            return obj;
                        }
                        this.f121598p = obj;
                        this.f121597o = 4;
                        objB = s0Var.b(this);
                        if (objB != coroutine_suspended) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f121601s.getInvalidationTracker().u();
                            }
                            return obj2;
                        }
                    }
                } else {
                    this.f121598p = s0Var4;
                    this.f121596n = aVar;
                    this.f121597o = 1;
                    Object objB2 = s0Var4.b(this);
                    if (objB2 != coroutine_suspended) {
                        s0Var2 = s0Var4;
                        obj = objB2;
                        aVar2 = aVar;
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                aVar2 = (s0.a) this.f121596n;
                s0Var2 = (s0) this.f121598p;
                t.b(obj);
            } else {
                if (i11 == 2) {
                    aVar2 = (s0.a) this.f121596n;
                    s0Var3 = (s0) this.f121598p;
                    t.b(obj);
                    aVar = aVar2;
                    s0Var = s0Var3;
                    a aVar4 = new a(null, this.f121602t);
                    this.f121598p = s0Var;
                    this.f121596n = null;
                    this.f121597o = 3;
                    obj = s0Var.c(aVar, aVar4, this);
                    if (obj != coroutine_suspended) {
                        if (this.f121600r) {
                            return obj;
                        }
                        this.f121598p = obj;
                        this.f121597o = 4;
                        objB = s0Var.b(this);
                        if (objB != coroutine_suspended) {
                            obj2 = obj;
                            obj = objB;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 3) {
                    s0Var = (s0) this.f121598p;
                    t.b(obj);
                    if (this.f121600r) {
                        return obj;
                    }
                    this.f121598p = obj;
                    this.f121597o = 4;
                    objB = s0Var.b(this);
                    if (objB != coroutine_suspended) {
                        obj2 = obj;
                        obj = objB;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f121598p;
                t.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f121601s.getInvalidationTracker().u();
            }
            return obj2;
            if (((Boolean) obj).booleanValue()) {
                aVar = aVar2;
                s0Var = s0Var2;
                a aVar5 = new a(null, this.f121602t);
                this.f121598p = s0Var;
                this.f121596n = null;
                this.f121597o = 3;
                obj = s0Var.c(aVar, aVar5, this);
                if (obj != coroutine_suspended) {
                    if (this.f121600r) {
                        return obj;
                    }
                    this.f121598p = obj;
                    this.f121597o = 4;
                    objB = s0Var.b(this);
                    if (objB != coroutine_suspended) {
                        obj2 = obj;
                        obj = objB;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f121601s.getInvalidationTracker().u();
                        }
                        return obj2;
                    }
                }
            } else {
                androidx.room.p invalidationTracker = this.f121601s.getInvalidationTracker();
                this.f121598p = s0Var2;
                this.f121596n = aVar2;
                this.f121597o = 2;
                if (invalidationTracker.A(this) != coroutine_suspended) {
                    s0Var3 = s0Var2;
                    aVar = aVar2;
                    s0Var = s0Var3;
                    a aVar6 = new a(null, this.f121602t);
                    this.f121598p = s0Var;
                    this.f121596n = null;
                    this.f121597o = 3;
                    obj = s0Var.c(aVar, aVar6, this);
                    if (obj != coroutine_suspended) {
                        if (this.f121600r) {
                            return obj;
                        }
                        this.f121598p = obj;
                        this.f121597o = 4;
                        objB = s0Var.b(this);
                        if (objB != coroutine_suspended) {
                            obj2 = obj;
                            obj = objB;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f121601s.getInvalidationTracker().u();
                            }
                            return obj2;
                        }
                    }
                }
            }
            return coroutine_suspended;
        }
    }

    @jn0.e
    public static final CancellationSignal a() {
        return new CancellationSignal();
    }

    @jn0.e
    public static final void b(za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        wa.b.b(new ta.a(db2));
    }

    public static final Object c(b0 b0Var, boolean z11, Continuation<? super CoroutineContext> continuation) {
        ContinuationInterceptor transactionDispatcher;
        CoroutineContext coroutineContextPlus;
        if (!b0Var.inCompatibilityMode$room_runtime_release()) {
            return b0Var.getCoroutineScope().getCoroutineContext();
        }
        o0 o0Var = (o0) continuation.getContext().get(o0.INSTANCE);
        if (o0Var == null || (transactionDispatcher = o0Var.getTransactionDispatcher()) == null || (coroutineContextPlus = b0Var.getQueryContext().plus(transactionDispatcher)) == null) {
            return z11 ? b0Var.getTransactionContext$room_runtime_release() : b0Var.getQueryContext();
        }
        return coroutineContextPlus;
    }

    public static final <R> R d(b0 db2, boolean z11, boolean z12, wn0.l<? super ya.b, ? extends R> block) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        p013kotlin.jvm.internal.s.k(block, "block");
        db2.assertNotMainThread();
        db2.assertNotSuspendingTransaction();
        return (R) sa.n.a(new a(db2, z11, z12, block, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final <R> Object e(b0 b0Var, boolean z11, boolean z12, wn0.l<? super ya.b, ? extends R> lVar, Continuation<? super R> continuation) {
        c cVar;
        b0 b0Var2;
        boolean z13;
        wn0.l<? super ya.b, ? extends R> lVar2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f121595s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f121595s = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f121594r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f121595s;
        if (i12 == 0) {
            t.b(obj);
            if (b0Var.inCompatibilityMode$room_runtime_release() && b0Var.isOpenInternal() && b0Var.inTransaction()) {
                C2607d c2607d = new C2607d(z12, z11, b0Var, null, lVar);
                cVar2.f121595s = 1;
                Object objUseConnection$room_runtime_release = b0Var.useConnection$room_runtime_release(z11, c2607d, cVar2);
                if (objUseConnection$room_runtime_release != coroutine_suspended) {
                    return objUseConnection$room_runtime_release;
                }
            } else {
                cVar2.f121590n = b0Var;
                cVar2.f121591o = lVar;
                cVar2.f121592p = z11;
                cVar2.f121593q = z12;
                cVar2.f121595s = 2;
                Object objD = wa.b.d(b0Var, z12, cVar2);
                if (objD != coroutine_suspended) {
                    b0Var2 = b0Var;
                    obj = objD;
                    z13 = z12;
                    lVar2 = lVar;
                }
            }
        }
        if (i12 == 1) {
            t.b(obj);
            return obj;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return obj;
        }
        boolean z14 = cVar2.f121593q;
        z11 = cVar2.f121592p;
        wn0.l<? super ya.b, ? extends R> lVar3 = (wn0.l) cVar2.f121591o;
        b0 b0Var3 = (b0) cVar2.f121590n;
        t.b(obj);
        z13 = z14;
        lVar2 = lVar3;
        b0Var2 = b0Var3;
        b bVar = new b(null, b0Var2, z11, z13, lVar2);
        cVar2.f121590n = null;
        cVar2.f121591o = null;
        cVar2.f121595s = 3;
        Object objWithContext = BuildersKt.withContext((CoroutineContext) obj, bVar, cVar2);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }

    public static final Cursor f(b0 db2, za.f sqLiteQuery, boolean z11, CancellationSignal cancellationSignal) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        p013kotlin.jvm.internal.s.k(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z11 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? wa.a.a(cursorQuery) : cursorQuery;
    }

    public static final int g(File databaseFile) {
        p013kotlin.jvm.internal.s.k(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i11 = byteBufferAllocate.getInt();
            sn0.b.a(channel, null);
            return i11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(channel, th2);
                throw th3;
            }
        }
    }
}
