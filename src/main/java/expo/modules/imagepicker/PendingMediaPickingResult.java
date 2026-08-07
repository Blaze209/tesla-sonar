package expo.modules.imagepicker;

import android.net.Uri;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lexpo/modules/imagepicker/PendingMediaPickingResult;", "", "data", "", "Lkotlin/Pair;", "Lexpo/modules/imagepicker/MediaType;", "Landroid/net/Uri;", "options", "Lexpo/modules/imagepicker/ImagePickerOptions;", "<init>", "(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;)V", "getData", "()Ljava/util/List;", "getOptions", "()Lexpo/modules/imagepicker/ImagePickerOptions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PendingMediaPickingResult {
    private final List<Pair<MediaType, Uri>> data;
    private final ImagePickerOptions options;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingMediaPickingResult(List<? extends Pair<? extends MediaType, ? extends Uri>> data, ImagePickerOptions options) {
        s.k(data, "data");
        s.k(options, "options");
        this.data = data;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingMediaPickingResult copy$default(PendingMediaPickingResult pendingMediaPickingResult, List list, ImagePickerOptions imagePickerOptions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pendingMediaPickingResult.data;
        }
        if ((i11 & 2) != 0) {
            imagePickerOptions = pendingMediaPickingResult.options;
        }
        return pendingMediaPickingResult.copy(list, imagePickerOptions);
    }

    public final List<Pair<MediaType, Uri>> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImagePickerOptions getOptions() {
        return this.options;
    }

    public final PendingMediaPickingResult copy(List<? extends Pair<? extends MediaType, ? extends Uri>> data, ImagePickerOptions options) {
        s.k(data, "data");
        s.k(options, "options");
        return new PendingMediaPickingResult(data, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingMediaPickingResult)) {
            return false;
        }
        PendingMediaPickingResult pendingMediaPickingResult = (PendingMediaPickingResult) other;
        return s.f(this.data, pendingMediaPickingResult.data) && s.f(this.options, pendingMediaPickingResult.options);
    }

    public final List<Pair<MediaType, Uri>> getData() {
        return this.data;
    }

    public final ImagePickerOptions getOptions() {
        return this.options;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.options.hashCode();
    }

    public String toString() {
        return "PendingMediaPickingResult(data=" + this.data + ", options=" + this.options + ")";
    }
}
