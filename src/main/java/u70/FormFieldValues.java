package u70;

import java.util.Map;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w70.j;

/* JADX INFO: renamed from: u70.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lu70/c;", "", "", "Li90/g0;", "Ln90/a;", "fieldValuePairs", "Lw70/j$a;", "userRequestedReuse", "<init>", "(Ljava/util/Map;Lw70/j$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Lw70/j$a;", "()Lw70/j$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FormFieldValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<IdentifierSpec, FormFieldEntry> fieldValuePairs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final j.a userRequestedReuse;

    public FormFieldValues(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, j.a userRequestedReuse) {
        s.k(fieldValuePairs, "fieldValuePairs");
        s.k(userRequestedReuse, "userRequestedReuse");
        this.fieldValuePairs = fieldValuePairs;
        this.userRequestedReuse = userRequestedReuse;
    }

    public final Map<IdentifierSpec, FormFieldEntry> a() {
        return this.fieldValuePairs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j.a getUserRequestedReuse() {
        return this.userRequestedReuse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormFieldValues)) {
            return false;
        }
        FormFieldValues formFieldValues = (FormFieldValues) other;
        return s.f(this.fieldValuePairs, formFieldValues.fieldValuePairs) && this.userRequestedReuse == formFieldValues.userRequestedReuse;
    }

    public int hashCode() {
        return (this.fieldValuePairs.hashCode() * 31) + this.userRequestedReuse.hashCode();
    }

    public String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.fieldValuePairs + ", userRequestedReuse=" + this.userRequestedReuse + ")";
    }

    public /* synthetic */ FormFieldValues(Map map, j.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? v0.i() : map, aVar);
    }
}
