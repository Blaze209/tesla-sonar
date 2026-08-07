package expo.modules.filesystem.next;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lexpo/modules/filesystem/next/CreateOptions;", "Lexpo/modules/kotlin/records/Record;", "intermediates", "", "overwrite", "<init>", "(ZZ)V", "getIntermediates$annotations", "()V", "getIntermediates", "()Z", "getOverwrite$annotations", "getOverwrite", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreateOptions implements Record {
    private final boolean intermediates;
    private final boolean overwrite;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateOptions() {
        boolean z11 = false;
        this(z11, z11, 3, null);
    }

    public static /* synthetic */ CreateOptions copy$default(CreateOptions createOptions, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = createOptions.intermediates;
        }
        if ((i11 & 2) != 0) {
            z12 = createOptions.overwrite;
        }
        return createOptions.copy(z11, z12);
    }

    @Field
    public static /* synthetic */ void getIntermediates$annotations() {
    }

    @Field
    public static /* synthetic */ void getOverwrite$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIntermediates() {
        return this.intermediates;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public final CreateOptions copy(boolean intermediates, boolean overwrite) {
        return new CreateOptions(intermediates, overwrite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOptions)) {
            return false;
        }
        CreateOptions createOptions = (CreateOptions) other;
        return this.intermediates == createOptions.intermediates && this.overwrite == createOptions.overwrite;
    }

    public final boolean getIntermediates() {
        return this.intermediates;
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.intermediates) * 31) + Boolean.hashCode(this.overwrite);
    }

    public String toString() {
        return "CreateOptions(intermediates=" + this.intermediates + ", overwrite=" + this.overwrite + ")";
    }

    public CreateOptions(boolean z11, boolean z12) {
        this.intermediates = z11;
        this.overwrite = z12;
    }

    public /* synthetic */ CreateOptions(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
