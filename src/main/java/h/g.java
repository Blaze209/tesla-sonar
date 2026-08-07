package h;

import androidx.p002activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.p002activity.result.contract.ActivityResultContracts$PickVisualMedia;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "mediaType", "Lh/f;", "a", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;)Lh/f;", "", "maxItems", "", "isOrderedSelection", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "defaultTab", "b", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;IZLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;)Lh/f;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    @jn0.e
    public static final /* synthetic */ f a(ActivityResultContracts$PickVisualMedia.g mediaType) {
        s.k(mediaType, "mediaType");
        return new f.a().d(mediaType).a();
    }

    public static final f b(ActivityResultContracts$PickVisualMedia.g mediaType, int i11, boolean z11, ActivityResultContracts$PickVisualMedia.b defaultTab) {
        s.k(mediaType, "mediaType");
        s.k(defaultTab, "defaultTab");
        return new f.a().d(mediaType).c(i11).e(z11).b(defaultTab).a();
    }

    public static /* synthetic */ f c(ActivityResultContracts$PickVisualMedia.g gVar, int i11, boolean z11, ActivityResultContracts$PickVisualMedia.b bVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            gVar = ActivityResultContracts$PickVisualMedia.c.f1954a;
        }
        if ((i12 & 2) != 0) {
            i11 = ActivityResultContracts$PickMultipleVisualMedia.INSTANCE.a();
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        if ((i12 & 8) != 0) {
            bVar = ActivityResultContracts$PickVisualMedia.b.C0058b.f1952a;
        }
        return b(gVar, i11, z11, bVar);
    }
}
