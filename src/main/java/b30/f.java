package b30;

import android.os.Bundle;
import android.view.View;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001-\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00062\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lb30/f;", "", "<init>", "()V", "Lb30/a;", "child", "Ljn0/h0;", "n", "(Lb30/a;)V", "l", "Landroid/os/Bundle;", "o", "()Landroid/os/Bundle;", "restoredState", "k", "(Landroid/os/Bundle;)V", "", Action.KEY_ATTRIBUTE, "Lxa/d;", "parentOwner", "f", "(Ljava/lang/String;Lxa/d;)V", "g", "Landroid/view/View;", "view", "h", "(Landroid/view/View;Ljava/lang/String;)V", "m", "(Ljava/lang/String;)V", "", "keysToKeep", "j", "(Ljava/util/Collection;)V", "", "a", "Ljava/util/Map;", "states", "b", "Lxa/d;", "parentRegistryOwner", "c", "Ljava/lang/String;", "parentKey", DateTokenConverter.CONVERTER_KEY, "children", "b30/f$a", "e", "Lb30/f$a;", "lifecycleObserver", "", IntegerTokenConverter.CONVERTER_KEY, "()Z", "isRestored", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map<String, Bundle> states;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private xa.d parentRegistryOwner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String parentKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b30.a> children = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a lifecycleObserver = new a();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"b30/f$a", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements u {
        a() {
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
            s.k(source, "source");
            s.k(event, "event");
            if (event != Lifecycle.a.ON_CREATE) {
                throw new IllegalStateException(s.t("Expected to receive ON_CREATE event before anything else, but got ", event).toString());
            }
            if (f.this.i()) {
                throw new IllegalStateException("Expected not to be observing lifecycle after restoration.");
            }
            source.getLifecycle().d(this);
            f fVar = f.this;
            xa.d dVar = fVar.parentRegistryOwner;
            s.h(dVar);
            SavedStateRegistry savedStateRegistry = dVar.getSavedStateRegistry();
            String str = f.this.parentKey;
            s.h(str);
            fVar.k(savedStateRegistry.b(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return this.states != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Bundle restoredState) {
        Set<String> setKeySet;
        if (this.states != null) {
            throw new IllegalStateException("Expected performRestore to be called only once.");
        }
        this.states = new LinkedHashMap();
        if (restoredState != null && (setKeySet = restoredState.keySet()) != null) {
            for (String str : setKeySet) {
                Map<String, Bundle> map = this.states;
                s.h(map);
                Bundle bundle = restoredState.getBundle(str);
                s.h(bundle);
                Pair pairA = x.a(str, bundle);
                map.put((String) pairA.e(), (Bundle) pairA.f());
            }
        }
        for (b30.a aVar : this.children.values()) {
            if (aVar.getLifecycle().getState() == Lifecycle.State.INITIALIZED) {
                l(aVar);
            }
        }
    }

    private final void l(b30.a child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        child.getController().d(map.remove(child.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String()));
    }

    private final void n(b30.a child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        Bundle bundle = new Bundle();
        child.getController().e(bundle);
        Pair pairA = x.a(child.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), bundle);
        map.put((String) pairA.e(), (Bundle) pairA.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle o() {
        Bundle bundle = new Bundle();
        Map<String, Bundle> map = this.states;
        if (map != null) {
            Iterator<T> it = this.children.values().iterator();
            while (it.hasNext()) {
                n((b30.a) it.next());
            }
            for (Map.Entry<String, Bundle> entry : map.entrySet()) {
                bundle.putBundle(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    public final void f(String key, xa.d parentOwner) {
        s.k(key, "key");
        s.k(parentOwner, "parentOwner");
        g();
        this.parentRegistryOwner = parentOwner;
        this.parentKey = key;
        if (i()) {
            return;
        }
        SavedStateRegistry savedStateRegistry = parentOwner.getSavedStateRegistry();
        s.j(savedStateRegistry, "parentOwner.savedStateRegistry");
        Lifecycle lifecycle = parentOwner.getLifecycle();
        s.j(lifecycle, "parentOwner.lifecycle");
        try {
            savedStateRegistry.h(key, new SavedStateRegistry.c() { // from class: b30.e
                @Override // androidx.savedstate.SavedStateRegistry.c
                public final Bundle a() {
                    return this.f16006a.o();
                }
            });
            lifecycle.a(this.lifecycleObserver);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("Error registering SavedStateProvider: key \"" + key + "\" is already in use on parent SavedStateRegistryOwner " + parentOwner + ".\nThis is most easily remedied by giving your container Screen rendering a unique Compatible.compatibilityKey, perhaps by wrapping it with Named.", e11);
        }
    }

    public final void g() {
        Lifecycle lifecycle;
        SavedStateRegistry savedStateRegistry;
        xa.d dVar = this.parentRegistryOwner;
        if (dVar != null && (savedStateRegistry = dVar.getSavedStateRegistry()) != null) {
            String str = this.parentKey;
            s.h(str);
            savedStateRegistry.j(str);
        }
        xa.d dVar2 = this.parentRegistryOwner;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.parentRegistryOwner = null;
        this.parentKey = null;
    }

    public final void h(View view, String key) {
        s.k(view, "view");
        s.k(key, "key");
        LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(view);
        if (lifecycleOwnerA == null) {
            throw new IllegalArgumentException(("Expected " + view + CoreConstants.LEFT_PARENTHESIS_CHAR + key + ") to have a ViewTreeLifecycleOwner. Use WorkflowLifecycleOwner to fix that.").toString());
        }
        b30.a aVar = new b30.a(key, lifecycleOwnerA);
        if (this.children.put(key, aVar) != null) {
            throw new IllegalArgumentException(key + " is already in use, it cannot be used to register " + view);
        }
        xa.d dVarA = xa.e.a(view);
        if (dVarA == null) {
            xa.e.b(view, aVar);
            l(aVar);
        } else {
            throw new IllegalArgumentException(view + " already has ViewTreeSavedStateRegistryOwner: " + dVarA);
        }
    }

    public final void j(Collection<String> keysToKeep) {
        s.k(keysToKeep, "keysToKeep");
        Collection<String> collection = keysToKeep;
        Iterator it = d1.l(this.children.keySet(), collection).iterator();
        while (it.hasNext()) {
            this.children.remove((String) it.next());
        }
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        v.K(map.keySet(), d1.l(map.keySet(), collection));
    }

    public final void m(String key) {
        h0 h0Var;
        s.k(key, "key");
        b30.a aVarRemove = this.children.remove(key);
        if (aVarRemove == null) {
            h0Var = null;
        } else {
            n(aVarRemove);
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            throw new IllegalArgumentException(s.t("No such child: ", key));
        }
    }
}
