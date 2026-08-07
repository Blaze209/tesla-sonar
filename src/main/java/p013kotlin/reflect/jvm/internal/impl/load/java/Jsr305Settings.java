package p013kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReportLevel f87105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReportLevel f87106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<FqName, ReportLevel> f87107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f87108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f87109e;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(ReportLevel globalLevel, ReportLevel reportLevel, Map<FqName, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        s.k(globalLevel, "globalLevel");
        s.k(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f87105a = globalLevel;
        this.f87106b = reportLevel;
        this.f87107c = userDefinedLevelForSpecificAnnotation;
        this.f87108d = m.b(new g(this));
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.f87109e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(Jsr305Settings jsr305Settings) {
        List listC = v.c();
        listC.add(jsr305Settings.f87105a.getDescription());
        ReportLevel reportLevel = jsr305Settings.f87106b;
        if (reportLevel != null) {
            listC.add("under-migration:" + reportLevel.getDescription());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.f87107c.entrySet()) {
            listC.add('@' + entry.getKey() + CoreConstants.COLON_CHAR + entry.getValue().getDescription());
        }
        return (String[]) v.a(listC).toArray(new String[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f87105a == jsr305Settings.f87105a && this.f87106b == jsr305Settings.f87106b && s.f(this.f87107c, jsr305Settings.f87107c);
    }

    public final ReportLevel getGlobalLevel() {
        return this.f87105a;
    }

    public final ReportLevel getMigrationLevel() {
        return this.f87106b;
    }

    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.f87107c;
    }

    public int hashCode() {
        int iHashCode = this.f87105a.hashCode() * 31;
        ReportLevel reportLevel = this.f87106b;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f87107c.hashCode();
    }

    public final boolean isDisabled() {
        return this.f87109e;
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f87105a + ", migrationLevel=" + this.f87106b + ", userDefinedLevelForSpecificAnnotation=" + this.f87107c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i11 & 2) != 0 ? null : reportLevel2, (i11 & 4) != 0 ? v0.i() : map);
    }
}
