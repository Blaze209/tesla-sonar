package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class v implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f43187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f43188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f43189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f43190d;

    v(w wVar, long j11, long j12, int i11) {
        this.f43187a = j11;
        this.f43188b = j12;
        this.f43189c = i11;
        Objects.requireNonNull(wVar);
        this.f43190d = wVar;
    }

    @Override // com.google.android.play.core.integrity.a.c
    public final Task<a.b> a(a.d dVar) {
        return this.f43190d.f43191a.c(dVar, this.f43187a, this.f43188b, this.f43189c);
    }
}
