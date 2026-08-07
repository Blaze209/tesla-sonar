package net.time4j.tz.model;

import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
enum k implements Comparator<d> {
    INSTANCE;

    @Override // java.util.Comparator
    public int compare(d dVar, d dVar2) {
        int iCompareTo = dVar.b(2000).compareTo(dVar2.b(2000));
        return iCompareTo == 0 ? dVar.f().compareTo(dVar2.f()) : iCompareTo;
    }
}
