package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fh0.j f57756a;

    j(fh0.j jVar) {
        this.f57756a = jVar;
    }

    public static qj0.i<i.a> b(fh0.j jVar) {
        return qj0.f.a(new j(jVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.i.a
    public i a(List<? extends NextStep> list, String str) {
        return this.f57756a.b(list, str);
    }
}
