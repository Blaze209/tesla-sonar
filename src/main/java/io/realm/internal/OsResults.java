package io.realm.internal;

import io.realm.h0;
import io.realm.w;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public class OsResults implements h, ObservableCollection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f79023h = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f79024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OsSharedRealm f79025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f79026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Table f79027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f79028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f79029f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final j<ObservableCollection.b> f79030g = new j<>();

    public static abstract class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected OsResults f79031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f79032b = -1;

        public a(OsResults osResults) {
            if (osResults.f79025b.isClosed()) {
                throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
            }
            this.f79031a = osResults;
            if (osResults.f79029f) {
                return;
            }
            if (osResults.f79025b.isInTransaction()) {
                b();
            } else {
                this.f79031a.f79025b.addIterator(this);
            }
        }

        void a() {
            if (this.f79031a == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        void b() {
            this.f79031a = this.f79031a.g();
        }

        T c(int i11) {
            return d(i11, this.f79031a);
        }

        protected abstract T d(int i11, OsResults osResults);

        void e() {
            this.f79031a = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return ((long) (this.f79032b + 1)) < this.f79031a.r();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            int i11 = this.f79032b + 1;
            this.f79032b = i11;
            if (i11 < this.f79031a.r()) {
                return c(this.f79032b);
            }
            throw new NoSuchElementException("Cannot access index " + this.f79032b + " when size is " + this.f79031a.r() + ". Remember to check hasNext() before using next().");
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    public static abstract class b<T> extends a<T> implements ListIterator<T> {
        public b(OsResults osResults, int i11) {
            super(osResults);
            if (i11 >= 0 && i11 <= this.f79031a.r()) {
                this.f79032b = i11 - 1;
                return;
            }
            throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.f79031a.r() - 1) + "]. Yours was " + i11);
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(T t11) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            a();
            return this.f79032b >= 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            a();
            return this.f79032b + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            a();
            try {
                T tC = c(this.f79032b);
                this.f79032b--;
                return tC;
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.f79032b + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            a();
            return this.f79032b;
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(T t11) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    public enum c {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        static c getByValue(byte b11) {
            if (b11 == 0) {
                return EMPTY;
            }
            if (b11 == 1) {
                return TABLE;
            }
            if (b11 == 2) {
                return PRIMITIVE_LIST;
            }
            if (b11 == 3) {
                return QUERY;
            }
            if (b11 == 4) {
                return TABLEVIEW;
            }
            throw new IllegalArgumentException("Invalid value: " + ((int) b11));
        }
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j11) {
        this.f79025b = osSharedRealm;
        g gVar = osSharedRealm.context;
        this.f79026c = gVar;
        this.f79027d = table;
        this.f79024a = j11;
        gVar.a(this);
        this.f79028e = i() != c.QUERY;
    }

    public static OsResults f(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.p();
        return new OsResults(osSharedRealm, tableQuery.i(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    private static native Object nativeAggregate(long j11, long j12, byte b11);

    private static native void nativeClear(long j11);

    private static native boolean nativeContains(long j11, long j12);

    protected static native long nativeCreateResults(long j11, long j12);

    private static native long nativeCreateResultsFromBacklinks(long j11, long j12, long j13, long j14);

    private static native long nativeCreateSnapshot(long j11);

    private static native void nativeDelete(long j11, long j12);

    private static native boolean nativeDeleteFirst(long j11);

    private static native boolean nativeDeleteLast(long j11);

    private static native void nativeEvaluateQueryIfNeeded(long j11, boolean z11);

    private static native long nativeFirstRow(long j11);

    private static native long nativeFreeze(long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j11);

    private static native long nativeGetRow(long j11, int i11);

    private static native long nativeGetTable(long j11);

    private static native Object nativeGetValue(long j11, int i11);

    private static native long nativeIndexOf(long j11, long j12);

    private static native boolean nativeIsValid(long j11);

    private static native long nativeLastRow(long j11);

    private static native void nativeSetBinary(long j11, String str, byte[] bArr);

    private static native void nativeSetBoolean(long j11, String str, boolean z11);

    private static native void nativeSetDecimal128(long j11, String str, long j12, long j13);

    private static native void nativeSetDouble(long j11, String str, double d11);

    private static native void nativeSetFloat(long j11, String str, float f11);

    private static native void nativeSetInt(long j11, String str, long j12);

    private static native void nativeSetList(long j11, String str, long j12);

    private static native void nativeSetNull(long j11, String str);

    private static native void nativeSetObject(long j11, String str, long j12);

    private static native void nativeSetObjectId(long j11, String str, String str2);

    private static native void nativeSetString(long j11, String str, String str2);

    private static native void nativeSetTimestamp(long j11, String str, long j12);

    private static native void nativeSetUUID(long j11, String str, String str2);

    private static native long nativeSize(long j11);

    private native void nativeStartListening(long j11);

    private native void nativeStopListening(long j11);

    private static native long nativeStringDescriptor(long j11, String str, long j12);

    private static native long nativeWhere(long j11);

    private static native String toJSON(long j11, int i11);

    public <T> void c(T t11, w<T> wVar) {
        if (this.f79030g.d()) {
            nativeStartListening(this.f79024a);
        }
        this.f79030g.a(new ObservableCollection.b(t11, wVar));
    }

    public <T> void d(T t11, h0<T> h0Var) {
        c(t11, new ObservableCollection.c(h0Var));
    }

    public void e() {
        nativeClear(this.f79024a);
    }

    public OsResults g() {
        if (this.f79029f) {
            return this;
        }
        OsResults osResults = new OsResults(this.f79025b, this.f79027d, nativeCreateSnapshot(this.f79024a));
        osResults.f79029f = true;
        return osResults;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f79023h;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f79024a;
    }

    public UncheckedRow h() {
        long jNativeFirstRow = nativeFirstRow(this.f79024a);
        if (jNativeFirstRow != 0) {
            return this.f79027d.s(jNativeFirstRow);
        }
        return null;
    }

    public c i() {
        return c.getByValue(nativeGetMode(this.f79024a));
    }

    public Table j() {
        return this.f79027d;
    }

    public UncheckedRow k(int i11) {
        return this.f79027d.s(nativeGetRow(this.f79024a, i11));
    }

    public Object l(int i11) {
        return nativeGetValue(this.f79024a, i11);
    }

    public boolean m() {
        return this.f79028e;
    }

    public boolean n() {
        return nativeIsValid(this.f79024a);
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j11) {
        OsCollectionChangeSet dVar = j11 == 0 ? new d() : new OsCollectionChangeSet(j11, !m());
        if (dVar.e() && m()) {
            return;
        }
        this.f79028e = true;
        this.f79030g.c(new ObservableCollection.a(dVar));
    }

    public void o() {
        if (this.f79028e) {
            return;
        }
        try {
            nativeEvaluateQueryIfNeeded(this.f79024a, false);
        } catch (IllegalArgumentException e11) {
            if (e11.getMessage().contains("Cannot sort on a collection property")) {
                throw new IllegalStateException("Illegal Argument: " + e11.getMessage());
            }
        } catch (IllegalStateException e12) {
            throw new IllegalArgumentException("Illegal Argument: " + e12.getMessage());
        }
        notifyChangeListeners(0L);
    }

    public <T> void p(T t11, w<T> wVar) {
        this.f79030g.e(t11, wVar);
        if (this.f79030g.d()) {
            nativeStopListening(this.f79024a);
        }
    }

    public <T> void q(T t11, h0<T> h0Var) {
        p(t11, new ObservableCollection.c(h0Var));
    }

    public long r() {
        return nativeSize(this.f79024a);
    }

    public TableQuery s() {
        return new TableQuery(this.f79026c, this.f79027d, nativeWhere(this.f79024a));
    }
}
