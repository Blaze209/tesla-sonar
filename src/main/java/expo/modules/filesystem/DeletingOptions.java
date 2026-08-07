package expo.modules.filesystem;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lexpo/modules/filesystem/DeletingOptions;", "Lexpo/modules/kotlin/records/Record;", "idempotent", "", "<init>", "(Z)V", "getIdempotent$annotations", "()V", "getIdempotent", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeletingOptions implements Record {
    private final boolean idempotent;

    public DeletingOptions() {
        this(false, 1, null);
    }

    public static /* synthetic */ DeletingOptions copy$default(DeletingOptions deletingOptions, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = deletingOptions.idempotent;
        }
        return deletingOptions.copy(z11);
    }

    @Field
    public static /* synthetic */ void getIdempotent$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public final DeletingOptions copy(boolean idempotent) {
        return new DeletingOptions(idempotent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeletingOptions) && this.idempotent == ((DeletingOptions) other).idempotent;
    }

    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.idempotent);
    }

    public String toString() {
        return "DeletingOptions(idempotent=" + this.idempotent + ")";
    }

    public DeletingOptions(boolean z11) {
        this.idempotent = z11;
    }

    public /* synthetic */ DeletingOptions(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
