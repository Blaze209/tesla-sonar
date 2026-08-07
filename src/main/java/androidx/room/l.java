package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/room/l;", "", "Landroidx/room/b0;", "database", "<init>", "(Landroidx/room/b0;)V", "a", "Landroidx/room/b0;", "", "Landroidx/lifecycle/d0;", "b", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<androidx.p003lifecycle.d0<?>> liveDataSet;

    public l(b0 database) {
        p013kotlin.jvm.internal.s.k(database, "database");
        this.database = database;
        Set<androidx.p003lifecycle.d0<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        p013kotlin.jvm.internal.s.j(setNewSetFromMap, "newSetFromMap(...)");
        this.liveDataSet = setNewSetFromMap;
    }
}
