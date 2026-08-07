package p011ja;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.c1;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lja/o;", "Landroidx/lifecycle/c1;", "Lja/c0;", "<init>", "()V", "", "backStackEntryId", "Ljn0/h0;", "g", "(Ljava/lang/String;)V", "onCleared", "Landroidx/lifecycle/ViewModelStore;", "e", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModelStore;", "toString", "()Ljava/lang/String;", "", "s", "Ljava/util/Map;", "viewModelStores", "t", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o extends c1 implements c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final ViewModelProvider.Factory f83338u = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ja/o$a", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {
        a() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            s.k(modelClass, "modelClass");
            return new o();
        }
    }

    /* JADX INFO: renamed from: ja.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lja/o$b;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Lja/o;", "a", "(Landroidx/lifecycle/ViewModelStore;)Lja/o;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "FACTORY", "Landroidx/lifecycle/ViewModelProvider$Factory;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(ViewModelStore viewModelStore) {
            s.k(viewModelStore, "viewModelStore");
            return (o) new ViewModelProvider(viewModelStore, o.f83338u, null, 4, null).b(o.class);
        }

        private Companion() {
        }
    }

    @Override // p011ja.c0
    public ViewModelStore e(String backStackEntryId) {
        s.k(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = this.viewModelStores.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.viewModelStores.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    public final void g(String backStackEntryId) {
        s.k(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStoreRemove = this.viewModelStores.remove(backStackEntryId);
        if (viewModelStoreRemove != null) {
            viewModelStoreRemove.a();
        }
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        Iterator<ViewModelStore> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.viewModelStores.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String string = sb2.toString();
        s.j(string, "sb.toString()");
        return string;
    }
}
