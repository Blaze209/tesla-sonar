package e20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import g20.f;
import java.util.Map;
import jn0.x;
import o20.h;
import o20.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0018\u0010#\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u001f\u0010(\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&0$8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010'¨\u0006*"}, d2 = {"Le20/c;", "Lg20/f;", "<init>", "()V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "c", "b", "Lo20/h;", "event", "e", "(Lo20/h;)V", "Lo20/k;", "f", "(Lo20/k;)V", "", "a", "J", "lastUpdateTimestamp", "foregroundDuration", "backgroundDuration", "", "Ljava/lang/Integer;", "lastItemIndex", "itemsCount", "minYOffset", "g", "minXOffset", "h", "maxYOffset", IntegerTokenConverter.CONVERTER_KEY, "maxXOffset", "j", "contentHeight", "k", "contentWidth", "", "", "", "()Ljava/util/Map;", "data", "l", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static wn0.a<Long> f61570m = a.f61582c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long lastUpdateTimestamp = f61570m.invoke().longValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long foregroundDuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long backgroundDuration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Integer lastItemIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer itemsCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Integer minYOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Integer minXOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Integer maxYOffset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Integer maxXOffset;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Integer contentHeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Integer contentWidth;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Long> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f61582c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public final Map<String, Object> a() {
        Map<String, Object> mapO = v0.o(x.a("foreground_sec", Double.valueOf(this.foregroundDuration / 1000.0d)), x.a("background_sec", Double.valueOf(this.backgroundDuration / 1000.0d)));
        Integer num = this.lastItemIndex;
        if (num != null) {
            mapO.put("last_item_index", Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.itemsCount;
        if (num2 != null) {
            mapO.put("items_count", Integer.valueOf(num2.intValue()));
        }
        Integer num3 = this.minYOffset;
        if (num3 != null) {
            mapO.put("min_y_offset", Integer.valueOf(num3.intValue()));
        }
        Integer num4 = this.minXOffset;
        if (num4 != null) {
            mapO.put("min_x_offset", Integer.valueOf(num4.intValue()));
        }
        Integer num5 = this.maxYOffset;
        if (num5 != null) {
            mapO.put("max_y_offset", Integer.valueOf(num5.intValue()));
        }
        Integer num6 = this.maxXOffset;
        if (num6 != null) {
            mapO.put("max_x_offset", Integer.valueOf(num6.intValue()));
        }
        Integer num7 = this.contentHeight;
        if (num7 != null) {
            mapO.put("content_height", Integer.valueOf(num7.intValue()));
        }
        Integer num8 = this.contentWidth;
        if (num8 != null) {
            mapO.put("content_width", Integer.valueOf(num8.intValue()));
        }
        return mapO;
    }

    public final void b() {
        long jLongValue = f61570m.invoke().longValue();
        this.foregroundDuration += jLongValue - this.lastUpdateTimestamp;
        this.lastUpdateTimestamp = jLongValue;
    }

    public final void c() {
        long jLongValue = f61570m.invoke().longValue();
        this.foregroundDuration += jLongValue - this.lastUpdateTimestamp;
        this.lastUpdateTimestamp = jLongValue;
    }

    public final void d() {
        long jLongValue = f61570m.invoke().longValue();
        this.backgroundDuration += jLongValue - this.lastUpdateTimestamp;
        this.lastUpdateTimestamp = jLongValue;
    }

    public final void e(h event) {
        s.k(event, "event");
        int iG = event.g();
        Integer num = this.lastItemIndex;
        this.lastItemIndex = Integer.valueOf(Integer.max(iG, num != null ? num.intValue() : 0));
        Integer numH = event.h();
        if (numH != null) {
            int iIntValue = numH.intValue();
            Integer num2 = this.itemsCount;
            this.itemsCount = Integer.valueOf(Integer.max(iIntValue, num2 != null ? num2.intValue() : 0));
        }
    }

    public final void f(k event) {
        s.k(event, "event");
        Integer numL = event.l();
        if (numL != null) {
            int iIntValue = numL.intValue();
            Integer numI = event.i();
            int iIntValue2 = numI != null ? numI.intValue() + iIntValue : iIntValue;
            Integer num = this.minYOffset;
            this.minYOffset = Integer.valueOf(Integer.min(iIntValue, num != null ? num.intValue() : iIntValue));
            Integer num2 = this.maxYOffset;
            this.maxYOffset = Integer.valueOf(Integer.max(iIntValue2, num2 != null ? num2.intValue() : iIntValue2));
        }
        Integer numK = event.k();
        if (numK != null) {
            int iIntValue3 = numK.intValue();
            Integer numJ = event.j();
            int iIntValue4 = numJ != null ? numJ.intValue() + iIntValue3 : iIntValue3;
            Integer num3 = this.minXOffset;
            this.minXOffset = Integer.valueOf(Integer.min(iIntValue3, num3 != null ? num3.intValue() : iIntValue3));
            Integer num4 = this.maxXOffset;
            this.maxXOffset = Integer.valueOf(Integer.max(iIntValue4, num4 != null ? num4.intValue() : iIntValue4));
        }
        Integer numH = event.h();
        if (numH != null) {
            int iIntValue5 = numH.intValue();
            Integer num5 = this.contentWidth;
            this.contentWidth = Integer.valueOf(Integer.max(iIntValue5, num5 != null ? num5.intValue() : 0));
        }
        Integer numG = event.g();
        if (numG != null) {
            int iIntValue6 = numG.intValue();
            Integer num6 = this.contentHeight;
            this.contentHeight = Integer.valueOf(Integer.max(iIntValue6, num6 != null ? num6.intValue() : 0));
        }
    }
}
