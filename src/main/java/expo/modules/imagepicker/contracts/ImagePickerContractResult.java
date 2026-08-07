package expo.modules.imagepicker.contracts;

import android.net.Uri;
import expo.modules.imagepicker.MediaType;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "", "<init>", "()V", "Success", "Cancelled", "Error", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Cancelled;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Error;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ImagePickerContractResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Cancelled;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "<init>", "()V", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancelled extends ImagePickerContractResult {
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Error;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "<init>", "()V", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends ImagePickerContractResult {
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "data", "", "Lkotlin/Pair;", "Lexpo/modules/imagepicker/MediaType;", "Landroid/net/Uri;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends ImagePickerContractResult {
        private final List<Pair<MediaType, Uri>> data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(List<? extends Pair<? extends MediaType, ? extends Uri>> data) {
            super(null);
            s.k(data, "data");
            this.data = data;
        }

        public final List<Pair<MediaType, Uri>> getData() {
            return this.data;
        }
    }

    public /* synthetic */ ImagePickerContractResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ImagePickerContractResult() {
    }
}
