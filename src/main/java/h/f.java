package h;

import androidx.p002activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.p002activity.result.contract.ActivityResultContracts$PickVisualMedia;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR*\u0010*\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b\u0006\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lh/f;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "<set-?>", "a", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "k", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;)V", "mediaType", "", "b", "I", "c", "()I", "j", "(I)V", "maxItems", "", "Z", "f", "()Z", "l", "(Z)V", "isOrderedSelection", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;)V", "defaultTab", "e", "h", "isCustomAccentColorApplied", "", "J", "()J", "g", "(J)V", "accentColor", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isOrderedSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isCustomAccentColorApplied;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long accentColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ActivityResultContracts$PickVisualMedia.g mediaType = ActivityResultContracts$PickVisualMedia.c.f1954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxItems = ActivityResultContracts$PickMultipleVisualMedia.INSTANCE.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ActivityResultContracts$PickVisualMedia.b defaultTab = ActivityResultContracts$PickVisualMedia.b.C0058b.f1952a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lh/f$a;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "mediaType", DateTokenConverter.CONVERTER_KEY, "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;)Lh/f$a;", "", "maxItems", "c", "(I)Lh/f$a;", "", "isOrderedSelection", "e", "(Z)Lh/f$a;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "defaultTab", "b", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;)Lh/f$a;", "Lh/f;", "a", "()Lh/f;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "I", "Z", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "isCustomAccentColorApplied", "", "f", "J", "accentColor", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isOrderedSelection;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isCustomAccentColorApplied;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long accentColor;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private ActivityResultContracts$PickVisualMedia.g mediaType = ActivityResultContracts$PickVisualMedia.c.f1954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int maxItems = ActivityResultContracts$PickMultipleVisualMedia.INSTANCE.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private ActivityResultContracts$PickVisualMedia.b defaultTab = ActivityResultContracts$PickVisualMedia.b.C0058b.f1952a;

        public final f a() {
            f fVar = new f();
            fVar.k(this.mediaType);
            fVar.j(this.maxItems);
            fVar.l(this.isOrderedSelection);
            fVar.i(this.defaultTab);
            fVar.h(this.isCustomAccentColorApplied);
            fVar.g(this.accentColor);
            return fVar;
        }

        public final a b(ActivityResultContracts$PickVisualMedia.b defaultTab) {
            s.k(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        public final a c(int maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        public final a d(ActivityResultContracts$PickVisualMedia.g mediaType) {
            s.k(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        public final a e(boolean isOrderedSelection) {
            this.isOrderedSelection = isOrderedSelection;
            return this;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAccentColor() {
        return this.accentColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ActivityResultContracts$PickVisualMedia.b getDefaultTab() {
        return this.defaultTab;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxItems() {
        return this.maxItems;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ActivityResultContracts$PickVisualMedia.g getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void g(long j11) {
        this.accentColor = j11;
    }

    public final void h(boolean z11) {
        this.isCustomAccentColorApplied = z11;
    }

    public final void i(ActivityResultContracts$PickVisualMedia.b bVar) {
        s.k(bVar, "<set-?>");
        this.defaultTab = bVar;
    }

    public final void j(int i11) {
        this.maxItems = i11;
    }

    public final void k(ActivityResultContracts$PickVisualMedia.g gVar) {
        s.k(gVar, "<set-?>");
        this.mediaType = gVar;
    }

    public final void l(boolean z11) {
        this.isOrderedSelection = z11;
    }
}
