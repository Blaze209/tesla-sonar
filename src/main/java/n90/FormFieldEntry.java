package n90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: n90.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln90/a;", "", "", "value", "", "isComplete", "<init>", "(Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Z)Ln90/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FormFieldEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isComplete;

    public FormFieldEntry(String str, boolean z11) {
        this.value = str;
        this.isComplete = z11;
    }

    public static /* synthetic */ FormFieldEntry b(FormFieldEntry formFieldEntry, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = formFieldEntry.value;
        }
        if ((i11 & 2) != 0) {
            z11 = formFieldEntry.isComplete;
        }
        return formFieldEntry.a(str, z11);
    }

    public final FormFieldEntry a(String value, boolean isComplete) {
        return new FormFieldEntry(value, isComplete);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormFieldEntry)) {
            return false;
        }
        FormFieldEntry formFieldEntry = (FormFieldEntry) other;
        return s.f(this.value, formFieldEntry.value) && this.isComplete == formFieldEntry.isComplete;
    }

    public int hashCode() {
        String str = this.value;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isComplete);
    }

    public String toString() {
        return "FormFieldEntry(value=" + this.value + ", isComplete=" + this.isComplete + ")";
    }
}
