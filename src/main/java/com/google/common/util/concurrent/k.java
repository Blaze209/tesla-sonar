package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k<V> extends j<V> implements s<V> {

    public static abstract class a<V> extends k<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s<V> f43819a;

        protected a(s<V> sVar) {
            this.f43819a = (s) ou.p.m(sVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final s<V> d() {
            return this.f43819a;
        }
    }

    protected k() {
    }

    @Override // com.google.common.util.concurrent.s
    public void b(Runnable runnable, Executor executor) {
        c().b(runnable, executor);
    }

    /* JADX INFO: renamed from: e */
    protected abstract s<? extends V> c();
}
