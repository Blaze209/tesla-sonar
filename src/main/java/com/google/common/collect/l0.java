package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l0<K0, V0> {

    class a extends e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f43648a;

        a(int i11) {
            this.f43648a = i11;
        }

        @Override // com.google.common.collect.l0.e
        <K, V> Map<K, Collection<V>> c() {
            return s0.c(this.f43648a);
        }
    }

    class b extends e<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f43649a;

        b(Comparator comparator) {
            this.f43649a = comparator;
        }

        @Override // com.google.common.collect.l0.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f43649a);
        }
    }

    private static final class c<V> implements ou.x<List<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43650a;

        c(int i11) {
            this.f43650a = k.b(i11, "expectedValuesPerKey");
        }

        @Override // ou.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f43650a);
        }
    }

    public static abstract class d<K0, V0> extends l0<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> e0<K, V> e();
    }

    public static abstract class e<K0> {

        class a extends d<K0, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f43651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f43652b;

            a(e eVar, int i11) {
                this.f43651a = i11;
                this.f43652b = eVar;
            }

            @Override // com.google.common.collect.l0.d
            public <K extends K0, V> e0<K, V> e() {
                return m0.b(this.f43652b.c(), new c(this.f43651a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i11) {
            k.b(i11, "expectedValuesPerKey");
            return new a(this, i11);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ l0(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i11) {
        k.b(i11, "expectedKeys");
        return new a(i11);
    }

    public static e<Comparable> c() {
        return d(r0.f());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        ou.p.m(comparator);
        return new b(comparator);
    }

    private l0() {
    }
}
