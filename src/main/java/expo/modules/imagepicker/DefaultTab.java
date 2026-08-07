package expo.modules.imagepicker;

import androidx.p002activity.result.contract.ActivityResultContracts$PickVisualMedia;
import expo.modules.kotlin.types.Enumerable;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/imagepicker/DefaultTab;", "Lexpo/modules/kotlin/types/Enumerable;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "toDefaultTab", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PHOTOS", "ALBUMS", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DefaultTab implements Enumerable {
    PHOTOS("photos"),
    ALBUMS("albums");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DefaultTab.values().length];
            try {
                iArr[DefaultTab.PHOTOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultTab.ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    DefaultTab(String str) {
        this.value = str;
    }

    public static EnumEntries<DefaultTab> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    public final ActivityResultContracts$PickVisualMedia.b toDefaultTab() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return ActivityResultContracts$PickVisualMedia.b.C0058b.f1952a;
        }
        if (i11 == 2) {
            return ActivityResultContracts$PickVisualMedia.b.a.f1950a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
