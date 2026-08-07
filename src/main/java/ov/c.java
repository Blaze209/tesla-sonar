package ov;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.m;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import java.util.Map;
import jn0.t;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.h0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import u6.h;
import wn0.l;
import wn0.p;
import x6.i;
import y6.f;
import y6.g;
import y6.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lov/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Ly6/f$a;", Action.KEY_ATTRIBUTE, "defaultValue", "j", "(Ly6/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Ly6/f;", "k", "(Ly6/f$a;Ljava/lang/Object;)Ly6/f;", "", "h", "()Ljava/util/Map;", "Lkotlin/Function1;", "Ly6/c;", "Ljn0/h0;", "transform", "g", "(Lwn0/l;)Ly6/f;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "c", "Ljava/lang/ThreadLocal;", "editLock", "Lu6/h;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/properties/c;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Lu6/h;", "dataStore", "e", "Lu6/h;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f100045f = {o0.l(new h0(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<Boolean> editLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.c dataStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<f> dataStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly6/f;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly6/f;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super f>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100051n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<y6.c, jn0.h0> f100053p;

        /* JADX INFO: renamed from: ov.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/c;", "it", "Ljn0/h0;", "<anonymous>", "(Ly6/c;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2124a extends SuspendLambda implements p<y6.c, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f100054n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f100055o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ l<y6.c, jn0.h0> f100056p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2124a(l<? super y6.c, jn0.h0> lVar, Continuation<? super C2124a> continuation) {
                super(2, continuation);
                this.f100056p = lVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(y6.c cVar, Continuation<? super jn0.h0> continuation) {
                return ((C2124a) create(cVar, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                C2124a c2124a = new C2124a(this.f100056p, continuation);
                c2124a.f100055o = obj;
                return c2124a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f100054n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f100056p.invoke((y6.c) this.f100055o);
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super y6.c, jn0.h0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f100053p = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new a(this.f100053p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100051n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    if (s.f(c.this.editLock.get(), Boxing.boxBoolean(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.editLock.set(Boxing.boxBoolean(true));
                    h hVar = c.this.dataStore;
                    C2124a c2124a = new C2124a(this.f100053p, null);
                    this.f100051n = 1;
                    obj = j.a(hVar, c2124a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                f fVar = (f) obj;
                c.this.editLock.set(Boxing.boxBoolean(false));
                return fVar;
            } catch (Throwable th2) {
                c.this.editLock.set(Boxing.boxBoolean(false));
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super f> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Ly6/f$a;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100057n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<f.a<?>, Object> mapA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100057n;
            if (i11 == 0) {
                t.b(obj);
                Flow data = c.this.dataStore.getData();
                this.f100057n = 1;
                obj = FlowKt.firstOrNull(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? v0.i() : mapA;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<f.a<?>, ? extends Object>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ov.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class C2125c<T> extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100059n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f.a<T> f100061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ T f100062q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2125c(f.a<T> aVar, T t11, Continuation<? super C2125c> continuation) {
            super(2, continuation);
            this.f100061p = aVar;
            this.f100062q = t11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new C2125c(this.f100061p, this.f100062q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100059n;
            if (i11 == 0) {
                t.b(obj);
                Flow<T> data = c.this.dataStore.getData();
                this.f100059n = 1;
                obj = FlowKt.firstOrNull(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (objB = fVar.b(this.f100061p)) == null) ? this.f100062q : objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C2125c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly6/f;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly6/f;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super f>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100063n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f.a<T> f100065p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ T f100066q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/c;", "it", "Ljn0/h0;", "<anonymous>", "(Ly6/c;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<y6.c, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f100067n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f100068o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ f.a<T> f100069p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ T f100070q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a<T> aVar, T t11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f100069p = aVar;
                this.f100070q = t11;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(y6.c cVar, Continuation<? super jn0.h0> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f100069p, this.f100070q, continuation);
                aVar.f100068o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f100067n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                ((y6.c) this.f100068o).i(this.f100069p, this.f100070q);
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a<T> aVar, T t11, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f100065p = aVar;
            this.f100066q = t11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(this.f100065p, this.f100066q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100063n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            h hVar = c.this.dataStore;
            a aVar = new a(this.f100065p, this.f100066q, null);
            this.f100063n = 1;
            Object objA = j.a(hVar, aVar, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super f> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public c(Context context, String name) {
        s.k(context, "context");
        s.k(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        this.dataStore = x6.a.b(name, new v6.b(new l() { // from class: ov.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c.e(this.f100043a, (CorruptionException) obj);
            }
        }), new l() { // from class: ov.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c.f(this.f100044a, (Context) obj);
            }
        }, null, 8, null);
        this.dataStore = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f e(c cVar, CorruptionException ex2) {
        s.k(ex2, "ex");
        Log.w(o0.b(c.class).l(), "CorruptionException in " + cVar.name + " DataStore running in process " + Process.myPid(), ex2);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(c cVar, Context it) {
        s.k(it, "it");
        return v.e(i.b(it, cVar.name, null, 4, null));
    }

    private final h<f> i(Context context) {
        return (h) this.dataStore.getValue(context, f100045f[0]);
    }

    public final f g(l<? super y6.c, jn0.h0> transform) {
        s.k(transform, "transform");
        return (f) BuildersKt__BuildersKt.runBlocking$default(null, new a(transform, null), 1, null);
    }

    public final Map<f.a<?>, Object> h() {
        return (Map) BuildersKt__BuildersKt.runBlocking$default(null, new b(null), 1, null);
    }

    public final <T> T j(f.a<T> key, T defaultValue) {
        s.k(key, "key");
        return (T) BuildersKt__BuildersKt.runBlocking$default(null, new C2125c(key, defaultValue, null), 1, null);
    }

    public final <T> f k(f.a<T> key, T value) {
        s.k(key, "key");
        return (f) BuildersKt__BuildersKt.runBlocking$default(null, new d(key, value, null), 1, null);
    }
}
