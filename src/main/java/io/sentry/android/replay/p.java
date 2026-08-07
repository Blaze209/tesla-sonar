package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.sentry.d1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lio/sentry/android/replay/p;", "Ljava/io/Closeable;", "<init>", "()V", "Ljn0/h0;", "close", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Lio/sentry/util/a;", "b", "Lio/sentry/util/a;", "viewListLock", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/sentry/android/replay/e;", "c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "p", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "delegatingViewList", "e", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80079f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isClosed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a viewListLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<e> listeners;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<View> delegatingViewList;

    /* JADX INFO: renamed from: io.sentry.android.replay.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/p$a;", "", "<init>", "()V", "Lio/sentry/android/replay/p;", "b", "()Lio/sentry/android/replay/p;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: io.sentry.android.replay.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "mViews", "a", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;"}, k = 3, mv = {1, 9, 0})
        static final class C1694a extends p013kotlin.jvm.internal.u implements wn0.l<ArrayList<View>, ArrayList<View>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f80084c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1694a(p pVar) {
                super(1);
                this.f80084c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList<View> invoke(ArrayList<View> mViews) throws Exception {
                p013kotlin.jvm.internal.s.k(mViews, "mViews");
                d1 d1VarA = this.f80084c.viewListLock.a();
                try {
                    ArrayList<View> arrayList = this.f80084c.delegatingViewList;
                    arrayList.addAll(mViews);
                    un0.a.a(d1VarA, null);
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        un0.a.a(d1VarA, th2);
                        throw th3;
                    }
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(p pVar) {
            if (pVar.isClosed.get()) {
                return;
            }
            v.f80190a.e(new C1694a(pVar));
        }

        public final p b() {
            final p pVar = new p(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.o
                @Override // java.lang.Runnable
                public final void run() {
                    p.Companion.c(pVar);
                }
            });
            return pVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"io/sentry/android/replay/p$b", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "", "elements", "", "addAll", "(Ljava/util/Collection;)Z", "element", "a", "(Landroid/view/View;)Z", "", "index", IntegerTokenConverter.CONVERTER_KEY, "(I)Landroid/view/View;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ArrayList<View> {
        b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            p013kotlin.jvm.internal.s.k(element, "element");
            Iterator<T> it = p.this.p().iterator();
            while (it.hasNext()) {
                ((e) it.next()).n(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends View> elements) {
            p013kotlin.jvm.internal.s.k(elements, "elements");
            for (e eVar : p.this.p()) {
                Iterator<T> it = elements.iterator();
                while (it.hasNext()) {
                    eVar.n((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        public /* bridge */ boolean b(View view) {
            return super.contains(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return b((View) obj);
            }
            return false;
        }

        public /* bridge */ int d() {
            return super.size();
        }

        public /* bridge */ int e(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int f(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i11) {
            return i(i11);
        }

        public /* bridge */ boolean h(View view) {
            return super.remove(view);
        }

        public View i(int index) {
            Object objRemove = super.remove(index);
            p013kotlin.jvm.internal.s.j(objRemove, "removeAt(...)");
            View view = (View) objRemove;
            Iterator<T> it = p.this.p().iterator();
            while (it.hasNext()) {
                ((e) it.next()).n(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return e((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return f((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return h((View) obj);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"io/sentry/android/replay/p$c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/sentry/android/replay/e;", "element", "", "a", "(Lio/sentry/android/replay/e;)Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends CopyOnWriteArrayList<e> {
        c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(e element) throws Exception {
            d1 d1VarA = p.this.viewListLock.a();
            try {
                for (View view : p.this.delegatingViewList) {
                    if (element != null) {
                        element.n(view, true);
                    }
                }
                h0 h0Var = h0.f84049a;
                un0.a.a(d1VarA, null);
                return super.add(element);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(d1VarA, th2);
                    throw th3;
                }
            }
        }

        public /* bridge */ boolean b(e eVar) {
            return super.contains(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return b((e) obj);
            }
            return false;
        }

        public /* bridge */ int d() {
            return super.size();
        }

        public /* bridge */ int e(e eVar) {
            return super.indexOf(eVar);
        }

        public /* bridge */ int f(e eVar) {
            return super.lastIndexOf(eVar);
        }

        public /* bridge */ boolean g(e eVar) {
            return super.remove(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return e((e) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return f((e) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return g((e) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
        this.listeners.clear();
    }

    public final CopyOnWriteArrayList<e> p() {
        return this.listeners;
    }

    private p() {
        this.isClosed = new AtomicBoolean(false);
        this.viewListLock = new io.sentry.util.a();
        this.listeners = new c();
        this.delegatingViewList = new b();
    }
}
