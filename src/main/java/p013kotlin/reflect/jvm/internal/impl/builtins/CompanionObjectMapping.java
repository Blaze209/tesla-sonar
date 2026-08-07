package p013kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class CompanionObjectMapping {
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<ClassId> f86552a;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(v.y(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.getPrimitiveFqName((PrimitiveType) it.next()));
        }
        List listQ0 = v.Q0(v.Q0(v.Q0(arrayList, StandardNames.FqNames.string.toSafe()), StandardNames.FqNames._boolean.toSafe()), StandardNames.FqNames._enum.toSafe());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it2 = listQ0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.topLevel((FqName) it2.next()));
        }
        f86552a = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return f86552a;
    }

    public final Set<ClassId> getClassIds() {
        return f86552a;
    }
}
