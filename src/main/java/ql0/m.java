package ql0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
abstract class m {

    class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.b f105665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f105666b;

        a(l.b bVar, g gVar) {
            this.f105665a = bVar;
            this.f105666b = gVar;
        }

        @Override // ql0.m
        @NonNull
        l a() {
            return this.f105665a.a(this.f105666b, new r());
        }
    }

    m() {
    }

    @NonNull
    static m b(@NonNull l.b bVar, @NonNull g gVar) {
        return new a(bVar, gVar);
    }

    @NonNull
    abstract l a();
}
