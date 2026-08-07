package io0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio0/a;", "Lio0/j;", "", "other", "Lio0/b;", "Q2", "(Lio0/a;)J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a extends j, Comparable<a> {

    /* JADX INFO: renamed from: io0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C1710a {
        public static int a(a aVar, a other) {
            s.k(other, "other");
            return b.h(aVar.Q2(other), b.INSTANCE.c());
        }
    }

    long Q2(a other);
}
