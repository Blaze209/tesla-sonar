package iu;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class o extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f81902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f81903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ p f81904f;

    o(p pVar, int i11, int i12) {
        Objects.requireNonNull(pVar);
        this.f81904f = pVar;
        this.f81902d = i11;
        this.f81903e = i12;
    }

    @Override // iu.m
    final int b() {
        return this.f81904f.d() + this.f81902d + this.f81903e;
    }

    @Override // iu.m
    final int d() {
        return this.f81904f.d() + this.f81902d;
    }

    @Override // iu.m
    final Object[] e() {
        return this.f81904f.e();
    }

    @Override // iu.p
    /* JADX INFO: renamed from: f */
    public final p subList(int i11, int i12) {
        j.c(i11, i12, this.f81903e);
        int i13 = this.f81902d;
        return this.f81904f.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        j.a(i11, this.f81903e, "index");
        return this.f81904f.get(i11 + this.f81902d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81903e;
    }

    @Override // iu.p, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
