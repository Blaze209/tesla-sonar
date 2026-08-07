package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f43679a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f43680b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p f43681c = new b(1);

    class a extends p {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.p
        public p d(int i11, int i12) {
            return k(Integer.compare(i11, i12));
        }

        @Override // com.google.common.collect.p
        public p e(long j11, long j12) {
            return k(Long.compare(j11, j12));
        }

        @Override // com.google.common.collect.p
        public <T> p f(T t11, T t12, Comparator<T> comparator) {
            return k(comparator.compare(t11, t12));
        }

        @Override // com.google.common.collect.p
        public p g(boolean z11, boolean z12) {
            return k(Boolean.compare(z11, z12));
        }

        @Override // com.google.common.collect.p
        public p h(boolean z11, boolean z12) {
            return k(Boolean.compare(z12, z11));
        }

        @Override // com.google.common.collect.p
        public int i() {
            return 0;
        }

        p k(int i11) {
            if (i11 < 0) {
                return p.f43680b;
            }
            return i11 > 0 ? p.f43681c : p.f43679a;
        }
    }

    private static final class b extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f43682d;

        b(int i11) {
            super(null);
            this.f43682d = i11;
        }

        @Override // com.google.common.collect.p
        public p d(int i11, int i12) {
            return this;
        }

        @Override // com.google.common.collect.p
        public p e(long j11, long j12) {
            return this;
        }

        @Override // com.google.common.collect.p
        public <T> p f(T t11, T t12, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.p
        public p g(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.p
        public p h(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.p
        public int i() {
            return this.f43682d;
        }
    }

    /* synthetic */ p(a aVar) {
        this();
    }

    public static p j() {
        return f43679a;
    }

    public abstract p d(int i11, int i12);

    public abstract p e(long j11, long j12);

    public abstract <T> p f(T t11, T t12, Comparator<T> comparator);

    public abstract p g(boolean z11, boolean z12);

    public abstract p h(boolean z11, boolean z12);

    public abstract int i();

    private p() {
    }
}
