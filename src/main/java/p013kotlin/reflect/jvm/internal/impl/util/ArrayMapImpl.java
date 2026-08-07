package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import p013kotlin.collections.c;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f89050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89051b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ArrayMapImpl(Object[] objArr, int i11) {
        super(null);
        this.f89050a = objArr;
        this.f89051b = i11;
    }

    private final void b(int i11) {
        Object[] objArr = this.f89050a;
        if (objArr.length > i11) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i11);
        Object[] objArrCopyOf = Arrays.copyOf(this.f89050a, length);
        s.j(objArrCopyOf, "copyOf(...)");
        this.f89050a = objArrCopyOf;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i11) {
        return (T) n.x0(this.f89050a, i11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.f89051b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new c<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f89052c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayMapImpl<T> f89053d;

            {
                this.f89053d = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p013kotlin.collections.c
            protected void b() {
                do {
                    int i11 = this.f89052c + 1;
                    this.f89052c = i11;
                    if (i11 >= ((ArrayMapImpl) this.f89053d).f89050a.length) {
                        break;
                    }
                } while (((ArrayMapImpl) this.f89053d).f89050a[this.f89052c] == null);
                if (this.f89052c >= ((ArrayMapImpl) this.f89053d).f89050a.length) {
                    d();
                    return;
                }
                Object obj = ((ArrayMapImpl) this.f89053d).f89050a[this.f89052c];
                s.i(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                e(obj);
            }
        };
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i11, T value) {
        s.k(value, "value");
        b(i11);
        if (this.f89050a[i11] == null) {
            this.f89051b = getSize() + 1;
        }
        this.f89050a[i11] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
