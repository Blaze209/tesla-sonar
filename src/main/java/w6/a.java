package w6;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.m;
import jn0.t;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import u6.f;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001eB\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001f\u0010 R0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u001b\u0010(\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lw6/a;", "T", "Lu6/f;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Lw6/c;", "migrate", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "name", "<init>", "(Lwn0/a;Ljava/util/Set;Lwn0/p;Lwn0/q;Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lwn0/p;Lwn0/q;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/String;)V", "currentData", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn0/p;", "Lwn0/q;", "Landroid/content/Context;", "Ljava/lang/String;", "e", "Lkotlin/Lazy;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "f", "Ljava/util/Set;", "keySet", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p<T, Continuation<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q<w6.c, T, Continuation<? super T>, Object> migrate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPrefs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<String> keySet;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: w6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C2591a extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f121071n;

        C2591a(Continuation<? super C2591a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C2591a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f121071n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(true);
        }

        @Override // wn0.p
        public final Object invoke(T t11, Continuation<? super Boolean> continuation) {
            return ((C2591a) create(t11, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroid/content/SharedPreferences;", "b", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<SharedPreferences> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f121072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f121073d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f121072c = context;
            this.f121073d = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f121072c.getSharedPreferences(this.f121073d, 0);
            s.j(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw6/a$c;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f121074a = new c();

        private c() {
        }

        public static final boolean a(Context context, String name) {
            s.k(context, "context");
            s.k(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", i = {0}, l = {151}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121075n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f121076o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ a<T> f121077p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f121078q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<T> aVar, Continuation<? super d> continuation) {
            super(continuation);
            this.f121077p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f121076o = obj;
            this.f121078q |= Integer.MIN_VALUE;
            return this.f121077p.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(wn0.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, q<? super w6.c, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, Context context, String str) {
        this.shouldRunMigration = pVar;
        this.migrate = qVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs = m.b(aVar);
        this.keySet = set == w6.b.a() ? null : v.q1(set);
    }

    private final void d(Context context, String name) {
        c.a(context, name);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u6.f
    public Object a(T t11, Continuation<? super Boolean> continuation) {
        d dVar;
        a<T> aVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f121078q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f121078q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, continuation);
            }
        } else {
            dVar = new d(this, continuation);
        }
        Object objInvoke = dVar.f121076o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f121078q;
        boolean z11 = true;
        if (i12 == 0) {
            t.b(objInvoke);
            p<T, Continuation<? super Boolean>, Object> pVar = this.shouldRunMigration;
            dVar.f121075n = this;
            dVar.f121078q = 1;
            objInvoke = pVar.invoke(t11, dVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar.f121075n;
            t.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        Set<String> set = aVar.keySet;
        if (set == null) {
            Map<String, ?> all = aVar.e().getAll();
            s.j(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z11 = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferencesE = aVar.e();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z11 = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesE.contains((String) it.next())) {
                    }
                }
                z11 = false;
            }
        }
        return Boxing.boxBoolean(z11);
    }

    @Override // u6.f
    public Object b(Continuation<? super h0> continuation) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            d(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return h0.f84049a;
    }

    @Override // u6.f
    public Object c(T t11, Continuation<? super T> continuation) {
        return this.migrate.invoke(new w6.c(e(), this.keySet), t11, continuation);
    }

    public /* synthetic */ a(Context context, String str, Set set, p pVar, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? w6.b.a() : set, (i11 & 8) != 0 ? new C2591a(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String sharedPreferencesName, Set<String> keysToMigrate, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, q<? super w6.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        s.k(context, "context");
        s.k(sharedPreferencesName, "sharedPreferencesName");
        s.k(keysToMigrate, "keysToMigrate");
        s.k(shouldRunMigration, "shouldRunMigration");
        s.k(migrate, "migrate");
    }
}
