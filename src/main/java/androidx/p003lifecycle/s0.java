package androidx.p003lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.x;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import q5.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0002(+B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010%\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0010H\u0007¢\u0006\u0004\b%\u0010&R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R(\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010)R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103¨\u00065"}, d2 = {"Landroidx/lifecycle/s0;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "T", Action.KEY_ATTRIBUTE, "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/i0;", "h", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/i0;", "Landroidx/savedstate/SavedStateRegistry$c;", "l", "()Landroidx/savedstate/SavedStateRegistry$c;", "e", "(Ljava/lang/String;)Z", "g", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/i0;", "Lkotlinx/coroutines/flow/StateFlow;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "", "j", "()Ljava/util/Set;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Ljn0/h0;", "n", "(Ljava/lang/String;Ljava/lang/Object;)V", "k", "provider", "o", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$c;)V", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/s0$b;", "c", "liveDatas", "Lkotlinx/coroutines/flow/MutableStateFlow;", DateTokenConverter.CONVERTER_KEY, "flows", "Landroidx/savedstate/SavedStateRegistry$c;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class<? extends Object>[] f8906g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> regular;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, SavedStateRegistry.c> savedStateProviders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b<?>> liveDatas;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, MutableStateFlow<Object>> flows;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SavedStateRegistry.c savedStateProvider;

    /* JADX INFO: renamed from: androidx.lifecycle.s0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/s0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/s0;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/s0;", "value", "", "b", "(Ljava/lang/Object;)Z", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s0 a(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                if (defaultState == null) {
                    return new s0();
                }
                HashMap map = new HashMap();
                for (String key : defaultState.keySet()) {
                    s.j(key, "key");
                    map.put(key, defaultState.get(key));
                }
                return new s0(map);
            }
            ClassLoader classLoader = s0.class.getClassLoader();
            s.h(classLoader);
            restoredState.setClassLoader(classLoader);
            ArrayList parcelableArrayList = restoredState.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = parcelableArrayList.get(i11);
                s.i(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i11));
            }
            return new s0(linkedHashMap);
        }

        public final boolean b(Object value) {
            if (value == null) {
                return true;
            }
            for (Class cls : s0.f8906g) {
                s.h(cls);
                if (cls.isInstance(value)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public s0(Map<String, ? extends Object> initialState) {
        s.k(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.c() { // from class: androidx.lifecycle.r0
            @Override // androidx.savedstate.SavedStateRegistry.c
            public final Bundle a() {
                return s0.m(this.f8899a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    private final <T> i0<T> h(String key, boolean hasInitialValue, T initialValue) {
        b<?> bVar;
        b<?> bVar2 = this.liveDatas.get(key);
        b<?> bVar3 = bVar2 instanceof i0 ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.regular.containsKey(key)) {
            bVar = new b<>(this, key, this.regular.get(key));
        } else if (hasInitialValue) {
            this.regular.put(key, initialValue);
            bVar = new b<>(this, key, initialValue);
        } else {
            bVar = new b<>(this, key);
        }
        this.liveDatas.put(key, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle m(s0 this$0) {
        s.k(this$0, "this$0");
        for (Map.Entry entry : v0.A(this$0.savedStateProviders).entrySet()) {
            this$0.n((String) entry.getKey(), ((SavedStateRegistry.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return d.b(x.a("keys", arrayList), x.a("values", arrayList2));
    }

    public final boolean e(String key) {
        s.k(key, "key");
        return this.regular.containsKey(key);
    }

    public final <T> T f(String key) {
        s.k(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            k(key);
            return null;
        }
    }

    public final <T> i0<T> g(String key, T initialValue) {
        s.k(key, "key");
        return h(key, true, initialValue);
    }

    public final <T> StateFlow<T> i(String key, T initialValue) {
        s.k(key, "key");
        Map<String, MutableStateFlow<Object>> map = this.flows;
        MutableStateFlow<Object> MutableStateFlow = map.get(key);
        if (MutableStateFlow == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            MutableStateFlow = StateFlowKt.MutableStateFlow(this.regular.get(key));
            this.flows.put(key, MutableStateFlow);
            map.put(key, MutableStateFlow);
        }
        StateFlow<T> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        s.i(stateFlowAsStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return stateFlowAsStateFlow;
    }

    public final Set<String> j() {
        return d1.n(d1.n(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    public final <T> T k(String key) {
        s.k(key, "key");
        T t11 = (T) this.regular.remove(key);
        b<?> bVarRemove = this.liveDatas.remove(key);
        if (bVarRemove != null) {
            bVarRemove.b();
        }
        this.flows.remove(key);
        return t11;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final SavedStateRegistry.c getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> void n(String key, T value) {
        s.k(key, "key");
        if (!INSTANCE.b(value)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            s.h(value);
            sb2.append(value.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        b<?> bVar = this.liveDatas.get(key);
        b<?> bVar2 = bVar instanceof i0 ? bVar : null;
        if (bVar2 != null) {
            bVar2.setValue(value);
        } else {
            this.regular.put(key, value);
        }
        MutableStateFlow<Object> mutableStateFlow = this.flows.get(key);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(value);
    }

    public final void o(String key, SavedStateRegistry.c provider) {
        s.k(key, "key");
        s.k(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/s0$b;", "T", "Landroidx/lifecycle/i0;", "Landroidx/lifecycle/s0;", "handle", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Landroidx/lifecycle/s0;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/s0;Ljava/lang/String;)V", "Ljn0/h0;", "setValue", "(Ljava/lang/Object;)V", "b", "()V", "Ljava/lang/String;", "c", "Landroidx/lifecycle/s0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends i0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private s0 handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s0 s0Var, String key, T t11) {
            super(t11);
            s.k(key, "key");
            this.key = key;
            this.handle = s0Var;
        }

        public final void b() {
            this.handle = null;
        }

        @Override // androidx.p003lifecycle.i0, androidx.p003lifecycle.d0
        public void setValue(T value) {
            s0 s0Var = this.handle;
            if (s0Var != null) {
                s0Var.regular.put(this.key, value);
                MutableStateFlow mutableStateFlow = (MutableStateFlow) s0Var.flows.get(this.key);
                if (mutableStateFlow != null) {
                    mutableStateFlow.setValue(value);
                }
            }
            super.setValue(value);
        }

        public b(s0 s0Var, String key) {
            s.k(key, "key");
            this.key = key;
            this.handle = s0Var;
        }
    }

    public s0() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.c() { // from class: androidx.lifecycle.r0
            @Override // androidx.savedstate.SavedStateRegistry.c
            public final Bundle a() {
                return s0.m(this.f8899a);
            }
        };
    }
}
