package expo.modules.imagepicker;

import android.content.ClipData;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\t\u0010\r\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"expo/modules/imagepicker/ImagePickerUtilsKt$items$1$iterator$1", "", "Landroid/content/ClipData$Item;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "count", "getCount", "hasNext", "", "next", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImagePickerUtilsKt$items$1$iterator$1 implements Iterator<ClipData.Item>, xn0.a {
    final /* synthetic */ ClipData $this_items;
    private final int count;
    private int index;

    ImagePickerUtilsKt$items$1$iterator$1(ClipData clipData) {
        this.$this_items = clipData;
        this.count = clipData.getItemCount();
    }

    public final int getCount() {
        return this.count;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.count;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public ClipData.Item next() {
        ClipData clipData = this.$this_items;
        int i11 = this.index;
        this.index = i11 + 1;
        ClipData.Item itemAt = clipData.getItemAt(i11);
        s.j(itemAt, "getItemAt(...)");
        return itemAt;
    }
}
