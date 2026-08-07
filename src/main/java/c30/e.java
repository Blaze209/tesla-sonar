package c30;

import a30.n;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\b\u0001\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\t¢\u0006\u0004\b\u000f\u0010\rJ1\u0010\u0014\u001a\u00020\u000b2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001c¢\u0006\u0004\b \u0010!R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&¨\u0006("}, d2 = {"Lc30/e;", "", "", "", "Lc30/g;", "viewStates", "<init>", "(Ljava/util/Map;)V", "()V", "", "retaining", "Ljn0/h0;", "e", "(Ljava/util/Collection;)V", "La30/n;", DateTokenConverter.CONVERTER_KEY, "retainedRenderings", "Landroid/view/View;", "oldViewMaybe", "newView", "h", "(Ljava/util/Collection;Landroid/view/View;Landroid/view/View;)V", Action.KEY_ATTRIBUTE, "Lxa/d;", "parentOwner", "a", "(Ljava/lang/String;Lxa/d;)V", "b", "Lc30/e$a;", "from", "f", "(Lc30/e$a;)V", "g", "()Lc30/e$a;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Lb30/f;", "Lb30/f;", "stateRegistryAggregator", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, ViewStateFrame> viewStates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b30.f stateRegistryAggregator;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La30/n;", "it", "", "a", "(La30/n;)Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends u implements l<n<?>, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f18596c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(n<?> it) {
            s.k(it, "it");
            return it.getCompatibilityKey();
        }
    }

    public e(Map<String, ViewStateFrame> viewStates) {
        s.k(viewStates, "viewStates");
        this.viewStates = viewStates;
        this.stateRegistryAggregator = new b30.f();
    }

    private final void e(Collection<String> retaining) {
        v.K(this.viewStates.keySet(), d1.l(this.viewStates.keySet(), retaining));
        this.stateRegistryAggregator.j(retaining);
    }

    public final void a(String key, xa.d parentOwner) {
        s.k(key, "key");
        s.k(parentOwner, "parentOwner");
        this.stateRegistryAggregator.f(key, parentOwner);
    }

    public final void b() {
        this.stateRegistryAggregator.g();
    }

    public final Map<String, ViewStateFrame> c() {
        return this.viewStates;
    }

    public final void d(Collection<? extends n<?>> retaining) {
        s.k(retaining, "retaining");
        Collection<? extends n<?>> collection = retaining;
        ArrayList arrayList = new ArrayList(v.y(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((n) it.next()).getCompatibilityKey());
        }
        e(arrayList);
    }

    public final void f(a from) {
        s.k(from, "from");
        this.viewStates.clear();
        this.viewStates.putAll(from.a());
    }

    public final a g() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Collection<? extends n<?>> retainedRenderings, View oldViewMaybe, View newView) {
        s.k(retainedRenderings, "retainedRenderings");
        s.k(newView, "newView");
        String strB = f.b(newView);
        Set setE0 = ho0.l.e0(ho0.l.U(v.e0(retainedRenderings), b.f18596c));
        if (retainedRenderings.size() != setE0.size()) {
            throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + CoreConstants.DOT).toString());
        }
        this.stateRegistryAggregator.h(newView, strB);
        ViewStateFrame viewStateFrameRemove = this.viewStates.remove(strB);
        if (viewStateFrameRemove != null) {
            newView.restoreHierarchyState(viewStateFrameRemove.a());
        }
        if (oldViewMaybe != null) {
            String strB2 = f.b(oldViewMaybe);
            if (!setE0.contains(strB2)) {
                strB2 = null;
            }
            if (strB2 != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                oldViewMaybe.saveHierarchyState(sparseArray);
                Map<String, ViewStateFrame> mapC = c();
                Pair pairA = x.a(strB2, new ViewStateFrame(strB2, sparseArray));
                mapC.put(pairA.e(), pairA.f());
                this.stateRegistryAggregator.m(strB2);
            }
        }
        e(d1.o(setE0, strB));
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, d2 = {"Lc30/e$a;", "Landroid/os/Parcelable;", "Lc30/e;", "viewStateCache", "<init>", "(Lc30/e;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "", "Lc30/g;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "viewStates", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, ViewStateFrame> viewStates;

        /* JADX INFO: renamed from: c30.e$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc30/e$a$a;", "Landroid/os/Parcelable$Creator;", "Lc30/e$a;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lc30/e$a;", "", "size", "", "b", "(I)[Lc30/e$a;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<a> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel source) {
                s.k(source, "source");
                return new a(source);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int size) {
                return new a[size];
            }

            private Companion() {
            }
        }

        public a(e viewStateCache) {
            s.k(viewStateCache, "viewStateCache");
            this.viewStates = v0.A(viewStateCache.c());
        }

        public final Map<String, ViewStateFrame> a() {
            return this.viewStates;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            s.k(out, "out");
            out.writeMap(this.viewStates);
        }

        public a(Parcel source) {
            s.k(source, "source");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            source.readMap(u0.d(linkedHashMap), e.class.getClassLoader());
            this.viewStates = v0.A(linkedHashMap);
        }
    }

    public e() {
        this(new LinkedHashMap());
    }
}
