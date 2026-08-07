package p011ja;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.a;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.p003lifecycle.y;
import androidx.p003lifecycle.y0;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003+-3BS\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0000\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00107R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010*R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010@R\u0016\u0010C\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010BR\u001b\u0010G\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010E\u001a\u0004\b5\u0010FR\u001b\u0010K\u001a\u00020H8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\b<\u0010JR*\u0010O\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000b8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00106\u001a\u0004\b:\u0010M\"\u0004\bI\u0010NR\u001a\u0010U\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b3\u0010VR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lja/k;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/f1;", "Landroidx/lifecycle/n;", "Lxa/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lja/r;", "destination", "Landroid/os/Bundle;", "immutableArgs", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Lja/c0;", "viewModelStoreProvider", "", "id", "savedState", "<init>", "(Landroid/content/Context;Lja/r;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Lja/c0;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "arguments", "(Lja/k;Landroid/os/Bundle;)V", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/Lifecycle$a;)V", "m", "()V", "outBundle", "j", "(Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/content/Context;", "b", "Lja/r;", "e", "()Lja/r;", "k", "(Lja/r;)V", "c", "Landroid/os/Bundle;", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/Lifecycle$State;", "Lja/c0;", "f", "Ljava/lang/String;", "g", "Landroidx/lifecycle/y;", "h", "Landroidx/lifecycle/y;", "_lifecycle", "Lxa/c;", "Lxa/c;", "savedStateRegistryController", "Z", "savedStateRegistryAttached", "Landroidx/lifecycle/y0;", "Lkotlin/Lazy;", "()Landroidx/lifecycle/y0;", "defaultFactory", "Landroidx/lifecycle/s0;", "l", "()Landroidx/lifecycle/s0;", "savedStateHandle", "maxState", "()Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/Lifecycle$State;)V", "maxLifecycle", "Landroidx/lifecycle/ViewModelProvider$Factory;", "n", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "()Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "o", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k implements LifecycleOwner, f1, n, xa.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bundle immutableArgs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Lifecycle.State hostLifecycleState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c0 viewModelStoreProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private y _lifecycle;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final xa.c savedStateRegistryController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean savedStateRegistryAttached;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy defaultFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy savedStateHandle;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Lifecycle.State maxLifecycle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;

    /* JADX INFO: renamed from: ja.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lja/k$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lja/r;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Lja/c0;", "viewModelStoreProvider", "", "id", "savedState", "Lja/k;", "a", "(Landroid/content/Context;Lja/r;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Lja/c0;Ljava/lang/String;Landroid/os/Bundle;)Lja/k;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k b(Companion companion, Context context, r rVar, Bundle bundle, Lifecycle.State state, c0 c0Var, String str, Bundle bundle2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bundle = null;
            }
            if ((i11 & 8) != 0) {
                state = Lifecycle.State.CREATED;
            }
            if ((i11 & 16) != 0) {
                c0Var = null;
            }
            if ((i11 & 32) != 0) {
                str = UUID.randomUUID().toString();
                s.j(str, "randomUUID().toString()");
            }
            if ((i11 & 64) != 0) {
                bundle2 = null;
            }
            return companion.a(context, rVar, bundle, state, c0Var, str, bundle2);
        }

        public final k a(Context context, r destination, Bundle arguments, Lifecycle.State hostLifecycleState, c0 viewModelStoreProvider, String id2, Bundle savedState) {
            s.k(destination, "destination");
            s.k(hostLifecycleState, "hostLifecycleState");
            s.k(id2, "id");
            return new k(context, destination, arguments, hostLifecycleState, viewModelStoreProvider, id2, savedState, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lja/k$b;", "Landroidx/lifecycle/a;", "Lxa/d;", "owner", "<init>", "(Lxa/d;)V", "Landroidx/lifecycle/c1;", "T", "", Action.KEY_ATTRIBUTE, "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/s0;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/s0;)Landroidx/lifecycle/c1;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xa.d owner) {
            super(owner, null);
            s.k(owner, "owner");
        }

        @Override // androidx.p003lifecycle.a
        protected <T extends c1> T c(String key, Class<T> modelClass, s0 handle) {
            s.k(key, "key");
            s.k(modelClass, "modelClass");
            s.k(handle, "handle");
            return new c(handle);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lja/k$c;", "Landroidx/lifecycle/c1;", "Landroidx/lifecycle/s0;", "handle", "<init>", "(Landroidx/lifecycle/s0;)V", "s", "Landroidx/lifecycle/s0;", "f", "()Landroidx/lifecycle/s0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends c1 {

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final s0 handle;

        public c(s0 handle) {
            s.k(handle, "handle");
            this.handle = handle;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final s0 getHandle() {
            return this.handle;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/y0;", "b", "()Landroidx/lifecycle/y0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<y0> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y0 invoke() {
            Context context = k.this.context;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            k kVar = k.this;
            return new y0(application, kVar, kVar.c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/s0;", "b", "()Landroidx/lifecycle/s0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<s0> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s0 invoke() {
            if (!k.this.savedStateRegistryAttached) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (k.this.getLifecycle().getState() != Lifecycle.State.DESTROYED) {
                return ((c) new ViewModelProvider(k.this, new b(k.this)).b(c.class)).getHandle();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public /* synthetic */ k(Context context, r rVar, Bundle bundle, Lifecycle.State state, c0 c0Var, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, rVar, bundle, state, c0Var, str, bundle2);
    }

    private final y0 d() {
        return (y0) this.defaultFactory.getValue();
    }

    public final Bundle c() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final r getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        Set<String> setKeySet;
        if (other != null && (other instanceof k)) {
            k kVar = (k) other;
            if (s.f(this.id, kVar.id) && s.f(this.destination, kVar.destination) && s.f(getLifecycle(), kVar.getLifecycle()) && s.f(getSavedStateRegistry(), kVar.getSavedStateRegistry())) {
                if (s.f(this.immutableArgs, kVar.immutableArgs)) {
                    return true;
                }
                Bundle bundle = this.immutableArgs;
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        Object obj = this.immutableArgs.get(str);
                        Bundle bundle2 = kVar.immutableArgs;
                        if (!s.f(obj, bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    @Override // androidx.p003lifecycle.n
    public CreationExtras getDefaultViewModelCreationExtras() {
        androidx.p003lifecycle.viewmodel.a aVar = new androidx.p003lifecycle.viewmodel.a(null, 1, null);
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            aVar.c(ViewModelProvider.a.f8735h, application);
        }
        aVar.c(v0.f8920a, this);
        aVar.c(v0.f8921b, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            aVar.c(v0.f8922c, bundleC);
        }
        return aVar;
    }

    @Override // androidx.p003lifecycle.n
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this._lifecycle;
    }

    @Override // xa.d
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.p003lifecycle.f1
    public ViewModelStore getViewModelStore() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        c0 c0Var = this.viewModelStoreProvider;
        if (c0Var != null) {
            return c0Var.e(this.id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final s0 h() {
        return (s0) this.savedStateHandle.getValue();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i11 = iHashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                iHashCode = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void i(Lifecycle.a event) {
        s.k(event, "event");
        this.hostLifecycleState = event.getTargetState();
        m();
    }

    public final void j(Bundle outBundle) {
        s.k(outBundle, "outBundle");
        this.savedStateRegistryController.e(outBundle);
    }

    public final void k(r rVar) {
        s.k(rVar, "<set-?>");
        this.destination = rVar;
    }

    public final void l(Lifecycle.State maxState) {
        s.k(maxState, "maxState");
        this.maxLifecycle = maxState;
        m();
    }

    public final void m() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.c();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                v0.c(this);
            }
            this.savedStateRegistryController.d(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this._lifecycle.o(this.hostLifecycleState);
        } else {
            this._lifecycle.o(this.maxLifecycle);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR + this.id + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        sb2.append(" destination=");
        sb2.append(this.destination);
        String string = sb2.toString();
        s.j(string, "sb.toString()");
        return string;
    }

    private k(Context context, r rVar, Bundle bundle, Lifecycle.State state, c0 c0Var, String str, Bundle bundle2) {
        this.context = context;
        this.destination = rVar;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = c0Var;
        this.id = str;
        this.savedState = bundle2;
        this._lifecycle = new y(this);
        this.savedStateRegistryController = xa.c.INSTANCE.a(this);
        this.defaultFactory = m.b(new d());
        this.savedStateHandle = m.b(new e());
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(k entry, Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        s.k(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        l(entry.maxLifecycle);
    }
}
