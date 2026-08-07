package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3126ca implements InterfaceC3084ba {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(C3171dc.a o11, C3171dc.a o12) {
        p013kotlin.jvm.internal.s.k(o11, "o1");
        p013kotlin.jvm.internal.s.k(o12, "o2");
        if (o11.e() && o12.e()) {
            if (o11.d().ordinal() < o12.d().ordinal()) {
                return -1;
            }
            return o11.d().ordinal() > o12.d().ordinal() ? 1 : 0;
        }
        if (o11.e()) {
            return -1;
        }
        return o12.e() ? 1 : 0;
    }
}
