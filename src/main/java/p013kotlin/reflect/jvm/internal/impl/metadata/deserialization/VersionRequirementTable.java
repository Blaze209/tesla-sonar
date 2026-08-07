package p013kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes9.dex */
public final class VersionRequirementTable {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final VersionRequirementTable f88076b = new VersionRequirementTable(v.m());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ProtoBuf.VersionRequirement> f88077a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VersionRequirementTable create(ProtoBuf.VersionRequirementTable table) {
            s.k(table, "table");
            if (table.getRequirementCount() == 0) {
                return getEMPTY();
            }
            List<ProtoBuf.VersionRequirement> requirementList = table.getRequirementList();
            s.j(requirementList, "getRequirementList(...)");
            return new VersionRequirementTable(requirementList, null);
        }

        public final VersionRequirementTable getEMPTY() {
            return VersionRequirementTable.f88076b;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VersionRequirementTable(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private VersionRequirementTable(List<ProtoBuf.VersionRequirement> list) {
        this.f88077a = list;
    }
}
