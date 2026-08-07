package androidx.room;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "", "migrationStartAndEndVersions", "migrationsNotRequiredFrom", "Ljn0/h0;", "b", "(Ljava/util/Set;Ljava/util/Set;)V", "Landroidx/room/b0;", "Landroidx/room/e;", "configuration", "a", "(Landroidx/room/b0;Landroidx/room/e;)V", "c", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
final /* synthetic */ class d0 {
    public static final void a(b0 b0Var, e configuration) {
        p013kotlin.jvm.internal.s.k(b0Var, "<this>");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<co0.d<? extends ua.a>> requiredAutoMigrationSpecClasses = b0Var.getRequiredAutoMigrationSpecClasses();
        int size = requiredAutoMigrationSpecClasses.size();
        boolean[] zArr = new boolean[size];
        Iterator<co0.d<? extends ua.a>> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i11 = -1;
            if (!it.hasNext()) {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (ua.b bVar : b0Var.createAutoMigrations(linkedHashMap)) {
                    if (!configuration.migrationContainer.c(bVar.startVersion, bVar.endVersion)) {
                        configuration.migrationContainer.a(bVar);
                    }
                }
                return;
            }
            co0.d<? extends ua.a> next = it.next();
            int size3 = configuration.autoMigrationSpecs.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i13 = size3 - 1;
                    if (next.j(configuration.autoMigrationSpecs.get(size3))) {
                        zArr[size3] = true;
                        i11 = size3;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        size3 = i13;
                    }
                }
            }
            if (i11 < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + next.c() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(next, configuration.autoMigrationSpecs.get(i11));
        }
    }

    public static final void b(Set<Integer> migrationStartAndEndVersions, Set<Integer> migrationsNotRequiredFrom) {
        p013kotlin.jvm.internal.s.k(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        p013kotlin.jvm.internal.s.k(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator<Integer> it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }

    public static final void c(b0 b0Var, e configuration) {
        p013kotlin.jvm.internal.s.k(b0Var, "<this>");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        Map<co0.d<?>, List<co0.d<?>>> requiredTypeConverterClassesMap$room_runtime_release = b0Var.getRequiredTypeConverterClassesMap$room_runtime_release();
        boolean[] zArr = new boolean[requiredTypeConverterClassesMap$room_runtime_release.size()];
        for (Map.Entry<co0.d<?>, List<co0.d<?>>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
            co0.d<?> key = entry.getKey();
            for (co0.d<?> dVar : entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                while (true) {
                    int i11 = size - 1;
                    if (dVar.j(configuration.typeConverters.get(size))) {
                        zArr[size] = true;
                        break;
                    } else {
                        if (i11 < 0) {
                            size = -1;
                            break;
                        }
                        size = i11;
                    }
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + dVar.c() + ") for " + key.c() + " is missing in the database configuration.").toString());
                }
                b0Var.addTypeConverter$room_runtime_release(dVar, configuration.typeConverters.get(size));
            }
        }
        int size2 = configuration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i12 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i12 < 0) {
                return;
            } else {
                size2 = i12;
            }
        }
    }
}
