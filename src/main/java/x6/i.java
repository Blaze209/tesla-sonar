package x6;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "sharedPreferencesName", "", "keysToMigrate", "Lw6/a;", "Ly6/f;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Lw6/a;", "Lkotlin/Function3;", "Lw6/c;", "Lkotlin/coroutines/Continuation;", "", DateTokenConverter.CONVERTER_KEY, "()Lwn0/q;", "Lkotlin/Function2;", "", "e", "(Ljava/util/Set;)Lwn0/p;", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f122807a = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw6/c;", "sharedPrefs", "Ly6/f;", "currentData", "<anonymous>", "(Lw6/c;Ly6/f;)Ly6/f;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements q<w6.c, y6.f, Continuation<? super y6.f>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122808n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f122809o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f122810p;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w6.c cVar, y6.f fVar, Continuation<? super y6.f> continuation) {
            a aVar = new a(continuation);
            aVar.f122809o = cVar;
            aVar.f122810p = fVar;
            return aVar.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f122808n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            w6.c cVar = (w6.c) this.f122809o;
            y6.f fVar = (y6.f) this.f122810p;
            Set<y6.f.a<?>> setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((y6.f.a) it.next()).getName());
            }
            Map<String, Object> mapA = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            y6.c cVarC = fVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    cVarC.i(y6.i.a(str), value);
                } else if (value instanceof Float) {
                    cVarC.i(y6.i.d(str), value);
                } else if (value instanceof Integer) {
                    cVarC.i(y6.i.e(str), value);
                } else if (value instanceof Long) {
                    cVarC.i(y6.i.f(str), value);
                } else if (value instanceof String) {
                    cVarC.i(y6.i.g(str), value);
                } else if (value instanceof Set) {
                    y6.f.a<Set<String>> aVarH = y6.i.h(str);
                    s.i(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    cVarC.i(aVarH, (Set) value);
                }
            }
            return cVarC.d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/f;", "prefs", "", "<anonymous>", "(Ly6/f;)Z"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<y6.f, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122811n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f122812o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Set<String> f122813p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f122813p = set;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y6.f fVar, Continuation<? super Boolean> continuation) {
            return ((b) create(fVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f122813p, continuation);
            bVar.f122812o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f122811n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Set<y6.f.a<?>> setKeySet = ((y6.f) this.f122812o).a().keySet();
            ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((y6.f.a) it.next()).getName());
            }
            boolean z11 = true;
            if (this.f122813p != i.c()) {
                Set<String> set = this.f122813p;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z11 = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z11 = false;
                }
            }
            return Boxing.boxBoolean(z11);
        }
    }

    public static final w6.a<y6.f> a(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        s.k(context, "context");
        s.k(sharedPreferencesName, "sharedPreferencesName");
        s.k(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f122807a ? new w6.a<>(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new w6.a<>(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ w6.a b(Context context, String str, Set set, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            set = f122807a;
        }
        return a(context, str, set);
    }

    public static final Set<String> c() {
        return f122807a;
    }

    private static final q<w6.c, y6.f, Continuation<? super y6.f>, Object> d() {
        return new a(null);
    }

    private static final p<y6.f, Continuation<? super Boolean>, Object> e(Set<String> set) {
        return new b(set, null);
    }
}
