package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "view", "Lxa/d;", "owner", "Landroidx/compose/ui/platform/d1;", "b", "(Landroid/view/View;Lxa/d;)Landroidx/compose/ui/platform/d1;", "", "id", "savedStateRegistryOwner", "c", "(Ljava/lang/String;Lxa/d;)Landroidx/compose/ui/platform/d1;", "", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "h", "(Landroid/os/Bundle;)Ljava/util/Map;", "g", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "a", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<? extends Object>[] f5701a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SavedStateRegistry f5703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f5704e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, SavedStateRegistry savedStateRegistry, String str) {
            super(0);
            this.f5702c = z11;
            this.f5703d = savedStateRegistry;
            this.f5704e = str;
        }

        public final void b() {
            if (this.f5702c) {
                this.f5703d.j(this.f5704e);
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5705c = new b();

        b() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // wn0.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(f1.f(obj));
        }
    }

    public static final d1 b(View view, xa.d dVar) {
        Object parent = view.getParent();
        p013kotlin.jvm.internal.s.i(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(d3.h.H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, dVar);
    }

    public static final d1 c(String str, xa.d dVar) {
        boolean z11;
        String str2 = a3.g.class.getSimpleName() + CoreConstants.COLON_CHAR + str;
        SavedStateRegistry savedStateRegistry = dVar.getSavedStateRegistry();
        Bundle bundleB = savedStateRegistry.b(str2);
        final a3.g gVarA = a3.i.a(bundleB != null ? h(bundleB) : null, b.f5705c);
        try {
            savedStateRegistry.h(str2, new SavedStateRegistry.c() { // from class: androidx.compose.ui.platform.e1
                @Override // androidx.savedstate.SavedStateRegistry.c
                public final Bundle a() {
                    return f1.d(gVarA);
                }
            });
            z11 = true;
        } catch (IllegalArgumentException unused) {
            z11 = false;
        }
        return new d1(gVarA, new a(z11, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(a3.g gVar) {
        return g(gVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof b3.g) {
            b3.g gVar = (b3.g) obj;
            if (gVar.e() != p020r2.n3.j() && gVar.e() != p020r2.n3.q() && gVar.e() != p020r2.n3.n()) {
                return false;
            }
            T value = gVar.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof jn0.i) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f5701a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            p013kotlin.jvm.internal.s.i(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
